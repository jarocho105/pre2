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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;




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

import com.bydan.erp.comisiones.util.EstadoComisionConstantesFunciones;
import com.bydan.erp.comisiones.util.EstadoComisionParameterReturnGeneral;
//import com.bydan.erp.comisiones.util.EstadoComisionParameterGeneral;
//import com.bydan.erp.comisiones.presentation.report.source.EstadoComisionBean;
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

import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.comisiones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.comisiones.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.comisiones.business.entity.*;
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


import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

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
public class EstadoComisionBeanSwingJInternalFrame extends EstadoComisionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoComisionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoComision> estadocomisionValidator = new ClassValidator<EstadoComision>(EstadoComision.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoComision estadocomision;	
	public EstadoComision estadocomisionAux;
	public EstadoComision estadocomisionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoComision estadocomisionTotales;
	public Long idEstadoComisionActual;
	public Long iIdNuevoEstadoComision=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
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
	
	public Boolean isPermisoTodoEstadoComision;
	public Boolean isPermisoNuevoEstadoComision;
	public Boolean isPermisoActualizarEstadoComision;
	public Boolean isPermisoActualizarOriginalEstadoComision;
	public Boolean isPermisoEliminarEstadoComision;
	public Boolean isPermisoGuardarCambiosEstadoComision;
	public Boolean isPermisoConsultaEstadoComision;
	public Boolean isPermisoBusquedaEstadoComision;
	public Boolean isPermisoReporteEstadoComision;
	public Boolean isPermisoPaginacionMedioEstadoComision;
	public Boolean isPermisoPaginacionAltoEstadoComision;
	public Boolean isPermisoPaginacionTodoEstadoComision;
	public Boolean isPermisoCopiarEstadoComision;
	public Boolean isPermisoVerFormEstadoComision;
	public Boolean isPermisoDuplicarEstadoComision;
	public Boolean isPermisoOrdenEstadoComision;
	
	
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
	
	public EstadoComisionParameterReturnGeneral estadocomisionReturnGeneral;
	public EstadoComisionParameterReturnGeneral estadocomisionParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoComision=false;
	public Boolean esParaAccionDesdeFormularioEstadoComision=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EstadoComisionSessionBeanAdditional estadocomisionSessionBeanAdditional=null;
	
	public EstadoComisionSessionBeanAdditional getEstadoComisionSessionBeanAdditional() {
		return this.estadocomisionSessionBeanAdditional;
	}
	
	public void setEstadoComisionSessionBeanAdditional(EstadoComisionSessionBeanAdditional estadocomisionSessionBeanAdditional) {
		try {
			this.estadocomisionSessionBeanAdditional=estadocomisionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EstadoComisionBeanSwingJInternalFrameAdditional estadocomisionBeanSwingJInternalFrameAdditional=null;
	//public class EstadoComisionBeanSwingJInternalFrame
	
	public EstadoComisionBeanSwingJInternalFrameAdditional getEstadoComisionBeanSwingJInternalFrameAdditional() {
		return this.estadocomisionBeanSwingJInternalFrameAdditional;
	}
	
	public void setEstadoComisionBeanSwingJInternalFrameAdditional(EstadoComisionBeanSwingJInternalFrameAdditional estadocomisionBeanSwingJInternalFrameAdditional) {
		try {
			this.estadocomisionBeanSwingJInternalFrameAdditional=estadocomisionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoComisionLogic estadocomisionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoComision estadocomisionBean;
	public EstadoComisionConstantesFunciones estadocomisionConstantesFunciones;
	//public EstadoComisionParameterReturnGeneral estadocomisionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoComision> estadocomisions;	
	//public List<EstadoComision> estadocomisionsEliminados;
	//public List<EstadoComision> estadocomisionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoComision=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoComision=true;
	public Boolean isVisibilidadCeldaCopiarEstadoComision=true;
	public Boolean isVisibilidadCeldaVerFormEstadoComision=true;
	public Boolean isVisibilidadCeldaOrdenEstadoComision=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoComision=false;
	public Boolean isVisibilidadCeldaModificarEstadoComision=false;
	public Boolean isVisibilidadCeldaActualizarEstadoComision=false;
	public Boolean isVisibilidadCeldaEliminarEstadoComision=false;
	public Boolean isVisibilidadCeldaCancelarEstadoComision=false;
	public Boolean isVisibilidadCeldaGuardarEstadoComision=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoComision=false;	
	
	
	
	public Long getiIdNuevoEstadoComision() {
		return this.iIdNuevoEstadoComision;
	}

	public void setiIdNuevoEstadoComision(Long iIdNuevoEstadoComision) {
		this.iIdNuevoEstadoComision = iIdNuevoEstadoComision;
	}
	
	public Long getidEstadoComisionActual() {
		return this.idEstadoComisionActual;
	}

	public void setidEstadoComisionActual(Long idEstadoComisionActual) {
		this.idEstadoComisionActual = idEstadoComisionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoComision getestadocomision() {
		return this.estadocomision;
	}

	public void setestadocomision(EstadoComision estadocomision) {
		this.estadocomision = estadocomision;
	}
	
	public EstadoComision getestadocomisionAux() {
		return this.estadocomisionAux;
	}

	public void setestadocomisionAux(EstadoComision estadocomisionAux) {
		this.estadocomisionAux = estadocomisionAux;
	}				
	
	public EstadoComision getestadocomisionAnterior() {
		return this.estadocomisionAnterior;
	}

	public void setestadocomisionAnterior(EstadoComision estadocomisionAnterior) {
		this.estadocomisionAnterior = estadocomisionAnterior;
	}	
	
	public EstadoComision getestadocomisionTotales() {
		return this.estadocomisionTotales;
	}

	public void setestadocomisionTotales(EstadoComision estadocomisionTotales) {
		this.estadocomisionTotales = estadocomisionTotales;
	}	
	
	public EstadoComision getestadocomisionBean() {
		return this.estadocomisionBean;
	}

	public void setestadocomisionBean(EstadoComision estadocomisionBean) {
		this.estadocomisionBean = estadocomisionBean;
	}	
	
	public EstadoComisionParameterReturnGeneral getestadocomisionReturnGeneral() {
		return this.estadocomisionReturnGeneral;
	}

	public void setestadocomisionReturnGeneral(EstadoComisionParameterReturnGeneral estadocomisionReturnGeneral) {
		this.estadocomisionReturnGeneral = estadocomisionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoComisionLogic getEstadoComisionLogic()	{		
		return estadocomisionLogic;
	}

	public void setEstadoComisionLogic(EstadoComisionLogic estadocomisionLogic) {
		this.estadocomisionLogic = estadocomisionLogic;
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
	
	public Boolean getIsEsNuevoEstadoComision() {
		return isEsNuevoEstadoComision;
	}

	public void setIsEsNuevoEstadoComision(Boolean isEsNuevoEstadoComision) {
		this.isEsNuevoEstadoComision = isEsNuevoEstadoComision;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoComision() {
		return esParaAccionDesdeFormularioEstadoComision;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoComision(Boolean esParaAccionDesdeFormularioEstadoComision) {
		this.esParaAccionDesdeFormularioEstadoComision = esParaAccionDesdeFormularioEstadoComision;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoComision() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoComisionConstantesFunciones.refrescarForeignKeysDescripcionesEstadoComision(this.estadocomisionLogic.getEstadoComisions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoComisionConstantesFunciones.refrescarForeignKeysDescripcionesEstadoComision(this.estadocomisions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadocomisionLogic.setEstadoComisions(this.estadocomisions);
			estadocomisionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoComisionParameterReturnGeneral getEstadoComisionParameterGeneral() {
		return this.estadocomisionParameterGeneral;
	}
	
	public void setEstadoComisionParameterGeneral(EstadoComisionParameterReturnGeneral estadocomisionParameterGeneral) {
		this.estadocomisionParameterGeneral = estadocomisionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoComision() {
		return isPermisoTodoEstadoComision;
	}

	public void setIsPermisoTodoEstadoComision(Boolean isPermisoTodoEstadoComision) {
		this.isPermisoTodoEstadoComision = isPermisoTodoEstadoComision;
	}

	public Boolean getIsPermisoNuevoEstadoComision() {
		return isPermisoNuevoEstadoComision;
	}

	public void setIsPermisoNuevoEstadoComision(Boolean isPermisoNuevoEstadoComision) {
		this.isPermisoNuevoEstadoComision = isPermisoNuevoEstadoComision;
	}

	public Boolean getIsPermisoActualizarEstadoComision() {
		return isPermisoActualizarEstadoComision;
	}

	public void setIsPermisoActualizarEstadoComision(Boolean isPermisoActualizarEstadoComision) {
		this.isPermisoActualizarEstadoComision = isPermisoActualizarEstadoComision;
	}

	public Boolean getIsPermisoEliminarEstadoComision() {
		return isPermisoEliminarEstadoComision;
	}

	public void setIsPermisoEliminarEstadoComision(Boolean isPermisoEliminarEstadoComision) {
		this.isPermisoEliminarEstadoComision = isPermisoEliminarEstadoComision;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoComision() {
		return isPermisoGuardarCambiosEstadoComision;
	}

	public void setIsPermisoGuardarCambiosEstadoComision(Boolean isPermisoGuardarCambiosEstadoComision) {
		this.isPermisoGuardarCambiosEstadoComision = isPermisoGuardarCambiosEstadoComision;
	}
	
	public Boolean getIsPermisoConsultaEstadoComision() {
		return isPermisoConsultaEstadoComision;
	}

	public void setIsPermisoConsultaEstadoComision(Boolean isPermisoConsultaEstadoComision) {
		this.isPermisoConsultaEstadoComision = isPermisoConsultaEstadoComision;
	}

	public Boolean getIsPermisoBusquedaEstadoComision() {
		return isPermisoBusquedaEstadoComision;
	}

	public void setIsPermisoBusquedaEstadoComision(Boolean isPermisoBusquedaEstadoComision) {
		this.isPermisoBusquedaEstadoComision = isPermisoBusquedaEstadoComision;
	}

	public Boolean getIsPermisoReporteEstadoComision() {
		return isPermisoReporteEstadoComision;
	}

	public void setIsPermisoReporteEstadoComision(Boolean isPermisoReporteEstadoComision) {
		this.isPermisoReporteEstadoComision = isPermisoReporteEstadoComision;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoComision() {
		return isPermisoPaginacionMedioEstadoComision;
	}

	public void setIsPermisoPaginacionMedioEstadoComision(Boolean isPermisoPaginacionMedioEstadoComision) {
		this.isPermisoPaginacionMedioEstadoComision = isPermisoPaginacionMedioEstadoComision;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoComision() {
		return isPermisoPaginacionTodoEstadoComision;
	}

	public void setIsPermisoPaginacionTodoEstadoComision(Boolean isPermisoPaginacionTodoEstadoComision) {
		this.isPermisoPaginacionTodoEstadoComision = isPermisoPaginacionTodoEstadoComision;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoComision() {
		return isPermisoPaginacionAltoEstadoComision;
	}

	public void setIsPermisoPaginacionAltoEstadoComision(Boolean isPermisoPaginacionAltoEstadoComision) {
		this.isPermisoPaginacionAltoEstadoComision = isPermisoPaginacionAltoEstadoComision;
	}
	
	public Boolean getIsPermisoCopiarEstadoComision() {
		return isPermisoCopiarEstadoComision;
	}

	public void setIsPermisoCopiarEstadoComision(Boolean isPermisoCopiarEstadoComision) {
		this.isPermisoCopiarEstadoComision = isPermisoCopiarEstadoComision;
	}
	
	public Boolean getIsPermisoVerFormEstadoComision() {
		return isPermisoVerFormEstadoComision;
	}

	public void setIsPermisoVerFormEstadoComision(Boolean isPermisoVerFormEstadoComision) {
		this.isPermisoVerFormEstadoComision = isPermisoVerFormEstadoComision;
	}
	
	public Boolean getIsPermisoDuplicarEstadoComision() {
		return isPermisoDuplicarEstadoComision;
	}

	public void setIsPermisoDuplicarEstadoComision(Boolean isPermisoDuplicarEstadoComision) {
		this.isPermisoDuplicarEstadoComision = isPermisoDuplicarEstadoComision;
	}
	
	public Boolean getIsPermisoOrdenEstadoComision() {
		return isPermisoOrdenEstadoComision;
	}

	public void setIsPermisoOrdenEstadoComision(Boolean isPermisoOrdenEstadoComision) {
		this.isPermisoOrdenEstadoComision = isPermisoOrdenEstadoComision;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoComision() {
		return isVisibilidadCeldaNuevoEstadoComision;
	}

	public void setIsVisibilidadCeldaNuevoEstadoComision(Boolean isVisibilidadCeldaNuevoEstadoComision) {
		this.isVisibilidadCeldaNuevoEstadoComision = isVisibilidadCeldaNuevoEstadoComision;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoComision() {
		return isVisibilidadCeldaDuplicarEstadoComision;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoComision(Boolean isVisibilidadCeldaDuplicarEstadoComision) {
		this.isVisibilidadCeldaDuplicarEstadoComision = isVisibilidadCeldaDuplicarEstadoComision;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoComision() {
		return isVisibilidadCeldaCopiarEstadoComision;
	}

	public void setIsVisibilidadCeldaCopiarEstadoComision(Boolean isVisibilidadCeldaCopiarEstadoComision) {
		this.isVisibilidadCeldaCopiarEstadoComision = isVisibilidadCeldaCopiarEstadoComision;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoComision() {
		return isVisibilidadCeldaVerFormEstadoComision;
	}

	public void setIsVisibilidadCeldaVerFormEstadoComision(Boolean isVisibilidadCeldaVerFormEstadoComision) {
		this.isVisibilidadCeldaVerFormEstadoComision = isVisibilidadCeldaVerFormEstadoComision;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoComision() {
		return isVisibilidadCeldaOrdenEstadoComision;
	}

	public void setIsVisibilidadCeldaOrdenEstadoComision(Boolean isVisibilidadCeldaOrdenEstadoComision) {
		this.isVisibilidadCeldaOrdenEstadoComision = isVisibilidadCeldaOrdenEstadoComision;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoComision() {
		return isVisibilidadCeldaNuevoRelacionesEstadoComision;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoComision(Boolean isVisibilidadCeldaNuevoRelacionesEstadoComision) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoComision = isVisibilidadCeldaNuevoRelacionesEstadoComision;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoComision() {
		return isVisibilidadCeldaModificarEstadoComision;
	}

	public void setIsVisibilidadCeldaModificarEstadoComision(Boolean isVisibilidadCeldaModificarEstadoComision) {
		this.isVisibilidadCeldaModificarEstadoComision = isVisibilidadCeldaModificarEstadoComision;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoComision() {
		return isVisibilidadCeldaActualizarEstadoComision;
	}

	public void setIsVisibilidadCeldaActualizarEstadoComision(Boolean isVisibilidadCeldaActualizarEstadoComision) {
		this.isVisibilidadCeldaActualizarEstadoComision = isVisibilidadCeldaActualizarEstadoComision;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoComision() {
		return isVisibilidadCeldaEliminarEstadoComision;
	}

	public void setIsVisibilidadCeldaEliminarEstadoComision(Boolean isVisibilidadCeldaEliminarEstadoComision) {
		this.isVisibilidadCeldaEliminarEstadoComision = isVisibilidadCeldaEliminarEstadoComision;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoComision() {
		return isVisibilidadCeldaCancelarEstadoComision;
	}

	public void setIsVisibilidadCeldaCancelarEstadoComision(Boolean isVisibilidadCeldaCancelarEstadoComision) {
		this.isVisibilidadCeldaCancelarEstadoComision = isVisibilidadCeldaCancelarEstadoComision;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoComision() {
		return isVisibilidadCeldaGuardarEstadoComision;
	}

	public void setIsVisibilidadCeldaGuardarEstadoComision(Boolean isVisibilidadCeldaGuardarEstadoComision) {
		this.isVisibilidadCeldaGuardarEstadoComision = isVisibilidadCeldaGuardarEstadoComision;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoComision() {
		return isVisibilidadCeldaGuardarCambiosEstadoComision;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoComision(Boolean isVisibilidadCeldaGuardarCambiosEstadoComision) {
		this.isVisibilidadCeldaGuardarCambiosEstadoComision = isVisibilidadCeldaGuardarCambiosEstadoComision;
	}
		
	public EstadoComisionSessionBean getestadocomisionSessionBean() {
		return this.estadocomisionSessionBean;
	}
	
	public void setestadocomisionSessionBean(EstadoComisionSessionBean estadocomisionSessionBean) {
		this.estadocomisionSessionBean=estadocomisionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoComision(EstadoComision estadocomision)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoComision estadocomision,EstadoComision estadocomisionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoComision(estadocomision);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadocomisionAux.setId(estadocomision.getId());
		estadocomisionAux.setVersionRow(estadocomision.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoComision();
		
			int intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomision =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadocomision =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoComisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoComision(this.estadocomision,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(this.estadocomision);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadocomisionValidator.getInvalidValues(this.estadocomision);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadocomisionLogic.setDatosCliente(datosCliente);
			estadocomisionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadocomisionAux=new  EstadoComision();
				
				estadocomisionAux.setIsNew(true);
				estadocomisionAux.setIsChanged(true);
				
				estadocomisionAux.setEstadoComisionOriginal(this.estadocomision);
				
				estadocomisionAux.setId(this.estadocomision.getId());	
				estadocomisionAux.setVersionRow(this.estadocomision.getVersionRow());	
				estadocomisionAux.setcodigo(this.estadocomision.getcodigo());	
				estadocomisionAux.setnombre(this.estadocomision.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadocomisionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadocomisionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadocomisionAux,estadocomisionLogic.getEstadoComisions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocomisionAux,estadocomisions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadocomisionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadocomisionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocomisionLogic.saveEstadoComisions();//WithConnection
						//estadocomisionLogic.getSetVersionRowEstadoComisions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadocomision,estadocomisionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadocomisionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadocomisionLogic.saveEstadoComisionRelaciones(estadocomisionAux);//WithConnection
								//estadocomisionLogic.getSetVersionRowEstadoComisions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadocomision,estadocomisionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadocomisionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadocomisionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadocomisionAux,estadocomisionLogic.getEstadoComisions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadocomisionAux,estadocomisions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadocomision,estadocomisionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadocomisionAux=new  EstadoComision();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadocomisionSessionBean.getEsGuardarRelacionado() 
					|| (this.estadocomisionSessionBean.getEsGuardarRelacionado() && this.estadocomision.getId()>=0)) {
						
					estadocomisionAux.setIsNew(false);
				}
				
				estadocomisionAux.setIsDeleted(false);
			
				estadocomisionAux.setId(this.estadocomision.getId());	
				estadocomisionAux.setVersionRow(this.estadocomision.getVersionRow());	
				estadocomisionAux.setcodigo(this.estadocomision.getcodigo());	
				estadocomisionAux.setnombre(this.estadocomision.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadocomisionAux,estadocomisionLogic.getEstadoComisions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocomisionAux,estadocomisions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadocomisionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadocomisionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocomisionLogic.saveEstadoComisions();//WithConnection
						//estadocomisionLogic.getSetVersionRowEstadoComisions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadocomision,estadocomisionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadocomisionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadocomisionLogic.saveEstadoComisionRelaciones(estadocomisionAux);//WithConnection
								//estadocomisionLogic.getSetVersionRowEstadoComisions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.estadocomision,estadocomisionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.estadocomisionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.estadocomisionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(estadocomisionAux,estadocomisionLogic.getEstadoComisions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(estadocomisionAux,estadocomisions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.estadocomision,estadocomisionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadocomisionAux=new  EstadoComision();
				
				estadocomisionAux.setIsNew(false);
				estadocomisionAux.setIsChanged(false);
				
				estadocomisionAux.setIsDeleted(true);
				
				estadocomisionAux.setId(this.estadocomision.getId());	
				estadocomisionAux.setVersionRow(this.estadocomision.getVersionRow());	
				estadocomisionAux.setcodigo(this.estadocomision.getcodigo());	
				estadocomisionAux.setnombre(this.estadocomision.getnombre());	
				
				if(this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadocomisionAux.getId()>=0) {	
						this.estadocomisionsEliminados.add(estadocomisionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadocomisionAux,estadocomisionLogic.getEstadoComisions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocomisionAux,estadocomisions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadocomisionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadocomisionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocomisionLogic.saveEstadoComisions();//WithConnection
						//estadocomisionLogic.getSetVersionRowEstadoComisions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadocomisionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								estadocomisionLogic.saveEstadoComisionRelaciones(estadocomisionAux);//WithConnection
								//estadocomisionLogic.getSetVersionRowEstadoComisions();//WithConnection
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
							if(this.estadocomisionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadocomisionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadocomisionAux,estadocomisionLogic.getEstadoComisions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadocomisionAux,estadocomisions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionLogic.getEstadoComisions().addAll(this.estadocomisionsEliminados);
					
					estadocomisionLogic.saveEstadoComisions();//WithConnection
					//estadocomisionLogic.getSetVersionRowEstadoComisions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadocomisionsEliminados= new ArrayList<EstadoComision>();		
			}
			
			if(this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Comision GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Comision",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadocomision=estadocomisionAux;
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
      		//this.finishProcessEstadoComision();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoComision estadocomisionLocal) throws Exception {
		
		if(this.estadocomisionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoComision estadocomisionLocal) throws Exception {	
		if(this.estadocomisionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoComisionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadocomision =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadocomision =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadocomisionValidator.getInvalidValues(this.estadocomision);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoComision estadocomision,List<EstadoComision> estadocomisions) throws Exception {
		try	{		
			EstadoComisionConstantesFunciones.actualizarLista(estadocomision,estadocomisions,this.estadocomisionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoComision estadocomision,List<EstadoComision> estadocomisions) throws Exception {
		try	{			
			EstadoComisionConstantesFunciones.actualizarSelectedLista(estadocomision,estadocomisions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoComision> estadocomisionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadocomisionsLocal=this.estadocomisionLogic.getEstadoComisions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadocomisionsLocal=this.estadocomisions;
			}
			//ARCHITECTURE
		
			for(EstadoComision estadocomisionLocal:estadocomisionsLocal) {
				if(this.permiteMantenimiento(estadocomisionLocal) && estadocomisionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoComisionConstantesFunciones.getEstadoComisionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoComisionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoComision.jLabelcodigoEstadoComision,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoComisionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoComision.jLabelnombreEstadoComision,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoComision.jLabelcodigoEstadoComision,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoComision.jLabelnombreEstadoComision,"");
		
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
		this.iIdNuevoEstadoComision--;	
		
		
		this.estadocomisionAux=new EstadoComision();
		
		this.estadocomisionAux.setId(this.iIdNuevoEstadoComision);
		this.estadocomisionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadocomisionLogic.getEstadoComisions().add(this.estadocomisionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadocomisions.add(this.estadocomisionAux);
		}
		//ARCHITECTURE
		
		this.estadocomision=this.estadocomisionAux;
		
		if(EstadoComisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoComision(this.estadocomision);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoComision(this.estadocomision);
		}
				
		//this.setDefaultControlesEstadoComision();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoComision();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoComision();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoComision();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoComision(this.estadocomisionBean,this.estadocomision,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(this.estadocomision);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoComisionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadocomisionSessionBean.getConGuardarRelaciones()) {
			classes=EstadoComisionConstantesFunciones.getClassesRelationshipsOfEstadoComision(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadocomisionReturnGeneral=estadocomisionLogic.procesarEventosEstadoComisionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocomisionLogic.getEstadoComisions(),this.estadocomision,this.estadocomisionParameterGeneral,this.isEsNuevoEstadoComision,classes);//this.estadocomisionLogic.getEstadoComision()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoComision(this.estadocomisionReturnGeneral,this.estadocomisionBean,false);
		
		if(this.estadocomisionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoComision(this.estadocomisionReturnGeneral.getEstadoComision());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoComision(this.estadocomisionReturnGeneral.getEstadoComision());
		}
		
		if(this.estadocomisionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoComision(this.estadocomisionReturnGeneral.getEstadoComision(),classes);//this.estadocomisionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoComision(this.estadocomision,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoComision();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoComision();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoComisionBeanSwingJInternalFrameAdditional.RecargarFormEstadoComision(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoComision(false);
						
			if(estadocomisionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EstadoComisionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoComision();
			}
			
			this.actualizarVisualTableDatosEstadoComision();
			
			this.jTableDatosEstadoComision.setRowSelectionInterval(this.getIndiceNuevoEstadoComision(), this.getIndiceNuevoEstadoComision());
			
			this.seleccionarFilaTablaEstadoComisionActual();
						
			this.actualizarEstadoCeldasBotonesEstadoComision("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoComision(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoComision.jTextFieldcodigoEstadoComision.setEnabled(isHabilitar && this.estadocomisionConstantesFunciones.activarcodigoEstadoComision);
		this.jInternalFrameDetalleFormEstadoComision.jTextAreanombreEstadoComision.setEnabled(isHabilitar && this.estadocomisionConstantesFunciones.activarnombreEstadoComision);	
		
	};
	
	public void setDefaultControlesEstadoComision() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoComision(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadocomisionSessionBean.setConGuardarRelaciones(true);			
			this.estadocomisionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoComision.jTabbedPaneRelacionesEstadoComision.setVisible(true);
			
					
		} else {
			//this.estadocomisionSessionBean.setConGuardarRelaciones(false);			
			this.estadocomisionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoComision.jTabbedPaneRelacionesEstadoComision.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEstadoComision() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoComision estadocomisionAux:this.estadocomisionLogic.getEstadoComisions()) {
				if(estadocomisionAux.getId().equals(this.iIdNuevoEstadoComision)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoComision estadocomisionAux:this.estadocomisions) {
				if(estadocomisionAux.getId().equals(this.iIdNuevoEstadoComision)) {
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
	
	public int getIndiceActualEstadoComision(EstadoComision estadocomision,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoComision estadocomisionAux:this.estadocomisionLogic.getEstadoComisions()) {
				if(estadocomisionAux.getId().equals(estadocomision.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoComision estadocomisionAux:this.estadocomisions) {
				if(estadocomisionAux.getId().equals(estadocomision.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoComision(EstadoComision estadocomisionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoComision estadocomisionAux:this.estadocomisionLogic.getEstadoComisions()) {
				if(estadocomisionAux.getEstadoComisionOriginal().getId().equals(estadocomisionOriginal.getId())) {
					existe=true;
					estadocomisionOriginal.setId(estadocomisionAux.getId());
					estadocomisionOriginal.setVersionRow(estadocomisionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoComision estadocomisionAux:this.estadocomisions) {
				if(estadocomisionAux.getEstadoComisionOriginal().getId().equals(estadocomisionOriginal.getId())) {
					existe=true;
					estadocomisionOriginal.setId(estadocomisionAux.getId());
					estadocomisionOriginal.setVersionRow(estadocomisionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoComision(Boolean esParaCancelar) throws Exception {
		estadocomisionsAux=new ArrayList<EstadoComision>();
		estadocomisionAux=new EstadoComision();
		
		if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoComision estadocomisionAux:this.estadocomisionLogic.getEstadoComisions()) {
					if(estadocomisionAux.getId()<0) {
						estadocomisionsAux.add(estadocomisionAux);
					}		
				}
				this.iIdNuevoEstadoComision=0L;
				this.estadocomisionLogic.getEstadoComisions().removeAll(estadocomisionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoComision estadocomisionAux:this.estadocomisions) {
					if(estadocomisionAux.getId()<0) {
						estadocomisionsAux.add(estadocomisionAux);
					}		
				}
				this.iIdNuevoEstadoComision=0L;
				this.estadocomisions.removeAll(estadocomisionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoComision 
					&& this.estadocomisionLogic.getEstadoComisions().size()>0
					) {
					estadocomisionAux=this.estadocomisionLogic.getEstadoComisions().get(this.estadocomisionLogic.getEstadoComisions().size() - 1);
				
					if(estadocomisionAux.getId()<0) {
						this.estadocomisionLogic.getEstadoComisions().remove(estadocomisionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoComision && this.estadocomisions.size()>0) {
					estadocomisionAux=this.estadocomisions.get(this.estadocomisions.size() - 1);
				
					if(estadocomisionAux.getId()<0) {
						this.estadocomisions.remove(estadocomisionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoComision(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadocomision.getId()<0) {
				this.estadocomisionLogic.getEstadoComisions().remove(this.estadocomision);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadocomision.getId()<0) {
				this.estadocomisions.remove(this.estadocomision);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoComision(List<EstadoComision> estadocomisionsAux) throws Exception {
		EstadoComisionConstantesFunciones.setEstadosInicialesEstadoComision(estadocomisionsAux);
	}
	
	public void setEstadosInicialesEstadoComision(EstadoComision estadocomisionAux) throws Exception {
		EstadoComisionConstantesFunciones.setEstadosInicialesEstadoComision(estadocomisionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoComisionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoComision("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoComisionActual()) {
				if(!this.isEsNuevoEstadoComision) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoComision("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoComision=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoComisionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Comision ?", "MANTENIMIENTO DE Estado Comision", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoComision("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoComision estadocomision) throws Exception {
		EstadoComisionConstantesFunciones.seleccionarAsignar(this.estadocomision,estadocomision);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoComision=this.isPermisoActualizarOriginalEstadoComision;
			
			
			this.seleccionarAsignar(estadocomision);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoComisionConstantesFunciones.quitarEspaciosEstadoComision(this.estadocomision,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoComision("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadocomisionSessionBean.setsFuncionBusquedaRapida(this.estadocomisionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoComision) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoComision(esParaCancelar);				
				this.cancelarNuevoEstadoComision(esParaCancelar);								
			}
			
			this.estadocomision=new EstadoComision();
			
			this.inicializarEstadoComision();
			
			this.actualizarEstadoCeldasBotonesEstadoComision("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoComision() throws Exception {
		try {
			EstadoComisionConstantesFunciones.inicializarEstadoComision(this.estadocomision);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadocomisionLogic.getEstadoComisions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoComisions(String sAccionBusqueda,List<EstadoComision> estadocomisionsParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoComision"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoComisionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoComisionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoComision"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Comisiones");		
		parameters.put("busquedapor", EstadoComisionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoComision=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoComisionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoComisionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoComision=new JRBeanArrayDataSource(EstadoComisionJInternalFrame.TraerEstadoComisionBeans(estadocomisionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoComision);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoComisionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoComisionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoComisionBean.TraerEstadoComisionBeans(estadocomisionsParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoComisions(sAccionBusqueda,sTipoArchivoReporte,estadocomisionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoComisions(sAccionBusqueda,sTipoArchivoReporte,estadocomisionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoComisionActionPerformed(null);
					//this.generarExcelReporteEstadoComisions(sAccionBusqueda,sTipoArchivoReporte,estadocomisionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoComisions(sAccionBusqueda,sTipoArchivoReporte,estadocomisionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoComisions(sAccionBusqueda,sTipoArchivoReporte,estadocomisionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoComisions(sAccionBusqueda,sTipoArchivoReporte,estadocomisionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoComisions(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoComision> estadocomisionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocomision";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoComisions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoComision("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoComision estadocomision : estadocomisionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoComisionConstantesFunciones.generarExcelReporteDataEstadoComision("NORMAL",row,workbook,estadocomision,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Comision",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoComision(String sTipo,Row row,Workbook workbook) {
		
		EstadoComisionConstantesFunciones.generarExcelReporteHeaderEstadoComision(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoComisions(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoComision> estadocomisionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocomision_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoComisions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoComision estadocomision : estadocomisionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoComisionConstantesFunciones.getEstadoComisionDescripcion(estadocomision));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoComisionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoComisionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadocomision.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoComisionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoComisionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadocomision.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Comision",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoComisions(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoComision> estadocomisionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoComision> estadocomisionsRespaldo=null;
		
		classes=EstadoComisionConstantesFunciones.getClassesRelationshipsOfEstadoComision(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadocomisionLogic.setDatosCliente(this.datosCliente);
		this.estadocomisionLogic.setDatosDeep(this.datosDeep);
		this.estadocomisionLogic.setIsConDeep(true);
		
		estadocomisionsRespaldo=this.estadocomisionLogic.getEstadoComisions();
		
		this.estadocomisionLogic.setEstadoComisions(estadocomisionsParaReportes);	
		this.estadocomisionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadocomisionsParaReportes=this.estadocomisionLogic.getEstadoComisions();
		this.estadocomisionLogic.setEstadoComisions(estadocomisionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocomision_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoComisions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoComision("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoComision estadocomision : estadocomisionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoComision("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoComisionConstantesFunciones.generarExcelReporteDataEstadoComision("NORMAL",row,workbook,estadocomision,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoComisionConstantesFunciones.getEstadoComisionDescripcion(estadocomision));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Comision",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoComision.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoComision.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoComision.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoComision.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoComision() throws Exception {		
		this.startProcessEstadoComision(true);
	}
	
	public void startProcessEstadoComision(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoComision, this.jScrollPanelDatosEstadoComision,this.jPanelPaginacionEstadoComision, this.jScrollPanelDatosEdicionEstadoComision, this.jPanelAccionesEstadoComision,this.jPanelAccionesFormularioEstadoComision,this.jmenuBarEstadoComision,this.jmenuBarDetalleEstadoComision,this.jTtoolBarEstadoComision,this.jTtoolBarDetalleEstadoComision);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoComision=null; 
		
		final JPanel jPanelParametrosReportesEstadoComision=this.jPanelParametrosReportesEstadoComision;
		//final JScrollPane jScrollPanelDatosEstadoComision=this.jScrollPanelDatosEstadoComision;
		final JTable jTableDatosEstadoComision=this.jTableDatosEstadoComision;		
		final JPanel jPanelPaginacionEstadoComision=this.jPanelPaginacionEstadoComision;
		//final JScrollPane jScrollPanelDatosEdicionEstadoComision=this.jScrollPanelDatosEdicionEstadoComision;
		final JPanel jPanelAccionesEstadoComision=this.jPanelAccionesEstadoComision;
		
		JPanel jPanelCamposAuxiliarEstadoComision=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoComision=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) {
			jPanelCamposAuxiliarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jPanelCamposEstadoComision;
			jPanelAccionesFormularioAuxiliarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jPanelAccionesFormularioEstadoComision;
		}
		
		final JPanel jPanelCamposEstadoComision=jPanelCamposAuxiliarEstadoComision;
		final JPanel jPanelAccionesFormularioEstadoComision=jPanelAccionesFormularioAuxiliarEstadoComision;
		
		
		final JMenuBar jmenuBarEstadoComision=this.jmenuBarEstadoComision;
		final JToolBar jTtoolBarEstadoComision=this.jTtoolBarEstadoComision;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoComision=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoComision=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) {
			jmenuBarDetalleAuxiliarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jmenuBarDetalleEstadoComision;
			jTtoolBarDetalleAuxiliarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jTtoolBarDetalleEstadoComision;
		}
		
		final JMenuBar jmenuBarDetalleEstadoComision=jmenuBarDetalleAuxiliarEstadoComision;
		final JToolBar jTtoolBarDetalleEstadoComision=jTtoolBarDetalleAuxiliarEstadoComision;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoComision;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoComision;
			processRunnable.jTableDatos=jTableDatosEstadoComision;
			processRunnable.jPanelCampos=jPanelCamposEstadoComision;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoComision;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoComision;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoComision;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoComision;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoComision;
			processRunnable.jTtoolBar=jTtoolBarEstadoComision;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoComision;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoComision ,jPanelParametrosReportesEstadoComision,jTableDatosEstadoComision, /*jScrollPanelDatosEstadoComision,*/jPanelCamposEstadoComision,jPanelPaginacionEstadoComision, /*jScrollPanelDatosEdicionEstadoComision,*/ jPanelAccionesEstadoComision,jPanelAccionesFormularioEstadoComision,jmenuBarEstadoComision,jmenuBarDetalleEstadoComision,jTtoolBarEstadoComision,jTtoolBarDetalleEstadoComision);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoComision, jScrollPanelDatosEstadoComision,jPanelPaginacionEstadoComision, jScrollPanelDatosEdicionEstadoComision, jPanelAccionesEstadoComision,jPanelAccionesFormularioEstadoComision,jmenuBarEstadoComision,jmenuBarDetalleEstadoComision,jTtoolBarEstadoComision,jTtoolBarDetalleEstadoComision);
						
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
	
	public void finishProcessEstadoComision() {// throws Exception 
		this.finishProcessEstadoComision(true);
	}
	
	public void finishProcessEstadoComision(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoComision, this.jScrollPanelDatosEstadoComision,this.jPanelPaginacionEstadoComision, this.jScrollPanelDatosEdicionEstadoComision, this.jPanelAccionesEstadoComision,this.jPanelAccionesFormularioEstadoComision,this.jmenuBarEstadoComision,this.jmenuBarDetalleEstadoComision,this.jTtoolBarEstadoComision,this.jTtoolBarDetalleEstadoComision);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoComision=null; 
		
		final JPanel jPanelParametrosReportesEstadoComision=this.jPanelParametrosReportesEstadoComision;
		//final JScrollPane jScrollPanelDatosEstadoComision=this.jScrollPanelDatosEstadoComision;
		final JTable jTableDatosEstadoComision=this.jTableDatosEstadoComision;		
		final JPanel jPanelPaginacionEstadoComision=this.jPanelPaginacionEstadoComision;
		//final JScrollPane jScrollPanelDatosEdicionEstadoComision=this.jScrollPanelDatosEdicionEstadoComision;
		final JPanel jPanelAccionesEstadoComision=this.jPanelAccionesEstadoComision;
		
		JPanel jPanelCamposAuxiliarEstadoComision=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoComision=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) {
			jPanelCamposAuxiliarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jPanelCamposEstadoComision;
			jPanelAccionesFormularioAuxiliarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jPanelAccionesFormularioEstadoComision;
		}
		
		final JPanel jPanelCamposEstadoComision=jPanelCamposAuxiliarEstadoComision;
		final JPanel jPanelAccionesFormularioEstadoComision=jPanelAccionesFormularioAuxiliarEstadoComision;
		
		
		final JMenuBar jmenuBarEstadoComision=this.jmenuBarEstadoComision;		
		final JToolBar jTtoolBarEstadoComision=this.jTtoolBarEstadoComision;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoComision=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoComision=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) {
			jmenuBarDetalleAuxiliarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jmenuBarDetalleEstadoComision;
			jTtoolBarDetalleAuxiliarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jTtoolBarDetalleEstadoComision;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoComision=jmenuBarDetalleAuxiliarEstadoComision;
		final JToolBar jTtoolBarDetalleEstadoComision=jTtoolBarDetalleAuxiliarEstadoComision;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoComision;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoComision;
			processRunnable.jTableDatos=jTableDatosEstadoComision;
			processRunnable.jPanelCampos=jPanelCamposEstadoComision;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoComision;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoComision;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoComision;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoComision;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoComision;
			processRunnable.jTtoolBar=jTtoolBarEstadoComision;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoComision;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoComision ,jPanelParametrosReportesEstadoComision, jTableDatosEstadoComision,/*jScrollPanelDatosEstadoComision,*/jPanelCamposEstadoComision,jPanelPaginacionEstadoComision, /*jScrollPanelDatosEdicionEstadoComision,*/ jPanelAccionesEstadoComision,jPanelAccionesFormularioEstadoComision,jmenuBarEstadoComision,jmenuBarDetalleEstadoComision,jTtoolBarEstadoComision,jTtoolBarDetalleEstadoComision));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoComision(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoComision(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoComision(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoComision(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoComision,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoComision,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoComision(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoComision,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoComision,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadocomisionConstantesFunciones.getsFinalQueryEstadoComision();
		String  finalQueryPaginacionTodos=this.estadocomisionConstantesFunciones.getsFinalQueryEstadoComision();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoComisionConstantesFunciones.getArrayColumnasGlobalesNoEstadoComision(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoComisionConstantesFunciones.getArrayColumnasGlobalesEstadoComision(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoComisionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadocomisionsEliminados= new ArrayList<EstadoComision>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoComision();
		
				///*EstadoComisionSessionBean*/this.estadocomisionSessionBean=new EstadoComisionSessionBean();
			
			if(this.estadocomisionSessionBean==null) {
				this.estadocomisionSessionBean=new EstadoComisionSessionBean();
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
					this.iNumeroPaginacion=EstadoComisionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoComisionConstantesFunciones.getClassesForeignKeysOfEstadoComision(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadocomision."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadocomisionsAux= new ArrayList<EstadoComision>();
			
				
			estadocomisionLogic.setDatosCliente(this.datosCliente);
			estadocomisionLogic.setDatosDeep(this.datosDeep);
			estadocomisionLogic.setIsConDeep(true);
			
			
			estadocomisionLogic.getEstadoComisionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadocomisionLogic.getTodosEstadoComisions(finalQueryGlobal,pagination);
					
					//estadocomisionLogic.getTodosEstadoComisionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadocomisionLogic.getEstadoComisions()==null|| estadocomisionLogic.getEstadoComisions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadocomisionsAux= new ArrayList<EstadoComision>();
							estadocomisionsAux.addAll(estadocomisionLogic.getEstadoComisions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadocomisionsAux= new ArrayList<EstadoComision>();
							estadocomisionsAux.addAll(estadocomisions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadocomisionLogic.getTodosEstadoComisions(finalQueryGlobal+"",this.pagination);												
							
							//estadocomisionLogic.getTodosEstadoComisionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoComisions("Todos",estadocomisionLogic.getEstadoComisions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadocomisionLogic.setEstadoComisions(new ArrayList<EstadoComision>());					
							estadocomisionLogic.getEstadoComisions().addAll(estadocomisionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadocomisions=new ArrayList<EstadoComision>();
							estadocomisions.addAll(estadocomisionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoComision=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoComision=this.idActual;
				
				} else if(this.idEstadoComisionActual!=null && this.idEstadoComisionActual!=0L) {
					idEstadoComision=idEstadoComisionActual;
				}
				
					
				this.sDetalleReporte=EstadoComisionConstantesFunciones.getDetalleIndicePorId(idEstadoComision);
				
				this.estadocomisions=new ArrayList<EstadoComision>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadocomisionLogic.getEntity(idEstadoComision);
					
					//estadocomisionLogic.getEntityWithConnection(idEstadoComision);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocomisionLogic.setEstadoComisions(new ArrayList<EstadoComision>());
					estadocomisionLogic.getEstadoComisions().add(estadocomisionLogic.getEstadoComision());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadocomisions=new ArrayList<EstadoComision>();
					this.estadocomisions.add(estadocomision);
				}
				
				if(estadocomisionLogic.getEstadoComision()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoComision();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoComision();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadocomisionLogic.getEstadoComisions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadocomisions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadocomisionLogic.getEstadoComisions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadocomisions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoComision estadocomision) {
		Boolean permite=true;
		
		if(this.estadocomision.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoComisionConstantesFunciones.getOrderByListaEstadoComision();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoComisionConstantesFunciones.getOrderByListaEstadoComision();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoComision estadocomision:estadocomisionLogic.getEstadoComisions()) {
				if(estadocomision.getsType().equals(Constantes2.S_TOTALES)) {
					estadocomisionTotales=estadocomision;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoComision estadocomision:this.estadocomisions) {
				if(estadocomision.getsType().equals(Constantes2.S_TOTALES)) {
					estadocomisionTotales=estadocomision;
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
			this.estadocomisionAux=new EstadoComision();
			this.estadocomisionAux.setsType(Constantes2.S_TOTALES);
			this.estadocomisionAux.setIsNew(false);
			this.estadocomisionAux.setIsChanged(false);
			this.estadocomisionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoComisionConstantesFunciones.TotalizarValoresFilaEstadoComision(this.estadocomisionLogic.getEstadoComisions(),this.estadocomisionAux);
				
				this.estadocomisionLogic.getEstadoComisions().add(this.estadocomisionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoComisionConstantesFunciones.TotalizarValoresFilaEstadoComision(this.estadocomisions,this.estadocomisionAux);
				
				this.estadocomisions.add(this.estadocomisionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadocomisionTotales=new EstadoComision();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadocomisionLogic.getEstadoComisions().remove(estadocomisionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadocomisions.remove(estadocomisionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadocomisionTotales=new EstadoComision();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoComision estadocomision:estadocomisionLogic.getEstadoComisions()) {
				if(estadocomision.getsType().equals(Constantes2.S_TOTALES)) {
					estadocomisionTotales=estadocomision;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoComisionConstantesFunciones.TotalizarValoresFilaEstadoComision(this.estadocomisionLogic.getEstadoComisions(),estadocomisionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoComision estadocomision:this.estadocomisions) {
				if(estadocomision.getsType().equals(Constantes2.S_TOTALES)) {
					estadocomisionTotales=estadocomision;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoComisionConstantesFunciones.TotalizarValoresFilaEstadoComision(this.estadocomisions,estadocomisionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoComisionPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoComisionPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocomisionLogic.getEstadoComisionPorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoComision() {
		this.isPermisoTodoEstadoComision=false;
		this.isPermisoNuevoEstadoComision=false;
		this.isPermisoActualizarEstadoComision=false;
		this.isPermisoActualizarOriginalEstadoComision=false;
		this.isPermisoEliminarEstadoComision=false;
		this.isPermisoGuardarCambiosEstadoComision=false;
		this.isPermisoConsultaEstadoComision=false;
		this.isPermisoBusquedaEstadoComision=false;
		this.isPermisoReporteEstadoComision=false;		
		this.isPermisoOrdenEstadoComision=false;		
		this.isPermisoPaginacionMedioEstadoComision=false;		
		this.isPermisoPaginacionAltoEstadoComision=false;
		this.isPermisoPaginacionTodoEstadoComision=false;
		this.isPermisoCopiarEstadoComision=false;		
		this.isPermisoVerFormEstadoComision=false;		
		this.isPermisoDuplicarEstadoComision=false;		
		this.isPermisoOrdenEstadoComision=false;		
	}
	
	public void setPermisosUsuarioEstadoComision(Boolean isPermiso) {
		this.isPermisoTodoEstadoComision=isPermiso;
		this.isPermisoNuevoEstadoComision=isPermiso;
		this.isPermisoActualizarEstadoComision=isPermiso;
		this.isPermisoActualizarOriginalEstadoComision=isPermiso;
		this.isPermisoEliminarEstadoComision=isPermiso;
		this.isPermisoGuardarCambiosEstadoComision=isPermiso;
		this.isPermisoConsultaEstadoComision=isPermiso;
		this.isPermisoBusquedaEstadoComision=isPermiso;
		this.isPermisoReporteEstadoComision=isPermiso;
		this.isPermisoOrdenEstadoComision=isPermiso;		
		this.isPermisoPaginacionMedioEstadoComision=isPermiso;		
		this.isPermisoPaginacionAltoEstadoComision=isPermiso;		
		this.isPermisoPaginacionTodoEstadoComision=isPermiso;		
		this.isPermisoCopiarEstadoComision=isPermiso;		
		this.isPermisoVerFormEstadoComision=isPermiso;		
		this.isPermisoDuplicarEstadoComision=isPermiso;
		this.isPermisoOrdenEstadoComision=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoComision(Boolean isPermiso) {
		//this.isPermisoTodoEstadoComision=isPermiso;
		this.isPermisoNuevoEstadoComision=isPermiso;
		this.isPermisoActualizarEstadoComision=isPermiso;
		this.isPermisoActualizarOriginalEstadoComision=isPermiso;
		this.isPermisoEliminarEstadoComision=isPermiso;
		this.isPermisoGuardarCambiosEstadoComision=isPermiso;
		//this.isPermisoConsultaEstadoComision=isPermiso;
		//this.isPermisoBusquedaEstadoComision=isPermiso;
		//this.isPermisoReporteEstadoComision=isPermiso;
		//this.isPermisoOrdenEstadoComision=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoComision=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoComision=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoComision=isPermiso;		
		//this.isPermisoCopiarEstadoComision=isPermiso;		
		//this.isPermisoDuplicarEstadoComision=isPermiso;
		//this.isPermisoOrdenEstadoComision=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoComisionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EstadoComisionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoComision(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoComisionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoComisionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoComisionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoComisionClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEstadoComision() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoComisionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoComisionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoComision=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoComision=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoComision=this.isPermisoActualizarEstadoComision;
			this.isPermisoEliminarEstadoComision=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoComision=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoComision=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoComision=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoComision=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoComision=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoComision=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoComision=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoComision=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoComision=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoComision=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoComision=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoComision=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoComision=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoComision.setToolTipText(this.jTableDatosEstadoComision.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoComision(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoComision(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoComisionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoComisionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoComision() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyEstadoComisionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoComisionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoComisionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoComisionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoComisionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoComision()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoComision()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoComision(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoComision()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoComision();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoComision(EstadoComision estadocomision)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoComision(EstadoComision estadocomision,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoComision()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoComision()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoComision()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoComision()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoComision()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoComision()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoComision(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoComision()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoComisionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoComisionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoComisionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadocomisionSessionBean=new EstadoComisionSessionBean(); 
		this.estadocomisionConstantesFunciones=new EstadoComisionConstantesFunciones(); 
		this.estadocomisionBean=new EstadoComision();//(this.estadocomisionConstantesFunciones); 		
		this.estadocomisionReturnGeneral=new EstadoComisionParameterReturnGeneral(); 
		
		this.estadocomisionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadocomisionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoComisionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoComisionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoComisionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoComision(true);
			
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
			
			this.estadocomisionConstantesFunciones=new EstadoComisionConstantesFunciones(); 
			this.estadocomisionBean=new EstadoComision();//this.estadocomisionConstantesFunciones); 			
			this.estadocomisionReturnGeneral=new EstadoComisionParameterReturnGeneral(); 
		
			EstadoComisionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Comision Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadocomision=new EstadoComision();
			this.estadocomisions = new ArrayList<EstadoComision>();
			this.estadocomisionsAux = new ArrayList<EstadoComision>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic=new EstadoComisionLogic();
				this.estadocomisionLogic.getNewConnexionToDeep("");
			}
			
			//this.estadocomisionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadocomisionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoComision);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoComision!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoComision);	
					}
					
					if(this.jInternalFrameImportacionEstadoComision!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoComision);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoComision!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoComision);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoComision!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoComision);
				this.jInternalFrameDetalleFormEstadoComision.setVisible(false);
				this.jInternalFrameDetalleFormEstadoComision.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoComision!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoComision);
					this.jInternalFrameReporteDinamicoEstadoComision.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoComision.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoComision!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoComision);
					this.jInternalFrameImportacionEstadoComision.setVisible(false);
					this.jInternalFrameImportacionEstadoComision.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoComision!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoComision);
					this.jInternalFrameOrderByEstadoComision.setVisible(false);
					this.jInternalFrameOrderByEstadoComision.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoComisionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoComisionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadocomisionReturnGeneral=new EstadoComisionParameterReturnGeneral();
			
			this.estadocomisionParameterGeneral=new EstadoComisionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadocomisionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoComisionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoComisionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadocomisionSessionBean.getEsGuardarRelacionado(),this.estadocomisionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoComisionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadocomisionSessionBean.getEsGuardarRelacionado(),this.estadocomisionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoComision=false;
			this.isVisibilidadCeldaDuplicarEstadoComision=true;
			this.isVisibilidadCeldaCopiarEstadoComision=true;
			this.isVisibilidadCeldaVerFormEstadoComision=true;
			this.isVisibilidadCeldaOrdenEstadoComision=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoComision=false;
			this.isVisibilidadCeldaModificarEstadoComision=false;
			this.isVisibilidadCeldaActualizarEstadoComision=false;
			this.isVisibilidadCeldaEliminarEstadoComision=false;
			this.isVisibilidadCeldaCancelarEstadoComision=false;
			this.isVisibilidadCeldaGuardarEstadoComision=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoComision=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoComision("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoComision();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoComision(false);
			
			this.setPermisosUsuarioEstadoComision();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadocomisionSessionBean.getEsGuardarRelacionado() 
				|| (this.estadocomisionSessionBean.getEsGuardarRelacionado() && this.estadocomisionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoComisionClasesRelacionadas();
			}
			
			if(this.estadocomisionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoComisionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoComisionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoComision();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoComision();
			}
			
			if(!this.isPermisoBusquedaEstadoComision) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoComision,this.isPermisoPaginacionMedioEstadoComision,this.isPermisoPaginacionTodoEstadoComision);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoComisionConstantesFunciones.getTiposSeleccionarEstadoComision());
				
				this.tiposColumnasSelect=EstadoComisionConstantesFunciones.getTiposSeleccionarEstadoComision(true);
				
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
			//if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoComision();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoComision(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoComision(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoComision() ;
			
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
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				estadocomisionImplementable= (EstadoComisionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoComisionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadocomisionImplementableHome= (EstadoComisionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoComisionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadocomisions= new ArrayList<EstadoComision>();
			this.estadocomisionsEliminados= new ArrayList<EstadoComision>();
						
			this.isEsNuevoEstadoComision=false;
			this.esParaAccionDesdeFormularioEstadoComision=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoComision(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoComision();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EstadoComisionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoComisionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoComision("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoComision(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoComision!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoComision();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoComision();
			}
			
			EstadoComisionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoComision(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoComision: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoComision() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoComision")) {
				iIndex=this.jInternalFrameDetalleFormEstadoComision.jTabbedPaneRelacionesEstadoComision.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoComision.jTabbedPaneRelacionesEstadoComision.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoComision();	
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
	
	public void cargarCombosForeignKeyEstadoComision(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoComision(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoComision(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoComisionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoComision();
		
		this.cargarCombosFrameForeignKeyEstadoComision();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoComision();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoComision();
		}
	}
	
	
	
	public void jButtonNuevoEstadoComisionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadocomisionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoComision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			
			
			if(jTableDatosEstadoComision.getRowCount()>=1) {
				jTableDatosEstadoComision.removeRowSelectionInterval(0, jTableDatosEstadoComision.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoComision=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoComision(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoComision(true);			
			//this.estadocomision=new EstadoComision();
			//this.estadocomision.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoComision(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoComision() ;
			
			if(EstadoComisionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoComision(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadocomision);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);				
			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			
			if(this.estadocomisionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoComision: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoComisionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoComision.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoComision.getSelectedRows().length;			
			}
			
			estadocomisionsSeleccionados=this.getEstadoComisionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoComision--;			
				//EstadoComision estadocomisionAux= new EstadoComision();			
				//estadocomisionAux.setId(this.iIdNuevoEstadoComision);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoComision estadocomisionOrigen=new EstadoComision();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoComision estadocomisionOrigen : estadocomisionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadocomisionOrigen =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadocomisionOrigen =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoComision();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadocomision.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoComision(estadocomisionOrigen,this.estadocomision,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(this.estadocomision);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadocomisionLogic.getEstadoComisions().add(this.estadocomisionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadocomisions.add(this.estadocomisionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoComision(false);
				
				this.jTableDatosEstadoComision.setRowSelectionInterval(this.getIndiceNuevoEstadoComision(), this.getIndiceNuevoEstadoComision());
				
				int iLastRow =  this.jTableDatosEstadoComision.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoComision.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoComision.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoComision(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoComisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();									
		
			EstadoComision estadocomisionOrigen=new EstadoComision();
			EstadoComision estadocomisionDestino=new EstadoComision();
				
			estadocomisionsSeleccionados=this.getEstadoComisionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoComision.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadocomisionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoComision.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocomisionOrigen =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadocomisionOrigen =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadocomisionDestino =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadocomisionDestino =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadocomisionOrigen =estadocomisionsSeleccionados.get(0);
				estadocomisionDestino =estadocomisionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoComision(estadocomisionOrigen,estadocomisionDestino,true,false);
				
				estadocomisionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadocomisionDestino,estadocomisionLogic.getEstadoComisions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadocomisionDestino,estadocomisions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoComision(false);
				
				//this.jTableDatosEstadoComision.setRowSelectionInterval(this.getIndiceNuevoEstadoComision(), this.getIndiceNuevoEstadoComision());
				
				int iLastRow =  this.jTableDatosEstadoComision.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoComision.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoComision.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoComision(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoComisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoComision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoComision.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoComisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoComision.isVisible();
			
			
			this.jPanelParametrosReportesEstadoComision.setVisible(!isVisible);
			this.jPanelPaginacionEstadoComision.setVisible(!isVisible);
			this.jPanelAccionesEstadoComision.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoComisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoComision();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoComisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoComision();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoComisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoComision();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoComisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoComision();
			
			this.abrirFrameOrderByEstadoComision();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoComisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoComision();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoComision(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoComision);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoComision.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoComision.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoComision.setSize(this.jInternalFrameDetalleFormEstadoComision.iWidthFormulario,this.jInternalFrameDetalleFormEstadoComision.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoComision.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoComision.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoComision.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoComision.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoComision.jContentPaneDetalleEstadoComision.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoComision.jTabbedPaneRelacionesEstadoComision.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoComision.jContentPaneDetalleEstadoComision.getWidth(),EstadoComisionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoComision.jTabbedPaneRelacionesEstadoComision.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoComision.jContentPaneDetalleEstadoComision.getWidth(),EstadoComisionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoComision.jTabbedPaneRelacionesEstadoComision.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoComision.jContentPaneDetalleEstadoComision.getWidth(),EstadoComisionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoComision.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoComision.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoComision() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoComision==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoComision=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoComision,false,this);
				} else {
					this.jInternalFrameOrderByEstadoComision=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoComision,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoComision);
				this.jInternalFrameOrderByEstadoComision.setVisible(false);
				this.jInternalFrameOrderByEstadoComision.setSelected(false);
				
				this.jInternalFrameOrderByEstadoComision.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoComision"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoComision();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoComision() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoComision==null) {
				
				this.jInternalFrameImportacionEstadoComision=new ImportacionJInternalFrame(EstadoComisionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoComision);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoComision);
				this.jInternalFrameImportacionEstadoComision.setVisible(false);
				this.jInternalFrameImportacionEstadoComision.setSelected(false);


				this.jInternalFrameImportacionEstadoComision.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoComision"));
				this.jInternalFrameImportacionEstadoComision.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoComision"));
				this.jInternalFrameImportacionEstadoComision.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoComision"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoComision() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoComision==null) {
				this.jInternalFrameReporteDinamicoEstadoComision=new ReporteDinamicoJInternalFrame(EstadoComisionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoComision);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoComision);
				this.jInternalFrameReporteDinamicoEstadoComision.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoComision.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoComision.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoComision"));
				this.jInternalFrameReporteDinamicoEstadoComision.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoComision"));
				this.jInternalFrameReporteDinamicoEstadoComision.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoComision"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoComision();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEstadoComision() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoComision);
			
	       	this.jInternalFrameDetalleFormEstadoComision.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoComision.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoComision.dispose();
			//this.jInternalFrameDetalleFormEstadoComision=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoComision() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoComision.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoComision.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoComision() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoComision.setVisible(true);
	        this.jInternalFrameImportacionEstadoComision.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoComision() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoComision.setVisible(true);
	        this.jInternalFrameOrderByEstadoComision.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoComision() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoComision.setVisible(false);
	        this.jInternalFrameOrderByEstadoComision.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoComision() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoComision.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoComision.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoComision() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoComision.setVisible(false);
	        this.jInternalFrameImportacionEstadoComision.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoComisionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoComision(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoComision(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoComision(true);
			//this.isEsNuevoEstadoComision=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomision =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocomision =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoComision("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoComision(false) ;
			
			if(estadocomisionSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EstadoComisionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoComision(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoComision(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoComisionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomision =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocomision =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoComision(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoComision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoComision(true);
			//this.isEsNuevoEstadoComision=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomision =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocomision =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadocomision.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoComision("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoComision(false) ;
			
			if(EstadoComisionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoComision(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoComision(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoComisionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoComision(false);
			
			//if(!this.isEsNuevoEstadoComision) {								
				int intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomision =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadocomision =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoComisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoComision(this.estadocomision,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(this.estadocomision);
				
			}
			
			if(this.permiteMantenimiento(this.estadocomision)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoComision=true;
					this.inicializarActualizarBindingTablaEstadoComision(false);
					this.isEsNuevoEstadoComision=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoComision=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoComision=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoComision(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoComision(false);
				
				this.habilitarDeshabilitarControlesEstadoComision(false);
			
												
				
				if(EstadoComisionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoComision();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoComisionActionPerformed(evt,estadocomisionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoComision(this.estadocomision,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoComision.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadocomisionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadocomision.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoComision.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoComision.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoComisionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomision =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				this.estadocomision.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadocomision =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				this.estadocomision.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadocomision)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoComisionModel) this.jTableDatosEstadoComision.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoComision=true;
				this.inicializarActualizarBindingTablaEstadoComision(false);
				this.isEsNuevoEstadoComision=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoComision(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoComision(false);
				
				this.habilitarDeshabilitarControlesEstadoComision(false);
				
				
				
				if(EstadoComisionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoComision();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoComisionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoComision.getRowCount()>=1) {
				jTableDatosEstadoComision.removeRowSelectionInterval(0, jTableDatosEstadoComision.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoComision(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoComision(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoComision(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoComision(false) ;
			
			this.isEsNuevoEstadoComision=false;
			
			if(EstadoComisionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoComision();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoComisionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoComision(false);
				
				//SI ES MANUAL
				if(EstadoComisionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoComision();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoComisionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoComision--;			
			//EstadoComision estadocomisionAux= new EstadoComision();			
			//estadocomisionAux.setId(this.iIdNuevoEstadoComision);
			
			if(this.jInternalFrameDetalleFormEstadoComision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoComision();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(this.estadocomision);
			
			this.estadocomision.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadocomisionLogic.getEstadoComisions().add(this.estadocomisionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadocomisions.add(this.estadocomisionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoComision(false);
			
			this.jTableDatosEstadoComision.setRowSelectionInterval(this.getIndiceNuevoEstadoComision(), this.getIndiceNuevoEstadoComision());
			
			int iLastRow =  this.jTableDatosEstadoComision.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoComision.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoComision.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoComision(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoComisionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoComision(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoComision(false);
			
			//SI ES MANUAL
			if(EstadoComisionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoComision();
			}
			
			//this.abrirFrameTreeEstadoComision();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoComisionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado ComisionES ?", "MANTENIMIENTO DE Estado Comision", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoComision.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoComision();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadocomisionReturnGeneral=estadocomisionLogic.procesarImportacionEstadoComisionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadocomisionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoComisionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoComisionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoComision.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoComision.setFileImportacion(this.jInternalFrameImportacionEstadoComision.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoComision.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoComision.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoComision.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoComision.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoComisionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();		

		estadocomisionsSeleccionados=this.getEstadoComisionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoComision.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoComision.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoComisionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoComisionBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoComisions("Todos",estadocomisionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Comision",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoComision.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoComision.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoComisionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoComisionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoComision.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoComision.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoComision.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoComisionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoComisionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoComision.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoComisionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoComisionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoComision.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoComision.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoComisionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoComisionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoComisionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();		
		
		estadocomisionsSeleccionados=this.getEstadoComisionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocomision";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoComisions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoComision.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoComision.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoComisionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoComisionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoComision estadocomision:estadocomisionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadocomision.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoComisionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoComisionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoComision estadocomision:estadocomisionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadocomision.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoComision(row);				
			//	iRow++;
			//}				
			
			//for(EstadoComision estadocomisionAux:estadocomisionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoComision(estadocomisionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Comision",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadocomisionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoComision(false);
			
			//SI ES MANUAL
			if(EstadoComisionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoComision();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoComisionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoComision(false);
			
			//SI ES MANUAL
			if(EstadoComisionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoComision();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoComisionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoComision(false);
			
			//SI ES MANUAL
			if(EstadoComisionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoComision();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadocomisionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoComision() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoComision.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoComision.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoComision.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoComision.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoComision.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoComision.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoComision.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoComision(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoComision(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoComision(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoComision(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoComision(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoComision(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoComision(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoComision(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoComisionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoComisionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoComision() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoComision();
		
		this.inicializarActualizarBindingBotonesManualEstadoComision(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoComision();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoComision() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoComision(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoComision(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoComision.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoComision.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoComision.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoComision!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoComision.jCheckBoxPostAccionNuevoEstadoComision.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoComision.jCheckBoxPostAccionSinCerrarEstadoComision.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoComision.jCheckBoxPostAccionSinMensajeEstadoComision.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoComision.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoComision.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoComision.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoComision!=null) {
				this.jInternalFrameDetalleFormEstadoComision.jCheckBoxPostAccionNuevoEstadoComision.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoComision.jCheckBoxPostAccionSinCerrarEstadoComision.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoComision.jCheckBoxPostAccionSinMensajeEstadoComision.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoComision.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoComision.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoComision!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoComision.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoComision!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoComision.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoComision.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoComision.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoComision.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoComision.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoComision!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoComision.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoComision.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoComision.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoComision(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoComisionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoComision(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoComision() throws Exception {
		try	{
			if(EstadoComisionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoComision();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoComision() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoComision() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoComision.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoComision.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoComision.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoComision.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoComision.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoComision.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoComision.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoComision.addItem(reporte);
			}
			
			
			if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoComision.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoComision.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoComision.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoComision.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoComision.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoComision.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoComision.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoComision.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoComision.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoComision();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoComision() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoComision!=null) {
				this.jInternalFrameReporteDinamicoEstadoComision.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoComision.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoComision!=null) {
				this.jInternalFrameReporteDinamicoEstadoComision.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoComision.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoComision!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoComision.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoComision.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoComision.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoComision.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoComision.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoComision.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoComision()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoComision(Boolean esInicializar) throws Exception {				
		if(EstadoComisionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoComision();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoComision() throws Exception {
		this.inicializarActualizarBindingTablaEstadoComision(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoComision() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoComisionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoComisionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoComisionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoComisionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoComisionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoComisionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoComision(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadocomisionLogic.getEstadoComisions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadocomisions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoComisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoComision.setModel(new EstadoComisionModel(this.estadocomisionLogic.getEstadoComisions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoComision.setModel(new EstadoComisionModel(this.estadocomisions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoComision!=null && this.jInternalFrameOrderByEstadoComision.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoComision();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoComision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoComision,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoComisionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO,estadocomisionConstantesFunciones.resaltarSeleccionarEstadoComision,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoComisionConstantesFunciones.SCLASSWEBTITULO,estadocomisionConstantesFunciones.resaltarSeleccionarEstadoComision,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoComision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoComision,EstadoComisionConstantesFunciones.LABEL_ID));

		if(this.estadocomisionConstantesFunciones.mostraridEstadoComision && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoComisionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadocomisionConstantesFunciones.resaltaridEstadoComision,this.estadocomisionConstantesFunciones.activaridEstadoComision,this,true,"idEstadoComision","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadocomisionConstantesFunciones.resaltaridEstadoComision,this.estadocomisionConstantesFunciones.activaridEstadoComision,this,true,"idEstadoComision","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoComision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoComision,EstadoComisionConstantesFunciones.LABEL_CODIGO));

		if(this.estadocomisionConstantesFunciones.mostrarcodigoEstadoComision && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoComisionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadocomisionConstantesFunciones.resaltarcodigoEstadoComision,this.estadocomisionConstantesFunciones.activarcodigoEstadoComision,this,true,"codigoEstadoComision","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadocomisionConstantesFunciones.resaltarcodigoEstadoComision,this.estadocomisionConstantesFunciones.activarcodigoEstadoComision,this,true,"codigoEstadoComision","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoComisionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoComision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoComision,EstadoComisionConstantesFunciones.LABEL_NOMBRE));

		if(this.estadocomisionConstantesFunciones.mostrarnombreEstadoComision && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoComisionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadocomisionConstantesFunciones.resaltarnombreEstadoComision,this.estadocomisionConstantesFunciones.activarnombreEstadoComision,this,true,"nombreEstadoComision","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadocomisionConstantesFunciones.resaltarnombreEstadoComision,this.estadocomisionConstantesFunciones.activarnombreEstadoComision,this,true,"nombreEstadoComision","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoComisionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadocomisionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadocomisionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoComision.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadocomisionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadocomisionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoComision.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoComision && this.isPermisoGuardarCambiosEstadoComision) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadocomisionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadocomisionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoComision.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoComision.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoComision && this.isPermisoGuardarCambiosEstadoComision) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoComision && this.isPermisoGuardarCambiosEstadoComision) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoComision.moveColumn(this.jTableDatosEstadoComision.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoComision.moveColumn(this.jTableDatosEstadoComision.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoComision.moveColumn(this.jTableDatosEstadoComision.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoComision.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoComision.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoComision,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoComisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoComision.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoComision.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoComisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoComisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoComision.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoComision.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoComision.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadocomisionLogic.getEstadoComisions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadocomisions.size()-1;
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
		//this.jTableDatosEstadoComision.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoComision.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoComision();
			
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
				
				//this.isEsNuevoEstadoComision=false;
					
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			
				if(this.estadocomisionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoComision==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoComision.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoComision.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomision =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocomision =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadocomision.getsType().equals("DUPLICADO")
				   || this.estadocomision.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoComision=true;
				
				} else {
					this.isEsNuevoEstadoComision=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
					if(this.estadocomision.getId()>=0 && !this.estadocomision.getIsNew()) {						
						this.isEsNuevoEstadoComision=false;
						
					} else {
						this.isEsNuevoEstadoComision=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoComision(esRelaciones);						
				
				this.seleccionarEstadoComision(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadocomision.getId()<0) {
					this.isEsNuevoEstadoComision=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoComision(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoComision(evt,rowIndex);
				}	
				
				if(this.estadocomisionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoComision: " + this.dDif); 
					}
				}								
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoComision(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadocomision)) {
					if(this.estadocomision.getId()>0) {
						this.estadocomision.setIsDeleted(true);
						
						this.estadocomisionsEliminados.add(this.estadocomision);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadocomisionLogic.getEstadoComisions().remove(this.estadocomision);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadocomisions.remove(this.estadocomision);				
					}
					
					
					((EstadoComisionModel) this.jTableDatosEstadoComision.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoComision(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoComision(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoComision) {
			
			if(this.jInternalFrameDetalleFormEstadoComision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoComision.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoComision.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomision =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocomision =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoComisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoComision(this.estadocomision);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoComision("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoComision(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoComision() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoComision(EstadoComision estadocomision) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoComision(estadocomision,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoComision(EstadoComision estadocomision,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoComision(estadocomision);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoComision(estadocomision,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoComision(estadocomision);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoComision(EstadoComision estadocomision) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoComision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoComision.jTextFieldidEstadoComision.setText(estadocomision.getId().toString());
			this.jInternalFrameDetalleFormEstadoComision.jTextFieldcodigoEstadoComision.setText(estadocomision.getcodigo());
			this.jInternalFrameDetalleFormEstadoComision.jTextAreanombreEstadoComision.setText(estadocomision.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoComision estadocomisionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadocomisionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoComision estadocomisionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadocomisionLocal=this.estadocomision;
			} else {
				estadocomisionLocal=this.estadocomisionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadocomisionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoComision(estadocomisionLocal,true);
					
					if(estadocomisionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadocomisionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadocomisionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoComision(EstadoComision estadocomision,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoComision(estadocomision,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(estadocomision);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoComision(EstadoComision estadocomision,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoComision(estadocomision,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoComision(EstadoComision estadocomision,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoComision==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoComision.jTextFieldidEstadoComision.getText()==null || this.jInternalFrameDetalleFormEstadoComision.jTextFieldidEstadoComision.getText()=="" || this.jInternalFrameDetalleFormEstadoComision.jTextFieldidEstadoComision.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoComision.jTextFieldidEstadoComision.setText("0");
			}

			if(conColumnasBase) {estadocomision.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoComision.jTextFieldidEstadoComision.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoComisionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoComision.jLabelIdEstadoComision,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadocomision.setcodigo(this.jInternalFrameDetalleFormEstadoComision.jTextFieldcodigoEstadoComision.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoComisionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoComision.jLabelcodigoEstadoComision,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadocomision.setnombre(this.jInternalFrameDetalleFormEstadoComision.jTextAreanombreEstadoComision.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoComisionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoComision.jLabelnombreEstadoComision,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoComision(EstadoComision estadocomisionBean,EstadoComision estadocomision,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoComision(EstadoComision estadocomisionOrigen,EstadoComision estadocomision,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadocomisionOrigen.getId()!=null && !estadocomisionOrigen.getId().equals(0L))) {estadocomision.setId(estadocomisionOrigen.getId());}}
			if(conDefault || (!conDefault && estadocomisionOrigen.getcodigo()!=null && !estadocomisionOrigen.getcodigo().equals(""))) {estadocomision.setcodigo(estadocomisionOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadocomisionOrigen.getnombre()!=null && !estadocomisionOrigen.getnombre().equals(""))) {estadocomision.setnombre(estadocomisionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoComision(EstadoComision estadocomision) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoComision.jTextFieldidEstadoComision.setText(estadocomision.getId().toString());
			this.jInternalFrameDetalleFormEstadoComision.jTextFieldcodigoEstadoComision.setText(estadocomision.getcodigo());
			this.jInternalFrameDetalleFormEstadoComision.jTextAreanombreEstadoComision.setText(estadocomision.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoComision(EstadoComisionBean estadocomisionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoComision.jTextFieldidEstadoComision.setText(estadocomisionBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoComision.jTextFieldcodigoEstadoComision.setText(estadocomisionBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoComision.jTextAreanombreEstadoComision.setText(estadocomisionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoComision(EstadoComisionParameterReturnGeneral estadocomisionReturnGeneral,EstadoComisionBean estadocomisionBean,Boolean conDefault) throws Exception { 
		try {
			EstadoComision estadocomisionLocal=new EstadoComision();
			
			estadocomisionLocal=estadocomisionReturnGeneral.getEstadoComision();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadocomisionLocal.getId()!=null && !estadocomisionLocal.getId().equals(0L))) {estadocomisionBean.setId(estadocomisionLocal.getId());}}
			if(conDefault || (!conDefault && estadocomisionLocal.getcodigo()!=null && !estadocomisionLocal.getcodigo().equals(""))) {estadocomisionBean.setcodigo(estadocomisionLocal.getcodigo());}
			if(conDefault || (!conDefault && estadocomisionLocal.getnombre()!=null && !estadocomisionLocal.getnombre().equals(""))) {estadocomisionBean.setnombre(estadocomisionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoComisionGenerico(Long idEstadoComisionSeleccionado,JComboBox jComboBoxEstadoComision,List<EstadoComision> estadocomisionsLocal)throws Exception {
		try {
			EstadoComision  estadocomisionTemp=null;

			for(EstadoComision estadocomisionAux:estadocomisionsLocal) {
				if(estadocomisionAux.getId()!=null && estadocomisionAux.getId().equals(idEstadoComisionSeleccionado)) {
					estadocomisionTemp=estadocomisionAux;
					break;
				}
			}

			jComboBoxEstadoComision.setSelectedItem(estadocomisionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoComisionGenerico(JComboBox jComboBoxEstadoComision,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoComision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoComision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoComision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoComision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoComision.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoComision.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoComision.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoComision.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoComision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoComision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadocomision=(EstadoComision) estadocomisionLogic.getEstadoComisions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadocomision =(EstadoComision) estadocomisions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoComision estadocomisionRow=new EstadoComision();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadocomisionRow=(EstadoComision) estadocomisionLogic.getEstadoComisions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadocomisionRow=(EstadoComision) estadocomisions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoComision(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoComision.setVisible((this.isVisibilidadCeldaNuevoEstadoComision && this.isPermisoNuevoEstadoComision));			
			this.jButtonDuplicarEstadoComision.setVisible((this.isVisibilidadCeldaDuplicarEstadoComision && this.isPermisoDuplicarEstadoComision));			
			this.jButtonCopiarEstadoComision.setVisible((this.isVisibilidadCeldaCopiarEstadoComision && this.isPermisoCopiarEstadoComision));
			this.jButtonVerFormEstadoComision.setVisible((this.isVisibilidadCeldaVerFormEstadoComision && this.isPermisoVerFormEstadoComision));
			
			this.jButtonAbrirOrderByEstadoComision.setVisible((this.isVisibilidadCeldaOrdenEstadoComision && this.isPermisoOrdenEstadoComision));			
			
			this.jButtonNuevoRelacionesEstadoComision.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoComision && this.isPermisoNuevoEstadoComision));			
			this.jButtonNuevoGuardarCambiosEstadoComision.setVisible((this.isVisibilidadCeldaNuevoEstadoComision && this.isPermisoNuevoEstadoComision && this.isPermisoGuardarCambiosEstadoComision));
			
			if(this.jInternalFrameDetalleFormEstadoComision!=null) {
			this.jInternalFrameDetalleFormEstadoComision.jButtonModificarEstadoComision.setVisible((this.isVisibilidadCeldaModificarEstadoComision && this.isPermisoActualizarEstadoComision));	
			this.jInternalFrameDetalleFormEstadoComision.jButtonActualizarEstadoComision.setVisible((this.isVisibilidadCeldaActualizarEstadoComision && this.isPermisoActualizarEstadoComision));	
			this.jInternalFrameDetalleFormEstadoComision.jButtonEliminarEstadoComision.setVisible((this.isVisibilidadCeldaEliminarEstadoComision && this.isPermisoEliminarEstadoComision));
			this.jInternalFrameDetalleFormEstadoComision.jButtonCancelarEstadoComision.setVisible(this.isVisibilidadCeldaCancelarEstadoComision);							
			this.jInternalFrameDetalleFormEstadoComision.jButtonGuardarCambiosEstadoComision.setVisible((this.isVisibilidadCeldaGuardarEstadoComision && this.isPermisoGuardarCambiosEstadoComision));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoComision.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoComision && this.isPermisoGuardarCambiosEstadoComision));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoComision.setVisible((this.isVisibilidadCeldaNuevoEstadoComision && this.isPermisoNuevoEstadoComision));						
			this.jButtonDuplicarToolBarEstadoComision.setVisible((this.isVisibilidadCeldaDuplicarEstadoComision && this.isPermisoDuplicarEstadoComision));						
			this.jButtonCopiarToolBarEstadoComision.setVisible((this.isVisibilidadCeldaCopiarEstadoComision && this.isPermisoCopiarEstadoComision));			
			this.jButtonVerFormToolBarEstadoComision.setVisible((this.isVisibilidadCeldaVerFormEstadoComision && this.isPermisoVerFormEstadoComision));			
			this.jButtonAbrirOrderByToolBarEstadoComision.setVisible((this.isVisibilidadCeldaOrdenEstadoComision && this.isPermisoOrdenEstadoComision));
			this.jButtonNuevoRelacionesToolBarEstadoComision.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoComision && this.isPermisoNuevoEstadoComision));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoComision.setVisible((this.isVisibilidadCeldaNuevoEstadoComision && this.isPermisoNuevoEstadoComision && this.isPermisoGuardarCambiosEstadoComision));			
			
			if(this.jInternalFrameDetalleFormEstadoComision!=null) {
			this.jInternalFrameDetalleFormEstadoComision.jButtonModificarToolBarEstadoComision.setVisible((this.isVisibilidadCeldaModificarEstadoComision && this.isPermisoActualizarEstadoComision));	
			this.jInternalFrameDetalleFormEstadoComision.jButtonActualizarToolBarEstadoComision.setVisible((this.isVisibilidadCeldaActualizarEstadoComision  && this.isPermisoActualizarEstadoComision));	
			this.jInternalFrameDetalleFormEstadoComision.jButtonEliminarToolBarEstadoComision.setVisible((this.isVisibilidadCeldaEliminarEstadoComision && this.isPermisoEliminarEstadoComision));
			this.jInternalFrameDetalleFormEstadoComision.jButtonCancelarToolBarEstadoComision.setVisible(this.isVisibilidadCeldaCancelarEstadoComision);				
			this.jInternalFrameDetalleFormEstadoComision.jButtonGuardarCambiosToolBarEstadoComision.setVisible((this.isVisibilidadCeldaGuardarEstadoComision && this.isPermisoGuardarCambiosEstadoComision));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoComision.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoComision && this.isPermisoGuardarCambiosEstadoComision));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoComision.setVisible((this.isVisibilidadCeldaNuevoEstadoComision && this.isPermisoNuevoEstadoComision));			
			this.jMenuItemDuplicarEstadoComision.setVisible((this.isVisibilidadCeldaDuplicarEstadoComision && this.isPermisoDuplicarEstadoComision));			
			this.jMenuItemCopiarEstadoComision.setVisible((this.isVisibilidadCeldaCopiarEstadoComision && this.isPermisoCopiarEstadoComision));			
			this.jMenuItemVerFormEstadoComision.setVisible((this.isVisibilidadCeldaVerFormEstadoComision && this.isPermisoVerFormEstadoComision));			
			this.jMenuItemAbrirOrderByEstadoComision.setVisible((this.isVisibilidadCeldaOrdenEstadoComision && this.isPermisoOrdenEstadoComision));			
			//this.jMenuItemMostrarOcultarEstadoComision.setVisible((this.isVisibilidadCeldaOrdenEstadoComision && this.isPermisoOrdenEstadoComision));
			this.jMenuItemDetalleAbrirOrderByEstadoComision.setVisible((this.isVisibilidadCeldaOrdenEstadoComision && this.isPermisoOrdenEstadoComision));			
			//this.jMenuItemDetalleMostrarOcultarEstadoComision.setVisible((this.isVisibilidadCeldaOrdenEstadoComision && this.isPermisoOrdenEstadoComision));			
			this.jMenuItemNuevoRelacionesEstadoComision.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoComision && this.isPermisoNuevoEstadoComision));			
			this.jMenuItemNuevoGuardarCambiosEstadoComision.setVisible((this.isVisibilidadCeldaNuevoEstadoComision && this.isPermisoNuevoEstadoComision && this.isPermisoGuardarCambiosEstadoComision));									
			
			if(this.jInternalFrameDetalleFormEstadoComision!=null) {
			this.jInternalFrameDetalleFormEstadoComision.jMenuItemModificarEstadoComision.setVisible((this.isVisibilidadCeldaModificarEstadoComision && this.isPermisoActualizarEstadoComision));	
			this.jInternalFrameDetalleFormEstadoComision.jMenuItemActualizarEstadoComision.setVisible((this.isVisibilidadCeldaActualizarEstadoComision && this.isPermisoActualizarEstadoComision));	
			this.jInternalFrameDetalleFormEstadoComision.jMenuItemEliminarEstadoComision.setVisible((this.isVisibilidadCeldaEliminarEstadoComision && this.isPermisoEliminarEstadoComision));
			this.jInternalFrameDetalleFormEstadoComision.jMenuItemCancelarEstadoComision.setVisible(this.isVisibilidadCeldaCancelarEstadoComision);				
			}
			
			this.jMenuItemGuardarCambiosEstadoComision.setVisible((this.isVisibilidadCeldaGuardarEstadoComision && this.isPermisoGuardarCambiosEstadoComision));						
			this.jMenuItemGuardarCambiosTablaEstadoComision.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoComision && this.isPermisoGuardarCambiosEstadoComision));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoComision=this.jButtonNuevoEstadoComision.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoComision=this.jButtonDuplicarEstadoComision.isVisible();
			this.isVisibilidadCeldaCopiarEstadoComision=this.jButtonCopiarEstadoComision.isVisible();
			this.isVisibilidadCeldaVerFormEstadoComision=this.jButtonVerFormEstadoComision.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoComision=this.jButtonAbrirOrderByEstadoComision.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoComision=this.jButtonNuevoRelacionesEstadoComision.isVisible();
			this.isVisibilidadCeldaModificarEstadoComision=this.jButtonModificarEstadoComision.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoComision!=null) {
			this.isVisibilidadCeldaActualizarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jButtonActualizarEstadoComision.isVisible();
			this.isVisibilidadCeldaEliminarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jButtonEliminarEstadoComision.isVisible();
			this.isVisibilidadCeldaCancelarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jButtonCancelarEstadoComision.isVisible();
			this.isVisibilidadCeldaGuardarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jButtonGuardarCambiosEstadoComision.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoComision=this.jButtonGuardarCambiosTablaEstadoComision.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoComision=this.jButtonNuevoToolBarEstadoComision.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoComision=this.jButtonNuevoRelacionesToolBarEstadoComision.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoComision!=null) {
			this.isVisibilidadCeldaModificarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jButtonModificarToolBarEstadoComision.isVisible();
			this.isVisibilidadCeldaActualizarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jButtonActualizarToolBarEstadoComision.isVisible();
			this.isVisibilidadCeldaEliminarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jButtonEliminarToolBarEstadoComision.isVisible();
			this.isVisibilidadCeldaCancelarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jButtonCancelarToolBarEstadoComision.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoComision=this.jButtonGuardarCambiosToolBarEstadoComision.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoComision=this.jButtonGuardarCambiosTablaToolBarEstadoComision.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoComision=this.jMenuItemNuevoEstadoComision.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoComision=this.jMenuItemNuevoRelacionesEstadoComision.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoComision!=null) {
			this.isVisibilidadCeldaModificarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jMenuItemModificarEstadoComision.isVisible();
			this.isVisibilidadCeldaActualizarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jMenuItemActualizarEstadoComision.isVisible();
			this.isVisibilidadCeldaEliminarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jMenuItemEliminarEstadoComision.isVisible();
			this.isVisibilidadCeldaCancelarEstadoComision=this.jInternalFrameDetalleFormEstadoComision.jMenuItemCancelarEstadoComision.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoComision=this.jMenuItemGuardarCambiosEstadoComision.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoComision=this.jMenuItemGuardarCambiosTablaEstadoComision.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoComision(Boolean esInicializar) {
		if(EstadoComisionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadocomisionSessionBean.getConGuardarRelaciones()) {
				//if(this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoComision();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoComision(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoComision() {
		this.jButtonNuevoEstadoComision.setVisible(this.isPermisoNuevoEstadoComision);			
		this.jButtonDuplicarEstadoComision.setVisible(this.isPermisoDuplicarEstadoComision);			
		this.jButtonCopiarEstadoComision.setVisible(this.isPermisoCopiarEstadoComision);			
		this.jButtonVerFormEstadoComision.setVisible(this.isPermisoVerFormEstadoComision);			
		
		this.jButtonAbrirOrderByEstadoComision.setVisible(this.isPermisoOrdenEstadoComision);					
		
		this.jButtonNuevoRelacionesEstadoComision.setVisible(this.isPermisoNuevoEstadoComision);			
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.jButtonModificarEstadoComision.setVisible(this.isPermisoActualizarEstadoComision);	
			this.jInternalFrameDetalleFormEstadoComision.jButtonActualizarEstadoComision.setVisible(this.isPermisoActualizarEstadoComision);	
			this.jInternalFrameDetalleFormEstadoComision.jButtonEliminarEstadoComision.setVisible(this.isPermisoEliminarEstadoComision);
			this.jInternalFrameDetalleFormEstadoComision.jButtonCancelarEstadoComision.setVisible(this.isVisibilidadCeldaCancelarEstadoComision);						
			this.jInternalFrameDetalleFormEstadoComision.jButtonGuardarCambiosEstadoComision.setVisible(this.isPermisoGuardarCambiosEstadoComision);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoComision.setVisible(this.isPermisoActualizarEstadoComision);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoComision() {
		this.jInternalFrameDetalleFormEstadoComision.jButtonModificarEstadoComision.setVisible(this.isPermisoActualizarEstadoComision);	
		this.jInternalFrameDetalleFormEstadoComision.jButtonActualizarEstadoComision.setVisible(this.isPermisoActualizarEstadoComision);	
		this.jInternalFrameDetalleFormEstadoComision.jButtonEliminarEstadoComision.setVisible(this.isPermisoEliminarEstadoComision);
		this.jInternalFrameDetalleFormEstadoComision.jButtonCancelarEstadoComision.setVisible(this.isVisibilidadCeldaCancelarEstadoComision);							
		this.jInternalFrameDetalleFormEstadoComision.jButtonGuardarCambiosEstadoComision.setVisible((this.isVisibilidadCeldaGuardarEstadoComision && this.isPermisoGuardarCambiosEstadoComision));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoComision() {
		if(EstadoComisionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoComision();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoComision() {
	}
	
	public void jTableDatosEstadoComisionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoComision(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoComisionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoComision(this.getestadocomision(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(this.estadocomision);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocomision =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocomision =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocomision==null) {
						this.estadocomision = new EstadoComision();
					}

					this.setVariablesFormularioToObjetoActualEstadoComision(this.estadocomision,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(this.estadocomision);
				}

				if(this.estadocomision.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadocomision.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoComision(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoComisionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoComision(this.getestadocomision(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(this.estadocomision);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocomision =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocomision =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocomision==null) {
						this.estadocomision = new EstadoComision();
					}

					this.setVariablesFormularioToObjetoActualEstadoComision(this.estadocomision,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(this.estadocomision);
				}

				if(this.estadocomision.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadocomision.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoComision(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoComisionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoComision(this.getestadocomision(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(this.estadocomision);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocomision =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadocomision =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadocomision==null) {
						this.estadocomision = new EstadoComision();
					}

					this.setVariablesFormularioToObjetoActualEstadoComision(this.estadocomision,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(this.estadocomision);
				}

				if(this.estadocomision.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadocomision.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoComision(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoComision() {
		if(this.jInternalFrameDetalleFormEstadoComision!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) {
			this.jInternalFrameDetalleFormEstadoComision.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoComision.dispose();
			this.jInternalFrameDetalleFormEstadoComision=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoComision!=null) {
			this.jInternalFrameReporteDinamicoEstadoComision.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoComision.dispose();
			this.jInternalFrameReporteDinamicoEstadoComision=null;
		}
		
		if(this.jInternalFrameImportacionEstadoComision!=null) {
			this.jInternalFrameImportacionEstadoComision.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoComision.dispose();
			this.jInternalFrameImportacionEstadoComision=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoComision();
			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoComision")) {
				jButtonNuevoEstadoComisionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoComision")) {
				jButtonDuplicarEstadoComisionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoComision")) {
				jButtonCopiarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoComision")) {
				jButtonVerFormEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoComision")) {
				jButtonNuevoEstadoComisionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoComision")) {
				jButtonDuplicarEstadoComisionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoComision")) {
				jButtonNuevoEstadoComisionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoComision")) {
				jButtonDuplicarEstadoComisionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoComision")) {
				jButtonNuevoEstadoComisionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoComision")) {
				jButtonNuevoEstadoComisionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoComision")) {
				jButtonNuevoEstadoComisionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoComision")) {
				jButtonModificarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoComision")) {
				jButtonModificarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoComision")) {
				jButtonModificarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoComision")) {
				jButtonActualizarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoComision")) {
				jButtonActualizarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoComision")) {
				jButtonActualizarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoComision")) {
				jButtonEliminarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoComision")) {
				jButtonEliminarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoComision")) {
				jButtonEliminarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoComision")) {
				jButtonCancelarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoComision")) {
				jButtonCancelarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoComision")) {
				jButtonCancelarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoComision")) {
				jButtonCerrarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoComision")) {
				jButtonCerrarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoComision")) {
				jButtonCerrarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoComision")) {
				jButtonMostrarOcultarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoComision")) {
				jButtonCancelarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoComision")) {
				jButtonGuardarCambiosEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoComision")) {
				jButtonGuardarCambiosEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoComision")) {
				jButtonCopiarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoComision")) {
				jButtonVerFormEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoComision")) {
				jButtonGuardarCambiosEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoComision")) {
				jButtonCopiarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoComision")) {
				jButtonVerFormEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoComision")) {
				jButtonGuardarCambiosEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoComision")) {
				jButtonGuardarCambiosEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoComision")) {
				jButtonGuardarCambiosEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoComision")) {
				jButtonRecargarInformacionEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoComision")) {
				jButtonRecargarInformacionEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoComision")) {
				jButtonRecargarInformacionEstadoComisionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoComision")) {
				jButtonAnterioresEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoComision")) {
				jButtonAnterioresEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoComision")) {
				jButtonAnterioresEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoComision")) {
				jButtonSiguientesEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoComision")) {
				jButtonSiguientesEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoComision")) {
				jButtonSiguientesEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoComision") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoComision")) {
				jButtonAbrirOrderByEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoComision") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoComision")) {
				jButtonMostrarOcultarEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoComision")) {
				jButtonNuevoGuardarCambiosEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoComision")) {
				jButtonNuevoGuardarCambiosEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoComision")) {
				jButtonNuevoGuardarCambiosEstadoComisionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoComision")) {
				jButtonCerrarReporteDinamicoEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoComision")) {
				jButtonGenerarReporteDinamicoEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoComision")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoComisionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoComision")) {
				jButtonCerrarImportacionEstadoComisionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoComision")) {
				
				jButtonGenerarImportacionEstadoComisionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoComision")) {
				
				jButtonAbrirImportacionEstadoComisionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoComision")) {
				jComboBoxTiposAccionesEstadoComisionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoComision")) {
				jComboBoxTiposRelacionesEstadoComisionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoComision")) {
				jComboBoxTiposAccionesEstadoComisionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoComision")) {
				
				jComboBoxTiposSeleccionarEstadoComisionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoComision")) {
				jTextFieldValorCampoGeneralEstadoComisionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoComision")) {
				jButtonAbrirOrderByEstadoComisionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoComision")) {
				jButtonAbrirOrderByEstadoComisionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoComision")) {
				jButtonCerrarOrderByEstadoComisionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoComisionBusqueda")) {
				this.jButtonidEstadoComisionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoComisionBusqueda")) {
				this.jButtoncodigoEstadoComisionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoComisionBusqueda")) {
				this.jButtonnombreEstadoComisionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoComision();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoComisionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				


				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoComision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoComision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoComision estadocomisionLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadocomisionLocal=this.estadocomision;
			} else {
				estadocomisionLocal=this.estadocomisionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
							
				
				


				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoComision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoComision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoComisionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionAnterior =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocomisionAnterior =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
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
			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			
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
			
			


			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoComisionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
								
						
				


				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoComision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoComision.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
								
				
				


				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoComision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoComision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoComisionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionAnterior =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocomisionAnterior =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoComisionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionAnterior =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocomisionAnterior =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoComisionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
							
				
				


				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoComision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoComision.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoComisionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocomisionAnterior =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadocomisionAnterior =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
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
			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			
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
			
			


			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoComisionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
								
				
				


				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoComision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoComision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoComisionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionAnterior =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocomisionAnterior =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoComisionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoComisionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoComision")) {
					jCheckBoxSeleccionarTodosEstadoComisionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoComision")) {
					jCheckBoxSeleccionadosEstadoComisionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoComision")) {
					
				}
				
				


				
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoComision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoComision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
												
				
				


				
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoComision.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoComision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoComisionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadocomisionAnterior =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadocomisionAnterior =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoComisionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
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
			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
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
			
			


			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoComisionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoComision.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoComision.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadocomision);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadocomision);
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
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
				
				


				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoComision.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoComision.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoComisionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadocomisionAnterior =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadocomisionAnterior =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoComision")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoComisionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoComision.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadocomision =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadocomision =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadocomision);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoComision")) {
				
				}
				
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoComision")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoComision.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoComision")) {
			
			}
			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoComision();
			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoComision")) {
				jButtonNuevoEstadoComisionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoComision")) {
				jButtonDuplicarEstadoComisionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoComision")) {
				jButtonCopiarEstadoComisionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoComision")) {
				jButtonVerFormEstadoComisionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoComision")) {
				jButtonNuevoEstadoComisionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoComision")) {
				jButtonModificarEstadoComisionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoComision")) {
				jButtonActualizarEstadoComisionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoComision")) {
				jButtonEliminarEstadoComisionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoComision")) {
				jButtonGuardarCambiosEstadoComisionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoComision")) {
				jButtonCancelarEstadoComisionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoComision")) {
				jButtonCerrarEstadoComisionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoComision")) {
				jButtonGuardarCambiosEstadoComisionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoComision")) {
				jButtonNuevoGuardarCambiosEstadoComisionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoComision")) {
				jButtonAbrirOrderByEstadoComisionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoComision")) {
				jButtonRecargarInformacionEstadoComisionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoComision")) {
				jButtonAnterioresEstadoComisionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoComision")) {
				jButtonSiguientesEstadoComisionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoComisionBusqueda")) {
				this.jButtonidEstadoComisionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoComisionBusqueda")) {
				this.jButtoncodigoEstadoComisionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoComisionBusqueda")) {
				this.jButtonnombreEstadoComisionBusquedaActionPerformed(evt);
			}
			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoComision();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoComision")) {
				closingInternalFrameEstadoComision();
				
			} else if(sTipo.equals("jButtonCancelarEstadoComision")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoComision = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoComisionBeanSwingJInternalFrame jInternalFrameParent=(EstadoComisionBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoComision.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoComisionActionPerformed(null);
			}
			
			EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadocomision,new Object(),this.estadocomisionParameterGeneral,this.estadocomisionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoComision(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoComision(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoComision(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadocomision)) {
			if(!esControlTabla) {
				if(EstadoComisionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoComision(this.estadocomision,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(this.estadocomision);			
				}
				
				if(this.estadocomisionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoComision(this.estadocomision,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadocomisionReturnGeneral=estadocomisionLogic.procesarEventosEstadoComisionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocomisionLogic.getEstadoComisions(),this.estadocomision,this.estadocomisionParameterGeneral,this.isEsNuevoEstadoComision,classes);//this.estadocomisionLogic.getEstadoComision()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoComision(this.estadocomisionReturnGeneral,this.estadocomisionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadocomisionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoComision(classes,this.estadocomisionReturnGeneral,this.estadocomisionBean,false);
					}
						
					if(this.estadocomisionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoComision(this.estadocomisionReturnGeneral.getEstadoComision());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoComision(this.estadocomisionReturnGeneral.getEstadoComision());	
					}
						
					if(this.estadocomisionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoComision(this.estadocomisionReturnGeneral.getEstadoComision(),classes);//this.estadocomisionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoComision(this.estadocomision,classes);//this.estadocomisionBean);									
				}
			
				if(EstadoComisionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoComision(this.estadocomision,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoComision(this.estadocomision);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadocomisionAnterior!=null) {
						this.estadocomision=this.estadocomisionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadocomisionReturnGeneral=estadocomisionLogic.procesarEventosEstadoComisionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocomisionLogic.getEstadoComisions(),this.estadocomision,this.estadocomisionParameterGeneral,this.isEsNuevoEstadoComision,classes);//this.estadocomisionLogic.getEstadoComision()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadocomisionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadocomisionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadocomisionReturnGeneral.getEstadoComision(),estadocomisionLogic.getEstadoComisions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadocomisionReturnGeneral.getEstadoComision(),this.estadocomisions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoComision.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoComision.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoComision();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoComision() throws Exception {
		
		EstadoComisionModel estadocomisionModel=(EstadoComisionModel)this.jTableDatosEstadoComision.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadocomisionModel.estadocomisions=this.estadocomisionLogic.getEstadoComisions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadocomisionModel.estadocomisions=this.estadocomisions;
		}
		
		
		((EstadoComisionModel) this.jTableDatosEstadoComision.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoComision() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadocomisionAnterior(),this.estadocomisionLogic.getEstadoComisions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadocomisionAnterior(),this.estadocomisions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoComision();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoComision(EstadoComision estadocomision,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
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
										
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocomision,new Object(),generalEntityParameterGeneral,this.estadocomisionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadocomisionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoComisionConstantesFunciones.getClassesRelationshipsOfEstadoComision(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoComisionConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoComision(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoComision(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoComisionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadocomision,new Object(),generalEntityParameterGeneral,this.estadocomisionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoComision(EstadoComisionBean estadocomisionBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoComision(ArrayList<Classe> classes,EstadoComisionReturnGeneral estadocomisionReturnGeneral,EstadoComisionBean estadocomisionBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoComision(EstadoComision estadocomision,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadocomision)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoComision = new EstadoComisionDetalleFormJInternalFrame(jDesktopPane,this.estadocomisionSessionBean.getConGuardarRelaciones(),this.estadocomisionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoComision);
		this.jInternalFrameDetalleFormEstadoComision.setVisible(false);
		this.jInternalFrameDetalleFormEstadoComision.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoComision.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoComision.estadocomisionLogic=this.estadocomisionLogic;
		
		this.cargarCombosFrameForeignKeyEstadoComision("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoComision();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoComision();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoComision("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoComision();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoComision.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoComision"));
		
		this.jInternalFrameDetalleFormEstadoComision.jButtonModificarEstadoComision.addActionListener(new ButtonActionListener(this,"ModificarEstadoComision"));

		
		this.jInternalFrameDetalleFormEstadoComision.jButtonModificarToolBarEstadoComision.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoComision"));
					
		this.jInternalFrameDetalleFormEstadoComision.jMenuItemModificarEstadoComision.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoComision"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoComision.jButtonActualizarEstadoComision.addActionListener (new ButtonActionListener(this,"ActualizarEstadoComision"));
		
		
		this.jInternalFrameDetalleFormEstadoComision.jButtonActualizarToolBarEstadoComision.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoComision"));
						
		this.jInternalFrameDetalleFormEstadoComision.jMenuItemActualizarEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoComision"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoComision.jButtonEliminarEstadoComision.addActionListener (new ButtonActionListener(this,"EliminarEstadoComision"));
		
		
		this.jInternalFrameDetalleFormEstadoComision.jButtonEliminarToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoComision"));
								
		this.jInternalFrameDetalleFormEstadoComision.jMenuItemEliminarEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoComision"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoComision.jButtonCancelarEstadoComision.addActionListener (new ButtonActionListener(this,"CancelarEstadoComision"));
		
		
		this.jInternalFrameDetalleFormEstadoComision.jButtonCancelarToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoComision"));
					
		this.jInternalFrameDetalleFormEstadoComision.jMenuItemCancelarEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoComision"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoComision.jMenuItemDetalleCerrarEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoComision"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoComision.jButtonGuardarCambiosToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoComision"));
		
		
		
		this.jInternalFrameDetalleFormEstadoComision.jButtonGuardarCambiosToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoComision"));
		
		
		
		this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoComision"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoComision.jButtonidEstadoComisionBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoComisionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoComision.jButtoncodigoEstadoComisionBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoComisionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoComision.jButtonnombreEstadoComisionBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoComisionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoComision.jTabbedPaneRelacionesEstadoComision.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoComision"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoComision"));
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoComision"));
		}
		
		this.jTableDatosEstadoComision.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoComision"));
		
		this.jTableDatosEstadoComision.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoComision"));
		
		this.jButtonNuevoEstadoComision.addActionListener(new ButtonActionListener(this,"NuevoEstadoComision"));
		
		this.jButtonDuplicarEstadoComision.addActionListener(new ButtonActionListener(this,"DuplicarEstadoComision"));
		
		this.jButtonCopiarEstadoComision.addActionListener(new ButtonActionListener(this,"CopiarEstadoComision"));
		
		this.jButtonVerFormEstadoComision.addActionListener(new ButtonActionListener(this,"VerFormEstadoComision"));
		
		
		this.jButtonNuevoToolBarEstadoComision.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoComision"));
			
		this.jButtonDuplicarToolBarEstadoComision.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoComision"));
			
		this.jMenuItemNuevoEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoComision"));
			
		this.jMenuItemDuplicarEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoComision"));		
		
		
		this.jButtonNuevoRelacionesEstadoComision.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoComision"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoComision.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoComision"));
			
		this.jMenuItemNuevoRelacionesEstadoComision.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoComision"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.jButtonModificarEstadoComision.addActionListener(new ButtonActionListener(this,"ModificarEstadoComision"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.jButtonModificarToolBarEstadoComision.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoComision"));
			
			this.jInternalFrameDetalleFormEstadoComision.jMenuItemModificarEstadoComision.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoComision"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoComision.jButtonActualizarEstadoComision.addActionListener (new ButtonActionListener(this,"ActualizarEstadoComision"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.jButtonActualizarToolBarEstadoComision.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoComision"));
				
			this.jInternalFrameDetalleFormEstadoComision.jMenuItemActualizarEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoComision"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.jButtonEliminarEstadoComision.addActionListener (new ButtonActionListener(this,"EliminarEstadoComision"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.jButtonEliminarToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoComision"));
						
			this.jInternalFrameDetalleFormEstadoComision.jMenuItemEliminarEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoComision"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.jButtonCancelarEstadoComision.addActionListener (new ButtonActionListener(this,"CancelarEstadoComision"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.jButtonCancelarToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoComision"));
			
			this.jInternalFrameDetalleFormEstadoComision.jMenuItemCancelarEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoComision"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoComision"));		
		
		
		this.jButtonCerrarEstadoComision.addActionListener (new ButtonActionListener(this,"CerrarEstadoComision"));
		
		
		this.jButtonCerrarToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoComision"));
			
		this.jMenuItemCerrarEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoComision"));
			
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.jMenuItemDetalleCerrarEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoComision"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.jButtonGuardarCambiosEstadoComision.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoComision"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.jButtonGuardarCambiosToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoComision"));
		}
		
		this.jButtonCopiarToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoComision"));
			
		this.jButtonVerFormToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoComision"));
		
		this.jMenuItemGuardarCambiosEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoComision"));
			
		this.jMenuItemCopiarEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoComision"));		
		
		this.jMenuItemVerFormEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoComision"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoComision.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoComision"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoComision"));
			
		this.jMenuItemGuardarCambiosTablaEstadoComision.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoComision"));		
		
		
		
		this.jButtonRecargarInformacionEstadoComision.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoComision"));
					
		this.jButtonRecargarInformacionToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoComision"));
		
		this.jMenuItemRecargarInformacionEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoComision"));		
		
		
		
		this.jButtonAnterioresEstadoComision.addActionListener (new ButtonActionListener(this,"AnterioresEstadoComision"));
		
		
		this.jButtonAnterioresToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoComision"));
		
		this.jMenuItemAnterioresEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoComision"));		
		
		
		this.jButtonSiguientesEstadoComision.addActionListener (new ButtonActionListener(this,"SiguientesEstadoComision"));
		
		
		this.jButtonSiguientesToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoComision"));
			
		this.jMenuItemSiguientesEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoComision"));
			
		this.jMenuItemAbrirOrderByEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoComision"));
			
		this.jMenuItemMostrarOcultarEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoComision"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoComision"));
			
		this.jMenuItemDetalleMostarOcultarEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoComision"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoComision.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoComision"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoComision"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoComision.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoComision"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoComision.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoComision"));

		this.jCheckBoxSeleccionadosEstadoComision.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoComision"));
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoComision"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoComision.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoComision"));
			
		this.jComboBoxTiposAccionesEstadoComision.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoComision"));
					
		this.jComboBoxTiposSeleccionarEstadoComision.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoComision"));
			
		this.jTextFieldValorCampoGeneralEstadoComision.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoComision"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoComision.jButtonidEstadoComisionBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoComisionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoComision.jButtoncodigoEstadoComisionBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoComisionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoComision.jButtonnombreEstadoComisionBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoComisionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoComision!=null) {
				this.jInternalFrameReporteDinamicoEstadoComision.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoComision"));
				this.jInternalFrameReporteDinamicoEstadoComision.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoComision"));
				this.jInternalFrameReporteDinamicoEstadoComision.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoComision"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoComision.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoComision"));				
			//this.jButtonGenerarReporteDinamicoEstadoComision.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoComision"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoComision.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoComision"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoComision!=null) {
				this.jInternalFrameImportacionEstadoComision.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoComision"));
				this.jInternalFrameImportacionEstadoComision.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoComision"));
				this.jInternalFrameImportacionEstadoComision.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoComision"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoComision.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoComision"));
			
			this.jButtonAbrirOrderByToolBarEstadoComision.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoComision"));			
			
			if(this.jInternalFrameOrderByEstadoComision!=null) {
				this.jInternalFrameOrderByEstadoComision.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoComision"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoComision!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoComision.jTabbedPaneRelacionesEstadoComision.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoComision"));
		
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
            		closingInternalFrameEstadoComision();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoComision.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoComision = (JInternalFrameBase)event.getSource();
	            	
	            EstadoComisionBeanSwingJInternalFrame jInternalFrameParent=(EstadoComisionBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoComision.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoComisionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoComision.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoComisionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoComision.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoComision.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoComisionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoComisionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoComisionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoComision";
		inputMap = this.jButtonNuevoEstadoComision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoComision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoComisionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoComisionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoComisionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoComisionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoComision";
		inputMap = this.jButtonNuevoRelacionesEstadoComision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoComision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoComisionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoComision";
		inputMap = this.jButtonModificarEstadoComision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoComision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoComisionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoComision";
		inputMap = this.jButtonActualizarEstadoComision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoComision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoComisionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoComision";
		inputMap = this.jButtonEliminarEstadoComision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoComision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoComisionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoComision";
		inputMap = this.jButtonCancelarEstadoComision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoComision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoComisionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoComision";
		inputMap = this.jButtonCerrarEstadoComision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoComision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoComisionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoComision.jButtonGuardarCambiosEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoComision";
		inputMap = this.jInternalFrameDetalleFormEstadoComision.jButtonGuardarCambiosEstadoComision.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoComision.jButtonGuardarCambiosEstadoComision.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoComisionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoComision.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoComisionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoComision.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoComisionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoComision.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoComisionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoComision.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoComisionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoComision.jButtonidEstadoComisionBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoComisionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoComision.jButtoncodigoEstadoComisionBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoComisionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoComision.jButtonnombreEstadoComisionBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoComisionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoComision.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoComisionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoComisionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoComision.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoComision(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoComision estadocomisionAux:this.estadocomisionLogic.getEstadoComisions()) {
					estadocomisionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoComision estadocomisionAux:estadocomisions) {
					estadocomisionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoComisionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoComision(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoComision estadocomisionAux:this.estadocomisionLogic.getEstadoComisions()) {
						estadocomisionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoComision estadocomisionAux:estadocomisions) {
						estadocomisionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoComision estadocomisionAux:this.estadocomisionLogic.getEstadoComisions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoComision estadocomisionAux:estadocomisions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoComision(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoComision.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoComision.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoComision,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoComisionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoComision(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoComision.getSelectedRows();
			
			EstadoComision estadocomisionLocal=new EstadoComision();
			
			//this.seleccionarTodosEstadoComision(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadocomisionLocal =(EstadoComision) this.estadocomisionLogic.getEstadoComisions().toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadocomisionLocal =(EstadoComision) this.estadocomisions.toArray()[this.jTableDatosEstadoComision.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadocomisionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoComision estadocomisionAux:this.estadocomisionLogic.getEstadoComisions()) {
						estadocomisionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoComision estadocomisionAux:estadocomisions) {
						estadocomisionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoComision(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoComision.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoComision.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoComision,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoComisionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoComisionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoComisionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoComision(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoComision.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoComision estadocomisionAux:this.estadocomisionLogic.getEstadoComisions()) {
				
						if(sTipoSeleccionar.equals(EstadoComisionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadocomisionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoComisionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadocomisionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoComision estadocomisionAux:estadocomisions) {
					
						if(sTipoSeleccionar.equals(EstadoComisionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadocomisionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoComisionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadocomisionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoComision(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoComisionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoComision(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoComision=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoComision.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoComision) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoComision(conSplash);
				
					this.generarReporteEstadoComisionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoComision.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoComisionsSeleccionados();
				//this.jComboBoxTiposAccionesEstadoComision.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoComisionsSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoComision.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoComisionsSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoComision.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoComision();
				
				this.exportarEstadoComisionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoComision.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoComisions();
				//this.importarEstadoComisions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoComision.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoComision();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoComisionsSeleccionados();
				//this.jComboBoxTiposAccionesEstadoComision.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Comision", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoComision();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoComision)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoComision(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Comision",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoComision.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.setSelectedIndex(0);					
				}	
			} 			
			else if(EstadoComisionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEstadoComision) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEstadoComision(conSplash);
					
						//this.actualizarParametrosGeneralEstadoComision();
						
						this.generarReporteProcesoAccionEstadoComisionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEstadoComision.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EstadoComisionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Estado ComisionES SELECCIONADOS?", "MANTENIMIENTO DE Estado Comision", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEstadoComision();
				
						this.actualizarParametrosGeneralEstadoComision();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.estadocomisionReturnGeneral=estadocomisionLogic.procesarAccionEstadoComisionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.estadocomisionLogic.getEstadoComisions(),this.estadocomisionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEstadoComisionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoComision.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoComision();
					
					EstadoComisionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEstadoComisionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEstadoComision.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEstadoComision.jComboBoxTiposAccionesFormularioEstadoComision.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoComision(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoComisionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoComision();
			
			if(this.jInternalFrameDetalleFormEstadoComision==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();		
			EstadoComision estadocomision=new EstadoComision();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoComision(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoComision.getSelectedItem();
			
			
			
			
			estadocomisionsSeleccionados=this.getEstadoComisionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadocomisionsSeleccionados.size()==1) {
				for(EstadoComision estadocomisionAux:estadocomisionsSeleccionados) {
					estadocomision=estadocomisionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoComision();
			
      		//this.finishProcessEstadoComision(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoComisionReturnGeneral() throws Exception {
		if(this.estadocomisionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadocomisionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadocomisionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadocomisionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadocomisionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadocomisionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoComision(false);
		}
		
		if(this.estadocomisionReturnGeneral.getConRetornoLista() || this.estadocomisionReturnGeneral.getConRetornoObjeto()) {
			if(this.estadocomisionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadocomisionLogic.setEstadoComisions(this.estadocomisionReturnGeneral.getEstadoComisions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadocomisionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadocomisionLogic.setEstadoComision(this.estadocomisionReturnGeneral.getEstadoComision());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoComision(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoComision() throws Exception {
		
		
	}
	
	public ArrayList<EstadoComision> getEstadoComisionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoComision) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoComision estadocomisionAux:estadocomisionLogic.getEstadoComisions()) {
					if(estadocomisionAux.getIsSelected()) {
						estadocomisionsSeleccionados.add(estadocomisionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoComision estadocomisionAux:this.estadocomisions) {
					if(estadocomisionAux.getIsSelected()) {
						estadocomisionsSeleccionados.add(estadocomisionAux);				
					}
				}
			}
			
			if(estadocomisionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadocomisionsSeleccionados.addAll(this.estadocomisionLogic.getEstadoComisions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadocomisionsSeleccionados.addAll(this.estadocomisions);				
					}
				}
			}
		} else {
			estadocomisionsSeleccionados.add(this.estadocomision);
		}
		
		return estadocomisionsSeleccionados;
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
	
	public void generarReporteEstadoComisionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoComisionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoComisionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoComisionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoComisionsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Comision",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoComisionsSeleccionados() throws Exception {
		ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();		
		
		estadocomisionsSeleccionados=this.getEstadoComisionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoComisions("Todos",estadocomisionsSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoComisionsSeleccionados() throws Exception {
		ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();		
		
		estadocomisionsSeleccionados=this.getEstadoComisionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoComisions("Todos",estadocomisionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoComisionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();
		
		estadocomisionsSeleccionados=this.getEstadoComisionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoComisions("Todos",estadocomisionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoComisionsSeleccionados() throws Exception {
		ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoComision();
		
		
		estadocomisionsSeleccionados=this.getEstadoComisionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoComision();
		
		
		//this.generarReporteEstadoComisions("Todos",estadocomisionsSeleccionados ,estadocomisionImplementable,estadocomisionImplementableHome);
	}
	
	public void mostrarImportacionEstadoComisions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoComision();
		
		this.abrirFrameImportacionEstadoComision();		
		
			
		//this.generarReporteEstadoComisions("Todos",estadocomisionsSeleccionados ,estadocomisionImplementable,estadocomisionImplementableHome);
	}
	
	public void importarEstadoComisions() throws Exception {		
	
	}
	
	public void exportarEstadoComisionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoComisionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoComisionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoComisionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Comision",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoComisionsSeleccionados() throws Exception {
		ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();		
		
		estadocomisionsSeleccionados=this.getEstadoComisionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocomision."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoComision(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoComision estadocomisionAux:estadocomisionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoComision(estadocomisionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadocomisionAux.setsDetalleGeneralEntityReporte(estadocomisionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Comision",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoComision(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoComisionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoComisionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoComisionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoComisionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoComision(EstadoComision estadocomision,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadocomision.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocomision.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocomision.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadocomision.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoComisionsSeleccionados() throws Exception {
		ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();		
		
		estadocomisionsSeleccionados=this.getEstadoComisionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocomision.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoComisions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoComision(row);				
				iRow++;
			}				
			
			for(EstadoComision estadocomisionAux:estadocomisionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoComision(estadocomisionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Comision",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoComisionsSeleccionados() throws Exception {
		ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();		
		
		estadocomisionsSeleccionados=this.getEstadoComisionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadocomision.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadocomisions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadocomision");
			//elementRoot.appendChild(element);
		
			for(EstadoComision estadocomisionAux:estadocomisionsSeleccionados) {
				element = document.createElement("estadocomision");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoComision(estadocomisionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Comision",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoComision(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoComisionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoComisionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoComisionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoComisionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoComision(EstadoComision estadocomision,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadocomision.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadocomision.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadocomision.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoComision(EstadoComision estadocomision,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoComisionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadocomision.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoComisionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadocomision.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoComisionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadocomision.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoComisionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadocomision.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoComisionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoComision> estadocomisionsSeleccionados=new ArrayList<EstadoComision>();
		
		estadocomisionsSeleccionados=this.getEstadoComisionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoComision(estadocomisionsSeleccionados);
		
		this.generarReporteEstadoComisions("Todos",estadocomisionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoComision(ArrayList<EstadoComision> estadocomisionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoComision estadocomisionAux:estadocomisionsSeleccionados) {
				estadocomisionAux.setsDetalleGeneralEntityReporte(estadocomisionAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoComisionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadocomisionAux.setsDescripcionGeneralEntityReporte1(estadocomisionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoComisionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadocomisionAux.setsDescripcionGeneralEntityReporte1(estadocomisionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoComisionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoComision(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoComision=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoComision=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoComision=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoComision=false;
			this.isVisibilidadCeldaActualizarEstadoComision=false;
			this.isVisibilidadCeldaEliminarEstadoComision=false;
			this.isVisibilidadCeldaCancelarEstadoComision=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoComision=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoComision=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoComision=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoComision=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoComision=false;
			this.isVisibilidadCeldaModificarEstadoComision=false;
			this.isVisibilidadCeldaActualizarEstadoComision=true;
			this.isVisibilidadCeldaEliminarEstadoComision=false;
			this.isVisibilidadCeldaCancelarEstadoComision=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoComision=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoComision=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoComision=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoComision=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoComision=false;
			this.isVisibilidadCeldaModificarEstadoComision=false;
			this.isVisibilidadCeldaActualizarEstadoComision=true;
			this.isVisibilidadCeldaEliminarEstadoComision=true;
			this.isVisibilidadCeldaCancelarEstadoComision=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoComision=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoComision=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoComision=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoComision=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoComision=false;
			this.isVisibilidadCeldaModificarEstadoComision=false;
			this.isVisibilidadCeldaActualizarEstadoComision=true;
			this.isVisibilidadCeldaEliminarEstadoComision=false;
			this.isVisibilidadCeldaCancelarEstadoComision=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoComision=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoComision=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoComision=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoComision=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoComision=true;
			this.isVisibilidadCeldaModificarEstadoComision=false;
			this.isVisibilidadCeldaActualizarEstadoComision=false;
			this.isVisibilidadCeldaEliminarEstadoComision=false;
			this.isVisibilidadCeldaCancelarEstadoComision=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoComision=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoComision=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoComision=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoComision=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoComision=false;
			this.isVisibilidadCeldaActualizarEstadoComision=false;
			this.isVisibilidadCeldaEliminarEstadoComision=false;
			this.isVisibilidadCeldaCancelarEstadoComision=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoComision=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoComision=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoComision=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoComision=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoComision=false;
			this.isVisibilidadCeldaModificarEstadoComision=true;
			this.isVisibilidadCeldaActualizarEstadoComision=false;
			this.isVisibilidadCeldaEliminarEstadoComision=false;
			this.isVisibilidadCeldaCancelarEstadoComision=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoComision=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoComision=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoComisionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoComision=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoComision=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoComision=true;
		} else {
			this.actualizarEstadoPanelsEstadoComision(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoComision=false;
			//this.isVisibilidadCeldaVerFormEstadoComision=false;
			this.isVisibilidadCeldaDuplicarEstadoComision=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadocomisionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoComision=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoComision=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoComision=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadocomisionSessionBean.getEsGuardarRelacionado()) {
			if(!estadocomisionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoComision=false;												
			}
			
			this.jButtonCerrarEstadoComision.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoComision=false;
		}
		
		if(!this.permiteMantenimiento(this.estadocomision)) {
			this.isVisibilidadCeldaActualizarEstadoComision=false;
			this.isVisibilidadCeldaEliminarEstadoComision=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoComision() {
	}
	
	public void actualizarEstadoPanelsEstadoComision(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoComision!=null) {
				this.jScrollPanelDatosEdicionEstadoComision.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoComision!=null) {
				this.jScrollPanelDatosEstadoComision.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoComision!=null) {
				this.jPanelPaginacionEstadoComision.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoComision!=null) {
				this.jPanelParametrosReportesEstadoComision.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoComision!=null) {
				this.jScrollPanelDatosEdicionEstadoComision.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoComision!=null) {
				this.jScrollPanelDatosEstadoComision.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoComision!=null) {
				this.jPanelPaginacionEstadoComision.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoComision!=null) {
				this.jPanelParametrosReportesEstadoComision.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoComision!=null) {
				this.jScrollPanelDatosEdicionEstadoComision.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoComision!=null) {
				this.jScrollPanelDatosEstadoComision.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoComision!=null) {
				this.jPanelPaginacionEstadoComision.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoComision!=null) {
				this.jPanelParametrosReportesEstadoComision.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoComision!=null) {
				this.jScrollPanelDatosEdicionEstadoComision.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoComision!=null) {
				this.jScrollPanelDatosEstadoComision.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoComision!=null) {
				this.jPanelPaginacionEstadoComision.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoComision!=null) {
				this.jPanelParametrosReportesEstadoComision.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoComision!=null) {
				this.jScrollPanelDatosEdicionEstadoComision.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoComision!=null) {
				this.jScrollPanelDatosEstadoComision.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoComision!=null) {
				this.jPanelPaginacionEstadoComision.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoComision!=null) {
				this.jPanelParametrosReportesEstadoComision.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoComision!=null) {
				this.jScrollPanelDatosEdicionEstadoComision.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoComision!=null) {
				this.jScrollPanelDatosEstadoComision.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoComision!=null) {
				this.jPanelPaginacionEstadoComision.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoComision!=null) {
				this.jPanelParametrosReportesEstadoComision.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoComision!=null) {
				this.jScrollPanelDatosEdicionEstadoComision.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoComision!=null) {
				this.jScrollPanelDatosEstadoComision.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoComision!=null) {
				this.jPanelPaginacionEstadoComision.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoComision!=null) {
				this.jPanelParametrosReportesEstadoComision.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadocomisionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoComisionSessionBean estadocomisionSessionBean=new EstadoComisionSessionBean();
		
		if(this.estadocomisionSessionBean==null) {
			this.estadocomisionSessionBean=new EstadoComisionSessionBean();
		}
		
		this.estadocomisionSessionBean.setsUltimaBusquedaEstadoComision(this.getsAccionBusqueda());
		this.estadocomisionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadocomisionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoComisionSessionBean estadocomisionSessionBean=new EstadoComisionSessionBean();
		
		if(this.estadocomisionSessionBean==null) {
			this.estadocomisionSessionBean=new EstadoComisionSessionBean();
		}
		
		if(this.estadocomisionSessionBean.getsUltimaBusquedaEstadoComision()!=null&&!this.estadocomisionSessionBean.getsUltimaBusquedaEstadoComision().equals("")) {
			this.setsAccionBusqueda(estadocomisionSessionBean.getsUltimaBusquedaEstadoComision());
			this.setiNumeroPaginacion(estadocomisionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadocomisionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadocomisionSessionBean.setsUltimaBusquedaEstadoComision("");
		this.estadocomisionSessionBean.setiNumeroPaginacion(EstadoComisionConstantesFunciones.INUMEROPAGINACION);
		this.estadocomisionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoComision(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoComision() {
		this.updateBorderResaltarBusquedasFormularioEstadoComision();
		this.updateVisibilidadBusquedasFormularioEstadoComision();
		this.updateHabilitarBusquedasFormularioEstadoComision();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoComision() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoComision() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoComision() {
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
	
	public void updateControlesFormularioEstadoComision() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoComision==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoComision();
		this.updateVisibilidadResaltarControlesFormularioEstadoComision();
		this.updateHabilitarResaltarControlesFormularioEstadoComision();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoComision() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoComision==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadocomisionConstantesFunciones.resaltaridEstadoComision!=null && this.jInternalFrameDetalleFormEstadoComision!=null) {this.jInternalFrameDetalleFormEstadoComision.jTextFieldidEstadoComision.setBorder(this.estadocomisionConstantesFunciones.resaltaridEstadoComision);}
		if(this.estadocomisionConstantesFunciones.resaltarcodigoEstadoComision!=null && this.jInternalFrameDetalleFormEstadoComision!=null) {this.jInternalFrameDetalleFormEstadoComision.jTextFieldcodigoEstadoComision.setBorder(this.estadocomisionConstantesFunciones.resaltarcodigoEstadoComision);}
		if(this.estadocomisionConstantesFunciones.resaltarnombreEstadoComision!=null && this.jInternalFrameDetalleFormEstadoComision!=null) {this.jInternalFrameDetalleFormEstadoComision.jTextAreanombreEstadoComision.setBorder(this.estadocomisionConstantesFunciones.resaltarnombreEstadoComision);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoComision() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoComision==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) {
	
		//this.jInternalFrameDetalleFormEstadoComision.jTextFieldidEstadoComision.setVisible(this.estadocomisionConstantesFunciones.mostraridEstadoComision);
		this.jInternalFrameDetalleFormEstadoComision.jPanelidEstadoComision.setVisible(this.estadocomisionConstantesFunciones.mostraridEstadoComision);
		//this.jInternalFrameDetalleFormEstadoComision.jTextFieldcodigoEstadoComision.setVisible(this.estadocomisionConstantesFunciones.mostrarcodigoEstadoComision);
		this.jInternalFrameDetalleFormEstadoComision.jPanelcodigoEstadoComision.setVisible(this.estadocomisionConstantesFunciones.mostrarcodigoEstadoComision);
		//this.jInternalFrameDetalleFormEstadoComision.jTextAreanombreEstadoComision.setVisible(this.estadocomisionConstantesFunciones.mostrarnombreEstadoComision);
		this.jInternalFrameDetalleFormEstadoComision.jPanelnombreEstadoComision.setVisible(this.estadocomisionConstantesFunciones.mostrarnombreEstadoComision);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoComision() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoComision==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoComision!=null) {
	
		this.jInternalFrameDetalleFormEstadoComision.jTextFieldidEstadoComision.setEnabled(this.estadocomisionConstantesFunciones.activaridEstadoComision);
		this.jInternalFrameDetalleFormEstadoComision.jTextFieldcodigoEstadoComision.setEnabled(this.estadocomisionConstantesFunciones.activarcodigoEstadoComision);
		this.jInternalFrameDetalleFormEstadoComision.jTextAreanombreEstadoComision.setEnabled(this.estadocomisionConstantesFunciones.activarnombreEstadoComision);
		}
	}
	
		
}