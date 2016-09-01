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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.EstadoRegistroFormaPagoBancoConstantesFunciones;
import com.bydan.erp.tesoreria.util.EstadoRegistroFormaPagoBancoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.EstadoRegistroFormaPagoBancoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.EstadoRegistroFormaPagoBancoBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
public class EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame extends EstadoRegistroFormaPagoBancoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancoValidator = new ClassValidator<EstadoRegistroFormaPagoBanco>(EstadoRegistroFormaPagoBanco.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoRegistroFormaPagoBanco estadoregistroformapagobanco;	
	public EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux;
	public EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoRegistroFormaPagoBanco estadoregistroformapagobancoTotales;
	public Long idEstadoRegistroFormaPagoBancoActual;
	public Long iIdNuevoEstadoRegistroFormaPagoBanco=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosRegistroFormaPagoBanco=false;

	public Boolean getIsTienePermisosRegistroFormaPagoBanco() {
		return isTienePermisosRegistroFormaPagoBanco;
	}

	public void setIsTienePermisosRegistroFormaPagoBanco(Boolean isTienePermisosRegistroFormaPagoBanco) {
		this.isTienePermisosRegistroFormaPagoBanco= isTienePermisosRegistroFormaPagoBanco;
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
	
	public Boolean isPermisoTodoEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoNuevoEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoActualizarEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoActualizarOriginalEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoEliminarEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoConsultaEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoBusquedaEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoReporteEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoPaginacionMedioEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoPaginacionAltoEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoPaginacionTodoEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoCopiarEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoVerFormEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoDuplicarEstadoRegistroFormaPagoBanco;
	public Boolean isPermisoOrdenEstadoRegistroFormaPagoBanco;
	
	
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
	
	public EstadoRegistroFormaPagoBancoParameterReturnGeneral estadoregistroformapagobancoReturnGeneral;
	public EstadoRegistroFormaPagoBancoParameterReturnGeneral estadoregistroformapagobancoParameterGeneral;
	
	

	public RegistroFormaPagoBancoLogic registroformapagobancoLogic=null;

	public RegistroFormaPagoBancoLogic getRegistroFormaPagoBancoLogic() {
		return registroformapagobancoLogic;
	}

	public void setRegistroFormaPagoBancoLogic(RegistroFormaPagoBancoLogic registroformapagobancoLogic) {
		this.registroformapagobancoLogic = registroformapagobancoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoRegistroFormaPagoBanco=false;
	public Boolean esParaAccionDesdeFormularioEstadoRegistroFormaPagoBanco=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoRegistroFormaPagoBancoLogic estadoregistroformapagobancoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoRegistroFormaPagoBanco estadoregistroformapagobancoBean;
	public EstadoRegistroFormaPagoBancoConstantesFunciones estadoregistroformapagobancoConstantesFunciones;
	//public EstadoRegistroFormaPagoBancoParameterReturnGeneral estadoregistroformapagobancoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancos;	
	//public List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosEliminados;
	//public List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoRegistroFormaPagoBanco=true;
	public Boolean isVisibilidadCeldaCopiarEstadoRegistroFormaPagoBanco=true;
	public Boolean isVisibilidadCeldaVerFormEstadoRegistroFormaPagoBanco=true;
	public Boolean isVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=false;
	public Boolean isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco=false;
	public Boolean isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco=false;
	public Boolean isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco=false;
	public Boolean isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco=false;
	public Boolean isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=false;	
	
	
	
	public Long getiIdNuevoEstadoRegistroFormaPagoBanco() {
		return this.iIdNuevoEstadoRegistroFormaPagoBanco;
	}

	public void setiIdNuevoEstadoRegistroFormaPagoBanco(Long iIdNuevoEstadoRegistroFormaPagoBanco) {
		this.iIdNuevoEstadoRegistroFormaPagoBanco = iIdNuevoEstadoRegistroFormaPagoBanco;
	}
	
	public Long getidEstadoRegistroFormaPagoBancoActual() {
		return this.idEstadoRegistroFormaPagoBancoActual;
	}

	public void setidEstadoRegistroFormaPagoBancoActual(Long idEstadoRegistroFormaPagoBancoActual) {
		this.idEstadoRegistroFormaPagoBancoActual = idEstadoRegistroFormaPagoBancoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoRegistroFormaPagoBanco getestadoregistroformapagobanco() {
		return this.estadoregistroformapagobanco;
	}

	public void setestadoregistroformapagobanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco) {
		this.estadoregistroformapagobanco = estadoregistroformapagobanco;
	}
	
	public EstadoRegistroFormaPagoBanco getestadoregistroformapagobancoAux() {
		return this.estadoregistroformapagobancoAux;
	}

	public void setestadoregistroformapagobancoAux(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux) {
		this.estadoregistroformapagobancoAux = estadoregistroformapagobancoAux;
	}				
	
	public EstadoRegistroFormaPagoBanco getestadoregistroformapagobancoAnterior() {
		return this.estadoregistroformapagobancoAnterior;
	}

	public void setestadoregistroformapagobancoAnterior(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAnterior) {
		this.estadoregistroformapagobancoAnterior = estadoregistroformapagobancoAnterior;
	}	
	
	public EstadoRegistroFormaPagoBanco getestadoregistroformapagobancoTotales() {
		return this.estadoregistroformapagobancoTotales;
	}

	public void setestadoregistroformapagobancoTotales(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoTotales) {
		this.estadoregistroformapagobancoTotales = estadoregistroformapagobancoTotales;
	}	
	
	public EstadoRegistroFormaPagoBanco getestadoregistroformapagobancoBean() {
		return this.estadoregistroformapagobancoBean;
	}

	public void setestadoregistroformapagobancoBean(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoBean) {
		this.estadoregistroformapagobancoBean = estadoregistroformapagobancoBean;
	}	
	
	public EstadoRegistroFormaPagoBancoParameterReturnGeneral getestadoregistroformapagobancoReturnGeneral() {
		return this.estadoregistroformapagobancoReturnGeneral;
	}

	public void setestadoregistroformapagobancoReturnGeneral(EstadoRegistroFormaPagoBancoParameterReturnGeneral estadoregistroformapagobancoReturnGeneral) {
		this.estadoregistroformapagobancoReturnGeneral = estadoregistroformapagobancoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoRegistroFormaPagoBancoLogic getEstadoRegistroFormaPagoBancoLogic()	{		
		return estadoregistroformapagobancoLogic;
	}

	public void setEstadoRegistroFormaPagoBancoLogic(EstadoRegistroFormaPagoBancoLogic estadoregistroformapagobancoLogic) {
		this.estadoregistroformapagobancoLogic = estadoregistroformapagobancoLogic;
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
	
	public Boolean getIsEsNuevoEstadoRegistroFormaPagoBanco() {
		return isEsNuevoEstadoRegistroFormaPagoBanco;
	}

	public void setIsEsNuevoEstadoRegistroFormaPagoBanco(Boolean isEsNuevoEstadoRegistroFormaPagoBanco) {
		this.isEsNuevoEstadoRegistroFormaPagoBanco = isEsNuevoEstadoRegistroFormaPagoBanco;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoRegistroFormaPagoBanco() {
		return esParaAccionDesdeFormularioEstadoRegistroFormaPagoBanco;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoRegistroFormaPagoBanco(Boolean esParaAccionDesdeFormularioEstadoRegistroFormaPagoBanco) {
		this.esParaAccionDesdeFormularioEstadoRegistroFormaPagoBanco = esParaAccionDesdeFormularioEstadoRegistroFormaPagoBanco;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoRegistroFormaPagoBanco() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoRegistroFormaPagoBancoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoRegistroFormaPagoBancoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoregistroformapagobancoLogic.setEstadoRegistroFormaPagoBancos(this.estadoregistroformapagobancos);
			estadoregistroformapagobancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoRegistroFormaPagoBancoParameterReturnGeneral getEstadoRegistroFormaPagoBancoParameterGeneral() {
		return this.estadoregistroformapagobancoParameterGeneral;
	}
	
	public void setEstadoRegistroFormaPagoBancoParameterGeneral(EstadoRegistroFormaPagoBancoParameterReturnGeneral estadoregistroformapagobancoParameterGeneral) {
		this.estadoregistroformapagobancoParameterGeneral = estadoregistroformapagobancoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoRegistroFormaPagoBanco() {
		return isPermisoTodoEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoTodoEstadoRegistroFormaPagoBanco(Boolean isPermisoTodoEstadoRegistroFormaPagoBanco) {
		this.isPermisoTodoEstadoRegistroFormaPagoBanco = isPermisoTodoEstadoRegistroFormaPagoBanco;
	}

	public Boolean getIsPermisoNuevoEstadoRegistroFormaPagoBanco() {
		return isPermisoNuevoEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoNuevoEstadoRegistroFormaPagoBanco(Boolean isPermisoNuevoEstadoRegistroFormaPagoBanco) {
		this.isPermisoNuevoEstadoRegistroFormaPagoBanco = isPermisoNuevoEstadoRegistroFormaPagoBanco;
	}

	public Boolean getIsPermisoActualizarEstadoRegistroFormaPagoBanco() {
		return isPermisoActualizarEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoActualizarEstadoRegistroFormaPagoBanco(Boolean isPermisoActualizarEstadoRegistroFormaPagoBanco) {
		this.isPermisoActualizarEstadoRegistroFormaPagoBanco = isPermisoActualizarEstadoRegistroFormaPagoBanco;
	}

	public Boolean getIsPermisoEliminarEstadoRegistroFormaPagoBanco() {
		return isPermisoEliminarEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoEliminarEstadoRegistroFormaPagoBanco(Boolean isPermisoEliminarEstadoRegistroFormaPagoBanco) {
		this.isPermisoEliminarEstadoRegistroFormaPagoBanco = isPermisoEliminarEstadoRegistroFormaPagoBanco;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoRegistroFormaPagoBanco() {
		return isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoGuardarCambiosEstadoRegistroFormaPagoBanco(Boolean isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco) {
		this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco = isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsPermisoConsultaEstadoRegistroFormaPagoBanco() {
		return isPermisoConsultaEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoConsultaEstadoRegistroFormaPagoBanco(Boolean isPermisoConsultaEstadoRegistroFormaPagoBanco) {
		this.isPermisoConsultaEstadoRegistroFormaPagoBanco = isPermisoConsultaEstadoRegistroFormaPagoBanco;
	}

	public Boolean getIsPermisoBusquedaEstadoRegistroFormaPagoBanco() {
		return isPermisoBusquedaEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoBusquedaEstadoRegistroFormaPagoBanco(Boolean isPermisoBusquedaEstadoRegistroFormaPagoBanco) {
		this.isPermisoBusquedaEstadoRegistroFormaPagoBanco = isPermisoBusquedaEstadoRegistroFormaPagoBanco;
	}

	public Boolean getIsPermisoReporteEstadoRegistroFormaPagoBanco() {
		return isPermisoReporteEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoReporteEstadoRegistroFormaPagoBanco(Boolean isPermisoReporteEstadoRegistroFormaPagoBanco) {
		this.isPermisoReporteEstadoRegistroFormaPagoBanco = isPermisoReporteEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoRegistroFormaPagoBanco() {
		return isPermisoPaginacionMedioEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoPaginacionMedioEstadoRegistroFormaPagoBanco(Boolean isPermisoPaginacionMedioEstadoRegistroFormaPagoBanco) {
		this.isPermisoPaginacionMedioEstadoRegistroFormaPagoBanco = isPermisoPaginacionMedioEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoRegistroFormaPagoBanco() {
		return isPermisoPaginacionTodoEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoPaginacionTodoEstadoRegistroFormaPagoBanco(Boolean isPermisoPaginacionTodoEstadoRegistroFormaPagoBanco) {
		this.isPermisoPaginacionTodoEstadoRegistroFormaPagoBanco = isPermisoPaginacionTodoEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoRegistroFormaPagoBanco() {
		return isPermisoPaginacionAltoEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoPaginacionAltoEstadoRegistroFormaPagoBanco(Boolean isPermisoPaginacionAltoEstadoRegistroFormaPagoBanco) {
		this.isPermisoPaginacionAltoEstadoRegistroFormaPagoBanco = isPermisoPaginacionAltoEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsPermisoCopiarEstadoRegistroFormaPagoBanco() {
		return isPermisoCopiarEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoCopiarEstadoRegistroFormaPagoBanco(Boolean isPermisoCopiarEstadoRegistroFormaPagoBanco) {
		this.isPermisoCopiarEstadoRegistroFormaPagoBanco = isPermisoCopiarEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsPermisoVerFormEstadoRegistroFormaPagoBanco() {
		return isPermisoVerFormEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoVerFormEstadoRegistroFormaPagoBanco(Boolean isPermisoVerFormEstadoRegistroFormaPagoBanco) {
		this.isPermisoVerFormEstadoRegistroFormaPagoBanco = isPermisoVerFormEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsPermisoDuplicarEstadoRegistroFormaPagoBanco() {
		return isPermisoDuplicarEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoDuplicarEstadoRegistroFormaPagoBanco(Boolean isPermisoDuplicarEstadoRegistroFormaPagoBanco) {
		this.isPermisoDuplicarEstadoRegistroFormaPagoBanco = isPermisoDuplicarEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsPermisoOrdenEstadoRegistroFormaPagoBanco() {
		return isPermisoOrdenEstadoRegistroFormaPagoBanco;
	}

	public void setIsPermisoOrdenEstadoRegistroFormaPagoBanco(Boolean isPermisoOrdenEstadoRegistroFormaPagoBanco) {
		this.isPermisoOrdenEstadoRegistroFormaPagoBanco = isPermisoOrdenEstadoRegistroFormaPagoBanco;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco() {
		return isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco;
	}

	public void setIsVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco(Boolean isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco) {
		this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco = isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoRegistroFormaPagoBanco() {
		return isVisibilidadCeldaDuplicarEstadoRegistroFormaPagoBanco;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoRegistroFormaPagoBanco(Boolean isVisibilidadCeldaDuplicarEstadoRegistroFormaPagoBanco) {
		this.isVisibilidadCeldaDuplicarEstadoRegistroFormaPagoBanco = isVisibilidadCeldaDuplicarEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoRegistroFormaPagoBanco() {
		return isVisibilidadCeldaCopiarEstadoRegistroFormaPagoBanco;
	}

	public void setIsVisibilidadCeldaCopiarEstadoRegistroFormaPagoBanco(Boolean isVisibilidadCeldaCopiarEstadoRegistroFormaPagoBanco) {
		this.isVisibilidadCeldaCopiarEstadoRegistroFormaPagoBanco = isVisibilidadCeldaCopiarEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoRegistroFormaPagoBanco() {
		return isVisibilidadCeldaVerFormEstadoRegistroFormaPagoBanco;
	}

	public void setIsVisibilidadCeldaVerFormEstadoRegistroFormaPagoBanco(Boolean isVisibilidadCeldaVerFormEstadoRegistroFormaPagoBanco) {
		this.isVisibilidadCeldaVerFormEstadoRegistroFormaPagoBanco = isVisibilidadCeldaVerFormEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco() {
		return isVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco;
	}

	public void setIsVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco(Boolean isVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco) {
		this.isVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco = isVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco() {
		return isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco(Boolean isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco = isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco() {
		return isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco;
	}

	public void setIsVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco(Boolean isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco) {
		this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco = isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco() {
		return isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco;
	}

	public void setIsVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco(Boolean isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco) {
		this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco = isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco() {
		return isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco;
	}

	public void setIsVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco(Boolean isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco) {
		this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco = isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco() {
		return isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco;
	}

	public void setIsVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco(Boolean isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco) {
		this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco = isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco() {
		return isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco;
	}

	public void setIsVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco(Boolean isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco) {
		this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco = isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco() {
		return isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco(Boolean isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco) {
		this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco = isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco;
	}
		
	public EstadoRegistroFormaPagoBancoSessionBean getestadoregistroformapagobancoSessionBean() {
		return this.estadoregistroformapagobancoSessionBean;
	}
	
	public void setestadoregistroformapagobancoSessionBean(EstadoRegistroFormaPagoBancoSessionBean estadoregistroformapagobancoSessionBean) {
		this.estadoregistroformapagobancoSessionBean=estadoregistroformapagobancoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoRegistroFormaPagoBanco(estadoregistroformapagobanco);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoregistroformapagobancoAux.setId(estadoregistroformapagobanco.getId());
		estadoregistroformapagobancoAux.setVersionRow(estadoregistroformapagobanco.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoRegistroFormaPagoBanco();
		
			int intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoregistroformapagobancoValidator.getInvalidValues(this.estadoregistroformapagobanco);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoregistroformapagobancoLogic.setDatosCliente(datosCliente);
			estadoregistroformapagobancoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoregistroformapagobancoAux=new  EstadoRegistroFormaPagoBanco();
				
				estadoregistroformapagobancoAux.setIsNew(true);
				estadoregistroformapagobancoAux.setIsChanged(true);
				
				estadoregistroformapagobancoAux.setEstadoRegistroFormaPagoBancoOriginal(this.estadoregistroformapagobanco);
				
				estadoregistroformapagobancoAux.setId(this.estadoregistroformapagobanco.getId());	
				estadoregistroformapagobancoAux.setVersionRow(this.estadoregistroformapagobanco.getVersionRow());	
				estadoregistroformapagobancoAux.setcodigo(this.estadoregistroformapagobanco.getcodigo());	
				estadoregistroformapagobancoAux.setnombre(this.estadoregistroformapagobanco.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoregistroformapagobancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoregistroformapagobancoAux,estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoregistroformapagobancoAux,estadoregistroformapagobancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoregistroformapagobancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoregistroformapagobancoLogic.saveEstadoRegistroFormaPagoBancos();//WithConnection
						//estadoregistroformapagobancoLogic.getSetVersionRowEstadoRegistroFormaPagoBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoregistroformapagobanco,estadoregistroformapagobancoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoregistroformapagobancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoregistroformapagobancoAux=new  EstadoRegistroFormaPagoBanco();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado() && this.estadoregistroformapagobanco.getId()>=0)) {
						
					estadoregistroformapagobancoAux.setIsNew(false);
				}
				
				estadoregistroformapagobancoAux.setIsDeleted(false);
			
				estadoregistroformapagobancoAux.setId(this.estadoregistroformapagobanco.getId());	
				estadoregistroformapagobancoAux.setVersionRow(this.estadoregistroformapagobanco.getVersionRow());	
				estadoregistroformapagobancoAux.setcodigo(this.estadoregistroformapagobanco.getcodigo());	
				estadoregistroformapagobancoAux.setnombre(this.estadoregistroformapagobanco.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoregistroformapagobancoAux,estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoregistroformapagobancoAux,estadoregistroformapagobancos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoregistroformapagobancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoregistroformapagobancoLogic.saveEstadoRegistroFormaPagoBancos();//WithConnection
						//estadoregistroformapagobancoLogic.getSetVersionRowEstadoRegistroFormaPagoBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoregistroformapagobanco,estadoregistroformapagobancoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoregistroformapagobancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoregistroformapagobancoAux=new  EstadoRegistroFormaPagoBanco();
				
				estadoregistroformapagobancoAux.setIsNew(false);
				estadoregistroformapagobancoAux.setIsChanged(false);
				
				estadoregistroformapagobancoAux.setIsDeleted(true);
				
				estadoregistroformapagobancoAux.setId(this.estadoregistroformapagobanco.getId());	
				estadoregistroformapagobancoAux.setVersionRow(this.estadoregistroformapagobanco.getVersionRow());	
				estadoregistroformapagobancoAux.setcodigo(this.estadoregistroformapagobanco.getcodigo());	
				estadoregistroformapagobancoAux.setnombre(this.estadoregistroformapagobanco.getnombre());	
				
				if(this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoregistroformapagobancoAux.getId()>=0) {	
						this.estadoregistroformapagobancosEliminados.add(estadoregistroformapagobancoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoregistroformapagobancoAux,estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoregistroformapagobancoAux,estadoregistroformapagobancos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoregistroformapagobancoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoregistroformapagobancoLogic.saveEstadoRegistroFormaPagoBancos();//WithConnection
						//estadoregistroformapagobancoLogic.getSetVersionRowEstadoRegistroFormaPagoBancos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoregistroformapagobancoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoregistroformapagobancoAux.setRegistroFormaPagoBancos(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoLogic.getRegistroFormaPagoBancos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoregistroformapagobancoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoregistroformapagobancoAux,estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoregistroformapagobancoAux,estadoregistroformapagobancos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().addAll(this.estadoregistroformapagobancosEliminados);
					
					estadoregistroformapagobancoLogic.saveEstadoRegistroFormaPagoBancos();//WithConnection
					//estadoregistroformapagobancoLogic.getSetVersionRowEstadoRegistroFormaPagoBancos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadoregistroformapagobancosEliminados= new ArrayList<EstadoRegistroFormaPagoBanco>();		
			}
			
			if(this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Registro Forma Pago Banco GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Registro Forma Pago Banco",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoregistroformapagobanco=estadoregistroformapagobancoAux;
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
      		//this.finishProcessEstadoRegistroFormaPagoBanco();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoLocal) throws Exception {
		
		if(this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadoregistroformapagobancoLocal.setRegistroFormaPagoBancos(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoLogic.getRegistroFormaPagoBancos());
			
			} else {
			
				estadoregistroformapagobancoLocal.setRegistroFormaPagoBancos(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.registroformapagobancos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoLocal) throws Exception {	
		if(this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoRegistroFormaPagoBancoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoregistroformapagobancoValidator.getInvalidValues(this.estadoregistroformapagobanco);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancos) throws Exception {
		try	{		
			EstadoRegistroFormaPagoBancoConstantesFunciones.actualizarLista(estadoregistroformapagobanco,estadoregistroformapagobancos,this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancos) throws Exception {
		try	{			
			EstadoRegistroFormaPagoBancoConstantesFunciones.actualizarSelectedLista(estadoregistroformapagobanco,estadoregistroformapagobancos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoregistroformapagobancosLocal=this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoregistroformapagobancosLocal=this.estadoregistroformapagobancos;
			}
			//ARCHITECTURE
		
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoLocal:estadoregistroformapagobancosLocal) {
				if(this.permiteMantenimiento(estadoregistroformapagobancoLocal) && estadoregistroformapagobancoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoRegistroFormaPagoBancoConstantesFunciones.getEstadoRegistroFormaPagoBancoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoRegistroFormaPagoBancoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jLabelcodigoEstadoRegistroFormaPagoBanco,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoRegistroFormaPagoBancoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jLabelnombreEstadoRegistroFormaPagoBanco,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jLabelcodigoEstadoRegistroFormaPagoBanco,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jLabelnombreEstadoRegistroFormaPagoBanco,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("RegistroFormaPagoBanco")) {
			if(this.estadoregistroformapagobanco==null) {
				this.estadoregistroformapagobanco= new EstadoRegistroFormaPagoBanco();
			}

			if(this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoRegistroFormaPagoBanco
				this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);

				this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.getregistroformapagobanco().setEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoRegistroFormaPagoBanco--;	
		
		
		this.estadoregistroformapagobancoAux=new EstadoRegistroFormaPagoBanco();
		
		this.estadoregistroformapagobancoAux.setId(this.iIdNuevoEstadoRegistroFormaPagoBanco);
		this.estadoregistroformapagobancoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().add(this.estadoregistroformapagobancoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoregistroformapagobancos.add(this.estadoregistroformapagobancoAux);
		}
		//ARCHITECTURE
		
		this.estadoregistroformapagobanco=this.estadoregistroformapagobancoAux;
		
		if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
		}
				
		//this.setDefaultControlesEstadoRegistroFormaPagoBanco();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoRegistroFormaPagoBanco();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoRegistroFormaPagoBanco();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoRegistroFormaPagoBanco();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancoBean,this.estadoregistroformapagobanco,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
			classes=EstadoRegistroFormaPagoBancoConstantesFunciones.getClassesRelationshipsOfEstadoRegistroFormaPagoBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoregistroformapagobancoReturnGeneral=estadoregistroformapagobancoLogic.procesarEventosEstadoRegistroFormaPagoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos(),this.estadoregistroformapagobanco,this.estadoregistroformapagobancoParameterGeneral,this.isEsNuevoEstadoRegistroFormaPagoBanco,classes);//this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBanco()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancoReturnGeneral,this.estadoregistroformapagobancoBean,false);
		
		if(this.estadoregistroformapagobancoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancoReturnGeneral.getEstadoRegistroFormaPagoBanco());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancoReturnGeneral.getEstadoRegistroFormaPagoBanco());
		}
		
		if(this.estadoregistroformapagobancoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancoReturnGeneral.getEstadoRegistroFormaPagoBanco(),classes);//this.estadoregistroformapagobancoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoRegistroFormaPagoBanco();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoRegistroFormaPagoBanco();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false);
						
			if(estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoSessionBean.getEsGuardarRelacionado() && RegistroFormaPagoBancoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRegistroFormaPagoBancoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoRegistroFormaPagoBanco();
			}
			
			this.actualizarVisualTableDatosEstadoRegistroFormaPagoBanco();
			
			this.jTableDatosEstadoRegistroFormaPagoBanco.setRowSelectionInterval(this.getIndiceNuevoEstadoRegistroFormaPagoBanco(), this.getIndiceNuevoEstadoRegistroFormaPagoBanco());
			
			this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
						
			this.actualizarEstadoCeldasBotonesEstadoRegistroFormaPagoBanco("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoRegistroFormaPagoBanco(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldcodigoEstadoRegistroFormaPagoBanco.setEnabled(isHabilitar && this.estadoregistroformapagobancoConstantesFunciones.activarcodigoEstadoRegistroFormaPagoBanco);
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextAreanombreEstadoRegistroFormaPagoBanco.setEnabled(isHabilitar && this.estadoregistroformapagobancoConstantesFunciones.activarnombreEstadoRegistroFormaPagoBanco);	
		
	};
	
	public void setDefaultControlesEstadoRegistroFormaPagoBanco() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoRegistroFormaPagoBanco(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoregistroformapagobancoSessionBean.setConGuardarRelaciones(true);			
			this.estadoregistroformapagobancoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadoregistroformapagobancoSessionBean.setConGuardarRelaciones(false);			
			this.estadoregistroformapagobancoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoRegistroFormaPagoBanco() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos()) {
				if(estadoregistroformapagobancoAux.getId().equals(this.iIdNuevoEstadoRegistroFormaPagoBanco)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancos) {
				if(estadoregistroformapagobancoAux.getId().equals(this.iIdNuevoEstadoRegistroFormaPagoBanco)) {
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
	
	public int getIndiceActualEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos()) {
				if(estadoregistroformapagobancoAux.getId().equals(estadoregistroformapagobanco.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancos) {
				if(estadoregistroformapagobancoAux.getId().equals(estadoregistroformapagobanco.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos()) {
				if(estadoregistroformapagobancoAux.getEstadoRegistroFormaPagoBancoOriginal().getId().equals(estadoregistroformapagobancoOriginal.getId())) {
					existe=true;
					estadoregistroformapagobancoOriginal.setId(estadoregistroformapagobancoAux.getId());
					estadoregistroformapagobancoOriginal.setVersionRow(estadoregistroformapagobancoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancos) {
				if(estadoregistroformapagobancoAux.getEstadoRegistroFormaPagoBancoOriginal().getId().equals(estadoregistroformapagobancoOriginal.getId())) {
					existe=true;
					estadoregistroformapagobancoOriginal.setId(estadoregistroformapagobancoAux.getId());
					estadoregistroformapagobancoOriginal.setVersionRow(estadoregistroformapagobancoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoRegistroFormaPagoBanco(Boolean esParaCancelar) throws Exception {
		estadoregistroformapagobancosAux=new ArrayList<EstadoRegistroFormaPagoBanco>();
		estadoregistroformapagobancoAux=new EstadoRegistroFormaPagoBanco();
		
		if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos()) {
					if(estadoregistroformapagobancoAux.getId()<0) {
						estadoregistroformapagobancosAux.add(estadoregistroformapagobancoAux);
					}		
				}
				this.iIdNuevoEstadoRegistroFormaPagoBanco=0L;
				this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().removeAll(estadoregistroformapagobancosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancos) {
					if(estadoregistroformapagobancoAux.getId()<0) {
						estadoregistroformapagobancosAux.add(estadoregistroformapagobancoAux);
					}		
				}
				this.iIdNuevoEstadoRegistroFormaPagoBanco=0L;
				this.estadoregistroformapagobancos.removeAll(estadoregistroformapagobancosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoRegistroFormaPagoBanco 
					&& this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().size()>0
					) {
					estadoregistroformapagobancoAux=this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().get(this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().size() - 1);
				
					if(estadoregistroformapagobancoAux.getId()<0) {
						this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().remove(estadoregistroformapagobancoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoRegistroFormaPagoBanco && this.estadoregistroformapagobancos.size()>0) {
					estadoregistroformapagobancoAux=this.estadoregistroformapagobancos.get(this.estadoregistroformapagobancos.size() - 1);
				
					if(estadoregistroformapagobancoAux.getId()<0) {
						this.estadoregistroformapagobancos.remove(estadoregistroformapagobancoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoRegistroFormaPagoBanco(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoregistroformapagobanco.getId()<0) {
				this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().remove(this.estadoregistroformapagobanco);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoregistroformapagobanco.getId()<0) {
				this.estadoregistroformapagobancos.remove(this.estadoregistroformapagobanco);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoRegistroFormaPagoBanco(List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosAux) throws Exception {
		EstadoRegistroFormaPagoBancoConstantesFunciones.setEstadosInicialesEstadoRegistroFormaPagoBanco(estadoregistroformapagobancosAux);
	}
	
	public void setEstadosInicialesEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux) throws Exception {
		EstadoRegistroFormaPagoBancoConstantesFunciones.setEstadosInicialesEstadoRegistroFormaPagoBanco(estadoregistroformapagobancoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoRegistroFormaPagoBancoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoRegistroFormaPagoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoRegistroFormaPagoBancoActual()) {
				if(!this.isEsNuevoEstadoRegistroFormaPagoBanco) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoRegistroFormaPagoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoRegistroFormaPagoBanco=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoRegistroFormaPagoBancoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Registro Forma Pago Banco ?", "MANTENIMIENTO DE Estado Registro Forma Pago Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoRegistroFormaPagoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco) throws Exception {
		EstadoRegistroFormaPagoBancoConstantesFunciones.seleccionarAsignar(this.estadoregistroformapagobanco,estadoregistroformapagobanco);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoRegistroFormaPagoBanco=this.isPermisoActualizarOriginalEstadoRegistroFormaPagoBanco;
			
			
			this.seleccionarAsignar(estadoregistroformapagobanco);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoRegistroFormaPagoBancoConstantesFunciones.quitarEspaciosEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoRegistroFormaPagoBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoregistroformapagobancoSessionBean.setsFuncionBusquedaRapida(this.estadoregistroformapagobancoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoRegistroFormaPagoBanco) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoRegistroFormaPagoBanco(esParaCancelar);				
				this.cancelarNuevoEstadoRegistroFormaPagoBanco(esParaCancelar);								
			}
			
			this.estadoregistroformapagobanco=new EstadoRegistroFormaPagoBanco();
			
			this.inicializarEstadoRegistroFormaPagoBanco();
			
			this.actualizarEstadoCeldasBotonesEstadoRegistroFormaPagoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoRegistroFormaPagoBanco() throws Exception {
		try {
			EstadoRegistroFormaPagoBancoConstantesFunciones.inicializarEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoRegistroFormaPagoBancos(String sAccionBusqueda,List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoRegistroFormaPagoBanco"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoRegistroFormaPagoBancoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoRegistroFormaPagoBancoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoRegistroFormaPagoBanco"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Registro Forma Pago Bancos");		
		parameters.put("busquedapor", EstadoRegistroFormaPagoBancoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(RegistroFormaPagoBanco.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoRegistroFormaPagoBancoLogic estadoregistroformapagobancoLogicAuxiliar=new EstadoRegistroFormaPagoBancoLogic();
					estadoregistroformapagobancoLogicAuxiliar.setDatosCliente(estadoregistroformapagobancoLogic.getDatosCliente());				
					estadoregistroformapagobancoLogicAuxiliar.setEstadoRegistroFormaPagoBancos(estadoregistroformapagobancosParaReportes);
					
					estadoregistroformapagobancoLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoRegistroFormaPagoBancoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadoregistroformapagobancosParaReportes=estadoregistroformapagobancoLogicAuxiliar.getEstadoRegistroFormaPagoBancos();
					
					//estadoregistroformapagobancoLogic.getNewConnexionToDeep();
					
					//for (EstadoRegistroFormaPagoBanco estadoregistroformapagobanco:estadoregistroformapagobancosParaReportes) {
					//	estadoregistroformapagobancoLogic.deepLoad(estadoregistroformapagobanco, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadoregistroformapagobancoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadoregistroformapagobancoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileRegistroFormaPagoBanco = AuxiliarReportes.class.getResourceAsStream("RegistroFormaPagoBancoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_registroformapagobanco", reportFileRegistroFormaPagoBanco);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoRegistroFormaPagoBanco=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoRegistroFormaPagoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoRegistroFormaPagoBancoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoRegistroFormaPagoBanco=new JRBeanArrayDataSource(EstadoRegistroFormaPagoBancoJInternalFrame.TraerEstadoRegistroFormaPagoBancoBeans(estadoregistroformapagobancosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoRegistroFormaPagoBanco);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoRegistroFormaPagoBancoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoRegistroFormaPagoBancoBean.TraerEstadoRegistroFormaPagoBancoBeans(estadoregistroformapagobancosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoRegistroFormaPagoBancos(sAccionBusqueda,sTipoArchivoReporte,estadoregistroformapagobancosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoRegistroFormaPagoBancos(sAccionBusqueda,sTipoArchivoReporte,estadoregistroformapagobancosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBancoActionPerformed(null);
					//this.generarExcelReporteEstadoRegistroFormaPagoBancos(sAccionBusqueda,sTipoArchivoReporte,estadoregistroformapagobancosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoRegistroFormaPagoBancos(sAccionBusqueda,sTipoArchivoReporte,estadoregistroformapagobancosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoRegistroFormaPagoBancos(sAccionBusqueda,sTipoArchivoReporte,estadoregistroformapagobancosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoRegistroFormaPagoBancos(sAccionBusqueda,sTipoArchivoReporte,estadoregistroformapagobancosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoRegistroFormaPagoBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoregistroformapagobanco";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoRegistroFormaPagoBancos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoRegistroFormaPagoBanco("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco : estadoregistroformapagobancosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoRegistroFormaPagoBancoConstantesFunciones.generarExcelReporteDataEstadoRegistroFormaPagoBanco("NORMAL",row,workbook,estadoregistroformapagobanco,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Registro Forma Pago Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoRegistroFormaPagoBanco(String sTipo,Row row,Workbook workbook) {
		
		EstadoRegistroFormaPagoBancoConstantesFunciones.generarExcelReporteHeaderEstadoRegistroFormaPagoBanco(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoRegistroFormaPagoBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoregistroformapagobanco_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoRegistroFormaPagoBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco : estadoregistroformapagobancosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoRegistroFormaPagoBancoConstantesFunciones.getEstadoRegistroFormaPagoBancoDescripcion(estadoregistroformapagobanco));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoregistroformapagobanco.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoregistroformapagobanco.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Registro Forma Pago Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoRegistroFormaPagoBancos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosRespaldo=null;
		
		classes=EstadoRegistroFormaPagoBancoConstantesFunciones.getClassesRelationshipsOfEstadoRegistroFormaPagoBanco(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoregistroformapagobancoLogic.setDatosCliente(this.datosCliente);
		this.estadoregistroformapagobancoLogic.setDatosDeep(this.datosDeep);
		this.estadoregistroformapagobancoLogic.setIsConDeep(true);
		
		estadoregistroformapagobancosRespaldo=this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos();
		
		this.estadoregistroformapagobancoLogic.setEstadoRegistroFormaPagoBancos(estadoregistroformapagobancosParaReportes);	
		this.estadoregistroformapagobancoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoregistroformapagobancosParaReportes=this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos();
		this.estadoregistroformapagobancoLogic.setEstadoRegistroFormaPagoBancos(estadoregistroformapagobancosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoregistroformapagobanco_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoRegistroFormaPagoBancos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoRegistroFormaPagoBanco("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco : estadoregistroformapagobancosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoRegistroFormaPagoBanco("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoRegistroFormaPagoBancoConstantesFunciones.generarExcelReporteDataEstadoRegistroFormaPagoBanco("NORMAL",row,workbook,estadoregistroformapagobanco,cellStyleDataAux);
		
			
			


				//RegistroFormaPagoBanco
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoregistroformapagobanco.getRegistroFormaPagoBancos()!=null && estadoregistroformapagobanco.getRegistroFormaPagoBancos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					RegistroFormaPagoBancoConstantesFunciones.generarExcelReporteHeaderRegistroFormaPagoBanco("RELACIONADO",row,workbook);
				}

				if(estadoregistroformapagobanco.getRegistroFormaPagoBancos()!=null) {
					i2=0;
					for(RegistroFormaPagoBanco registroformapagobanco : estadoregistroformapagobanco.getRegistroFormaPagoBancos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						RegistroFormaPagoBancoConstantesFunciones.generarExcelReporteDataRegistroFormaPagoBanco("RELACIONADO",row,workbook,registroformapagobanco,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoRegistroFormaPagoBancoConstantesFunciones.getEstadoRegistroFormaPagoBancoDescripcion(estadoregistroformapagobanco));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Registro Forma Pago Banco",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoRegistroFormaPagoBanco() throws Exception {		
		this.startProcessEstadoRegistroFormaPagoBanco(true);
	}
	
	public void startProcessEstadoRegistroFormaPagoBanco(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco, this.jScrollPanelDatosEstadoRegistroFormaPagoBanco,this.jPanelPaginacionEstadoRegistroFormaPagoBanco, this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco, this.jPanelAccionesEstadoRegistroFormaPagoBanco,this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco,this.jmenuBarEstadoRegistroFormaPagoBanco,this.jmenuBarDetalleEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarDetalleEstadoRegistroFormaPagoBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoRegistroFormaPagoBanco=null; 
		
		final JPanel jPanelParametrosReportesEstadoRegistroFormaPagoBanco=this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco;
		//final JScrollPane jScrollPanelDatosEstadoRegistroFormaPagoBanco=this.jScrollPanelDatosEstadoRegistroFormaPagoBanco;
		final JTable jTableDatosEstadoRegistroFormaPagoBanco=this.jTableDatosEstadoRegistroFormaPagoBanco;		
		final JPanel jPanelPaginacionEstadoRegistroFormaPagoBanco=this.jPanelPaginacionEstadoRegistroFormaPagoBanco;
		//final JScrollPane jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco=this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco;
		final JPanel jPanelAccionesEstadoRegistroFormaPagoBanco=this.jPanelAccionesEstadoRegistroFormaPagoBanco;
		
		JPanel jPanelCamposAuxiliarEstadoRegistroFormaPagoBanco=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoRegistroFormaPagoBanco=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
			jPanelCamposAuxiliarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jPanelCamposEstadoRegistroFormaPagoBanco;
			jPanelAccionesFormularioAuxiliarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco;
		}
		
		final JPanel jPanelCamposEstadoRegistroFormaPagoBanco=jPanelCamposAuxiliarEstadoRegistroFormaPagoBanco;
		final JPanel jPanelAccionesFormularioEstadoRegistroFormaPagoBanco=jPanelAccionesFormularioAuxiliarEstadoRegistroFormaPagoBanco;
		
		
		final JMenuBar jmenuBarEstadoRegistroFormaPagoBanco=this.jmenuBarEstadoRegistroFormaPagoBanco;
		final JToolBar jTtoolBarEstadoRegistroFormaPagoBanco=this.jTtoolBarEstadoRegistroFormaPagoBanco;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoRegistroFormaPagoBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoRegistroFormaPagoBanco=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
			jmenuBarDetalleAuxiliarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jmenuBarDetalleEstadoRegistroFormaPagoBanco;
			jTtoolBarDetalleAuxiliarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTtoolBarDetalleEstadoRegistroFormaPagoBanco;
		}
		
		final JMenuBar jmenuBarDetalleEstadoRegistroFormaPagoBanco=jmenuBarDetalleAuxiliarEstadoRegistroFormaPagoBanco;
		final JToolBar jTtoolBarDetalleEstadoRegistroFormaPagoBanco=jTtoolBarDetalleAuxiliarEstadoRegistroFormaPagoBanco;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoRegistroFormaPagoBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoRegistroFormaPagoBanco;
			processRunnable.jTableDatos=jTableDatosEstadoRegistroFormaPagoBanco;
			processRunnable.jPanelCampos=jPanelCamposEstadoRegistroFormaPagoBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoRegistroFormaPagoBanco;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoRegistroFormaPagoBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoRegistroFormaPagoBanco;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoRegistroFormaPagoBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoRegistroFormaPagoBanco;
			processRunnable.jTtoolBar=jTtoolBarEstadoRegistroFormaPagoBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoRegistroFormaPagoBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoRegistroFormaPagoBanco ,jPanelParametrosReportesEstadoRegistroFormaPagoBanco,jTableDatosEstadoRegistroFormaPagoBanco, /*jScrollPanelDatosEstadoRegistroFormaPagoBanco,*/jPanelCamposEstadoRegistroFormaPagoBanco,jPanelPaginacionEstadoRegistroFormaPagoBanco, /*jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco,*/ jPanelAccionesEstadoRegistroFormaPagoBanco,jPanelAccionesFormularioEstadoRegistroFormaPagoBanco,jmenuBarEstadoRegistroFormaPagoBanco,jmenuBarDetalleEstadoRegistroFormaPagoBanco,jTtoolBarEstadoRegistroFormaPagoBanco,jTtoolBarDetalleEstadoRegistroFormaPagoBanco);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoRegistroFormaPagoBanco, jScrollPanelDatosEstadoRegistroFormaPagoBanco,jPanelPaginacionEstadoRegistroFormaPagoBanco, jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco, jPanelAccionesEstadoRegistroFormaPagoBanco,jPanelAccionesFormularioEstadoRegistroFormaPagoBanco,jmenuBarEstadoRegistroFormaPagoBanco,jmenuBarDetalleEstadoRegistroFormaPagoBanco,jTtoolBarEstadoRegistroFormaPagoBanco,jTtoolBarDetalleEstadoRegistroFormaPagoBanco);
						
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
	
	public void finishProcessEstadoRegistroFormaPagoBanco() {// throws Exception 
		this.finishProcessEstadoRegistroFormaPagoBanco(true);
	}
	
	public void finishProcessEstadoRegistroFormaPagoBanco(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco, this.jScrollPanelDatosEstadoRegistroFormaPagoBanco,this.jPanelPaginacionEstadoRegistroFormaPagoBanco, this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco, this.jPanelAccionesEstadoRegistroFormaPagoBanco,this.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco,this.jmenuBarEstadoRegistroFormaPagoBanco,this.jmenuBarDetalleEstadoRegistroFormaPagoBanco,this.jTtoolBarEstadoRegistroFormaPagoBanco,this.jTtoolBarDetalleEstadoRegistroFormaPagoBanco);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoRegistroFormaPagoBanco=null; 
		
		final JPanel jPanelParametrosReportesEstadoRegistroFormaPagoBanco=this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco;
		//final JScrollPane jScrollPanelDatosEstadoRegistroFormaPagoBanco=this.jScrollPanelDatosEstadoRegistroFormaPagoBanco;
		final JTable jTableDatosEstadoRegistroFormaPagoBanco=this.jTableDatosEstadoRegistroFormaPagoBanco;		
		final JPanel jPanelPaginacionEstadoRegistroFormaPagoBanco=this.jPanelPaginacionEstadoRegistroFormaPagoBanco;
		//final JScrollPane jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco=this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco;
		final JPanel jPanelAccionesEstadoRegistroFormaPagoBanco=this.jPanelAccionesEstadoRegistroFormaPagoBanco;
		
		JPanel jPanelCamposAuxiliarEstadoRegistroFormaPagoBanco=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoRegistroFormaPagoBanco=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
			jPanelCamposAuxiliarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jPanelCamposEstadoRegistroFormaPagoBanco;
			jPanelAccionesFormularioAuxiliarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jPanelAccionesFormularioEstadoRegistroFormaPagoBanco;
		}
		
		final JPanel jPanelCamposEstadoRegistroFormaPagoBanco=jPanelCamposAuxiliarEstadoRegistroFormaPagoBanco;
		final JPanel jPanelAccionesFormularioEstadoRegistroFormaPagoBanco=jPanelAccionesFormularioAuxiliarEstadoRegistroFormaPagoBanco;
		
		
		final JMenuBar jmenuBarEstadoRegistroFormaPagoBanco=this.jmenuBarEstadoRegistroFormaPagoBanco;		
		final JToolBar jTtoolBarEstadoRegistroFormaPagoBanco=this.jTtoolBarEstadoRegistroFormaPagoBanco;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoRegistroFormaPagoBanco=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoRegistroFormaPagoBanco=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
			jmenuBarDetalleAuxiliarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jmenuBarDetalleEstadoRegistroFormaPagoBanco;
			jTtoolBarDetalleAuxiliarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTtoolBarDetalleEstadoRegistroFormaPagoBanco;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoRegistroFormaPagoBanco=jmenuBarDetalleAuxiliarEstadoRegistroFormaPagoBanco;
		final JToolBar jTtoolBarDetalleEstadoRegistroFormaPagoBanco=jTtoolBarDetalleAuxiliarEstadoRegistroFormaPagoBanco;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoRegistroFormaPagoBanco;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoRegistroFormaPagoBanco;
			processRunnable.jTableDatos=jTableDatosEstadoRegistroFormaPagoBanco;
			processRunnable.jPanelCampos=jPanelCamposEstadoRegistroFormaPagoBanco;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoRegistroFormaPagoBanco;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoRegistroFormaPagoBanco;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoRegistroFormaPagoBanco;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoRegistroFormaPagoBanco;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoRegistroFormaPagoBanco;
			processRunnable.jTtoolBar=jTtoolBarEstadoRegistroFormaPagoBanco;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoRegistroFormaPagoBanco;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoRegistroFormaPagoBanco ,jPanelParametrosReportesEstadoRegistroFormaPagoBanco, jTableDatosEstadoRegistroFormaPagoBanco,/*jScrollPanelDatosEstadoRegistroFormaPagoBanco,*/jPanelCamposEstadoRegistroFormaPagoBanco,jPanelPaginacionEstadoRegistroFormaPagoBanco, /*jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco,*/ jPanelAccionesEstadoRegistroFormaPagoBanco,jPanelAccionesFormularioEstadoRegistroFormaPagoBanco,jmenuBarEstadoRegistroFormaPagoBanco,jmenuBarDetalleEstadoRegistroFormaPagoBanco,jTtoolBarEstadoRegistroFormaPagoBanco,jTtoolBarDetalleEstadoRegistroFormaPagoBanco));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoRegistroFormaPagoBanco(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoRegistroFormaPagoBanco(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoRegistroFormaPagoBanco(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoRegistroFormaPagoBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoRegistroFormaPagoBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoRegistroFormaPagoBanco,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoRegistroFormaPagoBanco(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoRegistroFormaPagoBanco,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoRegistroFormaPagoBanco,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoregistroformapagobancoConstantesFunciones.getsFinalQueryEstadoRegistroFormaPagoBanco();
		String  finalQueryPaginacionTodos=this.estadoregistroformapagobancoConstantesFunciones.getsFinalQueryEstadoRegistroFormaPagoBanco();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoRegistroFormaPagoBancoConstantesFunciones.getArrayColumnasGlobalesNoEstadoRegistroFormaPagoBanco(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoRegistroFormaPagoBancoConstantesFunciones.getArrayColumnasGlobalesEstadoRegistroFormaPagoBanco(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoRegistroFormaPagoBancoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoregistroformapagobancosEliminados= new ArrayList<EstadoRegistroFormaPagoBanco>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoRegistroFormaPagoBanco();
		
				///*EstadoRegistroFormaPagoBancoSessionBean*/this.estadoregistroformapagobancoSessionBean=new EstadoRegistroFormaPagoBancoSessionBean();
			
			if(this.estadoregistroformapagobancoSessionBean==null) {
				this.estadoregistroformapagobancoSessionBean=new EstadoRegistroFormaPagoBancoSessionBean();
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
					this.iNumeroPaginacion=EstadoRegistroFormaPagoBancoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoRegistroFormaPagoBancoConstantesFunciones.getClassesForeignKeysOfEstadoRegistroFormaPagoBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoregistroformapagobanco."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoregistroformapagobancosAux= new ArrayList<EstadoRegistroFormaPagoBanco>();
			
				
			estadoregistroformapagobancoLogic.setDatosCliente(this.datosCliente);
			estadoregistroformapagobancoLogic.setDatosDeep(this.datosDeep);
			estadoregistroformapagobancoLogic.setIsConDeep(true);
			
			
			estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoregistroformapagobancoLogic.getTodosEstadoRegistroFormaPagoBancos(finalQueryGlobal,pagination);
					
					//estadoregistroformapagobancoLogic.getTodosEstadoRegistroFormaPagoBancosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos()==null|| estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoregistroformapagobancosAux= new ArrayList<EstadoRegistroFormaPagoBanco>();
							estadoregistroformapagobancosAux.addAll(estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoregistroformapagobancosAux= new ArrayList<EstadoRegistroFormaPagoBanco>();
							estadoregistroformapagobancosAux.addAll(estadoregistroformapagobancos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoregistroformapagobancoLogic.getTodosEstadoRegistroFormaPagoBancos(finalQueryGlobal+"",this.pagination);												
							
							//estadoregistroformapagobancoLogic.getTodosEstadoRegistroFormaPagoBancosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoRegistroFormaPagoBancos("Todos",estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoregistroformapagobancoLogic.setEstadoRegistroFormaPagoBancos(new ArrayList<EstadoRegistroFormaPagoBanco>());					
							estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().addAll(estadoregistroformapagobancosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoregistroformapagobancos=new ArrayList<EstadoRegistroFormaPagoBanco>();
							estadoregistroformapagobancos.addAll(estadoregistroformapagobancosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoRegistroFormaPagoBanco=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoRegistroFormaPagoBanco=this.idActual;
				
				} else if(this.idEstadoRegistroFormaPagoBancoActual!=null && this.idEstadoRegistroFormaPagoBancoActual!=0L) {
					idEstadoRegistroFormaPagoBanco=idEstadoRegistroFormaPagoBancoActual;
				}
				
					
				this.sDetalleReporte=EstadoRegistroFormaPagoBancoConstantesFunciones.getDetalleIndicePorId(idEstadoRegistroFormaPagoBanco);
				
				this.estadoregistroformapagobancos=new ArrayList<EstadoRegistroFormaPagoBanco>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoregistroformapagobancoLogic.getEntity(idEstadoRegistroFormaPagoBanco);
					
					//estadoregistroformapagobancoLogic.getEntityWithConnection(idEstadoRegistroFormaPagoBanco);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoregistroformapagobancoLogic.setEstadoRegistroFormaPagoBancos(new ArrayList<EstadoRegistroFormaPagoBanco>());
					estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().add(estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBanco());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoregistroformapagobancos=new ArrayList<EstadoRegistroFormaPagoBanco>();
					this.estadoregistroformapagobancos.add(estadoregistroformapagobanco);
				}
				
				if(estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBanco()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoRegistroFormaPagoBanco();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoRegistroFormaPagoBanco();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoregistroformapagobancos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoregistroformapagobancos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco) {
		Boolean permite=true;
		
		if(this.estadoregistroformapagobanco.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoRegistroFormaPagoBancoConstantesFunciones.getOrderByListaEstadoRegistroFormaPagoBanco();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoRegistroFormaPagoBancoConstantesFunciones.getOrderByListaEstadoRegistroFormaPagoBanco();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco:estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos()) {
				if(estadoregistroformapagobanco.getsType().equals(Constantes2.S_TOTALES)) {
					estadoregistroformapagobancoTotales=estadoregistroformapagobanco;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco:this.estadoregistroformapagobancos) {
				if(estadoregistroformapagobanco.getsType().equals(Constantes2.S_TOTALES)) {
					estadoregistroformapagobancoTotales=estadoregistroformapagobanco;
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
			this.estadoregistroformapagobancoAux=new EstadoRegistroFormaPagoBanco();
			this.estadoregistroformapagobancoAux.setsType(Constantes2.S_TOTALES);
			this.estadoregistroformapagobancoAux.setIsNew(false);
			this.estadoregistroformapagobancoAux.setIsChanged(false);
			this.estadoregistroformapagobancoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoRegistroFormaPagoBancoConstantesFunciones.TotalizarValoresFilaEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos(),this.estadoregistroformapagobancoAux);
				
				this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().add(this.estadoregistroformapagobancoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoRegistroFormaPagoBancoConstantesFunciones.TotalizarValoresFilaEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancos,this.estadoregistroformapagobancoAux);
				
				this.estadoregistroformapagobancos.add(this.estadoregistroformapagobancoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoregistroformapagobancoTotales=new EstadoRegistroFormaPagoBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().remove(estadoregistroformapagobancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoregistroformapagobancos.remove(estadoregistroformapagobancoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoregistroformapagobancoTotales=new EstadoRegistroFormaPagoBanco();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco:estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos()) {
				if(estadoregistroformapagobanco.getsType().equals(Constantes2.S_TOTALES)) {
					estadoregistroformapagobancoTotales=estadoregistroformapagobanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoRegistroFormaPagoBancoConstantesFunciones.TotalizarValoresFilaEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos(),estadoregistroformapagobancoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco:this.estadoregistroformapagobancos) {
				if(estadoregistroformapagobanco.getsType().equals(Constantes2.S_TOTALES)) {
					estadoregistroformapagobancoTotales=estadoregistroformapagobanco;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoRegistroFormaPagoBancoConstantesFunciones.TotalizarValoresFilaEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancos,estadoregistroformapagobancoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoRegistroFormaPagoBanco() {
		this.isPermisoTodoEstadoRegistroFormaPagoBanco=false;
		this.isPermisoNuevoEstadoRegistroFormaPagoBanco=false;
		this.isPermisoActualizarEstadoRegistroFormaPagoBanco=false;
		this.isPermisoActualizarOriginalEstadoRegistroFormaPagoBanco=false;
		this.isPermisoEliminarEstadoRegistroFormaPagoBanco=false;
		this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco=false;
		this.isPermisoConsultaEstadoRegistroFormaPagoBanco=false;
		this.isPermisoBusquedaEstadoRegistroFormaPagoBanco=false;
		this.isPermisoReporteEstadoRegistroFormaPagoBanco=false;		
		this.isPermisoOrdenEstadoRegistroFormaPagoBanco=false;		
		this.isPermisoPaginacionMedioEstadoRegistroFormaPagoBanco=false;		
		this.isPermisoPaginacionAltoEstadoRegistroFormaPagoBanco=false;
		this.isPermisoPaginacionTodoEstadoRegistroFormaPagoBanco=false;
		this.isPermisoCopiarEstadoRegistroFormaPagoBanco=false;		
		this.isPermisoVerFormEstadoRegistroFormaPagoBanco=false;		
		this.isPermisoDuplicarEstadoRegistroFormaPagoBanco=false;		
		this.isPermisoOrdenEstadoRegistroFormaPagoBanco=false;		
	}
	
	public void setPermisosUsuarioEstadoRegistroFormaPagoBanco(Boolean isPermiso) {
		this.isPermisoTodoEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoNuevoEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoActualizarEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoActualizarOriginalEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoEliminarEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoConsultaEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoBusquedaEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoReporteEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoOrdenEstadoRegistroFormaPagoBanco=isPermiso;		
		this.isPermisoPaginacionMedioEstadoRegistroFormaPagoBanco=isPermiso;		
		this.isPermisoPaginacionAltoEstadoRegistroFormaPagoBanco=isPermiso;		
		this.isPermisoPaginacionTodoEstadoRegistroFormaPagoBanco=isPermiso;		
		this.isPermisoCopiarEstadoRegistroFormaPagoBanco=isPermiso;		
		this.isPermisoVerFormEstadoRegistroFormaPagoBanco=isPermiso;		
		this.isPermisoDuplicarEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoOrdenEstadoRegistroFormaPagoBanco=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoRegistroFormaPagoBanco(Boolean isPermiso) {
		//this.isPermisoTodoEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoNuevoEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoActualizarEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoActualizarOriginalEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoEliminarEstadoRegistroFormaPagoBanco=isPermiso;
		this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco=isPermiso;
		//this.isPermisoConsultaEstadoRegistroFormaPagoBanco=isPermiso;
		//this.isPermisoBusquedaEstadoRegistroFormaPagoBanco=isPermiso;
		//this.isPermisoReporteEstadoRegistroFormaPagoBanco=isPermiso;
		//this.isPermisoOrdenEstadoRegistroFormaPagoBanco=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoRegistroFormaPagoBanco=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoRegistroFormaPagoBanco=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoRegistroFormaPagoBanco=isPermiso;		
		//this.isPermisoCopiarEstadoRegistroFormaPagoBanco=isPermiso;		
		//this.isPermisoDuplicarEstadoRegistroFormaPagoBanco=isPermiso;
		//this.isPermisoOrdenEstadoRegistroFormaPagoBanco=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoRegistroFormaPagoBancoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(RegistroFormaPagoBancoConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosRegistroFormaPagoBanco=false;
		this.isTienePermisosRegistroFormaPagoBanco=this.verificarGetPermisosUsuarioOpcionEstadoRegistroFormaPagoBancoClaseRelacionada(this.opcionsRelacionadas,RegistroFormaPagoBancoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoRegistroFormaPagoBanco(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoRegistroFormaPagoBancoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosRegistroFormaPagoBanco=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoRegistroFormaPagoBancoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoRegistroFormaPagoBancoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoRegistroFormaPagoBancoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosRegistroFormaPagoBanco && this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null && this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.remove(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoRegistroFormaPagoBanco() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoRegistroFormaPagoBancoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoRegistroFormaPagoBanco=this.isPermisoActualizarEstadoRegistroFormaPagoBanco;
			this.isPermisoEliminarEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoRegistroFormaPagoBanco=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoRegistroFormaPagoBanco=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoRegistroFormaPagoBanco.setToolTipText(this.jTableDatosEstadoRegistroFormaPagoBanco.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoRegistroFormaPagoBanco(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoRegistroFormaPagoBanco(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoRegistroFormaPagoBanco() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosRegistroFormaPagoBanco && this.estadoregistroformapagobancoConstantesFunciones.mostrarRegistroFormaPagoBancoEstadoRegistroFormaPagoBanco && !EstadoRegistroFormaPagoBancoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Registro Forma Pago Banco");
			reporte.setsDescripcion("Registro Forma Pago Banco");
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
	
		
	public void inicializarCombosForeignKeyEstadoRegistroFormaPagoBancoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoRegistroFormaPagoBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoRegistroFormaPagoBancoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoRegistroFormaPagoBancoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoRegistroFormaPagoBancoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoRegistroFormaPagoBanco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoRegistroFormaPagoBanco()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoRegistroFormaPagoBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoRegistroFormaPagoBanco()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoRegistroFormaPagoBanco();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoRegistroFormaPagoBanco()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoRegistroFormaPagoBanco()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoRegistroFormaPagoBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoRegistroFormaPagoBanco()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoRegistroFormaPagoBanco()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoRegistroFormaPagoBanco()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoRegistroFormaPagoBanco(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoRegistroFormaPagoBanco()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoregistroformapagobancoSessionBean=new EstadoRegistroFormaPagoBancoSessionBean(); 
		this.estadoregistroformapagobancoConstantesFunciones=new EstadoRegistroFormaPagoBancoConstantesFunciones(); 
		this.estadoregistroformapagobancoBean=new EstadoRegistroFormaPagoBanco();//(this.estadoregistroformapagobancoConstantesFunciones); 		
		this.estadoregistroformapagobancoReturnGeneral=new EstadoRegistroFormaPagoBancoParameterReturnGeneral(); 
		
		this.estadoregistroformapagobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoregistroformapagobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoRegistroFormaPagoBanco(true);
			
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
			
			this.estadoregistroformapagobancoConstantesFunciones=new EstadoRegistroFormaPagoBancoConstantesFunciones(); 
			this.estadoregistroformapagobancoBean=new EstadoRegistroFormaPagoBanco();//this.estadoregistroformapagobancoConstantesFunciones); 			
			this.estadoregistroformapagobancoReturnGeneral=new EstadoRegistroFormaPagoBancoParameterReturnGeneral(); 
		
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Registro Forma Pago Banco Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoregistroformapagobanco=new EstadoRegistroFormaPagoBanco();
			this.estadoregistroformapagobancos = new ArrayList<EstadoRegistroFormaPagoBanco>();
			this.estadoregistroformapagobancosAux = new ArrayList<EstadoRegistroFormaPagoBanco>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic=new EstadoRegistroFormaPagoBancoLogic();
				this.estadoregistroformapagobancoLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoregistroformapagobancoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoregistroformapagobancoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco);	
					}
					
					if(this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco);
				this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setVisible(false);
				this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco);
					this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco);
					this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setVisible(false);
					this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco);
					this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setVisible(false);
					this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoRegistroFormaPagoBancoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoRegistroFormaPagoBancoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoregistroformapagobancoReturnGeneral=new EstadoRegistroFormaPagoBancoParameterReturnGeneral();
			
			this.estadoregistroformapagobancoParameterGeneral=new EstadoRegistroFormaPagoBancoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoregistroformapagobancoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(RegistroFormaPagoBancoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoRegistroFormaPagoBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado(),this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoRegistroFormaPagoBancoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado(),this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaDuplicarEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaCopiarEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaVerFormEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoRegistroFormaPagoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoRegistroFormaPagoBanco();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoRegistroFormaPagoBanco(false);
			
			this.setPermisosUsuarioEstadoRegistroFormaPagoBanco();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado() && this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoRegistroFormaPagoBancoClasesRelacionadas();
			}
			
			if(this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoRegistroFormaPagoBancoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoRegistroFormaPagoBanco();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoRegistroFormaPagoBanco();
			}
			
			if(!this.isPermisoBusquedaEstadoRegistroFormaPagoBanco) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoRegistroFormaPagoBanco,this.isPermisoPaginacionMedioEstadoRegistroFormaPagoBanco,this.isPermisoPaginacionTodoEstadoRegistroFormaPagoBanco);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoRegistroFormaPagoBancoConstantesFunciones.getTiposSeleccionarEstadoRegistroFormaPagoBanco());
				
				this.tiposColumnasSelect=EstadoRegistroFormaPagoBancoConstantesFunciones.getTiposSeleccionarEstadoRegistroFormaPagoBanco(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoRegistroFormaPagoBanco();				
				//this.tiposRelacionesSelect=EstadoRegistroFormaPagoBancoConstantesFunciones.getTiposRelacionesEstadoRegistroFormaPagoBanco(true);
				
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
			//if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoRegistroFormaPagoBanco();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoRegistroFormaPagoBanco(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoRegistroFormaPagoBanco(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRegistroFormaPagoBanco() ;
			
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
			
			
			this.registroformapagobancoLogic=new RegistroFormaPagoBancoLogic(); 
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
				estadoregistroformapagobancoImplementable= (EstadoRegistroFormaPagoBancoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoRegistroFormaPagoBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoregistroformapagobancoImplementableHome= (EstadoRegistroFormaPagoBancoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoRegistroFormaPagoBancoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoregistroformapagobancos= new ArrayList<EstadoRegistroFormaPagoBanco>();
			this.estadoregistroformapagobancosEliminados= new ArrayList<EstadoRegistroFormaPagoBanco>();
						
			this.isEsNuevoEstadoRegistroFormaPagoBanco=false;
			this.esParaAccionDesdeFormularioEstadoRegistroFormaPagoBanco=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoRegistroFormaPagoBanco(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoRegistroFormaPagoBanco();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoRegistroFormaPagoBancoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoRegistroFormaPagoBanco("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoRegistroFormaPagoBanco();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoRegistroFormaPagoBanco();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoRegistroFormaPagoBanco(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoRegistroFormaPagoBanco: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoRegistroFormaPagoBanco() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoRegistroFormaPagoBanco")) {
				iIndex=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();	
				
				

				if(sTitle.equals("Registro Forma Pago Bancos")) {
					if(!RegistroFormaPagoBancoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoRegistroFormaPagoBanco();

						this.cargarParteTabPanelRelacionadaRegistroFormaPagoBanco(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoRegistroFormaPagoBanco();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaRegistroFormaPagoBanco(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.cargarSessionConBeanSwingJInternalFrameRegistroFormaPagoBanco(false,true,iIndex);
		this.jButtonRegistroFormaPagoBancoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaRegistroFormaPagoBanco();

		//this.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.updateUI();
		//this.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("RegistroFormaPagoBanco")) {
				int row=this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
				jButtonRegistroFormaPagoBancoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Registro Forma Pago Banco")) {

					if(this.isTienePermisosRegistroFormaPagoBanco && this.estadoregistroformapagobancoConstantesFunciones.mostrarRegistroFormaPagoBancoEstadoRegistroFormaPagoBanco && !EstadoRegistroFormaPagoBancoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Registro Forma Pago Bancos"+"("+RegistroFormaPagoBancoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Registro Forma Pago Bancos");

						if(estadoregistroformapagobancoConstantesFunciones.resaltarRegistroFormaPagoBancoEstadoRegistroFormaPagoBanco!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoregistroformapagobancoConstantesFunciones.resaltarRegistroFormaPagoBancoEstadoRegistroFormaPagoBanco);
						}

						jmenuItem.setEnabled(this.estadoregistroformapagobancoConstantesFunciones.activarRegistroFormaPagoBancoEstadoRegistroFormaPagoBanco);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"RegistroFormaPagoBanco"));

						

						this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jmenuDetalleEstadoRegistroFormaPagoBanco.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoRegistroFormaPagoBanco(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoRegistroFormaPagoBanco(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoRegistroFormaPagoBanco(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoRegistroFormaPagoBancoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoRegistroFormaPagoBanco();
		
		this.cargarCombosFrameForeignKeyEstadoRegistroFormaPagoBanco();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoRegistroFormaPagoBanco();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoRegistroFormaPagoBanco();
		}
	}
	
	
	
	public void jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			
			
			if(jTableDatosEstadoRegistroFormaPagoBanco.getRowCount()>=1) {
				jTableDatosEstadoRegistroFormaPagoBanco.removeRowSelectionInterval(0, jTableDatosEstadoRegistroFormaPagoBanco.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoRegistroFormaPagoBanco=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoRegistroFormaPagoBanco(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoRegistroFormaPagoBanco(true);			
			//this.estadoregistroformapagobanco=new EstadoRegistroFormaPagoBanco();
			//this.estadoregistroformapagobanco.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoRegistroFormaPagoBanco(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRegistroFormaPagoBanco() ;
			
			if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoRegistroFormaPagoBanco(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoregistroformapagobanco);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);				
			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			
			if(this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoRegistroFormaPagoBanco: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRows().length;			
			}
			
			estadoregistroformapagobancosSeleccionados=this.getEstadoRegistroFormaPagoBancosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoRegistroFormaPagoBanco--;			
				//EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux= new EstadoRegistroFormaPagoBanco();			
				//estadoregistroformapagobancoAux.setId(this.iIdNuevoEstadoRegistroFormaPagoBanco);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoRegistroFormaPagoBanco estadoregistroformapagobancoOrigen=new EstadoRegistroFormaPagoBanco();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoOrigen : estadoregistroformapagobancosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoregistroformapagobancoOrigen =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoregistroformapagobancoOrigen =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoRegistroFormaPagoBanco();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoregistroformapagobanco.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoRegistroFormaPagoBanco(estadoregistroformapagobancoOrigen,this.estadoregistroformapagobanco,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().add(this.estadoregistroformapagobancoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoregistroformapagobancos.add(this.estadoregistroformapagobancoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
				
				this.jTableDatosEstadoRegistroFormaPagoBanco.setRowSelectionInterval(this.getIndiceNuevoEstadoRegistroFormaPagoBanco(), this.getIndiceNuevoEstadoRegistroFormaPagoBanco());
				
				int iLastRow =  this.jTableDatosEstadoRegistroFormaPagoBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoRegistroFormaPagoBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoRegistroFormaPagoBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();									
		
			EstadoRegistroFormaPagoBanco estadoregistroformapagobancoOrigen=new EstadoRegistroFormaPagoBanco();
			EstadoRegistroFormaPagoBanco estadoregistroformapagobancoDestino=new EstadoRegistroFormaPagoBanco();
				
			estadoregistroformapagobancosSeleccionados=this.getEstadoRegistroFormaPagoBancosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoregistroformapagobancosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoregistroformapagobancoOrigen =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoregistroformapagobancoOrigen =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoregistroformapagobancoDestino =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoregistroformapagobancoDestino =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoregistroformapagobancoOrigen =estadoregistroformapagobancosSeleccionados.get(0);
				estadoregistroformapagobancoDestino =estadoregistroformapagobancosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoRegistroFormaPagoBanco(estadoregistroformapagobancoOrigen,estadoregistroformapagobancoDestino,true,false);
				
				estadoregistroformapagobancoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoregistroformapagobancoDestino,estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoregistroformapagobancoDestino,estadoregistroformapagobancos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
				
				//this.jTableDatosEstadoRegistroFormaPagoBanco.setRowSelectionInterval(this.getIndiceNuevoEstadoRegistroFormaPagoBanco(), this.getIndiceNuevoEstadoRegistroFormaPagoBanco());
				
				int iLastRow =  this.jTableDatosEstadoRegistroFormaPagoBanco.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoRegistroFormaPagoBanco.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoRegistroFormaPagoBanco.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.isVisible();
			
			
			this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.setVisible(!isVisible);
			this.jPanelPaginacionEstadoRegistroFormaPagoBanco.setVisible(!isVisible);
			this.jPanelAccionesEstadoRegistroFormaPagoBanco.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoRegistroFormaPagoBanco();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoRegistroFormaPagoBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoRegistroFormaPagoBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoRegistroFormaPagoBanco();
			
			this.abrirFrameOrderByEstadoRegistroFormaPagoBanco();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoRegistroFormaPagoBanco();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoRegistroFormaPagoBanco(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setSize(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.iWidthFormulario,this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jContentPaneDetalleEstadoRegistroFormaPagoBanco.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jContentPaneDetalleEstadoRegistroFormaPagoBanco.getWidth(),EstadoRegistroFormaPagoBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jContentPaneDetalleEstadoRegistroFormaPagoBanco.getWidth(),EstadoRegistroFormaPagoBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jContentPaneDetalleEstadoRegistroFormaPagoBanco.getWidth(),EstadoRegistroFormaPagoBancoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(RegistroFormaPagoBancoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaRegistroFormaPagoBanco();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoRegistroFormaPagoBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco,false,this);
				} else {
					this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco);
				this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setVisible(false);
				this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setSelected(false);
				
				this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoRegistroFormaPagoBanco"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoRegistroFormaPagoBanco();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoRegistroFormaPagoBanco() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco==null) {
				
				this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco=new ImportacionJInternalFrame(EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco);
				this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setVisible(false);
				this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setSelected(false);


				this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoRegistroFormaPagoBanco"));
				this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoRegistroFormaPagoBanco"));
				this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoRegistroFormaPagoBanco"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoRegistroFormaPagoBanco() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco==null) {
				this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco=new ReporteDinamicoJInternalFrame(EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco);
				this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoRegistroFormaPagoBanco"));
				this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoRegistroFormaPagoBanco"));
				this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoRegistroFormaPagoBanco();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaRegistroFormaPagoBanco() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.jScrollPanelDatosRegistroFormaPagoBanco.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jContentPaneDetalleEstadoRegistroFormaPagoBanco.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.jScrollPanelDatosRegistroFormaPagoBanco.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.jScrollPanelDatosRegistroFormaPagoBanco.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.jScrollPanelDatosRegistroFormaPagoBanco.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoRegistroFormaPagoBanco() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco);
			
	       	this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.dispose();
			//this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoRegistroFormaPagoBanco() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoRegistroFormaPagoBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setVisible(true);
	        this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoRegistroFormaPagoBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setVisible(true);
	        this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoRegistroFormaPagoBanco() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setVisible(false);
	        this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoRegistroFormaPagoBanco() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoRegistroFormaPagoBanco() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setVisible(false);
	        this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoRegistroFormaPagoBanco(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoRegistroFormaPagoBanco(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoRegistroFormaPagoBanco(true);
			//this.isEsNuevoEstadoRegistroFormaPagoBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoRegistroFormaPagoBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoRegistroFormaPagoBanco(false) ;
			
			if(estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoSessionBean.getEsGuardarRelacionado() && RegistroFormaPagoBancoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRegistroFormaPagoBancoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoRegistroFormaPagoBanco(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRegistroFormaPagoBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoRegistroFormaPagoBanco(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoRegistroFormaPagoBanco(true);
			//this.isEsNuevoEstadoRegistroFormaPagoBanco=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoregistroformapagobanco.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoRegistroFormaPagoBanco("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoRegistroFormaPagoBanco(false) ;
			
			if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoRegistroFormaPagoBanco(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRegistroFormaPagoBanco(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoRegistroFormaPagoBanco(false);
			
			//if(!this.isEsNuevoEstadoRegistroFormaPagoBanco) {								
				int intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
				
			}
			
			if(this.permiteMantenimiento(this.estadoregistroformapagobanco)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoRegistroFormaPagoBanco=true;
					this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
					this.isEsNuevoEstadoRegistroFormaPagoBanco=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoRegistroFormaPagoBanco=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoRegistroFormaPagoBanco=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoRegistroFormaPagoBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoRegistroFormaPagoBanco(false);
				
				this.habilitarDeshabilitarControlesEstadoRegistroFormaPagoBanco(false);
			
												
				
				if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoRegistroFormaPagoBanco();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,estadoregistroformapagobancoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoRegistroFormaPagoBanco.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoregistroformapagobancoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoregistroformapagobanco.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoRegistroFormaPagoBanco.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRegistroFormaPagoBanco.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				this.estadoregistroformapagobanco.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				this.estadoregistroformapagobanco.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoregistroformapagobanco)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoRegistroFormaPagoBancoModel) this.jTableDatosEstadoRegistroFormaPagoBanco.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoRegistroFormaPagoBanco=true;
				this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
				this.isEsNuevoEstadoRegistroFormaPagoBanco=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoRegistroFormaPagoBanco(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoRegistroFormaPagoBanco(false);
				
				this.habilitarDeshabilitarControlesEstadoRegistroFormaPagoBanco(false);
				
				
				
				if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoRegistroFormaPagoBanco();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoRegistroFormaPagoBanco.getRowCount()>=1) {
				jTableDatosEstadoRegistroFormaPagoBanco.removeRowSelectionInterval(0, jTableDatosEstadoRegistroFormaPagoBanco.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoRegistroFormaPagoBanco(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoRegistroFormaPagoBanco(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoRegistroFormaPagoBanco(false) ;
			
			this.isEsNuevoEstadoRegistroFormaPagoBanco=false;
			
			if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoRegistroFormaPagoBanco();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false);
				
				//SI ES MANUAL
				if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoRegistroFormaPagoBanco();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoRegistroFormaPagoBanco--;			
			//EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux= new EstadoRegistroFormaPagoBanco();			
			//estadoregistroformapagobancoAux.setId(this.iIdNuevoEstadoRegistroFormaPagoBanco);
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoRegistroFormaPagoBanco();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
			
			this.estadoregistroformapagobanco.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().add(this.estadoregistroformapagobancoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoregistroformapagobancos.add(this.estadoregistroformapagobancoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
			
			this.jTableDatosEstadoRegistroFormaPagoBanco.setRowSelectionInterval(this.getIndiceNuevoEstadoRegistroFormaPagoBanco(), this.getIndiceNuevoEstadoRegistroFormaPagoBanco());
			
			int iLastRow =  this.jTableDatosEstadoRegistroFormaPagoBanco.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoRegistroFormaPagoBanco.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoRegistroFormaPagoBanco.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false);
			
			//SI ES MANUAL
			if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoRegistroFormaPagoBanco();
			}
			
			//this.abrirFrameTreeEstadoRegistroFormaPagoBanco();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Registro Forma Pago BancoS ?", "MANTENIMIENTO DE Estado Registro Forma Pago Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoRegistroFormaPagoBanco();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoregistroformapagobancoReturnGeneral=estadoregistroformapagobancoLogic.procesarImportacionEstadoRegistroFormaPagoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoregistroformapagobancoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoRegistroFormaPagoBancoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setFileImportacion(this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoRegistroFormaPagoBanco.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();		

		estadoregistroformapagobancosSeleccionados=this.getEstadoRegistroFormaPagoBancosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoRegistroFormaPagoBancoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoRegistroFormaPagoBancoBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoRegistroFormaPagoBancos("Todos",estadoregistroformapagobancosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Registro Forma Pago Banco",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();		
		
		estadoregistroformapagobancosSeleccionados=this.getEstadoRegistroFormaPagoBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoregistroformapagobanco";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoRegistroFormaPagoBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco:estadoregistroformapagobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoregistroformapagobanco.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco:estadoregistroformapagobancosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoregistroformapagobanco.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoRegistroFormaPagoBanco(row);				
			//	iRow++;
			//}				
			
			//for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:estadoregistroformapagobancosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoRegistroFormaPagoBanco(estadoregistroformapagobancoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Registro Forma Pago Banco",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoregistroformapagobancoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false);
			
			//SI ES MANUAL
			if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoRegistroFormaPagoBanco();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false);
			
			//SI ES MANUAL
			if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoRegistroFormaPagoBanco();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoRegistroFormaPagoBancoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false);
			
			//SI ES MANUAL
			if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoRegistroFormaPagoBanco();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoregistroformapagobancoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoRegistroFormaPagoBanco() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoRegistroFormaPagoBanco.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoRegistroFormaPagoBanco.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoRegistroFormaPagoBanco.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoRegistroFormaPagoBanco.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoRegistroFormaPagoBanco.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoRegistroFormaPagoBanco.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoRegistroFormaPagoBanco.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoRegistroFormaPagoBanco(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoRegistroFormaPagoBanco(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoRegistroFormaPagoBanco(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoRegistroFormaPagoBanco(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRegistroFormaPagoBanco(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoRegistroFormaPagoBanco(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoRegistroFormaPagoBanco() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco();
		
		this.inicializarActualizarBindingBotonesManualEstadoRegistroFormaPagoBanco(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoRegistroFormaPagoBanco();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRegistroFormaPagoBanco() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoRegistroFormaPagoBanco(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoRegistroFormaPagoBanco(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoRegistroFormaPagoBanco.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jCheckBoxPostAccionNuevoEstadoRegistroFormaPagoBanco.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jCheckBoxPostAccionSinCerrarEstadoRegistroFormaPagoBanco.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jCheckBoxPostAccionSinMensajeEstadoRegistroFormaPagoBanco.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoRegistroFormaPagoBanco.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
				this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jCheckBoxPostAccionNuevoEstadoRegistroFormaPagoBanco.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jCheckBoxPostAccionSinCerrarEstadoRegistroFormaPagoBanco.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jCheckBoxPostAccionSinMensajeEstadoRegistroFormaPagoBanco.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoRegistroFormaPagoBanco(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoRegistroFormaPagoBanco(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoRegistroFormaPagoBanco() throws Exception {
		try	{
			if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoRegistroFormaPagoBanco();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoRegistroFormaPagoBanco() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoRegistroFormaPagoBanco() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoRegistroFormaPagoBanco.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoRegistroFormaPagoBanco.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoRegistroFormaPagoBanco.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco.addItem(reporte);
			}
			
			
			if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoRegistroFormaPagoBanco.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoRegistroFormaPagoBanco();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoRegistroFormaPagoBanco() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco!=null) {
				this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco!=null) {
				this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoRegistroFormaPagoBanco()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoRegistroFormaPagoBanco(Boolean esInicializar) throws Exception {				
		if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoRegistroFormaPagoBanco();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco() throws Exception {
		this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoRegistroFormaPagoBanco() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoRegistroFormaPagoBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoRegistroFormaPagoBancoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoRegistroFormaPagoBancoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRegistroFormaPagoBancoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoRegistroFormaPagoBancoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoRegistroFormaPagoBancoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoregistroformapagobancos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoRegistroFormaPagoBanco.setModel(new EstadoRegistroFormaPagoBancoModel(this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoRegistroFormaPagoBanco.setModel(new EstadoRegistroFormaPagoBancoModel(this.estadoregistroformapagobancos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco!=null && this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoRegistroFormaPagoBanco();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRegistroFormaPagoBanco,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoRegistroFormaPagoBancoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO,estadoregistroformapagobancoConstantesFunciones.resaltarSeleccionarEstadoRegistroFormaPagoBanco,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoRegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO,estadoregistroformapagobancoConstantesFunciones.resaltarSeleccionarEstadoRegistroFormaPagoBanco,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRegistroFormaPagoBanco,EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_ID));

		if(this.estadoregistroformapagobancoConstantesFunciones.mostraridEstadoRegistroFormaPagoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoregistroformapagobancoConstantesFunciones.resaltaridEstadoRegistroFormaPagoBanco,this.estadoregistroformapagobancoConstantesFunciones.activaridEstadoRegistroFormaPagoBanco,this,true,"idEstadoRegistroFormaPagoBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoregistroformapagobancoConstantesFunciones.resaltaridEstadoRegistroFormaPagoBanco,this.estadoregistroformapagobancoConstantesFunciones.activaridEstadoRegistroFormaPagoBanco,this,true,"idEstadoRegistroFormaPagoBanco","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRegistroFormaPagoBanco,EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO));

		if(this.estadoregistroformapagobancoConstantesFunciones.mostrarcodigoEstadoRegistroFormaPagoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoregistroformapagobancoConstantesFunciones.resaltarcodigoEstadoRegistroFormaPagoBanco,this.estadoregistroformapagobancoConstantesFunciones.activarcodigoEstadoRegistroFormaPagoBanco,this,true,"codigoEstadoRegistroFormaPagoBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoregistroformapagobancoConstantesFunciones.resaltarcodigoEstadoRegistroFormaPagoBanco,this.estadoregistroformapagobancoConstantesFunciones.activarcodigoEstadoRegistroFormaPagoBanco,this,true,"codigoEstadoRegistroFormaPagoBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoRegistroFormaPagoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoRegistroFormaPagoBanco,EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoregistroformapagobancoConstantesFunciones.mostrarnombreEstadoRegistroFormaPagoBanco && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoregistroformapagobancoConstantesFunciones.resaltarnombreEstadoRegistroFormaPagoBanco,this.estadoregistroformapagobancoConstantesFunciones.activarnombreEstadoRegistroFormaPagoBanco,this,true,"nombreEstadoRegistroFormaPagoBanco","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoregistroformapagobancoConstantesFunciones.resaltarnombreEstadoRegistroFormaPagoBanco,this.estadoregistroformapagobancoConstantesFunciones.activarnombreEstadoRegistroFormaPagoBanco,this,true,"nombreEstadoRegistroFormaPagoBanco","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoRegistroFormaPagoBancoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosRegistroFormaPagoBanco && this.estadoregistroformapagobancoConstantesFunciones.mostrarRegistroFormaPagoBancoEstadoRegistroFormaPagoBanco && !EstadoRegistroFormaPagoBancoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Registro Forma Pago Bancos");
				tableColumn.setHeaderValue("Registro Forma Pago Bancos");
				tableColumn.setCellRenderer(new RegistroFormaPagoBancoTableCell(estadoregistroformapagobancoConstantesFunciones.resaltarRegistroFormaPagoBancoEstadoRegistroFormaPagoBanco,this,this.estadoregistroformapagobancoConstantesFunciones.activarRegistroFormaPagoBancoEstadoRegistroFormaPagoBanco));
				tableColumn.setCellEditor(new RegistroFormaPagoBancoTableCell(estadoregistroformapagobancoConstantesFunciones.resaltarRegistroFormaPagoBancoEstadoRegistroFormaPagoBanco,this,this.estadoregistroformapagobancoConstantesFunciones.activarRegistroFormaPagoBancoEstadoRegistroFormaPagoBanco));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoRegistroFormaPagoBanco.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoRegistroFormaPagoBanco.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoRegistroFormaPagoBanco.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoRegistroFormaPagoBanco && this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoRegistroFormaPagoBanco.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoRegistroFormaPagoBanco.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoRegistroFormaPagoBanco.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoRegistroFormaPagoBanco && this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoRegistroFormaPagoBanco && this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoRegistroFormaPagoBanco.moveColumn(this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoRegistroFormaPagoBanco.moveColumn(this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoRegistroFormaPagoBanco.moveColumn(this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoRegistroFormaPagoBanco.moveColumn(this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoRegistroFormaPagoBanco.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoRegistroFormaPagoBanco.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoRegistroFormaPagoBanco,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoRegistroFormaPagoBanco.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoRegistroFormaPagoBanco.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoRegistroFormaPagoBanco.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoregistroformapagobancos.size()-1;
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
		//this.jTableDatosEstadoRegistroFormaPagoBanco.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoRegistroFormaPagoBanco.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoRegistroFormaPagoBanco();
			
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
				
				//this.isEsNuevoEstadoRegistroFormaPagoBanco=false;
					
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			
				if(this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoregistroformapagobanco.getsType().equals("DUPLICADO")
				   || this.estadoregistroformapagobanco.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoRegistroFormaPagoBanco=true;
				
				} else {
					this.isEsNuevoEstadoRegistroFormaPagoBanco=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoregistroformapagobanco.getId()>=0 && !this.estadoregistroformapagobanco.getIsNew()) {						
						this.isEsNuevoEstadoRegistroFormaPagoBanco=false;
						
					} else {
						this.isEsNuevoEstadoRegistroFormaPagoBanco=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoRegistroFormaPagoBanco(esRelaciones);						
				
				this.seleccionarEstadoRegistroFormaPagoBanco(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoregistroformapagobanco.getId()<0) {
					this.isEsNuevoEstadoRegistroFormaPagoBanco=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoRegistroFormaPagoBanco(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoRegistroFormaPagoBanco(evt,rowIndex);
				}	
				
				if(this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoRegistroFormaPagoBanco: " + this.dDif); 
					}
				}								
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoRegistroFormaPagoBanco(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoregistroformapagobanco)) {
					if(this.estadoregistroformapagobanco.getId()>0) {
						this.estadoregistroformapagobanco.setIsDeleted(true);
						
						this.estadoregistroformapagobancosEliminados.add(this.estadoregistroformapagobanco);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().remove(this.estadoregistroformapagobanco);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoregistroformapagobancos.remove(this.estadoregistroformapagobanco);				
					}
					
					
					((EstadoRegistroFormaPagoBancoModel) this.jTableDatosEstadoRegistroFormaPagoBanco.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoRegistroFormaPagoBanco(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoRegistroFormaPagoBanco) {
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoRegistroFormaPagoBanco("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoRegistroFormaPagoBanco(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoRegistroFormaPagoBanco() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoRegistroFormaPagoBanco(estadoregistroformapagobanco,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoRegistroFormaPagoBanco(estadoregistroformapagobanco);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoRegistroFormaPagoBanco(estadoregistroformapagobanco,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoRegistroFormaPagoBanco(estadoregistroformapagobanco);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldidEstadoRegistroFormaPagoBanco.setText(estadoregistroformapagobanco.getId().toString());
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldcodigoEstadoRegistroFormaPagoBanco.setText(estadoregistroformapagobanco.getcodigo());
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextAreanombreEstadoRegistroFormaPagoBanco.setText(estadoregistroformapagobanco.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoRegistroFormaPagoBanco estadoregistroformapagobancoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoregistroformapagobancoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoRegistroFormaPagoBanco estadoregistroformapagobancoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoregistroformapagobancoLocal=this.estadoregistroformapagobanco;
			} else {
				estadoregistroformapagobancoLocal=this.estadoregistroformapagobancoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoregistroformapagobancoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoRegistroFormaPagoBanco(estadoregistroformapagobancoLocal,true);
					
					if(estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoregistroformapagobancoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoregistroformapagobancoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(estadoregistroformapagobanco,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(estadoregistroformapagobanco);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(estadoregistroformapagobanco,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldidEstadoRegistroFormaPagoBanco.getText()==null || this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldidEstadoRegistroFormaPagoBanco.getText()=="" || this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldidEstadoRegistroFormaPagoBanco.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldidEstadoRegistroFormaPagoBanco.setText("0");
			}

			if(conColumnasBase) {estadoregistroformapagobanco.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldidEstadoRegistroFormaPagoBanco.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jLabelIdEstadoRegistroFormaPagoBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoregistroformapagobanco.setcodigo(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldcodigoEstadoRegistroFormaPagoBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jLabelcodigoEstadoRegistroFormaPagoBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoregistroformapagobanco.setnombre(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextAreanombreEstadoRegistroFormaPagoBanco.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jLabelnombreEstadoRegistroFormaPagoBanco,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoBean,EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoOrigen,EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoregistroformapagobancoOrigen.getId()!=null && !estadoregistroformapagobancoOrigen.getId().equals(0L))) {estadoregistroformapagobanco.setId(estadoregistroformapagobancoOrigen.getId());}}
			if(conDefault || (!conDefault && estadoregistroformapagobancoOrigen.getcodigo()!=null && !estadoregistroformapagobancoOrigen.getcodigo().equals(""))) {estadoregistroformapagobanco.setcodigo(estadoregistroformapagobancoOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoregistroformapagobancoOrigen.getnombre()!=null && !estadoregistroformapagobancoOrigen.getnombre().equals(""))) {estadoregistroformapagobanco.setnombre(estadoregistroformapagobancoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldidEstadoRegistroFormaPagoBanco.setText(estadoregistroformapagobanco.getId().toString());
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldcodigoEstadoRegistroFormaPagoBanco.setText(estadoregistroformapagobanco.getcodigo());
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextAreanombreEstadoRegistroFormaPagoBanco.setText(estadoregistroformapagobanco.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBancoBean estadoregistroformapagobancoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldidEstadoRegistroFormaPagoBanco.setText(estadoregistroformapagobancoBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldcodigoEstadoRegistroFormaPagoBanco.setText(estadoregistroformapagobancoBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextAreanombreEstadoRegistroFormaPagoBanco.setText(estadoregistroformapagobancoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBancoParameterReturnGeneral estadoregistroformapagobancoReturnGeneral,EstadoRegistroFormaPagoBancoBean estadoregistroformapagobancoBean,Boolean conDefault) throws Exception { 
		try {
			EstadoRegistroFormaPagoBanco estadoregistroformapagobancoLocal=new EstadoRegistroFormaPagoBanco();
			
			estadoregistroformapagobancoLocal=estadoregistroformapagobancoReturnGeneral.getEstadoRegistroFormaPagoBanco();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoregistroformapagobancoLocal.getId()!=null && !estadoregistroformapagobancoLocal.getId().equals(0L))) {estadoregistroformapagobancoBean.setId(estadoregistroformapagobancoLocal.getId());}}
			if(conDefault || (!conDefault && estadoregistroformapagobancoLocal.getcodigo()!=null && !estadoregistroformapagobancoLocal.getcodigo().equals(""))) {estadoregistroformapagobancoBean.setcodigo(estadoregistroformapagobancoLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoregistroformapagobancoLocal.getnombre()!=null && !estadoregistroformapagobancoLocal.getnombre().equals(""))) {estadoregistroformapagobancoBean.setnombre(estadoregistroformapagobancoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoRegistroFormaPagoBancoGenerico(Long idEstadoRegistroFormaPagoBancoSeleccionado,JComboBox jComboBoxEstadoRegistroFormaPagoBanco,List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosLocal)throws Exception {
		try {
			EstadoRegistroFormaPagoBanco  estadoregistroformapagobancoTemp=null;

			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:estadoregistroformapagobancosLocal) {
				if(estadoregistroformapagobancoAux.getId()!=null && estadoregistroformapagobancoAux.getId().equals(idEstadoRegistroFormaPagoBancoSeleccionado)) {
					estadoregistroformapagobancoTemp=estadoregistroformapagobancoAux;
					break;
				}
			}

			jComboBoxEstadoRegistroFormaPagoBanco.setSelectedItem(estadoregistroformapagobancoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoRegistroFormaPagoBancoGenerico(JComboBox jComboBoxEstadoRegistroFormaPagoBanco,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoRegistroFormaPagoBanco.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoRegistroFormaPagoBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoRegistroFormaPagoBanco.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoRegistroFormaPagoBanco.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoRegistroFormaPagoBanco.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoRegistroFormaPagoBanco.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("RegistroFormaPagoBanco")) {
			jButtonRegistroFormaPagoBancoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoregistroformapagobanco=(EstadoRegistroFormaPagoBanco) estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) estadoregistroformapagobancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoRegistroFormaPagoBanco estadoregistroformapagobancoRow=new EstadoRegistroFormaPagoBanco();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoregistroformapagobancoRow=(EstadoRegistroFormaPagoBanco) estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoregistroformapagobancoRow=(EstadoRegistroFormaPagoBanco) estadoregistroformapagobancos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonRegistroFormaPagoBancoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoRegistroFormaPagoBanco estadoregistroformapagobanco) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoregistroformapagobanco = (EstadoRegistroFormaPagoBanco)this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoregistroformapagobanco = (EstadoRegistroFormaPagoBanco)this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoregistroformapagobanco!=null) {
						this.estadoregistroformapagobanco = estadoregistroformapagobanco;
					} else {
						this.estadoregistroformapagobanco = new EstadoRegistroFormaPagoBanco();
					}
				}

				if(this.isTienePermisosRegistroFormaPagoBanco && this.permiteMantenimiento(this.estadoregistroformapagobanco)) {
					RegistroFormaPagoBancoBeanSwingJInternalFrame registroformapagobancoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFramePopup=new RegistroFormaPagoBancoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						registroformapagobancoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFramePopup;
					} else {
						registroformapagobancoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame;
					}

					List<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancos=new ArrayList<EstadoRegistroFormaPagoBanco>();
					estadoregistroformapagobancos.add(this.estadoregistroformapagobanco);
					if(!esRelacionado) {
						//registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoSessionBean.setConGuardarRelaciones(false);
						//registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					registroformapagobancoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.cargarRegistroFormaPagoBancoBeanSwingJInternalFrame(estadoregistroformapagobancos,this.estadoregistroformapagobanco,registroformapagobancoBeanSwingJInternalFrame,/*conInicializar,*/registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoSessionBean.getConGuardarRelaciones(),registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoSessionBean.getEsGuardarRelacionado());
					registroformapagobancoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						registroformapagobancoBeanSwingJInternalFrame.actualizarEstadoPanelsRegistroFormaPagoBanco("no_relacionado");

						registroformapagobancoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(RegistroFormaPagoBancoConstantesFunciones.ITAMANIOFILATABLA + (RegistroFormaPagoBancoConstantesFunciones.ITAMANIOFILATABLA/2));

						registroformapagobancoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoRegistroFormaPagoBanco=(TitledBorder)this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.getBorder();
						TitledBorder titledBorderRegistroFormaPagoBanco=(TitledBorder)registroformapagobancoBeanSwingJInternalFrame.jScrollPanelDatosRegistroFormaPagoBanco.getBorder();

						titledBorderRegistroFormaPagoBanco.setTitle(titledBorderEstadoRegistroFormaPagoBanco.getTitle() + " -> Registro Forma Pago Banco");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,registroformapagobancoBeanSwingJInternalFrame);
						}

						registroformapagobancoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(registroformapagobancoBeanSwingJInternalFrame);

						registroformapagobancoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Registro Forma Pago Banco",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoRegistroFormaPagoBanco(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco && this.isPermisoNuevoEstadoRegistroFormaPagoBanco));			
			this.jButtonDuplicarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaDuplicarEstadoRegistroFormaPagoBanco && this.isPermisoDuplicarEstadoRegistroFormaPagoBanco));			
			this.jButtonCopiarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaCopiarEstadoRegistroFormaPagoBanco && this.isPermisoCopiarEstadoRegistroFormaPagoBanco));
			this.jButtonVerFormEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaVerFormEstadoRegistroFormaPagoBanco && this.isPermisoVerFormEstadoRegistroFormaPagoBanco));
			
			this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco && this.isPermisoOrdenEstadoRegistroFormaPagoBanco));			
			
			this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco && this.isPermisoNuevoEstadoRegistroFormaPagoBanco));			
			this.jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco && this.isPermisoNuevoEstadoRegistroFormaPagoBanco && this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco));
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonModificarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco && this.isPermisoActualizarEstadoRegistroFormaPagoBanco));	
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonActualizarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco && this.isPermisoActualizarEstadoRegistroFormaPagoBanco));	
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonEliminarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco && this.isPermisoEliminarEstadoRegistroFormaPagoBanco));
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonCancelarEstadoRegistroFormaPagoBanco.setVisible(this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco);							
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco && this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco && this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco && this.isPermisoNuevoEstadoRegistroFormaPagoBanco));						
			this.jButtonDuplicarToolBarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaDuplicarEstadoRegistroFormaPagoBanco && this.isPermisoDuplicarEstadoRegistroFormaPagoBanco));						
			this.jButtonCopiarToolBarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaCopiarEstadoRegistroFormaPagoBanco && this.isPermisoCopiarEstadoRegistroFormaPagoBanco));			
			this.jButtonVerFormToolBarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaVerFormEstadoRegistroFormaPagoBanco && this.isPermisoVerFormEstadoRegistroFormaPagoBanco));			
			this.jButtonAbrirOrderByToolBarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco && this.isPermisoOrdenEstadoRegistroFormaPagoBanco));
			this.jButtonNuevoRelacionesToolBarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco && this.isPermisoNuevoEstadoRegistroFormaPagoBanco));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco && this.isPermisoNuevoEstadoRegistroFormaPagoBanco && this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco));			
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonModificarToolBarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco && this.isPermisoActualizarEstadoRegistroFormaPagoBanco));	
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonActualizarToolBarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco  && this.isPermisoActualizarEstadoRegistroFormaPagoBanco));	
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonEliminarToolBarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco && this.isPermisoEliminarEstadoRegistroFormaPagoBanco));
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonCancelarToolBarEstadoRegistroFormaPagoBanco.setVisible(this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco);				
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonGuardarCambiosToolBarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco && this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco && this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco && this.isPermisoNuevoEstadoRegistroFormaPagoBanco));			
			this.jMenuItemDuplicarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaDuplicarEstadoRegistroFormaPagoBanco && this.isPermisoDuplicarEstadoRegistroFormaPagoBanco));			
			this.jMenuItemCopiarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaCopiarEstadoRegistroFormaPagoBanco && this.isPermisoCopiarEstadoRegistroFormaPagoBanco));			
			this.jMenuItemVerFormEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaVerFormEstadoRegistroFormaPagoBanco && this.isPermisoVerFormEstadoRegistroFormaPagoBanco));			
			this.jMenuItemAbrirOrderByEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco && this.isPermisoOrdenEstadoRegistroFormaPagoBanco));			
			//this.jMenuItemMostrarOcultarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco && this.isPermisoOrdenEstadoRegistroFormaPagoBanco));
			this.jMenuItemDetalleAbrirOrderByEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco && this.isPermisoOrdenEstadoRegistroFormaPagoBanco));			
			//this.jMenuItemDetalleMostrarOcultarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco && this.isPermisoOrdenEstadoRegistroFormaPagoBanco));			
			this.jMenuItemNuevoRelacionesEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco && this.isPermisoNuevoEstadoRegistroFormaPagoBanco));			
			this.jMenuItemNuevoGuardarCambiosEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco && this.isPermisoNuevoEstadoRegistroFormaPagoBanco && this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco));									
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemModificarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco && this.isPermisoActualizarEstadoRegistroFormaPagoBanco));	
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemActualizarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco && this.isPermisoActualizarEstadoRegistroFormaPagoBanco));	
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemEliminarEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco && this.isPermisoEliminarEstadoRegistroFormaPagoBanco));
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemCancelarEstadoRegistroFormaPagoBanco.setVisible(this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco);				
			}
			
			this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco && this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco));						
			this.jMenuItemGuardarCambiosTablaEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco && this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=this.jButtonNuevoEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoRegistroFormaPagoBanco=this.jButtonDuplicarEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaCopiarEstadoRegistroFormaPagoBanco=this.jButtonCopiarEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaVerFormEstadoRegistroFormaPagoBanco=this.jButtonVerFormEstadoRegistroFormaPagoBanco.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoRegistroFormaPagoBanco=this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco=this.jButtonModificarEstadoRegistroFormaPagoBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
			this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonActualizarEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonEliminarEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonCancelarEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=this.jButtonNuevoToolBarEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=this.jButtonNuevoRelacionesToolBarEstadoRegistroFormaPagoBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
			this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonModificarToolBarEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonActualizarToolBarEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonEliminarToolBarEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonCancelarToolBarEstadoRegistroFormaPagoBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=this.jButtonGuardarCambiosToolBarEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=this.jButtonGuardarCambiosTablaToolBarEstadoRegistroFormaPagoBanco.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=this.jMenuItemNuevoEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=this.jMenuItemNuevoRelacionesEstadoRegistroFormaPagoBanco.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
			this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemModificarEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemActualizarEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemEliminarEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemCancelarEstadoRegistroFormaPagoBanco.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=this.jMenuItemGuardarCambiosTablaEstadoRegistroFormaPagoBanco.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoRegistroFormaPagoBanco(Boolean esInicializar) {
		if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoRegistroFormaPagoBanco();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoRegistroFormaPagoBanco(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoRegistroFormaPagoBanco() {
		this.jButtonNuevoEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoNuevoEstadoRegistroFormaPagoBanco);			
		this.jButtonDuplicarEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoDuplicarEstadoRegistroFormaPagoBanco);			
		this.jButtonCopiarEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoCopiarEstadoRegistroFormaPagoBanco);			
		this.jButtonVerFormEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoVerFormEstadoRegistroFormaPagoBanco);			
		
		this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoOrdenEstadoRegistroFormaPagoBanco);					
		
		this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoNuevoEstadoRegistroFormaPagoBanco);			
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonModificarEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoActualizarEstadoRegistroFormaPagoBanco);	
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonActualizarEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoActualizarEstadoRegistroFormaPagoBanco);	
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonEliminarEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoEliminarEstadoRegistroFormaPagoBanco);
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonCancelarEstadoRegistroFormaPagoBanco.setVisible(this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco);						
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoActualizarEstadoRegistroFormaPagoBanco);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoRegistroFormaPagoBanco() {
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonModificarEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoActualizarEstadoRegistroFormaPagoBanco);	
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonActualizarEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoActualizarEstadoRegistroFormaPagoBanco);	
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonEliminarEstadoRegistroFormaPagoBanco.setVisible(this.isPermisoEliminarEstadoRegistroFormaPagoBanco);
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonCancelarEstadoRegistroFormaPagoBanco.setVisible(this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco);							
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco.setVisible((this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco && this.isPermisoGuardarCambiosEstadoRegistroFormaPagoBanco));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoRegistroFormaPagoBanco() {
		if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoRegistroFormaPagoBanco();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoRegistroFormaPagoBanco() {
	}
	
	public void jTableDatosEstadoRegistroFormaPagoBancoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoRegistroFormaPagoBanco(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoRegistroFormaPagoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(this.getestadoregistroformapagobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoregistroformapagobanco==null) {
						this.estadoregistroformapagobanco = new EstadoRegistroFormaPagoBanco();
					}

					this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
				}

				if(this.estadoregistroformapagobanco.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoregistroformapagobanco.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoRegistroFormaPagoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(this.getestadoregistroformapagobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoregistroformapagobanco==null) {
						this.estadoregistroformapagobanco = new EstadoRegistroFormaPagoBanco();
					}

					this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
				}

				if(this.estadoregistroformapagobanco.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadoregistroformapagobanco.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoRegistroFormaPagoBancoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(this.getestadoregistroformapagobanco(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoregistroformapagobanco==null) {
						this.estadoregistroformapagobanco = new EstadoRegistroFormaPagoBanco();
					}

					this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);
				}

				if(this.estadoregistroformapagobanco.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoregistroformapagobanco.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoRegistroFormaPagoBanco() {
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.dispose();
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco!=null) {
			this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.dispose();
			this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco=null;
		}
		
		if(this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco!=null) {
			this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.dispose();
			this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoRegistroFormaPagoBanco();
			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoRegistroFormaPagoBanco")) {
				jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoRegistroFormaPagoBanco")) {
				jButtonDuplicarEstadoRegistroFormaPagoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoRegistroFormaPagoBanco")) {
				jButtonCopiarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoRegistroFormaPagoBanco")) {
				jButtonVerFormEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonDuplicarEstadoRegistroFormaPagoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoRegistroFormaPagoBanco")) {
				jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoRegistroFormaPagoBanco")) {
				jButtonDuplicarEstadoRegistroFormaPagoBancoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoRegistroFormaPagoBanco")) {
				jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoRegistroFormaPagoBanco")) {
				jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoRegistroFormaPagoBanco")) {
				jButtonModificarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonModificarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoRegistroFormaPagoBanco")) {
				jButtonModificarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoRegistroFormaPagoBanco")) {
				jButtonActualizarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonActualizarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoRegistroFormaPagoBanco")) {
				jButtonActualizarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoRegistroFormaPagoBanco")) {
				jButtonEliminarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonEliminarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoRegistroFormaPagoBanco")) {
				jButtonEliminarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoRegistroFormaPagoBanco")) {
				jButtonCancelarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonCancelarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoRegistroFormaPagoBanco")) {
				jButtonCancelarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoRegistroFormaPagoBanco")) {
				jButtonCerrarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonCerrarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoRegistroFormaPagoBanco")) {
				jButtonCerrarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonMostrarOcultarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoRegistroFormaPagoBanco")) {
				jButtonCancelarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoRegistroFormaPagoBanco")) {
				jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonCopiarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonVerFormEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoRegistroFormaPagoBanco")) {
				jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoRegistroFormaPagoBanco")) {
				jButtonCopiarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoRegistroFormaPagoBanco")) {
				jButtonVerFormEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoRegistroFormaPagoBanco")) {
				jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoRegistroFormaPagoBanco")) {
				jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoRegistroFormaPagoBanco")) {
				jButtonRecargarInformacionEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonRecargarInformacionEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoRegistroFormaPagoBanco")) {
				jButtonRecargarInformacionEstadoRegistroFormaPagoBancoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoRegistroFormaPagoBanco")) {
				jButtonAnterioresEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonAnterioresEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoRegistroFormaPagoBanco")) {
				jButtonAnterioresEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoRegistroFormaPagoBanco")) {
				jButtonSiguientesEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonSiguientesEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoRegistroFormaPagoBanco")) {
				jButtonSiguientesEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoRegistroFormaPagoBanco") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoRegistroFormaPagoBanco")) {
				jButtonAbrirOrderByEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoRegistroFormaPagoBanco") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoRegistroFormaPagoBanco")) {
				jButtonMostrarOcultarEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoRegistroFormaPagoBanco")) {
				jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoRegistroFormaPagoBanco")) {
				jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoRegistroFormaPagoBanco")) {
				jButtonCerrarReporteDinamicoEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoRegistroFormaPagoBanco")) {
				jButtonGenerarReporteDinamicoEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoRegistroFormaPagoBanco")) {
				jButtonCerrarImportacionEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoRegistroFormaPagoBanco")) {
				
				jButtonGenerarImportacionEstadoRegistroFormaPagoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoRegistroFormaPagoBanco")) {
				
				jButtonAbrirImportacionEstadoRegistroFormaPagoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoRegistroFormaPagoBanco")) {
				jComboBoxTiposAccionesEstadoRegistroFormaPagoBancoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoRegistroFormaPagoBanco")) {
				jComboBoxTiposRelacionesEstadoRegistroFormaPagoBancoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoRegistroFormaPagoBanco")) {
				jComboBoxTiposAccionesEstadoRegistroFormaPagoBancoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoRegistroFormaPagoBanco")) {
				
				jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBancoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoRegistroFormaPagoBanco")) {
				jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBancoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoRegistroFormaPagoBanco")) {
				jButtonAbrirOrderByEstadoRegistroFormaPagoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoRegistroFormaPagoBanco")) {
				jButtonAbrirOrderByEstadoRegistroFormaPagoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoRegistroFormaPagoBanco")) {
				jButtonCerrarOrderByEstadoRegistroFormaPagoBancoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoRegistroFormaPagoBancoBusqueda")) {
				this.jButtonidEstadoRegistroFormaPagoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoRegistroFormaPagoBancoBusqueda")) {
				this.jButtoncodigoEstadoRegistroFormaPagoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoRegistroFormaPagoBancoBusqueda")) {
				this.jButtonnombreEstadoRegistroFormaPagoBancoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoRegistroFormaPagoBanco();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				


				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRegistroFormaPagoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRegistroFormaPagoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoRegistroFormaPagoBanco estadoregistroformapagobancoLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoregistroformapagobancoLocal=this.estadoregistroformapagobanco;
			} else {
				estadoregistroformapagobancoLocal=this.estadoregistroformapagobancoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
							
				
				


				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRegistroFormaPagoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRegistroFormaPagoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
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
			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			
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
			
			


			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
								
						
				


				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRegistroFormaPagoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRegistroFormaPagoBanco.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
								
				
				


				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRegistroFormaPagoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRegistroFormaPagoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
							
				
				


				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRegistroFormaPagoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRegistroFormaPagoBanco.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
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
			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			
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
			
			


			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
								
				
				


				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRegistroFormaPagoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRegistroFormaPagoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoRegistroFormaPagoBanco")) {
					jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBancoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoRegistroFormaPagoBanco")) {
					jCheckBoxSeleccionadosEstadoRegistroFormaPagoBancoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoRegistroFormaPagoBanco")) {
					
				}
				
				


				
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRegistroFormaPagoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRegistroFormaPagoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
												
				
				


				
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRegistroFormaPagoBanco.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRegistroFormaPagoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
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
			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
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
			
			


			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRegistroFormaPagoBanco.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRegistroFormaPagoBanco.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoregistroformapagobanco);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoregistroformapagobanco);
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
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
				
				


				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoRegistroFormaPagoBanco.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoRegistroFormaPagoBanco.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoRegistroFormaPagoBancoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoregistroformapagobancoAnterior =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoRegistroFormaPagoBanco")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoRegistroFormaPagoBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoregistroformapagobanco =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoregistroformapagobanco);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoRegistroFormaPagoBanco")) {
				
				}
				
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoRegistroFormaPagoBanco")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoRegistroFormaPagoBanco")) {
			
			}
			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoRegistroFormaPagoBanco();
			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoRegistroFormaPagoBanco")) {
				jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoRegistroFormaPagoBanco")) {
				jButtonDuplicarEstadoRegistroFormaPagoBancoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoRegistroFormaPagoBanco")) {
				jButtonCopiarEstadoRegistroFormaPagoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoRegistroFormaPagoBanco")) {
				jButtonVerFormEstadoRegistroFormaPagoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoRegistroFormaPagoBanco")) {
				jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoRegistroFormaPagoBanco")) {
				jButtonModificarEstadoRegistroFormaPagoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoRegistroFormaPagoBanco")) {
				jButtonActualizarEstadoRegistroFormaPagoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoRegistroFormaPagoBanco")) {
				jButtonEliminarEstadoRegistroFormaPagoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoRegistroFormaPagoBanco")) {
				jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoRegistroFormaPagoBanco")) {
				jButtonCancelarEstadoRegistroFormaPagoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoRegistroFormaPagoBanco")) {
				jButtonCerrarEstadoRegistroFormaPagoBancoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoRegistroFormaPagoBanco")) {
				jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoRegistroFormaPagoBanco")) {
				jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoRegistroFormaPagoBanco")) {
				jButtonAbrirOrderByEstadoRegistroFormaPagoBancoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoRegistroFormaPagoBanco")) {
				jButtonRecargarInformacionEstadoRegistroFormaPagoBancoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoRegistroFormaPagoBanco")) {
				jButtonAnterioresEstadoRegistroFormaPagoBancoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoRegistroFormaPagoBanco")) {
				jButtonSiguientesEstadoRegistroFormaPagoBancoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoRegistroFormaPagoBancoBusqueda")) {
				this.jButtonidEstadoRegistroFormaPagoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoRegistroFormaPagoBancoBusqueda")) {
				this.jButtoncodigoEstadoRegistroFormaPagoBancoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoRegistroFormaPagoBancoBusqueda")) {
				this.jButtonnombreEstadoRegistroFormaPagoBancoBusquedaActionPerformed(evt);
			}
			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoRegistroFormaPagoBanco();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoRegistroFormaPagoBanco")) {
				closingInternalFrameEstadoRegistroFormaPagoBanco();
				
			} else if(sTipo.equals("jButtonCancelarEstadoRegistroFormaPagoBanco")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame jInternalFrameParent=(EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoRegistroFormaPagoBancoActionPerformed(null);
			}
			
			EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoregistroformapagobanco,new Object(),this.estadoregistroformapagobancoParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoRegistroFormaPagoBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoRegistroFormaPagoBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoRegistroFormaPagoBanco(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoregistroformapagobanco)) {
			if(!esControlTabla) {
				if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);			
				}
				
				if(this.estadoregistroformapagobancoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoregistroformapagobancoReturnGeneral=estadoregistroformapagobancoLogic.procesarEventosEstadoRegistroFormaPagoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos(),this.estadoregistroformapagobanco,this.estadoregistroformapagobancoParameterGeneral,this.isEsNuevoEstadoRegistroFormaPagoBanco,classes);//this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancoReturnGeneral,this.estadoregistroformapagobancoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoregistroformapagobancoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoRegistroFormaPagoBanco(classes,this.estadoregistroformapagobancoReturnGeneral,this.estadoregistroformapagobancoBean,false);
					}
						
					if(this.estadoregistroformapagobancoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancoReturnGeneral.getEstadoRegistroFormaPagoBanco());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancoReturnGeneral.getEstadoRegistroFormaPagoBanco());	
					}
						
					if(this.estadoregistroformapagobancoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancoReturnGeneral.getEstadoRegistroFormaPagoBanco(),classes);//this.estadoregistroformapagobancoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco,classes);//this.estadoregistroformapagobancoBean);									
				}
			
				if(EstadoRegistroFormaPagoBancoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobanco);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoregistroformapagobancoAnterior!=null) {
						this.estadoregistroformapagobanco=this.estadoregistroformapagobancoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoregistroformapagobancoReturnGeneral=estadoregistroformapagobancoLogic.procesarEventosEstadoRegistroFormaPagoBancosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos(),this.estadoregistroformapagobanco,this.estadoregistroformapagobancoParameterGeneral,this.isEsNuevoEstadoRegistroFormaPagoBanco,classes);//this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBanco()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoregistroformapagobancoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoregistroformapagobancoReturnGeneral.getEstadoRegistroFormaPagoBanco(),estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoregistroformapagobancoReturnGeneral.getEstadoRegistroFormaPagoBanco(),this.estadoregistroformapagobancos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoRegistroFormaPagoBanco.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoRegistroFormaPagoBanco.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoRegistroFormaPagoBanco();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoRegistroFormaPagoBanco() throws Exception {
		
		EstadoRegistroFormaPagoBancoModel estadoregistroformapagobancoModel=(EstadoRegistroFormaPagoBancoModel)this.jTableDatosEstadoRegistroFormaPagoBanco.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoregistroformapagobancoModel.estadoregistroformapagobancos=this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoregistroformapagobancoModel.estadoregistroformapagobancos=this.estadoregistroformapagobancos;
		}
		
		
		((EstadoRegistroFormaPagoBancoModel) this.jTableDatosEstadoRegistroFormaPagoBanco.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoRegistroFormaPagoBanco() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoregistroformapagobancoAnterior(),this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoregistroformapagobancoAnterior(),this.estadoregistroformapagobancos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoRegistroFormaPagoBanco();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(RegistroFormaPagoBanco.class)) {
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoLogic.setRegistroFormaPagoBancos(estadoregistroformapagobanco.getRegistroFormaPagoBancos());
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaRegistroFormaPagoBanco(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
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
										
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoregistroformapagobanco,new Object(),generalEntityParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoRegistroFormaPagoBancoConstantesFunciones.getClassesRelationshipsOfEstadoRegistroFormaPagoBanco(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoRegistroFormaPagoBancoConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoRegistroFormaPagoBanco(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoRegistroFormaPagoBanco(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoRegistroFormaPagoBancoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoregistroformapagobanco,new Object(),generalEntityParameterGeneral,this.estadoregistroformapagobancoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBancoBean estadoregistroformapagobancoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(RegistroFormaPagoBanco.class)) {
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoLogic.setRegistroFormaPagoBancos(estadoregistroformapagobanco.getRegistroFormaPagoBancos());
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.inicializarActualizarBindingTablaRegistroFormaPagoBanco(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoRegistroFormaPagoBanco(ArrayList<Classe> classes,EstadoRegistroFormaPagoBancoReturnGeneral estadoregistroformapagobancoReturnGeneral,EstadoRegistroFormaPagoBancoBean estadoregistroformapagobancoBean,Boolean conDefault) throws Exception {
		
			this.estadoregistroformapagobancoBean.setRegistroFormaPagoBancos(estadoregistroformapagobancoReturnGeneral.getEstadoRegistroFormaPagoBanco().getRegistroFormaPagoBancos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(RegistroFormaPagoBanco.class)) {
					estadoregistroformapagobanco.setRegistroFormaPagoBancos(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoBeanSwingJInternalFrame.registroformapagobancoLogic.getRegistroFormaPagoBancos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadoregistroformapagobanco)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco = new EstadoRegistroFormaPagoBancoDetalleFormJInternalFrame(jDesktopPane,this.estadoregistroformapagobancoSessionBean.getConGuardarRelaciones(),this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco);
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setVisible(false);
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.estadoregistroformapagobancoLogic=this.estadoregistroformapagobancoLogic;
		
		this.cargarCombosFrameForeignKeyEstadoRegistroFormaPagoBanco("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoRegistroFormaPagoBanco();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoRegistroFormaPagoBanco();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoRegistroFormaPagoBanco("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoRegistroFormaPagoBanco();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoRegistroFormaPagoBanco"));
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonModificarEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"ModificarEstadoRegistroFormaPagoBanco"));

		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonModificarToolBarEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoRegistroFormaPagoBanco"));
					
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemModificarEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoRegistroFormaPagoBanco"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonActualizarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"ActualizarEstadoRegistroFormaPagoBanco"));
		
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonActualizarToolBarEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoRegistroFormaPagoBanco"));
						
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemActualizarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoRegistroFormaPagoBanco"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonEliminarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"EliminarEstadoRegistroFormaPagoBanco"));
		
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonEliminarToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoRegistroFormaPagoBanco"));
								
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemEliminarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoRegistroFormaPagoBanco"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonCancelarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"CancelarEstadoRegistroFormaPagoBanco"));
		
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonCancelarToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoRegistroFormaPagoBanco"));
					
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemCancelarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoRegistroFormaPagoBanco"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemDetalleCerrarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoRegistroFormaPagoBanco"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonGuardarCambiosToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoRegistroFormaPagoBanco"));
		
		
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonGuardarCambiosToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoRegistroFormaPagoBanco"));
		
		
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoRegistroFormaPagoBanco"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonidEstadoRegistroFormaPagoBancoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoRegistroFormaPagoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoRegistroFormaPagoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonnombreEstadoRegistroFormaPagoBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoRegistroFormaPagoBancoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoRegistroFormaPagoBanco"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoRegistroFormaPagoBanco"));
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoRegistroFormaPagoBanco"));
		}
		
		this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoRegistroFormaPagoBanco"));
		
		this.jTableDatosEstadoRegistroFormaPagoBanco.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoRegistroFormaPagoBanco"));
		
		this.jButtonNuevoEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"NuevoEstadoRegistroFormaPagoBanco"));
		
		this.jButtonDuplicarEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"DuplicarEstadoRegistroFormaPagoBanco"));
		
		this.jButtonCopiarEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"CopiarEstadoRegistroFormaPagoBanco"));
		
		this.jButtonVerFormEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"VerFormEstadoRegistroFormaPagoBanco"));
		
		
		this.jButtonNuevoToolBarEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoRegistroFormaPagoBanco"));
			
		this.jButtonDuplicarToolBarEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoRegistroFormaPagoBanco"));
			
		this.jMenuItemNuevoEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoRegistroFormaPagoBanco"));
			
		this.jMenuItemDuplicarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoRegistroFormaPagoBanco"));		
		
		
		this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoRegistroFormaPagoBanco"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoRegistroFormaPagoBanco"));
			
		this.jMenuItemNuevoRelacionesEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoRegistroFormaPagoBanco"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonModificarEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"ModificarEstadoRegistroFormaPagoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonModificarToolBarEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoRegistroFormaPagoBanco"));
			
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemModificarEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoRegistroFormaPagoBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonActualizarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"ActualizarEstadoRegistroFormaPagoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonActualizarToolBarEstadoRegistroFormaPagoBanco.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoRegistroFormaPagoBanco"));
				
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemActualizarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoRegistroFormaPagoBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonEliminarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"EliminarEstadoRegistroFormaPagoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonEliminarToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoRegistroFormaPagoBanco"));
						
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemEliminarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoRegistroFormaPagoBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonCancelarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"CancelarEstadoRegistroFormaPagoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonCancelarToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoRegistroFormaPagoBanco"));
			
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemCancelarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoRegistroFormaPagoBanco"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoRegistroFormaPagoBanco"));		
		
		
		this.jButtonCerrarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"CerrarEstadoRegistroFormaPagoBanco"));
		
		
		this.jButtonCerrarToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoRegistroFormaPagoBanco"));
			
		this.jMenuItemCerrarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoRegistroFormaPagoBanco"));
			
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jMenuItemDetalleCerrarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoRegistroFormaPagoBanco"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoRegistroFormaPagoBanco"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonGuardarCambiosToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoRegistroFormaPagoBanco"));
		}
		
		this.jButtonCopiarToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoRegistroFormaPagoBanco"));
			
		this.jButtonVerFormToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoRegistroFormaPagoBanco"));
		
		this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoRegistroFormaPagoBanco"));
			
		this.jMenuItemCopiarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoRegistroFormaPagoBanco"));		
		
		this.jMenuItemVerFormEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoRegistroFormaPagoBanco"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoRegistroFormaPagoBanco"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoRegistroFormaPagoBanco"));
			
		this.jMenuItemGuardarCambiosTablaEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoRegistroFormaPagoBanco"));		
		
		
		
		this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoRegistroFormaPagoBanco"));
					
		this.jButtonRecargarInformacionToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoRegistroFormaPagoBanco"));
		
		this.jMenuItemRecargarInformacionEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoRegistroFormaPagoBanco"));		
		
		
		
		this.jButtonAnterioresEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"AnterioresEstadoRegistroFormaPagoBanco"));
		
		
		this.jButtonAnterioresToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoRegistroFormaPagoBanco"));
		
		this.jMenuItemAnterioresEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoRegistroFormaPagoBanco"));		
		
		
		this.jButtonSiguientesEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"SiguientesEstadoRegistroFormaPagoBanco"));
		
		
		this.jButtonSiguientesToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoRegistroFormaPagoBanco"));
			
		this.jMenuItemSiguientesEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoRegistroFormaPagoBanco"));
			
		this.jMenuItemAbrirOrderByEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoRegistroFormaPagoBanco"));
			
		this.jMenuItemMostrarOcultarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoRegistroFormaPagoBanco"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoRegistroFormaPagoBanco"));
			
		this.jMenuItemDetalleMostarOcultarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoRegistroFormaPagoBanco"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoRegistroFormaPagoBanco"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoRegistroFormaPagoBanco"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoRegistroFormaPagoBanco"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoRegistroFormaPagoBanco"));

		this.jCheckBoxSeleccionadosEstadoRegistroFormaPagoBanco.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoRegistroFormaPagoBanco"));
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoRegistroFormaPagoBanco"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoRegistroFormaPagoBanco"));
			
		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoRegistroFormaPagoBanco"));
					
		this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoRegistroFormaPagoBanco"));
			
		this.jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoRegistroFormaPagoBanco"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonidEstadoRegistroFormaPagoBancoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoRegistroFormaPagoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoRegistroFormaPagoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonnombreEstadoRegistroFormaPagoBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoRegistroFormaPagoBancoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco!=null) {
				this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoRegistroFormaPagoBanco"));
				this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoRegistroFormaPagoBanco"));
				this.jInternalFrameReporteDinamicoEstadoRegistroFormaPagoBanco.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoRegistroFormaPagoBanco"));				
			//this.jButtonGenerarReporteDinamicoEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoRegistroFormaPagoBanco"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco!=null) {
				this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoRegistroFormaPagoBanco"));
				this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoRegistroFormaPagoBanco"));
				this.jInternalFrameImportacionEstadoRegistroFormaPagoBanco.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoRegistroFormaPagoBanco"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoRegistroFormaPagoBanco"));
			
			this.jButtonAbrirOrderByToolBarEstadoRegistroFormaPagoBanco.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoRegistroFormaPagoBanco"));			
			
			if(this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco!=null) {
				this.jInternalFrameOrderByEstadoRegistroFormaPagoBanco.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoRegistroFormaPagoBanco"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTabbedPaneRelacionesEstadoRegistroFormaPagoBanco.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoRegistroFormaPagoBanco"));
		
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
            		closingInternalFrameEstadoRegistroFormaPagoBanco();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco = (JInternalFrameBase)event.getSource();
	            	
	            EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame jInternalFrameParent=(EstadoRegistroFormaPagoBancoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoRegistroFormaPagoBancoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoRegistroFormaPagoBancoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoRegistroFormaPagoBanco.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonNuevoEstadoRegistroFormaPagoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoRegistroFormaPagoBancoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonModificarEstadoRegistroFormaPagoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoRegistroFormaPagoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonActualizarEstadoRegistroFormaPagoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoRegistroFormaPagoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonEliminarEstadoRegistroFormaPagoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoRegistroFormaPagoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonCancelarEstadoRegistroFormaPagoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoRegistroFormaPagoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoRegistroFormaPagoBanco";
		inputMap = this.jButtonCerrarEstadoRegistroFormaPagoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoRegistroFormaPagoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoRegistroFormaPagoBanco";
		inputMap = this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonGuardarCambiosEstadoRegistroFormaPagoBanco.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBanco.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBancoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoRegistroFormaPagoBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBancoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonidEstadoRegistroFormaPagoBancoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoRegistroFormaPagoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtoncodigoEstadoRegistroFormaPagoBancoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoRegistroFormaPagoBancoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jButtonnombreEstadoRegistroFormaPagoBancoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoRegistroFormaPagoBancoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoRegistroFormaPagoBanco.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoRegistroFormaPagoBancoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBancoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoRegistroFormaPagoBanco.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoRegistroFormaPagoBanco(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos()) {
					estadoregistroformapagobancoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:estadoregistroformapagobancos) {
					estadoregistroformapagobancoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoRegistroFormaPagoBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos()) {
						estadoregistroformapagobancoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:estadoregistroformapagobancos) {
						estadoregistroformapagobancoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:estadoregistroformapagobancos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoRegistroFormaPagoBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoRegistroFormaPagoBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoRegistroFormaPagoBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoRegistroFormaPagoBancoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoRegistroFormaPagoBanco.getSelectedRows();
			
			EstadoRegistroFormaPagoBanco estadoregistroformapagobancoLocal=new EstadoRegistroFormaPagoBanco();
			
			//this.seleccionarTodosEstadoRegistroFormaPagoBanco(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoregistroformapagobancoLocal =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos().toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoregistroformapagobancoLocal =(EstadoRegistroFormaPagoBanco) this.estadoregistroformapagobancos.toArray()[this.jTableDatosEstadoRegistroFormaPagoBanco.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoregistroformapagobancoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos()) {
						estadoregistroformapagobancoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:estadoregistroformapagobancos) {
						estadoregistroformapagobancoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoRegistroFormaPagoBanco.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoRegistroFormaPagoBanco.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoRegistroFormaPagoBanco,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoRegistroFormaPagoBancoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoRegistroFormaPagoBancoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBancoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoRegistroFormaPagoBanco.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos()) {
				
						if(sTipoSeleccionar.equals(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoregistroformapagobancoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoregistroformapagobancoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:estadoregistroformapagobancos) {
					
						if(sTipoSeleccionar.equals(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoregistroformapagobancoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoregistroformapagobancoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoRegistroFormaPagoBancoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoRegistroFormaPagoBanco=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoRegistroFormaPagoBanco) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoRegistroFormaPagoBanco(conSplash);
				
					this.generarReporteEstadoRegistroFormaPagoBancosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoRegistroFormaPagoBancosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoRegistroFormaPagoBancosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoRegistroFormaPagoBancosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoRegistroFormaPagoBanco();
				
				this.exportarEstadoRegistroFormaPagoBancosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoRegistroFormaPagoBancos();
				//this.importarEstadoRegistroFormaPagoBancos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoRegistroFormaPagoBanco();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoRegistroFormaPagoBancosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Registro Forma Pago Banco", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoRegistroFormaPagoBanco();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoRegistroFormaPagoBanco)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoRegistroFormaPagoBanco(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Registro Forma Pago Banco",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoRegistroFormaPagoBanco.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jComboBoxTiposAccionesFormularioEstadoRegistroFormaPagoBanco.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoRegistroFormaPagoBanco();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoRegistroFormaPagoBanco(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoRegistroFormaPagoBancoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoRegistroFormaPagoBanco();
			
			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();		
			EstadoRegistroFormaPagoBanco estadoregistroformapagobanco=new EstadoRegistroFormaPagoBanco();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoRegistroFormaPagoBanco.getSelectedItem();
			
			
			
			
			estadoregistroformapagobancosSeleccionados=this.getEstadoRegistroFormaPagoBancosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoregistroformapagobancosSeleccionados.size()==1) {
				for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:estadoregistroformapagobancosSeleccionados) {
					estadoregistroformapagobanco=estadoregistroformapagobancoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Registro Forma Pago Banco")) {
					jButtonRegistroFormaPagoBancoActionPerformed(null,rowIndex,true,false,estadoregistroformapagobanco);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoRegistroFormaPagoBanco();
			
      		//this.finishProcessEstadoRegistroFormaPagoBanco(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoRegistroFormaPagoBancoReturnGeneral() throws Exception {
		if(this.estadoregistroformapagobancoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoregistroformapagobancoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoregistroformapagobancoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoregistroformapagobancoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoregistroformapagobancoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoregistroformapagobancoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false);
		}
		
		if(this.estadoregistroformapagobancoReturnGeneral.getConRetornoLista() || this.estadoregistroformapagobancoReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoregistroformapagobancoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoregistroformapagobancoLogic.setEstadoRegistroFormaPagoBancos(this.estadoregistroformapagobancoReturnGeneral.getEstadoRegistroFormaPagoBancos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoregistroformapagobancoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoregistroformapagobancoLogic.setEstadoRegistroFormaPagoBanco(this.estadoregistroformapagobancoReturnGeneral.getEstadoRegistroFormaPagoBanco());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoRegistroFormaPagoBanco(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoRegistroFormaPagoBanco() throws Exception {
		
		
	}
	
	public ArrayList<EstadoRegistroFormaPagoBanco> getEstadoRegistroFormaPagoBancosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoRegistroFormaPagoBanco) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos()) {
					if(estadoregistroformapagobancoAux.getIsSelected()) {
						estadoregistroformapagobancosSeleccionados.add(estadoregistroformapagobancoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:this.estadoregistroformapagobancos) {
					if(estadoregistroformapagobancoAux.getIsSelected()) {
						estadoregistroformapagobancosSeleccionados.add(estadoregistroformapagobancoAux);				
					}
				}
			}
			
			if(estadoregistroformapagobancosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoregistroformapagobancosSeleccionados.addAll(this.estadoregistroformapagobancoLogic.getEstadoRegistroFormaPagoBancos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoregistroformapagobancosSeleccionados.addAll(this.estadoregistroformapagobancos);				
					}
				}
			}
		} else {
			estadoregistroformapagobancosSeleccionados.add(this.estadoregistroformapagobanco);
		}
		
		return estadoregistroformapagobancosSeleccionados;
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
	
	public void generarReporteEstadoRegistroFormaPagoBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoRegistroFormaPagoBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoRegistroFormaPagoBancosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoRegistroFormaPagoBancosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoRegistroFormaPagoBancosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoRegistroFormaPagoBancosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Registro Forma Pago Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoRegistroFormaPagoBancosSeleccionados() throws Exception {
		ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();		
		
		estadoregistroformapagobancosSeleccionados=this.getEstadoRegistroFormaPagoBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoRegistroFormaPagoBancos("Todos",estadoregistroformapagobancosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoRegistroFormaPagoBancosSeleccionados() throws Exception {
		ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();		
		
		estadoregistroformapagobancosSeleccionados=this.getEstadoRegistroFormaPagoBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoRegistroFormaPagoBancos("Todos",estadoregistroformapagobancosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoRegistroFormaPagoBancosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();
		
		estadoregistroformapagobancosSeleccionados=this.getEstadoRegistroFormaPagoBancosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoRegistroFormaPagoBancos("Todos",estadoregistroformapagobancosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoRegistroFormaPagoBancosSeleccionados() throws Exception {
		ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoRegistroFormaPagoBanco();
		
		
		estadoregistroformapagobancosSeleccionados=this.getEstadoRegistroFormaPagoBancosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoRegistroFormaPagoBanco();
		
		
		//this.generarReporteEstadoRegistroFormaPagoBancos("Todos",estadoregistroformapagobancosSeleccionados ,estadoregistroformapagobancoImplementable,estadoregistroformapagobancoImplementableHome);
	}
	
	public void mostrarImportacionEstadoRegistroFormaPagoBancos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoRegistroFormaPagoBanco();
		
		this.abrirFrameImportacionEstadoRegistroFormaPagoBanco();		
		
			
		//this.generarReporteEstadoRegistroFormaPagoBancos("Todos",estadoregistroformapagobancosSeleccionados ,estadoregistroformapagobancoImplementable,estadoregistroformapagobancoImplementableHome);
	}
	
	public void importarEstadoRegistroFormaPagoBancos() throws Exception {		
	
	}
	
	public void exportarEstadoRegistroFormaPagoBancosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoRegistroFormaPagoBancosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoRegistroFormaPagoBancosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoRegistroFormaPagoBancosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Registro Forma Pago Banco",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoRegistroFormaPagoBancosSeleccionados() throws Exception {
		ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();		
		
		estadoregistroformapagobancosSeleccionados=this.getEstadoRegistroFormaPagoBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoregistroformapagobanco."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoRegistroFormaPagoBanco(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:estadoregistroformapagobancosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoRegistroFormaPagoBanco(estadoregistroformapagobancoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoregistroformapagobancoAux.setsDetalleGeneralEntityReporte(estadoregistroformapagobancoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Registro Forma Pago Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoRegistroFormaPagoBanco(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoregistroformapagobanco.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoregistroformapagobanco.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoregistroformapagobanco.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoregistroformapagobanco.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoRegistroFormaPagoBancosSeleccionados() throws Exception {
		ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();		
		
		estadoregistroformapagobancosSeleccionados=this.getEstadoRegistroFormaPagoBancosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoregistroformapagobanco.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoRegistroFormaPagoBancos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoRegistroFormaPagoBanco(row);				
				iRow++;
			}				
			
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:estadoregistroformapagobancosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoRegistroFormaPagoBanco(estadoregistroformapagobancoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Registro Forma Pago Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoRegistroFormaPagoBancosSeleccionados() throws Exception {
		ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();		
		
		estadoregistroformapagobancosSeleccionados=this.getEstadoRegistroFormaPagoBancosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoregistroformapagobanco.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoregistroformapagobancos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoregistroformapagobanco");
			//elementRoot.appendChild(element);
		
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:estadoregistroformapagobancosSeleccionados) {
				element = document.createElement("estadoregistroformapagobanco");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoRegistroFormaPagoBanco(estadoregistroformapagobancoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Registro Forma Pago Banco",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoRegistroFormaPagoBanco(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoregistroformapagobanco.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoregistroformapagobanco.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoregistroformapagobanco.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoRegistroFormaPagoBanco(EstadoRegistroFormaPagoBanco estadoregistroformapagobanco,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoRegistroFormaPagoBancoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoregistroformapagobanco.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoRegistroFormaPagoBancoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoregistroformapagobanco.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoRegistroFormaPagoBancoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadoregistroformapagobanco.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoRegistroFormaPagoBancoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoregistroformapagobanco.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoRegistroFormaPagoBancosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados=new ArrayList<EstadoRegistroFormaPagoBanco>();
		
		estadoregistroformapagobancosSeleccionados=this.getEstadoRegistroFormaPagoBancosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoRegistroFormaPagoBanco(estadoregistroformapagobancosSeleccionados);
		
		this.generarReporteEstadoRegistroFormaPagoBancos("Todos",estadoregistroformapagobancosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoRegistroFormaPagoBanco(ArrayList<EstadoRegistroFormaPagoBanco> estadoregistroformapagobancosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoRegistroFormaPagoBanco estadoregistroformapagobancoAux:estadoregistroformapagobancosSeleccionados) {
				estadoregistroformapagobancoAux.setsDetalleGeneralEntityReporte(estadoregistroformapagobancoAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoregistroformapagobancoAux.setsDescripcionGeneralEntityReporte1(estadoregistroformapagobancoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoRegistroFormaPagoBancoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoregistroformapagobancoAux.setsDescripcionGeneralEntityReporte1(estadoregistroformapagobancoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoRegistroFormaPagoBancoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoRegistroFormaPagoBanco(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaModificarEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaCancelarEstadoRegistroFormaPagoBanco=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoRegistroFormaPagoBanco=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoRegistroFormaPagoBancoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=true;
		} else {
			this.actualizarEstadoPanelsEstadoRegistroFormaPagoBanco(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoRegistroFormaPagoBanco=false;
			//this.isVisibilidadCeldaVerFormEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaDuplicarEstadoRegistroFormaPagoBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
			if(!estadoregistroformapagobancoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=false;												
			}
			
			this.jButtonCerrarEstadoRegistroFormaPagoBanco.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoRegistroFormaPagoBanco=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoregistroformapagobanco)) {
			this.isVisibilidadCeldaActualizarEstadoRegistroFormaPagoBanco=false;
			this.isVisibilidadCeldaEliminarEstadoRegistroFormaPagoBanco=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoRegistroFormaPagoBanco() {
		this.isVisibilidadCeldaNuevoEstadoRegistroFormaPagoBanco=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoRegistroFormaPagoBanco=false;
	}
	
	public void actualizarEstadoPanelsEstadoRegistroFormaPagoBanco(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelPaginacionEstadoRegistroFormaPagoBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelPaginacionEstadoRegistroFormaPagoBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelPaginacionEstadoRegistroFormaPagoBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelPaginacionEstadoRegistroFormaPagoBanco.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelPaginacionEstadoRegistroFormaPagoBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelPaginacionEstadoRegistroFormaPagoBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEdicionEstadoRegistroFormaPagoBanco.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoRegistroFormaPagoBanco!=null) {
				this.jScrollPanelDatosEstadoRegistroFormaPagoBanco.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelPaginacionEstadoRegistroFormaPagoBanco.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco!=null) {
				this.jPanelParametrosReportesEstadoRegistroFormaPagoBanco.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoregistroformapagobancoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoRegistroFormaPagoBancoParaRegistroFormaPagoBancos() throws Exception {
		Boolean isPaginaPopupRegistroFormaPagoBanco=false;

		try {

			if(this.estadoregistroformapagobancoSessionBean==null) {
				this.estadoregistroformapagobancoSessionBean=new EstadoRegistroFormaPagoBancoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoSessionBean=new RegistroFormaPagoBancoSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoSessionBean.setsPathNavegacionActual(estadoregistroformapagobancoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+RegistroFormaPagoBancoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupRegistroFormaPagoBanco=this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeRegistroFormaPagoBanco(true);
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeRegistroFormaPagoBanco(EstadoRegistroFormaPagoBancoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoRegistroFormaPagoBanco(true);
			this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.registroformapagobancoSessionBean.setlidEstadoRegistroFormaPagoBancoActual(this.idEstadoRegistroFormaPagoBancoActual);

			estadoregistroformapagobancoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoRegistroFormaPagoBanco(true);
			estadoregistroformapagobancoSessionBean.setlIdEstadoRegistroFormaPagoBancoActualForeignKey(this.idEstadoRegistroFormaPagoBancoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoRegistroFormaPagoBancoSessionBean estadoregistroformapagobancoSessionBean=new EstadoRegistroFormaPagoBancoSessionBean();
		
		if(this.estadoregistroformapagobancoSessionBean==null) {
			this.estadoregistroformapagobancoSessionBean=new EstadoRegistroFormaPagoBancoSessionBean();
		}
		
		this.estadoregistroformapagobancoSessionBean.setsUltimaBusquedaEstadoRegistroFormaPagoBanco(this.getsAccionBusqueda());
		this.estadoregistroformapagobancoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoregistroformapagobancoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoRegistroFormaPagoBancoSessionBean estadoregistroformapagobancoSessionBean=new EstadoRegistroFormaPagoBancoSessionBean();
		
		if(this.estadoregistroformapagobancoSessionBean==null) {
			this.estadoregistroformapagobancoSessionBean=new EstadoRegistroFormaPagoBancoSessionBean();
		}
		
		if(this.estadoregistroformapagobancoSessionBean.getsUltimaBusquedaEstadoRegistroFormaPagoBanco()!=null&&!this.estadoregistroformapagobancoSessionBean.getsUltimaBusquedaEstadoRegistroFormaPagoBanco().equals("")) {
			this.setsAccionBusqueda(estadoregistroformapagobancoSessionBean.getsUltimaBusquedaEstadoRegistroFormaPagoBanco());
			this.setiNumeroPaginacion(estadoregistroformapagobancoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoregistroformapagobancoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadoregistroformapagobancoSessionBean.setsUltimaBusquedaEstadoRegistroFormaPagoBanco("");
		this.estadoregistroformapagobancoSessionBean.setiNumeroPaginacion(EstadoRegistroFormaPagoBancoConstantesFunciones.INUMEROPAGINACION);
		this.estadoregistroformapagobancoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoRegistroFormaPagoBanco(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoRegistroFormaPagoBanco() {
		this.updateBorderResaltarBusquedasFormularioEstadoRegistroFormaPagoBanco();
		this.updateVisibilidadBusquedasFormularioEstadoRegistroFormaPagoBanco();
		this.updateHabilitarBusquedasFormularioEstadoRegistroFormaPagoBanco();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoRegistroFormaPagoBanco() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoRegistroFormaPagoBanco() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoRegistroFormaPagoBanco() {
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
	
	public void updateControlesFormularioEstadoRegistroFormaPagoBanco() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoRegistroFormaPagoBanco();
		this.updateVisibilidadResaltarControlesFormularioEstadoRegistroFormaPagoBanco();
		this.updateHabilitarResaltarControlesFormularioEstadoRegistroFormaPagoBanco();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoRegistroFormaPagoBanco() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoregistroformapagobancoConstantesFunciones.resaltaridEstadoRegistroFormaPagoBanco!=null && this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldidEstadoRegistroFormaPagoBanco.setBorder(this.estadoregistroformapagobancoConstantesFunciones.resaltaridEstadoRegistroFormaPagoBanco);}
		if(this.estadoregistroformapagobancoConstantesFunciones.resaltarcodigoEstadoRegistroFormaPagoBanco!=null && this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldcodigoEstadoRegistroFormaPagoBanco.setBorder(this.estadoregistroformapagobancoConstantesFunciones.resaltarcodigoEstadoRegistroFormaPagoBanco);}
		if(this.estadoregistroformapagobancoConstantesFunciones.resaltarnombreEstadoRegistroFormaPagoBanco!=null && this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextAreanombreEstadoRegistroFormaPagoBanco.setBorder(this.estadoregistroformapagobancoConstantesFunciones.resaltarnombreEstadoRegistroFormaPagoBanco);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoRegistroFormaPagoBanco() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
	
		//this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldidEstadoRegistroFormaPagoBanco.setVisible(this.estadoregistroformapagobancoConstantesFunciones.mostraridEstadoRegistroFormaPagoBanco);
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jPanelidEstadoRegistroFormaPagoBanco.setVisible(this.estadoregistroformapagobancoConstantesFunciones.mostraridEstadoRegistroFormaPagoBanco);
		//this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldcodigoEstadoRegistroFormaPagoBanco.setVisible(this.estadoregistroformapagobancoConstantesFunciones.mostrarcodigoEstadoRegistroFormaPagoBanco);
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jPanelcodigoEstadoRegistroFormaPagoBanco.setVisible(this.estadoregistroformapagobancoConstantesFunciones.mostrarcodigoEstadoRegistroFormaPagoBanco);
		//this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextAreanombreEstadoRegistroFormaPagoBanco.setVisible(this.estadoregistroformapagobancoConstantesFunciones.mostrarnombreEstadoRegistroFormaPagoBanco);
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jPanelnombreEstadoRegistroFormaPagoBanco.setVisible(this.estadoregistroformapagobancoConstantesFunciones.mostrarnombreEstadoRegistroFormaPagoBanco);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoRegistroFormaPagoBanco() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco!=null) {
	
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldidEstadoRegistroFormaPagoBanco.setEnabled(this.estadoregistroformapagobancoConstantesFunciones.activaridEstadoRegistroFormaPagoBanco);
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextFieldcodigoEstadoRegistroFormaPagoBanco.setEnabled(this.estadoregistroformapagobancoConstantesFunciones.activarcodigoEstadoRegistroFormaPagoBanco);
		this.jInternalFrameDetalleFormEstadoRegistroFormaPagoBanco.jTextAreanombreEstadoRegistroFormaPagoBanco.setEnabled(this.estadoregistroformapagobancoConstantesFunciones.activarnombreEstadoRegistroFormaPagoBanco);
		}
	}
	
		
}