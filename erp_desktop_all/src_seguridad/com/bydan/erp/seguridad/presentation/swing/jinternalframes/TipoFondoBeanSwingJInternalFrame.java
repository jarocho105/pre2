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

import com.bydan.erp.seguridad.util.TipoFondoConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoFondoParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoFondoParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoFondoBean;
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
public class TipoFondoBeanSwingJInternalFrame extends TipoFondoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoFondoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoFondo> tipofondoValidator = new ClassValidator<TipoFondo>(TipoFondo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoFondo tipofondo;	
	public TipoFondo tipofondoAux;
	public TipoFondo tipofondoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoFondo tipofondoTotales;
	public Long idTipoFondoActual;
	public Long iIdNuevoTipoFondo=0L;
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
	
	public Boolean isPermisoTodoTipoFondo;
	public Boolean isPermisoNuevoTipoFondo;
	public Boolean isPermisoActualizarTipoFondo;
	public Boolean isPermisoActualizarOriginalTipoFondo;
	public Boolean isPermisoEliminarTipoFondo;
	public Boolean isPermisoGuardarCambiosTipoFondo;
	public Boolean isPermisoConsultaTipoFondo;
	public Boolean isPermisoBusquedaTipoFondo;
	public Boolean isPermisoReporteTipoFondo;
	public Boolean isPermisoPaginacionMedioTipoFondo;
	public Boolean isPermisoPaginacionAltoTipoFondo;
	public Boolean isPermisoPaginacionTodoTipoFondo;
	public Boolean isPermisoCopiarTipoFondo;
	public Boolean isPermisoVerFormTipoFondo;
	public Boolean isPermisoDuplicarTipoFondo;
	public Boolean isPermisoOrdenTipoFondo;
	
	
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
	
	public TipoFondoParameterReturnGeneral tipofondoReturnGeneral;
	public TipoFondoParameterReturnGeneral tipofondoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoFondo=false;
	public Boolean esParaAccionDesdeFormularioTipoFondo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoFondoLogic tipofondoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoFondo tipofondoBean;
	public TipoFondoConstantesFunciones tipofondoConstantesFunciones;
	//public TipoFondoParameterReturnGeneral tipofondoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoFondo> tipofondos;	
	//public List<TipoFondo> tipofondosEliminados;
	//public List<TipoFondo> tipofondosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoFondo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoFondo=true;
	public Boolean isVisibilidadCeldaCopiarTipoFondo=true;
	public Boolean isVisibilidadCeldaVerFormTipoFondo=true;
	public Boolean isVisibilidadCeldaOrdenTipoFondo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoFondo=false;
	public Boolean isVisibilidadCeldaModificarTipoFondo=false;
	public Boolean isVisibilidadCeldaActualizarTipoFondo=false;
	public Boolean isVisibilidadCeldaEliminarTipoFondo=false;
	public Boolean isVisibilidadCeldaCancelarTipoFondo=false;
	public Boolean isVisibilidadCeldaGuardarTipoFondo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoFondo=false;	
	
	
	
	public Long getiIdNuevoTipoFondo() {
		return this.iIdNuevoTipoFondo;
	}

	public void setiIdNuevoTipoFondo(Long iIdNuevoTipoFondo) {
		this.iIdNuevoTipoFondo = iIdNuevoTipoFondo;
	}
	
	public Long getidTipoFondoActual() {
		return this.idTipoFondoActual;
	}

	public void setidTipoFondoActual(Long idTipoFondoActual) {
		this.idTipoFondoActual = idTipoFondoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoFondo gettipofondo() {
		return this.tipofondo;
	}

	public void settipofondo(TipoFondo tipofondo) {
		this.tipofondo = tipofondo;
	}
	
	public TipoFondo gettipofondoAux() {
		return this.tipofondoAux;
	}

	public void settipofondoAux(TipoFondo tipofondoAux) {
		this.tipofondoAux = tipofondoAux;
	}				
	
	public TipoFondo gettipofondoAnterior() {
		return this.tipofondoAnterior;
	}

	public void settipofondoAnterior(TipoFondo tipofondoAnterior) {
		this.tipofondoAnterior = tipofondoAnterior;
	}	
	
	public TipoFondo gettipofondoTotales() {
		return this.tipofondoTotales;
	}

	public void settipofondoTotales(TipoFondo tipofondoTotales) {
		this.tipofondoTotales = tipofondoTotales;
	}	
	
	public TipoFondo gettipofondoBean() {
		return this.tipofondoBean;
	}

	public void settipofondoBean(TipoFondo tipofondoBean) {
		this.tipofondoBean = tipofondoBean;
	}	
	
	public TipoFondoParameterReturnGeneral gettipofondoReturnGeneral() {
		return this.tipofondoReturnGeneral;
	}

	public void settipofondoReturnGeneral(TipoFondoParameterReturnGeneral tipofondoReturnGeneral) {
		this.tipofondoReturnGeneral = tipofondoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoFondoLogic getTipoFondoLogic()	{		
		return tipofondoLogic;
	}

	public void setTipoFondoLogic(TipoFondoLogic tipofondoLogic) {
		this.tipofondoLogic = tipofondoLogic;
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
	
	public Boolean getIsEsNuevoTipoFondo() {
		return isEsNuevoTipoFondo;
	}

	public void setIsEsNuevoTipoFondo(Boolean isEsNuevoTipoFondo) {
		this.isEsNuevoTipoFondo = isEsNuevoTipoFondo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoFondo() {
		return esParaAccionDesdeFormularioTipoFondo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoFondo(Boolean esParaAccionDesdeFormularioTipoFondo) {
		this.esParaAccionDesdeFormularioTipoFondo = esParaAccionDesdeFormularioTipoFondo;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoFondo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoFondoConstantesFunciones.refrescarForeignKeysDescripcionesTipoFondo(this.tipofondoLogic.getTipoFondos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoFondoConstantesFunciones.refrescarForeignKeysDescripcionesTipoFondo(this.tipofondos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipofondoLogic.setTipoFondos(this.tipofondos);
			tipofondoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoFondoParameterReturnGeneral getTipoFondoParameterGeneral() {
		return this.tipofondoParameterGeneral;
	}
	
	public void setTipoFondoParameterGeneral(TipoFondoParameterReturnGeneral tipofondoParameterGeneral) {
		this.tipofondoParameterGeneral = tipofondoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoFondo() {
		return isPermisoTodoTipoFondo;
	}

	public void setIsPermisoTodoTipoFondo(Boolean isPermisoTodoTipoFondo) {
		this.isPermisoTodoTipoFondo = isPermisoTodoTipoFondo;
	}

	public Boolean getIsPermisoNuevoTipoFondo() {
		return isPermisoNuevoTipoFondo;
	}

	public void setIsPermisoNuevoTipoFondo(Boolean isPermisoNuevoTipoFondo) {
		this.isPermisoNuevoTipoFondo = isPermisoNuevoTipoFondo;
	}

	public Boolean getIsPermisoActualizarTipoFondo() {
		return isPermisoActualizarTipoFondo;
	}

	public void setIsPermisoActualizarTipoFondo(Boolean isPermisoActualizarTipoFondo) {
		this.isPermisoActualizarTipoFondo = isPermisoActualizarTipoFondo;
	}

	public Boolean getIsPermisoEliminarTipoFondo() {
		return isPermisoEliminarTipoFondo;
	}

	public void setIsPermisoEliminarTipoFondo(Boolean isPermisoEliminarTipoFondo) {
		this.isPermisoEliminarTipoFondo = isPermisoEliminarTipoFondo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoFondo() {
		return isPermisoGuardarCambiosTipoFondo;
	}

	public void setIsPermisoGuardarCambiosTipoFondo(Boolean isPermisoGuardarCambiosTipoFondo) {
		this.isPermisoGuardarCambiosTipoFondo = isPermisoGuardarCambiosTipoFondo;
	}
	
	public Boolean getIsPermisoConsultaTipoFondo() {
		return isPermisoConsultaTipoFondo;
	}

	public void setIsPermisoConsultaTipoFondo(Boolean isPermisoConsultaTipoFondo) {
		this.isPermisoConsultaTipoFondo = isPermisoConsultaTipoFondo;
	}

	public Boolean getIsPermisoBusquedaTipoFondo() {
		return isPermisoBusquedaTipoFondo;
	}

	public void setIsPermisoBusquedaTipoFondo(Boolean isPermisoBusquedaTipoFondo) {
		this.isPermisoBusquedaTipoFondo = isPermisoBusquedaTipoFondo;
	}

	public Boolean getIsPermisoReporteTipoFondo() {
		return isPermisoReporteTipoFondo;
	}

	public void setIsPermisoReporteTipoFondo(Boolean isPermisoReporteTipoFondo) {
		this.isPermisoReporteTipoFondo = isPermisoReporteTipoFondo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoFondo() {
		return isPermisoPaginacionMedioTipoFondo;
	}

	public void setIsPermisoPaginacionMedioTipoFondo(Boolean isPermisoPaginacionMedioTipoFondo) {
		this.isPermisoPaginacionMedioTipoFondo = isPermisoPaginacionMedioTipoFondo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoFondo() {
		return isPermisoPaginacionTodoTipoFondo;
	}

	public void setIsPermisoPaginacionTodoTipoFondo(Boolean isPermisoPaginacionTodoTipoFondo) {
		this.isPermisoPaginacionTodoTipoFondo = isPermisoPaginacionTodoTipoFondo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoFondo() {
		return isPermisoPaginacionAltoTipoFondo;
	}

	public void setIsPermisoPaginacionAltoTipoFondo(Boolean isPermisoPaginacionAltoTipoFondo) {
		this.isPermisoPaginacionAltoTipoFondo = isPermisoPaginacionAltoTipoFondo;
	}
	
	public Boolean getIsPermisoCopiarTipoFondo() {
		return isPermisoCopiarTipoFondo;
	}

	public void setIsPermisoCopiarTipoFondo(Boolean isPermisoCopiarTipoFondo) {
		this.isPermisoCopiarTipoFondo = isPermisoCopiarTipoFondo;
	}
	
	public Boolean getIsPermisoVerFormTipoFondo() {
		return isPermisoVerFormTipoFondo;
	}

	public void setIsPermisoVerFormTipoFondo(Boolean isPermisoVerFormTipoFondo) {
		this.isPermisoVerFormTipoFondo = isPermisoVerFormTipoFondo;
	}
	
	public Boolean getIsPermisoDuplicarTipoFondo() {
		return isPermisoDuplicarTipoFondo;
	}

	public void setIsPermisoDuplicarTipoFondo(Boolean isPermisoDuplicarTipoFondo) {
		this.isPermisoDuplicarTipoFondo = isPermisoDuplicarTipoFondo;
	}
	
	public Boolean getIsPermisoOrdenTipoFondo() {
		return isPermisoOrdenTipoFondo;
	}

	public void setIsPermisoOrdenTipoFondo(Boolean isPermisoOrdenTipoFondo) {
		this.isPermisoOrdenTipoFondo = isPermisoOrdenTipoFondo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoFondo() {
		return isVisibilidadCeldaNuevoTipoFondo;
	}

	public void setIsVisibilidadCeldaNuevoTipoFondo(Boolean isVisibilidadCeldaNuevoTipoFondo) {
		this.isVisibilidadCeldaNuevoTipoFondo = isVisibilidadCeldaNuevoTipoFondo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoFondo() {
		return isVisibilidadCeldaDuplicarTipoFondo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoFondo(Boolean isVisibilidadCeldaDuplicarTipoFondo) {
		this.isVisibilidadCeldaDuplicarTipoFondo = isVisibilidadCeldaDuplicarTipoFondo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoFondo() {
		return isVisibilidadCeldaCopiarTipoFondo;
	}

	public void setIsVisibilidadCeldaCopiarTipoFondo(Boolean isVisibilidadCeldaCopiarTipoFondo) {
		this.isVisibilidadCeldaCopiarTipoFondo = isVisibilidadCeldaCopiarTipoFondo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoFondo() {
		return isVisibilidadCeldaVerFormTipoFondo;
	}

	public void setIsVisibilidadCeldaVerFormTipoFondo(Boolean isVisibilidadCeldaVerFormTipoFondo) {
		this.isVisibilidadCeldaVerFormTipoFondo = isVisibilidadCeldaVerFormTipoFondo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoFondo() {
		return isVisibilidadCeldaOrdenTipoFondo;
	}

	public void setIsVisibilidadCeldaOrdenTipoFondo(Boolean isVisibilidadCeldaOrdenTipoFondo) {
		this.isVisibilidadCeldaOrdenTipoFondo = isVisibilidadCeldaOrdenTipoFondo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoFondo() {
		return isVisibilidadCeldaNuevoRelacionesTipoFondo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoFondo(Boolean isVisibilidadCeldaNuevoRelacionesTipoFondo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoFondo = isVisibilidadCeldaNuevoRelacionesTipoFondo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoFondo() {
		return isVisibilidadCeldaModificarTipoFondo;
	}

	public void setIsVisibilidadCeldaModificarTipoFondo(Boolean isVisibilidadCeldaModificarTipoFondo) {
		this.isVisibilidadCeldaModificarTipoFondo = isVisibilidadCeldaModificarTipoFondo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoFondo() {
		return isVisibilidadCeldaActualizarTipoFondo;
	}

	public void setIsVisibilidadCeldaActualizarTipoFondo(Boolean isVisibilidadCeldaActualizarTipoFondo) {
		this.isVisibilidadCeldaActualizarTipoFondo = isVisibilidadCeldaActualizarTipoFondo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoFondo() {
		return isVisibilidadCeldaEliminarTipoFondo;
	}

	public void setIsVisibilidadCeldaEliminarTipoFondo(Boolean isVisibilidadCeldaEliminarTipoFondo) {
		this.isVisibilidadCeldaEliminarTipoFondo = isVisibilidadCeldaEliminarTipoFondo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoFondo() {
		return isVisibilidadCeldaCancelarTipoFondo;
	}

	public void setIsVisibilidadCeldaCancelarTipoFondo(Boolean isVisibilidadCeldaCancelarTipoFondo) {
		this.isVisibilidadCeldaCancelarTipoFondo = isVisibilidadCeldaCancelarTipoFondo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoFondo() {
		return isVisibilidadCeldaGuardarTipoFondo;
	}

	public void setIsVisibilidadCeldaGuardarTipoFondo(Boolean isVisibilidadCeldaGuardarTipoFondo) {
		this.isVisibilidadCeldaGuardarTipoFondo = isVisibilidadCeldaGuardarTipoFondo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoFondo() {
		return isVisibilidadCeldaGuardarCambiosTipoFondo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoFondo(Boolean isVisibilidadCeldaGuardarCambiosTipoFondo) {
		this.isVisibilidadCeldaGuardarCambiosTipoFondo = isVisibilidadCeldaGuardarCambiosTipoFondo;
	}
		
	public TipoFondoSessionBean gettipofondoSessionBean() {
		return this.tipofondoSessionBean;
	}
	
	public void settipofondoSessionBean(TipoFondoSessionBean tipofondoSessionBean) {
		this.tipofondoSessionBean=tipofondoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoFondo(TipoFondo tipofondo)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoFondo tipofondo,TipoFondo tipofondoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoFondo(tipofondo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipofondoAux.setId(tipofondo.getId());
		tipofondoAux.setVersionRow(tipofondo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoFondo();
		
			int intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondo =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipofondo =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoFondo(this.tipofondo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(this.tipofondo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipofondoValidator.getInvalidValues(this.tipofondo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipofondoLogic.setDatosCliente(datosCliente);
			tipofondoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipofondoAux=new  TipoFondo();
				
				tipofondoAux.setIsNew(true);
				tipofondoAux.setIsChanged(true);
				
				tipofondoAux.setTipoFondoOriginal(this.tipofondo);
				
				tipofondoAux.setId(this.tipofondo.getId());	
				tipofondoAux.setVersionRow(this.tipofondo.getVersionRow());	
				tipofondoAux.setcodigo(this.tipofondo.getcodigo());	
				tipofondoAux.setnombre(this.tipofondo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipofondoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipofondoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipofondoAux,tipofondoLogic.getTipoFondos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofondoAux,tipofondos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipofondoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofondoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofondoLogic.saveTipoFondos();//WithConnection
						//tipofondoLogic.getSetVersionRowTipoFondos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipofondo,tipofondoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipofondoAux=new  TipoFondo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipofondoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipofondoSessionBean.getEsGuardarRelacionado() && this.tipofondo.getId()>=0)) {
						
					tipofondoAux.setIsNew(false);
				}
				
				tipofondoAux.setIsDeleted(false);
			
				tipofondoAux.setId(this.tipofondo.getId());	
				tipofondoAux.setVersionRow(this.tipofondo.getVersionRow());	
				tipofondoAux.setcodigo(this.tipofondo.getcodigo());	
				tipofondoAux.setnombre(this.tipofondo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipofondoAux,tipofondoLogic.getTipoFondos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofondoAux,tipofondos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipofondoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofondoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofondoLogic.saveTipoFondos();//WithConnection
						//tipofondoLogic.getSetVersionRowTipoFondos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipofondo,tipofondoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipofondoAux=new  TipoFondo();
				
				tipofondoAux.setIsNew(false);
				tipofondoAux.setIsChanged(false);
				
				tipofondoAux.setIsDeleted(true);
				
				tipofondoAux.setId(this.tipofondo.getId());	
				tipofondoAux.setVersionRow(this.tipofondo.getVersionRow());	
				tipofondoAux.setcodigo(this.tipofondo.getcodigo());	
				tipofondoAux.setnombre(this.tipofondo.getnombre());	
				
				if(this.tipofondoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipofondoAux.getId()>=0) {	
						this.tipofondosEliminados.add(tipofondoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipofondoAux,tipofondoLogic.getTipoFondos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofondoAux,tipofondos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipofondoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofondoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofondoLogic.saveTipoFondos();//WithConnection
						//tipofondoLogic.getSetVersionRowTipoFondos();//WithConnection
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
					this.tipofondoLogic.getTipoFondos().addAll(this.tipofondosEliminados);
					
					tipofondoLogic.saveTipoFondos();//WithConnection
					//tipofondoLogic.getSetVersionRowTipoFondos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipofondosEliminados= new ArrayList<TipoFondo>();		
			}
			
			if(this.tipofondoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Fondo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Fondo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipofondo=tipofondoAux;
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
      		//this.finishProcessTipoFondo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoFondo tipofondoLocal) throws Exception {
		
		if(this.tipofondoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoFondo tipofondoLocal) throws Exception {	
		if(this.tipofondoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoFondoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipofondo =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipofondo =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipofondoValidator.getInvalidValues(this.tipofondo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoFondo tipofondo,List<TipoFondo> tipofondos) throws Exception {
		try	{		
			TipoFondoConstantesFunciones.actualizarLista(tipofondo,tipofondos,this.tipofondoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoFondo tipofondo,List<TipoFondo> tipofondos) throws Exception {
		try	{			
			TipoFondoConstantesFunciones.actualizarSelectedLista(tipofondo,tipofondos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoFondo> tipofondosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipofondosLocal=this.tipofondoLogic.getTipoFondos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipofondosLocal=this.tipofondos;
			}
			//ARCHITECTURE
		
			for(TipoFondo tipofondoLocal:tipofondosLocal) {
				if(this.permiteMantenimiento(tipofondoLocal) && tipofondoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoFondoConstantesFunciones.getTipoFondoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoFondoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFondo.jLabelcodigoTipoFondo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoFondoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFondo.jLabelnombreTipoFondo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFondo.jLabelcodigoTipoFondo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFondo.jLabelnombreTipoFondo,"");
		
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
		this.iIdNuevoTipoFondo--;	
		
		
		this.tipofondoAux=new TipoFondo();
		
		this.tipofondoAux.setId(this.iIdNuevoTipoFondo);
		this.tipofondoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipofondoLogic.getTipoFondos().add(this.tipofondoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipofondos.add(this.tipofondoAux);
		}
		//ARCHITECTURE
		
		this.tipofondo=this.tipofondoAux;
		
		if(TipoFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoFondo(this.tipofondo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFondo(this.tipofondo);
		}
				
		//this.setDefaultControlesTipoFondo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoFondo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoFondo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFondo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFondo(this.tipofondoBean,this.tipofondo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(this.tipofondo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoFondoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipofondoSessionBean.getConGuardarRelaciones()) {
			classes=TipoFondoConstantesFunciones.getClassesRelationshipsOfTipoFondo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipofondoReturnGeneral=tipofondoLogic.procesarEventosTipoFondosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofondoLogic.getTipoFondos(),this.tipofondo,this.tipofondoParameterGeneral,this.isEsNuevoTipoFondo,classes);//this.tipofondoLogic.getTipoFondo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoFondo(this.tipofondoReturnGeneral,this.tipofondoBean,false);
		
		if(this.tipofondoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFondo(this.tipofondoReturnGeneral.getTipoFondo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoFondo(this.tipofondoReturnGeneral.getTipoFondo());
		}
		
		if(this.tipofondoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoFondo(this.tipofondoReturnGeneral.getTipoFondo(),classes);//this.tipofondoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoFondo(this.tipofondo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoFondo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoFondo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoFondo(false);
						
			if(tipofondoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoFondoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFondo();
			}
			
			this.actualizarVisualTableDatosTipoFondo();
			
			this.jTableDatosTipoFondo.setRowSelectionInterval(this.getIndiceNuevoTipoFondo(), this.getIndiceNuevoTipoFondo());
			
			this.seleccionarFilaTablaTipoFondoActual();
						
			this.actualizarEstadoCeldasBotonesTipoFondo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoFondo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoFondo.jTextFieldcodigoTipoFondo.setEnabled(isHabilitar && this.tipofondoConstantesFunciones.activarcodigoTipoFondo);
		this.jInternalFrameDetalleFormTipoFondo.jTextAreanombreTipoFondo.setEnabled(isHabilitar && this.tipofondoConstantesFunciones.activarnombreTipoFondo);	
		
	};
	
	public void setDefaultControlesTipoFondo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoFondo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipofondoSessionBean.setConGuardarRelaciones(true);			
			this.tipofondoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoFondo.jTabbedPaneRelacionesTipoFondo.setVisible(true);
			
					
		} else {
			//this.tipofondoSessionBean.setConGuardarRelaciones(false);			
			this.tipofondoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoFondo.jTabbedPaneRelacionesTipoFondo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoFondo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFondo tipofondoAux:this.tipofondoLogic.getTipoFondos()) {
				if(tipofondoAux.getId().equals(this.iIdNuevoTipoFondo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFondo tipofondoAux:this.tipofondos) {
				if(tipofondoAux.getId().equals(this.iIdNuevoTipoFondo)) {
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
	
	public int getIndiceActualTipoFondo(TipoFondo tipofondo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFondo tipofondoAux:this.tipofondoLogic.getTipoFondos()) {
				if(tipofondoAux.getId().equals(tipofondo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFondo tipofondoAux:this.tipofondos) {
				if(tipofondoAux.getId().equals(tipofondo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoFondo(TipoFondo tipofondoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFondo tipofondoAux:this.tipofondoLogic.getTipoFondos()) {
				if(tipofondoAux.getTipoFondoOriginal().getId().equals(tipofondoOriginal.getId())) {
					existe=true;
					tipofondoOriginal.setId(tipofondoAux.getId());
					tipofondoOriginal.setVersionRow(tipofondoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFondo tipofondoAux:this.tipofondos) {
				if(tipofondoAux.getTipoFondoOriginal().getId().equals(tipofondoOriginal.getId())) {
					existe=true;
					tipofondoOriginal.setId(tipofondoAux.getId());
					tipofondoOriginal.setVersionRow(tipofondoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoFondo(Boolean esParaCancelar) throws Exception {
		tipofondosAux=new ArrayList<TipoFondo>();
		tipofondoAux=new TipoFondo();
		
		if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFondo tipofondoAux:this.tipofondoLogic.getTipoFondos()) {
					if(tipofondoAux.getId()<0) {
						tipofondosAux.add(tipofondoAux);
					}		
				}
				this.iIdNuevoTipoFondo=0L;
				this.tipofondoLogic.getTipoFondos().removeAll(tipofondosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFondo tipofondoAux:this.tipofondos) {
					if(tipofondoAux.getId()<0) {
						tipofondosAux.add(tipofondoAux);
					}		
				}
				this.iIdNuevoTipoFondo=0L;
				this.tipofondos.removeAll(tipofondosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoFondo 
					&& this.tipofondoLogic.getTipoFondos().size()>0
					) {
					tipofondoAux=this.tipofondoLogic.getTipoFondos().get(this.tipofondoLogic.getTipoFondos().size() - 1);
				
					if(tipofondoAux.getId()<0) {
						this.tipofondoLogic.getTipoFondos().remove(tipofondoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoFondo && this.tipofondos.size()>0) {
					tipofondoAux=this.tipofondos.get(this.tipofondos.size() - 1);
				
					if(tipofondoAux.getId()<0) {
						this.tipofondos.remove(tipofondoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoFondo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipofondo.getId()<0) {
				this.tipofondoLogic.getTipoFondos().remove(this.tipofondo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipofondo.getId()<0) {
				this.tipofondos.remove(this.tipofondo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoFondo(List<TipoFondo> tipofondosAux) throws Exception {
		TipoFondoConstantesFunciones.setEstadosInicialesTipoFondo(tipofondosAux);
	}
	
	public void setEstadosInicialesTipoFondo(TipoFondo tipofondoAux) throws Exception {
		TipoFondoConstantesFunciones.setEstadosInicialesTipoFondo(tipofondoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoFondoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoFondo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoFondoActual()) {
				if(!this.isEsNuevoTipoFondo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoFondo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoFondo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoFondoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Fondo ?", "MANTENIMIENTO DE Tipo Fondo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoFondo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoFondo tipofondo) throws Exception {
		TipoFondoConstantesFunciones.seleccionarAsignar(this.tipofondo,tipofondo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoFondo=this.isPermisoActualizarOriginalTipoFondo;
			
			
			this.seleccionarAsignar(tipofondo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoFondoConstantesFunciones.quitarEspaciosTipoFondo(this.tipofondo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoFondo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipofondoSessionBean.setsFuncionBusquedaRapida(this.tipofondoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoFondo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoFondo(esParaCancelar);				
				this.cancelarNuevoTipoFondo(esParaCancelar);								
			}
			
			this.tipofondo=new TipoFondo();
			
			this.inicializarTipoFondo();
			
			this.actualizarEstadoCeldasBotonesTipoFondo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoFondo() throws Exception {
		try {
			TipoFondoConstantesFunciones.inicializarTipoFondo(this.tipofondo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipofondoLogic.getTipoFondos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoFondos(String sAccionBusqueda,List<TipoFondo> tipofondosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoFondo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoFondoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoFondoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoFondo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Fondos");		
		parameters.put("busquedapor", TipoFondoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoFondo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoFondoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoFondoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoFondo=new JRBeanArrayDataSource(TipoFondoJInternalFrame.TraerTipoFondoBeans(tipofondosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoFondo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoFondoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoFondoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoFondoBean.TraerTipoFondoBeans(tipofondosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoFondos(sAccionBusqueda,sTipoArchivoReporte,tipofondosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoFondos(sAccionBusqueda,sTipoArchivoReporte,tipofondosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoFondoActionPerformed(null);
					//this.generarExcelReporteTipoFondos(sAccionBusqueda,sTipoArchivoReporte,tipofondosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoFondos(sAccionBusqueda,sTipoArchivoReporte,tipofondosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoFondos(sAccionBusqueda,sTipoArchivoReporte,tipofondosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoFondos(sAccionBusqueda,sTipoArchivoReporte,tipofondosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoFondos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFondo> tipofondosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFondos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFondo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoFondo tipofondo : tipofondosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoFondoConstantesFunciones.generarExcelReporteDataTipoFondo("NORMAL",row,workbook,tipofondo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoFondo(String sTipo,Row row,Workbook workbook) {
		
		TipoFondoConstantesFunciones.generarExcelReporteHeaderTipoFondo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoFondos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFondo> tipofondosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFondos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoFondo tipofondo : tipofondosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoFondoConstantesFunciones.getTipoFondoDescripcion(tipofondo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFondoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFondoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipofondo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFondoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFondoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipofondo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoFondos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFondo> tipofondosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoFondo> tipofondosRespaldo=null;
		
		classes=TipoFondoConstantesFunciones.getClassesRelationshipsOfTipoFondo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipofondoLogic.setDatosCliente(this.datosCliente);
		this.tipofondoLogic.setDatosDeep(this.datosDeep);
		this.tipofondoLogic.setIsConDeep(true);
		
		tipofondosRespaldo=this.tipofondoLogic.getTipoFondos();
		
		this.tipofondoLogic.setTipoFondos(tipofondosParaReportes);	
		this.tipofondoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipofondosParaReportes=this.tipofondoLogic.getTipoFondos();
		this.tipofondoLogic.setTipoFondos(tipofondosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFondos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFondo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoFondo tipofondo : tipofondosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoFondo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoFondoConstantesFunciones.generarExcelReporteDataTipoFondo("NORMAL",row,workbook,tipofondo,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoFondoConstantesFunciones.getTipoFondoDescripcion(tipofondo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFondo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFondo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFondo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFondo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoFondo() throws Exception {		
		this.startProcessTipoFondo(true);
	}
	
	public void startProcessTipoFondo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoFondo, this.jScrollPanelDatosTipoFondo,this.jPanelPaginacionTipoFondo, this.jScrollPanelDatosEdicionTipoFondo, this.jPanelAccionesTipoFondo,this.jPanelAccionesFormularioTipoFondo,this.jmenuBarTipoFondo,this.jmenuBarDetalleTipoFondo,this.jTtoolBarTipoFondo,this.jTtoolBarDetalleTipoFondo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFondo=null; 
		
		final JPanel jPanelParametrosReportesTipoFondo=this.jPanelParametrosReportesTipoFondo;
		//final JScrollPane jScrollPanelDatosTipoFondo=this.jScrollPanelDatosTipoFondo;
		final JTable jTableDatosTipoFondo=this.jTableDatosTipoFondo;		
		final JPanel jPanelPaginacionTipoFondo=this.jPanelPaginacionTipoFondo;
		//final JScrollPane jScrollPanelDatosEdicionTipoFondo=this.jScrollPanelDatosEdicionTipoFondo;
		final JPanel jPanelAccionesTipoFondo=this.jPanelAccionesTipoFondo;
		
		JPanel jPanelCamposAuxiliarTipoFondo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoFondo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) {
			jPanelCamposAuxiliarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jPanelCamposTipoFondo;
			jPanelAccionesFormularioAuxiliarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jPanelAccionesFormularioTipoFondo;
		}
		
		final JPanel jPanelCamposTipoFondo=jPanelCamposAuxiliarTipoFondo;
		final JPanel jPanelAccionesFormularioTipoFondo=jPanelAccionesFormularioAuxiliarTipoFondo;
		
		
		final JMenuBar jmenuBarTipoFondo=this.jmenuBarTipoFondo;
		final JToolBar jTtoolBarTipoFondo=this.jTtoolBarTipoFondo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoFondo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFondo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) {
			jmenuBarDetalleAuxiliarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jmenuBarDetalleTipoFondo;
			jTtoolBarDetalleAuxiliarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jTtoolBarDetalleTipoFondo;
		}
		
		final JMenuBar jmenuBarDetalleTipoFondo=jmenuBarDetalleAuxiliarTipoFondo;
		final JToolBar jTtoolBarDetalleTipoFondo=jTtoolBarDetalleAuxiliarTipoFondo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFondo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFondo;
			processRunnable.jTableDatos=jTableDatosTipoFondo;
			processRunnable.jPanelCampos=jPanelCamposTipoFondo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFondo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFondo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFondo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFondo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFondo;
			processRunnable.jTtoolBar=jTtoolBarTipoFondo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFondo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoFondo ,jPanelParametrosReportesTipoFondo,jTableDatosTipoFondo, /*jScrollPanelDatosTipoFondo,*/jPanelCamposTipoFondo,jPanelPaginacionTipoFondo, /*jScrollPanelDatosEdicionTipoFondo,*/ jPanelAccionesTipoFondo,jPanelAccionesFormularioTipoFondo,jmenuBarTipoFondo,jmenuBarDetalleTipoFondo,jTtoolBarTipoFondo,jTtoolBarDetalleTipoFondo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoFondo, jScrollPanelDatosTipoFondo,jPanelPaginacionTipoFondo, jScrollPanelDatosEdicionTipoFondo, jPanelAccionesTipoFondo,jPanelAccionesFormularioTipoFondo,jmenuBarTipoFondo,jmenuBarDetalleTipoFondo,jTtoolBarTipoFondo,jTtoolBarDetalleTipoFondo);
						
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
	
	public void finishProcessTipoFondo() {// throws Exception 
		this.finishProcessTipoFondo(true);
	}
	
	public void finishProcessTipoFondo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoFondo, this.jScrollPanelDatosTipoFondo,this.jPanelPaginacionTipoFondo, this.jScrollPanelDatosEdicionTipoFondo, this.jPanelAccionesTipoFondo,this.jPanelAccionesFormularioTipoFondo,this.jmenuBarTipoFondo,this.jmenuBarDetalleTipoFondo,this.jTtoolBarTipoFondo,this.jTtoolBarDetalleTipoFondo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFondo=null; 
		
		final JPanel jPanelParametrosReportesTipoFondo=this.jPanelParametrosReportesTipoFondo;
		//final JScrollPane jScrollPanelDatosTipoFondo=this.jScrollPanelDatosTipoFondo;
		final JTable jTableDatosTipoFondo=this.jTableDatosTipoFondo;		
		final JPanel jPanelPaginacionTipoFondo=this.jPanelPaginacionTipoFondo;
		//final JScrollPane jScrollPanelDatosEdicionTipoFondo=this.jScrollPanelDatosEdicionTipoFondo;
		final JPanel jPanelAccionesTipoFondo=this.jPanelAccionesTipoFondo;
		
		JPanel jPanelCamposAuxiliarTipoFondo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoFondo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) {
			jPanelCamposAuxiliarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jPanelCamposTipoFondo;
			jPanelAccionesFormularioAuxiliarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jPanelAccionesFormularioTipoFondo;
		}
		
		final JPanel jPanelCamposTipoFondo=jPanelCamposAuxiliarTipoFondo;
		final JPanel jPanelAccionesFormularioTipoFondo=jPanelAccionesFormularioAuxiliarTipoFondo;
		
		
		final JMenuBar jmenuBarTipoFondo=this.jmenuBarTipoFondo;		
		final JToolBar jTtoolBarTipoFondo=this.jTtoolBarTipoFondo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoFondo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFondo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) {
			jmenuBarDetalleAuxiliarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jmenuBarDetalleTipoFondo;
			jTtoolBarDetalleAuxiliarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jTtoolBarDetalleTipoFondo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoFondo=jmenuBarDetalleAuxiliarTipoFondo;
		final JToolBar jTtoolBarDetalleTipoFondo=jTtoolBarDetalleAuxiliarTipoFondo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFondo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFondo;
			processRunnable.jTableDatos=jTableDatosTipoFondo;
			processRunnable.jPanelCampos=jPanelCamposTipoFondo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFondo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFondo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFondo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFondo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFondo;
			processRunnable.jTtoolBar=jTtoolBarTipoFondo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFondo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoFondo ,jPanelParametrosReportesTipoFondo, jTableDatosTipoFondo,/*jScrollPanelDatosTipoFondo,*/jPanelCamposTipoFondo,jPanelPaginacionTipoFondo, /*jScrollPanelDatosEdicionTipoFondo,*/ jPanelAccionesTipoFondo,jPanelAccionesFormularioTipoFondo,jmenuBarTipoFondo,jmenuBarDetalleTipoFondo,jTtoolBarTipoFondo,jTtoolBarDetalleTipoFondo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoFondo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoFondo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoFondo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoFondo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoFondo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoFondo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoFondo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoFondo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoFondo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipofondoConstantesFunciones.getsFinalQueryTipoFondo();
		String  finalQueryPaginacionTodos=this.tipofondoConstantesFunciones.getsFinalQueryTipoFondo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoFondoConstantesFunciones.getArrayColumnasGlobalesNoTipoFondo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoFondoConstantesFunciones.getArrayColumnasGlobalesTipoFondo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoFondoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipofondosEliminados= new ArrayList<TipoFondo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoFondo();
		
				///*TipoFondoSessionBean*/this.tipofondoSessionBean=new TipoFondoSessionBean();
			
			if(this.tipofondoSessionBean==null) {
				this.tipofondoSessionBean=new TipoFondoSessionBean();
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
					this.iNumeroPaginacion=TipoFondoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoFondoConstantesFunciones.getClassesForeignKeysOfTipoFondo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipofondo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipofondosAux= new ArrayList<TipoFondo>();
			
				
			tipofondoLogic.setDatosCliente(this.datosCliente);
			tipofondoLogic.setDatosDeep(this.datosDeep);
			tipofondoLogic.setIsConDeep(true);
			
			
			tipofondoLogic.getTipoFondoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipofondoLogic.getTodosTipoFondos(finalQueryGlobal,pagination);
					
					//tipofondoLogic.getTodosTipoFondosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipofondoLogic.getTipoFondos()==null|| tipofondoLogic.getTipoFondos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofondosAux= new ArrayList<TipoFondo>();
							tipofondosAux.addAll(tipofondoLogic.getTipoFondos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofondosAux= new ArrayList<TipoFondo>();
							tipofondosAux.addAll(tipofondos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofondoLogic.getTodosTipoFondos(finalQueryGlobal+"",this.pagination);												
							
							//tipofondoLogic.getTodosTipoFondosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoFondos("Todos",tipofondoLogic.getTipoFondos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofondoLogic.setTipoFondos(new ArrayList<TipoFondo>());					
							tipofondoLogic.getTipoFondos().addAll(tipofondosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofondos=new ArrayList<TipoFondo>();
							tipofondos.addAll(tipofondosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoFondo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoFondo=this.idActual;
				
				} else if(this.idTipoFondoActual!=null && this.idTipoFondoActual!=0L) {
					idTipoFondo=idTipoFondoActual;
				}
				
					
				this.sDetalleReporte=TipoFondoConstantesFunciones.getDetalleIndicePorId(idTipoFondo);
				
				this.tipofondos=new ArrayList<TipoFondo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipofondoLogic.getEntity(idTipoFondo);
					
					//tipofondoLogic.getEntityWithConnection(idTipoFondo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofondoLogic.setTipoFondos(new ArrayList<TipoFondo>());
					tipofondoLogic.getTipoFondos().add(tipofondoLogic.getTipoFondo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipofondos=new ArrayList<TipoFondo>();
					this.tipofondos.add(tipofondo);
				}
				
				if(tipofondoLogic.getTipoFondo()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoFondo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoFondo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipofondoLogic.getTipoFondos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofondos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipofondoLogic.getTipoFondos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofondos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoFondo tipofondo) {
		Boolean permite=true;
		
		if(this.tipofondo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoFondoConstantesFunciones.getOrderByListaTipoFondo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoFondoConstantesFunciones.getOrderByListaTipoFondo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFondo tipofondo:tipofondoLogic.getTipoFondos()) {
				if(tipofondo.getsType().equals(Constantes2.S_TOTALES)) {
					tipofondoTotales=tipofondo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFondo tipofondo:this.tipofondos) {
				if(tipofondo.getsType().equals(Constantes2.S_TOTALES)) {
					tipofondoTotales=tipofondo;
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
			this.tipofondoAux=new TipoFondo();
			this.tipofondoAux.setsType(Constantes2.S_TOTALES);
			this.tipofondoAux.setIsNew(false);
			this.tipofondoAux.setIsChanged(false);
			this.tipofondoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoFondoConstantesFunciones.TotalizarValoresFilaTipoFondo(this.tipofondoLogic.getTipoFondos(),this.tipofondoAux);
				
				this.tipofondoLogic.getTipoFondos().add(this.tipofondoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoFondoConstantesFunciones.TotalizarValoresFilaTipoFondo(this.tipofondos,this.tipofondoAux);
				
				this.tipofondos.add(this.tipofondoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipofondoTotales=new TipoFondo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipofondoLogic.getTipoFondos().remove(tipofondoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipofondos.remove(tipofondoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipofondoTotales=new TipoFondo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFondo tipofondo:tipofondoLogic.getTipoFondos()) {
				if(tipofondo.getsType().equals(Constantes2.S_TOTALES)) {
					tipofondoTotales=tipofondo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFondoConstantesFunciones.TotalizarValoresFilaTipoFondo(this.tipofondoLogic.getTipoFondos(),tipofondoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFondo tipofondo:this.tipofondos) {
				if(tipofondo.getsType().equals(Constantes2.S_TOTALES)) {
					tipofondoTotales=tipofondo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFondoConstantesFunciones.TotalizarValoresFilaTipoFondo(this.tipofondos,tipofondoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoFondo() {
		this.isPermisoTodoTipoFondo=false;
		this.isPermisoNuevoTipoFondo=false;
		this.isPermisoActualizarTipoFondo=false;
		this.isPermisoActualizarOriginalTipoFondo=false;
		this.isPermisoEliminarTipoFondo=false;
		this.isPermisoGuardarCambiosTipoFondo=false;
		this.isPermisoConsultaTipoFondo=false;
		this.isPermisoBusquedaTipoFondo=false;
		this.isPermisoReporteTipoFondo=false;		
		this.isPermisoOrdenTipoFondo=false;		
		this.isPermisoPaginacionMedioTipoFondo=false;		
		this.isPermisoPaginacionAltoTipoFondo=false;
		this.isPermisoPaginacionTodoTipoFondo=false;
		this.isPermisoCopiarTipoFondo=false;		
		this.isPermisoVerFormTipoFondo=false;		
		this.isPermisoDuplicarTipoFondo=false;		
		this.isPermisoOrdenTipoFondo=false;		
	}
	
	public void setPermisosUsuarioTipoFondo(Boolean isPermiso) {
		this.isPermisoTodoTipoFondo=isPermiso;
		this.isPermisoNuevoTipoFondo=isPermiso;
		this.isPermisoActualizarTipoFondo=isPermiso;
		this.isPermisoActualizarOriginalTipoFondo=isPermiso;
		this.isPermisoEliminarTipoFondo=isPermiso;
		this.isPermisoGuardarCambiosTipoFondo=isPermiso;
		this.isPermisoConsultaTipoFondo=isPermiso;
		this.isPermisoBusquedaTipoFondo=isPermiso;
		this.isPermisoReporteTipoFondo=isPermiso;
		this.isPermisoOrdenTipoFondo=isPermiso;		
		this.isPermisoPaginacionMedioTipoFondo=isPermiso;		
		this.isPermisoPaginacionAltoTipoFondo=isPermiso;		
		this.isPermisoPaginacionTodoTipoFondo=isPermiso;		
		this.isPermisoCopiarTipoFondo=isPermiso;		
		this.isPermisoVerFormTipoFondo=isPermiso;		
		this.isPermisoDuplicarTipoFondo=isPermiso;
		this.isPermisoOrdenTipoFondo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoFondo(Boolean isPermiso) {
		//this.isPermisoTodoTipoFondo=isPermiso;
		this.isPermisoNuevoTipoFondo=isPermiso;
		this.isPermisoActualizarTipoFondo=isPermiso;
		this.isPermisoActualizarOriginalTipoFondo=isPermiso;
		this.isPermisoEliminarTipoFondo=isPermiso;
		this.isPermisoGuardarCambiosTipoFondo=isPermiso;
		//this.isPermisoConsultaTipoFondo=isPermiso;
		//this.isPermisoBusquedaTipoFondo=isPermiso;
		//this.isPermisoReporteTipoFondo=isPermiso;
		//this.isPermisoOrdenTipoFondo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoFondo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoFondo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoFondo=isPermiso;		
		//this.isPermisoCopiarTipoFondo=isPermiso;		
		//this.isPermisoDuplicarTipoFondo=isPermiso;
		//this.isPermisoOrdenTipoFondo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoFondoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoFondoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoFondo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoFondoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoFondoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoFondoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoFondoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoFondo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoFondoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipofondoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoFondoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoFondo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoFondo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoFondo=this.isPermisoActualizarTipoFondo;
			this.isPermisoEliminarTipoFondo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoFondo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoFondo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoFondo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoFondo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoFondo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFondo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoFondo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoFondo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoFondo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoFondo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoFondo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoFondo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFondo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipofondoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoFondo.setToolTipText(this.jTableDatosTipoFondo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoFondo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoFondo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoFondoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoFondoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoFondo() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoFondoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoFondoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoFondoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoFondoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoFondoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoFondo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoFondo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoFondo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoFondo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFondo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoFondo(TipoFondo tipofondo)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoFondo(TipoFondo tipofondo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoFondo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFondo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoFondo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoFondo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoFondo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoFondo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoFondo(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoFondo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoFondoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoFondoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoFondoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipofondoSessionBean=new TipoFondoSessionBean(); 
		this.tipofondoConstantesFunciones=new TipoFondoConstantesFunciones(); 
		this.tipofondoBean=new TipoFondo();//(this.tipofondoConstantesFunciones); 		
		this.tipofondoReturnGeneral=new TipoFondoParameterReturnGeneral(); 
		
		this.tipofondoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofondoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoFondoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoFondoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoFondoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoFondo(true);
			
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
			
			this.tipofondoConstantesFunciones=new TipoFondoConstantesFunciones(); 
			this.tipofondoBean=new TipoFondo();//this.tipofondoConstantesFunciones); 			
			this.tipofondoReturnGeneral=new TipoFondoParameterReturnGeneral(); 
		
			TipoFondoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Fondo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipofondo=new TipoFondo();
			this.tipofondos = new ArrayList<TipoFondo>();
			this.tipofondosAux = new ArrayList<TipoFondo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic=new TipoFondoLogic();
				this.tipofondoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipofondoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipofondoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoFondo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoFondo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFondo);	
					}
					
					if(this.jInternalFrameImportacionTipoFondo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFondo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoFondo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoFondo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoFondo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFondo);
				this.jInternalFrameDetalleFormTipoFondo.setVisible(false);
				this.jInternalFrameDetalleFormTipoFondo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoFondo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFondo);
					this.jInternalFrameReporteDinamicoTipoFondo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoFondo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoFondo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoFondo);
					this.jInternalFrameImportacionTipoFondo.setVisible(false);
					this.jInternalFrameImportacionTipoFondo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoFondo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoFondo);
					this.jInternalFrameOrderByTipoFondo.setVisible(false);
					this.jInternalFrameOrderByTipoFondo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoFondoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoFondoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipofondoReturnGeneral=new TipoFondoParameterReturnGeneral();
			
			this.tipofondoParameterGeneral=new TipoFondoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipofondoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoFondoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipofondoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFondoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipofondoSessionBean.getEsGuardarRelacionado(),this.tipofondoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFondoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipofondoSessionBean.getEsGuardarRelacionado(),this.tipofondoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoFondo=false;
			this.isVisibilidadCeldaDuplicarTipoFondo=true;
			this.isVisibilidadCeldaCopiarTipoFondo=true;
			this.isVisibilidadCeldaVerFormTipoFondo=true;
			this.isVisibilidadCeldaOrdenTipoFondo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondo=false;
			this.isVisibilidadCeldaModificarTipoFondo=false;
			this.isVisibilidadCeldaActualizarTipoFondo=false;
			this.isVisibilidadCeldaEliminarTipoFondo=false;
			this.isVisibilidadCeldaCancelarTipoFondo=false;
			this.isVisibilidadCeldaGuardarTipoFondo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondo=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoFondo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoFondo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoFondo(false);
			
			this.setPermisosUsuarioTipoFondo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofondoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipofondoSessionBean.getEsGuardarRelacionado() && this.tipofondoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoFondoClasesRelacionadas();
			}
			
			if(this.tipofondoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoFondoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoFondoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoFondo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoFondo();
			}
			
			if(!this.isPermisoBusquedaTipoFondo) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoFondo,this.isPermisoPaginacionMedioTipoFondo,this.isPermisoPaginacionTodoTipoFondo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoFondoConstantesFunciones.getTiposSeleccionarTipoFondo());
				
				this.tiposColumnasSelect=TipoFondoConstantesFunciones.getTiposSeleccionarTipoFondo(true);
				
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
			//if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoFondo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoFondo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoFondo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFondo() ;
			
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
				tipofondoImplementable= (TipoFondoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFondoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipofondoImplementableHome= (TipoFondoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFondoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipofondos= new ArrayList<TipoFondo>();
			this.tipofondosEliminados= new ArrayList<TipoFondo>();
						
			this.isEsNuevoTipoFondo=false;
			this.esParaAccionDesdeFormularioTipoFondo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoFondo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoFondo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoFondoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoFondo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoFondo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoFondo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoFondo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoFondo();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoFondo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoFondo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoFondo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoFondo")) {
				iIndex=this.jInternalFrameDetalleFormTipoFondo.jTabbedPaneRelacionesTipoFondo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoFondo.jTabbedPaneRelacionesTipoFondo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoFondo();	
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
	
	public void cargarCombosForeignKeyTipoFondo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoFondo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoFondo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoFondoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoFondo();
		
		this.cargarCombosFrameForeignKeyTipoFondo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoFondo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoFondo();
		}
	}
	
	
	
	public void jButtonNuevoTipoFondoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipofondoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			
			
			if(jTableDatosTipoFondo.getRowCount()>=1) {
				jTableDatosTipoFondo.removeRowSelectionInterval(0, jTableDatosTipoFondo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoFondo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoFondo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoFondo(true);			
			//this.tipofondo=new TipoFondo();
			//this.tipofondo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFondo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFondo() ;
			
			if(TipoFondoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFondo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipofondo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);				
			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			
			if(this.tipofondoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoFondo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoFondoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoFondo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoFondo.getSelectedRows().length;			
			}
			
			tipofondosSeleccionados=this.getTipoFondosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoFondo--;			
				//TipoFondo tipofondoAux= new TipoFondo();			
				//tipofondoAux.setId(this.iIdNuevoTipoFondo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoFondo tipofondoOrigen=new TipoFondo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoFondo tipofondoOrigen : tipofondosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipofondoOrigen =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofondoOrigen =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoFondo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipofondo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoFondo(tipofondoOrigen,this.tipofondo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(this.tipofondo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipofondoLogic.getTipoFondos().add(this.tipofondoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipofondos.add(this.tipofondoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoFondo(false);
				
				this.jTableDatosTipoFondo.setRowSelectionInterval(this.getIndiceNuevoTipoFondo(), this.getIndiceNuevoTipoFondo());
				
				int iLastRow =  this.jTableDatosTipoFondo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFondo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFondo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFondo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();									
		
			TipoFondo tipofondoOrigen=new TipoFondo();
			TipoFondo tipofondoDestino=new TipoFondo();
				
			tipofondosSeleccionados=this.getTipoFondosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoFondo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipofondosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoFondo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofondoOrigen =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipofondoOrigen =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofondoDestino =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipofondoDestino =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipofondoOrigen =tipofondosSeleccionados.get(0);
				tipofondoDestino =tipofondosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoFondo(tipofondoOrigen,tipofondoDestino,true,false);
				
				tipofondoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipofondoDestino,tipofondoLogic.getTipoFondos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofondoDestino,tipofondos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoFondo(false);
				
				//this.jTableDatosTipoFondo.setRowSelectionInterval(this.getIndiceNuevoTipoFondo(), this.getIndiceNuevoTipoFondo());
				
				int iLastRow =  this.jTableDatosTipoFondo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFondo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFondo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFondo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoFondo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoFondo.isVisible();
			
			
			this.jPanelParametrosReportesTipoFondo.setVisible(!isVisible);
			this.jPanelPaginacionTipoFondo.setVisible(!isVisible);
			this.jPanelAccionesTipoFondo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoFondo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoFondo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoFondo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoFondo();
			
			this.abrirFrameOrderByTipoFondo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoFondo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoFondo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFondo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoFondo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoFondo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoFondo.setSize(this.jInternalFrameDetalleFormTipoFondo.iWidthFormulario,this.jInternalFrameDetalleFormTipoFondo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoFondo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoFondo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoFondo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoFondo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoFondo.jContentPaneDetalleTipoFondo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoFondo.jTabbedPaneRelacionesTipoFondo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoFondo.jContentPaneDetalleTipoFondo.getWidth(),TipoFondoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFondo.jTabbedPaneRelacionesTipoFondo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoFondo.jContentPaneDetalleTipoFondo.getWidth(),TipoFondoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFondo.jTabbedPaneRelacionesTipoFondo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoFondo.jContentPaneDetalleTipoFondo.getWidth(),TipoFondoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoFondo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoFondo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoFondo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoFondo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoFondo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFondo,false,this);
				} else {
					this.jInternalFrameOrderByTipoFondo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFondo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoFondo);
				this.jInternalFrameOrderByTipoFondo.setVisible(false);
				this.jInternalFrameOrderByTipoFondo.setSelected(false);
				
				this.jInternalFrameOrderByTipoFondo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFondo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoFondo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoFondo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoFondo==null) {
				
				this.jInternalFrameImportacionTipoFondo=new ImportacionJInternalFrame(TipoFondoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFondo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoFondo);
				this.jInternalFrameImportacionTipoFondo.setVisible(false);
				this.jInternalFrameImportacionTipoFondo.setSelected(false);


				this.jInternalFrameImportacionTipoFondo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFondo"));
				this.jInternalFrameImportacionTipoFondo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFondo"));
				this.jInternalFrameImportacionTipoFondo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFondo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoFondo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoFondo==null) {
				this.jInternalFrameReporteDinamicoTipoFondo=new ReporteDinamicoJInternalFrame(TipoFondoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFondo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFondo);
				this.jInternalFrameReporteDinamicoTipoFondo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoFondo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoFondo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFondo"));
				this.jInternalFrameReporteDinamicoTipoFondo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFondo"));
				this.jInternalFrameReporteDinamicoTipoFondo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFondo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFondo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoFondo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFondo);
			
	       	this.jInternalFrameDetalleFormTipoFondo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoFondo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoFondo.dispose();
			//this.jInternalFrameDetalleFormTipoFondo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoFondo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoFondo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoFondo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoFondo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoFondo.setVisible(true);
	        this.jInternalFrameImportacionTipoFondo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoFondo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoFondo.setVisible(true);
	        this.jInternalFrameOrderByTipoFondo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoFondo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoFondo.setVisible(false);
	        this.jInternalFrameOrderByTipoFondo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoFondo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoFondo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoFondo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoFondo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoFondo.setVisible(false);
	        this.jInternalFrameImportacionTipoFondo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoFondoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoFondo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoFondo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoFondo(true);
			//this.isEsNuevoTipoFondo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondo =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofondo =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoFondo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFondo(false) ;
			
			if(tipofondoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoFondoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFondo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFondo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoFondoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondo =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondo =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoFondo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoFondo(true);
			//this.isEsNuevoTipoFondo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondo =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofondo =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipofondo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoFondo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoFondo(false) ;
			
			if(TipoFondoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFondo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFondo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoFondoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoFondo(false);
			
			//if(!this.isEsNuevoTipoFondo) {								
				int intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondo =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipofondo =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoFondo(this.tipofondo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(this.tipofondo);
				
			}
			
			if(this.permiteMantenimiento(this.tipofondo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoFondo=true;
					this.inicializarActualizarBindingTablaTipoFondo(false);
					this.isEsNuevoTipoFondo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoFondo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoFondo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFondo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFondo(false);
				
				this.habilitarDeshabilitarControlesTipoFondo(false);
			
												
				
				if(TipoFondoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoFondo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoFondoActionPerformed(evt,tipofondoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoFondo(this.tipofondo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoFondo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipofondoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipofondo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoFondo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoFondoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondo =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				this.tipofondo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofondo =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				this.tipofondo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipofondo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoFondoModel) this.jTableDatosTipoFondo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoFondo=true;
				this.inicializarActualizarBindingTablaTipoFondo(false);
				this.isEsNuevoTipoFondo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFondo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFondo(false);
				
				this.habilitarDeshabilitarControlesTipoFondo(false);
				
				
				
				if(TipoFondoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoFondo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoFondoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoFondo.getRowCount()>=1) {
				jTableDatosTipoFondo.removeRowSelectionInterval(0, jTableDatosTipoFondo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoFondo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoFondo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFondo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFondo(false) ;
			
			this.isEsNuevoTipoFondo=false;
			
			if(TipoFondoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoFondo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoFondoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoFondo(false);
				
				//SI ES MANUAL
				if(TipoFondoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoFondo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoFondoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoFondo--;			
			//TipoFondo tipofondoAux= new TipoFondo();			
			//tipofondoAux.setId(this.iIdNuevoTipoFondo);
			
			if(this.jInternalFrameDetalleFormTipoFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoFondo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(this.tipofondo);
			
			this.tipofondo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipofondoLogic.getTipoFondos().add(this.tipofondoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipofondos.add(this.tipofondoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoFondo(false);
			
			this.jTableDatosTipoFondo.setRowSelectionInterval(this.getIndiceNuevoTipoFondo(), this.getIndiceNuevoTipoFondo());
			
			int iLastRow =  this.jTableDatosTipoFondo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoFondo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoFondo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoFondo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoFondoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoFondo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFondo(false);
			
			//SI ES MANUAL
			if(TipoFondoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFondo();
			}
			
			//this.abrirFrameTreeTipoFondo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoFondoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo FondoS ?", "MANTENIMIENTO DE Tipo Fondo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoFondo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoFondo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipofondoReturnGeneral=tipofondoLogic.procesarImportacionTipoFondosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipofondoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoFondoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoFondoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoFondo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoFondo.setFileImportacion(this.jInternalFrameImportacionTipoFondo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoFondo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoFondo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoFondo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoFondo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoFondoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();		

		tipofondosSeleccionados=this.getTipoFondosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFondo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFondo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoFondoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoFondoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoFondos("Todos",tipofondosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFondo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFondo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFondoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoFondoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoFondo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFondo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFondo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoFondoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoFondoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoFondo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoFondoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoFondoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoFondo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFondo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFondoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoFondoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoFondoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();		
		
		tipofondosSeleccionados=this.getTipoFondosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoFondos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoFondo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFondo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoFondoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFondoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoFondo tipofondo:tipofondosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipofondo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoFondoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFondoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoFondo tipofondo:tipofondosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipofondo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoFondo(row);				
			//	iRow++;
			//}				
			
			//for(TipoFondo tipofondoAux:tipofondosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoFondo(tipofondoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipofondoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFondo(false);
			
			//SI ES MANUAL
			if(TipoFondoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFondo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoFondoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFondo(false);
			
			//SI ES MANUAL
			if(TipoFondoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFondo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoFondoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFondo(false);
			
			//SI ES MANUAL
			if(TipoFondoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFondo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofondoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoFondo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoFondo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoFondo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoFondo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoFondo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoFondo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoFondo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoFondo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoFondo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoFondo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoFondo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoFondo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoFondo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoFondo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFondo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoFondo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoFondoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoFondoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoFondo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoFondo();
		
		this.inicializarActualizarBindingBotonesManualTipoFondo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFondo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFondo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFondo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFondo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoFondo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoFondo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoFondo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoFondo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoFondo.jCheckBoxPostAccionNuevoTipoFondo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoFondo.jCheckBoxPostAccionSinCerrarTipoFondo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoFondo.jCheckBoxPostAccionSinMensajeTipoFondo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoFondo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoFondo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoFondo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoFondo!=null) {
				this.jInternalFrameDetalleFormTipoFondo.jCheckBoxPostAccionNuevoTipoFondo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoFondo.jCheckBoxPostAccionSinCerrarTipoFondo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoFondo.jCheckBoxPostAccionSinMensajeTipoFondo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoFondo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoFondo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoFondo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoFondo.jComboBoxTiposAccionesFormularioTipoFondo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoFondo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoFondo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFondo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoFondo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoFondo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoFondo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoFondo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoFondo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFondo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoFondo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoFondo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoFondo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoFondoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFondo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoFondo() throws Exception {
		try	{
			if(TipoFondoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFondo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFondo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoFondo.jComboBoxTiposAccionesFormularioTipoFondo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoFondo.jComboBoxTiposAccionesFormularioTipoFondo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFondo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoFondo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoFondo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoFondo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoFondo.addItem(reporte);
			}
			
			
			if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoFondo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoFondo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoFondo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoFondo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoFondo.jComboBoxTiposAccionesFormularioTipoFondo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoFondo.jComboBoxTiposAccionesFormularioTipoFondo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoFondo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoFondo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoFondo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFondo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFondo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFondo!=null) {
				this.jInternalFrameReporteDinamicoTipoFondo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFondo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFondo!=null) {
				this.jInternalFrameReporteDinamicoTipoFondo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFondo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoFondo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoFondo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFondo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFondo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoFondo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFondo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFondo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoFondo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoFondo(Boolean esInicializar) throws Exception {				
		if(TipoFondoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFondo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoFondo() throws Exception {
		this.inicializarActualizarBindingTablaTipoFondo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoFondo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoFondoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoFondoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoFondoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFondoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoFondoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoFondoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoFondo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipofondoLogic.getTipoFondos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipofondos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoFondo.setModel(new TipoFondoModel(this.tipofondoLogic.getTipoFondos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoFondo.setModel(new TipoFondoModel(this.tipofondos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoFondo!=null && this.jInternalFrameOrderByTipoFondo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoFondo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFondo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoFondoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoFondoConstantesFunciones.SCLASSWEBTITULO,tipofondoConstantesFunciones.resaltarSeleccionarTipoFondo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoFondoConstantesFunciones.SCLASSWEBTITULO,tipofondoConstantesFunciones.resaltarSeleccionarTipoFondo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFondo,TipoFondoConstantesFunciones.LABEL_ID));

		if(this.tipofondoConstantesFunciones.mostraridTipoFondo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFondoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipofondoConstantesFunciones.resaltaridTipoFondo,this.tipofondoConstantesFunciones.activaridTipoFondo,this,true,"idTipoFondo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofondoConstantesFunciones.resaltaridTipoFondo,this.tipofondoConstantesFunciones.activaridTipoFondo,this,true,"idTipoFondo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFondo,TipoFondoConstantesFunciones.LABEL_CODIGO));

		if(this.tipofondoConstantesFunciones.mostrarcodigoTipoFondo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFondoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipofondoConstantesFunciones.resaltarcodigoTipoFondo,this.tipofondoConstantesFunciones.activarcodigoTipoFondo,this,true,"codigoTipoFondo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofondoConstantesFunciones.resaltarcodigoTipoFondo,this.tipofondoConstantesFunciones.activarcodigoTipoFondo,this,true,"codigoTipoFondo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFondoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFondo,TipoFondoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipofondoConstantesFunciones.mostrarnombreTipoFondo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFondoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipofondoConstantesFunciones.resaltarnombreTipoFondo,this.tipofondoConstantesFunciones.activarnombreTipoFondo,this,true,"nombreTipoFondo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofondoConstantesFunciones.resaltarnombreTipoFondo,this.tipofondoConstantesFunciones.activarnombreTipoFondo,this,true,"nombreTipoFondo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFondoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipofondoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipofondoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipofondoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFondo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipofondoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipofondoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFondo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoFondo && this.isPermisoGuardarCambiosTipoFondo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipofondoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipofondoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoFondo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoFondo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFondo && this.isPermisoGuardarCambiosTipoFondo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFondo && this.isPermisoGuardarCambiosTipoFondo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoFondo.moveColumn(this.jTableDatosTipoFondo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoFondo.moveColumn(this.jTableDatosTipoFondo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoFondo.moveColumn(this.jTableDatosTipoFondo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoFondo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoFondo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoFondo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoFondo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoFondo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoFondo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoFondo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoFondo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipofondoLogic.getTipoFondos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipofondos.size()-1;
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
		//this.jTableDatosTipoFondo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoFondo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoFondo();
			
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
				
				//this.isEsNuevoTipoFondo=false;
					
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			
				if(this.tipofondoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoFondo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFondo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFondo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondo =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondo =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipofondo.getsType().equals("DUPLICADO")
				   || this.tipofondo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoFondo=true;
				
				} else {
					this.isEsNuevoTipoFondo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipofondoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipofondo.getId()>=0 && !this.tipofondo.getIsNew()) {						
						this.isEsNuevoTipoFondo=false;
						
					} else {
						this.isEsNuevoTipoFondo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoFondo(esRelaciones);						
				
				this.seleccionarTipoFondo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipofondo.getId()<0) {
					this.isEsNuevoTipoFondo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoFondo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoFondo(evt,rowIndex);
				}	
				
				if(this.tipofondoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoFondo: " + this.dDif); 
					}
				}								
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoFondo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipofondo)) {
					if(this.tipofondo.getId()>0) {
						this.tipofondo.setIsDeleted(true);
						
						this.tipofondosEliminados.add(this.tipofondo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipofondoLogic.getTipoFondos().remove(this.tipofondo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipofondos.remove(this.tipofondo);				
					}
					
					
					((TipoFondoModel) this.jTableDatosTipoFondo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFondo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoFondo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoFondo) {
			
			if(this.jInternalFrameDetalleFormTipoFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFondo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFondo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondo =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondo =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoFondo(this.tipofondo);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoFondo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoFondo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFondo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFondo(TipoFondo tipofondo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoFondo(tipofondo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFondo(TipoFondo tipofondo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoFondo(tipofondo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoFondo(tipofondo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoFondo(tipofondo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoFondo(TipoFondo tipofondo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoFondo.jTextFieldidTipoFondo.setText(tipofondo.getId().toString());
			this.jInternalFrameDetalleFormTipoFondo.jTextFieldcodigoTipoFondo.setText(tipofondo.getcodigo());
			this.jInternalFrameDetalleFormTipoFondo.jTextAreanombreTipoFondo.setText(tipofondo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoFondo tipofondoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipofondoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoFondo tipofondoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipofondoLocal=this.tipofondo;
			} else {
				tipofondoLocal=this.tipofondoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipofondoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoFondo(tipofondoLocal,true);
					
					if(tipofondoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipofondoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipofondoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipofondoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoFondo(TipoFondo tipofondo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFondo(tipofondo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(tipofondo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFondo(TipoFondo tipofondo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFondo(tipofondo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFondo(TipoFondo tipofondo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoFondo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoFondo.jTextFieldidTipoFondo.getText()==null || this.jInternalFrameDetalleFormTipoFondo.jTextFieldidTipoFondo.getText()=="" || this.jInternalFrameDetalleFormTipoFondo.jTextFieldidTipoFondo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoFondo.jTextFieldidTipoFondo.setText("0");
			}

			if(conColumnasBase) {tipofondo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoFondo.jTextFieldidTipoFondo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFondoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFondo.jLabelIdTipoFondo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipofondo.setcodigo(this.jInternalFrameDetalleFormTipoFondo.jTextFieldcodigoTipoFondo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFondoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFondo.jLabelcodigoTipoFondo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipofondo.setnombre(this.jInternalFrameDetalleFormTipoFondo.jTextAreanombreTipoFondo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFondoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFondo.jLabelnombreTipoFondo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFondo(TipoFondo tipofondoBean,TipoFondo tipofondo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoFondo(TipoFondo tipofondoOrigen,TipoFondo tipofondo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipofondoOrigen.getId()!=null && !tipofondoOrigen.getId().equals(0L))) {tipofondo.setId(tipofondoOrigen.getId());}}
			if(conDefault || (!conDefault && tipofondoOrigen.getcodigo()!=null && !tipofondoOrigen.getcodigo().equals(""))) {tipofondo.setcodigo(tipofondoOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipofondoOrigen.getnombre()!=null && !tipofondoOrigen.getnombre().equals(""))) {tipofondo.setnombre(tipofondoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFondo(TipoFondo tipofondo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFondo.jTextFieldidTipoFondo.setText(tipofondo.getId().toString());
			this.jInternalFrameDetalleFormTipoFondo.jTextFieldcodigoTipoFondo.setText(tipofondo.getcodigo());
			this.jInternalFrameDetalleFormTipoFondo.jTextAreanombreTipoFondo.setText(tipofondo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFondo(TipoFondoBean tipofondoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFondo.jTextFieldidTipoFondo.setText(tipofondoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoFondo.jTextFieldcodigoTipoFondo.setText(tipofondoBean.getcodigo());
			this.jInternalFrameDetalleFormTipoFondo.jTextAreanombreTipoFondo.setText(tipofondoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoFondo(TipoFondoParameterReturnGeneral tipofondoReturnGeneral,TipoFondoBean tipofondoBean,Boolean conDefault) throws Exception { 
		try {
			TipoFondo tipofondoLocal=new TipoFondo();
			
			tipofondoLocal=tipofondoReturnGeneral.getTipoFondo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipofondoLocal.getId()!=null && !tipofondoLocal.getId().equals(0L))) {tipofondoBean.setId(tipofondoLocal.getId());}}
			if(conDefault || (!conDefault && tipofondoLocal.getcodigo()!=null && !tipofondoLocal.getcodigo().equals(""))) {tipofondoBean.setcodigo(tipofondoLocal.getcodigo());}
			if(conDefault || (!conDefault && tipofondoLocal.getnombre()!=null && !tipofondoLocal.getnombre().equals(""))) {tipofondoBean.setnombre(tipofondoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoFondoGenerico(Long idTipoFondoSeleccionado,JComboBox jComboBoxTipoFondo,List<TipoFondo> tipofondosLocal)throws Exception {
		try {
			TipoFondo  tipofondoTemp=null;

			for(TipoFondo tipofondoAux:tipofondosLocal) {
				if(tipofondoAux.getId()!=null && tipofondoAux.getId().equals(idTipoFondoSeleccionado)) {
					tipofondoTemp=tipofondoAux;
					break;
				}
			}

			jComboBoxTipoFondo.setSelectedItem(tipofondoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoFondoGenerico(JComboBox jComboBoxTipoFondo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFondo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoFondo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFondo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoFondo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoFondo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoFondo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofondo=(TipoFondo) tipofondoLogic.getTipoFondos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipofondo =(TipoFondo) tipofondos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoFondo tipofondoRow=new TipoFondo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofondoRow=(TipoFondo) tipofondoLogic.getTipoFondos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipofondoRow=(TipoFondo) tipofondos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoFondo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoFondo.setVisible((this.isVisibilidadCeldaNuevoTipoFondo && this.isPermisoNuevoTipoFondo));			
			this.jButtonDuplicarTipoFondo.setVisible((this.isVisibilidadCeldaDuplicarTipoFondo && this.isPermisoDuplicarTipoFondo));			
			this.jButtonCopiarTipoFondo.setVisible((this.isVisibilidadCeldaCopiarTipoFondo && this.isPermisoCopiarTipoFondo));
			this.jButtonVerFormTipoFondo.setVisible((this.isVisibilidadCeldaVerFormTipoFondo && this.isPermisoVerFormTipoFondo));
			
			this.jButtonAbrirOrderByTipoFondo.setVisible((this.isVisibilidadCeldaOrdenTipoFondo && this.isPermisoOrdenTipoFondo));			
			
			this.jButtonNuevoRelacionesTipoFondo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFondo && this.isPermisoNuevoTipoFondo));			
			this.jButtonNuevoGuardarCambiosTipoFondo.setVisible((this.isVisibilidadCeldaNuevoTipoFondo && this.isPermisoNuevoTipoFondo && this.isPermisoGuardarCambiosTipoFondo));
			
			if(this.jInternalFrameDetalleFormTipoFondo!=null) {
			this.jInternalFrameDetalleFormTipoFondo.jButtonModificarTipoFondo.setVisible((this.isVisibilidadCeldaModificarTipoFondo && this.isPermisoActualizarTipoFondo));	
			this.jInternalFrameDetalleFormTipoFondo.jButtonActualizarTipoFondo.setVisible((this.isVisibilidadCeldaActualizarTipoFondo && this.isPermisoActualizarTipoFondo));	
			this.jInternalFrameDetalleFormTipoFondo.jButtonEliminarTipoFondo.setVisible((this.isVisibilidadCeldaEliminarTipoFondo && this.isPermisoEliminarTipoFondo));
			this.jInternalFrameDetalleFormTipoFondo.jButtonCancelarTipoFondo.setVisible(this.isVisibilidadCeldaCancelarTipoFondo);							
			this.jInternalFrameDetalleFormTipoFondo.jButtonGuardarCambiosTipoFondo.setVisible((this.isVisibilidadCeldaGuardarTipoFondo && this.isPermisoGuardarCambiosTipoFondo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoFondo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFondo && this.isPermisoGuardarCambiosTipoFondo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoFondo.setVisible((this.isVisibilidadCeldaNuevoTipoFondo && this.isPermisoNuevoTipoFondo));						
			this.jButtonDuplicarToolBarTipoFondo.setVisible((this.isVisibilidadCeldaDuplicarTipoFondo && this.isPermisoDuplicarTipoFondo));						
			this.jButtonCopiarToolBarTipoFondo.setVisible((this.isVisibilidadCeldaCopiarTipoFondo && this.isPermisoCopiarTipoFondo));			
			this.jButtonVerFormToolBarTipoFondo.setVisible((this.isVisibilidadCeldaVerFormTipoFondo && this.isPermisoVerFormTipoFondo));			
			this.jButtonAbrirOrderByToolBarTipoFondo.setVisible((this.isVisibilidadCeldaOrdenTipoFondo && this.isPermisoOrdenTipoFondo));
			this.jButtonNuevoRelacionesToolBarTipoFondo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFondo && this.isPermisoNuevoTipoFondo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoFondo.setVisible((this.isVisibilidadCeldaNuevoTipoFondo && this.isPermisoNuevoTipoFondo && this.isPermisoGuardarCambiosTipoFondo));			
			
			if(this.jInternalFrameDetalleFormTipoFondo!=null) {
			this.jInternalFrameDetalleFormTipoFondo.jButtonModificarToolBarTipoFondo.setVisible((this.isVisibilidadCeldaModificarTipoFondo && this.isPermisoActualizarTipoFondo));	
			this.jInternalFrameDetalleFormTipoFondo.jButtonActualizarToolBarTipoFondo.setVisible((this.isVisibilidadCeldaActualizarTipoFondo  && this.isPermisoActualizarTipoFondo));	
			this.jInternalFrameDetalleFormTipoFondo.jButtonEliminarToolBarTipoFondo.setVisible((this.isVisibilidadCeldaEliminarTipoFondo && this.isPermisoEliminarTipoFondo));
			this.jInternalFrameDetalleFormTipoFondo.jButtonCancelarToolBarTipoFondo.setVisible(this.isVisibilidadCeldaCancelarTipoFondo);				
			this.jInternalFrameDetalleFormTipoFondo.jButtonGuardarCambiosToolBarTipoFondo.setVisible((this.isVisibilidadCeldaGuardarTipoFondo && this.isPermisoGuardarCambiosTipoFondo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoFondo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFondo && this.isPermisoGuardarCambiosTipoFondo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoFondo.setVisible((this.isVisibilidadCeldaNuevoTipoFondo && this.isPermisoNuevoTipoFondo));			
			this.jMenuItemDuplicarTipoFondo.setVisible((this.isVisibilidadCeldaDuplicarTipoFondo && this.isPermisoDuplicarTipoFondo));			
			this.jMenuItemCopiarTipoFondo.setVisible((this.isVisibilidadCeldaCopiarTipoFondo && this.isPermisoCopiarTipoFondo));			
			this.jMenuItemVerFormTipoFondo.setVisible((this.isVisibilidadCeldaVerFormTipoFondo && this.isPermisoVerFormTipoFondo));			
			this.jMenuItemAbrirOrderByTipoFondo.setVisible((this.isVisibilidadCeldaOrdenTipoFondo && this.isPermisoOrdenTipoFondo));			
			//this.jMenuItemMostrarOcultarTipoFondo.setVisible((this.isVisibilidadCeldaOrdenTipoFondo && this.isPermisoOrdenTipoFondo));
			this.jMenuItemDetalleAbrirOrderByTipoFondo.setVisible((this.isVisibilidadCeldaOrdenTipoFondo && this.isPermisoOrdenTipoFondo));			
			//this.jMenuItemDetalleMostrarOcultarTipoFondo.setVisible((this.isVisibilidadCeldaOrdenTipoFondo && this.isPermisoOrdenTipoFondo));			
			this.jMenuItemNuevoRelacionesTipoFondo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFondo && this.isPermisoNuevoTipoFondo));			
			this.jMenuItemNuevoGuardarCambiosTipoFondo.setVisible((this.isVisibilidadCeldaNuevoTipoFondo && this.isPermisoNuevoTipoFondo && this.isPermisoGuardarCambiosTipoFondo));									
			
			if(this.jInternalFrameDetalleFormTipoFondo!=null) {
			this.jInternalFrameDetalleFormTipoFondo.jMenuItemModificarTipoFondo.setVisible((this.isVisibilidadCeldaModificarTipoFondo && this.isPermisoActualizarTipoFondo));	
			this.jInternalFrameDetalleFormTipoFondo.jMenuItemActualizarTipoFondo.setVisible((this.isVisibilidadCeldaActualizarTipoFondo && this.isPermisoActualizarTipoFondo));	
			this.jInternalFrameDetalleFormTipoFondo.jMenuItemEliminarTipoFondo.setVisible((this.isVisibilidadCeldaEliminarTipoFondo && this.isPermisoEliminarTipoFondo));
			this.jInternalFrameDetalleFormTipoFondo.jMenuItemCancelarTipoFondo.setVisible(this.isVisibilidadCeldaCancelarTipoFondo);				
			}
			
			this.jMenuItemGuardarCambiosTipoFondo.setVisible((this.isVisibilidadCeldaGuardarTipoFondo && this.isPermisoGuardarCambiosTipoFondo));						
			this.jMenuItemGuardarCambiosTablaTipoFondo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFondo && this.isPermisoGuardarCambiosTipoFondo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoFondo=this.jButtonNuevoTipoFondo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoFondo=this.jButtonDuplicarTipoFondo.isVisible();
			this.isVisibilidadCeldaCopiarTipoFondo=this.jButtonCopiarTipoFondo.isVisible();
			this.isVisibilidadCeldaVerFormTipoFondo=this.jButtonVerFormTipoFondo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoFondo=this.jButtonAbrirOrderByTipoFondo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoFondo=this.jButtonNuevoRelacionesTipoFondo.isVisible();
			this.isVisibilidadCeldaModificarTipoFondo=this.jButtonModificarTipoFondo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFondo!=null) {
			this.isVisibilidadCeldaActualizarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jButtonActualizarTipoFondo.isVisible();
			this.isVisibilidadCeldaEliminarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jButtonEliminarTipoFondo.isVisible();
			this.isVisibilidadCeldaCancelarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jButtonCancelarTipoFondo.isVisible();
			this.isVisibilidadCeldaGuardarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jButtonGuardarCambiosTipoFondo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoFondo=this.jButtonGuardarCambiosTablaTipoFondo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoFondo=this.jButtonNuevoToolBarTipoFondo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFondo=this.jButtonNuevoRelacionesToolBarTipoFondo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFondo!=null) {
			this.isVisibilidadCeldaModificarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jButtonModificarToolBarTipoFondo.isVisible();
			this.isVisibilidadCeldaActualizarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jButtonActualizarToolBarTipoFondo.isVisible();
			this.isVisibilidadCeldaEliminarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jButtonEliminarToolBarTipoFondo.isVisible();
			this.isVisibilidadCeldaCancelarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jButtonCancelarToolBarTipoFondo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFondo=this.jButtonGuardarCambiosToolBarTipoFondo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFondo=this.jButtonGuardarCambiosTablaToolBarTipoFondo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoFondo=this.jMenuItemNuevoTipoFondo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFondo=this.jMenuItemNuevoRelacionesTipoFondo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFondo!=null) {
			this.isVisibilidadCeldaModificarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jMenuItemModificarTipoFondo.isVisible();
			this.isVisibilidadCeldaActualizarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jMenuItemActualizarTipoFondo.isVisible();
			this.isVisibilidadCeldaEliminarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jMenuItemEliminarTipoFondo.isVisible();
			this.isVisibilidadCeldaCancelarTipoFondo=this.jInternalFrameDetalleFormTipoFondo.jMenuItemCancelarTipoFondo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFondo=this.jMenuItemGuardarCambiosTipoFondo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFondo=this.jMenuItemGuardarCambiosTablaTipoFondo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoFondo(Boolean esInicializar) {
		if(TipoFondoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipofondoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipofondoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFondo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoFondo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoFondo() {
		this.jButtonNuevoTipoFondo.setVisible(this.isPermisoNuevoTipoFondo);			
		this.jButtonDuplicarTipoFondo.setVisible(this.isPermisoDuplicarTipoFondo);			
		this.jButtonCopiarTipoFondo.setVisible(this.isPermisoCopiarTipoFondo);			
		this.jButtonVerFormTipoFondo.setVisible(this.isPermisoVerFormTipoFondo);			
		
		this.jButtonAbrirOrderByTipoFondo.setVisible(this.isPermisoOrdenTipoFondo);					
		
		this.jButtonNuevoRelacionesTipoFondo.setVisible(this.isPermisoNuevoTipoFondo);			
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.jButtonModificarTipoFondo.setVisible(this.isPermisoActualizarTipoFondo);	
			this.jInternalFrameDetalleFormTipoFondo.jButtonActualizarTipoFondo.setVisible(this.isPermisoActualizarTipoFondo);	
			this.jInternalFrameDetalleFormTipoFondo.jButtonEliminarTipoFondo.setVisible(this.isPermisoEliminarTipoFondo);
			this.jInternalFrameDetalleFormTipoFondo.jButtonCancelarTipoFondo.setVisible(this.isVisibilidadCeldaCancelarTipoFondo);						
			this.jInternalFrameDetalleFormTipoFondo.jButtonGuardarCambiosTipoFondo.setVisible(this.isPermisoGuardarCambiosTipoFondo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoFondo.setVisible(this.isPermisoActualizarTipoFondo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFondo() {
		this.jInternalFrameDetalleFormTipoFondo.jButtonModificarTipoFondo.setVisible(this.isPermisoActualizarTipoFondo);	
		this.jInternalFrameDetalleFormTipoFondo.jButtonActualizarTipoFondo.setVisible(this.isPermisoActualizarTipoFondo);	
		this.jInternalFrameDetalleFormTipoFondo.jButtonEliminarTipoFondo.setVisible(this.isPermisoEliminarTipoFondo);
		this.jInternalFrameDetalleFormTipoFondo.jButtonCancelarTipoFondo.setVisible(this.isVisibilidadCeldaCancelarTipoFondo);							
		this.jInternalFrameDetalleFormTipoFondo.jButtonGuardarCambiosTipoFondo.setVisible((this.isVisibilidadCeldaGuardarTipoFondo && this.isPermisoGuardarCambiosTipoFondo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoFondo() {
		if(TipoFondoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoFondo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoFondo() {
	}
	
	public void jTableDatosTipoFondoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoFondo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoFondoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFondo(this.gettipofondo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(this.tipofondo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofondo =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofondo =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofondo==null) {
						this.tipofondo = new TipoFondo();
					}

					this.setVariablesFormularioToObjetoActualTipoFondo(this.tipofondo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(this.tipofondo);
				}

				if(this.tipofondo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipofondo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFondo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoFondoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFondo(this.gettipofondo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(this.tipofondo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofondo =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofondo =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofondo==null) {
						this.tipofondo = new TipoFondo();
					}

					this.setVariablesFormularioToObjetoActualTipoFondo(this.tipofondo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(this.tipofondo);
				}

				if(this.tipofondo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipofondo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFondo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoFondoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFondo(this.gettipofondo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(this.tipofondo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofondo =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofondo =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofondo==null) {
						this.tipofondo = new TipoFondo();
					}

					this.setVariablesFormularioToObjetoActualTipoFondo(this.tipofondo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(this.tipofondo);
				}

				if(this.tipofondo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipofondo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFondo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoFondo() {
		if(this.jInternalFrameDetalleFormTipoFondo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) {
			this.jInternalFrameDetalleFormTipoFondo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoFondo.dispose();
			this.jInternalFrameDetalleFormTipoFondo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoFondo!=null) {
			this.jInternalFrameReporteDinamicoTipoFondo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoFondo.dispose();
			this.jInternalFrameReporteDinamicoTipoFondo=null;
		}
		
		if(this.jInternalFrameImportacionTipoFondo!=null) {
			this.jInternalFrameImportacionTipoFondo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoFondo.dispose();
			this.jInternalFrameImportacionTipoFondo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoFondo();
			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoFondo")) {
				jButtonNuevoTipoFondoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoFondo")) {
				jButtonDuplicarTipoFondoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoFondo")) {
				jButtonCopiarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoFondo")) {
				jButtonVerFormTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoFondo")) {
				jButtonNuevoTipoFondoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoFondo")) {
				jButtonDuplicarTipoFondoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoFondo")) {
				jButtonNuevoTipoFondoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoFondo")) {
				jButtonDuplicarTipoFondoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoFondo")) {
				jButtonNuevoTipoFondoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoFondo")) {
				jButtonNuevoTipoFondoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoFondo")) {
				jButtonNuevoTipoFondoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoFondo")) {
				jButtonModificarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoFondo")) {
				jButtonModificarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoFondo")) {
				jButtonModificarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoFondo")) {
				jButtonActualizarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoFondo")) {
				jButtonActualizarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoFondo")) {
				jButtonActualizarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoFondo")) {
				jButtonEliminarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoFondo")) {
				jButtonEliminarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoFondo")) {
				jButtonEliminarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoFondo")) {
				jButtonCancelarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoFondo")) {
				jButtonCancelarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoFondo")) {
				jButtonCancelarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoFondo")) {
				jButtonCerrarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoFondo")) {
				jButtonCerrarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoFondo")) {
				jButtonCerrarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoFondo")) {
				jButtonMostrarOcultarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoFondo")) {
				jButtonCancelarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoFondo")) {
				jButtonGuardarCambiosTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoFondo")) {
				jButtonGuardarCambiosTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoFondo")) {
				jButtonCopiarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoFondo")) {
				jButtonVerFormTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoFondo")) {
				jButtonGuardarCambiosTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoFondo")) {
				jButtonCopiarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoFondo")) {
				jButtonVerFormTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoFondo")) {
				jButtonGuardarCambiosTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoFondo")) {
				jButtonGuardarCambiosTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoFondo")) {
				jButtonGuardarCambiosTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoFondo")) {
				jButtonRecargarInformacionTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoFondo")) {
				jButtonRecargarInformacionTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoFondo")) {
				jButtonRecargarInformacionTipoFondoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoFondo")) {
				jButtonAnterioresTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoFondo")) {
				jButtonAnterioresTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoFondo")) {
				jButtonAnterioresTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoFondo")) {
				jButtonSiguientesTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoFondo")) {
				jButtonSiguientesTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoFondo")) {
				jButtonSiguientesTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoFondo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoFondo")) {
				jButtonAbrirOrderByTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoFondo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoFondo")) {
				jButtonMostrarOcultarTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFondo")) {
				jButtonNuevoGuardarCambiosTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoFondo")) {
				jButtonNuevoGuardarCambiosTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoFondo")) {
				jButtonNuevoGuardarCambiosTipoFondoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoFondo")) {
				jButtonCerrarReporteDinamicoTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoFondo")) {
				jButtonGenerarReporteDinamicoTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoFondo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoFondoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoFondo")) {
				jButtonCerrarImportacionTipoFondoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoFondo")) {
				
				jButtonGenerarImportacionTipoFondoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoFondo")) {
				
				jButtonAbrirImportacionTipoFondoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoFondo")) {
				jComboBoxTiposAccionesTipoFondoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoFondo")) {
				jComboBoxTiposRelacionesTipoFondoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoFondo")) {
				jComboBoxTiposAccionesTipoFondoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoFondo")) {
				
				jComboBoxTiposSeleccionarTipoFondoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoFondo")) {
				jTextFieldValorCampoGeneralTipoFondoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoFondo")) {
				jButtonAbrirOrderByTipoFondoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoFondo")) {
				jButtonAbrirOrderByTipoFondoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoFondo")) {
				jButtonCerrarOrderByTipoFondoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFondoBusqueda")) {
				this.jButtonidTipoFondoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoFondoBusqueda")) {
				this.jButtoncodigoTipoFondoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFondoBusqueda")) {
				this.jButtonnombreTipoFondoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoFondo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				


				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoFondo tipofondoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipofondoLocal=this.tipofondo;
			} else {
				tipofondoLocal=this.tipofondoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
							
				
				


				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoAnterior =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondoAnterior =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
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
			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			
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
			
			


			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
								
						
				


				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
								
				
				


				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoAnterior =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondoAnterior =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoAnterior =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondoAnterior =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
							
				
				


				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofondoAnterior =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipofondoAnterior =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
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
			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			
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
			
			


			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
								
				
				


				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoAnterior =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondoAnterior =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoFondo")) {
					jCheckBoxSeleccionarTodosTipoFondoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoFondo")) {
					jCheckBoxSeleccionadosTipoFondoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoFondo")) {
					
				}
				
				


				
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
												
				
				


				
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofondoAnterior =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipofondoAnterior =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
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
			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
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
			
			


			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFondoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofondo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofondo);
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
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
				
				


				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFondo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFondo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFondoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofondoAnterior =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofondoAnterior =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoFondo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoFondoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoFondo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipofondo =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipofondo =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipofondo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoFondo")) {
				
				}
				
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoFondo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoFondo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoFondo")) {
			
			}
			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoFondo();
			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoFondo")) {
				jButtonNuevoTipoFondoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoFondo")) {
				jButtonDuplicarTipoFondoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoFondo")) {
				jButtonCopiarTipoFondoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoFondo")) {
				jButtonVerFormTipoFondoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoFondo")) {
				jButtonNuevoTipoFondoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoFondo")) {
				jButtonModificarTipoFondoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoFondo")) {
				jButtonActualizarTipoFondoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoFondo")) {
				jButtonEliminarTipoFondoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoFondo")) {
				jButtonGuardarCambiosTipoFondoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoFondo")) {
				jButtonCancelarTipoFondoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoFondo")) {
				jButtonCerrarTipoFondoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoFondo")) {
				jButtonGuardarCambiosTipoFondoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFondo")) {
				jButtonNuevoGuardarCambiosTipoFondoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoFondo")) {
				jButtonAbrirOrderByTipoFondoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoFondo")) {
				jButtonRecargarInformacionTipoFondoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoFondo")) {
				jButtonAnterioresTipoFondoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoFondo")) {
				jButtonSiguientesTipoFondoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFondoBusqueda")) {
				this.jButtonidTipoFondoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoFondoBusqueda")) {
				this.jButtoncodigoTipoFondoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFondoBusqueda")) {
				this.jButtonnombreTipoFondoBusquedaActionPerformed(evt);
			}
			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoFondo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoFondo")) {
				closingInternalFrameTipoFondo();
				
			} else if(sTipo.equals("jButtonCancelarTipoFondo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoFondo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoFondoBeanSwingJInternalFrame jInternalFrameParent=(TipoFondoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFondo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoFondoActionPerformed(null);
			}
			
			TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipofondo,new Object(),this.tipofondoParameterGeneral,this.tipofondoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoFondo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoFondo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoFondo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipofondo)) {
			if(!esControlTabla) {
				if(TipoFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoFondo(this.tipofondo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(this.tipofondo);			
				}
				
				if(this.tipofondoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoFondo(this.tipofondo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipofondoReturnGeneral=tipofondoLogic.procesarEventosTipoFondosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofondoLogic.getTipoFondos(),this.tipofondo,this.tipofondoParameterGeneral,this.isEsNuevoTipoFondo,classes);//this.tipofondoLogic.getTipoFondo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoFondo(this.tipofondoReturnGeneral,this.tipofondoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipofondoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoFondo(classes,this.tipofondoReturnGeneral,this.tipofondoBean,false);
					}
						
					if(this.tipofondoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoFondo(this.tipofondoReturnGeneral.getTipoFondo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoFondo(this.tipofondoReturnGeneral.getTipoFondo());	
					}
						
					if(this.tipofondoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoFondo(this.tipofondoReturnGeneral.getTipoFondo(),classes);//this.tipofondoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoFondo(this.tipofondo,classes);//this.tipofondoBean);									
				}
			
				if(TipoFondoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoFondo(this.tipofondo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFondo(this.tipofondo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipofondoAnterior!=null) {
						this.tipofondo=this.tipofondoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipofondoReturnGeneral=tipofondoLogic.procesarEventosTipoFondosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofondoLogic.getTipoFondos(),this.tipofondo,this.tipofondoParameterGeneral,this.isEsNuevoTipoFondo,classes);//this.tipofondoLogic.getTipoFondo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipofondoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipofondoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipofondoReturnGeneral.getTipoFondo(),tipofondoLogic.getTipoFondos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipofondoReturnGeneral.getTipoFondo(),this.tipofondos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoFondo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoFondo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoFondo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoFondo() throws Exception {
		
		TipoFondoModel tipofondoModel=(TipoFondoModel)this.jTableDatosTipoFondo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofondoModel.tipofondos=this.tipofondoLogic.getTipoFondos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipofondoModel.tipofondos=this.tipofondos;
		}
		
		
		((TipoFondoModel) this.jTableDatosTipoFondo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoFondo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipofondoAnterior(),this.tipofondoLogic.getTipoFondos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipofondoAnterior(),this.tipofondos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoFondo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoFondo(TipoFondo tipofondo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
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
										
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofondo,new Object(),generalEntityParameterGeneral,this.tipofondoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipofondoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoFondoConstantesFunciones.getClassesRelationshipsOfTipoFondo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoFondoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoFondo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoFondo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoFondoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofondo,new Object(),generalEntityParameterGeneral,this.tipofondoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoFondo(TipoFondoBean tipofondoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoFondo(ArrayList<Classe> classes,TipoFondoReturnGeneral tipofondoReturnGeneral,TipoFondoBean tipofondoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoFondo(TipoFondo tipofondo,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipofondo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoFondo = new TipoFondoDetalleFormJInternalFrame(jDesktopPane,this.tipofondoSessionBean.getConGuardarRelaciones(),this.tipofondoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFondo);
		this.jInternalFrameDetalleFormTipoFondo.setVisible(false);
		this.jInternalFrameDetalleFormTipoFondo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoFondo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoFondo.tipofondoLogic=this.tipofondoLogic;
		
		this.cargarCombosFrameForeignKeyTipoFondo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFondo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFondo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoFondo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoFondo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoFondo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFondo"));
		
		this.jInternalFrameDetalleFormTipoFondo.jButtonModificarTipoFondo.addActionListener(new ButtonActionListener(this,"ModificarTipoFondo"));

		
		this.jInternalFrameDetalleFormTipoFondo.jButtonModificarToolBarTipoFondo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFondo"));
					
		this.jInternalFrameDetalleFormTipoFondo.jMenuItemModificarTipoFondo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFondo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFondo.jButtonActualizarTipoFondo.addActionListener (new ButtonActionListener(this,"ActualizarTipoFondo"));
		
		
		this.jInternalFrameDetalleFormTipoFondo.jButtonActualizarToolBarTipoFondo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFondo"));
						
		this.jInternalFrameDetalleFormTipoFondo.jMenuItemActualizarTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFondo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFondo.jButtonEliminarTipoFondo.addActionListener (new ButtonActionListener(this,"EliminarTipoFondo"));
		
		
		this.jInternalFrameDetalleFormTipoFondo.jButtonEliminarToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFondo"));
								
		this.jInternalFrameDetalleFormTipoFondo.jMenuItemEliminarTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFondo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFondo.jButtonCancelarTipoFondo.addActionListener (new ButtonActionListener(this,"CancelarTipoFondo"));
		
		
		this.jInternalFrameDetalleFormTipoFondo.jButtonCancelarToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFondo"));
					
		this.jInternalFrameDetalleFormTipoFondo.jMenuItemCancelarTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFondo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoFondo.jMenuItemDetalleCerrarTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFondo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFondo.jButtonGuardarCambiosToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFondo"));
		
		
		
		this.jInternalFrameDetalleFormTipoFondo.jButtonGuardarCambiosToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFondo"));
		
		
		
		this.jInternalFrameDetalleFormTipoFondo.jComboBoxTiposAccionesFormularioTipoFondo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFondo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondo.jButtonidTipoFondoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFondoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondo.jButtoncodigoTipoFondoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFondoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondo.jButtonnombreTipoFondoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFondoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoFondo.jTabbedPaneRelacionesTipoFondo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFondo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoFondo"));
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFondo"));
		}
		
		this.jTableDatosTipoFondo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoFondo"));
		
		this.jTableDatosTipoFondo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoFondo"));
		
		this.jButtonNuevoTipoFondo.addActionListener(new ButtonActionListener(this,"NuevoTipoFondo"));
		
		this.jButtonDuplicarTipoFondo.addActionListener(new ButtonActionListener(this,"DuplicarTipoFondo"));
		
		this.jButtonCopiarTipoFondo.addActionListener(new ButtonActionListener(this,"CopiarTipoFondo"));
		
		this.jButtonVerFormTipoFondo.addActionListener(new ButtonActionListener(this,"VerFormTipoFondo"));
		
		
		this.jButtonNuevoToolBarTipoFondo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoFondo"));
			
		this.jButtonDuplicarToolBarTipoFondo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoFondo"));
			
		this.jMenuItemNuevoTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoFondo"));
			
		this.jMenuItemDuplicarTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoFondo"));		
		
		
		this.jButtonNuevoRelacionesTipoFondo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoFondo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoFondo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoFondo"));
			
		this.jMenuItemNuevoRelacionesTipoFondo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoFondo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.jButtonModificarTipoFondo.addActionListener(new ButtonActionListener(this,"ModificarTipoFondo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.jButtonModificarToolBarTipoFondo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFondo"));
			
			this.jInternalFrameDetalleFormTipoFondo.jMenuItemModificarTipoFondo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFondo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoFondo.jButtonActualizarTipoFondo.addActionListener (new ButtonActionListener(this,"ActualizarTipoFondo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.jButtonActualizarToolBarTipoFondo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFondo"));
				
			this.jInternalFrameDetalleFormTipoFondo.jMenuItemActualizarTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFondo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.jButtonEliminarTipoFondo.addActionListener (new ButtonActionListener(this,"EliminarTipoFondo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.jButtonEliminarToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFondo"));
						
			this.jInternalFrameDetalleFormTipoFondo.jMenuItemEliminarTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFondo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.jButtonCancelarTipoFondo.addActionListener (new ButtonActionListener(this,"CancelarTipoFondo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.jButtonCancelarToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFondo"));
			
			this.jInternalFrameDetalleFormTipoFondo.jMenuItemCancelarTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFondo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoFondo"));		
		
		
		this.jButtonCerrarTipoFondo.addActionListener (new ButtonActionListener(this,"CerrarTipoFondo"));
		
		
		this.jButtonCerrarToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoFondo"));
			
		this.jMenuItemCerrarTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoFondo"));
			
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.jMenuItemDetalleCerrarTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFondo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.jButtonGuardarCambiosTipoFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoFondo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.jButtonGuardarCambiosToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFondo"));
		}
		
		this.jButtonCopiarToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoFondo"));
			
		this.jButtonVerFormToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoFondo"));
		
		this.jMenuItemGuardarCambiosTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoFondo"));
			
		this.jMenuItemCopiarTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoFondo"));		
		
		this.jMenuItemVerFormTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoFondo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFondo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoFondo"));
			
		this.jMenuItemGuardarCambiosTablaTipoFondo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFondo"));		
		
		
		
		this.jButtonRecargarInformacionTipoFondo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoFondo"));
					
		this.jButtonRecargarInformacionToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoFondo"));
		
		this.jMenuItemRecargarInformacionTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoFondo"));		
		
		
		
		this.jButtonAnterioresTipoFondo.addActionListener (new ButtonActionListener(this,"AnterioresTipoFondo"));
		
		
		this.jButtonAnterioresToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoFondo"));
		
		this.jMenuItemAnterioresTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoFondo"));		
		
		
		this.jButtonSiguientesTipoFondo.addActionListener (new ButtonActionListener(this,"SiguientesTipoFondo"));
		
		
		this.jButtonSiguientesToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoFondo"));
			
		this.jMenuItemSiguientesTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoFondo"));
			
		this.jMenuItemAbrirOrderByTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoFondo"));
			
		this.jMenuItemMostrarOcultarTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoFondo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoFondo"));
			
		this.jMenuItemDetalleMostarOcultarTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoFondo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoFondo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoFondo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoFondo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoFondo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoFondo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoFondo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoFondo"));

		this.jCheckBoxSeleccionadosTipoFondo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoFondo"));
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.jComboBoxTiposAccionesFormularioTipoFondo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFondo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoFondo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoFondo"));
			
		this.jComboBoxTiposAccionesTipoFondo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoFondo"));
					
		this.jComboBoxTiposSeleccionarTipoFondo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoFondo"));
			
		this.jTextFieldValorCampoGeneralTipoFondo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoFondo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondo.jButtonidTipoFondoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFondoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondo.jButtoncodigoTipoFondoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFondoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondo.jButtonnombreTipoFondoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFondoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoFondo!=null) {
				this.jInternalFrameReporteDinamicoTipoFondo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFondo"));
				this.jInternalFrameReporteDinamicoTipoFondo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFondo"));
				this.jInternalFrameReporteDinamicoTipoFondo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFondo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoFondo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFondo"));				
			//this.jButtonGenerarReporteDinamicoTipoFondo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFondo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoFondo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFondo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoFondo!=null) {
				this.jInternalFrameImportacionTipoFondo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFondo"));
				this.jInternalFrameImportacionTipoFondo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFondo"));
				this.jInternalFrameImportacionTipoFondo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFondo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoFondo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoFondo"));
			
			this.jButtonAbrirOrderByToolBarTipoFondo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoFondo"));			
			
			if(this.jInternalFrameOrderByTipoFondo!=null) {
				this.jInternalFrameOrderByTipoFondo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFondo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoFondo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFondo.jTabbedPaneRelacionesTipoFondo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFondo"));
		
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
            		closingInternalFrameTipoFondo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoFondo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoFondo = (JInternalFrameBase)event.getSource();
	            	
	            TipoFondoBeanSwingJInternalFrame jInternalFrameParent=(TipoFondoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFondo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoFondoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoFondo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoFondoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoFondo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoFondo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFondoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFondoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFondoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoFondo";
		inputMap = this.jButtonNuevoTipoFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFondoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFondoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFondoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFondoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoFondo";
		inputMap = this.jButtonNuevoRelacionesTipoFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFondoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoFondo";
		inputMap = this.jButtonModificarTipoFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoFondoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoFondo";
		inputMap = this.jButtonActualizarTipoFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoFondoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoFondo";
		inputMap = this.jButtonEliminarTipoFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoFondoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoFondo";
		inputMap = this.jButtonCancelarTipoFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoFondoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoFondo";
		inputMap = this.jButtonCerrarTipoFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoFondoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoFondo.jButtonGuardarCambiosTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoFondo";
		inputMap = this.jInternalFrameDetalleFormTipoFondo.jButtonGuardarCambiosTipoFondo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoFondo.jButtonGuardarCambiosTipoFondo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoFondoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoFondo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoFondoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoFondo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoFondoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoFondo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoFondoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoFondo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoFondoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondo.jButtonidTipoFondoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFondoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondo.jButtoncodigoTipoFondoBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFondoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFondo.jButtonnombreTipoFondoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFondoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoFondo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoFondoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoFondoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoFondo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoFondo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoFondo tipofondoAux:this.tipofondoLogic.getTipoFondos()) {
					tipofondoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFondo tipofondoAux:tipofondos) {
					tipofondoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoFondoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFondo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFondo tipofondoAux:this.tipofondoLogic.getTipoFondos()) {
						tipofondoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFondo tipofondoAux:tipofondos) {
						tipofondoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoFondo tipofondoAux:this.tipofondoLogic.getTipoFondos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFondo tipofondoAux:tipofondos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFondo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFondo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFondo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFondo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoFondoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFondo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoFondo.getSelectedRows();
			
			TipoFondo tipofondoLocal=new TipoFondo();
			
			//this.seleccionarTodosTipoFondo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofondoLocal =(TipoFondo) this.tipofondoLogic.getTipoFondos().toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipofondoLocal =(TipoFondo) this.tipofondos.toArray()[this.jTableDatosTipoFondo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipofondoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFondo tipofondoAux:this.tipofondoLogic.getTipoFondos()) {
						tipofondoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFondo tipofondoAux:tipofondos) {
						tipofondoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoFondo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFondo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFondo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFondo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoFondoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoFondoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoFondoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoFondo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoFondo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFondo tipofondoAux:this.tipofondoLogic.getTipoFondos()) {
				
						if(sTipoSeleccionar.equals(TipoFondoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipofondoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFondoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipofondoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFondo tipofondoAux:tipofondos) {
					
						if(sTipoSeleccionar.equals(TipoFondoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipofondoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFondoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipofondoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFondo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoFondoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoFondo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoFondo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoFondo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoFondo.jComboBoxTiposAccionesFormularioTipoFondo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoFondo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoFondo(conSplash);
				
					this.generarReporteTipoFondosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFondo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFondo.jComboBoxTiposAccionesFormularioTipoFondo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoFondosSeleccionados();
				//this.jComboBoxTiposAccionesTipoFondo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFondosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoFondo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFondosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoFondo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFondo();
				
				this.exportarTipoFondosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFondo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFondo.jComboBoxTiposAccionesFormularioTipoFondo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoFondos();
				//this.importarTipoFondos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFondo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFondo.jComboBoxTiposAccionesFormularioTipoFondo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFondo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoFondosSeleccionados();
				//this.jComboBoxTiposAccionesTipoFondo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Fondo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoFondo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoFondo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoFondo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Fondo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFondo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFondo.jComboBoxTiposAccionesFormularioTipoFondo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoFondo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoFondo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoFondoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoFondo();
			
			if(this.jInternalFrameDetalleFormTipoFondo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();		
			TipoFondo tipofondo=new TipoFondo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoFondo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoFondo.getSelectedItem();
			
			
			
			
			tipofondosSeleccionados=this.getTipoFondosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipofondosSeleccionados.size()==1) {
				for(TipoFondo tipofondoAux:tipofondosSeleccionados) {
					tipofondo=tipofondoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoFondo();
			
      		//this.finishProcessTipoFondo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoFondoReturnGeneral() throws Exception {
		if(this.tipofondoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipofondoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipofondoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipofondoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipofondoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipofondoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoFondo(false);
		}
		
		if(this.tipofondoReturnGeneral.getConRetornoLista() || this.tipofondoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipofondoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipofondoLogic.setTipoFondos(this.tipofondoReturnGeneral.getTipoFondos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipofondoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipofondoLogic.setTipoFondo(this.tipofondoReturnGeneral.getTipoFondo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoFondo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoFondo() throws Exception {
		
		
	}
	
	public ArrayList<TipoFondo> getTipoFondosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoFondo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoFondo tipofondoAux:tipofondoLogic.getTipoFondos()) {
					if(tipofondoAux.getIsSelected()) {
						tipofondosSeleccionados.add(tipofondoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFondo tipofondoAux:this.tipofondos) {
					if(tipofondoAux.getIsSelected()) {
						tipofondosSeleccionados.add(tipofondoAux);				
					}
				}
			}
			
			if(tipofondosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipofondosSeleccionados.addAll(this.tipofondoLogic.getTipoFondos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipofondosSeleccionados.addAll(this.tipofondos);				
					}
				}
			}
		} else {
			tipofondosSeleccionados.add(this.tipofondo);
		}
		
		return tipofondosSeleccionados;
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
	
	public void generarReporteTipoFondosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoFondosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoFondosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFondosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFondosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Fondo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoFondosSeleccionados() throws Exception {
		ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();		
		
		tipofondosSeleccionados=this.getTipoFondosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoFondos("Todos",tipofondosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoFondosSeleccionados() throws Exception {
		ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();		
		
		tipofondosSeleccionados=this.getTipoFondosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoFondos("Todos",tipofondosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoFondosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();
		
		tipofondosSeleccionados=this.getTipoFondosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoFondos("Todos",tipofondosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoFondosSeleccionados() throws Exception {
		ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoFondo();
		
		
		tipofondosSeleccionados=this.getTipoFondosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoFondo();
		
		
		//this.generarReporteTipoFondos("Todos",tipofondosSeleccionados ,tipofondoImplementable,tipofondoImplementableHome);
	}
	
	public void mostrarImportacionTipoFondos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoFondo();
		
		this.abrirFrameImportacionTipoFondo();		
		
			
		//this.generarReporteTipoFondos("Todos",tipofondosSeleccionados ,tipofondoImplementable,tipofondoImplementableHome);
	}
	
	public void importarTipoFondos() throws Exception {		
	
	}
	
	public void exportarTipoFondosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoFondosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoFondosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoFondosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Fondo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoFondosSeleccionados() throws Exception {
		ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();		
		
		tipofondosSeleccionados=this.getTipoFondosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoFondo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoFondo tipofondoAux:tipofondosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoFondo(tipofondoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipofondoAux.setsDetalleGeneralEntityReporte(tipofondoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoFondo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoFondoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFondoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFondoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFondoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoFondo(TipoFondo tipofondo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipofondo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofondo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofondo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofondo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoFondosSeleccionados() throws Exception {
		ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();		
		
		tipofondosSeleccionados=this.getTipoFondosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoFondos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoFondo(row);				
				iRow++;
			}				
			
			for(TipoFondo tipofondoAux:tipofondosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoFondo(tipofondoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoFondosSeleccionados() throws Exception {
		ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();		
		
		tipofondosSeleccionados=this.getTipoFondosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofondo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipofondos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipofondo");
			//elementRoot.appendChild(element);
		
			for(TipoFondo tipofondoAux:tipofondosSeleccionados) {
				element = document.createElement("tipofondo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoFondo(tipofondoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Fondo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoFondo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFondoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFondoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoFondoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFondoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoFondo(TipoFondo tipofondo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipofondo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipofondo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipofondo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoFondo(TipoFondo tipofondo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoFondoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipofondo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoFondoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipofondo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoFondoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipofondo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoFondoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipofondo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoFondosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoFondo> tipofondosSeleccionados=new ArrayList<TipoFondo>();
		
		tipofondosSeleccionados=this.getTipoFondosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoFondo(tipofondosSeleccionados);
		
		this.generarReporteTipoFondos("Todos",tipofondosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoFondo(ArrayList<TipoFondo> tipofondosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoFondo tipofondoAux:tipofondosSeleccionados) {
				tipofondoAux.setsDetalleGeneralEntityReporte(tipofondoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoFondoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipofondoAux.setsDescripcionGeneralEntityReporte1(tipofondoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoFondoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipofondoAux.setsDescripcionGeneralEntityReporte1(tipofondoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFondoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoFondo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoFondo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoFondo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoFondo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoFondo=false;
			this.isVisibilidadCeldaActualizarTipoFondo=false;
			this.isVisibilidadCeldaEliminarTipoFondo=false;
			this.isVisibilidadCeldaCancelarTipoFondo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoFondo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondo=false;
			this.isVisibilidadCeldaModificarTipoFondo=false;
			this.isVisibilidadCeldaActualizarTipoFondo=true;
			this.isVisibilidadCeldaEliminarTipoFondo=false;
			this.isVisibilidadCeldaCancelarTipoFondo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoFondo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondo=false;
			this.isVisibilidadCeldaModificarTipoFondo=false;
			this.isVisibilidadCeldaActualizarTipoFondo=true;
			this.isVisibilidadCeldaEliminarTipoFondo=true;
			this.isVisibilidadCeldaCancelarTipoFondo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoFondo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondo=false;
			this.isVisibilidadCeldaModificarTipoFondo=false;
			this.isVisibilidadCeldaActualizarTipoFondo=true;
			this.isVisibilidadCeldaEliminarTipoFondo=false;
			this.isVisibilidadCeldaCancelarTipoFondo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoFondo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFondo=true;
			this.isVisibilidadCeldaModificarTipoFondo=false;
			this.isVisibilidadCeldaActualizarTipoFondo=false;
			this.isVisibilidadCeldaEliminarTipoFondo=false;
			this.isVisibilidadCeldaCancelarTipoFondo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoFondo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondo=false;
			this.isVisibilidadCeldaActualizarTipoFondo=false;
			this.isVisibilidadCeldaEliminarTipoFondo=false;
			this.isVisibilidadCeldaCancelarTipoFondo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoFondo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondo=false;
			this.isVisibilidadCeldaModificarTipoFondo=true;
			this.isVisibilidadCeldaActualizarTipoFondo=false;
			this.isVisibilidadCeldaEliminarTipoFondo=false;
			this.isVisibilidadCeldaCancelarTipoFondo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFondo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFondo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoFondoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoFondo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFondo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFondo=true;
		} else {
			this.actualizarEstadoPanelsTipoFondo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoFondo=false;
			//this.isVisibilidadCeldaVerFormTipoFondo=false;
			this.isVisibilidadCeldaDuplicarTipoFondo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipofondoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFondo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoFondo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFondo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipofondoSessionBean.getEsGuardarRelacionado()) {
			if(!tipofondoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoFondo=false;												
			}
			
			this.jButtonCerrarTipoFondo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFondo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipofondo)) {
			this.isVisibilidadCeldaActualizarTipoFondo=false;
			this.isVisibilidadCeldaEliminarTipoFondo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFondo() {
	}
	
	public void actualizarEstadoPanelsTipoFondo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoFondo!=null) {
				this.jScrollPanelDatosEdicionTipoFondo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFondo!=null) {
				this.jScrollPanelDatosTipoFondo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFondo!=null) {
				this.jPanelPaginacionTipoFondo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFondo!=null) {
				this.jPanelParametrosReportesTipoFondo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoFondo!=null) {
				this.jScrollPanelDatosEdicionTipoFondo.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoFondo!=null) {
				this.jScrollPanelDatosTipoFondo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFondo!=null) {
				this.jPanelPaginacionTipoFondo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFondo!=null) {
				this.jPanelParametrosReportesTipoFondo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoFondo!=null) {
				this.jScrollPanelDatosEdicionTipoFondo.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoFondo!=null) {
				this.jScrollPanelDatosTipoFondo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFondo!=null) {
				this.jPanelPaginacionTipoFondo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFondo!=null) {
				this.jPanelParametrosReportesTipoFondo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoFondo!=null) {
				this.jScrollPanelDatosEdicionTipoFondo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFondo!=null) {
				this.jScrollPanelDatosTipoFondo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFondo!=null) {
				this.jPanelPaginacionTipoFondo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFondo!=null) {
				this.jPanelParametrosReportesTipoFondo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoFondo!=null) {
				this.jScrollPanelDatosEdicionTipoFondo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFondo!=null) {
				this.jScrollPanelDatosTipoFondo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFondo!=null) {
				this.jPanelPaginacionTipoFondo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFondo!=null) {
				this.jPanelParametrosReportesTipoFondo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoFondo!=null) {
				this.jScrollPanelDatosEdicionTipoFondo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoFondo!=null) {
				this.jScrollPanelDatosTipoFondo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFondo!=null) {
				this.jPanelPaginacionTipoFondo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFondo!=null) {
				this.jPanelParametrosReportesTipoFondo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoFondo!=null) {
				this.jScrollPanelDatosEdicionTipoFondo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoFondo!=null) {
				this.jScrollPanelDatosTipoFondo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFondo!=null) {
				this.jPanelPaginacionTipoFondo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFondo!=null) {
				this.jPanelParametrosReportesTipoFondo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipofondoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipofondoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoFondoSessionBean tipofondoSessionBean=new TipoFondoSessionBean();
		
		if(this.tipofondoSessionBean==null) {
			this.tipofondoSessionBean=new TipoFondoSessionBean();
		}
		
		this.tipofondoSessionBean.setsUltimaBusquedaTipoFondo(this.getsAccionBusqueda());
		this.tipofondoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipofondoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoFondoSessionBean tipofondoSessionBean=new TipoFondoSessionBean();
		
		if(this.tipofondoSessionBean==null) {
			this.tipofondoSessionBean=new TipoFondoSessionBean();
		}
		
		if(this.tipofondoSessionBean.getsUltimaBusquedaTipoFondo()!=null&&!this.tipofondoSessionBean.getsUltimaBusquedaTipoFondo().equals("")) {
			this.setsAccionBusqueda(tipofondoSessionBean.getsUltimaBusquedaTipoFondo());
			this.setiNumeroPaginacion(tipofondoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipofondoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipofondoSessionBean.setsUltimaBusquedaTipoFondo("");
		this.tipofondoSessionBean.setiNumeroPaginacion(TipoFondoConstantesFunciones.INUMEROPAGINACION);
		this.tipofondoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoFondo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoFondo() {
		this.updateBorderResaltarBusquedasFormularioTipoFondo();
		this.updateVisibilidadBusquedasFormularioTipoFondo();
		this.updateHabilitarBusquedasFormularioTipoFondo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoFondo() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoFondo() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoFondo() {
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
	
	public void updateControlesFormularioTipoFondo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoFondo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoFondo();
		this.updateVisibilidadResaltarControlesFormularioTipoFondo();
		this.updateHabilitarResaltarControlesFormularioTipoFondo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoFondo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFondo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipofondoConstantesFunciones.resaltaridTipoFondo!=null && this.jInternalFrameDetalleFormTipoFondo!=null) {this.jInternalFrameDetalleFormTipoFondo.jTextFieldidTipoFondo.setBorder(this.tipofondoConstantesFunciones.resaltaridTipoFondo);}
		if(this.tipofondoConstantesFunciones.resaltarcodigoTipoFondo!=null && this.jInternalFrameDetalleFormTipoFondo!=null) {this.jInternalFrameDetalleFormTipoFondo.jTextFieldcodigoTipoFondo.setBorder(this.tipofondoConstantesFunciones.resaltarcodigoTipoFondo);}
		if(this.tipofondoConstantesFunciones.resaltarnombreTipoFondo!=null && this.jInternalFrameDetalleFormTipoFondo!=null) {this.jInternalFrameDetalleFormTipoFondo.jTextAreanombreTipoFondo.setBorder(this.tipofondoConstantesFunciones.resaltarnombreTipoFondo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoFondo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoFondo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) {
	
		//this.jInternalFrameDetalleFormTipoFondo.jTextFieldidTipoFondo.setVisible(this.tipofondoConstantesFunciones.mostraridTipoFondo);
		this.jInternalFrameDetalleFormTipoFondo.jPanelidTipoFondo.setVisible(this.tipofondoConstantesFunciones.mostraridTipoFondo);
		//this.jInternalFrameDetalleFormTipoFondo.jTextFieldcodigoTipoFondo.setVisible(this.tipofondoConstantesFunciones.mostrarcodigoTipoFondo);
		this.jInternalFrameDetalleFormTipoFondo.jPanelcodigoTipoFondo.setVisible(this.tipofondoConstantesFunciones.mostrarcodigoTipoFondo);
		//this.jInternalFrameDetalleFormTipoFondo.jTextAreanombreTipoFondo.setVisible(this.tipofondoConstantesFunciones.mostrarnombreTipoFondo);
		this.jInternalFrameDetalleFormTipoFondo.jPanelnombreTipoFondo.setVisible(this.tipofondoConstantesFunciones.mostrarnombreTipoFondo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoFondo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFondo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFondo!=null) {
	
		this.jInternalFrameDetalleFormTipoFondo.jTextFieldidTipoFondo.setEnabled(this.tipofondoConstantesFunciones.activaridTipoFondo);
		this.jInternalFrameDetalleFormTipoFondo.jTextFieldcodigoTipoFondo.setEnabled(this.tipofondoConstantesFunciones.activarcodigoTipoFondo);
		this.jInternalFrameDetalleFormTipoFondo.jTextAreanombreTipoFondo.setEnabled(this.tipofondoConstantesFunciones.activarnombreTipoFondo);
		}
	}
	
		
}