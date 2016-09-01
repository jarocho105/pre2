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

import com.bydan.erp.cartera.util.TipoProduBancoConstantesFunciones;
import com.bydan.erp.cartera.util.TipoProduBancoParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoProduBancoParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoProduBancoBean;
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
public class TipoProduBancoBeanSwingJInternalFrame extends TipoProduBancoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoProduBancoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoProduBanco> tipoprodubancoValidator = new ClassValidator<TipoProduBanco>(TipoProduBanco.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoProduBanco tipoprodubanco;	
	public TipoProduBanco tipoprodubancoAux;
	public TipoProduBanco tipoprodubancoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoProduBanco tipoprodubancoTotales;
	public Long idTipoProduBancoActual;
	public Long iIdNuevoTipoProduBanco=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosReferenciaBancaria=false;

	public Boolean getIsTienePermisosReferenciaBancaria() {
		return isTienePermisosReferenciaBancaria;
	}

	public void setIsTienePermisosReferenciaBancaria(Boolean isTienePermisosReferenciaBancaria) {
		this.isTienePermisosReferenciaBancaria= isTienePermisosReferenciaBancaria;
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
	
	public Boolean isPermisoTodoTipoProduBanco;
	public Boolean isPermisoNuevoTipoProduBanco;
	public Boolean isPermisoActualizarTipoProduBanco;
	public Boolean isPermisoActualizarOriginalTipoProduBanco;
	public Boolean isPermisoEliminarTipoProduBanco;
	public Boolean isPermisoGuardarCambiosTipoProduBanco;
	public Boolean isPermisoConsultaTipoProduBanco;
	public Boolean isPermisoBusquedaTipoProduBanco;
	public Boolean isPermisoReporteTipoProduBanco;
	public Boolean isPermisoPaginacionMedioTipoProduBanco;
	public Boolean isPermisoPaginacionAltoTipoProduBanco;
	public Boolean isPermisoPaginacionTodoTipoProduBanco;
	public Boolean isPermisoCopiarTipoProduBanco;
	public Boolean isPermisoVerFormTipoProduBanco;
	public Boolean isPermisoDuplicarTipoProduBanco;
	public Boolean isPermisoOrdenTipoProduBanco;
	
	
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
	
	public TipoProduBancoParameterReturnGeneral tipoprodubancoReturnGeneral;
	public TipoProduBancoParameterReturnGeneral tipoprodubancoParameterGeneral;
	
	

	public ReferenciaBancariaLogic referenciabancariaLogic=null;

	public ReferenciaBancariaLogic getReferenciaBancariaLogic() {
		return referenciabancariaLogic;
	}

	public void setReferenciaBancariaLogic(ReferenciaBancariaLogic referenciabancariaLogic) {
		this.referenciabancariaLogic = referenciabancariaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoProduBanco=false;
	public Boolean esParaAccionDesdeFormularioTipoProduBanco=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoProduBancoSessionBeanAdditional tipoprodubancoSessionBeanAdditional=null;
	
	public TipoProduBancoSessionBeanAdditional getTipoProduBancoSessionBeanAdditional() {
		return this.tipoprodubancoSessionBeanAdditional;
	}
	
	public void setTipoProduBancoSessionBeanAdditional(TipoProduBancoSessionBeanAdditional tipoprodubancoSessionBeanAdditional) {
		try {
			this.tipoprodubancoSessionBeanAdditional=tipoprodubancoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoProduBancoBeanSwingJInternalFrameAdditional tipoprodubancoBeanSwingJInternalFrameAdditional=null;
	//public class TipoProduBancoBeanSwingJInternalFrame
	
	public TipoProduBancoBeanSwingJInternalFrameAdditional getTipoProduBancoBeanSwingJInternalFrameAdditional() {
		return this.tipoprodubancoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoProduBancoBeanSwingJInternalFrameAdditional(TipoProduBancoBeanSwingJInternalFrameAdditional tipoprodubancoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoprodubancoBeanSwingJInternalFrameAdditional=tipoprodubancoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoProduBancoLogic tipoprodubancoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoProduBanco tipoprodubancoBean;
	public TipoProduBancoConstantesFunciones tipoprodubancoConstantesFunciones;
	//public TipoProduBancoParameterReturnGeneral tipoprodubancoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoProduBanco> tipoprodubancos;	
	//public List<TipoProduBanco> tipoprodubancosEliminados;
	//public List<TipoProduBanco> tipoprodubancosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoProduBanco=false;
	public Boolean isVisibilidadCeldaDuplicarTipoProduBanco=true;
	public Boolean isVisibilidadCeldaCopiarTipoProduBanco=true;
	public Boolean isVisibilidadCeldaVerFormTipoProduBanco=true;
	public Boolean isVisibilidadCeldaOrdenTipoProduBanco=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoProduBanco=false;
	public Boolean isVisibilidadCeldaModificarTipoProduBanco=false;
	public Boolean isVisibilidadCeldaActualizarTipoProduBanco=false;
	public Boolean isVisibilidadCeldaEliminarTipoProduBanco=false;
	public Boolean isVisibilidadCeldaCancelarTipoProduBanco=false;
	public Boolean isVisibilidadCeldaGuardarTipoProduBanco=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoProduBanco=false;	
	
	
	
	public Long getiIdNuevoTipoProduBanco() {
		return this.iIdNuevoTipoProduBanco;
	}

	public void setiIdNuevoTipoProduBanco(Long iIdNuevoTipoProduBanco) {
		this.iIdNuevoTipoProduBanco = iIdNuevoTipoProduBanco;
	}
	
	public Long getidTipoProduBancoActual() {
		return this.idTipoProduBancoActual;
	}

	public void setidTipoProduBancoActual(Long idTipoProduBancoActual) {
		this.idTipoProduBancoActual = idTipoProduBancoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoProduBanco gettipoprodubanco() {
		return this.tipoprodubanco;
	}

	public void settipoprodubanco(TipoProduBanco tipoprodubanco) {
		this.tipoprodubanco = tipoprodubanco;
	}
	
	public TipoProduBanco gettipoprodubancoAux() {
		return this.tipoprodubancoAux;
	}

	public void settipoprodubancoAux(TipoProduBanco tipoprodubancoAux) {
		this.tipoprodubancoAux = tipoprodubancoAux;
	}				
	
	public TipoProduBanco gettipoprodubancoAnterior() {
		return this.tipoprodubancoAnterior;
	}

	public void settipoprodubancoAnterior(TipoProduBanco tipoprodubancoAnterior) {
		this.tipoprodubancoAnterior = tipoprodubancoAnterior;
	}	
	
	public TipoProduBanco gettipoprodubancoTotales() {
		return this.tipoprodubancoTotales;
	}

	public void settipoprodubancoTotales(TipoProduBanco tipoprodubancoTotales) {
		this.tipoprodubancoTotales = tipoprodubancoTotales;
	}	
	
	public TipoProduBanco gettipoprodubancoBean() {
		return this.tipoprodubancoBean;
	}

	public void settipoprodubancoBean(TipoProduBanco tipoprodubancoBean) {
		this.tipoprodubancoBean = tipoprodubancoBean;
	}	
	
	public TipoProduBancoParameterReturnGeneral gettipoprodubancoReturnGeneral() {
		return this.tipoprodubancoReturnGeneral;
	}

	public void settipoprodubancoReturnGeneral(TipoProduBancoParameterReturnGeneral tipoprodubancoReturnGeneral) {
		this.tipoprodubancoReturnGeneral = tipoprodubancoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoProduBancoLogic getTipoProduBancoLogic()	{		
		return tipoprodubancoLogic;
	}

	public void setTipoProduBancoLogic(TipoProduBancoLogic tipoprodubancoLogic) {
		this.tipoprodubancoLogic = tipoprodubancoLogic;
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
	
	public Boolean getIsEsNuevoTipoProduBanco() {
		return isEsNuevoTipoProduBanco;
	}

	public void setIsEsNuevoTipoProduBanco(Boolean isEsNuevoTipoProduBanco) {
		this.isEsNuevoTipoProduBanco = isEsNuevoTipoProduBanco;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoProduBanco() {
		return esParaAccionDesdeFormularioTipoProduBanco;
	}
	
	public void setEsParaAccionDesdeFormularioTipoProduBanco(Boolean esParaAccionDesdeFormularioTipoProduBanco) {
		this.esParaAccionDesdeFormularioTipoProduBanco = esParaAccionDesdeFormularioTipoProduBanco;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoProduBanco() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoProduBancoConstantesFunciones.refrescarForeignKeysDescripcionesTipoProduBanco(this.tipoprodubancoLogic.getTipoProduBancos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoProduBancoConstantesFunciones.refrescarForeignKeysDescripcionesTipoProduBanco(this.tipoprodubancos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoprodubancoLogic.setTipoProduBancos(this.tipoprodubancos);
			tipoprodubancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoProduBancoParameterReturnGeneral getTipoProduBancoParameterGeneral() {
		return this.tipoprodubancoParameterGeneral;
	}
	
	public void setTipoProduBancoParameterGeneral(TipoProduBancoParameterReturnGeneral tipoprodubancoParameterGeneral) {
		this.tipoprodubancoParameterGeneral = tipoprodubancoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoProduBanco() {
		return isPermisoTodoTipoProduBanco;
	}

	public void setIsPermisoTodoTipoProduBanco(Boolean isPermisoTodoTipoProduBanco) {
		this.isPermisoTodoTipoProduBanco = isPermisoTodoTipoProduBanco;
	}

	public Boolean getIsPermisoNuevoTipoProduBanco() {
		return isPermisoNuevoTipoProduBanco;
	}

	public void setIsPermisoNuevoTipoProduBanco(Boolean isPermisoNuevoTipoProduBanco) {
		this.isPermisoNuevoTipoProduBanco = isPermisoNuevoTipoProduBanco;
	}

	public Boolean getIsPermisoActualizarTipoProduBanco() {
		return isPermisoActualizarTipoProduBanco;
	}

	public void setIsPermisoActualizarTipoProduBanco(Boolean isPermisoActualizarTipoProduBanco) {
		this.isPermisoActualizarTipoProduBanco = isPermisoActualizarTipoProduBanco;
	}

	public Boolean getIsPermisoEliminarTipoProduBanco() {
		return isPermisoEliminarTipoProduBanco;
	}

	public void setIsPermisoEliminarTipoProduBanco(Boolean isPermisoEliminarTipoProduBanco) {
		this.isPermisoEliminarTipoProduBanco = isPermisoEliminarTipoProduBanco;
	}

	public Boolean getIsPermisoGuardarCambiosTipoProduBanco() {
		return isPermisoGuardarCambiosTipoProduBanco;
	}

	public void setIsPermisoGuardarCambiosTipoProduBanco(Boolean isPermisoGuardarCambiosTipoProduBanco) {
		this.isPermisoGuardarCambiosTipoProduBanco = isPermisoGuardarCambiosTipoProduBanco;
	}
	
	public Boolean getIsPermisoConsultaTipoProduBanco() {
		return isPermisoConsultaTipoProduBanco;
	}

	public void setIsPermisoConsultaTipoProduBanco(Boolean isPermisoConsultaTipoProduBanco) {
		this.isPermisoConsultaTipoProduBanco = isPermisoConsultaTipoProduBanco;
	}

	public Boolean getIsPermisoBusquedaTipoProduBanco() {
		return isPermisoBusquedaTipoProduBanco;
	}

	public void setIsPermisoBusquedaTipoProduBanco(Boolean isPermisoBusquedaTipoProduBanco) {
		this.isPermisoBusquedaTipoProduBanco = isPermisoBusquedaTipoProduBanco;
	}

	public Boolean getIsPermisoReporteTipoProduBanco() {
		return isPermisoReporteTipoProduBanco;
	}

	public void setIsPermisoReporteTipoProduBanco(Boolean isPermisoReporteTipoProduBanco) {
		this.isPermisoReporteTipoProduBanco = isPermisoReporteTipoProduBanco;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoProduBanco() {
		return isPermisoPaginacionMedioTipoProduBanco;
	}

	public void setIsPermisoPaginacionMedioTipoProduBanco(Boolean isPermisoPaginacionMedioTipoProduBanco) {
		this.isPermisoPaginacionMedioTipoProduBanco = isPermisoPaginacionMedioTipoProduBanco;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoProduBanco() {
		return isPermisoPaginacionTodoTipoProduBanco;
	}

	public void setIsPermisoPaginacionTodoTipoProduBanco(Boolean isPermisoPaginacionTodoTipoProduBanco) {
		this.isPermisoPaginacionTodoTipoProduBanco = isPermisoPaginacionTodoTipoProduBanco;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoProduBanco() {
		return isPermisoPaginacionAltoTipoProduBanco;
	}

	public void setIsPermisoPaginacionAltoTipoProduBanco(Boolean isPermisoPaginacionAltoTipoProduBanco) {
		this.isPermisoPaginacionAltoTipoProduBanco = isPermisoPaginacionAltoTipoProduBanco;
	}
	
	public Boolean getIsPermisoCopiarTipoProduBanco() {
		return isPermisoCopiarTipoProduBanco;
	}

	public void setIsPermisoCopiarTipoProduBanco(Boolean isPermisoCopiarTipoProduBanco) {
		this.isPermisoCopiarTipoProduBanco = isPermisoCopiarTipoProduBanco;
	}
	
	public Boolean getIsPermisoVerFormTipoProduBanco() {
		return isPermisoVerFormTipoProduBanco;
	}

	public void setIsPermisoVerFormTipoProduBanco(Boolean isPermisoVerFormTipoProduBanco) {
		this.isPermisoVerFormTipoProduBanco = isPermisoVerFormTipoProduBanco;
	}
	
	public Boolean getIsPermisoDuplicarTipoProduBanco() {
		return isPermisoDuplicarTipoProduBanco;
	}

	public void setIsPermisoDuplicarTipoProduBanco(Boolean isPermisoDuplicarTipoProduBanco) {
		this.isPermisoDuplicarTipoProduBanco = isPermisoDuplicarTipoProduBanco;
	}
	
	public Boolean getIsPermisoOrdenTipoProduBanco() {
		return isPermisoOrdenTipoProduBanco;
	}

	public void setIsPermisoOrdenTipoProduBanco(Boolean isPermisoOrdenTipoProduBanco) {
		this.isPermisoOrdenTipoProduBanco = isPermisoOrdenTipoProduBanco;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoProduBanco() {
		return isVisibilidadCeldaNuevoTipoProduBanco;
	}

	public void setIsVisibilidadCeldaNuevoTipoProduBanco(Boolean isVisibilidadCeldaNuevoTipoProduBanco) {
		this.isVisibilidadCeldaNuevoTipoProduBanco = isVisibilidadCeldaNuevoTipoProduBanco;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoProduBanco() {
		return isVisibilidadCeldaDuplicarTipoProduBanco;
	}

	public void setIsVisibilidadCeldaDuplicarTipoProduBanco(Boolean isVisibilidadCeldaDuplicarTipoProduBanco) {
		this.isVisibilidadCeldaDuplicarTipoProduBanco = isVisibilidadCeldaDuplicarTipoProduBanco;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoProduBanco() {
		return isVisibilidadCeldaCopiarTipoProduBanco;
	}

	public void setIsVisibilidadCeldaCopiarTipoProduBanco(Boolean isVisibilidadCeldaCopiarTipoProduBanco) {
		this.isVisibilidadCeldaCopiarTipoProduBanco = isVisibilidadCeldaCopiarTipoProduBanco;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoProduBanco() {
		return isVisibilidadCeldaVerFormTipoProduBanco;
	}

	public void setIsVisibilidadCeldaVerFormTipoProduBanco(Boolean isVisibilidadCeldaVerFormTipoProduBanco) {
		this.isVisibilidadCeldaVerFormTipoProduBanco = isVisibilidadCeldaVerFormTipoProduBanco;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoProduBanco() {
		return isVisibilidadCeldaOrdenTipoProduBanco;
	}

	public void setIsVisibilidadCeldaOrdenTipoProduBanco(Boolean isVisibilidadCeldaOrdenTipoProduBanco) {
		this.isVisibilidadCeldaOrdenTipoProduBanco = isVisibilidadCeldaOrdenTipoProduBanco;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoProduBanco() {
		return isVisibilidadCeldaNuevoRelacionesTipoProduBanco;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoProduBanco(Boolean isVisibilidadCeldaNuevoRelacionesTipoProduBanco) {
		this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco = isVisibilidadCeldaNuevoRelacionesTipoProduBanco;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoProduBanco() {
		return isVisibilidadCeldaModificarTipoProduBanco;
	}

	public void setIsVisibilidadCeldaModificarTipoProduBanco(Boolean isVisibilidadCeldaModificarTipoProduBanco) {
		this.isVisibilidadCeldaModificarTipoProduBanco = isVisibilidadCeldaModificarTipoProduBanco;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoProduBanco() {
		return isVisibilidadCeldaActualizarTipoProduBanco;
	}

	public void setIsVisibilidadCeldaActualizarTipoProduBanco(Boolean isVisibilidadCeldaActualizarTipoProduBanco) {
		this.isVisibilidadCeldaActualizarTipoProduBanco = isVisibilidadCeldaActualizarTipoProduBanco;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoProduBanco() {
		return isVisibilidadCeldaEliminarTipoProduBanco;
	}

	public void setIsVisibilidadCeldaEliminarTipoProduBanco(Boolean isVisibilidadCeldaEliminarTipoProduBanco) {
		this.isVisibilidadCeldaEliminarTipoProduBanco = isVisibilidadCeldaEliminarTipoProduBanco;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoProduBanco() {
		return isVisibilidadCeldaCancelarTipoProduBanco;
	}

	public void setIsVisibilidadCeldaCancelarTipoProduBanco(Boolean isVisibilidadCeldaCancelarTipoProduBanco) {
		this.isVisibilidadCeldaCancelarTipoProduBanco = isVisibilidadCeldaCancelarTipoProduBanco;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoProduBanco() {
		return isVisibilidadCeldaGuardarTipoProduBanco;
	}

	public void setIsVisibilidadCeldaGuardarTipoProduBanco(Boolean isVisibilidadCeldaGuardarTipoProduBanco) {
		this.isVisibilidadCeldaGuardarTipoProduBanco = isVisibilidadCeldaGuardarTipoProduBanco;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoProduBanco() {
		return isVisibilidadCeldaGuardarCambiosTipoProduBanco;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoProduBanco(Boolean isVisibilidadCeldaGuardarCambiosTipoProduBanco) {
		this.isVisibilidadCeldaGuardarCambiosTipoProduBanco = isVisibilidadCeldaGuardarCambiosTipoProduBanco;
	}
		
	public TipoProduBancoSessionBean gettipoprodubancoSessionBean() {
		return this.tipoprodubancoSessionBean;
	}
	
	public void settipoprodubancoSessionBean(TipoProduBancoSessionBean tipoprodubancoSessionBean) {
		this.tipoprodubancoSessionBean=tipoprodubancoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(TipoProduBanco tipoprodubanco)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoProduBanco tipoprodubanco,TipoProduBanco tipoprodubancoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoProduBanco(tipoprodubanco);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoprodubancoAux.setId(tipoprodubanco.getId());
		tipoprodubancoAux.setVersionRow(tipoprodubanco.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoProduBanco();
		
			int intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoProduBanco(this.tipoprodubanco,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoprodubancoValidator.getInvalidValues(this.tipoprodubanco);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoprodubancoLogic.setDatosCliente(datosCliente);
			tipoprodubancoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoprodubancoAux=new  TipoProduBanco();
				
				tipoprodubancoAux.setIsNew(true);
				tipoprodubancoAux.setIsChanged(true);
				
				tipoprodubancoAux.setTipoProduBancoOriginal(this.tipoprodubanco);
				
				tipoprodubancoAux.setId(this.tipoprodubanco.getId());	
				tipoprodubancoAux.setVersionRow(this.tipoprodubanco.getVersionRow());	
				tipoprodubancoAux.setcodigo(this.tipoprodubanco.getcodigo());	
				tipoprodubancoAux.setnombre(this.tipoprodubanco.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprodubancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoprodubancoAux,tipoprodubancoLogic.getTipoProduBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprodubancoAux,tipoprodubancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprodubancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprodubancoLogic.saveTipoProduBancos();//WithConnection
						//tipoprodubancoLogic.getSetVersionRowTipoProduBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprodubanco,tipoprodubancoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias().addAll(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias.addAll(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprodubancoLogic.saveTipoProduBancoRelaciones(tipoprodubancoAux,this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());//WithConnection
								//tipoprodubancoLogic.getSetVersionRowTipoProduBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoprodubanco,tipoprodubancoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias= new ArrayList<ReferenciaBancaria>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprodubancoAux.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoprodubancoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoprodubancoAux,tipoprodubancoLogic.getTipoProduBancos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoprodubancoAux,tipoprodubancos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoprodubanco,tipoprodubancoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoprodubancoAux=new  TipoProduBanco();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoprodubancoSessionBean.getEsGuardarRelacionado() && this.tipoprodubanco.getId()>=0)) {
						
					tipoprodubancoAux.setIsNew(false);
				}
				
				tipoprodubancoAux.setIsDeleted(false);
			
				tipoprodubancoAux.setId(this.tipoprodubanco.getId());	
				tipoprodubancoAux.setVersionRow(this.tipoprodubanco.getVersionRow());	
				tipoprodubancoAux.setcodigo(this.tipoprodubanco.getcodigo());	
				tipoprodubancoAux.setnombre(this.tipoprodubanco.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprodubancoAux,tipoprodubancoLogic.getTipoProduBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprodubancoAux,tipoprodubancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprodubancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprodubancoLogic.saveTipoProduBancos();//WithConnection
						//tipoprodubancoLogic.getSetVersionRowTipoProduBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprodubanco,tipoprodubancoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias().addAll(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias.addAll(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprodubancoLogic.saveTipoProduBancoRelaciones(tipoprodubancoAux,this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());//WithConnection
								//tipoprodubancoLogic.getSetVersionRowTipoProduBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoprodubanco,tipoprodubancoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias= new ArrayList<ReferenciaBancaria>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprodubancoAux.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoprodubancoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoprodubancoAux,tipoprodubancoLogic.getTipoProduBancos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoprodubancoAux,tipoprodubancos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoprodubanco,tipoprodubancoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoprodubancoAux=new  TipoProduBanco();
				
				tipoprodubancoAux.setIsNew(false);
				tipoprodubancoAux.setIsChanged(false);
				
				tipoprodubancoAux.setIsDeleted(true);
				
				tipoprodubancoAux.setId(this.tipoprodubanco.getId());	
				tipoprodubancoAux.setVersionRow(this.tipoprodubanco.getVersionRow());	
				tipoprodubancoAux.setcodigo(this.tipoprodubanco.getcodigo());	
				tipoprodubancoAux.setnombre(this.tipoprodubanco.getnombre());	
				
				if(this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoprodubancoAux.getId()>=0) {	
						this.tipoprodubancosEliminados.add(tipoprodubancoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoprodubancoAux,tipoprodubancoLogic.getTipoProduBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprodubancoAux,tipoprodubancos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprodubancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprodubancoLogic.saveTipoProduBancos();//WithConnection
						//tipoprodubancoLogic.getSetVersionRowTipoProduBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias().addAll(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias.addAll(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoprodubancoLogic.saveTipoProduBancoRelaciones(tipoprodubancoAux,this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());//WithConnection
								//tipoprodubancoLogic.getSetVersionRowTipoProduBancos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.setReferenciaBancarias(new ArrayList<ReferenciaBancaria>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias= new ArrayList<ReferenciaBancaria>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoprodubancoAux.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoprodubancoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoprodubancoAux,tipoprodubancoLogic.getTipoProduBancos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoprodubancoAux,tipoprodubancos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.getTipoProduBancos().addAll(this.tipoprodubancosEliminados);
					
					tipoprodubancoLogic.saveTipoProduBancos();//WithConnection
					//tipoprodubancoLogic.getSetVersionRowTipoProduBancos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoprodubancosEliminados= new ArrayList<TipoProduBanco>();		
			}
			
			if(this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Produ Banco GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Produ Banco",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoprodubanco=tipoprodubancoAux;
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
      		//this.finishProcessTipoProduBanco();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoProduBanco tipoprodubancoLocal) throws Exception {
		
		if(this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoprodubancoLocal.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());
			
			} else {
			
				tipoprodubancoLocal.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancarias);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoProduBanco tipoprodubancoLocal) throws Exception {	
		if(this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoProduBancoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoprodubancoValidator.getInvalidValues(this.tipoprodubanco);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoProduBanco tipoprodubanco,List<TipoProduBanco> tipoprodubancos) throws Exception {
		try	{		
			TipoProduBancoConstantesFunciones.actualizarLista(tipoprodubanco,tipoprodubancos,this.tipoprodubancoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoProduBanco tipoprodubanco,List<TipoProduBanco> tipoprodubancos) throws Exception {
		try	{			
			TipoProduBancoConstantesFunciones.actualizarSelectedLista(tipoprodubanco,tipoprodubancos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoProduBanco> tipoprodubancosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoprodubancosLocal=this.tipoprodubancoLogic.getTipoProduBancos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoprodubancosLocal=this.tipoprodubancos;
			}
			//ARCHITECTURE
		
			for(TipoProduBanco tipoprodubancoLocal:tipoprodubancosLocal) {
				if(this.permiteMantenimiento(tipoprodubancoLocal) && tipoprodubancoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoProduBancoConstantesFunciones.getTipoProduBancoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoProduBancoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProduBanco.jLabelcodigoTipoProduBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoProduBancoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProduBanco.jLabelnombreTipoProduBanco,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProduBanco.jLabelcodigoTipoProduBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoProduBanco.jLabelnombreTipoProduBanco,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ReferenciaBancaria")) {
			if(this.tipoprodubanco==null) {
				this.tipoprodubanco= new TipoProduBanco();
			}

			if(this.tipoprodubancoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoProduBanco
				this.setVariablesFormularioToObjetoActualTipoProduBanco(this.tipoprodubanco,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);

				this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.getreferenciabancaria().setTipoProduBanco(this.tipoprodubanco);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoProduBanco--;	
		
		
		this.tipoprodubancoAux=new TipoProduBanco();
		
		this.tipoprodubancoAux.setId(this.iIdNuevoTipoProduBanco);
		this.tipoprodubancoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprodubancoLogic.getTipoProduBancos().add(this.tipoprodubancoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoprodubancos.add(this.tipoprodubancoAux);
		}
		//ARCHITECTURE
		
		this.tipoprodubanco=this.tipoprodubancoAux;
		
		if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoProduBanco(this.tipoprodubanco);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProduBanco(this.tipoprodubanco);
		}
				
		//this.setDefaultControlesTipoProduBanco();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoProduBanco();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoProduBanco();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProduBanco();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProduBanco(this.tipoprodubancoBean,this.tipoprodubanco,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoProduBancoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {
			classes=TipoProduBancoConstantesFunciones.getClassesRelationshipsOfTipoProduBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoprodubancoReturnGeneral=tipoprodubancoLogic.procesarEventosTipoProduBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprodubancoLogic.getTipoProduBancos(),this.tipoprodubanco,this.tipoprodubancoParameterGeneral,this.isEsNuevoTipoProduBanco,classes);//this.tipoprodubancoLogic.getTipoProduBanco()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoProduBanco(this.tipoprodubancoReturnGeneral,this.tipoprodubancoBean,false);
		
		if(this.tipoprodubancoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoProduBanco(this.tipoprodubancoReturnGeneral.getTipoProduBanco());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoProduBanco(this.tipoprodubancoReturnGeneral.getTipoProduBanco());
		}
		
		if(this.tipoprodubancoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoProduBanco(this.tipoprodubancoReturnGeneral.getTipoProduBanco(),classes);//this.tipoprodubancoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoProduBanco(this.tipoprodubanco,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoProduBanco();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoProduBanco();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProduBancoBeanSwingJInternalFrameAdditional.RecargarFormTipoProduBanco(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoProduBanco(false);
						
			if(tipoprodubancoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.getEsGuardarRelacionado() && ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaBancariaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProduBanco();
			}
			
			this.actualizarVisualTableDatosTipoProduBanco();
			
			this.jTableDatosTipoProduBanco.setRowSelectionInterval(this.getIndiceNuevoTipoProduBanco(), this.getIndiceNuevoTipoProduBanco());
			
			this.seleccionarFilaTablaTipoProduBancoActual();
						
			this.actualizarEstadoCeldasBotonesTipoProduBanco("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoProduBanco(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldcodigoTipoProduBanco.setEnabled(isHabilitar && this.tipoprodubancoConstantesFunciones.activarcodigoTipoProduBanco);
		this.jInternalFrameDetalleFormTipoProduBanco.jTextAreanombreTipoProduBanco.setEnabled(isHabilitar && this.tipoprodubancoConstantesFunciones.activarnombreTipoProduBanco);	
		
	};
	
	public void setDefaultControlesTipoProduBanco() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoProduBanco(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoprodubancoSessionBean.setConGuardarRelaciones(true);			
			this.tipoprodubancoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoProduBanco.jTabbedPaneRelacionesTipoProduBanco.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoprodubancoSessionBean.setConGuardarRelaciones(false);			
			this.tipoprodubancoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoProduBanco.jTabbedPaneRelacionesTipoProduBanco.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoProduBanco() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancoLogic.getTipoProduBancos()) {
				if(tipoprodubancoAux.getId().equals(this.iIdNuevoTipoProduBanco)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancos) {
				if(tipoprodubancoAux.getId().equals(this.iIdNuevoTipoProduBanco)) {
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
	
	public int getIndiceActualTipoProduBanco(TipoProduBanco tipoprodubanco,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancoLogic.getTipoProduBancos()) {
				if(tipoprodubancoAux.getId().equals(tipoprodubanco.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancos) {
				if(tipoprodubancoAux.getId().equals(tipoprodubanco.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoProduBanco(TipoProduBanco tipoprodubancoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancoLogic.getTipoProduBancos()) {
				if(tipoprodubancoAux.getTipoProduBancoOriginal().getId().equals(tipoprodubancoOriginal.getId())) {
					existe=true;
					tipoprodubancoOriginal.setId(tipoprodubancoAux.getId());
					tipoprodubancoOriginal.setVersionRow(tipoprodubancoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancos) {
				if(tipoprodubancoAux.getTipoProduBancoOriginal().getId().equals(tipoprodubancoOriginal.getId())) {
					existe=true;
					tipoprodubancoOriginal.setId(tipoprodubancoAux.getId());
					tipoprodubancoOriginal.setVersionRow(tipoprodubancoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoProduBanco(Boolean esParaCancelar) throws Exception {
		tipoprodubancosAux=new ArrayList<TipoProduBanco>();
		tipoprodubancoAux=new TipoProduBanco();
		
		if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancoLogic.getTipoProduBancos()) {
					if(tipoprodubancoAux.getId()<0) {
						tipoprodubancosAux.add(tipoprodubancoAux);
					}		
				}
				this.iIdNuevoTipoProduBanco=0L;
				this.tipoprodubancoLogic.getTipoProduBancos().removeAll(tipoprodubancosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancos) {
					if(tipoprodubancoAux.getId()<0) {
						tipoprodubancosAux.add(tipoprodubancoAux);
					}		
				}
				this.iIdNuevoTipoProduBanco=0L;
				this.tipoprodubancos.removeAll(tipoprodubancosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoProduBanco 
					&& this.tipoprodubancoLogic.getTipoProduBancos().size()>0
					) {
					tipoprodubancoAux=this.tipoprodubancoLogic.getTipoProduBancos().get(this.tipoprodubancoLogic.getTipoProduBancos().size() - 1);
				
					if(tipoprodubancoAux.getId()<0) {
						this.tipoprodubancoLogic.getTipoProduBancos().remove(tipoprodubancoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoProduBanco && this.tipoprodubancos.size()>0) {
					tipoprodubancoAux=this.tipoprodubancos.get(this.tipoprodubancos.size() - 1);
				
					if(tipoprodubancoAux.getId()<0) {
						this.tipoprodubancos.remove(tipoprodubancoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoProduBanco(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoprodubanco.getId()<0) {
				this.tipoprodubancoLogic.getTipoProduBancos().remove(this.tipoprodubanco);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoprodubanco.getId()<0) {
				this.tipoprodubancos.remove(this.tipoprodubanco);
			}
		}			
	}
	
	public void setEstadosInicialesTipoProduBanco(List<TipoProduBanco> tipoprodubancosAux) throws Exception {
		TipoProduBancoConstantesFunciones.setEstadosInicialesTipoProduBanco(tipoprodubancosAux);
	}
	
	public void setEstadosInicialesTipoProduBanco(TipoProduBanco tipoprodubancoAux) throws Exception {
		TipoProduBancoConstantesFunciones.setEstadosInicialesTipoProduBanco(tipoprodubancoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoProduBancoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoProduBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoProduBancoActual()) {
				if(!this.isEsNuevoTipoProduBanco) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoProduBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoProduBanco=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoProduBancoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Produ Banco ?", "MANTENIMIENTO DE Tipo Produ Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoProduBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoProduBanco tipoprodubanco) throws Exception {
		TipoProduBancoConstantesFunciones.seleccionarAsignar(this.tipoprodubanco,tipoprodubanco);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoProduBanco=this.isPermisoActualizarOriginalTipoProduBanco;
			
			
			this.seleccionarAsignar(tipoprodubanco);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoProduBancoConstantesFunciones.quitarEspaciosTipoProduBanco(this.tipoprodubanco,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoProduBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoprodubancoSessionBean.setsFuncionBusquedaRapida(this.tipoprodubancoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoProduBanco) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoProduBanco(esParaCancelar);				
				this.cancelarNuevoTipoProduBanco(esParaCancelar);								
			}
			
			this.tipoprodubanco=new TipoProduBanco();
			
			this.inicializarTipoProduBanco();
			
			this.actualizarEstadoCeldasBotonesTipoProduBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoProduBanco() throws Exception {
		try {
			TipoProduBancoConstantesFunciones.inicializarTipoProduBanco(this.tipoprodubanco);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoprodubancoLogic.getTipoProduBancos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoProduBancos(String sAccionBusqueda,List<TipoProduBanco> tipoprodubancosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoProduBanco"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoProduBancoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoProduBancoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoProduBanco"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Produ Bancos");		
		parameters.put("busquedapor", TipoProduBancoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ReferenciaBancaria.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoProduBancoLogic tipoprodubancoLogicAuxiliar=new TipoProduBancoLogic();
					tipoprodubancoLogicAuxiliar.setDatosCliente(tipoprodubancoLogic.getDatosCliente());				
					tipoprodubancoLogicAuxiliar.setTipoProduBancos(tipoprodubancosParaReportes);
					
					tipoprodubancoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoProduBancoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoprodubancosParaReportes=tipoprodubancoLogicAuxiliar.getTipoProduBancos();
					
					//tipoprodubancoLogic.getNewConnexionToDeep();
					
					//for (TipoProduBanco tipoprodubanco:tipoprodubancosParaReportes) {
					//	tipoprodubancoLogic.deepLoad(tipoprodubanco, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoprodubancoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoprodubancoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileReferenciaBancaria = AuxiliarReportes.class.getResourceAsStream("ReferenciaBancariaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_referenciabancaria", reportFileReferenciaBancaria);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoProduBanco=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoProduBancoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoProduBancoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoProduBanco=new JRBeanArrayDataSource(TipoProduBancoJInternalFrame.TraerTipoProduBancoBeans(tipoprodubancosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoProduBanco);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoProduBancoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoProduBancoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoProduBancoBean.TraerTipoProduBancoBeans(tipoprodubancosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoProduBancos(sAccionBusqueda,sTipoArchivoReporte,tipoprodubancosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoProduBancos(sAccionBusqueda,sTipoArchivoReporte,tipoprodubancosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoProduBancoActionPerformed(null);
					//this.generarExcelReporteTipoProduBancos(sAccionBusqueda,sTipoArchivoReporte,tipoprodubancosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoProduBancos(sAccionBusqueda,sTipoArchivoReporte,tipoprodubancosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoProduBancos(sAccionBusqueda,sTipoArchivoReporte,tipoprodubancosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoProduBancos(sAccionBusqueda,sTipoArchivoReporte,tipoprodubancosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoProduBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProduBanco> tipoprodubancosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprodubanco";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProduBancos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProduBanco("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoProduBanco tipoprodubanco : tipoprodubancosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoProduBancoConstantesFunciones.generarExcelReporteDataTipoProduBanco("NORMAL",row,workbook,tipoprodubanco,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Produ Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoProduBanco(String sTipo,Row row,Workbook workbook) {
		
		TipoProduBancoConstantesFunciones.generarExcelReporteHeaderTipoProduBanco(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoProduBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProduBanco> tipoprodubancosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprodubanco_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProduBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoProduBanco tipoprodubanco : tipoprodubancosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoProduBancoConstantesFunciones.getTipoProduBancoDescripcion(tipoprodubanco));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProduBancoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProduBancoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprodubanco.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoProduBancoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoProduBancoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprodubanco.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Produ Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoProduBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoProduBanco> tipoprodubancosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoProduBanco> tipoprodubancosRespaldo=null;
		
		classes=TipoProduBancoConstantesFunciones.getClassesRelationshipsOfTipoProduBanco(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoprodubancoLogic.setDatosCliente(this.datosCliente);
		this.tipoprodubancoLogic.setDatosDeep(this.datosDeep);
		this.tipoprodubancoLogic.setIsConDeep(true);
		
		tipoprodubancosRespaldo=this.tipoprodubancoLogic.getTipoProduBancos();
		
		this.tipoprodubancoLogic.setTipoProduBancos(tipoprodubancosParaReportes);	
		this.tipoprodubancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoprodubancosParaReportes=this.tipoprodubancoLogic.getTipoProduBancos();
		this.tipoprodubancoLogic.setTipoProduBancos(tipoprodubancosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprodubanco_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoProduBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoProduBanco("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoProduBanco tipoprodubanco : tipoprodubancosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoProduBanco("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoProduBancoConstantesFunciones.generarExcelReporteDataTipoProduBanco("NORMAL",row,workbook,tipoprodubanco,cellStyleDataAux);
		
			
			


				//ReferenciaBancaria
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoprodubanco.getReferenciaBancarias()!=null && tipoprodubanco.getReferenciaBancarias().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ReferenciaBancariaConstantesFunciones.generarExcelReporteHeaderReferenciaBancaria("RELACIONADO",row,workbook);
				}

				if(tipoprodubanco.getReferenciaBancarias()!=null) {
					i2=0;
					for(ReferenciaBancaria referenciabancaria : tipoprodubanco.getReferenciaBancarias()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ReferenciaBancariaConstantesFunciones.generarExcelReporteDataReferenciaBancaria("RELACIONADO",row,workbook,referenciabancaria,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoProduBancoConstantesFunciones.getTipoProduBancoDescripcion(tipoprodubanco));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Produ Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProduBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProduBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProduBanco.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProduBanco.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoProduBanco() throws Exception {		
		this.startProcessTipoProduBanco(true);
	}
	
	public void startProcessTipoProduBanco(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoProduBanco, this.jScrollPanelDatosTipoProduBanco,this.jPanelPaginacionTipoProduBanco, this.jScrollPanelDatosEdicionTipoProduBanco, this.jPanelAccionesTipoProduBanco,this.jPanelAccionesFormularioTipoProduBanco,this.jmenuBarTipoProduBanco,this.jmenuBarDetalleTipoProduBanco,this.jTtoolBarTipoProduBanco,this.jTtoolBarDetalleTipoProduBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProduBanco=null; 
		
		final JPanel jPanelParametrosReportesTipoProduBanco=this.jPanelParametrosReportesTipoProduBanco;
		//final JScrollPane jScrollPanelDatosTipoProduBanco=this.jScrollPanelDatosTipoProduBanco;
		final JTable jTableDatosTipoProduBanco=this.jTableDatosTipoProduBanco;		
		final JPanel jPanelPaginacionTipoProduBanco=this.jPanelPaginacionTipoProduBanco;
		//final JScrollPane jScrollPanelDatosEdicionTipoProduBanco=this.jScrollPanelDatosEdicionTipoProduBanco;
		final JPanel jPanelAccionesTipoProduBanco=this.jPanelAccionesTipoProduBanco;
		
		JPanel jPanelCamposAuxiliarTipoProduBanco=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoProduBanco=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
			jPanelCamposAuxiliarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jPanelCamposTipoProduBanco;
			jPanelAccionesFormularioAuxiliarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jPanelAccionesFormularioTipoProduBanco;
		}
		
		final JPanel jPanelCamposTipoProduBanco=jPanelCamposAuxiliarTipoProduBanco;
		final JPanel jPanelAccionesFormularioTipoProduBanco=jPanelAccionesFormularioAuxiliarTipoProduBanco;
		
		
		final JMenuBar jmenuBarTipoProduBanco=this.jmenuBarTipoProduBanco;
		final JToolBar jTtoolBarTipoProduBanco=this.jTtoolBarTipoProduBanco;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoProduBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProduBanco=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
			jmenuBarDetalleAuxiliarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jmenuBarDetalleTipoProduBanco;
			jTtoolBarDetalleAuxiliarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jTtoolBarDetalleTipoProduBanco;
		}
		
		final JMenuBar jmenuBarDetalleTipoProduBanco=jmenuBarDetalleAuxiliarTipoProduBanco;
		final JToolBar jTtoolBarDetalleTipoProduBanco=jTtoolBarDetalleAuxiliarTipoProduBanco;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProduBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProduBanco;
			processRunnable.jTableDatos=jTableDatosTipoProduBanco;
			processRunnable.jPanelCampos=jPanelCamposTipoProduBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProduBanco;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProduBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProduBanco;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProduBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProduBanco;
			processRunnable.jTtoolBar=jTtoolBarTipoProduBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProduBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoProduBanco ,jPanelParametrosReportesTipoProduBanco,jTableDatosTipoProduBanco, /*jScrollPanelDatosTipoProduBanco,*/jPanelCamposTipoProduBanco,jPanelPaginacionTipoProduBanco, /*jScrollPanelDatosEdicionTipoProduBanco,*/ jPanelAccionesTipoProduBanco,jPanelAccionesFormularioTipoProduBanco,jmenuBarTipoProduBanco,jmenuBarDetalleTipoProduBanco,jTtoolBarTipoProduBanco,jTtoolBarDetalleTipoProduBanco);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoProduBanco, jScrollPanelDatosTipoProduBanco,jPanelPaginacionTipoProduBanco, jScrollPanelDatosEdicionTipoProduBanco, jPanelAccionesTipoProduBanco,jPanelAccionesFormularioTipoProduBanco,jmenuBarTipoProduBanco,jmenuBarDetalleTipoProduBanco,jTtoolBarTipoProduBanco,jTtoolBarDetalleTipoProduBanco);
						
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
	
	public void finishProcessTipoProduBanco() {// throws Exception 
		this.finishProcessTipoProduBanco(true);
	}
	
	public void finishProcessTipoProduBanco(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoProduBanco, this.jScrollPanelDatosTipoProduBanco,this.jPanelPaginacionTipoProduBanco, this.jScrollPanelDatosEdicionTipoProduBanco, this.jPanelAccionesTipoProduBanco,this.jPanelAccionesFormularioTipoProduBanco,this.jmenuBarTipoProduBanco,this.jmenuBarDetalleTipoProduBanco,this.jTtoolBarTipoProduBanco,this.jTtoolBarDetalleTipoProduBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoProduBanco=null; 
		
		final JPanel jPanelParametrosReportesTipoProduBanco=this.jPanelParametrosReportesTipoProduBanco;
		//final JScrollPane jScrollPanelDatosTipoProduBanco=this.jScrollPanelDatosTipoProduBanco;
		final JTable jTableDatosTipoProduBanco=this.jTableDatosTipoProduBanco;		
		final JPanel jPanelPaginacionTipoProduBanco=this.jPanelPaginacionTipoProduBanco;
		//final JScrollPane jScrollPanelDatosEdicionTipoProduBanco=this.jScrollPanelDatosEdicionTipoProduBanco;
		final JPanel jPanelAccionesTipoProduBanco=this.jPanelAccionesTipoProduBanco;
		
		JPanel jPanelCamposAuxiliarTipoProduBanco=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoProduBanco=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
			jPanelCamposAuxiliarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jPanelCamposTipoProduBanco;
			jPanelAccionesFormularioAuxiliarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jPanelAccionesFormularioTipoProduBanco;
		}
		
		final JPanel jPanelCamposTipoProduBanco=jPanelCamposAuxiliarTipoProduBanco;
		final JPanel jPanelAccionesFormularioTipoProduBanco=jPanelAccionesFormularioAuxiliarTipoProduBanco;
		
		
		final JMenuBar jmenuBarTipoProduBanco=this.jmenuBarTipoProduBanco;		
		final JToolBar jTtoolBarTipoProduBanco=this.jTtoolBarTipoProduBanco;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoProduBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoProduBanco=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
			jmenuBarDetalleAuxiliarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jmenuBarDetalleTipoProduBanco;
			jTtoolBarDetalleAuxiliarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jTtoolBarDetalleTipoProduBanco;		
		}
		
		final JMenuBar jmenuBarDetalleTipoProduBanco=jmenuBarDetalleAuxiliarTipoProduBanco;
		final JToolBar jTtoolBarDetalleTipoProduBanco=jTtoolBarDetalleAuxiliarTipoProduBanco;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoProduBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoProduBanco;
			processRunnable.jTableDatos=jTableDatosTipoProduBanco;
			processRunnable.jPanelCampos=jPanelCamposTipoProduBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoProduBanco;
			processRunnable.jPanelAcciones=jPanelAccionesTipoProduBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoProduBanco;
			
			
			processRunnable.jmenuBar=jmenuBarTipoProduBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoProduBanco;
			processRunnable.jTtoolBar=jTtoolBarTipoProduBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoProduBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoProduBanco ,jPanelParametrosReportesTipoProduBanco, jTableDatosTipoProduBanco,/*jScrollPanelDatosTipoProduBanco,*/jPanelCamposTipoProduBanco,jPanelPaginacionTipoProduBanco, /*jScrollPanelDatosEdicionTipoProduBanco,*/ jPanelAccionesTipoProduBanco,jPanelAccionesFormularioTipoProduBanco,jmenuBarTipoProduBanco,jmenuBarDetalleTipoProduBanco,jTtoolBarTipoProduBanco,jTtoolBarDetalleTipoProduBanco));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoProduBanco(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoProduBanco(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoProduBanco(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoProduBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoProduBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoProduBanco,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoProduBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoProduBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoProduBanco,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoprodubancoConstantesFunciones.getsFinalQueryTipoProduBanco();
		String  finalQueryPaginacionTodos=this.tipoprodubancoConstantesFunciones.getsFinalQueryTipoProduBanco();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoProduBancoConstantesFunciones.getArrayColumnasGlobalesNoTipoProduBanco(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoProduBancoConstantesFunciones.getArrayColumnasGlobalesTipoProduBanco(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoProduBancoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoprodubancosEliminados= new ArrayList<TipoProduBanco>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoProduBanco();
		
				///*TipoProduBancoSessionBean*/this.tipoprodubancoSessionBean=new TipoProduBancoSessionBean();
			
			if(this.tipoprodubancoSessionBean==null) {
				this.tipoprodubancoSessionBean=new TipoProduBancoSessionBean();
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
					this.iNumeroPaginacion=TipoProduBancoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoProduBancoConstantesFunciones.getClassesForeignKeysOfTipoProduBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoprodubanco."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoprodubancosAux= new ArrayList<TipoProduBanco>();
			
				
			tipoprodubancoLogic.setDatosCliente(this.datosCliente);
			tipoprodubancoLogic.setDatosDeep(this.datosDeep);
			tipoprodubancoLogic.setIsConDeep(true);
			
			
			tipoprodubancoLogic.getTipoProduBancoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoprodubancoLogic.getTodosTipoProduBancos(finalQueryGlobal,pagination);
					
					//tipoprodubancoLogic.getTodosTipoProduBancosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoprodubancoLogic.getTipoProduBancos()==null|| tipoprodubancoLogic.getTipoProduBancos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprodubancosAux= new ArrayList<TipoProduBanco>();
							tipoprodubancosAux.addAll(tipoprodubancoLogic.getTipoProduBancos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprodubancosAux= new ArrayList<TipoProduBanco>();
							tipoprodubancosAux.addAll(tipoprodubancos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprodubancoLogic.getTodosTipoProduBancos(finalQueryGlobal+"",this.pagination);												
							
							//tipoprodubancoLogic.getTodosTipoProduBancosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoProduBancos("Todos",tipoprodubancoLogic.getTipoProduBancos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprodubancoLogic.setTipoProduBancos(new ArrayList<TipoProduBanco>());					
							tipoprodubancoLogic.getTipoProduBancos().addAll(tipoprodubancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprodubancos=new ArrayList<TipoProduBanco>();
							tipoprodubancos.addAll(tipoprodubancosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoProduBanco=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoProduBanco=this.idActual;
				
				} else if(this.idTipoProduBancoActual!=null && this.idTipoProduBancoActual!=0L) {
					idTipoProduBanco=idTipoProduBancoActual;
				}
				
					
				this.sDetalleReporte=TipoProduBancoConstantesFunciones.getDetalleIndicePorId(idTipoProduBanco);
				
				this.tipoprodubancos=new ArrayList<TipoProduBanco>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoprodubancoLogic.getEntity(idTipoProduBanco);
					
					//tipoprodubancoLogic.getEntityWithConnection(idTipoProduBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprodubancoLogic.setTipoProduBancos(new ArrayList<TipoProduBanco>());
					tipoprodubancoLogic.getTipoProduBancos().add(tipoprodubancoLogic.getTipoProduBanco());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprodubancos=new ArrayList<TipoProduBanco>();
					this.tipoprodubancos.add(tipoprodubanco);
				}
				
				if(tipoprodubancoLogic.getTipoProduBanco()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoProduBanco();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoProduBanco();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprodubancoLogic.getTipoProduBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprodubancos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprodubancoLogic.getTipoProduBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprodubancos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoProduBanco tipoprodubanco) {
		Boolean permite=true;
		
		if(this.tipoprodubanco.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoProduBancoConstantesFunciones.getOrderByListaTipoProduBanco();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoProduBancoConstantesFunciones.getOrderByListaTipoProduBanco();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProduBanco tipoprodubanco:tipoprodubancoLogic.getTipoProduBancos()) {
				if(tipoprodubanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprodubancoTotales=tipoprodubanco;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProduBanco tipoprodubanco:this.tipoprodubancos) {
				if(tipoprodubanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprodubancoTotales=tipoprodubanco;
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
			this.tipoprodubancoAux=new TipoProduBanco();
			this.tipoprodubancoAux.setsType(Constantes2.S_TOTALES);
			this.tipoprodubancoAux.setIsNew(false);
			this.tipoprodubancoAux.setIsChanged(false);
			this.tipoprodubancoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoProduBancoConstantesFunciones.TotalizarValoresFilaTipoProduBanco(this.tipoprodubancoLogic.getTipoProduBancos(),this.tipoprodubancoAux);
				
				this.tipoprodubancoLogic.getTipoProduBancos().add(this.tipoprodubancoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoProduBancoConstantesFunciones.TotalizarValoresFilaTipoProduBanco(this.tipoprodubancos,this.tipoprodubancoAux);
				
				this.tipoprodubancos.add(this.tipoprodubancoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoprodubancoTotales=new TipoProduBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprodubancoLogic.getTipoProduBancos().remove(tipoprodubancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprodubancos.remove(tipoprodubancoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoprodubancoTotales=new TipoProduBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoProduBanco tipoprodubanco:tipoprodubancoLogic.getTipoProduBancos()) {
				if(tipoprodubanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprodubancoTotales=tipoprodubanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProduBancoConstantesFunciones.TotalizarValoresFilaTipoProduBanco(this.tipoprodubancoLogic.getTipoProduBancos(),tipoprodubancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoProduBanco tipoprodubanco:this.tipoprodubancos) {
				if(tipoprodubanco.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprodubancoTotales=tipoprodubanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoProduBancoConstantesFunciones.TotalizarValoresFilaTipoProduBanco(this.tipoprodubancos,tipoprodubancoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoProduBanco() {
		this.isPermisoTodoTipoProduBanco=false;
		this.isPermisoNuevoTipoProduBanco=false;
		this.isPermisoActualizarTipoProduBanco=false;
		this.isPermisoActualizarOriginalTipoProduBanco=false;
		this.isPermisoEliminarTipoProduBanco=false;
		this.isPermisoGuardarCambiosTipoProduBanco=false;
		this.isPermisoConsultaTipoProduBanco=false;
		this.isPermisoBusquedaTipoProduBanco=false;
		this.isPermisoReporteTipoProduBanco=false;		
		this.isPermisoOrdenTipoProduBanco=false;		
		this.isPermisoPaginacionMedioTipoProduBanco=false;		
		this.isPermisoPaginacionAltoTipoProduBanco=false;
		this.isPermisoPaginacionTodoTipoProduBanco=false;
		this.isPermisoCopiarTipoProduBanco=false;		
		this.isPermisoVerFormTipoProduBanco=false;		
		this.isPermisoDuplicarTipoProduBanco=false;		
		this.isPermisoOrdenTipoProduBanco=false;		
	}
	
	public void setPermisosUsuarioTipoProduBanco(Boolean isPermiso) {
		this.isPermisoTodoTipoProduBanco=isPermiso;
		this.isPermisoNuevoTipoProduBanco=isPermiso;
		this.isPermisoActualizarTipoProduBanco=isPermiso;
		this.isPermisoActualizarOriginalTipoProduBanco=isPermiso;
		this.isPermisoEliminarTipoProduBanco=isPermiso;
		this.isPermisoGuardarCambiosTipoProduBanco=isPermiso;
		this.isPermisoConsultaTipoProduBanco=isPermiso;
		this.isPermisoBusquedaTipoProduBanco=isPermiso;
		this.isPermisoReporteTipoProduBanco=isPermiso;
		this.isPermisoOrdenTipoProduBanco=isPermiso;		
		this.isPermisoPaginacionMedioTipoProduBanco=isPermiso;		
		this.isPermisoPaginacionAltoTipoProduBanco=isPermiso;		
		this.isPermisoPaginacionTodoTipoProduBanco=isPermiso;		
		this.isPermisoCopiarTipoProduBanco=isPermiso;		
		this.isPermisoVerFormTipoProduBanco=isPermiso;		
		this.isPermisoDuplicarTipoProduBanco=isPermiso;
		this.isPermisoOrdenTipoProduBanco=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoProduBanco(Boolean isPermiso) {
		//this.isPermisoTodoTipoProduBanco=isPermiso;
		this.isPermisoNuevoTipoProduBanco=isPermiso;
		this.isPermisoActualizarTipoProduBanco=isPermiso;
		this.isPermisoActualizarOriginalTipoProduBanco=isPermiso;
		this.isPermisoEliminarTipoProduBanco=isPermiso;
		this.isPermisoGuardarCambiosTipoProduBanco=isPermiso;
		//this.isPermisoConsultaTipoProduBanco=isPermiso;
		//this.isPermisoBusquedaTipoProduBanco=isPermiso;
		//this.isPermisoReporteTipoProduBanco=isPermiso;
		//this.isPermisoOrdenTipoProduBanco=isPermiso;		
		//this.isPermisoPaginacionMedioTipoProduBanco=isPermiso;		
		//this.isPermisoPaginacionAltoTipoProduBanco=isPermiso;		
		//this.isPermisoPaginacionTodoTipoProduBanco=isPermiso;		
		//this.isPermisoCopiarTipoProduBanco=isPermiso;		
		//this.isPermisoDuplicarTipoProduBanco=isPermiso;
		//this.isPermisoOrdenTipoProduBanco=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoProduBancoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ReferenciaBancariaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoProduBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosReferenciaBancaria=false;
		this.isTienePermisosReferenciaBancaria=this.verificarGetPermisosUsuarioOpcionTipoProduBancoClaseRelacionada(this.opcionsRelacionadas,ReferenciaBancariaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoProduBanco(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoProduBancoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosReferenciaBancaria=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoProduBancoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoProduBancoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoProduBancoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosReferenciaBancaria && this.jInternalFrameDetalleFormTipoProduBanco!=null && this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProduBanco.jTabbedPaneRelacionesTipoProduBanco.remove(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoProduBanco() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoProduBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoProduBancoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoProduBanco=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoProduBanco=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoProduBanco=this.isPermisoActualizarTipoProduBanco;
			this.isPermisoEliminarTipoProduBanco=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoProduBanco=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoProduBanco=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoProduBanco=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoProduBanco=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoProduBanco=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProduBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoProduBanco=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoProduBanco=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoProduBanco=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoProduBanco=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoProduBanco=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoProduBanco=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoProduBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoProduBanco.setToolTipText(this.jTableDatosTipoProduBanco.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoProduBanco(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoProduBanco(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoProduBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoProduBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoProduBanco() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosReferenciaBancaria && this.tipoprodubancoConstantesFunciones.mostrarReferenciaBancariaTipoProduBanco && !TipoProduBancoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Referencia Bancaria");
			reporte.setsDescripcion("Referencia Bancaria");
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
	
		
	public void inicializarCombosForeignKeyTipoProduBancoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoProduBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoProduBancoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoProduBancoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoProduBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoProduBanco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoProduBanco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoProduBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoProduBanco()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProduBanco();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoProduBanco(TipoProduBanco tipoprodubanco)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoProduBanco(TipoProduBanco tipoprodubanco,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoProduBanco()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoProduBanco()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoProduBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoProduBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoProduBanco()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoProduBanco()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoProduBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoProduBanco()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoProduBancoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoProduBancoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoProduBancoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoprodubancoSessionBean=new TipoProduBancoSessionBean(); 
		this.tipoprodubancoConstantesFunciones=new TipoProduBancoConstantesFunciones(); 
		this.tipoprodubancoBean=new TipoProduBanco();//(this.tipoprodubancoConstantesFunciones); 		
		this.tipoprodubancoReturnGeneral=new TipoProduBancoParameterReturnGeneral(); 
		
		this.tipoprodubancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprodubancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoProduBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoProduBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoProduBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoProduBanco(true);
			
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
			
			this.tipoprodubancoConstantesFunciones=new TipoProduBancoConstantesFunciones(); 
			this.tipoprodubancoBean=new TipoProduBanco();//this.tipoprodubancoConstantesFunciones); 			
			this.tipoprodubancoReturnGeneral=new TipoProduBancoParameterReturnGeneral(); 
		
			TipoProduBancoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Produ Banco Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoprodubanco=new TipoProduBanco();
			this.tipoprodubancos = new ArrayList<TipoProduBanco>();
			this.tipoprodubancosAux = new ArrayList<TipoProduBanco>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic=new TipoProduBancoLogic();
				this.tipoprodubancoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoprodubancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoprodubancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoProduBanco);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoProduBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProduBanco);	
					}
					
					if(this.jInternalFrameImportacionTipoProduBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProduBanco);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoProduBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoProduBanco);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProduBanco);
				this.jInternalFrameDetalleFormTipoProduBanco.setVisible(false);
				this.jInternalFrameDetalleFormTipoProduBanco.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoProduBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProduBanco);
					this.jInternalFrameReporteDinamicoTipoProduBanco.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoProduBanco.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoProduBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoProduBanco);
					this.jInternalFrameImportacionTipoProduBanco.setVisible(false);
					this.jInternalFrameImportacionTipoProduBanco.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoProduBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoProduBanco);
					this.jInternalFrameOrderByTipoProduBanco.setVisible(false);
					this.jInternalFrameOrderByTipoProduBanco.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoProduBancoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoProduBancoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoprodubancoReturnGeneral=new TipoProduBancoParameterReturnGeneral();
			
			this.tipoprodubancoParameterGeneral=new TipoProduBancoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoprodubancoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoProduBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ReferenciaBancariaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProduBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprodubancoSessionBean.getEsGuardarRelacionado(),this.tipoprodubancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoProduBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprodubancoSessionBean.getEsGuardarRelacionado(),this.tipoprodubancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoProduBanco=false;
			this.isVisibilidadCeldaDuplicarTipoProduBanco=true;
			this.isVisibilidadCeldaCopiarTipoProduBanco=true;
			this.isVisibilidadCeldaVerFormTipoProduBanco=true;
			this.isVisibilidadCeldaOrdenTipoProduBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=false;
			this.isVisibilidadCeldaModificarTipoProduBanco=false;
			this.isVisibilidadCeldaActualizarTipoProduBanco=false;
			this.isVisibilidadCeldaEliminarTipoProduBanco=false;
			this.isVisibilidadCeldaCancelarTipoProduBanco=false;
			this.isVisibilidadCeldaGuardarTipoProduBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoProduBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoProduBanco();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoProduBanco(false);
			
			this.setPermisosUsuarioTipoProduBanco();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoprodubancoSessionBean.getEsGuardarRelacionado() && this.tipoprodubancoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoProduBancoClasesRelacionadas();
			}
			
			if(this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoProduBancoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoProduBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoProduBanco();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoProduBanco();
			}
			
			if(!this.isPermisoBusquedaTipoProduBanco) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoProduBanco,this.isPermisoPaginacionMedioTipoProduBanco,this.isPermisoPaginacionTodoTipoProduBanco);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoProduBancoConstantesFunciones.getTiposSeleccionarTipoProduBanco());
				
				this.tiposColumnasSelect=TipoProduBancoConstantesFunciones.getTiposSeleccionarTipoProduBanco(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoProduBanco();				
				//this.tiposRelacionesSelect=TipoProduBancoConstantesFunciones.getTiposRelacionesTipoProduBanco(true);
				
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
			//if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoProduBanco();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoProduBanco(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoProduBanco(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProduBanco() ;
			
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
			
			
			this.referenciabancariaLogic=new ReferenciaBancariaLogic(); 
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
				tipoprodubancoImplementable= (TipoProduBancoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProduBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoprodubancoImplementableHome= (TipoProduBancoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoProduBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoprodubancos= new ArrayList<TipoProduBanco>();
			this.tipoprodubancosEliminados= new ArrayList<TipoProduBanco>();
						
			this.isEsNuevoTipoProduBanco=false;
			this.esParaAccionDesdeFormularioTipoProduBanco=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoProduBanco(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoProduBanco();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoProduBancoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoProduBancoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoProduBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoProduBanco(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoProduBanco();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoProduBanco();
			}
			
			TipoProduBancoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoProduBanco(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoProduBanco: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoProduBanco() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoProduBanco")) {
				iIndex=this.jInternalFrameDetalleFormTipoProduBanco.jTabbedPaneRelacionesTipoProduBanco.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoProduBanco.jTabbedPaneRelacionesTipoProduBanco.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();	
				
				

				if(sTitle.equals("Referencia Bancarias")) {
					if(!ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoProduBanco();

						this.cargarParteTabPanelRelacionadaReferenciaBancaria(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoProduBanco();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaReferenciaBancaria(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoProduBanco.cargarSessionConBeanSwingJInternalFrameReferenciaBancaria(false,true,iIndex);
		this.jButtonReferenciaBancariaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaReferenciaBancaria();

		//this.jTabbedPaneRelacionesTipoProduBanco.updateUI();
		//this.jTabbedPaneRelacionesTipoProduBanco.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoProduBanco.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ReferenciaBancaria")) {
				int row=this.jTableDatosTipoProduBanco.getSelectedRow();
				jButtonReferenciaBancariaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Referencia Bancaria")) {

					if(this.isTienePermisosReferenciaBancaria && this.tipoprodubancoConstantesFunciones.mostrarReferenciaBancariaTipoProduBanco && !TipoProduBancoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Referencia Bancarias"+"("+ReferenciaBancariaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Referencia Bancarias");

						if(tipoprodubancoConstantesFunciones.resaltarReferenciaBancariaTipoProduBanco!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoprodubancoConstantesFunciones.resaltarReferenciaBancariaTipoProduBanco);
						}

						jmenuItem.setEnabled(this.tipoprodubancoConstantesFunciones.activarReferenciaBancariaTipoProduBanco);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ReferenciaBancaria"));

						

						this.jInternalFrameDetalleFormTipoProduBanco.jmenuDetalleTipoProduBanco.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoProduBanco(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoProduBanco(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoProduBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoProduBancoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoProduBanco();
		
		this.cargarCombosFrameForeignKeyTipoProduBanco();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoProduBanco();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoProduBanco();
		}
	}
	
	
	
	public void jButtonNuevoTipoProduBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoProduBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			
			
			if(jTableDatosTipoProduBanco.getRowCount()>=1) {
				jTableDatosTipoProduBanco.removeRowSelectionInterval(0, jTableDatosTipoProduBanco.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoProduBanco=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoProduBanco(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoProduBanco(true);			
			//this.tipoprodubanco=new TipoProduBanco();
			//this.tipoprodubanco.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProduBanco(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProduBanco() ;
			
			if(TipoProduBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProduBanco(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoprodubanco);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);				
			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			
			if(this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoProduBanco: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoProduBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoProduBanco.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoProduBanco.getSelectedRows().length;			
			}
			
			tipoprodubancosSeleccionados=this.getTipoProduBancosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoProduBanco--;			
				//TipoProduBanco tipoprodubancoAux= new TipoProduBanco();			
				//tipoprodubancoAux.setId(this.iIdNuevoTipoProduBanco);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoProduBanco tipoprodubancoOrigen=new TipoProduBanco();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoProduBanco tipoprodubancoOrigen : tipoprodubancosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoprodubancoOrigen =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprodubancoOrigen =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoProduBanco();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoprodubanco.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoProduBanco(tipoprodubancoOrigen,this.tipoprodubanco,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprodubancoLogic.getTipoProduBancos().add(this.tipoprodubancoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprodubancos.add(this.tipoprodubancoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoProduBanco(false);
				
				this.jTableDatosTipoProduBanco.setRowSelectionInterval(this.getIndiceNuevoTipoProduBanco(), this.getIndiceNuevoTipoProduBanco());
				
				int iLastRow =  this.jTableDatosTipoProduBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProduBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProduBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProduBanco(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();									
		
			TipoProduBanco tipoprodubancoOrigen=new TipoProduBanco();
			TipoProduBanco tipoprodubancoDestino=new TipoProduBanco();
				
			tipoprodubancosSeleccionados=this.getTipoProduBancosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoProduBanco.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoprodubancosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoProduBanco.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprodubancoOrigen =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprodubancoOrigen =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprodubancoDestino =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprodubancoDestino =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoprodubancoOrigen =tipoprodubancosSeleccionados.get(0);
				tipoprodubancoDestino =tipoprodubancosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoProduBanco(tipoprodubancoOrigen,tipoprodubancoDestino,true,false);
				
				tipoprodubancoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprodubancoDestino,tipoprodubancoLogic.getTipoProduBancos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprodubancoDestino,tipoprodubancos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoProduBanco(false);
				
				//this.jTableDatosTipoProduBanco.setRowSelectionInterval(this.getIndiceNuevoTipoProduBanco(), this.getIndiceNuevoTipoProduBanco());
				
				int iLastRow =  this.jTableDatosTipoProduBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoProduBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoProduBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProduBanco(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProduBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoProduBanco.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoProduBanco.isVisible();
			
			
			this.jPanelParametrosReportesTipoProduBanco.setVisible(!isVisible);
			this.jPanelPaginacionTipoProduBanco.setVisible(!isVisible);
			this.jPanelAccionesTipoProduBanco.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoProduBanco();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoProduBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoProduBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoProduBanco();
			
			this.abrirFrameOrderByTipoProduBanco();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoProduBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoProduBanco(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProduBanco);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoProduBanco.isMaximum()) {
					this.jInternalFrameDetalleFormTipoProduBanco.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoProduBanco.setSize(this.jInternalFrameDetalleFormTipoProduBanco.iWidthFormulario,this.jInternalFrameDetalleFormTipoProduBanco.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoProduBanco.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoProduBanco.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoProduBanco.isMaximum()) {
						this.jInternalFrameDetalleFormTipoProduBanco.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoProduBanco.jContentPaneDetalleTipoProduBanco.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoProduBanco.jTabbedPaneRelacionesTipoProduBanco.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoProduBanco.jContentPaneDetalleTipoProduBanco.getWidth(),TipoProduBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProduBanco.jTabbedPaneRelacionesTipoProduBanco.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoProduBanco.jContentPaneDetalleTipoProduBanco.getWidth(),TipoProduBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoProduBanco.jTabbedPaneRelacionesTipoProduBanco.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoProduBanco.jContentPaneDetalleTipoProduBanco.getWidth(),TipoProduBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaReferenciaBancaria();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoProduBanco.setVisible(true);
	        this.jInternalFrameDetalleFormTipoProduBanco.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoProduBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoProduBanco==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoProduBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProduBanco,false,this);
				} else {
					this.jInternalFrameOrderByTipoProduBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoProduBanco,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoProduBanco);
				this.jInternalFrameOrderByTipoProduBanco.setVisible(false);
				this.jInternalFrameOrderByTipoProduBanco.setSelected(false);
				
				this.jInternalFrameOrderByTipoProduBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProduBanco"));
				
				this.inicializarActualizarBindingTablaOrderByTipoProduBanco();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoProduBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoProduBanco==null) {
				
				this.jInternalFrameImportacionTipoProduBanco=new ImportacionJInternalFrame(TipoProduBancoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoProduBanco);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoProduBanco);
				this.jInternalFrameImportacionTipoProduBanco.setVisible(false);
				this.jInternalFrameImportacionTipoProduBanco.setSelected(false);


				this.jInternalFrameImportacionTipoProduBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProduBanco"));
				this.jInternalFrameImportacionTipoProduBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProduBanco"));
				this.jInternalFrameImportacionTipoProduBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProduBanco"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoProduBanco() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoProduBanco==null) {
				this.jInternalFrameReporteDinamicoTipoProduBanco=new ReporteDinamicoJInternalFrame(TipoProduBancoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoProduBanco);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoProduBanco);
				this.jInternalFrameReporteDinamicoTipoProduBanco.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoProduBanco.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoProduBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProduBanco"));
				this.jInternalFrameReporteDinamicoTipoProduBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProduBanco"));
				this.jInternalFrameReporteDinamicoTipoProduBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProduBanco"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProduBanco();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaReferenciaBancaria() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoProduBanco.jContentPaneDetalleTipoProduBanco.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoProduBanco() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoProduBanco);
			
	       	this.jInternalFrameDetalleFormTipoProduBanco.setVisible(false);
	        this.jInternalFrameDetalleFormTipoProduBanco.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoProduBanco.dispose();
			//this.jInternalFrameDetalleFormTipoProduBanco=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoProduBanco() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoProduBanco.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoProduBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoProduBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoProduBanco.setVisible(true);
	        this.jInternalFrameImportacionTipoProduBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoProduBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoProduBanco.setVisible(true);
	        this.jInternalFrameOrderByTipoProduBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoProduBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoProduBanco.setVisible(false);
	        this.jInternalFrameOrderByTipoProduBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoProduBanco() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoProduBanco.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoProduBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoProduBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoProduBanco.setVisible(false);
	        this.jInternalFrameImportacionTipoProduBanco.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoProduBanco(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoProduBanco(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoProduBanco(true);
			//this.isEsNuevoTipoProduBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoProduBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProduBanco(false) ;
			
			if(tipoprodubancoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.getEsGuardarRelacionado() && ReferenciaBancariaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonReferenciaBancariaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoProduBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProduBanco(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProduBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoProduBancoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoProduBanco(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoProduBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoProduBanco(true);
			//this.isEsNuevoTipoProduBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoprodubanco.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoProduBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoProduBanco(false) ;
			
			if(TipoProduBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoProduBanco(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProduBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoProduBanco(false);
			
			//if(!this.isEsNuevoTipoProduBanco) {								
				int intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoProduBanco(this.tipoprodubanco,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);
				
			}
			
			if(this.permiteMantenimiento(this.tipoprodubanco)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoProduBanco=true;
					this.inicializarActualizarBindingTablaTipoProduBanco(false);
					this.isEsNuevoTipoProduBanco=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoProduBanco=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoProduBanco=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProduBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProduBanco(false);
				
				this.habilitarDeshabilitarControlesTipoProduBanco(false);
			
												
				
				if(TipoProduBancoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoProduBanco();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoProduBancoActionPerformed(evt,tipoprodubancoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoProduBanco(this.tipoprodubanco,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoProduBanco.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoprodubancoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoprodubanco.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoProduBanco.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProduBanco.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				this.tipoprodubanco.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				this.tipoprodubanco.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoprodubanco)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoProduBancoModel) this.jTableDatosTipoProduBanco.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoProduBanco=true;
				this.inicializarActualizarBindingTablaTipoProduBanco(false);
				this.isEsNuevoTipoProduBanco=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoProduBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProduBanco(false);
				
				this.habilitarDeshabilitarControlesTipoProduBanco(false);
				
				
				
				if(TipoProduBancoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoProduBanco();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoProduBanco.getRowCount()>=1) {
				jTableDatosTipoProduBanco.removeRowSelectionInterval(0, jTableDatosTipoProduBanco.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoProduBanco(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoProduBanco(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoProduBanco(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoProduBanco(false) ;
			
			this.isEsNuevoTipoProduBanco=false;
			
			if(TipoProduBancoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoProduBanco();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoProduBanco(false);
				
				//SI ES MANUAL
				if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoProduBanco();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoProduBanco--;			
			//TipoProduBanco tipoprodubancoAux= new TipoProduBanco();			
			//tipoprodubancoAux.setId(this.iIdNuevoTipoProduBanco);
			
			if(this.jInternalFrameDetalleFormTipoProduBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoProduBanco();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);
			
			this.tipoprodubanco.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoprodubancoLogic.getTipoProduBancos().add(this.tipoprodubancoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoprodubancos.add(this.tipoprodubancoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoProduBanco(false);
			
			this.jTableDatosTipoProduBanco.setRowSelectionInterval(this.getIndiceNuevoTipoProduBanco(), this.getIndiceNuevoTipoProduBanco());
			
			int iLastRow =  this.jTableDatosTipoProduBanco.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoProduBanco.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoProduBanco.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoProduBanco(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoProduBanco(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProduBanco(false);
			
			//SI ES MANUAL
			if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProduBanco();
			}
			
			//this.abrirFrameTreeTipoProduBanco();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Produ BancoS ?", "MANTENIMIENTO DE Tipo Produ Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoProduBanco.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoProduBanco();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoprodubancoReturnGeneral=tipoprodubancoLogic.procesarImportacionTipoProduBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoprodubancoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoProduBancoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoProduBanco.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoProduBanco.setFileImportacion(this.jInternalFrameImportacionTipoProduBanco.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoProduBanco.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoProduBanco.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoProduBanco.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoProduBanco.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();		

		tipoprodubancosSeleccionados=this.getTipoProduBancosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProduBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProduBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoProduBancoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoProduBancoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoProduBancos("Todos",tipoprodubancosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Produ Banco",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoProduBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProduBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProduBancoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoProduBancoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoProduBanco.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProduBanco.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoProduBanco.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoProduBancoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoProduBancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoProduBanco.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoProduBancoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoProduBancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoProduBanco.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProduBanco.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoProduBancoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoProduBancoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();		
		
		tipoprodubancosSeleccionados=this.getTipoProduBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprodubanco";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoProduBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoProduBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoProduBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoProduBancoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProduBancoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoProduBanco tipoprodubanco:tipoprodubancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprodubanco.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoProduBancoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoProduBancoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoProduBanco tipoprodubanco:tipoprodubancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprodubanco.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoProduBanco(row);				
			//	iRow++;
			//}				
			
			//for(TipoProduBanco tipoprodubancoAux:tipoprodubancosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoProduBanco(tipoprodubancoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Produ Banco",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoprodubancoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProduBanco(false);
			
			//SI ES MANUAL
			if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoProduBanco();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProduBanco(false);
			
			//SI ES MANUAL
			if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProduBanco();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoProduBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoProduBanco(false);
			
			//SI ES MANUAL
			if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoProduBanco();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprodubancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoProduBanco() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoProduBanco.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoProduBanco.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoProduBanco.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoProduBanco.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoProduBanco.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoProduBanco.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoProduBanco.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoProduBanco(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoProduBanco(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoProduBanco(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoProduBanco(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoProduBanco(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoProduBanco(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProduBanco(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoProduBanco(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoProduBancoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoProduBancoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoProduBanco() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoProduBanco();
		
		this.inicializarActualizarBindingBotonesManualTipoProduBanco(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProduBanco();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoProduBanco() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProduBanco(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProduBanco(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoProduBanco.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoProduBanco.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoProduBanco.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoProduBanco.jCheckBoxPostAccionNuevoTipoProduBanco.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoProduBanco.jCheckBoxPostAccionSinCerrarTipoProduBanco.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoProduBanco.jCheckBoxPostAccionSinMensajeTipoProduBanco.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoProduBanco.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoProduBanco.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoProduBanco.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
				this.jInternalFrameDetalleFormTipoProduBanco.jCheckBoxPostAccionNuevoTipoProduBanco.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoProduBanco.jCheckBoxPostAccionSinCerrarTipoProduBanco.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoProduBanco.jCheckBoxPostAccionSinMensajeTipoProduBanco.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoProduBanco.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoProduBanco.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoProduBanco.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoProduBanco!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProduBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoProduBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoProduBanco.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoProduBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoProduBanco.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoProduBanco!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoProduBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoProduBanco.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoProduBanco.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoProduBanco(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoProduBanco(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoProduBanco() throws Exception {
		try	{
			if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProduBanco();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProduBanco() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoProduBanco() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoProduBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoProduBanco.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoProduBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoProduBanco.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoProduBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoProduBanco.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoProduBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoProduBanco.addItem(reporte);
			}
			
			
			if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoProduBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoProduBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoProduBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoProduBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoProduBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoProduBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoProduBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoProduBanco.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoProduBanco.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProduBanco();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoProduBanco() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProduBanco!=null) {
				this.jInternalFrameReporteDinamicoTipoProduBanco.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProduBanco.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoProduBanco!=null) {
				this.jInternalFrameReporteDinamicoTipoProduBanco.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoProduBanco.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoProduBanco!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoProduBanco.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProduBanco.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProduBanco.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoProduBanco.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoProduBanco.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoProduBanco.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoProduBanco()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoProduBanco(Boolean esInicializar) throws Exception {				
		if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoProduBanco();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoProduBanco() throws Exception {
		this.inicializarActualizarBindingTablaTipoProduBanco(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoProduBanco() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoProduBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoProduBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoProduBancoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProduBancoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoProduBancoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoProduBancoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoProduBanco(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoprodubancoLogic.getTipoProduBancos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoprodubancos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoProduBanco.setModel(new TipoProduBancoModel(this.tipoprodubancoLogic.getTipoProduBancos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoProduBanco.setModel(new TipoProduBancoModel(this.tipoprodubancos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoProduBanco!=null && this.jInternalFrameOrderByTipoProduBanco.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoProduBanco();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoProduBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProduBanco,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoProduBancoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO,tipoprodubancoConstantesFunciones.resaltarSeleccionarTipoProduBanco,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoProduBancoConstantesFunciones.SCLASSWEBTITULO,tipoprodubancoConstantesFunciones.resaltarSeleccionarTipoProduBanco,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoProduBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProduBanco,TipoProduBancoConstantesFunciones.LABEL_ID));

		if(this.tipoprodubancoConstantesFunciones.mostraridTipoProduBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProduBancoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoprodubancoConstantesFunciones.resaltaridTipoProduBanco,this.tipoprodubancoConstantesFunciones.activaridTipoProduBanco,this,true,"idTipoProduBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprodubancoConstantesFunciones.resaltaridTipoProduBanco,this.tipoprodubancoConstantesFunciones.activaridTipoProduBanco,this,true,"idTipoProduBanco","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProduBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProduBanco,TipoProduBancoConstantesFunciones.LABEL_CODIGO));

		if(this.tipoprodubancoConstantesFunciones.mostrarcodigoTipoProduBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProduBancoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprodubancoConstantesFunciones.resaltarcodigoTipoProduBanco,this.tipoprodubancoConstantesFunciones.activarcodigoTipoProduBanco,this,true,"codigoTipoProduBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprodubancoConstantesFunciones.resaltarcodigoTipoProduBanco,this.tipoprodubancoConstantesFunciones.activarcodigoTipoProduBanco,this,true,"codigoTipoProduBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProduBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoProduBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoProduBanco,TipoProduBancoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoprodubancoConstantesFunciones.mostrarnombreTipoProduBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoProduBancoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprodubancoConstantesFunciones.resaltarnombreTipoProduBanco,this.tipoprodubancoConstantesFunciones.activarnombreTipoProduBanco,this,true,"nombreTipoProduBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprodubancoConstantesFunciones.resaltarnombreTipoProduBanco,this.tipoprodubancoConstantesFunciones.activarnombreTipoProduBanco,this,true,"nombreTipoProduBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoProduBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosReferenciaBancaria && this.tipoprodubancoConstantesFunciones.mostrarReferenciaBancariaTipoProduBanco && !TipoProduBancoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Referencia Bancarias");
				tableColumn.setHeaderValue("Referencia Bancarias");
				tableColumn.setCellRenderer(new ReferenciaBancariaTableCell(tipoprodubancoConstantesFunciones.resaltarReferenciaBancariaTipoProduBanco,this,this.tipoprodubancoConstantesFunciones.activarReferenciaBancariaTipoProduBanco));
				tableColumn.setCellEditor(new ReferenciaBancariaTableCell(tipoprodubancoConstantesFunciones.resaltarReferenciaBancariaTipoProduBanco,this,this.tipoprodubancoConstantesFunciones.activarReferenciaBancariaTipoProduBanco));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoProduBanco.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprodubancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprodubancoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProduBanco.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprodubancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprodubancoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoProduBanco.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoProduBanco && this.isPermisoGuardarCambiosTipoProduBanco) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoprodubancoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoprodubancoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoProduBanco.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoProduBanco.addColumn(tableColumn);
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
			
			this.jTableDatosTipoProduBanco.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProduBanco && this.isPermisoGuardarCambiosTipoProduBanco) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoProduBanco && this.isPermisoGuardarCambiosTipoProduBanco) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoProduBanco.moveColumn(this.jTableDatosTipoProduBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoProduBanco.moveColumn(this.jTableDatosTipoProduBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoProduBanco.moveColumn(this.jTableDatosTipoProduBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoProduBanco.moveColumn(this.jTableDatosTipoProduBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoProduBanco.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoProduBanco.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoProduBanco,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoProduBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoProduBanco.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoProduBanco.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoProduBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoProduBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoProduBanco.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoProduBanco.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoProduBanco.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoprodubancoLogic.getTipoProduBancos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoprodubancos.size()-1;
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
		//this.jTableDatosTipoProduBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoProduBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoProduBanco();
			
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
				
				//this.isEsNuevoTipoProduBanco=false;
					
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			
				if(this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoProduBanco==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProduBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProduBanco.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoprodubanco.getsType().equals("DUPLICADO")
				   || this.tipoprodubanco.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoProduBanco=true;
				
				} else {
					this.isEsNuevoTipoProduBanco=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoprodubanco.getId()>=0 && !this.tipoprodubanco.getIsNew()) {						
						this.isEsNuevoTipoProduBanco=false;
						
					} else {
						this.isEsNuevoTipoProduBanco=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoProduBanco(esRelaciones);						
				
				this.seleccionarTipoProduBanco(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoprodubanco.getId()<0) {
					this.isEsNuevoTipoProduBanco=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoProduBanco(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoProduBanco(evt,rowIndex);
				}	
				
				if(this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoProduBanco: " + this.dDif); 
					}
				}								
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoProduBanco(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoprodubanco)) {
					if(this.tipoprodubanco.getId()>0) {
						this.tipoprodubanco.setIsDeleted(true);
						
						this.tipoprodubancosEliminados.add(this.tipoprodubanco);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprodubancoLogic.getTipoProduBancos().remove(this.tipoprodubanco);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprodubancos.remove(this.tipoprodubanco);				
					}
					
					
					((TipoProduBancoModel) this.jTableDatosTipoProduBanco.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoProduBanco(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoProduBanco(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoProduBanco) {
			
			if(this.jInternalFrameDetalleFormTipoProduBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoProduBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoProduBanco.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoProduBanco(this.tipoprodubanco);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoProduBanco("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoProduBanco(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoProduBanco() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProduBanco(TipoProduBanco tipoprodubanco) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoProduBanco(tipoprodubanco,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoProduBanco(TipoProduBanco tipoprodubanco,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoProduBanco(tipoprodubanco);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoProduBanco(tipoprodubanco,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoProduBanco(tipoprodubanco);
	}
	
	public void setVariablesObjetoActualToFormularioTipoProduBanco(TipoProduBanco tipoprodubanco) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoProduBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldidTipoProduBanco.setText(tipoprodubanco.getId().toString());
			this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldcodigoTipoProduBanco.setText(tipoprodubanco.getcodigo());
			this.jInternalFrameDetalleFormTipoProduBanco.jTextAreanombreTipoProduBanco.setText(tipoprodubanco.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoProduBanco tipoprodubancoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoprodubancoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoProduBanco tipoprodubancoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoprodubancoLocal=this.tipoprodubanco;
			} else {
				tipoprodubancoLocal=this.tipoprodubancoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoprodubancoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoProduBanco(tipoprodubancoLocal,true);
					
					if(tipoprodubancoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoprodubancoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoprodubancoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoProduBanco(TipoProduBanco tipoprodubanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProduBanco(tipoprodubanco,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(tipoprodubanco);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProduBanco(TipoProduBanco tipoprodubanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoProduBanco(tipoprodubanco,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoProduBanco(TipoProduBanco tipoprodubanco,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoProduBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldidTipoProduBanco.getText()==null || this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldidTipoProduBanco.getText()=="" || this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldidTipoProduBanco.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldidTipoProduBanco.setText("0");
			}

			if(conColumnasBase) {tipoprodubanco.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldidTipoProduBanco.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProduBancoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProduBanco.jLabelIdTipoProduBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprodubanco.setcodigo(this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldcodigoTipoProduBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProduBancoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProduBanco.jLabelcodigoTipoProduBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprodubanco.setnombre(this.jInternalFrameDetalleFormTipoProduBanco.jTextAreanombreTipoProduBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoProduBancoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoProduBanco.jLabelnombreTipoProduBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoProduBanco(TipoProduBanco tipoprodubancoBean,TipoProduBanco tipoprodubanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoProduBanco(TipoProduBanco tipoprodubancoOrigen,TipoProduBanco tipoprodubanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprodubancoOrigen.getId()!=null && !tipoprodubancoOrigen.getId().equals(0L))) {tipoprodubanco.setId(tipoprodubancoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoprodubancoOrigen.getcodigo()!=null && !tipoprodubancoOrigen.getcodigo().equals(""))) {tipoprodubanco.setcodigo(tipoprodubancoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoprodubancoOrigen.getnombre()!=null && !tipoprodubancoOrigen.getnombre().equals(""))) {tipoprodubanco.setnombre(tipoprodubancoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProduBanco(TipoProduBanco tipoprodubanco) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldidTipoProduBanco.setText(tipoprodubanco.getId().toString());
			this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldcodigoTipoProduBanco.setText(tipoprodubanco.getcodigo());
			this.jInternalFrameDetalleFormTipoProduBanco.jTextAreanombreTipoProduBanco.setText(tipoprodubanco.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoProduBanco(TipoProduBancoBean tipoprodubancoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldidTipoProduBanco.setText(tipoprodubancoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldcodigoTipoProduBanco.setText(tipoprodubancoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoProduBanco.jTextAreanombreTipoProduBanco.setText(tipoprodubancoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoProduBanco(TipoProduBancoParameterReturnGeneral tipoprodubancoReturnGeneral,TipoProduBancoBean tipoprodubancoBean,Boolean conDefault) throws Exception { 
		try {
			TipoProduBanco tipoprodubancoLocal=new TipoProduBanco();
			
			tipoprodubancoLocal=tipoprodubancoReturnGeneral.getTipoProduBanco();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprodubancoLocal.getId()!=null && !tipoprodubancoLocal.getId().equals(0L))) {tipoprodubancoBean.setId(tipoprodubancoLocal.getId());}}
			if(conDefault || (!conDefault && tipoprodubancoLocal.getcodigo()!=null && !tipoprodubancoLocal.getcodigo().equals(""))) {tipoprodubancoBean.setcodigo(tipoprodubancoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoprodubancoLocal.getnombre()!=null && !tipoprodubancoLocal.getnombre().equals(""))) {tipoprodubancoBean.setnombre(tipoprodubancoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoProduBancoGenerico(Long idTipoProduBancoSeleccionado,JComboBox jComboBoxTipoProduBanco,List<TipoProduBanco> tipoprodubancosLocal)throws Exception {
		try {
			TipoProduBanco  tipoprodubancoTemp=null;

			for(TipoProduBanco tipoprodubancoAux:tipoprodubancosLocal) {
				if(tipoprodubancoAux.getId()!=null && tipoprodubancoAux.getId().equals(idTipoProduBancoSeleccionado)) {
					tipoprodubancoTemp=tipoprodubancoAux;
					break;
				}
			}

			jComboBoxTipoProduBanco.setSelectedItem(tipoprodubancoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoProduBancoGenerico(JComboBox jComboBoxTipoProduBanco,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoProduBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProduBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoProduBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoProduBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProduBanco.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoProduBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoProduBanco.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoProduBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoProduBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoProduBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ReferenciaBancaria")) {
			jButtonReferenciaBancariaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprodubanco=(TipoProduBanco) tipoprodubancoLogic.getTipoProduBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprodubanco =(TipoProduBanco) tipoprodubancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoProduBanco tipoprodubancoRow=new TipoProduBanco();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprodubancoRow=(TipoProduBanco) tipoprodubancoLogic.getTipoProduBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprodubancoRow=(TipoProduBanco) tipoprodubancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonReferenciaBancariaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoProduBanco tipoprodubanco) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoProduBanco==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprodubanco = (TipoProduBanco)this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoprodubanco = (TipoProduBanco)this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoprodubanco!=null) {
						this.tipoprodubanco = tipoprodubanco;
					} else {
						this.tipoprodubanco = new TipoProduBanco();
					}
				}

				if(this.isTienePermisosReferenciaBancaria && this.permiteMantenimiento(this.tipoprodubanco)) {
					ReferenciaBancariaBeanSwingJInternalFrame referenciabancariaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFramePopup=new ReferenciaBancariaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						referenciabancariaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFramePopup;
					} else {
						referenciabancariaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame;
					}

					List<TipoProduBanco> tipoprodubancos=new ArrayList<TipoProduBanco>();
					tipoprodubancos.add(this.tipoprodubanco);
					if(!esRelacionado) {
						//referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setConGuardarRelaciones(false);
						//referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					referenciabancariaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoProduBanco.cargarReferenciaBancariaBeanSwingJInternalFrame(tipoprodubancos,this.tipoprodubanco,referenciabancariaBeanSwingJInternalFrame,/*conInicializar,*/referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.getConGuardarRelaciones(),referenciabancariaBeanSwingJInternalFrame.referenciabancariaSessionBean.getEsGuardarRelacionado());
					referenciabancariaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						referenciabancariaBeanSwingJInternalFrame.actualizarEstadoPanelsReferenciaBancaria("no_relacionado");

						referenciabancariaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ReferenciaBancariaConstantesFunciones.ITAMANIOFILATABLA + (ReferenciaBancariaConstantesFunciones.ITAMANIOFILATABLA/2));

						referenciabancariaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoProduBanco=(TitledBorder)this.jScrollPanelDatosTipoProduBanco.getBorder();
						TitledBorder titledBorderReferenciaBancaria=(TitledBorder)referenciabancariaBeanSwingJInternalFrame.jScrollPanelDatosReferenciaBancaria.getBorder();

						titledBorderReferenciaBancaria.setTitle(titledBorderTipoProduBanco.getTitle() + " -> Referencia Bancaria");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,referenciabancariaBeanSwingJInternalFrame);
						}

						referenciabancariaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(referenciabancariaBeanSwingJInternalFrame);

						referenciabancariaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Referencia Bancaria",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoProduBanco(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoProduBanco.setVisible((this.isVisibilidadCeldaNuevoTipoProduBanco && this.isPermisoNuevoTipoProduBanco));			
			this.jButtonDuplicarTipoProduBanco.setVisible((this.isVisibilidadCeldaDuplicarTipoProduBanco && this.isPermisoDuplicarTipoProduBanco));			
			this.jButtonCopiarTipoProduBanco.setVisible((this.isVisibilidadCeldaCopiarTipoProduBanco && this.isPermisoCopiarTipoProduBanco));
			this.jButtonVerFormTipoProduBanco.setVisible((this.isVisibilidadCeldaVerFormTipoProduBanco && this.isPermisoVerFormTipoProduBanco));
			
			this.jButtonAbrirOrderByTipoProduBanco.setVisible((this.isVisibilidadCeldaOrdenTipoProduBanco && this.isPermisoOrdenTipoProduBanco));			
			
			this.jButtonNuevoRelacionesTipoProduBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco && this.isPermisoNuevoTipoProduBanco));			
			this.jButtonNuevoGuardarCambiosTipoProduBanco.setVisible((this.isVisibilidadCeldaNuevoTipoProduBanco && this.isPermisoNuevoTipoProduBanco && this.isPermisoGuardarCambiosTipoProduBanco));
			
			if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonModificarTipoProduBanco.setVisible((this.isVisibilidadCeldaModificarTipoProduBanco && this.isPermisoActualizarTipoProduBanco));	
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonActualizarTipoProduBanco.setVisible((this.isVisibilidadCeldaActualizarTipoProduBanco && this.isPermisoActualizarTipoProduBanco));	
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonEliminarTipoProduBanco.setVisible((this.isVisibilidadCeldaEliminarTipoProduBanco && this.isPermisoEliminarTipoProduBanco));
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonCancelarTipoProduBanco.setVisible(this.isVisibilidadCeldaCancelarTipoProduBanco);							
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonGuardarCambiosTipoProduBanco.setVisible((this.isVisibilidadCeldaGuardarTipoProduBanco && this.isPermisoGuardarCambiosTipoProduBanco));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoProduBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProduBanco && this.isPermisoGuardarCambiosTipoProduBanco));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoProduBanco.setVisible((this.isVisibilidadCeldaNuevoTipoProduBanco && this.isPermisoNuevoTipoProduBanco));						
			this.jButtonDuplicarToolBarTipoProduBanco.setVisible((this.isVisibilidadCeldaDuplicarTipoProduBanco && this.isPermisoDuplicarTipoProduBanco));						
			this.jButtonCopiarToolBarTipoProduBanco.setVisible((this.isVisibilidadCeldaCopiarTipoProduBanco && this.isPermisoCopiarTipoProduBanco));			
			this.jButtonVerFormToolBarTipoProduBanco.setVisible((this.isVisibilidadCeldaVerFormTipoProduBanco && this.isPermisoVerFormTipoProduBanco));			
			this.jButtonAbrirOrderByToolBarTipoProduBanco.setVisible((this.isVisibilidadCeldaOrdenTipoProduBanco && this.isPermisoOrdenTipoProduBanco));
			this.jButtonNuevoRelacionesToolBarTipoProduBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco && this.isPermisoNuevoTipoProduBanco));			
			this.jButtonNuevoGuardarCambiosToolBarTipoProduBanco.setVisible((this.isVisibilidadCeldaNuevoTipoProduBanco && this.isPermisoNuevoTipoProduBanco && this.isPermisoGuardarCambiosTipoProduBanco));			
			
			if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonModificarToolBarTipoProduBanco.setVisible((this.isVisibilidadCeldaModificarTipoProduBanco && this.isPermisoActualizarTipoProduBanco));	
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonActualizarToolBarTipoProduBanco.setVisible((this.isVisibilidadCeldaActualizarTipoProduBanco  && this.isPermisoActualizarTipoProduBanco));	
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonEliminarToolBarTipoProduBanco.setVisible((this.isVisibilidadCeldaEliminarTipoProduBanco && this.isPermisoEliminarTipoProduBanco));
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonCancelarToolBarTipoProduBanco.setVisible(this.isVisibilidadCeldaCancelarTipoProduBanco);				
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonGuardarCambiosToolBarTipoProduBanco.setVisible((this.isVisibilidadCeldaGuardarTipoProduBanco && this.isPermisoGuardarCambiosTipoProduBanco));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoProduBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProduBanco && this.isPermisoGuardarCambiosTipoProduBanco));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoProduBanco.setVisible((this.isVisibilidadCeldaNuevoTipoProduBanco && this.isPermisoNuevoTipoProduBanco));			
			this.jMenuItemDuplicarTipoProduBanco.setVisible((this.isVisibilidadCeldaDuplicarTipoProduBanco && this.isPermisoDuplicarTipoProduBanco));			
			this.jMenuItemCopiarTipoProduBanco.setVisible((this.isVisibilidadCeldaCopiarTipoProduBanco && this.isPermisoCopiarTipoProduBanco));			
			this.jMenuItemVerFormTipoProduBanco.setVisible((this.isVisibilidadCeldaVerFormTipoProduBanco && this.isPermisoVerFormTipoProduBanco));			
			this.jMenuItemAbrirOrderByTipoProduBanco.setVisible((this.isVisibilidadCeldaOrdenTipoProduBanco && this.isPermisoOrdenTipoProduBanco));			
			//this.jMenuItemMostrarOcultarTipoProduBanco.setVisible((this.isVisibilidadCeldaOrdenTipoProduBanco && this.isPermisoOrdenTipoProduBanco));
			this.jMenuItemDetalleAbrirOrderByTipoProduBanco.setVisible((this.isVisibilidadCeldaOrdenTipoProduBanco && this.isPermisoOrdenTipoProduBanco));			
			//this.jMenuItemDetalleMostrarOcultarTipoProduBanco.setVisible((this.isVisibilidadCeldaOrdenTipoProduBanco && this.isPermisoOrdenTipoProduBanco));			
			this.jMenuItemNuevoRelacionesTipoProduBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco && this.isPermisoNuevoTipoProduBanco));			
			this.jMenuItemNuevoGuardarCambiosTipoProduBanco.setVisible((this.isVisibilidadCeldaNuevoTipoProduBanco && this.isPermisoNuevoTipoProduBanco && this.isPermisoGuardarCambiosTipoProduBanco));									
			
			if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
			this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemModificarTipoProduBanco.setVisible((this.isVisibilidadCeldaModificarTipoProduBanco && this.isPermisoActualizarTipoProduBanco));	
			this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemActualizarTipoProduBanco.setVisible((this.isVisibilidadCeldaActualizarTipoProduBanco && this.isPermisoActualizarTipoProduBanco));	
			this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemEliminarTipoProduBanco.setVisible((this.isVisibilidadCeldaEliminarTipoProduBanco && this.isPermisoEliminarTipoProduBanco));
			this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemCancelarTipoProduBanco.setVisible(this.isVisibilidadCeldaCancelarTipoProduBanco);				
			}
			
			this.jMenuItemGuardarCambiosTipoProduBanco.setVisible((this.isVisibilidadCeldaGuardarTipoProduBanco && this.isPermisoGuardarCambiosTipoProduBanco));						
			this.jMenuItemGuardarCambiosTablaTipoProduBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoProduBanco && this.isPermisoGuardarCambiosTipoProduBanco));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoProduBanco=this.jButtonNuevoTipoProduBanco.isVisible();
			this.isVisibilidadCeldaDuplicarTipoProduBanco=this.jButtonDuplicarTipoProduBanco.isVisible();
			this.isVisibilidadCeldaCopiarTipoProduBanco=this.jButtonCopiarTipoProduBanco.isVisible();
			this.isVisibilidadCeldaVerFormTipoProduBanco=this.jButtonVerFormTipoProduBanco.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoProduBanco=this.jButtonAbrirOrderByTipoProduBanco.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=this.jButtonNuevoRelacionesTipoProduBanco.isVisible();
			this.isVisibilidadCeldaModificarTipoProduBanco=this.jButtonModificarTipoProduBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
			this.isVisibilidadCeldaActualizarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jButtonActualizarTipoProduBanco.isVisible();
			this.isVisibilidadCeldaEliminarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jButtonEliminarTipoProduBanco.isVisible();
			this.isVisibilidadCeldaCancelarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jButtonCancelarTipoProduBanco.isVisible();
			this.isVisibilidadCeldaGuardarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jButtonGuardarCambiosTipoProduBanco.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=this.jButtonGuardarCambiosTablaTipoProduBanco.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoProduBanco=this.jButtonNuevoToolBarTipoProduBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=this.jButtonNuevoRelacionesToolBarTipoProduBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
			this.isVisibilidadCeldaModificarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jButtonModificarToolBarTipoProduBanco.isVisible();
			this.isVisibilidadCeldaActualizarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jButtonActualizarToolBarTipoProduBanco.isVisible();
			this.isVisibilidadCeldaEliminarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jButtonEliminarToolBarTipoProduBanco.isVisible();
			this.isVisibilidadCeldaCancelarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jButtonCancelarToolBarTipoProduBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProduBanco=this.jButtonGuardarCambiosToolBarTipoProduBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=this.jButtonGuardarCambiosTablaToolBarTipoProduBanco.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoProduBanco=this.jMenuItemNuevoTipoProduBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=this.jMenuItemNuevoRelacionesTipoProduBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
			this.isVisibilidadCeldaModificarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemModificarTipoProduBanco.isVisible();
			this.isVisibilidadCeldaActualizarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemActualizarTipoProduBanco.isVisible();
			this.isVisibilidadCeldaEliminarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemEliminarTipoProduBanco.isVisible();
			this.isVisibilidadCeldaCancelarTipoProduBanco=this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemCancelarTipoProduBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoProduBanco=this.jMenuItemGuardarCambiosTipoProduBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=this.jMenuItemGuardarCambiosTablaTipoProduBanco.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoProduBanco(Boolean esInicializar) {
		if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProduBanco();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoProduBanco(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoProduBanco() {
		this.jButtonNuevoTipoProduBanco.setVisible(this.isPermisoNuevoTipoProduBanco);			
		this.jButtonDuplicarTipoProduBanco.setVisible(this.isPermisoDuplicarTipoProduBanco);			
		this.jButtonCopiarTipoProduBanco.setVisible(this.isPermisoCopiarTipoProduBanco);			
		this.jButtonVerFormTipoProduBanco.setVisible(this.isPermisoVerFormTipoProduBanco);			
		
		this.jButtonAbrirOrderByTipoProduBanco.setVisible(this.isPermisoOrdenTipoProduBanco);					
		
		this.jButtonNuevoRelacionesTipoProduBanco.setVisible(this.isPermisoNuevoTipoProduBanco);			
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonModificarTipoProduBanco.setVisible(this.isPermisoActualizarTipoProduBanco);	
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonActualizarTipoProduBanco.setVisible(this.isPermisoActualizarTipoProduBanco);	
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonEliminarTipoProduBanco.setVisible(this.isPermisoEliminarTipoProduBanco);
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonCancelarTipoProduBanco.setVisible(this.isVisibilidadCeldaCancelarTipoProduBanco);						
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonGuardarCambiosTipoProduBanco.setVisible(this.isPermisoGuardarCambiosTipoProduBanco);							
		}
		
		this.jButtonGuardarCambiosTablaTipoProduBanco.setVisible(this.isPermisoActualizarTipoProduBanco);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProduBanco() {
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonModificarTipoProduBanco.setVisible(this.isPermisoActualizarTipoProduBanco);	
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonActualizarTipoProduBanco.setVisible(this.isPermisoActualizarTipoProduBanco);	
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonEliminarTipoProduBanco.setVisible(this.isPermisoEliminarTipoProduBanco);
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonCancelarTipoProduBanco.setVisible(this.isVisibilidadCeldaCancelarTipoProduBanco);							
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonGuardarCambiosTipoProduBanco.setVisible((this.isVisibilidadCeldaGuardarTipoProduBanco && this.isPermisoGuardarCambiosTipoProduBanco));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoProduBanco() {
		if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoProduBanco();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoProduBanco() {
	}
	
	public void jTableDatosTipoProduBancoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoProduBanco(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoProduBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProduBanco(this.gettipoprodubanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprodubanco==null) {
						this.tipoprodubanco = new TipoProduBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoProduBanco(this.tipoprodubanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);
				}

				if(this.tipoprodubanco.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoprodubanco.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProduBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoProduBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProduBanco(this.gettipoprodubanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprodubanco==null) {
						this.tipoprodubanco = new TipoProduBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoProduBanco(this.tipoprodubanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);
				}

				if(this.tipoprodubanco.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoprodubanco.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProduBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoProduBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoProduBanco(this.gettipoprodubanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprodubanco==null) {
						this.tipoprodubanco = new TipoProduBanco();
					}

					this.setVariablesFormularioToObjetoActualTipoProduBanco(this.tipoprodubanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);
				}

				if(this.tipoprodubanco.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoprodubanco.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoProduBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoProduBanco() {
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
		

		if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
			this.jInternalFrameDetalleFormTipoProduBanco.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoProduBanco.dispose();
			this.jInternalFrameDetalleFormTipoProduBanco=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoProduBanco!=null) {
			this.jInternalFrameReporteDinamicoTipoProduBanco.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoProduBanco.dispose();
			this.jInternalFrameReporteDinamicoTipoProduBanco=null;
		}
		
		if(this.jInternalFrameImportacionTipoProduBanco!=null) {
			this.jInternalFrameImportacionTipoProduBanco.setVisible(false);	    			
			this.jInternalFrameImportacionTipoProduBanco.dispose();
			this.jInternalFrameImportacionTipoProduBanco=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoProduBanco();
			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoProduBanco")) {
				jButtonNuevoTipoProduBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoProduBanco")) {
				jButtonDuplicarTipoProduBancoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoProduBanco")) {
				jButtonCopiarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoProduBanco")) {
				jButtonVerFormTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoProduBanco")) {
				jButtonNuevoTipoProduBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoProduBanco")) {
				jButtonDuplicarTipoProduBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoProduBanco")) {
				jButtonNuevoTipoProduBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoProduBanco")) {
				jButtonDuplicarTipoProduBancoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoProduBanco")) {
				jButtonNuevoTipoProduBancoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoProduBanco")) {
				jButtonNuevoTipoProduBancoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoProduBanco")) {
				jButtonNuevoTipoProduBancoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoProduBanco")) {
				jButtonModificarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoProduBanco")) {
				jButtonModificarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoProduBanco")) {
				jButtonModificarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoProduBanco")) {
				jButtonActualizarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoProduBanco")) {
				jButtonActualizarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoProduBanco")) {
				jButtonActualizarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoProduBanco")) {
				jButtonEliminarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoProduBanco")) {
				jButtonEliminarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoProduBanco")) {
				jButtonEliminarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoProduBanco")) {
				jButtonCancelarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoProduBanco")) {
				jButtonCancelarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoProduBanco")) {
				jButtonCancelarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoProduBanco")) {
				jButtonCerrarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoProduBanco")) {
				jButtonCerrarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoProduBanco")) {
				jButtonCerrarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoProduBanco")) {
				jButtonMostrarOcultarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoProduBanco")) {
				jButtonCancelarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoProduBanco")) {
				jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoProduBanco")) {
				jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoProduBanco")) {
				jButtonCopiarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoProduBanco")) {
				jButtonVerFormTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoProduBanco")) {
				jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoProduBanco")) {
				jButtonCopiarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoProduBanco")) {
				jButtonVerFormTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoProduBanco")) {
				jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoProduBanco")) {
				jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoProduBanco")) {
				jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoProduBanco")) {
				jButtonRecargarInformacionTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoProduBanco")) {
				jButtonRecargarInformacionTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoProduBanco")) {
				jButtonRecargarInformacionTipoProduBancoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoProduBanco")) {
				jButtonAnterioresTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoProduBanco")) {
				jButtonAnterioresTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoProduBanco")) {
				jButtonAnterioresTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoProduBanco")) {
				jButtonSiguientesTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoProduBanco")) {
				jButtonSiguientesTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoProduBanco")) {
				jButtonSiguientesTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoProduBanco") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoProduBanco")) {
				jButtonAbrirOrderByTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoProduBanco") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoProduBanco")) {
				jButtonMostrarOcultarTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProduBanco")) {
				jButtonNuevoGuardarCambiosTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoProduBanco")) {
				jButtonNuevoGuardarCambiosTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoProduBanco")) {
				jButtonNuevoGuardarCambiosTipoProduBancoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoProduBanco")) {
				jButtonCerrarReporteDinamicoTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoProduBanco")) {
				jButtonGenerarReporteDinamicoTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoProduBanco")) {
				
				jButtonGenerarExcelReporteDinamicoTipoProduBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoProduBanco")) {
				jButtonCerrarImportacionTipoProduBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoProduBanco")) {
				
				jButtonGenerarImportacionTipoProduBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoProduBanco")) {
				
				jButtonAbrirImportacionTipoProduBancoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoProduBanco")) {
				jComboBoxTiposAccionesTipoProduBancoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoProduBanco")) {
				jComboBoxTiposRelacionesTipoProduBancoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoProduBanco")) {
				jComboBoxTiposAccionesTipoProduBancoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoProduBanco")) {
				
				jComboBoxTiposSeleccionarTipoProduBancoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoProduBanco")) {
				jTextFieldValorCampoGeneralTipoProduBancoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoProduBanco")) {
				jButtonAbrirOrderByTipoProduBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoProduBanco")) {
				jButtonAbrirOrderByTipoProduBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoProduBanco")) {
				jButtonCerrarOrderByTipoProduBancoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProduBancoBusqueda")) {
				this.jButtonidTipoProduBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoProduBancoBusqueda")) {
				this.jButtoncodigoTipoProduBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProduBancoBusqueda")) {
				this.jButtonnombreTipoProduBancoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoProduBanco();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProduBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				


				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProduBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProduBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoProduBanco tipoprodubancoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoprodubancoLocal=this.tipoprodubanco;
			} else {
				tipoprodubancoLocal=this.tipoprodubancoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
							
				
				


				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProduBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProduBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProduBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
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
			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			
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
			
			


			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProduBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
								
						
				


				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProduBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProduBanco.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
								
				
				


				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProduBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProduBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProduBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProduBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProduBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
							
				
				


				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProduBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProduBanco.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProduBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
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
			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			
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
			
			


			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProduBancoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
								
				
				


				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProduBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProduBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProduBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProduBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProduBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoProduBanco")) {
					jCheckBoxSeleccionarTodosTipoProduBancoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoProduBanco")) {
					jCheckBoxSeleccionadosTipoProduBancoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoProduBanco")) {
					
				}
				
				


				
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProduBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProduBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
												
				
				


				
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProduBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProduBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProduBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProduBancoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
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
			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
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
			
			


			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoProduBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProduBanco.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProduBanco.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprodubanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprodubanco);
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
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
				
				


				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoProduBanco.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoProduBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoProduBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprodubancoAnterior =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoProduBanco")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoProduBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoProduBanco.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoprodubanco =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoprodubanco);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoProduBanco")) {
				
				}
				
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoProduBanco")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoProduBanco.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoProduBanco")) {
			
			}
			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoProduBanco();
			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoProduBanco")) {
				jButtonNuevoTipoProduBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoProduBanco")) {
				jButtonDuplicarTipoProduBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoProduBanco")) {
				jButtonCopiarTipoProduBancoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoProduBanco")) {
				jButtonVerFormTipoProduBancoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoProduBanco")) {
				jButtonNuevoTipoProduBancoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoProduBanco")) {
				jButtonModificarTipoProduBancoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoProduBanco")) {
				jButtonActualizarTipoProduBancoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoProduBanco")) {
				jButtonEliminarTipoProduBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoProduBanco")) {
				jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoProduBanco")) {
				jButtonCancelarTipoProduBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoProduBanco")) {
				jButtonCerrarTipoProduBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoProduBanco")) {
				jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoProduBanco")) {
				jButtonNuevoGuardarCambiosTipoProduBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoProduBanco")) {
				jButtonAbrirOrderByTipoProduBancoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoProduBanco")) {
				jButtonRecargarInformacionTipoProduBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoProduBanco")) {
				jButtonAnterioresTipoProduBancoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoProduBanco")) {
				jButtonSiguientesTipoProduBancoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoProduBancoBusqueda")) {
				this.jButtonidTipoProduBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoProduBancoBusqueda")) {
				this.jButtoncodigoTipoProduBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoProduBancoBusqueda")) {
				this.jButtonnombreTipoProduBancoBusquedaActionPerformed(evt);
			}
			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoProduBanco();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoProduBanco")) {
				closingInternalFrameTipoProduBanco();
				
			} else if(sTipo.equals("jButtonCancelarTipoProduBanco")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoProduBanco = (JInternalFrameBase)evt.getSource();
	            	
	            TipoProduBancoBeanSwingJInternalFrame jInternalFrameParent=(TipoProduBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProduBanco.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoProduBancoActionPerformed(null);
			}
			
			TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprodubanco,new Object(),this.tipoprodubancoParameterGeneral,this.tipoprodubancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoProduBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoProduBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoProduBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoprodubanco)) {
			if(!esControlTabla) {
				if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoProduBanco(this.tipoprodubanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);			
				}
				
				if(this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoProduBanco(this.tipoprodubanco,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprodubancoReturnGeneral=tipoprodubancoLogic.procesarEventosTipoProduBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprodubancoLogic.getTipoProduBancos(),this.tipoprodubanco,this.tipoprodubancoParameterGeneral,this.isEsNuevoTipoProduBanco,classes);//this.tipoprodubancoLogic.getTipoProduBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoProduBanco(this.tipoprodubancoReturnGeneral,this.tipoprodubancoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoProduBanco(classes,this.tipoprodubancoReturnGeneral,this.tipoprodubancoBean,false);
					}
						
					if(this.tipoprodubancoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoProduBanco(this.tipoprodubancoReturnGeneral.getTipoProduBanco());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoProduBanco(this.tipoprodubancoReturnGeneral.getTipoProduBanco());	
					}
						
					if(this.tipoprodubancoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoProduBanco(this.tipoprodubancoReturnGeneral.getTipoProduBanco(),classes);//this.tipoprodubancoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoProduBanco(this.tipoprodubanco,classes);//this.tipoprodubancoBean);									
				}
			
				if(TipoProduBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoProduBanco(this.tipoprodubanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoProduBanco(this.tipoprodubanco);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoprodubancoAnterior!=null) {
						this.tipoprodubanco=this.tipoprodubancoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprodubancoReturnGeneral=tipoprodubancoLogic.procesarEventosTipoProduBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprodubancoLogic.getTipoProduBancos(),this.tipoprodubanco,this.tipoprodubancoParameterGeneral,this.isEsNuevoTipoProduBanco,classes);//this.tipoprodubancoLogic.getTipoProduBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprodubancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprodubancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoprodubancoReturnGeneral.getTipoProduBanco(),tipoprodubancoLogic.getTipoProduBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoprodubancoReturnGeneral.getTipoProduBanco(),this.tipoprodubancos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoProduBanco.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoProduBanco.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoProduBanco();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoProduBanco() throws Exception {
		
		TipoProduBancoModel tipoprodubancoModel=(TipoProduBancoModel)this.jTableDatosTipoProduBanco.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprodubancoModel.tipoprodubancos=this.tipoprodubancoLogic.getTipoProduBancos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoprodubancoModel.tipoprodubancos=this.tipoprodubancos;
		}
		
		
		((TipoProduBancoModel) this.jTableDatosTipoProduBanco.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoProduBanco() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoprodubancoAnterior(),this.tipoprodubancoLogic.getTipoProduBancos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoprodubancoAnterior(),this.tipoprodubancos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoProduBanco();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoProduBanco(TipoProduBanco tipoprodubanco,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaBancaria.class)) {
					this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.setReferenciaBancarias(tipoprodubanco.getReferenciaBancarias());
					this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaBancaria(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
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
										
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprodubanco,new Object(),generalEntityParameterGeneral,this.tipoprodubancoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoprodubancoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoProduBancoConstantesFunciones.getClassesRelationshipsOfTipoProduBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoProduBancoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoProduBanco(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoProduBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoProduBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprodubanco,new Object(),generalEntityParameterGeneral,this.tipoprodubancoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoProduBanco(TipoProduBancoBean tipoprodubancoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaBancaria.class)) {
					this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.setReferenciaBancarias(tipoprodubanco.getReferenciaBancarias());
					this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.inicializarActualizarBindingTablaReferenciaBancaria(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoProduBanco(ArrayList<Classe> classes,TipoProduBancoReturnGeneral tipoprodubancoReturnGeneral,TipoProduBancoBean tipoprodubancoBean,Boolean conDefault) throws Exception {
		
			this.tipoprodubancoBean.setReferenciaBancarias(tipoprodubancoReturnGeneral.getTipoProduBanco().getReferenciaBancarias());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoProduBanco(TipoProduBanco tipoprodubanco,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ReferenciaBancaria.class)) {
					tipoprodubanco.setReferenciaBancarias(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaBeanSwingJInternalFrame.referenciabancariaLogic.getReferenciaBancarias());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoprodubanco)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoProduBanco = new TipoProduBancoDetalleFormJInternalFrame(jDesktopPane,this.tipoprodubancoSessionBean.getConGuardarRelaciones(),this.tipoprodubancoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoProduBanco);
		this.jInternalFrameDetalleFormTipoProduBanco.setVisible(false);
		this.jInternalFrameDetalleFormTipoProduBanco.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoProduBanco.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoProduBanco.tipoprodubancoLogic=this.tipoprodubancoLogic;
		
		this.cargarCombosFrameForeignKeyTipoProduBanco("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoProduBanco();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoProduBanco();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoProduBanco("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoProduBanco();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoProduBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProduBanco"));
		
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonModificarTipoProduBanco.addActionListener(new ButtonActionListener(this,"ModificarTipoProduBanco"));

		
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonModificarToolBarTipoProduBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProduBanco"));
					
		this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemModificarTipoProduBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProduBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonActualizarTipoProduBanco.addActionListener (new ButtonActionListener(this,"ActualizarTipoProduBanco"));
		
		
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonActualizarToolBarTipoProduBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProduBanco"));
						
		this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemActualizarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProduBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonEliminarTipoProduBanco.addActionListener (new ButtonActionListener(this,"EliminarTipoProduBanco"));
		
		
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonEliminarToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProduBanco"));
								
		this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemEliminarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProduBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonCancelarTipoProduBanco.addActionListener (new ButtonActionListener(this,"CancelarTipoProduBanco"));
		
		
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonCancelarToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProduBanco"));
					
		this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemCancelarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProduBanco"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemDetalleCerrarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProduBanco"));		
		
		
		
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonGuardarCambiosToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProduBanco"));
		
		
		
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonGuardarCambiosToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProduBanco"));
		
		
		
		this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProduBanco"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonidTipoProduBancoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProduBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProduBanco.jButtoncodigoTipoProduBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProduBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonnombreTipoProduBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProduBancoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoProduBanco.jTabbedPaneRelacionesTipoProduBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProduBanco"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoProduBanco"));
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoProduBanco"));
		}
		
		this.jTableDatosTipoProduBanco.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoProduBanco"));
		
		this.jTableDatosTipoProduBanco.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoProduBanco"));
		
		this.jButtonNuevoTipoProduBanco.addActionListener(new ButtonActionListener(this,"NuevoTipoProduBanco"));
		
		this.jButtonDuplicarTipoProduBanco.addActionListener(new ButtonActionListener(this,"DuplicarTipoProduBanco"));
		
		this.jButtonCopiarTipoProduBanco.addActionListener(new ButtonActionListener(this,"CopiarTipoProduBanco"));
		
		this.jButtonVerFormTipoProduBanco.addActionListener(new ButtonActionListener(this,"VerFormTipoProduBanco"));
		
		
		this.jButtonNuevoToolBarTipoProduBanco.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoProduBanco"));
			
		this.jButtonDuplicarToolBarTipoProduBanco.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoProduBanco"));
			
		this.jMenuItemNuevoTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoProduBanco"));
			
		this.jMenuItemDuplicarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoProduBanco"));		
		
		
		this.jButtonNuevoRelacionesTipoProduBanco.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoProduBanco"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoProduBanco.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoProduBanco"));
			
		this.jMenuItemNuevoRelacionesTipoProduBanco.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoProduBanco"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonModificarTipoProduBanco.addActionListener(new ButtonActionListener(this,"ModificarTipoProduBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonModificarToolBarTipoProduBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoProduBanco"));
			
			this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemModificarTipoProduBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoProduBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonActualizarTipoProduBanco.addActionListener (new ButtonActionListener(this,"ActualizarTipoProduBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonActualizarToolBarTipoProduBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoProduBanco"));
				
			this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemActualizarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoProduBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonEliminarTipoProduBanco.addActionListener (new ButtonActionListener(this,"EliminarTipoProduBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonEliminarToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoProduBanco"));
						
			this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemEliminarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoProduBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonCancelarTipoProduBanco.addActionListener (new ButtonActionListener(this,"CancelarTipoProduBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonCancelarToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoProduBanco"));
			
			this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemCancelarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoProduBanco"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoProduBanco"));		
		
		
		this.jButtonCerrarTipoProduBanco.addActionListener (new ButtonActionListener(this,"CerrarTipoProduBanco"));
		
		
		this.jButtonCerrarToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoProduBanco"));
			
		this.jMenuItemCerrarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoProduBanco"));
			
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.jMenuItemDetalleCerrarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoProduBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonGuardarCambiosTipoProduBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoProduBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.jButtonGuardarCambiosToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoProduBanco"));
		}
		
		this.jButtonCopiarToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoProduBanco"));
			
		this.jButtonVerFormToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoProduBanco"));
		
		this.jMenuItemGuardarCambiosTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoProduBanco"));
			
		this.jMenuItemCopiarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoProduBanco"));		
		
		this.jMenuItemVerFormTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoProduBanco"));		
		
		
		this.jButtonGuardarCambiosTablaTipoProduBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProduBanco"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoProduBanco"));
			
		this.jMenuItemGuardarCambiosTablaTipoProduBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoProduBanco"));		
		
		
		
		this.jButtonRecargarInformacionTipoProduBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoProduBanco"));
					
		this.jButtonRecargarInformacionToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoProduBanco"));
		
		this.jMenuItemRecargarInformacionTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoProduBanco"));		
		
		
		
		this.jButtonAnterioresTipoProduBanco.addActionListener (new ButtonActionListener(this,"AnterioresTipoProduBanco"));
		
		
		this.jButtonAnterioresToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoProduBanco"));
		
		this.jMenuItemAnterioresTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoProduBanco"));		
		
		
		this.jButtonSiguientesTipoProduBanco.addActionListener (new ButtonActionListener(this,"SiguientesTipoProduBanco"));
		
		
		this.jButtonSiguientesToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoProduBanco"));
			
		this.jMenuItemSiguientesTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoProduBanco"));
			
		this.jMenuItemAbrirOrderByTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoProduBanco"));
			
		this.jMenuItemMostrarOcultarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoProduBanco"));
			
		this.jMenuItemDetalleAbrirOrderByTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoProduBanco"));
			
		this.jMenuItemDetalleMostarOcultarTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoProduBanco"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoProduBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoProduBanco"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoProduBanco"));
			
		this.jMenuItemNuevoGuardarCambiosTipoProduBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoProduBanco"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoProduBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoProduBanco"));

		this.jCheckBoxSeleccionadosTipoProduBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoProduBanco"));
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoProduBanco"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoProduBanco.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoProduBanco"));
			
		this.jComboBoxTiposAccionesTipoProduBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoProduBanco"));
					
		this.jComboBoxTiposSeleccionarTipoProduBanco.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoProduBanco"));
			
		this.jTextFieldValorCampoGeneralTipoProduBanco.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoProduBanco"));		
		
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonidTipoProduBancoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProduBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProduBanco.jButtoncodigoTipoProduBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProduBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonnombreTipoProduBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProduBancoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoProduBanco!=null) {
				this.jInternalFrameReporteDinamicoTipoProduBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProduBanco"));
				this.jInternalFrameReporteDinamicoTipoProduBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProduBanco"));
				this.jInternalFrameReporteDinamicoTipoProduBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProduBanco"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoProduBanco.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoProduBanco"));				
			//this.jButtonGenerarReporteDinamicoTipoProduBanco.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoProduBanco"));
			//this.jButtonGenerarExcelReporteDinamicoTipoProduBanco.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoProduBanco"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoProduBanco!=null) {
				this.jInternalFrameImportacionTipoProduBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoProduBanco"));
				this.jInternalFrameImportacionTipoProduBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoProduBanco"));
				this.jInternalFrameImportacionTipoProduBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoProduBanco"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoProduBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoProduBanco"));
			
			this.jButtonAbrirOrderByToolBarTipoProduBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoProduBanco"));			
			
			if(this.jInternalFrameOrderByTipoProduBanco!=null) {
				this.jInternalFrameOrderByTipoProduBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoProduBanco"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoProduBanco.jTabbedPaneRelacionesTipoProduBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoProduBanco"));
		
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
            		closingInternalFrameTipoProduBanco();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoProduBanco.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoProduBanco = (JInternalFrameBase)event.getSource();
	            	
	            TipoProduBancoBeanSwingJInternalFrame jInternalFrameParent=(TipoProduBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoProduBanco.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoProduBancoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoProduBanco.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoProduBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoProduBanco.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoProduBanco.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProduBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProduBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProduBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoProduBanco";
		inputMap = this.jButtonNuevoTipoProduBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoProduBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProduBancoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProduBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProduBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoProduBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoProduBanco";
		inputMap = this.jButtonNuevoRelacionesTipoProduBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoProduBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoProduBancoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoProduBanco";
		inputMap = this.jButtonModificarTipoProduBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoProduBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoProduBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoProduBanco";
		inputMap = this.jButtonActualizarTipoProduBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoProduBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoProduBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoProduBanco";
		inputMap = this.jButtonEliminarTipoProduBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoProduBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoProduBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoProduBanco";
		inputMap = this.jButtonCancelarTipoProduBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoProduBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoProduBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoProduBanco";
		inputMap = this.jButtonCerrarTipoProduBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoProduBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoProduBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonGuardarCambiosTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoProduBanco";
		inputMap = this.jInternalFrameDetalleFormTipoProduBanco.jButtonGuardarCambiosTipoProduBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonGuardarCambiosTipoProduBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoProduBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoProduBanco.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoProduBancoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoProduBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoProduBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoProduBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoProduBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoProduBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoProduBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonidTipoProduBancoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoProduBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProduBanco.jButtoncodigoTipoProduBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoProduBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoProduBanco.jButtonnombreTipoProduBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoProduBancoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoProduBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoProduBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoProduBancoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoProduBanco.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoProduBanco(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancoLogic.getTipoProduBancos()) {
					tipoprodubancoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProduBanco tipoprodubancoAux:tipoprodubancos) {
					tipoprodubancoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoProduBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProduBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancoLogic.getTipoProduBancos()) {
						tipoprodubancoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProduBanco tipoprodubancoAux:tipoprodubancos) {
						tipoprodubancoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancoLogic.getTipoProduBancos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProduBanco tipoprodubancoAux:tipoprodubancos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProduBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProduBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProduBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProduBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoProduBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoProduBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoProduBanco.getSelectedRows();
			
			TipoProduBanco tipoprodubancoLocal=new TipoProduBanco();
			
			//this.seleccionarTodosTipoProduBanco(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprodubancoLocal =(TipoProduBanco) this.tipoprodubancoLogic.getTipoProduBancos().toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoprodubancoLocal =(TipoProduBanco) this.tipoprodubancos.toArray()[this.jTableDatosTipoProduBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoprodubancoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancoLogic.getTipoProduBancos()) {
						tipoprodubancoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoProduBanco tipoprodubancoAux:tipoprodubancos) {
						tipoprodubancoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoProduBanco(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoProduBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoProduBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoProduBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoProduBancoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoProduBancoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoProduBancoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoProduBanco(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoProduBanco.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancoLogic.getTipoProduBancos()) {
				
						if(sTipoSeleccionar.equals(TipoProduBancoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoprodubancoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProduBancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprodubancoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProduBanco tipoprodubancoAux:tipoprodubancos) {
					
						if(sTipoSeleccionar.equals(TipoProduBancoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoprodubancoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoProduBancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprodubancoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoProduBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoProduBancoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoProduBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoProduBanco=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoProduBanco.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoProduBanco) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoProduBanco(conSplash);
				
					this.generarReporteTipoProduBancosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProduBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoProduBancosSeleccionados();
				//this.jComboBoxTiposAccionesTipoProduBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProduBancosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoProduBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoProduBancosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoProduBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProduBanco();
				
				this.exportarTipoProduBancosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProduBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoProduBancos();
				//this.importarTipoProduBancos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProduBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoProduBanco();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoProduBancosSeleccionados();
				//this.jComboBoxTiposAccionesTipoProduBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Produ Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoProduBanco();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoProduBanco)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoProduBanco(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Produ Banco",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoProduBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoProduBancoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoProduBanco) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoProduBanco(conSplash);
					
						//this.actualizarParametrosGeneralTipoProduBanco();
						
						this.generarReporteProcesoAccionTipoProduBancosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoProduBanco.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoProduBancoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Produ BancoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Produ Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoProduBanco();
				
						this.actualizarParametrosGeneralTipoProduBanco();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoprodubancoReturnGeneral=tipoprodubancoLogic.procesarAccionTipoProduBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoprodubancoLogic.getTipoProduBancos(),this.tipoprodubancoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoProduBancoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoProduBanco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoProduBanco();
					
					TipoProduBancoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoProduBancoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoProduBanco.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoProduBanco.jComboBoxTiposAccionesFormularioTipoProduBanco.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoProduBanco(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoProduBancoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoProduBanco();
			
			if(this.jInternalFrameDetalleFormTipoProduBanco==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();		
			TipoProduBanco tipoprodubanco=new TipoProduBanco();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoProduBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoProduBanco.getSelectedItem();
			
			
			
			
			tipoprodubancosSeleccionados=this.getTipoProduBancosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoprodubancosSeleccionados.size()==1) {
				for(TipoProduBanco tipoprodubancoAux:tipoprodubancosSeleccionados) {
					tipoprodubanco=tipoprodubancoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Referencia Bancaria")) {
					jButtonReferenciaBancariaActionPerformed(null,rowIndex,true,false,tipoprodubanco);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoProduBanco();
			
      		//this.finishProcessTipoProduBanco(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoProduBancoReturnGeneral() throws Exception {
		if(this.tipoprodubancoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoprodubancoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoprodubancoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoprodubancoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoprodubancoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoprodubancoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoProduBanco(false);
		}
		
		if(this.tipoprodubancoReturnGeneral.getConRetornoLista() || this.tipoprodubancoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoprodubancoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprodubancoLogic.setTipoProduBancos(this.tipoprodubancoReturnGeneral.getTipoProduBancos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoprodubancoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprodubancoLogic.setTipoProduBanco(this.tipoprodubancoReturnGeneral.getTipoProduBanco());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoProduBanco(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoProduBanco() throws Exception {
		
		
	}
	
	public ArrayList<TipoProduBanco> getTipoProduBancosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoProduBanco) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoProduBanco tipoprodubancoAux:tipoprodubancoLogic.getTipoProduBancos()) {
					if(tipoprodubancoAux.getIsSelected()) {
						tipoprodubancosSeleccionados.add(tipoprodubancoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoProduBanco tipoprodubancoAux:this.tipoprodubancos) {
					if(tipoprodubancoAux.getIsSelected()) {
						tipoprodubancosSeleccionados.add(tipoprodubancoAux);				
					}
				}
			}
			
			if(tipoprodubancosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoprodubancosSeleccionados.addAll(this.tipoprodubancoLogic.getTipoProduBancos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoprodubancosSeleccionados.addAll(this.tipoprodubancos);				
					}
				}
			}
		} else {
			tipoprodubancosSeleccionados.add(this.tipoprodubanco);
		}
		
		return tipoprodubancosSeleccionados;
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
	
	public void generarReporteTipoProduBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoProduBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoProduBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProduBancosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoProduBancosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoProduBancosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Produ Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoProduBancosSeleccionados() throws Exception {
		ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();		
		
		tipoprodubancosSeleccionados=this.getTipoProduBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoProduBancos("Todos",tipoprodubancosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoProduBancosSeleccionados() throws Exception {
		ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();		
		
		tipoprodubancosSeleccionados=this.getTipoProduBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoProduBancos("Todos",tipoprodubancosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoProduBancosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();
		
		tipoprodubancosSeleccionados=this.getTipoProduBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoProduBancos("Todos",tipoprodubancosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoProduBancosSeleccionados() throws Exception {
		ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoProduBanco();
		
		
		tipoprodubancosSeleccionados=this.getTipoProduBancosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoProduBanco();
		
		
		//this.generarReporteTipoProduBancos("Todos",tipoprodubancosSeleccionados ,tipoprodubancoImplementable,tipoprodubancoImplementableHome);
	}
	
	public void mostrarImportacionTipoProduBancos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoProduBanco();
		
		this.abrirFrameImportacionTipoProduBanco();		
		
			
		//this.generarReporteTipoProduBancos("Todos",tipoprodubancosSeleccionados ,tipoprodubancoImplementable,tipoprodubancoImplementableHome);
	}
	
	public void importarTipoProduBancos() throws Exception {		
	
	}
	
	public void exportarTipoProduBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoProduBancosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoProduBancosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoProduBancosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Produ Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoProduBancosSeleccionados() throws Exception {
		ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();		
		
		tipoprodubancosSeleccionados=this.getTipoProduBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprodubanco."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoProduBanco(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoProduBanco tipoprodubancoAux:tipoprodubancosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoProduBanco(tipoprodubancoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoprodubancoAux.setsDetalleGeneralEntityReporte(tipoprodubancoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Produ Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoProduBanco(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoProduBancoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProduBancoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProduBancoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoProduBancoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoProduBanco(TipoProduBanco tipoprodubanco,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoprodubanco.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprodubanco.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprodubanco.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprodubanco.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoProduBancosSeleccionados() throws Exception {
		ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();		
		
		tipoprodubancosSeleccionados=this.getTipoProduBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprodubanco.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoProduBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoProduBanco(row);				
				iRow++;
			}				
			
			for(TipoProduBanco tipoprodubancoAux:tipoprodubancosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoProduBanco(tipoprodubancoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Produ Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoProduBancosSeleccionados() throws Exception {
		ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();		
		
		tipoprodubancosSeleccionados=this.getTipoProduBancosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprodubanco.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoprodubancos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoprodubanco");
			//elementRoot.appendChild(element);
		
			for(TipoProduBanco tipoprodubancoAux:tipoprodubancosSeleccionados) {
				element = document.createElement("tipoprodubanco");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoProduBanco(tipoprodubancoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Produ Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoProduBanco(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProduBancoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProduBancoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoProduBancoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoProduBancoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoProduBanco(TipoProduBanco tipoprodubanco,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprodubanco.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprodubanco.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprodubanco.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoProduBanco(TipoProduBanco tipoprodubanco,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoProduBancoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoprodubanco.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoProduBancoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoprodubanco.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoProduBancoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoprodubanco.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoProduBancoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoprodubanco.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoProduBancosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoProduBanco> tipoprodubancosSeleccionados=new ArrayList<TipoProduBanco>();
		
		tipoprodubancosSeleccionados=this.getTipoProduBancosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoProduBanco(tipoprodubancosSeleccionados);
		
		this.generarReporteTipoProduBancos("Todos",tipoprodubancosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoProduBanco(ArrayList<TipoProduBanco> tipoprodubancosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoProduBanco tipoprodubancoAux:tipoprodubancosSeleccionados) {
				tipoprodubancoAux.setsDetalleGeneralEntityReporte(tipoprodubancoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoProduBancoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoprodubancoAux.setsDescripcionGeneralEntityReporte1(tipoprodubancoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoProduBancoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoprodubancoAux.setsDescripcionGeneralEntityReporte1(tipoprodubancoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoProduBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoProduBanco(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoProduBanco=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=true;
				this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=true;
			}
			
			this.isVisibilidadCeldaModificarTipoProduBanco=false;
			this.isVisibilidadCeldaActualizarTipoProduBanco=false;
			this.isVisibilidadCeldaEliminarTipoProduBanco=false;
			this.isVisibilidadCeldaCancelarTipoProduBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProduBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProduBanco=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoProduBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=false;
			this.isVisibilidadCeldaModificarTipoProduBanco=false;
			this.isVisibilidadCeldaActualizarTipoProduBanco=true;
			this.isVisibilidadCeldaEliminarTipoProduBanco=false;
			this.isVisibilidadCeldaCancelarTipoProduBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProduBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProduBanco=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoProduBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=false;
			this.isVisibilidadCeldaModificarTipoProduBanco=false;
			this.isVisibilidadCeldaActualizarTipoProduBanco=true;
			this.isVisibilidadCeldaEliminarTipoProduBanco=true;
			this.isVisibilidadCeldaCancelarTipoProduBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProduBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProduBanco=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoProduBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=false;
			this.isVisibilidadCeldaModificarTipoProduBanco=false;
			this.isVisibilidadCeldaActualizarTipoProduBanco=true;
			this.isVisibilidadCeldaEliminarTipoProduBanco=false;
			this.isVisibilidadCeldaCancelarTipoProduBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProduBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProduBanco=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoProduBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=true;
			this.isVisibilidadCeldaModificarTipoProduBanco=false;
			this.isVisibilidadCeldaActualizarTipoProduBanco=false;
			this.isVisibilidadCeldaEliminarTipoProduBanco=false;
			this.isVisibilidadCeldaCancelarTipoProduBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProduBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoProduBanco=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoProduBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=false;
			this.isVisibilidadCeldaActualizarTipoProduBanco=false;
			this.isVisibilidadCeldaEliminarTipoProduBanco=false;
			this.isVisibilidadCeldaCancelarTipoProduBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProduBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProduBanco=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoProduBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=false;
			this.isVisibilidadCeldaModificarTipoProduBanco=true;
			this.isVisibilidadCeldaActualizarTipoProduBanco=false;
			this.isVisibilidadCeldaEliminarTipoProduBanco=false;
			this.isVisibilidadCeldaCancelarTipoProduBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoProduBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoProduBanco=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoProduBancoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoProduBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=true;
			this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=true;
		} else {
			this.actualizarEstadoPanelsTipoProduBanco(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoProduBanco=false;
			//this.isVisibilidadCeldaVerFormTipoProduBanco=false;
			this.isVisibilidadCeldaDuplicarTipoProduBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoprodubancoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoProduBanco=false;
			this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoprodubancoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=false;												
			}
			
			this.jButtonCerrarTipoProduBanco.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoProduBanco=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoprodubanco)) {
			this.isVisibilidadCeldaActualizarTipoProduBanco=false;
			this.isVisibilidadCeldaEliminarTipoProduBanco=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoProduBanco() {
		this.isVisibilidadCeldaNuevoTipoProduBanco=false;
		this.isVisibilidadCeldaGuardarCambiosTipoProduBanco=false;
	}
	
	public void actualizarEstadoPanelsTipoProduBanco(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoProduBanco!=null) {
				this.jScrollPanelDatosEdicionTipoProduBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProduBanco!=null) {
				this.jScrollPanelDatosTipoProduBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProduBanco!=null) {
				this.jPanelPaginacionTipoProduBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProduBanco!=null) {
				this.jPanelParametrosReportesTipoProduBanco.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoProduBanco!=null) {
				this.jScrollPanelDatosEdicionTipoProduBanco.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoProduBanco!=null) {
				this.jScrollPanelDatosTipoProduBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProduBanco!=null) {
				this.jPanelPaginacionTipoProduBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProduBanco!=null) {
				this.jPanelParametrosReportesTipoProduBanco.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoProduBanco!=null) {
				this.jScrollPanelDatosEdicionTipoProduBanco.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoProduBanco!=null) {
				this.jScrollPanelDatosTipoProduBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProduBanco!=null) {
				this.jPanelPaginacionTipoProduBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProduBanco!=null) {
				this.jPanelParametrosReportesTipoProduBanco.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoProduBanco!=null) {
				this.jScrollPanelDatosEdicionTipoProduBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoProduBanco!=null) {
				this.jScrollPanelDatosTipoProduBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoProduBanco!=null) {
				this.jPanelPaginacionTipoProduBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoProduBanco!=null) {
				this.jPanelParametrosReportesTipoProduBanco.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoProduBanco!=null) {
				this.jScrollPanelDatosEdicionTipoProduBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoProduBanco!=null) {
				this.jScrollPanelDatosTipoProduBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProduBanco!=null) {
				this.jPanelPaginacionTipoProduBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProduBanco!=null) {
				this.jPanelParametrosReportesTipoProduBanco.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoProduBanco!=null) {
				this.jScrollPanelDatosEdicionTipoProduBanco.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoProduBanco!=null) {
				this.jScrollPanelDatosTipoProduBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProduBanco!=null) {
				this.jPanelPaginacionTipoProduBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProduBanco!=null) {
				this.jPanelParametrosReportesTipoProduBanco.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoProduBanco!=null) {
				this.jScrollPanelDatosEdicionTipoProduBanco.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoProduBanco!=null) {
				this.jScrollPanelDatosTipoProduBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoProduBanco!=null) {
				this.jPanelPaginacionTipoProduBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoProduBanco!=null) {
				this.jPanelParametrosReportesTipoProduBanco.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoprodubancoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoProduBancoParaReferenciaBancarias() throws Exception {
		Boolean isPaginaPopupReferenciaBancaria=false;

		try {

			if(this.tipoprodubancoSessionBean==null) {
				this.tipoprodubancoSessionBean=new TipoProduBancoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaSessionBean=new ReferenciaBancariaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaSessionBean.setsPathNavegacionActual(tipoprodubancoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ReferenciaBancariaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupReferenciaBancaria=this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeReferenciaBancaria(false);
			this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeReferenciaBancaria(TipoProduBancoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaSessionBean.setisBusquedaDesdeForeignKeySesionTipoProduBanco(true);
			this.jInternalFrameDetalleFormTipoProduBanco.referenciabancariaSessionBean.setlidTipoProduBancoActual(this.idTipoProduBancoActual);

			tipoprodubancoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoProduBanco(true);
			tipoprodubancoSessionBean.setlIdTipoProduBancoActualForeignKey(this.idTipoProduBancoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoProduBancoSessionBean tipoprodubancoSessionBean=new TipoProduBancoSessionBean();
		
		if(this.tipoprodubancoSessionBean==null) {
			this.tipoprodubancoSessionBean=new TipoProduBancoSessionBean();
		}
		
		this.tipoprodubancoSessionBean.setsUltimaBusquedaTipoProduBanco(this.getsAccionBusqueda());
		this.tipoprodubancoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoprodubancoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoProduBancoSessionBean tipoprodubancoSessionBean=new TipoProduBancoSessionBean();
		
		if(this.tipoprodubancoSessionBean==null) {
			this.tipoprodubancoSessionBean=new TipoProduBancoSessionBean();
		}
		
		if(this.tipoprodubancoSessionBean.getsUltimaBusquedaTipoProduBanco()!=null&&!this.tipoprodubancoSessionBean.getsUltimaBusquedaTipoProduBanco().equals("")) {
			this.setsAccionBusqueda(tipoprodubancoSessionBean.getsUltimaBusquedaTipoProduBanco());
			this.setiNumeroPaginacion(tipoprodubancoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoprodubancoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoprodubancoSessionBean.setsUltimaBusquedaTipoProduBanco("");
		this.tipoprodubancoSessionBean.setiNumeroPaginacion(TipoProduBancoConstantesFunciones.INUMEROPAGINACION);
		this.tipoprodubancoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoProduBanco(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoProduBanco() {
		this.updateBorderResaltarBusquedasFormularioTipoProduBanco();
		this.updateVisibilidadBusquedasFormularioTipoProduBanco();
		this.updateHabilitarBusquedasFormularioTipoProduBanco();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoProduBanco() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoProduBanco() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoProduBanco() {
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
	
	public void updateControlesFormularioTipoProduBanco() throws Exception {

		if(this.jInternalFrameDetalleFormTipoProduBanco==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoProduBanco();
		this.updateVisibilidadResaltarControlesFormularioTipoProduBanco();
		this.updateHabilitarResaltarControlesFormularioTipoProduBanco();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoProduBanco() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProduBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoprodubancoConstantesFunciones.resaltaridTipoProduBanco!=null && this.jInternalFrameDetalleFormTipoProduBanco!=null) {this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldidTipoProduBanco.setBorder(this.tipoprodubancoConstantesFunciones.resaltaridTipoProduBanco);}
		if(this.tipoprodubancoConstantesFunciones.resaltarcodigoTipoProduBanco!=null && this.jInternalFrameDetalleFormTipoProduBanco!=null) {this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldcodigoTipoProduBanco.setBorder(this.tipoprodubancoConstantesFunciones.resaltarcodigoTipoProduBanco);}
		if(this.tipoprodubancoConstantesFunciones.resaltarnombreTipoProduBanco!=null && this.jInternalFrameDetalleFormTipoProduBanco!=null) {this.jInternalFrameDetalleFormTipoProduBanco.jTextAreanombreTipoProduBanco.setBorder(this.tipoprodubancoConstantesFunciones.resaltarnombreTipoProduBanco);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoProduBanco() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoProduBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
	
		//this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldidTipoProduBanco.setVisible(this.tipoprodubancoConstantesFunciones.mostraridTipoProduBanco);
		this.jInternalFrameDetalleFormTipoProduBanco.jPanelidTipoProduBanco.setVisible(this.tipoprodubancoConstantesFunciones.mostraridTipoProduBanco);
		//this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldcodigoTipoProduBanco.setVisible(this.tipoprodubancoConstantesFunciones.mostrarcodigoTipoProduBanco);
		this.jInternalFrameDetalleFormTipoProduBanco.jPanelcodigoTipoProduBanco.setVisible(this.tipoprodubancoConstantesFunciones.mostrarcodigoTipoProduBanco);
		//this.jInternalFrameDetalleFormTipoProduBanco.jTextAreanombreTipoProduBanco.setVisible(this.tipoprodubancoConstantesFunciones.mostrarnombreTipoProduBanco);
		this.jInternalFrameDetalleFormTipoProduBanco.jPanelnombreTipoProduBanco.setVisible(this.tipoprodubancoConstantesFunciones.mostrarnombreTipoProduBanco);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoProduBanco() throws Exception {
		if(this.jInternalFrameDetalleFormTipoProduBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoProduBanco!=null) {
	
		this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldidTipoProduBanco.setEnabled(this.tipoprodubancoConstantesFunciones.activaridTipoProduBanco);
		this.jInternalFrameDetalleFormTipoProduBanco.jTextFieldcodigoTipoProduBanco.setEnabled(this.tipoprodubancoConstantesFunciones.activarcodigoTipoProduBanco);
		this.jInternalFrameDetalleFormTipoProduBanco.jTextAreanombreTipoProduBanco.setEnabled(this.tipoprodubancoConstantesFunciones.activarnombreTipoProduBanco);
		}
	}
	
		
}