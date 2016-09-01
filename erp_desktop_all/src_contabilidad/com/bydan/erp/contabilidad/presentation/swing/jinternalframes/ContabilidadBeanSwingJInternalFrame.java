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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.ContabilidadConstantesFunciones;
import com.bydan.erp.contabilidad.util.ContabilidadParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.ContabilidadParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.ContabilidadBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
public class ContabilidadBeanSwingJInternalFrame extends ContabilidadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ContabilidadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Contabilidad> contabilidadValidator = new ClassValidator<Contabilidad>(Contabilidad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Contabilidad contabilidad;	
	public Contabilidad contabilidadAux;
	public Contabilidad contabilidadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Contabilidad contabilidadTotales;
	public Long idContabilidadActual;
	public Long iIdNuevoContabilidad=0L;
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
	
	public Boolean isPermisoTodoContabilidad;
	public Boolean isPermisoNuevoContabilidad;
	public Boolean isPermisoActualizarContabilidad;
	public Boolean isPermisoActualizarOriginalContabilidad;
	public Boolean isPermisoEliminarContabilidad;
	public Boolean isPermisoGuardarCambiosContabilidad;
	public Boolean isPermisoConsultaContabilidad;
	public Boolean isPermisoBusquedaContabilidad;
	public Boolean isPermisoReporteContabilidad;
	public Boolean isPermisoPaginacionMedioContabilidad;
	public Boolean isPermisoPaginacionAltoContabilidad;
	public Boolean isPermisoPaginacionTodoContabilidad;
	public Boolean isPermisoCopiarContabilidad;
	public Boolean isPermisoVerFormContabilidad;
	public Boolean isPermisoDuplicarContabilidad;
	public Boolean isPermisoOrdenContabilidad;
	
	
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
	
	public ContabilidadParameterReturnGeneral contabilidadReturnGeneral;
	public ContabilidadParameterReturnGeneral contabilidadParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoContabilidad=false;
	public Boolean esParaAccionDesdeFormularioContabilidad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ContabilidadSessionBeanAdditional contabilidadSessionBeanAdditional=null;
	
	public ContabilidadSessionBeanAdditional getContabilidadSessionBeanAdditional() {
		return this.contabilidadSessionBeanAdditional;
	}
	
	public void setContabilidadSessionBeanAdditional(ContabilidadSessionBeanAdditional contabilidadSessionBeanAdditional) {
		try {
			this.contabilidadSessionBeanAdditional=contabilidadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ContabilidadBeanSwingJInternalFrameAdditional contabilidadBeanSwingJInternalFrameAdditional=null;
	//public class ContabilidadBeanSwingJInternalFrame
	
	public ContabilidadBeanSwingJInternalFrameAdditional getContabilidadBeanSwingJInternalFrameAdditional() {
		return this.contabilidadBeanSwingJInternalFrameAdditional;
	}
	
	public void setContabilidadBeanSwingJInternalFrameAdditional(ContabilidadBeanSwingJInternalFrameAdditional contabilidadBeanSwingJInternalFrameAdditional) {
		try {
			this.contabilidadBeanSwingJInternalFrameAdditional=contabilidadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ContabilidadLogic contabilidadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Contabilidad contabilidadBean;
	public ContabilidadConstantesFunciones contabilidadConstantesFunciones;
	//public ContabilidadParameterReturnGeneral contabilidadReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Contabilidad> contabilidads;	
	//public List<Contabilidad> contabilidadsEliminados;
	//public List<Contabilidad> contabilidadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoContabilidad=false;
	public Boolean isVisibilidadCeldaDuplicarContabilidad=true;
	public Boolean isVisibilidadCeldaCopiarContabilidad=true;
	public Boolean isVisibilidadCeldaVerFormContabilidad=true;
	public Boolean isVisibilidadCeldaOrdenContabilidad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesContabilidad=false;
	public Boolean isVisibilidadCeldaModificarContabilidad=false;
	public Boolean isVisibilidadCeldaActualizarContabilidad=false;
	public Boolean isVisibilidadCeldaEliminarContabilidad=false;
	public Boolean isVisibilidadCeldaCancelarContabilidad=false;
	public Boolean isVisibilidadCeldaGuardarContabilidad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosContabilidad=false;	
	
	
	
	public Long getiIdNuevoContabilidad() {
		return this.iIdNuevoContabilidad;
	}

	public void setiIdNuevoContabilidad(Long iIdNuevoContabilidad) {
		this.iIdNuevoContabilidad = iIdNuevoContabilidad;
	}
	
	public Long getidContabilidadActual() {
		return this.idContabilidadActual;
	}

	public void setidContabilidadActual(Long idContabilidadActual) {
		this.idContabilidadActual = idContabilidadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Contabilidad getcontabilidad() {
		return this.contabilidad;
	}

	public void setcontabilidad(Contabilidad contabilidad) {
		this.contabilidad = contabilidad;
	}
	
	public Contabilidad getcontabilidadAux() {
		return this.contabilidadAux;
	}

	public void setcontabilidadAux(Contabilidad contabilidadAux) {
		this.contabilidadAux = contabilidadAux;
	}				
	
	public Contabilidad getcontabilidadAnterior() {
		return this.contabilidadAnterior;
	}

	public void setcontabilidadAnterior(Contabilidad contabilidadAnterior) {
		this.contabilidadAnterior = contabilidadAnterior;
	}	
	
	public Contabilidad getcontabilidadTotales() {
		return this.contabilidadTotales;
	}

	public void setcontabilidadTotales(Contabilidad contabilidadTotales) {
		this.contabilidadTotales = contabilidadTotales;
	}	
	
	public Contabilidad getcontabilidadBean() {
		return this.contabilidadBean;
	}

	public void setcontabilidadBean(Contabilidad contabilidadBean) {
		this.contabilidadBean = contabilidadBean;
	}	
	
	public ContabilidadParameterReturnGeneral getcontabilidadReturnGeneral() {
		return this.contabilidadReturnGeneral;
	}

	public void setcontabilidadReturnGeneral(ContabilidadParameterReturnGeneral contabilidadReturnGeneral) {
		this.contabilidadReturnGeneral = contabilidadReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ContabilidadLogic getContabilidadLogic()	{		
		return contabilidadLogic;
	}

	public void setContabilidadLogic(ContabilidadLogic contabilidadLogic) {
		this.contabilidadLogic = contabilidadLogic;
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
	
	public Boolean getIsEsNuevoContabilidad() {
		return isEsNuevoContabilidad;
	}

	public void setIsEsNuevoContabilidad(Boolean isEsNuevoContabilidad) {
		this.isEsNuevoContabilidad = isEsNuevoContabilidad;
	}

	public Boolean getEsParaAccionDesdeFormularioContabilidad() {
		return esParaAccionDesdeFormularioContabilidad;
	}
	
	public void setEsParaAccionDesdeFormularioContabilidad(Boolean esParaAccionDesdeFormularioContabilidad) {
		this.esParaAccionDesdeFormularioContabilidad = esParaAccionDesdeFormularioContabilidad;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesContabilidad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ContabilidadConstantesFunciones.refrescarForeignKeysDescripcionesContabilidad(this.contabilidadLogic.getContabilidads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ContabilidadConstantesFunciones.refrescarForeignKeysDescripcionesContabilidad(this.contabilidads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//contabilidadLogic.setContabilidads(this.contabilidads);
			contabilidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ContabilidadParameterReturnGeneral getContabilidadParameterGeneral() {
		return this.contabilidadParameterGeneral;
	}
	
	public void setContabilidadParameterGeneral(ContabilidadParameterReturnGeneral contabilidadParameterGeneral) {
		this.contabilidadParameterGeneral = contabilidadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoContabilidad() {
		return isPermisoTodoContabilidad;
	}

	public void setIsPermisoTodoContabilidad(Boolean isPermisoTodoContabilidad) {
		this.isPermisoTodoContabilidad = isPermisoTodoContabilidad;
	}

	public Boolean getIsPermisoNuevoContabilidad() {
		return isPermisoNuevoContabilidad;
	}

	public void setIsPermisoNuevoContabilidad(Boolean isPermisoNuevoContabilidad) {
		this.isPermisoNuevoContabilidad = isPermisoNuevoContabilidad;
	}

	public Boolean getIsPermisoActualizarContabilidad() {
		return isPermisoActualizarContabilidad;
	}

	public void setIsPermisoActualizarContabilidad(Boolean isPermisoActualizarContabilidad) {
		this.isPermisoActualizarContabilidad = isPermisoActualizarContabilidad;
	}

	public Boolean getIsPermisoEliminarContabilidad() {
		return isPermisoEliminarContabilidad;
	}

	public void setIsPermisoEliminarContabilidad(Boolean isPermisoEliminarContabilidad) {
		this.isPermisoEliminarContabilidad = isPermisoEliminarContabilidad;
	}

	public Boolean getIsPermisoGuardarCambiosContabilidad() {
		return isPermisoGuardarCambiosContabilidad;
	}

	public void setIsPermisoGuardarCambiosContabilidad(Boolean isPermisoGuardarCambiosContabilidad) {
		this.isPermisoGuardarCambiosContabilidad = isPermisoGuardarCambiosContabilidad;
	}
	
	public Boolean getIsPermisoConsultaContabilidad() {
		return isPermisoConsultaContabilidad;
	}

	public void setIsPermisoConsultaContabilidad(Boolean isPermisoConsultaContabilidad) {
		this.isPermisoConsultaContabilidad = isPermisoConsultaContabilidad;
	}

	public Boolean getIsPermisoBusquedaContabilidad() {
		return isPermisoBusquedaContabilidad;
	}

	public void setIsPermisoBusquedaContabilidad(Boolean isPermisoBusquedaContabilidad) {
		this.isPermisoBusquedaContabilidad = isPermisoBusquedaContabilidad;
	}

	public Boolean getIsPermisoReporteContabilidad() {
		return isPermisoReporteContabilidad;
	}

	public void setIsPermisoReporteContabilidad(Boolean isPermisoReporteContabilidad) {
		this.isPermisoReporteContabilidad = isPermisoReporteContabilidad;
	}
	
	public Boolean getIsPermisoPaginacionMedioContabilidad() {
		return isPermisoPaginacionMedioContabilidad;
	}

	public void setIsPermisoPaginacionMedioContabilidad(Boolean isPermisoPaginacionMedioContabilidad) {
		this.isPermisoPaginacionMedioContabilidad = isPermisoPaginacionMedioContabilidad;
	}
	
	public Boolean getIsPermisoPaginacionTodoContabilidad() {
		return isPermisoPaginacionTodoContabilidad;
	}

	public void setIsPermisoPaginacionTodoContabilidad(Boolean isPermisoPaginacionTodoContabilidad) {
		this.isPermisoPaginacionTodoContabilidad = isPermisoPaginacionTodoContabilidad;
	}
	
	public Boolean getIsPermisoPaginacionAltoContabilidad() {
		return isPermisoPaginacionAltoContabilidad;
	}

	public void setIsPermisoPaginacionAltoContabilidad(Boolean isPermisoPaginacionAltoContabilidad) {
		this.isPermisoPaginacionAltoContabilidad = isPermisoPaginacionAltoContabilidad;
	}
	
	public Boolean getIsPermisoCopiarContabilidad() {
		return isPermisoCopiarContabilidad;
	}

	public void setIsPermisoCopiarContabilidad(Boolean isPermisoCopiarContabilidad) {
		this.isPermisoCopiarContabilidad = isPermisoCopiarContabilidad;
	}
	
	public Boolean getIsPermisoVerFormContabilidad() {
		return isPermisoVerFormContabilidad;
	}

	public void setIsPermisoVerFormContabilidad(Boolean isPermisoVerFormContabilidad) {
		this.isPermisoVerFormContabilidad = isPermisoVerFormContabilidad;
	}
	
	public Boolean getIsPermisoDuplicarContabilidad() {
		return isPermisoDuplicarContabilidad;
	}

	public void setIsPermisoDuplicarContabilidad(Boolean isPermisoDuplicarContabilidad) {
		this.isPermisoDuplicarContabilidad = isPermisoDuplicarContabilidad;
	}
	
	public Boolean getIsPermisoOrdenContabilidad() {
		return isPermisoOrdenContabilidad;
	}

	public void setIsPermisoOrdenContabilidad(Boolean isPermisoOrdenContabilidad) {
		this.isPermisoOrdenContabilidad = isPermisoOrdenContabilidad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoContabilidad() {
		return isVisibilidadCeldaNuevoContabilidad;
	}

	public void setIsVisibilidadCeldaNuevoContabilidad(Boolean isVisibilidadCeldaNuevoContabilidad) {
		this.isVisibilidadCeldaNuevoContabilidad = isVisibilidadCeldaNuevoContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarContabilidad() {
		return isVisibilidadCeldaDuplicarContabilidad;
	}

	public void setIsVisibilidadCeldaDuplicarContabilidad(Boolean isVisibilidadCeldaDuplicarContabilidad) {
		this.isVisibilidadCeldaDuplicarContabilidad = isVisibilidadCeldaDuplicarContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarContabilidad() {
		return isVisibilidadCeldaCopiarContabilidad;
	}

	public void setIsVisibilidadCeldaCopiarContabilidad(Boolean isVisibilidadCeldaCopiarContabilidad) {
		this.isVisibilidadCeldaCopiarContabilidad = isVisibilidadCeldaCopiarContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormContabilidad() {
		return isVisibilidadCeldaVerFormContabilidad;
	}

	public void setIsVisibilidadCeldaVerFormContabilidad(Boolean isVisibilidadCeldaVerFormContabilidad) {
		this.isVisibilidadCeldaVerFormContabilidad = isVisibilidadCeldaVerFormContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenContabilidad() {
		return isVisibilidadCeldaOrdenContabilidad;
	}

	public void setIsVisibilidadCeldaOrdenContabilidad(Boolean isVisibilidadCeldaOrdenContabilidad) {
		this.isVisibilidadCeldaOrdenContabilidad = isVisibilidadCeldaOrdenContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesContabilidad() {
		return isVisibilidadCeldaNuevoRelacionesContabilidad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesContabilidad(Boolean isVisibilidadCeldaNuevoRelacionesContabilidad) {
		this.isVisibilidadCeldaNuevoRelacionesContabilidad = isVisibilidadCeldaNuevoRelacionesContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarContabilidad() {
		return isVisibilidadCeldaModificarContabilidad;
	}

	public void setIsVisibilidadCeldaModificarContabilidad(Boolean isVisibilidadCeldaModificarContabilidad) {
		this.isVisibilidadCeldaModificarContabilidad = isVisibilidadCeldaModificarContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarContabilidad() {
		return isVisibilidadCeldaActualizarContabilidad;
	}

	public void setIsVisibilidadCeldaActualizarContabilidad(Boolean isVisibilidadCeldaActualizarContabilidad) {
		this.isVisibilidadCeldaActualizarContabilidad = isVisibilidadCeldaActualizarContabilidad;
	}

	public Boolean getIsVisibilidadCeldaEliminarContabilidad() {
		return isVisibilidadCeldaEliminarContabilidad;
	}

	public void setIsVisibilidadCeldaEliminarContabilidad(Boolean isVisibilidadCeldaEliminarContabilidad) {
		this.isVisibilidadCeldaEliminarContabilidad = isVisibilidadCeldaEliminarContabilidad;
	}

	public Boolean getIsVisibilidadCeldaCancelarContabilidad() {
		return isVisibilidadCeldaCancelarContabilidad;
	}

	public void setIsVisibilidadCeldaCancelarContabilidad(Boolean isVisibilidadCeldaCancelarContabilidad) {
		this.isVisibilidadCeldaCancelarContabilidad = isVisibilidadCeldaCancelarContabilidad;
	}

	public Boolean getIsVisibilidadCeldaGuardarContabilidad() {
		return isVisibilidadCeldaGuardarContabilidad;
	}

	public void setIsVisibilidadCeldaGuardarContabilidad(Boolean isVisibilidadCeldaGuardarContabilidad) {
		this.isVisibilidadCeldaGuardarContabilidad = isVisibilidadCeldaGuardarContabilidad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosContabilidad() {
		return isVisibilidadCeldaGuardarCambiosContabilidad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosContabilidad(Boolean isVisibilidadCeldaGuardarCambiosContabilidad) {
		this.isVisibilidadCeldaGuardarCambiosContabilidad = isVisibilidadCeldaGuardarCambiosContabilidad;
	}
		
	public ContabilidadSessionBean getcontabilidadSessionBean() {
		return this.contabilidadSessionBean;
	}
	
	public void setcontabilidadSessionBean(ContabilidadSessionBean contabilidadSessionBean) {
		this.contabilidadSessionBean=contabilidadSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysContabilidad(Contabilidad contabilidad)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Contabilidad contabilidad,Contabilidad contabilidadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalContabilidad(contabilidad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		contabilidadAux.setId(contabilidad.getId());
		contabilidadAux.setVersionRow(contabilidad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessContabilidad();
		
			int intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidad =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.contabilidad =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualContabilidad(this.contabilidad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysContabilidad(this.contabilidad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = contabilidadValidator.getInvalidValues(this.contabilidad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			contabilidadLogic.setDatosCliente(datosCliente);
			contabilidadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				contabilidadAux=new  Contabilidad();
				
				contabilidadAux.setIsNew(true);
				contabilidadAux.setIsChanged(true);
				
				contabilidadAux.setContabilidadOriginal(this.contabilidad);
				
				contabilidadAux.setId(this.contabilidad.getId());	
				contabilidadAux.setVersionRow(this.contabilidad.getVersionRow());	
				contabilidadAux.setcodigo(this.contabilidad.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.contabilidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.contabilidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(contabilidadAux,contabilidadLogic.getContabilidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(contabilidadAux,contabilidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.contabilidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.contabilidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contabilidadLogic.saveContabilidads();//WithConnection
						//contabilidadLogic.getSetVersionRowContabilidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.contabilidad,contabilidadAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.contabilidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								contabilidadLogic.saveContabilidadRelaciones(contabilidadAux);//WithConnection
								//contabilidadLogic.getSetVersionRowContabilidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.contabilidad,contabilidadAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.contabilidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.contabilidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(contabilidadAux,contabilidadLogic.getContabilidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(contabilidadAux,contabilidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.contabilidad,contabilidadAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				contabilidadAux=new  Contabilidad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.contabilidadSessionBean.getEsGuardarRelacionado() 
					|| (this.contabilidadSessionBean.getEsGuardarRelacionado() && this.contabilidad.getId()>=0)) {
						
					contabilidadAux.setIsNew(false);
				}
				
				contabilidadAux.setIsDeleted(false);
			
				contabilidadAux.setId(this.contabilidad.getId());	
				contabilidadAux.setVersionRow(this.contabilidad.getVersionRow());	
				contabilidadAux.setcodigo(this.contabilidad.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(contabilidadAux,contabilidadLogic.getContabilidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(contabilidadAux,contabilidads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.contabilidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.contabilidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contabilidadLogic.saveContabilidads();//WithConnection
						//contabilidadLogic.getSetVersionRowContabilidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.contabilidad,contabilidadAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.contabilidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								contabilidadLogic.saveContabilidadRelaciones(contabilidadAux);//WithConnection
								//contabilidadLogic.getSetVersionRowContabilidads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.contabilidad,contabilidadAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.contabilidadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.contabilidadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(contabilidadAux,contabilidadLogic.getContabilidads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(contabilidadAux,contabilidads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.contabilidad,contabilidadAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				contabilidadAux=new  Contabilidad();
				
				contabilidadAux.setIsNew(false);
				contabilidadAux.setIsChanged(false);
				
				contabilidadAux.setIsDeleted(true);
				
				contabilidadAux.setId(this.contabilidad.getId());	
				contabilidadAux.setVersionRow(this.contabilidad.getVersionRow());	
				contabilidadAux.setcodigo(this.contabilidad.getcodigo());	
				
				if(this.contabilidadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.contabilidadAux.getId()>=0) {	
						this.contabilidadsEliminados.add(contabilidadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(contabilidadAux,contabilidadLogic.getContabilidads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(contabilidadAux,contabilidads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.contabilidadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.contabilidadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contabilidadLogic.saveContabilidads();//WithConnection
						//contabilidadLogic.getSetVersionRowContabilidads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.contabilidadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								contabilidadLogic.saveContabilidadRelaciones(contabilidadAux);//WithConnection
								//contabilidadLogic.getSetVersionRowContabilidads();//WithConnection
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
							if(this.contabilidadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.contabilidadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(contabilidadAux,contabilidadLogic.getContabilidads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(contabilidadAux,contabilidads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadLogic.getContabilidads().addAll(this.contabilidadsEliminados);
					
					contabilidadLogic.saveContabilidads();//WithConnection
					//contabilidadLogic.getSetVersionRowContabilidads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.contabilidadsEliminados= new ArrayList<Contabilidad>();		
			}
			
			if(this.contabilidadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Contabilidad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Contabilidad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.contabilidad=contabilidadAux;
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
      		//this.finishProcessContabilidad();
      	}
		
	}	
	
	public void actualizarRelaciones(Contabilidad contabilidadLocal) throws Exception {
		
		if(this.contabilidadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Contabilidad contabilidadLocal) throws Exception {	
		if(this.contabilidadSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarContabilidadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.contabilidad =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.contabilidad =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = contabilidadValidator.getInvalidValues(this.contabilidad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Contabilidad contabilidad,List<Contabilidad> contabilidads) throws Exception {
		try	{		
			ContabilidadConstantesFunciones.actualizarLista(contabilidad,contabilidads,this.contabilidadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Contabilidad contabilidad,List<Contabilidad> contabilidads) throws Exception {
		try	{			
			ContabilidadConstantesFunciones.actualizarSelectedLista(contabilidad,contabilidads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Contabilidad> contabilidadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				contabilidadsLocal=this.contabilidadLogic.getContabilidads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				contabilidadsLocal=this.contabilidads;
			}
			//ARCHITECTURE
		
			for(Contabilidad contabilidadLocal:contabilidadsLocal) {
				if(this.permiteMantenimiento(contabilidadLocal) && contabilidadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ContabilidadConstantesFunciones.getContabilidadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ContabilidadConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContabilidad.jLabelcodigoContabilidad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormContabilidad.jLabelcodigoContabilidad,"");
		
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
		this.iIdNuevoContabilidad--;	
		
		
		this.contabilidadAux=new Contabilidad();
		
		this.contabilidadAux.setId(this.iIdNuevoContabilidad);
		this.contabilidadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.contabilidadLogic.getContabilidads().add(this.contabilidadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.contabilidads.add(this.contabilidadAux);
		}
		//ARCHITECTURE
		
		this.contabilidad=this.contabilidadAux;
		
		if(ContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioContabilidad(this.contabilidad);
			this.setVariablesObjetoActualToFormularioForeignKeyContabilidad(this.contabilidad);
		}
				
		//this.setDefaultControlesContabilidad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyContabilidad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyContabilidad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyContabilidad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualContabilidad(this.contabilidadBean,this.contabilidad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysContabilidad(this.contabilidad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanContabilidad(this.contabilidadReturnGeneral,this.contabilidadBean,false);
		
		if(this.contabilidadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyContabilidad(this.contabilidadReturnGeneral.getContabilidad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioContabilidad(this.contabilidadReturnGeneral.getContabilidad());
		}
		
		if(this.contabilidadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioContabilidad(this.contabilidadReturnGeneral.getContabilidad(),classes);//this.contabilidadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualContabilidad(this.contabilidad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyContabilidad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyContabilidad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ContabilidadBeanSwingJInternalFrameAdditional.RecargarFormContabilidad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingContabilidad(false);
						
			if(contabilidadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ContabilidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualContabilidad();
			}
			
			this.actualizarVisualTableDatosContabilidad();
			
			this.jTableDatosContabilidad.setRowSelectionInterval(this.getIndiceNuevoContabilidad(), this.getIndiceNuevoContabilidad());
			
			this.seleccionarFilaTablaContabilidadActual();
						
			this.actualizarEstadoCeldasBotonesContabilidad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesContabilidad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormContabilidad.jTextFieldcodigoContabilidad.setEnabled(isHabilitar && this.contabilidadConstantesFunciones.activarcodigoContabilidad);	
		
	};
	
	public void setDefaultControlesContabilidad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoContabilidad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.contabilidadSessionBean.setConGuardarRelaciones(true);			
			this.contabilidadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormContabilidad.jTabbedPaneRelacionesContabilidad.setVisible(true);
			
					
		} else {
			//this.contabilidadSessionBean.setConGuardarRelaciones(false);			
			this.contabilidadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormContabilidad.jTabbedPaneRelacionesContabilidad.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoContabilidad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Contabilidad contabilidadAux:this.contabilidadLogic.getContabilidads()) {
				if(contabilidadAux.getId().equals(this.iIdNuevoContabilidad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Contabilidad contabilidadAux:this.contabilidads) {
				if(contabilidadAux.getId().equals(this.iIdNuevoContabilidad)) {
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
	
	public int getIndiceActualContabilidad(Contabilidad contabilidad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Contabilidad contabilidadAux:this.contabilidadLogic.getContabilidads()) {
				if(contabilidadAux.getId().equals(contabilidad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Contabilidad contabilidadAux:this.contabilidads) {
				if(contabilidadAux.getId().equals(contabilidad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalContabilidad(Contabilidad contabilidadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Contabilidad contabilidadAux:this.contabilidadLogic.getContabilidads()) {
				if(contabilidadAux.getContabilidadOriginal().getId().equals(contabilidadOriginal.getId())) {
					existe=true;
					contabilidadOriginal.setId(contabilidadAux.getId());
					contabilidadOriginal.setVersionRow(contabilidadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Contabilidad contabilidadAux:this.contabilidads) {
				if(contabilidadAux.getContabilidadOriginal().getId().equals(contabilidadOriginal.getId())) {
					existe=true;
					contabilidadOriginal.setId(contabilidadAux.getId());
					contabilidadOriginal.setVersionRow(contabilidadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosContabilidad(Boolean esParaCancelar) throws Exception {
		contabilidadsAux=new ArrayList<Contabilidad>();
		contabilidadAux=new Contabilidad();
		
		if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Contabilidad contabilidadAux:this.contabilidadLogic.getContabilidads()) {
					if(contabilidadAux.getId()<0) {
						contabilidadsAux.add(contabilidadAux);
					}		
				}
				this.iIdNuevoContabilidad=0L;
				this.contabilidadLogic.getContabilidads().removeAll(contabilidadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Contabilidad contabilidadAux:this.contabilidads) {
					if(contabilidadAux.getId()<0) {
						contabilidadsAux.add(contabilidadAux);
					}		
				}
				this.iIdNuevoContabilidad=0L;
				this.contabilidads.removeAll(contabilidadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoContabilidad 
					&& this.contabilidadLogic.getContabilidads().size()>0
					) {
					contabilidadAux=this.contabilidadLogic.getContabilidads().get(this.contabilidadLogic.getContabilidads().size() - 1);
				
					if(contabilidadAux.getId()<0) {
						this.contabilidadLogic.getContabilidads().remove(contabilidadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoContabilidad && this.contabilidads.size()>0) {
					contabilidadAux=this.contabilidads.get(this.contabilidads.size() - 1);
				
					if(contabilidadAux.getId()<0) {
						this.contabilidads.remove(contabilidadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoContabilidad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(contabilidad.getId()<0) {
				this.contabilidadLogic.getContabilidads().remove(this.contabilidad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(contabilidad.getId()<0) {
				this.contabilidads.remove(this.contabilidad);
			}
		}			
	}
	
	public void setEstadosInicialesContabilidad(List<Contabilidad> contabilidadsAux) throws Exception {
		ContabilidadConstantesFunciones.setEstadosInicialesContabilidad(contabilidadsAux);
	}
	
	public void setEstadosInicialesContabilidad(Contabilidad contabilidadAux) throws Exception {
		ContabilidadConstantesFunciones.setEstadosInicialesContabilidad(contabilidadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarContabilidadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesContabilidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarContabilidadActual()) {
				if(!this.isEsNuevoContabilidad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesContabilidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoContabilidad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarContabilidadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Contabilidad ?", "MANTENIMIENTO DE Contabilidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesContabilidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Contabilidad contabilidad) throws Exception {
		ContabilidadConstantesFunciones.seleccionarAsignar(this.contabilidad,contabilidad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarContabilidad=this.isPermisoActualizarOriginalContabilidad;
			
			
			this.seleccionarAsignar(contabilidad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ContabilidadConstantesFunciones.quitarEspaciosContabilidad(this.contabilidad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesContabilidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.contabilidadSessionBean.setsFuncionBusquedaRapida(this.contabilidadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoContabilidad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosContabilidad(esParaCancelar);				
				this.cancelarNuevoContabilidad(esParaCancelar);								
			}
			
			this.contabilidad=new Contabilidad();
			
			this.inicializarContabilidad();
			
			this.actualizarEstadoCeldasBotonesContabilidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarContabilidad() throws Exception {
		try {
			ContabilidadConstantesFunciones.inicializarContabilidad(this.contabilidad);
			
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
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.contabilidadLogic.getContabilidads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteContabilidads(String sAccionBusqueda,List<Contabilidad> contabilidadsParaReportes) throws Exception {
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
					sPathReporteFinal="Contabilidad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ContabilidadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ContabilidadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Contabilidad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Contabilidads");		
		parameters.put("busquedapor", ContabilidadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceContabilidad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ContabilidadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ContabilidadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceContabilidad=new JRBeanArrayDataSource(ContabilidadJInternalFrame.TraerContabilidadBeans(contabilidadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceContabilidad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ContabilidadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ContabilidadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ContabilidadBean.TraerContabilidadBeans(contabilidadsParaReportes).toArray()));
							
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
				this.generarExcelReporteContabilidads(sAccionBusqueda,sTipoArchivoReporte,contabilidadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalContabilidads(sAccionBusqueda,sTipoArchivoReporte,contabilidadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoContabilidadActionPerformed(null);
					//this.generarExcelReporteContabilidads(sAccionBusqueda,sTipoArchivoReporte,contabilidadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalContabilidads(sAccionBusqueda,sTipoArchivoReporte,contabilidadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesContabilidads(sAccionBusqueda,sTipoArchivoReporte,contabilidadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesContabilidads(sAccionBusqueda,sTipoArchivoReporte,contabilidadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteContabilidads(String sAccionBusqueda,String sTipoArchivoReporte,List<Contabilidad> contabilidadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contabilidad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Contabilidads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderContabilidad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Contabilidad contabilidad : contabilidadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ContabilidadConstantesFunciones.generarExcelReporteDataContabilidad("NORMAL",row,workbook,contabilidad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contabilidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderContabilidad(String sTipo,Row row,Workbook workbook) {
		
		ContabilidadConstantesFunciones.generarExcelReporteHeaderContabilidad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalContabilidads(String sAccionBusqueda,String sTipoArchivoReporte,List<Contabilidad> contabilidadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contabilidad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Contabilidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Contabilidad contabilidad : contabilidadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ContabilidadConstantesFunciones.getContabilidadDescripcion(contabilidad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ContabilidadConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ContabilidadConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(contabilidad.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contabilidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesContabilidads(String sAccionBusqueda,String sTipoArchivoReporte,List<Contabilidad> contabilidadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Contabilidad> contabilidadsRespaldo=null;
		
		classes=ContabilidadConstantesFunciones.getClassesRelationshipsOfContabilidad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.contabilidadLogic.setDatosCliente(this.datosCliente);
		this.contabilidadLogic.setDatosDeep(this.datosDeep);
		this.contabilidadLogic.setIsConDeep(true);
		
		contabilidadsRespaldo=this.contabilidadLogic.getContabilidads();
		
		this.contabilidadLogic.setContabilidads(contabilidadsParaReportes);	
		this.contabilidadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		contabilidadsParaReportes=this.contabilidadLogic.getContabilidads();
		this.contabilidadLogic.setContabilidads(contabilidadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contabilidad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Contabilidads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderContabilidad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Contabilidad contabilidad : contabilidadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderContabilidad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ContabilidadConstantesFunciones.generarExcelReporteDataContabilidad("NORMAL",row,workbook,contabilidad,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ContabilidadConstantesFunciones.getContabilidadDescripcion(contabilidad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contabilidad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoContabilidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContabilidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoContabilidad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContabilidad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessContabilidad() throws Exception {		
		this.startProcessContabilidad(true);
	}
	
	public void startProcessContabilidad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesContabilidad, this.jScrollPanelDatosContabilidad,this.jPanelPaginacionContabilidad, this.jScrollPanelDatosEdicionContabilidad, this.jPanelAccionesContabilidad,this.jPanelAccionesFormularioContabilidad,this.jmenuBarContabilidad,this.jmenuBarDetalleContabilidad,this.jTtoolBarContabilidad,this.jTtoolBarDetalleContabilidad);		
		
		final JTabbedPane jTabbedPaneBusquedasContabilidad=null; 
		
		final JPanel jPanelParametrosReportesContabilidad=this.jPanelParametrosReportesContabilidad;
		//final JScrollPane jScrollPanelDatosContabilidad=this.jScrollPanelDatosContabilidad;
		final JTable jTableDatosContabilidad=this.jTableDatosContabilidad;		
		final JPanel jPanelPaginacionContabilidad=this.jPanelPaginacionContabilidad;
		//final JScrollPane jScrollPanelDatosEdicionContabilidad=this.jScrollPanelDatosEdicionContabilidad;
		final JPanel jPanelAccionesContabilidad=this.jPanelAccionesContabilidad;
		
		JPanel jPanelCamposAuxiliarContabilidad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarContabilidad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) {
			jPanelCamposAuxiliarContabilidad=this.jInternalFrameDetalleFormContabilidad.jPanelCamposContabilidad;
			jPanelAccionesFormularioAuxiliarContabilidad=this.jInternalFrameDetalleFormContabilidad.jPanelAccionesFormularioContabilidad;
		}
		
		final JPanel jPanelCamposContabilidad=jPanelCamposAuxiliarContabilidad;
		final JPanel jPanelAccionesFormularioContabilidad=jPanelAccionesFormularioAuxiliarContabilidad;
		
		
		final JMenuBar jmenuBarContabilidad=this.jmenuBarContabilidad;
		final JToolBar jTtoolBarContabilidad=this.jTtoolBarContabilidad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarContabilidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarContabilidad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) {
			jmenuBarDetalleAuxiliarContabilidad=this.jInternalFrameDetalleFormContabilidad.jmenuBarDetalleContabilidad;
			jTtoolBarDetalleAuxiliarContabilidad=this.jInternalFrameDetalleFormContabilidad.jTtoolBarDetalleContabilidad;
		}
		
		final JMenuBar jmenuBarDetalleContabilidad=jmenuBarDetalleAuxiliarContabilidad;
		final JToolBar jTtoolBarDetalleContabilidad=jTtoolBarDetalleAuxiliarContabilidad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasContabilidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesContabilidad;
			processRunnable.jTableDatos=jTableDatosContabilidad;
			processRunnable.jPanelCampos=jPanelCamposContabilidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionContabilidad;
			processRunnable.jPanelAcciones=jPanelAccionesContabilidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioContabilidad;
			
			
			processRunnable.jmenuBar=jmenuBarContabilidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleContabilidad;
			processRunnable.jTtoolBar=jTtoolBarContabilidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleContabilidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasContabilidad ,jPanelParametrosReportesContabilidad,jTableDatosContabilidad, /*jScrollPanelDatosContabilidad,*/jPanelCamposContabilidad,jPanelPaginacionContabilidad, /*jScrollPanelDatosEdicionContabilidad,*/ jPanelAccionesContabilidad,jPanelAccionesFormularioContabilidad,jmenuBarContabilidad,jmenuBarDetalleContabilidad,jTtoolBarContabilidad,jTtoolBarDetalleContabilidad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesContabilidad, jScrollPanelDatosContabilidad,jPanelPaginacionContabilidad, jScrollPanelDatosEdicionContabilidad, jPanelAccionesContabilidad,jPanelAccionesFormularioContabilidad,jmenuBarContabilidad,jmenuBarDetalleContabilidad,jTtoolBarContabilidad,jTtoolBarDetalleContabilidad);
						
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
	
	public void finishProcessContabilidad() {// throws Exception 
		this.finishProcessContabilidad(true);
	}
	
	public void finishProcessContabilidad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesContabilidad, this.jScrollPanelDatosContabilidad,this.jPanelPaginacionContabilidad, this.jScrollPanelDatosEdicionContabilidad, this.jPanelAccionesContabilidad,this.jPanelAccionesFormularioContabilidad,this.jmenuBarContabilidad,this.jmenuBarDetalleContabilidad,this.jTtoolBarContabilidad,this.jTtoolBarDetalleContabilidad);		
		
		final JTabbedPane jTabbedPaneBusquedasContabilidad=null; 
		
		final JPanel jPanelParametrosReportesContabilidad=this.jPanelParametrosReportesContabilidad;
		//final JScrollPane jScrollPanelDatosContabilidad=this.jScrollPanelDatosContabilidad;
		final JTable jTableDatosContabilidad=this.jTableDatosContabilidad;		
		final JPanel jPanelPaginacionContabilidad=this.jPanelPaginacionContabilidad;
		//final JScrollPane jScrollPanelDatosEdicionContabilidad=this.jScrollPanelDatosEdicionContabilidad;
		final JPanel jPanelAccionesContabilidad=this.jPanelAccionesContabilidad;
		
		JPanel jPanelCamposAuxiliarContabilidad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarContabilidad=new JPanel();
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) {
			jPanelCamposAuxiliarContabilidad=this.jInternalFrameDetalleFormContabilidad.jPanelCamposContabilidad;
			jPanelAccionesFormularioAuxiliarContabilidad=this.jInternalFrameDetalleFormContabilidad.jPanelAccionesFormularioContabilidad;
		}
		
		final JPanel jPanelCamposContabilidad=jPanelCamposAuxiliarContabilidad;
		final JPanel jPanelAccionesFormularioContabilidad=jPanelAccionesFormularioAuxiliarContabilidad;
		
		
		final JMenuBar jmenuBarContabilidad=this.jmenuBarContabilidad;		
		final JToolBar jTtoolBarContabilidad=this.jTtoolBarContabilidad;
				
		JMenuBar jmenuBarDetalleAuxiliarContabilidad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarContabilidad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) {
			jmenuBarDetalleAuxiliarContabilidad=this.jInternalFrameDetalleFormContabilidad.jmenuBarDetalleContabilidad;
			jTtoolBarDetalleAuxiliarContabilidad=this.jInternalFrameDetalleFormContabilidad.jTtoolBarDetalleContabilidad;		
		}
		
		final JMenuBar jmenuBarDetalleContabilidad=jmenuBarDetalleAuxiliarContabilidad;
		final JToolBar jTtoolBarDetalleContabilidad=jTtoolBarDetalleAuxiliarContabilidad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasContabilidad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesContabilidad;
			processRunnable.jTableDatos=jTableDatosContabilidad;
			processRunnable.jPanelCampos=jPanelCamposContabilidad;
			processRunnable.jPanelPaginacion=jPanelPaginacionContabilidad;
			processRunnable.jPanelAcciones=jPanelAccionesContabilidad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioContabilidad;
			
			
			processRunnable.jmenuBar=jmenuBarContabilidad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleContabilidad;
			processRunnable.jTtoolBar=jTtoolBarContabilidad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleContabilidad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasContabilidad ,jPanelParametrosReportesContabilidad, jTableDatosContabilidad,/*jScrollPanelDatosContabilidad,*/jPanelCamposContabilidad,jPanelPaginacionContabilidad, /*jScrollPanelDatosEdicionContabilidad,*/ jPanelAccionesContabilidad,jPanelAccionesFormularioContabilidad,jmenuBarContabilidad,jmenuBarDetalleContabilidad,jTtoolBarContabilidad,jTtoolBarDetalleContabilidad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesContabilidad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarContabilidad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuContabilidad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarContabilidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarContabilidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleContabilidad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuContabilidad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarContabilidad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleContabilidad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.contabilidadConstantesFunciones.getsFinalQueryContabilidad();
		String  finalQueryPaginacionTodos=this.contabilidadConstantesFunciones.getsFinalQueryContabilidad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ContabilidadConstantesFunciones.getArrayColumnasGlobalesNoContabilidad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ContabilidadConstantesFunciones.getArrayColumnasGlobalesContabilidad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ContabilidadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.contabilidadsEliminados= new ArrayList<Contabilidad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessContabilidad();
		
				///*ContabilidadSessionBean*/this.contabilidadSessionBean=new ContabilidadSessionBean();
			
			if(this.contabilidadSessionBean==null) {
				this.contabilidadSessionBean=new ContabilidadSessionBean();
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
					this.iNumeroPaginacion=ContabilidadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ContabilidadConstantesFunciones.getClassesForeignKeysOfContabilidad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/contabilidad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			contabilidadsAux= new ArrayList<Contabilidad>();
			
				
			contabilidadLogic.setDatosCliente(this.datosCliente);
			contabilidadLogic.setDatosDeep(this.datosDeep);
			contabilidadLogic.setIsConDeep(true);
			
			
			contabilidadLogic.getContabilidadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					contabilidadLogic.getTodosContabilidads(finalQueryGlobal,pagination);
					
					//contabilidadLogic.getTodosContabilidadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(contabilidadLogic.getContabilidads()==null|| contabilidadLogic.getContabilidads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							contabilidadsAux= new ArrayList<Contabilidad>();
							contabilidadsAux.addAll(contabilidadLogic.getContabilidads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contabilidadsAux= new ArrayList<Contabilidad>();
							contabilidadsAux.addAll(contabilidads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							contabilidadLogic.getTodosContabilidads(finalQueryGlobal+"",this.pagination);												
							
							//contabilidadLogic.getTodosContabilidadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteContabilidads("Todos",contabilidadLogic.getContabilidads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							contabilidadLogic.setContabilidads(new ArrayList<Contabilidad>());					
							contabilidadLogic.getContabilidads().addAll(contabilidadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contabilidads=new ArrayList<Contabilidad>();
							contabilidads.addAll(contabilidadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idContabilidad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idContabilidad=this.idActual;
				
				} else if(this.idContabilidadActual!=null && this.idContabilidadActual!=0L) {
					idContabilidad=idContabilidadActual;
				}
				
					
				this.sDetalleReporte=ContabilidadConstantesFunciones.getDetalleIndicePorId(idContabilidad);
				
				this.contabilidads=new ArrayList<Contabilidad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					contabilidadLogic.getEntity(idContabilidad);
					
					//contabilidadLogic.getEntityWithConnection(idContabilidad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					contabilidadLogic.setContabilidads(new ArrayList<Contabilidad>());
					contabilidadLogic.getContabilidads().add(contabilidadLogic.getContabilidad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.contabilidads=new ArrayList<Contabilidad>();
					this.contabilidads.add(contabilidad);
				}
				
				if(contabilidadLogic.getContabilidad()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesContabilidad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessContabilidad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=contabilidadLogic.getContabilidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=contabilidads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=contabilidadLogic.getContabilidads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=contabilidads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Contabilidad contabilidad) {
		Boolean permite=true;
		
		if(this.contabilidad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ContabilidadConstantesFunciones.getOrderByListaContabilidad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ContabilidadConstantesFunciones.getOrderByListaContabilidad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Contabilidad contabilidad:contabilidadLogic.getContabilidads()) {
				if(contabilidad.getsType().equals(Constantes2.S_TOTALES)) {
					contabilidadTotales=contabilidad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Contabilidad contabilidad:this.contabilidads) {
				if(contabilidad.getsType().equals(Constantes2.S_TOTALES)) {
					contabilidadTotales=contabilidad;
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
			this.contabilidadAux=new Contabilidad();
			this.contabilidadAux.setsType(Constantes2.S_TOTALES);
			this.contabilidadAux.setIsNew(false);
			this.contabilidadAux.setIsChanged(false);
			this.contabilidadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ContabilidadConstantesFunciones.TotalizarValoresFilaContabilidad(this.contabilidadLogic.getContabilidads(),this.contabilidadAux);
				
				this.contabilidadLogic.getContabilidads().add(this.contabilidadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ContabilidadConstantesFunciones.TotalizarValoresFilaContabilidad(this.contabilidads,this.contabilidadAux);
				
				this.contabilidads.add(this.contabilidadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		contabilidadTotales=new Contabilidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.contabilidadLogic.getContabilidads().remove(contabilidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.contabilidads.remove(contabilidadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		contabilidadTotales=new Contabilidad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Contabilidad contabilidad:contabilidadLogic.getContabilidads()) {
				if(contabilidad.getsType().equals(Constantes2.S_TOTALES)) {
					contabilidadTotales=contabilidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ContabilidadConstantesFunciones.TotalizarValoresFilaContabilidad(this.contabilidadLogic.getContabilidads(),contabilidadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Contabilidad contabilidad:this.contabilidads) {
				if(contabilidad.getsType().equals(Constantes2.S_TOTALES)) {
					contabilidadTotales=contabilidad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ContabilidadConstantesFunciones.TotalizarValoresFilaContabilidad(this.contabilidads,contabilidadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosContabilidad() {
		this.isPermisoTodoContabilidad=false;
		this.isPermisoNuevoContabilidad=false;
		this.isPermisoActualizarContabilidad=false;
		this.isPermisoActualizarOriginalContabilidad=false;
		this.isPermisoEliminarContabilidad=false;
		this.isPermisoGuardarCambiosContabilidad=false;
		this.isPermisoConsultaContabilidad=false;
		this.isPermisoBusquedaContabilidad=false;
		this.isPermisoReporteContabilidad=false;		
		this.isPermisoOrdenContabilidad=false;		
		this.isPermisoPaginacionMedioContabilidad=false;		
		this.isPermisoPaginacionAltoContabilidad=false;
		this.isPermisoPaginacionTodoContabilidad=false;
		this.isPermisoCopiarContabilidad=false;		
		this.isPermisoVerFormContabilidad=false;		
		this.isPermisoDuplicarContabilidad=false;		
		this.isPermisoOrdenContabilidad=false;		
	}
	
	public void setPermisosUsuarioContabilidad(Boolean isPermiso) {
		this.isPermisoTodoContabilidad=isPermiso;
		this.isPermisoNuevoContabilidad=isPermiso;
		this.isPermisoActualizarContabilidad=isPermiso;
		this.isPermisoActualizarOriginalContabilidad=isPermiso;
		this.isPermisoEliminarContabilidad=isPermiso;
		this.isPermisoGuardarCambiosContabilidad=isPermiso;
		this.isPermisoConsultaContabilidad=isPermiso;
		this.isPermisoBusquedaContabilidad=isPermiso;
		this.isPermisoReporteContabilidad=isPermiso;
		this.isPermisoOrdenContabilidad=isPermiso;		
		this.isPermisoPaginacionMedioContabilidad=isPermiso;		
		this.isPermisoPaginacionAltoContabilidad=isPermiso;		
		this.isPermisoPaginacionTodoContabilidad=isPermiso;		
		this.isPermisoCopiarContabilidad=isPermiso;		
		this.isPermisoVerFormContabilidad=isPermiso;		
		this.isPermisoDuplicarContabilidad=isPermiso;
		this.isPermisoOrdenContabilidad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioContabilidad(Boolean isPermiso) {
		//this.isPermisoTodoContabilidad=isPermiso;
		this.isPermisoNuevoContabilidad=isPermiso;
		this.isPermisoActualizarContabilidad=isPermiso;
		this.isPermisoActualizarOriginalContabilidad=isPermiso;
		this.isPermisoEliminarContabilidad=isPermiso;
		this.isPermisoGuardarCambiosContabilidad=isPermiso;
		//this.isPermisoConsultaContabilidad=isPermiso;
		//this.isPermisoBusquedaContabilidad=isPermiso;
		//this.isPermisoReporteContabilidad=isPermiso;
		//this.isPermisoOrdenContabilidad=isPermiso;		
		//this.isPermisoPaginacionMedioContabilidad=isPermiso;		
		//this.isPermisoPaginacionAltoContabilidad=isPermiso;		
		//this.isPermisoPaginacionTodoContabilidad=isPermiso;		
		//this.isPermisoCopiarContabilidad=isPermiso;		
		//this.isPermisoDuplicarContabilidad=isPermiso;
		//this.isPermisoOrdenContabilidad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioContabilidadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ContabilidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebContabilidad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioContabilidadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioContabilidadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionContabilidadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioContabilidadClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioContabilidad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ContabilidadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.contabilidadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ContabilidadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoContabilidad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarContabilidad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalContabilidad=this.isPermisoActualizarContabilidad;
			this.isPermisoEliminarContabilidad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosContabilidad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaContabilidad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaContabilidad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoContabilidad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteContabilidad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenContabilidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioContabilidad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoContabilidad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoContabilidad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarContabilidad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormContabilidad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarContabilidad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenContabilidad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.contabilidadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosContabilidad.setToolTipText(this.jTableDatosContabilidad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioContabilidad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioContabilidad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ContabilidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ContabilidadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioContabilidad() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyContabilidadListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyContabilidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ContabilidadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyContabilidadListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyContabilidadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyContabilidad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyContabilidad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyContabilidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyContabilidad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyContabilidad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyContabilidad(Contabilidad contabilidad)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyContabilidad(Contabilidad contabilidad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyContabilidad()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyContabilidad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyContabilidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyContabilidad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroContabilidad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyContabilidad()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyContabilidad(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyContabilidad()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ContabilidadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ContabilidadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ContabilidadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.contabilidadSessionBean=new ContabilidadSessionBean(); 
		this.contabilidadConstantesFunciones=new ContabilidadConstantesFunciones(); 
		this.contabilidadBean=new Contabilidad();//(this.contabilidadConstantesFunciones); 		
		this.contabilidadReturnGeneral=new ContabilidadParameterReturnGeneral(); 
		
		this.contabilidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.contabilidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ContabilidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ContabilidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ContabilidadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessContabilidad(true);
			
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
			
			this.contabilidadConstantesFunciones=new ContabilidadConstantesFunciones(); 
			this.contabilidadBean=new Contabilidad();//this.contabilidadConstantesFunciones); 			
			this.contabilidadReturnGeneral=new ContabilidadParameterReturnGeneral(); 
		
			ContabilidadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Contabilidad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.contabilidad=new Contabilidad();
			this.contabilidads = new ArrayList<Contabilidad>();
			this.contabilidadsAux = new ArrayList<Contabilidad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic=new ContabilidadLogic();
				this.contabilidadLogic.getNewConnexionToDeep("");
			}
			
			//this.contabilidadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.contabilidadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormContabilidad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoContabilidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoContabilidad);	
					}
					
					if(this.jInternalFrameImportacionContabilidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionContabilidad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByContabilidad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByContabilidad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormContabilidad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormContabilidad);
				this.jInternalFrameDetalleFormContabilidad.setVisible(false);
				this.jInternalFrameDetalleFormContabilidad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoContabilidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoContabilidad);
					this.jInternalFrameReporteDinamicoContabilidad.setVisible(false);
					this.jInternalFrameReporteDinamicoContabilidad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionContabilidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionContabilidad);
					this.jInternalFrameImportacionContabilidad.setVisible(false);
					this.jInternalFrameImportacionContabilidad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByContabilidad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByContabilidad);
					this.jInternalFrameOrderByContabilidad.setVisible(false);
					this.jInternalFrameOrderByContabilidad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idContabilidadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ContabilidadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.contabilidadReturnGeneral=new ContabilidadParameterReturnGeneral();
			
			this.contabilidadParameterGeneral=new ContabilidadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.contabilidadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ContabilidadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.contabilidadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ContabilidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.contabilidadSessionBean.getEsGuardarRelacionado(),this.contabilidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ContabilidadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.contabilidadSessionBean.getEsGuardarRelacionado(),this.contabilidadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoContabilidad=false;
			this.isVisibilidadCeldaDuplicarContabilidad=true;
			this.isVisibilidadCeldaCopiarContabilidad=true;
			this.isVisibilidadCeldaVerFormContabilidad=true;
			this.isVisibilidadCeldaOrdenContabilidad=true;
			this.isVisibilidadCeldaNuevoRelacionesContabilidad=false;
			this.isVisibilidadCeldaModificarContabilidad=false;
			this.isVisibilidadCeldaActualizarContabilidad=false;
			this.isVisibilidadCeldaEliminarContabilidad=false;
			this.isVisibilidadCeldaCancelarContabilidad=false;
			this.isVisibilidadCeldaGuardarContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosContabilidad=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesContabilidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosContabilidad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioContabilidad(false);
			
			this.setPermisosUsuarioContabilidad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.contabilidadSessionBean.getEsGuardarRelacionado() 
				|| (this.contabilidadSessionBean.getEsGuardarRelacionado() && this.contabilidadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioContabilidadClasesRelacionadas();
			}
			
			if(this.contabilidadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioContabilidadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ContabilidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosContabilidad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualContabilidad();
			}
			
			if(!this.isPermisoBusquedaContabilidad) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioContabilidad,this.isPermisoPaginacionMedioContabilidad,this.isPermisoPaginacionTodoContabilidad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ContabilidadConstantesFunciones.getTiposSeleccionarContabilidad());
				
				this.tiposColumnasSelect=ContabilidadConstantesFunciones.getTiposSeleccionarContabilidad(true);
				
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
			//if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioContabilidad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioContabilidad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioContabilidad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesContabilidad() ;
			
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
				contabilidadImplementable= (ContabilidadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ContabilidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				contabilidadImplementableHome= (ContabilidadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ContabilidadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.contabilidads= new ArrayList<Contabilidad>();
			this.contabilidadsEliminados= new ArrayList<Contabilidad>();
						
			this.isEsNuevoContabilidad=false;
			this.esParaAccionDesdeFormularioContabilidad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyContabilidad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroContabilidad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ContabilidadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ContabilidadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesContabilidad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingContabilidad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormContabilidad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioContabilidad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioContabilidad();
			}
			
			ContabilidadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessContabilidad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Contabilidad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectContabilidad() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesContabilidad")) {
				iIndex=this.jInternalFrameDetalleFormContabilidad.jTabbedPaneRelacionesContabilidad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormContabilidad.jTabbedPaneRelacionesContabilidad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessContabilidad();	
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
	
	public void cargarCombosForeignKeyContabilidad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyContabilidad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyContabilidad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyContabilidadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyContabilidad();
		
		this.cargarCombosFrameForeignKeyContabilidad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyContabilidad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyContabilidad();
		}
	}
	
	
	
	public void jButtonNuevoContabilidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.contabilidadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			
			
			if(jTableDatosContabilidad.getRowCount()>=1) {
				jTableDatosContabilidad.removeRowSelectionInterval(0, jTableDatosContabilidad.getRowCount()-1);						
			}
			
			this.isEsNuevoContabilidad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoContabilidad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesContabilidad(true);			
			//this.contabilidad=new Contabilidad();
			//this.contabilidad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesContabilidad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContabilidad() ;
			
			if(ContabilidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleContabilidad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.contabilidad);	
			this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);				
			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			
			if(this.contabilidadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Contabilidad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarContabilidadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosContabilidad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosContabilidad.getSelectedRows().length;			
			}
			
			contabilidadsSeleccionados=this.getContabilidadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoContabilidad--;			
				//Contabilidad contabilidadAux= new Contabilidad();			
				//contabilidadAux.setId(this.iIdNuevoContabilidad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Contabilidad contabilidadOrigen=new Contabilidad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Contabilidad contabilidadOrigen : contabilidadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							contabilidadOrigen =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							contabilidadOrigen =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaContabilidad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.contabilidad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosContabilidad(contabilidadOrigen,this.contabilidad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysContabilidad(this.contabilidad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.contabilidadLogic.getContabilidads().add(this.contabilidadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.contabilidads.add(this.contabilidadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaContabilidad(false);
				
				this.jTableDatosContabilidad.setRowSelectionInterval(this.getIndiceNuevoContabilidad(), this.getIndiceNuevoContabilidad());
				
				int iLastRow =  this.jTableDatosContabilidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosContabilidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosContabilidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaContabilidad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();									
		
			Contabilidad contabilidadOrigen=new Contabilidad();
			Contabilidad contabilidadDestino=new Contabilidad();
				
			contabilidadsSeleccionados=this.getContabilidadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosContabilidad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || contabilidadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosContabilidad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contabilidadOrigen =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						contabilidadOrigen =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						contabilidadDestino =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						contabilidadDestino =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				contabilidadOrigen =contabilidadsSeleccionados.get(0);
				contabilidadDestino =contabilidadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosContabilidad(contabilidadOrigen,contabilidadDestino,true,false);
				
				contabilidadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(contabilidadDestino,contabilidadLogic.getContabilidads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(contabilidadDestino,contabilidads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaContabilidad(false);
				
				//this.jTableDatosContabilidad.setRowSelectionInterval(this.getIndiceNuevoContabilidad(), this.getIndiceNuevoContabilidad());
				
				int iLastRow =  this.jTableDatosContabilidad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosContabilidad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosContabilidad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaContabilidad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormContabilidad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesContabilidad.isVisible();
			
			
			this.jPanelParametrosReportesContabilidad.setVisible(!isVisible);
			this.jPanelPaginacionContabilidad.setVisible(!isVisible);
			this.jPanelAccionesContabilidad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameContabilidad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoContabilidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionContabilidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByContabilidad();
			
			this.abrirFrameOrderByContabilidad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByContabilidad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleContabilidad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormContabilidad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormContabilidad.isMaximum()) {
					this.jInternalFrameDetalleFormContabilidad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormContabilidad.setSize(this.jInternalFrameDetalleFormContabilidad.iWidthFormulario,this.jInternalFrameDetalleFormContabilidad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormContabilidad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormContabilidad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormContabilidad.isMaximum()) {
						this.jInternalFrameDetalleFormContabilidad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormContabilidad.jContentPaneDetalleContabilidad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormContabilidad.jTabbedPaneRelacionesContabilidad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormContabilidad.jContentPaneDetalleContabilidad.getWidth(),ContabilidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormContabilidad.jTabbedPaneRelacionesContabilidad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormContabilidad.jContentPaneDetalleContabilidad.getWidth(),ContabilidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormContabilidad.jTabbedPaneRelacionesContabilidad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormContabilidad.jContentPaneDetalleContabilidad.getWidth(),ContabilidadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormContabilidad.setVisible(true);
	        this.jInternalFrameDetalleFormContabilidad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByContabilidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByContabilidad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByContabilidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContabilidad,false,this);
				} else {
					this.jInternalFrameOrderByContabilidad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByContabilidad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByContabilidad);
				this.jInternalFrameOrderByContabilidad.setVisible(false);
				this.jInternalFrameOrderByContabilidad.setSelected(false);
				
				this.jInternalFrameOrderByContabilidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByContabilidad"));
				
				this.inicializarActualizarBindingTablaOrderByContabilidad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionContabilidad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionContabilidad==null) {
				
				this.jInternalFrameImportacionContabilidad=new ImportacionJInternalFrame(ContabilidadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionContabilidad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionContabilidad);
				this.jInternalFrameImportacionContabilidad.setVisible(false);
				this.jInternalFrameImportacionContabilidad.setSelected(false);


				this.jInternalFrameImportacionContabilidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionContabilidad"));
				this.jInternalFrameImportacionContabilidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionContabilidad"));
				this.jInternalFrameImportacionContabilidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionContabilidad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoContabilidad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoContabilidad==null) {
				this.jInternalFrameReporteDinamicoContabilidad=new ReporteDinamicoJInternalFrame(ContabilidadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoContabilidad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoContabilidad);
				this.jInternalFrameReporteDinamicoContabilidad.setVisible(false);
				this.jInternalFrameReporteDinamicoContabilidad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoContabilidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoContabilidad"));
				this.jInternalFrameReporteDinamicoContabilidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoContabilidad"));
				this.jInternalFrameReporteDinamicoContabilidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoContabilidad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualContabilidad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleContabilidad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormContabilidad);
			
	       	this.jInternalFrameDetalleFormContabilidad.setVisible(false);
	        this.jInternalFrameDetalleFormContabilidad.setSelected(false);
			
			//this.jInternalFrameDetalleFormContabilidad.dispose();
			//this.jInternalFrameDetalleFormContabilidad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoContabilidad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoContabilidad.setVisible(true);
	        this.jInternalFrameReporteDinamicoContabilidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionContabilidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionContabilidad.setVisible(true);
	        this.jInternalFrameImportacionContabilidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByContabilidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByContabilidad.setVisible(true);
	        this.jInternalFrameOrderByContabilidad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByContabilidad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByContabilidad.setVisible(false);
	        this.jInternalFrameOrderByContabilidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoContabilidad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoContabilidad.setVisible(false);
	        this.jInternalFrameReporteDinamicoContabilidad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionContabilidad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionContabilidad.setVisible(false);
	        this.jInternalFrameImportacionContabilidad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarContabilidad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarContabilidad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesContabilidad(true);
			//this.isEsNuevoContabilidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidad =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.contabilidad =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesContabilidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesContabilidad(false) ;
			
			if(contabilidadSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ContabilidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleContabilidad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContabilidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaContabilidadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidad =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contabilidad =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarContabilidad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesContabilidad(true);
			//this.isEsNuevoContabilidad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidad =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.contabilidad =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.contabilidad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesContabilidad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesContabilidad(false) ;
			
			if(ContabilidadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleContabilidad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContabilidad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesContabilidad(false);
			
			//if(!this.isEsNuevoContabilidad) {								
				int intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidad =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.contabilidad =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualContabilidad(this.contabilidad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysContabilidad(this.contabilidad);
				
			}
			
			if(this.permiteMantenimiento(this.contabilidad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoContabilidad=true;
					this.inicializarActualizarBindingTablaContabilidad(false);
					this.isEsNuevoContabilidad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoContabilidad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoContabilidad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesContabilidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualContabilidad(false);
				
				this.habilitarDeshabilitarControlesContabilidad(false);
			
												
				
				if(ContabilidadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleContabilidad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoContabilidadActionPerformed(evt,contabilidadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualContabilidad(this.contabilidad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosContabilidad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,contabilidadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.contabilidad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Contabilidad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contabilidad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarContabilidadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidad =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				this.contabilidad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.contabilidad =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				this.contabilidad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.contabilidad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ContabilidadModel) this.jTableDatosContabilidad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoContabilidad=true;
				this.inicializarActualizarBindingTablaContabilidad(false);
				this.isEsNuevoContabilidad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesContabilidad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualContabilidad(false);
				
				this.habilitarDeshabilitarControlesContabilidad(false);
				
				
				
				if(ContabilidadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleContabilidad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarContabilidadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosContabilidad.getRowCount()>=1) {
				jTableDatosContabilidad.removeRowSelectionInterval(0, jTableDatosContabilidad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesContabilidad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaContabilidad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesContabilidad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualContabilidad(false) ;
			
			this.isEsNuevoContabilidad=false;
			
			if(ContabilidadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleContabilidad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosContabilidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingContabilidad(false);
				
				//SI ES MANUAL
				if(ContabilidadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualContabilidad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosContabilidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoContabilidad--;			
			//Contabilidad contabilidadAux= new Contabilidad();			
			//contabilidadAux.setId(this.iIdNuevoContabilidad);
			
			if(this.jInternalFrameDetalleFormContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaContabilidad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysContabilidad(this.contabilidad);
			
			this.contabilidad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.contabilidadLogic.getContabilidads().add(this.contabilidadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.contabilidads.add(this.contabilidadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaContabilidad(false);
			
			this.jTableDatosContabilidad.setRowSelectionInterval(this.getIndiceNuevoContabilidad(), this.getIndiceNuevoContabilidad());
			
			int iLastRow =  this.jTableDatosContabilidad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosContabilidad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosContabilidad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaContabilidad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionContabilidadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingContabilidad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContabilidad(false);
			
			//SI ES MANUAL
			if(ContabilidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualContabilidad();
			}
			
			//this.abrirFrameTreeContabilidad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionContabilidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ContabilidadS ?", "MANTENIMIENTO DE Contabilidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionContabilidad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralContabilidad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.contabilidadReturnGeneral=contabilidadLogic.procesarImportacionContabilidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.contabilidadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarContabilidadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionContabilidadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionContabilidad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionContabilidad.setFileImportacion(this.jInternalFrameImportacionContabilidad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionContabilidad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionContabilidad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionContabilidad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionContabilidad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoContabilidadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();		

		contabilidadsSeleccionados=this.getContabilidadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContabilidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContabilidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ContabilidadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ContabilidadBaseDesign.jrxml";
			
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
			
			this.generarReporteContabilidads("Todos",contabilidadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contabilidad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoContabilidad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContabilidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ContabilidadConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoContabilidad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoContabilidad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoContabilidad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ContabilidadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoContabilidad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ContabilidadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoContabilidad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoContabilidad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ContabilidadConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
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
	
	public void jButtonGenerarExcelReporteDinamicoContabilidadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();		
		
		contabilidadsSeleccionados=this.getContabilidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contabilidad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Contabilidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoContabilidad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoContabilidad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ContabilidadConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ContabilidadConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Contabilidad contabilidad:contabilidadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(contabilidad.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelContabilidad(row);				
			//	iRow++;
			//}				
			
			//for(Contabilidad contabilidadAux:contabilidadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelContabilidad(contabilidadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contabilidad",JOptionPane.INFORMATION_MESSAGE);
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
				this.contabilidadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContabilidad(false);
			
			//SI ES MANUAL
			if(ContabilidadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualContabilidad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresContabilidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContabilidad(false);
			
			//SI ES MANUAL
			if(ContabilidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualContabilidad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesContabilidadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingContabilidad(false);
			
			//SI ES MANUAL
			if(ContabilidadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualContabilidad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.contabilidadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaContabilidad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosContabilidad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosContabilidad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosContabilidad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosContabilidad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosContabilidad.setMinimumSize(dimensionMinimum);
		this.jTableDatosContabilidad.setMaximumSize(dimensionMaximum);
		this.jTableDatosContabilidad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingContabilidad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingContabilidad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingContabilidad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaContabilidad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesContabilidad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasContabilidad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesContabilidad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesContabilidad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ContabilidadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualContabilidad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaContabilidad();
		
		this.inicializarActualizarBindingBotonesManualContabilidad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualContabilidad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesContabilidad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualContabilidad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualContabilidad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosContabilidad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosContabilidad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteContabilidad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormContabilidad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormContabilidad.jCheckBoxPostAccionNuevoContabilidad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormContabilidad.jCheckBoxPostAccionSinCerrarContabilidad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormContabilidad.jCheckBoxPostAccionSinMensajeContabilidad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosContabilidad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosContabilidad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteContabilidad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormContabilidad!=null) {
				this.jInternalFrameDetalleFormContabilidad.jCheckBoxPostAccionNuevoContabilidad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormContabilidad.jCheckBoxPostAccionSinCerrarContabilidad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormContabilidad.jCheckBoxPostAccionSinMensajeContabilidad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionContabilidad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionContabilidad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormContabilidad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesContabilidad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoContabilidad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContabilidad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesContabilidad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesContabilidad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarContabilidad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesContabilidad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoContabilidad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoContabilidad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesContabilidad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralContabilidad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesContabilidad(Boolean esInicializar) throws Exception {
		try	{	
			if(ContabilidadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualContabilidad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesContabilidad() throws Exception {
		try	{
			if(ContabilidadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualContabilidad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleContabilidad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualContabilidad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesContabilidad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesContabilidad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesContabilidad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionContabilidad.addItem(reporte);
			}
			
			
			if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionContabilidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionContabilidad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesContabilidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesContabilidad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarContabilidad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarContabilidad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarContabilidad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualContabilidad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualContabilidad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoContabilidad!=null) {
				this.jInternalFrameReporteDinamicoContabilidad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoContabilidad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoContabilidad!=null) {
				this.jInternalFrameReporteDinamicoContabilidad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoContabilidad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoContabilidad!=null) {
				
				if(this.jInternalFrameReporteDinamicoContabilidad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoContabilidad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoContabilidad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoContabilidad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoContabilidad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoContabilidad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualContabilidad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasContabilidad(Boolean esInicializar) throws Exception {				
		if(ContabilidadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualContabilidad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaContabilidad() throws Exception {
		this.inicializarActualizarBindingTablaContabilidad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByContabilidad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ContabilidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ContabilidadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosContabilidadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContabilidadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ContabilidadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ContabilidadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaContabilidad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=contabilidadLogic.getContabilidads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=contabilidads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosContabilidad.setModel(new ContabilidadModel(this.contabilidadLogic.getContabilidads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosContabilidad.setModel(new ContabilidadModel(this.contabilidads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByContabilidad!=null && this.jInternalFrameOrderByContabilidad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByContabilidad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContabilidad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ContabilidadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ContabilidadConstantesFunciones.SCLASSWEBTITULO,contabilidadConstantesFunciones.resaltarSeleccionarContabilidad,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ContabilidadConstantesFunciones.SCLASSWEBTITULO,contabilidadConstantesFunciones.resaltarSeleccionarContabilidad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContabilidad,ContabilidadConstantesFunciones.LABEL_ID));

		if(this.contabilidadConstantesFunciones.mostraridContabilidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContabilidadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.contabilidadConstantesFunciones.resaltaridContabilidad,this.contabilidadConstantesFunciones.activaridContabilidad,this,true,"idContabilidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contabilidadConstantesFunciones.resaltaridContabilidad,this.contabilidadConstantesFunciones.activaridContabilidad,this,true,"idContabilidad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosContabilidad,ContabilidadConstantesFunciones.LABEL_CODIGO));

		if(this.contabilidadConstantesFunciones.mostrarcodigoContabilidad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ContabilidadConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.contabilidadConstantesFunciones.resaltarcodigoContabilidad,this.contabilidadConstantesFunciones.activarcodigoContabilidad,this,true,"codigoContabilidad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.contabilidadConstantesFunciones.resaltarcodigoContabilidad,this.contabilidadConstantesFunciones.activarcodigoContabilidad,this,true,"codigoContabilidad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ContabilidadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.contabilidadSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.contabilidadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.contabilidadSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosContabilidad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.contabilidadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.contabilidadSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosContabilidad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarContabilidad && this.isPermisoGuardarCambiosContabilidad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.contabilidadSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.contabilidadSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosContabilidad.addColumn(tableColumn);
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
			
			this.jTableDatosContabilidad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarContabilidad && this.isPermisoGuardarCambiosContabilidad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarContabilidad && this.isPermisoGuardarCambiosContabilidad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosContabilidad.moveColumn(this.jTableDatosContabilidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosContabilidad.moveColumn(this.jTableDatosContabilidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosContabilidad.moveColumn(this.jTableDatosContabilidad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosContabilidad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosContabilidad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosContabilidad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosContabilidad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosContabilidad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosContabilidad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosContabilidad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosContabilidad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=contabilidadLogic.getContabilidads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=contabilidads.size()-1;
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
		//this.jTableDatosContabilidad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosContabilidad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosContabilidad();
			
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
				
				//this.isEsNuevoContabilidad=false;
					
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			
				if(this.contabilidadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormContabilidad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosContabilidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosContabilidad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidad =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contabilidad =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.contabilidad.getsType().equals("DUPLICADO")
				   || this.contabilidad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoContabilidad=true;
				
				} else {
					this.isEsNuevoContabilidad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.contabilidadSessionBean.getEsGuardarRelacionado()) {
					if(this.contabilidad.getId()>=0 && !this.contabilidad.getIsNew()) {						
						this.isEsNuevoContabilidad=false;
						
					} else {
						this.isEsNuevoContabilidad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoContabilidad(esRelaciones);						
				
				this.seleccionarContabilidad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.contabilidad.getId()<0) {
					this.isEsNuevoContabilidad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarContabilidad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarContabilidad(evt,rowIndex);
				}	
				
				if(this.contabilidadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Contabilidad: " + this.dDif); 
					}
				}								
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarContabilidad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.contabilidad)) {
					if(this.contabilidad.getId()>0) {
						this.contabilidad.setIsDeleted(true);
						
						this.contabilidadsEliminados.add(this.contabilidad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.contabilidadLogic.getContabilidads().remove(this.contabilidad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.contabilidads.remove(this.contabilidad);				
					}
					
					
					((ContabilidadModel) this.jTableDatosContabilidad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaContabilidad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarContabilidad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoContabilidad) {
			
			if(this.jInternalFrameDetalleFormContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosContabilidad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosContabilidad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidad =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contabilidad =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioContabilidad(this.contabilidad);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesContabilidad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesContabilidad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualContabilidad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoContabilidad(Contabilidad contabilidad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoContabilidad(contabilidad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoContabilidad(Contabilidad contabilidad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioContabilidad(contabilidad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyContabilidad(contabilidad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyContabilidad(contabilidad);
	}
	
	public void setVariablesObjetoActualToFormularioContabilidad(Contabilidad contabilidad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormContabilidad.jTextFieldidContabilidad.setText(contabilidad.getId().toString());
			this.jInternalFrameDetalleFormContabilidad.jTextFieldcodigoContabilidad.setText(contabilidad.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Contabilidad contabilidadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,contabilidadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Contabilidad contabilidadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				contabilidadLocal=this.contabilidad;
			} else {
				contabilidadLocal=this.contabilidadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(contabilidadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoContabilidad(contabilidadLocal,true);
					
					if(contabilidadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(contabilidadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.contabilidadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(contabilidadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoContabilidad(Contabilidad contabilidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualContabilidad(contabilidad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysContabilidad(contabilidad);
	}
	
	public void setVariablesFormularioToObjetoActualContabilidad(Contabilidad contabilidad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualContabilidad(contabilidad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualContabilidad(Contabilidad contabilidad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormContabilidad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormContabilidad.jTextFieldidContabilidad.getText()==null || this.jInternalFrameDetalleFormContabilidad.jTextFieldidContabilidad.getText()=="" || this.jInternalFrameDetalleFormContabilidad.jTextFieldidContabilidad.getText()=="Id") {
				this.jInternalFrameDetalleFormContabilidad.jTextFieldidContabilidad.setText("0");
			}

			if(conColumnasBase) {contabilidad.setId(Long.parseLong(this.jInternalFrameDetalleFormContabilidad.jTextFieldidContabilidad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContabilidadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContabilidad.jLabelIdContabilidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			contabilidad.setcodigo(this.jInternalFrameDetalleFormContabilidad.jTextFieldcodigoContabilidad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ContabilidadConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormContabilidad.jLabelcodigoContabilidad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualContabilidad(Contabilidad contabilidadBean,Contabilidad contabilidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosContabilidad(Contabilidad contabilidadOrigen,Contabilidad contabilidad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && contabilidadOrigen.getId()!=null && !contabilidadOrigen.getId().equals(0L))) {contabilidad.setId(contabilidadOrigen.getId());}}
			if(conDefault || (!conDefault && contabilidadOrigen.getcodigo()!=null && !contabilidadOrigen.getcodigo().equals(""))) {contabilidad.setcodigo(contabilidadOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioContabilidad(Contabilidad contabilidad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormContabilidad.jTextFieldidContabilidad.setText(contabilidad.getId().toString());
			this.jInternalFrameDetalleFormContabilidad.jTextFieldcodigoContabilidad.setText(contabilidad.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioContabilidad(ContabilidadBean contabilidadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormContabilidad.jTextFieldidContabilidad.setText(contabilidadBean.getId().toString());
			this.jInternalFrameDetalleFormContabilidad.jTextFieldcodigoContabilidad.setText(contabilidadBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanContabilidad(ContabilidadParameterReturnGeneral contabilidadReturnGeneral,ContabilidadBean contabilidadBean,Boolean conDefault) throws Exception { 
		try {
			Contabilidad contabilidadLocal=new Contabilidad();
			
			contabilidadLocal=contabilidadReturnGeneral.getContabilidad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && contabilidadLocal.getId()!=null && !contabilidadLocal.getId().equals(0L))) {contabilidadBean.setId(contabilidadLocal.getId());}}
			if(conDefault || (!conDefault && contabilidadLocal.getcodigo()!=null && !contabilidadLocal.getcodigo().equals(""))) {contabilidadBean.setcodigo(contabilidadLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxContabilidadGenerico(Long idContabilidadSeleccionado,JComboBox jComboBoxContabilidad,List<Contabilidad> contabilidadsLocal)throws Exception {
		try {
			Contabilidad  contabilidadTemp=null;

			for(Contabilidad contabilidadAux:contabilidadsLocal) {
				if(contabilidadAux.getId()!=null && contabilidadAux.getId().equals(idContabilidadSeleccionado)) {
					contabilidadTemp=contabilidadAux;
					break;
				}
			}

			jComboBoxContabilidad.setSelectedItem(contabilidadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxContabilidadGenerico(JComboBox jComboBoxContabilidad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxContabilidad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxContabilidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxContabilidad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxContabilidad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxContabilidad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxContabilidad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			contabilidad=(Contabilidad) contabilidadLogic.getContabilidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			contabilidad =(Contabilidad) contabilidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Contabilidad contabilidadRow=new Contabilidad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			contabilidadRow=(Contabilidad) contabilidadLogic.getContabilidads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			contabilidadRow=(Contabilidad) contabilidads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualContabilidad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoContabilidad.setVisible((this.isVisibilidadCeldaNuevoContabilidad && this.isPermisoNuevoContabilidad));			
			this.jButtonDuplicarContabilidad.setVisible((this.isVisibilidadCeldaDuplicarContabilidad && this.isPermisoDuplicarContabilidad));			
			this.jButtonCopiarContabilidad.setVisible((this.isVisibilidadCeldaCopiarContabilidad && this.isPermisoCopiarContabilidad));
			this.jButtonVerFormContabilidad.setVisible((this.isVisibilidadCeldaVerFormContabilidad && this.isPermisoVerFormContabilidad));
			
			this.jButtonAbrirOrderByContabilidad.setVisible((this.isVisibilidadCeldaOrdenContabilidad && this.isPermisoOrdenContabilidad));			
			
			this.jButtonNuevoRelacionesContabilidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesContabilidad && this.isPermisoNuevoContabilidad));			
			this.jButtonNuevoGuardarCambiosContabilidad.setVisible((this.isVisibilidadCeldaNuevoContabilidad && this.isPermisoNuevoContabilidad && this.isPermisoGuardarCambiosContabilidad));
			
			if(this.jInternalFrameDetalleFormContabilidad!=null) {
			this.jInternalFrameDetalleFormContabilidad.jButtonModificarContabilidad.setVisible((this.isVisibilidadCeldaModificarContabilidad && this.isPermisoActualizarContabilidad));	
			this.jInternalFrameDetalleFormContabilidad.jButtonActualizarContabilidad.setVisible((this.isVisibilidadCeldaActualizarContabilidad && this.isPermisoActualizarContabilidad));	
			this.jInternalFrameDetalleFormContabilidad.jButtonEliminarContabilidad.setVisible((this.isVisibilidadCeldaEliminarContabilidad && this.isPermisoEliminarContabilidad));
			this.jInternalFrameDetalleFormContabilidad.jButtonCancelarContabilidad.setVisible(this.isVisibilidadCeldaCancelarContabilidad);							
			this.jInternalFrameDetalleFormContabilidad.jButtonGuardarCambiosContabilidad.setVisible((this.isVisibilidadCeldaGuardarContabilidad && this.isPermisoGuardarCambiosContabilidad));			
			
			}
						
			this.jButtonGuardarCambiosTablaContabilidad.setVisible((this.isVisibilidadCeldaGuardarCambiosContabilidad && this.isPermisoGuardarCambiosContabilidad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarContabilidad.setVisible((this.isVisibilidadCeldaNuevoContabilidad && this.isPermisoNuevoContabilidad));						
			this.jButtonDuplicarToolBarContabilidad.setVisible((this.isVisibilidadCeldaDuplicarContabilidad && this.isPermisoDuplicarContabilidad));						
			this.jButtonCopiarToolBarContabilidad.setVisible((this.isVisibilidadCeldaCopiarContabilidad && this.isPermisoCopiarContabilidad));			
			this.jButtonVerFormToolBarContabilidad.setVisible((this.isVisibilidadCeldaVerFormContabilidad && this.isPermisoVerFormContabilidad));			
			this.jButtonAbrirOrderByToolBarContabilidad.setVisible((this.isVisibilidadCeldaOrdenContabilidad && this.isPermisoOrdenContabilidad));
			this.jButtonNuevoRelacionesToolBarContabilidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesContabilidad && this.isPermisoNuevoContabilidad));			
			this.jButtonNuevoGuardarCambiosToolBarContabilidad.setVisible((this.isVisibilidadCeldaNuevoContabilidad && this.isPermisoNuevoContabilidad && this.isPermisoGuardarCambiosContabilidad));			
			
			if(this.jInternalFrameDetalleFormContabilidad!=null) {
			this.jInternalFrameDetalleFormContabilidad.jButtonModificarToolBarContabilidad.setVisible((this.isVisibilidadCeldaModificarContabilidad && this.isPermisoActualizarContabilidad));	
			this.jInternalFrameDetalleFormContabilidad.jButtonActualizarToolBarContabilidad.setVisible((this.isVisibilidadCeldaActualizarContabilidad  && this.isPermisoActualizarContabilidad));	
			this.jInternalFrameDetalleFormContabilidad.jButtonEliminarToolBarContabilidad.setVisible((this.isVisibilidadCeldaEliminarContabilidad && this.isPermisoEliminarContabilidad));
			this.jInternalFrameDetalleFormContabilidad.jButtonCancelarToolBarContabilidad.setVisible(this.isVisibilidadCeldaCancelarContabilidad);				
			this.jInternalFrameDetalleFormContabilidad.jButtonGuardarCambiosToolBarContabilidad.setVisible((this.isVisibilidadCeldaGuardarContabilidad && this.isPermisoGuardarCambiosContabilidad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarContabilidad.setVisible((this.isVisibilidadCeldaGuardarCambiosContabilidad && this.isPermisoGuardarCambiosContabilidad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoContabilidad.setVisible((this.isVisibilidadCeldaNuevoContabilidad && this.isPermisoNuevoContabilidad));			
			this.jMenuItemDuplicarContabilidad.setVisible((this.isVisibilidadCeldaDuplicarContabilidad && this.isPermisoDuplicarContabilidad));			
			this.jMenuItemCopiarContabilidad.setVisible((this.isVisibilidadCeldaCopiarContabilidad && this.isPermisoCopiarContabilidad));			
			this.jMenuItemVerFormContabilidad.setVisible((this.isVisibilidadCeldaVerFormContabilidad && this.isPermisoVerFormContabilidad));			
			this.jMenuItemAbrirOrderByContabilidad.setVisible((this.isVisibilidadCeldaOrdenContabilidad && this.isPermisoOrdenContabilidad));			
			//this.jMenuItemMostrarOcultarContabilidad.setVisible((this.isVisibilidadCeldaOrdenContabilidad && this.isPermisoOrdenContabilidad));
			this.jMenuItemDetalleAbrirOrderByContabilidad.setVisible((this.isVisibilidadCeldaOrdenContabilidad && this.isPermisoOrdenContabilidad));			
			//this.jMenuItemDetalleMostrarOcultarContabilidad.setVisible((this.isVisibilidadCeldaOrdenContabilidad && this.isPermisoOrdenContabilidad));			
			this.jMenuItemNuevoRelacionesContabilidad.setVisible((this.isVisibilidadCeldaNuevoRelacionesContabilidad && this.isPermisoNuevoContabilidad));			
			this.jMenuItemNuevoGuardarCambiosContabilidad.setVisible((this.isVisibilidadCeldaNuevoContabilidad && this.isPermisoNuevoContabilidad && this.isPermisoGuardarCambiosContabilidad));									
			
			if(this.jInternalFrameDetalleFormContabilidad!=null) {
			this.jInternalFrameDetalleFormContabilidad.jMenuItemModificarContabilidad.setVisible((this.isVisibilidadCeldaModificarContabilidad && this.isPermisoActualizarContabilidad));	
			this.jInternalFrameDetalleFormContabilidad.jMenuItemActualizarContabilidad.setVisible((this.isVisibilidadCeldaActualizarContabilidad && this.isPermisoActualizarContabilidad));	
			this.jInternalFrameDetalleFormContabilidad.jMenuItemEliminarContabilidad.setVisible((this.isVisibilidadCeldaEliminarContabilidad && this.isPermisoEliminarContabilidad));
			this.jInternalFrameDetalleFormContabilidad.jMenuItemCancelarContabilidad.setVisible(this.isVisibilidadCeldaCancelarContabilidad);				
			}
			
			this.jMenuItemGuardarCambiosContabilidad.setVisible((this.isVisibilidadCeldaGuardarContabilidad && this.isPermisoGuardarCambiosContabilidad));						
			this.jMenuItemGuardarCambiosTablaContabilidad.setVisible((this.isVisibilidadCeldaGuardarCambiosContabilidad && this.isPermisoGuardarCambiosContabilidad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoContabilidad=this.jButtonNuevoContabilidad.isVisible();
			this.isVisibilidadCeldaDuplicarContabilidad=this.jButtonDuplicarContabilidad.isVisible();
			this.isVisibilidadCeldaCopiarContabilidad=this.jButtonCopiarContabilidad.isVisible();
			this.isVisibilidadCeldaVerFormContabilidad=this.jButtonVerFormContabilidad.isVisible();
			
			this.isVisibilidadCeldaOrdenContabilidad=this.jButtonAbrirOrderByContabilidad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesContabilidad=this.jButtonNuevoRelacionesContabilidad.isVisible();
			this.isVisibilidadCeldaModificarContabilidad=this.jButtonModificarContabilidad.isVisible();
			
			if(this.jInternalFrameDetalleFormContabilidad!=null) {
			this.isVisibilidadCeldaActualizarContabilidad=this.jInternalFrameDetalleFormContabilidad.jButtonActualizarContabilidad.isVisible();
			this.isVisibilidadCeldaEliminarContabilidad=this.jInternalFrameDetalleFormContabilidad.jButtonEliminarContabilidad.isVisible();
			this.isVisibilidadCeldaCancelarContabilidad=this.jInternalFrameDetalleFormContabilidad.jButtonCancelarContabilidad.isVisible();
			this.isVisibilidadCeldaGuardarContabilidad=this.jInternalFrameDetalleFormContabilidad.jButtonGuardarCambiosContabilidad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosContabilidad=this.jButtonGuardarCambiosTablaContabilidad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoContabilidad=this.jButtonNuevoToolBarContabilidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesContabilidad=this.jButtonNuevoRelacionesToolBarContabilidad.isVisible();
			
			if(this.jInternalFrameDetalleFormContabilidad!=null) {
			this.isVisibilidadCeldaModificarContabilidad=this.jInternalFrameDetalleFormContabilidad.jButtonModificarToolBarContabilidad.isVisible();
			this.isVisibilidadCeldaActualizarContabilidad=this.jInternalFrameDetalleFormContabilidad.jButtonActualizarToolBarContabilidad.isVisible();
			this.isVisibilidadCeldaEliminarContabilidad=this.jInternalFrameDetalleFormContabilidad.jButtonEliminarToolBarContabilidad.isVisible();
			this.isVisibilidadCeldaCancelarContabilidad=this.jInternalFrameDetalleFormContabilidad.jButtonCancelarToolBarContabilidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarContabilidad=this.jButtonGuardarCambiosToolBarContabilidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosContabilidad=this.jButtonGuardarCambiosTablaToolBarContabilidad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoContabilidad=this.jMenuItemNuevoContabilidad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesContabilidad=this.jMenuItemNuevoRelacionesContabilidad.isVisible();
			
			if(this.jInternalFrameDetalleFormContabilidad!=null) {
			this.isVisibilidadCeldaModificarContabilidad=this.jInternalFrameDetalleFormContabilidad.jMenuItemModificarContabilidad.isVisible();
			this.isVisibilidadCeldaActualizarContabilidad=this.jInternalFrameDetalleFormContabilidad.jMenuItemActualizarContabilidad.isVisible();
			this.isVisibilidadCeldaEliminarContabilidad=this.jInternalFrameDetalleFormContabilidad.jMenuItemEliminarContabilidad.isVisible();
			this.isVisibilidadCeldaCancelarContabilidad=this.jInternalFrameDetalleFormContabilidad.jMenuItemCancelarContabilidad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarContabilidad=this.jMenuItemGuardarCambiosContabilidad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosContabilidad=this.jMenuItemGuardarCambiosTablaContabilidad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesContabilidad(Boolean esInicializar) {
		if(ContabilidadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.contabilidadSessionBean.getConGuardarRelaciones()) {
				//if(this.contabilidadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesContabilidad();
			}
			
			this.inicializarActualizarBindingBotonesManualContabilidad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualContabilidad() {
		this.jButtonNuevoContabilidad.setVisible(this.isPermisoNuevoContabilidad);			
		this.jButtonDuplicarContabilidad.setVisible(this.isPermisoDuplicarContabilidad);			
		this.jButtonCopiarContabilidad.setVisible(this.isPermisoCopiarContabilidad);			
		this.jButtonVerFormContabilidad.setVisible(this.isPermisoVerFormContabilidad);			
		
		this.jButtonAbrirOrderByContabilidad.setVisible(this.isPermisoOrdenContabilidad);					
		
		this.jButtonNuevoRelacionesContabilidad.setVisible(this.isPermisoNuevoContabilidad);			
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.jButtonModificarContabilidad.setVisible(this.isPermisoActualizarContabilidad);	
			this.jInternalFrameDetalleFormContabilidad.jButtonActualizarContabilidad.setVisible(this.isPermisoActualizarContabilidad);	
			this.jInternalFrameDetalleFormContabilidad.jButtonEliminarContabilidad.setVisible(this.isPermisoEliminarContabilidad);
			this.jInternalFrameDetalleFormContabilidad.jButtonCancelarContabilidad.setVisible(this.isVisibilidadCeldaCancelarContabilidad);						
			this.jInternalFrameDetalleFormContabilidad.jButtonGuardarCambiosContabilidad.setVisible(this.isPermisoGuardarCambiosContabilidad);							
		}
		
		this.jButtonGuardarCambiosTablaContabilidad.setVisible(this.isPermisoActualizarContabilidad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleContabilidad() {
		this.jInternalFrameDetalleFormContabilidad.jButtonModificarContabilidad.setVisible(this.isPermisoActualizarContabilidad);	
		this.jInternalFrameDetalleFormContabilidad.jButtonActualizarContabilidad.setVisible(this.isPermisoActualizarContabilidad);	
		this.jInternalFrameDetalleFormContabilidad.jButtonEliminarContabilidad.setVisible(this.isPermisoEliminarContabilidad);
		this.jInternalFrameDetalleFormContabilidad.jButtonCancelarContabilidad.setVisible(this.isVisibilidadCeldaCancelarContabilidad);							
		this.jInternalFrameDetalleFormContabilidad.jButtonGuardarCambiosContabilidad.setVisible((this.isVisibilidadCeldaGuardarContabilidad && this.isPermisoGuardarCambiosContabilidad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosContabilidad() {
		if(ContabilidadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualContabilidad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesContabilidad() {
	}
	
	public void jTableDatosContabilidadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarContabilidad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContabilidad(this.getcontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContabilidad(this.contabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contabilidad =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contabilidad =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contabilidad==null) {
						this.contabilidad = new Contabilidad();
					}

					this.setVariablesFormularioToObjetoActualContabilidad(this.contabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContabilidad(this.contabilidad);
				}

				if(this.contabilidad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.contabilidad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoContabilidadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualContabilidad(this.getcontabilidad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysContabilidad(this.contabilidad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contabilidad =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.contabilidad =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.contabilidad==null) {
						this.contabilidad = new Contabilidad();
					}

					this.setVariablesFormularioToObjetoActualContabilidad(this.contabilidad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysContabilidad(this.contabilidad);
				}

				if(this.contabilidad.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.contabilidad.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingContabilidad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameContabilidad() {
		if(this.jInternalFrameDetalleFormContabilidad!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) {
			this.jInternalFrameDetalleFormContabilidad.setVisible(false);	    			
			this.jInternalFrameDetalleFormContabilidad.dispose();
			this.jInternalFrameDetalleFormContabilidad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoContabilidad!=null) {
			this.jInternalFrameReporteDinamicoContabilidad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoContabilidad.dispose();
			this.jInternalFrameReporteDinamicoContabilidad=null;
		}
		
		if(this.jInternalFrameImportacionContabilidad!=null) {
			this.jInternalFrameImportacionContabilidad.setVisible(false);	    			
			this.jInternalFrameImportacionContabilidad.dispose();
			this.jInternalFrameImportacionContabilidad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessContabilidad();
			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			
			
			if(sTipo.equals("NuevoContabilidad")) {
				jButtonNuevoContabilidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarContabilidad")) {
				jButtonDuplicarContabilidadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarContabilidad")) {
				jButtonCopiarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormContabilidad")) {
				jButtonVerFormContabilidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarContabilidad")) {
				jButtonNuevoContabilidadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarContabilidad")) {
				jButtonDuplicarContabilidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoContabilidad")) {
				jButtonNuevoContabilidadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarContabilidad")) {
				jButtonDuplicarContabilidadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesContabilidad")) {
				jButtonNuevoContabilidadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarContabilidad")) {
				jButtonNuevoContabilidadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesContabilidad")) {
				jButtonNuevoContabilidadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarContabilidad")) {
				jButtonModificarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarContabilidad")) {
				jButtonModificarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarContabilidad")) {
				jButtonModificarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarContabilidad")) {
				jButtonActualizarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarContabilidad")) {
				jButtonActualizarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarContabilidad")) {
				jButtonActualizarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarContabilidad")) {
				jButtonEliminarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarContabilidad")) {
				jButtonEliminarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarContabilidad")) {
				jButtonEliminarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarContabilidad")) {
				jButtonCancelarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarContabilidad")) {
				jButtonCancelarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarContabilidad")) {
				jButtonCancelarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarContabilidad")) {
				jButtonCerrarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarContabilidad")) {
				jButtonCerrarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarContabilidad")) {
				jButtonCerrarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarContabilidad")) {
				jButtonMostrarOcultarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarContabilidad")) {
				jButtonCancelarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosContabilidad")) {
				jButtonGuardarCambiosContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarContabilidad")) {
				jButtonGuardarCambiosContabilidadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarContabilidad")) {
				jButtonCopiarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarContabilidad")) {
				jButtonVerFormContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosContabilidad")) {
				jButtonGuardarCambiosContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarContabilidad")) {
				jButtonCopiarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormContabilidad")) {
				jButtonVerFormContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaContabilidad")) {
				jButtonGuardarCambiosContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarContabilidad")) {
				jButtonGuardarCambiosContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaContabilidad")) {
				jButtonGuardarCambiosContabilidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionContabilidad")) {
				jButtonRecargarInformacionContabilidadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarContabilidad")) {
				jButtonRecargarInformacionContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionContabilidad")) {
				jButtonRecargarInformacionContabilidadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresContabilidad")) {
				jButtonAnterioresContabilidadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarContabilidad")) {
				jButtonAnterioresContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreContabilidad")) {
				jButtonAnterioresContabilidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesContabilidad")) {
				jButtonSiguientesContabilidadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarContabilidad")) {
				jButtonSiguientesContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesContabilidad")) {
				jButtonSiguientesContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByContabilidad") || sTipo.equals("MenuItemDetalleAbrirOrderByContabilidad")) {
				jButtonAbrirOrderByContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarContabilidad") || sTipo.equals("MenuItemDetalleMostrarOcultarContabilidad")) {
				jButtonMostrarOcultarContabilidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosContabilidad")) {
				jButtonNuevoGuardarCambiosContabilidadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarContabilidad")) {
				jButtonNuevoGuardarCambiosContabilidadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosContabilidad")) {
				jButtonNuevoGuardarCambiosContabilidadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoContabilidad")) {
				jButtonCerrarReporteDinamicoContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoContabilidad")) {
				jButtonGenerarReporteDinamicoContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoContabilidad")) {
				
				jButtonGenerarExcelReporteDinamicoContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionContabilidad")) {
				jButtonCerrarImportacionContabilidadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionContabilidad")) {
				
				jButtonGenerarImportacionContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionContabilidad")) {
				
				jButtonAbrirImportacionContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesContabilidad")) {
				jComboBoxTiposAccionesContabilidadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesContabilidad")) {
				jComboBoxTiposRelacionesContabilidadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioContabilidad")) {
				jComboBoxTiposAccionesContabilidadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarContabilidad")) {
				
				jComboBoxTiposSeleccionarContabilidadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralContabilidad")) {
				jTextFieldValorCampoGeneralContabilidadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByContabilidad")) {
				jButtonAbrirOrderByContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarContabilidad")) {
				jButtonAbrirOrderByContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByContabilidad")) {
				jButtonCerrarOrderByContabilidadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idContabilidadBusqueda")) {
				this.jButtonidContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoContabilidadBusqueda")) {
				this.jButtoncodigoContabilidadBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessContabilidad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContabilidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				


				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Contabilidad contabilidadLocal=null;
			
			if(!this.getEsControlTabla()) {
				contabilidadLocal=this.contabilidad;
			} else {
				contabilidadLocal=this.contabilidadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
							
				
				


				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContabilidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadAnterior =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contabilidadAnterior =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
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
			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			
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
			
			


			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContabilidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
								
						
				


				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contabilidad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
								
				
				


				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContabilidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadAnterior =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contabilidadAnterior =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContabilidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadAnterior =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contabilidadAnterior =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContabilidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
							
				
				


				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contabilidad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContabilidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contabilidadAnterior =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.contabilidadAnterior =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
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
			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			
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
			
			


			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContabilidadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
								
				
				


				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContabilidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadAnterior =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contabilidadAnterior =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContabilidadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContabilidadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosContabilidad")) {
					jCheckBoxSeleccionarTodosContabilidadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosContabilidad")) {
					jCheckBoxSeleccionadosContabilidadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarContabilidad")) {
					
				}
				
				


				
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
												
				
				


				
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contabilidad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContabilidadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.contabilidadAnterior =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.contabilidadAnterior =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContabilidadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
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
			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
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
			
			


			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaContabilidadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contabilidad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contabilidad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.contabilidad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.contabilidad);
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
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
				
				


				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Contabilidad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Contabilidad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaContabilidadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.contabilidadAnterior =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.contabilidadAnterior =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarContabilidad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosContabilidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosContabilidad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.contabilidad =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.contabilidad =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.contabilidad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarContabilidad")) {
				
				}
				
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarContabilidad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosContabilidad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarContabilidad")) {
			
			}
			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessContabilidad();
			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			
			if(sTipo.equals("NuevoContabilidad")) {
				jButtonNuevoContabilidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarContabilidad")) {
				jButtonDuplicarContabilidadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarContabilidad")) {
				jButtonCopiarContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormContabilidad")) {
				jButtonVerFormContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesContabilidad")) {
				jButtonNuevoContabilidadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarContabilidad")) {
				jButtonModificarContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarContabilidad")) {
				jButtonActualizarContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarContabilidad")) {
				jButtonEliminarContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaContabilidad")) {
				jButtonGuardarCambiosContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarContabilidad")) {
				jButtonCancelarContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarContabilidad")) {
				jButtonCerrarContabilidadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosContabilidad")) {
				jButtonGuardarCambiosContabilidadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosContabilidad")) {
				jButtonNuevoGuardarCambiosContabilidadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByContabilidad")) {
				jButtonAbrirOrderByContabilidadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionContabilidad")) {
				jButtonRecargarInformacionContabilidadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresContabilidad")) {
				jButtonAnterioresContabilidadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesContabilidad")) {
				jButtonSiguientesContabilidadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idContabilidadBusqueda")) {
				this.jButtonidContabilidadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoContabilidadBusqueda")) {
				this.jButtoncodigoContabilidadBusquedaActionPerformed(evt);
			}
			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessContabilidad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameContabilidad")) {
				closingInternalFrameContabilidad();
				
			} else if(sTipo.equals("jButtonCancelarContabilidad")) {
				JInternalFrameBase jInternalFrameDetalleFormContabilidad = (JInternalFrameBase)evt.getSource();
	            	
	            ContabilidadBeanSwingJInternalFrame jInternalFrameParent=(ContabilidadBeanSwingJInternalFrame)jInternalFrameDetalleFormContabilidad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarContabilidadActionPerformed(null);
			}
			
			ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.contabilidad,new Object(),this.contabilidadParameterGeneral,this.contabilidadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormContabilidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormContabilidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormContabilidad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.contabilidad)) {
			if(!esControlTabla) {
				if(ContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualContabilidad(this.contabilidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysContabilidad(this.contabilidad);			
				}
				
				if(this.contabilidadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualContabilidad(this.contabilidad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanContabilidad(this.contabilidadReturnGeneral,this.contabilidadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.contabilidadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanContabilidad(classes,this.contabilidadReturnGeneral,this.contabilidadBean,false);
					}
						
					if(this.contabilidadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyContabilidad(this.contabilidadReturnGeneral.getContabilidad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioContabilidad(this.contabilidadReturnGeneral.getContabilidad());	
					}
						
					if(this.contabilidadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioContabilidad(this.contabilidadReturnGeneral.getContabilidad(),classes);//this.contabilidadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioContabilidad(this.contabilidad,classes);//this.contabilidadBean);									
				}
			
				if(ContabilidadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualContabilidad(this.contabilidad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysContabilidad(this.contabilidad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.contabilidadAnterior!=null) {
						this.contabilidad=this.contabilidadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.contabilidadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.contabilidadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.contabilidadReturnGeneral.getContabilidad(),contabilidadLogic.getContabilidads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.contabilidadReturnGeneral.getContabilidad(),this.contabilidads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosContabilidad.repaint();
				
				//((AbstractTableModel) this.jTableDatosContabilidad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosContabilidad();
			}
		}
	}
	
	public void actualizarVisualTableDatosContabilidad() throws Exception {
		
		ContabilidadModel contabilidadModel=(ContabilidadModel)this.jTableDatosContabilidad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			contabilidadModel.contabilidads=this.contabilidadLogic.getContabilidads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			contabilidadModel.contabilidads=this.contabilidads;
		}
		
		
		((ContabilidadModel) this.jTableDatosContabilidad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaContabilidad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcontabilidadAnterior(),this.contabilidadLogic.getContabilidads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcontabilidadAnterior(),this.contabilidads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosContabilidad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioContabilidad(Contabilidad contabilidad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
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
										
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.contabilidad,new Object(),generalEntityParameterGeneral,this.contabilidadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.contabilidadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ContabilidadConstantesFunciones.getClassesRelationshipsOfContabilidad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ContabilidadConstantesFunciones.getClassesRelationshipsFromStringsOfContabilidad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormContabilidad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ContabilidadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.contabilidad,new Object(),generalEntityParameterGeneral,this.contabilidadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioContabilidad(ContabilidadBean contabilidadBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanContabilidad(ArrayList<Classe> classes,ContabilidadReturnGeneral contabilidadReturnGeneral,ContabilidadBean contabilidadBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualContabilidad(Contabilidad contabilidad,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.contabilidad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormContabilidad = new ContabilidadDetalleFormJInternalFrame(jDesktopPane,this.contabilidadSessionBean.getConGuardarRelaciones(),this.contabilidadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormContabilidad);
		this.jInternalFrameDetalleFormContabilidad.setVisible(false);
		this.jInternalFrameDetalleFormContabilidad.setSelected(false);						
		
		this.jInternalFrameDetalleFormContabilidad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormContabilidad.contabilidadLogic=this.contabilidadLogic;
		
		this.cargarCombosFrameForeignKeyContabilidad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleContabilidad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleContabilidad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyContabilidad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyContabilidad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormContabilidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarContabilidad"));
		
		this.jInternalFrameDetalleFormContabilidad.jButtonModificarContabilidad.addActionListener(new ButtonActionListener(this,"ModificarContabilidad"));

		
		this.jInternalFrameDetalleFormContabilidad.jButtonModificarToolBarContabilidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarContabilidad"));
					
		this.jInternalFrameDetalleFormContabilidad.jMenuItemModificarContabilidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarContabilidad"));		
		
		
		
		this.jInternalFrameDetalleFormContabilidad.jButtonActualizarContabilidad.addActionListener (new ButtonActionListener(this,"ActualizarContabilidad"));
		
		
		this.jInternalFrameDetalleFormContabilidad.jButtonActualizarToolBarContabilidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarContabilidad"));
						
		this.jInternalFrameDetalleFormContabilidad.jMenuItemActualizarContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarContabilidad"));		
		
		
		
		this.jInternalFrameDetalleFormContabilidad.jButtonEliminarContabilidad.addActionListener (new ButtonActionListener(this,"EliminarContabilidad"));
		
		
		this.jInternalFrameDetalleFormContabilidad.jButtonEliminarToolBarContabilidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarContabilidad"));
								
		this.jInternalFrameDetalleFormContabilidad.jMenuItemEliminarContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarContabilidad"));		
		
		
		
		this.jInternalFrameDetalleFormContabilidad.jButtonCancelarContabilidad.addActionListener (new ButtonActionListener(this,"CancelarContabilidad"));
		
		
		this.jInternalFrameDetalleFormContabilidad.jButtonCancelarToolBarContabilidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarContabilidad"));
					
		this.jInternalFrameDetalleFormContabilidad.jMenuItemCancelarContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarContabilidad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormContabilidad.jMenuItemDetalleCerrarContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarContabilidad"));		
		
		
		
		this.jInternalFrameDetalleFormContabilidad.jButtonGuardarCambiosToolBarContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarContabilidad"));
		
		
		
		this.jInternalFrameDetalleFormContabilidad.jButtonGuardarCambiosToolBarContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarContabilidad"));
		
		
		
		this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioContabilidad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContabilidad.jButtonidContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"idContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContabilidad.jButtoncodigoContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"codigoContabilidadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormContabilidad.jTabbedPaneRelacionesContabilidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesContabilidad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameContabilidad"));
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarContabilidad"));
		}
		
		this.jTableDatosContabilidad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarContabilidad"));
		
		this.jTableDatosContabilidad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarContabilidad"));
		
		this.jButtonNuevoContabilidad.addActionListener(new ButtonActionListener(this,"NuevoContabilidad"));
		
		this.jButtonDuplicarContabilidad.addActionListener(new ButtonActionListener(this,"DuplicarContabilidad"));
		
		this.jButtonCopiarContabilidad.addActionListener(new ButtonActionListener(this,"CopiarContabilidad"));
		
		this.jButtonVerFormContabilidad.addActionListener(new ButtonActionListener(this,"VerFormContabilidad"));
		
		
		this.jButtonNuevoToolBarContabilidad.addActionListener(new ButtonActionListener(this,"NuevoToolBarContabilidad"));
			
		this.jButtonDuplicarToolBarContabilidad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarContabilidad"));
			
		this.jMenuItemNuevoContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoContabilidad"));
			
		this.jMenuItemDuplicarContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarContabilidad"));		
		
		
		this.jButtonNuevoRelacionesContabilidad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesContabilidad"));
		
		
		this.jButtonNuevoRelacionesToolBarContabilidad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarContabilidad"));
			
		this.jMenuItemNuevoRelacionesContabilidad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesContabilidad"));		
		
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.jButtonModificarContabilidad.addActionListener(new ButtonActionListener(this,"ModificarContabilidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.jButtonModificarToolBarContabilidad.addActionListener(new ButtonActionListener(this,"ModificarToolBarContabilidad"));
			
			this.jInternalFrameDetalleFormContabilidad.jMenuItemModificarContabilidad.addActionListener(new ButtonActionListener(this,"MenuItemModificarContabilidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormContabilidad.jButtonActualizarContabilidad.addActionListener (new ButtonActionListener(this,"ActualizarContabilidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.jButtonActualizarToolBarContabilidad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarContabilidad"));
				
			this.jInternalFrameDetalleFormContabilidad.jMenuItemActualizarContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarContabilidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.jButtonEliminarContabilidad.addActionListener (new ButtonActionListener(this,"EliminarContabilidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.jButtonEliminarToolBarContabilidad.addActionListener (new ButtonActionListener(this,"EliminarToolBarContabilidad"));
						
			this.jInternalFrameDetalleFormContabilidad.jMenuItemEliminarContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarContabilidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.jButtonCancelarContabilidad.addActionListener (new ButtonActionListener(this,"CancelarContabilidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.jButtonCancelarToolBarContabilidad.addActionListener (new ButtonActionListener(this,"CancelarToolBarContabilidad"));
			
			this.jInternalFrameDetalleFormContabilidad.jMenuItemCancelarContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarContabilidad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarContabilidad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarContabilidad"));		
		
		
		this.jButtonCerrarContabilidad.addActionListener (new ButtonActionListener(this,"CerrarContabilidad"));
		
		
		this.jButtonCerrarToolBarContabilidad.addActionListener (new ButtonActionListener(this,"CerrarToolBarContabilidad"));
			
		this.jMenuItemCerrarContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarContabilidad"));
			
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.jMenuItemDetalleCerrarContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarContabilidad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.jButtonGuardarCambiosContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosContabilidad"));
		}
		
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.jButtonGuardarCambiosToolBarContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarContabilidad"));
		}
		
		this.jButtonCopiarToolBarContabilidad.addActionListener (new ButtonActionListener(this,"CopiarToolBarContabilidad"));
			
		this.jButtonVerFormToolBarContabilidad.addActionListener (new ButtonActionListener(this,"VerFormToolBarContabilidad"));
		
		this.jMenuItemGuardarCambiosContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosContabilidad"));
			
		this.jMenuItemCopiarContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarContabilidad"));		
		
		this.jMenuItemVerFormContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormContabilidad"));		
		
		
		this.jButtonGuardarCambiosTablaContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaContabilidad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarContabilidad"));
			
		this.jMenuItemGuardarCambiosTablaContabilidad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaContabilidad"));		
		
		
		
		this.jButtonRecargarInformacionContabilidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionContabilidad"));
					
		this.jButtonRecargarInformacionToolBarContabilidad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarContabilidad"));
		
		this.jMenuItemRecargarInformacionContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionContabilidad"));		
		
		
		
		this.jButtonAnterioresContabilidad.addActionListener (new ButtonActionListener(this,"AnterioresContabilidad"));
		
		
		this.jButtonAnterioresToolBarContabilidad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarContabilidad"));
		
		this.jMenuItemAnterioresContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresContabilidad"));		
		
		
		this.jButtonSiguientesContabilidad.addActionListener (new ButtonActionListener(this,"SiguientesContabilidad"));
		
		
		this.jButtonSiguientesToolBarContabilidad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarContabilidad"));
			
		this.jMenuItemSiguientesContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesContabilidad"));
			
		this.jMenuItemAbrirOrderByContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByContabilidad"));
			
		this.jMenuItemMostrarOcultarContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarContabilidad"));
			
		this.jMenuItemDetalleAbrirOrderByContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByContabilidad"));
			
		this.jMenuItemDetalleMostarOcultarContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarContabilidad"));		
		
		
		this.jButtonNuevoGuardarCambiosContabilidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosContabilidad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarContabilidad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarContabilidad"));
			
		this.jMenuItemNuevoGuardarCambiosContabilidad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosContabilidad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosContabilidad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosContabilidad"));

		this.jCheckBoxSeleccionadosContabilidad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosContabilidad"));
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioContabilidad"));
		}
		
		
		this.jComboBoxTiposRelacionesContabilidad.addActionListener (new ButtonActionListener(this,"TiposRelacionesContabilidad"));
			
		this.jComboBoxTiposAccionesContabilidad.addActionListener (new ButtonActionListener(this,"TiposAccionesContabilidad"));
					
		this.jComboBoxTiposSeleccionarContabilidad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarContabilidad"));
			
		this.jTextFieldValorCampoGeneralContabilidad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralContabilidad"));		
		
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContabilidad.jButtonidContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"idContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContabilidad.jButtoncodigoContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"codigoContabilidadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoContabilidad!=null) {
				this.jInternalFrameReporteDinamicoContabilidad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoContabilidad"));
				this.jInternalFrameReporteDinamicoContabilidad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoContabilidad"));
				this.jInternalFrameReporteDinamicoContabilidad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoContabilidad"));
			}
			
			//this.jButtonCerrarReporteDinamicoContabilidad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoContabilidad"));				
			//this.jButtonGenerarReporteDinamicoContabilidad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoContabilidad"));
			//this.jButtonGenerarExcelReporteDinamicoContabilidad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoContabilidad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionContabilidad!=null) {
				this.jInternalFrameImportacionContabilidad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionContabilidad"));
				this.jInternalFrameImportacionContabilidad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionContabilidad"));
				this.jInternalFrameImportacionContabilidad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionContabilidad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByContabilidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByContabilidad"));
			
			this.jButtonAbrirOrderByToolBarContabilidad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarContabilidad"));			
			
			if(this.jInternalFrameOrderByContabilidad!=null) {
				this.jInternalFrameOrderByContabilidad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByContabilidad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormContabilidad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormContabilidad.jTabbedPaneRelacionesContabilidad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesContabilidad"));
		
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
            		closingInternalFrameContabilidad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormContabilidad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormContabilidad = (JInternalFrameBase)event.getSource();
	            	
	            ContabilidadBeanSwingJInternalFrame jInternalFrameParent=(ContabilidadBeanSwingJInternalFrame)jInternalFrameDetalleFormContabilidad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarContabilidadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosContabilidad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosContabilidadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosContabilidad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosContabilidad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContabilidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContabilidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContabilidadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoContabilidad";
		inputMap = this.jButtonNuevoContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoContabilidadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContabilidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContabilidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoContabilidadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesContabilidad";
		inputMap = this.jButtonNuevoRelacionesContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoContabilidadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarContabilidad";
		inputMap = this.jButtonModificarContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarContabilidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarContabilidad";
		inputMap = this.jButtonActualizarContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarContabilidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarContabilidad";
		inputMap = this.jButtonEliminarContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarContabilidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarContabilidad";
		inputMap = this.jButtonCancelarContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarContabilidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarContabilidad";
		inputMap = this.jButtonCerrarContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarContabilidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormContabilidad.jButtonGuardarCambiosContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosContabilidad";
		inputMap = this.jInternalFrameDetalleFormContabilidad.jButtonGuardarCambiosContabilidad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormContabilidad.jButtonGuardarCambiosContabilidad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosContabilidadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosContabilidad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosContabilidadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesContabilidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesContabilidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarContabilidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarContabilidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralContabilidad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralContabilidadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContabilidad.jButtonidContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"idContabilidadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormContabilidad.jButtoncodigoContabilidadBusqueda.addActionListener(new ButtonActionListener(this,"codigoContabilidadBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionContabilidad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionContabilidadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarContabilidadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarContabilidad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosContabilidad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Contabilidad contabilidadAux:this.contabilidadLogic.getContabilidads()) {
					contabilidadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Contabilidad contabilidadAux:contabilidads) {
					contabilidadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosContabilidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingContabilidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Contabilidad contabilidadAux:this.contabilidadLogic.getContabilidads()) {
						contabilidadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Contabilidad contabilidadAux:contabilidads) {
						contabilidadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Contabilidad contabilidadAux:this.contabilidadLogic.getContabilidads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Contabilidad contabilidadAux:contabilidads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaContabilidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosContabilidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosContabilidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosContabilidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosContabilidadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingContabilidad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosContabilidad.getSelectedRows();
			
			Contabilidad contabilidadLocal=new Contabilidad();
			
			//this.seleccionarTodosContabilidad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					contabilidadLocal =(Contabilidad) this.contabilidadLogic.getContabilidads().toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					contabilidadLocal =(Contabilidad) this.contabilidads.toArray()[this.jTableDatosContabilidad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				contabilidadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Contabilidad contabilidadAux:this.contabilidadLogic.getContabilidads()) {
						contabilidadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Contabilidad contabilidadAux:contabilidads) {
						contabilidadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaContabilidad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosContabilidad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosContabilidad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosContabilidad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualContabilidadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarContabilidadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralContabilidadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingContabilidad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralContabilidad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Contabilidad contabilidadAux:this.contabilidadLogic.getContabilidads()) {
				
						if(sTipoSeleccionar.equals(ContabilidadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							contabilidadAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Contabilidad contabilidadAux:contabilidads) {
					
						if(sTipoSeleccionar.equals(ContabilidadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							contabilidadAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaContabilidad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesContabilidadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingContabilidad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioContabilidad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesContabilidad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteContabilidad) {				
					conSplash=true;//false;										
					
					//this.startProcessContabilidad(conSplash);
				
					this.generarReporteContabilidadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContabilidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoContabilidadsSeleccionados();
				//this.jComboBoxTiposAccionesContabilidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoContabilidadsSeleccionados(false);
				//this.jComboBoxTiposAccionesContabilidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoContabilidadsSeleccionados(true);
				//this.jComboBoxTiposAccionesContabilidad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessContabilidad();
				
				this.exportarContabilidadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContabilidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionContabilidads();
				//this.importarContabilidads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContabilidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessContabilidad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelContabilidadsSeleccionados();
				//this.jComboBoxTiposAccionesContabilidad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Contabilidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessContabilidad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoContabilidad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyContabilidad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Contabilidad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesContabilidad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.setSelectedIndex(0);					
				}	
			} 			
			else if(ContabilidadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteContabilidad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessContabilidad(conSplash);
					
						//this.actualizarParametrosGeneralContabilidad();
						
						this.generarReporteProcesoAccionContabilidadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesContabilidad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ContabilidadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ContabilidadS SELECCIONADOS?", "MANTENIMIENTO DE Contabilidad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessContabilidad();
				
						this.actualizarParametrosGeneralContabilidad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.contabilidadReturnGeneral=contabilidadLogic.procesarAccionContabilidadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.contabilidadLogic.getContabilidads(),this.contabilidadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarContabilidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesContabilidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralContabilidad();
					
					ContabilidadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarContabilidadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesContabilidad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormContabilidad.jComboBoxTiposAccionesFormularioContabilidad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessContabilidad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesContabilidadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessContabilidad();
			
			if(this.jInternalFrameDetalleFormContabilidad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();		
			Contabilidad contabilidad=new Contabilidad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingContabilidad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesContabilidad.getSelectedItem();
			
			
			
			
			contabilidadsSeleccionados=this.getContabilidadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(contabilidadsSeleccionados.size()==1) {
				for(Contabilidad contabilidadAux:contabilidadsSeleccionados) {
					contabilidad=contabilidadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessContabilidad();
			
      		//this.finishProcessContabilidad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarContabilidadReturnGeneral() throws Exception {
		if(this.contabilidadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.contabilidadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.contabilidadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.contabilidadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.contabilidadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.contabilidadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingContabilidad(false);
		}
		
		if(this.contabilidadReturnGeneral.getConRetornoLista() || this.contabilidadReturnGeneral.getConRetornoObjeto()) {
			if(this.contabilidadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.contabilidadLogic.setContabilidads(this.contabilidadReturnGeneral.getContabilidads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.contabilidadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.contabilidadLogic.setContabilidad(this.contabilidadReturnGeneral.getContabilidad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingContabilidad(false);
		}
	}
	
	public void actualizarParametrosGeneralContabilidad() throws Exception {
		
		
	}
	
	public ArrayList<Contabilidad> getContabilidadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioContabilidad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Contabilidad contabilidadAux:contabilidadLogic.getContabilidads()) {
					if(contabilidadAux.getIsSelected()) {
						contabilidadsSeleccionados.add(contabilidadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Contabilidad contabilidadAux:this.contabilidads) {
					if(contabilidadAux.getIsSelected()) {
						contabilidadsSeleccionados.add(contabilidadAux);				
					}
				}
			}
			
			if(contabilidadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						contabilidadsSeleccionados.addAll(this.contabilidadLogic.getContabilidads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						contabilidadsSeleccionados.addAll(this.contabilidads);				
					}
				}
			}
		} else {
			contabilidadsSeleccionados.add(this.contabilidad);
		}
		
		return contabilidadsSeleccionados;
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
	
	public void generarReporteContabilidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalContabilidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoContabilidadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoContabilidadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoContabilidadsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Contabilidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesContabilidadsSeleccionados() throws Exception {
		ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();		
		
		contabilidadsSeleccionados=this.getContabilidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteContabilidads("Todos",contabilidadsSeleccionados);
		
	}	
	
	public void generarReporteNormalContabilidadsSeleccionados() throws Exception {
		ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();		
		
		contabilidadsSeleccionados=this.getContabilidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteContabilidads("Todos",contabilidadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionContabilidadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();
		
		contabilidadsSeleccionados=this.getContabilidadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteContabilidads("Todos",contabilidadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoContabilidadsSeleccionados() throws Exception {
		ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoContabilidad();
		
		
		contabilidadsSeleccionados=this.getContabilidadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoContabilidad();
		
		
		//this.generarReporteContabilidads("Todos",contabilidadsSeleccionados ,contabilidadImplementable,contabilidadImplementableHome);
	}
	
	public void mostrarImportacionContabilidads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionContabilidad();
		
		this.abrirFrameImportacionContabilidad();		
		
			
		//this.generarReporteContabilidads("Todos",contabilidadsSeleccionados ,contabilidadImplementable,contabilidadImplementableHome);
	}
	
	public void importarContabilidads() throws Exception {		
	
	}
	
	public void exportarContabilidadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelContabilidadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoContabilidadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlContabilidadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Contabilidad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoContabilidadsSeleccionados() throws Exception {
		ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();		
		
		contabilidadsSeleccionados=this.getContabilidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contabilidad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarContabilidad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Contabilidad contabilidadAux:contabilidadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarContabilidad(contabilidadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//contabilidadAux.setsDetalleGeneralEntityReporte(contabilidadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contabilidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarContabilidad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ContabilidadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContabilidadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ContabilidadConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarContabilidad(Contabilidad contabilidad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=contabilidad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=contabilidad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=contabilidad.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelContabilidadsSeleccionados() throws Exception {
		ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();		
		
		contabilidadsSeleccionados=this.getContabilidadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contabilidad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Contabilidads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelContabilidad(row);				
				iRow++;
			}				
			
			for(Contabilidad contabilidadAux:contabilidadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelContabilidad(contabilidadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contabilidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlContabilidadsSeleccionados() throws Exception {
		ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();		
		
		contabilidadsSeleccionados=this.getContabilidadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"contabilidad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("contabilidads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("contabilidad");
			//elementRoot.appendChild(element);
		
			for(Contabilidad contabilidadAux:contabilidadsSeleccionados) {
				element = document.createElement("contabilidad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlContabilidad(contabilidadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Contabilidad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelContabilidad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ContabilidadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ContabilidadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ContabilidadConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelContabilidad(Contabilidad contabilidad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(contabilidad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(contabilidad.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlContabilidad(Contabilidad contabilidad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ContabilidadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(contabilidad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ContabilidadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(contabilidad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(ContabilidadConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(contabilidad.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoContabilidadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Contabilidad> contabilidadsSeleccionados=new ArrayList<Contabilidad>();
		
		contabilidadsSeleccionados=this.getContabilidadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoContabilidad(contabilidadsSeleccionados);
		
		this.generarReporteContabilidads("Todos",contabilidadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoContabilidad(ArrayList<Contabilidad> contabilidadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Contabilidad contabilidadAux:contabilidadsSeleccionados) {
				contabilidadAux.setsDetalleGeneralEntityReporte(contabilidadAux.toString());
			
				if(sTipoSeleccionar.equals(ContabilidadConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					contabilidadAux.setsDescripcionGeneralEntityReporte1(contabilidadAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ContabilidadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesContabilidad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoContabilidad=true;
				this.isVisibilidadCeldaNuevoRelacionesContabilidad=true;
				this.isVisibilidadCeldaGuardarCambiosContabilidad=true;
			}
			
			this.isVisibilidadCeldaModificarContabilidad=false;
			this.isVisibilidadCeldaActualizarContabilidad=false;
			this.isVisibilidadCeldaEliminarContabilidad=false;
			this.isVisibilidadCeldaCancelarContabilidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContabilidad=true;
				} else {
					this.isVisibilidadCeldaGuardarContabilidad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoContabilidad=false;
			this.isVisibilidadCeldaNuevoRelacionesContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosContabilidad=false;
			this.isVisibilidadCeldaModificarContabilidad=false;
			this.isVisibilidadCeldaActualizarContabilidad=true;
			this.isVisibilidadCeldaEliminarContabilidad=false;
			this.isVisibilidadCeldaCancelarContabilidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContabilidad=true;
				} else {
					this.isVisibilidadCeldaGuardarContabilidad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoContabilidad=false;
			this.isVisibilidadCeldaNuevoRelacionesContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosContabilidad=false;
			this.isVisibilidadCeldaModificarContabilidad=false;
			this.isVisibilidadCeldaActualizarContabilidad=true;
			this.isVisibilidadCeldaEliminarContabilidad=true;
			this.isVisibilidadCeldaCancelarContabilidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContabilidad=true;
				} else {
					this.isVisibilidadCeldaGuardarContabilidad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoContabilidad=false;
			this.isVisibilidadCeldaNuevoRelacionesContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosContabilidad=false;
			this.isVisibilidadCeldaModificarContabilidad=false;
			this.isVisibilidadCeldaActualizarContabilidad=true;
			this.isVisibilidadCeldaEliminarContabilidad=false;
			this.isVisibilidadCeldaCancelarContabilidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContabilidad=false;
				} else {
					this.isVisibilidadCeldaGuardarContabilidad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoContabilidad=true;
			this.isVisibilidadCeldaNuevoRelacionesContabilidad=true;
			this.isVisibilidadCeldaGuardarCambiosContabilidad=true;
			this.isVisibilidadCeldaModificarContabilidad=false;
			this.isVisibilidadCeldaActualizarContabilidad=false;
			this.isVisibilidadCeldaEliminarContabilidad=false;
			this.isVisibilidadCeldaCancelarContabilidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContabilidad=true;
				} else {
					this.isVisibilidadCeldaGuardarContabilidad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoContabilidad=false;
			this.isVisibilidadCeldaNuevoRelacionesContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosContabilidad=false;
			this.isVisibilidadCeldaActualizarContabilidad=false;
			this.isVisibilidadCeldaEliminarContabilidad=false;
			this.isVisibilidadCeldaCancelarContabilidad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContabilidad=false;
				} else {
					this.isVisibilidadCeldaGuardarContabilidad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoContabilidad=false;
			this.isVisibilidadCeldaNuevoRelacionesContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosContabilidad=false;
			this.isVisibilidadCeldaModificarContabilidad=true;
			this.isVisibilidadCeldaActualizarContabilidad=false;
			this.isVisibilidadCeldaEliminarContabilidad=false;
			this.isVisibilidadCeldaCancelarContabilidad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarContabilidad=false;
				} else {
					this.isVisibilidadCeldaGuardarContabilidad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ContabilidadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoContabilidad=true;
			this.isVisibilidadCeldaNuevoRelacionesContabilidad=true;
			this.isVisibilidadCeldaGuardarCambiosContabilidad=true;
		} else {
			this.actualizarEstadoPanelsContabilidad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarContabilidad=false;
			//this.isVisibilidadCeldaVerFormContabilidad=false;
			this.isVisibilidadCeldaDuplicarContabilidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!contabilidadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesContabilidad=false;
		} else {
			this.isVisibilidadCeldaNuevoContabilidad=false;
			this.isVisibilidadCeldaGuardarCambiosContabilidad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(contabilidadSessionBean.getEsGuardarRelacionado()) {
			if(!contabilidadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesContabilidad=false;												
			}
			
			this.jButtonCerrarContabilidad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesContabilidad=false;
		}
		
		if(!this.permiteMantenimiento(this.contabilidad)) {
			this.isVisibilidadCeldaActualizarContabilidad=false;
			this.isVisibilidadCeldaEliminarContabilidad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesContabilidad() {
	}
	
	public void actualizarEstadoPanelsContabilidad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionContabilidad!=null) {
				this.jScrollPanelDatosEdicionContabilidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosContabilidad!=null) {
				this.jScrollPanelDatosContabilidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionContabilidad!=null) {
				this.jPanelPaginacionContabilidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContabilidad!=null) {
				this.jPanelParametrosReportesContabilidad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionContabilidad!=null) {
				this.jScrollPanelDatosEdicionContabilidad.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosContabilidad!=null) {
				this.jScrollPanelDatosContabilidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionContabilidad!=null) {
				this.jPanelPaginacionContabilidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesContabilidad!=null) {
				this.jPanelParametrosReportesContabilidad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionContabilidad!=null) {
				this.jScrollPanelDatosEdicionContabilidad.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosContabilidad!=null) {
				this.jScrollPanelDatosContabilidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionContabilidad!=null) {
				this.jPanelPaginacionContabilidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesContabilidad!=null) {
				this.jPanelParametrosReportesContabilidad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionContabilidad!=null) {
				this.jScrollPanelDatosEdicionContabilidad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosContabilidad!=null) {
				this.jScrollPanelDatosContabilidad.setVisible(false);
			}
			
			if(this.jPanelPaginacionContabilidad!=null) {
				this.jPanelPaginacionContabilidad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesContabilidad!=null) {
				this.jPanelParametrosReportesContabilidad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionContabilidad!=null) {
				this.jScrollPanelDatosEdicionContabilidad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosContabilidad!=null) {
				this.jScrollPanelDatosContabilidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionContabilidad!=null) {
				this.jPanelPaginacionContabilidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContabilidad!=null) {
				this.jPanelParametrosReportesContabilidad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionContabilidad!=null) {
				this.jScrollPanelDatosEdicionContabilidad.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosContabilidad!=null) {
				this.jScrollPanelDatosContabilidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionContabilidad!=null) {
				this.jPanelPaginacionContabilidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContabilidad!=null) {
				this.jPanelParametrosReportesContabilidad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionContabilidad!=null) {
				this.jScrollPanelDatosEdicionContabilidad.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosContabilidad!=null) {
				this.jScrollPanelDatosContabilidad.setVisible(true);
			}
			
			if(this.jPanelPaginacionContabilidad!=null) {
				this.jPanelPaginacionContabilidad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesContabilidad!=null) {
				this.jPanelParametrosReportesContabilidad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.contabilidadSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.contabilidadSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ContabilidadSessionBean contabilidadSessionBean=new ContabilidadSessionBean();
		
		if(this.contabilidadSessionBean==null) {
			this.contabilidadSessionBean=new ContabilidadSessionBean();
		}
		
		this.contabilidadSessionBean.setsUltimaBusquedaContabilidad(this.getsAccionBusqueda());
		this.contabilidadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.contabilidadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ContabilidadSessionBean contabilidadSessionBean=new ContabilidadSessionBean();
		
		if(this.contabilidadSessionBean==null) {
			this.contabilidadSessionBean=new ContabilidadSessionBean();
		}
		
		if(this.contabilidadSessionBean.getsUltimaBusquedaContabilidad()!=null&&!this.contabilidadSessionBean.getsUltimaBusquedaContabilidad().equals("")) {
			this.setsAccionBusqueda(contabilidadSessionBean.getsUltimaBusquedaContabilidad());
			this.setiNumeroPaginacion(contabilidadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(contabilidadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.contabilidadSessionBean.setsUltimaBusquedaContabilidad("");
		this.contabilidadSessionBean.setiNumeroPaginacion(ContabilidadConstantesFunciones.INUMEROPAGINACION);
		this.contabilidadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaContabilidad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioContabilidad() {
		this.updateBorderResaltarBusquedasFormularioContabilidad();
		this.updateVisibilidadBusquedasFormularioContabilidad();
		this.updateHabilitarBusquedasFormularioContabilidad();
	}
	
	public void updateBorderResaltarBusquedasFormularioContabilidad() {					
	}
	
	public void updateVisibilidadBusquedasFormularioContabilidad() {
	}
	
	public void updateHabilitarBusquedasFormularioContabilidad() {
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
	
	public void updateControlesFormularioContabilidad() throws Exception {

		if(this.jInternalFrameDetalleFormContabilidad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioContabilidad();
		this.updateVisibilidadResaltarControlesFormularioContabilidad();
		this.updateHabilitarResaltarControlesFormularioContabilidad();
		
	}
	
	public void updateBorderResaltarControlesFormularioContabilidad() throws Exception {
		if(this.jInternalFrameDetalleFormContabilidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.contabilidadConstantesFunciones.resaltaridContabilidad!=null && this.jInternalFrameDetalleFormContabilidad!=null) {this.jInternalFrameDetalleFormContabilidad.jTextFieldidContabilidad.setBorder(this.contabilidadConstantesFunciones.resaltaridContabilidad);}
		if(this.contabilidadConstantesFunciones.resaltarcodigoContabilidad!=null && this.jInternalFrameDetalleFormContabilidad!=null) {this.jInternalFrameDetalleFormContabilidad.jTextFieldcodigoContabilidad.setBorder(this.contabilidadConstantesFunciones.resaltarcodigoContabilidad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioContabilidad() throws Exception {		
		if(this.jInternalFrameDetalleFormContabilidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) {
	
		//this.jInternalFrameDetalleFormContabilidad.jTextFieldidContabilidad.setVisible(this.contabilidadConstantesFunciones.mostraridContabilidad);
		this.jInternalFrameDetalleFormContabilidad.jPanelidContabilidad.setVisible(this.contabilidadConstantesFunciones.mostraridContabilidad);
		//this.jInternalFrameDetalleFormContabilidad.jTextFieldcodigoContabilidad.setVisible(this.contabilidadConstantesFunciones.mostrarcodigoContabilidad);
		this.jInternalFrameDetalleFormContabilidad.jPanelcodigoContabilidad.setVisible(this.contabilidadConstantesFunciones.mostrarcodigoContabilidad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioContabilidad() throws Exception {
		if(this.jInternalFrameDetalleFormContabilidad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormContabilidad!=null) {
	
		this.jInternalFrameDetalleFormContabilidad.jTextFieldidContabilidad.setEnabled(this.contabilidadConstantesFunciones.activaridContabilidad);
		this.jInternalFrameDetalleFormContabilidad.jTextFieldcodigoContabilidad.setEnabled(this.contabilidadConstantesFunciones.activarcodigoContabilidad);
		}
	}
	
		
}