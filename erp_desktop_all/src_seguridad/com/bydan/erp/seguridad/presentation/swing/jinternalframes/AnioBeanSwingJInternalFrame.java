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

import com.bydan.erp.seguridad.util.AnioConstantesFunciones;
import com.bydan.erp.seguridad.util.AnioParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.AnioParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.AnioBean;
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
public class AnioBeanSwingJInternalFrame extends AnioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AnioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Anio> anioValidator = new ClassValidator<Anio>(Anio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Anio anio;	
	public Anio anioAux;
	public Anio anioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Anio anioTotales;
	public Long idAnioActual;
	public Long iIdNuevoAnio=0L;
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
	
	public Boolean isPermisoTodoAnio;
	public Boolean isPermisoNuevoAnio;
	public Boolean isPermisoActualizarAnio;
	public Boolean isPermisoActualizarOriginalAnio;
	public Boolean isPermisoEliminarAnio;
	public Boolean isPermisoGuardarCambiosAnio;
	public Boolean isPermisoConsultaAnio;
	public Boolean isPermisoBusquedaAnio;
	public Boolean isPermisoReporteAnio;
	public Boolean isPermisoPaginacionMedioAnio;
	public Boolean isPermisoPaginacionAltoAnio;
	public Boolean isPermisoPaginacionTodoAnio;
	public Boolean isPermisoCopiarAnio;
	public Boolean isPermisoVerFormAnio;
	public Boolean isPermisoDuplicarAnio;
	public Boolean isPermisoOrdenAnio;
	
	
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
	
	public AnioParameterReturnGeneral anioReturnGeneral;
	public AnioParameterReturnGeneral anioParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAnio=false;
	public Boolean esParaAccionDesdeFormularioAnio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public AnioLogic anioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Anio anioBean;
	public AnioConstantesFunciones anioConstantesFunciones;
	//public AnioParameterReturnGeneral anioReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Anio> anios;	
	//public List<Anio> aniosEliminados;
	//public List<Anio> aniosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAnio=false;
	public Boolean isVisibilidadCeldaDuplicarAnio=true;
	public Boolean isVisibilidadCeldaCopiarAnio=true;
	public Boolean isVisibilidadCeldaVerFormAnio=true;
	public Boolean isVisibilidadCeldaOrdenAnio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAnio=false;
	public Boolean isVisibilidadCeldaModificarAnio=false;
	public Boolean isVisibilidadCeldaActualizarAnio=false;
	public Boolean isVisibilidadCeldaEliminarAnio=false;
	public Boolean isVisibilidadCeldaCancelarAnio=false;
	public Boolean isVisibilidadCeldaGuardarAnio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAnio=false;	
	
	
	
	public Long getiIdNuevoAnio() {
		return this.iIdNuevoAnio;
	}

	public void setiIdNuevoAnio(Long iIdNuevoAnio) {
		this.iIdNuevoAnio = iIdNuevoAnio;
	}
	
	public Long getidAnioActual() {
		return this.idAnioActual;
	}

	public void setidAnioActual(Long idAnioActual) {
		this.idAnioActual = idAnioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Anio getanio() {
		return this.anio;
	}

	public void setanio(Anio anio) {
		this.anio = anio;
	}
	
	public Anio getanioAux() {
		return this.anioAux;
	}

	public void setanioAux(Anio anioAux) {
		this.anioAux = anioAux;
	}				
	
	public Anio getanioAnterior() {
		return this.anioAnterior;
	}

	public void setanioAnterior(Anio anioAnterior) {
		this.anioAnterior = anioAnterior;
	}	
	
	public Anio getanioTotales() {
		return this.anioTotales;
	}

	public void setanioTotales(Anio anioTotales) {
		this.anioTotales = anioTotales;
	}	
	
	public Anio getanioBean() {
		return this.anioBean;
	}

	public void setanioBean(Anio anioBean) {
		this.anioBean = anioBean;
	}	
	
	public AnioParameterReturnGeneral getanioReturnGeneral() {
		return this.anioReturnGeneral;
	}

	public void setanioReturnGeneral(AnioParameterReturnGeneral anioReturnGeneral) {
		this.anioReturnGeneral = anioReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AnioLogic getAnioLogic()	{		
		return anioLogic;
	}

	public void setAnioLogic(AnioLogic anioLogic) {
		this.anioLogic = anioLogic;
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
	
	public Boolean getIsEsNuevoAnio() {
		return isEsNuevoAnio;
	}

	public void setIsEsNuevoAnio(Boolean isEsNuevoAnio) {
		this.isEsNuevoAnio = isEsNuevoAnio;
	}

	public Boolean getEsParaAccionDesdeFormularioAnio() {
		return esParaAccionDesdeFormularioAnio;
	}
	
	public void setEsParaAccionDesdeFormularioAnio(Boolean esParaAccionDesdeFormularioAnio) {
		this.esParaAccionDesdeFormularioAnio = esParaAccionDesdeFormularioAnio;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesAnio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AnioConstantesFunciones.refrescarForeignKeysDescripcionesAnio(this.anioLogic.getAnios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AnioConstantesFunciones.refrescarForeignKeysDescripcionesAnio(this.anios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//anioLogic.setAnios(this.anios);
			anioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AnioParameterReturnGeneral getAnioParameterGeneral() {
		return this.anioParameterGeneral;
	}
	
	public void setAnioParameterGeneral(AnioParameterReturnGeneral anioParameterGeneral) {
		this.anioParameterGeneral = anioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAnio() {
		return isPermisoTodoAnio;
	}

	public void setIsPermisoTodoAnio(Boolean isPermisoTodoAnio) {
		this.isPermisoTodoAnio = isPermisoTodoAnio;
	}

	public Boolean getIsPermisoNuevoAnio() {
		return isPermisoNuevoAnio;
	}

	public void setIsPermisoNuevoAnio(Boolean isPermisoNuevoAnio) {
		this.isPermisoNuevoAnio = isPermisoNuevoAnio;
	}

	public Boolean getIsPermisoActualizarAnio() {
		return isPermisoActualizarAnio;
	}

	public void setIsPermisoActualizarAnio(Boolean isPermisoActualizarAnio) {
		this.isPermisoActualizarAnio = isPermisoActualizarAnio;
	}

	public Boolean getIsPermisoEliminarAnio() {
		return isPermisoEliminarAnio;
	}

	public void setIsPermisoEliminarAnio(Boolean isPermisoEliminarAnio) {
		this.isPermisoEliminarAnio = isPermisoEliminarAnio;
	}

	public Boolean getIsPermisoGuardarCambiosAnio() {
		return isPermisoGuardarCambiosAnio;
	}

	public void setIsPermisoGuardarCambiosAnio(Boolean isPermisoGuardarCambiosAnio) {
		this.isPermisoGuardarCambiosAnio = isPermisoGuardarCambiosAnio;
	}
	
	public Boolean getIsPermisoConsultaAnio() {
		return isPermisoConsultaAnio;
	}

	public void setIsPermisoConsultaAnio(Boolean isPermisoConsultaAnio) {
		this.isPermisoConsultaAnio = isPermisoConsultaAnio;
	}

	public Boolean getIsPermisoBusquedaAnio() {
		return isPermisoBusquedaAnio;
	}

	public void setIsPermisoBusquedaAnio(Boolean isPermisoBusquedaAnio) {
		this.isPermisoBusquedaAnio = isPermisoBusquedaAnio;
	}

	public Boolean getIsPermisoReporteAnio() {
		return isPermisoReporteAnio;
	}

	public void setIsPermisoReporteAnio(Boolean isPermisoReporteAnio) {
		this.isPermisoReporteAnio = isPermisoReporteAnio;
	}
	
	public Boolean getIsPermisoPaginacionMedioAnio() {
		return isPermisoPaginacionMedioAnio;
	}

	public void setIsPermisoPaginacionMedioAnio(Boolean isPermisoPaginacionMedioAnio) {
		this.isPermisoPaginacionMedioAnio = isPermisoPaginacionMedioAnio;
	}
	
	public Boolean getIsPermisoPaginacionTodoAnio() {
		return isPermisoPaginacionTodoAnio;
	}

	public void setIsPermisoPaginacionTodoAnio(Boolean isPermisoPaginacionTodoAnio) {
		this.isPermisoPaginacionTodoAnio = isPermisoPaginacionTodoAnio;
	}
	
	public Boolean getIsPermisoPaginacionAltoAnio() {
		return isPermisoPaginacionAltoAnio;
	}

	public void setIsPermisoPaginacionAltoAnio(Boolean isPermisoPaginacionAltoAnio) {
		this.isPermisoPaginacionAltoAnio = isPermisoPaginacionAltoAnio;
	}
	
	public Boolean getIsPermisoCopiarAnio() {
		return isPermisoCopiarAnio;
	}

	public void setIsPermisoCopiarAnio(Boolean isPermisoCopiarAnio) {
		this.isPermisoCopiarAnio = isPermisoCopiarAnio;
	}
	
	public Boolean getIsPermisoVerFormAnio() {
		return isPermisoVerFormAnio;
	}

	public void setIsPermisoVerFormAnio(Boolean isPermisoVerFormAnio) {
		this.isPermisoVerFormAnio = isPermisoVerFormAnio;
	}
	
	public Boolean getIsPermisoDuplicarAnio() {
		return isPermisoDuplicarAnio;
	}

	public void setIsPermisoDuplicarAnio(Boolean isPermisoDuplicarAnio) {
		this.isPermisoDuplicarAnio = isPermisoDuplicarAnio;
	}
	
	public Boolean getIsPermisoOrdenAnio() {
		return isPermisoOrdenAnio;
	}

	public void setIsPermisoOrdenAnio(Boolean isPermisoOrdenAnio) {
		this.isPermisoOrdenAnio = isPermisoOrdenAnio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAnio() {
		return isVisibilidadCeldaNuevoAnio;
	}

	public void setIsVisibilidadCeldaNuevoAnio(Boolean isVisibilidadCeldaNuevoAnio) {
		this.isVisibilidadCeldaNuevoAnio = isVisibilidadCeldaNuevoAnio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAnio() {
		return isVisibilidadCeldaDuplicarAnio;
	}

	public void setIsVisibilidadCeldaDuplicarAnio(Boolean isVisibilidadCeldaDuplicarAnio) {
		this.isVisibilidadCeldaDuplicarAnio = isVisibilidadCeldaDuplicarAnio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAnio() {
		return isVisibilidadCeldaCopiarAnio;
	}

	public void setIsVisibilidadCeldaCopiarAnio(Boolean isVisibilidadCeldaCopiarAnio) {
		this.isVisibilidadCeldaCopiarAnio = isVisibilidadCeldaCopiarAnio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAnio() {
		return isVisibilidadCeldaVerFormAnio;
	}

	public void setIsVisibilidadCeldaVerFormAnio(Boolean isVisibilidadCeldaVerFormAnio) {
		this.isVisibilidadCeldaVerFormAnio = isVisibilidadCeldaVerFormAnio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAnio() {
		return isVisibilidadCeldaOrdenAnio;
	}

	public void setIsVisibilidadCeldaOrdenAnio(Boolean isVisibilidadCeldaOrdenAnio) {
		this.isVisibilidadCeldaOrdenAnio = isVisibilidadCeldaOrdenAnio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAnio() {
		return isVisibilidadCeldaNuevoRelacionesAnio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAnio(Boolean isVisibilidadCeldaNuevoRelacionesAnio) {
		this.isVisibilidadCeldaNuevoRelacionesAnio = isVisibilidadCeldaNuevoRelacionesAnio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAnio() {
		return isVisibilidadCeldaModificarAnio;
	}

	public void setIsVisibilidadCeldaModificarAnio(Boolean isVisibilidadCeldaModificarAnio) {
		this.isVisibilidadCeldaModificarAnio = isVisibilidadCeldaModificarAnio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAnio() {
		return isVisibilidadCeldaActualizarAnio;
	}

	public void setIsVisibilidadCeldaActualizarAnio(Boolean isVisibilidadCeldaActualizarAnio) {
		this.isVisibilidadCeldaActualizarAnio = isVisibilidadCeldaActualizarAnio;
	}

	public Boolean getIsVisibilidadCeldaEliminarAnio() {
		return isVisibilidadCeldaEliminarAnio;
	}

	public void setIsVisibilidadCeldaEliminarAnio(Boolean isVisibilidadCeldaEliminarAnio) {
		this.isVisibilidadCeldaEliminarAnio = isVisibilidadCeldaEliminarAnio;
	}

	public Boolean getIsVisibilidadCeldaCancelarAnio() {
		return isVisibilidadCeldaCancelarAnio;
	}

	public void setIsVisibilidadCeldaCancelarAnio(Boolean isVisibilidadCeldaCancelarAnio) {
		this.isVisibilidadCeldaCancelarAnio = isVisibilidadCeldaCancelarAnio;
	}

	public Boolean getIsVisibilidadCeldaGuardarAnio() {
		return isVisibilidadCeldaGuardarAnio;
	}

	public void setIsVisibilidadCeldaGuardarAnio(Boolean isVisibilidadCeldaGuardarAnio) {
		this.isVisibilidadCeldaGuardarAnio = isVisibilidadCeldaGuardarAnio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAnio() {
		return isVisibilidadCeldaGuardarCambiosAnio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAnio(Boolean isVisibilidadCeldaGuardarCambiosAnio) {
		this.isVisibilidadCeldaGuardarCambiosAnio = isVisibilidadCeldaGuardarCambiosAnio;
	}
		
	public AnioSessionBean getanioSessionBean() {
		return this.anioSessionBean;
	}
	
	public void setanioSessionBean(AnioSessionBean anioSessionBean) {
		this.anioSessionBean=anioSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAnio(Anio anio)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Anio anio,Anio anioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAnio(anio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		anioAux.setId(anio.getId());
		anioAux.setVersionRow(anio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAnio();
		
			int intSelectedRow = this.jTableDatosAnio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anio =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.anio =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AnioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAnio(this.anio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAnio(this.anio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = anioValidator.getInvalidValues(this.anio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			anioLogic.setDatosCliente(datosCliente);
			anioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				anioAux=new  Anio();
				
				anioAux.setIsNew(true);
				anioAux.setIsChanged(true);
				
				anioAux.setAnioOriginal(this.anio);
				
				anioAux.setId(this.anio.getId());	
				anioAux.setVersionRow(this.anio.getVersionRow());	
				anioAux.setnombre(this.anio.getnombre());	
				anioAux.setvalor(this.anio.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.anioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.anioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(anioAux,anioLogic.getAnios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(anioAux,anios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.anioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.anioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						anioLogic.saveAnios();//WithConnection
						//anioLogic.getSetVersionRowAnios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.anio,anioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				anioAux=new  Anio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.anioSessionBean.getEsGuardarRelacionado() 
					|| (this.anioSessionBean.getEsGuardarRelacionado() && this.anio.getId()>=0)) {
						
					anioAux.setIsNew(false);
				}
				
				anioAux.setIsDeleted(false);
			
				anioAux.setId(this.anio.getId());	
				anioAux.setVersionRow(this.anio.getVersionRow());	
				anioAux.setnombre(this.anio.getnombre());	
				anioAux.setvalor(this.anio.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(anioAux,anioLogic.getAnios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(anioAux,anios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.anioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.anioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						anioLogic.saveAnios();//WithConnection
						//anioLogic.getSetVersionRowAnios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.anio,anioAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				anioAux=new  Anio();
				
				anioAux.setIsNew(false);
				anioAux.setIsChanged(false);
				
				anioAux.setIsDeleted(true);
				
				anioAux.setId(this.anio.getId());	
				anioAux.setVersionRow(this.anio.getVersionRow());	
				anioAux.setnombre(this.anio.getnombre());	
				anioAux.setvalor(this.anio.getvalor());	
				
				if(this.anioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.anioAux.getId()>=0) {	
						this.aniosEliminados.add(anioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(anioAux,anioLogic.getAnios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(anioAux,anios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.anioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.anioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						anioLogic.saveAnios();//WithConnection
						//anioLogic.getSetVersionRowAnios();//WithConnection
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
					this.anioLogic.getAnios().addAll(this.aniosEliminados);
					
					anioLogic.saveAnios();//WithConnection
					//anioLogic.getSetVersionRowAnios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.aniosEliminados= new ArrayList<Anio>();		
			}
			
			if(this.anioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Anio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Anio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.anio=anioAux;
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
      		//this.finishProcessAnio();
      	}
		
	}	
	
	public void actualizarRelaciones(Anio anioLocal) throws Exception {
		
		if(this.anioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Anio anioLocal) throws Exception {	
		if(this.anioSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarAnioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAnio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.anio =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.anio =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = anioValidator.getInvalidValues(this.anio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Anio anio,List<Anio> anios) throws Exception {
		try	{		
			AnioConstantesFunciones.actualizarLista(anio,anios,this.anioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Anio anio,List<Anio> anios) throws Exception {
		try	{			
			AnioConstantesFunciones.actualizarSelectedLista(anio,anios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Anio> aniosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				aniosLocal=this.anioLogic.getAnios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				aniosLocal=this.anios;
			}
			//ARCHITECTURE
		
			for(Anio anioLocal:aniosLocal) {
				if(this.permiteMantenimiento(anioLocal) && anioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AnioConstantesFunciones.getAnioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AnioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnio.jLabelnombreAnio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AnioConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnio.jLabelvalorAnio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAnio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnio.jLabelnombreAnio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAnio.jLabelvalorAnio,"");
		
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
		this.iIdNuevoAnio--;	
		
		
		this.anioAux=new Anio();
		
		this.anioAux.setId(this.iIdNuevoAnio);
		this.anioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.anioLogic.getAnios().add(this.anioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.anios.add(this.anioAux);
		}
		//ARCHITECTURE
		
		this.anio=this.anioAux;
		
		if(AnioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAnio(this.anio);
			this.setVariablesObjetoActualToFormularioForeignKeyAnio(this.anio);
		}
				
		//this.setDefaultControlesAnio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAnio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAnio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAnio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAnio(this.anioBean,this.anio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAnio(this.anio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AnioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.anioSessionBean.getConGuardarRelaciones()) {
			classes=AnioConstantesFunciones.getClassesRelationshipsOfAnio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.anioReturnGeneral=anioLogic.procesarEventosAniosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.anioLogic.getAnios(),this.anio,this.anioParameterGeneral,this.isEsNuevoAnio,classes);//this.anioLogic.getAnio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAnio(this.anioReturnGeneral,this.anioBean,false);
		
		if(this.anioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAnio(this.anioReturnGeneral.getAnio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAnio(this.anioReturnGeneral.getAnio());
		}
		
		if(this.anioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAnio(this.anioReturnGeneral.getAnio(),classes);//this.anioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAnio(this.anio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAnio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAnio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAnio(false);
						
			if(anioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(AnioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAnio();
			}
			
			this.actualizarVisualTableDatosAnio();
			
			this.jTableDatosAnio.setRowSelectionInterval(this.getIndiceNuevoAnio(), this.getIndiceNuevoAnio());
			
			this.seleccionarFilaTablaAnioActual();
						
			this.actualizarEstadoCeldasBotonesAnio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAnio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAnio.jTextFieldnombreAnio.setEnabled(isHabilitar && this.anioConstantesFunciones.activarnombreAnio);
		this.jInternalFrameDetalleFormAnio.jTextFieldvalorAnio.setEnabled(isHabilitar && this.anioConstantesFunciones.activarvalorAnio);	
		
	};
	
	public void setDefaultControlesAnio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAnio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.anioSessionBean.setConGuardarRelaciones(true);			
			this.anioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAnio.jTabbedPaneRelacionesAnio.setVisible(true);
			
					
		} else {
			//this.anioSessionBean.setConGuardarRelaciones(false);			
			this.anioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAnio.jTabbedPaneRelacionesAnio.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoAnio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Anio anioAux:this.anioLogic.getAnios()) {
				if(anioAux.getId().equals(this.iIdNuevoAnio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Anio anioAux:this.anios) {
				if(anioAux.getId().equals(this.iIdNuevoAnio)) {
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
	
	public int getIndiceActualAnio(Anio anio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Anio anioAux:this.anioLogic.getAnios()) {
				if(anioAux.getId().equals(anio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Anio anioAux:this.anios) {
				if(anioAux.getId().equals(anio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAnio(Anio anioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Anio anioAux:this.anioLogic.getAnios()) {
				if(anioAux.getAnioOriginal().getId().equals(anioOriginal.getId())) {
					existe=true;
					anioOriginal.setId(anioAux.getId());
					anioOriginal.setVersionRow(anioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Anio anioAux:this.anios) {
				if(anioAux.getAnioOriginal().getId().equals(anioOriginal.getId())) {
					existe=true;
					anioOriginal.setId(anioAux.getId());
					anioOriginal.setVersionRow(anioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAnio(Boolean esParaCancelar) throws Exception {
		aniosAux=new ArrayList<Anio>();
		anioAux=new Anio();
		
		if(!this.anioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Anio anioAux:this.anioLogic.getAnios()) {
					if(anioAux.getId()<0) {
						aniosAux.add(anioAux);
					}		
				}
				this.iIdNuevoAnio=0L;
				this.anioLogic.getAnios().removeAll(aniosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Anio anioAux:this.anios) {
					if(anioAux.getId()<0) {
						aniosAux.add(anioAux);
					}		
				}
				this.iIdNuevoAnio=0L;
				this.anios.removeAll(aniosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAnio 
					&& this.anioLogic.getAnios().size()>0
					) {
					anioAux=this.anioLogic.getAnios().get(this.anioLogic.getAnios().size() - 1);
				
					if(anioAux.getId()<0) {
						this.anioLogic.getAnios().remove(anioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAnio && this.anios.size()>0) {
					anioAux=this.anios.get(this.anios.size() - 1);
				
					if(anioAux.getId()<0) {
						this.anios.remove(anioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAnio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(anio.getId()<0) {
				this.anioLogic.getAnios().remove(this.anio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(anio.getId()<0) {
				this.anios.remove(this.anio);
			}
		}			
	}
	
	public void setEstadosInicialesAnio(List<Anio> aniosAux) throws Exception {
		AnioConstantesFunciones.setEstadosInicialesAnio(aniosAux);
	}
	
	public void setEstadosInicialesAnio(Anio anioAux) throws Exception {
		AnioConstantesFunciones.setEstadosInicialesAnio(anioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAnioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAnio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAnioActual()) {
				if(!this.isEsNuevoAnio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAnio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAnio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAnioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Anio ?", "MANTENIMIENTO DE Anio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAnio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Anio anio) throws Exception {
		AnioConstantesFunciones.seleccionarAsignar(this.anio,anio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAnio=this.isPermisoActualizarOriginalAnio;
			
			
			this.seleccionarAsignar(anio);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AnioConstantesFunciones.quitarEspaciosAnio(this.anio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAnio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.anioSessionBean.setsFuncionBusquedaRapida(this.anioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAnio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAnio(esParaCancelar);				
				this.cancelarNuevoAnio(esParaCancelar);								
			}
			
			this.anio=new Anio();
			
			this.inicializarAnio();
			
			this.actualizarEstadoCeldasBotonesAnio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAnio() throws Exception {
		try {
			AnioConstantesFunciones.inicializarAnio(this.anio);
			
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
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.anioLogic.getAnios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAnios(String sAccionBusqueda,List<Anio> aniosParaReportes) throws Exception {
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
					sPathReporteFinal="Anio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AnioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AnioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Anio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Anios");		
		parameters.put("busquedapor", AnioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAnio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AnioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AnioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAnio=new JRBeanArrayDataSource(AnioJInternalFrame.TraerAnioBeans(aniosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAnio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AnioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AnioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AnioBean.TraerAnioBeans(aniosParaReportes).toArray()));
							
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
				this.generarExcelReporteAnios(sAccionBusqueda,sTipoArchivoReporte,aniosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAnios(sAccionBusqueda,sTipoArchivoReporte,aniosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAnioActionPerformed(null);
					//this.generarExcelReporteAnios(sAccionBusqueda,sTipoArchivoReporte,aniosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAnios(sAccionBusqueda,sTipoArchivoReporte,aniosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAnios(sAccionBusqueda,sTipoArchivoReporte,aniosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAnios(sAccionBusqueda,sTipoArchivoReporte,aniosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAnios(String sAccionBusqueda,String sTipoArchivoReporte,List<Anio> aniosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Anios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAnio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Anio anio : aniosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AnioConstantesFunciones.generarExcelReporteDataAnio("NORMAL",row,workbook,anio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAnio(String sTipo,Row row,Workbook workbook) {
		
		AnioConstantesFunciones.generarExcelReporteHeaderAnio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAnios(String sAccionBusqueda,String sTipoArchivoReporte,List<Anio> aniosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Anios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Anio anio : aniosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AnioConstantesFunciones.getAnioDescripcion(anio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anio.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AnioConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AnioConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(anio.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAnios(String sAccionBusqueda,String sTipoArchivoReporte,List<Anio> aniosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Anio> aniosRespaldo=null;
		
		classes=AnioConstantesFunciones.getClassesRelationshipsOfAnio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.anioLogic.setDatosCliente(this.datosCliente);
		this.anioLogic.setDatosDeep(this.datosDeep);
		this.anioLogic.setIsConDeep(true);
		
		aniosRespaldo=this.anioLogic.getAnios();
		
		this.anioLogic.setAnios(aniosParaReportes);	
		this.anioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		aniosParaReportes=this.anioLogic.getAnios();
		this.anioLogic.setAnios(aniosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Anios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAnio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Anio anio : aniosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAnio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AnioConstantesFunciones.generarExcelReporteDataAnio("NORMAL",row,workbook,anio,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(AnioConstantesFunciones.getAnioDescripcion(anio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAnio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAnio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAnio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAnio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAnio() throws Exception {		
		this.startProcessAnio(true);
	}
	
	public void startProcessAnio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesAnio, this.jScrollPanelDatosAnio,this.jPanelPaginacionAnio, this.jScrollPanelDatosEdicionAnio, this.jPanelAccionesAnio,this.jPanelAccionesFormularioAnio,this.jmenuBarAnio,this.jmenuBarDetalleAnio,this.jTtoolBarAnio,this.jTtoolBarDetalleAnio);		
		
		final JTabbedPane jTabbedPaneBusquedasAnio=null; 
		
		final JPanel jPanelParametrosReportesAnio=this.jPanelParametrosReportesAnio;
		//final JScrollPane jScrollPanelDatosAnio=this.jScrollPanelDatosAnio;
		final JTable jTableDatosAnio=this.jTableDatosAnio;		
		final JPanel jPanelPaginacionAnio=this.jPanelPaginacionAnio;
		//final JScrollPane jScrollPanelDatosEdicionAnio=this.jScrollPanelDatosEdicionAnio;
		final JPanel jPanelAccionesAnio=this.jPanelAccionesAnio;
		
		JPanel jPanelCamposAuxiliarAnio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAnio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAnio!=null) {
			jPanelCamposAuxiliarAnio=this.jInternalFrameDetalleFormAnio.jPanelCamposAnio;
			jPanelAccionesFormularioAuxiliarAnio=this.jInternalFrameDetalleFormAnio.jPanelAccionesFormularioAnio;
		}
		
		final JPanel jPanelCamposAnio=jPanelCamposAuxiliarAnio;
		final JPanel jPanelAccionesFormularioAnio=jPanelAccionesFormularioAuxiliarAnio;
		
		
		final JMenuBar jmenuBarAnio=this.jmenuBarAnio;
		final JToolBar jTtoolBarAnio=this.jTtoolBarAnio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAnio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAnio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAnio!=null) {
			jmenuBarDetalleAuxiliarAnio=this.jInternalFrameDetalleFormAnio.jmenuBarDetalleAnio;
			jTtoolBarDetalleAuxiliarAnio=this.jInternalFrameDetalleFormAnio.jTtoolBarDetalleAnio;
		}
		
		final JMenuBar jmenuBarDetalleAnio=jmenuBarDetalleAuxiliarAnio;
		final JToolBar jTtoolBarDetalleAnio=jTtoolBarDetalleAuxiliarAnio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAnio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAnio;
			processRunnable.jTableDatos=jTableDatosAnio;
			processRunnable.jPanelCampos=jPanelCamposAnio;
			processRunnable.jPanelPaginacion=jPanelPaginacionAnio;
			processRunnable.jPanelAcciones=jPanelAccionesAnio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAnio;
			
			
			processRunnable.jmenuBar=jmenuBarAnio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAnio;
			processRunnable.jTtoolBar=jTtoolBarAnio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAnio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAnio ,jPanelParametrosReportesAnio,jTableDatosAnio, /*jScrollPanelDatosAnio,*/jPanelCamposAnio,jPanelPaginacionAnio, /*jScrollPanelDatosEdicionAnio,*/ jPanelAccionesAnio,jPanelAccionesFormularioAnio,jmenuBarAnio,jmenuBarDetalleAnio,jTtoolBarAnio,jTtoolBarDetalleAnio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesAnio, jScrollPanelDatosAnio,jPanelPaginacionAnio, jScrollPanelDatosEdicionAnio, jPanelAccionesAnio,jPanelAccionesFormularioAnio,jmenuBarAnio,jmenuBarDetalleAnio,jTtoolBarAnio,jTtoolBarDetalleAnio);
						
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
	
	public void finishProcessAnio() {// throws Exception 
		this.finishProcessAnio(true);
	}
	
	public void finishProcessAnio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesAnio, this.jScrollPanelDatosAnio,this.jPanelPaginacionAnio, this.jScrollPanelDatosEdicionAnio, this.jPanelAccionesAnio,this.jPanelAccionesFormularioAnio,this.jmenuBarAnio,this.jmenuBarDetalleAnio,this.jTtoolBarAnio,this.jTtoolBarDetalleAnio);		
		
		final JTabbedPane jTabbedPaneBusquedasAnio=null; 
		
		final JPanel jPanelParametrosReportesAnio=this.jPanelParametrosReportesAnio;
		//final JScrollPane jScrollPanelDatosAnio=this.jScrollPanelDatosAnio;
		final JTable jTableDatosAnio=this.jTableDatosAnio;		
		final JPanel jPanelPaginacionAnio=this.jPanelPaginacionAnio;
		//final JScrollPane jScrollPanelDatosEdicionAnio=this.jScrollPanelDatosEdicionAnio;
		final JPanel jPanelAccionesAnio=this.jPanelAccionesAnio;
		
		JPanel jPanelCamposAuxiliarAnio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAnio=new JPanel();
		
		if(this.jInternalFrameDetalleFormAnio!=null) {
			jPanelCamposAuxiliarAnio=this.jInternalFrameDetalleFormAnio.jPanelCamposAnio;
			jPanelAccionesFormularioAuxiliarAnio=this.jInternalFrameDetalleFormAnio.jPanelAccionesFormularioAnio;
		}
		
		final JPanel jPanelCamposAnio=jPanelCamposAuxiliarAnio;
		final JPanel jPanelAccionesFormularioAnio=jPanelAccionesFormularioAuxiliarAnio;
		
		
		final JMenuBar jmenuBarAnio=this.jmenuBarAnio;		
		final JToolBar jTtoolBarAnio=this.jTtoolBarAnio;
				
		JMenuBar jmenuBarDetalleAuxiliarAnio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAnio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAnio!=null) {
			jmenuBarDetalleAuxiliarAnio=this.jInternalFrameDetalleFormAnio.jmenuBarDetalleAnio;
			jTtoolBarDetalleAuxiliarAnio=this.jInternalFrameDetalleFormAnio.jTtoolBarDetalleAnio;		
		}
		
		final JMenuBar jmenuBarDetalleAnio=jmenuBarDetalleAuxiliarAnio;
		final JToolBar jTtoolBarDetalleAnio=jTtoolBarDetalleAuxiliarAnio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAnio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAnio;
			processRunnable.jTableDatos=jTableDatosAnio;
			processRunnable.jPanelCampos=jPanelCamposAnio;
			processRunnable.jPanelPaginacion=jPanelPaginacionAnio;
			processRunnable.jPanelAcciones=jPanelAccionesAnio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAnio;
			
			
			processRunnable.jmenuBar=jmenuBarAnio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAnio;
			processRunnable.jTtoolBar=jTtoolBarAnio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAnio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAnio ,jPanelParametrosReportesAnio, jTableDatosAnio,/*jScrollPanelDatosAnio,*/jPanelCamposAnio,jPanelPaginacionAnio, /*jScrollPanelDatosEdicionAnio,*/ jPanelAccionesAnio,jPanelAccionesFormularioAnio,jmenuBarAnio,jmenuBarDetalleAnio,jTtoolBarAnio,jTtoolBarDetalleAnio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAnio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAnio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAnio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAnio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAnio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAnio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAnio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAnio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAnio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.anioConstantesFunciones.getsFinalQueryAnio();
		String  finalQueryPaginacionTodos=this.anioConstantesFunciones.getsFinalQueryAnio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AnioConstantesFunciones.getArrayColumnasGlobalesNoAnio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.aniosEliminados= new ArrayList<Anio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAnio();
		
				///*AnioSessionBean*/this.anioSessionBean=new AnioSessionBean();
			
			if(this.anioSessionBean==null) {
				this.anioSessionBean=new AnioSessionBean();
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
					this.iNumeroPaginacion=AnioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AnioConstantesFunciones.getClassesForeignKeysOfAnio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/anio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			aniosAux= new ArrayList<Anio>();
			
				
			anioLogic.setDatosCliente(this.datosCliente);
			anioLogic.setDatosDeep(this.datosDeep);
			anioLogic.setIsConDeep(true);
			
			
			anioLogic.getAnioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					anioLogic.getTodosAnios(finalQueryGlobal,pagination);
					
					//anioLogic.getTodosAniosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(anioLogic.getAnios()==null|| anioLogic.getAnios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							aniosAux= new ArrayList<Anio>();
							aniosAux.addAll(anioLogic.getAnios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							aniosAux= new ArrayList<Anio>();
							aniosAux.addAll(anios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							anioLogic.getTodosAnios(finalQueryGlobal+"",this.pagination);												
							
							//anioLogic.getTodosAniosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAnios("Todos",anioLogic.getAnios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							anioLogic.setAnios(new ArrayList<Anio>());					
							anioLogic.getAnios().addAll(aniosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anios=new ArrayList<Anio>();
							anios.addAll(aniosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAnio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAnio=this.idActual;
				
				} else if(this.idAnioActual!=null && this.idAnioActual!=0L) {
					idAnio=idAnioActual;
				}
				
					
				this.sDetalleReporte=AnioConstantesFunciones.getDetalleIndicePorId(idAnio);
				
				this.anios=new ArrayList<Anio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					anioLogic.getEntity(idAnio);
					
					//anioLogic.getEntityWithConnection(idAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.setAnios(new ArrayList<Anio>());
					anioLogic.getAnios().add(anioLogic.getAnio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.anios=new ArrayList<Anio>();
					this.anios.add(anio);
				}
				
				if(anioLogic.getAnio()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAnio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAnio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=anioLogic.getAnios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=anios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=anioLogic.getAnios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=anios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Anio anio) {
		Boolean permite=true;
		
		if(this.anio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AnioConstantesFunciones.getOrderByListaAnio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AnioConstantesFunciones.getOrderByListaAnio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Anio anio:anioLogic.getAnios()) {
				if(anio.getsType().equals(Constantes2.S_TOTALES)) {
					anioTotales=anio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Anio anio:this.anios) {
				if(anio.getsType().equals(Constantes2.S_TOTALES)) {
					anioTotales=anio;
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
			this.anioAux=new Anio();
			this.anioAux.setsType(Constantes2.S_TOTALES);
			this.anioAux.setIsNew(false);
			this.anioAux.setIsChanged(false);
			this.anioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AnioConstantesFunciones.TotalizarValoresFilaAnio(this.anioLogic.getAnios(),this.anioAux);
				
				this.anioLogic.getAnios().add(this.anioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AnioConstantesFunciones.TotalizarValoresFilaAnio(this.anios,this.anioAux);
				
				this.anios.add(this.anioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		anioTotales=new Anio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.anioLogic.getAnios().remove(anioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.anios.remove(anioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		anioTotales=new Anio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Anio anio:anioLogic.getAnios()) {
				if(anio.getsType().equals(Constantes2.S_TOTALES)) {
					anioTotales=anio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AnioConstantesFunciones.TotalizarValoresFilaAnio(this.anioLogic.getAnios(),anioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Anio anio:this.anios) {
				if(anio.getsType().equals(Constantes2.S_TOTALES)) {
					anioTotales=anio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AnioConstantesFunciones.TotalizarValoresFilaAnio(this.anios,anioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAnioPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getAnioPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getAnioPorNombre(nombre);
				
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
	
	public void inicializarPermisosAnio() {
		this.isPermisoTodoAnio=false;
		this.isPermisoNuevoAnio=false;
		this.isPermisoActualizarAnio=false;
		this.isPermisoActualizarOriginalAnio=false;
		this.isPermisoEliminarAnio=false;
		this.isPermisoGuardarCambiosAnio=false;
		this.isPermisoConsultaAnio=false;
		this.isPermisoBusquedaAnio=false;
		this.isPermisoReporteAnio=false;		
		this.isPermisoOrdenAnio=false;		
		this.isPermisoPaginacionMedioAnio=false;		
		this.isPermisoPaginacionAltoAnio=false;
		this.isPermisoPaginacionTodoAnio=false;
		this.isPermisoCopiarAnio=false;		
		this.isPermisoVerFormAnio=false;		
		this.isPermisoDuplicarAnio=false;		
		this.isPermisoOrdenAnio=false;		
	}
	
	public void setPermisosUsuarioAnio(Boolean isPermiso) {
		this.isPermisoTodoAnio=isPermiso;
		this.isPermisoNuevoAnio=isPermiso;
		this.isPermisoActualizarAnio=isPermiso;
		this.isPermisoActualizarOriginalAnio=isPermiso;
		this.isPermisoEliminarAnio=isPermiso;
		this.isPermisoGuardarCambiosAnio=isPermiso;
		this.isPermisoConsultaAnio=isPermiso;
		this.isPermisoBusquedaAnio=isPermiso;
		this.isPermisoReporteAnio=isPermiso;
		this.isPermisoOrdenAnio=isPermiso;		
		this.isPermisoPaginacionMedioAnio=isPermiso;		
		this.isPermisoPaginacionAltoAnio=isPermiso;		
		this.isPermisoPaginacionTodoAnio=isPermiso;		
		this.isPermisoCopiarAnio=isPermiso;		
		this.isPermisoVerFormAnio=isPermiso;		
		this.isPermisoDuplicarAnio=isPermiso;
		this.isPermisoOrdenAnio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAnio(Boolean isPermiso) {
		//this.isPermisoTodoAnio=isPermiso;
		this.isPermisoNuevoAnio=isPermiso;
		this.isPermisoActualizarAnio=isPermiso;
		this.isPermisoActualizarOriginalAnio=isPermiso;
		this.isPermisoEliminarAnio=isPermiso;
		this.isPermisoGuardarCambiosAnio=isPermiso;
		//this.isPermisoConsultaAnio=isPermiso;
		//this.isPermisoBusquedaAnio=isPermiso;
		//this.isPermisoReporteAnio=isPermiso;
		//this.isPermisoOrdenAnio=isPermiso;		
		//this.isPermisoPaginacionMedioAnio=isPermiso;		
		//this.isPermisoPaginacionAltoAnio=isPermiso;		
		//this.isPermisoPaginacionTodoAnio=isPermiso;		
		//this.isPermisoCopiarAnio=isPermiso;		
		//this.isPermisoDuplicarAnio=isPermiso;
		//this.isPermisoOrdenAnio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAnioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(AnioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebAnio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAnioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioAnioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAnioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAnioClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioAnio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AnioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.anioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AnioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAnio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAnio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAnio=this.isPermisoActualizarAnio;
			this.isPermisoEliminarAnio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAnio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAnio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAnio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAnio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAnio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAnio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAnio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAnio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAnio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAnio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAnio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAnio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAnio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.anioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAnio.setToolTipText(this.jTableDatosAnio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAnio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAnio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AnioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AnioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAnio() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyAnioListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAnioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AnioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAnioListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyAnioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAnio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyAnio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAnio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAnio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAnio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAnio(Anio anio)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAnio(Anio anio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAnio()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAnio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAnio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAnio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAnio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAnio()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAnio(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAnio()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public AnioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AnioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AnioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.anioSessionBean=new AnioSessionBean(); 
		this.anioConstantesFunciones=new AnioConstantesFunciones(); 
		this.anioBean=new Anio();//(this.anioConstantesFunciones); 		
		this.anioReturnGeneral=new AnioParameterReturnGeneral(); 
		
		this.anioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.anioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AnioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AnioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AnioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAnio(true);
			
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
			
			this.anioConstantesFunciones=new AnioConstantesFunciones(); 
			this.anioBean=new Anio();//this.anioConstantesFunciones); 			
			this.anioReturnGeneral=new AnioParameterReturnGeneral(); 
		
			AnioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Anio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.anio=new Anio();
			this.anios = new ArrayList<Anio>();
			this.aniosAux = new ArrayList<Anio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic=new AnioLogic();
				this.anioLogic.getNewConnexionToDeep("");
			}
			
			//this.anioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.anioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAnio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAnio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAnio);	
					}
					
					if(this.jInternalFrameImportacionAnio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAnio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAnio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAnio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAnio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAnio);
				this.jInternalFrameDetalleFormAnio.setVisible(false);
				this.jInternalFrameDetalleFormAnio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAnio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAnio);
					this.jInternalFrameReporteDinamicoAnio.setVisible(false);
					this.jInternalFrameReporteDinamicoAnio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAnio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAnio);
					this.jInternalFrameImportacionAnio.setVisible(false);
					this.jInternalFrameImportacionAnio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAnio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAnio);
					this.jInternalFrameOrderByAnio.setVisible(false);
					this.jInternalFrameOrderByAnio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAnioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AnioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.anioReturnGeneral=new AnioParameterReturnGeneral();
			
			this.anioParameterGeneral=new AnioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.anioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.anioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AnioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.anioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AnioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.anioSessionBean.getEsGuardarRelacionado(),this.anioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AnioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.anioSessionBean.getEsGuardarRelacionado(),this.anioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAnio=false;
			this.isVisibilidadCeldaDuplicarAnio=true;
			this.isVisibilidadCeldaCopiarAnio=true;
			this.isVisibilidadCeldaVerFormAnio=true;
			this.isVisibilidadCeldaOrdenAnio=true;
			this.isVisibilidadCeldaNuevoRelacionesAnio=false;
			this.isVisibilidadCeldaModificarAnio=false;
			this.isVisibilidadCeldaActualizarAnio=false;
			this.isVisibilidadCeldaEliminarAnio=false;
			this.isVisibilidadCeldaCancelarAnio=false;
			this.isVisibilidadCeldaGuardarAnio=false;
			this.isVisibilidadCeldaGuardarCambiosAnio=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAnio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAnio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAnio(false);
			
			this.setPermisosUsuarioAnio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.anioSessionBean.getEsGuardarRelacionado() 
				|| (this.anioSessionBean.getEsGuardarRelacionado() && this.anioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAnioClasesRelacionadas();
			}
			
			if(this.anioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAnioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AnioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAnio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAnio();
			}
			
			if(!this.isPermisoBusquedaAnio) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.anioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAnio,this.isPermisoPaginacionMedioAnio,this.isPermisoPaginacionTodoAnio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AnioConstantesFunciones.getTiposSeleccionarAnio());
				
				this.tiposColumnasSelect=AnioConstantesFunciones.getTiposSeleccionarAnio(true);
				
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
			//if(!this.anioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAnio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,true,false);
				this.setAccionesUsuarioAnio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,true,false);							
				this.setAccionesUsuarioAnio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAnio() ;
			
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
				anioImplementable= (AnioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AnioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				anioImplementableHome= (AnioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AnioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.anios= new ArrayList<Anio>();
			this.aniosEliminados= new ArrayList<Anio>();
						
			this.isEsNuevoAnio=false;
			this.esParaAccionDesdeFormularioAnio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAnio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAnio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.anioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AnioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAnio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAnio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAnio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAnio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAnio();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAnio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Anio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAnio() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAnio")) {
				iIndex=this.jInternalFrameDetalleFormAnio.jTabbedPaneRelacionesAnio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAnio.jTabbedPaneRelacionesAnio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAnio.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAnio();	
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
	
	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAnio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAnioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAnio();
		
		this.cargarCombosFrameForeignKeyAnio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAnio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAnio();
		}
	}
	
	
	
	public void jButtonNuevoAnioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.anioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAnio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			
			
			if(jTableDatosAnio.getRowCount()>=1) {
				jTableDatosAnio.removeRowSelectionInterval(0, jTableDatosAnio.getRowCount()-1);						
			}
			
			this.isEsNuevoAnio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAnio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAnio(true);			
			//this.anio=new Anio();
			//this.anio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAnio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAnio() ;
			
			if(AnioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAnio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.anio);	
			this.actualizarInformacion("INFO_PADRE",false,this.anio);				
			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			
			if(this.anioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Anio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAnioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAnio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAnio.getSelectedRows().length;			
			}
			
			aniosSeleccionados=this.getAniosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAnio--;			
				//Anio anioAux= new Anio();			
				//anioAux.setId(this.iIdNuevoAnio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Anio anioOrigen=new Anio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Anio anioOrigen : aniosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAnio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							anioOrigen =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							anioOrigen =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAnio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.anio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAnio(anioOrigen,this.anio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAnio(this.anio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.anioLogic.getAnios().add(this.anioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.anios.add(this.anioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAnio(false);
				
				this.jTableDatosAnio.setRowSelectionInterval(this.getIndiceNuevoAnio(), this.getIndiceNuevoAnio());
				
				int iLastRow =  this.jTableDatosAnio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAnio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAnio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAnio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAnioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();									
		
			Anio anioOrigen=new Anio();
			Anio anioDestino=new Anio();
				
			aniosSeleccionados=this.getAniosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAnio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || aniosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAnio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						anioOrigen =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						anioOrigen =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						anioDestino =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						anioDestino =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				anioOrigen =aniosSeleccionados.get(0);
				anioDestino =aniosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAnio(anioOrigen,anioDestino,true,false);
				
				anioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(anioDestino,anioLogic.getAnios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(anioDestino,anios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAnio(false);
				
				//this.jTableDatosAnio.setRowSelectionInterval(this.getIndiceNuevoAnio(), this.getIndiceNuevoAnio());
				
				int iLastRow =  this.jTableDatosAnio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAnio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAnio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAnio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAnioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAnio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAnio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAnioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAnio.isVisible();
			
			
			this.jPanelParametrosReportesAnio.setVisible(!isVisible);
			this.jPanelPaginacionAnio.setVisible(!isVisible);
			this.jPanelAccionesAnio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAnioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAnio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAnioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAnio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAnioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAnio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAnioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAnio();
			
			this.abrirFrameOrderByAnio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAnioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAnio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAnio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAnio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAnio.isMaximum()) {
					this.jInternalFrameDetalleFormAnio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAnio.setSize(this.jInternalFrameDetalleFormAnio.iWidthFormulario,this.jInternalFrameDetalleFormAnio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAnio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAnio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAnio.isMaximum()) {
						this.jInternalFrameDetalleFormAnio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAnio.jContentPaneDetalleAnio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAnio.jTabbedPaneRelacionesAnio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAnio.jContentPaneDetalleAnio.getWidth(),AnioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAnio.jTabbedPaneRelacionesAnio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAnio.jContentPaneDetalleAnio.getWidth(),AnioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAnio.jTabbedPaneRelacionesAnio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAnio.jContentPaneDetalleAnio.getWidth(),AnioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAnio.setVisible(true);
	        this.jInternalFrameDetalleFormAnio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAnio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAnio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAnio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnio,false,this);
				} else {
					this.jInternalFrameOrderByAnio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAnio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAnio);
				this.jInternalFrameOrderByAnio.setVisible(false);
				this.jInternalFrameOrderByAnio.setSelected(false);
				
				this.jInternalFrameOrderByAnio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAnio"));
				
				this.inicializarActualizarBindingTablaOrderByAnio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAnio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAnio==null) {
				
				this.jInternalFrameImportacionAnio=new ImportacionJInternalFrame(AnioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAnio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAnio);
				this.jInternalFrameImportacionAnio.setVisible(false);
				this.jInternalFrameImportacionAnio.setSelected(false);


				this.jInternalFrameImportacionAnio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAnio"));
				this.jInternalFrameImportacionAnio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAnio"));
				this.jInternalFrameImportacionAnio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAnio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAnio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAnio==null) {
				this.jInternalFrameReporteDinamicoAnio=new ReporteDinamicoJInternalFrame(AnioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAnio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAnio);
				this.jInternalFrameReporteDinamicoAnio.setVisible(false);
				this.jInternalFrameReporteDinamicoAnio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAnio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAnio"));
				this.jInternalFrameReporteDinamicoAnio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAnio"));
				this.jInternalFrameReporteDinamicoAnio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAnio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAnio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleAnio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAnio);
			
	       	this.jInternalFrameDetalleFormAnio.setVisible(false);
	        this.jInternalFrameDetalleFormAnio.setSelected(false);
			
			//this.jInternalFrameDetalleFormAnio.dispose();
			//this.jInternalFrameDetalleFormAnio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAnio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAnio.setVisible(true);
	        this.jInternalFrameReporteDinamicoAnio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAnio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAnio.setVisible(true);
	        this.jInternalFrameImportacionAnio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAnio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAnio.setVisible(true);
	        this.jInternalFrameOrderByAnio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAnio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAnio.setVisible(false);
	        this.jInternalFrameOrderByAnio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAnio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAnio.setVisible(false);
	        this.jInternalFrameReporteDinamicoAnio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAnio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAnio.setVisible(false);
	        this.jInternalFrameImportacionAnio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAnioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAnio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAnio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAnio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAnio(true);
			//this.isEsNuevoAnio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anio =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.anio =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAnio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAnio(false) ;
			
			if(anioSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(AnioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAnio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAnio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAnioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAnio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anio =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anio =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAnio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAnio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAnio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAnio(true);
			//this.isEsNuevoAnio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anio =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.anio =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.anio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAnio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAnio(false) ;
			
			if(AnioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAnio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAnio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarAnioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAnio(false);
			
			//if(!this.isEsNuevoAnio) {								
				int intSelectedRow = this.jTableDatosAnio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anio =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.anio =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AnioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAnio(this.anio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAnio(this.anio);
				
			}
			
			if(this.permiteMantenimiento(this.anio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.anioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAnio=true;
					this.inicializarActualizarBindingTablaAnio(false);
					this.isEsNuevoAnio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAnio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAnio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAnio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAnio(false);
				
				this.habilitarDeshabilitarControlesAnio(false);
			
												
				
				if(AnioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAnio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAnioActionPerformed(evt,anioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAnio(this.anio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAnio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,anioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.anio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Anio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAnioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAnio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anio =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				this.anio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.anio =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				this.anio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.anio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.anioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AnioModel) this.jTableDatosAnio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAnio=true;
				this.inicializarActualizarBindingTablaAnio(false);
				this.isEsNuevoAnio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAnio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAnio(false);
				
				this.habilitarDeshabilitarControlesAnio(false);
				
				
				
				if(AnioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAnio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAnioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAnio.getRowCount()>=1) {
				jTableDatosAnio.removeRowSelectionInterval(0, jTableDatosAnio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAnio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAnio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAnio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAnio(false) ;
			
			this.isEsNuevoAnio=false;
			
			if(AnioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAnio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAnioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAnio(false);
				
				//SI ES MANUAL
				if(AnioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAnio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAnioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAnio--;			
			//Anio anioAux= new Anio();			
			//anioAux.setId(this.iIdNuevoAnio);
			
			if(this.jInternalFrameDetalleFormAnio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAnio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAnio(this.anio);
			
			this.anio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.anioLogic.getAnios().add(this.anioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.anios.add(this.anioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAnio(false);
			
			this.jTableDatosAnio.setRowSelectionInterval(this.getIndiceNuevoAnio(), this.getIndiceNuevoAnio());
			
			int iLastRow =  this.jTableDatosAnio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAnio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAnio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAnio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAnioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAnio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAnio(false);
			
			//SI ES MANUAL
			if(AnioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAnio();
			}
			
			//this.abrirFrameTreeAnio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAnioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE AnioS ?", "MANTENIMIENTO DE Anio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAnio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAnio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.anioReturnGeneral=anioLogic.procesarImportacionAniosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.anioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAnioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAnioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAnio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAnio.setFileImportacion(this.jInternalFrameImportacionAnio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAnio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAnio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAnio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAnio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAnioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();		

		aniosSeleccionados=this.getAniosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAnio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAnio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AnioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AnioBaseDesign.jrxml";
			
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
			
			this.generarReporteAnios("Todos",aniosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAnio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAnio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AnioConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AnioConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAnio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAnio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAnio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AnioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case AnioConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAnio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AnioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case AnioConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAnio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAnio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AnioConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case AnioConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
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
	
	public void jButtonGenerarExcelReporteDinamicoAnioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();		
		
		aniosSeleccionados=this.getAniosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Anios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAnio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAnio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AnioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Anio anio:aniosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anio.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AnioConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AnioConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(Anio anio:aniosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(anio.getvalor());
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
			//	this.getFilaCabeceraExportarExcelAnio(row);				
			//	iRow++;
			//}				
			
			//for(Anio anioAux:aniosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAnio(anioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anio",JOptionPane.INFORMATION_MESSAGE);
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
				this.anioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAnio(false);
			
			//SI ES MANUAL
			if(AnioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAnio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAnioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAnio(false);
			
			//SI ES MANUAL
			if(AnioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAnio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAnioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAnio(false);
			
			//SI ES MANUAL
			if(AnioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAnio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.anioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAnio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAnio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAnio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAnio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAnio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAnio.setMinimumSize(dimensionMinimum);
		this.jTableDatosAnio.setMaximumSize(dimensionMaximum);
		this.jTableDatosAnio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAnio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAnio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAnio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAnio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAnio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.anioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAnio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAnio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAnio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AnioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AnioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAnio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAnio();
		
		this.inicializarActualizarBindingBotonesManualAnio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.anioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAnio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAnio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAnio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAnio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAnio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAnio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAnio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAnio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAnio.jCheckBoxPostAccionNuevoAnio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAnio.jCheckBoxPostAccionSinCerrarAnio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAnio.jCheckBoxPostAccionSinMensajeAnio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAnio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAnio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAnio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAnio!=null) {
				this.jInternalFrameDetalleFormAnio.jCheckBoxPostAccionNuevoAnio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAnio.jCheckBoxPostAccionSinCerrarAnio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAnio.jCheckBoxPostAccionSinMensajeAnio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAnio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAnio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAnio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAnio.jComboBoxTiposAccionesFormularioAnio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAnio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAnio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAnio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAnio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAnio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAnio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAnio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAnio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAnio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAnio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAnio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAnio(Boolean esInicializar) throws Exception {
		try	{	
			if(AnioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAnio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAnio() throws Exception {
		try	{
			if(AnioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAnio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAnio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAnio.jComboBoxTiposAccionesFormularioAnio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAnio.jComboBoxTiposAccionesFormularioAnio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAnio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAnio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAnio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAnio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAnio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAnio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAnio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAnio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAnio.addItem(reporte);
			}
			
			
			if(!this.anioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAnio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAnio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAnio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAnio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAnio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAnio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAnio.jComboBoxTiposAccionesFormularioAnio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAnio.jComboBoxTiposAccionesFormularioAnio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAnio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAnio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAnio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAnio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAnio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAnio!=null) {
				this.jInternalFrameReporteDinamicoAnio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAnio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAnio!=null) {
				this.jInternalFrameReporteDinamicoAnio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAnio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAnio!=null) {
				
				if(this.jInternalFrameReporteDinamicoAnio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAnio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAnio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAnio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAnio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAnio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoAnio.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAnio.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=AnioConstantesFunciones.getTiposSeleccionarAnio(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAnio.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoAnio.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoAnio.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=AnioConstantesFunciones.getTiposSeleccionarAnio(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoAnio.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoAnio.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoAnio.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=AnioConstantesFunciones.getTiposSeleccionarAnio(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAnio.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoAnio.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoAnio.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoAnio.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAnio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAnio(Boolean esInicializar) throws Exception {				
		if(AnioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAnio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAnio() throws Exception {
		this.inicializarActualizarBindingTablaAnio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAnio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAnio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAnio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAnio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AnioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAnio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAnio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AnioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAnioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AnioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAnio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAnio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AnioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAnio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAnio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=anioLogic.getAnios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=anios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AnioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAnio.setModel(new AnioModel(this.anioLogic.getAnios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAnio.setModel(new AnioModel(this.anios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAnio!=null && this.jInternalFrameOrderByAnio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAnio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAnio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AnioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AnioConstantesFunciones.SCLASSWEBTITULO,anioConstantesFunciones.resaltarSeleccionarAnio,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AnioConstantesFunciones.SCLASSWEBTITULO,anioConstantesFunciones.resaltarSeleccionarAnio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAnio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnio,AnioConstantesFunciones.LABEL_ID));

		if(this.anioConstantesFunciones.mostraridAnio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anioConstantesFunciones.resaltaridAnio,this.anioConstantesFunciones.activaridAnio,iSizeTabla,this,true,"idAnio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anioConstantesFunciones.resaltaridAnio,this.anioConstantesFunciones.activaridAnio,this,true,"idAnio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnio,AnioConstantesFunciones.LABEL_NOMBRE));

		if(this.anioConstantesFunciones.mostrarnombreAnio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.anioConstantesFunciones.resaltarnombreAnio,this.anioConstantesFunciones.activarnombreAnio,iSizeTabla,this,true,"nombreAnio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anioConstantesFunciones.resaltarnombreAnio,this.anioConstantesFunciones.activarnombreAnio,this,true,"nombreAnio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AnioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAnio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAnio,AnioConstantesFunciones.LABEL_VALOR));

		if(this.anioConstantesFunciones.mostrarvalorAnio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AnioConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.anioConstantesFunciones.resaltarvalorAnio,this.anioConstantesFunciones.activarvalorAnio,iSizeTabla,this,true,"valorAnio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.anioConstantesFunciones.resaltarvalorAnio,this.anioConstantesFunciones.activarvalorAnio,this,true,"valorAnio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new AnioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.anioSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.anioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.anioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAnio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.anioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.anioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAnio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAnio && this.isPermisoGuardarCambiosAnio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.anioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.anioSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAnio.addColumn(tableColumn);
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
			
			this.jTableDatosAnio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAnio && this.isPermisoGuardarCambiosAnio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAnio && this.isPermisoGuardarCambiosAnio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAnio.moveColumn(this.jTableDatosAnio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAnio.moveColumn(this.jTableDatosAnio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAnio.moveColumn(this.jTableDatosAnio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAnio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAnio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAnio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AnioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAnio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAnio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AnioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AnioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAnio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAnio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAnio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=anioLogic.getAnios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=anios.size()-1;
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
		//this.jTableDatosAnio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAnio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAnio();
			
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
				
				//this.isEsNuevoAnio=false;
					
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			
				if(this.anioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAnio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAnio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAnio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anio =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anio =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.anio.getsType().equals("DUPLICADO")
				   || this.anio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAnio=true;
				
				} else {
					this.isEsNuevoAnio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.anioSessionBean.getEsGuardarRelacionado()) {
					if(this.anio.getId()>=0 && !this.anio.getIsNew()) {						
						this.isEsNuevoAnio=false;
						
					} else {
						this.isEsNuevoAnio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAnio(esRelaciones);						
				
				this.seleccionarAnio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.anio.getId()<0) {
					this.isEsNuevoAnio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAnio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAnio(evt,rowIndex);
				}	
				
				if(this.anioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Anio: " + this.dDif); 
					}
				}								
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAnio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.anio)) {
					if(this.anio.getId()>0) {
						this.anio.setIsDeleted(true);
						
						this.aniosEliminados.add(this.anio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.anioLogic.getAnios().remove(this.anio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.anios.remove(this.anio);				
					}
					
					
					((AnioModel) this.jTableDatosAnio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAnio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAnio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAnio) {
			
			if(this.jInternalFrameDetalleFormAnio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAnio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAnio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anio =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anio =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AnioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAnio(this.anio);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAnio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAnio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAnio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAnio(Anio anio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAnio(anio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAnio(Anio anio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAnio(anio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAnio(anio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAnio(anio);
	}
	
	public void setVariablesObjetoActualToFormularioAnio(Anio anio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAnio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAnio.jTextFieldidAnio.setText(anio.getId().toString());
			this.jInternalFrameDetalleFormAnio.jTextFieldnombreAnio.setText(anio.getnombre());
			this.jInternalFrameDetalleFormAnio.jTextFieldvalorAnio.setText(anio.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Anio anioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,anioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Anio anioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				anioLocal=this.anio;
			} else {
				anioLocal=this.anioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(anioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAnio(anioLocal,true);
					
					if(anioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(anioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.anioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(anioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAnio(Anio anio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAnio(anio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAnio(anio);
	}
	
	public void setVariablesFormularioToObjetoActualAnio(Anio anio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAnio(anio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAnio(Anio anio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAnio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAnio.jTextFieldidAnio.getText()==null || this.jInternalFrameDetalleFormAnio.jTextFieldidAnio.getText()=="" || this.jInternalFrameDetalleFormAnio.jTextFieldidAnio.getText()=="Id") {
				this.jInternalFrameDetalleFormAnio.jTextFieldidAnio.setText("0");
			}

			if(conColumnasBase) {anio.setId(Long.parseLong(this.jInternalFrameDetalleFormAnio.jTextFieldidAnio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnio.jLabelIdAnio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anio.setnombre(this.jInternalFrameDetalleFormAnio.jTextFieldnombreAnio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnio.jLabelnombreAnio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			anio.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormAnio.jTextFieldvalorAnio.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AnioConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAnio.jLabelvalorAnio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAnio(Anio anioBean,Anio anio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAnio(Anio anioOrigen,Anio anio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && anioOrigen.getId()!=null && !anioOrigen.getId().equals(0L))) {anio.setId(anioOrigen.getId());}}
			if(conDefault || (!conDefault && anioOrigen.getnombre()!=null && !anioOrigen.getnombre().equals(""))) {anio.setnombre(anioOrigen.getnombre());}
			if(conDefault || (!conDefault && anioOrigen.getvalor()!=null && !anioOrigen.getvalor().equals(0.0))) {anio.setvalor(anioOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAnio(Anio anio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAnio.jTextFieldidAnio.setText(anio.getId().toString());
			this.jInternalFrameDetalleFormAnio.jTextFieldnombreAnio.setText(anio.getnombre());
			this.jInternalFrameDetalleFormAnio.jTextFieldvalorAnio.setText(anio.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAnio(AnioBean anioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAnio.jTextFieldidAnio.setText(anioBean.getId().toString());
			this.jInternalFrameDetalleFormAnio.jTextFieldnombreAnio.setText(anioBean.getnombre());
			this.jInternalFrameDetalleFormAnio.jTextFieldvalorAnio.setText(anioBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAnio(AnioParameterReturnGeneral anioReturnGeneral,AnioBean anioBean,Boolean conDefault) throws Exception { 
		try {
			Anio anioLocal=new Anio();
			
			anioLocal=anioReturnGeneral.getAnio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && anioLocal.getId()!=null && !anioLocal.getId().equals(0L))) {anioBean.setId(anioLocal.getId());}}
			if(conDefault || (!conDefault && anioLocal.getnombre()!=null && !anioLocal.getnombre().equals(""))) {anioBean.setnombre(anioLocal.getnombre());}
			if(conDefault || (!conDefault && anioLocal.getvalor()!=null && !anioLocal.getvalor().equals(0.0))) {anioBean.setvalor(anioLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAnioGenerico(Long idAnioSeleccionado,JComboBox jComboBoxAnio,List<Anio> aniosLocal)throws Exception {
		try {
			Anio  anioTemp=null;

			for(Anio anioAux:aniosLocal) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			jComboBoxAnio.setSelectedItem(anioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAnioGenerico(JComboBox jComboBoxAnio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAnio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAnio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAnio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAnio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAnio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAnio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAnio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAnio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAnio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAnio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			anio=(Anio) anioLogic.getAnios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			anio =(Anio) anios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Anio anioRow=new Anio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			anioRow=(Anio) anioLogic.getAnios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			anioRow=(Anio) anios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAnio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAnio.setVisible((this.isVisibilidadCeldaNuevoAnio && this.isPermisoNuevoAnio));			
			this.jButtonDuplicarAnio.setVisible((this.isVisibilidadCeldaDuplicarAnio && this.isPermisoDuplicarAnio));			
			this.jButtonCopiarAnio.setVisible((this.isVisibilidadCeldaCopiarAnio && this.isPermisoCopiarAnio));
			this.jButtonVerFormAnio.setVisible((this.isVisibilidadCeldaVerFormAnio && this.isPermisoVerFormAnio));
			
			this.jButtonAbrirOrderByAnio.setVisible((this.isVisibilidadCeldaOrdenAnio && this.isPermisoOrdenAnio));			
			
			this.jButtonNuevoRelacionesAnio.setVisible((this.isVisibilidadCeldaNuevoRelacionesAnio && this.isPermisoNuevoAnio));			
			this.jButtonNuevoGuardarCambiosAnio.setVisible((this.isVisibilidadCeldaNuevoAnio && this.isPermisoNuevoAnio && this.isPermisoGuardarCambiosAnio));
			
			if(this.jInternalFrameDetalleFormAnio!=null) {
			this.jInternalFrameDetalleFormAnio.jButtonModificarAnio.setVisible((this.isVisibilidadCeldaModificarAnio && this.isPermisoActualizarAnio));	
			this.jInternalFrameDetalleFormAnio.jButtonActualizarAnio.setVisible((this.isVisibilidadCeldaActualizarAnio && this.isPermisoActualizarAnio));	
			this.jInternalFrameDetalleFormAnio.jButtonEliminarAnio.setVisible((this.isVisibilidadCeldaEliminarAnio && this.isPermisoEliminarAnio));
			this.jInternalFrameDetalleFormAnio.jButtonCancelarAnio.setVisible(this.isVisibilidadCeldaCancelarAnio);							
			this.jInternalFrameDetalleFormAnio.jButtonGuardarCambiosAnio.setVisible((this.isVisibilidadCeldaGuardarAnio && this.isPermisoGuardarCambiosAnio));			
			
			}
						
			this.jButtonGuardarCambiosTablaAnio.setVisible((this.isVisibilidadCeldaGuardarCambiosAnio && this.isPermisoGuardarCambiosAnio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAnio.setVisible((this.isVisibilidadCeldaNuevoAnio && this.isPermisoNuevoAnio));						
			this.jButtonDuplicarToolBarAnio.setVisible((this.isVisibilidadCeldaDuplicarAnio && this.isPermisoDuplicarAnio));						
			this.jButtonCopiarToolBarAnio.setVisible((this.isVisibilidadCeldaCopiarAnio && this.isPermisoCopiarAnio));			
			this.jButtonVerFormToolBarAnio.setVisible((this.isVisibilidadCeldaVerFormAnio && this.isPermisoVerFormAnio));			
			this.jButtonAbrirOrderByToolBarAnio.setVisible((this.isVisibilidadCeldaOrdenAnio && this.isPermisoOrdenAnio));
			this.jButtonNuevoRelacionesToolBarAnio.setVisible((this.isVisibilidadCeldaNuevoRelacionesAnio && this.isPermisoNuevoAnio));			
			this.jButtonNuevoGuardarCambiosToolBarAnio.setVisible((this.isVisibilidadCeldaNuevoAnio && this.isPermisoNuevoAnio && this.isPermisoGuardarCambiosAnio));			
			
			if(this.jInternalFrameDetalleFormAnio!=null) {
			this.jInternalFrameDetalleFormAnio.jButtonModificarToolBarAnio.setVisible((this.isVisibilidadCeldaModificarAnio && this.isPermisoActualizarAnio));	
			this.jInternalFrameDetalleFormAnio.jButtonActualizarToolBarAnio.setVisible((this.isVisibilidadCeldaActualizarAnio  && this.isPermisoActualizarAnio));	
			this.jInternalFrameDetalleFormAnio.jButtonEliminarToolBarAnio.setVisible((this.isVisibilidadCeldaEliminarAnio && this.isPermisoEliminarAnio));
			this.jInternalFrameDetalleFormAnio.jButtonCancelarToolBarAnio.setVisible(this.isVisibilidadCeldaCancelarAnio);				
			this.jInternalFrameDetalleFormAnio.jButtonGuardarCambiosToolBarAnio.setVisible((this.isVisibilidadCeldaGuardarAnio && this.isPermisoGuardarCambiosAnio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAnio.setVisible((this.isVisibilidadCeldaGuardarCambiosAnio && this.isPermisoGuardarCambiosAnio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAnio.setVisible((this.isVisibilidadCeldaNuevoAnio && this.isPermisoNuevoAnio));			
			this.jMenuItemDuplicarAnio.setVisible((this.isVisibilidadCeldaDuplicarAnio && this.isPermisoDuplicarAnio));			
			this.jMenuItemCopiarAnio.setVisible((this.isVisibilidadCeldaCopiarAnio && this.isPermisoCopiarAnio));			
			this.jMenuItemVerFormAnio.setVisible((this.isVisibilidadCeldaVerFormAnio && this.isPermisoVerFormAnio));			
			this.jMenuItemAbrirOrderByAnio.setVisible((this.isVisibilidadCeldaOrdenAnio && this.isPermisoOrdenAnio));			
			//this.jMenuItemMostrarOcultarAnio.setVisible((this.isVisibilidadCeldaOrdenAnio && this.isPermisoOrdenAnio));
			this.jMenuItemDetalleAbrirOrderByAnio.setVisible((this.isVisibilidadCeldaOrdenAnio && this.isPermisoOrdenAnio));			
			//this.jMenuItemDetalleMostrarOcultarAnio.setVisible((this.isVisibilidadCeldaOrdenAnio && this.isPermisoOrdenAnio));			
			this.jMenuItemNuevoRelacionesAnio.setVisible((this.isVisibilidadCeldaNuevoRelacionesAnio && this.isPermisoNuevoAnio));			
			this.jMenuItemNuevoGuardarCambiosAnio.setVisible((this.isVisibilidadCeldaNuevoAnio && this.isPermisoNuevoAnio && this.isPermisoGuardarCambiosAnio));									
			
			if(this.jInternalFrameDetalleFormAnio!=null) {
			this.jInternalFrameDetalleFormAnio.jMenuItemModificarAnio.setVisible((this.isVisibilidadCeldaModificarAnio && this.isPermisoActualizarAnio));	
			this.jInternalFrameDetalleFormAnio.jMenuItemActualizarAnio.setVisible((this.isVisibilidadCeldaActualizarAnio && this.isPermisoActualizarAnio));	
			this.jInternalFrameDetalleFormAnio.jMenuItemEliminarAnio.setVisible((this.isVisibilidadCeldaEliminarAnio && this.isPermisoEliminarAnio));
			this.jInternalFrameDetalleFormAnio.jMenuItemCancelarAnio.setVisible(this.isVisibilidadCeldaCancelarAnio);				
			}
			
			this.jMenuItemGuardarCambiosAnio.setVisible((this.isVisibilidadCeldaGuardarAnio && this.isPermisoGuardarCambiosAnio));						
			this.jMenuItemGuardarCambiosTablaAnio.setVisible((this.isVisibilidadCeldaGuardarCambiosAnio && this.isPermisoGuardarCambiosAnio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAnio=this.jButtonNuevoAnio.isVisible();
			this.isVisibilidadCeldaDuplicarAnio=this.jButtonDuplicarAnio.isVisible();
			this.isVisibilidadCeldaCopiarAnio=this.jButtonCopiarAnio.isVisible();
			this.isVisibilidadCeldaVerFormAnio=this.jButtonVerFormAnio.isVisible();
			
			this.isVisibilidadCeldaOrdenAnio=this.jButtonAbrirOrderByAnio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAnio=this.jButtonNuevoRelacionesAnio.isVisible();
			this.isVisibilidadCeldaModificarAnio=this.jButtonModificarAnio.isVisible();
			
			if(this.jInternalFrameDetalleFormAnio!=null) {
			this.isVisibilidadCeldaActualizarAnio=this.jInternalFrameDetalleFormAnio.jButtonActualizarAnio.isVisible();
			this.isVisibilidadCeldaEliminarAnio=this.jInternalFrameDetalleFormAnio.jButtonEliminarAnio.isVisible();
			this.isVisibilidadCeldaCancelarAnio=this.jInternalFrameDetalleFormAnio.jButtonCancelarAnio.isVisible();
			this.isVisibilidadCeldaGuardarAnio=this.jInternalFrameDetalleFormAnio.jButtonGuardarCambiosAnio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAnio=this.jButtonGuardarCambiosTablaAnio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAnio=this.jButtonNuevoToolBarAnio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAnio=this.jButtonNuevoRelacionesToolBarAnio.isVisible();
			
			if(this.jInternalFrameDetalleFormAnio!=null) {
			this.isVisibilidadCeldaModificarAnio=this.jInternalFrameDetalleFormAnio.jButtonModificarToolBarAnio.isVisible();
			this.isVisibilidadCeldaActualizarAnio=this.jInternalFrameDetalleFormAnio.jButtonActualizarToolBarAnio.isVisible();
			this.isVisibilidadCeldaEliminarAnio=this.jInternalFrameDetalleFormAnio.jButtonEliminarToolBarAnio.isVisible();
			this.isVisibilidadCeldaCancelarAnio=this.jInternalFrameDetalleFormAnio.jButtonCancelarToolBarAnio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAnio=this.jButtonGuardarCambiosToolBarAnio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAnio=this.jButtonGuardarCambiosTablaToolBarAnio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAnio=this.jMenuItemNuevoAnio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAnio=this.jMenuItemNuevoRelacionesAnio.isVisible();
			
			if(this.jInternalFrameDetalleFormAnio!=null) {
			this.isVisibilidadCeldaModificarAnio=this.jInternalFrameDetalleFormAnio.jMenuItemModificarAnio.isVisible();
			this.isVisibilidadCeldaActualizarAnio=this.jInternalFrameDetalleFormAnio.jMenuItemActualizarAnio.isVisible();
			this.isVisibilidadCeldaEliminarAnio=this.jInternalFrameDetalleFormAnio.jMenuItemEliminarAnio.isVisible();
			this.isVisibilidadCeldaCancelarAnio=this.jInternalFrameDetalleFormAnio.jMenuItemCancelarAnio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAnio=this.jMenuItemGuardarCambiosAnio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAnio=this.jMenuItemGuardarCambiosTablaAnio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAnio(Boolean esInicializar) {
		if(AnioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.anioSessionBean.getConGuardarRelaciones()) {
				//if(this.anioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAnio();
			}
			
			this.inicializarActualizarBindingBotonesManualAnio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAnio() {
		this.jButtonNuevoAnio.setVisible(this.isPermisoNuevoAnio);			
		this.jButtonDuplicarAnio.setVisible(this.isPermisoDuplicarAnio);			
		this.jButtonCopiarAnio.setVisible(this.isPermisoCopiarAnio);			
		this.jButtonVerFormAnio.setVisible(this.isPermisoVerFormAnio);			
		
		this.jButtonAbrirOrderByAnio.setVisible(this.isPermisoOrdenAnio);					
		
		this.jButtonNuevoRelacionesAnio.setVisible(this.isPermisoNuevoAnio);			
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.jButtonModificarAnio.setVisible(this.isPermisoActualizarAnio);	
			this.jInternalFrameDetalleFormAnio.jButtonActualizarAnio.setVisible(this.isPermisoActualizarAnio);	
			this.jInternalFrameDetalleFormAnio.jButtonEliminarAnio.setVisible(this.isPermisoEliminarAnio);
			this.jInternalFrameDetalleFormAnio.jButtonCancelarAnio.setVisible(this.isVisibilidadCeldaCancelarAnio);						
			this.jInternalFrameDetalleFormAnio.jButtonGuardarCambiosAnio.setVisible(this.isPermisoGuardarCambiosAnio);							
		}
		
		this.jButtonGuardarCambiosTablaAnio.setVisible(this.isPermisoActualizarAnio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAnio() {
		this.jInternalFrameDetalleFormAnio.jButtonModificarAnio.setVisible(this.isPermisoActualizarAnio);	
		this.jInternalFrameDetalleFormAnio.jButtonActualizarAnio.setVisible(this.isPermisoActualizarAnio);	
		this.jInternalFrameDetalleFormAnio.jButtonEliminarAnio.setVisible(this.isPermisoEliminarAnio);
		this.jInternalFrameDetalleFormAnio.jButtonCancelarAnio.setVisible(this.isVisibilidadCeldaCancelarAnio);							
		this.jInternalFrameDetalleFormAnio.jButtonGuardarCambiosAnio.setVisible((this.isVisibilidadCeldaGuardarAnio && this.isPermisoGuardarCambiosAnio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAnio() {
		if(AnioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAnio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAnio() {
	}
	
	public void jTableDatosAnioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAnio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAnioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnio(this.getanio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnio(this.anio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anio =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anio =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anio==null) {
						this.anio = new Anio();
					}

					this.setVariablesFormularioToObjetoActualAnio(this.anio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnio(this.anio);
				}

				if(this.anio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.anio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreAnioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnio(this.getanio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnio(this.anio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anio =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anio =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anio==null) {
						this.anio = new Anio();
					}

					this.setVariablesFormularioToObjetoActualAnio(this.anio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnio(this.anio);
				}

				if(this.anio.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.anio.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorAnioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAnio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAnio(this.getanio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnio(this.anio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anio =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.anio =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.anio==null) {
						this.anio = new Anio();
					}

					this.setVariablesFormularioToObjetoActualAnio(this.anio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAnio(this.anio);
				}

				if(this.anio.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.anio.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAnio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameAnio() {
		if(this.jInternalFrameDetalleFormAnio!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormAnio!=null) {
			this.jInternalFrameDetalleFormAnio.setVisible(false);	    			
			this.jInternalFrameDetalleFormAnio.dispose();
			this.jInternalFrameDetalleFormAnio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAnio!=null) {
			this.jInternalFrameReporteDinamicoAnio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAnio.dispose();
			this.jInternalFrameReporteDinamicoAnio=null;
		}
		
		if(this.jInternalFrameImportacionAnio!=null) {
			this.jInternalFrameImportacionAnio.setVisible(false);	    			
			this.jInternalFrameImportacionAnio.dispose();
			this.jInternalFrameImportacionAnio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAnio();
			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			
			
			if(sTipo.equals("NuevoAnio")) {
				jButtonNuevoAnioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAnio")) {
				jButtonDuplicarAnioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAnio")) {
				jButtonCopiarAnioActionPerformed(evt);
			} else if(sTipo.equals("VerFormAnio")) {
				jButtonVerFormAnioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAnio")) {
				jButtonNuevoAnioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAnio")) {
				jButtonDuplicarAnioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAnio")) {
				jButtonNuevoAnioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAnio")) {
				jButtonDuplicarAnioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAnio")) {
				jButtonNuevoAnioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAnio")) {
				jButtonNuevoAnioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAnio")) {
				jButtonNuevoAnioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAnio")) {
				jButtonModificarAnioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAnio")) {
				jButtonModificarAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAnio")) {
				jButtonModificarAnioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAnio")) {
				jButtonActualizarAnioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAnio")) {
				jButtonActualizarAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAnio")) {
				jButtonActualizarAnioActionPerformed(evt);
			} else if(sTipo.equals("EliminarAnio")) {
				jButtonEliminarAnioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAnio")) {
				jButtonEliminarAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAnio")) {
				jButtonEliminarAnioActionPerformed(evt);
			} else if(sTipo.equals("CancelarAnio")) {
				jButtonCancelarAnioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAnio")) {
				jButtonCancelarAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAnio")) {
				jButtonCancelarAnioActionPerformed(evt);
			} else if(sTipo.equals("CerrarAnio")) {
				jButtonCerrarAnioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAnio")) {
				jButtonCerrarAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAnio")) {
				jButtonCerrarAnioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAnio")) {
				jButtonMostrarOcultarAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAnio")) {
				jButtonCancelarAnioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAnio")) {
				jButtonGuardarCambiosAnioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAnio")) {
				jButtonGuardarCambiosAnioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAnio")) {
				jButtonCopiarAnioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAnio")) {
				jButtonVerFormAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAnio")) {
				jButtonGuardarCambiosAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAnio")) {
				jButtonCopiarAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAnio")) {
				jButtonVerFormAnioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAnio")) {
				jButtonGuardarCambiosAnioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAnio")) {
				jButtonGuardarCambiosAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAnio")) {
				jButtonGuardarCambiosAnioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAnio")) {
				jButtonRecargarInformacionAnioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAnio")) {
				jButtonRecargarInformacionAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAnio")) {
				jButtonRecargarInformacionAnioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAnio")) {
				jButtonAnterioresAnioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAnio")) {
				jButtonAnterioresAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAnio")) {
				jButtonAnterioresAnioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAnio")) {
				jButtonSiguientesAnioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAnio")) {
				jButtonSiguientesAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAnio")) {
				jButtonSiguientesAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAnio") || sTipo.equals("MenuItemDetalleAbrirOrderByAnio")) {
				jButtonAbrirOrderByAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAnio") || sTipo.equals("MenuItemDetalleMostrarOcultarAnio")) {
				jButtonMostrarOcultarAnioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAnio")) {
				jButtonNuevoGuardarCambiosAnioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAnio")) {
				jButtonNuevoGuardarCambiosAnioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAnio")) {
				jButtonNuevoGuardarCambiosAnioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAnio")) {
				jButtonCerrarReporteDinamicoAnioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAnio")) {
				jButtonGenerarReporteDinamicoAnioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAnio")) {
				
				jButtonGenerarExcelReporteDinamicoAnioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAnio")) {
				jButtonCerrarImportacionAnioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAnio")) {
				
				jButtonGenerarImportacionAnioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAnio")) {
				
				jButtonAbrirImportacionAnioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAnio")) {
				jComboBoxTiposAccionesAnioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAnio")) {
				jComboBoxTiposRelacionesAnioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAnio")) {
				jComboBoxTiposAccionesAnioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAnio")) {
				
				jComboBoxTiposSeleccionarAnioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAnio")) {
				jTextFieldValorCampoGeneralAnioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAnio")) {
				jButtonAbrirOrderByAnioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAnio")) {
				jButtonAbrirOrderByAnioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAnio")) {
				jButtonCerrarOrderByAnioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAnioBusqueda")) {
				this.jButtonidAnioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAnioBusqueda")) {
				this.jButtonnombreAnioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorAnioBusqueda")) {
				this.jButtonvalorAnioBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAnio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				


				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Anio anioLocal=null;
			
			if(!this.getEsControlTabla()) {
				anioLocal=this.anio;
			} else {
				anioLocal=this.anioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
							
				
				


				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioAnterior =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anioAnterior =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
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
			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			
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
			
			


			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
								
						
				


				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
								
				
				


				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioAnterior =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anioAnterior =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioAnterior =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anioAnterior =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
							
				
				


				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAnio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anioAnterior =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.anioAnterior =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
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
			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			
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
			
			


			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
								
				
				


				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioAnterior =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anioAnterior =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAnio")) {
					jCheckBoxSeleccionarTodosAnioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAnio")) {
					jCheckBoxSeleccionadosAnioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAnio")) {
					
				}
				
				


				
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
												
				
				


				
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAnio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.anioAnterior =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.anioAnterior =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
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
			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
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
			
			


			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAnioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.anio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.anio);
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
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
				
				


				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Anio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Anio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAnioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAnio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.anioAnterior =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.anioAnterior =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAnio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAnioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAnio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.anio =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.anio =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.anio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAnio")) {
				
				}
				
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAnio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAnio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAnio")) {
			
			}
			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAnio();
			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			
			if(sTipo.equals("NuevoAnio")) {
				jButtonNuevoAnioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAnio")) {
				jButtonDuplicarAnioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAnio")) {
				jButtonCopiarAnioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAnio")) {
				jButtonVerFormAnioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAnio")) {
				jButtonNuevoAnioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAnio")) {
				jButtonModificarAnioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAnio")) {
				jButtonActualizarAnioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAnio")) {
				jButtonEliminarAnioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAnio")) {
				jButtonGuardarCambiosAnioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAnio")) {
				jButtonCancelarAnioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAnio")) {
				jButtonCerrarAnioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAnio")) {
				jButtonGuardarCambiosAnioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAnio")) {
				jButtonNuevoGuardarCambiosAnioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAnio")) {
				jButtonAbrirOrderByAnioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAnio")) {
				jButtonRecargarInformacionAnioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAnio")) {
				jButtonAnterioresAnioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAnio")) {
				jButtonSiguientesAnioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAnioBusqueda")) {
				this.jButtonidAnioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAnioBusqueda")) {
				this.jButtonnombreAnioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorAnioBusqueda")) {
				this.jButtonvalorAnioBusquedaActionPerformed(evt);
			}
			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAnio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAnio")) {
				closingInternalFrameAnio();
				
			} else if(sTipo.equals("jButtonCancelarAnio")) {
				JInternalFrameBase jInternalFrameDetalleFormAnio = (JInternalFrameBase)evt.getSource();
	            	
	            AnioBeanSwingJInternalFrame jInternalFrameParent=(AnioBeanSwingJInternalFrame)jInternalFrameDetalleFormAnio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAnioActionPerformed(null);
			}
			
			AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.anio,new Object(),this.anioParameterGeneral,this.anioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAnio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAnio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAnio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.anio)) {
			if(!esControlTabla) {
				if(AnioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAnio(this.anio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAnio(this.anio);			
				}
				
				if(this.anioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAnio(this.anio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.anioReturnGeneral=anioLogic.procesarEventosAniosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.anioLogic.getAnios(),this.anio,this.anioParameterGeneral,this.isEsNuevoAnio,classes);//this.anioLogic.getAnio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAnio(this.anioReturnGeneral,this.anioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.anioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAnio(classes,this.anioReturnGeneral,this.anioBean,false);
					}
						
					if(this.anioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAnio(this.anioReturnGeneral.getAnio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAnio(this.anioReturnGeneral.getAnio());	
					}
						
					if(this.anioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAnio(this.anioReturnGeneral.getAnio(),classes);//this.anioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAnio(this.anio,classes);//this.anioBean);									
				}
			
				if(AnioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAnio(this.anio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAnio(this.anio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.anioAnterior!=null) {
						this.anio=this.anioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.anioReturnGeneral=anioLogic.procesarEventosAniosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.anioLogic.getAnios(),this.anio,this.anioParameterGeneral,this.isEsNuevoAnio,classes);//this.anioLogic.getAnio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.anioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.anioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.anioReturnGeneral.getAnio(),anioLogic.getAnios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.anioReturnGeneral.getAnio(),this.anios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAnio.repaint();
				
				//((AbstractTableModel) this.jTableDatosAnio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAnio();
			}
		}
	}
	
	public void actualizarVisualTableDatosAnio() throws Exception {
		
		AnioModel anioModel=(AnioModel)this.jTableDatosAnio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			anioModel.anios=this.anioLogic.getAnios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			anioModel.anios=this.anios;
		}
		
		
		((AnioModel) this.jTableDatosAnio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAnio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getanioAnterior(),this.anioLogic.getAnios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getanioAnterior(),this.anios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAnio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAnio(Anio anio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
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
										
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.anio,new Object(),generalEntityParameterGeneral,this.anioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.anioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AnioConstantesFunciones.getClassesRelationshipsOfAnio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AnioConstantesFunciones.getClassesRelationshipsFromStringsOfAnio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAnio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AnioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.anio,new Object(),generalEntityParameterGeneral,this.anioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AnioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAnio(AnioBean anioBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAnio(ArrayList<Classe> classes,AnioReturnGeneral anioReturnGeneral,AnioBean anioBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAnio(Anio anio,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.anio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAnio = new AnioDetalleFormJInternalFrame(jDesktopPane,this.anioSessionBean.getConGuardarRelaciones(),this.anioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAnio);
		this.jInternalFrameDetalleFormAnio.setVisible(false);
		this.jInternalFrameDetalleFormAnio.setSelected(false);						
		
		this.jInternalFrameDetalleFormAnio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAnio.anioLogic=this.anioLogic;
		
		this.cargarCombosFrameForeignKeyAnio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAnio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAnio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAnio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAnio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAnio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAnio"));
		
		this.jInternalFrameDetalleFormAnio.jButtonModificarAnio.addActionListener(new ButtonActionListener(this,"ModificarAnio"));

		
		this.jInternalFrameDetalleFormAnio.jButtonModificarToolBarAnio.addActionListener(new ButtonActionListener(this,"ModificarToolBarAnio"));
					
		this.jInternalFrameDetalleFormAnio.jMenuItemModificarAnio.addActionListener(new ButtonActionListener(this,"MenuItemModificarAnio"));		
		
		
		
		this.jInternalFrameDetalleFormAnio.jButtonActualizarAnio.addActionListener (new ButtonActionListener(this,"ActualizarAnio"));
		
		
		this.jInternalFrameDetalleFormAnio.jButtonActualizarToolBarAnio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAnio"));
						
		this.jInternalFrameDetalleFormAnio.jMenuItemActualizarAnio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAnio"));		
		
		
		
		this.jInternalFrameDetalleFormAnio.jButtonEliminarAnio.addActionListener (new ButtonActionListener(this,"EliminarAnio"));
		
		
		this.jInternalFrameDetalleFormAnio.jButtonEliminarToolBarAnio.addActionListener (new ButtonActionListener(this,"EliminarToolBarAnio"));
								
		this.jInternalFrameDetalleFormAnio.jMenuItemEliminarAnio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAnio"));		
		
		
		
		this.jInternalFrameDetalleFormAnio.jButtonCancelarAnio.addActionListener (new ButtonActionListener(this,"CancelarAnio"));
		
		
		this.jInternalFrameDetalleFormAnio.jButtonCancelarToolBarAnio.addActionListener (new ButtonActionListener(this,"CancelarToolBarAnio"));
					
		this.jInternalFrameDetalleFormAnio.jMenuItemCancelarAnio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAnio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAnio.jMenuItemDetalleCerrarAnio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAnio"));		
		
		
		
		this.jInternalFrameDetalleFormAnio.jButtonGuardarCambiosToolBarAnio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAnio"));
		
		
		
		this.jInternalFrameDetalleFormAnio.jButtonGuardarCambiosToolBarAnio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAnio"));
		
		
		
		this.jInternalFrameDetalleFormAnio.jComboBoxTiposAccionesFormularioAnio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAnio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnio.jButtonidAnioBusqueda.addActionListener(new ButtonActionListener(this,"idAnioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnio.jButtonnombreAnioBusqueda.addActionListener(new ButtonActionListener(this,"nombreAnioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnio.jButtonvalorAnioBusqueda.addActionListener(new ButtonActionListener(this,"valorAnioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAnio.jTabbedPaneRelacionesAnio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAnio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAnio"));
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAnio"));
		}
		
		this.jTableDatosAnio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAnio"));
		
		this.jTableDatosAnio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAnio"));
		
		this.jButtonNuevoAnio.addActionListener(new ButtonActionListener(this,"NuevoAnio"));
		
		this.jButtonDuplicarAnio.addActionListener(new ButtonActionListener(this,"DuplicarAnio"));
		
		this.jButtonCopiarAnio.addActionListener(new ButtonActionListener(this,"CopiarAnio"));
		
		this.jButtonVerFormAnio.addActionListener(new ButtonActionListener(this,"VerFormAnio"));
		
		
		this.jButtonNuevoToolBarAnio.addActionListener(new ButtonActionListener(this,"NuevoToolBarAnio"));
			
		this.jButtonDuplicarToolBarAnio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAnio"));
			
		this.jMenuItemNuevoAnio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAnio"));
			
		this.jMenuItemDuplicarAnio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAnio"));		
		
		
		this.jButtonNuevoRelacionesAnio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAnio"));
		
		
		this.jButtonNuevoRelacionesToolBarAnio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAnio"));
			
		this.jMenuItemNuevoRelacionesAnio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAnio"));		
		
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.jButtonModificarAnio.addActionListener(new ButtonActionListener(this,"ModificarAnio"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.jButtonModificarToolBarAnio.addActionListener(new ButtonActionListener(this,"ModificarToolBarAnio"));
			
			this.jInternalFrameDetalleFormAnio.jMenuItemModificarAnio.addActionListener(new ButtonActionListener(this,"MenuItemModificarAnio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAnio.jButtonActualizarAnio.addActionListener (new ButtonActionListener(this,"ActualizarAnio"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.jButtonActualizarToolBarAnio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAnio"));
				
			this.jInternalFrameDetalleFormAnio.jMenuItemActualizarAnio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAnio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.jButtonEliminarAnio.addActionListener (new ButtonActionListener(this,"EliminarAnio"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.jButtonEliminarToolBarAnio.addActionListener (new ButtonActionListener(this,"EliminarToolBarAnio"));
						
			this.jInternalFrameDetalleFormAnio.jMenuItemEliminarAnio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAnio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.jButtonCancelarAnio.addActionListener (new ButtonActionListener(this,"CancelarAnio"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.jButtonCancelarToolBarAnio.addActionListener (new ButtonActionListener(this,"CancelarToolBarAnio"));
			
			this.jInternalFrameDetalleFormAnio.jMenuItemCancelarAnio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAnio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAnio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAnio"));		
		
		
		this.jButtonCerrarAnio.addActionListener (new ButtonActionListener(this,"CerrarAnio"));
		
		
		this.jButtonCerrarToolBarAnio.addActionListener (new ButtonActionListener(this,"CerrarToolBarAnio"));
			
		this.jMenuItemCerrarAnio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAnio"));
			
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.jMenuItemDetalleCerrarAnio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAnio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.jButtonGuardarCambiosAnio.addActionListener (new ButtonActionListener(this,"GuardarCambiosAnio"));
		}
		
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.jButtonGuardarCambiosToolBarAnio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAnio"));
		}
		
		this.jButtonCopiarToolBarAnio.addActionListener (new ButtonActionListener(this,"CopiarToolBarAnio"));
			
		this.jButtonVerFormToolBarAnio.addActionListener (new ButtonActionListener(this,"VerFormToolBarAnio"));
		
		this.jMenuItemGuardarCambiosAnio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAnio"));
			
		this.jMenuItemCopiarAnio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAnio"));		
		
		this.jMenuItemVerFormAnio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAnio"));		
		
		
		this.jButtonGuardarCambiosTablaAnio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAnio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAnio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAnio"));
			
		this.jMenuItemGuardarCambiosTablaAnio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAnio"));		
		
		
		
		this.jButtonRecargarInformacionAnio.addActionListener (new ButtonActionListener(this,"RecargarInformacionAnio"));
					
		this.jButtonRecargarInformacionToolBarAnio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAnio"));
		
		this.jMenuItemRecargarInformacionAnio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAnio"));		
		
		
		
		this.jButtonAnterioresAnio.addActionListener (new ButtonActionListener(this,"AnterioresAnio"));
		
		
		this.jButtonAnterioresToolBarAnio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAnio"));
		
		this.jMenuItemAnterioresAnio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAnio"));		
		
		
		this.jButtonSiguientesAnio.addActionListener (new ButtonActionListener(this,"SiguientesAnio"));
		
		
		this.jButtonSiguientesToolBarAnio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAnio"));
			
		this.jMenuItemSiguientesAnio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAnio"));
			
		this.jMenuItemAbrirOrderByAnio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAnio"));
			
		this.jMenuItemMostrarOcultarAnio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAnio"));
			
		this.jMenuItemDetalleAbrirOrderByAnio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAnio"));
			
		this.jMenuItemDetalleMostarOcultarAnio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAnio"));		
		
		
		this.jButtonNuevoGuardarCambiosAnio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAnio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAnio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAnio"));
			
		this.jMenuItemNuevoGuardarCambiosAnio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAnio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAnio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAnio"));

		this.jCheckBoxSeleccionadosAnio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAnio"));
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.jComboBoxTiposAccionesFormularioAnio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAnio"));
		}
		
		
		this.jComboBoxTiposRelacionesAnio.addActionListener (new ButtonActionListener(this,"TiposRelacionesAnio"));
			
		this.jComboBoxTiposAccionesAnio.addActionListener (new ButtonActionListener(this,"TiposAccionesAnio"));
					
		this.jComboBoxTiposSeleccionarAnio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAnio"));
			
		this.jTextFieldValorCampoGeneralAnio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAnio"));		
		
		
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnio.jButtonidAnioBusqueda.addActionListener(new ButtonActionListener(this,"idAnioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnio.jButtonnombreAnioBusqueda.addActionListener(new ButtonActionListener(this,"nombreAnioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnio.jButtonvalorAnioBusqueda.addActionListener(new ButtonActionListener(this,"valorAnioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAnio!=null) {
				this.jInternalFrameReporteDinamicoAnio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAnio"));
				this.jInternalFrameReporteDinamicoAnio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAnio"));
				this.jInternalFrameReporteDinamicoAnio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAnio"));
			}
			
			//this.jButtonCerrarReporteDinamicoAnio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAnio"));				
			//this.jButtonGenerarReporteDinamicoAnio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAnio"));
			//this.jButtonGenerarExcelReporteDinamicoAnio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAnio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAnio!=null) {
				this.jInternalFrameImportacionAnio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAnio"));
				this.jInternalFrameImportacionAnio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAnio"));
				this.jInternalFrameImportacionAnio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAnio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAnio.addActionListener (new ButtonActionListener(this,"AbrirOrderByAnio"));
			
			this.jButtonAbrirOrderByToolBarAnio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAnio"));			
			
			if(this.jInternalFrameOrderByAnio!=null) {
				this.jInternalFrameOrderByAnio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAnio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAnio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAnio.jTabbedPaneRelacionesAnio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAnio"));
		
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
            		closingInternalFrameAnio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAnio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAnio = (JInternalFrameBase)event.getSource();
	            	
	            AnioBeanSwingJInternalFrame jInternalFrameParent=(AnioBeanSwingJInternalFrame)jInternalFrameDetalleFormAnio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAnioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAnio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAnioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAnio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAnio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAnio";
		inputMap = this.jButtonNuevoAnio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAnio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAnioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAnioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAnio";
		inputMap = this.jButtonNuevoRelacionesAnio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAnio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAnioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAnio";
		inputMap = this.jButtonModificarAnio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAnio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAnioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAnio";
		inputMap = this.jButtonActualizarAnio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAnio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAnioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAnio";
		inputMap = this.jButtonEliminarAnio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAnio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAnioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAnio";
		inputMap = this.jButtonCancelarAnio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAnio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAnioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAnio";
		inputMap = this.jButtonCerrarAnio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAnio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAnioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAnio.jButtonGuardarCambiosAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAnio";
		inputMap = this.jInternalFrameDetalleFormAnio.jButtonGuardarCambiosAnio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAnio.jButtonGuardarCambiosAnio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAnioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAnio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAnioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAnio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAnioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAnio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAnioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAnio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAnioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnio.jButtonidAnioBusqueda.addActionListener(new ButtonActionListener(this,"idAnioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnio.jButtonnombreAnioBusqueda.addActionListener(new ButtonActionListener(this,"nombreAnioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAnio.jButtonvalorAnioBusqueda.addActionListener(new ButtonActionListener(this,"valorAnioBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAnio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAnioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAnioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAnio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAnio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Anio anioAux:this.anioLogic.getAnios()) {
					anioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Anio anioAux:anios) {
					anioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAnioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAnio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Anio anioAux:this.anioLogic.getAnios()) {
						anioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Anio anioAux:anios) {
						anioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Anio anioAux:this.anioLogic.getAnios()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Anio anioAux:anios) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAnio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAnio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAnio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAnio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAnioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAnio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAnio.getSelectedRows();
			
			Anio anioLocal=new Anio();
			
			//this.seleccionarTodosAnio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLocal =(Anio) this.anioLogic.getAnios().toArray()[this.jTableDatosAnio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					anioLocal =(Anio) this.anios.toArray()[this.jTableDatosAnio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				anioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Anio anioAux:this.anioLogic.getAnios()) {
						anioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Anio anioAux:anios) {
						anioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAnio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAnio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAnio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAnio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAnioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAnioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAnioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAnio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAnio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Anio anioAux:this.anioLogic.getAnios()) {
				
						if(sTipoSeleccionar.equals(AnioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							anioAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnioConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							anioAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Anio anioAux:anios) {
					
						if(sTipoSeleccionar.equals(AnioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							anioAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AnioConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							anioAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAnio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAnioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAnio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAnio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAnio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAnio.jComboBoxTiposAccionesFormularioAnio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAnio) {				
					conSplash=true;//false;										
					
					//this.startProcessAnio(conSplash);
				
					this.generarReporteAniosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAnio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAnio.jComboBoxTiposAccionesFormularioAnio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAniosSeleccionados();
				//this.jComboBoxTiposAccionesAnio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAniosSeleccionados(false);
				//this.jComboBoxTiposAccionesAnio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAniosSeleccionados(true);
				//this.jComboBoxTiposAccionesAnio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAnio();
				
				this.exportarAniosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAnio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAnio.jComboBoxTiposAccionesFormularioAnio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAnios();
				//this.importarAnios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAnio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAnio.jComboBoxTiposAccionesFormularioAnio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAnio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAniosSeleccionados();
				//this.jComboBoxTiposAccionesAnio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Anio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAnio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAnio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAnio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Anio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAnio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAnio.jComboBoxTiposAccionesFormularioAnio.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAnio();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAnio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAnioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAnio();
			
			if(this.jInternalFrameDetalleFormAnio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();		
			Anio anio=new Anio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAnio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAnio.getSelectedItem();
			
			
			
			
			aniosSeleccionados=this.getAniosSeleccionados(true);
			//this.sTipoAccion;
			
			if(aniosSeleccionados.size()==1) {
				for(Anio anioAux:aniosSeleccionados) {
					anio=anioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAnio();
			
      		//this.finishProcessAnio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAnioReturnGeneral() throws Exception {
		if(this.anioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.anioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.anioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.anioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.anioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.anioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAnio(false);
		}
		
		if(this.anioReturnGeneral.getConRetornoLista() || this.anioReturnGeneral.getConRetornoObjeto()) {
			if(this.anioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.anioLogic.setAnios(this.anioReturnGeneral.getAnios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.anioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.anioLogic.setAnio(this.anioReturnGeneral.getAnio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAnio(false);
		}
	}
	
	public void actualizarParametrosGeneralAnio() throws Exception {
		
		
	}
	
	public ArrayList<Anio> getAniosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAnio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Anio anioAux:anioLogic.getAnios()) {
					if(anioAux.getIsSelected()) {
						aniosSeleccionados.add(anioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Anio anioAux:this.anios) {
					if(anioAux.getIsSelected()) {
						aniosSeleccionados.add(anioAux);				
					}
				}
			}
			
			if(aniosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						aniosSeleccionados.addAll(this.anioLogic.getAnios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						aniosSeleccionados.addAll(this.anios);				
					}
				}
			}
		} else {
			aniosSeleccionados.add(this.anio);
		}
		
		return aniosSeleccionados;
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
	
	public void generarReporteAniosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAniosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAniosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAniosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAniosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Anio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAniosSeleccionados() throws Exception {
		ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();		
		
		aniosSeleccionados=this.getAniosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAnios("Todos",aniosSeleccionados);
		
	}	
	
	public void generarReporteNormalAniosSeleccionados() throws Exception {
		ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();		
		
		aniosSeleccionados=this.getAniosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAnios("Todos",aniosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAniosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();
		
		aniosSeleccionados=this.getAniosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAnios("Todos",aniosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAniosSeleccionados() throws Exception {
		ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAnio();
		
		
		aniosSeleccionados=this.getAniosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAnio();
		
		
		//this.generarReporteAnios("Todos",aniosSeleccionados ,anioImplementable,anioImplementableHome);
	}
	
	public void mostrarImportacionAnios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAnio();
		
		this.abrirFrameImportacionAnio();		
		
			
		//this.generarReporteAnios("Todos",aniosSeleccionados ,anioImplementable,anioImplementableHome);
	}
	
	public void importarAnios() throws Exception {		
	
	}
	
	public void exportarAniosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAniosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAniosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAniosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Anio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAniosSeleccionados() throws Exception {
		ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();		
		
		aniosSeleccionados=this.getAniosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAnio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Anio anioAux:aniosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAnio(anioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//anioAux.setsDetalleGeneralEntityReporte(anioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAnio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AnioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnioConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AnioConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAnio(Anio anio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=anio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=anio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=anio.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=anio.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAniosSeleccionados() throws Exception {
		ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();		
		
		aniosSeleccionados=this.getAniosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Anios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAnio(row);				
				iRow++;
			}				
			
			for(Anio anioAux:aniosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAnio(anioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAniosSeleccionados() throws Exception {
		ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();		
		
		aniosSeleccionados=this.getAniosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"anio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("anios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("anio");
			//elementRoot.appendChild(element);
		
			for(Anio anioAux:aniosSeleccionados) {
				element = document.createElement("anio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAnio(anioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.anioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Anio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAnio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AnioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AnioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AnioConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(AnioConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAnio(Anio anio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(anio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(anio.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(anio.getvalor());				
	}
	
	public void setFilaDatosExportarXmlAnio(Anio anio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AnioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(anio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AnioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(anio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(AnioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(anio.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementvalor = document.createElement(AnioConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(anio.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoAniosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Anio> aniosSeleccionados=new ArrayList<Anio>();
		
		aniosSeleccionados=this.getAniosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAnio(aniosSeleccionados);
		
		this.generarReporteAnios("Todos",aniosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAnio(ArrayList<Anio> aniosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Anio anioAux:aniosSeleccionados) {
				anioAux.setsDetalleGeneralEntityReporte(anioAux.toString());
			
				if(sTipoSeleccionar.equals(AnioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					anioAux.setsDescripcionGeneralEntityReporte1(anioAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AnioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAnio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAnio=true;
				this.isVisibilidadCeldaNuevoRelacionesAnio=true;
				this.isVisibilidadCeldaGuardarCambiosAnio=true;
			}
			
			this.isVisibilidadCeldaModificarAnio=false;
			this.isVisibilidadCeldaActualizarAnio=false;
			this.isVisibilidadCeldaEliminarAnio=false;
			this.isVisibilidadCeldaCancelarAnio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnio=true;
				} else {
					this.isVisibilidadCeldaGuardarAnio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAnio=false;
			this.isVisibilidadCeldaNuevoRelacionesAnio=false;
			this.isVisibilidadCeldaGuardarCambiosAnio=false;
			this.isVisibilidadCeldaModificarAnio=false;
			this.isVisibilidadCeldaActualizarAnio=true;
			this.isVisibilidadCeldaEliminarAnio=false;
			this.isVisibilidadCeldaCancelarAnio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnio=true;
				} else {
					this.isVisibilidadCeldaGuardarAnio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAnio=false;
			this.isVisibilidadCeldaNuevoRelacionesAnio=false;
			this.isVisibilidadCeldaGuardarCambiosAnio=false;
			this.isVisibilidadCeldaModificarAnio=false;
			this.isVisibilidadCeldaActualizarAnio=true;
			this.isVisibilidadCeldaEliminarAnio=true;
			this.isVisibilidadCeldaCancelarAnio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnio=true;
				} else {
					this.isVisibilidadCeldaGuardarAnio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAnio=false;
			this.isVisibilidadCeldaNuevoRelacionesAnio=false;
			this.isVisibilidadCeldaGuardarCambiosAnio=false;
			this.isVisibilidadCeldaModificarAnio=false;
			this.isVisibilidadCeldaActualizarAnio=true;
			this.isVisibilidadCeldaEliminarAnio=false;
			this.isVisibilidadCeldaCancelarAnio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnio=false;
				} else {
					this.isVisibilidadCeldaGuardarAnio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAnio=true;
			this.isVisibilidadCeldaNuevoRelacionesAnio=true;
			this.isVisibilidadCeldaGuardarCambiosAnio=true;
			this.isVisibilidadCeldaModificarAnio=false;
			this.isVisibilidadCeldaActualizarAnio=false;
			this.isVisibilidadCeldaEliminarAnio=false;
			this.isVisibilidadCeldaCancelarAnio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnio=true;
				} else {
					this.isVisibilidadCeldaGuardarAnio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAnio=false;
			this.isVisibilidadCeldaNuevoRelacionesAnio=false;
			this.isVisibilidadCeldaGuardarCambiosAnio=false;
			this.isVisibilidadCeldaActualizarAnio=false;
			this.isVisibilidadCeldaEliminarAnio=false;
			this.isVisibilidadCeldaCancelarAnio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnio=false;
				} else {
					this.isVisibilidadCeldaGuardarAnio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAnio=false;
			this.isVisibilidadCeldaNuevoRelacionesAnio=false;
			this.isVisibilidadCeldaGuardarCambiosAnio=false;
			this.isVisibilidadCeldaModificarAnio=true;
			this.isVisibilidadCeldaActualizarAnio=false;
			this.isVisibilidadCeldaEliminarAnio=false;
			this.isVisibilidadCeldaCancelarAnio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAnio=false;
				} else {
					this.isVisibilidadCeldaGuardarAnio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AnioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAnio=true;
			this.isVisibilidadCeldaNuevoRelacionesAnio=true;
			this.isVisibilidadCeldaGuardarCambiosAnio=true;
		} else {
			this.actualizarEstadoPanelsAnio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAnio=false;
			//this.isVisibilidadCeldaVerFormAnio=false;
			this.isVisibilidadCeldaDuplicarAnio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!anioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAnio=false;
		} else {
			this.isVisibilidadCeldaNuevoAnio=false;
			this.isVisibilidadCeldaGuardarCambiosAnio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(anioSessionBean.getEsGuardarRelacionado()) {
			if(!anioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAnio=false;												
			}
			
			this.jButtonCerrarAnio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAnio=false;
		}
		
		if(!this.permiteMantenimiento(this.anio)) {
			this.isVisibilidadCeldaActualizarAnio=false;
			this.isVisibilidadCeldaEliminarAnio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAnio() {
	}
	
	public void actualizarEstadoPanelsAnio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAnio!=null) {
				this.jScrollPanelDatosEdicionAnio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAnio!=null) {
				this.jScrollPanelDatosAnio.setVisible(true);
			}
			
			if(this.jPanelPaginacionAnio!=null) {
				this.jPanelPaginacionAnio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAnio!=null) {
				this.jPanelParametrosReportesAnio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAnio!=null) {
				this.jScrollPanelDatosEdicionAnio.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosAnio!=null) {
				this.jScrollPanelDatosAnio.setVisible(false);
			}
			
			if(this.jPanelPaginacionAnio!=null) {
				this.jPanelPaginacionAnio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAnio!=null) {
				this.jPanelParametrosReportesAnio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAnio!=null) {
				this.jScrollPanelDatosEdicionAnio.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosAnio!=null) {
				this.jScrollPanelDatosAnio.setVisible(false);
			}
			
			if(this.jPanelPaginacionAnio!=null) {
				this.jPanelPaginacionAnio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAnio!=null) {
				this.jPanelParametrosReportesAnio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAnio!=null) {
				this.jScrollPanelDatosEdicionAnio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAnio!=null) {
				this.jScrollPanelDatosAnio.setVisible(false);
			}
			
			if(this.jPanelPaginacionAnio!=null) {
				this.jPanelPaginacionAnio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAnio!=null) {
				this.jPanelParametrosReportesAnio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAnio!=null) {
				this.jScrollPanelDatosEdicionAnio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAnio!=null) {
				this.jScrollPanelDatosAnio.setVisible(true);
			}
			
			if(this.jPanelPaginacionAnio!=null) {
				this.jPanelPaginacionAnio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAnio!=null) {
				this.jPanelParametrosReportesAnio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAnio!=null) {
				this.jScrollPanelDatosEdicionAnio.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosAnio!=null) {
				this.jScrollPanelDatosAnio.setVisible(true);
			}
			
			if(this.jPanelPaginacionAnio!=null) {
				this.jPanelPaginacionAnio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAnio!=null) {
				this.jPanelParametrosReportesAnio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAnio!=null) {
				this.jScrollPanelDatosEdicionAnio.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosAnio!=null) {
				this.jScrollPanelDatosAnio.setVisible(true);
			}
			
			if(this.jPanelPaginacionAnio!=null) {
				this.jPanelPaginacionAnio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAnio!=null) {
				this.jPanelParametrosReportesAnio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.anioSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.anioSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AnioSessionBean anioSessionBean=new AnioSessionBean();
		
		if(this.anioSessionBean==null) {
			this.anioSessionBean=new AnioSessionBean();
		}
		
		this.anioSessionBean.setsUltimaBusquedaAnio(this.getsAccionBusqueda());
		this.anioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.anioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AnioSessionBean anioSessionBean=new AnioSessionBean();
		
		if(this.anioSessionBean==null) {
			this.anioSessionBean=new AnioSessionBean();
		}
		
		if(this.anioSessionBean.getsUltimaBusquedaAnio()!=null&&!this.anioSessionBean.getsUltimaBusquedaAnio().equals("")) {
			this.setsAccionBusqueda(anioSessionBean.getsUltimaBusquedaAnio());
			this.setiNumeroPaginacion(anioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(anioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.anioSessionBean.setsUltimaBusquedaAnio("");
		this.anioSessionBean.setiNumeroPaginacion(AnioConstantesFunciones.INUMEROPAGINACION);
		this.anioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAnio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAnio() {
		this.updateBorderResaltarBusquedasFormularioAnio();
		this.updateVisibilidadBusquedasFormularioAnio();
		this.updateHabilitarBusquedasFormularioAnio();
	}
	
	public void updateBorderResaltarBusquedasFormularioAnio() {					
	}
	
	public void updateVisibilidadBusquedasFormularioAnio() {
	}
	
	public void updateHabilitarBusquedasFormularioAnio() {
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
	
	public void updateControlesFormularioAnio() throws Exception {

		if(this.jInternalFrameDetalleFormAnio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAnio();
		this.updateVisibilidadResaltarControlesFormularioAnio();
		this.updateHabilitarResaltarControlesFormularioAnio();
		
	}
	
	public void updateBorderResaltarControlesFormularioAnio() throws Exception {
		if(this.jInternalFrameDetalleFormAnio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.anioConstantesFunciones.resaltaridAnio!=null && this.jInternalFrameDetalleFormAnio!=null) {this.jInternalFrameDetalleFormAnio.jTextFieldidAnio.setBorder(this.anioConstantesFunciones.resaltaridAnio);}
		if(this.anioConstantesFunciones.resaltarnombreAnio!=null && this.jInternalFrameDetalleFormAnio!=null) {this.jInternalFrameDetalleFormAnio.jTextFieldnombreAnio.setBorder(this.anioConstantesFunciones.resaltarnombreAnio);}
		if(this.anioConstantesFunciones.resaltarvalorAnio!=null && this.jInternalFrameDetalleFormAnio!=null) {this.jInternalFrameDetalleFormAnio.jTextFieldvalorAnio.setBorder(this.anioConstantesFunciones.resaltarvalorAnio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAnio() throws Exception {		
		if(this.jInternalFrameDetalleFormAnio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAnio!=null) {
	
		//this.jInternalFrameDetalleFormAnio.jTextFieldidAnio.setVisible(this.anioConstantesFunciones.mostraridAnio);
		this.jInternalFrameDetalleFormAnio.jPanelidAnio.setVisible(this.anioConstantesFunciones.mostraridAnio);
		//this.jInternalFrameDetalleFormAnio.jTextFieldnombreAnio.setVisible(this.anioConstantesFunciones.mostrarnombreAnio);
		this.jInternalFrameDetalleFormAnio.jPanelnombreAnio.setVisible(this.anioConstantesFunciones.mostrarnombreAnio);
		//this.jInternalFrameDetalleFormAnio.jTextFieldvalorAnio.setVisible(this.anioConstantesFunciones.mostrarvalorAnio);
		this.jInternalFrameDetalleFormAnio.jPanelvalorAnio.setVisible(this.anioConstantesFunciones.mostrarvalorAnio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAnio() throws Exception {
		if(this.jInternalFrameDetalleFormAnio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAnio!=null) {
	
		this.jInternalFrameDetalleFormAnio.jTextFieldidAnio.setEnabled(this.anioConstantesFunciones.activaridAnio);
		this.jInternalFrameDetalleFormAnio.jTextFieldnombreAnio.setEnabled(this.anioConstantesFunciones.activarnombreAnio);
		this.jInternalFrameDetalleFormAnio.jTextFieldvalorAnio.setEnabled(this.anioConstantesFunciones.activarvalorAnio);
		}
	}
	
		
}