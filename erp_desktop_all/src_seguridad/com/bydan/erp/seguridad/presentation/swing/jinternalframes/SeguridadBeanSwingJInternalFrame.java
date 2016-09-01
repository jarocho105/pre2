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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




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

import com.bydan.erp.seguridad.util.SeguridadConstantesFunciones;
import com.bydan.erp.seguridad.util.SeguridadParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.SeguridadParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.SeguridadBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
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


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

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
public class SeguridadBeanSwingJInternalFrame extends SeguridadJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SeguridadBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Seguridad> seguridadValidator = new ClassValidator<Seguridad>(Seguridad.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Seguridad seguridad;	
	public Seguridad seguridadAux;
	public Seguridad seguridadAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Seguridad seguridadTotales;
	public Long idSeguridadActual;
	public Long iIdNuevoSeguridad=0L;
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
	
	public Boolean isPermisoTodoSeguridad;
	public Boolean isPermisoNuevoSeguridad;
	public Boolean isPermisoActualizarSeguridad;
	public Boolean isPermisoActualizarOriginalSeguridad;
	public Boolean isPermisoEliminarSeguridad;
	public Boolean isPermisoGuardarCambiosSeguridad;
	public Boolean isPermisoConsultaSeguridad;
	public Boolean isPermisoBusquedaSeguridad;
	public Boolean isPermisoReporteSeguridad;
	public Boolean isPermisoPaginacionMedioSeguridad;
	public Boolean isPermisoPaginacionAltoSeguridad;
	public Boolean isPermisoPaginacionTodoSeguridad;
	public Boolean isPermisoCopiarSeguridad;
	public Boolean isPermisoVerFormSeguridad;
	public Boolean isPermisoDuplicarSeguridad;
	public Boolean isPermisoOrdenSeguridad;
	
	
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
	
	public SeguridadParameterReturnGeneral seguridadReturnGeneral;
	public SeguridadParameterReturnGeneral seguridadParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSeguridad=false;
	public Boolean esParaAccionDesdeFormularioSeguridad=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SeguridadSessionBeanAdditional seguridadSessionBeanAdditional=null;
	
	public SeguridadSessionBeanAdditional getSeguridadSessionBeanAdditional() {
		return this.seguridadSessionBeanAdditional;
	}
	
	public void setSeguridadSessionBeanAdditional(SeguridadSessionBeanAdditional seguridadSessionBeanAdditional) {
		try {
			this.seguridadSessionBeanAdditional=seguridadSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SeguridadBeanSwingJInternalFrameAdditional seguridadBeanSwingJInternalFrameAdditional=null;
	//public class SeguridadBeanSwingJInternalFrame
	
	public SeguridadBeanSwingJInternalFrameAdditional getSeguridadBeanSwingJInternalFrameAdditional() {
		return this.seguridadBeanSwingJInternalFrameAdditional;
	}
	
	public void setSeguridadBeanSwingJInternalFrameAdditional(SeguridadBeanSwingJInternalFrameAdditional seguridadBeanSwingJInternalFrameAdditional) {
		try {
			this.seguridadBeanSwingJInternalFrameAdditional=seguridadBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SeguridadLogic seguridadLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Seguridad seguridadBean;
	public SeguridadConstantesFunciones seguridadConstantesFunciones;
	//public SeguridadParameterReturnGeneral seguridadReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Seguridad> seguridads;	
	//public List<Seguridad> seguridadsEliminados;
	//public List<Seguridad> seguridadsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSeguridad=false;
	public Boolean isVisibilidadCeldaDuplicarSeguridad=true;
	public Boolean isVisibilidadCeldaCopiarSeguridad=true;
	public Boolean isVisibilidadCeldaVerFormSeguridad=true;
	public Boolean isVisibilidadCeldaOrdenSeguridad=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSeguridad=false;
	public Boolean isVisibilidadCeldaModificarSeguridad=false;
	public Boolean isVisibilidadCeldaActualizarSeguridad=false;
	public Boolean isVisibilidadCeldaEliminarSeguridad=false;
	public Boolean isVisibilidadCeldaCancelarSeguridad=false;
	public Boolean isVisibilidadCeldaGuardarSeguridad=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSeguridad=false;	
	
	
	
	public Long getiIdNuevoSeguridad() {
		return this.iIdNuevoSeguridad;
	}

	public void setiIdNuevoSeguridad(Long iIdNuevoSeguridad) {
		this.iIdNuevoSeguridad = iIdNuevoSeguridad;
	}
	
	public Long getidSeguridadActual() {
		return this.idSeguridadActual;
	}

	public void setidSeguridadActual(Long idSeguridadActual) {
		this.idSeguridadActual = idSeguridadActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Seguridad getseguridad() {
		return this.seguridad;
	}

	public void setseguridad(Seguridad seguridad) {
		this.seguridad = seguridad;
	}
	
	public Seguridad getseguridadAux() {
		return this.seguridadAux;
	}

	public void setseguridadAux(Seguridad seguridadAux) {
		this.seguridadAux = seguridadAux;
	}				
	
	public Seguridad getseguridadAnterior() {
		return this.seguridadAnterior;
	}

	public void setseguridadAnterior(Seguridad seguridadAnterior) {
		this.seguridadAnterior = seguridadAnterior;
	}	
	
	public Seguridad getseguridadTotales() {
		return this.seguridadTotales;
	}

	public void setseguridadTotales(Seguridad seguridadTotales) {
		this.seguridadTotales = seguridadTotales;
	}	
	
	public Seguridad getseguridadBean() {
		return this.seguridadBean;
	}

	public void setseguridadBean(Seguridad seguridadBean) {
		this.seguridadBean = seguridadBean;
	}	
	
	public SeguridadParameterReturnGeneral getseguridadReturnGeneral() {
		return this.seguridadReturnGeneral;
	}

	public void setseguridadReturnGeneral(SeguridadParameterReturnGeneral seguridadReturnGeneral) {
		this.seguridadReturnGeneral = seguridadReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SeguridadLogic getSeguridadLogic()	{		
		return seguridadLogic;
	}

	public void setSeguridadLogic(SeguridadLogic seguridadLogic) {
		this.seguridadLogic = seguridadLogic;
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
	
	public Boolean getIsEsNuevoSeguridad() {
		return isEsNuevoSeguridad;
	}

	public void setIsEsNuevoSeguridad(Boolean isEsNuevoSeguridad) {
		this.isEsNuevoSeguridad = isEsNuevoSeguridad;
	}

	public Boolean getEsParaAccionDesdeFormularioSeguridad() {
		return esParaAccionDesdeFormularioSeguridad;
	}
	
	public void setEsParaAccionDesdeFormularioSeguridad(Boolean esParaAccionDesdeFormularioSeguridad) {
		this.esParaAccionDesdeFormularioSeguridad = esParaAccionDesdeFormularioSeguridad;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesSeguridad() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SeguridadConstantesFunciones.refrescarForeignKeysDescripcionesSeguridad(this.seguridadLogic.getSeguridads());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SeguridadConstantesFunciones.refrescarForeignKeysDescripcionesSeguridad(this.seguridads);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//seguridadLogic.setSeguridads(this.seguridads);
			seguridadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SeguridadParameterReturnGeneral getSeguridadParameterGeneral() {
		return this.seguridadParameterGeneral;
	}
	
	public void setSeguridadParameterGeneral(SeguridadParameterReturnGeneral seguridadParameterGeneral) {
		this.seguridadParameterGeneral = seguridadParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSeguridad() {
		return isPermisoTodoSeguridad;
	}

	public void setIsPermisoTodoSeguridad(Boolean isPermisoTodoSeguridad) {
		this.isPermisoTodoSeguridad = isPermisoTodoSeguridad;
	}

	public Boolean getIsPermisoNuevoSeguridad() {
		return isPermisoNuevoSeguridad;
	}

	public void setIsPermisoNuevoSeguridad(Boolean isPermisoNuevoSeguridad) {
		this.isPermisoNuevoSeguridad = isPermisoNuevoSeguridad;
	}

	public Boolean getIsPermisoActualizarSeguridad() {
		return isPermisoActualizarSeguridad;
	}

	public void setIsPermisoActualizarSeguridad(Boolean isPermisoActualizarSeguridad) {
		this.isPermisoActualizarSeguridad = isPermisoActualizarSeguridad;
	}

	public Boolean getIsPermisoEliminarSeguridad() {
		return isPermisoEliminarSeguridad;
	}

	public void setIsPermisoEliminarSeguridad(Boolean isPermisoEliminarSeguridad) {
		this.isPermisoEliminarSeguridad = isPermisoEliminarSeguridad;
	}

	public Boolean getIsPermisoGuardarCambiosSeguridad() {
		return isPermisoGuardarCambiosSeguridad;
	}

	public void setIsPermisoGuardarCambiosSeguridad(Boolean isPermisoGuardarCambiosSeguridad) {
		this.isPermisoGuardarCambiosSeguridad = isPermisoGuardarCambiosSeguridad;
	}
	
	public Boolean getIsPermisoConsultaSeguridad() {
		return isPermisoConsultaSeguridad;
	}

	public void setIsPermisoConsultaSeguridad(Boolean isPermisoConsultaSeguridad) {
		this.isPermisoConsultaSeguridad = isPermisoConsultaSeguridad;
	}

	public Boolean getIsPermisoBusquedaSeguridad() {
		return isPermisoBusquedaSeguridad;
	}

	public void setIsPermisoBusquedaSeguridad(Boolean isPermisoBusquedaSeguridad) {
		this.isPermisoBusquedaSeguridad = isPermisoBusquedaSeguridad;
	}

	public Boolean getIsPermisoReporteSeguridad() {
		return isPermisoReporteSeguridad;
	}

	public void setIsPermisoReporteSeguridad(Boolean isPermisoReporteSeguridad) {
		this.isPermisoReporteSeguridad = isPermisoReporteSeguridad;
	}
	
	public Boolean getIsPermisoPaginacionMedioSeguridad() {
		return isPermisoPaginacionMedioSeguridad;
	}

	public void setIsPermisoPaginacionMedioSeguridad(Boolean isPermisoPaginacionMedioSeguridad) {
		this.isPermisoPaginacionMedioSeguridad = isPermisoPaginacionMedioSeguridad;
	}
	
	public Boolean getIsPermisoPaginacionTodoSeguridad() {
		return isPermisoPaginacionTodoSeguridad;
	}

	public void setIsPermisoPaginacionTodoSeguridad(Boolean isPermisoPaginacionTodoSeguridad) {
		this.isPermisoPaginacionTodoSeguridad = isPermisoPaginacionTodoSeguridad;
	}
	
	public Boolean getIsPermisoPaginacionAltoSeguridad() {
		return isPermisoPaginacionAltoSeguridad;
	}

	public void setIsPermisoPaginacionAltoSeguridad(Boolean isPermisoPaginacionAltoSeguridad) {
		this.isPermisoPaginacionAltoSeguridad = isPermisoPaginacionAltoSeguridad;
	}
	
	public Boolean getIsPermisoCopiarSeguridad() {
		return isPermisoCopiarSeguridad;
	}

	public void setIsPermisoCopiarSeguridad(Boolean isPermisoCopiarSeguridad) {
		this.isPermisoCopiarSeguridad = isPermisoCopiarSeguridad;
	}
	
	public Boolean getIsPermisoVerFormSeguridad() {
		return isPermisoVerFormSeguridad;
	}

	public void setIsPermisoVerFormSeguridad(Boolean isPermisoVerFormSeguridad) {
		this.isPermisoVerFormSeguridad = isPermisoVerFormSeguridad;
	}
	
	public Boolean getIsPermisoDuplicarSeguridad() {
		return isPermisoDuplicarSeguridad;
	}

	public void setIsPermisoDuplicarSeguridad(Boolean isPermisoDuplicarSeguridad) {
		this.isPermisoDuplicarSeguridad = isPermisoDuplicarSeguridad;
	}
	
	public Boolean getIsPermisoOrdenSeguridad() {
		return isPermisoOrdenSeguridad;
	}

	public void setIsPermisoOrdenSeguridad(Boolean isPermisoOrdenSeguridad) {
		this.isPermisoOrdenSeguridad = isPermisoOrdenSeguridad;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSeguridad() {
		return isVisibilidadCeldaNuevoSeguridad;
	}

	public void setIsVisibilidadCeldaNuevoSeguridad(Boolean isVisibilidadCeldaNuevoSeguridad) {
		this.isVisibilidadCeldaNuevoSeguridad = isVisibilidadCeldaNuevoSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSeguridad() {
		return isVisibilidadCeldaDuplicarSeguridad;
	}

	public void setIsVisibilidadCeldaDuplicarSeguridad(Boolean isVisibilidadCeldaDuplicarSeguridad) {
		this.isVisibilidadCeldaDuplicarSeguridad = isVisibilidadCeldaDuplicarSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSeguridad() {
		return isVisibilidadCeldaCopiarSeguridad;
	}

	public void setIsVisibilidadCeldaCopiarSeguridad(Boolean isVisibilidadCeldaCopiarSeguridad) {
		this.isVisibilidadCeldaCopiarSeguridad = isVisibilidadCeldaCopiarSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSeguridad() {
		return isVisibilidadCeldaVerFormSeguridad;
	}

	public void setIsVisibilidadCeldaVerFormSeguridad(Boolean isVisibilidadCeldaVerFormSeguridad) {
		this.isVisibilidadCeldaVerFormSeguridad = isVisibilidadCeldaVerFormSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSeguridad() {
		return isVisibilidadCeldaOrdenSeguridad;
	}

	public void setIsVisibilidadCeldaOrdenSeguridad(Boolean isVisibilidadCeldaOrdenSeguridad) {
		this.isVisibilidadCeldaOrdenSeguridad = isVisibilidadCeldaOrdenSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSeguridad() {
		return isVisibilidadCeldaNuevoRelacionesSeguridad;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSeguridad(Boolean isVisibilidadCeldaNuevoRelacionesSeguridad) {
		this.isVisibilidadCeldaNuevoRelacionesSeguridad = isVisibilidadCeldaNuevoRelacionesSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSeguridad() {
		return isVisibilidadCeldaModificarSeguridad;
	}

	public void setIsVisibilidadCeldaModificarSeguridad(Boolean isVisibilidadCeldaModificarSeguridad) {
		this.isVisibilidadCeldaModificarSeguridad = isVisibilidadCeldaModificarSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSeguridad() {
		return isVisibilidadCeldaActualizarSeguridad;
	}

	public void setIsVisibilidadCeldaActualizarSeguridad(Boolean isVisibilidadCeldaActualizarSeguridad) {
		this.isVisibilidadCeldaActualizarSeguridad = isVisibilidadCeldaActualizarSeguridad;
	}

	public Boolean getIsVisibilidadCeldaEliminarSeguridad() {
		return isVisibilidadCeldaEliminarSeguridad;
	}

	public void setIsVisibilidadCeldaEliminarSeguridad(Boolean isVisibilidadCeldaEliminarSeguridad) {
		this.isVisibilidadCeldaEliminarSeguridad = isVisibilidadCeldaEliminarSeguridad;
	}

	public Boolean getIsVisibilidadCeldaCancelarSeguridad() {
		return isVisibilidadCeldaCancelarSeguridad;
	}

	public void setIsVisibilidadCeldaCancelarSeguridad(Boolean isVisibilidadCeldaCancelarSeguridad) {
		this.isVisibilidadCeldaCancelarSeguridad = isVisibilidadCeldaCancelarSeguridad;
	}

	public Boolean getIsVisibilidadCeldaGuardarSeguridad() {
		return isVisibilidadCeldaGuardarSeguridad;
	}

	public void setIsVisibilidadCeldaGuardarSeguridad(Boolean isVisibilidadCeldaGuardarSeguridad) {
		this.isVisibilidadCeldaGuardarSeguridad = isVisibilidadCeldaGuardarSeguridad;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSeguridad() {
		return isVisibilidadCeldaGuardarCambiosSeguridad;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSeguridad(Boolean isVisibilidadCeldaGuardarCambiosSeguridad) {
		this.isVisibilidadCeldaGuardarCambiosSeguridad = isVisibilidadCeldaGuardarCambiosSeguridad;
	}
		
	public SeguridadSessionBean getseguridadSessionBean() {
		return this.seguridadSessionBean;
	}
	
	public void setseguridadSessionBean(SeguridadSessionBean seguridadSessionBean) {
		this.seguridadSessionBean=seguridadSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSeguridad(Seguridad seguridad)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Seguridad seguridad,Seguridad seguridadAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSeguridad(seguridad);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		seguridadAux.setId(seguridad.getId());
		seguridadAux.setVersionRow(seguridad.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSeguridad();
		
			int intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridad =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.seguridad =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSeguridad(this.seguridad,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSeguridad(this.seguridad);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = seguridadValidator.getInvalidValues(this.seguridad);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			seguridadLogic.setDatosCliente(datosCliente);
			seguridadLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				seguridadAux=new  Seguridad();
				
				seguridadAux.setIsNew(true);
				seguridadAux.setIsChanged(true);
				
				seguridadAux.setSeguridadOriginal(this.seguridad);
				
				seguridadAux.setId(this.seguridad.getId());	
				seguridadAux.setVersionRow(this.seguridad.getVersionRow());	
				seguridadAux.setcodigo(this.seguridad.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.seguridadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.seguridadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(seguridadAux,seguridadLogic.getSeguridads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(seguridadAux,seguridads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.seguridadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.seguridadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						seguridadLogic.saveSeguridads();//WithConnection
						//seguridadLogic.getSetVersionRowSeguridads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.seguridad,seguridadAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.seguridadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								seguridadLogic.saveSeguridadRelaciones(seguridadAux);//WithConnection
								//seguridadLogic.getSetVersionRowSeguridads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.seguridad,seguridadAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.seguridadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.seguridadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(seguridadAux,seguridadLogic.getSeguridads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(seguridadAux,seguridads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.seguridad,seguridadAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				seguridadAux=new  Seguridad();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.seguridadSessionBean.getEsGuardarRelacionado() 
					|| (this.seguridadSessionBean.getEsGuardarRelacionado() && this.seguridad.getId()>=0)) {
						
					seguridadAux.setIsNew(false);
				}
				
				seguridadAux.setIsDeleted(false);
			
				seguridadAux.setId(this.seguridad.getId());	
				seguridadAux.setVersionRow(this.seguridad.getVersionRow());	
				seguridadAux.setcodigo(this.seguridad.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(seguridadAux,seguridadLogic.getSeguridads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(seguridadAux,seguridads);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.seguridadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.seguridadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						seguridadLogic.saveSeguridads();//WithConnection
						//seguridadLogic.getSetVersionRowSeguridads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.seguridad,seguridadAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.seguridadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								seguridadLogic.saveSeguridadRelaciones(seguridadAux);//WithConnection
								//seguridadLogic.getSetVersionRowSeguridads();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.seguridad,seguridadAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.seguridadSessionBean.getEstaModoGuardarRelaciones() 
									|| this.seguridadSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(seguridadAux,seguridadLogic.getSeguridads());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(seguridadAux,seguridads);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.seguridad,seguridadAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				seguridadAux=new  Seguridad();
				
				seguridadAux.setIsNew(false);
				seguridadAux.setIsChanged(false);
				
				seguridadAux.setIsDeleted(true);
				
				seguridadAux.setId(this.seguridad.getId());	
				seguridadAux.setVersionRow(this.seguridad.getVersionRow());	
				seguridadAux.setcodigo(this.seguridad.getcodigo());	
				
				if(this.seguridadSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.seguridadAux.getId()>=0) {	
						this.seguridadsEliminados.add(seguridadAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(seguridadAux,seguridadLogic.getSeguridads());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(seguridadAux,seguridads);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.seguridadSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.seguridadSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						seguridadLogic.saveSeguridads();//WithConnection
						//seguridadLogic.getSetVersionRowSeguridads();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.seguridadSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								seguridadLogic.saveSeguridadRelaciones(seguridadAux);//WithConnection
								//seguridadLogic.getSetVersionRowSeguridads();//WithConnection
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
							if(this.seguridadSessionBean.getEstaModoGuardarRelaciones() 
								|| this.seguridadSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(seguridadAux,seguridadLogic.getSeguridads());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(seguridadAux,seguridads);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadLogic.getSeguridads().addAll(this.seguridadsEliminados);
					
					seguridadLogic.saveSeguridads();//WithConnection
					//seguridadLogic.getSetVersionRowSeguridads();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.seguridadsEliminados= new ArrayList<Seguridad>();		
			}
			
			if(this.seguridadSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Seguridad GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Seguridad",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.seguridad=seguridadAux;
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
      		//this.finishProcessSeguridad();
      	}
		
	}	
	
	public void actualizarRelaciones(Seguridad seguridadLocal) throws Exception {
		
		if(this.seguridadSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Seguridad seguridadLocal) throws Exception {	
		if(this.seguridadSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarSeguridadActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.seguridad =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.seguridad =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = seguridadValidator.getInvalidValues(this.seguridad);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Seguridad seguridad,List<Seguridad> seguridads) throws Exception {
		try	{		
			SeguridadConstantesFunciones.actualizarLista(seguridad,seguridads,this.seguridadSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Seguridad seguridad,List<Seguridad> seguridads) throws Exception {
		try	{			
			SeguridadConstantesFunciones.actualizarSelectedLista(seguridad,seguridads);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Seguridad> seguridadsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				seguridadsLocal=this.seguridadLogic.getSeguridads();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				seguridadsLocal=this.seguridads;
			}
			//ARCHITECTURE
		
			for(Seguridad seguridadLocal:seguridadsLocal) {
				if(this.permiteMantenimiento(seguridadLocal) && seguridadLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SeguridadConstantesFunciones.getSeguridadLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SeguridadConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSeguridad.jLabelcodigoSeguridad,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSeguridad.jLabelcodigoSeguridad,"");
		
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
		this.iIdNuevoSeguridad--;	
		
		
		this.seguridadAux=new Seguridad();
		
		this.seguridadAux.setId(this.iIdNuevoSeguridad);
		this.seguridadAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.seguridadLogic.getSeguridads().add(this.seguridadAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.seguridads.add(this.seguridadAux);
		}
		//ARCHITECTURE
		
		this.seguridad=this.seguridadAux;
		
		if(SeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSeguridad(this.seguridad);
			this.setVariablesObjetoActualToFormularioForeignKeySeguridad(this.seguridad);
		}
				
		//this.setDefaultControlesSeguridad();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySeguridad();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySeguridad();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySeguridad();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSeguridad(this.seguridadBean,this.seguridad,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSeguridad(this.seguridad);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSeguridad(this.seguridadReturnGeneral,this.seguridadBean,false);
		
		if(this.seguridadReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySeguridad(this.seguridadReturnGeneral.getSeguridad());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSeguridad(this.seguridadReturnGeneral.getSeguridad());
		}
		
		if(this.seguridadReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSeguridad(this.seguridadReturnGeneral.getSeguridad(),classes);//this.seguridadBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSeguridad(this.seguridad,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySeguridad();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySeguridad();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SeguridadBeanSwingJInternalFrameAdditional.RecargarFormSeguridad(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSeguridad(false);
						
			if(seguridadSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SeguridadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSeguridad();
			}
			
			this.actualizarVisualTableDatosSeguridad();
			
			this.jTableDatosSeguridad.setRowSelectionInterval(this.getIndiceNuevoSeguridad(), this.getIndiceNuevoSeguridad());
			
			this.seleccionarFilaTablaSeguridadActual();
						
			this.actualizarEstadoCeldasBotonesSeguridad("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSeguridad(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSeguridad.jTextFieldcodigoSeguridad.setEnabled(isHabilitar && this.seguridadConstantesFunciones.activarcodigoSeguridad);	
		
	};
	
	public void setDefaultControlesSeguridad() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSeguridad(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.seguridadSessionBean.setConGuardarRelaciones(true);			
			this.seguridadSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSeguridad.jTabbedPaneRelacionesSeguridad.setVisible(true);
			
					
		} else {
			//this.seguridadSessionBean.setConGuardarRelaciones(false);			
			this.seguridadSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSeguridad.jTabbedPaneRelacionesSeguridad.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSeguridad() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Seguridad seguridadAux:this.seguridadLogic.getSeguridads()) {
				if(seguridadAux.getId().equals(this.iIdNuevoSeguridad)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Seguridad seguridadAux:this.seguridads) {
				if(seguridadAux.getId().equals(this.iIdNuevoSeguridad)) {
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
	
	public int getIndiceActualSeguridad(Seguridad seguridad,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Seguridad seguridadAux:this.seguridadLogic.getSeguridads()) {
				if(seguridadAux.getId().equals(seguridad.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Seguridad seguridadAux:this.seguridads) {
				if(seguridadAux.getId().equals(seguridad.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSeguridad(Seguridad seguridadOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Seguridad seguridadAux:this.seguridadLogic.getSeguridads()) {
				if(seguridadAux.getSeguridadOriginal().getId().equals(seguridadOriginal.getId())) {
					existe=true;
					seguridadOriginal.setId(seguridadAux.getId());
					seguridadOriginal.setVersionRow(seguridadAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Seguridad seguridadAux:this.seguridads) {
				if(seguridadAux.getSeguridadOriginal().getId().equals(seguridadOriginal.getId())) {
					existe=true;
					seguridadOriginal.setId(seguridadAux.getId());
					seguridadOriginal.setVersionRow(seguridadAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSeguridad(Boolean esParaCancelar) throws Exception {
		seguridadsAux=new ArrayList<Seguridad>();
		seguridadAux=new Seguridad();
		
		if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Seguridad seguridadAux:this.seguridadLogic.getSeguridads()) {
					if(seguridadAux.getId()<0) {
						seguridadsAux.add(seguridadAux);
					}		
				}
				this.iIdNuevoSeguridad=0L;
				this.seguridadLogic.getSeguridads().removeAll(seguridadsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Seguridad seguridadAux:this.seguridads) {
					if(seguridadAux.getId()<0) {
						seguridadsAux.add(seguridadAux);
					}		
				}
				this.iIdNuevoSeguridad=0L;
				this.seguridads.removeAll(seguridadsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSeguridad 
					&& this.seguridadLogic.getSeguridads().size()>0
					) {
					seguridadAux=this.seguridadLogic.getSeguridads().get(this.seguridadLogic.getSeguridads().size() - 1);
				
					if(seguridadAux.getId()<0) {
						this.seguridadLogic.getSeguridads().remove(seguridadAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSeguridad && this.seguridads.size()>0) {
					seguridadAux=this.seguridads.get(this.seguridads.size() - 1);
				
					if(seguridadAux.getId()<0) {
						this.seguridads.remove(seguridadAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSeguridad(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(seguridad.getId()<0) {
				this.seguridadLogic.getSeguridads().remove(this.seguridad);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(seguridad.getId()<0) {
				this.seguridads.remove(this.seguridad);
			}
		}			
	}
	
	public void setEstadosInicialesSeguridad(List<Seguridad> seguridadsAux) throws Exception {
		SeguridadConstantesFunciones.setEstadosInicialesSeguridad(seguridadsAux);
	}
	
	public void setEstadosInicialesSeguridad(Seguridad seguridadAux) throws Exception {
		SeguridadConstantesFunciones.setEstadosInicialesSeguridad(seguridadAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSeguridadActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSeguridad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSeguridadActual()) {
				if(!this.isEsNuevoSeguridad) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSeguridad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSeguridad=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSeguridadActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Seguridad ?", "MANTENIMIENTO DE Seguridad", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSeguridad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Seguridad seguridad) throws Exception {
		SeguridadConstantesFunciones.seleccionarAsignar(this.seguridad,seguridad);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSeguridad=this.isPermisoActualizarOriginalSeguridad;
			
			
			this.seleccionarAsignar(seguridad);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SeguridadConstantesFunciones.quitarEspaciosSeguridad(this.seguridad,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSeguridad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.seguridadSessionBean.setsFuncionBusquedaRapida(this.seguridadSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSeguridad) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSeguridad(esParaCancelar);				
				this.cancelarNuevoSeguridad(esParaCancelar);								
			}
			
			this.seguridad=new Seguridad();
			
			this.inicializarSeguridad();
			
			this.actualizarEstadoCeldasBotonesSeguridad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSeguridad() throws Exception {
		try {
			SeguridadConstantesFunciones.inicializarSeguridad(this.seguridad);
			
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
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.seguridadLogic.getSeguridads().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSeguridads(String sAccionBusqueda,List<Seguridad> seguridadsParaReportes) throws Exception {
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
					sPathReporteFinal="Seguridad"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SeguridadMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SeguridadMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Seguridad"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Seguridades");		
		parameters.put("busquedapor", SeguridadConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSeguridad=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SeguridadConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SeguridadConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSeguridad=new JRBeanArrayDataSource(SeguridadJInternalFrame.TraerSeguridadBeans(seguridadsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSeguridad);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SeguridadConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SeguridadConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SeguridadBean.TraerSeguridadBeans(seguridadsParaReportes).toArray()));
							
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
				this.generarExcelReporteSeguridads(sAccionBusqueda,sTipoArchivoReporte,seguridadsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSeguridads(sAccionBusqueda,sTipoArchivoReporte,seguridadsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSeguridadActionPerformed(null);
					//this.generarExcelReporteSeguridads(sAccionBusqueda,sTipoArchivoReporte,seguridadsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSeguridads(sAccionBusqueda,sTipoArchivoReporte,seguridadsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSeguridads(sAccionBusqueda,sTipoArchivoReporte,seguridadsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSeguridads(sAccionBusqueda,sTipoArchivoReporte,seguridadsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSeguridads(String sAccionBusqueda,String sTipoArchivoReporte,List<Seguridad> seguridadsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguridad";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Seguridads");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSeguridad("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Seguridad seguridad : seguridadsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SeguridadConstantesFunciones.generarExcelReporteDataSeguridad("NORMAL",row,workbook,seguridad,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguridad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSeguridad(String sTipo,Row row,Workbook workbook) {
		
		SeguridadConstantesFunciones.generarExcelReporteHeaderSeguridad(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSeguridads(String sAccionBusqueda,String sTipoArchivoReporte,List<Seguridad> seguridadsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguridad_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Seguridads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Seguridad seguridad : seguridadsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SeguridadConstantesFunciones.getSeguridadDescripcion(seguridad));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SeguridadConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SeguridadConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(seguridad.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguridad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSeguridads(String sAccionBusqueda,String sTipoArchivoReporte,List<Seguridad> seguridadsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Seguridad> seguridadsRespaldo=null;
		
		classes=SeguridadConstantesFunciones.getClassesRelationshipsOfSeguridad(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.seguridadLogic.setDatosCliente(this.datosCliente);
		this.seguridadLogic.setDatosDeep(this.datosDeep);
		this.seguridadLogic.setIsConDeep(true);
		
		seguridadsRespaldo=this.seguridadLogic.getSeguridads();
		
		this.seguridadLogic.setSeguridads(seguridadsParaReportes);	
		this.seguridadLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		seguridadsParaReportes=this.seguridadLogic.getSeguridads();
		this.seguridadLogic.setSeguridads(seguridadsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguridad_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Seguridads");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSeguridad("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Seguridad seguridad : seguridadsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSeguridad("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SeguridadConstantesFunciones.generarExcelReporteDataSeguridad("NORMAL",row,workbook,seguridad,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SeguridadConstantesFunciones.getSeguridadDescripcion(seguridad));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguridad",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSeguridad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSeguridad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSeguridad.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSeguridad.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSeguridad() throws Exception {		
		this.startProcessSeguridad(true);
	}
	
	public void startProcessSeguridad(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesSeguridad, this.jScrollPanelDatosSeguridad,this.jPanelPaginacionSeguridad, this.jScrollPanelDatosEdicionSeguridad, this.jPanelAccionesSeguridad,this.jPanelAccionesFormularioSeguridad,this.jmenuBarSeguridad,this.jmenuBarDetalleSeguridad,this.jTtoolBarSeguridad,this.jTtoolBarDetalleSeguridad);		
		
		final JTabbedPane jTabbedPaneBusquedasSeguridad=null; 
		
		final JPanel jPanelParametrosReportesSeguridad=this.jPanelParametrosReportesSeguridad;
		//final JScrollPane jScrollPanelDatosSeguridad=this.jScrollPanelDatosSeguridad;
		final JTable jTableDatosSeguridad=this.jTableDatosSeguridad;		
		final JPanel jPanelPaginacionSeguridad=this.jPanelPaginacionSeguridad;
		//final JScrollPane jScrollPanelDatosEdicionSeguridad=this.jScrollPanelDatosEdicionSeguridad;
		final JPanel jPanelAccionesSeguridad=this.jPanelAccionesSeguridad;
		
		JPanel jPanelCamposAuxiliarSeguridad=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSeguridad=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) {
			jPanelCamposAuxiliarSeguridad=this.jInternalFrameDetalleFormSeguridad.jPanelCamposSeguridad;
			jPanelAccionesFormularioAuxiliarSeguridad=this.jInternalFrameDetalleFormSeguridad.jPanelAccionesFormularioSeguridad;
		}
		
		final JPanel jPanelCamposSeguridad=jPanelCamposAuxiliarSeguridad;
		final JPanel jPanelAccionesFormularioSeguridad=jPanelAccionesFormularioAuxiliarSeguridad;
		
		
		final JMenuBar jmenuBarSeguridad=this.jmenuBarSeguridad;
		final JToolBar jTtoolBarSeguridad=this.jTtoolBarSeguridad;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSeguridad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSeguridad=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) {
			jmenuBarDetalleAuxiliarSeguridad=this.jInternalFrameDetalleFormSeguridad.jmenuBarDetalleSeguridad;
			jTtoolBarDetalleAuxiliarSeguridad=this.jInternalFrameDetalleFormSeguridad.jTtoolBarDetalleSeguridad;
		}
		
		final JMenuBar jmenuBarDetalleSeguridad=jmenuBarDetalleAuxiliarSeguridad;
		final JToolBar jTtoolBarDetalleSeguridad=jTtoolBarDetalleAuxiliarSeguridad;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSeguridad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSeguridad;
			processRunnable.jTableDatos=jTableDatosSeguridad;
			processRunnable.jPanelCampos=jPanelCamposSeguridad;
			processRunnable.jPanelPaginacion=jPanelPaginacionSeguridad;
			processRunnable.jPanelAcciones=jPanelAccionesSeguridad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSeguridad;
			
			
			processRunnable.jmenuBar=jmenuBarSeguridad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSeguridad;
			processRunnable.jTtoolBar=jTtoolBarSeguridad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSeguridad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSeguridad ,jPanelParametrosReportesSeguridad,jTableDatosSeguridad, /*jScrollPanelDatosSeguridad,*/jPanelCamposSeguridad,jPanelPaginacionSeguridad, /*jScrollPanelDatosEdicionSeguridad,*/ jPanelAccionesSeguridad,jPanelAccionesFormularioSeguridad,jmenuBarSeguridad,jmenuBarDetalleSeguridad,jTtoolBarSeguridad,jTtoolBarDetalleSeguridad);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesSeguridad, jScrollPanelDatosSeguridad,jPanelPaginacionSeguridad, jScrollPanelDatosEdicionSeguridad, jPanelAccionesSeguridad,jPanelAccionesFormularioSeguridad,jmenuBarSeguridad,jmenuBarDetalleSeguridad,jTtoolBarSeguridad,jTtoolBarDetalleSeguridad);
						
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
	
	public void finishProcessSeguridad() {// throws Exception 
		this.finishProcessSeguridad(true);
	}
	
	public void finishProcessSeguridad(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesSeguridad, this.jScrollPanelDatosSeguridad,this.jPanelPaginacionSeguridad, this.jScrollPanelDatosEdicionSeguridad, this.jPanelAccionesSeguridad,this.jPanelAccionesFormularioSeguridad,this.jmenuBarSeguridad,this.jmenuBarDetalleSeguridad,this.jTtoolBarSeguridad,this.jTtoolBarDetalleSeguridad);		
		
		final JTabbedPane jTabbedPaneBusquedasSeguridad=null; 
		
		final JPanel jPanelParametrosReportesSeguridad=this.jPanelParametrosReportesSeguridad;
		//final JScrollPane jScrollPanelDatosSeguridad=this.jScrollPanelDatosSeguridad;
		final JTable jTableDatosSeguridad=this.jTableDatosSeguridad;		
		final JPanel jPanelPaginacionSeguridad=this.jPanelPaginacionSeguridad;
		//final JScrollPane jScrollPanelDatosEdicionSeguridad=this.jScrollPanelDatosEdicionSeguridad;
		final JPanel jPanelAccionesSeguridad=this.jPanelAccionesSeguridad;
		
		JPanel jPanelCamposAuxiliarSeguridad=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSeguridad=new JPanel();
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) {
			jPanelCamposAuxiliarSeguridad=this.jInternalFrameDetalleFormSeguridad.jPanelCamposSeguridad;
			jPanelAccionesFormularioAuxiliarSeguridad=this.jInternalFrameDetalleFormSeguridad.jPanelAccionesFormularioSeguridad;
		}
		
		final JPanel jPanelCamposSeguridad=jPanelCamposAuxiliarSeguridad;
		final JPanel jPanelAccionesFormularioSeguridad=jPanelAccionesFormularioAuxiliarSeguridad;
		
		
		final JMenuBar jmenuBarSeguridad=this.jmenuBarSeguridad;		
		final JToolBar jTtoolBarSeguridad=this.jTtoolBarSeguridad;
				
		JMenuBar jmenuBarDetalleAuxiliarSeguridad=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSeguridad=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) {
			jmenuBarDetalleAuxiliarSeguridad=this.jInternalFrameDetalleFormSeguridad.jmenuBarDetalleSeguridad;
			jTtoolBarDetalleAuxiliarSeguridad=this.jInternalFrameDetalleFormSeguridad.jTtoolBarDetalleSeguridad;		
		}
		
		final JMenuBar jmenuBarDetalleSeguridad=jmenuBarDetalleAuxiliarSeguridad;
		final JToolBar jTtoolBarDetalleSeguridad=jTtoolBarDetalleAuxiliarSeguridad;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSeguridad;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSeguridad;
			processRunnable.jTableDatos=jTableDatosSeguridad;
			processRunnable.jPanelCampos=jPanelCamposSeguridad;
			processRunnable.jPanelPaginacion=jPanelPaginacionSeguridad;
			processRunnable.jPanelAcciones=jPanelAccionesSeguridad;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSeguridad;
			
			
			processRunnable.jmenuBar=jmenuBarSeguridad;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSeguridad;
			processRunnable.jTtoolBar=jTtoolBarSeguridad;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSeguridad;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSeguridad ,jPanelParametrosReportesSeguridad, jTableDatosSeguridad,/*jScrollPanelDatosSeguridad,*/jPanelCamposSeguridad,jPanelPaginacionSeguridad, /*jScrollPanelDatosEdicionSeguridad,*/ jPanelAccionesSeguridad,jPanelAccionesFormularioSeguridad,jmenuBarSeguridad,jmenuBarDetalleSeguridad,jTtoolBarSeguridad,jTtoolBarDetalleSeguridad));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSeguridad(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSeguridad(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSeguridad(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSeguridad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSeguridad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSeguridad,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSeguridad(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSeguridad,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSeguridad,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.seguridadConstantesFunciones.getsFinalQuerySeguridad();
		String  finalQueryPaginacionTodos=this.seguridadConstantesFunciones.getsFinalQuerySeguridad();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SeguridadConstantesFunciones.getArrayColumnasGlobalesNoSeguridad(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SeguridadConstantesFunciones.getArrayColumnasGlobalesSeguridad(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SeguridadConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.seguridadsEliminados= new ArrayList<Seguridad>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSeguridad();
		
				///*SeguridadSessionBean*/this.seguridadSessionBean=new SeguridadSessionBean();
			
			if(this.seguridadSessionBean==null) {
				this.seguridadSessionBean=new SeguridadSessionBean();
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
					this.iNumeroPaginacion=SeguridadConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SeguridadConstantesFunciones.getClassesForeignKeysOfSeguridad(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/seguridad."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			seguridadsAux= new ArrayList<Seguridad>();
			
				
			seguridadLogic.setDatosCliente(this.datosCliente);
			seguridadLogic.setDatosDeep(this.datosDeep);
			seguridadLogic.setIsConDeep(true);
			
			
			seguridadLogic.getSeguridadDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					seguridadLogic.getTodosSeguridads(finalQueryGlobal,pagination);
					
					//seguridadLogic.getTodosSeguridadsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(seguridadLogic.getSeguridads()==null|| seguridadLogic.getSeguridads().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							seguridadsAux= new ArrayList<Seguridad>();
							seguridadsAux.addAll(seguridadLogic.getSeguridads());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							seguridadsAux= new ArrayList<Seguridad>();
							seguridadsAux.addAll(seguridads);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							seguridadLogic.getTodosSeguridads(finalQueryGlobal+"",this.pagination);												
							
							//seguridadLogic.getTodosSeguridadsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSeguridads("Todos",seguridadLogic.getSeguridads() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							seguridadLogic.setSeguridads(new ArrayList<Seguridad>());					
							seguridadLogic.getSeguridads().addAll(seguridadsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							seguridads=new ArrayList<Seguridad>();
							seguridads.addAll(seguridadsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSeguridad=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSeguridad=this.idActual;
				
				} else if(this.idSeguridadActual!=null && this.idSeguridadActual!=0L) {
					idSeguridad=idSeguridadActual;
				}
				
					
				this.sDetalleReporte=SeguridadConstantesFunciones.getDetalleIndicePorId(idSeguridad);
				
				this.seguridads=new ArrayList<Seguridad>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					seguridadLogic.getEntity(idSeguridad);
					
					//seguridadLogic.getEntityWithConnection(idSeguridad);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					seguridadLogic.setSeguridads(new ArrayList<Seguridad>());
					seguridadLogic.getSeguridads().add(seguridadLogic.getSeguridad());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.seguridads=new ArrayList<Seguridad>();
					this.seguridads.add(seguridad);
				}
				
				if(seguridadLogic.getSeguridad()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSeguridad();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSeguridad();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=seguridadLogic.getSeguridads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=seguridads.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=seguridadLogic.getSeguridads().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=seguridads.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Seguridad seguridad) {
		Boolean permite=true;
		
		if(this.seguridad.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SeguridadConstantesFunciones.getOrderByListaSeguridad();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SeguridadConstantesFunciones.getOrderByListaSeguridad();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Seguridad seguridad:seguridadLogic.getSeguridads()) {
				if(seguridad.getsType().equals(Constantes2.S_TOTALES)) {
					seguridadTotales=seguridad;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Seguridad seguridad:this.seguridads) {
				if(seguridad.getsType().equals(Constantes2.S_TOTALES)) {
					seguridadTotales=seguridad;
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
			this.seguridadAux=new Seguridad();
			this.seguridadAux.setsType(Constantes2.S_TOTALES);
			this.seguridadAux.setIsNew(false);
			this.seguridadAux.setIsChanged(false);
			this.seguridadAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SeguridadConstantesFunciones.TotalizarValoresFilaSeguridad(this.seguridadLogic.getSeguridads(),this.seguridadAux);
				
				this.seguridadLogic.getSeguridads().add(this.seguridadAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SeguridadConstantesFunciones.TotalizarValoresFilaSeguridad(this.seguridads,this.seguridadAux);
				
				this.seguridads.add(this.seguridadAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		seguridadTotales=new Seguridad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.seguridadLogic.getSeguridads().remove(seguridadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.seguridads.remove(seguridadTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		seguridadTotales=new Seguridad();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Seguridad seguridad:seguridadLogic.getSeguridads()) {
				if(seguridad.getsType().equals(Constantes2.S_TOTALES)) {
					seguridadTotales=seguridad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SeguridadConstantesFunciones.TotalizarValoresFilaSeguridad(this.seguridadLogic.getSeguridads(),seguridadTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Seguridad seguridad:this.seguridads) {
				if(seguridad.getsType().equals(Constantes2.S_TOTALES)) {
					seguridadTotales=seguridad;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SeguridadConstantesFunciones.TotalizarValoresFilaSeguridad(this.seguridads,seguridadTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosSeguridad() {
		this.isPermisoTodoSeguridad=false;
		this.isPermisoNuevoSeguridad=false;
		this.isPermisoActualizarSeguridad=false;
		this.isPermisoActualizarOriginalSeguridad=false;
		this.isPermisoEliminarSeguridad=false;
		this.isPermisoGuardarCambiosSeguridad=false;
		this.isPermisoConsultaSeguridad=false;
		this.isPermisoBusquedaSeguridad=false;
		this.isPermisoReporteSeguridad=false;		
		this.isPermisoOrdenSeguridad=false;		
		this.isPermisoPaginacionMedioSeguridad=false;		
		this.isPermisoPaginacionAltoSeguridad=false;
		this.isPermisoPaginacionTodoSeguridad=false;
		this.isPermisoCopiarSeguridad=false;		
		this.isPermisoVerFormSeguridad=false;		
		this.isPermisoDuplicarSeguridad=false;		
		this.isPermisoOrdenSeguridad=false;		
	}
	
	public void setPermisosUsuarioSeguridad(Boolean isPermiso) {
		this.isPermisoTodoSeguridad=isPermiso;
		this.isPermisoNuevoSeguridad=isPermiso;
		this.isPermisoActualizarSeguridad=isPermiso;
		this.isPermisoActualizarOriginalSeguridad=isPermiso;
		this.isPermisoEliminarSeguridad=isPermiso;
		this.isPermisoGuardarCambiosSeguridad=isPermiso;
		this.isPermisoConsultaSeguridad=isPermiso;
		this.isPermisoBusquedaSeguridad=isPermiso;
		this.isPermisoReporteSeguridad=isPermiso;
		this.isPermisoOrdenSeguridad=isPermiso;		
		this.isPermisoPaginacionMedioSeguridad=isPermiso;		
		this.isPermisoPaginacionAltoSeguridad=isPermiso;		
		this.isPermisoPaginacionTodoSeguridad=isPermiso;		
		this.isPermisoCopiarSeguridad=isPermiso;		
		this.isPermisoVerFormSeguridad=isPermiso;		
		this.isPermisoDuplicarSeguridad=isPermiso;
		this.isPermisoOrdenSeguridad=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSeguridad(Boolean isPermiso) {
		//this.isPermisoTodoSeguridad=isPermiso;
		this.isPermisoNuevoSeguridad=isPermiso;
		this.isPermisoActualizarSeguridad=isPermiso;
		this.isPermisoActualizarOriginalSeguridad=isPermiso;
		this.isPermisoEliminarSeguridad=isPermiso;
		this.isPermisoGuardarCambiosSeguridad=isPermiso;
		//this.isPermisoConsultaSeguridad=isPermiso;
		//this.isPermisoBusquedaSeguridad=isPermiso;
		//this.isPermisoReporteSeguridad=isPermiso;
		//this.isPermisoOrdenSeguridad=isPermiso;		
		//this.isPermisoPaginacionMedioSeguridad=isPermiso;		
		//this.isPermisoPaginacionAltoSeguridad=isPermiso;		
		//this.isPermisoPaginacionTodoSeguridad=isPermiso;		
		//this.isPermisoCopiarSeguridad=isPermiso;		
		//this.isPermisoDuplicarSeguridad=isPermiso;
		//this.isPermisoOrdenSeguridad=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSeguridadClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SeguridadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSeguridad(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSeguridadClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSeguridadClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSeguridadClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSeguridadClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSeguridad() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SeguridadJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.seguridadSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SeguridadConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSeguridad=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSeguridad=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSeguridad=this.isPermisoActualizarSeguridad;
			this.isPermisoEliminarSeguridad=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSeguridad=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSeguridad=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSeguridad=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSeguridad=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSeguridad=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSeguridad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSeguridad=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSeguridad=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSeguridad=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSeguridad=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSeguridad=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSeguridad=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSeguridad=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.seguridadSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSeguridad.setToolTipText(this.jTableDatosSeguridad.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSeguridad(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSeguridad(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SeguridadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SeguridadJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSeguridad() throws Exception {
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
	
		
	public void inicializarCombosForeignKeySeguridadListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySeguridadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SeguridadJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySeguridadListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeySeguridadListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySeguridad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeySeguridad()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySeguridad(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySeguridad()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySeguridad();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySeguridad(Seguridad seguridad)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySeguridad(Seguridad seguridad,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySeguridad()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySeguridad()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySeguridad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySeguridad()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSeguridad()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySeguridad()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySeguridad(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySeguridad()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public SeguridadBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SeguridadBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SeguridadBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.seguridadSessionBean=new SeguridadSessionBean(); 
		this.seguridadConstantesFunciones=new SeguridadConstantesFunciones(); 
		this.seguridadBean=new Seguridad();//(this.seguridadConstantesFunciones); 		
		this.seguridadReturnGeneral=new SeguridadParameterReturnGeneral(); 
		
		this.seguridadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.seguridadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SeguridadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SeguridadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SeguridadBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSeguridad(true);
			
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
			
			this.seguridadConstantesFunciones=new SeguridadConstantesFunciones(); 
			this.seguridadBean=new Seguridad();//this.seguridadConstantesFunciones); 			
			this.seguridadReturnGeneral=new SeguridadParameterReturnGeneral(); 
		
			SeguridadBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Seguridad Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.seguridad=new Seguridad();
			this.seguridads = new ArrayList<Seguridad>();
			this.seguridadsAux = new ArrayList<Seguridad>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic=new SeguridadLogic();
				this.seguridadLogic.getNewConnexionToDeep("");
			}
			
			//this.seguridadSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.seguridadSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSeguridad);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSeguridad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSeguridad);	
					}
					
					if(this.jInternalFrameImportacionSeguridad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSeguridad);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySeguridad!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySeguridad);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSeguridad!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSeguridad);
				this.jInternalFrameDetalleFormSeguridad.setVisible(false);
				this.jInternalFrameDetalleFormSeguridad.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSeguridad!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSeguridad);
					this.jInternalFrameReporteDinamicoSeguridad.setVisible(false);
					this.jInternalFrameReporteDinamicoSeguridad.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSeguridad!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSeguridad);
					this.jInternalFrameImportacionSeguridad.setVisible(false);
					this.jInternalFrameImportacionSeguridad.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySeguridad!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySeguridad);
					this.jInternalFrameOrderBySeguridad.setVisible(false);
					this.jInternalFrameOrderBySeguridad.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSeguridadActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SeguridadConstantesFunciones.INUMEROPAGINACION;
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
			
			this.seguridadReturnGeneral=new SeguridadParameterReturnGeneral();
			
			this.seguridadParameterGeneral=new SeguridadParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.seguridadLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SeguridadJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.seguridadSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SeguridadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.seguridadSessionBean.getEsGuardarRelacionado(),this.seguridadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SeguridadConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.seguridadSessionBean.getEsGuardarRelacionado(),this.seguridadSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSeguridad=false;
			this.isVisibilidadCeldaDuplicarSeguridad=true;
			this.isVisibilidadCeldaCopiarSeguridad=true;
			this.isVisibilidadCeldaVerFormSeguridad=true;
			this.isVisibilidadCeldaOrdenSeguridad=true;
			this.isVisibilidadCeldaNuevoRelacionesSeguridad=false;
			this.isVisibilidadCeldaModificarSeguridad=false;
			this.isVisibilidadCeldaActualizarSeguridad=false;
			this.isVisibilidadCeldaEliminarSeguridad=false;
			this.isVisibilidadCeldaCancelarSeguridad=false;
			this.isVisibilidadCeldaGuardarSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosSeguridad=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSeguridad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSeguridad();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSeguridad(false);
			
			this.setPermisosUsuarioSeguridad();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.seguridadSessionBean.getEsGuardarRelacionado() 
				|| (this.seguridadSessionBean.getEsGuardarRelacionado() && this.seguridadSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSeguridadClasesRelacionadas();
			}
			
			if(this.seguridadSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSeguridadClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SeguridadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSeguridad();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSeguridad();
			}
			
			if(!this.isPermisoBusquedaSeguridad) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSeguridad,this.isPermisoPaginacionMedioSeguridad,this.isPermisoPaginacionTodoSeguridad);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SeguridadConstantesFunciones.getTiposSeleccionarSeguridad());
				
				this.tiposColumnasSelect=SeguridadConstantesFunciones.getTiposSeleccionarSeguridad(true);
				
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
			//if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSeguridad();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioSeguridad(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioSeguridad(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSeguridad() ;
			
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
				seguridadImplementable= (SeguridadImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SeguridadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				seguridadImplementableHome= (SeguridadImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SeguridadConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.seguridads= new ArrayList<Seguridad>();
			this.seguridadsEliminados= new ArrayList<Seguridad>();
						
			this.isEsNuevoSeguridad=false;
			this.esParaAccionDesdeFormularioSeguridad=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySeguridad(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSeguridad();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SeguridadBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SeguridadConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSeguridad("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSeguridad(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSeguridad!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSeguridad();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSeguridad();
			}
			
			SeguridadBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSeguridad(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Seguridad: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSeguridad() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSeguridad")) {
				iIndex=this.jInternalFrameDetalleFormSeguridad.jTabbedPaneRelacionesSeguridad.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSeguridad.jTabbedPaneRelacionesSeguridad.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSeguridad();	
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
	
	public void cargarCombosForeignKeySeguridad(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySeguridad(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySeguridad(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySeguridadListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySeguridad();
		
		this.cargarCombosFrameForeignKeySeguridad();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySeguridad();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySeguridad();
		}
	}
	
	
	
	public void jButtonNuevoSeguridadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.seguridadSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			
			
			if(jTableDatosSeguridad.getRowCount()>=1) {
				jTableDatosSeguridad.removeRowSelectionInterval(0, jTableDatosSeguridad.getRowCount()-1);						
			}
			
			this.isEsNuevoSeguridad=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSeguridad(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSeguridad(true);			
			//this.seguridad=new Seguridad();
			//this.seguridad.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSeguridad(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSeguridad() ;
			
			if(SeguridadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSeguridad(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.seguridad);	
			this.actualizarInformacion("INFO_PADRE",false,this.seguridad);				
			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			
			if(this.seguridadSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Seguridad: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSeguridadActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSeguridad.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSeguridad.getSelectedRows().length;			
			}
			
			seguridadsSeleccionados=this.getSeguridadsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSeguridad--;			
				//Seguridad seguridadAux= new Seguridad();			
				//seguridadAux.setId(this.iIdNuevoSeguridad);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Seguridad seguridadOrigen=new Seguridad();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Seguridad seguridadOrigen : seguridadsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							seguridadOrigen =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							seguridadOrigen =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSeguridad();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.seguridad.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSeguridad(seguridadOrigen,this.seguridad,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSeguridad(this.seguridad);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.seguridadLogic.getSeguridads().add(this.seguridadAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.seguridads.add(this.seguridadAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSeguridad(false);
				
				this.jTableDatosSeguridad.setRowSelectionInterval(this.getIndiceNuevoSeguridad(), this.getIndiceNuevoSeguridad());
				
				int iLastRow =  this.jTableDatosSeguridad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSeguridad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSeguridad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSeguridad(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();									
		
			Seguridad seguridadOrigen=new Seguridad();
			Seguridad seguridadDestino=new Seguridad();
				
			seguridadsSeleccionados=this.getSeguridadsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSeguridad.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || seguridadsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSeguridad.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						seguridadOrigen =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						seguridadOrigen =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						seguridadDestino =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						seguridadDestino =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				seguridadOrigen =seguridadsSeleccionados.get(0);
				seguridadDestino =seguridadsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSeguridad(seguridadOrigen,seguridadDestino,true,false);
				
				seguridadDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(seguridadDestino,seguridadLogic.getSeguridads());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(seguridadDestino,seguridads);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSeguridad(false);
				
				//this.jTableDatosSeguridad.setRowSelectionInterval(this.getIndiceNuevoSeguridad(), this.getIndiceNuevoSeguridad());
				
				int iLastRow =  this.jTableDatosSeguridad.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSeguridad.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSeguridad.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSeguridad(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSeguridad.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSeguridad.isVisible();
			
			
			this.jPanelParametrosReportesSeguridad.setVisible(!isVisible);
			this.jPanelPaginacionSeguridad.setVisible(!isVisible);
			this.jPanelAccionesSeguridad.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSeguridad();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSeguridad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSeguridad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySeguridad();
			
			this.abrirFrameOrderBySeguridad();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySeguridad();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSeguridad(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSeguridad);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSeguridad.isMaximum()) {
					this.jInternalFrameDetalleFormSeguridad.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSeguridad.setSize(this.jInternalFrameDetalleFormSeguridad.iWidthFormulario,this.jInternalFrameDetalleFormSeguridad.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSeguridad.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSeguridad.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSeguridad.isMaximum()) {
						this.jInternalFrameDetalleFormSeguridad.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSeguridad.jContentPaneDetalleSeguridad.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSeguridad.jTabbedPaneRelacionesSeguridad.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSeguridad.jContentPaneDetalleSeguridad.getWidth(),SeguridadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSeguridad.jTabbedPaneRelacionesSeguridad.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSeguridad.jContentPaneDetalleSeguridad.getWidth(),SeguridadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSeguridad.jTabbedPaneRelacionesSeguridad.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSeguridad.jContentPaneDetalleSeguridad.getWidth(),SeguridadConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSeguridad.setVisible(true);
	        this.jInternalFrameDetalleFormSeguridad.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySeguridad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySeguridad==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySeguridad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySeguridad,false,this);
				} else {
					this.jInternalFrameOrderBySeguridad=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySeguridad,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySeguridad);
				this.jInternalFrameOrderBySeguridad.setVisible(false);
				this.jInternalFrameOrderBySeguridad.setSelected(false);
				
				this.jInternalFrameOrderBySeguridad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySeguridad"));
				
				this.inicializarActualizarBindingTablaOrderBySeguridad();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSeguridad() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSeguridad==null) {
				
				this.jInternalFrameImportacionSeguridad=new ImportacionJInternalFrame(SeguridadConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSeguridad);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSeguridad);
				this.jInternalFrameImportacionSeguridad.setVisible(false);
				this.jInternalFrameImportacionSeguridad.setSelected(false);


				this.jInternalFrameImportacionSeguridad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSeguridad"));
				this.jInternalFrameImportacionSeguridad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSeguridad"));
				this.jInternalFrameImportacionSeguridad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSeguridad"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSeguridad() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSeguridad==null) {
				this.jInternalFrameReporteDinamicoSeguridad=new ReporteDinamicoJInternalFrame(SeguridadConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSeguridad);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSeguridad);
				this.jInternalFrameReporteDinamicoSeguridad.setVisible(false);
				this.jInternalFrameReporteDinamicoSeguridad.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSeguridad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSeguridad"));
				this.jInternalFrameReporteDinamicoSeguridad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSeguridad"));
				this.jInternalFrameReporteDinamicoSeguridad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSeguridad"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSeguridad();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSeguridad() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSeguridad);
			
	       	this.jInternalFrameDetalleFormSeguridad.setVisible(false);
	        this.jInternalFrameDetalleFormSeguridad.setSelected(false);
			
			//this.jInternalFrameDetalleFormSeguridad.dispose();
			//this.jInternalFrameDetalleFormSeguridad=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSeguridad() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSeguridad.setVisible(true);
	        this.jInternalFrameReporteDinamicoSeguridad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSeguridad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSeguridad.setVisible(true);
	        this.jInternalFrameImportacionSeguridad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySeguridad() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySeguridad.setVisible(true);
	        this.jInternalFrameOrderBySeguridad.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySeguridad() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySeguridad.setVisible(false);
	        this.jInternalFrameOrderBySeguridad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSeguridad() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSeguridad.setVisible(false);
	        this.jInternalFrameReporteDinamicoSeguridad.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSeguridad() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSeguridad.setVisible(false);
	        this.jInternalFrameImportacionSeguridad.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSeguridad(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSeguridad(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSeguridad(true);
			//this.isEsNuevoSeguridad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridad =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.seguridad =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSeguridad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSeguridad(false) ;
			
			if(seguridadSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SeguridadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSeguridad(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSeguridad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSeguridadActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridad =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguridad =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSeguridad(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSeguridad(true);
			//this.isEsNuevoSeguridad=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridad =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.seguridad =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.seguridad.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSeguridad("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSeguridad(false) ;
			
			if(SeguridadJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSeguridad(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSeguridad(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSeguridad(false);
			
			//if(!this.isEsNuevoSeguridad) {								
				int intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridad =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.seguridad =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSeguridad(this.seguridad,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSeguridad(this.seguridad);
				
			}
			
			if(this.permiteMantenimiento(this.seguridad)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.seguridadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSeguridad=true;
					this.inicializarActualizarBindingTablaSeguridad(false);
					this.isEsNuevoSeguridad=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSeguridad=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSeguridad=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSeguridad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSeguridad(false);
				
				this.habilitarDeshabilitarControlesSeguridad(false);
			
												
				
				if(SeguridadJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSeguridad();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSeguridadActionPerformed(evt,seguridadSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSeguridad(this.seguridad,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSeguridad.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,seguridadSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.seguridad.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Seguridad.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguridad.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSeguridadActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridad =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				this.seguridad.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.seguridad =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				this.seguridad.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.seguridad)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.seguridadSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SeguridadModel) this.jTableDatosSeguridad.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSeguridad=true;
				this.inicializarActualizarBindingTablaSeguridad(false);
				this.isEsNuevoSeguridad=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSeguridad(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSeguridad(false);
				
				this.habilitarDeshabilitarControlesSeguridad(false);
				
				
				
				if(SeguridadJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSeguridad();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSeguridadActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSeguridad.getRowCount()>=1) {
				jTableDatosSeguridad.removeRowSelectionInterval(0, jTableDatosSeguridad.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSeguridad(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSeguridad(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSeguridad(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSeguridad(false) ;
			
			this.isEsNuevoSeguridad=false;
			
			if(SeguridadJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSeguridad();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSeguridadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSeguridad(false);
				
				//SI ES MANUAL
				if(SeguridadJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSeguridad();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSeguridadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSeguridad--;			
			//Seguridad seguridadAux= new Seguridad();			
			//seguridadAux.setId(this.iIdNuevoSeguridad);
			
			if(this.jInternalFrameDetalleFormSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSeguridad();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSeguridad(this.seguridad);
			
			this.seguridad.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.seguridadLogic.getSeguridads().add(this.seguridadAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.seguridads.add(this.seguridadAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSeguridad(false);
			
			this.jTableDatosSeguridad.setRowSelectionInterval(this.getIndiceNuevoSeguridad(), this.getIndiceNuevoSeguridad());
			
			int iLastRow =  this.jTableDatosSeguridad.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSeguridad.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSeguridad.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSeguridad(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSeguridadActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSeguridad(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSeguridad(false);
			
			//SI ES MANUAL
			if(SeguridadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSeguridad();
			}
			
			//this.abrirFrameTreeSeguridad();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSeguridadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE SeguridadES ?", "MANTENIMIENTO DE Seguridad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSeguridad.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSeguridad();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.seguridadReturnGeneral=seguridadLogic.procesarImportacionSeguridadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.seguridadParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSeguridadReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSeguridadActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSeguridad.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSeguridad.setFileImportacion(this.jInternalFrameImportacionSeguridad.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSeguridad.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSeguridad.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSeguridad.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSeguridad.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSeguridadActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();		

		seguridadsSeleccionados=this.getSeguridadsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSeguridad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSeguridad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SeguridadBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SeguridadBaseDesign.jrxml";
			
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
			
			this.generarReporteSeguridads("Todos",seguridadsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguridad",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSeguridad.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSeguridad.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SeguridadConstantesFunciones.LABEL_CODIGO:
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
		
		if(this.jInternalFrameReporteDinamicoSeguridad.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSeguridad.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSeguridad.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SeguridadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSeguridad.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SeguridadConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSeguridad.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSeguridad.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SeguridadConstantesFunciones.LABEL_CODIGO:
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
	
	public void jButtonGenerarExcelReporteDinamicoSeguridadActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();		
		
		seguridadsSeleccionados=this.getSeguridadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguridad";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Seguridads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSeguridad.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSeguridad.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SeguridadConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SeguridadConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Seguridad seguridad:seguridadsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(seguridad.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelSeguridad(row);				
			//	iRow++;
			//}				
			
			//for(Seguridad seguridadAux:seguridadsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSeguridad(seguridadAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguridad",JOptionPane.INFORMATION_MESSAGE);
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
				this.seguridadLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSeguridad(false);
			
			//SI ES MANUAL
			if(SeguridadJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSeguridad();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSeguridadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSeguridad(false);
			
			//SI ES MANUAL
			if(SeguridadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSeguridad();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSeguridadActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSeguridad(false);
			
			//SI ES MANUAL
			if(SeguridadJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSeguridad();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.seguridadLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSeguridad() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSeguridad.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSeguridad.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSeguridad.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSeguridad.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSeguridad.setMinimumSize(dimensionMinimum);
		this.jTableDatosSeguridad.setMaximumSize(dimensionMaximum);
		this.jTableDatosSeguridad.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSeguridad(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSeguridad(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSeguridad(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSeguridad(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSeguridad(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSeguridad(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSeguridad(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSeguridad(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SeguridadJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SeguridadJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSeguridad() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSeguridad();
		
		this.inicializarActualizarBindingBotonesManualSeguridad(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSeguridad();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSeguridad() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSeguridad(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSeguridad(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSeguridad.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSeguridad.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSeguridad.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSeguridad!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSeguridad.jCheckBoxPostAccionNuevoSeguridad.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSeguridad.jCheckBoxPostAccionSinCerrarSeguridad.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSeguridad.jCheckBoxPostAccionSinMensajeSeguridad.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSeguridad.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSeguridad.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSeguridad.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSeguridad!=null) {
				this.jInternalFrameDetalleFormSeguridad.jCheckBoxPostAccionNuevoSeguridad.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSeguridad.jCheckBoxPostAccionSinCerrarSeguridad.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSeguridad.jCheckBoxPostAccionSinMensajeSeguridad.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSeguridad.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSeguridad.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSeguridad!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSeguridad.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSeguridad!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSeguridad.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSeguridad.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSeguridad.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSeguridad.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSeguridad.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSeguridad!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSeguridad.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSeguridad.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSeguridad.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSeguridad(Boolean esInicializar) throws Exception {
		try	{	
			if(SeguridadJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSeguridad(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSeguridad() throws Exception {
		try	{
			if(SeguridadJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSeguridad();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSeguridad() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSeguridad() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSeguridad.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSeguridad.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSeguridad.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSeguridad.addItem(reporte);
			}
			
			
			if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSeguridad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSeguridad.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSeguridad.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSeguridad.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSeguridad.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSeguridad.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSeguridad.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSeguridad();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSeguridad() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSeguridad!=null) {
				this.jInternalFrameReporteDinamicoSeguridad.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSeguridad.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSeguridad!=null) {
				this.jInternalFrameReporteDinamicoSeguridad.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSeguridad.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSeguridad!=null) {
				
				if(this.jInternalFrameReporteDinamicoSeguridad.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSeguridad.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSeguridad.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSeguridad.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSeguridad.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSeguridad.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSeguridad()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSeguridad(Boolean esInicializar) throws Exception {				
		if(SeguridadJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSeguridad();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSeguridad() throws Exception {
		this.inicializarActualizarBindingTablaSeguridad(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySeguridad() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SeguridadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SeguridadPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSeguridadOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSeguridadOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SeguridadPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SeguridadPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSeguridad(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=seguridadLogic.getSeguridads().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=seguridads.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSeguridad.setModel(new SeguridadModel(this.seguridadLogic.getSeguridads(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSeguridad.setModel(new SeguridadModel(this.seguridads,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySeguridad!=null && this.jInternalFrameOrderBySeguridad.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySeguridad();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSeguridad,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SeguridadPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SeguridadConstantesFunciones.SCLASSWEBTITULO,seguridadConstantesFunciones.resaltarSeleccionarSeguridad,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SeguridadConstantesFunciones.SCLASSWEBTITULO,seguridadConstantesFunciones.resaltarSeleccionarSeguridad,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSeguridad,SeguridadConstantesFunciones.LABEL_ID));

		if(this.seguridadConstantesFunciones.mostraridSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SeguridadConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.seguridadConstantesFunciones.resaltaridSeguridad,this.seguridadConstantesFunciones.activaridSeguridad,this,true,"idSeguridad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.seguridadConstantesFunciones.resaltaridSeguridad,this.seguridadConstantesFunciones.activaridSeguridad,this,true,"idSeguridad","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSeguridad,SeguridadConstantesFunciones.LABEL_CODIGO));

		if(this.seguridadConstantesFunciones.mostrarcodigoSeguridad && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SeguridadConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.seguridadConstantesFunciones.resaltarcodigoSeguridad,this.seguridadConstantesFunciones.activarcodigoSeguridad,this,true,"codigoSeguridad","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.seguridadConstantesFunciones.resaltarcodigoSeguridad,this.seguridadConstantesFunciones.activarcodigoSeguridad,this,true,"codigoSeguridad","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SeguridadPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.seguridadSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.seguridadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.seguridadSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSeguridad.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.seguridadSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.seguridadSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSeguridad.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSeguridad && this.isPermisoGuardarCambiosSeguridad) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.seguridadSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.seguridadSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSeguridad.addColumn(tableColumn);
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
			
			this.jTableDatosSeguridad.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSeguridad && this.isPermisoGuardarCambiosSeguridad) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSeguridad && this.isPermisoGuardarCambiosSeguridad) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSeguridad.moveColumn(this.jTableDatosSeguridad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSeguridad.moveColumn(this.jTableDatosSeguridad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSeguridad.moveColumn(this.jTableDatosSeguridad.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSeguridad.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSeguridad.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSeguridad,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSeguridad.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSeguridad.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSeguridad.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSeguridad.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSeguridad.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=seguridadLogic.getSeguridads().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=seguridads.size()-1;
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
		//this.jTableDatosSeguridad.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSeguridad.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSeguridad();
			
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
				
				//this.isEsNuevoSeguridad=false;
					
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			
				if(this.seguridadSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSeguridad==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSeguridad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSeguridad.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridad =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguridad =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.seguridad.getsType().equals("DUPLICADO")
				   || this.seguridad.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSeguridad=true;
				
				} else {
					this.isEsNuevoSeguridad=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.seguridadSessionBean.getEsGuardarRelacionado()) {
					if(this.seguridad.getId()>=0 && !this.seguridad.getIsNew()) {						
						this.isEsNuevoSeguridad=false;
						
					} else {
						this.isEsNuevoSeguridad=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSeguridad(esRelaciones);						
				
				this.seleccionarSeguridad(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.seguridad.getId()<0) {
					this.isEsNuevoSeguridad=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSeguridad(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSeguridad(evt,rowIndex);
				}	
				
				if(this.seguridadSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Seguridad: " + this.dDif); 
					}
				}								
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSeguridad(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.seguridad)) {
					if(this.seguridad.getId()>0) {
						this.seguridad.setIsDeleted(true);
						
						this.seguridadsEliminados.add(this.seguridad);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.seguridadLogic.getSeguridads().remove(this.seguridad);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.seguridads.remove(this.seguridad);				
					}
					
					
					((SeguridadModel) this.jTableDatosSeguridad.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSeguridad(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSeguridad(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSeguridad) {
			
			if(this.jInternalFrameDetalleFormSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSeguridad.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSeguridad.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridad =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguridad =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSeguridad(this.seguridad);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSeguridad("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSeguridad(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSeguridad() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSeguridad(Seguridad seguridad) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSeguridad(seguridad,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSeguridad(Seguridad seguridad,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSeguridad(seguridad);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySeguridad(seguridad,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySeguridad(seguridad);
	}
	
	public void setVariablesObjetoActualToFormularioSeguridad(Seguridad seguridad) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSeguridad.jLabelidSeguridad.setText(seguridad.getId().toString());
			this.jInternalFrameDetalleFormSeguridad.jTextFieldcodigoSeguridad.setText(seguridad.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Seguridad seguridadLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,seguridadLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Seguridad seguridadLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				seguridadLocal=this.seguridad;
			} else {
				seguridadLocal=this.seguridadAnterior;
			}
		}
		
		if(this.permiteMantenimiento(seguridadLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSeguridad(seguridadLocal,true);
					
					if(seguridadSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(seguridadLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.seguridadSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(seguridadLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSeguridad(Seguridad seguridad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSeguridad(seguridad,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSeguridad(seguridad);
	}
	
	public void setVariablesFormularioToObjetoActualSeguridad(Seguridad seguridad,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSeguridad(seguridad,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSeguridad(Seguridad seguridad,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSeguridad==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSeguridad.jLabelidSeguridad.getText()==null || this.jInternalFrameDetalleFormSeguridad.jLabelidSeguridad.getText()=="" || this.jInternalFrameDetalleFormSeguridad.jLabelidSeguridad.getText()=="Id") {
				this.jInternalFrameDetalleFormSeguridad.jLabelidSeguridad.setText("0");
			}

			if(conColumnasBase) {seguridad.setId(Long.parseLong(this.jInternalFrameDetalleFormSeguridad.jLabelidSeguridad.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SeguridadConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSeguridad.jLabelIdSeguridad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			seguridad.setcodigo(this.jInternalFrameDetalleFormSeguridad.jTextFieldcodigoSeguridad.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SeguridadConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSeguridad.jLabelcodigoSeguridad,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSeguridad(Seguridad seguridadBean,Seguridad seguridad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSeguridad(Seguridad seguridadOrigen,Seguridad seguridad,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && seguridadOrigen.getId()!=null && !seguridadOrigen.getId().equals(0L))) {seguridad.setId(seguridadOrigen.getId());}}
			if(conDefault || (!conDefault && seguridadOrigen.getcodigo()!=null && !seguridadOrigen.getcodigo().equals(""))) {seguridad.setcodigo(seguridadOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSeguridad(Seguridad seguridad) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSeguridad.jLabelidSeguridad.setText(seguridad.getId().toString());
			this.jInternalFrameDetalleFormSeguridad.jTextFieldcodigoSeguridad.setText(seguridad.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSeguridad(SeguridadBean seguridadBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSeguridad.jLabelidSeguridad.setText(seguridadBean.getId().toString());
			this.jInternalFrameDetalleFormSeguridad.jTextFieldcodigoSeguridad.setText(seguridadBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSeguridad(SeguridadParameterReturnGeneral seguridadReturnGeneral,SeguridadBean seguridadBean,Boolean conDefault) throws Exception { 
		try {
			Seguridad seguridadLocal=new Seguridad();
			
			seguridadLocal=seguridadReturnGeneral.getSeguridad();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && seguridadLocal.getId()!=null && !seguridadLocal.getId().equals(0L))) {seguridadBean.setId(seguridadLocal.getId());}}
			if(conDefault || (!conDefault && seguridadLocal.getcodigo()!=null && !seguridadLocal.getcodigo().equals(""))) {seguridadBean.setcodigo(seguridadLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSeguridadGenerico(Long idSeguridadSeleccionado,JComboBox jComboBoxSeguridad,List<Seguridad> seguridadsLocal)throws Exception {
		try {
			Seguridad  seguridadTemp=null;

			for(Seguridad seguridadAux:seguridadsLocal) {
				if(seguridadAux.getId()!=null && seguridadAux.getId().equals(idSeguridadSeleccionado)) {
					seguridadTemp=seguridadAux;
					break;
				}
			}

			jComboBoxSeguridad.setSelectedItem(seguridadTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSeguridadGenerico(JComboBox jComboBoxSeguridad,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSeguridad.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSeguridad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSeguridad.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSeguridad.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSeguridad.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSeguridad.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			seguridad=(Seguridad) seguridadLogic.getSeguridads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			seguridad =(Seguridad) seguridads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Seguridad seguridadRow=new Seguridad();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			seguridadRow=(Seguridad) seguridadLogic.getSeguridads().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			seguridadRow=(Seguridad) seguridads.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSeguridad(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSeguridad.setVisible((this.isVisibilidadCeldaNuevoSeguridad && this.isPermisoNuevoSeguridad));			
			this.jButtonDuplicarSeguridad.setVisible((this.isVisibilidadCeldaDuplicarSeguridad && this.isPermisoDuplicarSeguridad));			
			this.jButtonCopiarSeguridad.setVisible((this.isVisibilidadCeldaCopiarSeguridad && this.isPermisoCopiarSeguridad));
			this.jButtonVerFormSeguridad.setVisible((this.isVisibilidadCeldaVerFormSeguridad && this.isPermisoVerFormSeguridad));
			
			this.jButtonAbrirOrderBySeguridad.setVisible((this.isVisibilidadCeldaOrdenSeguridad && this.isPermisoOrdenSeguridad));			
			
			this.jButtonNuevoRelacionesSeguridad.setVisible((this.isVisibilidadCeldaNuevoRelacionesSeguridad && this.isPermisoNuevoSeguridad));			
			this.jButtonNuevoGuardarCambiosSeguridad.setVisible((this.isVisibilidadCeldaNuevoSeguridad && this.isPermisoNuevoSeguridad && this.isPermisoGuardarCambiosSeguridad));
			
			if(this.jInternalFrameDetalleFormSeguridad!=null) {
			this.jInternalFrameDetalleFormSeguridad.jButtonModificarSeguridad.setVisible((this.isVisibilidadCeldaModificarSeguridad && this.isPermisoActualizarSeguridad));	
			this.jInternalFrameDetalleFormSeguridad.jButtonActualizarSeguridad.setVisible((this.isVisibilidadCeldaActualizarSeguridad && this.isPermisoActualizarSeguridad));	
			this.jInternalFrameDetalleFormSeguridad.jButtonEliminarSeguridad.setVisible((this.isVisibilidadCeldaEliminarSeguridad && this.isPermisoEliminarSeguridad));
			this.jInternalFrameDetalleFormSeguridad.jButtonCancelarSeguridad.setVisible(this.isVisibilidadCeldaCancelarSeguridad);							
			this.jInternalFrameDetalleFormSeguridad.jButtonGuardarCambiosSeguridad.setVisible((this.isVisibilidadCeldaGuardarSeguridad && this.isPermisoGuardarCambiosSeguridad));			
			
			}
						
			this.jButtonGuardarCambiosTablaSeguridad.setVisible((this.isVisibilidadCeldaGuardarCambiosSeguridad && this.isPermisoGuardarCambiosSeguridad));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSeguridad.setVisible((this.isVisibilidadCeldaNuevoSeguridad && this.isPermisoNuevoSeguridad));						
			this.jButtonDuplicarToolBarSeguridad.setVisible((this.isVisibilidadCeldaDuplicarSeguridad && this.isPermisoDuplicarSeguridad));						
			this.jButtonCopiarToolBarSeguridad.setVisible((this.isVisibilidadCeldaCopiarSeguridad && this.isPermisoCopiarSeguridad));			
			this.jButtonVerFormToolBarSeguridad.setVisible((this.isVisibilidadCeldaVerFormSeguridad && this.isPermisoVerFormSeguridad));			
			this.jButtonAbrirOrderByToolBarSeguridad.setVisible((this.isVisibilidadCeldaOrdenSeguridad && this.isPermisoOrdenSeguridad));
			this.jButtonNuevoRelacionesToolBarSeguridad.setVisible((this.isVisibilidadCeldaNuevoRelacionesSeguridad && this.isPermisoNuevoSeguridad));			
			this.jButtonNuevoGuardarCambiosToolBarSeguridad.setVisible((this.isVisibilidadCeldaNuevoSeguridad && this.isPermisoNuevoSeguridad && this.isPermisoGuardarCambiosSeguridad));			
			
			if(this.jInternalFrameDetalleFormSeguridad!=null) {
			this.jInternalFrameDetalleFormSeguridad.jButtonModificarToolBarSeguridad.setVisible((this.isVisibilidadCeldaModificarSeguridad && this.isPermisoActualizarSeguridad));	
			this.jInternalFrameDetalleFormSeguridad.jButtonActualizarToolBarSeguridad.setVisible((this.isVisibilidadCeldaActualizarSeguridad  && this.isPermisoActualizarSeguridad));	
			this.jInternalFrameDetalleFormSeguridad.jButtonEliminarToolBarSeguridad.setVisible((this.isVisibilidadCeldaEliminarSeguridad && this.isPermisoEliminarSeguridad));
			this.jInternalFrameDetalleFormSeguridad.jButtonCancelarToolBarSeguridad.setVisible(this.isVisibilidadCeldaCancelarSeguridad);				
			this.jInternalFrameDetalleFormSeguridad.jButtonGuardarCambiosToolBarSeguridad.setVisible((this.isVisibilidadCeldaGuardarSeguridad && this.isPermisoGuardarCambiosSeguridad));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSeguridad.setVisible((this.isVisibilidadCeldaGuardarCambiosSeguridad && this.isPermisoGuardarCambiosSeguridad));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSeguridad.setVisible((this.isVisibilidadCeldaNuevoSeguridad && this.isPermisoNuevoSeguridad));			
			this.jMenuItemDuplicarSeguridad.setVisible((this.isVisibilidadCeldaDuplicarSeguridad && this.isPermisoDuplicarSeguridad));			
			this.jMenuItemCopiarSeguridad.setVisible((this.isVisibilidadCeldaCopiarSeguridad && this.isPermisoCopiarSeguridad));			
			this.jMenuItemVerFormSeguridad.setVisible((this.isVisibilidadCeldaVerFormSeguridad && this.isPermisoVerFormSeguridad));			
			this.jMenuItemAbrirOrderBySeguridad.setVisible((this.isVisibilidadCeldaOrdenSeguridad && this.isPermisoOrdenSeguridad));			
			//this.jMenuItemMostrarOcultarSeguridad.setVisible((this.isVisibilidadCeldaOrdenSeguridad && this.isPermisoOrdenSeguridad));
			this.jMenuItemDetalleAbrirOrderBySeguridad.setVisible((this.isVisibilidadCeldaOrdenSeguridad && this.isPermisoOrdenSeguridad));			
			//this.jMenuItemDetalleMostrarOcultarSeguridad.setVisible((this.isVisibilidadCeldaOrdenSeguridad && this.isPermisoOrdenSeguridad));			
			this.jMenuItemNuevoRelacionesSeguridad.setVisible((this.isVisibilidadCeldaNuevoRelacionesSeguridad && this.isPermisoNuevoSeguridad));			
			this.jMenuItemNuevoGuardarCambiosSeguridad.setVisible((this.isVisibilidadCeldaNuevoSeguridad && this.isPermisoNuevoSeguridad && this.isPermisoGuardarCambiosSeguridad));									
			
			if(this.jInternalFrameDetalleFormSeguridad!=null) {
			this.jInternalFrameDetalleFormSeguridad.jMenuItemModificarSeguridad.setVisible((this.isVisibilidadCeldaModificarSeguridad && this.isPermisoActualizarSeguridad));	
			this.jInternalFrameDetalleFormSeguridad.jMenuItemActualizarSeguridad.setVisible((this.isVisibilidadCeldaActualizarSeguridad && this.isPermisoActualizarSeguridad));	
			this.jInternalFrameDetalleFormSeguridad.jMenuItemEliminarSeguridad.setVisible((this.isVisibilidadCeldaEliminarSeguridad && this.isPermisoEliminarSeguridad));
			this.jInternalFrameDetalleFormSeguridad.jMenuItemCancelarSeguridad.setVisible(this.isVisibilidadCeldaCancelarSeguridad);				
			}
			
			this.jMenuItemGuardarCambiosSeguridad.setVisible((this.isVisibilidadCeldaGuardarSeguridad && this.isPermisoGuardarCambiosSeguridad));						
			this.jMenuItemGuardarCambiosTablaSeguridad.setVisible((this.isVisibilidadCeldaGuardarCambiosSeguridad && this.isPermisoGuardarCambiosSeguridad));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSeguridad=this.jButtonNuevoSeguridad.isVisible();
			this.isVisibilidadCeldaDuplicarSeguridad=this.jButtonDuplicarSeguridad.isVisible();
			this.isVisibilidadCeldaCopiarSeguridad=this.jButtonCopiarSeguridad.isVisible();
			this.isVisibilidadCeldaVerFormSeguridad=this.jButtonVerFormSeguridad.isVisible();
			
			this.isVisibilidadCeldaOrdenSeguridad=this.jButtonAbrirOrderBySeguridad.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSeguridad=this.jButtonNuevoRelacionesSeguridad.isVisible();
			this.isVisibilidadCeldaModificarSeguridad=this.jButtonModificarSeguridad.isVisible();
			
			if(this.jInternalFrameDetalleFormSeguridad!=null) {
			this.isVisibilidadCeldaActualizarSeguridad=this.jInternalFrameDetalleFormSeguridad.jButtonActualizarSeguridad.isVisible();
			this.isVisibilidadCeldaEliminarSeguridad=this.jInternalFrameDetalleFormSeguridad.jButtonEliminarSeguridad.isVisible();
			this.isVisibilidadCeldaCancelarSeguridad=this.jInternalFrameDetalleFormSeguridad.jButtonCancelarSeguridad.isVisible();
			this.isVisibilidadCeldaGuardarSeguridad=this.jInternalFrameDetalleFormSeguridad.jButtonGuardarCambiosSeguridad.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSeguridad=this.jButtonGuardarCambiosTablaSeguridad.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSeguridad=this.jButtonNuevoToolBarSeguridad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSeguridad=this.jButtonNuevoRelacionesToolBarSeguridad.isVisible();
			
			if(this.jInternalFrameDetalleFormSeguridad!=null) {
			this.isVisibilidadCeldaModificarSeguridad=this.jInternalFrameDetalleFormSeguridad.jButtonModificarToolBarSeguridad.isVisible();
			this.isVisibilidadCeldaActualizarSeguridad=this.jInternalFrameDetalleFormSeguridad.jButtonActualizarToolBarSeguridad.isVisible();
			this.isVisibilidadCeldaEliminarSeguridad=this.jInternalFrameDetalleFormSeguridad.jButtonEliminarToolBarSeguridad.isVisible();
			this.isVisibilidadCeldaCancelarSeguridad=this.jInternalFrameDetalleFormSeguridad.jButtonCancelarToolBarSeguridad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSeguridad=this.jButtonGuardarCambiosToolBarSeguridad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSeguridad=this.jButtonGuardarCambiosTablaToolBarSeguridad.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSeguridad=this.jMenuItemNuevoSeguridad.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSeguridad=this.jMenuItemNuevoRelacionesSeguridad.isVisible();
			
			if(this.jInternalFrameDetalleFormSeguridad!=null) {
			this.isVisibilidadCeldaModificarSeguridad=this.jInternalFrameDetalleFormSeguridad.jMenuItemModificarSeguridad.isVisible();
			this.isVisibilidadCeldaActualizarSeguridad=this.jInternalFrameDetalleFormSeguridad.jMenuItemActualizarSeguridad.isVisible();
			this.isVisibilidadCeldaEliminarSeguridad=this.jInternalFrameDetalleFormSeguridad.jMenuItemEliminarSeguridad.isVisible();
			this.isVisibilidadCeldaCancelarSeguridad=this.jInternalFrameDetalleFormSeguridad.jMenuItemCancelarSeguridad.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSeguridad=this.jMenuItemGuardarCambiosSeguridad.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSeguridad=this.jMenuItemGuardarCambiosTablaSeguridad.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSeguridad(Boolean esInicializar) {
		if(SeguridadJInternalFrame.ISBINDING_MANUAL) {			
			if(this.seguridadSessionBean.getConGuardarRelaciones()) {
				//if(this.seguridadSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSeguridad();
			}
			
			this.inicializarActualizarBindingBotonesManualSeguridad(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSeguridad() {
		this.jButtonNuevoSeguridad.setVisible(this.isPermisoNuevoSeguridad);			
		this.jButtonDuplicarSeguridad.setVisible(this.isPermisoDuplicarSeguridad);			
		this.jButtonCopiarSeguridad.setVisible(this.isPermisoCopiarSeguridad);			
		this.jButtonVerFormSeguridad.setVisible(this.isPermisoVerFormSeguridad);			
		
		this.jButtonAbrirOrderBySeguridad.setVisible(this.isPermisoOrdenSeguridad);					
		
		this.jButtonNuevoRelacionesSeguridad.setVisible(this.isPermisoNuevoSeguridad);			
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.jButtonModificarSeguridad.setVisible(this.isPermisoActualizarSeguridad);	
			this.jInternalFrameDetalleFormSeguridad.jButtonActualizarSeguridad.setVisible(this.isPermisoActualizarSeguridad);	
			this.jInternalFrameDetalleFormSeguridad.jButtonEliminarSeguridad.setVisible(this.isPermisoEliminarSeguridad);
			this.jInternalFrameDetalleFormSeguridad.jButtonCancelarSeguridad.setVisible(this.isVisibilidadCeldaCancelarSeguridad);						
			this.jInternalFrameDetalleFormSeguridad.jButtonGuardarCambiosSeguridad.setVisible(this.isPermisoGuardarCambiosSeguridad);							
		}
		
		this.jButtonGuardarCambiosTablaSeguridad.setVisible(this.isPermisoActualizarSeguridad);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSeguridad() {
		this.jInternalFrameDetalleFormSeguridad.jButtonModificarSeguridad.setVisible(this.isPermisoActualizarSeguridad);	
		this.jInternalFrameDetalleFormSeguridad.jButtonActualizarSeguridad.setVisible(this.isPermisoActualizarSeguridad);	
		this.jInternalFrameDetalleFormSeguridad.jButtonEliminarSeguridad.setVisible(this.isPermisoEliminarSeguridad);
		this.jInternalFrameDetalleFormSeguridad.jButtonCancelarSeguridad.setVisible(this.isVisibilidadCeldaCancelarSeguridad);							
		this.jInternalFrameDetalleFormSeguridad.jButtonGuardarCambiosSeguridad.setVisible((this.isVisibilidadCeldaGuardarSeguridad && this.isPermisoGuardarCambiosSeguridad));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSeguridad() {
		if(SeguridadJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSeguridad();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSeguridad() {
	}
	
	public void jTableDatosSeguridadListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSeguridad(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSeguridad(this.getseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguridad(this.seguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.seguridad =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.seguridad =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.seguridad==null) {
						this.seguridad = new Seguridad();
					}

					this.setVariablesFormularioToObjetoActualSeguridad(this.seguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguridad(this.seguridad);
				}

				if(this.seguridad.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.seguridad.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoSeguridadBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSeguridad(this.getseguridad(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguridad(this.seguridad);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.seguridad =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.seguridad =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.seguridad==null) {
						this.seguridad = new Seguridad();
					}

					this.setVariablesFormularioToObjetoActualSeguridad(this.seguridad,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguridad(this.seguridad);
				}

				if(this.seguridad.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.seguridad.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSeguridad(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameSeguridad() {
		if(this.jInternalFrameDetalleFormSeguridad!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) {
			this.jInternalFrameDetalleFormSeguridad.setVisible(false);	    			
			this.jInternalFrameDetalleFormSeguridad.dispose();
			this.jInternalFrameDetalleFormSeguridad=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSeguridad!=null) {
			this.jInternalFrameReporteDinamicoSeguridad.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSeguridad.dispose();
			this.jInternalFrameReporteDinamicoSeguridad=null;
		}
		
		if(this.jInternalFrameImportacionSeguridad!=null) {
			this.jInternalFrameImportacionSeguridad.setVisible(false);	    			
			this.jInternalFrameImportacionSeguridad.dispose();
			this.jInternalFrameImportacionSeguridad=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSeguridad();
			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			
			
			if(sTipo.equals("NuevoSeguridad")) {
				jButtonNuevoSeguridadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSeguridad")) {
				jButtonDuplicarSeguridadActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSeguridad")) {
				jButtonCopiarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("VerFormSeguridad")) {
				jButtonVerFormSeguridadActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSeguridad")) {
				jButtonNuevoSeguridadActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSeguridad")) {
				jButtonDuplicarSeguridadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSeguridad")) {
				jButtonNuevoSeguridadActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSeguridad")) {
				jButtonDuplicarSeguridadActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSeguridad")) {
				jButtonNuevoSeguridadActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSeguridad")) {
				jButtonNuevoSeguridadActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSeguridad")) {
				jButtonNuevoSeguridadActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSeguridad")) {
				jButtonModificarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSeguridad")) {
				jButtonModificarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSeguridad")) {
				jButtonModificarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSeguridad")) {
				jButtonActualizarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSeguridad")) {
				jButtonActualizarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSeguridad")) {
				jButtonActualizarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("EliminarSeguridad")) {
				jButtonEliminarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSeguridad")) {
				jButtonEliminarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSeguridad")) {
				jButtonEliminarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("CancelarSeguridad")) {
				jButtonCancelarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSeguridad")) {
				jButtonCancelarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSeguridad")) {
				jButtonCancelarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("CerrarSeguridad")) {
				jButtonCerrarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSeguridad")) {
				jButtonCerrarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSeguridad")) {
				jButtonCerrarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSeguridad")) {
				jButtonMostrarOcultarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSeguridad")) {
				jButtonCancelarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSeguridad")) {
				jButtonGuardarCambiosSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSeguridad")) {
				jButtonGuardarCambiosSeguridadActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSeguridad")) {
				jButtonCopiarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSeguridad")) {
				jButtonVerFormSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSeguridad")) {
				jButtonGuardarCambiosSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSeguridad")) {
				jButtonCopiarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSeguridad")) {
				jButtonVerFormSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSeguridad")) {
				jButtonGuardarCambiosSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSeguridad")) {
				jButtonGuardarCambiosSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSeguridad")) {
				jButtonGuardarCambiosSeguridadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSeguridad")) {
				jButtonRecargarInformacionSeguridadActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSeguridad")) {
				jButtonRecargarInformacionSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSeguridad")) {
				jButtonRecargarInformacionSeguridadActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSeguridad")) {
				jButtonAnterioresSeguridadActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSeguridad")) {
				jButtonAnterioresSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSeguridad")) {
				jButtonAnterioresSeguridadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSeguridad")) {
				jButtonSiguientesSeguridadActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSeguridad")) {
				jButtonSiguientesSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSeguridad")) {
				jButtonSiguientesSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySeguridad") || sTipo.equals("MenuItemDetalleAbrirOrderBySeguridad")) {
				jButtonAbrirOrderBySeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSeguridad") || sTipo.equals("MenuItemDetalleMostrarOcultarSeguridad")) {
				jButtonMostrarOcultarSeguridadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSeguridad")) {
				jButtonNuevoGuardarCambiosSeguridadActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSeguridad")) {
				jButtonNuevoGuardarCambiosSeguridadActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSeguridad")) {
				jButtonNuevoGuardarCambiosSeguridadActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSeguridad")) {
				jButtonCerrarReporteDinamicoSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSeguridad")) {
				jButtonGenerarReporteDinamicoSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSeguridad")) {
				
				jButtonGenerarExcelReporteDinamicoSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSeguridad")) {
				jButtonCerrarImportacionSeguridadActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSeguridad")) {
				
				jButtonGenerarImportacionSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSeguridad")) {
				
				jButtonAbrirImportacionSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSeguridad")) {
				jComboBoxTiposAccionesSeguridadActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSeguridad")) {
				jComboBoxTiposRelacionesSeguridadActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSeguridad")) {
				jComboBoxTiposAccionesSeguridadActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSeguridad")) {
				
				jComboBoxTiposSeleccionarSeguridadActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSeguridad")) {
				jTextFieldValorCampoGeneralSeguridadActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySeguridad")) {
				jButtonAbrirOrderBySeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSeguridad")) {
				jButtonAbrirOrderBySeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySeguridad")) {
				jButtonCerrarOrderBySeguridadActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSeguridadBusqueda")) {
				this.jButtonidSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSeguridadBusqueda")) {
				this.jButtoncodigoSeguridadBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSeguridad();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguridadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				


				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Seguridad seguridadLocal=null;
			
			if(!this.getEsControlTabla()) {
				seguridadLocal=this.seguridad;
			} else {
				seguridadLocal=this.seguridadAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
							
				
				


				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguridadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadAnterior =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguridadAnterior =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
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
			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			
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
			
			


			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguridadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
								
						
				


				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguridad.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
								
				
				


				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguridadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadAnterior =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguridadAnterior =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguridadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadAnterior =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguridadAnterior =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguridadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
							
				
				


				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguridad.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguridadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.seguridadAnterior =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.seguridadAnterior =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
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
			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			
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
			
			


			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguridadActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
								
				
				


				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguridadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadAnterior =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguridadAnterior =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguridadActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
			
			this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguridadActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSeguridad")) {
					jCheckBoxSeleccionarTodosSeguridadItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSeguridad")) {
					jCheckBoxSeleccionadosSeguridadItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSeguridad")) {
					
				}
				
				


				
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
												
				
				


				
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguridad.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguridadActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.seguridadAnterior =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.seguridadAnterior =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguridadActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
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
			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
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
			
			


			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSeguridadActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguridad.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguridad.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.seguridad);
				
				this.actualizarInformacion("INFO_PADRE",false,this.seguridad);
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
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
				
				


				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Seguridad.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Seguridad.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSeguridadActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.seguridadAnterior =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.seguridadAnterior =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSeguridad")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSeguridadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSeguridad.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.seguridad =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.seguridad =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.seguridad);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSeguridad")) {
				
				}
				
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSeguridad")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSeguridad.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSeguridad")) {
			
			}
			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSeguridad();
			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			
			if(sTipo.equals("NuevoSeguridad")) {
				jButtonNuevoSeguridadActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSeguridad")) {
				jButtonDuplicarSeguridadActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSeguridad")) {
				jButtonCopiarSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSeguridad")) {
				jButtonVerFormSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSeguridad")) {
				jButtonNuevoSeguridadActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSeguridad")) {
				jButtonModificarSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSeguridad")) {
				jButtonActualizarSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSeguridad")) {
				jButtonEliminarSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSeguridad")) {
				jButtonGuardarCambiosSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSeguridad")) {
				jButtonCancelarSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSeguridad")) {
				jButtonCerrarSeguridadActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSeguridad")) {
				jButtonGuardarCambiosSeguridadActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSeguridad")) {
				jButtonNuevoGuardarCambiosSeguridadActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySeguridad")) {
				jButtonAbrirOrderBySeguridadActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSeguridad")) {
				jButtonRecargarInformacionSeguridadActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSeguridad")) {
				jButtonAnterioresSeguridadActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSeguridad")) {
				jButtonSiguientesSeguridadActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSeguridadBusqueda")) {
				this.jButtonidSeguridadBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSeguridadBusqueda")) {
				this.jButtoncodigoSeguridadBusquedaActionPerformed(evt);
			}
			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSeguridad();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSeguridad")) {
				closingInternalFrameSeguridad();
				
			} else if(sTipo.equals("jButtonCancelarSeguridad")) {
				JInternalFrameBase jInternalFrameDetalleFormSeguridad = (JInternalFrameBase)evt.getSource();
	            	
	            SeguridadBeanSwingJInternalFrame jInternalFrameParent=(SeguridadBeanSwingJInternalFrame)jInternalFrameDetalleFormSeguridad.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSeguridadActionPerformed(null);
			}
			
			SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.seguridad,new Object(),this.seguridadParameterGeneral,this.seguridadReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSeguridad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSeguridad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSeguridad(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.seguridad)) {
			if(!esControlTabla) {
				if(SeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSeguridad(this.seguridad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguridad(this.seguridad);			
				}
				
				if(this.seguridadSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSeguridad(this.seguridad,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSeguridad(this.seguridadReturnGeneral,this.seguridadBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.seguridadSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSeguridad(classes,this.seguridadReturnGeneral,this.seguridadBean,false);
					}
						
					if(this.seguridadReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySeguridad(this.seguridadReturnGeneral.getSeguridad());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSeguridad(this.seguridadReturnGeneral.getSeguridad());	
					}
						
					if(this.seguridadReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSeguridad(this.seguridadReturnGeneral.getSeguridad(),classes);//this.seguridadBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSeguridad(this.seguridad,classes);//this.seguridadBean);									
				}
			
				if(SeguridadJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSeguridad(this.seguridad,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSeguridad(this.seguridad);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.seguridadAnterior!=null) {
						this.seguridad=this.seguridadAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.seguridadSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.seguridadSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.seguridadReturnGeneral.getSeguridad(),seguridadLogic.getSeguridads());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.seguridadReturnGeneral.getSeguridad(),this.seguridads);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSeguridad.repaint();
				
				//((AbstractTableModel) this.jTableDatosSeguridad.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSeguridad();
			}
		}
	}
	
	public void actualizarVisualTableDatosSeguridad() throws Exception {
		
		SeguridadModel seguridadModel=(SeguridadModel)this.jTableDatosSeguridad.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			seguridadModel.seguridads=this.seguridadLogic.getSeguridads();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			seguridadModel.seguridads=this.seguridads;
		}
		
		
		((SeguridadModel) this.jTableDatosSeguridad.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSeguridad() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getseguridadAnterior(),this.seguridadLogic.getSeguridads());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getseguridadAnterior(),this.seguridads);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSeguridad();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSeguridad(Seguridad seguridad,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
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
										
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.seguridad,new Object(),generalEntityParameterGeneral,this.seguridadReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.seguridadSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SeguridadConstantesFunciones.getClassesRelationshipsOfSeguridad(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SeguridadConstantesFunciones.getClassesRelationshipsFromStringsOfSeguridad(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSeguridad(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SeguridadBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.seguridad,new Object(),generalEntityParameterGeneral,this.seguridadReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSeguridad(SeguridadBean seguridadBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSeguridad(ArrayList<Classe> classes,SeguridadReturnGeneral seguridadReturnGeneral,SeguridadBean seguridadBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSeguridad(Seguridad seguridad,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.seguridad)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSeguridad = new SeguridadDetalleFormJInternalFrame(jDesktopPane,this.seguridadSessionBean.getConGuardarRelaciones(),this.seguridadSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSeguridad);
		this.jInternalFrameDetalleFormSeguridad.setVisible(false);
		this.jInternalFrameDetalleFormSeguridad.setSelected(false);						
		
		this.jInternalFrameDetalleFormSeguridad.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSeguridad.seguridadLogic=this.seguridadLogic;
		
		this.cargarCombosFrameForeignKeySeguridad("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSeguridad();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSeguridad();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySeguridad("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySeguridad();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSeguridad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSeguridad"));
		
		this.jInternalFrameDetalleFormSeguridad.jButtonModificarSeguridad.addActionListener(new ButtonActionListener(this,"ModificarSeguridad"));

		
		this.jInternalFrameDetalleFormSeguridad.jButtonModificarToolBarSeguridad.addActionListener(new ButtonActionListener(this,"ModificarToolBarSeguridad"));
					
		this.jInternalFrameDetalleFormSeguridad.jMenuItemModificarSeguridad.addActionListener(new ButtonActionListener(this,"MenuItemModificarSeguridad"));		
		
		
		
		this.jInternalFrameDetalleFormSeguridad.jButtonActualizarSeguridad.addActionListener (new ButtonActionListener(this,"ActualizarSeguridad"));
		
		
		this.jInternalFrameDetalleFormSeguridad.jButtonActualizarToolBarSeguridad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSeguridad"));
						
		this.jInternalFrameDetalleFormSeguridad.jMenuItemActualizarSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSeguridad"));		
		
		
		
		this.jInternalFrameDetalleFormSeguridad.jButtonEliminarSeguridad.addActionListener (new ButtonActionListener(this,"EliminarSeguridad"));
		
		
		this.jInternalFrameDetalleFormSeguridad.jButtonEliminarToolBarSeguridad.addActionListener (new ButtonActionListener(this,"EliminarToolBarSeguridad"));
								
		this.jInternalFrameDetalleFormSeguridad.jMenuItemEliminarSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSeguridad"));		
		
		
		
		this.jInternalFrameDetalleFormSeguridad.jButtonCancelarSeguridad.addActionListener (new ButtonActionListener(this,"CancelarSeguridad"));
		
		
		this.jInternalFrameDetalleFormSeguridad.jButtonCancelarToolBarSeguridad.addActionListener (new ButtonActionListener(this,"CancelarToolBarSeguridad"));
					
		this.jInternalFrameDetalleFormSeguridad.jMenuItemCancelarSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSeguridad"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSeguridad.jMenuItemDetalleCerrarSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSeguridad"));		
		
		
		
		this.jInternalFrameDetalleFormSeguridad.jButtonGuardarCambiosToolBarSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSeguridad"));
		
		
		
		this.jInternalFrameDetalleFormSeguridad.jButtonGuardarCambiosToolBarSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSeguridad"));
		
		
		
		this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSeguridad"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguridad.jButtonidSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"idSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguridad.jButtoncodigoSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"codigoSeguridadBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSeguridad.jTabbedPaneRelacionesSeguridad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSeguridad"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSeguridad"));
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSeguridad"));
		}
		
		this.jTableDatosSeguridad.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSeguridad"));
		
		this.jTableDatosSeguridad.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSeguridad"));
		
		this.jButtonNuevoSeguridad.addActionListener(new ButtonActionListener(this,"NuevoSeguridad"));
		
		this.jButtonDuplicarSeguridad.addActionListener(new ButtonActionListener(this,"DuplicarSeguridad"));
		
		this.jButtonCopiarSeguridad.addActionListener(new ButtonActionListener(this,"CopiarSeguridad"));
		
		this.jButtonVerFormSeguridad.addActionListener(new ButtonActionListener(this,"VerFormSeguridad"));
		
		
		this.jButtonNuevoToolBarSeguridad.addActionListener(new ButtonActionListener(this,"NuevoToolBarSeguridad"));
			
		this.jButtonDuplicarToolBarSeguridad.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSeguridad"));
			
		this.jMenuItemNuevoSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSeguridad"));
			
		this.jMenuItemDuplicarSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSeguridad"));		
		
		
		this.jButtonNuevoRelacionesSeguridad.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSeguridad"));
		
		
		this.jButtonNuevoRelacionesToolBarSeguridad.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSeguridad"));
			
		this.jMenuItemNuevoRelacionesSeguridad.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSeguridad"));		
		
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.jButtonModificarSeguridad.addActionListener(new ButtonActionListener(this,"ModificarSeguridad"));
		}
		
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.jButtonModificarToolBarSeguridad.addActionListener(new ButtonActionListener(this,"ModificarToolBarSeguridad"));
			
			this.jInternalFrameDetalleFormSeguridad.jMenuItemModificarSeguridad.addActionListener(new ButtonActionListener(this,"MenuItemModificarSeguridad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSeguridad.jButtonActualizarSeguridad.addActionListener (new ButtonActionListener(this,"ActualizarSeguridad"));
		}
		
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.jButtonActualizarToolBarSeguridad.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSeguridad"));
				
			this.jInternalFrameDetalleFormSeguridad.jMenuItemActualizarSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSeguridad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.jButtonEliminarSeguridad.addActionListener (new ButtonActionListener(this,"EliminarSeguridad"));
		}
		
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.jButtonEliminarToolBarSeguridad.addActionListener (new ButtonActionListener(this,"EliminarToolBarSeguridad"));
						
			this.jInternalFrameDetalleFormSeguridad.jMenuItemEliminarSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSeguridad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.jButtonCancelarSeguridad.addActionListener (new ButtonActionListener(this,"CancelarSeguridad"));
		}
		
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.jButtonCancelarToolBarSeguridad.addActionListener (new ButtonActionListener(this,"CancelarToolBarSeguridad"));
			
			this.jInternalFrameDetalleFormSeguridad.jMenuItemCancelarSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSeguridad"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSeguridad.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSeguridad"));		
		
		
		this.jButtonCerrarSeguridad.addActionListener (new ButtonActionListener(this,"CerrarSeguridad"));
		
		
		this.jButtonCerrarToolBarSeguridad.addActionListener (new ButtonActionListener(this,"CerrarToolBarSeguridad"));
			
		this.jMenuItemCerrarSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSeguridad"));
			
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.jMenuItemDetalleCerrarSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSeguridad"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.jButtonGuardarCambiosSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosSeguridad"));
		}
		
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.jButtonGuardarCambiosToolBarSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSeguridad"));
		}
		
		this.jButtonCopiarToolBarSeguridad.addActionListener (new ButtonActionListener(this,"CopiarToolBarSeguridad"));
			
		this.jButtonVerFormToolBarSeguridad.addActionListener (new ButtonActionListener(this,"VerFormToolBarSeguridad"));
		
		this.jMenuItemGuardarCambiosSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSeguridad"));
			
		this.jMenuItemCopiarSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSeguridad"));		
		
		this.jMenuItemVerFormSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSeguridad"));		
		
		
		this.jButtonGuardarCambiosTablaSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSeguridad"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSeguridad"));
			
		this.jMenuItemGuardarCambiosTablaSeguridad.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSeguridad"));		
		
		
		
		this.jButtonRecargarInformacionSeguridad.addActionListener (new ButtonActionListener(this,"RecargarInformacionSeguridad"));
					
		this.jButtonRecargarInformacionToolBarSeguridad.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSeguridad"));
		
		this.jMenuItemRecargarInformacionSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSeguridad"));		
		
		
		
		this.jButtonAnterioresSeguridad.addActionListener (new ButtonActionListener(this,"AnterioresSeguridad"));
		
		
		this.jButtonAnterioresToolBarSeguridad.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSeguridad"));
		
		this.jMenuItemAnterioresSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSeguridad"));		
		
		
		this.jButtonSiguientesSeguridad.addActionListener (new ButtonActionListener(this,"SiguientesSeguridad"));
		
		
		this.jButtonSiguientesToolBarSeguridad.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSeguridad"));
			
		this.jMenuItemSiguientesSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSeguridad"));
			
		this.jMenuItemAbrirOrderBySeguridad.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySeguridad"));
			
		this.jMenuItemMostrarOcultarSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSeguridad"));
			
		this.jMenuItemDetalleAbrirOrderBySeguridad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySeguridad"));
			
		this.jMenuItemDetalleMostarOcultarSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSeguridad"));		
		
		
		this.jButtonNuevoGuardarCambiosSeguridad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSeguridad"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSeguridad.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSeguridad"));
			
		this.jMenuItemNuevoGuardarCambiosSeguridad.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSeguridad"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSeguridad.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSeguridad"));

		this.jCheckBoxSeleccionadosSeguridad.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSeguridad"));
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSeguridad"));
		}
		
		
		this.jComboBoxTiposRelacionesSeguridad.addActionListener (new ButtonActionListener(this,"TiposRelacionesSeguridad"));
			
		this.jComboBoxTiposAccionesSeguridad.addActionListener (new ButtonActionListener(this,"TiposAccionesSeguridad"));
					
		this.jComboBoxTiposSeleccionarSeguridad.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSeguridad"));
			
		this.jTextFieldValorCampoGeneralSeguridad.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSeguridad"));		
		
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguridad.jButtonidSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"idSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguridad.jButtoncodigoSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"codigoSeguridadBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSeguridad!=null) {
				this.jInternalFrameReporteDinamicoSeguridad.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSeguridad"));
				this.jInternalFrameReporteDinamicoSeguridad.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSeguridad"));
				this.jInternalFrameReporteDinamicoSeguridad.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSeguridad"));
			}
			
			//this.jButtonCerrarReporteDinamicoSeguridad.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSeguridad"));				
			//this.jButtonGenerarReporteDinamicoSeguridad.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSeguridad"));
			//this.jButtonGenerarExcelReporteDinamicoSeguridad.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSeguridad"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSeguridad!=null) {
				this.jInternalFrameImportacionSeguridad.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSeguridad"));
				this.jInternalFrameImportacionSeguridad.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSeguridad"));
				this.jInternalFrameImportacionSeguridad.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSeguridad"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySeguridad.addActionListener (new ButtonActionListener(this,"AbrirOrderBySeguridad"));
			
			this.jButtonAbrirOrderByToolBarSeguridad.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSeguridad"));			
			
			if(this.jInternalFrameOrderBySeguridad!=null) {
				this.jInternalFrameOrderBySeguridad.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySeguridad"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSeguridad!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSeguridad.jTabbedPaneRelacionesSeguridad.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSeguridad"));
		
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
            		closingInternalFrameSeguridad();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSeguridad.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSeguridad = (JInternalFrameBase)event.getSource();
	            	
	            SeguridadBeanSwingJInternalFrame jInternalFrameParent=(SeguridadBeanSwingJInternalFrame)jInternalFrameDetalleFormSeguridad.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSeguridadActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSeguridad.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSeguridadListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSeguridad.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSeguridad.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSeguridadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSeguridadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSeguridadActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSeguridad";
		inputMap = this.jButtonNuevoSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSeguridadActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSeguridadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSeguridadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSeguridadActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSeguridad";
		inputMap = this.jButtonNuevoRelacionesSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSeguridadActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSeguridad";
		inputMap = this.jButtonModificarSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSeguridadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSeguridad";
		inputMap = this.jButtonActualizarSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSeguridadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSeguridad";
		inputMap = this.jButtonEliminarSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSeguridadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSeguridad";
		inputMap = this.jButtonCancelarSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSeguridadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSeguridad";
		inputMap = this.jButtonCerrarSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSeguridadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSeguridad.jButtonGuardarCambiosSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSeguridad";
		inputMap = this.jInternalFrameDetalleFormSeguridad.jButtonGuardarCambiosSeguridad.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSeguridad.jButtonGuardarCambiosSeguridad.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSeguridadActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSeguridad.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSeguridadItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSeguridad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSeguridadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSeguridad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSeguridadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSeguridad.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSeguridadActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguridad.jButtonidSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"idSeguridadBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSeguridad.jButtoncodigoSeguridadBusqueda.addActionListener(new ButtonActionListener(this,"codigoSeguridadBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSeguridad.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSeguridadActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSeguridadActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSeguridad.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSeguridad(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Seguridad seguridadAux:this.seguridadLogic.getSeguridads()) {
					seguridadAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Seguridad seguridadAux:seguridads) {
					seguridadAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSeguridadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSeguridad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Seguridad seguridadAux:this.seguridadLogic.getSeguridads()) {
						seguridadAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Seguridad seguridadAux:seguridads) {
						seguridadAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Seguridad seguridadAux:this.seguridadLogic.getSeguridads()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Seguridad seguridadAux:seguridads) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSeguridad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSeguridad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSeguridad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSeguridad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSeguridadItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSeguridad(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSeguridad.getSelectedRows();
			
			Seguridad seguridadLocal=new Seguridad();
			
			//this.seleccionarTodosSeguridad(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					seguridadLocal =(Seguridad) this.seguridadLogic.getSeguridads().toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					seguridadLocal =(Seguridad) this.seguridads.toArray()[this.jTableDatosSeguridad.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				seguridadLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Seguridad seguridadAux:this.seguridadLogic.getSeguridads()) {
						seguridadAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Seguridad seguridadAux:seguridads) {
						seguridadAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSeguridad(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSeguridad.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSeguridad.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSeguridad,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSeguridadItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSeguridadParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSeguridadActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSeguridad(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSeguridad.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Seguridad seguridadAux:this.seguridadLogic.getSeguridads()) {
				
						if(sTipoSeleccionar.equals(SeguridadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							seguridadAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Seguridad seguridadAux:seguridads) {
					
						if(sTipoSeleccionar.equals(SeguridadConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							seguridadAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSeguridad(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSeguridadActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSeguridad(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSeguridad=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSeguridad.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSeguridad) {				
					conSplash=true;//false;										
					
					//this.startProcessSeguridad(conSplash);
				
					this.generarReporteSeguridadsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSeguridad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSeguridadsSeleccionados();
				//this.jComboBoxTiposAccionesSeguridad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSeguridadsSeleccionados(false);
				//this.jComboBoxTiposAccionesSeguridad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSeguridadsSeleccionados(true);
				//this.jComboBoxTiposAccionesSeguridad.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSeguridad();
				
				this.exportarSeguridadsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSeguridad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSeguridads();
				//this.importarSeguridads();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSeguridad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSeguridad();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSeguridadsSeleccionados();
				//this.jComboBoxTiposAccionesSeguridad.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Seguridad", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSeguridad();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSeguridad)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySeguridad(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Seguridad",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSeguridad.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.setSelectedIndex(0);					
				}	
			} 			
			else if(SeguridadBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSeguridad) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSeguridad(conSplash);
					
						//this.actualizarParametrosGeneralSeguridad();
						
						this.generarReporteProcesoAccionSeguridadsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSeguridad.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SeguridadBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO SeguridadES SELECCIONADOS?", "MANTENIMIENTO DE Seguridad", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSeguridad();
				
						this.actualizarParametrosGeneralSeguridad();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.seguridadReturnGeneral=seguridadLogic.procesarAccionSeguridadsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.seguridadLogic.getSeguridads(),this.seguridadParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSeguridadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSeguridad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSeguridad();
					
					SeguridadBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSeguridadReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSeguridad.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSeguridad.jComboBoxTiposAccionesFormularioSeguridad.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSeguridad(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSeguridadActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSeguridad();
			
			if(this.jInternalFrameDetalleFormSeguridad==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();		
			Seguridad seguridad=new Seguridad();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSeguridad(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSeguridad.getSelectedItem();
			
			
			
			
			seguridadsSeleccionados=this.getSeguridadsSeleccionados(true);
			//this.sTipoAccion;
			
			if(seguridadsSeleccionados.size()==1) {
				for(Seguridad seguridadAux:seguridadsSeleccionados) {
					seguridad=seguridadAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSeguridad();
			
      		//this.finishProcessSeguridad(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSeguridadReturnGeneral() throws Exception {
		if(this.seguridadReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.seguridadReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.seguridadReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.seguridadReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.seguridadReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.seguridadReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSeguridad(false);
		}
		
		if(this.seguridadReturnGeneral.getConRetornoLista() || this.seguridadReturnGeneral.getConRetornoObjeto()) {
			if(this.seguridadReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.seguridadLogic.setSeguridads(this.seguridadReturnGeneral.getSeguridads());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.seguridadReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.seguridadLogic.setSeguridad(this.seguridadReturnGeneral.getSeguridad());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSeguridad(false);
		}
	}
	
	public void actualizarParametrosGeneralSeguridad() throws Exception {
		
		
	}
	
	public ArrayList<Seguridad> getSeguridadsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSeguridad) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Seguridad seguridadAux:seguridadLogic.getSeguridads()) {
					if(seguridadAux.getIsSelected()) {
						seguridadsSeleccionados.add(seguridadAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Seguridad seguridadAux:this.seguridads) {
					if(seguridadAux.getIsSelected()) {
						seguridadsSeleccionados.add(seguridadAux);				
					}
				}
			}
			
			if(seguridadsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						seguridadsSeleccionados.addAll(this.seguridadLogic.getSeguridads());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						seguridadsSeleccionados.addAll(this.seguridads);				
					}
				}
			}
		} else {
			seguridadsSeleccionados.add(this.seguridad);
		}
		
		return seguridadsSeleccionados;
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
	
	public void generarReporteSeguridadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSeguridadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSeguridadsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSeguridadsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSeguridadsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Seguridad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSeguridadsSeleccionados() throws Exception {
		ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();		
		
		seguridadsSeleccionados=this.getSeguridadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSeguridads("Todos",seguridadsSeleccionados);
		
	}	
	
	public void generarReporteNormalSeguridadsSeleccionados() throws Exception {
		ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();		
		
		seguridadsSeleccionados=this.getSeguridadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSeguridads("Todos",seguridadsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSeguridadsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();
		
		seguridadsSeleccionados=this.getSeguridadsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSeguridads("Todos",seguridadsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSeguridadsSeleccionados() throws Exception {
		ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSeguridad();
		
		
		seguridadsSeleccionados=this.getSeguridadsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSeguridad();
		
		
		//this.generarReporteSeguridads("Todos",seguridadsSeleccionados ,seguridadImplementable,seguridadImplementableHome);
	}
	
	public void mostrarImportacionSeguridads() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSeguridad();
		
		this.abrirFrameImportacionSeguridad();		
		
			
		//this.generarReporteSeguridads("Todos",seguridadsSeleccionados ,seguridadImplementable,seguridadImplementableHome);
	}
	
	public void importarSeguridads() throws Exception {		
	
	}
	
	public void exportarSeguridadsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSeguridadsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSeguridadsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSeguridadsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Seguridad",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSeguridadsSeleccionados() throws Exception {
		ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();		
		
		seguridadsSeleccionados=this.getSeguridadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguridad."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSeguridad(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Seguridad seguridadAux:seguridadsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSeguridad(seguridadAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//seguridadAux.setsDetalleGeneralEntityReporte(seguridadAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguridad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSeguridad(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SeguridadConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SeguridadConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SeguridadConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSeguridad(Seguridad seguridad,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=seguridad.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=seguridad.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=seguridad.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSeguridadsSeleccionados() throws Exception {
		ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();		
		
		seguridadsSeleccionados=this.getSeguridadsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguridad.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Seguridads");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSeguridad(row);				
				iRow++;
			}				
			
			for(Seguridad seguridadAux:seguridadsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSeguridad(seguridadAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguridad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSeguridadsSeleccionados() throws Exception {
		ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();		
		
		seguridadsSeleccionados=this.getSeguridadsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"seguridad.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("seguridads");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("seguridad");
			//elementRoot.appendChild(element);
		
			for(Seguridad seguridadAux:seguridadsSeleccionados) {
				element = document.createElement("seguridad");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSeguridad(seguridadAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.seguridadSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Seguridad",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSeguridad(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SeguridadConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SeguridadConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SeguridadConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSeguridad(Seguridad seguridad,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(seguridad.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(seguridad.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlSeguridad(Seguridad seguridad,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SeguridadConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(seguridad.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SeguridadConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(seguridad.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(SeguridadConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(seguridad.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoSeguridadsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Seguridad> seguridadsSeleccionados=new ArrayList<Seguridad>();
		
		seguridadsSeleccionados=this.getSeguridadsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSeguridad(seguridadsSeleccionados);
		
		this.generarReporteSeguridads("Todos",seguridadsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSeguridad(ArrayList<Seguridad> seguridadsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Seguridad seguridadAux:seguridadsSeleccionados) {
				seguridadAux.setsDetalleGeneralEntityReporte(seguridadAux.toString());
			
				if(sTipoSeleccionar.equals(SeguridadConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					seguridadAux.setsDescripcionGeneralEntityReporte1(seguridadAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SeguridadConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSeguridad(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSeguridad=true;
				this.isVisibilidadCeldaNuevoRelacionesSeguridad=true;
				this.isVisibilidadCeldaGuardarCambiosSeguridad=true;
			}
			
			this.isVisibilidadCeldaModificarSeguridad=false;
			this.isVisibilidadCeldaActualizarSeguridad=false;
			this.isVisibilidadCeldaEliminarSeguridad=false;
			this.isVisibilidadCeldaCancelarSeguridad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguridad=true;
				} else {
					this.isVisibilidadCeldaGuardarSeguridad=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSeguridad=false;
			this.isVisibilidadCeldaNuevoRelacionesSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosSeguridad=false;
			this.isVisibilidadCeldaModificarSeguridad=false;
			this.isVisibilidadCeldaActualizarSeguridad=true;
			this.isVisibilidadCeldaEliminarSeguridad=false;
			this.isVisibilidadCeldaCancelarSeguridad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguridad=true;
				} else {
					this.isVisibilidadCeldaGuardarSeguridad=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSeguridad=false;
			this.isVisibilidadCeldaNuevoRelacionesSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosSeguridad=false;
			this.isVisibilidadCeldaModificarSeguridad=false;
			this.isVisibilidadCeldaActualizarSeguridad=true;
			this.isVisibilidadCeldaEliminarSeguridad=true;
			this.isVisibilidadCeldaCancelarSeguridad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguridad=true;
				} else {
					this.isVisibilidadCeldaGuardarSeguridad=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSeguridad=false;
			this.isVisibilidadCeldaNuevoRelacionesSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosSeguridad=false;
			this.isVisibilidadCeldaModificarSeguridad=false;
			this.isVisibilidadCeldaActualizarSeguridad=true;
			this.isVisibilidadCeldaEliminarSeguridad=false;
			this.isVisibilidadCeldaCancelarSeguridad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguridad=false;
				} else {
					this.isVisibilidadCeldaGuardarSeguridad=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSeguridad=true;
			this.isVisibilidadCeldaNuevoRelacionesSeguridad=true;
			this.isVisibilidadCeldaGuardarCambiosSeguridad=true;
			this.isVisibilidadCeldaModificarSeguridad=false;
			this.isVisibilidadCeldaActualizarSeguridad=false;
			this.isVisibilidadCeldaEliminarSeguridad=false;
			this.isVisibilidadCeldaCancelarSeguridad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguridad=true;
				} else {
					this.isVisibilidadCeldaGuardarSeguridad=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSeguridad=false;
			this.isVisibilidadCeldaNuevoRelacionesSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosSeguridad=false;
			this.isVisibilidadCeldaActualizarSeguridad=false;
			this.isVisibilidadCeldaEliminarSeguridad=false;
			this.isVisibilidadCeldaCancelarSeguridad=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguridad=false;
				} else {
					this.isVisibilidadCeldaGuardarSeguridad=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSeguridad=false;
			this.isVisibilidadCeldaNuevoRelacionesSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosSeguridad=false;
			this.isVisibilidadCeldaModificarSeguridad=true;
			this.isVisibilidadCeldaActualizarSeguridad=false;
			this.isVisibilidadCeldaEliminarSeguridad=false;
			this.isVisibilidadCeldaCancelarSeguridad=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSeguridad=false;
				} else {
					this.isVisibilidadCeldaGuardarSeguridad=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SeguridadJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSeguridad=true;
			this.isVisibilidadCeldaNuevoRelacionesSeguridad=true;
			this.isVisibilidadCeldaGuardarCambiosSeguridad=true;
		} else {
			this.actualizarEstadoPanelsSeguridad(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSeguridad=false;
			//this.isVisibilidadCeldaVerFormSeguridad=false;
			this.isVisibilidadCeldaDuplicarSeguridad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!seguridadSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSeguridad=false;
		} else {
			this.isVisibilidadCeldaNuevoSeguridad=false;
			this.isVisibilidadCeldaGuardarCambiosSeguridad=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(seguridadSessionBean.getEsGuardarRelacionado()) {
			if(!seguridadSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSeguridad=false;												
			}
			
			this.jButtonCerrarSeguridad.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSeguridad=false;
		}
		
		if(!this.permiteMantenimiento(this.seguridad)) {
			this.isVisibilidadCeldaActualizarSeguridad=false;
			this.isVisibilidadCeldaEliminarSeguridad=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSeguridad() {
	}
	
	public void actualizarEstadoPanelsSeguridad(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSeguridad!=null) {
				this.jScrollPanelDatosEdicionSeguridad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSeguridad!=null) {
				this.jScrollPanelDatosSeguridad.setVisible(true);
			}
			
			if(this.jPanelPaginacionSeguridad!=null) {
				this.jPanelPaginacionSeguridad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSeguridad!=null) {
				this.jPanelParametrosReportesSeguridad.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSeguridad!=null) {
				this.jScrollPanelDatosEdicionSeguridad.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosSeguridad!=null) {
				this.jScrollPanelDatosSeguridad.setVisible(false);
			}
			
			if(this.jPanelPaginacionSeguridad!=null) {
				this.jPanelPaginacionSeguridad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSeguridad!=null) {
				this.jPanelParametrosReportesSeguridad.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSeguridad!=null) {
				this.jScrollPanelDatosEdicionSeguridad.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosSeguridad!=null) {
				this.jScrollPanelDatosSeguridad.setVisible(false);
			}
			
			if(this.jPanelPaginacionSeguridad!=null) {
				this.jPanelPaginacionSeguridad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSeguridad!=null) {
				this.jPanelParametrosReportesSeguridad.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSeguridad!=null) {
				this.jScrollPanelDatosEdicionSeguridad.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSeguridad!=null) {
				this.jScrollPanelDatosSeguridad.setVisible(false);
			}
			
			if(this.jPanelPaginacionSeguridad!=null) {
				this.jPanelPaginacionSeguridad.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSeguridad!=null) {
				this.jPanelParametrosReportesSeguridad.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSeguridad!=null) {
				this.jScrollPanelDatosEdicionSeguridad.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSeguridad!=null) {
				this.jScrollPanelDatosSeguridad.setVisible(true);
			}
			
			if(this.jPanelPaginacionSeguridad!=null) {
				this.jPanelPaginacionSeguridad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSeguridad!=null) {
				this.jPanelParametrosReportesSeguridad.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSeguridad!=null) {
				this.jScrollPanelDatosEdicionSeguridad.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosSeguridad!=null) {
				this.jScrollPanelDatosSeguridad.setVisible(true);
			}
			
			if(this.jPanelPaginacionSeguridad!=null) {
				this.jPanelPaginacionSeguridad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSeguridad!=null) {
				this.jPanelParametrosReportesSeguridad.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSeguridad!=null) {
				this.jScrollPanelDatosEdicionSeguridad.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosSeguridad!=null) {
				this.jScrollPanelDatosSeguridad.setVisible(true);
			}
			
			if(this.jPanelPaginacionSeguridad!=null) {
				this.jPanelPaginacionSeguridad.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSeguridad!=null) {
				this.jPanelParametrosReportesSeguridad.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.seguridadSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.seguridadSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SeguridadSessionBean seguridadSessionBean=new SeguridadSessionBean();
		
		if(this.seguridadSessionBean==null) {
			this.seguridadSessionBean=new SeguridadSessionBean();
		}
		
		this.seguridadSessionBean.setsUltimaBusquedaSeguridad(this.getsAccionBusqueda());
		this.seguridadSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.seguridadSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SeguridadSessionBean seguridadSessionBean=new SeguridadSessionBean();
		
		if(this.seguridadSessionBean==null) {
			this.seguridadSessionBean=new SeguridadSessionBean();
		}
		
		if(this.seguridadSessionBean.getsUltimaBusquedaSeguridad()!=null&&!this.seguridadSessionBean.getsUltimaBusquedaSeguridad().equals("")) {
			this.setsAccionBusqueda(seguridadSessionBean.getsUltimaBusquedaSeguridad());
			this.setiNumeroPaginacion(seguridadSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(seguridadSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.seguridadSessionBean.setsUltimaBusquedaSeguridad("");
		this.seguridadSessionBean.setiNumeroPaginacion(SeguridadConstantesFunciones.INUMEROPAGINACION);
		this.seguridadSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSeguridad(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSeguridad() {
		this.updateBorderResaltarBusquedasFormularioSeguridad();
		this.updateVisibilidadBusquedasFormularioSeguridad();
		this.updateHabilitarBusquedasFormularioSeguridad();
	}
	
	public void updateBorderResaltarBusquedasFormularioSeguridad() {					
	}
	
	public void updateVisibilidadBusquedasFormularioSeguridad() {
	}
	
	public void updateHabilitarBusquedasFormularioSeguridad() {
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
	
	public void updateControlesFormularioSeguridad() throws Exception {

		if(this.jInternalFrameDetalleFormSeguridad==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSeguridad();
		this.updateVisibilidadResaltarControlesFormularioSeguridad();
		this.updateHabilitarResaltarControlesFormularioSeguridad();
		
	}
	
	public void updateBorderResaltarControlesFormularioSeguridad() throws Exception {
		if(this.jInternalFrameDetalleFormSeguridad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.seguridadConstantesFunciones.resaltaridSeguridad!=null && this.jInternalFrameDetalleFormSeguridad!=null) {this.jInternalFrameDetalleFormSeguridad.jLabelidSeguridad.setBorder(this.seguridadConstantesFunciones.resaltaridSeguridad);}
		if(this.seguridadConstantesFunciones.resaltarcodigoSeguridad!=null && this.jInternalFrameDetalleFormSeguridad!=null) {this.jInternalFrameDetalleFormSeguridad.jTextFieldcodigoSeguridad.setBorder(this.seguridadConstantesFunciones.resaltarcodigoSeguridad);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSeguridad() throws Exception {		
		if(this.jInternalFrameDetalleFormSeguridad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) {
	
		//this.jInternalFrameDetalleFormSeguridad.jLabelidSeguridad.setVisible(this.seguridadConstantesFunciones.mostraridSeguridad);
		this.jInternalFrameDetalleFormSeguridad.jPanelidSeguridad.setVisible(this.seguridadConstantesFunciones.mostraridSeguridad);
		//this.jInternalFrameDetalleFormSeguridad.jTextFieldcodigoSeguridad.setVisible(this.seguridadConstantesFunciones.mostrarcodigoSeguridad);
		this.jInternalFrameDetalleFormSeguridad.jPanelcodigoSeguridad.setVisible(this.seguridadConstantesFunciones.mostrarcodigoSeguridad);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSeguridad() throws Exception {
		if(this.jInternalFrameDetalleFormSeguridad==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSeguridad!=null) {
	
		this.jInternalFrameDetalleFormSeguridad.jLabelidSeguridad.setEnabled(this.seguridadConstantesFunciones.activaridSeguridad);
		this.jInternalFrameDetalleFormSeguridad.jTextFieldcodigoSeguridad.setEnabled(this.seguridadConstantesFunciones.activarcodigoSeguridad);
		}
	}
	
		
}