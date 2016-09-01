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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.EstadoAntiClienteConstantesFunciones;
import com.bydan.erp.facturacion.util.EstadoAntiClienteParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.EstadoAntiClienteParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.EstadoAntiClienteBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
public class EstadoAntiClienteBeanSwingJInternalFrame extends EstadoAntiClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoAntiClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoAntiCliente> estadoanticlienteValidator = new ClassValidator<EstadoAntiCliente>(EstadoAntiCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoAntiCliente estadoanticliente;	
	public EstadoAntiCliente estadoanticlienteAux;
	public EstadoAntiCliente estadoanticlienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoAntiCliente estadoanticlienteTotales;
	public Long idEstadoAntiClienteActual;
	public Long iIdNuevoEstadoAntiCliente=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosAnticipoCliente=false;

	public Boolean getIsTienePermisosAnticipoCliente() {
		return isTienePermisosAnticipoCliente;
	}

	public void setIsTienePermisosAnticipoCliente(Boolean isTienePermisosAnticipoCliente) {
		this.isTienePermisosAnticipoCliente= isTienePermisosAnticipoCliente;
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
	
	public Boolean isPermisoTodoEstadoAntiCliente;
	public Boolean isPermisoNuevoEstadoAntiCliente;
	public Boolean isPermisoActualizarEstadoAntiCliente;
	public Boolean isPermisoActualizarOriginalEstadoAntiCliente;
	public Boolean isPermisoEliminarEstadoAntiCliente;
	public Boolean isPermisoGuardarCambiosEstadoAntiCliente;
	public Boolean isPermisoConsultaEstadoAntiCliente;
	public Boolean isPermisoBusquedaEstadoAntiCliente;
	public Boolean isPermisoReporteEstadoAntiCliente;
	public Boolean isPermisoPaginacionMedioEstadoAntiCliente;
	public Boolean isPermisoPaginacionAltoEstadoAntiCliente;
	public Boolean isPermisoPaginacionTodoEstadoAntiCliente;
	public Boolean isPermisoCopiarEstadoAntiCliente;
	public Boolean isPermisoVerFormEstadoAntiCliente;
	public Boolean isPermisoDuplicarEstadoAntiCliente;
	public Boolean isPermisoOrdenEstadoAntiCliente;
	
	
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
	
	public EstadoAntiClienteParameterReturnGeneral estadoanticlienteReturnGeneral;
	public EstadoAntiClienteParameterReturnGeneral estadoanticlienteParameterGeneral;
	
	

	public AnticipoClienteLogic anticipoclienteLogic=null;

	public AnticipoClienteLogic getAnticipoClienteLogic() {
		return anticipoclienteLogic;
	}

	public void setAnticipoClienteLogic(AnticipoClienteLogic anticipoclienteLogic) {
		this.anticipoclienteLogic = anticipoclienteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoAntiCliente=false;
	public Boolean esParaAccionDesdeFormularioEstadoAntiCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoAntiClienteSessionBeanAdditional estadoanticlienteSessionBeanAdditional=null;
	
	public EstadoAntiClienteSessionBeanAdditional getEstadoAntiClienteSessionBeanAdditional() {
		return this.estadoanticlienteSessionBeanAdditional;
	}
	
	public void setEstadoAntiClienteSessionBeanAdditional(EstadoAntiClienteSessionBeanAdditional estadoanticlienteSessionBeanAdditional) {
		try {
			this.estadoanticlienteSessionBeanAdditional=estadoanticlienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoAntiClienteBeanSwingJInternalFrameAdditional estadoanticlienteBeanSwingJInternalFrameAdditional=null;
	//public class EstadoAntiClienteBeanSwingJInternalFrame
	
	public EstadoAntiClienteBeanSwingJInternalFrameAdditional getEstadoAntiClienteBeanSwingJInternalFrameAdditional() {
		return this.estadoanticlienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoAntiClienteBeanSwingJInternalFrameAdditional(EstadoAntiClienteBeanSwingJInternalFrameAdditional estadoanticlienteBeanSwingJInternalFrameAdditional) {
		try {
			this.estadoanticlienteBeanSwingJInternalFrameAdditional=estadoanticlienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoAntiClienteLogic estadoanticlienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoAntiCliente estadoanticlienteBean;
	public EstadoAntiClienteConstantesFunciones estadoanticlienteConstantesFunciones;
	//public EstadoAntiClienteParameterReturnGeneral estadoanticlienteReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoAntiCliente> estadoanticlientes;	
	//public List<EstadoAntiCliente> estadoanticlientesEliminados;
	//public List<EstadoAntiCliente> estadoanticlientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoAntiCliente=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoAntiCliente=true;
	public Boolean isVisibilidadCeldaCopiarEstadoAntiCliente=true;
	public Boolean isVisibilidadCeldaVerFormEstadoAntiCliente=true;
	public Boolean isVisibilidadCeldaOrdenEstadoAntiCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=false;
	public Boolean isVisibilidadCeldaModificarEstadoAntiCliente=false;
	public Boolean isVisibilidadCeldaActualizarEstadoAntiCliente=false;
	public Boolean isVisibilidadCeldaEliminarEstadoAntiCliente=false;
	public Boolean isVisibilidadCeldaCancelarEstadoAntiCliente=false;
	public Boolean isVisibilidadCeldaGuardarEstadoAntiCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=false;	
	
	
	
	public Long getiIdNuevoEstadoAntiCliente() {
		return this.iIdNuevoEstadoAntiCliente;
	}

	public void setiIdNuevoEstadoAntiCliente(Long iIdNuevoEstadoAntiCliente) {
		this.iIdNuevoEstadoAntiCliente = iIdNuevoEstadoAntiCliente;
	}
	
	public Long getidEstadoAntiClienteActual() {
		return this.idEstadoAntiClienteActual;
	}

	public void setidEstadoAntiClienteActual(Long idEstadoAntiClienteActual) {
		this.idEstadoAntiClienteActual = idEstadoAntiClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoAntiCliente getestadoanticliente() {
		return this.estadoanticliente;
	}

	public void setestadoanticliente(EstadoAntiCliente estadoanticliente) {
		this.estadoanticliente = estadoanticliente;
	}
	
	public EstadoAntiCliente getestadoanticlienteAux() {
		return this.estadoanticlienteAux;
	}

	public void setestadoanticlienteAux(EstadoAntiCliente estadoanticlienteAux) {
		this.estadoanticlienteAux = estadoanticlienteAux;
	}				
	
	public EstadoAntiCliente getestadoanticlienteAnterior() {
		return this.estadoanticlienteAnterior;
	}

	public void setestadoanticlienteAnterior(EstadoAntiCliente estadoanticlienteAnterior) {
		this.estadoanticlienteAnterior = estadoanticlienteAnterior;
	}	
	
	public EstadoAntiCliente getestadoanticlienteTotales() {
		return this.estadoanticlienteTotales;
	}

	public void setestadoanticlienteTotales(EstadoAntiCliente estadoanticlienteTotales) {
		this.estadoanticlienteTotales = estadoanticlienteTotales;
	}	
	
	public EstadoAntiCliente getestadoanticlienteBean() {
		return this.estadoanticlienteBean;
	}

	public void setestadoanticlienteBean(EstadoAntiCliente estadoanticlienteBean) {
		this.estadoanticlienteBean = estadoanticlienteBean;
	}	
	
	public EstadoAntiClienteParameterReturnGeneral getestadoanticlienteReturnGeneral() {
		return this.estadoanticlienteReturnGeneral;
	}

	public void setestadoanticlienteReturnGeneral(EstadoAntiClienteParameterReturnGeneral estadoanticlienteReturnGeneral) {
		this.estadoanticlienteReturnGeneral = estadoanticlienteReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoAntiClienteLogic getEstadoAntiClienteLogic()	{		
		return estadoanticlienteLogic;
	}

	public void setEstadoAntiClienteLogic(EstadoAntiClienteLogic estadoanticlienteLogic) {
		this.estadoanticlienteLogic = estadoanticlienteLogic;
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
	
	public Boolean getIsEsNuevoEstadoAntiCliente() {
		return isEsNuevoEstadoAntiCliente;
	}

	public void setIsEsNuevoEstadoAntiCliente(Boolean isEsNuevoEstadoAntiCliente) {
		this.isEsNuevoEstadoAntiCliente = isEsNuevoEstadoAntiCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoAntiCliente() {
		return esParaAccionDesdeFormularioEstadoAntiCliente;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoAntiCliente(Boolean esParaAccionDesdeFormularioEstadoAntiCliente) {
		this.esParaAccionDesdeFormularioEstadoAntiCliente = esParaAccionDesdeFormularioEstadoAntiCliente;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoAntiCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoAntiClienteConstantesFunciones.refrescarForeignKeysDescripcionesEstadoAntiCliente(this.estadoanticlienteLogic.getEstadoAntiClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoAntiClienteConstantesFunciones.refrescarForeignKeysDescripcionesEstadoAntiCliente(this.estadoanticlientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoanticlienteLogic.setEstadoAntiClientes(this.estadoanticlientes);
			estadoanticlienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoAntiClienteParameterReturnGeneral getEstadoAntiClienteParameterGeneral() {
		return this.estadoanticlienteParameterGeneral;
	}
	
	public void setEstadoAntiClienteParameterGeneral(EstadoAntiClienteParameterReturnGeneral estadoanticlienteParameterGeneral) {
		this.estadoanticlienteParameterGeneral = estadoanticlienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoAntiCliente() {
		return isPermisoTodoEstadoAntiCliente;
	}

	public void setIsPermisoTodoEstadoAntiCliente(Boolean isPermisoTodoEstadoAntiCliente) {
		this.isPermisoTodoEstadoAntiCliente = isPermisoTodoEstadoAntiCliente;
	}

	public Boolean getIsPermisoNuevoEstadoAntiCliente() {
		return isPermisoNuevoEstadoAntiCliente;
	}

	public void setIsPermisoNuevoEstadoAntiCliente(Boolean isPermisoNuevoEstadoAntiCliente) {
		this.isPermisoNuevoEstadoAntiCliente = isPermisoNuevoEstadoAntiCliente;
	}

	public Boolean getIsPermisoActualizarEstadoAntiCliente() {
		return isPermisoActualizarEstadoAntiCliente;
	}

	public void setIsPermisoActualizarEstadoAntiCliente(Boolean isPermisoActualizarEstadoAntiCliente) {
		this.isPermisoActualizarEstadoAntiCliente = isPermisoActualizarEstadoAntiCliente;
	}

	public Boolean getIsPermisoEliminarEstadoAntiCliente() {
		return isPermisoEliminarEstadoAntiCliente;
	}

	public void setIsPermisoEliminarEstadoAntiCliente(Boolean isPermisoEliminarEstadoAntiCliente) {
		this.isPermisoEliminarEstadoAntiCliente = isPermisoEliminarEstadoAntiCliente;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoAntiCliente() {
		return isPermisoGuardarCambiosEstadoAntiCliente;
	}

	public void setIsPermisoGuardarCambiosEstadoAntiCliente(Boolean isPermisoGuardarCambiosEstadoAntiCliente) {
		this.isPermisoGuardarCambiosEstadoAntiCliente = isPermisoGuardarCambiosEstadoAntiCliente;
	}
	
	public Boolean getIsPermisoConsultaEstadoAntiCliente() {
		return isPermisoConsultaEstadoAntiCliente;
	}

	public void setIsPermisoConsultaEstadoAntiCliente(Boolean isPermisoConsultaEstadoAntiCliente) {
		this.isPermisoConsultaEstadoAntiCliente = isPermisoConsultaEstadoAntiCliente;
	}

	public Boolean getIsPermisoBusquedaEstadoAntiCliente() {
		return isPermisoBusquedaEstadoAntiCliente;
	}

	public void setIsPermisoBusquedaEstadoAntiCliente(Boolean isPermisoBusquedaEstadoAntiCliente) {
		this.isPermisoBusquedaEstadoAntiCliente = isPermisoBusquedaEstadoAntiCliente;
	}

	public Boolean getIsPermisoReporteEstadoAntiCliente() {
		return isPermisoReporteEstadoAntiCliente;
	}

	public void setIsPermisoReporteEstadoAntiCliente(Boolean isPermisoReporteEstadoAntiCliente) {
		this.isPermisoReporteEstadoAntiCliente = isPermisoReporteEstadoAntiCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoAntiCliente() {
		return isPermisoPaginacionMedioEstadoAntiCliente;
	}

	public void setIsPermisoPaginacionMedioEstadoAntiCliente(Boolean isPermisoPaginacionMedioEstadoAntiCliente) {
		this.isPermisoPaginacionMedioEstadoAntiCliente = isPermisoPaginacionMedioEstadoAntiCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoAntiCliente() {
		return isPermisoPaginacionTodoEstadoAntiCliente;
	}

	public void setIsPermisoPaginacionTodoEstadoAntiCliente(Boolean isPermisoPaginacionTodoEstadoAntiCliente) {
		this.isPermisoPaginacionTodoEstadoAntiCliente = isPermisoPaginacionTodoEstadoAntiCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoAntiCliente() {
		return isPermisoPaginacionAltoEstadoAntiCliente;
	}

	public void setIsPermisoPaginacionAltoEstadoAntiCliente(Boolean isPermisoPaginacionAltoEstadoAntiCliente) {
		this.isPermisoPaginacionAltoEstadoAntiCliente = isPermisoPaginacionAltoEstadoAntiCliente;
	}
	
	public Boolean getIsPermisoCopiarEstadoAntiCliente() {
		return isPermisoCopiarEstadoAntiCliente;
	}

	public void setIsPermisoCopiarEstadoAntiCliente(Boolean isPermisoCopiarEstadoAntiCliente) {
		this.isPermisoCopiarEstadoAntiCliente = isPermisoCopiarEstadoAntiCliente;
	}
	
	public Boolean getIsPermisoVerFormEstadoAntiCliente() {
		return isPermisoVerFormEstadoAntiCliente;
	}

	public void setIsPermisoVerFormEstadoAntiCliente(Boolean isPermisoVerFormEstadoAntiCliente) {
		this.isPermisoVerFormEstadoAntiCliente = isPermisoVerFormEstadoAntiCliente;
	}
	
	public Boolean getIsPermisoDuplicarEstadoAntiCliente() {
		return isPermisoDuplicarEstadoAntiCliente;
	}

	public void setIsPermisoDuplicarEstadoAntiCliente(Boolean isPermisoDuplicarEstadoAntiCliente) {
		this.isPermisoDuplicarEstadoAntiCliente = isPermisoDuplicarEstadoAntiCliente;
	}
	
	public Boolean getIsPermisoOrdenEstadoAntiCliente() {
		return isPermisoOrdenEstadoAntiCliente;
	}

	public void setIsPermisoOrdenEstadoAntiCliente(Boolean isPermisoOrdenEstadoAntiCliente) {
		this.isPermisoOrdenEstadoAntiCliente = isPermisoOrdenEstadoAntiCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoAntiCliente() {
		return isVisibilidadCeldaNuevoEstadoAntiCliente;
	}

	public void setIsVisibilidadCeldaNuevoEstadoAntiCliente(Boolean isVisibilidadCeldaNuevoEstadoAntiCliente) {
		this.isVisibilidadCeldaNuevoEstadoAntiCliente = isVisibilidadCeldaNuevoEstadoAntiCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoAntiCliente() {
		return isVisibilidadCeldaDuplicarEstadoAntiCliente;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoAntiCliente(Boolean isVisibilidadCeldaDuplicarEstadoAntiCliente) {
		this.isVisibilidadCeldaDuplicarEstadoAntiCliente = isVisibilidadCeldaDuplicarEstadoAntiCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoAntiCliente() {
		return isVisibilidadCeldaCopiarEstadoAntiCliente;
	}

	public void setIsVisibilidadCeldaCopiarEstadoAntiCliente(Boolean isVisibilidadCeldaCopiarEstadoAntiCliente) {
		this.isVisibilidadCeldaCopiarEstadoAntiCliente = isVisibilidadCeldaCopiarEstadoAntiCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoAntiCliente() {
		return isVisibilidadCeldaVerFormEstadoAntiCliente;
	}

	public void setIsVisibilidadCeldaVerFormEstadoAntiCliente(Boolean isVisibilidadCeldaVerFormEstadoAntiCliente) {
		this.isVisibilidadCeldaVerFormEstadoAntiCliente = isVisibilidadCeldaVerFormEstadoAntiCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoAntiCliente() {
		return isVisibilidadCeldaOrdenEstadoAntiCliente;
	}

	public void setIsVisibilidadCeldaOrdenEstadoAntiCliente(Boolean isVisibilidadCeldaOrdenEstadoAntiCliente) {
		this.isVisibilidadCeldaOrdenEstadoAntiCliente = isVisibilidadCeldaOrdenEstadoAntiCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoAntiCliente() {
		return isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoAntiCliente(Boolean isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente = isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoAntiCliente() {
		return isVisibilidadCeldaModificarEstadoAntiCliente;
	}

	public void setIsVisibilidadCeldaModificarEstadoAntiCliente(Boolean isVisibilidadCeldaModificarEstadoAntiCliente) {
		this.isVisibilidadCeldaModificarEstadoAntiCliente = isVisibilidadCeldaModificarEstadoAntiCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoAntiCliente() {
		return isVisibilidadCeldaActualizarEstadoAntiCliente;
	}

	public void setIsVisibilidadCeldaActualizarEstadoAntiCliente(Boolean isVisibilidadCeldaActualizarEstadoAntiCliente) {
		this.isVisibilidadCeldaActualizarEstadoAntiCliente = isVisibilidadCeldaActualizarEstadoAntiCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoAntiCliente() {
		return isVisibilidadCeldaEliminarEstadoAntiCliente;
	}

	public void setIsVisibilidadCeldaEliminarEstadoAntiCliente(Boolean isVisibilidadCeldaEliminarEstadoAntiCliente) {
		this.isVisibilidadCeldaEliminarEstadoAntiCliente = isVisibilidadCeldaEliminarEstadoAntiCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoAntiCliente() {
		return isVisibilidadCeldaCancelarEstadoAntiCliente;
	}

	public void setIsVisibilidadCeldaCancelarEstadoAntiCliente(Boolean isVisibilidadCeldaCancelarEstadoAntiCliente) {
		this.isVisibilidadCeldaCancelarEstadoAntiCliente = isVisibilidadCeldaCancelarEstadoAntiCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoAntiCliente() {
		return isVisibilidadCeldaGuardarEstadoAntiCliente;
	}

	public void setIsVisibilidadCeldaGuardarEstadoAntiCliente(Boolean isVisibilidadCeldaGuardarEstadoAntiCliente) {
		this.isVisibilidadCeldaGuardarEstadoAntiCliente = isVisibilidadCeldaGuardarEstadoAntiCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoAntiCliente() {
		return isVisibilidadCeldaGuardarCambiosEstadoAntiCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoAntiCliente(Boolean isVisibilidadCeldaGuardarCambiosEstadoAntiCliente) {
		this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente = isVisibilidadCeldaGuardarCambiosEstadoAntiCliente;
	}
		
	public EstadoAntiClienteSessionBean getestadoanticlienteSessionBean() {
		return this.estadoanticlienteSessionBean;
	}
	
	public void setestadoanticlienteSessionBean(EstadoAntiClienteSessionBean estadoanticlienteSessionBean) {
		this.estadoanticlienteSessionBean=estadoanticlienteSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(EstadoAntiCliente estadoanticliente)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoAntiCliente estadoanticliente,EstadoAntiCliente estadoanticlienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoAntiCliente(estadoanticliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoanticlienteAux.setId(estadoanticliente.getId());
		estadoanticlienteAux.setVersionRow(estadoanticliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoAntiCliente();
		
			int intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoAntiCliente(this.estadoanticliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoanticlienteValidator.getInvalidValues(this.estadoanticliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoanticlienteLogic.setDatosCliente(datosCliente);
			estadoanticlienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoanticlienteAux=new  EstadoAntiCliente();
				
				estadoanticlienteAux.setIsNew(true);
				estadoanticlienteAux.setIsChanged(true);
				
				estadoanticlienteAux.setEstadoAntiClienteOriginal(this.estadoanticliente);
				
				estadoanticlienteAux.setId(this.estadoanticliente.getId());	
				estadoanticlienteAux.setVersionRow(this.estadoanticliente.getVersionRow());	
				estadoanticlienteAux.setcodigo(this.estadoanticliente.getcodigo());	
				estadoanticlienteAux.setnombre(this.estadoanticliente.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoanticlienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoanticlienteAux,estadoanticlienteLogic.getEstadoAntiClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoanticlienteAux,estadoanticlientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoanticlienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoanticlienteLogic.saveEstadoAntiClientes();//WithConnection
						//estadoanticlienteLogic.getSetVersionRowEstadoAntiClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoanticliente,estadoanticlienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes().addAll(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclientes.addAll(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclientesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoanticlienteLogic.saveEstadoAntiClienteRelaciones(estadoanticlienteAux,this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());//WithConnection
								//estadoanticlienteLogic.getSetVersionRowEstadoAntiClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadoanticliente,estadoanticlienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.setAnticipoClientes(new ArrayList<AnticipoCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclientes= new ArrayList<AnticipoCliente>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoanticlienteAux.setAnticipoClientes(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadoanticlienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadoanticlienteAux,estadoanticlienteLogic.getEstadoAntiClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadoanticlienteAux,estadoanticlientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadoanticliente,estadoanticlienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoanticlienteAux=new  EstadoAntiCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoanticlienteSessionBean.getEsGuardarRelacionado() && this.estadoanticliente.getId()>=0)) {
						
					estadoanticlienteAux.setIsNew(false);
				}
				
				estadoanticlienteAux.setIsDeleted(false);
			
				estadoanticlienteAux.setId(this.estadoanticliente.getId());	
				estadoanticlienteAux.setVersionRow(this.estadoanticliente.getVersionRow());	
				estadoanticlienteAux.setcodigo(this.estadoanticliente.getcodigo());	
				estadoanticlienteAux.setnombre(this.estadoanticliente.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoanticlienteAux,estadoanticlienteLogic.getEstadoAntiClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoanticlienteAux,estadoanticlientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoanticlienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoanticlienteLogic.saveEstadoAntiClientes();//WithConnection
						//estadoanticlienteLogic.getSetVersionRowEstadoAntiClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoanticliente,estadoanticlienteAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes().addAll(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclientes.addAll(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclientesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoanticlienteLogic.saveEstadoAntiClienteRelaciones(estadoanticlienteAux,this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());//WithConnection
								//estadoanticlienteLogic.getSetVersionRowEstadoAntiClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadoanticliente,estadoanticlienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.setAnticipoClientes(new ArrayList<AnticipoCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclientes= new ArrayList<AnticipoCliente>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoanticlienteAux.setAnticipoClientes(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadoanticlienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadoanticlienteAux,estadoanticlienteLogic.getEstadoAntiClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadoanticlienteAux,estadoanticlientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadoanticliente,estadoanticlienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoanticlienteAux=new  EstadoAntiCliente();
				
				estadoanticlienteAux.setIsNew(false);
				estadoanticlienteAux.setIsChanged(false);
				
				estadoanticlienteAux.setIsDeleted(true);
				
				estadoanticlienteAux.setId(this.estadoanticliente.getId());	
				estadoanticlienteAux.setVersionRow(this.estadoanticliente.getVersionRow());	
				estadoanticlienteAux.setcodigo(this.estadoanticliente.getcodigo());	
				estadoanticlienteAux.setnombre(this.estadoanticliente.getnombre());	
				
				if(this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoanticlienteAux.getId()>=0) {	
						this.estadoanticlientesEliminados.add(estadoanticlienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoanticlienteAux,estadoanticlienteLogic.getEstadoAntiClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoanticlienteAux,estadoanticlientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoanticlienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoanticlienteLogic.saveEstadoAntiClientes();//WithConnection
						//estadoanticlienteLogic.getSetVersionRowEstadoAntiClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes().addAll(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclientes.addAll(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclientesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadoanticlienteLogic.saveEstadoAntiClienteRelaciones(estadoanticlienteAux,this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());//WithConnection
								//estadoanticlienteLogic.getSetVersionRowEstadoAntiClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.setAnticipoClientes(new ArrayList<AnticipoCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclientes= new ArrayList<AnticipoCliente>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoanticlienteAux.setAnticipoClientes(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoanticlienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoanticlienteAux,estadoanticlienteLogic.getEstadoAntiClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoanticlienteAux,estadoanticlientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.getEstadoAntiClientes().addAll(this.estadoanticlientesEliminados);
					
					estadoanticlienteLogic.saveEstadoAntiClientes();//WithConnection
					//estadoanticlienteLogic.getSetVersionRowEstadoAntiClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadoanticlientesEliminados= new ArrayList<EstadoAntiCliente>();		
			}
			
			if(this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Anti Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Anti Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoanticliente=estadoanticlienteAux;
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
      		//this.finishProcessEstadoAntiCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoAntiCliente estadoanticlienteLocal) throws Exception {
		
		if(this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadoanticlienteLocal.setAnticipoClientes(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());
			
			} else {
			
				estadoanticlienteLocal.setAnticipoClientes(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclientes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoAntiCliente estadoanticlienteLocal) throws Exception {	
		if(this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoAntiClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoanticlienteValidator.getInvalidValues(this.estadoanticliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoAntiCliente estadoanticliente,List<EstadoAntiCliente> estadoanticlientes) throws Exception {
		try	{		
			EstadoAntiClienteConstantesFunciones.actualizarLista(estadoanticliente,estadoanticlientes,this.estadoanticlienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoAntiCliente estadoanticliente,List<EstadoAntiCliente> estadoanticlientes) throws Exception {
		try	{			
			EstadoAntiClienteConstantesFunciones.actualizarSelectedLista(estadoanticliente,estadoanticlientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoAntiCliente> estadoanticlientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoanticlientesLocal=this.estadoanticlienteLogic.getEstadoAntiClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoanticlientesLocal=this.estadoanticlientes;
			}
			//ARCHITECTURE
		
			for(EstadoAntiCliente estadoanticlienteLocal:estadoanticlientesLocal) {
				if(this.permiteMantenimiento(estadoanticlienteLocal) && estadoanticlienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoAntiClienteConstantesFunciones.getEstadoAntiClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoAntiClienteConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelcodigoEstadoAntiCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoAntiClienteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelnombreEstadoAntiCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelcodigoEstadoAntiCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelnombreEstadoAntiCliente,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("AnticipoCliente")) {
			if(this.estadoanticliente==null) {
				this.estadoanticliente= new EstadoAntiCliente();
			}

			if(this.estadoanticlienteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoAntiCliente
				this.setVariablesFormularioToObjetoActualEstadoAntiCliente(this.estadoanticliente,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);

				this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.getanticipocliente().setEstadoAntiCliente(this.estadoanticliente);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoAntiCliente--;	
		
		
		this.estadoanticlienteAux=new EstadoAntiCliente();
		
		this.estadoanticlienteAux.setId(this.iIdNuevoEstadoAntiCliente);
		this.estadoanticlienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoanticlienteLogic.getEstadoAntiClientes().add(this.estadoanticlienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoanticlientes.add(this.estadoanticlienteAux);
		}
		//ARCHITECTURE
		
		this.estadoanticliente=this.estadoanticlienteAux;
		
		if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoAntiCliente(this.estadoanticliente);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoAntiCliente(this.estadoanticliente);
		}
				
		//this.setDefaultControlesEstadoAntiCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoAntiCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoAntiCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoAntiCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoAntiCliente(this.estadoanticlienteBean,this.estadoanticliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {
			classes=EstadoAntiClienteConstantesFunciones.getClassesRelationshipsOfEstadoAntiCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoanticlienteReturnGeneral=estadoanticlienteLogic.procesarEventosEstadoAntiClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoanticlienteLogic.getEstadoAntiClientes(),this.estadoanticliente,this.estadoanticlienteParameterGeneral,this.isEsNuevoEstadoAntiCliente,classes);//this.estadoanticlienteLogic.getEstadoAntiCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoAntiCliente(this.estadoanticlienteReturnGeneral,this.estadoanticlienteBean,false);
		
		if(this.estadoanticlienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoAntiCliente(this.estadoanticlienteReturnGeneral.getEstadoAntiCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoAntiCliente(this.estadoanticlienteReturnGeneral.getEstadoAntiCliente());
		}
		
		if(this.estadoanticlienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoAntiCliente(this.estadoanticlienteReturnGeneral.getEstadoAntiCliente(),classes);//this.estadoanticlienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoAntiCliente(this.estadoanticliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoAntiCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoAntiCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.RecargarFormEstadoAntiCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoAntiCliente(false);
						
			if(estadoanticlienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.getEsGuardarRelacionado() && AnticipoClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAnticipoClienteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoAntiCliente();
			}
			
			this.actualizarVisualTableDatosEstadoAntiCliente();
			
			this.jTableDatosEstadoAntiCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoAntiCliente(), this.getIndiceNuevoEstadoAntiCliente());
			
			this.seleccionarFilaTablaEstadoAntiClienteActual();
						
			this.actualizarEstadoCeldasBotonesEstadoAntiCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoAntiCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jTextFieldcodigoEstadoAntiCliente.setEnabled(isHabilitar && this.estadoanticlienteConstantesFunciones.activarcodigoEstadoAntiCliente);
		this.jInternalFrameDetalleFormEstadoAntiCliente.jTextAreanombreEstadoAntiCliente.setEnabled(isHabilitar && this.estadoanticlienteConstantesFunciones.activarnombreEstadoAntiCliente);	
		
	};
	
	public void setDefaultControlesEstadoAntiCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoAntiCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoanticlienteSessionBean.setConGuardarRelaciones(true);			
			this.estadoanticlienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoAntiCliente.jTabbedPaneRelacionesEstadoAntiCliente.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadoanticlienteSessionBean.setConGuardarRelaciones(false);			
			this.estadoanticlienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoAntiCliente.jTabbedPaneRelacionesEstadoAntiCliente.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoAntiCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlienteLogic.getEstadoAntiClientes()) {
				if(estadoanticlienteAux.getId().equals(this.iIdNuevoEstadoAntiCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlientes) {
				if(estadoanticlienteAux.getId().equals(this.iIdNuevoEstadoAntiCliente)) {
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
	
	public int getIndiceActualEstadoAntiCliente(EstadoAntiCliente estadoanticliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlienteLogic.getEstadoAntiClientes()) {
				if(estadoanticlienteAux.getId().equals(estadoanticliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlientes) {
				if(estadoanticlienteAux.getId().equals(estadoanticliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoAntiCliente(EstadoAntiCliente estadoanticlienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlienteLogic.getEstadoAntiClientes()) {
				if(estadoanticlienteAux.getEstadoAntiClienteOriginal().getId().equals(estadoanticlienteOriginal.getId())) {
					existe=true;
					estadoanticlienteOriginal.setId(estadoanticlienteAux.getId());
					estadoanticlienteOriginal.setVersionRow(estadoanticlienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlientes) {
				if(estadoanticlienteAux.getEstadoAntiClienteOriginal().getId().equals(estadoanticlienteOriginal.getId())) {
					existe=true;
					estadoanticlienteOriginal.setId(estadoanticlienteAux.getId());
					estadoanticlienteOriginal.setVersionRow(estadoanticlienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoAntiCliente(Boolean esParaCancelar) throws Exception {
		estadoanticlientesAux=new ArrayList<EstadoAntiCliente>();
		estadoanticlienteAux=new EstadoAntiCliente();
		
		if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlienteLogic.getEstadoAntiClientes()) {
					if(estadoanticlienteAux.getId()<0) {
						estadoanticlientesAux.add(estadoanticlienteAux);
					}		
				}
				this.iIdNuevoEstadoAntiCliente=0L;
				this.estadoanticlienteLogic.getEstadoAntiClientes().removeAll(estadoanticlientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlientes) {
					if(estadoanticlienteAux.getId()<0) {
						estadoanticlientesAux.add(estadoanticlienteAux);
					}		
				}
				this.iIdNuevoEstadoAntiCliente=0L;
				this.estadoanticlientes.removeAll(estadoanticlientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoAntiCliente 
					&& this.estadoanticlienteLogic.getEstadoAntiClientes().size()>0
					) {
					estadoanticlienteAux=this.estadoanticlienteLogic.getEstadoAntiClientes().get(this.estadoanticlienteLogic.getEstadoAntiClientes().size() - 1);
				
					if(estadoanticlienteAux.getId()<0) {
						this.estadoanticlienteLogic.getEstadoAntiClientes().remove(estadoanticlienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoAntiCliente && this.estadoanticlientes.size()>0) {
					estadoanticlienteAux=this.estadoanticlientes.get(this.estadoanticlientes.size() - 1);
				
					if(estadoanticlienteAux.getId()<0) {
						this.estadoanticlientes.remove(estadoanticlienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoAntiCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoanticliente.getId()<0) {
				this.estadoanticlienteLogic.getEstadoAntiClientes().remove(this.estadoanticliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoanticliente.getId()<0) {
				this.estadoanticlientes.remove(this.estadoanticliente);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoAntiCliente(List<EstadoAntiCliente> estadoanticlientesAux) throws Exception {
		EstadoAntiClienteConstantesFunciones.setEstadosInicialesEstadoAntiCliente(estadoanticlientesAux);
	}
	
	public void setEstadosInicialesEstadoAntiCliente(EstadoAntiCliente estadoanticlienteAux) throws Exception {
		EstadoAntiClienteConstantesFunciones.setEstadosInicialesEstadoAntiCliente(estadoanticlienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoAntiClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoAntiCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoAntiClienteActual()) {
				if(!this.isEsNuevoEstadoAntiCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoAntiCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoAntiCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoAntiClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Anti Cliente ?", "MANTENIMIENTO DE Estado Anti Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoAntiCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoAntiCliente estadoanticliente) throws Exception {
		EstadoAntiClienteConstantesFunciones.seleccionarAsignar(this.estadoanticliente,estadoanticliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoAntiCliente=this.isPermisoActualizarOriginalEstadoAntiCliente;
			
			
			this.seleccionarAsignar(estadoanticliente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoAntiClienteConstantesFunciones.quitarEspaciosEstadoAntiCliente(this.estadoanticliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoAntiCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoanticlienteSessionBean.setsFuncionBusquedaRapida(this.estadoanticlienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoAntiCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoAntiCliente(esParaCancelar);				
				this.cancelarNuevoEstadoAntiCliente(esParaCancelar);								
			}
			
			this.estadoanticliente=new EstadoAntiCliente();
			
			this.inicializarEstadoAntiCliente();
			
			this.actualizarEstadoCeldasBotonesEstadoAntiCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoAntiCliente() throws Exception {
		try {
			EstadoAntiClienteConstantesFunciones.inicializarEstadoAntiCliente(this.estadoanticliente);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoanticlienteLogic.getEstadoAntiClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoAntiClientes(String sAccionBusqueda,List<EstadoAntiCliente> estadoanticlientesParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoAntiCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoAntiClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoAntiClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoAntiCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Anti Clientes");		
		parameters.put("busquedapor", EstadoAntiClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(AnticipoCliente.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoAntiClienteLogic estadoanticlienteLogicAuxiliar=new EstadoAntiClienteLogic();
					estadoanticlienteLogicAuxiliar.setDatosCliente(estadoanticlienteLogic.getDatosCliente());				
					estadoanticlienteLogicAuxiliar.setEstadoAntiClientes(estadoanticlientesParaReportes);
					
					estadoanticlienteLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoAntiClienteWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadoanticlientesParaReportes=estadoanticlienteLogicAuxiliar.getEstadoAntiClientes();
					
					//estadoanticlienteLogic.getNewConnexionToDeep();
					
					//for (EstadoAntiCliente estadoanticliente:estadoanticlientesParaReportes) {
					//	estadoanticlienteLogic.deepLoad(estadoanticliente, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadoanticlienteLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadoanticlienteLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileAnticipoCliente = AuxiliarReportes.class.getResourceAsStream("AnticipoClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_anticipocliente", reportFileAnticipoCliente);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoAntiCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoAntiClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoAntiClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoAntiCliente=new JRBeanArrayDataSource(EstadoAntiClienteJInternalFrame.TraerEstadoAntiClienteBeans(estadoanticlientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoAntiCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoAntiClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoAntiClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoAntiClienteBean.TraerEstadoAntiClienteBeans(estadoanticlientesParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoAntiClientes(sAccionBusqueda,sTipoArchivoReporte,estadoanticlientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoAntiClientes(sAccionBusqueda,sTipoArchivoReporte,estadoanticlientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoAntiClienteActionPerformed(null);
					//this.generarExcelReporteEstadoAntiClientes(sAccionBusqueda,sTipoArchivoReporte,estadoanticlientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoAntiClientes(sAccionBusqueda,sTipoArchivoReporte,estadoanticlientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoAntiClientes(sAccionBusqueda,sTipoArchivoReporte,estadoanticlientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoAntiClientes(sAccionBusqueda,sTipoArchivoReporte,estadoanticlientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoAntiClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoAntiCliente> estadoanticlientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoanticliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoAntiClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoAntiCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoAntiCliente estadoanticliente : estadoanticlientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoAntiClienteConstantesFunciones.generarExcelReporteDataEstadoAntiCliente("NORMAL",row,workbook,estadoanticliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Anti Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoAntiCliente(String sTipo,Row row,Workbook workbook) {
		
		EstadoAntiClienteConstantesFunciones.generarExcelReporteHeaderEstadoAntiCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoAntiClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoAntiCliente> estadoanticlientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoanticliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoAntiClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoAntiCliente estadoanticliente : estadoanticlientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoAntiClienteConstantesFunciones.getEstadoAntiClienteDescripcion(estadoanticliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoAntiClienteConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoAntiClienteConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoanticliente.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoanticliente.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Anti Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoAntiClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoAntiCliente> estadoanticlientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoAntiCliente> estadoanticlientesRespaldo=null;
		
		classes=EstadoAntiClienteConstantesFunciones.getClassesRelationshipsOfEstadoAntiCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoanticlienteLogic.setDatosCliente(this.datosCliente);
		this.estadoanticlienteLogic.setDatosDeep(this.datosDeep);
		this.estadoanticlienteLogic.setIsConDeep(true);
		
		estadoanticlientesRespaldo=this.estadoanticlienteLogic.getEstadoAntiClientes();
		
		this.estadoanticlienteLogic.setEstadoAntiClientes(estadoanticlientesParaReportes);	
		this.estadoanticlienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoanticlientesParaReportes=this.estadoanticlienteLogic.getEstadoAntiClientes();
		this.estadoanticlienteLogic.setEstadoAntiClientes(estadoanticlientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoanticliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoAntiClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoAntiCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoAntiCliente estadoanticliente : estadoanticlientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoAntiCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoAntiClienteConstantesFunciones.generarExcelReporteDataEstadoAntiCliente("NORMAL",row,workbook,estadoanticliente,cellStyleDataAux);
		
			
			


				//AnticipoCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(AnticipoClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoanticliente.getAnticipoClientes()!=null && estadoanticliente.getAnticipoClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					AnticipoClienteConstantesFunciones.generarExcelReporteHeaderAnticipoCliente("RELACIONADO",row,workbook);
				}

				if(estadoanticliente.getAnticipoClientes()!=null) {
					i2=0;
					for(AnticipoCliente anticipocliente : estadoanticliente.getAnticipoClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						AnticipoClienteConstantesFunciones.generarExcelReporteDataAnticipoCliente("RELACIONADO",row,workbook,anticipocliente,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoAntiClienteConstantesFunciones.getEstadoAntiClienteDescripcion(estadoanticliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Anti Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoAntiCliente() throws Exception {		
		this.startProcessEstadoAntiCliente(true);
	}
	
	public void startProcessEstadoAntiCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoAntiCliente, this.jScrollPanelDatosEstadoAntiCliente,this.jPanelPaginacionEstadoAntiCliente, this.jScrollPanelDatosEdicionEstadoAntiCliente, this.jPanelAccionesEstadoAntiCliente,this.jPanelAccionesFormularioEstadoAntiCliente,this.jmenuBarEstadoAntiCliente,this.jmenuBarDetalleEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,this.jTtoolBarDetalleEstadoAntiCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoAntiCliente=null; 
		
		final JPanel jPanelParametrosReportesEstadoAntiCliente=this.jPanelParametrosReportesEstadoAntiCliente;
		//final JScrollPane jScrollPanelDatosEstadoAntiCliente=this.jScrollPanelDatosEstadoAntiCliente;
		final JTable jTableDatosEstadoAntiCliente=this.jTableDatosEstadoAntiCliente;		
		final JPanel jPanelPaginacionEstadoAntiCliente=this.jPanelPaginacionEstadoAntiCliente;
		//final JScrollPane jScrollPanelDatosEdicionEstadoAntiCliente=this.jScrollPanelDatosEdicionEstadoAntiCliente;
		final JPanel jPanelAccionesEstadoAntiCliente=this.jPanelAccionesEstadoAntiCliente;
		
		JPanel jPanelCamposAuxiliarEstadoAntiCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoAntiCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
			jPanelCamposAuxiliarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jPanelCamposEstadoAntiCliente;
			jPanelAccionesFormularioAuxiliarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jPanelAccionesFormularioEstadoAntiCliente;
		}
		
		final JPanel jPanelCamposEstadoAntiCliente=jPanelCamposAuxiliarEstadoAntiCliente;
		final JPanel jPanelAccionesFormularioEstadoAntiCliente=jPanelAccionesFormularioAuxiliarEstadoAntiCliente;
		
		
		final JMenuBar jmenuBarEstadoAntiCliente=this.jmenuBarEstadoAntiCliente;
		final JToolBar jTtoolBarEstadoAntiCliente=this.jTtoolBarEstadoAntiCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoAntiCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoAntiCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
			jmenuBarDetalleAuxiliarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jmenuBarDetalleEstadoAntiCliente;
			jTtoolBarDetalleAuxiliarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jTtoolBarDetalleEstadoAntiCliente;
		}
		
		final JMenuBar jmenuBarDetalleEstadoAntiCliente=jmenuBarDetalleAuxiliarEstadoAntiCliente;
		final JToolBar jTtoolBarDetalleEstadoAntiCliente=jTtoolBarDetalleAuxiliarEstadoAntiCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoAntiCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoAntiCliente;
			processRunnable.jTableDatos=jTableDatosEstadoAntiCliente;
			processRunnable.jPanelCampos=jPanelCamposEstadoAntiCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoAntiCliente;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoAntiCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoAntiCliente;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoAntiCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoAntiCliente;
			processRunnable.jTtoolBar=jTtoolBarEstadoAntiCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoAntiCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoAntiCliente ,jPanelParametrosReportesEstadoAntiCliente,jTableDatosEstadoAntiCliente, /*jScrollPanelDatosEstadoAntiCliente,*/jPanelCamposEstadoAntiCliente,jPanelPaginacionEstadoAntiCliente, /*jScrollPanelDatosEdicionEstadoAntiCliente,*/ jPanelAccionesEstadoAntiCliente,jPanelAccionesFormularioEstadoAntiCliente,jmenuBarEstadoAntiCliente,jmenuBarDetalleEstadoAntiCliente,jTtoolBarEstadoAntiCliente,jTtoolBarDetalleEstadoAntiCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoAntiCliente, jScrollPanelDatosEstadoAntiCliente,jPanelPaginacionEstadoAntiCliente, jScrollPanelDatosEdicionEstadoAntiCliente, jPanelAccionesEstadoAntiCliente,jPanelAccionesFormularioEstadoAntiCliente,jmenuBarEstadoAntiCliente,jmenuBarDetalleEstadoAntiCliente,jTtoolBarEstadoAntiCliente,jTtoolBarDetalleEstadoAntiCliente);
						
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
	
	public void finishProcessEstadoAntiCliente() {// throws Exception 
		this.finishProcessEstadoAntiCliente(true);
	}
	
	public void finishProcessEstadoAntiCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoAntiCliente, this.jScrollPanelDatosEstadoAntiCliente,this.jPanelPaginacionEstadoAntiCliente, this.jScrollPanelDatosEdicionEstadoAntiCliente, this.jPanelAccionesEstadoAntiCliente,this.jPanelAccionesFormularioEstadoAntiCliente,this.jmenuBarEstadoAntiCliente,this.jmenuBarDetalleEstadoAntiCliente,this.jTtoolBarEstadoAntiCliente,this.jTtoolBarDetalleEstadoAntiCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoAntiCliente=null; 
		
		final JPanel jPanelParametrosReportesEstadoAntiCliente=this.jPanelParametrosReportesEstadoAntiCliente;
		//final JScrollPane jScrollPanelDatosEstadoAntiCliente=this.jScrollPanelDatosEstadoAntiCliente;
		final JTable jTableDatosEstadoAntiCliente=this.jTableDatosEstadoAntiCliente;		
		final JPanel jPanelPaginacionEstadoAntiCliente=this.jPanelPaginacionEstadoAntiCliente;
		//final JScrollPane jScrollPanelDatosEdicionEstadoAntiCliente=this.jScrollPanelDatosEdicionEstadoAntiCliente;
		final JPanel jPanelAccionesEstadoAntiCliente=this.jPanelAccionesEstadoAntiCliente;
		
		JPanel jPanelCamposAuxiliarEstadoAntiCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoAntiCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
			jPanelCamposAuxiliarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jPanelCamposEstadoAntiCliente;
			jPanelAccionesFormularioAuxiliarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jPanelAccionesFormularioEstadoAntiCliente;
		}
		
		final JPanel jPanelCamposEstadoAntiCliente=jPanelCamposAuxiliarEstadoAntiCliente;
		final JPanel jPanelAccionesFormularioEstadoAntiCliente=jPanelAccionesFormularioAuxiliarEstadoAntiCliente;
		
		
		final JMenuBar jmenuBarEstadoAntiCliente=this.jmenuBarEstadoAntiCliente;		
		final JToolBar jTtoolBarEstadoAntiCliente=this.jTtoolBarEstadoAntiCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoAntiCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoAntiCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
			jmenuBarDetalleAuxiliarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jmenuBarDetalleEstadoAntiCliente;
			jTtoolBarDetalleAuxiliarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jTtoolBarDetalleEstadoAntiCliente;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoAntiCliente=jmenuBarDetalleAuxiliarEstadoAntiCliente;
		final JToolBar jTtoolBarDetalleEstadoAntiCliente=jTtoolBarDetalleAuxiliarEstadoAntiCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoAntiCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoAntiCliente;
			processRunnable.jTableDatos=jTableDatosEstadoAntiCliente;
			processRunnable.jPanelCampos=jPanelCamposEstadoAntiCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoAntiCliente;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoAntiCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoAntiCliente;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoAntiCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoAntiCliente;
			processRunnable.jTtoolBar=jTtoolBarEstadoAntiCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoAntiCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoAntiCliente ,jPanelParametrosReportesEstadoAntiCliente, jTableDatosEstadoAntiCliente,/*jScrollPanelDatosEstadoAntiCliente,*/jPanelCamposEstadoAntiCliente,jPanelPaginacionEstadoAntiCliente, /*jScrollPanelDatosEdicionEstadoAntiCliente,*/ jPanelAccionesEstadoAntiCliente,jPanelAccionesFormularioEstadoAntiCliente,jmenuBarEstadoAntiCliente,jmenuBarDetalleEstadoAntiCliente,jTtoolBarEstadoAntiCliente,jTtoolBarDetalleEstadoAntiCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoAntiCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoAntiCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoAntiCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoAntiCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoAntiCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoAntiCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoAntiCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoAntiCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoAntiCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoanticlienteConstantesFunciones.getsFinalQueryEstadoAntiCliente();
		String  finalQueryPaginacionTodos=this.estadoanticlienteConstantesFunciones.getsFinalQueryEstadoAntiCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoAntiClienteConstantesFunciones.getArrayColumnasGlobalesNoEstadoAntiCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoAntiClienteConstantesFunciones.getArrayColumnasGlobalesEstadoAntiCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoAntiClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoanticlientesEliminados= new ArrayList<EstadoAntiCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoAntiCliente();
		
				///*EstadoAntiClienteSessionBean*/this.estadoanticlienteSessionBean=new EstadoAntiClienteSessionBean();
			
			if(this.estadoanticlienteSessionBean==null) {
				this.estadoanticlienteSessionBean=new EstadoAntiClienteSessionBean();
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
					this.iNumeroPaginacion=EstadoAntiClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoAntiClienteConstantesFunciones.getClassesForeignKeysOfEstadoAntiCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoanticliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoanticlientesAux= new ArrayList<EstadoAntiCliente>();
			
				
			estadoanticlienteLogic.setDatosCliente(this.datosCliente);
			estadoanticlienteLogic.setDatosDeep(this.datosDeep);
			estadoanticlienteLogic.setIsConDeep(true);
			
			
			estadoanticlienteLogic.getEstadoAntiClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoanticlienteLogic.getTodosEstadoAntiClientes(finalQueryGlobal,pagination);
					
					//estadoanticlienteLogic.getTodosEstadoAntiClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoanticlienteLogic.getEstadoAntiClientes()==null|| estadoanticlienteLogic.getEstadoAntiClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoanticlientesAux= new ArrayList<EstadoAntiCliente>();
							estadoanticlientesAux.addAll(estadoanticlienteLogic.getEstadoAntiClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoanticlientesAux= new ArrayList<EstadoAntiCliente>();
							estadoanticlientesAux.addAll(estadoanticlientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoanticlienteLogic.getTodosEstadoAntiClientes(finalQueryGlobal+"",this.pagination);												
							
							//estadoanticlienteLogic.getTodosEstadoAntiClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoAntiClientes("Todos",estadoanticlienteLogic.getEstadoAntiClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoanticlienteLogic.setEstadoAntiClientes(new ArrayList<EstadoAntiCliente>());					
							estadoanticlienteLogic.getEstadoAntiClientes().addAll(estadoanticlientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoanticlientes=new ArrayList<EstadoAntiCliente>();
							estadoanticlientes.addAll(estadoanticlientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoAntiCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoAntiCliente=this.idActual;
				
				} else if(this.idEstadoAntiClienteActual!=null && this.idEstadoAntiClienteActual!=0L) {
					idEstadoAntiCliente=idEstadoAntiClienteActual;
				}
				
					
				this.sDetalleReporte=EstadoAntiClienteConstantesFunciones.getDetalleIndicePorId(idEstadoAntiCliente);
				
				this.estadoanticlientes=new ArrayList<EstadoAntiCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoanticlienteLogic.getEntity(idEstadoAntiCliente);
					
					//estadoanticlienteLogic.getEntityWithConnection(idEstadoAntiCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoanticlienteLogic.setEstadoAntiClientes(new ArrayList<EstadoAntiCliente>());
					estadoanticlienteLogic.getEstadoAntiClientes().add(estadoanticlienteLogic.getEstadoAntiCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoanticlientes=new ArrayList<EstadoAntiCliente>();
					this.estadoanticlientes.add(estadoanticliente);
				}
				
				if(estadoanticlienteLogic.getEstadoAntiCliente()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoAntiCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoAntiCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoanticlienteLogic.getEstadoAntiClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoanticlientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoanticlienteLogic.getEstadoAntiClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoanticlientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoAntiCliente estadoanticliente) {
		Boolean permite=true;
		
		if(this.estadoanticliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoAntiClienteConstantesFunciones.getOrderByListaEstadoAntiCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoAntiClienteConstantesFunciones.getOrderByListaEstadoAntiCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAntiCliente estadoanticliente:estadoanticlienteLogic.getEstadoAntiClientes()) {
				if(estadoanticliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadoanticlienteTotales=estadoanticliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAntiCliente estadoanticliente:this.estadoanticlientes) {
				if(estadoanticliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadoanticlienteTotales=estadoanticliente;
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
			this.estadoanticlienteAux=new EstadoAntiCliente();
			this.estadoanticlienteAux.setsType(Constantes2.S_TOTALES);
			this.estadoanticlienteAux.setIsNew(false);
			this.estadoanticlienteAux.setIsChanged(false);
			this.estadoanticlienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoAntiClienteConstantesFunciones.TotalizarValoresFilaEstadoAntiCliente(this.estadoanticlienteLogic.getEstadoAntiClientes(),this.estadoanticlienteAux);
				
				this.estadoanticlienteLogic.getEstadoAntiClientes().add(this.estadoanticlienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoAntiClienteConstantesFunciones.TotalizarValoresFilaEstadoAntiCliente(this.estadoanticlientes,this.estadoanticlienteAux);
				
				this.estadoanticlientes.add(this.estadoanticlienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoanticlienteTotales=new EstadoAntiCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoanticlienteLogic.getEstadoAntiClientes().remove(estadoanticlienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoanticlientes.remove(estadoanticlienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoanticlienteTotales=new EstadoAntiCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoAntiCliente estadoanticliente:estadoanticlienteLogic.getEstadoAntiClientes()) {
				if(estadoanticliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadoanticlienteTotales=estadoanticliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoAntiClienteConstantesFunciones.TotalizarValoresFilaEstadoAntiCliente(this.estadoanticlienteLogic.getEstadoAntiClientes(),estadoanticlienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoAntiCliente estadoanticliente:this.estadoanticlientes) {
				if(estadoanticliente.getsType().equals(Constantes2.S_TOTALES)) {
					estadoanticlienteTotales=estadoanticliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoAntiClienteConstantesFunciones.TotalizarValoresFilaEstadoAntiCliente(this.estadoanticlientes,estadoanticlienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoAntiClientePorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoAntiClientePorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoanticlienteLogic.getEstadoAntiClientePorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoAntiCliente() {
		this.isPermisoTodoEstadoAntiCliente=false;
		this.isPermisoNuevoEstadoAntiCliente=false;
		this.isPermisoActualizarEstadoAntiCliente=false;
		this.isPermisoActualizarOriginalEstadoAntiCliente=false;
		this.isPermisoEliminarEstadoAntiCliente=false;
		this.isPermisoGuardarCambiosEstadoAntiCliente=false;
		this.isPermisoConsultaEstadoAntiCliente=false;
		this.isPermisoBusquedaEstadoAntiCliente=false;
		this.isPermisoReporteEstadoAntiCliente=false;		
		this.isPermisoOrdenEstadoAntiCliente=false;		
		this.isPermisoPaginacionMedioEstadoAntiCliente=false;		
		this.isPermisoPaginacionAltoEstadoAntiCliente=false;
		this.isPermisoPaginacionTodoEstadoAntiCliente=false;
		this.isPermisoCopiarEstadoAntiCliente=false;		
		this.isPermisoVerFormEstadoAntiCliente=false;		
		this.isPermisoDuplicarEstadoAntiCliente=false;		
		this.isPermisoOrdenEstadoAntiCliente=false;		
	}
	
	public void setPermisosUsuarioEstadoAntiCliente(Boolean isPermiso) {
		this.isPermisoTodoEstadoAntiCliente=isPermiso;
		this.isPermisoNuevoEstadoAntiCliente=isPermiso;
		this.isPermisoActualizarEstadoAntiCliente=isPermiso;
		this.isPermisoActualizarOriginalEstadoAntiCliente=isPermiso;
		this.isPermisoEliminarEstadoAntiCliente=isPermiso;
		this.isPermisoGuardarCambiosEstadoAntiCliente=isPermiso;
		this.isPermisoConsultaEstadoAntiCliente=isPermiso;
		this.isPermisoBusquedaEstadoAntiCliente=isPermiso;
		this.isPermisoReporteEstadoAntiCliente=isPermiso;
		this.isPermisoOrdenEstadoAntiCliente=isPermiso;		
		this.isPermisoPaginacionMedioEstadoAntiCliente=isPermiso;		
		this.isPermisoPaginacionAltoEstadoAntiCliente=isPermiso;		
		this.isPermisoPaginacionTodoEstadoAntiCliente=isPermiso;		
		this.isPermisoCopiarEstadoAntiCliente=isPermiso;		
		this.isPermisoVerFormEstadoAntiCliente=isPermiso;		
		this.isPermisoDuplicarEstadoAntiCliente=isPermiso;
		this.isPermisoOrdenEstadoAntiCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoAntiCliente(Boolean isPermiso) {
		//this.isPermisoTodoEstadoAntiCliente=isPermiso;
		this.isPermisoNuevoEstadoAntiCliente=isPermiso;
		this.isPermisoActualizarEstadoAntiCliente=isPermiso;
		this.isPermisoActualizarOriginalEstadoAntiCliente=isPermiso;
		this.isPermisoEliminarEstadoAntiCliente=isPermiso;
		this.isPermisoGuardarCambiosEstadoAntiCliente=isPermiso;
		//this.isPermisoConsultaEstadoAntiCliente=isPermiso;
		//this.isPermisoBusquedaEstadoAntiCliente=isPermiso;
		//this.isPermisoReporteEstadoAntiCliente=isPermiso;
		//this.isPermisoOrdenEstadoAntiCliente=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoAntiCliente=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoAntiCliente=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoAntiCliente=isPermiso;		
		//this.isPermisoCopiarEstadoAntiCliente=isPermiso;		
		//this.isPermisoDuplicarEstadoAntiCliente=isPermiso;
		//this.isPermisoOrdenEstadoAntiCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoAntiClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(AnticipoClienteConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoAntiClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosAnticipoCliente=false;
		this.isTienePermisosAnticipoCliente=this.verificarGetPermisosUsuarioOpcionEstadoAntiClienteClaseRelacionada(this.opcionsRelacionadas,AnticipoClienteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoAntiCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoAntiClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosAnticipoCliente=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoAntiClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoAntiClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoAntiClienteClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosAnticipoCliente && this.jInternalFrameDetalleFormEstadoAntiCliente!=null && this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jTabbedPaneRelacionesEstadoAntiCliente.remove(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoAntiCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoAntiClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoAntiClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoAntiCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoAntiCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoAntiCliente=this.isPermisoActualizarEstadoAntiCliente;
			this.isPermisoEliminarEstadoAntiCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoAntiCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoAntiCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoAntiCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoAntiCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoAntiCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoAntiCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoAntiCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoAntiCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoAntiCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoAntiCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoAntiCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoAntiCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoAntiCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoAntiCliente.setToolTipText(this.jTableDatosEstadoAntiCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoAntiCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoAntiCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoAntiClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoAntiClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoAntiCliente() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosAnticipoCliente && this.estadoanticlienteConstantesFunciones.mostrarAnticipoClienteEstadoAntiCliente && !EstadoAntiClienteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Anticipo Cliente");
			reporte.setsDescripcion("Anticipo Cliente");
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
	
		
	public void inicializarCombosForeignKeyEstadoAntiClienteListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoAntiClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoAntiClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoAntiClienteListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoAntiClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoAntiCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoAntiCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoAntiCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoAntiCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoAntiCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoAntiCliente(EstadoAntiCliente estadoanticliente)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoAntiCliente(EstadoAntiCliente estadoanticliente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoAntiCliente()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoAntiCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoAntiCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoAntiCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoAntiCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoAntiCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoAntiCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoAntiCliente()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoAntiClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoAntiClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoAntiClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoanticlienteSessionBean=new EstadoAntiClienteSessionBean(); 
		this.estadoanticlienteConstantesFunciones=new EstadoAntiClienteConstantesFunciones(); 
		this.estadoanticlienteBean=new EstadoAntiCliente();//(this.estadoanticlienteConstantesFunciones); 		
		this.estadoanticlienteReturnGeneral=new EstadoAntiClienteParameterReturnGeneral(); 
		
		this.estadoanticlienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoanticlienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoAntiClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoAntiClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoAntiClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoAntiCliente(true);
			
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
			
			this.estadoanticlienteConstantesFunciones=new EstadoAntiClienteConstantesFunciones(); 
			this.estadoanticlienteBean=new EstadoAntiCliente();//this.estadoanticlienteConstantesFunciones); 			
			this.estadoanticlienteReturnGeneral=new EstadoAntiClienteParameterReturnGeneral(); 
		
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Anti Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoanticliente=new EstadoAntiCliente();
			this.estadoanticlientes = new ArrayList<EstadoAntiCliente>();
			this.estadoanticlientesAux = new ArrayList<EstadoAntiCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic=new EstadoAntiClienteLogic();
				this.estadoanticlienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoanticlienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoanticlienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoAntiCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoAntiCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoAntiCliente);	
					}
					
					if(this.jInternalFrameImportacionEstadoAntiCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoAntiCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoAntiCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoAntiCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoAntiCliente);
				this.jInternalFrameDetalleFormEstadoAntiCliente.setVisible(false);
				this.jInternalFrameDetalleFormEstadoAntiCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoAntiCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoAntiCliente);
					this.jInternalFrameReporteDinamicoEstadoAntiCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoAntiCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoAntiCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoAntiCliente);
					this.jInternalFrameImportacionEstadoAntiCliente.setVisible(false);
					this.jInternalFrameImportacionEstadoAntiCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoAntiCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoAntiCliente);
					this.jInternalFrameOrderByEstadoAntiCliente.setVisible(false);
					this.jInternalFrameOrderByEstadoAntiCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoAntiClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoAntiClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoanticlienteReturnGeneral=new EstadoAntiClienteParameterReturnGeneral();
			
			this.estadoanticlienteParameterGeneral=new EstadoAntiClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoanticlienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoAntiClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(AnticipoClienteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoAntiClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoanticlienteSessionBean.getEsGuardarRelacionado(),this.estadoanticlienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoAntiClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoanticlienteSessionBean.getEsGuardarRelacionado(),this.estadoanticlienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoAntiCliente=false;
			this.isVisibilidadCeldaDuplicarEstadoAntiCliente=true;
			this.isVisibilidadCeldaCopiarEstadoAntiCliente=true;
			this.isVisibilidadCeldaVerFormEstadoAntiCliente=true;
			this.isVisibilidadCeldaOrdenEstadoAntiCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=false;
			this.isVisibilidadCeldaModificarEstadoAntiCliente=false;
			this.isVisibilidadCeldaActualizarEstadoAntiCliente=false;
			this.isVisibilidadCeldaEliminarEstadoAntiCliente=false;
			this.isVisibilidadCeldaCancelarEstadoAntiCliente=false;
			this.isVisibilidadCeldaGuardarEstadoAntiCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoAntiCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoAntiCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoAntiCliente(false);
			
			this.setPermisosUsuarioEstadoAntiCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoanticlienteSessionBean.getEsGuardarRelacionado() && this.estadoanticlienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoAntiClienteClasesRelacionadas();
			}
			
			if(this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoAntiClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoAntiCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoAntiCliente();
			}
			
			if(!this.isPermisoBusquedaEstadoAntiCliente) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoAntiCliente,this.isPermisoPaginacionMedioEstadoAntiCliente,this.isPermisoPaginacionTodoEstadoAntiCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoAntiClienteConstantesFunciones.getTiposSeleccionarEstadoAntiCliente());
				
				this.tiposColumnasSelect=EstadoAntiClienteConstantesFunciones.getTiposSeleccionarEstadoAntiCliente(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoAntiCliente();				
				//this.tiposRelacionesSelect=EstadoAntiClienteConstantesFunciones.getTiposRelacionesEstadoAntiCliente(true);
				
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
			//if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoAntiCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoAntiCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoAntiCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoAntiCliente() ;
			
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
			
			
			this.anticipoclienteLogic=new AnticipoClienteLogic(); 
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
				estadoanticlienteImplementable= (EstadoAntiClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoAntiClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoanticlienteImplementableHome= (EstadoAntiClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoAntiClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoanticlientes= new ArrayList<EstadoAntiCliente>();
			this.estadoanticlientesEliminados= new ArrayList<EstadoAntiCliente>();
						
			this.isEsNuevoEstadoAntiCliente=false;
			this.esParaAccionDesdeFormularioEstadoAntiCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoAntiCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoAntiCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoAntiClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoAntiCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoAntiCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoAntiCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoAntiCliente();
			}
			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoAntiCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoAntiCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoAntiCliente() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoAntiCliente")) {
				iIndex=this.jInternalFrameDetalleFormEstadoAntiCliente.jTabbedPaneRelacionesEstadoAntiCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoAntiCliente.jTabbedPaneRelacionesEstadoAntiCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();	
				
				

				if(sTitle.equals("Anticipo Clientes")) {
					if(!AnticipoClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoAntiCliente();

						this.cargarParteTabPanelRelacionadaAnticipoCliente(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoAntiCliente();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaAnticipoCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoAntiCliente.cargarSessionConBeanSwingJInternalFrameAnticipoCliente(false,true,iIndex);
		this.jButtonAnticipoClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaAnticipoCliente();

		//this.jTabbedPaneRelacionesEstadoAntiCliente.updateUI();
		//this.jTabbedPaneRelacionesEstadoAntiCliente.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoAntiCliente.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("AnticipoCliente")) {
				int row=this.jTableDatosEstadoAntiCliente.getSelectedRow();
				jButtonAnticipoClienteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Anticipo Cliente")) {

					if(this.isTienePermisosAnticipoCliente && this.estadoanticlienteConstantesFunciones.mostrarAnticipoClienteEstadoAntiCliente && !EstadoAntiClienteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Anticipo Clientes"+"("+AnticipoClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Anticipo Clientes");

						if(estadoanticlienteConstantesFunciones.resaltarAnticipoClienteEstadoAntiCliente!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoanticlienteConstantesFunciones.resaltarAnticipoClienteEstadoAntiCliente);
						}

						jmenuItem.setEnabled(this.estadoanticlienteConstantesFunciones.activarAnticipoClienteEstadoAntiCliente);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"AnticipoCliente"));

						

						this.jInternalFrameDetalleFormEstadoAntiCliente.jmenuDetalleEstadoAntiCliente.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoAntiCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoAntiCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoAntiCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoAntiClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoAntiCliente();
		
		this.cargarCombosFrameForeignKeyEstadoAntiCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoAntiCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoAntiCliente();
		}
	}
	
	
	
	public void jButtonNuevoEstadoAntiClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			
			
			if(jTableDatosEstadoAntiCliente.getRowCount()>=1) {
				jTableDatosEstadoAntiCliente.removeRowSelectionInterval(0, jTableDatosEstadoAntiCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoAntiCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoAntiCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoAntiCliente(true);			
			//this.estadoanticliente=new EstadoAntiCliente();
			//this.estadoanticliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoAntiCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoAntiCliente() ;
			
			if(EstadoAntiClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoAntiCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoanticliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);				
			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			
			if(this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoAntiCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoAntiClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoAntiCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoAntiCliente.getSelectedRows().length;			
			}
			
			estadoanticlientesSeleccionados=this.getEstadoAntiClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoAntiCliente--;			
				//EstadoAntiCliente estadoanticlienteAux= new EstadoAntiCliente();			
				//estadoanticlienteAux.setId(this.iIdNuevoEstadoAntiCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoAntiCliente estadoanticlienteOrigen=new EstadoAntiCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoAntiCliente estadoanticlienteOrigen : estadoanticlientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoanticlienteOrigen =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoanticlienteOrigen =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoAntiCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoanticliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoAntiCliente(estadoanticlienteOrigen,this.estadoanticliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoanticlienteLogic.getEstadoAntiClientes().add(this.estadoanticlienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoanticlientes.add(this.estadoanticlienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
				
				this.jTableDatosEstadoAntiCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoAntiCliente(), this.getIndiceNuevoEstadoAntiCliente());
				
				int iLastRow =  this.jTableDatosEstadoAntiCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoAntiCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoAntiCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();									
		
			EstadoAntiCliente estadoanticlienteOrigen=new EstadoAntiCliente();
			EstadoAntiCliente estadoanticlienteDestino=new EstadoAntiCliente();
				
			estadoanticlientesSeleccionados=this.getEstadoAntiClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoAntiCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoanticlientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoAntiCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoanticlienteOrigen =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoanticlienteOrigen =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoanticlienteDestino =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoanticlienteDestino =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoanticlienteOrigen =estadoanticlientesSeleccionados.get(0);
				estadoanticlienteDestino =estadoanticlientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoAntiCliente(estadoanticlienteOrigen,estadoanticlienteDestino,true,false);
				
				estadoanticlienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoanticlienteDestino,estadoanticlienteLogic.getEstadoAntiClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoanticlienteDestino,estadoanticlientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
				
				//this.jTableDatosEstadoAntiCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoAntiCliente(), this.getIndiceNuevoEstadoAntiCliente());
				
				int iLastRow =  this.jTableDatosEstadoAntiCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoAntiCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoAntiCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoAntiCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoAntiCliente.isVisible();
			
			
			this.jPanelParametrosReportesEstadoAntiCliente.setVisible(!isVisible);
			this.jPanelPaginacionEstadoAntiCliente.setVisible(!isVisible);
			this.jPanelAccionesEstadoAntiCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoAntiCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoAntiCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoAntiCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoAntiCliente();
			
			this.abrirFrameOrderByEstadoAntiCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoAntiCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoAntiCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoAntiCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoAntiCliente.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoAntiCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoAntiCliente.setSize(this.jInternalFrameDetalleFormEstadoAntiCliente.iWidthFormulario,this.jInternalFrameDetalleFormEstadoAntiCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoAntiCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoAntiCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoAntiCliente.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoAntiCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoAntiCliente.jContentPaneDetalleEstadoAntiCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoAntiCliente.jTabbedPaneRelacionesEstadoAntiCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoAntiCliente.jContentPaneDetalleEstadoAntiCliente.getWidth(),EstadoAntiClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoAntiCliente.jTabbedPaneRelacionesEstadoAntiCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoAntiCliente.jContentPaneDetalleEstadoAntiCliente.getWidth(),EstadoAntiClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoAntiCliente.jTabbedPaneRelacionesEstadoAntiCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoAntiCliente.jContentPaneDetalleEstadoAntiCliente.getWidth(),EstadoAntiClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(AnticipoClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaAnticipoCliente();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoAntiCliente.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoAntiCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoAntiCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoAntiCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoAntiCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoAntiCliente,false,this);
				} else {
					this.jInternalFrameOrderByEstadoAntiCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoAntiCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoAntiCliente);
				this.jInternalFrameOrderByEstadoAntiCliente.setVisible(false);
				this.jInternalFrameOrderByEstadoAntiCliente.setSelected(false);
				
				this.jInternalFrameOrderByEstadoAntiCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoAntiCliente"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoAntiCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoAntiCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoAntiCliente==null) {
				
				this.jInternalFrameImportacionEstadoAntiCliente=new ImportacionJInternalFrame(EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoAntiCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoAntiCliente);
				this.jInternalFrameImportacionEstadoAntiCliente.setVisible(false);
				this.jInternalFrameImportacionEstadoAntiCliente.setSelected(false);


				this.jInternalFrameImportacionEstadoAntiCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoAntiCliente"));
				this.jInternalFrameImportacionEstadoAntiCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoAntiCliente"));
				this.jInternalFrameImportacionEstadoAntiCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoAntiCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoAntiCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoAntiCliente==null) {
				this.jInternalFrameReporteDinamicoEstadoAntiCliente=new ReporteDinamicoJInternalFrame(EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoAntiCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoAntiCliente);
				this.jInternalFrameReporteDinamicoEstadoAntiCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoAntiCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoAntiCliente"));
				this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoAntiCliente"));
				this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoAntiCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoAntiCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaAnticipoCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.jScrollPanelDatosAnticipoCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoAntiCliente.jContentPaneDetalleEstadoAntiCliente.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.jScrollPanelDatosAnticipoCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.jScrollPanelDatosAnticipoCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.jScrollPanelDatosAnticipoCliente.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoAntiCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoAntiCliente);
			
	       	this.jInternalFrameDetalleFormEstadoAntiCliente.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoAntiCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoAntiCliente.dispose();
			//this.jInternalFrameDetalleFormEstadoAntiCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoAntiCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoAntiCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoAntiCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoAntiCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoAntiCliente.setVisible(true);
	        this.jInternalFrameImportacionEstadoAntiCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoAntiCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoAntiCliente.setVisible(true);
	        this.jInternalFrameOrderByEstadoAntiCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoAntiCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoAntiCliente.setVisible(false);
	        this.jInternalFrameOrderByEstadoAntiCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoAntiCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoAntiCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoAntiCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoAntiCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoAntiCliente.setVisible(false);
	        this.jInternalFrameImportacionEstadoAntiCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoAntiCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoAntiCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoAntiCliente(true);
			//this.isEsNuevoEstadoAntiCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoAntiCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoAntiCliente(false) ;
			
			if(estadoanticlienteSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.getEsGuardarRelacionado() && AnticipoClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAnticipoClienteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoAntiClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoAntiCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoAntiCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoAntiClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoAntiCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoAntiCliente(true);
			//this.isEsNuevoEstadoAntiCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoanticliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoAntiCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoAntiCliente(false) ;
			
			if(EstadoAntiClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoAntiCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoAntiCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoAntiCliente(false);
			
			//if(!this.isEsNuevoEstadoAntiCliente) {								
				int intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoAntiCliente(this.estadoanticliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);
				
			}
			
			if(this.permiteMantenimiento(this.estadoanticliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoAntiCliente=true;
					this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
					this.isEsNuevoEstadoAntiCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoAntiCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoAntiCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoAntiCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoAntiCliente(false);
				
				this.habilitarDeshabilitarControlesEstadoAntiCliente(false);
			
												
				
				if(EstadoAntiClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoAntiCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoAntiClienteActionPerformed(evt,estadoanticlienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoAntiCliente(this.estadoanticliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoAntiCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoanticlienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoanticliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoAntiCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAntiCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				this.estadoanticliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				this.estadoanticliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoanticliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoAntiClienteModel) this.jTableDatosEstadoAntiCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoAntiCliente=true;
				this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
				this.isEsNuevoEstadoAntiCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoAntiCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoAntiCliente(false);
				
				this.habilitarDeshabilitarControlesEstadoAntiCliente(false);
				
				
				
				if(EstadoAntiClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoAntiCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoAntiCliente.getRowCount()>=1) {
				jTableDatosEstadoAntiCliente.removeRowSelectionInterval(0, jTableDatosEstadoAntiCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoAntiCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoAntiCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoAntiCliente(false) ;
			
			this.isEsNuevoEstadoAntiCliente=false;
			
			if(EstadoAntiClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoAntiCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoAntiCliente(false);
				
				//SI ES MANUAL
				if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoAntiCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoAntiCliente--;			
			//EstadoAntiCliente estadoanticlienteAux= new EstadoAntiCliente();			
			//estadoanticlienteAux.setId(this.iIdNuevoEstadoAntiCliente);
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoAntiCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);
			
			this.estadoanticliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoanticlienteLogic.getEstadoAntiClientes().add(this.estadoanticlienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoanticlientes.add(this.estadoanticlienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
			
			this.jTableDatosEstadoAntiCliente.setRowSelectionInterval(this.getIndiceNuevoEstadoAntiCliente(), this.getIndiceNuevoEstadoAntiCliente());
			
			int iLastRow =  this.jTableDatosEstadoAntiCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoAntiCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoAntiCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoAntiCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoAntiCliente(false);
			
			//SI ES MANUAL
			if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoAntiCliente();
			}
			
			//this.abrirFrameTreeEstadoAntiCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Anti ClienteS ?", "MANTENIMIENTO DE Estado Anti Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoAntiCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoAntiCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoanticlienteReturnGeneral=estadoanticlienteLogic.procesarImportacionEstadoAntiClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoanticlienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoAntiClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoAntiCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoAntiCliente.setFileImportacion(this.jInternalFrameImportacionEstadoAntiCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoAntiCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoAntiCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoAntiCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoAntiCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();		

		estadoanticlientesSeleccionados=this.getEstadoAntiClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoAntiClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoAntiClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoAntiClientes("Todos",estadoanticlientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Anti Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoAntiClienteConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoAntiClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoAntiClienteConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoAntiClienteConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();		
		
		estadoanticlientesSeleccionados=this.getEstadoAntiClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoanticliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoAntiClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoAntiClienteConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoAntiClienteConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoAntiCliente estadoanticliente:estadoanticlientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoanticliente.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoAntiCliente estadoanticliente:estadoanticlientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoanticliente.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoAntiCliente(row);				
			//	iRow++;
			//}				
			
			//for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoAntiCliente(estadoanticlienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Anti Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoanticlienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoAntiCliente(false);
			
			//SI ES MANUAL
			if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoAntiCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoAntiCliente(false);
			
			//SI ES MANUAL
			if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoAntiCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoAntiClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoAntiCliente(false);
			
			//SI ES MANUAL
			if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoAntiCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoanticlienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoAntiCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoAntiCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoAntiCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoAntiCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoAntiCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoAntiCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoAntiCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoAntiCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoAntiCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoAntiCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoAntiCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoAntiCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoAntiCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoAntiCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoAntiCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoAntiCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoAntiCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoAntiCliente();
		
		this.inicializarActualizarBindingBotonesManualEstadoAntiCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoAntiCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoAntiCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoAntiCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoAntiCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoAntiCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoAntiCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoAntiCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoAntiCliente.jCheckBoxPostAccionNuevoEstadoAntiCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoAntiCliente.jCheckBoxPostAccionSinCerrarEstadoAntiCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoAntiCliente.jCheckBoxPostAccionSinMensajeEstadoAntiCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoAntiCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoAntiCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoAntiCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
				this.jInternalFrameDetalleFormEstadoAntiCliente.jCheckBoxPostAccionNuevoEstadoAntiCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoAntiCliente.jCheckBoxPostAccionSinCerrarEstadoAntiCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoAntiCliente.jCheckBoxPostAccionSinMensajeEstadoAntiCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoAntiCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoAntiCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoAntiCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoAntiCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoAntiCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoAntiCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoAntiCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoAntiCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoAntiCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoAntiCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoAntiCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoAntiCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoAntiCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoAntiCliente() throws Exception {
		try	{
			if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoAntiCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoAntiCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoAntiCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoAntiCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoAntiCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoAntiCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoAntiCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoAntiCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoAntiCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoAntiCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoAntiCliente.addItem(reporte);
			}
			
			
			if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoAntiCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoAntiCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoAntiCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoAntiCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoAntiCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoAntiCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoAntiCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoAntiCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoAntiCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoAntiCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoAntiCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoAntiCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoAntiCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoAntiCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoAntiCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoAntiCliente(Boolean esInicializar) throws Exception {				
		if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoAntiCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoAntiCliente() throws Exception {
		this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoAntiCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoAntiClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoAntiClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoAntiClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAntiClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoAntiClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoAntiClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoAntiCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoanticlienteLogic.getEstadoAntiClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoanticlientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoAntiCliente.setModel(new EstadoAntiClienteModel(this.estadoanticlienteLogic.getEstadoAntiClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoAntiCliente.setModel(new EstadoAntiClienteModel(this.estadoanticlientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoAntiCliente!=null && this.jInternalFrameOrderByEstadoAntiCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoAntiCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoAntiCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAntiCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoAntiClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO,estadoanticlienteConstantesFunciones.resaltarSeleccionarEstadoAntiCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoAntiClienteConstantesFunciones.SCLASSWEBTITULO,estadoanticlienteConstantesFunciones.resaltarSeleccionarEstadoAntiCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoAntiCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAntiCliente,EstadoAntiClienteConstantesFunciones.LABEL_ID));

		if(this.estadoanticlienteConstantesFunciones.mostraridEstadoAntiCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoAntiClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoanticlienteConstantesFunciones.resaltaridEstadoAntiCliente,this.estadoanticlienteConstantesFunciones.activaridEstadoAntiCliente,this,true,"idEstadoAntiCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoanticlienteConstantesFunciones.resaltaridEstadoAntiCliente,this.estadoanticlienteConstantesFunciones.activaridEstadoAntiCliente,this,true,"idEstadoAntiCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoAntiCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAntiCliente,EstadoAntiClienteConstantesFunciones.LABEL_CODIGO));

		if(this.estadoanticlienteConstantesFunciones.mostrarcodigoEstadoAntiCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoAntiClienteConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoanticlienteConstantesFunciones.resaltarcodigoEstadoAntiCliente,this.estadoanticlienteConstantesFunciones.activarcodigoEstadoAntiCliente,this,true,"codigoEstadoAntiCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoanticlienteConstantesFunciones.resaltarcodigoEstadoAntiCliente,this.estadoanticlienteConstantesFunciones.activarcodigoEstadoAntiCliente,this,true,"codigoEstadoAntiCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoAntiClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoAntiCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoAntiCliente,EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoanticlienteConstantesFunciones.mostrarnombreEstadoAntiCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoanticlienteConstantesFunciones.resaltarnombreEstadoAntiCliente,this.estadoanticlienteConstantesFunciones.activarnombreEstadoAntiCliente,this,true,"nombreEstadoAntiCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoanticlienteConstantesFunciones.resaltarnombreEstadoAntiCliente,this.estadoanticlienteConstantesFunciones.activarnombreEstadoAntiCliente,this,true,"nombreEstadoAntiCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoAntiClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosAnticipoCliente && this.estadoanticlienteConstantesFunciones.mostrarAnticipoClienteEstadoAntiCliente && !EstadoAntiClienteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Anticipo Clientes");
				tableColumn.setHeaderValue("Anticipo Clientes");
				tableColumn.setCellRenderer(new AnticipoClienteTableCell(estadoanticlienteConstantesFunciones.resaltarAnticipoClienteEstadoAntiCliente,this,this.estadoanticlienteConstantesFunciones.activarAnticipoClienteEstadoAntiCliente));
				tableColumn.setCellEditor(new AnticipoClienteTableCell(estadoanticlienteConstantesFunciones.resaltarAnticipoClienteEstadoAntiCliente,this,this.estadoanticlienteConstantesFunciones.activarAnticipoClienteEstadoAntiCliente));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoAntiCliente.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoanticlienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoanticlienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoAntiCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoanticlienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoanticlienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoAntiCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoAntiCliente && this.isPermisoGuardarCambiosEstadoAntiCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoanticlienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoanticlienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoAntiCliente.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoAntiCliente.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoAntiCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoAntiCliente && this.isPermisoGuardarCambiosEstadoAntiCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoAntiCliente && this.isPermisoGuardarCambiosEstadoAntiCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoAntiCliente.moveColumn(this.jTableDatosEstadoAntiCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoAntiCliente.moveColumn(this.jTableDatosEstadoAntiCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoAntiCliente.moveColumn(this.jTableDatosEstadoAntiCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoAntiCliente.moveColumn(this.jTableDatosEstadoAntiCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoAntiCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoAntiCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoAntiCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoAntiCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoAntiCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoAntiCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoAntiCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoAntiCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoanticlienteLogic.getEstadoAntiClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoanticlientes.size()-1;
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
		//this.jTableDatosEstadoAntiCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoAntiCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoAntiCliente();
			
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
				
				//this.isEsNuevoEstadoAntiCliente=false;
					
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			
				if(this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoAntiCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoAntiCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoanticliente.getsType().equals("DUPLICADO")
				   || this.estadoanticliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoAntiCliente=true;
				
				} else {
					this.isEsNuevoEstadoAntiCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoanticliente.getId()>=0 && !this.estadoanticliente.getIsNew()) {						
						this.isEsNuevoEstadoAntiCliente=false;
						
					} else {
						this.isEsNuevoEstadoAntiCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoAntiCliente(esRelaciones);						
				
				this.seleccionarEstadoAntiCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoanticliente.getId()<0) {
					this.isEsNuevoEstadoAntiCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoAntiCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoAntiCliente(evt,rowIndex);
				}	
				
				if(this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoAntiCliente: " + this.dDif); 
					}
				}								
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoAntiCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoanticliente)) {
					if(this.estadoanticliente.getId()>0) {
						this.estadoanticliente.setIsDeleted(true);
						
						this.estadoanticlientesEliminados.add(this.estadoanticliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoanticlienteLogic.getEstadoAntiClientes().remove(this.estadoanticliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoanticlientes.remove(this.estadoanticliente);				
					}
					
					
					((EstadoAntiClienteModel) this.jTableDatosEstadoAntiCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoAntiCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoAntiCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoAntiCliente) {
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoAntiCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoAntiCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoAntiCliente(this.estadoanticliente);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoAntiCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoAntiCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoAntiCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoAntiCliente(EstadoAntiCliente estadoanticliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoAntiCliente(estadoanticliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoAntiCliente(EstadoAntiCliente estadoanticliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoAntiCliente(estadoanticliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoAntiCliente(estadoanticliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoAntiCliente(estadoanticliente);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoAntiCliente(EstadoAntiCliente estadoanticliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelidEstadoAntiCliente.setText(estadoanticliente.getId().toString());
			this.jInternalFrameDetalleFormEstadoAntiCliente.jTextFieldcodigoEstadoAntiCliente.setText(estadoanticliente.getcodigo());
			this.jInternalFrameDetalleFormEstadoAntiCliente.jTextAreanombreEstadoAntiCliente.setText(estadoanticliente.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoAntiCliente estadoanticlienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoanticlienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoAntiCliente estadoanticlienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoanticlienteLocal=this.estadoanticliente;
			} else {
				estadoanticlienteLocal=this.estadoanticlienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoanticlienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoAntiCliente(estadoanticlienteLocal,true);
					
					if(estadoanticlienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoanticlienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoanticlienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoAntiCliente(EstadoAntiCliente estadoanticliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoAntiCliente(estadoanticliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(estadoanticliente);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoAntiCliente(EstadoAntiCliente estadoanticliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoAntiCliente(estadoanticliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoAntiCliente(EstadoAntiCliente estadoanticliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelidEstadoAntiCliente.getText()==null || this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelidEstadoAntiCliente.getText()=="" || this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelidEstadoAntiCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelidEstadoAntiCliente.setText("0");
			}

			if(conColumnasBase) {estadoanticliente.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelidEstadoAntiCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoAntiClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelIdEstadoAntiCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoanticliente.setcodigo(this.jInternalFrameDetalleFormEstadoAntiCliente.jTextFieldcodigoEstadoAntiCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoAntiClienteConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelcodigoEstadoAntiCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoanticliente.setnombre(this.jInternalFrameDetalleFormEstadoAntiCliente.jTextAreanombreEstadoAntiCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelnombreEstadoAntiCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoAntiCliente(EstadoAntiCliente estadoanticlienteBean,EstadoAntiCliente estadoanticliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoAntiCliente(EstadoAntiCliente estadoanticlienteOrigen,EstadoAntiCliente estadoanticliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoanticlienteOrigen.getId()!=null && !estadoanticlienteOrigen.getId().equals(0L))) {estadoanticliente.setId(estadoanticlienteOrigen.getId());}}
			if(conDefault || (!conDefault && estadoanticlienteOrigen.getcodigo()!=null && !estadoanticlienteOrigen.getcodigo().equals(""))) {estadoanticliente.setcodigo(estadoanticlienteOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadoanticlienteOrigen.getnombre()!=null && !estadoanticlienteOrigen.getnombre().equals(""))) {estadoanticliente.setnombre(estadoanticlienteOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoAntiCliente(EstadoAntiCliente estadoanticliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelidEstadoAntiCliente.setText(estadoanticliente.getId().toString());
			this.jInternalFrameDetalleFormEstadoAntiCliente.jTextFieldcodigoEstadoAntiCliente.setText(estadoanticliente.getcodigo());
			this.jInternalFrameDetalleFormEstadoAntiCliente.jTextAreanombreEstadoAntiCliente.setText(estadoanticliente.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoAntiCliente(EstadoAntiClienteBean estadoanticlienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelidEstadoAntiCliente.setText(estadoanticlienteBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoAntiCliente.jTextFieldcodigoEstadoAntiCliente.setText(estadoanticlienteBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoAntiCliente.jTextAreanombreEstadoAntiCliente.setText(estadoanticlienteBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoAntiCliente(EstadoAntiClienteParameterReturnGeneral estadoanticlienteReturnGeneral,EstadoAntiClienteBean estadoanticlienteBean,Boolean conDefault) throws Exception { 
		try {
			EstadoAntiCliente estadoanticlienteLocal=new EstadoAntiCliente();
			
			estadoanticlienteLocal=estadoanticlienteReturnGeneral.getEstadoAntiCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoanticlienteLocal.getId()!=null && !estadoanticlienteLocal.getId().equals(0L))) {estadoanticlienteBean.setId(estadoanticlienteLocal.getId());}}
			if(conDefault || (!conDefault && estadoanticlienteLocal.getcodigo()!=null && !estadoanticlienteLocal.getcodigo().equals(""))) {estadoanticlienteBean.setcodigo(estadoanticlienteLocal.getcodigo());}
			if(conDefault || (!conDefault && estadoanticlienteLocal.getnombre()!=null && !estadoanticlienteLocal.getnombre().equals(""))) {estadoanticlienteBean.setnombre(estadoanticlienteLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoAntiClienteGenerico(Long idEstadoAntiClienteSeleccionado,JComboBox jComboBoxEstadoAntiCliente,List<EstadoAntiCliente> estadoanticlientesLocal)throws Exception {
		try {
			EstadoAntiCliente  estadoanticlienteTemp=null;

			for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientesLocal) {
				if(estadoanticlienteAux.getId()!=null && estadoanticlienteAux.getId().equals(idEstadoAntiClienteSeleccionado)) {
					estadoanticlienteTemp=estadoanticlienteAux;
					break;
				}
			}

			jComboBoxEstadoAntiCliente.setSelectedItem(estadoanticlienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoAntiClienteGenerico(JComboBox jComboBoxEstadoAntiCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoAntiCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoAntiCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoAntiCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoAntiCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoAntiCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoAntiCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoAntiCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoAntiCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoAntiCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoAntiCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("AnticipoCliente")) {
			jButtonAnticipoClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoanticliente=(EstadoAntiCliente) estadoanticlienteLogic.getEstadoAntiClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoanticliente =(EstadoAntiCliente) estadoanticlientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoAntiCliente estadoanticlienteRow=new EstadoAntiCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoanticlienteRow=(EstadoAntiCliente) estadoanticlienteLogic.getEstadoAntiClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoanticlienteRow=(EstadoAntiCliente) estadoanticlientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonAnticipoClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoAntiCliente estadoanticliente) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoanticliente = (EstadoAntiCliente)this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoanticliente = (EstadoAntiCliente)this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoanticliente!=null) {
						this.estadoanticliente = estadoanticliente;
					} else {
						this.estadoanticliente = new EstadoAntiCliente();
					}
				}

				if(this.isTienePermisosAnticipoCliente && this.permiteMantenimiento(this.estadoanticliente)) {
					AnticipoClienteBeanSwingJInternalFrame anticipoclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFramePopup=new AnticipoClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						anticipoclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFramePopup;
					} else {
						anticipoclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame;
					}

					List<EstadoAntiCliente> estadoanticlientes=new ArrayList<EstadoAntiCliente>();
					estadoanticlientes.add(this.estadoanticliente);
					if(!esRelacionado) {
						//anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.setConGuardarRelaciones(false);
						//anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					anticipoclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoAntiCliente.cargarAnticipoClienteBeanSwingJInternalFrame(estadoanticlientes,this.estadoanticliente,anticipoclienteBeanSwingJInternalFrame,/*conInicializar,*/anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.getConGuardarRelaciones(),anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.getEsGuardarRelacionado());
					anticipoclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						anticipoclienteBeanSwingJInternalFrame.actualizarEstadoPanelsAnticipoCliente("no_relacionado");

						anticipoclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(AnticipoClienteConstantesFunciones.ITAMANIOFILATABLA + (AnticipoClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						anticipoclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoAntiCliente=(TitledBorder)this.jScrollPanelDatosEstadoAntiCliente.getBorder();
						TitledBorder titledBorderAnticipoCliente=(TitledBorder)anticipoclienteBeanSwingJInternalFrame.jScrollPanelDatosAnticipoCliente.getBorder();

						titledBorderAnticipoCliente.setTitle(titledBorderEstadoAntiCliente.getTitle() + " -> Anticipo Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,anticipoclienteBeanSwingJInternalFrame);
						}

						anticipoclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(anticipoclienteBeanSwingJInternalFrame);

						anticipoclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Anticipo Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoAntiCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoAntiCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoAntiCliente && this.isPermisoNuevoEstadoAntiCliente));			
			this.jButtonDuplicarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoAntiCliente && this.isPermisoDuplicarEstadoAntiCliente));			
			this.jButtonCopiarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoAntiCliente && this.isPermisoCopiarEstadoAntiCliente));
			this.jButtonVerFormEstadoAntiCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoAntiCliente && this.isPermisoVerFormEstadoAntiCliente));
			
			this.jButtonAbrirOrderByEstadoAntiCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoAntiCliente && this.isPermisoOrdenEstadoAntiCliente));			
			
			this.jButtonNuevoRelacionesEstadoAntiCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente && this.isPermisoNuevoEstadoAntiCliente));			
			this.jButtonNuevoGuardarCambiosEstadoAntiCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoAntiCliente && this.isPermisoNuevoEstadoAntiCliente && this.isPermisoGuardarCambiosEstadoAntiCliente));
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonModificarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaModificarEstadoAntiCliente && this.isPermisoActualizarEstadoAntiCliente));	
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonActualizarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoAntiCliente && this.isPermisoActualizarEstadoAntiCliente));	
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonEliminarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoAntiCliente && this.isPermisoEliminarEstadoAntiCliente));
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonCancelarEstadoAntiCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoAntiCliente);							
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonGuardarCambiosEstadoAntiCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoAntiCliente && this.isPermisoGuardarCambiosEstadoAntiCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoAntiCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente && this.isPermisoGuardarCambiosEstadoAntiCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoAntiCliente && this.isPermisoNuevoEstadoAntiCliente));						
			this.jButtonDuplicarToolBarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoAntiCliente && this.isPermisoDuplicarEstadoAntiCliente));						
			this.jButtonCopiarToolBarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoAntiCliente && this.isPermisoCopiarEstadoAntiCliente));			
			this.jButtonVerFormToolBarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoAntiCliente && this.isPermisoVerFormEstadoAntiCliente));			
			this.jButtonAbrirOrderByToolBarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoAntiCliente && this.isPermisoOrdenEstadoAntiCliente));
			this.jButtonNuevoRelacionesToolBarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente && this.isPermisoNuevoEstadoAntiCliente));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoAntiCliente && this.isPermisoNuevoEstadoAntiCliente && this.isPermisoGuardarCambiosEstadoAntiCliente));			
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonModificarToolBarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaModificarEstadoAntiCliente && this.isPermisoActualizarEstadoAntiCliente));	
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonActualizarToolBarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoAntiCliente  && this.isPermisoActualizarEstadoAntiCliente));	
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonEliminarToolBarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoAntiCliente && this.isPermisoEliminarEstadoAntiCliente));
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonCancelarToolBarEstadoAntiCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoAntiCliente);				
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonGuardarCambiosToolBarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoAntiCliente && this.isPermisoGuardarCambiosEstadoAntiCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente && this.isPermisoGuardarCambiosEstadoAntiCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoAntiCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoAntiCliente && this.isPermisoNuevoEstadoAntiCliente));			
			this.jMenuItemDuplicarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaDuplicarEstadoAntiCliente && this.isPermisoDuplicarEstadoAntiCliente));			
			this.jMenuItemCopiarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaCopiarEstadoAntiCliente && this.isPermisoCopiarEstadoAntiCliente));			
			this.jMenuItemVerFormEstadoAntiCliente.setVisible((this.isVisibilidadCeldaVerFormEstadoAntiCliente && this.isPermisoVerFormEstadoAntiCliente));			
			this.jMenuItemAbrirOrderByEstadoAntiCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoAntiCliente && this.isPermisoOrdenEstadoAntiCliente));			
			//this.jMenuItemMostrarOcultarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoAntiCliente && this.isPermisoOrdenEstadoAntiCliente));
			this.jMenuItemDetalleAbrirOrderByEstadoAntiCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoAntiCliente && this.isPermisoOrdenEstadoAntiCliente));			
			//this.jMenuItemDetalleMostrarOcultarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaOrdenEstadoAntiCliente && this.isPermisoOrdenEstadoAntiCliente));			
			this.jMenuItemNuevoRelacionesEstadoAntiCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente && this.isPermisoNuevoEstadoAntiCliente));			
			this.jMenuItemNuevoGuardarCambiosEstadoAntiCliente.setVisible((this.isVisibilidadCeldaNuevoEstadoAntiCliente && this.isPermisoNuevoEstadoAntiCliente && this.isPermisoGuardarCambiosEstadoAntiCliente));									
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemModificarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaModificarEstadoAntiCliente && this.isPermisoActualizarEstadoAntiCliente));	
			this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemActualizarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaActualizarEstadoAntiCliente && this.isPermisoActualizarEstadoAntiCliente));	
			this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemEliminarEstadoAntiCliente.setVisible((this.isVisibilidadCeldaEliminarEstadoAntiCliente && this.isPermisoEliminarEstadoAntiCliente));
			this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemCancelarEstadoAntiCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoAntiCliente);				
			}
			
			this.jMenuItemGuardarCambiosEstadoAntiCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoAntiCliente && this.isPermisoGuardarCambiosEstadoAntiCliente));						
			this.jMenuItemGuardarCambiosTablaEstadoAntiCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente && this.isPermisoGuardarCambiosEstadoAntiCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoAntiCliente=this.jButtonNuevoEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoAntiCliente=this.jButtonDuplicarEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaCopiarEstadoAntiCliente=this.jButtonCopiarEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaVerFormEstadoAntiCliente=this.jButtonVerFormEstadoAntiCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoAntiCliente=this.jButtonAbrirOrderByEstadoAntiCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=this.jButtonNuevoRelacionesEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaModificarEstadoAntiCliente=this.jButtonModificarEstadoAntiCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
			this.isVisibilidadCeldaActualizarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonActualizarEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonEliminarEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonCancelarEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaGuardarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonGuardarCambiosEstadoAntiCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=this.jButtonGuardarCambiosTablaEstadoAntiCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoAntiCliente=this.jButtonNuevoToolBarEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=this.jButtonNuevoRelacionesToolBarEstadoAntiCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
			this.isVisibilidadCeldaModificarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonModificarToolBarEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaActualizarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonActualizarToolBarEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonEliminarToolBarEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonCancelarToolBarEstadoAntiCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoAntiCliente=this.jButtonGuardarCambiosToolBarEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=this.jButtonGuardarCambiosTablaToolBarEstadoAntiCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoAntiCliente=this.jMenuItemNuevoEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=this.jMenuItemNuevoRelacionesEstadoAntiCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
			this.isVisibilidadCeldaModificarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemModificarEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaActualizarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemActualizarEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaEliminarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemEliminarEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaCancelarEstadoAntiCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemCancelarEstadoAntiCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoAntiCliente=this.jMenuItemGuardarCambiosEstadoAntiCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=this.jMenuItemGuardarCambiosTablaEstadoAntiCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoAntiCliente(Boolean esInicializar) {
		if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoAntiCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoAntiCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoAntiCliente() {
		this.jButtonNuevoEstadoAntiCliente.setVisible(this.isPermisoNuevoEstadoAntiCliente);			
		this.jButtonDuplicarEstadoAntiCliente.setVisible(this.isPermisoDuplicarEstadoAntiCliente);			
		this.jButtonCopiarEstadoAntiCliente.setVisible(this.isPermisoCopiarEstadoAntiCliente);			
		this.jButtonVerFormEstadoAntiCliente.setVisible(this.isPermisoVerFormEstadoAntiCliente);			
		
		this.jButtonAbrirOrderByEstadoAntiCliente.setVisible(this.isPermisoOrdenEstadoAntiCliente);					
		
		this.jButtonNuevoRelacionesEstadoAntiCliente.setVisible(this.isPermisoNuevoEstadoAntiCliente);			
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonModificarEstadoAntiCliente.setVisible(this.isPermisoActualizarEstadoAntiCliente);	
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonActualizarEstadoAntiCliente.setVisible(this.isPermisoActualizarEstadoAntiCliente);	
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonEliminarEstadoAntiCliente.setVisible(this.isPermisoEliminarEstadoAntiCliente);
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonCancelarEstadoAntiCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoAntiCliente);						
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonGuardarCambiosEstadoAntiCliente.setVisible(this.isPermisoGuardarCambiosEstadoAntiCliente);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoAntiCliente.setVisible(this.isPermisoActualizarEstadoAntiCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoAntiCliente() {
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonModificarEstadoAntiCliente.setVisible(this.isPermisoActualizarEstadoAntiCliente);	
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonActualizarEstadoAntiCliente.setVisible(this.isPermisoActualizarEstadoAntiCliente);	
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonEliminarEstadoAntiCliente.setVisible(this.isPermisoEliminarEstadoAntiCliente);
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonCancelarEstadoAntiCliente.setVisible(this.isVisibilidadCeldaCancelarEstadoAntiCliente);							
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonGuardarCambiosEstadoAntiCliente.setVisible((this.isVisibilidadCeldaGuardarEstadoAntiCliente && this.isPermisoGuardarCambiosEstadoAntiCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoAntiCliente() {
		if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoAntiCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoAntiCliente() {
	}
	
	public void jTableDatosEstadoAntiClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoAntiCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoAntiClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoAntiCliente(this.getestadoanticliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoanticliente==null) {
						this.estadoanticliente = new EstadoAntiCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoAntiCliente(this.estadoanticliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);
				}

				if(this.estadoanticliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoanticliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoAntiCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoAntiClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoAntiCliente(this.getestadoanticliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoanticliente==null) {
						this.estadoanticliente = new EstadoAntiCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoAntiCliente(this.estadoanticliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);
				}

				if(this.estadoanticliente.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadoanticliente.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoAntiCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoAntiClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoAntiCliente(this.getestadoanticliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoanticliente==null) {
						this.estadoanticliente = new EstadoAntiCliente();
					}

					this.setVariablesFormularioToObjetoActualEstadoAntiCliente(this.estadoanticliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);
				}

				if(this.estadoanticliente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoanticliente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoAntiCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoAntiCliente() {
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoAntiCliente.dispose();
			this.jInternalFrameDetalleFormEstadoAntiCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoAntiCliente!=null) {
			this.jInternalFrameReporteDinamicoEstadoAntiCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoAntiCliente.dispose();
			this.jInternalFrameReporteDinamicoEstadoAntiCliente=null;
		}
		
		if(this.jInternalFrameImportacionEstadoAntiCliente!=null) {
			this.jInternalFrameImportacionEstadoAntiCliente.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoAntiCliente.dispose();
			this.jInternalFrameImportacionEstadoAntiCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoAntiCliente();
			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoAntiCliente")) {
				jButtonNuevoEstadoAntiClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoAntiCliente")) {
				jButtonDuplicarEstadoAntiClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoAntiCliente")) {
				jButtonCopiarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoAntiCliente")) {
				jButtonVerFormEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoAntiCliente")) {
				jButtonNuevoEstadoAntiClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoAntiCliente")) {
				jButtonDuplicarEstadoAntiClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoAntiCliente")) {
				jButtonNuevoEstadoAntiClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoAntiCliente")) {
				jButtonDuplicarEstadoAntiClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoAntiCliente")) {
				jButtonNuevoEstadoAntiClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoAntiCliente")) {
				jButtonNuevoEstadoAntiClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoAntiCliente")) {
				jButtonNuevoEstadoAntiClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoAntiCliente")) {
				jButtonModificarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoAntiCliente")) {
				jButtonModificarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoAntiCliente")) {
				jButtonModificarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoAntiCliente")) {
				jButtonActualizarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoAntiCliente")) {
				jButtonActualizarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoAntiCliente")) {
				jButtonActualizarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoAntiCliente")) {
				jButtonEliminarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoAntiCliente")) {
				jButtonEliminarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoAntiCliente")) {
				jButtonEliminarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoAntiCliente")) {
				jButtonCancelarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoAntiCliente")) {
				jButtonCancelarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoAntiCliente")) {
				jButtonCancelarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoAntiCliente")) {
				jButtonCerrarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoAntiCliente")) {
				jButtonCerrarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoAntiCliente")) {
				jButtonCerrarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoAntiCliente")) {
				jButtonMostrarOcultarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoAntiCliente")) {
				jButtonCancelarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoAntiCliente")) {
				jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoAntiCliente")) {
				jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoAntiCliente")) {
				jButtonCopiarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoAntiCliente")) {
				jButtonVerFormEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoAntiCliente")) {
				jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoAntiCliente")) {
				jButtonCopiarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoAntiCliente")) {
				jButtonVerFormEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoAntiCliente")) {
				jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoAntiCliente")) {
				jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoAntiCliente")) {
				jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoAntiCliente")) {
				jButtonRecargarInformacionEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoAntiCliente")) {
				jButtonRecargarInformacionEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoAntiCliente")) {
				jButtonRecargarInformacionEstadoAntiClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoAntiCliente")) {
				jButtonAnterioresEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoAntiCliente")) {
				jButtonAnterioresEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoAntiCliente")) {
				jButtonAnterioresEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoAntiCliente")) {
				jButtonSiguientesEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoAntiCliente")) {
				jButtonSiguientesEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoAntiCliente")) {
				jButtonSiguientesEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoAntiCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoAntiCliente")) {
				jButtonAbrirOrderByEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoAntiCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoAntiCliente")) {
				jButtonMostrarOcultarEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoAntiCliente")) {
				jButtonNuevoGuardarCambiosEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoAntiCliente")) {
				jButtonNuevoGuardarCambiosEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoAntiCliente")) {
				jButtonNuevoGuardarCambiosEstadoAntiClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoAntiCliente")) {
				jButtonCerrarReporteDinamicoEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoAntiCliente")) {
				jButtonGenerarReporteDinamicoEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoAntiCliente")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoAntiClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoAntiCliente")) {
				jButtonCerrarImportacionEstadoAntiClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoAntiCliente")) {
				
				jButtonGenerarImportacionEstadoAntiClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoAntiCliente")) {
				
				jButtonAbrirImportacionEstadoAntiClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoAntiCliente")) {
				jComboBoxTiposAccionesEstadoAntiClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoAntiCliente")) {
				jComboBoxTiposRelacionesEstadoAntiClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoAntiCliente")) {
				jComboBoxTiposAccionesEstadoAntiClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoAntiCliente")) {
				
				jComboBoxTiposSeleccionarEstadoAntiClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoAntiCliente")) {
				jTextFieldValorCampoGeneralEstadoAntiClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoAntiCliente")) {
				jButtonAbrirOrderByEstadoAntiClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoAntiCliente")) {
				jButtonAbrirOrderByEstadoAntiClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoAntiCliente")) {
				jButtonCerrarOrderByEstadoAntiClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoAntiClienteBusqueda")) {
				this.jButtonidEstadoAntiClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoAntiClienteBusqueda")) {
				this.jButtoncodigoEstadoAntiClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoAntiClienteBusqueda")) {
				this.jButtonnombreEstadoAntiClienteBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoAntiCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAntiClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				


				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAntiCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAntiCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoAntiCliente estadoanticlienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoanticlienteLocal=this.estadoanticliente;
			} else {
				estadoanticlienteLocal=this.estadoanticlienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
							
				
				


				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAntiCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAntiCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAntiClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			
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
			
			


			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAntiClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
								
						
				


				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAntiCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAntiCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
								
				
				


				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAntiCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAntiCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAntiClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAntiClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAntiClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
							
				
				


				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAntiCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAntiCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAntiClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			
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
			
			


			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAntiClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
								
				
				


				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAntiCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAntiCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAntiClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAntiClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAntiClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoAntiCliente")) {
					jCheckBoxSeleccionarTodosEstadoAntiClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoAntiCliente")) {
					jCheckBoxSeleccionadosEstadoAntiClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoAntiCliente")) {
					
				}
				
				


				
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAntiCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAntiCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
												
				
				


				
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAntiCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAntiCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAntiClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAntiClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
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
			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
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
			
			


			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoAntiClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAntiCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAntiCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoanticliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoanticliente);
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
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
				
				


				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoAntiCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoAntiCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoAntiClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoanticlienteAnterior =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoAntiCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoAntiClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoAntiCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoanticliente =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoanticliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoAntiCliente")) {
				
				}
				
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoAntiCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoAntiCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoAntiCliente")) {
			
			}
			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoAntiCliente();
			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoAntiCliente")) {
				jButtonNuevoEstadoAntiClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoAntiCliente")) {
				jButtonDuplicarEstadoAntiClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoAntiCliente")) {
				jButtonCopiarEstadoAntiClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoAntiCliente")) {
				jButtonVerFormEstadoAntiClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoAntiCliente")) {
				jButtonNuevoEstadoAntiClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoAntiCliente")) {
				jButtonModificarEstadoAntiClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoAntiCliente")) {
				jButtonActualizarEstadoAntiClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoAntiCliente")) {
				jButtonEliminarEstadoAntiClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoAntiCliente")) {
				jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoAntiCliente")) {
				jButtonCancelarEstadoAntiClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoAntiCliente")) {
				jButtonCerrarEstadoAntiClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoAntiCliente")) {
				jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoAntiCliente")) {
				jButtonNuevoGuardarCambiosEstadoAntiClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoAntiCliente")) {
				jButtonAbrirOrderByEstadoAntiClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoAntiCliente")) {
				jButtonRecargarInformacionEstadoAntiClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoAntiCliente")) {
				jButtonAnterioresEstadoAntiClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoAntiCliente")) {
				jButtonSiguientesEstadoAntiClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoAntiClienteBusqueda")) {
				this.jButtonidEstadoAntiClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoAntiClienteBusqueda")) {
				this.jButtoncodigoEstadoAntiClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoAntiClienteBusqueda")) {
				this.jButtonnombreEstadoAntiClienteBusquedaActionPerformed(evt);
			}
			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoAntiCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoAntiCliente")) {
				closingInternalFrameEstadoAntiCliente();
				
			} else if(sTipo.equals("jButtonCancelarEstadoAntiCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoAntiCliente = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoAntiClienteBeanSwingJInternalFrame jInternalFrameParent=(EstadoAntiClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoAntiCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoAntiClienteActionPerformed(null);
			}
			
			EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoanticliente,new Object(),this.estadoanticlienteParameterGeneral,this.estadoanticlienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoAntiCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoAntiCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoAntiCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoanticliente)) {
			if(!esControlTabla) {
				if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoAntiCliente(this.estadoanticliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);			
				}
				
				if(this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoAntiCliente(this.estadoanticliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoanticlienteReturnGeneral=estadoanticlienteLogic.procesarEventosEstadoAntiClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoanticlienteLogic.getEstadoAntiClientes(),this.estadoanticliente,this.estadoanticlienteParameterGeneral,this.isEsNuevoEstadoAntiCliente,classes);//this.estadoanticlienteLogic.getEstadoAntiCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoAntiCliente(this.estadoanticlienteReturnGeneral,this.estadoanticlienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoAntiCliente(classes,this.estadoanticlienteReturnGeneral,this.estadoanticlienteBean,false);
					}
						
					if(this.estadoanticlienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoAntiCliente(this.estadoanticlienteReturnGeneral.getEstadoAntiCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoAntiCliente(this.estadoanticlienteReturnGeneral.getEstadoAntiCliente());	
					}
						
					if(this.estadoanticlienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoAntiCliente(this.estadoanticlienteReturnGeneral.getEstadoAntiCliente(),classes);//this.estadoanticlienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoAntiCliente(this.estadoanticliente,classes);//this.estadoanticlienteBean);									
				}
			
				if(EstadoAntiClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoAntiCliente(this.estadoanticliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoAntiCliente(this.estadoanticliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoanticlienteAnterior!=null) {
						this.estadoanticliente=this.estadoanticlienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoanticlienteReturnGeneral=estadoanticlienteLogic.procesarEventosEstadoAntiClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoanticlienteLogic.getEstadoAntiClientes(),this.estadoanticliente,this.estadoanticlienteParameterGeneral,this.isEsNuevoEstadoAntiCliente,classes);//this.estadoanticlienteLogic.getEstadoAntiCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoanticlienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoanticlienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoanticlienteReturnGeneral.getEstadoAntiCliente(),estadoanticlienteLogic.getEstadoAntiClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoanticlienteReturnGeneral.getEstadoAntiCliente(),this.estadoanticlientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoAntiCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoAntiCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoAntiCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoAntiCliente() throws Exception {
		
		EstadoAntiClienteModel estadoanticlienteModel=(EstadoAntiClienteModel)this.jTableDatosEstadoAntiCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoanticlienteModel.estadoanticlientes=this.estadoanticlienteLogic.getEstadoAntiClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoanticlienteModel.estadoanticlientes=this.estadoanticlientes;
		}
		
		
		((EstadoAntiClienteModel) this.jTableDatosEstadoAntiCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoAntiCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoanticlienteAnterior(),this.estadoanticlienteLogic.getEstadoAntiClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoanticlienteAnterior(),this.estadoanticlientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoAntiCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoAntiCliente(EstadoAntiCliente estadoanticliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AnticipoCliente.class)) {
					this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.setAnticipoClientes(estadoanticliente.getAnticipoClientes());
					this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnticipoCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
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
										
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoanticliente,new Object(),generalEntityParameterGeneral,this.estadoanticlienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoanticlienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoAntiClienteConstantesFunciones.getClassesRelationshipsOfEstadoAntiCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoAntiClienteConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoAntiCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoAntiCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoAntiClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoanticliente,new Object(),generalEntityParameterGeneral,this.estadoanticlienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoAntiCliente(EstadoAntiClienteBean estadoanticlienteBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(AnticipoCliente.class)) {
					this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.setAnticipoClientes(estadoanticliente.getAnticipoClientes());
					this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnticipoCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoAntiCliente(ArrayList<Classe> classes,EstadoAntiClienteReturnGeneral estadoanticlienteReturnGeneral,EstadoAntiClienteBean estadoanticlienteBean,Boolean conDefault) throws Exception {
		
			this.estadoanticlienteBean.setAnticipoClientes(estadoanticlienteReturnGeneral.getEstadoAntiCliente().getAnticipoClientes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoAntiCliente(EstadoAntiCliente estadoanticliente,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(AnticipoCliente.class)) {
					estadoanticliente.setAnticipoClientes(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadoanticliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoAntiCliente = new EstadoAntiClienteDetalleFormJInternalFrame(jDesktopPane,this.estadoanticlienteSessionBean.getConGuardarRelaciones(),this.estadoanticlienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoAntiCliente);
		this.jInternalFrameDetalleFormEstadoAntiCliente.setVisible(false);
		this.jInternalFrameDetalleFormEstadoAntiCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.estadoanticlienteLogic=this.estadoanticlienteLogic;
		
		this.cargarCombosFrameForeignKeyEstadoAntiCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoAntiCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoAntiCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoAntiCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoAntiCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoAntiCliente"));
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonModificarEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"ModificarEstadoAntiCliente"));

		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonModificarToolBarEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoAntiCliente"));
					
		this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemModificarEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoAntiCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonActualizarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"ActualizarEstadoAntiCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonActualizarToolBarEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoAntiCliente"));
						
		this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemActualizarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoAntiCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonEliminarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"EliminarEstadoAntiCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonEliminarToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoAntiCliente"));
								
		this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemEliminarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoAntiCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonCancelarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"CancelarEstadoAntiCliente"));
		
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonCancelarToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoAntiCliente"));
					
		this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemCancelarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoAntiCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemDetalleCerrarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoAntiCliente"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonGuardarCambiosToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoAntiCliente"));
		
		
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonGuardarCambiosToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoAntiCliente"));
		
		
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoAntiCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonidEstadoAntiClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoAntiClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtoncodigoEstadoAntiClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoAntiClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonnombreEstadoAntiClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoAntiClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoAntiCliente.jTabbedPaneRelacionesEstadoAntiCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoAntiCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoAntiCliente"));
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoAntiCliente"));
		}
		
		this.jTableDatosEstadoAntiCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoAntiCliente"));
		
		this.jTableDatosEstadoAntiCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoAntiCliente"));
		
		this.jButtonNuevoEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"NuevoEstadoAntiCliente"));
		
		this.jButtonDuplicarEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"DuplicarEstadoAntiCliente"));
		
		this.jButtonCopiarEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"CopiarEstadoAntiCliente"));
		
		this.jButtonVerFormEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"VerFormEstadoAntiCliente"));
		
		
		this.jButtonNuevoToolBarEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoAntiCliente"));
			
		this.jButtonDuplicarToolBarEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoAntiCliente"));
			
		this.jMenuItemNuevoEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoAntiCliente"));
			
		this.jMenuItemDuplicarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoAntiCliente"));		
		
		
		this.jButtonNuevoRelacionesEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoAntiCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoAntiCliente"));
			
		this.jMenuItemNuevoRelacionesEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoAntiCliente"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonModificarEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"ModificarEstadoAntiCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonModificarToolBarEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoAntiCliente"));
			
			this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemModificarEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoAntiCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonActualizarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"ActualizarEstadoAntiCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonActualizarToolBarEstadoAntiCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoAntiCliente"));
				
			this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemActualizarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoAntiCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonEliminarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"EliminarEstadoAntiCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonEliminarToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoAntiCliente"));
						
			this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemEliminarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoAntiCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonCancelarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"CancelarEstadoAntiCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonCancelarToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoAntiCliente"));
			
			this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemCancelarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoAntiCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoAntiCliente"));		
		
		
		this.jButtonCerrarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"CerrarEstadoAntiCliente"));
		
		
		this.jButtonCerrarToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoAntiCliente"));
			
		this.jMenuItemCerrarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoAntiCliente"));
			
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jMenuItemDetalleCerrarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoAntiCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonGuardarCambiosEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoAntiCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonGuardarCambiosToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoAntiCliente"));
		}
		
		this.jButtonCopiarToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoAntiCliente"));
			
		this.jButtonVerFormToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoAntiCliente"));
		
		this.jMenuItemGuardarCambiosEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoAntiCliente"));
			
		this.jMenuItemCopiarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoAntiCliente"));		
		
		this.jMenuItemVerFormEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoAntiCliente"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoAntiCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoAntiCliente"));
			
		this.jMenuItemGuardarCambiosTablaEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoAntiCliente"));		
		
		
		
		this.jButtonRecargarInformacionEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoAntiCliente"));
					
		this.jButtonRecargarInformacionToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoAntiCliente"));
		
		this.jMenuItemRecargarInformacionEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoAntiCliente"));		
		
		
		
		this.jButtonAnterioresEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"AnterioresEstadoAntiCliente"));
		
		
		this.jButtonAnterioresToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoAntiCliente"));
		
		this.jMenuItemAnterioresEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoAntiCliente"));		
		
		
		this.jButtonSiguientesEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"SiguientesEstadoAntiCliente"));
		
		
		this.jButtonSiguientesToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoAntiCliente"));
			
		this.jMenuItemSiguientesEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoAntiCliente"));
			
		this.jMenuItemAbrirOrderByEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoAntiCliente"));
			
		this.jMenuItemMostrarOcultarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoAntiCliente"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoAntiCliente"));
			
		this.jMenuItemDetalleMostarOcultarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoAntiCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoAntiCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoAntiCliente"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoAntiCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoAntiCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoAntiCliente"));

		this.jCheckBoxSeleccionadosEstadoAntiCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoAntiCliente"));
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoAntiCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoAntiCliente"));
			
		this.jComboBoxTiposAccionesEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoAntiCliente"));
					
		this.jComboBoxTiposSeleccionarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoAntiCliente"));
			
		this.jTextFieldValorCampoGeneralEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoAntiCliente"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonidEstadoAntiClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoAntiClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtoncodigoEstadoAntiClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoAntiClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonnombreEstadoAntiClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoAntiClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoAntiCliente!=null) {
				this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoAntiCliente"));
				this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoAntiCliente"));
				this.jInternalFrameReporteDinamicoEstadoAntiCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoAntiCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoAntiCliente"));				
			//this.jButtonGenerarReporteDinamicoEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoAntiCliente"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoAntiCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoAntiCliente!=null) {
				this.jInternalFrameImportacionEstadoAntiCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoAntiCliente"));
				this.jInternalFrameImportacionEstadoAntiCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoAntiCliente"));
				this.jInternalFrameImportacionEstadoAntiCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoAntiCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoAntiCliente"));
			
			this.jButtonAbrirOrderByToolBarEstadoAntiCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoAntiCliente"));			
			
			if(this.jInternalFrameOrderByEstadoAntiCliente!=null) {
				this.jInternalFrameOrderByEstadoAntiCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoAntiCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoAntiCliente.jTabbedPaneRelacionesEstadoAntiCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoAntiCliente"));
		
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
            		closingInternalFrameEstadoAntiCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoAntiCliente = (JInternalFrameBase)event.getSource();
	            	
	            EstadoAntiClienteBeanSwingJInternalFrame jInternalFrameParent=(EstadoAntiClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoAntiCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoAntiClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoAntiCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoAntiClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoAntiCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoAntiCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAntiClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAntiClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAntiClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoAntiCliente";
		inputMap = this.jButtonNuevoEstadoAntiCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoAntiCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoAntiClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAntiClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAntiClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoAntiClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoAntiCliente";
		inputMap = this.jButtonNuevoRelacionesEstadoAntiCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoAntiCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoAntiClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoAntiCliente";
		inputMap = this.jButtonModificarEstadoAntiCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoAntiCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoAntiClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoAntiCliente";
		inputMap = this.jButtonActualizarEstadoAntiCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoAntiCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoAntiClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoAntiCliente";
		inputMap = this.jButtonEliminarEstadoAntiCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoAntiCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoAntiClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoAntiCliente";
		inputMap = this.jButtonCancelarEstadoAntiCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoAntiCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoAntiClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoAntiCliente";
		inputMap = this.jButtonCerrarEstadoAntiCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoAntiCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoAntiClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonGuardarCambiosEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoAntiCliente";
		inputMap = this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonGuardarCambiosEstadoAntiCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonGuardarCambiosEstadoAntiCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoAntiClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoAntiCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoAntiClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoAntiCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoAntiClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoAntiCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoAntiClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoAntiCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoAntiClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonidEstadoAntiClienteBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoAntiClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtoncodigoEstadoAntiClienteBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoAntiClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoAntiCliente.jButtonnombreEstadoAntiClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoAntiClienteBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoAntiCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoAntiClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoAntiClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoAntiCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoAntiCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlienteLogic.getEstadoAntiClientes()) {
					estadoanticlienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientes) {
					estadoanticlienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoAntiClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoAntiCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlienteLogic.getEstadoAntiClientes()) {
						estadoanticlienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientes) {
						estadoanticlienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlienteLogic.getEstadoAntiClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoAntiCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoAntiCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoAntiCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoAntiClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoAntiCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoAntiCliente.getSelectedRows();
			
			EstadoAntiCliente estadoanticlienteLocal=new EstadoAntiCliente();
			
			//this.seleccionarTodosEstadoAntiCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoanticlienteLocal =(EstadoAntiCliente) this.estadoanticlienteLogic.getEstadoAntiClientes().toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoanticlienteLocal =(EstadoAntiCliente) this.estadoanticlientes.toArray()[this.jTableDatosEstadoAntiCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoanticlienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlienteLogic.getEstadoAntiClientes()) {
						estadoanticlienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientes) {
						estadoanticlienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoAntiCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoAntiCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoAntiCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoAntiClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoAntiClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoAntiClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoAntiCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoAntiCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlienteLogic.getEstadoAntiClientes()) {
				
						if(sTipoSeleccionar.equals(EstadoAntiClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoanticlienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoanticlienteAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientes) {
					
						if(sTipoSeleccionar.equals(EstadoAntiClienteConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadoanticlienteAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoanticlienteAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoAntiClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoAntiCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoAntiCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoAntiCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoAntiCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoAntiCliente(conSplash);
				
					this.generarReporteEstadoAntiClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoAntiCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoAntiClientesSeleccionados();
				//this.jComboBoxTiposAccionesEstadoAntiCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoAntiClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoAntiCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoAntiClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoAntiCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoAntiCliente();
				
				this.exportarEstadoAntiClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoAntiCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoAntiClientes();
				//this.importarEstadoAntiClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoAntiCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoAntiCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoAntiClientesSeleccionados();
				//this.jComboBoxTiposAccionesEstadoAntiCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Anti Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoAntiCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoAntiCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoAntiCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Anti Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoAntiCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoAntiClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoAntiCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoAntiCliente(conSplash);
					
						//this.actualizarParametrosGeneralEstadoAntiCliente();
						
						this.generarReporteProcesoAccionEstadoAntiClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoAntiCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoAntiClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado Anti ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Estado Anti Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoAntiCliente();
				
						this.actualizarParametrosGeneralEstadoAntiCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadoanticlienteReturnGeneral=estadoanticlienteLogic.procesarAccionEstadoAntiClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadoanticlienteLogic.getEstadoAntiClientes(),this.estadoanticlienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoAntiClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoAntiCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoAntiCliente();
					
					EstadoAntiClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoAntiClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoAntiCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoAntiCliente.jComboBoxTiposAccionesFormularioEstadoAntiCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoAntiCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoAntiClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoAntiCliente();
			
			if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();		
			EstadoAntiCliente estadoanticliente=new EstadoAntiCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoAntiCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoAntiCliente.getSelectedItem();
			
			
			
			
			estadoanticlientesSeleccionados=this.getEstadoAntiClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoanticlientesSeleccionados.size()==1) {
				for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientesSeleccionados) {
					estadoanticliente=estadoanticlienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Anticipo Cliente")) {
					jButtonAnticipoClienteActionPerformed(null,rowIndex,true,false,estadoanticliente);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoAntiCliente();
			
      		//this.finishProcessEstadoAntiCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoAntiClienteReturnGeneral() throws Exception {
		if(this.estadoanticlienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoanticlienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoanticlienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoanticlienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoanticlienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoanticlienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoAntiCliente(false);
		}
		
		if(this.estadoanticlienteReturnGeneral.getConRetornoLista() || this.estadoanticlienteReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoanticlienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoanticlienteLogic.setEstadoAntiClientes(this.estadoanticlienteReturnGeneral.getEstadoAntiClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoanticlienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoanticlienteLogic.setEstadoAntiCliente(this.estadoanticlienteReturnGeneral.getEstadoAntiCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoAntiCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoAntiCliente() throws Exception {
		
		
	}
	
	public ArrayList<EstadoAntiCliente> getEstadoAntiClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoAntiCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoAntiCliente estadoanticlienteAux:estadoanticlienteLogic.getEstadoAntiClientes()) {
					if(estadoanticlienteAux.getIsSelected()) {
						estadoanticlientesSeleccionados.add(estadoanticlienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoAntiCliente estadoanticlienteAux:this.estadoanticlientes) {
					if(estadoanticlienteAux.getIsSelected()) {
						estadoanticlientesSeleccionados.add(estadoanticlienteAux);				
					}
				}
			}
			
			if(estadoanticlientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoanticlientesSeleccionados.addAll(this.estadoanticlienteLogic.getEstadoAntiClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoanticlientesSeleccionados.addAll(this.estadoanticlientes);				
					}
				}
			}
		} else {
			estadoanticlientesSeleccionados.add(this.estadoanticliente);
		}
		
		return estadoanticlientesSeleccionados;
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
	
	public void generarReporteEstadoAntiClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoAntiClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoAntiClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoAntiClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoAntiClientesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoAntiClientesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Anti Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoAntiClientesSeleccionados() throws Exception {
		ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();		
		
		estadoanticlientesSeleccionados=this.getEstadoAntiClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoAntiClientes("Todos",estadoanticlientesSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoAntiClientesSeleccionados() throws Exception {
		ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();		
		
		estadoanticlientesSeleccionados=this.getEstadoAntiClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoAntiClientes("Todos",estadoanticlientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoAntiClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();
		
		estadoanticlientesSeleccionados=this.getEstadoAntiClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoAntiClientes("Todos",estadoanticlientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoAntiClientesSeleccionados() throws Exception {
		ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoAntiCliente();
		
		
		estadoanticlientesSeleccionados=this.getEstadoAntiClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoAntiCliente();
		
		
		//this.generarReporteEstadoAntiClientes("Todos",estadoanticlientesSeleccionados ,estadoanticlienteImplementable,estadoanticlienteImplementableHome);
	}
	
	public void mostrarImportacionEstadoAntiClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoAntiCliente();
		
		this.abrirFrameImportacionEstadoAntiCliente();		
		
			
		//this.generarReporteEstadoAntiClientes("Todos",estadoanticlientesSeleccionados ,estadoanticlienteImplementable,estadoanticlienteImplementableHome);
	}
	
	public void importarEstadoAntiClientes() throws Exception {		
	
	}
	
	public void exportarEstadoAntiClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoAntiClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoAntiClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoAntiClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Anti Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoAntiClientesSeleccionados() throws Exception {
		ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();		
		
		estadoanticlientesSeleccionados=this.getEstadoAntiClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoanticliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoAntiCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoAntiCliente(estadoanticlienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoanticlienteAux.setsDetalleGeneralEntityReporte(estadoanticlienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Anti Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoAntiCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoAntiClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoAntiClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoAntiClienteConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoAntiCliente(EstadoAntiCliente estadoanticliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoanticliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoanticliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoanticliente.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoanticliente.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoAntiClientesSeleccionados() throws Exception {
		ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();		
		
		estadoanticlientesSeleccionados=this.getEstadoAntiClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoanticliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoAntiClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoAntiCliente(row);				
				iRow++;
			}				
			
			for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoAntiCliente(estadoanticlienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Anti Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoAntiClientesSeleccionados() throws Exception {
		ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();		
		
		estadoanticlientesSeleccionados=this.getEstadoAntiClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoanticliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoanticlientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoanticliente");
			//elementRoot.appendChild(element);
		
			for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientesSeleccionados) {
				element = document.createElement("estadoanticliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoAntiCliente(estadoanticlienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Anti Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoAntiCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoAntiClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoAntiClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoAntiClienteConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoAntiCliente(EstadoAntiCliente estadoanticliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoanticliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoanticliente.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoanticliente.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoAntiCliente(EstadoAntiCliente estadoanticliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoAntiClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoanticliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoAntiClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoanticliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoAntiClienteConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadoanticliente.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoAntiClienteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoanticliente.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoAntiClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados=new ArrayList<EstadoAntiCliente>();
		
		estadoanticlientesSeleccionados=this.getEstadoAntiClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoAntiCliente(estadoanticlientesSeleccionados);
		
		this.generarReporteEstadoAntiClientes("Todos",estadoanticlientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoAntiCliente(ArrayList<EstadoAntiCliente> estadoanticlientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoAntiCliente estadoanticlienteAux:estadoanticlientesSeleccionados) {
				estadoanticlienteAux.setsDetalleGeneralEntityReporte(estadoanticlienteAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoAntiClienteConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadoanticlienteAux.setsDescripcionGeneralEntityReporte1(estadoanticlienteAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoAntiClienteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoanticlienteAux.setsDescripcionGeneralEntityReporte1(estadoanticlienteAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoAntiClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoAntiCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoAntiCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoAntiCliente=false;
			this.isVisibilidadCeldaActualizarEstadoAntiCliente=false;
			this.isVisibilidadCeldaEliminarEstadoAntiCliente=false;
			this.isVisibilidadCeldaCancelarEstadoAntiCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoAntiCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=false;
			this.isVisibilidadCeldaModificarEstadoAntiCliente=false;
			this.isVisibilidadCeldaActualizarEstadoAntiCliente=true;
			this.isVisibilidadCeldaEliminarEstadoAntiCliente=false;
			this.isVisibilidadCeldaCancelarEstadoAntiCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoAntiCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=false;
			this.isVisibilidadCeldaModificarEstadoAntiCliente=false;
			this.isVisibilidadCeldaActualizarEstadoAntiCliente=true;
			this.isVisibilidadCeldaEliminarEstadoAntiCliente=true;
			this.isVisibilidadCeldaCancelarEstadoAntiCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoAntiCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=false;
			this.isVisibilidadCeldaModificarEstadoAntiCliente=false;
			this.isVisibilidadCeldaActualizarEstadoAntiCliente=true;
			this.isVisibilidadCeldaEliminarEstadoAntiCliente=false;
			this.isVisibilidadCeldaCancelarEstadoAntiCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoAntiCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=true;
			this.isVisibilidadCeldaModificarEstadoAntiCliente=false;
			this.isVisibilidadCeldaActualizarEstadoAntiCliente=false;
			this.isVisibilidadCeldaEliminarEstadoAntiCliente=false;
			this.isVisibilidadCeldaCancelarEstadoAntiCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoAntiCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=false;
			this.isVisibilidadCeldaActualizarEstadoAntiCliente=false;
			this.isVisibilidadCeldaEliminarEstadoAntiCliente=false;
			this.isVisibilidadCeldaCancelarEstadoAntiCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoAntiCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=false;
			this.isVisibilidadCeldaModificarEstadoAntiCliente=true;
			this.isVisibilidadCeldaActualizarEstadoAntiCliente=false;
			this.isVisibilidadCeldaEliminarEstadoAntiCliente=false;
			this.isVisibilidadCeldaCancelarEstadoAntiCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoAntiCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoAntiClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoAntiCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=true;
		} else {
			this.actualizarEstadoPanelsEstadoAntiCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoAntiCliente=false;
			//this.isVisibilidadCeldaVerFormEstadoAntiCliente=false;
			this.isVisibilidadCeldaDuplicarEstadoAntiCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoanticlienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoAntiCliente=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
			if(!estadoanticlienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=false;												
			}
			
			this.jButtonCerrarEstadoAntiCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoAntiCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoanticliente)) {
			this.isVisibilidadCeldaActualizarEstadoAntiCliente=false;
			this.isVisibilidadCeldaEliminarEstadoAntiCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoAntiCliente() {
		this.isVisibilidadCeldaNuevoEstadoAntiCliente=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoAntiCliente=false;
	}
	
	public void actualizarEstadoPanelsEstadoAntiCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoAntiCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEstadoAntiCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoAntiCliente!=null) {
				this.jPanelPaginacionEstadoAntiCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoAntiCliente!=null) {
				this.jPanelParametrosReportesEstadoAntiCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoAntiCliente.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEstadoAntiCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoAntiCliente!=null) {
				this.jPanelPaginacionEstadoAntiCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoAntiCliente!=null) {
				this.jPanelParametrosReportesEstadoAntiCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoAntiCliente.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEstadoAntiCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoAntiCliente!=null) {
				this.jPanelPaginacionEstadoAntiCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoAntiCliente!=null) {
				this.jPanelParametrosReportesEstadoAntiCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoAntiCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEstadoAntiCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoAntiCliente!=null) {
				this.jPanelPaginacionEstadoAntiCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoAntiCliente!=null) {
				this.jPanelParametrosReportesEstadoAntiCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoAntiCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEstadoAntiCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoAntiCliente!=null) {
				this.jPanelPaginacionEstadoAntiCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoAntiCliente!=null) {
				this.jPanelParametrosReportesEstadoAntiCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoAntiCliente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEstadoAntiCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoAntiCliente!=null) {
				this.jPanelPaginacionEstadoAntiCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoAntiCliente!=null) {
				this.jPanelParametrosReportesEstadoAntiCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEdicionEstadoAntiCliente.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoAntiCliente!=null) {
				this.jScrollPanelDatosEstadoAntiCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoAntiCliente!=null) {
				this.jPanelPaginacionEstadoAntiCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoAntiCliente!=null) {
				this.jPanelParametrosReportesEstadoAntiCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoanticlienteSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoAntiClienteParaAnticipoClientes() throws Exception {
		Boolean isPaginaPopupAnticipoCliente=false;

		try {

			if(this.estadoanticlienteSessionBean==null) {
				this.estadoanticlienteSessionBean=new EstadoAntiClienteSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteSessionBean.setsPathNavegacionActual(estadoanticlienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupAnticipoCliente=this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAnticipoCliente(true);
			this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAnticipoCliente(EstadoAntiClienteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteSessionBean.setisBusquedaDesdeForeignKeySesionEstadoAntiCliente(true);
			this.jInternalFrameDetalleFormEstadoAntiCliente.anticipoclienteSessionBean.setlidEstadoAntiClienteActual(this.idEstadoAntiClienteActual);

			estadoanticlienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoAntiCliente(true);
			estadoanticlienteSessionBean.setlIdEstadoAntiClienteActualForeignKey(this.idEstadoAntiClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoAntiClienteSessionBean estadoanticlienteSessionBean=new EstadoAntiClienteSessionBean();
		
		if(this.estadoanticlienteSessionBean==null) {
			this.estadoanticlienteSessionBean=new EstadoAntiClienteSessionBean();
		}
		
		this.estadoanticlienteSessionBean.setsUltimaBusquedaEstadoAntiCliente(this.getsAccionBusqueda());
		this.estadoanticlienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoanticlienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoAntiClienteSessionBean estadoanticlienteSessionBean=new EstadoAntiClienteSessionBean();
		
		if(this.estadoanticlienteSessionBean==null) {
			this.estadoanticlienteSessionBean=new EstadoAntiClienteSessionBean();
		}
		
		if(this.estadoanticlienteSessionBean.getsUltimaBusquedaEstadoAntiCliente()!=null&&!this.estadoanticlienteSessionBean.getsUltimaBusquedaEstadoAntiCliente().equals("")) {
			this.setsAccionBusqueda(estadoanticlienteSessionBean.getsUltimaBusquedaEstadoAntiCliente());
			this.setiNumeroPaginacion(estadoanticlienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoanticlienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadoanticlienteSessionBean.setsUltimaBusquedaEstadoAntiCliente("");
		this.estadoanticlienteSessionBean.setiNumeroPaginacion(EstadoAntiClienteConstantesFunciones.INUMEROPAGINACION);
		this.estadoanticlienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoAntiCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoAntiCliente() {
		this.updateBorderResaltarBusquedasFormularioEstadoAntiCliente();
		this.updateVisibilidadBusquedasFormularioEstadoAntiCliente();
		this.updateHabilitarBusquedasFormularioEstadoAntiCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoAntiCliente() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoAntiCliente() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoAntiCliente() {
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
	
	public void updateControlesFormularioEstadoAntiCliente() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoAntiCliente();
		this.updateVisibilidadResaltarControlesFormularioEstadoAntiCliente();
		this.updateHabilitarResaltarControlesFormularioEstadoAntiCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoAntiCliente() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoanticlienteConstantesFunciones.resaltaridEstadoAntiCliente!=null && this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelidEstadoAntiCliente.setBorder(this.estadoanticlienteConstantesFunciones.resaltaridEstadoAntiCliente);}
		if(this.estadoanticlienteConstantesFunciones.resaltarcodigoEstadoAntiCliente!=null && this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {this.jInternalFrameDetalleFormEstadoAntiCliente.jTextFieldcodigoEstadoAntiCliente.setBorder(this.estadoanticlienteConstantesFunciones.resaltarcodigoEstadoAntiCliente);}
		if(this.estadoanticlienteConstantesFunciones.resaltarnombreEstadoAntiCliente!=null && this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {this.jInternalFrameDetalleFormEstadoAntiCliente.jTextAreanombreEstadoAntiCliente.setBorder(this.estadoanticlienteConstantesFunciones.resaltarnombreEstadoAntiCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoAntiCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
	
		//this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelidEstadoAntiCliente.setVisible(this.estadoanticlienteConstantesFunciones.mostraridEstadoAntiCliente);
		this.jInternalFrameDetalleFormEstadoAntiCliente.jPanelidEstadoAntiCliente.setVisible(this.estadoanticlienteConstantesFunciones.mostraridEstadoAntiCliente);
		//this.jInternalFrameDetalleFormEstadoAntiCliente.jTextFieldcodigoEstadoAntiCliente.setVisible(this.estadoanticlienteConstantesFunciones.mostrarcodigoEstadoAntiCliente);
		this.jInternalFrameDetalleFormEstadoAntiCliente.jPanelcodigoEstadoAntiCliente.setVisible(this.estadoanticlienteConstantesFunciones.mostrarcodigoEstadoAntiCliente);
		//this.jInternalFrameDetalleFormEstadoAntiCliente.jTextAreanombreEstadoAntiCliente.setVisible(this.estadoanticlienteConstantesFunciones.mostrarnombreEstadoAntiCliente);
		this.jInternalFrameDetalleFormEstadoAntiCliente.jPanelnombreEstadoAntiCliente.setVisible(this.estadoanticlienteConstantesFunciones.mostrarnombreEstadoAntiCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoAntiCliente() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoAntiCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoAntiCliente!=null) {
	
		this.jInternalFrameDetalleFormEstadoAntiCliente.jLabelidEstadoAntiCliente.setEnabled(this.estadoanticlienteConstantesFunciones.activaridEstadoAntiCliente);
		this.jInternalFrameDetalleFormEstadoAntiCliente.jTextFieldcodigoEstadoAntiCliente.setEnabled(this.estadoanticlienteConstantesFunciones.activarcodigoEstadoAntiCliente);
		this.jInternalFrameDetalleFormEstadoAntiCliente.jTextAreanombreEstadoAntiCliente.setEnabled(this.estadoanticlienteConstantesFunciones.activarnombreEstadoAntiCliente);
		}
	}
	
		
}