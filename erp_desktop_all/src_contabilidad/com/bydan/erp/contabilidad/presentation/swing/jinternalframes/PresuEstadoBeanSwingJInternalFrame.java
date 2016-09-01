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

import com.bydan.erp.contabilidad.util.PresuEstadoConstantesFunciones;
import com.bydan.erp.contabilidad.util.PresuEstadoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.PresuEstadoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.PresuEstadoBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PresuEstadoBeanSwingJInternalFrame extends PresuEstadoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PresuEstadoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PresuEstado> presuestadoValidator = new ClassValidator<PresuEstado>(PresuEstado.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PresuEstado presuestado;	
	public PresuEstado presuestadoAux;
	public PresuEstado presuestadoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PresuEstado presuestadoTotales;
	public Long idPresuEstadoActual;
	public Long iIdNuevoPresuEstado=0L;
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
	
	public Boolean isPermisoTodoPresuEstado;
	public Boolean isPermisoNuevoPresuEstado;
	public Boolean isPermisoActualizarPresuEstado;
	public Boolean isPermisoActualizarOriginalPresuEstado;
	public Boolean isPermisoEliminarPresuEstado;
	public Boolean isPermisoGuardarCambiosPresuEstado;
	public Boolean isPermisoConsultaPresuEstado;
	public Boolean isPermisoBusquedaPresuEstado;
	public Boolean isPermisoReportePresuEstado;
	public Boolean isPermisoPaginacionMedioPresuEstado;
	public Boolean isPermisoPaginacionAltoPresuEstado;
	public Boolean isPermisoPaginacionTodoPresuEstado;
	public Boolean isPermisoCopiarPresuEstado;
	public Boolean isPermisoVerFormPresuEstado;
	public Boolean isPermisoDuplicarPresuEstado;
	public Boolean isPermisoOrdenPresuEstado;
	
	
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
	
	public PresuEstadoParameterReturnGeneral presuestadoReturnGeneral;
	public PresuEstadoParameterReturnGeneral presuestadoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPresuEstado=false;
	public Boolean esParaAccionDesdeFormularioPresuEstado=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public PresuEstadoLogic presuestadoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PresuEstado presuestadoBean;
	public PresuEstadoConstantesFunciones presuestadoConstantesFunciones;
	//public PresuEstadoParameterReturnGeneral presuestadoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<PresuEstado> presuestados;	
	//public List<PresuEstado> presuestadosEliminados;
	//public List<PresuEstado> presuestadosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPresuEstado=false;
	public Boolean isVisibilidadCeldaDuplicarPresuEstado=true;
	public Boolean isVisibilidadCeldaCopiarPresuEstado=true;
	public Boolean isVisibilidadCeldaVerFormPresuEstado=true;
	public Boolean isVisibilidadCeldaOrdenPresuEstado=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPresuEstado=false;
	public Boolean isVisibilidadCeldaModificarPresuEstado=false;
	public Boolean isVisibilidadCeldaActualizarPresuEstado=false;
	public Boolean isVisibilidadCeldaEliminarPresuEstado=false;
	public Boolean isVisibilidadCeldaCancelarPresuEstado=false;
	public Boolean isVisibilidadCeldaGuardarPresuEstado=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPresuEstado=false;	
	
	
	
	public Long getiIdNuevoPresuEstado() {
		return this.iIdNuevoPresuEstado;
	}

	public void setiIdNuevoPresuEstado(Long iIdNuevoPresuEstado) {
		this.iIdNuevoPresuEstado = iIdNuevoPresuEstado;
	}
	
	public Long getidPresuEstadoActual() {
		return this.idPresuEstadoActual;
	}

	public void setidPresuEstadoActual(Long idPresuEstadoActual) {
		this.idPresuEstadoActual = idPresuEstadoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PresuEstado getpresuestado() {
		return this.presuestado;
	}

	public void setpresuestado(PresuEstado presuestado) {
		this.presuestado = presuestado;
	}
	
	public PresuEstado getpresuestadoAux() {
		return this.presuestadoAux;
	}

	public void setpresuestadoAux(PresuEstado presuestadoAux) {
		this.presuestadoAux = presuestadoAux;
	}				
	
	public PresuEstado getpresuestadoAnterior() {
		return this.presuestadoAnterior;
	}

	public void setpresuestadoAnterior(PresuEstado presuestadoAnterior) {
		this.presuestadoAnterior = presuestadoAnterior;
	}	
	
	public PresuEstado getpresuestadoTotales() {
		return this.presuestadoTotales;
	}

	public void setpresuestadoTotales(PresuEstado presuestadoTotales) {
		this.presuestadoTotales = presuestadoTotales;
	}	
	
	public PresuEstado getpresuestadoBean() {
		return this.presuestadoBean;
	}

	public void setpresuestadoBean(PresuEstado presuestadoBean) {
		this.presuestadoBean = presuestadoBean;
	}	
	
	public PresuEstadoParameterReturnGeneral getpresuestadoReturnGeneral() {
		return this.presuestadoReturnGeneral;
	}

	public void setpresuestadoReturnGeneral(PresuEstadoParameterReturnGeneral presuestadoReturnGeneral) {
		this.presuestadoReturnGeneral = presuestadoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PresuEstadoLogic getPresuEstadoLogic()	{		
		return presuestadoLogic;
	}

	public void setPresuEstadoLogic(PresuEstadoLogic presuestadoLogic) {
		this.presuestadoLogic = presuestadoLogic;
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
	
	public Boolean getIsEsNuevoPresuEstado() {
		return isEsNuevoPresuEstado;
	}

	public void setIsEsNuevoPresuEstado(Boolean isEsNuevoPresuEstado) {
		this.isEsNuevoPresuEstado = isEsNuevoPresuEstado;
	}

	public Boolean getEsParaAccionDesdeFormularioPresuEstado() {
		return esParaAccionDesdeFormularioPresuEstado;
	}
	
	public void setEsParaAccionDesdeFormularioPresuEstado(Boolean esParaAccionDesdeFormularioPresuEstado) {
		this.esParaAccionDesdeFormularioPresuEstado = esParaAccionDesdeFormularioPresuEstado;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesPresuEstado() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PresuEstadoConstantesFunciones.refrescarForeignKeysDescripcionesPresuEstado(this.presuestadoLogic.getPresuEstados());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PresuEstadoConstantesFunciones.refrescarForeignKeysDescripcionesPresuEstado(this.presuestados);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//presuestadoLogic.setPresuEstados(this.presuestados);
			presuestadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PresuEstadoParameterReturnGeneral getPresuEstadoParameterGeneral() {
		return this.presuestadoParameterGeneral;
	}
	
	public void setPresuEstadoParameterGeneral(PresuEstadoParameterReturnGeneral presuestadoParameterGeneral) {
		this.presuestadoParameterGeneral = presuestadoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPresuEstado() {
		return isPermisoTodoPresuEstado;
	}

	public void setIsPermisoTodoPresuEstado(Boolean isPermisoTodoPresuEstado) {
		this.isPermisoTodoPresuEstado = isPermisoTodoPresuEstado;
	}

	public Boolean getIsPermisoNuevoPresuEstado() {
		return isPermisoNuevoPresuEstado;
	}

	public void setIsPermisoNuevoPresuEstado(Boolean isPermisoNuevoPresuEstado) {
		this.isPermisoNuevoPresuEstado = isPermisoNuevoPresuEstado;
	}

	public Boolean getIsPermisoActualizarPresuEstado() {
		return isPermisoActualizarPresuEstado;
	}

	public void setIsPermisoActualizarPresuEstado(Boolean isPermisoActualizarPresuEstado) {
		this.isPermisoActualizarPresuEstado = isPermisoActualizarPresuEstado;
	}

	public Boolean getIsPermisoEliminarPresuEstado() {
		return isPermisoEliminarPresuEstado;
	}

	public void setIsPermisoEliminarPresuEstado(Boolean isPermisoEliminarPresuEstado) {
		this.isPermisoEliminarPresuEstado = isPermisoEliminarPresuEstado;
	}

	public Boolean getIsPermisoGuardarCambiosPresuEstado() {
		return isPermisoGuardarCambiosPresuEstado;
	}

	public void setIsPermisoGuardarCambiosPresuEstado(Boolean isPermisoGuardarCambiosPresuEstado) {
		this.isPermisoGuardarCambiosPresuEstado = isPermisoGuardarCambiosPresuEstado;
	}
	
	public Boolean getIsPermisoConsultaPresuEstado() {
		return isPermisoConsultaPresuEstado;
	}

	public void setIsPermisoConsultaPresuEstado(Boolean isPermisoConsultaPresuEstado) {
		this.isPermisoConsultaPresuEstado = isPermisoConsultaPresuEstado;
	}

	public Boolean getIsPermisoBusquedaPresuEstado() {
		return isPermisoBusquedaPresuEstado;
	}

	public void setIsPermisoBusquedaPresuEstado(Boolean isPermisoBusquedaPresuEstado) {
		this.isPermisoBusquedaPresuEstado = isPermisoBusquedaPresuEstado;
	}

	public Boolean getIsPermisoReportePresuEstado() {
		return isPermisoReportePresuEstado;
	}

	public void setIsPermisoReportePresuEstado(Boolean isPermisoReportePresuEstado) {
		this.isPermisoReportePresuEstado = isPermisoReportePresuEstado;
	}
	
	public Boolean getIsPermisoPaginacionMedioPresuEstado() {
		return isPermisoPaginacionMedioPresuEstado;
	}

	public void setIsPermisoPaginacionMedioPresuEstado(Boolean isPermisoPaginacionMedioPresuEstado) {
		this.isPermisoPaginacionMedioPresuEstado = isPermisoPaginacionMedioPresuEstado;
	}
	
	public Boolean getIsPermisoPaginacionTodoPresuEstado() {
		return isPermisoPaginacionTodoPresuEstado;
	}

	public void setIsPermisoPaginacionTodoPresuEstado(Boolean isPermisoPaginacionTodoPresuEstado) {
		this.isPermisoPaginacionTodoPresuEstado = isPermisoPaginacionTodoPresuEstado;
	}
	
	public Boolean getIsPermisoPaginacionAltoPresuEstado() {
		return isPermisoPaginacionAltoPresuEstado;
	}

	public void setIsPermisoPaginacionAltoPresuEstado(Boolean isPermisoPaginacionAltoPresuEstado) {
		this.isPermisoPaginacionAltoPresuEstado = isPermisoPaginacionAltoPresuEstado;
	}
	
	public Boolean getIsPermisoCopiarPresuEstado() {
		return isPermisoCopiarPresuEstado;
	}

	public void setIsPermisoCopiarPresuEstado(Boolean isPermisoCopiarPresuEstado) {
		this.isPermisoCopiarPresuEstado = isPermisoCopiarPresuEstado;
	}
	
	public Boolean getIsPermisoVerFormPresuEstado() {
		return isPermisoVerFormPresuEstado;
	}

	public void setIsPermisoVerFormPresuEstado(Boolean isPermisoVerFormPresuEstado) {
		this.isPermisoVerFormPresuEstado = isPermisoVerFormPresuEstado;
	}
	
	public Boolean getIsPermisoDuplicarPresuEstado() {
		return isPermisoDuplicarPresuEstado;
	}

	public void setIsPermisoDuplicarPresuEstado(Boolean isPermisoDuplicarPresuEstado) {
		this.isPermisoDuplicarPresuEstado = isPermisoDuplicarPresuEstado;
	}
	
	public Boolean getIsPermisoOrdenPresuEstado() {
		return isPermisoOrdenPresuEstado;
	}

	public void setIsPermisoOrdenPresuEstado(Boolean isPermisoOrdenPresuEstado) {
		this.isPermisoOrdenPresuEstado = isPermisoOrdenPresuEstado;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPresuEstado() {
		return isVisibilidadCeldaNuevoPresuEstado;
	}

	public void setIsVisibilidadCeldaNuevoPresuEstado(Boolean isVisibilidadCeldaNuevoPresuEstado) {
		this.isVisibilidadCeldaNuevoPresuEstado = isVisibilidadCeldaNuevoPresuEstado;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPresuEstado() {
		return isVisibilidadCeldaDuplicarPresuEstado;
	}

	public void setIsVisibilidadCeldaDuplicarPresuEstado(Boolean isVisibilidadCeldaDuplicarPresuEstado) {
		this.isVisibilidadCeldaDuplicarPresuEstado = isVisibilidadCeldaDuplicarPresuEstado;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPresuEstado() {
		return isVisibilidadCeldaCopiarPresuEstado;
	}

	public void setIsVisibilidadCeldaCopiarPresuEstado(Boolean isVisibilidadCeldaCopiarPresuEstado) {
		this.isVisibilidadCeldaCopiarPresuEstado = isVisibilidadCeldaCopiarPresuEstado;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPresuEstado() {
		return isVisibilidadCeldaVerFormPresuEstado;
	}

	public void setIsVisibilidadCeldaVerFormPresuEstado(Boolean isVisibilidadCeldaVerFormPresuEstado) {
		this.isVisibilidadCeldaVerFormPresuEstado = isVisibilidadCeldaVerFormPresuEstado;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPresuEstado() {
		return isVisibilidadCeldaOrdenPresuEstado;
	}

	public void setIsVisibilidadCeldaOrdenPresuEstado(Boolean isVisibilidadCeldaOrdenPresuEstado) {
		this.isVisibilidadCeldaOrdenPresuEstado = isVisibilidadCeldaOrdenPresuEstado;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPresuEstado() {
		return isVisibilidadCeldaNuevoRelacionesPresuEstado;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPresuEstado(Boolean isVisibilidadCeldaNuevoRelacionesPresuEstado) {
		this.isVisibilidadCeldaNuevoRelacionesPresuEstado = isVisibilidadCeldaNuevoRelacionesPresuEstado;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPresuEstado() {
		return isVisibilidadCeldaModificarPresuEstado;
	}

	public void setIsVisibilidadCeldaModificarPresuEstado(Boolean isVisibilidadCeldaModificarPresuEstado) {
		this.isVisibilidadCeldaModificarPresuEstado = isVisibilidadCeldaModificarPresuEstado;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPresuEstado() {
		return isVisibilidadCeldaActualizarPresuEstado;
	}

	public void setIsVisibilidadCeldaActualizarPresuEstado(Boolean isVisibilidadCeldaActualizarPresuEstado) {
		this.isVisibilidadCeldaActualizarPresuEstado = isVisibilidadCeldaActualizarPresuEstado;
	}

	public Boolean getIsVisibilidadCeldaEliminarPresuEstado() {
		return isVisibilidadCeldaEliminarPresuEstado;
	}

	public void setIsVisibilidadCeldaEliminarPresuEstado(Boolean isVisibilidadCeldaEliminarPresuEstado) {
		this.isVisibilidadCeldaEliminarPresuEstado = isVisibilidadCeldaEliminarPresuEstado;
	}

	public Boolean getIsVisibilidadCeldaCancelarPresuEstado() {
		return isVisibilidadCeldaCancelarPresuEstado;
	}

	public void setIsVisibilidadCeldaCancelarPresuEstado(Boolean isVisibilidadCeldaCancelarPresuEstado) {
		this.isVisibilidadCeldaCancelarPresuEstado = isVisibilidadCeldaCancelarPresuEstado;
	}

	public Boolean getIsVisibilidadCeldaGuardarPresuEstado() {
		return isVisibilidadCeldaGuardarPresuEstado;
	}

	public void setIsVisibilidadCeldaGuardarPresuEstado(Boolean isVisibilidadCeldaGuardarPresuEstado) {
		this.isVisibilidadCeldaGuardarPresuEstado = isVisibilidadCeldaGuardarPresuEstado;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPresuEstado() {
		return isVisibilidadCeldaGuardarCambiosPresuEstado;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPresuEstado(Boolean isVisibilidadCeldaGuardarCambiosPresuEstado) {
		this.isVisibilidadCeldaGuardarCambiosPresuEstado = isVisibilidadCeldaGuardarCambiosPresuEstado;
	}
		
	public PresuEstadoSessionBean getpresuestadoSessionBean() {
		return this.presuestadoSessionBean;
	}
	
	public void setpresuestadoSessionBean(PresuEstadoSessionBean presuestadoSessionBean) {
		this.presuestadoSessionBean=presuestadoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPresuEstado(PresuEstado presuestado)throws Exception {
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
	
	public void bugActualizarReferenciaActual(PresuEstado presuestado,PresuEstado presuestadoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPresuEstado(presuestado);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		presuestadoAux.setId(presuestado.getId());
		presuestadoAux.setVersionRow(presuestado.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPresuEstado();
		
			int intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestado =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.presuestado =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PresuEstadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPresuEstado(this.presuestado,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPresuEstado(this.presuestado);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = presuestadoValidator.getInvalidValues(this.presuestado);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			presuestadoLogic.setDatosCliente(datosCliente);
			presuestadoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				presuestadoAux=new  PresuEstado();
				
				presuestadoAux.setIsNew(true);
				presuestadoAux.setIsChanged(true);
				
				presuestadoAux.setPresuEstadoOriginal(this.presuestado);
				
				presuestadoAux.setId(this.presuestado.getId());	
				presuestadoAux.setVersionRow(this.presuestado.getVersionRow());	
				presuestadoAux.setnombre(this.presuestado.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presuestadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presuestadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(presuestadoAux,presuestadoLogic.getPresuEstados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuestadoAux,presuestados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.presuestadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presuestadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuestadoLogic.savePresuEstados();//WithConnection
						//presuestadoLogic.getSetVersionRowPresuEstados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presuestado,presuestadoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				presuestadoAux=new  PresuEstado();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.presuestadoSessionBean.getEsGuardarRelacionado() 
					|| (this.presuestadoSessionBean.getEsGuardarRelacionado() && this.presuestado.getId()>=0)) {
						
					presuestadoAux.setIsNew(false);
				}
				
				presuestadoAux.setIsDeleted(false);
			
				presuestadoAux.setId(this.presuestado.getId());	
				presuestadoAux.setVersionRow(this.presuestado.getVersionRow());	
				presuestadoAux.setnombre(this.presuestado.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presuestadoAux,presuestadoLogic.getPresuEstados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuestadoAux,presuestados);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.presuestadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presuestadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuestadoLogic.savePresuEstados();//WithConnection
						//presuestadoLogic.getSetVersionRowPresuEstados();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.presuestado,presuestadoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				presuestadoAux=new  PresuEstado();
				
				presuestadoAux.setIsNew(false);
				presuestadoAux.setIsChanged(false);
				
				presuestadoAux.setIsDeleted(true);
				
				presuestadoAux.setId(this.presuestado.getId());	
				presuestadoAux.setVersionRow(this.presuestado.getVersionRow());	
				presuestadoAux.setnombre(this.presuestado.getnombre());	
				
				if(this.presuestadoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.presuestadoAux.getId()>=0) {	
						this.presuestadosEliminados.add(presuestadoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(presuestadoAux,presuestadoLogic.getPresuEstados());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuestadoAux,presuestados);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.presuestadoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.presuestadoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuestadoLogic.savePresuEstados();//WithConnection
						//presuestadoLogic.getSetVersionRowPresuEstados();//WithConnection
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
					this.presuestadoLogic.getPresuEstados().addAll(this.presuestadosEliminados);
					
					presuestadoLogic.savePresuEstados();//WithConnection
					//presuestadoLogic.getSetVersionRowPresuEstados();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.presuestadosEliminados= new ArrayList<PresuEstado>();		
			}
			
			if(this.presuestadoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.presuestado=presuestadoAux;
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
      		//this.finishProcessPresuEstado();
      	}
		
	}	
	
	public void actualizarRelaciones(PresuEstado presuestadoLocal) throws Exception {
		
		if(this.presuestadoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PresuEstado presuestadoLocal) throws Exception {	
		if(this.presuestadoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarPresuEstadoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presuestado =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.presuestado =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = presuestadoValidator.getInvalidValues(this.presuestado);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PresuEstado presuestado,List<PresuEstado> presuestados) throws Exception {
		try	{		
			PresuEstadoConstantesFunciones.actualizarLista(presuestado,presuestados,this.presuestadoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PresuEstado presuestado,List<PresuEstado> presuestados) throws Exception {
		try	{			
			PresuEstadoConstantesFunciones.actualizarSelectedLista(presuestado,presuestados);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PresuEstado> presuestadosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				presuestadosLocal=this.presuestadoLogic.getPresuEstados();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				presuestadosLocal=this.presuestados;
			}
			//ARCHITECTURE
		
			for(PresuEstado presuestadoLocal:presuestadosLocal) {
				if(this.permiteMantenimiento(presuestadoLocal) && presuestadoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PresuEstadoConstantesFunciones.getPresuEstadoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PresuEstadoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuEstado.jLabelnombrePresuEstado,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPresuEstado.jLabelnombrePresuEstado,"");
		
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
		this.iIdNuevoPresuEstado--;	
		
		
		this.presuestadoAux=new PresuEstado();
		
		this.presuestadoAux.setId(this.iIdNuevoPresuEstado);
		this.presuestadoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.presuestadoLogic.getPresuEstados().add(this.presuestadoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.presuestados.add(this.presuestadoAux);
		}
		//ARCHITECTURE
		
		this.presuestado=this.presuestadoAux;
		
		if(PresuEstadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPresuEstado(this.presuestado);
			this.setVariablesObjetoActualToFormularioForeignKeyPresuEstado(this.presuestado);
		}
				
		//this.setDefaultControlesPresuEstado();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPresuEstado();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPresuEstado();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuEstado();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuEstado(this.presuestadoBean,this.presuestado,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPresuEstado(this.presuestado);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PresuEstadoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.presuestadoSessionBean.getConGuardarRelaciones()) {
			classes=PresuEstadoConstantesFunciones.getClassesRelationshipsOfPresuEstado(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.presuestadoReturnGeneral=presuestadoLogic.procesarEventosPresuEstadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presuestadoLogic.getPresuEstados(),this.presuestado,this.presuestadoParameterGeneral,this.isEsNuevoPresuEstado,classes);//this.presuestadoLogic.getPresuEstado()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPresuEstado(this.presuestadoReturnGeneral,this.presuestadoBean,false);
		
		if(this.presuestadoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPresuEstado(this.presuestadoReturnGeneral.getPresuEstado());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPresuEstado(this.presuestadoReturnGeneral.getPresuEstado());
		}
		
		if(this.presuestadoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPresuEstado(this.presuestadoReturnGeneral.getPresuEstado(),classes);//this.presuestadoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPresuEstado(this.presuestado,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPresuEstado();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPresuEstado();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPresuEstado(false);
						
			if(presuestadoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(PresuEstadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuEstado();
			}
			
			this.actualizarVisualTableDatosPresuEstado();
			
			this.jTableDatosPresuEstado.setRowSelectionInterval(this.getIndiceNuevoPresuEstado(), this.getIndiceNuevoPresuEstado());
			
			this.seleccionarFilaTablaPresuEstadoActual();
						
			this.actualizarEstadoCeldasBotonesPresuEstado("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPresuEstado(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPresuEstado.jTextAreanombrePresuEstado.setEnabled(isHabilitar && this.presuestadoConstantesFunciones.activarnombrePresuEstado);	
		
	};
	
	public void setDefaultControlesPresuEstado() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPresuEstado(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.presuestadoSessionBean.setConGuardarRelaciones(true);			
			this.presuestadoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPresuEstado.jTabbedPaneRelacionesPresuEstado.setVisible(true);
			
					
		} else {
			//this.presuestadoSessionBean.setConGuardarRelaciones(false);			
			this.presuestadoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPresuEstado.jTabbedPaneRelacionesPresuEstado.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoPresuEstado() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuEstado presuestadoAux:this.presuestadoLogic.getPresuEstados()) {
				if(presuestadoAux.getId().equals(this.iIdNuevoPresuEstado)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuEstado presuestadoAux:this.presuestados) {
				if(presuestadoAux.getId().equals(this.iIdNuevoPresuEstado)) {
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
	
	public int getIndiceActualPresuEstado(PresuEstado presuestado,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuEstado presuestadoAux:this.presuestadoLogic.getPresuEstados()) {
				if(presuestadoAux.getId().equals(presuestado.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuEstado presuestadoAux:this.presuestados) {
				if(presuestadoAux.getId().equals(presuestado.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPresuEstado(PresuEstado presuestadoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuEstado presuestadoAux:this.presuestadoLogic.getPresuEstados()) {
				if(presuestadoAux.getPresuEstadoOriginal().getId().equals(presuestadoOriginal.getId())) {
					existe=true;
					presuestadoOriginal.setId(presuestadoAux.getId());
					presuestadoOriginal.setVersionRow(presuestadoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuEstado presuestadoAux:this.presuestados) {
				if(presuestadoAux.getPresuEstadoOriginal().getId().equals(presuestadoOriginal.getId())) {
					existe=true;
					presuestadoOriginal.setId(presuestadoAux.getId());
					presuestadoOriginal.setVersionRow(presuestadoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPresuEstado(Boolean esParaCancelar) throws Exception {
		presuestadosAux=new ArrayList<PresuEstado>();
		presuestadoAux=new PresuEstado();
		
		if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuEstado presuestadoAux:this.presuestadoLogic.getPresuEstados()) {
					if(presuestadoAux.getId()<0) {
						presuestadosAux.add(presuestadoAux);
					}		
				}
				this.iIdNuevoPresuEstado=0L;
				this.presuestadoLogic.getPresuEstados().removeAll(presuestadosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuEstado presuestadoAux:this.presuestados) {
					if(presuestadoAux.getId()<0) {
						presuestadosAux.add(presuestadoAux);
					}		
				}
				this.iIdNuevoPresuEstado=0L;
				this.presuestados.removeAll(presuestadosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPresuEstado 
					&& this.presuestadoLogic.getPresuEstados().size()>0
					) {
					presuestadoAux=this.presuestadoLogic.getPresuEstados().get(this.presuestadoLogic.getPresuEstados().size() - 1);
				
					if(presuestadoAux.getId()<0) {
						this.presuestadoLogic.getPresuEstados().remove(presuestadoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPresuEstado && this.presuestados.size()>0) {
					presuestadoAux=this.presuestados.get(this.presuestados.size() - 1);
				
					if(presuestadoAux.getId()<0) {
						this.presuestados.remove(presuestadoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPresuEstado(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(presuestado.getId()<0) {
				this.presuestadoLogic.getPresuEstados().remove(this.presuestado);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(presuestado.getId()<0) {
				this.presuestados.remove(this.presuestado);
			}
		}			
	}
	
	public void setEstadosInicialesPresuEstado(List<PresuEstado> presuestadosAux) throws Exception {
		PresuEstadoConstantesFunciones.setEstadosInicialesPresuEstado(presuestadosAux);
	}
	
	public void setEstadosInicialesPresuEstado(PresuEstado presuestadoAux) throws Exception {
		PresuEstadoConstantesFunciones.setEstadosInicialesPresuEstado(presuestadoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPresuEstadoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPresuEstado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPresuEstadoActual()) {
				if(!this.isEsNuevoPresuEstado) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPresuEstado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPresuEstado=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPresuEstadoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado ?", "MANTENIMIENTO DE Estado", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPresuEstado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PresuEstado presuestado) throws Exception {
		PresuEstadoConstantesFunciones.seleccionarAsignar(this.presuestado,presuestado);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPresuEstado=this.isPermisoActualizarOriginalPresuEstado;
			
			
			this.seleccionarAsignar(presuestado);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PresuEstadoConstantesFunciones.quitarEspaciosPresuEstado(this.presuestado,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPresuEstado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.presuestadoSessionBean.setsFuncionBusquedaRapida(this.presuestadoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoPresuEstado) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPresuEstado(esParaCancelar);				
				this.cancelarNuevoPresuEstado(esParaCancelar);								
			}
			
			this.presuestado=new PresuEstado();
			
			this.inicializarPresuEstado();
			
			this.actualizarEstadoCeldasBotonesPresuEstado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPresuEstado() throws Exception {
		try {
			PresuEstadoConstantesFunciones.inicializarPresuEstado(this.presuestado);
			
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
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.presuestadoLogic.getPresuEstados().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePresuEstados(String sAccionBusqueda,List<PresuEstado> presuestadosParaReportes) throws Exception {
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
					sPathReporteFinal="PresuEstado"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PresuEstadoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PresuEstadoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PresuEstado"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estados");		
		parameters.put("busquedapor", PresuEstadoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePresuEstado=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PresuEstadoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PresuEstadoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePresuEstado=new JRBeanArrayDataSource(PresuEstadoJInternalFrame.TraerPresuEstadoBeans(presuestadosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePresuEstado);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PresuEstadoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PresuEstadoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PresuEstadoBean.TraerPresuEstadoBeans(presuestadosParaReportes).toArray()));
							
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
				this.generarExcelReportePresuEstados(sAccionBusqueda,sTipoArchivoReporte,presuestadosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPresuEstados(sAccionBusqueda,sTipoArchivoReporte,presuestadosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPresuEstadoActionPerformed(null);
					//this.generarExcelReportePresuEstados(sAccionBusqueda,sTipoArchivoReporte,presuestadosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPresuEstados(sAccionBusqueda,sTipoArchivoReporte,presuestadosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPresuEstados(sAccionBusqueda,sTipoArchivoReporte,presuestadosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPresuEstados(sAccionBusqueda,sTipoArchivoReporte,presuestadosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePresuEstados(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuEstado> presuestadosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuestado";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuEstados");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuEstado("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PresuEstado presuestado : presuestadosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PresuEstadoConstantesFunciones.generarExcelReporteDataPresuEstado("NORMAL",row,workbook,presuestado,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPresuEstado(String sTipo,Row row,Workbook workbook) {
		
		PresuEstadoConstantesFunciones.generarExcelReporteHeaderPresuEstado(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPresuEstados(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuEstado> presuestadosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuestado_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuEstados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PresuEstado presuestado : presuestadosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PresuEstadoConstantesFunciones.getPresuEstadoDescripcion(presuestado));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PresuEstadoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PresuEstadoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(presuestado.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPresuEstados(String sAccionBusqueda,String sTipoArchivoReporte,List<PresuEstado> presuestadosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PresuEstado> presuestadosRespaldo=null;
		
		classes=PresuEstadoConstantesFunciones.getClassesRelationshipsOfPresuEstado(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.presuestadoLogic.setDatosCliente(this.datosCliente);
		this.presuestadoLogic.setDatosDeep(this.datosDeep);
		this.presuestadoLogic.setIsConDeep(true);
		
		presuestadosRespaldo=this.presuestadoLogic.getPresuEstados();
		
		this.presuestadoLogic.setPresuEstados(presuestadosParaReportes);	
		this.presuestadoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		presuestadosParaReportes=this.presuestadoLogic.getPresuEstados();
		this.presuestadoLogic.setPresuEstados(presuestadosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuestado_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PresuEstados");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPresuEstado("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PresuEstado presuestado : presuestadosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPresuEstado("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PresuEstadoConstantesFunciones.generarExcelReporteDataPresuEstado("NORMAL",row,workbook,presuestado,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(PresuEstadoConstantesFunciones.getPresuEstadoDescripcion(presuestado));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuEstado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuEstado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPresuEstado.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuEstado.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPresuEstado() throws Exception {		
		this.startProcessPresuEstado(true);
	}
	
	public void startProcessPresuEstado(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesPresuEstado, this.jScrollPanelDatosPresuEstado,this.jPanelPaginacionPresuEstado, this.jScrollPanelDatosEdicionPresuEstado, this.jPanelAccionesPresuEstado,this.jPanelAccionesFormularioPresuEstado,this.jmenuBarPresuEstado,this.jmenuBarDetallePresuEstado,this.jTtoolBarPresuEstado,this.jTtoolBarDetallePresuEstado);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuEstado=null; 
		
		final JPanel jPanelParametrosReportesPresuEstado=this.jPanelParametrosReportesPresuEstado;
		//final JScrollPane jScrollPanelDatosPresuEstado=this.jScrollPanelDatosPresuEstado;
		final JTable jTableDatosPresuEstado=this.jTableDatosPresuEstado;		
		final JPanel jPanelPaginacionPresuEstado=this.jPanelPaginacionPresuEstado;
		//final JScrollPane jScrollPanelDatosEdicionPresuEstado=this.jScrollPanelDatosEdicionPresuEstado;
		final JPanel jPanelAccionesPresuEstado=this.jPanelAccionesPresuEstado;
		
		JPanel jPanelCamposAuxiliarPresuEstado=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPresuEstado=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) {
			jPanelCamposAuxiliarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jPanelCamposPresuEstado;
			jPanelAccionesFormularioAuxiliarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jPanelAccionesFormularioPresuEstado;
		}
		
		final JPanel jPanelCamposPresuEstado=jPanelCamposAuxiliarPresuEstado;
		final JPanel jPanelAccionesFormularioPresuEstado=jPanelAccionesFormularioAuxiliarPresuEstado;
		
		
		final JMenuBar jmenuBarPresuEstado=this.jmenuBarPresuEstado;
		final JToolBar jTtoolBarPresuEstado=this.jTtoolBarPresuEstado;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPresuEstado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuEstado=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) {
			jmenuBarDetalleAuxiliarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jmenuBarDetallePresuEstado;
			jTtoolBarDetalleAuxiliarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jTtoolBarDetallePresuEstado;
		}
		
		final JMenuBar jmenuBarDetallePresuEstado=jmenuBarDetalleAuxiliarPresuEstado;
		final JToolBar jTtoolBarDetallePresuEstado=jTtoolBarDetalleAuxiliarPresuEstado;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuEstado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuEstado;
			processRunnable.jTableDatos=jTableDatosPresuEstado;
			processRunnable.jPanelCampos=jPanelCamposPresuEstado;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuEstado;
			processRunnable.jPanelAcciones=jPanelAccionesPresuEstado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuEstado;
			
			
			processRunnable.jmenuBar=jmenuBarPresuEstado;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuEstado;
			processRunnable.jTtoolBar=jTtoolBarPresuEstado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuEstado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPresuEstado ,jPanelParametrosReportesPresuEstado,jTableDatosPresuEstado, /*jScrollPanelDatosPresuEstado,*/jPanelCamposPresuEstado,jPanelPaginacionPresuEstado, /*jScrollPanelDatosEdicionPresuEstado,*/ jPanelAccionesPresuEstado,jPanelAccionesFormularioPresuEstado,jmenuBarPresuEstado,jmenuBarDetallePresuEstado,jTtoolBarPresuEstado,jTtoolBarDetallePresuEstado);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesPresuEstado, jScrollPanelDatosPresuEstado,jPanelPaginacionPresuEstado, jScrollPanelDatosEdicionPresuEstado, jPanelAccionesPresuEstado,jPanelAccionesFormularioPresuEstado,jmenuBarPresuEstado,jmenuBarDetallePresuEstado,jTtoolBarPresuEstado,jTtoolBarDetallePresuEstado);
						
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
	
	public void finishProcessPresuEstado() {// throws Exception 
		this.finishProcessPresuEstado(true);
	}
	
	public void finishProcessPresuEstado(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesPresuEstado, this.jScrollPanelDatosPresuEstado,this.jPanelPaginacionPresuEstado, this.jScrollPanelDatosEdicionPresuEstado, this.jPanelAccionesPresuEstado,this.jPanelAccionesFormularioPresuEstado,this.jmenuBarPresuEstado,this.jmenuBarDetallePresuEstado,this.jTtoolBarPresuEstado,this.jTtoolBarDetallePresuEstado);		
		
		final JTabbedPane jTabbedPaneBusquedasPresuEstado=null; 
		
		final JPanel jPanelParametrosReportesPresuEstado=this.jPanelParametrosReportesPresuEstado;
		//final JScrollPane jScrollPanelDatosPresuEstado=this.jScrollPanelDatosPresuEstado;
		final JTable jTableDatosPresuEstado=this.jTableDatosPresuEstado;		
		final JPanel jPanelPaginacionPresuEstado=this.jPanelPaginacionPresuEstado;
		//final JScrollPane jScrollPanelDatosEdicionPresuEstado=this.jScrollPanelDatosEdicionPresuEstado;
		final JPanel jPanelAccionesPresuEstado=this.jPanelAccionesPresuEstado;
		
		JPanel jPanelCamposAuxiliarPresuEstado=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPresuEstado=new JPanel();
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) {
			jPanelCamposAuxiliarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jPanelCamposPresuEstado;
			jPanelAccionesFormularioAuxiliarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jPanelAccionesFormularioPresuEstado;
		}
		
		final JPanel jPanelCamposPresuEstado=jPanelCamposAuxiliarPresuEstado;
		final JPanel jPanelAccionesFormularioPresuEstado=jPanelAccionesFormularioAuxiliarPresuEstado;
		
		
		final JMenuBar jmenuBarPresuEstado=this.jmenuBarPresuEstado;		
		final JToolBar jTtoolBarPresuEstado=this.jTtoolBarPresuEstado;
				
		JMenuBar jmenuBarDetalleAuxiliarPresuEstado=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPresuEstado=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) {
			jmenuBarDetalleAuxiliarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jmenuBarDetallePresuEstado;
			jTtoolBarDetalleAuxiliarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jTtoolBarDetallePresuEstado;		
		}
		
		final JMenuBar jmenuBarDetallePresuEstado=jmenuBarDetalleAuxiliarPresuEstado;
		final JToolBar jTtoolBarDetallePresuEstado=jTtoolBarDetalleAuxiliarPresuEstado;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPresuEstado;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPresuEstado;
			processRunnable.jTableDatos=jTableDatosPresuEstado;
			processRunnable.jPanelCampos=jPanelCamposPresuEstado;
			processRunnable.jPanelPaginacion=jPanelPaginacionPresuEstado;
			processRunnable.jPanelAcciones=jPanelAccionesPresuEstado;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPresuEstado;
			
			
			processRunnable.jmenuBar=jmenuBarPresuEstado;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePresuEstado;
			processRunnable.jTtoolBar=jTtoolBarPresuEstado;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePresuEstado;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPresuEstado ,jPanelParametrosReportesPresuEstado, jTableDatosPresuEstado,/*jScrollPanelDatosPresuEstado,*/jPanelCamposPresuEstado,jPanelPaginacionPresuEstado, /*jScrollPanelDatosEdicionPresuEstado,*/ jPanelAccionesPresuEstado,jPanelAccionesFormularioPresuEstado,jmenuBarPresuEstado,jmenuBarDetallePresuEstado,jTtoolBarPresuEstado,jTtoolBarDetallePresuEstado));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPresuEstado(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPresuEstado(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPresuEstado(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPresuEstado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPresuEstado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePresuEstado,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPresuEstado(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPresuEstado,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePresuEstado,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.presuestadoConstantesFunciones.getsFinalQueryPresuEstado();
		String  finalQueryPaginacionTodos=this.presuestadoConstantesFunciones.getsFinalQueryPresuEstado();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PresuEstadoConstantesFunciones.getArrayColumnasGlobalesNoPresuEstado(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PresuEstadoConstantesFunciones.getArrayColumnasGlobalesPresuEstado(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PresuEstadoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.presuestadosEliminados= new ArrayList<PresuEstado>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPresuEstado();
		
				///*PresuEstadoSessionBean*/this.presuestadoSessionBean=new PresuEstadoSessionBean();
			
			if(this.presuestadoSessionBean==null) {
				this.presuestadoSessionBean=new PresuEstadoSessionBean();
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
					this.iNumeroPaginacion=PresuEstadoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PresuEstadoConstantesFunciones.getClassesForeignKeysOfPresuEstado(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/presuestado."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			presuestadosAux= new ArrayList<PresuEstado>();
			
				
			presuestadoLogic.setDatosCliente(this.datosCliente);
			presuestadoLogic.setDatosDeep(this.datosDeep);
			presuestadoLogic.setIsConDeep(true);
			
			
			presuestadoLogic.getPresuEstadoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					presuestadoLogic.getTodosPresuEstados(finalQueryGlobal,pagination);
					
					//presuestadoLogic.getTodosPresuEstadosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(presuestadoLogic.getPresuEstados()==null|| presuestadoLogic.getPresuEstados().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presuestadosAux= new ArrayList<PresuEstado>();
							presuestadosAux.addAll(presuestadoLogic.getPresuEstados());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuestadosAux= new ArrayList<PresuEstado>();
							presuestadosAux.addAll(presuestados);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presuestadoLogic.getTodosPresuEstados(finalQueryGlobal+"",this.pagination);												
							
							//presuestadoLogic.getTodosPresuEstadosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePresuEstados("Todos",presuestadoLogic.getPresuEstados() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							presuestadoLogic.setPresuEstados(new ArrayList<PresuEstado>());					
							presuestadoLogic.getPresuEstados().addAll(presuestadosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuestados=new ArrayList<PresuEstado>();
							presuestados.addAll(presuestadosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPresuEstado=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPresuEstado=this.idActual;
				
				} else if(this.idPresuEstadoActual!=null && this.idPresuEstadoActual!=0L) {
					idPresuEstado=idPresuEstadoActual;
				}
				
					
				this.sDetalleReporte=PresuEstadoConstantesFunciones.getDetalleIndicePorId(idPresuEstado);
				
				this.presuestados=new ArrayList<PresuEstado>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					presuestadoLogic.getEntity(idPresuEstado);
					
					//presuestadoLogic.getEntityWithConnection(idPresuEstado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuestadoLogic.setPresuEstados(new ArrayList<PresuEstado>());
					presuestadoLogic.getPresuEstados().add(presuestadoLogic.getPresuEstado());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuestados=new ArrayList<PresuEstado>();
					this.presuestados.add(presuestado);
				}
				
				if(presuestadoLogic.getPresuEstado()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPresuEstado();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPresuEstado();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presuestadoLogic.getPresuEstados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presuestados.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=presuestadoLogic.getPresuEstados().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=presuestados.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PresuEstado presuestado) {
		Boolean permite=true;
		
		if(this.presuestado.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PresuEstadoConstantesFunciones.getOrderByListaPresuEstado();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PresuEstadoConstantesFunciones.getOrderByListaPresuEstado();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuEstado presuestado:presuestadoLogic.getPresuEstados()) {
				if(presuestado.getsType().equals(Constantes2.S_TOTALES)) {
					presuestadoTotales=presuestado;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuEstado presuestado:this.presuestados) {
				if(presuestado.getsType().equals(Constantes2.S_TOTALES)) {
					presuestadoTotales=presuestado;
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
			this.presuestadoAux=new PresuEstado();
			this.presuestadoAux.setsType(Constantes2.S_TOTALES);
			this.presuestadoAux.setIsNew(false);
			this.presuestadoAux.setIsChanged(false);
			this.presuestadoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PresuEstadoConstantesFunciones.TotalizarValoresFilaPresuEstado(this.presuestadoLogic.getPresuEstados(),this.presuestadoAux);
				
				this.presuestadoLogic.getPresuEstados().add(this.presuestadoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PresuEstadoConstantesFunciones.TotalizarValoresFilaPresuEstado(this.presuestados,this.presuestadoAux);
				
				this.presuestados.add(this.presuestadoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		presuestadoTotales=new PresuEstado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presuestadoLogic.getPresuEstados().remove(presuestadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.presuestados.remove(presuestadoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		presuestadoTotales=new PresuEstado();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PresuEstado presuestado:presuestadoLogic.getPresuEstados()) {
				if(presuestado.getsType().equals(Constantes2.S_TOTALES)) {
					presuestadoTotales=presuestado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuEstadoConstantesFunciones.TotalizarValoresFilaPresuEstado(this.presuestadoLogic.getPresuEstados(),presuestadoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PresuEstado presuestado:this.presuestados) {
				if(presuestado.getsType().equals(Constantes2.S_TOTALES)) {
					presuestadoTotales=presuestado;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PresuEstadoConstantesFunciones.TotalizarValoresFilaPresuEstado(this.presuestados,presuestadoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosPresuEstado() {
		this.isPermisoTodoPresuEstado=false;
		this.isPermisoNuevoPresuEstado=false;
		this.isPermisoActualizarPresuEstado=false;
		this.isPermisoActualizarOriginalPresuEstado=false;
		this.isPermisoEliminarPresuEstado=false;
		this.isPermisoGuardarCambiosPresuEstado=false;
		this.isPermisoConsultaPresuEstado=false;
		this.isPermisoBusquedaPresuEstado=false;
		this.isPermisoReportePresuEstado=false;		
		this.isPermisoOrdenPresuEstado=false;		
		this.isPermisoPaginacionMedioPresuEstado=false;		
		this.isPermisoPaginacionAltoPresuEstado=false;
		this.isPermisoPaginacionTodoPresuEstado=false;
		this.isPermisoCopiarPresuEstado=false;		
		this.isPermisoVerFormPresuEstado=false;		
		this.isPermisoDuplicarPresuEstado=false;		
		this.isPermisoOrdenPresuEstado=false;		
	}
	
	public void setPermisosUsuarioPresuEstado(Boolean isPermiso) {
		this.isPermisoTodoPresuEstado=isPermiso;
		this.isPermisoNuevoPresuEstado=isPermiso;
		this.isPermisoActualizarPresuEstado=isPermiso;
		this.isPermisoActualizarOriginalPresuEstado=isPermiso;
		this.isPermisoEliminarPresuEstado=isPermiso;
		this.isPermisoGuardarCambiosPresuEstado=isPermiso;
		this.isPermisoConsultaPresuEstado=isPermiso;
		this.isPermisoBusquedaPresuEstado=isPermiso;
		this.isPermisoReportePresuEstado=isPermiso;
		this.isPermisoOrdenPresuEstado=isPermiso;		
		this.isPermisoPaginacionMedioPresuEstado=isPermiso;		
		this.isPermisoPaginacionAltoPresuEstado=isPermiso;		
		this.isPermisoPaginacionTodoPresuEstado=isPermiso;		
		this.isPermisoCopiarPresuEstado=isPermiso;		
		this.isPermisoVerFormPresuEstado=isPermiso;		
		this.isPermisoDuplicarPresuEstado=isPermiso;
		this.isPermisoOrdenPresuEstado=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPresuEstado(Boolean isPermiso) {
		//this.isPermisoTodoPresuEstado=isPermiso;
		this.isPermisoNuevoPresuEstado=isPermiso;
		this.isPermisoActualizarPresuEstado=isPermiso;
		this.isPermisoActualizarOriginalPresuEstado=isPermiso;
		this.isPermisoEliminarPresuEstado=isPermiso;
		this.isPermisoGuardarCambiosPresuEstado=isPermiso;
		//this.isPermisoConsultaPresuEstado=isPermiso;
		//this.isPermisoBusquedaPresuEstado=isPermiso;
		//this.isPermisoReportePresuEstado=isPermiso;
		//this.isPermisoOrdenPresuEstado=isPermiso;		
		//this.isPermisoPaginacionMedioPresuEstado=isPermiso;		
		//this.isPermisoPaginacionAltoPresuEstado=isPermiso;		
		//this.isPermisoPaginacionTodoPresuEstado=isPermiso;		
		//this.isPermisoCopiarPresuEstado=isPermiso;		
		//this.isPermisoDuplicarPresuEstado=isPermiso;
		//this.isPermisoOrdenPresuEstado=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPresuEstadoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(PresuEstadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebPresuEstado(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPresuEstadoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioPresuEstadoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPresuEstadoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPresuEstadoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioPresuEstado() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PresuEstadoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.presuestadoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PresuEstadoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPresuEstado=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPresuEstado=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPresuEstado=this.isPermisoActualizarPresuEstado;
			this.isPermisoEliminarPresuEstado=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPresuEstado=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPresuEstado=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPresuEstado=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPresuEstado=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePresuEstado=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuEstado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPresuEstado=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPresuEstado=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPresuEstado=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPresuEstado=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPresuEstado=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPresuEstado=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPresuEstado=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.presuestadoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPresuEstado.setToolTipText(this.jTableDatosPresuEstado.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPresuEstado(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPresuEstado(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PresuEstadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PresuEstadoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPresuEstado() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyPresuEstadoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPresuEstadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PresuEstadoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPresuEstadoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyPresuEstadoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPresuEstado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyPresuEstado()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPresuEstado(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPresuEstado()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPresuEstado();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPresuEstado(PresuEstado presuestado)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPresuEstado(PresuEstado presuestado,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPresuEstado()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPresuEstado()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPresuEstado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPresuEstado()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPresuEstado()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPresuEstado()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPresuEstado(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPresuEstado()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public PresuEstadoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PresuEstadoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PresuEstadoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.presuestadoSessionBean=new PresuEstadoSessionBean(); 
		this.presuestadoConstantesFunciones=new PresuEstadoConstantesFunciones(); 
		this.presuestadoBean=new PresuEstado();//(this.presuestadoConstantesFunciones); 		
		this.presuestadoReturnGeneral=new PresuEstadoParameterReturnGeneral(); 
		
		this.presuestadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.presuestadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PresuEstadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PresuEstadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PresuEstadoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPresuEstado(true);
			
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
			
			this.presuestadoConstantesFunciones=new PresuEstadoConstantesFunciones(); 
			this.presuestadoBean=new PresuEstado();//this.presuestadoConstantesFunciones); 			
			this.presuestadoReturnGeneral=new PresuEstadoParameterReturnGeneral(); 
		
			PresuEstadoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.presuestado=new PresuEstado();
			this.presuestados = new ArrayList<PresuEstado>();
			this.presuestadosAux = new ArrayList<PresuEstado>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic=new PresuEstadoLogic();
				this.presuestadoLogic.getNewConnexionToDeep("");
			}
			
			//this.presuestadoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.presuestadoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPresuEstado);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPresuEstado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuEstado);	
					}
					
					if(this.jInternalFrameImportacionPresuEstado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuEstado);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPresuEstado!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPresuEstado);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPresuEstado!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuEstado);
				this.jInternalFrameDetalleFormPresuEstado.setVisible(false);
				this.jInternalFrameDetalleFormPresuEstado.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPresuEstado!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuEstado);
					this.jInternalFrameReporteDinamicoPresuEstado.setVisible(false);
					this.jInternalFrameReporteDinamicoPresuEstado.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPresuEstado!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPresuEstado);
					this.jInternalFrameImportacionPresuEstado.setVisible(false);
					this.jInternalFrameImportacionPresuEstado.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPresuEstado!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPresuEstado);
					this.jInternalFrameOrderByPresuEstado.setVisible(false);
					this.jInternalFrameOrderByPresuEstado.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPresuEstadoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PresuEstadoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.presuestadoReturnGeneral=new PresuEstadoParameterReturnGeneral();
			
			this.presuestadoParameterGeneral=new PresuEstadoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.presuestadoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PresuEstadoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.presuestadoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuEstadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presuestadoSessionBean.getEsGuardarRelacionado(),this.presuestadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PresuEstadoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.presuestadoSessionBean.getEsGuardarRelacionado(),this.presuestadoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPresuEstado=false;
			this.isVisibilidadCeldaDuplicarPresuEstado=true;
			this.isVisibilidadCeldaCopiarPresuEstado=true;
			this.isVisibilidadCeldaVerFormPresuEstado=true;
			this.isVisibilidadCeldaOrdenPresuEstado=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuEstado=false;
			this.isVisibilidadCeldaModificarPresuEstado=false;
			this.isVisibilidadCeldaActualizarPresuEstado=false;
			this.isVisibilidadCeldaEliminarPresuEstado=false;
			this.isVisibilidadCeldaCancelarPresuEstado=false;
			this.isVisibilidadCeldaGuardarPresuEstado=false;
			this.isVisibilidadCeldaGuardarCambiosPresuEstado=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPresuEstado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPresuEstado();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPresuEstado(false);
			
			this.setPermisosUsuarioPresuEstado();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presuestadoSessionBean.getEsGuardarRelacionado() 
				|| (this.presuestadoSessionBean.getEsGuardarRelacionado() && this.presuestadoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPresuEstadoClasesRelacionadas();
			}
			
			if(this.presuestadoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPresuEstadoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PresuEstadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPresuEstado();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPresuEstado();
			}
			
			if(!this.isPermisoBusquedaPresuEstado) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPresuEstado,this.isPermisoPaginacionMedioPresuEstado,this.isPermisoPaginacionTodoPresuEstado);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PresuEstadoConstantesFunciones.getTiposSeleccionarPresuEstado());
				
				this.tiposColumnasSelect=PresuEstadoConstantesFunciones.getTiposSeleccionarPresuEstado(true);
				
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
			//if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPresuEstado();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioPresuEstado(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioPresuEstado(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuEstado() ;
			
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
				presuestadoImplementable= (PresuEstadoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuEstadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				presuestadoImplementableHome= (PresuEstadoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PresuEstadoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.presuestados= new ArrayList<PresuEstado>();
			this.presuestadosEliminados= new ArrayList<PresuEstado>();
						
			this.isEsNuevoPresuEstado=false;
			this.esParaAccionDesdeFormularioPresuEstado=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPresuEstado(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPresuEstado();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PresuEstadoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPresuEstado("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPresuEstado(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPresuEstado!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPresuEstado();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPresuEstado();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPresuEstado(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PresuEstado: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPresuEstado() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPresuEstado")) {
				iIndex=this.jInternalFrameDetalleFormPresuEstado.jTabbedPaneRelacionesPresuEstado.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPresuEstado.jTabbedPaneRelacionesPresuEstado.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPresuEstado();	
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
	
	public void cargarCombosForeignKeyPresuEstado(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPresuEstado(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPresuEstado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPresuEstadoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPresuEstado();
		
		this.cargarCombosFrameForeignKeyPresuEstado();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPresuEstado();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPresuEstado();
		}
	}
	
	
	
	public void jButtonNuevoPresuEstadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.presuestadoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPresuEstado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			
			
			if(jTableDatosPresuEstado.getRowCount()>=1) {
				jTableDatosPresuEstado.removeRowSelectionInterval(0, jTableDatosPresuEstado.getRowCount()-1);						
			}
			
			this.isEsNuevoPresuEstado=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPresuEstado(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPresuEstado(true);			
			//this.presuestado=new PresuEstado();
			//this.presuestado.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuEstado(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuEstado() ;
			
			if(PresuEstadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuEstado(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.presuestado);	
			this.actualizarInformacion("INFO_PADRE",false,this.presuestado);				
			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			
			if(this.presuestadoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PresuEstado: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPresuEstadoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPresuEstado.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPresuEstado.getSelectedRows().length;			
			}
			
			presuestadosSeleccionados=this.getPresuEstadosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPresuEstado--;			
				//PresuEstado presuestadoAux= new PresuEstado();			
				//presuestadoAux.setId(this.iIdNuevoPresuEstado);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PresuEstado presuestadoOrigen=new PresuEstado();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PresuEstado presuestadoOrigen : presuestadosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							presuestadoOrigen =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							presuestadoOrigen =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPresuEstado();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.presuestado.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPresuEstado(presuestadoOrigen,this.presuestado,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPresuEstado(this.presuestado);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presuestadoLogic.getPresuEstados().add(this.presuestadoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presuestados.add(this.presuestadoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPresuEstado(false);
				
				this.jTableDatosPresuEstado.setRowSelectionInterval(this.getIndiceNuevoPresuEstado(), this.getIndiceNuevoPresuEstado());
				
				int iLastRow =  this.jTableDatosPresuEstado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuEstado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuEstado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuEstado(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPresuEstadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();									
		
			PresuEstado presuestadoOrigen=new PresuEstado();
			PresuEstado presuestadoDestino=new PresuEstado();
				
			presuestadosSeleccionados=this.getPresuEstadosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPresuEstado.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || presuestadosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPresuEstado.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuestadoOrigen =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presuestadoOrigen =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						presuestadoDestino =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						presuestadoDestino =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				presuestadoOrigen =presuestadosSeleccionados.get(0);
				presuestadoDestino =presuestadosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPresuEstado(presuestadoOrigen,presuestadoDestino,true,false);
				
				presuestadoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(presuestadoDestino,presuestadoLogic.getPresuEstados());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(presuestadoDestino,presuestados);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPresuEstado(false);
				
				//this.jTableDatosPresuEstado.setRowSelectionInterval(this.getIndiceNuevoPresuEstado(), this.getIndiceNuevoPresuEstado());
				
				int iLastRow =  this.jTableDatosPresuEstado.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPresuEstado.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPresuEstado.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuEstado(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPresuEstadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuEstado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPresuEstado.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPresuEstadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPresuEstado.isVisible();
			
			
			this.jPanelParametrosReportesPresuEstado.setVisible(!isVisible);
			this.jPanelPaginacionPresuEstado.setVisible(!isVisible);
			this.jPanelAccionesPresuEstado.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPresuEstadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePresuEstado();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPresuEstadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPresuEstado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPresuEstadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPresuEstado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPresuEstadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPresuEstado();
			
			this.abrirFrameOrderByPresuEstado();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPresuEstadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPresuEstado();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePresuEstado(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuEstado);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPresuEstado.isMaximum()) {
					this.jInternalFrameDetalleFormPresuEstado.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPresuEstado.setSize(this.jInternalFrameDetalleFormPresuEstado.iWidthFormulario,this.jInternalFrameDetalleFormPresuEstado.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPresuEstado.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPresuEstado.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPresuEstado.isMaximum()) {
						this.jInternalFrameDetalleFormPresuEstado.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPresuEstado.jContentPaneDetallePresuEstado.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPresuEstado.jTabbedPaneRelacionesPresuEstado.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPresuEstado.jContentPaneDetallePresuEstado.getWidth(),PresuEstadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuEstado.jTabbedPaneRelacionesPresuEstado.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPresuEstado.jContentPaneDetallePresuEstado.getWidth(),PresuEstadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPresuEstado.jTabbedPaneRelacionesPresuEstado.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPresuEstado.jContentPaneDetallePresuEstado.getWidth(),PresuEstadoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPresuEstado.setVisible(true);
	        this.jInternalFrameDetalleFormPresuEstado.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPresuEstado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPresuEstado==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPresuEstado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuEstado,false,this);
				} else {
					this.jInternalFrameOrderByPresuEstado=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPresuEstado,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPresuEstado);
				this.jInternalFrameOrderByPresuEstado.setVisible(false);
				this.jInternalFrameOrderByPresuEstado.setSelected(false);
				
				this.jInternalFrameOrderByPresuEstado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuEstado"));
				
				this.inicializarActualizarBindingTablaOrderByPresuEstado();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPresuEstado() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPresuEstado==null) {
				
				this.jInternalFrameImportacionPresuEstado=new ImportacionJInternalFrame(PresuEstadoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPresuEstado);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPresuEstado);
				this.jInternalFrameImportacionPresuEstado.setVisible(false);
				this.jInternalFrameImportacionPresuEstado.setSelected(false);


				this.jInternalFrameImportacionPresuEstado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuEstado"));
				this.jInternalFrameImportacionPresuEstado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuEstado"));
				this.jInternalFrameImportacionPresuEstado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuEstado"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPresuEstado() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPresuEstado==null) {
				this.jInternalFrameReporteDinamicoPresuEstado=new ReporteDinamicoJInternalFrame(PresuEstadoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPresuEstado);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPresuEstado);
				this.jInternalFrameReporteDinamicoPresuEstado.setVisible(false);
				this.jInternalFrameReporteDinamicoPresuEstado.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPresuEstado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuEstado"));
				this.jInternalFrameReporteDinamicoPresuEstado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuEstado"));
				this.jInternalFrameReporteDinamicoPresuEstado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuEstado"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuEstado();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetallePresuEstado() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPresuEstado);
			
	       	this.jInternalFrameDetalleFormPresuEstado.setVisible(false);
	        this.jInternalFrameDetalleFormPresuEstado.setSelected(false);
			
			//this.jInternalFrameDetalleFormPresuEstado.dispose();
			//this.jInternalFrameDetalleFormPresuEstado=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPresuEstado() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPresuEstado.setVisible(true);
	        this.jInternalFrameReporteDinamicoPresuEstado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPresuEstado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPresuEstado.setVisible(true);
	        this.jInternalFrameImportacionPresuEstado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPresuEstado() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPresuEstado.setVisible(true);
	        this.jInternalFrameOrderByPresuEstado.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPresuEstado() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPresuEstado.setVisible(false);
	        this.jInternalFrameOrderByPresuEstado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPresuEstado() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPresuEstado.setVisible(false);
	        this.jInternalFrameReporteDinamicoPresuEstado.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPresuEstado() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPresuEstado.setVisible(false);
	        this.jInternalFrameImportacionPresuEstado.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPresuEstadoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPresuEstado(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPresuEstado(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPresuEstado(true);
			//this.isEsNuevoPresuEstado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestado =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presuestado =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPresuEstado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuEstado(false) ;
			
			if(presuestadoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(PresuEstadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuEstado(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuEstado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPresuEstadoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestado =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuestado =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPresuEstado(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPresuEstado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPresuEstado(true);
			//this.isEsNuevoPresuEstado=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestado =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presuestado =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.presuestado.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPresuEstado("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPresuEstado(false) ;
			
			if(PresuEstadoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePresuEstado(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuEstado(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarPresuEstadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPresuEstado(false);
			
			//if(!this.isEsNuevoPresuEstado) {								
				int intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestado =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.presuestado =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PresuEstadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPresuEstado(this.presuestado,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPresuEstado(this.presuestado);
				
			}
			
			if(this.permiteMantenimiento(this.presuestado)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPresuEstado=true;
					this.inicializarActualizarBindingTablaPresuEstado(false);
					this.isEsNuevoPresuEstado=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPresuEstado=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPresuEstado=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuEstado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuEstado(false);
				
				this.habilitarDeshabilitarControlesPresuEstado(false);
			
												
				
				if(PresuEstadoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePresuEstado();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPresuEstadoActionPerformed(evt,presuestadoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPresuEstado(this.presuestado,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPresuEstado.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,presuestadoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.presuestado.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PresuEstado.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuEstado.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPresuEstadoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestado =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				this.presuestado.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.presuestado =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				this.presuestado.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.presuestado)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PresuEstadoModel) this.jTableDatosPresuEstado.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPresuEstado=true;
				this.inicializarActualizarBindingTablaPresuEstado(false);
				this.isEsNuevoPresuEstado=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPresuEstado(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuEstado(false);
				
				this.habilitarDeshabilitarControlesPresuEstado(false);
				
				
				
				if(PresuEstadoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePresuEstado();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPresuEstadoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPresuEstado.getRowCount()>=1) {
				jTableDatosPresuEstado.removeRowSelectionInterval(0, jTableDatosPresuEstado.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPresuEstado(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPresuEstado(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPresuEstado(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPresuEstado(false) ;
			
			this.isEsNuevoPresuEstado=false;
			
			if(PresuEstadoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePresuEstado();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPresuEstadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPresuEstado(false);
				
				//SI ES MANUAL
				if(PresuEstadoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPresuEstado();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPresuEstadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPresuEstado--;			
			//PresuEstado presuestadoAux= new PresuEstado();			
			//presuestadoAux.setId(this.iIdNuevoPresuEstado);
			
			if(this.jInternalFrameDetalleFormPresuEstado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPresuEstado();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPresuEstado(this.presuestado);
			
			this.presuestado.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.presuestadoLogic.getPresuEstados().add(this.presuestadoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.presuestados.add(this.presuestadoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPresuEstado(false);
			
			this.jTableDatosPresuEstado.setRowSelectionInterval(this.getIndiceNuevoPresuEstado(), this.getIndiceNuevoPresuEstado());
			
			int iLastRow =  this.jTableDatosPresuEstado.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPresuEstado.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPresuEstado.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPresuEstado(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPresuEstadoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPresuEstado(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuEstado(false);
			
			//SI ES MANUAL
			if(PresuEstadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuEstado();
			}
			
			//this.abrirFrameTreePresuEstado();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPresuEstadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE EstadoS ?", "MANTENIMIENTO DE Estado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPresuEstado.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPresuEstado();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.presuestadoReturnGeneral=presuestadoLogic.procesarImportacionPresuEstadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.presuestadoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPresuEstadoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPresuEstadoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPresuEstado.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPresuEstado.setFileImportacion(this.jInternalFrameImportacionPresuEstado.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPresuEstado.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPresuEstado.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPresuEstado.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPresuEstado.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPresuEstadoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();		

		presuestadosSeleccionados=this.getPresuEstadosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuEstado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuEstado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PresuEstadoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PresuEstadoBaseDesign.jrxml";
			
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
			
			this.generarReportePresuEstados("Todos",presuestadosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPresuEstado.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuEstado.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuEstadoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoPresuEstado.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPresuEstado.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPresuEstado.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PresuEstadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPresuEstado.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PresuEstadoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPresuEstado.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuEstado.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PresuEstadoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoPresuEstadoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();		
		
		presuestadosSeleccionados=this.getPresuEstadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuestado";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PresuEstados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPresuEstado.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPresuEstado.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PresuEstadoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PresuEstadoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(PresuEstado presuestado:presuestadosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(presuestado.getnombre());
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
			//	this.getFilaCabeceraExportarExcelPresuEstado(row);				
			//	iRow++;
			//}				
			
			//for(PresuEstado presuestadoAux:presuestadosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPresuEstado(presuestadoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado",JOptionPane.INFORMATION_MESSAGE);
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
				this.presuestadoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuEstado(false);
			
			//SI ES MANUAL
			if(PresuEstadoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPresuEstado();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPresuEstadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuEstado(false);
			
			//SI ES MANUAL
			if(PresuEstadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuEstado();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPresuEstadoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPresuEstado(false);
			
			//SI ES MANUAL
			if(PresuEstadoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPresuEstado();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.presuestadoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPresuEstado() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPresuEstado.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPresuEstado.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPresuEstado.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPresuEstado.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPresuEstado.setMinimumSize(dimensionMinimum);
		this.jTableDatosPresuEstado.setMaximumSize(dimensionMaximum);
		this.jTableDatosPresuEstado.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPresuEstado(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPresuEstado(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPresuEstado(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPresuEstado(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPresuEstado(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPresuEstado(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuEstado(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPresuEstado(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PresuEstadoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PresuEstadoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPresuEstado() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPresuEstado();
		
		this.inicializarActualizarBindingBotonesManualPresuEstado(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPresuEstado();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPresuEstado() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPresuEstado(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPresuEstado(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPresuEstado.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPresuEstado.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePresuEstado.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPresuEstado!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPresuEstado.jCheckBoxPostAccionNuevoPresuEstado.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPresuEstado.jCheckBoxPostAccionSinCerrarPresuEstado.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPresuEstado.jCheckBoxPostAccionSinMensajePresuEstado.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPresuEstado.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPresuEstado.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePresuEstado.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPresuEstado!=null) {
				this.jInternalFrameDetalleFormPresuEstado.jCheckBoxPostAccionNuevoPresuEstado.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPresuEstado.jCheckBoxPostAccionSinCerrarPresuEstado.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPresuEstado.jCheckBoxPostAccionSinMensajePresuEstado.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPresuEstado.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPresuEstado.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPresuEstado!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPresuEstado.jComboBoxTiposAccionesFormularioPresuEstado.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPresuEstado.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPresuEstado!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuEstado.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPresuEstado.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPresuEstado.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPresuEstado.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPresuEstado.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPresuEstado!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPresuEstado.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPresuEstado.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPresuEstado.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPresuEstado(Boolean esInicializar) throws Exception {
		try	{	
			if(PresuEstadoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPresuEstado(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPresuEstado() throws Exception {
		try	{
			if(PresuEstadoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuEstado();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuEstado() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPresuEstado.jComboBoxTiposAccionesFormularioPresuEstado.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPresuEstado.jComboBoxTiposAccionesFormularioPresuEstado.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPresuEstado() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPresuEstado.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPresuEstado.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPresuEstado.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPresuEstado.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPresuEstado.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPresuEstado.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPresuEstado.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPresuEstado.addItem(reporte);
			}
			
			
			if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPresuEstado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPresuEstado.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPresuEstado.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPresuEstado.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPresuEstado.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPresuEstado.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPresuEstado.jComboBoxTiposAccionesFormularioPresuEstado.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPresuEstado.jComboBoxTiposAccionesFormularioPresuEstado.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPresuEstado.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPresuEstado.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPresuEstado.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuEstado();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPresuEstado() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuEstado!=null) {
				this.jInternalFrameReporteDinamicoPresuEstado.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuEstado.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPresuEstado!=null) {
				this.jInternalFrameReporteDinamicoPresuEstado.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPresuEstado.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPresuEstado!=null) {
				
				if(this.jInternalFrameReporteDinamicoPresuEstado.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuEstado.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuEstado.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPresuEstado.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPresuEstado.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPresuEstado.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPresuEstado()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPresuEstado(Boolean esInicializar) throws Exception {				
		if(PresuEstadoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPresuEstado();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPresuEstado() throws Exception {
		this.inicializarActualizarBindingTablaPresuEstado(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPresuEstado() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PresuEstadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PresuEstadoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPresuEstadoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuEstadoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PresuEstadoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PresuEstadoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPresuEstado(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=presuestadoLogic.getPresuEstados().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=presuestados.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PresuEstadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPresuEstado.setModel(new PresuEstadoModel(this.presuestadoLogic.getPresuEstados(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPresuEstado.setModel(new PresuEstadoModel(this.presuestados,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPresuEstado!=null && this.jInternalFrameOrderByPresuEstado.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPresuEstado();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPresuEstado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuEstado,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PresuEstadoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO,presuestadoConstantesFunciones.resaltarSeleccionarPresuEstado,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PresuEstadoConstantesFunciones.SCLASSWEBTITULO,presuestadoConstantesFunciones.resaltarSeleccionarPresuEstado,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPresuEstado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuEstado,PresuEstadoConstantesFunciones.LABEL_ID));

		if(this.presuestadoConstantesFunciones.mostraridPresuEstado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuEstadoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.presuestadoConstantesFunciones.resaltaridPresuEstado,this.presuestadoConstantesFunciones.activaridPresuEstado,this,true,"idPresuEstado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuestadoConstantesFunciones.resaltaridPresuEstado,this.presuestadoConstantesFunciones.activaridPresuEstado,this,true,"idPresuEstado","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPresuEstado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPresuEstado,PresuEstadoConstantesFunciones.LABEL_NOMBRE));

		if(this.presuestadoConstantesFunciones.mostrarnombrePresuEstado && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PresuEstadoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.presuestadoConstantesFunciones.resaltarnombrePresuEstado,this.presuestadoConstantesFunciones.activarnombrePresuEstado,this,true,"nombrePresuEstado","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.presuestadoConstantesFunciones.resaltarnombrePresuEstado,this.presuestadoConstantesFunciones.activarnombrePresuEstado,this,true,"nombrePresuEstado","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PresuEstadoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.presuestadoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presuestadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presuestadoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuEstado.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.presuestadoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.presuestadoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPresuEstado.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPresuEstado && this.isPermisoGuardarCambiosPresuEstado) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.presuestadoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.presuestadoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPresuEstado.addColumn(tableColumn);
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
			
			this.jTableDatosPresuEstado.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuEstado && this.isPermisoGuardarCambiosPresuEstado) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPresuEstado && this.isPermisoGuardarCambiosPresuEstado) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPresuEstado.moveColumn(this.jTableDatosPresuEstado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPresuEstado.moveColumn(this.jTableDatosPresuEstado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPresuEstado.moveColumn(this.jTableDatosPresuEstado.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPresuEstado.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPresuEstado.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPresuEstado,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PresuEstadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPresuEstado.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPresuEstado.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PresuEstadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PresuEstadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPresuEstado.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPresuEstado.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPresuEstado.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=presuestadoLogic.getPresuEstados().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=presuestados.size()-1;
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
		//this.jTableDatosPresuEstado.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPresuEstado.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPresuEstado();
			
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
				
				//this.isEsNuevoPresuEstado=false;
					
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			
				if(this.presuestadoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPresuEstado==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuEstado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuEstado.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestado =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuestado =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.presuestado.getsType().equals("DUPLICADO")
				   || this.presuestado.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPresuEstado=true;
				
				} else {
					this.isEsNuevoPresuEstado=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.presuestadoSessionBean.getEsGuardarRelacionado()) {
					if(this.presuestado.getId()>=0 && !this.presuestado.getIsNew()) {						
						this.isEsNuevoPresuEstado=false;
						
					} else {
						this.isEsNuevoPresuEstado=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPresuEstado(esRelaciones);						
				
				this.seleccionarPresuEstado(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.presuestado.getId()<0) {
					this.isEsNuevoPresuEstado=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPresuEstado(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPresuEstado(evt,rowIndex);
				}	
				
				if(this.presuestadoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PresuEstado: " + this.dDif); 
					}
				}								
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPresuEstado(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.presuestado)) {
					if(this.presuestado.getId()>0) {
						this.presuestado.setIsDeleted(true);
						
						this.presuestadosEliminados.add(this.presuestado);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.presuestadoLogic.getPresuEstados().remove(this.presuestado);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.presuestados.remove(this.presuestado);				
					}
					
					
					((PresuEstadoModel) this.jTableDatosPresuEstado.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPresuEstado(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPresuEstado(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPresuEstado) {
			
			if(this.jInternalFrameDetalleFormPresuEstado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPresuEstado.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPresuEstado.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestado =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuestado =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PresuEstadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPresuEstado(this.presuestado);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPresuEstado("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPresuEstado(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPresuEstado() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuEstado(PresuEstado presuestado) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPresuEstado(presuestado,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPresuEstado(PresuEstado presuestado,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPresuEstado(presuestado);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPresuEstado(presuestado,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPresuEstado(presuestado);
	}
	
	public void setVariablesObjetoActualToFormularioPresuEstado(PresuEstado presuestado) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPresuEstado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPresuEstado.jTextFieldidPresuEstado.setText(presuestado.getId().toString());
			this.jInternalFrameDetalleFormPresuEstado.jTextAreanombrePresuEstado.setText(presuestado.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PresuEstado presuestadoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,presuestadoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PresuEstado presuestadoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				presuestadoLocal=this.presuestado;
			} else {
				presuestadoLocal=this.presuestadoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(presuestadoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPresuEstado(presuestadoLocal,true);
					
					if(presuestadoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(presuestadoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.presuestadoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(presuestadoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPresuEstado(PresuEstado presuestado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuEstado(presuestado,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPresuEstado(presuestado);
	}
	
	public void setVariablesFormularioToObjetoActualPresuEstado(PresuEstado presuestado,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPresuEstado(presuestado,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPresuEstado(PresuEstado presuestado,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPresuEstado==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPresuEstado.jTextFieldidPresuEstado.getText()==null || this.jInternalFrameDetalleFormPresuEstado.jTextFieldidPresuEstado.getText()=="" || this.jInternalFrameDetalleFormPresuEstado.jTextFieldidPresuEstado.getText()=="Id") {
				this.jInternalFrameDetalleFormPresuEstado.jTextFieldidPresuEstado.setText("0");
			}

			if(conColumnasBase) {presuestado.setId(Long.parseLong(this.jInternalFrameDetalleFormPresuEstado.jTextFieldidPresuEstado.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuEstadoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuEstado.jLabelIdPresuEstado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			presuestado.setnombre(this.jInternalFrameDetalleFormPresuEstado.jTextAreanombrePresuEstado.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PresuEstadoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPresuEstado.jLabelnombrePresuEstado,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPresuEstado(PresuEstado presuestadoBean,PresuEstado presuestado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPresuEstado(PresuEstado presuestadoOrigen,PresuEstado presuestado,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presuestadoOrigen.getId()!=null && !presuestadoOrigen.getId().equals(0L))) {presuestado.setId(presuestadoOrigen.getId());}}
			if(conDefault || (!conDefault && presuestadoOrigen.getnombre()!=null && !presuestadoOrigen.getnombre().equals(""))) {presuestado.setnombre(presuestadoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuEstado(PresuEstado presuestado) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuEstado.jTextFieldidPresuEstado.setText(presuestado.getId().toString());
			this.jInternalFrameDetalleFormPresuEstado.jTextAreanombrePresuEstado.setText(presuestado.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPresuEstado(PresuEstadoBean presuestadoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPresuEstado.jTextFieldidPresuEstado.setText(presuestadoBean.getId().toString());
			this.jInternalFrameDetalleFormPresuEstado.jTextAreanombrePresuEstado.setText(presuestadoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPresuEstado(PresuEstadoParameterReturnGeneral presuestadoReturnGeneral,PresuEstadoBean presuestadoBean,Boolean conDefault) throws Exception { 
		try {
			PresuEstado presuestadoLocal=new PresuEstado();
			
			presuestadoLocal=presuestadoReturnGeneral.getPresuEstado();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && presuestadoLocal.getId()!=null && !presuestadoLocal.getId().equals(0L))) {presuestadoBean.setId(presuestadoLocal.getId());}}
			if(conDefault || (!conDefault && presuestadoLocal.getnombre()!=null && !presuestadoLocal.getnombre().equals(""))) {presuestadoBean.setnombre(presuestadoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPresuEstadoGenerico(Long idPresuEstadoSeleccionado,JComboBox jComboBoxPresuEstado,List<PresuEstado> presuestadosLocal)throws Exception {
		try {
			PresuEstado  presuestadoTemp=null;

			for(PresuEstado presuestadoAux:presuestadosLocal) {
				if(presuestadoAux.getId()!=null && presuestadoAux.getId().equals(idPresuEstadoSeleccionado)) {
					presuestadoTemp=presuestadoAux;
					break;
				}
			}

			jComboBoxPresuEstado.setSelectedItem(presuestadoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPresuEstadoGenerico(JComboBox jComboBoxPresuEstado,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPresuEstado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuEstado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPresuEstado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPresuEstado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuEstado.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPresuEstado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPresuEstado.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPresuEstado.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPresuEstado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPresuEstado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presuestado=(PresuEstado) presuestadoLogic.getPresuEstados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presuestado =(PresuEstado) presuestados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PresuEstado presuestadoRow=new PresuEstado();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presuestadoRow=(PresuEstado) presuestadoLogic.getPresuEstados().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			presuestadoRow=(PresuEstado) presuestados.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPresuEstado(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPresuEstado.setVisible((this.isVisibilidadCeldaNuevoPresuEstado && this.isPermisoNuevoPresuEstado));			
			this.jButtonDuplicarPresuEstado.setVisible((this.isVisibilidadCeldaDuplicarPresuEstado && this.isPermisoDuplicarPresuEstado));			
			this.jButtonCopiarPresuEstado.setVisible((this.isVisibilidadCeldaCopiarPresuEstado && this.isPermisoCopiarPresuEstado));
			this.jButtonVerFormPresuEstado.setVisible((this.isVisibilidadCeldaVerFormPresuEstado && this.isPermisoVerFormPresuEstado));
			
			this.jButtonAbrirOrderByPresuEstado.setVisible((this.isVisibilidadCeldaOrdenPresuEstado && this.isPermisoOrdenPresuEstado));			
			
			this.jButtonNuevoRelacionesPresuEstado.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuEstado && this.isPermisoNuevoPresuEstado));			
			this.jButtonNuevoGuardarCambiosPresuEstado.setVisible((this.isVisibilidadCeldaNuevoPresuEstado && this.isPermisoNuevoPresuEstado && this.isPermisoGuardarCambiosPresuEstado));
			
			if(this.jInternalFrameDetalleFormPresuEstado!=null) {
			this.jInternalFrameDetalleFormPresuEstado.jButtonModificarPresuEstado.setVisible((this.isVisibilidadCeldaModificarPresuEstado && this.isPermisoActualizarPresuEstado));	
			this.jInternalFrameDetalleFormPresuEstado.jButtonActualizarPresuEstado.setVisible((this.isVisibilidadCeldaActualizarPresuEstado && this.isPermisoActualizarPresuEstado));	
			this.jInternalFrameDetalleFormPresuEstado.jButtonEliminarPresuEstado.setVisible((this.isVisibilidadCeldaEliminarPresuEstado && this.isPermisoEliminarPresuEstado));
			this.jInternalFrameDetalleFormPresuEstado.jButtonCancelarPresuEstado.setVisible(this.isVisibilidadCeldaCancelarPresuEstado);							
			this.jInternalFrameDetalleFormPresuEstado.jButtonGuardarCambiosPresuEstado.setVisible((this.isVisibilidadCeldaGuardarPresuEstado && this.isPermisoGuardarCambiosPresuEstado));			
			
			}
						
			this.jButtonGuardarCambiosTablaPresuEstado.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuEstado && this.isPermisoGuardarCambiosPresuEstado));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPresuEstado.setVisible((this.isVisibilidadCeldaNuevoPresuEstado && this.isPermisoNuevoPresuEstado));						
			this.jButtonDuplicarToolBarPresuEstado.setVisible((this.isVisibilidadCeldaDuplicarPresuEstado && this.isPermisoDuplicarPresuEstado));						
			this.jButtonCopiarToolBarPresuEstado.setVisible((this.isVisibilidadCeldaCopiarPresuEstado && this.isPermisoCopiarPresuEstado));			
			this.jButtonVerFormToolBarPresuEstado.setVisible((this.isVisibilidadCeldaVerFormPresuEstado && this.isPermisoVerFormPresuEstado));			
			this.jButtonAbrirOrderByToolBarPresuEstado.setVisible((this.isVisibilidadCeldaOrdenPresuEstado && this.isPermisoOrdenPresuEstado));
			this.jButtonNuevoRelacionesToolBarPresuEstado.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuEstado && this.isPermisoNuevoPresuEstado));			
			this.jButtonNuevoGuardarCambiosToolBarPresuEstado.setVisible((this.isVisibilidadCeldaNuevoPresuEstado && this.isPermisoNuevoPresuEstado && this.isPermisoGuardarCambiosPresuEstado));			
			
			if(this.jInternalFrameDetalleFormPresuEstado!=null) {
			this.jInternalFrameDetalleFormPresuEstado.jButtonModificarToolBarPresuEstado.setVisible((this.isVisibilidadCeldaModificarPresuEstado && this.isPermisoActualizarPresuEstado));	
			this.jInternalFrameDetalleFormPresuEstado.jButtonActualizarToolBarPresuEstado.setVisible((this.isVisibilidadCeldaActualizarPresuEstado  && this.isPermisoActualizarPresuEstado));	
			this.jInternalFrameDetalleFormPresuEstado.jButtonEliminarToolBarPresuEstado.setVisible((this.isVisibilidadCeldaEliminarPresuEstado && this.isPermisoEliminarPresuEstado));
			this.jInternalFrameDetalleFormPresuEstado.jButtonCancelarToolBarPresuEstado.setVisible(this.isVisibilidadCeldaCancelarPresuEstado);				
			this.jInternalFrameDetalleFormPresuEstado.jButtonGuardarCambiosToolBarPresuEstado.setVisible((this.isVisibilidadCeldaGuardarPresuEstado && this.isPermisoGuardarCambiosPresuEstado));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPresuEstado.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuEstado && this.isPermisoGuardarCambiosPresuEstado));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPresuEstado.setVisible((this.isVisibilidadCeldaNuevoPresuEstado && this.isPermisoNuevoPresuEstado));			
			this.jMenuItemDuplicarPresuEstado.setVisible((this.isVisibilidadCeldaDuplicarPresuEstado && this.isPermisoDuplicarPresuEstado));			
			this.jMenuItemCopiarPresuEstado.setVisible((this.isVisibilidadCeldaCopiarPresuEstado && this.isPermisoCopiarPresuEstado));			
			this.jMenuItemVerFormPresuEstado.setVisible((this.isVisibilidadCeldaVerFormPresuEstado && this.isPermisoVerFormPresuEstado));			
			this.jMenuItemAbrirOrderByPresuEstado.setVisible((this.isVisibilidadCeldaOrdenPresuEstado && this.isPermisoOrdenPresuEstado));			
			//this.jMenuItemMostrarOcultarPresuEstado.setVisible((this.isVisibilidadCeldaOrdenPresuEstado && this.isPermisoOrdenPresuEstado));
			this.jMenuItemDetalleAbrirOrderByPresuEstado.setVisible((this.isVisibilidadCeldaOrdenPresuEstado && this.isPermisoOrdenPresuEstado));			
			//this.jMenuItemDetalleMostrarOcultarPresuEstado.setVisible((this.isVisibilidadCeldaOrdenPresuEstado && this.isPermisoOrdenPresuEstado));			
			this.jMenuItemNuevoRelacionesPresuEstado.setVisible((this.isVisibilidadCeldaNuevoRelacionesPresuEstado && this.isPermisoNuevoPresuEstado));			
			this.jMenuItemNuevoGuardarCambiosPresuEstado.setVisible((this.isVisibilidadCeldaNuevoPresuEstado && this.isPermisoNuevoPresuEstado && this.isPermisoGuardarCambiosPresuEstado));									
			
			if(this.jInternalFrameDetalleFormPresuEstado!=null) {
			this.jInternalFrameDetalleFormPresuEstado.jMenuItemModificarPresuEstado.setVisible((this.isVisibilidadCeldaModificarPresuEstado && this.isPermisoActualizarPresuEstado));	
			this.jInternalFrameDetalleFormPresuEstado.jMenuItemActualizarPresuEstado.setVisible((this.isVisibilidadCeldaActualizarPresuEstado && this.isPermisoActualizarPresuEstado));	
			this.jInternalFrameDetalleFormPresuEstado.jMenuItemEliminarPresuEstado.setVisible((this.isVisibilidadCeldaEliminarPresuEstado && this.isPermisoEliminarPresuEstado));
			this.jInternalFrameDetalleFormPresuEstado.jMenuItemCancelarPresuEstado.setVisible(this.isVisibilidadCeldaCancelarPresuEstado);				
			}
			
			this.jMenuItemGuardarCambiosPresuEstado.setVisible((this.isVisibilidadCeldaGuardarPresuEstado && this.isPermisoGuardarCambiosPresuEstado));						
			this.jMenuItemGuardarCambiosTablaPresuEstado.setVisible((this.isVisibilidadCeldaGuardarCambiosPresuEstado && this.isPermisoGuardarCambiosPresuEstado));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPresuEstado=this.jButtonNuevoPresuEstado.isVisible();
			this.isVisibilidadCeldaDuplicarPresuEstado=this.jButtonDuplicarPresuEstado.isVisible();
			this.isVisibilidadCeldaCopiarPresuEstado=this.jButtonCopiarPresuEstado.isVisible();
			this.isVisibilidadCeldaVerFormPresuEstado=this.jButtonVerFormPresuEstado.isVisible();
			
			this.isVisibilidadCeldaOrdenPresuEstado=this.jButtonAbrirOrderByPresuEstado.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPresuEstado=this.jButtonNuevoRelacionesPresuEstado.isVisible();
			this.isVisibilidadCeldaModificarPresuEstado=this.jButtonModificarPresuEstado.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuEstado!=null) {
			this.isVisibilidadCeldaActualizarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jButtonActualizarPresuEstado.isVisible();
			this.isVisibilidadCeldaEliminarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jButtonEliminarPresuEstado.isVisible();
			this.isVisibilidadCeldaCancelarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jButtonCancelarPresuEstado.isVisible();
			this.isVisibilidadCeldaGuardarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jButtonGuardarCambiosPresuEstado.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPresuEstado=this.jButtonGuardarCambiosTablaPresuEstado.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPresuEstado=this.jButtonNuevoToolBarPresuEstado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuEstado=this.jButtonNuevoRelacionesToolBarPresuEstado.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuEstado!=null) {
			this.isVisibilidadCeldaModificarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jButtonModificarToolBarPresuEstado.isVisible();
			this.isVisibilidadCeldaActualizarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jButtonActualizarToolBarPresuEstado.isVisible();
			this.isVisibilidadCeldaEliminarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jButtonEliminarToolBarPresuEstado.isVisible();
			this.isVisibilidadCeldaCancelarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jButtonCancelarToolBarPresuEstado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuEstado=this.jButtonGuardarCambiosToolBarPresuEstado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuEstado=this.jButtonGuardarCambiosTablaToolBarPresuEstado.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPresuEstado=this.jMenuItemNuevoPresuEstado.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPresuEstado=this.jMenuItemNuevoRelacionesPresuEstado.isVisible();
			
			if(this.jInternalFrameDetalleFormPresuEstado!=null) {
			this.isVisibilidadCeldaModificarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jMenuItemModificarPresuEstado.isVisible();
			this.isVisibilidadCeldaActualizarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jMenuItemActualizarPresuEstado.isVisible();
			this.isVisibilidadCeldaEliminarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jMenuItemEliminarPresuEstado.isVisible();
			this.isVisibilidadCeldaCancelarPresuEstado=this.jInternalFrameDetalleFormPresuEstado.jMenuItemCancelarPresuEstado.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPresuEstado=this.jMenuItemGuardarCambiosPresuEstado.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPresuEstado=this.jMenuItemGuardarCambiosTablaPresuEstado.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPresuEstado(Boolean esInicializar) {
		if(PresuEstadoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.presuestadoSessionBean.getConGuardarRelaciones()) {
				//if(this.presuestadoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPresuEstado();
			}
			
			this.inicializarActualizarBindingBotonesManualPresuEstado(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPresuEstado() {
		this.jButtonNuevoPresuEstado.setVisible(this.isPermisoNuevoPresuEstado);			
		this.jButtonDuplicarPresuEstado.setVisible(this.isPermisoDuplicarPresuEstado);			
		this.jButtonCopiarPresuEstado.setVisible(this.isPermisoCopiarPresuEstado);			
		this.jButtonVerFormPresuEstado.setVisible(this.isPermisoVerFormPresuEstado);			
		
		this.jButtonAbrirOrderByPresuEstado.setVisible(this.isPermisoOrdenPresuEstado);					
		
		this.jButtonNuevoRelacionesPresuEstado.setVisible(this.isPermisoNuevoPresuEstado);			
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.jButtonModificarPresuEstado.setVisible(this.isPermisoActualizarPresuEstado);	
			this.jInternalFrameDetalleFormPresuEstado.jButtonActualizarPresuEstado.setVisible(this.isPermisoActualizarPresuEstado);	
			this.jInternalFrameDetalleFormPresuEstado.jButtonEliminarPresuEstado.setVisible(this.isPermisoEliminarPresuEstado);
			this.jInternalFrameDetalleFormPresuEstado.jButtonCancelarPresuEstado.setVisible(this.isVisibilidadCeldaCancelarPresuEstado);						
			this.jInternalFrameDetalleFormPresuEstado.jButtonGuardarCambiosPresuEstado.setVisible(this.isPermisoGuardarCambiosPresuEstado);							
		}
		
		this.jButtonGuardarCambiosTablaPresuEstado.setVisible(this.isPermisoActualizarPresuEstado);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePresuEstado() {
		this.jInternalFrameDetalleFormPresuEstado.jButtonModificarPresuEstado.setVisible(this.isPermisoActualizarPresuEstado);	
		this.jInternalFrameDetalleFormPresuEstado.jButtonActualizarPresuEstado.setVisible(this.isPermisoActualizarPresuEstado);	
		this.jInternalFrameDetalleFormPresuEstado.jButtonEliminarPresuEstado.setVisible(this.isPermisoEliminarPresuEstado);
		this.jInternalFrameDetalleFormPresuEstado.jButtonCancelarPresuEstado.setVisible(this.isVisibilidadCeldaCancelarPresuEstado);							
		this.jInternalFrameDetalleFormPresuEstado.jButtonGuardarCambiosPresuEstado.setVisible((this.isVisibilidadCeldaGuardarPresuEstado && this.isPermisoGuardarCambiosPresuEstado));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPresuEstado() {
		if(PresuEstadoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPresuEstado();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPresuEstado() {
	}
	
	public void jTableDatosPresuEstadoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPresuEstado(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPresuEstadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuEstado(this.getpresuestado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuEstado(this.presuestado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuestado =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuestado =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuestado==null) {
						this.presuestado = new PresuEstado();
					}

					this.setVariablesFormularioToObjetoActualPresuEstado(this.presuestado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuEstado(this.presuestado);
				}

				if(this.presuestado.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.presuestado.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuEstado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrePresuEstadoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestadoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPresuEstado(this.getpresuestado(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuEstado(this.presuestado);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuestado =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.presuestado =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.presuestado==null) {
						this.presuestado = new PresuEstado();
					}

					this.setVariablesFormularioToObjetoActualPresuEstado(this.presuestado,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuEstado(this.presuestado);
				}

				if(this.presuestado.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.presuestado.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPresuEstado(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestadoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestadoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestadoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFramePresuEstado() {
		if(this.jInternalFrameDetalleFormPresuEstado!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) {
			this.jInternalFrameDetalleFormPresuEstado.setVisible(false);	    			
			this.jInternalFrameDetalleFormPresuEstado.dispose();
			this.jInternalFrameDetalleFormPresuEstado=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPresuEstado!=null) {
			this.jInternalFrameReporteDinamicoPresuEstado.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPresuEstado.dispose();
			this.jInternalFrameReporteDinamicoPresuEstado=null;
		}
		
		if(this.jInternalFrameImportacionPresuEstado!=null) {
			this.jInternalFrameImportacionPresuEstado.setVisible(false);	    			
			this.jInternalFrameImportacionPresuEstado.dispose();
			this.jInternalFrameImportacionPresuEstado=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPresuEstado();
			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			
			
			if(sTipo.equals("NuevoPresuEstado")) {
				jButtonNuevoPresuEstadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPresuEstado")) {
				jButtonDuplicarPresuEstadoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPresuEstado")) {
				jButtonCopiarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormPresuEstado")) {
				jButtonVerFormPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPresuEstado")) {
				jButtonNuevoPresuEstadoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPresuEstado")) {
				jButtonDuplicarPresuEstadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPresuEstado")) {
				jButtonNuevoPresuEstadoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPresuEstado")) {
				jButtonDuplicarPresuEstadoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPresuEstado")) {
				jButtonNuevoPresuEstadoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPresuEstado")) {
				jButtonNuevoPresuEstadoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPresuEstado")) {
				jButtonNuevoPresuEstadoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPresuEstado")) {
				jButtonModificarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPresuEstado")) {
				jButtonModificarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPresuEstado")) {
				jButtonModificarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPresuEstado")) {
				jButtonActualizarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPresuEstado")) {
				jButtonActualizarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPresuEstado")) {
				jButtonActualizarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarPresuEstado")) {
				jButtonEliminarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPresuEstado")) {
				jButtonEliminarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPresuEstado")) {
				jButtonEliminarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarPresuEstado")) {
				jButtonCancelarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPresuEstado")) {
				jButtonCancelarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPresuEstado")) {
				jButtonCancelarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarPresuEstado")) {
				jButtonCerrarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPresuEstado")) {
				jButtonCerrarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPresuEstado")) {
				jButtonCerrarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPresuEstado")) {
				jButtonMostrarOcultarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPresuEstado")) {
				jButtonCancelarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPresuEstado")) {
				jButtonGuardarCambiosPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPresuEstado")) {
				jButtonGuardarCambiosPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPresuEstado")) {
				jButtonCopiarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPresuEstado")) {
				jButtonVerFormPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPresuEstado")) {
				jButtonGuardarCambiosPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPresuEstado")) {
				jButtonCopiarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPresuEstado")) {
				jButtonVerFormPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPresuEstado")) {
				jButtonGuardarCambiosPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPresuEstado")) {
				jButtonGuardarCambiosPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPresuEstado")) {
				jButtonGuardarCambiosPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPresuEstado")) {
				jButtonRecargarInformacionPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPresuEstado")) {
				jButtonRecargarInformacionPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPresuEstado")) {
				jButtonRecargarInformacionPresuEstadoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPresuEstado")) {
				jButtonAnterioresPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPresuEstado")) {
				jButtonAnterioresPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePresuEstado")) {
				jButtonAnterioresPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPresuEstado")) {
				jButtonSiguientesPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPresuEstado")) {
				jButtonSiguientesPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPresuEstado")) {
				jButtonSiguientesPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPresuEstado") || sTipo.equals("MenuItemDetalleAbrirOrderByPresuEstado")) {
				jButtonAbrirOrderByPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPresuEstado") || sTipo.equals("MenuItemDetalleMostrarOcultarPresuEstado")) {
				jButtonMostrarOcultarPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPresuEstado")) {
				jButtonNuevoGuardarCambiosPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPresuEstado")) {
				jButtonNuevoGuardarCambiosPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPresuEstado")) {
				jButtonNuevoGuardarCambiosPresuEstadoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPresuEstado")) {
				jButtonCerrarReporteDinamicoPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPresuEstado")) {
				jButtonGenerarReporteDinamicoPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPresuEstado")) {
				
				jButtonGenerarExcelReporteDinamicoPresuEstadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPresuEstado")) {
				jButtonCerrarImportacionPresuEstadoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPresuEstado")) {
				
				jButtonGenerarImportacionPresuEstadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPresuEstado")) {
				
				jButtonAbrirImportacionPresuEstadoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPresuEstado")) {
				jComboBoxTiposAccionesPresuEstadoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPresuEstado")) {
				jComboBoxTiposRelacionesPresuEstadoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPresuEstado")) {
				jComboBoxTiposAccionesPresuEstadoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPresuEstado")) {
				
				jComboBoxTiposSeleccionarPresuEstadoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPresuEstado")) {
				jTextFieldValorCampoGeneralPresuEstadoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPresuEstado")) {
				jButtonAbrirOrderByPresuEstadoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPresuEstado")) {
				jButtonAbrirOrderByPresuEstadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPresuEstado")) {
				jButtonCerrarOrderByPresuEstadoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuEstadoBusqueda")) {
				this.jButtonidPresuEstadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePresuEstadoBusqueda")) {
				this.jButtonnombrePresuEstadoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPresuEstado();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuEstadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				


				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuEstado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuEstado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PresuEstado presuestadoLocal=null;
			
			if(!this.getEsControlTabla()) {
				presuestadoLocal=this.presuestado;
			} else {
				presuestadoLocal=this.presuestadoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
							
				
				


				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuEstado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuEstado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuEstadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestadoAnterior =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuestadoAnterior =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
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
			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			
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
			
			


			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuEstadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
								
						
				


				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuEstado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuEstado.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
								
				
				


				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuEstado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuEstado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuEstadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestadoAnterior =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuestadoAnterior =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuEstadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestadoAnterior =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuestadoAnterior =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuEstadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
							
				
				


				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuEstado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuEstado.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuEstadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuestadoAnterior =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presuestadoAnterior =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
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
			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			
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
			
			


			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuEstadoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
								
				
				


				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuEstado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuEstado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuEstadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestadoAnterior =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuestadoAnterior =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuEstadoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
			
			this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuEstadoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPresuEstado")) {
					jCheckBoxSeleccionarTodosPresuEstadoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPresuEstado")) {
					jCheckBoxSeleccionadosPresuEstadoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPresuEstado")) {
					
				}
				
				


				
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuEstado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuEstado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
												
				
				


				
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuEstado.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuEstado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuEstadoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.presuestadoAnterior =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.presuestadoAnterior =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuEstadoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
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
			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
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
			
			


			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPresuEstadoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuEstado.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuEstado.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.presuestado);
				
				this.actualizarInformacion("INFO_PADRE",false,this.presuestado);
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
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
				
				


				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PresuEstado.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PresuEstado.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPresuEstadoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.presuestadoAnterior =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.presuestadoAnterior =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPresuEstado")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPresuEstadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPresuEstado.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.presuestado =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.presuestado =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.presuestado);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPresuEstado")) {
				
				}
				
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPresuEstado")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPresuEstado.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPresuEstado")) {
			
			}
			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPresuEstado();
			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			
			if(sTipo.equals("NuevoPresuEstado")) {
				jButtonNuevoPresuEstadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPresuEstado")) {
				jButtonDuplicarPresuEstadoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPresuEstado")) {
				jButtonCopiarPresuEstadoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPresuEstado")) {
				jButtonVerFormPresuEstadoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPresuEstado")) {
				jButtonNuevoPresuEstadoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPresuEstado")) {
				jButtonModificarPresuEstadoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPresuEstado")) {
				jButtonActualizarPresuEstadoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPresuEstado")) {
				jButtonEliminarPresuEstadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPresuEstado")) {
				jButtonGuardarCambiosPresuEstadoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPresuEstado")) {
				jButtonCancelarPresuEstadoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPresuEstado")) {
				jButtonCerrarPresuEstadoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPresuEstado")) {
				jButtonGuardarCambiosPresuEstadoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPresuEstado")) {
				jButtonNuevoGuardarCambiosPresuEstadoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPresuEstado")) {
				jButtonAbrirOrderByPresuEstadoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPresuEstado")) {
				jButtonRecargarInformacionPresuEstadoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPresuEstado")) {
				jButtonAnterioresPresuEstadoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPresuEstado")) {
				jButtonSiguientesPresuEstadoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPresuEstadoBusqueda")) {
				this.jButtonidPresuEstadoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrePresuEstadoBusqueda")) {
				this.jButtonnombrePresuEstadoBusquedaActionPerformed(evt);
			}
			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPresuEstado();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePresuEstado")) {
				closingInternalFramePresuEstado();
				
			} else if(sTipo.equals("jButtonCancelarPresuEstado")) {
				JInternalFrameBase jInternalFrameDetalleFormPresuEstado = (JInternalFrameBase)evt.getSource();
	            	
	            PresuEstadoBeanSwingJInternalFrame jInternalFrameParent=(PresuEstadoBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuEstado.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPresuEstadoActionPerformed(null);
			}
			
			PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.presuestado,new Object(),this.presuestadoParameterGeneral,this.presuestadoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPresuEstado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPresuEstado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPresuEstado(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.presuestado)) {
			if(!esControlTabla) {
				if(PresuEstadoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPresuEstado(this.presuestado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuEstado(this.presuestado);			
				}
				
				if(this.presuestadoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPresuEstado(this.presuestado,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presuestadoReturnGeneral=presuestadoLogic.procesarEventosPresuEstadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuestadoLogic.getPresuEstados(),this.presuestado,this.presuestadoParameterGeneral,this.isEsNuevoPresuEstado,classes);//this.presuestadoLogic.getPresuEstado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPresuEstado(this.presuestadoReturnGeneral,this.presuestadoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.presuestadoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPresuEstado(classes,this.presuestadoReturnGeneral,this.presuestadoBean,false);
					}
						
					if(this.presuestadoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPresuEstado(this.presuestadoReturnGeneral.getPresuEstado());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPresuEstado(this.presuestadoReturnGeneral.getPresuEstado());	
					}
						
					if(this.presuestadoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPresuEstado(this.presuestadoReturnGeneral.getPresuEstado(),classes);//this.presuestadoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPresuEstado(this.presuestado,classes);//this.presuestadoBean);									
				}
			
				if(PresuEstadoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPresuEstado(this.presuestado,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPresuEstado(this.presuestado);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.presuestadoAnterior!=null) {
						this.presuestado=this.presuestadoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.presuestadoReturnGeneral=presuestadoLogic.procesarEventosPresuEstadosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuestadoLogic.getPresuEstados(),this.presuestado,this.presuestadoParameterGeneral,this.isEsNuevoPresuEstado,classes);//this.presuestadoLogic.getPresuEstado()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.presuestadoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.presuestadoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.presuestadoReturnGeneral.getPresuEstado(),presuestadoLogic.getPresuEstados());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.presuestadoReturnGeneral.getPresuEstado(),this.presuestados);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPresuEstado.repaint();
				
				//((AbstractTableModel) this.jTableDatosPresuEstado.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPresuEstado();
			}
		}
	}
	
	public void actualizarVisualTableDatosPresuEstado() throws Exception {
		
		PresuEstadoModel presuestadoModel=(PresuEstadoModel)this.jTableDatosPresuEstado.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			presuestadoModel.presuestados=this.presuestadoLogic.getPresuEstados();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			presuestadoModel.presuestados=this.presuestados;
		}
		
		
		((PresuEstadoModel) this.jTableDatosPresuEstado.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPresuEstado() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpresuestadoAnterior(),this.presuestadoLogic.getPresuEstados());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpresuestadoAnterior(),this.presuestados);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPresuEstado();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPresuEstado(PresuEstado presuestado,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
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
										
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuestado,new Object(),generalEntityParameterGeneral,this.presuestadoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.presuestadoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PresuEstadoConstantesFunciones.getClassesRelationshipsOfPresuEstado(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PresuEstadoConstantesFunciones.getClassesRelationshipsFromStringsOfPresuEstado(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPresuEstado(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PresuEstadoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.presuestado,new Object(),generalEntityParameterGeneral,this.presuestadoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPresuEstado(PresuEstadoBean presuestadoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPresuEstado(ArrayList<Classe> classes,PresuEstadoReturnGeneral presuestadoReturnGeneral,PresuEstadoBean presuestadoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPresuEstado(PresuEstado presuestado,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.presuestado)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPresuEstado = new PresuEstadoDetalleFormJInternalFrame(jDesktopPane,this.presuestadoSessionBean.getConGuardarRelaciones(),this.presuestadoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPresuEstado);
		this.jInternalFrameDetalleFormPresuEstado.setVisible(false);
		this.jInternalFrameDetalleFormPresuEstado.setSelected(false);						
		
		this.jInternalFrameDetalleFormPresuEstado.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPresuEstado.presuestadoLogic=this.presuestadoLogic;
		
		this.cargarCombosFrameForeignKeyPresuEstado("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePresuEstado();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePresuEstado();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPresuEstado("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPresuEstado();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPresuEstado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuEstado"));
		
		this.jInternalFrameDetalleFormPresuEstado.jButtonModificarPresuEstado.addActionListener(new ButtonActionListener(this,"ModificarPresuEstado"));

		
		this.jInternalFrameDetalleFormPresuEstado.jButtonModificarToolBarPresuEstado.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuEstado"));
					
		this.jInternalFrameDetalleFormPresuEstado.jMenuItemModificarPresuEstado.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuEstado"));		
		
		
		
		this.jInternalFrameDetalleFormPresuEstado.jButtonActualizarPresuEstado.addActionListener (new ButtonActionListener(this,"ActualizarPresuEstado"));
		
		
		this.jInternalFrameDetalleFormPresuEstado.jButtonActualizarToolBarPresuEstado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuEstado"));
						
		this.jInternalFrameDetalleFormPresuEstado.jMenuItemActualizarPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuEstado"));		
		
		
		
		this.jInternalFrameDetalleFormPresuEstado.jButtonEliminarPresuEstado.addActionListener (new ButtonActionListener(this,"EliminarPresuEstado"));
		
		
		this.jInternalFrameDetalleFormPresuEstado.jButtonEliminarToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuEstado"));
								
		this.jInternalFrameDetalleFormPresuEstado.jMenuItemEliminarPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuEstado"));		
		
		
		
		this.jInternalFrameDetalleFormPresuEstado.jButtonCancelarPresuEstado.addActionListener (new ButtonActionListener(this,"CancelarPresuEstado"));
		
		
		this.jInternalFrameDetalleFormPresuEstado.jButtonCancelarToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuEstado"));
					
		this.jInternalFrameDetalleFormPresuEstado.jMenuItemCancelarPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuEstado"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPresuEstado.jMenuItemDetalleCerrarPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuEstado"));		
		
		
		
		this.jInternalFrameDetalleFormPresuEstado.jButtonGuardarCambiosToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuEstado"));
		
		
		
		this.jInternalFrameDetalleFormPresuEstado.jButtonGuardarCambiosToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuEstado"));
		
		
		
		this.jInternalFrameDetalleFormPresuEstado.jComboBoxTiposAccionesFormularioPresuEstado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuEstado"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuEstado.jButtonidPresuEstadoBusqueda.addActionListener(new ButtonActionListener(this,"idPresuEstadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuEstado.jButtonnombrePresuEstadoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuEstadoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPresuEstado.jTabbedPaneRelacionesPresuEstado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuEstado"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePresuEstado"));
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPresuEstado"));
		}
		
		this.jTableDatosPresuEstado.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPresuEstado"));
		
		this.jTableDatosPresuEstado.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPresuEstado"));
		
		this.jButtonNuevoPresuEstado.addActionListener(new ButtonActionListener(this,"NuevoPresuEstado"));
		
		this.jButtonDuplicarPresuEstado.addActionListener(new ButtonActionListener(this,"DuplicarPresuEstado"));
		
		this.jButtonCopiarPresuEstado.addActionListener(new ButtonActionListener(this,"CopiarPresuEstado"));
		
		this.jButtonVerFormPresuEstado.addActionListener(new ButtonActionListener(this,"VerFormPresuEstado"));
		
		
		this.jButtonNuevoToolBarPresuEstado.addActionListener(new ButtonActionListener(this,"NuevoToolBarPresuEstado"));
			
		this.jButtonDuplicarToolBarPresuEstado.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPresuEstado"));
			
		this.jMenuItemNuevoPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPresuEstado"));
			
		this.jMenuItemDuplicarPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPresuEstado"));		
		
		
		this.jButtonNuevoRelacionesPresuEstado.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPresuEstado"));
		
		
		this.jButtonNuevoRelacionesToolBarPresuEstado.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPresuEstado"));
			
		this.jMenuItemNuevoRelacionesPresuEstado.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPresuEstado"));		
		
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.jButtonModificarPresuEstado.addActionListener(new ButtonActionListener(this,"ModificarPresuEstado"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.jButtonModificarToolBarPresuEstado.addActionListener(new ButtonActionListener(this,"ModificarToolBarPresuEstado"));
			
			this.jInternalFrameDetalleFormPresuEstado.jMenuItemModificarPresuEstado.addActionListener(new ButtonActionListener(this,"MenuItemModificarPresuEstado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPresuEstado.jButtonActualizarPresuEstado.addActionListener (new ButtonActionListener(this,"ActualizarPresuEstado"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.jButtonActualizarToolBarPresuEstado.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPresuEstado"));
				
			this.jInternalFrameDetalleFormPresuEstado.jMenuItemActualizarPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPresuEstado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.jButtonEliminarPresuEstado.addActionListener (new ButtonActionListener(this,"EliminarPresuEstado"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.jButtonEliminarToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"EliminarToolBarPresuEstado"));
						
			this.jInternalFrameDetalleFormPresuEstado.jMenuItemEliminarPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPresuEstado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.jButtonCancelarPresuEstado.addActionListener (new ButtonActionListener(this,"CancelarPresuEstado"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.jButtonCancelarToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"CancelarToolBarPresuEstado"));
			
			this.jInternalFrameDetalleFormPresuEstado.jMenuItemCancelarPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPresuEstado"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPresuEstado"));		
		
		
		this.jButtonCerrarPresuEstado.addActionListener (new ButtonActionListener(this,"CerrarPresuEstado"));
		
		
		this.jButtonCerrarToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"CerrarToolBarPresuEstado"));
			
		this.jMenuItemCerrarPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPresuEstado"));
			
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.jMenuItemDetalleCerrarPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPresuEstado"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.jButtonGuardarCambiosPresuEstado.addActionListener (new ButtonActionListener(this,"GuardarCambiosPresuEstado"));
		}
		
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.jButtonGuardarCambiosToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPresuEstado"));
		}
		
		this.jButtonCopiarToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"CopiarToolBarPresuEstado"));
			
		this.jButtonVerFormToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"VerFormToolBarPresuEstado"));
		
		this.jMenuItemGuardarCambiosPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPresuEstado"));
			
		this.jMenuItemCopiarPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPresuEstado"));		
		
		this.jMenuItemVerFormPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPresuEstado"));		
		
		
		this.jButtonGuardarCambiosTablaPresuEstado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuEstado"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPresuEstado"));
			
		this.jMenuItemGuardarCambiosTablaPresuEstado.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPresuEstado"));		
		
		
		
		this.jButtonRecargarInformacionPresuEstado.addActionListener (new ButtonActionListener(this,"RecargarInformacionPresuEstado"));
					
		this.jButtonRecargarInformacionToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPresuEstado"));
		
		this.jMenuItemRecargarInformacionPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPresuEstado"));		
		
		
		
		this.jButtonAnterioresPresuEstado.addActionListener (new ButtonActionListener(this,"AnterioresPresuEstado"));
		
		
		this.jButtonAnterioresToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPresuEstado"));
		
		this.jMenuItemAnterioresPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPresuEstado"));		
		
		
		this.jButtonSiguientesPresuEstado.addActionListener (new ButtonActionListener(this,"SiguientesPresuEstado"));
		
		
		this.jButtonSiguientesToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPresuEstado"));
			
		this.jMenuItemSiguientesPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPresuEstado"));
			
		this.jMenuItemAbrirOrderByPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPresuEstado"));
			
		this.jMenuItemMostrarOcultarPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPresuEstado"));
			
		this.jMenuItemDetalleAbrirOrderByPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPresuEstado"));
			
		this.jMenuItemDetalleMostarOcultarPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPresuEstado"));		
		
		
		this.jButtonNuevoGuardarCambiosPresuEstado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPresuEstado"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPresuEstado"));
			
		this.jMenuItemNuevoGuardarCambiosPresuEstado.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPresuEstado"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPresuEstado.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPresuEstado"));

		this.jCheckBoxSeleccionadosPresuEstado.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPresuEstado"));
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.jComboBoxTiposAccionesFormularioPresuEstado.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPresuEstado"));
		}
		
		
		this.jComboBoxTiposRelacionesPresuEstado.addActionListener (new ButtonActionListener(this,"TiposRelacionesPresuEstado"));
			
		this.jComboBoxTiposAccionesPresuEstado.addActionListener (new ButtonActionListener(this,"TiposAccionesPresuEstado"));
					
		this.jComboBoxTiposSeleccionarPresuEstado.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPresuEstado"));
			
		this.jTextFieldValorCampoGeneralPresuEstado.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPresuEstado"));		
		
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuEstado.jButtonidPresuEstadoBusqueda.addActionListener(new ButtonActionListener(this,"idPresuEstadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuEstado.jButtonnombrePresuEstadoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuEstadoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPresuEstado!=null) {
				this.jInternalFrameReporteDinamicoPresuEstado.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuEstado"));
				this.jInternalFrameReporteDinamicoPresuEstado.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuEstado"));
				this.jInternalFrameReporteDinamicoPresuEstado.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuEstado"));
			}
			
			//this.jButtonCerrarReporteDinamicoPresuEstado.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPresuEstado"));				
			//this.jButtonGenerarReporteDinamicoPresuEstado.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPresuEstado"));
			//this.jButtonGenerarExcelReporteDinamicoPresuEstado.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPresuEstado"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPresuEstado!=null) {
				this.jInternalFrameImportacionPresuEstado.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPresuEstado"));
				this.jInternalFrameImportacionPresuEstado.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPresuEstado"));
				this.jInternalFrameImportacionPresuEstado.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPresuEstado"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPresuEstado.addActionListener (new ButtonActionListener(this,"AbrirOrderByPresuEstado"));
			
			this.jButtonAbrirOrderByToolBarPresuEstado.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPresuEstado"));			
			
			if(this.jInternalFrameOrderByPresuEstado!=null) {
				this.jInternalFrameOrderByPresuEstado.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPresuEstado"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPresuEstado!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPresuEstado.jTabbedPaneRelacionesPresuEstado.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPresuEstado"));
		
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
            		closingInternalFramePresuEstado();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPresuEstado.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPresuEstado = (JInternalFrameBase)event.getSource();
	            	
	            PresuEstadoBeanSwingJInternalFrame jInternalFrameParent=(PresuEstadoBeanSwingJInternalFrame)jInternalFrameDetalleFormPresuEstado.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPresuEstadoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPresuEstado.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPresuEstadoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPresuEstado.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPresuEstado.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuEstadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuEstadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuEstadoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPresuEstado";
		inputMap = this.jButtonNuevoPresuEstado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPresuEstado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuEstadoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuEstadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuEstadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPresuEstadoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPresuEstado";
		inputMap = this.jButtonNuevoRelacionesPresuEstado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPresuEstado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPresuEstadoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPresuEstado";
		inputMap = this.jButtonModificarPresuEstado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPresuEstado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPresuEstadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPresuEstado";
		inputMap = this.jButtonActualizarPresuEstado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPresuEstado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPresuEstadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPresuEstado";
		inputMap = this.jButtonEliminarPresuEstado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPresuEstado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPresuEstadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPresuEstado";
		inputMap = this.jButtonCancelarPresuEstado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPresuEstado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPresuEstadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPresuEstado";
		inputMap = this.jButtonCerrarPresuEstado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPresuEstado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPresuEstadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPresuEstado.jButtonGuardarCambiosPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPresuEstado";
		inputMap = this.jInternalFrameDetalleFormPresuEstado.jButtonGuardarCambiosPresuEstado.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPresuEstado.jButtonGuardarCambiosPresuEstado.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPresuEstadoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPresuEstado.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPresuEstadoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPresuEstado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPresuEstadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPresuEstado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPresuEstadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPresuEstado.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPresuEstadoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuEstado.jButtonidPresuEstadoBusqueda.addActionListener(new ButtonActionListener(this,"idPresuEstadoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPresuEstado.jButtonnombrePresuEstadoBusqueda.addActionListener(new ButtonActionListener(this,"nombrePresuEstadoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPresuEstado.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPresuEstadoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPresuEstadoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPresuEstado.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPresuEstado(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PresuEstado presuestadoAux:this.presuestadoLogic.getPresuEstados()) {
					presuestadoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuEstado presuestadoAux:presuestados) {
					presuestadoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPresuEstadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuEstado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuEstado presuestadoAux:this.presuestadoLogic.getPresuEstados()) {
						presuestadoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuEstado presuestadoAux:presuestados) {
						presuestadoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PresuEstado presuestadoAux:this.presuestadoLogic.getPresuEstados()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuEstado presuestadoAux:presuestados) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPresuEstado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuEstado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuEstado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuEstado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPresuEstadoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPresuEstado(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPresuEstado.getSelectedRows();
			
			PresuEstado presuestadoLocal=new PresuEstado();
			
			//this.seleccionarTodosPresuEstado(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					presuestadoLocal =(PresuEstado) this.presuestadoLogic.getPresuEstados().toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					presuestadoLocal =(PresuEstado) this.presuestados.toArray()[this.jTableDatosPresuEstado.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				presuestadoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PresuEstado presuestadoAux:this.presuestadoLogic.getPresuEstados()) {
						presuestadoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PresuEstado presuestadoAux:presuestados) {
						presuestadoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPresuEstado(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPresuEstado.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPresuEstado.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPresuEstado,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPresuEstadoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPresuEstadoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPresuEstadoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPresuEstado(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPresuEstado.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PresuEstado presuestadoAux:this.presuestadoLogic.getPresuEstados()) {
				
						if(sTipoSeleccionar.equals(PresuEstadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							presuestadoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuEstado presuestadoAux:presuestados) {
					
						if(sTipoSeleccionar.equals(PresuEstadoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							presuestadoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPresuEstado(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPresuEstadoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPresuEstado(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPresuEstado=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPresuEstado.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPresuEstado.jComboBoxTiposAccionesFormularioPresuEstado.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePresuEstado) {				
					conSplash=true;//false;										
					
					//this.startProcessPresuEstado(conSplash);
				
					this.generarReportePresuEstadosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuEstado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuEstado.jComboBoxTiposAccionesFormularioPresuEstado.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPresuEstadosSeleccionados();
				//this.jComboBoxTiposAccionesPresuEstado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuEstadosSeleccionados(false);
				//this.jComboBoxTiposAccionesPresuEstado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPresuEstadosSeleccionados(true);
				//this.jComboBoxTiposAccionesPresuEstado.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuEstado();
				
				this.exportarPresuEstadosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuEstado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuEstado.jComboBoxTiposAccionesFormularioPresuEstado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPresuEstados();
				//this.importarPresuEstados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuEstado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuEstado.jComboBoxTiposAccionesFormularioPresuEstado.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPresuEstado();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPresuEstadosSeleccionados();
				//this.jComboBoxTiposAccionesPresuEstado.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPresuEstado();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPresuEstado)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPresuEstado(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPresuEstado.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPresuEstado.jComboBoxTiposAccionesFormularioPresuEstado.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPresuEstado();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPresuEstado(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPresuEstadoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPresuEstado();
			
			if(this.jInternalFrameDetalleFormPresuEstado==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();		
			PresuEstado presuestado=new PresuEstado();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPresuEstado(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPresuEstado.getSelectedItem();
			
			
			
			
			presuestadosSeleccionados=this.getPresuEstadosSeleccionados(true);
			//this.sTipoAccion;
			
			if(presuestadosSeleccionados.size()==1) {
				for(PresuEstado presuestadoAux:presuestadosSeleccionados) {
					presuestado=presuestadoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPresuEstado();
			
      		//this.finishProcessPresuEstado(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPresuEstadoReturnGeneral() throws Exception {
		if(this.presuestadoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.presuestadoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.presuestadoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.presuestadoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.presuestadoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.presuestadoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPresuEstado(false);
		}
		
		if(this.presuestadoReturnGeneral.getConRetornoLista() || this.presuestadoReturnGeneral.getConRetornoObjeto()) {
			if(this.presuestadoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presuestadoLogic.setPresuEstados(this.presuestadoReturnGeneral.getPresuEstados());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.presuestadoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.presuestadoLogic.setPresuEstado(this.presuestadoReturnGeneral.getPresuEstado());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPresuEstado(false);
		}
	}
	
	public void actualizarParametrosGeneralPresuEstado() throws Exception {
		
		
	}
	
	public ArrayList<PresuEstado> getPresuEstadosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPresuEstado) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PresuEstado presuestadoAux:presuestadoLogic.getPresuEstados()) {
					if(presuestadoAux.getIsSelected()) {
						presuestadosSeleccionados.add(presuestadoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PresuEstado presuestadoAux:this.presuestados) {
					if(presuestadoAux.getIsSelected()) {
						presuestadosSeleccionados.add(presuestadoAux);				
					}
				}
			}
			
			if(presuestadosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						presuestadosSeleccionados.addAll(this.presuestadoLogic.getPresuEstados());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						presuestadosSeleccionados.addAll(this.presuestados);				
					}
				}
			}
		} else {
			presuestadosSeleccionados.add(this.presuestado);
		}
		
		return presuestadosSeleccionados;
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
	
	public void generarReportePresuEstadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPresuEstadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPresuEstadosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuEstadosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPresuEstadosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPresuEstadosSeleccionados() throws Exception {
		ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();		
		
		presuestadosSeleccionados=this.getPresuEstadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePresuEstados("Todos",presuestadosSeleccionados);
		
	}	
	
	public void generarReporteNormalPresuEstadosSeleccionados() throws Exception {
		ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();		
		
		presuestadosSeleccionados=this.getPresuEstadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePresuEstados("Todos",presuestadosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPresuEstadosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();
		
		presuestadosSeleccionados=this.getPresuEstadosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePresuEstados("Todos",presuestadosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPresuEstadosSeleccionados() throws Exception {
		ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPresuEstado();
		
		
		presuestadosSeleccionados=this.getPresuEstadosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPresuEstado();
		
		
		//this.generarReportePresuEstados("Todos",presuestadosSeleccionados ,presuestadoImplementable,presuestadoImplementableHome);
	}
	
	public void mostrarImportacionPresuEstados() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPresuEstado();
		
		this.abrirFrameImportacionPresuEstado();		
		
			
		//this.generarReportePresuEstados("Todos",presuestadosSeleccionados ,presuestadoImplementable,presuestadoImplementableHome);
	}
	
	public void importarPresuEstados() throws Exception {		
	
	}
	
	public void exportarPresuEstadosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPresuEstadosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPresuEstadosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPresuEstadosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPresuEstadosSeleccionados() throws Exception {
		ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();		
		
		presuestadosSeleccionados=this.getPresuEstadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuestado."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPresuEstado(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PresuEstado presuestadoAux:presuestadosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPresuEstado(presuestadoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//presuestadoAux.setsDetalleGeneralEntityReporte(presuestadoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPresuEstado(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PresuEstadoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuEstadoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PresuEstadoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPresuEstado(PresuEstado presuestado,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=presuestado.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=presuestado.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=presuestado.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPresuEstadosSeleccionados() throws Exception {
		ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();		
		
		presuestadosSeleccionados=this.getPresuEstadosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuestado.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PresuEstados");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPresuEstado(row);				
				iRow++;
			}				
			
			for(PresuEstado presuestadoAux:presuestadosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPresuEstado(presuestadoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPresuEstadosSeleccionados() throws Exception {
		ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();		
		
		presuestadosSeleccionados=this.getPresuEstadosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"presuestado.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("presuestados");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("presuestado");
			//elementRoot.appendChild(element);
		
			for(PresuEstado presuestadoAux:presuestadosSeleccionados) {
				element = document.createElement("presuestado");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPresuEstado(presuestadoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPresuEstado(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PresuEstadoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PresuEstadoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PresuEstadoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPresuEstado(PresuEstado presuestado,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(presuestado.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(presuestado.getnombre());				
	}
	
	public void setFilaDatosExportarXmlPresuEstado(PresuEstado presuestado,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PresuEstadoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(presuestado.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PresuEstadoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(presuestado.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(PresuEstadoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(presuestado.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoPresuEstadosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PresuEstado> presuestadosSeleccionados=new ArrayList<PresuEstado>();
		
		presuestadosSeleccionados=this.getPresuEstadosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPresuEstado(presuestadosSeleccionados);
		
		this.generarReportePresuEstados("Todos",presuestadosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPresuEstado(ArrayList<PresuEstado> presuestadosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PresuEstado presuestadoAux:presuestadosSeleccionados) {
				presuestadoAux.setsDetalleGeneralEntityReporte(presuestadoAux.toString());
			
				if(sTipoSeleccionar.equals(PresuEstadoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					presuestadoAux.setsDescripcionGeneralEntityReporte1(presuestadoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PresuEstadoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPresuEstado(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPresuEstado=true;
				this.isVisibilidadCeldaNuevoRelacionesPresuEstado=true;
				this.isVisibilidadCeldaGuardarCambiosPresuEstado=true;
			}
			
			this.isVisibilidadCeldaModificarPresuEstado=false;
			this.isVisibilidadCeldaActualizarPresuEstado=false;
			this.isVisibilidadCeldaEliminarPresuEstado=false;
			this.isVisibilidadCeldaCancelarPresuEstado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuEstado=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuEstado=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPresuEstado=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuEstado=false;
			this.isVisibilidadCeldaGuardarCambiosPresuEstado=false;
			this.isVisibilidadCeldaModificarPresuEstado=false;
			this.isVisibilidadCeldaActualizarPresuEstado=true;
			this.isVisibilidadCeldaEliminarPresuEstado=false;
			this.isVisibilidadCeldaCancelarPresuEstado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuEstado=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuEstado=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPresuEstado=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuEstado=false;
			this.isVisibilidadCeldaGuardarCambiosPresuEstado=false;
			this.isVisibilidadCeldaModificarPresuEstado=false;
			this.isVisibilidadCeldaActualizarPresuEstado=true;
			this.isVisibilidadCeldaEliminarPresuEstado=true;
			this.isVisibilidadCeldaCancelarPresuEstado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuEstado=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuEstado=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPresuEstado=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuEstado=false;
			this.isVisibilidadCeldaGuardarCambiosPresuEstado=false;
			this.isVisibilidadCeldaModificarPresuEstado=false;
			this.isVisibilidadCeldaActualizarPresuEstado=true;
			this.isVisibilidadCeldaEliminarPresuEstado=false;
			this.isVisibilidadCeldaCancelarPresuEstado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuEstado=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuEstado=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPresuEstado=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuEstado=true;
			this.isVisibilidadCeldaGuardarCambiosPresuEstado=true;
			this.isVisibilidadCeldaModificarPresuEstado=false;
			this.isVisibilidadCeldaActualizarPresuEstado=false;
			this.isVisibilidadCeldaEliminarPresuEstado=false;
			this.isVisibilidadCeldaCancelarPresuEstado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuEstado=true;
				} else {
					this.isVisibilidadCeldaGuardarPresuEstado=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPresuEstado=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuEstado=false;
			this.isVisibilidadCeldaGuardarCambiosPresuEstado=false;
			this.isVisibilidadCeldaActualizarPresuEstado=false;
			this.isVisibilidadCeldaEliminarPresuEstado=false;
			this.isVisibilidadCeldaCancelarPresuEstado=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuEstado=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuEstado=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPresuEstado=false;
			this.isVisibilidadCeldaNuevoRelacionesPresuEstado=false;
			this.isVisibilidadCeldaGuardarCambiosPresuEstado=false;
			this.isVisibilidadCeldaModificarPresuEstado=true;
			this.isVisibilidadCeldaActualizarPresuEstado=false;
			this.isVisibilidadCeldaEliminarPresuEstado=false;
			this.isVisibilidadCeldaCancelarPresuEstado=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPresuEstado=false;
				} else {
					this.isVisibilidadCeldaGuardarPresuEstado=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PresuEstadoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPresuEstado=true;
			this.isVisibilidadCeldaNuevoRelacionesPresuEstado=true;
			this.isVisibilidadCeldaGuardarCambiosPresuEstado=true;
		} else {
			this.actualizarEstadoPanelsPresuEstado(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPresuEstado=false;
			//this.isVisibilidadCeldaVerFormPresuEstado=false;
			this.isVisibilidadCeldaDuplicarPresuEstado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!presuestadoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPresuEstado=false;
		} else {
			this.isVisibilidadCeldaNuevoPresuEstado=false;
			this.isVisibilidadCeldaGuardarCambiosPresuEstado=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(presuestadoSessionBean.getEsGuardarRelacionado()) {
			if(!presuestadoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPresuEstado=false;												
			}
			
			this.jButtonCerrarPresuEstado.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPresuEstado=false;
		}
		
		if(!this.permiteMantenimiento(this.presuestado)) {
			this.isVisibilidadCeldaActualizarPresuEstado=false;
			this.isVisibilidadCeldaEliminarPresuEstado=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPresuEstado() {
	}
	
	public void actualizarEstadoPanelsPresuEstado(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPresuEstado!=null) {
				this.jScrollPanelDatosEdicionPresuEstado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuEstado!=null) {
				this.jScrollPanelDatosPresuEstado.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuEstado!=null) {
				this.jPanelPaginacionPresuEstado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuEstado!=null) {
				this.jPanelParametrosReportesPresuEstado.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPresuEstado!=null) {
				this.jScrollPanelDatosEdicionPresuEstado.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosPresuEstado!=null) {
				this.jScrollPanelDatosPresuEstado.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuEstado!=null) {
				this.jPanelPaginacionPresuEstado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuEstado!=null) {
				this.jPanelParametrosReportesPresuEstado.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPresuEstado!=null) {
				this.jScrollPanelDatosEdicionPresuEstado.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosPresuEstado!=null) {
				this.jScrollPanelDatosPresuEstado.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuEstado!=null) {
				this.jPanelPaginacionPresuEstado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuEstado!=null) {
				this.jPanelParametrosReportesPresuEstado.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPresuEstado!=null) {
				this.jScrollPanelDatosEdicionPresuEstado.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPresuEstado!=null) {
				this.jScrollPanelDatosPresuEstado.setVisible(false);
			}
			
			if(this.jPanelPaginacionPresuEstado!=null) {
				this.jPanelPaginacionPresuEstado.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPresuEstado!=null) {
				this.jPanelParametrosReportesPresuEstado.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPresuEstado!=null) {
				this.jScrollPanelDatosEdicionPresuEstado.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPresuEstado!=null) {
				this.jScrollPanelDatosPresuEstado.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuEstado!=null) {
				this.jPanelPaginacionPresuEstado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuEstado!=null) {
				this.jPanelParametrosReportesPresuEstado.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPresuEstado!=null) {
				this.jScrollPanelDatosEdicionPresuEstado.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosPresuEstado!=null) {
				this.jScrollPanelDatosPresuEstado.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuEstado!=null) {
				this.jPanelPaginacionPresuEstado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuEstado!=null) {
				this.jPanelParametrosReportesPresuEstado.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPresuEstado!=null) {
				this.jScrollPanelDatosEdicionPresuEstado.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosPresuEstado!=null) {
				this.jScrollPanelDatosPresuEstado.setVisible(true);
			}
			
			if(this.jPanelPaginacionPresuEstado!=null) {
				this.jPanelPaginacionPresuEstado.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPresuEstado!=null) {
				this.jPanelParametrosReportesPresuEstado.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.presuestadoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.presuestadoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PresuEstadoSessionBean presuestadoSessionBean=new PresuEstadoSessionBean();
		
		if(this.presuestadoSessionBean==null) {
			this.presuestadoSessionBean=new PresuEstadoSessionBean();
		}
		
		this.presuestadoSessionBean.setsUltimaBusquedaPresuEstado(this.getsAccionBusqueda());
		this.presuestadoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.presuestadoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PresuEstadoSessionBean presuestadoSessionBean=new PresuEstadoSessionBean();
		
		if(this.presuestadoSessionBean==null) {
			this.presuestadoSessionBean=new PresuEstadoSessionBean();
		}
		
		if(this.presuestadoSessionBean.getsUltimaBusquedaPresuEstado()!=null&&!this.presuestadoSessionBean.getsUltimaBusquedaPresuEstado().equals("")) {
			this.setsAccionBusqueda(presuestadoSessionBean.getsUltimaBusquedaPresuEstado());
			this.setiNumeroPaginacion(presuestadoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(presuestadoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.presuestadoSessionBean.setsUltimaBusquedaPresuEstado("");
		this.presuestadoSessionBean.setiNumeroPaginacion(PresuEstadoConstantesFunciones.INUMEROPAGINACION);
		this.presuestadoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPresuEstado(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPresuEstado() {
		this.updateBorderResaltarBusquedasFormularioPresuEstado();
		this.updateVisibilidadBusquedasFormularioPresuEstado();
		this.updateHabilitarBusquedasFormularioPresuEstado();
	}
	
	public void updateBorderResaltarBusquedasFormularioPresuEstado() {					
	}
	
	public void updateVisibilidadBusquedasFormularioPresuEstado() {
	}
	
	public void updateHabilitarBusquedasFormularioPresuEstado() {
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
	
	public void updateControlesFormularioPresuEstado() throws Exception {

		if(this.jInternalFrameDetalleFormPresuEstado==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPresuEstado();
		this.updateVisibilidadResaltarControlesFormularioPresuEstado();
		this.updateHabilitarResaltarControlesFormularioPresuEstado();
		
	}
	
	public void updateBorderResaltarControlesFormularioPresuEstado() throws Exception {
		if(this.jInternalFrameDetalleFormPresuEstado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.presuestadoConstantesFunciones.resaltaridPresuEstado!=null && this.jInternalFrameDetalleFormPresuEstado!=null) {this.jInternalFrameDetalleFormPresuEstado.jTextFieldidPresuEstado.setBorder(this.presuestadoConstantesFunciones.resaltaridPresuEstado);}
		if(this.presuestadoConstantesFunciones.resaltarnombrePresuEstado!=null && this.jInternalFrameDetalleFormPresuEstado!=null) {this.jInternalFrameDetalleFormPresuEstado.jTextAreanombrePresuEstado.setBorder(this.presuestadoConstantesFunciones.resaltarnombrePresuEstado);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPresuEstado() throws Exception {		
		if(this.jInternalFrameDetalleFormPresuEstado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) {
	
		//this.jInternalFrameDetalleFormPresuEstado.jTextFieldidPresuEstado.setVisible(this.presuestadoConstantesFunciones.mostraridPresuEstado);
		this.jInternalFrameDetalleFormPresuEstado.jPanelidPresuEstado.setVisible(this.presuestadoConstantesFunciones.mostraridPresuEstado);
		//this.jInternalFrameDetalleFormPresuEstado.jTextAreanombrePresuEstado.setVisible(this.presuestadoConstantesFunciones.mostrarnombrePresuEstado);
		this.jInternalFrameDetalleFormPresuEstado.jPanelnombrePresuEstado.setVisible(this.presuestadoConstantesFunciones.mostrarnombrePresuEstado);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPresuEstado() throws Exception {
		if(this.jInternalFrameDetalleFormPresuEstado==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPresuEstado!=null) {
	
		this.jInternalFrameDetalleFormPresuEstado.jTextFieldidPresuEstado.setEnabled(this.presuestadoConstantesFunciones.activaridPresuEstado);
		this.jInternalFrameDetalleFormPresuEstado.jTextAreanombrePresuEstado.setEnabled(this.presuestadoConstantesFunciones.activarnombrePresuEstado);
		}
	}
	
		
}