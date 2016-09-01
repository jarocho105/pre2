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

import com.bydan.erp.cartera.util.TipoTelefoConstantesFunciones;
import com.bydan.erp.cartera.util.TipoTelefoParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoTelefoParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoTelefoBean;
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
public class TipoTelefoBeanSwingJInternalFrame extends TipoTelefoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoTelefoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoTelefo> tipotelefoValidator = new ClassValidator<TipoTelefo>(TipoTelefo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoTelefo tipotelefo;	
	public TipoTelefo tipotelefoAux;
	public TipoTelefo tipotelefoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoTelefo tipotelefoTotales;
	public Long idTipoTelefoActual;
	public Long iIdNuevoTipoTelefo=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosTelefono=false;

	public Boolean getIsTienePermisosTelefono() {
		return isTienePermisosTelefono;
	}

	public void setIsTienePermisosTelefono(Boolean isTienePermisosTelefono) {
		this.isTienePermisosTelefono= isTienePermisosTelefono;
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
	
	public Boolean isPermisoTodoTipoTelefo;
	public Boolean isPermisoNuevoTipoTelefo;
	public Boolean isPermisoActualizarTipoTelefo;
	public Boolean isPermisoActualizarOriginalTipoTelefo;
	public Boolean isPermisoEliminarTipoTelefo;
	public Boolean isPermisoGuardarCambiosTipoTelefo;
	public Boolean isPermisoConsultaTipoTelefo;
	public Boolean isPermisoBusquedaTipoTelefo;
	public Boolean isPermisoReporteTipoTelefo;
	public Boolean isPermisoPaginacionMedioTipoTelefo;
	public Boolean isPermisoPaginacionAltoTipoTelefo;
	public Boolean isPermisoPaginacionTodoTipoTelefo;
	public Boolean isPermisoCopiarTipoTelefo;
	public Boolean isPermisoVerFormTipoTelefo;
	public Boolean isPermisoDuplicarTipoTelefo;
	public Boolean isPermisoOrdenTipoTelefo;
	
	
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
	
	public TipoTelefoParameterReturnGeneral tipotelefoReturnGeneral;
	public TipoTelefoParameterReturnGeneral tipotelefoParameterGeneral;
	
	

	public TelefonoLogic telefonoLogic=null;

	public TelefonoLogic getTelefonoLogic() {
		return telefonoLogic;
	}

	public void setTelefonoLogic(TelefonoLogic telefonoLogic) {
		this.telefonoLogic = telefonoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoTelefo=false;
	public Boolean esParaAccionDesdeFormularioTipoTelefo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoTelefoSessionBeanAdditional tipotelefoSessionBeanAdditional=null;
	
	public TipoTelefoSessionBeanAdditional getTipoTelefoSessionBeanAdditional() {
		return this.tipotelefoSessionBeanAdditional;
	}
	
	public void setTipoTelefoSessionBeanAdditional(TipoTelefoSessionBeanAdditional tipotelefoSessionBeanAdditional) {
		try {
			this.tipotelefoSessionBeanAdditional=tipotelefoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoTelefoBeanSwingJInternalFrameAdditional tipotelefoBeanSwingJInternalFrameAdditional=null;
	//public class TipoTelefoBeanSwingJInternalFrame
	
	public TipoTelefoBeanSwingJInternalFrameAdditional getTipoTelefoBeanSwingJInternalFrameAdditional() {
		return this.tipotelefoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoTelefoBeanSwingJInternalFrameAdditional(TipoTelefoBeanSwingJInternalFrameAdditional tipotelefoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipotelefoBeanSwingJInternalFrameAdditional=tipotelefoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoTelefoLogic tipotelefoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoTelefo tipotelefoBean;
	public TipoTelefoConstantesFunciones tipotelefoConstantesFunciones;
	//public TipoTelefoParameterReturnGeneral tipotelefoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoTelefo> tipotelefos;	
	//public List<TipoTelefo> tipotelefosEliminados;
	//public List<TipoTelefo> tipotelefosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoTelefo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoTelefo=true;
	public Boolean isVisibilidadCeldaCopiarTipoTelefo=true;
	public Boolean isVisibilidadCeldaVerFormTipoTelefo=true;
	public Boolean isVisibilidadCeldaOrdenTipoTelefo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoTelefo=false;
	public Boolean isVisibilidadCeldaModificarTipoTelefo=false;
	public Boolean isVisibilidadCeldaActualizarTipoTelefo=false;
	public Boolean isVisibilidadCeldaEliminarTipoTelefo=false;
	public Boolean isVisibilidadCeldaCancelarTipoTelefo=false;
	public Boolean isVisibilidadCeldaGuardarTipoTelefo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoTelefo=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoTelefo() {
		return this.iIdNuevoTipoTelefo;
	}

	public void setiIdNuevoTipoTelefo(Long iIdNuevoTipoTelefo) {
		this.iIdNuevoTipoTelefo = iIdNuevoTipoTelefo;
	}
	
	public Long getidTipoTelefoActual() {
		return this.idTipoTelefoActual;
	}

	public void setidTipoTelefoActual(Long idTipoTelefoActual) {
		this.idTipoTelefoActual = idTipoTelefoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoTelefo gettipotelefo() {
		return this.tipotelefo;
	}

	public void settipotelefo(TipoTelefo tipotelefo) {
		this.tipotelefo = tipotelefo;
	}
	
	public TipoTelefo gettipotelefoAux() {
		return this.tipotelefoAux;
	}

	public void settipotelefoAux(TipoTelefo tipotelefoAux) {
		this.tipotelefoAux = tipotelefoAux;
	}				
	
	public TipoTelefo gettipotelefoAnterior() {
		return this.tipotelefoAnterior;
	}

	public void settipotelefoAnterior(TipoTelefo tipotelefoAnterior) {
		this.tipotelefoAnterior = tipotelefoAnterior;
	}	
	
	public TipoTelefo gettipotelefoTotales() {
		return this.tipotelefoTotales;
	}

	public void settipotelefoTotales(TipoTelefo tipotelefoTotales) {
		this.tipotelefoTotales = tipotelefoTotales;
	}	
	
	public TipoTelefo gettipotelefoBean() {
		return this.tipotelefoBean;
	}

	public void settipotelefoBean(TipoTelefo tipotelefoBean) {
		this.tipotelefoBean = tipotelefoBean;
	}	
	
	public TipoTelefoParameterReturnGeneral gettipotelefoReturnGeneral() {
		return this.tipotelefoReturnGeneral;
	}

	public void settipotelefoReturnGeneral(TipoTelefoParameterReturnGeneral tipotelefoReturnGeneral) {
		this.tipotelefoReturnGeneral = tipotelefoReturnGeneral;
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
	
	
	public TipoTelefoLogic getTipoTelefoLogic()	{		
		return tipotelefoLogic;
	}

	public void setTipoTelefoLogic(TipoTelefoLogic tipotelefoLogic) {
		this.tipotelefoLogic = tipotelefoLogic;
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
	
	public Boolean getIsEsNuevoTipoTelefo() {
		return isEsNuevoTipoTelefo;
	}

	public void setIsEsNuevoTipoTelefo(Boolean isEsNuevoTipoTelefo) {
		this.isEsNuevoTipoTelefo = isEsNuevoTipoTelefo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoTelefo() {
		return esParaAccionDesdeFormularioTipoTelefo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoTelefo(Boolean esParaAccionDesdeFormularioTipoTelefo) {
		this.esParaAccionDesdeFormularioTipoTelefo = esParaAccionDesdeFormularioTipoTelefo;
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

			if(this.tipotelefoSessionBean==null) {
				this.tipotelefoSessionBean=new TipoTelefoSessionBean();
			}

			if(!this.tipotelefoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipotelefoSessionBean.getlidEmpresaActual());
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

					if(this.tipotelefo!=null) {
						this.tipotelefo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
						this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoTelefo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
						if(this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoTelefoGenerico)throws Exception
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
				jComboBoxid_empresaTipoTelefoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoTelefoGenerico!=null && jComboBoxid_empresaTipoTelefoGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoTelefoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoTelefo tipotelefo,JComboBox jComboBoxid_empresaTipoTelefoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoTelefoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoTelefoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipotelefo.setid_empresa(empresaAux.getId());
				tipotelefo.setempresa_descripcion(TipoTelefoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipotelefo.setEmpresa(empresaAux);			}
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

					if(!TipoTelefoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoTelefo!=null) { 
							this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoTelefo!=null) { 
					}

					if(!TipoTelefoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
							this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
							this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoTelefo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoTelefoConstantesFunciones.refrescarForeignKeysDescripcionesTipoTelefo(this.tipotelefoLogic.getTipoTelefos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoTelefoConstantesFunciones.refrescarForeignKeysDescripcionesTipoTelefo(this.tipotelefos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipotelefoLogic.setTipoTelefos(this.tipotelefos);
			tipotelefoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoTelefoParameterReturnGeneral getTipoTelefoParameterGeneral() {
		return this.tipotelefoParameterGeneral;
	}
	
	public void setTipoTelefoParameterGeneral(TipoTelefoParameterReturnGeneral tipotelefoParameterGeneral) {
		this.tipotelefoParameterGeneral = tipotelefoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoTelefo() {
		return isPermisoTodoTipoTelefo;
	}

	public void setIsPermisoTodoTipoTelefo(Boolean isPermisoTodoTipoTelefo) {
		this.isPermisoTodoTipoTelefo = isPermisoTodoTipoTelefo;
	}

	public Boolean getIsPermisoNuevoTipoTelefo() {
		return isPermisoNuevoTipoTelefo;
	}

	public void setIsPermisoNuevoTipoTelefo(Boolean isPermisoNuevoTipoTelefo) {
		this.isPermisoNuevoTipoTelefo = isPermisoNuevoTipoTelefo;
	}

	public Boolean getIsPermisoActualizarTipoTelefo() {
		return isPermisoActualizarTipoTelefo;
	}

	public void setIsPermisoActualizarTipoTelefo(Boolean isPermisoActualizarTipoTelefo) {
		this.isPermisoActualizarTipoTelefo = isPermisoActualizarTipoTelefo;
	}

	public Boolean getIsPermisoEliminarTipoTelefo() {
		return isPermisoEliminarTipoTelefo;
	}

	public void setIsPermisoEliminarTipoTelefo(Boolean isPermisoEliminarTipoTelefo) {
		this.isPermisoEliminarTipoTelefo = isPermisoEliminarTipoTelefo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoTelefo() {
		return isPermisoGuardarCambiosTipoTelefo;
	}

	public void setIsPermisoGuardarCambiosTipoTelefo(Boolean isPermisoGuardarCambiosTipoTelefo) {
		this.isPermisoGuardarCambiosTipoTelefo = isPermisoGuardarCambiosTipoTelefo;
	}
	
	public Boolean getIsPermisoConsultaTipoTelefo() {
		return isPermisoConsultaTipoTelefo;
	}

	public void setIsPermisoConsultaTipoTelefo(Boolean isPermisoConsultaTipoTelefo) {
		this.isPermisoConsultaTipoTelefo = isPermisoConsultaTipoTelefo;
	}

	public Boolean getIsPermisoBusquedaTipoTelefo() {
		return isPermisoBusquedaTipoTelefo;
	}

	public void setIsPermisoBusquedaTipoTelefo(Boolean isPermisoBusquedaTipoTelefo) {
		this.isPermisoBusquedaTipoTelefo = isPermisoBusquedaTipoTelefo;
	}

	public Boolean getIsPermisoReporteTipoTelefo() {
		return isPermisoReporteTipoTelefo;
	}

	public void setIsPermisoReporteTipoTelefo(Boolean isPermisoReporteTipoTelefo) {
		this.isPermisoReporteTipoTelefo = isPermisoReporteTipoTelefo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoTelefo() {
		return isPermisoPaginacionMedioTipoTelefo;
	}

	public void setIsPermisoPaginacionMedioTipoTelefo(Boolean isPermisoPaginacionMedioTipoTelefo) {
		this.isPermisoPaginacionMedioTipoTelefo = isPermisoPaginacionMedioTipoTelefo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoTelefo() {
		return isPermisoPaginacionTodoTipoTelefo;
	}

	public void setIsPermisoPaginacionTodoTipoTelefo(Boolean isPermisoPaginacionTodoTipoTelefo) {
		this.isPermisoPaginacionTodoTipoTelefo = isPermisoPaginacionTodoTipoTelefo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoTelefo() {
		return isPermisoPaginacionAltoTipoTelefo;
	}

	public void setIsPermisoPaginacionAltoTipoTelefo(Boolean isPermisoPaginacionAltoTipoTelefo) {
		this.isPermisoPaginacionAltoTipoTelefo = isPermisoPaginacionAltoTipoTelefo;
	}
	
	public Boolean getIsPermisoCopiarTipoTelefo() {
		return isPermisoCopiarTipoTelefo;
	}

	public void setIsPermisoCopiarTipoTelefo(Boolean isPermisoCopiarTipoTelefo) {
		this.isPermisoCopiarTipoTelefo = isPermisoCopiarTipoTelefo;
	}
	
	public Boolean getIsPermisoVerFormTipoTelefo() {
		return isPermisoVerFormTipoTelefo;
	}

	public void setIsPermisoVerFormTipoTelefo(Boolean isPermisoVerFormTipoTelefo) {
		this.isPermisoVerFormTipoTelefo = isPermisoVerFormTipoTelefo;
	}
	
	public Boolean getIsPermisoDuplicarTipoTelefo() {
		return isPermisoDuplicarTipoTelefo;
	}

	public void setIsPermisoDuplicarTipoTelefo(Boolean isPermisoDuplicarTipoTelefo) {
		this.isPermisoDuplicarTipoTelefo = isPermisoDuplicarTipoTelefo;
	}
	
	public Boolean getIsPermisoOrdenTipoTelefo() {
		return isPermisoOrdenTipoTelefo;
	}

	public void setIsPermisoOrdenTipoTelefo(Boolean isPermisoOrdenTipoTelefo) {
		this.isPermisoOrdenTipoTelefo = isPermisoOrdenTipoTelefo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoTelefo() {
		return isVisibilidadCeldaNuevoTipoTelefo;
	}

	public void setIsVisibilidadCeldaNuevoTipoTelefo(Boolean isVisibilidadCeldaNuevoTipoTelefo) {
		this.isVisibilidadCeldaNuevoTipoTelefo = isVisibilidadCeldaNuevoTipoTelefo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoTelefo() {
		return isVisibilidadCeldaDuplicarTipoTelefo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoTelefo(Boolean isVisibilidadCeldaDuplicarTipoTelefo) {
		this.isVisibilidadCeldaDuplicarTipoTelefo = isVisibilidadCeldaDuplicarTipoTelefo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoTelefo() {
		return isVisibilidadCeldaCopiarTipoTelefo;
	}

	public void setIsVisibilidadCeldaCopiarTipoTelefo(Boolean isVisibilidadCeldaCopiarTipoTelefo) {
		this.isVisibilidadCeldaCopiarTipoTelefo = isVisibilidadCeldaCopiarTipoTelefo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoTelefo() {
		return isVisibilidadCeldaVerFormTipoTelefo;
	}

	public void setIsVisibilidadCeldaVerFormTipoTelefo(Boolean isVisibilidadCeldaVerFormTipoTelefo) {
		this.isVisibilidadCeldaVerFormTipoTelefo = isVisibilidadCeldaVerFormTipoTelefo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoTelefo() {
		return isVisibilidadCeldaOrdenTipoTelefo;
	}

	public void setIsVisibilidadCeldaOrdenTipoTelefo(Boolean isVisibilidadCeldaOrdenTipoTelefo) {
		this.isVisibilidadCeldaOrdenTipoTelefo = isVisibilidadCeldaOrdenTipoTelefo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoTelefo() {
		return isVisibilidadCeldaNuevoRelacionesTipoTelefo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoTelefo(Boolean isVisibilidadCeldaNuevoRelacionesTipoTelefo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoTelefo = isVisibilidadCeldaNuevoRelacionesTipoTelefo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoTelefo() {
		return isVisibilidadCeldaModificarTipoTelefo;
	}

	public void setIsVisibilidadCeldaModificarTipoTelefo(Boolean isVisibilidadCeldaModificarTipoTelefo) {
		this.isVisibilidadCeldaModificarTipoTelefo = isVisibilidadCeldaModificarTipoTelefo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoTelefo() {
		return isVisibilidadCeldaActualizarTipoTelefo;
	}

	public void setIsVisibilidadCeldaActualizarTipoTelefo(Boolean isVisibilidadCeldaActualizarTipoTelefo) {
		this.isVisibilidadCeldaActualizarTipoTelefo = isVisibilidadCeldaActualizarTipoTelefo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoTelefo() {
		return isVisibilidadCeldaEliminarTipoTelefo;
	}

	public void setIsVisibilidadCeldaEliminarTipoTelefo(Boolean isVisibilidadCeldaEliminarTipoTelefo) {
		this.isVisibilidadCeldaEliminarTipoTelefo = isVisibilidadCeldaEliminarTipoTelefo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoTelefo() {
		return isVisibilidadCeldaCancelarTipoTelefo;
	}

	public void setIsVisibilidadCeldaCancelarTipoTelefo(Boolean isVisibilidadCeldaCancelarTipoTelefo) {
		this.isVisibilidadCeldaCancelarTipoTelefo = isVisibilidadCeldaCancelarTipoTelefo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoTelefo() {
		return isVisibilidadCeldaGuardarTipoTelefo;
	}

	public void setIsVisibilidadCeldaGuardarTipoTelefo(Boolean isVisibilidadCeldaGuardarTipoTelefo) {
		this.isVisibilidadCeldaGuardarTipoTelefo = isVisibilidadCeldaGuardarTipoTelefo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoTelefo() {
		return isVisibilidadCeldaGuardarCambiosTipoTelefo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoTelefo(Boolean isVisibilidadCeldaGuardarCambiosTipoTelefo) {
		this.isVisibilidadCeldaGuardarCambiosTipoTelefo = isVisibilidadCeldaGuardarCambiosTipoTelefo;
	}
		
	public TipoTelefoSessionBean gettipotelefoSessionBean() {
		return this.tipotelefoSessionBean;
	}
	
	public void settipotelefoSessionBean(TipoTelefoSessionBean tipotelefoSessionBean) {
		this.tipotelefoSessionBean=tipotelefoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(TipoTelefo tipotelefo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipotelefo,null);
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
	
	public void bugActualizarReferenciaActual(TipoTelefo tipotelefo,TipoTelefo tipotelefoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoTelefo(tipotelefo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipotelefoAux.setId(tipotelefo.getId());
		tipotelefoAux.setVersionRow(tipotelefo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoTelefo();
		
			int intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoTelefoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoTelefo(this.tipotelefo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipotelefoValidator.getInvalidValues(this.tipotelefo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipotelefoLogic.setDatosCliente(datosCliente);
			tipotelefoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipotelefoAux=new  TipoTelefo();
				
				tipotelefoAux.setIsNew(true);
				tipotelefoAux.setIsChanged(true);
				
				tipotelefoAux.setTipoTelefoOriginal(this.tipotelefo);
				
				tipotelefoAux.setId(this.tipotelefo.getId());	
				tipotelefoAux.setVersionRow(this.tipotelefo.getVersionRow());	
				tipotelefoAux.setid_empresa(this.tipotelefo.getid_empresa());	
				tipotelefoAux.setcodigo(this.tipotelefo.getcodigo());	
				tipotelefoAux.setnombre(this.tipotelefo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipotelefoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipotelefoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipotelefoAux,tipotelefoLogic.getTipoTelefos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotelefoAux,tipotelefos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipotelefoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotelefoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotelefoLogic.saveTipoTelefos();//WithConnection
						//tipotelefoLogic.getSetVersionRowTipoTelefos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipotelefo,tipotelefoAux);
					
					this.refrescarForeignKeysDescripcionesTipoTelefo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipotelefoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.getTelefonos().addAll(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonos.addAll(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipotelefoLogic.saveTipoTelefoRelaciones(tipotelefoAux,this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.getTelefonos());//WithConnection
								//tipotelefoLogic.getSetVersionRowTipoTelefos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipotelefo,tipotelefoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.setTelefonos(new ArrayList<Telefono>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonos= new ArrayList<Telefono>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipotelefoAux.setTelefonos(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.getTelefonos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipotelefoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipotelefoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipotelefoAux,tipotelefoLogic.getTipoTelefos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipotelefoAux,tipotelefos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipotelefo,tipotelefoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipotelefoAux=new  TipoTelefo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipotelefoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipotelefoSessionBean.getEsGuardarRelacionado() && this.tipotelefo.getId()>=0)) {
						
					tipotelefoAux.setIsNew(false);
				}
				
				tipotelefoAux.setIsDeleted(false);
			
				tipotelefoAux.setId(this.tipotelefo.getId());	
				tipotelefoAux.setVersionRow(this.tipotelefo.getVersionRow());	
				tipotelefoAux.setid_empresa(this.tipotelefo.getid_empresa());	
				tipotelefoAux.setcodigo(this.tipotelefo.getcodigo());	
				tipotelefoAux.setnombre(this.tipotelefo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipotelefoAux,tipotelefoLogic.getTipoTelefos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotelefoAux,tipotelefos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipotelefoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotelefoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotelefoLogic.saveTipoTelefos();//WithConnection
						//tipotelefoLogic.getSetVersionRowTipoTelefos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipotelefo,tipotelefoAux);
					
					this.refrescarForeignKeysDescripcionesTipoTelefo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipotelefoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.getTelefonos().addAll(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonos.addAll(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipotelefoLogic.saveTipoTelefoRelaciones(tipotelefoAux,this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.getTelefonos());//WithConnection
								//tipotelefoLogic.getSetVersionRowTipoTelefos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipotelefo,tipotelefoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.setTelefonos(new ArrayList<Telefono>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonos= new ArrayList<Telefono>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipotelefoAux.setTelefonos(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.getTelefonos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipotelefoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipotelefoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipotelefoAux,tipotelefoLogic.getTipoTelefos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipotelefoAux,tipotelefos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipotelefo,tipotelefoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipotelefoAux=new  TipoTelefo();
				
				tipotelefoAux.setIsNew(false);
				tipotelefoAux.setIsChanged(false);
				
				tipotelefoAux.setIsDeleted(true);
				
				tipotelefoAux.setId(this.tipotelefo.getId());	
				tipotelefoAux.setVersionRow(this.tipotelefo.getVersionRow());	
				tipotelefoAux.setid_empresa(this.tipotelefo.getid_empresa());	
				tipotelefoAux.setcodigo(this.tipotelefo.getcodigo());	
				tipotelefoAux.setnombre(this.tipotelefo.getnombre());	
				
				if(this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipotelefoAux.getId()>=0) {	
						this.tipotelefosEliminados.add(tipotelefoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipotelefoAux,tipotelefoLogic.getTipoTelefos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotelefoAux,tipotelefos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipotelefoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotelefoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotelefoLogic.saveTipoTelefos();//WithConnection
						//tipotelefoLogic.getSetVersionRowTipoTelefos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipotelefoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.getTelefonos().addAll(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonos.addAll(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipotelefoLogic.saveTipoTelefoRelaciones(tipotelefoAux,this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.getTelefonos());//WithConnection
								//tipotelefoLogic.getSetVersionRowTipoTelefos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.setTelefonos(new ArrayList<Telefono>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonos= new ArrayList<Telefono>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipotelefoAux.setTelefonos(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.getTelefonos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipotelefoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipotelefoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipotelefoAux,tipotelefoLogic.getTipoTelefos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipotelefoAux,tipotelefos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.getTipoTelefos().addAll(this.tipotelefosEliminados);
					
					tipotelefoLogic.saveTipoTelefos();//WithConnection
					//tipotelefoLogic.getSetVersionRowTipoTelefos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoTelefo();
				
				this.tipotelefosEliminados= new ArrayList<TipoTelefo>();		
			}
			
			if(this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Telefo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Telefo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipotelefo=tipotelefoAux;
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
      		//this.finishProcessTipoTelefo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoTelefo tipotelefoLocal) throws Exception {
		
		if(this.tipotelefoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipotelefoLocal.setTelefonos(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.getTelefonos());
			
			} else {
			
				tipotelefoLocal.setTelefonos(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoTelefo tipotelefoLocal) throws Exception {	
		if(this.tipotelefoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipotelefoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoTelefoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipotelefoValidator.getInvalidValues(this.tipotelefo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoTelefo tipotelefo,List<TipoTelefo> tipotelefos) throws Exception {
		try	{		
			TipoTelefoConstantesFunciones.actualizarLista(tipotelefo,tipotelefos,this.tipotelefoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoTelefo tipotelefo,List<TipoTelefo> tipotelefos) throws Exception {
		try	{			
			TipoTelefoConstantesFunciones.actualizarSelectedLista(tipotelefo,tipotelefos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoTelefo> tipotelefosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipotelefosLocal=this.tipotelefoLogic.getTipoTelefos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipotelefosLocal=this.tipotelefos;
			}
			//ARCHITECTURE
		
			for(TipoTelefo tipotelefoLocal:tipotelefosLocal) {
				if(this.permiteMantenimiento(tipotelefoLocal) && tipotelefoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoTelefoConstantesFunciones.getTipoTelefoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoTelefoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTelefo.jLabelid_empresaTipoTelefo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoTelefoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTelefo.jLabelcodigoTipoTelefo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoTelefoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTelefo.jLabelnombreTipoTelefo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTelefo.jLabelid_empresaTipoTelefo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTelefo.jLabelcodigoTipoTelefo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTelefo.jLabelnombreTipoTelefo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Telefono")) {
			if(this.tipotelefo==null) {
				this.tipotelefo= new TipoTelefo();
			}

			if(this.tipotelefoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoTelefo
				this.setVariablesFormularioToObjetoActualTipoTelefo(this.tipotelefo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);

				this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.gettelefono().setTipoTelefo(this.tipotelefo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoTelefo--;	
		
		
		this.tipotelefoAux=new TipoTelefo();
		
		this.tipotelefoAux.setId(this.iIdNuevoTipoTelefo);
		this.tipotelefoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipotelefoLogic.getTipoTelefos().add(this.tipotelefoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipotelefos.add(this.tipotelefoAux);
		}
		//ARCHITECTURE
		
		this.tipotelefo=this.tipotelefoAux;
		
		if(TipoTelefoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoTelefo(this.tipotelefo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTelefo(this.tipotelefo);
		}
				
		//this.setDefaultControlesTipoTelefo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoTelefo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoTelefo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTelefo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTelefo(this.tipotelefoBean,this.tipotelefo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoTelefoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipotelefoSessionBean.getConGuardarRelaciones()) {
			classes=TipoTelefoConstantesFunciones.getClassesRelationshipsOfTipoTelefo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipotelefoReturnGeneral=tipotelefoLogic.procesarEventosTipoTelefosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotelefoLogic.getTipoTelefos(),this.tipotelefo,this.tipotelefoParameterGeneral,this.isEsNuevoTipoTelefo,classes);//this.tipotelefoLogic.getTipoTelefo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoTelefo(this.tipotelefoReturnGeneral,this.tipotelefoBean,false);
		
		if(this.tipotelefoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTelefo(this.tipotelefoReturnGeneral.getTipoTelefo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoTelefo(this.tipotelefoReturnGeneral.getTipoTelefo());
		}
		
		if(this.tipotelefoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoTelefo(this.tipotelefoReturnGeneral.getTipoTelefo(),classes);//this.tipotelefoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoTelefo(this.tipotelefo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoTelefo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoTelefo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoTelefoBeanSwingJInternalFrameAdditional.RecargarFormTipoTelefo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoTelefo(false);
						
			if(tipotelefoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoSessionBean.getEsGuardarRelacionado() && TelefonoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTelefonoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoTelefoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTelefo();
			}
			
			this.actualizarVisualTableDatosTipoTelefo();
			
			this.jTableDatosTipoTelefo.setRowSelectionInterval(this.getIndiceNuevoTipoTelefo(), this.getIndiceNuevoTipoTelefo());
			
			this.seleccionarFilaTablaTipoTelefoActual();
						
			this.actualizarEstadoCeldasBotonesTipoTelefo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoTelefo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoTelefo.jTextFieldcodigoTipoTelefo.setEnabled(isHabilitar && this.tipotelefoConstantesFunciones.activarcodigoTipoTelefo);
		this.jInternalFrameDetalleFormTipoTelefo.jTextAreanombreTipoTelefo.setEnabled(isHabilitar && this.tipotelefoConstantesFunciones.activarnombreTipoTelefo);	
		//
		this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.setEnabled(isHabilitar && this.tipotelefoConstantesFunciones.activarid_empresaTipoTelefo);
	};
	
	public void setDefaultControlesTipoTelefo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoTelefo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipotelefoSessionBean.setConGuardarRelaciones(true);			
			this.tipotelefoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoTelefo.jTabbedPaneRelacionesTipoTelefo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipotelefoSessionBean.setConGuardarRelaciones(false);			
			this.tipotelefoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoTelefo.jTabbedPaneRelacionesTipoTelefo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoTelefo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTelefo tipotelefoAux:this.tipotelefoLogic.getTipoTelefos()) {
				if(tipotelefoAux.getId().equals(this.iIdNuevoTipoTelefo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTelefo tipotelefoAux:this.tipotelefos) {
				if(tipotelefoAux.getId().equals(this.iIdNuevoTipoTelefo)) {
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
	
	public int getIndiceActualTipoTelefo(TipoTelefo tipotelefo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTelefo tipotelefoAux:this.tipotelefoLogic.getTipoTelefos()) {
				if(tipotelefoAux.getId().equals(tipotelefo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTelefo tipotelefoAux:this.tipotelefos) {
				if(tipotelefoAux.getId().equals(tipotelefo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoTelefo(TipoTelefo tipotelefoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTelefo tipotelefoAux:this.tipotelefoLogic.getTipoTelefos()) {
				if(tipotelefoAux.getTipoTelefoOriginal().getId().equals(tipotelefoOriginal.getId())) {
					existe=true;
					tipotelefoOriginal.setId(tipotelefoAux.getId());
					tipotelefoOriginal.setVersionRow(tipotelefoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTelefo tipotelefoAux:this.tipotelefos) {
				if(tipotelefoAux.getTipoTelefoOriginal().getId().equals(tipotelefoOriginal.getId())) {
					existe=true;
					tipotelefoOriginal.setId(tipotelefoAux.getId());
					tipotelefoOriginal.setVersionRow(tipotelefoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoTelefo(Boolean esParaCancelar) throws Exception {
		tipotelefosAux=new ArrayList<TipoTelefo>();
		tipotelefoAux=new TipoTelefo();
		
		if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTelefo tipotelefoAux:this.tipotelefoLogic.getTipoTelefos()) {
					if(tipotelefoAux.getId()<0) {
						tipotelefosAux.add(tipotelefoAux);
					}		
				}
				this.iIdNuevoTipoTelefo=0L;
				this.tipotelefoLogic.getTipoTelefos().removeAll(tipotelefosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTelefo tipotelefoAux:this.tipotelefos) {
					if(tipotelefoAux.getId()<0) {
						tipotelefosAux.add(tipotelefoAux);
					}		
				}
				this.iIdNuevoTipoTelefo=0L;
				this.tipotelefos.removeAll(tipotelefosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoTelefo 
					&& this.tipotelefoLogic.getTipoTelefos().size()>0
					) {
					tipotelefoAux=this.tipotelefoLogic.getTipoTelefos().get(this.tipotelefoLogic.getTipoTelefos().size() - 1);
				
					if(tipotelefoAux.getId()<0) {
						this.tipotelefoLogic.getTipoTelefos().remove(tipotelefoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoTelefo && this.tipotelefos.size()>0) {
					tipotelefoAux=this.tipotelefos.get(this.tipotelefos.size() - 1);
				
					if(tipotelefoAux.getId()<0) {
						this.tipotelefos.remove(tipotelefoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoTelefo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipotelefo.getId()<0) {
				this.tipotelefoLogic.getTipoTelefos().remove(this.tipotelefo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipotelefo.getId()<0) {
				this.tipotelefos.remove(this.tipotelefo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoTelefo(List<TipoTelefo> tipotelefosAux) throws Exception {
		TipoTelefoConstantesFunciones.setEstadosInicialesTipoTelefo(tipotelefosAux);
	}
	
	public void setEstadosInicialesTipoTelefo(TipoTelefo tipotelefoAux) throws Exception {
		TipoTelefoConstantesFunciones.setEstadosInicialesTipoTelefo(tipotelefoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoTelefoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoTelefo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoTelefoActual()) {
				if(!this.isEsNuevoTipoTelefo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoTelefo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoTelefo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoTelefoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Telefo ?", "MANTENIMIENTO DE Tipo Telefo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoTelefo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoTelefo tipotelefo) throws Exception {
		TipoTelefoConstantesFunciones.seleccionarAsignar(this.tipotelefo,tipotelefo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoTelefo=this.isPermisoActualizarOriginalTipoTelefo;
			
			
			this.seleccionarAsignar(tipotelefo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoTelefoConstantesFunciones.quitarEspaciosTipoTelefo(this.tipotelefo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoTelefo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipotelefoSessionBean.setsFuncionBusquedaRapida(this.tipotelefoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoTelefo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoTelefo(esParaCancelar);				
				this.cancelarNuevoTipoTelefo(esParaCancelar);								
			}
			
			this.tipotelefo=new TipoTelefo();
			
			this.inicializarTipoTelefo();
			
			this.actualizarEstadoCeldasBotonesTipoTelefo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoTelefo() throws Exception {
		try {
			TipoTelefoConstantesFunciones.inicializarTipoTelefo(this.tipotelefo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipotelefoLogic.getTipoTelefos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoTelefos(String sAccionBusqueda,List<TipoTelefo> tipotelefosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoTelefo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoTelefoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoTelefoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoTelefo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Telefos");		
		parameters.put("busquedapor", TipoTelefoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Telefono.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoTelefoLogic tipotelefoLogicAuxiliar=new TipoTelefoLogic();
					tipotelefoLogicAuxiliar.setDatosCliente(tipotelefoLogic.getDatosCliente());				
					tipotelefoLogicAuxiliar.setTipoTelefos(tipotelefosParaReportes);
					
					tipotelefoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoTelefoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipotelefosParaReportes=tipotelefoLogicAuxiliar.getTipoTelefos();
					
					//tipotelefoLogic.getNewConnexionToDeep();
					
					//for (TipoTelefo tipotelefo:tipotelefosParaReportes) {
					//	tipotelefoLogic.deepLoad(tipotelefo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipotelefoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipotelefoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTelefono = AuxiliarReportes.class.getResourceAsStream("TelefonoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_telefono", reportFileTelefono);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoTelefo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoTelefoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoTelefoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoTelefo=new JRBeanArrayDataSource(TipoTelefoJInternalFrame.TraerTipoTelefoBeans(tipotelefosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoTelefo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoTelefoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoTelefoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoTelefoBean.TraerTipoTelefoBeans(tipotelefosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoTelefos(sAccionBusqueda,sTipoArchivoReporte,tipotelefosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoTelefos(sAccionBusqueda,sTipoArchivoReporte,tipotelefosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoTelefoActionPerformed(null);
					//this.generarExcelReporteTipoTelefos(sAccionBusqueda,sTipoArchivoReporte,tipotelefosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoTelefos(sAccionBusqueda,sTipoArchivoReporte,tipotelefosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoTelefos(sAccionBusqueda,sTipoArchivoReporte,tipotelefosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoTelefos(sAccionBusqueda,sTipoArchivoReporte,tipotelefosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoTelefos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTelefo> tipotelefosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotelefo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTelefos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTelefo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoTelefo tipotelefo : tipotelefosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoTelefoConstantesFunciones.generarExcelReporteDataTipoTelefo("NORMAL",row,workbook,tipotelefo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Telefo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoTelefo(String sTipo,Row row,Workbook workbook) {
		
		TipoTelefoConstantesFunciones.generarExcelReporteHeaderTipoTelefo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoTelefos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTelefo> tipotelefosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotelefo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTelefos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoTelefo tipotelefo : tipotelefosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoTelefoConstantesFunciones.getTipoTelefoDescripcion(tipotelefo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTelefoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTelefoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotelefo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTelefoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTelefoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotelefo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTelefoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTelefoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotelefo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Telefo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoTelefos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTelefo> tipotelefosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoTelefo> tipotelefosRespaldo=null;
		
		classes=TipoTelefoConstantesFunciones.getClassesRelationshipsOfTipoTelefo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipotelefoLogic.setDatosCliente(this.datosCliente);
		this.tipotelefoLogic.setDatosDeep(this.datosDeep);
		this.tipotelefoLogic.setIsConDeep(true);
		
		tipotelefosRespaldo=this.tipotelefoLogic.getTipoTelefos();
		
		this.tipotelefoLogic.setTipoTelefos(tipotelefosParaReportes);	
		this.tipotelefoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipotelefosParaReportes=this.tipotelefoLogic.getTipoTelefos();
		this.tipotelefoLogic.setTipoTelefos(tipotelefosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotelefo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTelefos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTelefo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoTelefo tipotelefo : tipotelefosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoTelefo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoTelefoConstantesFunciones.generarExcelReporteDataTipoTelefo("NORMAL",row,workbook,tipotelefo,cellStyleDataAux);
		
			
			


				//Telefono
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TelefonoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipotelefo.getTelefonos()!=null && tipotelefo.getTelefonos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TelefonoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TelefonoConstantesFunciones.generarExcelReporteHeaderTelefono("RELACIONADO",row,workbook);
				}

				if(tipotelefo.getTelefonos()!=null) {
					i2=0;
					for(Telefono telefono : tipotelefo.getTelefonos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TelefonoConstantesFunciones.generarExcelReporteDataTelefono("RELACIONADO",row,workbook,telefono,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoTelefoConstantesFunciones.getTipoTelefoDescripcion(tipotelefo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Telefo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTelefo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTelefo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTelefo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTelefo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoTelefo() throws Exception {		
		this.startProcessTipoTelefo(true);
	}
	
	public void startProcessTipoTelefo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoTelefo ,this.jPanelParametrosReportesTipoTelefo, this.jScrollPanelDatosTipoTelefo,this.jPanelPaginacionTipoTelefo, this.jScrollPanelDatosEdicionTipoTelefo, this.jPanelAccionesTipoTelefo,this.jPanelAccionesFormularioTipoTelefo,this.jmenuBarTipoTelefo,this.jmenuBarDetalleTipoTelefo,this.jTtoolBarTipoTelefo,this.jTtoolBarDetalleTipoTelefo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTelefo=this.jTabbedPaneBusquedasTipoTelefo; 
		
		final JPanel jPanelParametrosReportesTipoTelefo=this.jPanelParametrosReportesTipoTelefo;
		//final JScrollPane jScrollPanelDatosTipoTelefo=this.jScrollPanelDatosTipoTelefo;
		final JTable jTableDatosTipoTelefo=this.jTableDatosTipoTelefo;		
		final JPanel jPanelPaginacionTipoTelefo=this.jPanelPaginacionTipoTelefo;
		//final JScrollPane jScrollPanelDatosEdicionTipoTelefo=this.jScrollPanelDatosEdicionTipoTelefo;
		final JPanel jPanelAccionesTipoTelefo=this.jPanelAccionesTipoTelefo;
		
		JPanel jPanelCamposAuxiliarTipoTelefo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoTelefo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
			jPanelCamposAuxiliarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jPanelCamposTipoTelefo;
			jPanelAccionesFormularioAuxiliarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jPanelAccionesFormularioTipoTelefo;
		}
		
		final JPanel jPanelCamposTipoTelefo=jPanelCamposAuxiliarTipoTelefo;
		final JPanel jPanelAccionesFormularioTipoTelefo=jPanelAccionesFormularioAuxiliarTipoTelefo;
		
		
		final JMenuBar jmenuBarTipoTelefo=this.jmenuBarTipoTelefo;
		final JToolBar jTtoolBarTipoTelefo=this.jTtoolBarTipoTelefo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoTelefo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTelefo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
			jmenuBarDetalleAuxiliarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jmenuBarDetalleTipoTelefo;
			jTtoolBarDetalleAuxiliarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jTtoolBarDetalleTipoTelefo;
		}
		
		final JMenuBar jmenuBarDetalleTipoTelefo=jmenuBarDetalleAuxiliarTipoTelefo;
		final JToolBar jTtoolBarDetalleTipoTelefo=jTtoolBarDetalleAuxiliarTipoTelefo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTelefo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTelefo;
			processRunnable.jTableDatos=jTableDatosTipoTelefo;
			processRunnable.jPanelCampos=jPanelCamposTipoTelefo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTelefo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTelefo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTelefo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTelefo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTelefo;
			processRunnable.jTtoolBar=jTtoolBarTipoTelefo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTelefo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoTelefo ,jPanelParametrosReportesTipoTelefo,jTableDatosTipoTelefo, /*jScrollPanelDatosTipoTelefo,*/jPanelCamposTipoTelefo,jPanelPaginacionTipoTelefo, /*jScrollPanelDatosEdicionTipoTelefo,*/ jPanelAccionesTipoTelefo,jPanelAccionesFormularioTipoTelefo,jmenuBarTipoTelefo,jmenuBarDetalleTipoTelefo,jTtoolBarTipoTelefo,jTtoolBarDetalleTipoTelefo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoTelefo ,jPanelParametrosReportesTipoTelefo, jScrollPanelDatosTipoTelefo,jPanelPaginacionTipoTelefo, jScrollPanelDatosEdicionTipoTelefo, jPanelAccionesTipoTelefo,jPanelAccionesFormularioTipoTelefo,jmenuBarTipoTelefo,jmenuBarDetalleTipoTelefo,jTtoolBarTipoTelefo,jTtoolBarDetalleTipoTelefo);
						
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
	
	public void finishProcessTipoTelefo() {// throws Exception 
		this.finishProcessTipoTelefo(true);
	}
	
	public void finishProcessTipoTelefo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoTelefo ,this.jPanelParametrosReportesTipoTelefo, this.jScrollPanelDatosTipoTelefo,this.jPanelPaginacionTipoTelefo, this.jScrollPanelDatosEdicionTipoTelefo, this.jPanelAccionesTipoTelefo,this.jPanelAccionesFormularioTipoTelefo,this.jmenuBarTipoTelefo,this.jmenuBarDetalleTipoTelefo,this.jTtoolBarTipoTelefo,this.jTtoolBarDetalleTipoTelefo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTelefo=this.jTabbedPaneBusquedasTipoTelefo; 
		
		final JPanel jPanelParametrosReportesTipoTelefo=this.jPanelParametrosReportesTipoTelefo;
		//final JScrollPane jScrollPanelDatosTipoTelefo=this.jScrollPanelDatosTipoTelefo;
		final JTable jTableDatosTipoTelefo=this.jTableDatosTipoTelefo;		
		final JPanel jPanelPaginacionTipoTelefo=this.jPanelPaginacionTipoTelefo;
		//final JScrollPane jScrollPanelDatosEdicionTipoTelefo=this.jScrollPanelDatosEdicionTipoTelefo;
		final JPanel jPanelAccionesTipoTelefo=this.jPanelAccionesTipoTelefo;
		
		JPanel jPanelCamposAuxiliarTipoTelefo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoTelefo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
			jPanelCamposAuxiliarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jPanelCamposTipoTelefo;
			jPanelAccionesFormularioAuxiliarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jPanelAccionesFormularioTipoTelefo;
		}
		
		final JPanel jPanelCamposTipoTelefo=jPanelCamposAuxiliarTipoTelefo;
		final JPanel jPanelAccionesFormularioTipoTelefo=jPanelAccionesFormularioAuxiliarTipoTelefo;
		
		
		final JMenuBar jmenuBarTipoTelefo=this.jmenuBarTipoTelefo;		
		final JToolBar jTtoolBarTipoTelefo=this.jTtoolBarTipoTelefo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoTelefo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTelefo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
			jmenuBarDetalleAuxiliarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jmenuBarDetalleTipoTelefo;
			jTtoolBarDetalleAuxiliarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jTtoolBarDetalleTipoTelefo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoTelefo=jmenuBarDetalleAuxiliarTipoTelefo;
		final JToolBar jTtoolBarDetalleTipoTelefo=jTtoolBarDetalleAuxiliarTipoTelefo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTelefo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTelefo;
			processRunnable.jTableDatos=jTableDatosTipoTelefo;
			processRunnable.jPanelCampos=jPanelCamposTipoTelefo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTelefo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTelefo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTelefo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTelefo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTelefo;
			processRunnable.jTtoolBar=jTtoolBarTipoTelefo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTelefo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoTelefo ,jPanelParametrosReportesTipoTelefo, jTableDatosTipoTelefo,/*jScrollPanelDatosTipoTelefo,*/jPanelCamposTipoTelefo,jPanelPaginacionTipoTelefo, /*jScrollPanelDatosEdicionTipoTelefo,*/ jPanelAccionesTipoTelefo,jPanelAccionesFormularioTipoTelefo,jmenuBarTipoTelefo,jmenuBarDetalleTipoTelefo,jTtoolBarTipoTelefo,jTtoolBarDetalleTipoTelefo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoTelefo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoTelefo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoTelefo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoTelefo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoTelefo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoTelefo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoTelefo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoTelefo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoTelefo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipotelefoConstantesFunciones.getsFinalQueryTipoTelefo();
		String  finalQueryPaginacionTodos=this.tipotelefoConstantesFunciones.getsFinalQueryTipoTelefo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoTelefoConstantesFunciones.getArrayColumnasGlobalesNoTipoTelefo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoTelefoConstantesFunciones.getArrayColumnasGlobalesTipoTelefo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoTelefoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipotelefosEliminados= new ArrayList<TipoTelefo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoTelefo();
		
				///*TipoTelefoSessionBean*/this.tipotelefoSessionBean=new TipoTelefoSessionBean();
			
			if(this.tipotelefoSessionBean==null) {
				this.tipotelefoSessionBean=new TipoTelefoSessionBean();
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
					this.iNumeroPaginacion=TipoTelefoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoTelefoConstantesFunciones.getClassesForeignKeysOfTipoTelefo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipotelefo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipotelefosAux= new ArrayList<TipoTelefo>();
			
				
			tipotelefoLogic.setDatosCliente(this.datosCliente);
			tipotelefoLogic.setDatosDeep(this.datosDeep);
			tipotelefoLogic.setIsConDeep(true);
			
			
			tipotelefoLogic.getTipoTelefoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipotelefoLogic.getTodosTipoTelefos(finalQueryGlobal,pagination);
					
					//tipotelefoLogic.getTodosTipoTelefosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipotelefoLogic.getTipoTelefos()==null|| tipotelefoLogic.getTipoTelefos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotelefosAux= new ArrayList<TipoTelefo>();
							tipotelefosAux.addAll(tipotelefoLogic.getTipoTelefos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotelefosAux= new ArrayList<TipoTelefo>();
							tipotelefosAux.addAll(tipotelefos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotelefoLogic.getTodosTipoTelefos(finalQueryGlobal+"",this.pagination);												
							
							//tipotelefoLogic.getTodosTipoTelefosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoTelefos("Todos",tipotelefoLogic.getTipoTelefos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotelefoLogic.setTipoTelefos(new ArrayList<TipoTelefo>());					
							tipotelefoLogic.getTipoTelefos().addAll(tipotelefosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotelefos=new ArrayList<TipoTelefo>();
							tipotelefos.addAll(tipotelefosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoTelefo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoTelefo=this.idActual;
				
				} else if(this.idTipoTelefoActual!=null && this.idTipoTelefoActual!=0L) {
					idTipoTelefo=idTipoTelefoActual;
				}
				
					
				this.sDetalleReporte=TipoTelefoConstantesFunciones.getDetalleIndicePorId(idTipoTelefo);
				
				this.tipotelefos=new ArrayList<TipoTelefo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipotelefoLogic.getEntity(idTipoTelefo);
					
					//tipotelefoLogic.getEntityWithConnection(idTipoTelefo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotelefoLogic.setTipoTelefos(new ArrayList<TipoTelefo>());
					tipotelefoLogic.getTipoTelefos().add(tipotelefoLogic.getTipoTelefo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotelefos=new ArrayList<TipoTelefo>();
					this.tipotelefos.add(tipotelefo);
				}
				
				if(tipotelefoLogic.getTipoTelefo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoTelefoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipotelefoLogic.getTipoTelefosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTelefoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTelefoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipotelefoLogic.getTipoTelefos()==null||tipotelefoLogic.getTipoTelefos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipotelefos==null|| tipotelefos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotelefosAux=new ArrayList<TipoTelefo>();
						tipotelefosAux.addAll(tipotelefoLogic.getTipoTelefos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotelefosAux=new ArrayList<TipoTelefo>();
							tipotelefosAux.addAll(tipotelefos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipotelefoLogic.getTipoTelefosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTelefoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTelefoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoTelefos("FK_IdEmpresa",tipotelefoLogic.getTipoTelefos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoTelefos("FK_IdEmpresa",tipotelefos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotelefoLogic.setTipoTelefos(new ArrayList<TipoTelefo>());
						tipotelefoLogic.getTipoTelefos().addAll(tipotelefosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotelefos=new ArrayList<TipoTelefo>();
							tipotelefos.addAll(tipotelefosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoTelefo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoTelefo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipotelefoLogic.getTipoTelefos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotelefos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipotelefoLogic.getTipoTelefos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotelefos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoTelefo tipotelefo) {
		Boolean permite=true;
		
		if(this.tipotelefo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoTelefoConstantesFunciones.getOrderByListaTipoTelefo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoTelefoConstantesFunciones.getOrderByListaTipoTelefo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTelefo tipotelefo:tipotelefoLogic.getTipoTelefos()) {
				if(tipotelefo.getsType().equals(Constantes2.S_TOTALES)) {
					tipotelefoTotales=tipotelefo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTelefo tipotelefo:this.tipotelefos) {
				if(tipotelefo.getsType().equals(Constantes2.S_TOTALES)) {
					tipotelefoTotales=tipotelefo;
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
			this.tipotelefoAux=new TipoTelefo();
			this.tipotelefoAux.setsType(Constantes2.S_TOTALES);
			this.tipotelefoAux.setIsNew(false);
			this.tipotelefoAux.setIsChanged(false);
			this.tipotelefoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoTelefoConstantesFunciones.TotalizarValoresFilaTipoTelefo(this.tipotelefoLogic.getTipoTelefos(),this.tipotelefoAux);
				
				this.tipotelefoLogic.getTipoTelefos().add(this.tipotelefoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoTelefoConstantesFunciones.TotalizarValoresFilaTipoTelefo(this.tipotelefos,this.tipotelefoAux);
				
				this.tipotelefos.add(this.tipotelefoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipotelefoTotales=new TipoTelefo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipotelefoLogic.getTipoTelefos().remove(tipotelefoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipotelefos.remove(tipotelefoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipotelefoTotales=new TipoTelefo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTelefo tipotelefo:tipotelefoLogic.getTipoTelefos()) {
				if(tipotelefo.getsType().equals(Constantes2.S_TOTALES)) {
					tipotelefoTotales=tipotelefo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTelefoConstantesFunciones.TotalizarValoresFilaTipoTelefo(this.tipotelefoLogic.getTipoTelefos(),tipotelefoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTelefo tipotelefo:this.tipotelefos) {
				if(tipotelefo.getsType().equals(Constantes2.S_TOTALES)) {
					tipotelefoTotales=tipotelefo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTelefoConstantesFunciones.TotalizarValoresFilaTipoTelefo(this.tipotelefos,tipotelefoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoTelefosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoTelefosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotelefoLogic.getTipoTelefosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoTelefo() {
		this.isPermisoTodoTipoTelefo=false;
		this.isPermisoNuevoTipoTelefo=false;
		this.isPermisoActualizarTipoTelefo=false;
		this.isPermisoActualizarOriginalTipoTelefo=false;
		this.isPermisoEliminarTipoTelefo=false;
		this.isPermisoGuardarCambiosTipoTelefo=false;
		this.isPermisoConsultaTipoTelefo=false;
		this.isPermisoBusquedaTipoTelefo=false;
		this.isPermisoReporteTipoTelefo=false;		
		this.isPermisoOrdenTipoTelefo=false;		
		this.isPermisoPaginacionMedioTipoTelefo=false;		
		this.isPermisoPaginacionAltoTipoTelefo=false;
		this.isPermisoPaginacionTodoTipoTelefo=false;
		this.isPermisoCopiarTipoTelefo=false;		
		this.isPermisoVerFormTipoTelefo=false;		
		this.isPermisoDuplicarTipoTelefo=false;		
		this.isPermisoOrdenTipoTelefo=false;		
	}
	
	public void setPermisosUsuarioTipoTelefo(Boolean isPermiso) {
		this.isPermisoTodoTipoTelefo=isPermiso;
		this.isPermisoNuevoTipoTelefo=isPermiso;
		this.isPermisoActualizarTipoTelefo=isPermiso;
		this.isPermisoActualizarOriginalTipoTelefo=isPermiso;
		this.isPermisoEliminarTipoTelefo=isPermiso;
		this.isPermisoGuardarCambiosTipoTelefo=isPermiso;
		this.isPermisoConsultaTipoTelefo=isPermiso;
		this.isPermisoBusquedaTipoTelefo=isPermiso;
		this.isPermisoReporteTipoTelefo=isPermiso;
		this.isPermisoOrdenTipoTelefo=isPermiso;		
		this.isPermisoPaginacionMedioTipoTelefo=isPermiso;		
		this.isPermisoPaginacionAltoTipoTelefo=isPermiso;		
		this.isPermisoPaginacionTodoTipoTelefo=isPermiso;		
		this.isPermisoCopiarTipoTelefo=isPermiso;		
		this.isPermisoVerFormTipoTelefo=isPermiso;		
		this.isPermisoDuplicarTipoTelefo=isPermiso;
		this.isPermisoOrdenTipoTelefo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoTelefo(Boolean isPermiso) {
		//this.isPermisoTodoTipoTelefo=isPermiso;
		this.isPermisoNuevoTipoTelefo=isPermiso;
		this.isPermisoActualizarTipoTelefo=isPermiso;
		this.isPermisoActualizarOriginalTipoTelefo=isPermiso;
		this.isPermisoEliminarTipoTelefo=isPermiso;
		this.isPermisoGuardarCambiosTipoTelefo=isPermiso;
		//this.isPermisoConsultaTipoTelefo=isPermiso;
		//this.isPermisoBusquedaTipoTelefo=isPermiso;
		//this.isPermisoReporteTipoTelefo=isPermiso;
		//this.isPermisoOrdenTipoTelefo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoTelefo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoTelefo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoTelefo=isPermiso;		
		//this.isPermisoCopiarTipoTelefo=isPermiso;		
		//this.isPermisoDuplicarTipoTelefo=isPermiso;
		//this.isPermisoOrdenTipoTelefo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoTelefoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TelefonoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoTelefoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTelefono=false;
		this.isTienePermisosTelefono=this.verificarGetPermisosUsuarioOpcionTipoTelefoClaseRelacionada(this.opcionsRelacionadas,TelefonoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoTelefo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoTelefoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTelefono=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoTelefoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoTelefoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoTelefoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTelefono && this.jInternalFrameDetalleFormTipoTelefo!=null && this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoTelefo.jTabbedPaneRelacionesTipoTelefo.remove(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoTelefo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoTelefoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoTelefoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoTelefo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoTelefo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoTelefo=this.isPermisoActualizarTipoTelefo;
			this.isPermisoEliminarTipoTelefo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoTelefo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoTelefo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoTelefo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoTelefo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoTelefo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTelefo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoTelefo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoTelefo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoTelefo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoTelefo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoTelefo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoTelefo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTelefo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoTelefo.setToolTipText(this.jTableDatosTipoTelefo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoTelefo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoTelefo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoTelefoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoTelefoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoTelefo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTelefono && this.tipotelefoConstantesFunciones.mostrarTelefonoTipoTelefo && !TipoTelefoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Telefono");
			reporte.setsDescripcion("Telefono");
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTipoTelefoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoTelefoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoTelefoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoTelefoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoTelefoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoTelefoParameterReturnGeneral tipotelefoReturnGeneral=new TipoTelefoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipotelefoConstantesFunciones.cargarid_empresaTipoTelefo)
					 || (this.esRecargarFks && this.tipotelefoConstantesFunciones.cargarid_empresaTipoTelefo)) {

					if(!this.tipotelefoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipotelefoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipotelefoReturnGeneral=tipotelefoLogic.cargarCombosLoteForeignKeyTipoTelefo(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipotelefoReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoTelefo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipotelefoSessionBean==null) {
				this.tipotelefoSessionBean=new TipoTelefoSessionBean();
			}

			if(!this.tipotelefoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoTelefo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoTelefo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoTelefo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTelefo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoTelefo(TipoTelefo tipotelefo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoTelefo(TipoTelefo tipotelefo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoTelefo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTelefo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoTelefo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoTelefo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoTelefo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoTelefo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoTelefo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoTelefo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo!=null && this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoTelefoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoTelefoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoTelefoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipotelefoSessionBean=new TipoTelefoSessionBean(); 
		this.tipotelefoConstantesFunciones=new TipoTelefoConstantesFunciones(); 
		this.tipotelefoBean=new TipoTelefo();//(this.tipotelefoConstantesFunciones); 		
		this.tipotelefoReturnGeneral=new TipoTelefoParameterReturnGeneral(); 
		
		this.tipotelefoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotelefoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoTelefoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoTelefoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoTelefoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoTelefo(true);
			
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
			
			this.tipotelefoConstantesFunciones=new TipoTelefoConstantesFunciones(); 
			this.tipotelefoBean=new TipoTelefo();//this.tipotelefoConstantesFunciones); 			
			this.tipotelefoReturnGeneral=new TipoTelefoParameterReturnGeneral(); 
		
			TipoTelefoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Telefo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipotelefo=new TipoTelefo();
			this.tipotelefos = new ArrayList<TipoTelefo>();
			this.tipotelefosAux = new ArrayList<TipoTelefo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic=new TipoTelefoLogic();
				this.tipotelefoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipotelefoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipotelefoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoTelefo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoTelefo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTelefo);	
					}
					
					if(this.jInternalFrameImportacionTipoTelefo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTelefo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoTelefo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoTelefo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTelefo);
				this.jInternalFrameDetalleFormTipoTelefo.setVisible(false);
				this.jInternalFrameDetalleFormTipoTelefo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoTelefo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTelefo);
					this.jInternalFrameReporteDinamicoTipoTelefo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoTelefo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoTelefo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoTelefo);
					this.jInternalFrameImportacionTipoTelefo.setVisible(false);
					this.jInternalFrameImportacionTipoTelefo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoTelefo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoTelefo);
					this.jInternalFrameOrderByTipoTelefo.setVisible(false);
					this.jInternalFrameOrderByTipoTelefo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoTelefoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoTelefoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipotelefoReturnGeneral=new TipoTelefoParameterReturnGeneral();
			
			this.tipotelefoParameterGeneral=new TipoTelefoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipotelefoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoTelefoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TelefonoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTelefoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipotelefoSessionBean.getEsGuardarRelacionado(),this.tipotelefoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTelefoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipotelefoSessionBean.getEsGuardarRelacionado(),this.tipotelefoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoTelefo=false;
			this.isVisibilidadCeldaDuplicarTipoTelefo=true;
			this.isVisibilidadCeldaCopiarTipoTelefo=true;
			this.isVisibilidadCeldaVerFormTipoTelefo=true;
			this.isVisibilidadCeldaOrdenTipoTelefo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=false;
			this.isVisibilidadCeldaModificarTipoTelefo=false;
			this.isVisibilidadCeldaActualizarTipoTelefo=false;
			this.isVisibilidadCeldaEliminarTipoTelefo=false;
			this.isVisibilidadCeldaCancelarTipoTelefo=false;
			this.isVisibilidadCeldaGuardarTipoTelefo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTelefo=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoTelefo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoTelefo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoTelefo(false);
			
			this.setPermisosUsuarioTipoTelefo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotelefoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipotelefoSessionBean.getEsGuardarRelacionado() && this.tipotelefoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoTelefoClasesRelacionadas();
			}
			
			if(this.tipotelefoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoTelefoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoTelefoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoTelefo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoTelefo();
			}
			
			if(!this.isPermisoBusquedaTipoTelefo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoTelefo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoTelefo,this.isPermisoPaginacionMedioTipoTelefo,this.isPermisoPaginacionTodoTipoTelefo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoTelefoConstantesFunciones.getTiposSeleccionarTipoTelefo());
				
				this.tiposColumnasSelect=TipoTelefoConstantesFunciones.getTiposSeleccionarTipoTelefo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoTelefo();				
				//this.tiposRelacionesSelect=TipoTelefoConstantesFunciones.getTiposRelacionesTipoTelefo(true);
				
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
			//if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoTelefo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoTelefo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoTelefo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTelefo() ;
			
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
			
			
			this.telefonoLogic=new TelefonoLogic(); 
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
				tipotelefoImplementable= (TipoTelefoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTelefoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipotelefoImplementableHome= (TipoTelefoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTelefoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipotelefos= new ArrayList<TipoTelefo>();
			this.tipotelefosEliminados= new ArrayList<TipoTelefo>();
						
			this.isEsNuevoTipoTelefo=false;
			this.esParaAccionDesdeFormularioTipoTelefo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoTelefo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoTelefo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoTelefoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoTelefoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoTelefo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoTelefo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoTelefo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoTelefo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoTelefo();
			}
			
			TipoTelefoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoTelefo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoTelefo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoTelefo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoTelefo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoTelefo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoTelefo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TelefonoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TelefonoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoTelefo")) {
				iIndex=this.jInternalFrameDetalleFormTipoTelefo.jTabbedPaneRelacionesTipoTelefo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoTelefo.jTabbedPaneRelacionesTipoTelefo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();	
				
				

				if(sTitle.equals("Telefonos")) {
					if(!TelefonoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoTelefo();

						this.cargarParteTabPanelRelacionadaTelefono(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoTelefo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaTelefono(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoTelefo.cargarSessionConBeanSwingJInternalFrameTelefono(false,true,iIndex);
		this.jButtonTelefonoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTelefono();

		//this.jTabbedPaneRelacionesTipoTelefo.updateUI();
		//this.jTabbedPaneRelacionesTipoTelefo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoTelefo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Telefono")) {
				int row=this.jTableDatosTipoTelefo.getSelectedRow();
				jButtonTelefonoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Telefono")) {

					if(this.isTienePermisosTelefono && this.tipotelefoConstantesFunciones.mostrarTelefonoTipoTelefo && !TipoTelefoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Telefonos"+"("+TelefonoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Telefonos");

						if(tipotelefoConstantesFunciones.resaltarTelefonoTipoTelefo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipotelefoConstantesFunciones.resaltarTelefonoTipoTelefo);
						}

						jmenuItem.setEnabled(this.tipotelefoConstantesFunciones.activarTelefonoTipoTelefo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Telefono"));

						

						this.jInternalFrameDetalleFormTipoTelefo.jmenuDetalleTipoTelefo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoTelefo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoTelefo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoTelefo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoTelefoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoTelefo();
		
		this.cargarCombosFrameForeignKeyTipoTelefo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoTelefo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoTelefo();
		}
	}
	
	
	
	public void jButtonNuevoTipoTelefoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipotelefoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoTelefo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			
			
			if(jTableDatosTipoTelefo.getRowCount()>=1) {
				jTableDatosTipoTelefo.removeRowSelectionInterval(0, jTableDatosTipoTelefo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoTelefo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoTelefo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoTelefo(true);			
			//this.tipotelefo=new TipoTelefo();
			//this.tipotelefo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTelefo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTelefo() ;
			
			if(TipoTelefoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTelefo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipotelefo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);				
			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			
			if(this.tipotelefoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoTelefo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoTelefoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoTelefo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoTelefo.getSelectedRows().length;			
			}
			
			tipotelefosSeleccionados=this.getTipoTelefosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoTelefo--;			
				//TipoTelefo tipotelefoAux= new TipoTelefo();			
				//tipotelefoAux.setId(this.iIdNuevoTipoTelefo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoTelefo tipotelefoOrigen=new TipoTelefo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoTelefo tipotelefoOrigen : tipotelefosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipotelefoOrigen =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotelefoOrigen =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoTelefo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipotelefo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoTelefo(tipotelefoOrigen,this.tipotelefo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipotelefoLogic.getTipoTelefos().add(this.tipotelefoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipotelefos.add(this.tipotelefoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoTelefo(false);
				
				this.jTableDatosTipoTelefo.setRowSelectionInterval(this.getIndiceNuevoTipoTelefo(), this.getIndiceNuevoTipoTelefo());
				
				int iLastRow =  this.jTableDatosTipoTelefo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTelefo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTelefo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTelefo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoTelefoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();									
		
			TipoTelefo tipotelefoOrigen=new TipoTelefo();
			TipoTelefo tipotelefoDestino=new TipoTelefo();
				
			tipotelefosSeleccionados=this.getTipoTelefosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoTelefo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipotelefosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoTelefo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotelefoOrigen =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipotelefoOrigen =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotelefoDestino =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipotelefoDestino =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipotelefoOrigen =tipotelefosSeleccionados.get(0);
				tipotelefoDestino =tipotelefosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoTelefo(tipotelefoOrigen,tipotelefoDestino,true,false);
				
				tipotelefoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipotelefoDestino,tipotelefoLogic.getTipoTelefos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotelefoDestino,tipotelefos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoTelefo(false);
				
				//this.jTableDatosTipoTelefo.setRowSelectionInterval(this.getIndiceNuevoTipoTelefo(), this.getIndiceNuevoTipoTelefo());
				
				int iLastRow =  this.jTableDatosTipoTelefo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTelefo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTelefo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTelefo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoTelefoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTelefo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoTelefo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoTelefoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoTelefo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoTelefo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoTelefo.setVisible(!isVisible);
			this.jPanelPaginacionTipoTelefo.setVisible(!isVisible);
			this.jPanelAccionesTipoTelefo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoTelefoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoTelefo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoTelefoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoTelefo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoTelefoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoTelefo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoTelefoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoTelefo();
			
			this.abrirFrameOrderByTipoTelefo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoTelefoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoTelefo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoTelefo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTelefo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoTelefo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoTelefo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoTelefo.setSize(this.jInternalFrameDetalleFormTipoTelefo.iWidthFormulario,this.jInternalFrameDetalleFormTipoTelefo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoTelefo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoTelefo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoTelefo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoTelefo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoTelefo.jContentPaneDetalleTipoTelefo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoTelefo.jTabbedPaneRelacionesTipoTelefo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoTelefo.jContentPaneDetalleTipoTelefo.getWidth(),TipoTelefoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTelefo.jTabbedPaneRelacionesTipoTelefo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoTelefo.jContentPaneDetalleTipoTelefo.getWidth(),TipoTelefoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTelefo.jTabbedPaneRelacionesTipoTelefo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoTelefo.jContentPaneDetalleTipoTelefo.getWidth(),TipoTelefoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(TelefonoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTelefono();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoTelefo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoTelefo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoTelefo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoTelefo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoTelefo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTelefo,false,this);
				} else {
					this.jInternalFrameOrderByTipoTelefo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTelefo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoTelefo);
				this.jInternalFrameOrderByTipoTelefo.setVisible(false);
				this.jInternalFrameOrderByTipoTelefo.setSelected(false);
				
				this.jInternalFrameOrderByTipoTelefo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTelefo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoTelefo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoTelefo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoTelefo==null) {
				
				this.jInternalFrameImportacionTipoTelefo=new ImportacionJInternalFrame(TipoTelefoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTelefo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoTelefo);
				this.jInternalFrameImportacionTipoTelefo.setVisible(false);
				this.jInternalFrameImportacionTipoTelefo.setSelected(false);


				this.jInternalFrameImportacionTipoTelefo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTelefo"));
				this.jInternalFrameImportacionTipoTelefo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTelefo"));
				this.jInternalFrameImportacionTipoTelefo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTelefo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoTelefo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoTelefo==null) {
				this.jInternalFrameReporteDinamicoTipoTelefo=new ReporteDinamicoJInternalFrame(TipoTelefoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTelefo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTelefo);
				this.jInternalFrameReporteDinamicoTipoTelefo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoTelefo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoTelefo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTelefo"));
				this.jInternalFrameReporteDinamicoTipoTelefo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTelefo"));
				this.jInternalFrameReporteDinamicoTipoTelefo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTelefo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTelefo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaTelefono() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.jScrollPanelDatosTelefono.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoTelefo.jContentPaneDetalleTipoTelefo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.jScrollPanelDatosTelefono.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.jScrollPanelDatosTelefono.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.jScrollPanelDatosTelefono.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoTelefo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTelefo);
			
	       	this.jInternalFrameDetalleFormTipoTelefo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoTelefo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoTelefo.dispose();
			//this.jInternalFrameDetalleFormTipoTelefo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoTelefo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoTelefo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoTelefo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoTelefo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoTelefo.setVisible(true);
	        this.jInternalFrameImportacionTipoTelefo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoTelefo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoTelefo.setVisible(true);
	        this.jInternalFrameOrderByTipoTelefo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoTelefo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoTelefo.setVisible(false);
	        this.jInternalFrameOrderByTipoTelefo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoTelefo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoTelefo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoTelefo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoTelefo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoTelefo.setVisible(false);
	        this.jInternalFrameImportacionTipoTelefo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoTelefoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoTelefo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoTelefo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoTelefo(true);
			//this.isEsNuevoTipoTelefo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoTelefo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTelefo(false) ;
			
			if(tipotelefoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoSessionBean.getEsGuardarRelacionado() && TelefonoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTelefonoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoTelefoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTelefo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTelefo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoTelefoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoTelefo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTelefo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoTelefo(true);
			//this.isEsNuevoTipoTelefo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipotelefo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoTelefo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoTelefo(false) ;
			
			if(TipoTelefoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTelefo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTelefo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoTelefoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoTelefo(false);
			
			//if(!this.isEsNuevoTipoTelefo) {								
				int intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoTelefoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoTelefo(this.tipotelefo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);
				
			}
			
			if(this.permiteMantenimiento(this.tipotelefo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoTelefo=true;
					this.inicializarActualizarBindingTablaTipoTelefo(false);
					this.isEsNuevoTipoTelefo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoTelefo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoTelefo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTelefo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTelefo(false);
				
				this.habilitarDeshabilitarControlesTipoTelefo(false);
			
												
				
				if(TipoTelefoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoTelefo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoTelefoActionPerformed(evt,tipotelefoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoTelefo(this.tipotelefo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoTelefo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipotelefoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipotelefo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoTelefo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTelefo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoTelefoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				this.tipotelefo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				this.tipotelefo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipotelefo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoTelefoModel) this.jTableDatosTipoTelefo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoTelefo=true;
				this.inicializarActualizarBindingTablaTipoTelefo(false);
				this.isEsNuevoTipoTelefo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTelefo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTelefo(false);
				
				this.habilitarDeshabilitarControlesTipoTelefo(false);
				
				
				
				if(TipoTelefoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoTelefo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoTelefoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoTelefo.getRowCount()>=1) {
				jTableDatosTipoTelefo.removeRowSelectionInterval(0, jTableDatosTipoTelefo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoTelefo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoTelefo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTelefo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTelefo(false) ;
			
			this.isEsNuevoTipoTelefo=false;
			
			if(TipoTelefoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoTelefo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoTelefoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoTelefo(false);
				
				//SI ES MANUAL
				if(TipoTelefoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoTelefo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoTelefoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoTelefo--;			
			//TipoTelefo tipotelefoAux= new TipoTelefo();			
			//tipotelefoAux.setId(this.iIdNuevoTipoTelefo);
			
			if(this.jInternalFrameDetalleFormTipoTelefo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoTelefo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);
			
			this.tipotelefo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipotelefoLogic.getTipoTelefos().add(this.tipotelefoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipotelefos.add(this.tipotelefoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoTelefo(false);
			
			this.jTableDatosTipoTelefo.setRowSelectionInterval(this.getIndiceNuevoTipoTelefo(), this.getIndiceNuevoTipoTelefo());
			
			int iLastRow =  this.jTableDatosTipoTelefo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoTelefo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoTelefo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoTelefo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoTelefoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoTelefo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTelefo(false);
			
			//SI ES MANUAL
			if(TipoTelefoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTelefo();
			}
			
			//this.abrirFrameTreeTipoTelefo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoTelefoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo TelefoS ?", "MANTENIMIENTO DE Tipo Telefo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoTelefo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoTelefo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipotelefoReturnGeneral=tipotelefoLogic.procesarImportacionTipoTelefosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipotelefoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoTelefoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoTelefoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoTelefo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoTelefo.setFileImportacion(this.jInternalFrameImportacionTipoTelefo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoTelefo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoTelefo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoTelefo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoTelefo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoTelefoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();		

		tipotelefosSeleccionados=this.getTipoTelefosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTelefo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTelefo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoTelefoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoTelefoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoTelefos("Todos",tipotelefosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Telefo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTelefo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTelefo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTelefoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoTelefoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoTelefoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoTelefo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTelefo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTelefo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoTelefoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoTelefoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoTelefoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoTelefo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoTelefoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoTelefoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoTelefoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoTelefo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTelefo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTelefoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoTelefoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoTelefoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoTelefoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();		
		
		tipotelefosSeleccionados=this.getTipoTelefosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotelefo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoTelefos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoTelefo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTelefo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoTelefoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTelefoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoTelefo tipotelefo:tipotelefosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotelefo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoTelefoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTelefoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoTelefo tipotelefo:tipotelefosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotelefo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoTelefoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTelefoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoTelefo tipotelefo:tipotelefosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotelefo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoTelefo(row);				
			//	iRow++;
			//}				
			
			//for(TipoTelefo tipotelefoAux:tipotelefosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoTelefo(tipotelefoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Telefo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipotelefoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTelefo(false);
			
			//SI ES MANUAL
			if(TipoTelefoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTelefo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoTelefoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTelefo(false);
			
			//SI ES MANUAL
			if(TipoTelefoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTelefo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoTelefoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTelefo(false);
			
			//SI ES MANUAL
			if(TipoTelefoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTelefo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoTelefo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoTelefo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoTelefo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoTelefo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoTelefo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoTelefo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoTelefo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoTelefo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoTelefo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoTelefo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoTelefo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoTelefo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoTelefo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoTelefo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTelefo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoTelefo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoTelefoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoTelefoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoTelefo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoTelefo();
		
		this.inicializarActualizarBindingBotonesManualTipoTelefo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTelefo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTelefo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTelefo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTelefo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoTelefo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoTelefo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoTelefo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoTelefo.jCheckBoxPostAccionNuevoTipoTelefo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoTelefo.jCheckBoxPostAccionSinCerrarTipoTelefo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoTelefo.jCheckBoxPostAccionSinMensajeTipoTelefo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoTelefo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoTelefo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoTelefo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
				this.jInternalFrameDetalleFormTipoTelefo.jCheckBoxPostAccionNuevoTipoTelefo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoTelefo.jCheckBoxPostAccionSinCerrarTipoTelefo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoTelefo.jCheckBoxPostAccionSinMensajeTipoTelefo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoTelefo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoTelefo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoTelefo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoTelefo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTelefo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoTelefo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoTelefo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoTelefo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoTelefo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoTelefo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTelefo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoTelefo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoTelefo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoTelefo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoTelefoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTelefo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoTelefo() throws Exception {
		try	{
			if(TipoTelefoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTelefo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTelefo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTelefo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoTelefo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoTelefo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoTelefo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoTelefo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoTelefo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoTelefo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoTelefo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoTelefo.addItem(reporte);
			}
			
			
			if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoTelefo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoTelefo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoTelefo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoTelefo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoTelefo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoTelefo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoTelefo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoTelefo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoTelefo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTelefo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTelefo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTelefo!=null) {
				this.jInternalFrameReporteDinamicoTipoTelefo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTelefo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTelefo!=null) {
				this.jInternalFrameReporteDinamicoTipoTelefo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTelefo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoTelefo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoTelefo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTelefo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTelefo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoTelefo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTelefo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTelefo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoTelefo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoTelefo(Boolean esInicializar) throws Exception {				
		if(TipoTelefoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTelefo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoTelefo() throws Exception {
		this.inicializarActualizarBindingTablaTipoTelefo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoTelefo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoTelefoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoTelefoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoTelefoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTelefoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoTelefoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoTelefoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoTelefo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipotelefoLogic.getTipoTelefos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipotelefos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoTelefoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoTelefo.setModel(new TipoTelefoModel(this.tipotelefoLogic.getTipoTelefos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoTelefo.setModel(new TipoTelefoModel(this.tipotelefos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoTelefo!=null && this.jInternalFrameOrderByTipoTelefo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoTelefo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoTelefo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTelefo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoTelefoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO,tipotelefoConstantesFunciones.resaltarSeleccionarTipoTelefo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoTelefoConstantesFunciones.SCLASSWEBTITULO,tipotelefoConstantesFunciones.resaltarSeleccionarTipoTelefo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoTelefo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTelefo,TipoTelefoConstantesFunciones.LABEL_ID));

		if(this.tipotelefoConstantesFunciones.mostraridTipoTelefo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTelefoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipotelefoConstantesFunciones.resaltaridTipoTelefo,this.tipotelefoConstantesFunciones.activaridTipoTelefo,this,true,"idTipoTelefo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotelefoConstantesFunciones.resaltaridTipoTelefo,this.tipotelefoConstantesFunciones.activaridTipoTelefo,this,true,"idTipoTelefo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTelefo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTelefo,TipoTelefoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipotelefoConstantesFunciones.mostrarid_empresaTipoTelefo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTelefoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipotelefoConstantesFunciones.resaltarid_empresaTipoTelefo,this,this.tipotelefoConstantesFunciones.activarid_empresaTipoTelefo));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipotelefoConstantesFunciones.resaltarid_empresaTipoTelefo,this,this.tipotelefoConstantesFunciones.activarid_empresaTipoTelefo,false,"id_empresaTipoTelefo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoTelefoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTelefo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTelefo,TipoTelefoConstantesFunciones.LABEL_CODIGO));

		if(this.tipotelefoConstantesFunciones.mostrarcodigoTipoTelefo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTelefoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipotelefoConstantesFunciones.resaltarcodigoTipoTelefo,this.tipotelefoConstantesFunciones.activarcodigoTipoTelefo,this,true,"codigoTipoTelefo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotelefoConstantesFunciones.resaltarcodigoTipoTelefo,this.tipotelefoConstantesFunciones.activarcodigoTipoTelefo,this,true,"codigoTipoTelefo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoTelefoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTelefo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTelefo,TipoTelefoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipotelefoConstantesFunciones.mostrarnombreTipoTelefo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTelefoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipotelefoConstantesFunciones.resaltarnombreTipoTelefo,this.tipotelefoConstantesFunciones.activarnombreTipoTelefo,this,true,"nombreTipoTelefo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotelefoConstantesFunciones.resaltarnombreTipoTelefo,this.tipotelefoConstantesFunciones.activarnombreTipoTelefo,this,true,"nombreTipoTelefo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoTelefoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTelefono && this.tipotelefoConstantesFunciones.mostrarTelefonoTipoTelefo && !TipoTelefoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Telefonos");
				tableColumn.setHeaderValue("Telefonos");
				tableColumn.setCellRenderer(new TelefonoTableCell(tipotelefoConstantesFunciones.resaltarTelefonoTipoTelefo,this,this.tipotelefoConstantesFunciones.activarTelefonoTipoTelefo));
				tableColumn.setCellEditor(new TelefonoTableCell(tipotelefoConstantesFunciones.resaltarTelefonoTipoTelefo,this,this.tipotelefoConstantesFunciones.activarTelefonoTipoTelefo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoTelefo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipotelefoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipotelefoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTelefo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipotelefoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipotelefoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTelefo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoTelefo && this.isPermisoGuardarCambiosTipoTelefo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipotelefoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipotelefoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoTelefo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipotelefoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoTelefo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoTelefo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTelefo && this.isPermisoGuardarCambiosTipoTelefo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipotelefoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTelefo && this.isPermisoGuardarCambiosTipoTelefo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoTelefo.moveColumn(this.jTableDatosTipoTelefo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoTelefo.moveColumn(this.jTableDatosTipoTelefo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipotelefoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoTelefo.moveColumn(this.jTableDatosTipoTelefo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoTelefo.moveColumn(this.jTableDatosTipoTelefo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoTelefo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoTelefo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoTelefo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoTelefoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoTelefo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoTelefo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoTelefoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoTelefoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoTelefo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoTelefo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoTelefo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipotelefoLogic.getTipoTelefos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipotelefos.size()-1;
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
		//this.jTableDatosTipoTelefo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoTelefo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoTelefo();
			
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
				
				//this.isEsNuevoTipoTelefo=false;
					
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			
				if(this.tipotelefoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoTelefo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTelefo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTelefo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipotelefo.getsType().equals("DUPLICADO")
				   || this.tipotelefo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoTelefo=true;
				
				} else {
					this.isEsNuevoTipoTelefo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipotelefo.getId()>=0 && !this.tipotelefo.getIsNew()) {						
						this.isEsNuevoTipoTelefo=false;
						
					} else {
						this.isEsNuevoTipoTelefo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoTelefo(esRelaciones);						
				
				this.seleccionarTipoTelefo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipotelefo.getId()<0) {
					this.isEsNuevoTipoTelefo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoTelefo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoTelefo(evt,rowIndex);
				}	
				
				if(this.tipotelefoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoTelefo: " + this.dDif); 
					}
				}								
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoTelefo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipotelefo)) {
					if(this.tipotelefo.getId()>0) {
						this.tipotelefo.setIsDeleted(true);
						
						this.tipotelefosEliminados.add(this.tipotelefo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipotelefoLogic.getTipoTelefos().remove(this.tipotelefo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipotelefos.remove(this.tipotelefo);				
					}
					
					
					((TipoTelefoModel) this.jTableDatosTipoTelefo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTelefo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoTelefo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoTelefo) {
			
			if(this.jInternalFrameDetalleFormTipoTelefo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTelefo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTelefo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoTelefoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoTelefo(this.tipotelefo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipotelefoConstantesFunciones.cargarid_empresaTipoTelefo || this.tipotelefoConstantesFunciones.event_dependid_empresaTipoTelefo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipotelefo.getid_empresa());
									//this.inicializarActualizarBindingTipoTelefo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipotelefo.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipotelefo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipotelefo.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoTelefo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoTelefo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTelefo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTelefo(TipoTelefo tipotelefo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoTelefo(tipotelefo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTelefo(TipoTelefo tipotelefo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoTelefo(tipotelefo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoTelefo(tipotelefo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoTelefo(tipotelefo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoTelefo(TipoTelefo tipotelefo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoTelefo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoTelefo.jLabelidTipoTelefo.setText(tipotelefo.getId().toString());
			this.jInternalFrameDetalleFormTipoTelefo.jTextFieldcodigoTipoTelefo.setText(tipotelefo.getcodigo());
			this.jInternalFrameDetalleFormTipoTelefo.jTextAreanombreTipoTelefo.setText(tipotelefo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoTelefo tipotelefoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipotelefoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoTelefo tipotelefoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipotelefoLocal=this.tipotelefo;
			} else {
				tipotelefoLocal=this.tipotelefoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipotelefoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoTelefo(tipotelefoLocal,true);
					
					if(tipotelefoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipotelefoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipotelefoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoTelefo(TipoTelefo tipotelefo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTelefo(tipotelefo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(tipotelefo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTelefo(TipoTelefo tipotelefo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTelefo(tipotelefo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTelefo(TipoTelefo tipotelefo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoTelefo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoTelefo.jLabelidTipoTelefo.getText()==null || this.jInternalFrameDetalleFormTipoTelefo.jLabelidTipoTelefo.getText()=="" || this.jInternalFrameDetalleFormTipoTelefo.jLabelidTipoTelefo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoTelefo.jLabelidTipoTelefo.setText("0");
			}

			if(conColumnasBase) {tipotelefo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoTelefo.jLabelidTipoTelefo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTelefoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTelefo.jLabelIdTipoTelefo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipotelefo.setcodigo(this.jInternalFrameDetalleFormTipoTelefo.jTextFieldcodigoTipoTelefo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTelefoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTelefo.jLabelcodigoTipoTelefo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipotelefo.setnombre(this.jInternalFrameDetalleFormTipoTelefo.jTextAreanombreTipoTelefo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTelefoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTelefo.jLabelnombreTipoTelefo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTelefo(TipoTelefo tipotelefoBean,TipoTelefo tipotelefo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoTelefo(TipoTelefo tipotelefoOrigen,TipoTelefo tipotelefo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipotelefoOrigen.getId()!=null && !tipotelefoOrigen.getId().equals(0L))) {tipotelefo.setId(tipotelefoOrigen.getId());}}
			if(conDefault || (!conDefault && tipotelefoOrigen.getcodigo()!=null && !tipotelefoOrigen.getcodigo().equals(""))) {tipotelefo.setcodigo(tipotelefoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipotelefoOrigen.getnombre()!=null && !tipotelefoOrigen.getnombre().equals(""))) {tipotelefo.setnombre(tipotelefoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTelefo(TipoTelefo tipotelefo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTelefo.jLabelidTipoTelefo.setText(tipotelefo.getId().toString());
			this.jInternalFrameDetalleFormTipoTelefo.jTextFieldcodigoTipoTelefo.setText(tipotelefo.getcodigo());
			this.jInternalFrameDetalleFormTipoTelefo.jTextAreanombreTipoTelefo.setText(tipotelefo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTelefo(TipoTelefoBean tipotelefoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTelefo.jLabelidTipoTelefo.setText(tipotelefoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoTelefo.jTextFieldcodigoTipoTelefo.setText(tipotelefoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoTelefo.jTextAreanombreTipoTelefo.setText(tipotelefoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoTelefo(TipoTelefoParameterReturnGeneral tipotelefoReturnGeneral,TipoTelefoBean tipotelefoBean,Boolean conDefault) throws Exception { 
		try {
			TipoTelefo tipotelefoLocal=new TipoTelefo();
			
			tipotelefoLocal=tipotelefoReturnGeneral.getTipoTelefo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipotelefoLocal.getId()!=null && !tipotelefoLocal.getId().equals(0L))) {tipotelefoBean.setId(tipotelefoLocal.getId());}}
			if(conDefault || (!conDefault && tipotelefoLocal.getcodigo()!=null && !tipotelefoLocal.getcodigo().equals(""))) {tipotelefoBean.setcodigo(tipotelefoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipotelefoLocal.getnombre()!=null && !tipotelefoLocal.getnombre().equals(""))) {tipotelefoBean.setnombre(tipotelefoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoTelefoGenerico(Long idTipoTelefoSeleccionado,JComboBox jComboBoxTipoTelefo,List<TipoTelefo> tipotelefosLocal)throws Exception {
		try {
			TipoTelefo  tipotelefoTemp=null;

			for(TipoTelefo tipotelefoAux:tipotelefosLocal) {
				if(tipotelefoAux.getId()!=null && tipotelefoAux.getId().equals(idTipoTelefoSeleccionado)) {
					tipotelefoTemp=tipotelefoAux;
					break;
				}
			}

			jComboBoxTipoTelefo.setSelectedItem(tipotelefoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoTelefoGenerico(JComboBox jComboBoxTipoTelefo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoTelefo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTelefo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoTelefo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTelefo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTelefo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoTelefo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTelefo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoTelefo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoTelefo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoTelefo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Telefono")) {
			jButtonTelefonoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotelefo=(TipoTelefo) tipotelefoLogic.getTipoTelefos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipotelefo =(TipoTelefo) tipotelefos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipotelefo.getIsNew() && !tipotelefo.getIsChanged() && !tipotelefo.getIsDeleted()) {
				sDescripcion=tipotelefo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipotelefo.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoTelefo tipotelefoRow=new TipoTelefo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotelefoRow=(TipoTelefo) tipotelefoLogic.getTipoTelefos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipotelefoRow=(TipoTelefo) tipotelefos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTelefonoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoTelefo tipotelefo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoTelefo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotelefo = (TipoTelefo)this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipotelefo = (TipoTelefo)this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipotelefo!=null) {
						this.tipotelefo = tipotelefo;
					} else {
						this.tipotelefo = new TipoTelefo();
					}
				}

				if(this.isTienePermisosTelefono && this.permiteMantenimiento(this.tipotelefo)) {
					TelefonoBeanSwingJInternalFrame telefonoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFramePopup=new TelefonoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						telefonoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFramePopup;
					} else {
						telefonoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame;
					}

					List<TipoTelefo> tipotelefos=new ArrayList<TipoTelefo>();
					tipotelefos.add(this.tipotelefo);
					if(!esRelacionado) {
						//telefonoBeanSwingJInternalFrame.telefonoSessionBean.setConGuardarRelaciones(false);
						//telefonoBeanSwingJInternalFrame.telefonoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					telefonoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoTelefo.cargarTelefonoBeanSwingJInternalFrame(tipotelefos,this.tipotelefo,telefonoBeanSwingJInternalFrame,/*conInicializar,*/telefonoBeanSwingJInternalFrame.telefonoSessionBean.getConGuardarRelaciones(),telefonoBeanSwingJInternalFrame.telefonoSessionBean.getEsGuardarRelacionado());
					telefonoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						telefonoBeanSwingJInternalFrame.actualizarEstadoPanelsTelefono("no_relacionado");

						telefonoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TelefonoConstantesFunciones.ITAMANIOFILATABLA + (TelefonoConstantesFunciones.ITAMANIOFILATABLA/2));

						telefonoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoTelefo=(TitledBorder)this.jScrollPanelDatosTipoTelefo.getBorder();
						TitledBorder titledBorderTelefono=(TitledBorder)telefonoBeanSwingJInternalFrame.jScrollPanelDatosTelefono.getBorder();

						titledBorderTelefono.setTitle(titledBorderTipoTelefo.getTitle() + " -> Telefono");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,telefonoBeanSwingJInternalFrame);
						}

						telefonoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(telefonoBeanSwingJInternalFrame);

						telefonoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipotelefoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Telefono",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoTelefo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoTelefo.setVisible((this.isVisibilidadCeldaNuevoTipoTelefo && this.isPermisoNuevoTipoTelefo));			
			this.jButtonDuplicarTipoTelefo.setVisible((this.isVisibilidadCeldaDuplicarTipoTelefo && this.isPermisoDuplicarTipoTelefo));			
			this.jButtonCopiarTipoTelefo.setVisible((this.isVisibilidadCeldaCopiarTipoTelefo && this.isPermisoCopiarTipoTelefo));
			this.jButtonVerFormTipoTelefo.setVisible((this.isVisibilidadCeldaVerFormTipoTelefo && this.isPermisoVerFormTipoTelefo));
			
			this.jButtonAbrirOrderByTipoTelefo.setVisible((this.isVisibilidadCeldaOrdenTipoTelefo && this.isPermisoOrdenTipoTelefo));			
			
			this.jButtonNuevoRelacionesTipoTelefo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTelefo && this.isPermisoNuevoTipoTelefo));			
			this.jButtonNuevoGuardarCambiosTipoTelefo.setVisible((this.isVisibilidadCeldaNuevoTipoTelefo && this.isPermisoNuevoTipoTelefo && this.isPermisoGuardarCambiosTipoTelefo));
			
			if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
			this.jInternalFrameDetalleFormTipoTelefo.jButtonModificarTipoTelefo.setVisible((this.isVisibilidadCeldaModificarTipoTelefo && this.isPermisoActualizarTipoTelefo));	
			this.jInternalFrameDetalleFormTipoTelefo.jButtonActualizarTipoTelefo.setVisible((this.isVisibilidadCeldaActualizarTipoTelefo && this.isPermisoActualizarTipoTelefo));	
			this.jInternalFrameDetalleFormTipoTelefo.jButtonEliminarTipoTelefo.setVisible((this.isVisibilidadCeldaEliminarTipoTelefo && this.isPermisoEliminarTipoTelefo));
			this.jInternalFrameDetalleFormTipoTelefo.jButtonCancelarTipoTelefo.setVisible(this.isVisibilidadCeldaCancelarTipoTelefo);							
			this.jInternalFrameDetalleFormTipoTelefo.jButtonGuardarCambiosTipoTelefo.setVisible((this.isVisibilidadCeldaGuardarTipoTelefo && this.isPermisoGuardarCambiosTipoTelefo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoTelefo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTelefo && this.isPermisoGuardarCambiosTipoTelefo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoTelefo.setVisible((this.isVisibilidadCeldaNuevoTipoTelefo && this.isPermisoNuevoTipoTelefo));						
			this.jButtonDuplicarToolBarTipoTelefo.setVisible((this.isVisibilidadCeldaDuplicarTipoTelefo && this.isPermisoDuplicarTipoTelefo));						
			this.jButtonCopiarToolBarTipoTelefo.setVisible((this.isVisibilidadCeldaCopiarTipoTelefo && this.isPermisoCopiarTipoTelefo));			
			this.jButtonVerFormToolBarTipoTelefo.setVisible((this.isVisibilidadCeldaVerFormTipoTelefo && this.isPermisoVerFormTipoTelefo));			
			this.jButtonAbrirOrderByToolBarTipoTelefo.setVisible((this.isVisibilidadCeldaOrdenTipoTelefo && this.isPermisoOrdenTipoTelefo));
			this.jButtonNuevoRelacionesToolBarTipoTelefo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTelefo && this.isPermisoNuevoTipoTelefo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoTelefo.setVisible((this.isVisibilidadCeldaNuevoTipoTelefo && this.isPermisoNuevoTipoTelefo && this.isPermisoGuardarCambiosTipoTelefo));			
			
			if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
			this.jInternalFrameDetalleFormTipoTelefo.jButtonModificarToolBarTipoTelefo.setVisible((this.isVisibilidadCeldaModificarTipoTelefo && this.isPermisoActualizarTipoTelefo));	
			this.jInternalFrameDetalleFormTipoTelefo.jButtonActualizarToolBarTipoTelefo.setVisible((this.isVisibilidadCeldaActualizarTipoTelefo  && this.isPermisoActualizarTipoTelefo));	
			this.jInternalFrameDetalleFormTipoTelefo.jButtonEliminarToolBarTipoTelefo.setVisible((this.isVisibilidadCeldaEliminarTipoTelefo && this.isPermisoEliminarTipoTelefo));
			this.jInternalFrameDetalleFormTipoTelefo.jButtonCancelarToolBarTipoTelefo.setVisible(this.isVisibilidadCeldaCancelarTipoTelefo);				
			this.jInternalFrameDetalleFormTipoTelefo.jButtonGuardarCambiosToolBarTipoTelefo.setVisible((this.isVisibilidadCeldaGuardarTipoTelefo && this.isPermisoGuardarCambiosTipoTelefo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoTelefo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTelefo && this.isPermisoGuardarCambiosTipoTelefo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoTelefo.setVisible((this.isVisibilidadCeldaNuevoTipoTelefo && this.isPermisoNuevoTipoTelefo));			
			this.jMenuItemDuplicarTipoTelefo.setVisible((this.isVisibilidadCeldaDuplicarTipoTelefo && this.isPermisoDuplicarTipoTelefo));			
			this.jMenuItemCopiarTipoTelefo.setVisible((this.isVisibilidadCeldaCopiarTipoTelefo && this.isPermisoCopiarTipoTelefo));			
			this.jMenuItemVerFormTipoTelefo.setVisible((this.isVisibilidadCeldaVerFormTipoTelefo && this.isPermisoVerFormTipoTelefo));			
			this.jMenuItemAbrirOrderByTipoTelefo.setVisible((this.isVisibilidadCeldaOrdenTipoTelefo && this.isPermisoOrdenTipoTelefo));			
			//this.jMenuItemMostrarOcultarTipoTelefo.setVisible((this.isVisibilidadCeldaOrdenTipoTelefo && this.isPermisoOrdenTipoTelefo));
			this.jMenuItemDetalleAbrirOrderByTipoTelefo.setVisible((this.isVisibilidadCeldaOrdenTipoTelefo && this.isPermisoOrdenTipoTelefo));			
			//this.jMenuItemDetalleMostrarOcultarTipoTelefo.setVisible((this.isVisibilidadCeldaOrdenTipoTelefo && this.isPermisoOrdenTipoTelefo));			
			this.jMenuItemNuevoRelacionesTipoTelefo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTelefo && this.isPermisoNuevoTipoTelefo));			
			this.jMenuItemNuevoGuardarCambiosTipoTelefo.setVisible((this.isVisibilidadCeldaNuevoTipoTelefo && this.isPermisoNuevoTipoTelefo && this.isPermisoGuardarCambiosTipoTelefo));									
			
			if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
			this.jInternalFrameDetalleFormTipoTelefo.jMenuItemModificarTipoTelefo.setVisible((this.isVisibilidadCeldaModificarTipoTelefo && this.isPermisoActualizarTipoTelefo));	
			this.jInternalFrameDetalleFormTipoTelefo.jMenuItemActualizarTipoTelefo.setVisible((this.isVisibilidadCeldaActualizarTipoTelefo && this.isPermisoActualizarTipoTelefo));	
			this.jInternalFrameDetalleFormTipoTelefo.jMenuItemEliminarTipoTelefo.setVisible((this.isVisibilidadCeldaEliminarTipoTelefo && this.isPermisoEliminarTipoTelefo));
			this.jInternalFrameDetalleFormTipoTelefo.jMenuItemCancelarTipoTelefo.setVisible(this.isVisibilidadCeldaCancelarTipoTelefo);				
			}
			
			this.jMenuItemGuardarCambiosTipoTelefo.setVisible((this.isVisibilidadCeldaGuardarTipoTelefo && this.isPermisoGuardarCambiosTipoTelefo));						
			this.jMenuItemGuardarCambiosTablaTipoTelefo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTelefo && this.isPermisoGuardarCambiosTipoTelefo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoTelefo=this.jButtonNuevoTipoTelefo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoTelefo=this.jButtonDuplicarTipoTelefo.isVisible();
			this.isVisibilidadCeldaCopiarTipoTelefo=this.jButtonCopiarTipoTelefo.isVisible();
			this.isVisibilidadCeldaVerFormTipoTelefo=this.jButtonVerFormTipoTelefo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoTelefo=this.jButtonAbrirOrderByTipoTelefo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=this.jButtonNuevoRelacionesTipoTelefo.isVisible();
			this.isVisibilidadCeldaModificarTipoTelefo=this.jButtonModificarTipoTelefo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
			this.isVisibilidadCeldaActualizarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jButtonActualizarTipoTelefo.isVisible();
			this.isVisibilidadCeldaEliminarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jButtonEliminarTipoTelefo.isVisible();
			this.isVisibilidadCeldaCancelarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jButtonCancelarTipoTelefo.isVisible();
			this.isVisibilidadCeldaGuardarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jButtonGuardarCambiosTipoTelefo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoTelefo=this.jButtonGuardarCambiosTablaTipoTelefo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoTelefo=this.jButtonNuevoToolBarTipoTelefo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=this.jButtonNuevoRelacionesToolBarTipoTelefo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
			this.isVisibilidadCeldaModificarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jButtonModificarToolBarTipoTelefo.isVisible();
			this.isVisibilidadCeldaActualizarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jButtonActualizarToolBarTipoTelefo.isVisible();
			this.isVisibilidadCeldaEliminarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jButtonEliminarToolBarTipoTelefo.isVisible();
			this.isVisibilidadCeldaCancelarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jButtonCancelarToolBarTipoTelefo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTelefo=this.jButtonGuardarCambiosToolBarTipoTelefo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTelefo=this.jButtonGuardarCambiosTablaToolBarTipoTelefo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoTelefo=this.jMenuItemNuevoTipoTelefo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=this.jMenuItemNuevoRelacionesTipoTelefo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
			this.isVisibilidadCeldaModificarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jMenuItemModificarTipoTelefo.isVisible();
			this.isVisibilidadCeldaActualizarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jMenuItemActualizarTipoTelefo.isVisible();
			this.isVisibilidadCeldaEliminarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jMenuItemEliminarTipoTelefo.isVisible();
			this.isVisibilidadCeldaCancelarTipoTelefo=this.jInternalFrameDetalleFormTipoTelefo.jMenuItemCancelarTipoTelefo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTelefo=this.jMenuItemGuardarCambiosTipoTelefo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTelefo=this.jMenuItemGuardarCambiosTablaTipoTelefo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoTelefo(Boolean esInicializar) {
		if(TipoTelefoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipotelefoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTelefo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoTelefo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoTelefo() {
		this.jButtonNuevoTipoTelefo.setVisible(this.isPermisoNuevoTipoTelefo);			
		this.jButtonDuplicarTipoTelefo.setVisible(this.isPermisoDuplicarTipoTelefo);			
		this.jButtonCopiarTipoTelefo.setVisible(this.isPermisoCopiarTipoTelefo);			
		this.jButtonVerFormTipoTelefo.setVisible(this.isPermisoVerFormTipoTelefo);			
		
		this.jButtonAbrirOrderByTipoTelefo.setVisible(this.isPermisoOrdenTipoTelefo);					
		
		this.jButtonNuevoRelacionesTipoTelefo.setVisible(this.isPermisoNuevoTipoTelefo);			
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.jButtonModificarTipoTelefo.setVisible(this.isPermisoActualizarTipoTelefo);	
			this.jInternalFrameDetalleFormTipoTelefo.jButtonActualizarTipoTelefo.setVisible(this.isPermisoActualizarTipoTelefo);	
			this.jInternalFrameDetalleFormTipoTelefo.jButtonEliminarTipoTelefo.setVisible(this.isPermisoEliminarTipoTelefo);
			this.jInternalFrameDetalleFormTipoTelefo.jButtonCancelarTipoTelefo.setVisible(this.isVisibilidadCeldaCancelarTipoTelefo);						
			this.jInternalFrameDetalleFormTipoTelefo.jButtonGuardarCambiosTipoTelefo.setVisible(this.isPermisoGuardarCambiosTipoTelefo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoTelefo.setVisible(this.isPermisoActualizarTipoTelefo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTelefo() {
		this.jInternalFrameDetalleFormTipoTelefo.jButtonModificarTipoTelefo.setVisible(this.isPermisoActualizarTipoTelefo);	
		this.jInternalFrameDetalleFormTipoTelefo.jButtonActualizarTipoTelefo.setVisible(this.isPermisoActualizarTipoTelefo);	
		this.jInternalFrameDetalleFormTipoTelefo.jButtonEliminarTipoTelefo.setVisible(this.isPermisoEliminarTipoTelefo);
		this.jInternalFrameDetalleFormTipoTelefo.jButtonCancelarTipoTelefo.setVisible(this.isVisibilidadCeldaCancelarTipoTelefo);							
		this.jInternalFrameDetalleFormTipoTelefo.jButtonGuardarCambiosTipoTelefo.setVisible((this.isVisibilidadCeldaGuardarTipoTelefo && this.isPermisoGuardarCambiosTipoTelefo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoTelefo() {
		if(TipoTelefoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoTelefo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoTelefo() {
	}
	
	public void jTableDatosTipoTelefoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoTelefo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoTelefoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTelefo(this.gettipotelefo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotelefo==null) {
						this.tipotelefo = new TipoTelefo();
					}

					this.setVariablesFormularioToObjetoActualTipoTelefo(this.tipotelefo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);
				}

				if(this.tipotelefo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipotelefo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTelefo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoTelefoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoTelefo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoTelefo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoTelefo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoTelefo(this.gettipotelefo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipotelefoLogic.getConnexion());

				if(this.tipotelefo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipotelefo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoTelefo=(TitledBorder)this.jScrollPanelDatosTipoTelefo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoTelefo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoTelefoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTelefo(this.gettipotelefo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotelefo==null) {
						this.tipotelefo = new TipoTelefo();
					}

					this.setVariablesFormularioToObjetoActualTipoTelefo(this.tipotelefo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);
				}

				if(this.tipotelefo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipotelefo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTelefo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoTelefoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTelefo(this.gettipotelefo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotelefo==null) {
						this.tipotelefo = new TipoTelefo();
					}

					this.setVariablesFormularioToObjetoActualTipoTelefo(this.tipotelefo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);
				}

				if(this.tipotelefo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipotelefo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTelefo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoTelefoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTelefo(this.gettipotelefo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotelefo==null) {
						this.tipotelefo = new TipoTelefo();
					}

					this.setVariablesFormularioToObjetoActualTipoTelefo(this.tipotelefo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);
				}

				if(this.tipotelefo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipotelefo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTelefo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoTelefoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoTelefo(false,false);

			this.getTipoTelefosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoTelefo(false);

			//if(TipoTelefoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoTelefo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotelefoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoTelefo() {
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
		

		if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
			this.jInternalFrameDetalleFormTipoTelefo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoTelefo.dispose();
			this.jInternalFrameDetalleFormTipoTelefo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoTelefo!=null) {
			this.jInternalFrameReporteDinamicoTipoTelefo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoTelefo.dispose();
			this.jInternalFrameReporteDinamicoTipoTelefo=null;
		}
		
		if(this.jInternalFrameImportacionTipoTelefo!=null) {
			this.jInternalFrameImportacionTipoTelefo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoTelefo.dispose();
			this.jInternalFrameImportacionTipoTelefo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoTelefo();
			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoTelefo")) {
				jButtonNuevoTipoTelefoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoTelefo")) {
				jButtonDuplicarTipoTelefoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoTelefo")) {
				jButtonCopiarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoTelefo")) {
				jButtonVerFormTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoTelefo")) {
				jButtonNuevoTipoTelefoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoTelefo")) {
				jButtonDuplicarTipoTelefoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoTelefo")) {
				jButtonNuevoTipoTelefoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoTelefo")) {
				jButtonDuplicarTipoTelefoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoTelefo")) {
				jButtonNuevoTipoTelefoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoTelefo")) {
				jButtonNuevoTipoTelefoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoTelefo")) {
				jButtonNuevoTipoTelefoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoTelefo")) {
				jButtonModificarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoTelefo")) {
				jButtonModificarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoTelefo")) {
				jButtonModificarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoTelefo")) {
				jButtonActualizarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoTelefo")) {
				jButtonActualizarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoTelefo")) {
				jButtonActualizarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoTelefo")) {
				jButtonEliminarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoTelefo")) {
				jButtonEliminarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoTelefo")) {
				jButtonEliminarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoTelefo")) {
				jButtonCancelarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoTelefo")) {
				jButtonCancelarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoTelefo")) {
				jButtonCancelarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoTelefo")) {
				jButtonCerrarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoTelefo")) {
				jButtonCerrarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoTelefo")) {
				jButtonCerrarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoTelefo")) {
				jButtonMostrarOcultarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoTelefo")) {
				jButtonCancelarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoTelefo")) {
				jButtonGuardarCambiosTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoTelefo")) {
				jButtonGuardarCambiosTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoTelefo")) {
				jButtonCopiarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoTelefo")) {
				jButtonVerFormTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoTelefo")) {
				jButtonGuardarCambiosTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoTelefo")) {
				jButtonCopiarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoTelefo")) {
				jButtonVerFormTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoTelefo")) {
				jButtonGuardarCambiosTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoTelefo")) {
				jButtonGuardarCambiosTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoTelefo")) {
				jButtonGuardarCambiosTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoTelefo")) {
				jButtonRecargarInformacionTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoTelefo")) {
				jButtonRecargarInformacionTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoTelefo")) {
				jButtonRecargarInformacionTipoTelefoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoTelefo")) {
				jButtonAnterioresTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoTelefo")) {
				jButtonAnterioresTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoTelefo")) {
				jButtonAnterioresTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoTelefo")) {
				jButtonSiguientesTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoTelefo")) {
				jButtonSiguientesTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoTelefo")) {
				jButtonSiguientesTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoTelefo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoTelefo")) {
				jButtonAbrirOrderByTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoTelefo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoTelefo")) {
				jButtonMostrarOcultarTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTelefo")) {
				jButtonNuevoGuardarCambiosTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoTelefo")) {
				jButtonNuevoGuardarCambiosTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoTelefo")) {
				jButtonNuevoGuardarCambiosTipoTelefoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoTelefo")) {
				jButtonCerrarReporteDinamicoTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoTelefo")) {
				jButtonGenerarReporteDinamicoTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoTelefo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoTelefoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoTelefo")) {
				jButtonCerrarImportacionTipoTelefoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoTelefo")) {
				
				jButtonGenerarImportacionTipoTelefoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoTelefo")) {
				
				jButtonAbrirImportacionTipoTelefoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoTelefo")) {
				jComboBoxTiposAccionesTipoTelefoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoTelefo")) {
				jComboBoxTiposRelacionesTipoTelefoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoTelefo")) {
				jComboBoxTiposAccionesTipoTelefoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoTelefo")) {
				
				jComboBoxTiposSeleccionarTipoTelefoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoTelefo")) {
				jTextFieldValorCampoGeneralTipoTelefoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoTelefo")) {
				jButtonAbrirOrderByTipoTelefoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoTelefo")) {
				jButtonAbrirOrderByTipoTelefoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoTelefo")) {
				jButtonCerrarOrderByTipoTelefoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTelefoBusqueda")) {
				this.jButtonidTipoTelefoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoTelefoUpdate")) {
				this.jButtonid_empresaTipoTelefoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoTelefoBusqueda")) {
				this.jButtonid_empresaTipoTelefoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoTelefoBusqueda")) {
				this.jButtoncodigoTipoTelefoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTelefoBusqueda")) {
				this.jButtonnombreTipoTelefoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoTelefo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTelefoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				


				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTelefo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTelefo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoTelefo tipotelefoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipotelefoLocal=this.tipotelefo;
			} else {
				tipotelefoLocal=this.tipotelefoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
							
				
				


				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTelefo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTelefo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTelefoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoAnterior =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotelefoAnterior =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
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
			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			
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
			
			


			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTelefoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
								
						
				


				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTelefo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTelefo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
								
				
				


				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTelefo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTelefo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTelefoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoAnterior =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotelefoAnterior =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTelefoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoAnterior =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotelefoAnterior =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTelefoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
							
				
				


				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTelefo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTelefo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTelefoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotelefoAnterior =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipotelefoAnterior =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
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
			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			
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
			
			


			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTelefoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
								
				
				


				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTelefo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTelefo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTelefoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoAnterior =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotelefoAnterior =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTelefoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTelefoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoTelefo")) {
					jCheckBoxSeleccionarTodosTipoTelefoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoTelefo")) {
					jCheckBoxSeleccionadosTipoTelefoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoTelefo")) {
					
				}
				
				


				
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTelefo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTelefo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
												
				
				


				
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTelefo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTelefo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTelefoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotelefoAnterior =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipotelefoAnterior =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTelefoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
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
			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
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
			
			


			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTelefoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTelefo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTelefo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotelefo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotelefo);
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
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
				
				


				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTelefo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTelefo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTelefoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotelefoAnterior =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotelefoAnterior =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoTelefo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoTelefoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoTelefo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipotelefo =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipotelefo =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipotelefo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoTelefo")) {
				
				}
				
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoTelefo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoTelefo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoTelefo")) {
			
			}
			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoTelefo();
			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoTelefo")) {
				jButtonNuevoTipoTelefoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoTelefo")) {
				jButtonDuplicarTipoTelefoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoTelefo")) {
				jButtonCopiarTipoTelefoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoTelefo")) {
				jButtonVerFormTipoTelefoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoTelefo")) {
				jButtonNuevoTipoTelefoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoTelefo")) {
				jButtonModificarTipoTelefoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoTelefo")) {
				jButtonActualizarTipoTelefoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoTelefo")) {
				jButtonEliminarTipoTelefoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoTelefo")) {
				jButtonGuardarCambiosTipoTelefoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoTelefo")) {
				jButtonCancelarTipoTelefoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoTelefo")) {
				jButtonCerrarTipoTelefoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoTelefo")) {
				jButtonGuardarCambiosTipoTelefoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTelefo")) {
				jButtonNuevoGuardarCambiosTipoTelefoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoTelefo")) {
				jButtonAbrirOrderByTipoTelefoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoTelefo")) {
				jButtonRecargarInformacionTipoTelefoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoTelefo")) {
				jButtonAnterioresTipoTelefoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoTelefo")) {
				jButtonSiguientesTipoTelefoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTelefoBusqueda")) {
				this.jButtonidTipoTelefoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoTelefoUpdate")) {
				this.jButtonid_empresaTipoTelefoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoTelefoBusqueda")) {
				this.jButtonid_empresaTipoTelefoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoTelefoBusqueda")) {
				this.jButtoncodigoTipoTelefoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTelefoBusqueda")) {
				this.jButtonnombreTipoTelefoBusquedaActionPerformed(evt);
			}
			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoTelefo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoTelefo")) {
				closingInternalFrameTipoTelefo();
				
			} else if(sTipo.equals("jButtonCancelarTipoTelefo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoTelefo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoTelefoBeanSwingJInternalFrame jInternalFrameParent=(TipoTelefoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTelefo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoTelefoActionPerformed(null);
			}
			
			TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipotelefo,new Object(),this.tipotelefoParameterGeneral,this.tipotelefoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoTelefo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoTelefo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoTelefo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipotelefo)) {
			if(!esControlTabla) {
				if(TipoTelefoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoTelefo(this.tipotelefo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);			
				}
				
				if(this.tipotelefoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoTelefo(this.tipotelefo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipotelefoReturnGeneral=tipotelefoLogic.procesarEventosTipoTelefosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotelefoLogic.getTipoTelefos(),this.tipotelefo,this.tipotelefoParameterGeneral,this.isEsNuevoTipoTelefo,classes);//this.tipotelefoLogic.getTipoTelefo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoTelefo(this.tipotelefoReturnGeneral,this.tipotelefoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipotelefoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoTelefo(classes,this.tipotelefoReturnGeneral,this.tipotelefoBean,false);
					}
						
					if(this.tipotelefoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoTelefo(this.tipotelefoReturnGeneral.getTipoTelefo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoTelefo(this.tipotelefoReturnGeneral.getTipoTelefo());	
					}
						
					if(this.tipotelefoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoTelefo(this.tipotelefoReturnGeneral.getTipoTelefo(),classes);//this.tipotelefoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoTelefo(this.tipotelefo,classes);//this.tipotelefoBean);									
				}
			
				if(TipoTelefoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoTelefo(this.tipotelefo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTelefo(this.tipotelefo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipotelefoAnterior!=null) {
						this.tipotelefo=this.tipotelefoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipotelefoReturnGeneral=tipotelefoLogic.procesarEventosTipoTelefosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotelefoLogic.getTipoTelefos(),this.tipotelefo,this.tipotelefoParameterGeneral,this.isEsNuevoTipoTelefo,classes);//this.tipotelefoLogic.getTipoTelefo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipotelefoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipotelefoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipotelefoReturnGeneral.getTipoTelefo(),tipotelefoLogic.getTipoTelefos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipotelefoReturnGeneral.getTipoTelefo(),this.tipotelefos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoTelefo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoTelefo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoTelefo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoTelefo() throws Exception {
		
		TipoTelefoModel tipotelefoModel=(TipoTelefoModel)this.jTableDatosTipoTelefo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotelefoModel.tipotelefos=this.tipotelefoLogic.getTipoTelefos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipotelefoModel.tipotelefos=this.tipotelefos;
		}
		
		
		((TipoTelefoModel) this.jTableDatosTipoTelefo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoTelefo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipotelefoAnterior(),this.tipotelefoLogic.getTipoTelefos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipotelefoAnterior(),this.tipotelefos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoTelefo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoTelefo(TipoTelefo tipotelefo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Telefono.class)) {
					this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.setTelefonos(tipotelefo.getTelefonos());
					this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTelefono(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
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
										
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotelefo,new Object(),generalEntityParameterGeneral,this.tipotelefoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipotelefoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoTelefoConstantesFunciones.getClassesRelationshipsOfTipoTelefo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoTelefoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoTelefo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoTelefo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoTelefoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotelefo,new Object(),generalEntityParameterGeneral,this.tipotelefoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoTelefo(TipoTelefoBean tipotelefoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Telefono.class)) {
					this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.setTelefonos(tipotelefo.getTelefonos());
					this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTelefono(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoTelefo(ArrayList<Classe> classes,TipoTelefoReturnGeneral tipotelefoReturnGeneral,TipoTelefoBean tipotelefoBean,Boolean conDefault) throws Exception {
		
			this.tipotelefoBean.setTelefonos(tipotelefoReturnGeneral.getTipoTelefo().getTelefonos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoTelefo(TipoTelefo tipotelefo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Telefono.class)) {
					tipotelefo.setTelefonos(this.jInternalFrameDetalleFormTipoTelefo.telefonoBeanSwingJInternalFrame.telefonoLogic.getTelefonos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipotelefo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoTelefo = new TipoTelefoDetalleFormJInternalFrame(jDesktopPane,this.tipotelefoSessionBean.getConGuardarRelaciones(),this.tipotelefoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTelefo);
		this.jInternalFrameDetalleFormTipoTelefo.setVisible(false);
		this.jInternalFrameDetalleFormTipoTelefo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoTelefo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoTelefo.tipotelefoLogic=this.tipotelefoLogic;
		
		this.cargarCombosFrameForeignKeyTipoTelefo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTelefo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTelefo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoTelefo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoTelefo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoTelefo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTelefo"));
		
		this.jInternalFrameDetalleFormTipoTelefo.jButtonModificarTipoTelefo.addActionListener(new ButtonActionListener(this,"ModificarTipoTelefo"));

		
		this.jInternalFrameDetalleFormTipoTelefo.jButtonModificarToolBarTipoTelefo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTelefo"));
					
		this.jInternalFrameDetalleFormTipoTelefo.jMenuItemModificarTipoTelefo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTelefo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTelefo.jButtonActualizarTipoTelefo.addActionListener (new ButtonActionListener(this,"ActualizarTipoTelefo"));
		
		
		this.jInternalFrameDetalleFormTipoTelefo.jButtonActualizarToolBarTipoTelefo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTelefo"));
						
		this.jInternalFrameDetalleFormTipoTelefo.jMenuItemActualizarTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTelefo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTelefo.jButtonEliminarTipoTelefo.addActionListener (new ButtonActionListener(this,"EliminarTipoTelefo"));
		
		
		this.jInternalFrameDetalleFormTipoTelefo.jButtonEliminarToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTelefo"));
								
		this.jInternalFrameDetalleFormTipoTelefo.jMenuItemEliminarTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTelefo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTelefo.jButtonCancelarTipoTelefo.addActionListener (new ButtonActionListener(this,"CancelarTipoTelefo"));
		
		
		this.jInternalFrameDetalleFormTipoTelefo.jButtonCancelarToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTelefo"));
					
		this.jInternalFrameDetalleFormTipoTelefo.jMenuItemCancelarTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTelefo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoTelefo.jMenuItemDetalleCerrarTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTelefo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTelefo.jButtonGuardarCambiosToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTelefo"));
		
		
		
		this.jInternalFrameDetalleFormTipoTelefo.jButtonGuardarCambiosToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTelefo"));
		
		
		
		this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTelefo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTelefo.jButtonidTipoTelefoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTelefoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoTelefo.jButtonid_empresaTipoTelefoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoTelefoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTelefo.jButtonid_empresaTipoTelefoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoTelefoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTelefo.jButtoncodigoTipoTelefoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTelefoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTelefo.jButtonnombreTipoTelefoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTelefoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoTelefo.jTabbedPaneRelacionesTipoTelefo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTelefo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoTelefo"));
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTelefo"));
		}
		
		this.jTableDatosTipoTelefo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoTelefo"));
		
		this.jTableDatosTipoTelefo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoTelefo"));
		
		this.jButtonNuevoTipoTelefo.addActionListener(new ButtonActionListener(this,"NuevoTipoTelefo"));
		
		this.jButtonDuplicarTipoTelefo.addActionListener(new ButtonActionListener(this,"DuplicarTipoTelefo"));
		
		this.jButtonCopiarTipoTelefo.addActionListener(new ButtonActionListener(this,"CopiarTipoTelefo"));
		
		this.jButtonVerFormTipoTelefo.addActionListener(new ButtonActionListener(this,"VerFormTipoTelefo"));
		
		
		this.jButtonNuevoToolBarTipoTelefo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoTelefo"));
			
		this.jButtonDuplicarToolBarTipoTelefo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoTelefo"));
			
		this.jMenuItemNuevoTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoTelefo"));
			
		this.jMenuItemDuplicarTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoTelefo"));		
		
		
		this.jButtonNuevoRelacionesTipoTelefo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoTelefo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoTelefo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoTelefo"));
			
		this.jMenuItemNuevoRelacionesTipoTelefo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoTelefo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.jButtonModificarTipoTelefo.addActionListener(new ButtonActionListener(this,"ModificarTipoTelefo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.jButtonModificarToolBarTipoTelefo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTelefo"));
			
			this.jInternalFrameDetalleFormTipoTelefo.jMenuItemModificarTipoTelefo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTelefo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoTelefo.jButtonActualizarTipoTelefo.addActionListener (new ButtonActionListener(this,"ActualizarTipoTelefo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.jButtonActualizarToolBarTipoTelefo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTelefo"));
				
			this.jInternalFrameDetalleFormTipoTelefo.jMenuItemActualizarTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTelefo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.jButtonEliminarTipoTelefo.addActionListener (new ButtonActionListener(this,"EliminarTipoTelefo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.jButtonEliminarToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTelefo"));
						
			this.jInternalFrameDetalleFormTipoTelefo.jMenuItemEliminarTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTelefo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.jButtonCancelarTipoTelefo.addActionListener (new ButtonActionListener(this,"CancelarTipoTelefo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.jButtonCancelarToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTelefo"));
			
			this.jInternalFrameDetalleFormTipoTelefo.jMenuItemCancelarTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTelefo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoTelefo"));		
		
		
		this.jButtonCerrarTipoTelefo.addActionListener (new ButtonActionListener(this,"CerrarTipoTelefo"));
		
		
		this.jButtonCerrarToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoTelefo"));
			
		this.jMenuItemCerrarTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoTelefo"));
			
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.jMenuItemDetalleCerrarTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTelefo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.jButtonGuardarCambiosTipoTelefo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoTelefo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.jButtonGuardarCambiosToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTelefo"));
		}
		
		this.jButtonCopiarToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoTelefo"));
			
		this.jButtonVerFormToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoTelefo"));
		
		this.jMenuItemGuardarCambiosTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoTelefo"));
			
		this.jMenuItemCopiarTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoTelefo"));		
		
		this.jMenuItemVerFormTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoTelefo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoTelefo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTelefo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoTelefo"));
			
		this.jMenuItemGuardarCambiosTablaTipoTelefo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTelefo"));		
		
		
		
		this.jButtonRecargarInformacionTipoTelefo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoTelefo"));
					
		this.jButtonRecargarInformacionToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoTelefo"));
		
		this.jMenuItemRecargarInformacionTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoTelefo"));		
		
		
		
		this.jButtonAnterioresTipoTelefo.addActionListener (new ButtonActionListener(this,"AnterioresTipoTelefo"));
		
		
		this.jButtonAnterioresToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoTelefo"));
		
		this.jMenuItemAnterioresTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoTelefo"));		
		
		
		this.jButtonSiguientesTipoTelefo.addActionListener (new ButtonActionListener(this,"SiguientesTipoTelefo"));
		
		
		this.jButtonSiguientesToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoTelefo"));
			
		this.jMenuItemSiguientesTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoTelefo"));
			
		this.jMenuItemAbrirOrderByTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoTelefo"));
			
		this.jMenuItemMostrarOcultarTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoTelefo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoTelefo"));
			
		this.jMenuItemDetalleMostarOcultarTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoTelefo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoTelefo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoTelefo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoTelefo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoTelefo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoTelefo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoTelefo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoTelefo"));

		this.jCheckBoxSeleccionadosTipoTelefo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoTelefo"));
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTelefo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoTelefo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoTelefo"));
			
		this.jComboBoxTiposAccionesTipoTelefo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoTelefo"));
					
		this.jComboBoxTiposSeleccionarTipoTelefo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoTelefo"));
			
		this.jTextFieldValorCampoGeneralTipoTelefo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoTelefo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTelefo.jButtonidTipoTelefoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTelefoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoTelefo.jButtonid_empresaTipoTelefoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoTelefoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTelefo.jButtonid_empresaTipoTelefoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoTelefoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTelefo.jButtoncodigoTipoTelefoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTelefoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTelefo.jButtonnombreTipoTelefoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTelefoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoTelefo!=null) {
				this.jInternalFrameReporteDinamicoTipoTelefo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTelefo"));
				this.jInternalFrameReporteDinamicoTipoTelefo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTelefo"));
				this.jInternalFrameReporteDinamicoTipoTelefo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTelefo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoTelefo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTelefo"));				
			//this.jButtonGenerarReporteDinamicoTipoTelefo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTelefo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoTelefo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTelefo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoTelefo!=null) {
				this.jInternalFrameImportacionTipoTelefo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTelefo"));
				this.jInternalFrameImportacionTipoTelefo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTelefo"));
				this.jInternalFrameImportacionTipoTelefo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTelefo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoTelefo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoTelefo"));
			
			this.jButtonAbrirOrderByToolBarTipoTelefo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoTelefo"));			
			
			if(this.jInternalFrameOrderByTipoTelefo!=null) {
				this.jInternalFrameOrderByTipoTelefo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTelefo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTelefo.jTabbedPaneRelacionesTipoTelefo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTelefo"));
		
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
            		closingInternalFrameTipoTelefo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoTelefo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoTelefo = (JInternalFrameBase)event.getSource();
	            	
	            TipoTelefoBeanSwingJInternalFrame jInternalFrameParent=(TipoTelefoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTelefo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoTelefoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoTelefo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoTelefoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoTelefo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoTelefo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTelefoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTelefoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTelefoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoTelefo";
		inputMap = this.jButtonNuevoTipoTelefo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoTelefo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTelefoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTelefoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTelefoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTelefoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoTelefo";
		inputMap = this.jButtonNuevoRelacionesTipoTelefo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoTelefo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTelefoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoTelefo";
		inputMap = this.jButtonModificarTipoTelefo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoTelefo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoTelefoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoTelefo";
		inputMap = this.jButtonActualizarTipoTelefo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoTelefo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoTelefoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoTelefo";
		inputMap = this.jButtonEliminarTipoTelefo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoTelefo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoTelefoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoTelefo";
		inputMap = this.jButtonCancelarTipoTelefo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoTelefo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoTelefoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoTelefo";
		inputMap = this.jButtonCerrarTipoTelefo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoTelefo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoTelefoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoTelefo.jButtonGuardarCambiosTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoTelefo";
		inputMap = this.jInternalFrameDetalleFormTipoTelefo.jButtonGuardarCambiosTipoTelefo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoTelefo.jButtonGuardarCambiosTipoTelefo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoTelefoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoTelefo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoTelefoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoTelefo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoTelefoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoTelefo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoTelefoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoTelefo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoTelefoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTelefo.jButtonidTipoTelefoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTelefoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoTelefo.jButtonid_empresaTipoTelefoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoTelefoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTelefo.jButtonid_empresaTipoTelefoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoTelefoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTelefo.jButtoncodigoTipoTelefoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoTelefoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTelefo.jButtonnombreTipoTelefoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTelefoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoTelefo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoTelefoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoTelefoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoTelefo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoTelefo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoTelefo tipotelefoAux:this.tipotelefoLogic.getTipoTelefos()) {
					tipotelefoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTelefo tipotelefoAux:tipotelefos) {
					tipotelefoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoTelefoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTelefo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTelefo tipotelefoAux:this.tipotelefoLogic.getTipoTelefos()) {
						tipotelefoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTelefo tipotelefoAux:tipotelefos) {
						tipotelefoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoTelefo tipotelefoAux:this.tipotelefoLogic.getTipoTelefos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTelefo tipotelefoAux:tipotelefos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTelefo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTelefo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTelefo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTelefo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoTelefoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTelefo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoTelefo.getSelectedRows();
			
			TipoTelefo tipotelefoLocal=new TipoTelefo();
			
			//this.seleccionarTodosTipoTelefo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotelefoLocal =(TipoTelefo) this.tipotelefoLogic.getTipoTelefos().toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipotelefoLocal =(TipoTelefo) this.tipotelefos.toArray()[this.jTableDatosTipoTelefo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipotelefoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTelefo tipotelefoAux:this.tipotelefoLogic.getTipoTelefos()) {
						tipotelefoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTelefo tipotelefoAux:tipotelefos) {
						tipotelefoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoTelefo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTelefo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTelefo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTelefo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoTelefoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoTelefoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoTelefoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoTelefo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoTelefo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTelefo tipotelefoAux:this.tipotelefoLogic.getTipoTelefos()) {
				
						if(sTipoSeleccionar.equals(TipoTelefoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipotelefoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTelefoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipotelefoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTelefo tipotelefoAux:tipotelefos) {
					
						if(sTipoSeleccionar.equals(TipoTelefoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipotelefoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTelefoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipotelefoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTelefo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoTelefoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoTelefo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoTelefo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoTelefo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoTelefo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoTelefo(conSplash);
				
					this.generarReporteTipoTelefosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTelefo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoTelefosSeleccionados();
				//this.jComboBoxTiposAccionesTipoTelefo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTelefosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoTelefo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTelefosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoTelefo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTelefo();
				
				this.exportarTipoTelefosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTelefo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoTelefos();
				//this.importarTipoTelefos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTelefo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTelefo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoTelefosSeleccionados();
				//this.jComboBoxTiposAccionesTipoTelefo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Telefo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoTelefo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoTelefo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoTelefo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Telefo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTelefo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoTelefoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoTelefo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoTelefo(conSplash);
					
						//this.actualizarParametrosGeneralTipoTelefo();
						
						this.generarReporteProcesoAccionTipoTelefosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoTelefo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoTelefoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo TelefoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Telefo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoTelefo();
				
						this.actualizarParametrosGeneralTipoTelefo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipotelefoReturnGeneral=tipotelefoLogic.procesarAccionTipoTelefosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipotelefoLogic.getTipoTelefos(),this.tipotelefoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoTelefoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoTelefo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoTelefo();
					
					TipoTelefoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoTelefoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoTelefo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoTelefo.jComboBoxTiposAccionesFormularioTipoTelefo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoTelefo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoTelefoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoTelefo();
			
			if(this.jInternalFrameDetalleFormTipoTelefo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();		
			TipoTelefo tipotelefo=new TipoTelefo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoTelefo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoTelefo.getSelectedItem();
			
			
			
			
			tipotelefosSeleccionados=this.getTipoTelefosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipotelefosSeleccionados.size()==1) {
				for(TipoTelefo tipotelefoAux:tipotelefosSeleccionados) {
					tipotelefo=tipotelefoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Telefono")) {
					jButtonTelefonoActionPerformed(null,rowIndex,true,false,tipotelefo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoTelefo();
			
      		//this.finishProcessTipoTelefo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoTelefoReturnGeneral() throws Exception {
		if(this.tipotelefoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipotelefoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipotelefoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipotelefoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipotelefoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipotelefoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoTelefo(false);
		}
		
		if(this.tipotelefoReturnGeneral.getConRetornoLista() || this.tipotelefoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipotelefoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipotelefoLogic.setTipoTelefos(this.tipotelefoReturnGeneral.getTipoTelefos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipotelefoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipotelefoLogic.setTipoTelefo(this.tipotelefoReturnGeneral.getTipoTelefo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoTelefo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoTelefo() throws Exception {
		
		
	}
	
	public ArrayList<TipoTelefo> getTipoTelefosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoTelefo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoTelefo tipotelefoAux:tipotelefoLogic.getTipoTelefos()) {
					if(tipotelefoAux.getIsSelected()) {
						tipotelefosSeleccionados.add(tipotelefoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTelefo tipotelefoAux:this.tipotelefos) {
					if(tipotelefoAux.getIsSelected()) {
						tipotelefosSeleccionados.add(tipotelefoAux);				
					}
				}
			}
			
			if(tipotelefosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipotelefosSeleccionados.addAll(this.tipotelefoLogic.getTipoTelefos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipotelefosSeleccionados.addAll(this.tipotelefos);				
					}
				}
			}
		} else {
			tipotelefosSeleccionados.add(this.tipotelefo);
		}
		
		return tipotelefosSeleccionados;
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
	
	public void generarReporteTipoTelefosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoTelefosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoTelefosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTelefosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTelefosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoTelefosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Telefo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoTelefosSeleccionados() throws Exception {
		ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();		
		
		tipotelefosSeleccionados=this.getTipoTelefosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoTelefos("Todos",tipotelefosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoTelefosSeleccionados() throws Exception {
		ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();		
		
		tipotelefosSeleccionados=this.getTipoTelefosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoTelefos("Todos",tipotelefosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoTelefosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();
		
		tipotelefosSeleccionados=this.getTipoTelefosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoTelefos("Todos",tipotelefosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoTelefosSeleccionados() throws Exception {
		ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoTelefo();
		
		
		tipotelefosSeleccionados=this.getTipoTelefosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoTelefo();
		
		
		//this.generarReporteTipoTelefos("Todos",tipotelefosSeleccionados ,tipotelefoImplementable,tipotelefoImplementableHome);
	}
	
	public void mostrarImportacionTipoTelefos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoTelefo();
		
		this.abrirFrameImportacionTipoTelefo();		
		
			
		//this.generarReporteTipoTelefos("Todos",tipotelefosSeleccionados ,tipotelefoImplementable,tipotelefoImplementableHome);
	}
	
	public void importarTipoTelefos() throws Exception {		
	
	}
	
	public void exportarTipoTelefosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoTelefosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoTelefosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoTelefosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Telefo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoTelefosSeleccionados() throws Exception {
		ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();		
		
		tipotelefosSeleccionados=this.getTipoTelefosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotelefo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoTelefo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoTelefo tipotelefoAux:tipotelefosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoTelefo(tipotelefoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipotelefoAux.setsDetalleGeneralEntityReporte(tipotelefoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Telefo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoTelefo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoTelefoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTelefoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTelefoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTelefoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTelefoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoTelefo(TipoTelefo tipotelefo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipotelefo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotelefo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotelefo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotelefo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotelefo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoTelefosSeleccionados() throws Exception {
		ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();		
		
		tipotelefosSeleccionados=this.getTipoTelefosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotelefo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoTelefos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoTelefo(row);				
				iRow++;
			}				
			
			for(TipoTelefo tipotelefoAux:tipotelefosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoTelefo(tipotelefoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Telefo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoTelefosSeleccionados() throws Exception {
		ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();		
		
		tipotelefosSeleccionados=this.getTipoTelefosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotelefo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipotelefos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipotelefo");
			//elementRoot.appendChild(element);
		
			for(TipoTelefo tipotelefoAux:tipotelefosSeleccionados) {
				element = document.createElement("tipotelefo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoTelefo(tipotelefoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Telefo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoTelefo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTelefoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTelefoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoTelefoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTelefoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTelefoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoTelefo(TipoTelefo tipotelefo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipotelefo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotelefo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotelefo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotelefo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoTelefo(TipoTelefo tipotelefo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoTelefoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipotelefo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoTelefoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipotelefo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoTelefoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipotelefo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoTelefoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipotelefo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoTelefoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipotelefo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoTelefosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoTelefo> tipotelefosSeleccionados=new ArrayList<TipoTelefo>();
		
		tipotelefosSeleccionados=this.getTipoTelefosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoTelefo(tipotelefosSeleccionados);
		
		this.generarReporteTipoTelefos("Todos",tipotelefosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoTelefo(ArrayList<TipoTelefo> tipotelefosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoTelefo tipotelefoAux:tipotelefosSeleccionados) {
				tipotelefoAux.setsDetalleGeneralEntityReporte(tipotelefoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoTelefoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipotelefoAux.setsDescripcionGeneralEntityReporte1(tipotelefoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoTelefoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipotelefoAux.setsDescripcionGeneralEntityReporte1(tipotelefoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoTelefoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipotelefoAux.setsDescripcionGeneralEntityReporte1(tipotelefoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTelefoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoTelefo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoTelefo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoTelefo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoTelefo=false;
			this.isVisibilidadCeldaActualizarTipoTelefo=false;
			this.isVisibilidadCeldaEliminarTipoTelefo=false;
			this.isVisibilidadCeldaCancelarTipoTelefo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTelefo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTelefo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoTelefo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTelefo=false;
			this.isVisibilidadCeldaModificarTipoTelefo=false;
			this.isVisibilidadCeldaActualizarTipoTelefo=true;
			this.isVisibilidadCeldaEliminarTipoTelefo=false;
			this.isVisibilidadCeldaCancelarTipoTelefo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTelefo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTelefo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoTelefo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTelefo=false;
			this.isVisibilidadCeldaModificarTipoTelefo=false;
			this.isVisibilidadCeldaActualizarTipoTelefo=true;
			this.isVisibilidadCeldaEliminarTipoTelefo=true;
			this.isVisibilidadCeldaCancelarTipoTelefo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTelefo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTelefo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoTelefo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTelefo=false;
			this.isVisibilidadCeldaModificarTipoTelefo=false;
			this.isVisibilidadCeldaActualizarTipoTelefo=true;
			this.isVisibilidadCeldaEliminarTipoTelefo=false;
			this.isVisibilidadCeldaCancelarTipoTelefo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTelefo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTelefo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoTelefo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTelefo=true;
			this.isVisibilidadCeldaModificarTipoTelefo=false;
			this.isVisibilidadCeldaActualizarTipoTelefo=false;
			this.isVisibilidadCeldaEliminarTipoTelefo=false;
			this.isVisibilidadCeldaCancelarTipoTelefo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTelefo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTelefo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoTelefo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTelefo=false;
			this.isVisibilidadCeldaActualizarTipoTelefo=false;
			this.isVisibilidadCeldaEliminarTipoTelefo=false;
			this.isVisibilidadCeldaCancelarTipoTelefo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTelefo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTelefo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoTelefo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTelefo=false;
			this.isVisibilidadCeldaModificarTipoTelefo=true;
			this.isVisibilidadCeldaActualizarTipoTelefo=false;
			this.isVisibilidadCeldaEliminarTipoTelefo=false;
			this.isVisibilidadCeldaCancelarTipoTelefo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTelefo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTelefo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoTelefoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoTelefo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTelefo=true;
		} else {
			this.actualizarEstadoPanelsTipoTelefo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoTelefo=false;
			//this.isVisibilidadCeldaVerFormTipoTelefo=false;
			this.isVisibilidadCeldaDuplicarTipoTelefo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipotelefoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoTelefo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTelefo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipotelefoSessionBean.getEsGuardarRelacionado()) {
			if(!tipotelefoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=false;												
			}
			
			this.jButtonCerrarTipoTelefo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTelefo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipotelefo)) {
			this.isVisibilidadCeldaActualizarTipoTelefo=false;
			this.isVisibilidadCeldaEliminarTipoTelefo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTelefo() {
		this.isVisibilidadCeldaNuevoTipoTelefo=false;
		this.isVisibilidadCeldaGuardarCambiosTipoTelefo=false;
	}
	
	public void actualizarEstadoPanelsTipoTelefo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoTelefo!=null) {
				this.jScrollPanelDatosEdicionTipoTelefo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTelefo!=null) {
				this.jTabbedPaneBusquedasTipoTelefo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTelefo!=null) {
				this.jScrollPanelDatosTipoTelefo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTelefo!=null) {
				this.jPanelPaginacionTipoTelefo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTelefo!=null) {
				this.jPanelParametrosReportesTipoTelefo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoTelefo!=null) {
				this.jScrollPanelDatosEdicionTipoTelefo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTelefo!=null) {
				this.jTabbedPaneBusquedasTipoTelefo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoTelefo!=null) {
				this.jScrollPanelDatosTipoTelefo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTelefo!=null) {
				this.jPanelPaginacionTipoTelefo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTelefo!=null) {
				this.jPanelParametrosReportesTipoTelefo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoTelefo!=null) {
				this.jScrollPanelDatosEdicionTipoTelefo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTelefo!=null) {
				this.jTabbedPaneBusquedasTipoTelefo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTelefo!=null) {
				this.jScrollPanelDatosTipoTelefo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTelefo!=null) {
				this.jPanelPaginacionTipoTelefo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTelefo!=null) {
				this.jPanelParametrosReportesTipoTelefo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoTelefo!=null) {
				this.jScrollPanelDatosEdicionTipoTelefo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTelefo!=null) {
				this.jTabbedPaneBusquedasTipoTelefo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTelefo!=null) {
				this.jScrollPanelDatosTipoTelefo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTelefo!=null) {
				this.jPanelPaginacionTipoTelefo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTelefo!=null) {
				this.jPanelParametrosReportesTipoTelefo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoTelefo!=null) {
				this.jScrollPanelDatosEdicionTipoTelefo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTelefo!=null) {
				this.jTabbedPaneBusquedasTipoTelefo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTelefo!=null) {
				this.jScrollPanelDatosTipoTelefo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTelefo!=null) {
				this.jPanelPaginacionTipoTelefo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTelefo!=null) {
				this.jPanelParametrosReportesTipoTelefo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoTelefo!=null) {
				this.jScrollPanelDatosEdicionTipoTelefo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTelefo!=null) {
				this.jTabbedPaneBusquedasTipoTelefo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTelefo!=null) {
				this.jScrollPanelDatosTipoTelefo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTelefo!=null) {
				this.jPanelPaginacionTipoTelefo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTelefo!=null) {
				this.jPanelParametrosReportesTipoTelefo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoTelefo!=null) {
				this.jScrollPanelDatosEdicionTipoTelefo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTelefo!=null) {
				this.jTabbedPaneBusquedasTipoTelefo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTelefo!=null) {
				this.jScrollPanelDatosTipoTelefo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTelefo!=null) {
				this.jPanelPaginacionTipoTelefo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTelefo!=null) {
				this.jPanelParametrosReportesTipoTelefo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoTelefo!=null) {
					this.jTabbedPaneBusquedasTipoTelefo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoTelefo!=null) {
				this.jPanelParametrosReportesTipoTelefo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipotelefoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTelefo!=null) {
				this.jTabbedPaneBusquedasTipoTelefo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoTelefo!=null) {
				this.jPanelParametrosReportesTipoTelefo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoTelefoParaTelefonos() throws Exception {
		Boolean isPaginaPopupTelefono=false;

		try {

			if(this.tipotelefoSessionBean==null) {
				this.tipotelefoSessionBean=new TipoTelefoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoTelefo.telefonoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoTelefo.telefonoSessionBean=new TelefonoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoTelefo.telefonoSessionBean.setsPathNavegacionActual(tipotelefoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TelefonoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoTelefo.telefonoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTelefono=this.jInternalFrameDetalleFormTipoTelefo.telefonoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoTelefo.telefonoSessionBean.setPaginaPopupVariables(true);
			this.jInternalFrameDetalleFormTipoTelefo.telefonoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTelefono(false);
			this.jInternalFrameDetalleFormTipoTelefo.telefonoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTelefono(TipoTelefoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoTelefo.telefonoSessionBean.setisBusquedaDesdeForeignKeySesionTipoTelefo(true);
			this.jInternalFrameDetalleFormTipoTelefo.telefonoSessionBean.setlidTipoTelefoActual(this.idTipoTelefoActual);

			tipotelefoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoTelefo(true);
			tipotelefoSessionBean.setlIdTipoTelefoActualForeignKey(this.idTipoTelefoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoTelefoSessionBean tipotelefoSessionBean=new TipoTelefoSessionBean();
		
		if(this.tipotelefoSessionBean==null) {
			this.tipotelefoSessionBean=new TipoTelefoSessionBean();
		}
		
		this.tipotelefoSessionBean.setsUltimaBusquedaTipoTelefo(this.getsAccionBusqueda());
		this.tipotelefoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipotelefoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipotelefoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoTelefoSessionBean tipotelefoSessionBean=new TipoTelefoSessionBean();
		
		if(this.tipotelefoSessionBean==null) {
			this.tipotelefoSessionBean=new TipoTelefoSessionBean();
		}
		
		if(this.tipotelefoSessionBean.getsUltimaBusquedaTipoTelefo()!=null&&!this.tipotelefoSessionBean.getsUltimaBusquedaTipoTelefo().equals("")) {
			this.setsAccionBusqueda(tipotelefoSessionBean.getsUltimaBusquedaTipoTelefo());
			this.setiNumeroPaginacion(tipotelefoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipotelefoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipotelefoSessionBean.getid_empresa());
				tipotelefoSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipotelefoSessionBean.setsUltimaBusquedaTipoTelefo("");
		this.tipotelefoSessionBean.setiNumeroPaginacion(TipoTelefoConstantesFunciones.INUMEROPAGINACION);
		this.tipotelefoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoTelefo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoTelefo() {
		this.updateBorderResaltarBusquedasFormularioTipoTelefo();
		this.updateVisibilidadBusquedasFormularioTipoTelefo();
		this.updateHabilitarBusquedasFormularioTipoTelefo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoTelefo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoTelefo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoTelefo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoTelefo.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoTelefo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoTelefo.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoTelefo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoTelefo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoTelefo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoTelefo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoTelefo();
		this.updateVisibilidadResaltarControlesFormularioTipoTelefo();
		this.updateHabilitarResaltarControlesFormularioTipoTelefo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoTelefo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTelefo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipotelefoConstantesFunciones.resaltaridTipoTelefo!=null && this.jInternalFrameDetalleFormTipoTelefo!=null) {this.jInternalFrameDetalleFormTipoTelefo.jLabelidTipoTelefo.setBorder(this.tipotelefoConstantesFunciones.resaltaridTipoTelefo);}
		if(this.tipotelefoConstantesFunciones.resaltarid_empresaTipoTelefo!=null && this.jInternalFrameDetalleFormTipoTelefo!=null) {this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.setBorder(this.tipotelefoConstantesFunciones.resaltarid_empresaTipoTelefo);}
		if(this.tipotelefoConstantesFunciones.resaltarcodigoTipoTelefo!=null && this.jInternalFrameDetalleFormTipoTelefo!=null) {this.jInternalFrameDetalleFormTipoTelefo.jTextFieldcodigoTipoTelefo.setBorder(this.tipotelefoConstantesFunciones.resaltarcodigoTipoTelefo);}
		if(this.tipotelefoConstantesFunciones.resaltarnombreTipoTelefo!=null && this.jInternalFrameDetalleFormTipoTelefo!=null) {this.jInternalFrameDetalleFormTipoTelefo.jTextAreanombreTipoTelefo.setBorder(this.tipotelefoConstantesFunciones.resaltarnombreTipoTelefo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoTelefo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoTelefo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
	
		//this.jInternalFrameDetalleFormTipoTelefo.jLabelidTipoTelefo.setVisible(this.tipotelefoConstantesFunciones.mostraridTipoTelefo);
		this.jInternalFrameDetalleFormTipoTelefo.jPanelidTipoTelefo.setVisible(this.tipotelefoConstantesFunciones.mostraridTipoTelefo);
		//this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.setVisible(this.tipotelefoConstantesFunciones.mostrarid_empresaTipoTelefo);
		this.jInternalFrameDetalleFormTipoTelefo.jPanelid_empresaTipoTelefo.setVisible(this.tipotelefoConstantesFunciones.mostrarid_empresaTipoTelefo);
		//this.jInternalFrameDetalleFormTipoTelefo.jTextFieldcodigoTipoTelefo.setVisible(this.tipotelefoConstantesFunciones.mostrarcodigoTipoTelefo);
		this.jInternalFrameDetalleFormTipoTelefo.jPanelcodigoTipoTelefo.setVisible(this.tipotelefoConstantesFunciones.mostrarcodigoTipoTelefo);
		//this.jInternalFrameDetalleFormTipoTelefo.jTextAreanombreTipoTelefo.setVisible(this.tipotelefoConstantesFunciones.mostrarnombreTipoTelefo);
		this.jInternalFrameDetalleFormTipoTelefo.jPanelnombreTipoTelefo.setVisible(this.tipotelefoConstantesFunciones.mostrarnombreTipoTelefo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoTelefo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTelefo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTelefo!=null) {
	
		this.jInternalFrameDetalleFormTipoTelefo.jLabelidTipoTelefo.setEnabled(this.tipotelefoConstantesFunciones.activaridTipoTelefo);
		this.jInternalFrameDetalleFormTipoTelefo.jComboBoxid_empresaTipoTelefo.setEnabled(this.tipotelefoConstantesFunciones.activarid_empresaTipoTelefo);
		this.jInternalFrameDetalleFormTipoTelefo.jTextFieldcodigoTipoTelefo.setEnabled(this.tipotelefoConstantesFunciones.activarcodigoTipoTelefo);
		this.jInternalFrameDetalleFormTipoTelefo.jTextAreanombreTipoTelefo.setEnabled(this.tipotelefoConstantesFunciones.activarnombreTipoTelefo);
		}
	}
	
		
}