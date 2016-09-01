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

import com.bydan.erp.seguridad.util.TipoImagenConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoImagenParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoImagenParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoImagenBean;
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

import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoImagenBeanSwingJInternalFrame extends TipoImagenJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoImagenBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoImagen> tipoimagenValidator = new ClassValidator<TipoImagen>(TipoImagen.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoImagen tipoimagen;	
	public TipoImagen tipoimagenAux;
	public TipoImagen tipoimagenAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoImagen tipoimagenTotales;
	public Long idTipoImagenActual;
	public Long iIdNuevoTipoImagen=0L;
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
	
	public Boolean isPermisoTodoTipoImagen;
	public Boolean isPermisoNuevoTipoImagen;
	public Boolean isPermisoActualizarTipoImagen;
	public Boolean isPermisoActualizarOriginalTipoImagen;
	public Boolean isPermisoEliminarTipoImagen;
	public Boolean isPermisoGuardarCambiosTipoImagen;
	public Boolean isPermisoConsultaTipoImagen;
	public Boolean isPermisoBusquedaTipoImagen;
	public Boolean isPermisoReporteTipoImagen;
	public Boolean isPermisoPaginacionMedioTipoImagen;
	public Boolean isPermisoPaginacionAltoTipoImagen;
	public Boolean isPermisoPaginacionTodoTipoImagen;
	public Boolean isPermisoCopiarTipoImagen;
	public Boolean isPermisoVerFormTipoImagen;
	public Boolean isPermisoDuplicarTipoImagen;
	public Boolean isPermisoOrdenTipoImagen;
	
	
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
	
	public TipoImagenParameterReturnGeneral tipoimagenReturnGeneral;
	public TipoImagenParameterReturnGeneral tipoimagenParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoImagen=false;
	public Boolean esParaAccionDesdeFormularioTipoImagen=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoImagenLogic tipoimagenLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoImagen tipoimagenBean;
	public TipoImagenConstantesFunciones tipoimagenConstantesFunciones;
	//public TipoImagenParameterReturnGeneral tipoimagenReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoImagen> tipoimagens;	
	//public List<TipoImagen> tipoimagensEliminados;
	//public List<TipoImagen> tipoimagensAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoImagen=false;
	public Boolean isVisibilidadCeldaDuplicarTipoImagen=true;
	public Boolean isVisibilidadCeldaCopiarTipoImagen=true;
	public Boolean isVisibilidadCeldaVerFormTipoImagen=true;
	public Boolean isVisibilidadCeldaOrdenTipoImagen=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoImagen=false;
	public Boolean isVisibilidadCeldaModificarTipoImagen=false;
	public Boolean isVisibilidadCeldaActualizarTipoImagen=false;
	public Boolean isVisibilidadCeldaEliminarTipoImagen=false;
	public Boolean isVisibilidadCeldaCancelarTipoImagen=false;
	public Boolean isVisibilidadCeldaGuardarTipoImagen=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoImagen=false;	
	
	
	
	public Long getiIdNuevoTipoImagen() {
		return this.iIdNuevoTipoImagen;
	}

	public void setiIdNuevoTipoImagen(Long iIdNuevoTipoImagen) {
		this.iIdNuevoTipoImagen = iIdNuevoTipoImagen;
	}
	
	public Long getidTipoImagenActual() {
		return this.idTipoImagenActual;
	}

	public void setidTipoImagenActual(Long idTipoImagenActual) {
		this.idTipoImagenActual = idTipoImagenActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoImagen gettipoimagen() {
		return this.tipoimagen;
	}

	public void settipoimagen(TipoImagen tipoimagen) {
		this.tipoimagen = tipoimagen;
	}
	
	public TipoImagen gettipoimagenAux() {
		return this.tipoimagenAux;
	}

	public void settipoimagenAux(TipoImagen tipoimagenAux) {
		this.tipoimagenAux = tipoimagenAux;
	}				
	
	public TipoImagen gettipoimagenAnterior() {
		return this.tipoimagenAnterior;
	}

	public void settipoimagenAnterior(TipoImagen tipoimagenAnterior) {
		this.tipoimagenAnterior = tipoimagenAnterior;
	}	
	
	public TipoImagen gettipoimagenTotales() {
		return this.tipoimagenTotales;
	}

	public void settipoimagenTotales(TipoImagen tipoimagenTotales) {
		this.tipoimagenTotales = tipoimagenTotales;
	}	
	
	public TipoImagen gettipoimagenBean() {
		return this.tipoimagenBean;
	}

	public void settipoimagenBean(TipoImagen tipoimagenBean) {
		this.tipoimagenBean = tipoimagenBean;
	}	
	
	public TipoImagenParameterReturnGeneral gettipoimagenReturnGeneral() {
		return this.tipoimagenReturnGeneral;
	}

	public void settipoimagenReturnGeneral(TipoImagenParameterReturnGeneral tipoimagenReturnGeneral) {
		this.tipoimagenReturnGeneral = tipoimagenReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoImagenLogic getTipoImagenLogic()	{		
		return tipoimagenLogic;
	}

	public void setTipoImagenLogic(TipoImagenLogic tipoimagenLogic) {
		this.tipoimagenLogic = tipoimagenLogic;
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
	
	public Boolean getIsEsNuevoTipoImagen() {
		return isEsNuevoTipoImagen;
	}

	public void setIsEsNuevoTipoImagen(Boolean isEsNuevoTipoImagen) {
		this.isEsNuevoTipoImagen = isEsNuevoTipoImagen;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoImagen() {
		return esParaAccionDesdeFormularioTipoImagen;
	}
	
	public void setEsParaAccionDesdeFormularioTipoImagen(Boolean esParaAccionDesdeFormularioTipoImagen) {
		this.esParaAccionDesdeFormularioTipoImagen = esParaAccionDesdeFormularioTipoImagen;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoImagen() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoImagenConstantesFunciones.refrescarForeignKeysDescripcionesTipoImagen(this.tipoimagenLogic.getTipoImagens());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoImagenConstantesFunciones.refrescarForeignKeysDescripcionesTipoImagen(this.tipoimagens);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoimagenLogic.setTipoImagens(this.tipoimagens);
			tipoimagenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoImagenParameterReturnGeneral getTipoImagenParameterGeneral() {
		return this.tipoimagenParameterGeneral;
	}
	
	public void setTipoImagenParameterGeneral(TipoImagenParameterReturnGeneral tipoimagenParameterGeneral) {
		this.tipoimagenParameterGeneral = tipoimagenParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoImagen() {
		return isPermisoTodoTipoImagen;
	}

	public void setIsPermisoTodoTipoImagen(Boolean isPermisoTodoTipoImagen) {
		this.isPermisoTodoTipoImagen = isPermisoTodoTipoImagen;
	}

	public Boolean getIsPermisoNuevoTipoImagen() {
		return isPermisoNuevoTipoImagen;
	}

	public void setIsPermisoNuevoTipoImagen(Boolean isPermisoNuevoTipoImagen) {
		this.isPermisoNuevoTipoImagen = isPermisoNuevoTipoImagen;
	}

	public Boolean getIsPermisoActualizarTipoImagen() {
		return isPermisoActualizarTipoImagen;
	}

	public void setIsPermisoActualizarTipoImagen(Boolean isPermisoActualizarTipoImagen) {
		this.isPermisoActualizarTipoImagen = isPermisoActualizarTipoImagen;
	}

	public Boolean getIsPermisoEliminarTipoImagen() {
		return isPermisoEliminarTipoImagen;
	}

	public void setIsPermisoEliminarTipoImagen(Boolean isPermisoEliminarTipoImagen) {
		this.isPermisoEliminarTipoImagen = isPermisoEliminarTipoImagen;
	}

	public Boolean getIsPermisoGuardarCambiosTipoImagen() {
		return isPermisoGuardarCambiosTipoImagen;
	}

	public void setIsPermisoGuardarCambiosTipoImagen(Boolean isPermisoGuardarCambiosTipoImagen) {
		this.isPermisoGuardarCambiosTipoImagen = isPermisoGuardarCambiosTipoImagen;
	}
	
	public Boolean getIsPermisoConsultaTipoImagen() {
		return isPermisoConsultaTipoImagen;
	}

	public void setIsPermisoConsultaTipoImagen(Boolean isPermisoConsultaTipoImagen) {
		this.isPermisoConsultaTipoImagen = isPermisoConsultaTipoImagen;
	}

	public Boolean getIsPermisoBusquedaTipoImagen() {
		return isPermisoBusquedaTipoImagen;
	}

	public void setIsPermisoBusquedaTipoImagen(Boolean isPermisoBusquedaTipoImagen) {
		this.isPermisoBusquedaTipoImagen = isPermisoBusquedaTipoImagen;
	}

	public Boolean getIsPermisoReporteTipoImagen() {
		return isPermisoReporteTipoImagen;
	}

	public void setIsPermisoReporteTipoImagen(Boolean isPermisoReporteTipoImagen) {
		this.isPermisoReporteTipoImagen = isPermisoReporteTipoImagen;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoImagen() {
		return isPermisoPaginacionMedioTipoImagen;
	}

	public void setIsPermisoPaginacionMedioTipoImagen(Boolean isPermisoPaginacionMedioTipoImagen) {
		this.isPermisoPaginacionMedioTipoImagen = isPermisoPaginacionMedioTipoImagen;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoImagen() {
		return isPermisoPaginacionTodoTipoImagen;
	}

	public void setIsPermisoPaginacionTodoTipoImagen(Boolean isPermisoPaginacionTodoTipoImagen) {
		this.isPermisoPaginacionTodoTipoImagen = isPermisoPaginacionTodoTipoImagen;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoImagen() {
		return isPermisoPaginacionAltoTipoImagen;
	}

	public void setIsPermisoPaginacionAltoTipoImagen(Boolean isPermisoPaginacionAltoTipoImagen) {
		this.isPermisoPaginacionAltoTipoImagen = isPermisoPaginacionAltoTipoImagen;
	}
	
	public Boolean getIsPermisoCopiarTipoImagen() {
		return isPermisoCopiarTipoImagen;
	}

	public void setIsPermisoCopiarTipoImagen(Boolean isPermisoCopiarTipoImagen) {
		this.isPermisoCopiarTipoImagen = isPermisoCopiarTipoImagen;
	}
	
	public Boolean getIsPermisoVerFormTipoImagen() {
		return isPermisoVerFormTipoImagen;
	}

	public void setIsPermisoVerFormTipoImagen(Boolean isPermisoVerFormTipoImagen) {
		this.isPermisoVerFormTipoImagen = isPermisoVerFormTipoImagen;
	}
	
	public Boolean getIsPermisoDuplicarTipoImagen() {
		return isPermisoDuplicarTipoImagen;
	}

	public void setIsPermisoDuplicarTipoImagen(Boolean isPermisoDuplicarTipoImagen) {
		this.isPermisoDuplicarTipoImagen = isPermisoDuplicarTipoImagen;
	}
	
	public Boolean getIsPermisoOrdenTipoImagen() {
		return isPermisoOrdenTipoImagen;
	}

	public void setIsPermisoOrdenTipoImagen(Boolean isPermisoOrdenTipoImagen) {
		this.isPermisoOrdenTipoImagen = isPermisoOrdenTipoImagen;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoImagen() {
		return isVisibilidadCeldaNuevoTipoImagen;
	}

	public void setIsVisibilidadCeldaNuevoTipoImagen(Boolean isVisibilidadCeldaNuevoTipoImagen) {
		this.isVisibilidadCeldaNuevoTipoImagen = isVisibilidadCeldaNuevoTipoImagen;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoImagen() {
		return isVisibilidadCeldaDuplicarTipoImagen;
	}

	public void setIsVisibilidadCeldaDuplicarTipoImagen(Boolean isVisibilidadCeldaDuplicarTipoImagen) {
		this.isVisibilidadCeldaDuplicarTipoImagen = isVisibilidadCeldaDuplicarTipoImagen;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoImagen() {
		return isVisibilidadCeldaCopiarTipoImagen;
	}

	public void setIsVisibilidadCeldaCopiarTipoImagen(Boolean isVisibilidadCeldaCopiarTipoImagen) {
		this.isVisibilidadCeldaCopiarTipoImagen = isVisibilidadCeldaCopiarTipoImagen;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoImagen() {
		return isVisibilidadCeldaVerFormTipoImagen;
	}

	public void setIsVisibilidadCeldaVerFormTipoImagen(Boolean isVisibilidadCeldaVerFormTipoImagen) {
		this.isVisibilidadCeldaVerFormTipoImagen = isVisibilidadCeldaVerFormTipoImagen;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoImagen() {
		return isVisibilidadCeldaOrdenTipoImagen;
	}

	public void setIsVisibilidadCeldaOrdenTipoImagen(Boolean isVisibilidadCeldaOrdenTipoImagen) {
		this.isVisibilidadCeldaOrdenTipoImagen = isVisibilidadCeldaOrdenTipoImagen;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoImagen() {
		return isVisibilidadCeldaNuevoRelacionesTipoImagen;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoImagen(Boolean isVisibilidadCeldaNuevoRelacionesTipoImagen) {
		this.isVisibilidadCeldaNuevoRelacionesTipoImagen = isVisibilidadCeldaNuevoRelacionesTipoImagen;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoImagen() {
		return isVisibilidadCeldaModificarTipoImagen;
	}

	public void setIsVisibilidadCeldaModificarTipoImagen(Boolean isVisibilidadCeldaModificarTipoImagen) {
		this.isVisibilidadCeldaModificarTipoImagen = isVisibilidadCeldaModificarTipoImagen;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoImagen() {
		return isVisibilidadCeldaActualizarTipoImagen;
	}

	public void setIsVisibilidadCeldaActualizarTipoImagen(Boolean isVisibilidadCeldaActualizarTipoImagen) {
		this.isVisibilidadCeldaActualizarTipoImagen = isVisibilidadCeldaActualizarTipoImagen;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoImagen() {
		return isVisibilidadCeldaEliminarTipoImagen;
	}

	public void setIsVisibilidadCeldaEliminarTipoImagen(Boolean isVisibilidadCeldaEliminarTipoImagen) {
		this.isVisibilidadCeldaEliminarTipoImagen = isVisibilidadCeldaEliminarTipoImagen;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoImagen() {
		return isVisibilidadCeldaCancelarTipoImagen;
	}

	public void setIsVisibilidadCeldaCancelarTipoImagen(Boolean isVisibilidadCeldaCancelarTipoImagen) {
		this.isVisibilidadCeldaCancelarTipoImagen = isVisibilidadCeldaCancelarTipoImagen;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoImagen() {
		return isVisibilidadCeldaGuardarTipoImagen;
	}

	public void setIsVisibilidadCeldaGuardarTipoImagen(Boolean isVisibilidadCeldaGuardarTipoImagen) {
		this.isVisibilidadCeldaGuardarTipoImagen = isVisibilidadCeldaGuardarTipoImagen;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoImagen() {
		return isVisibilidadCeldaGuardarCambiosTipoImagen;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoImagen(Boolean isVisibilidadCeldaGuardarCambiosTipoImagen) {
		this.isVisibilidadCeldaGuardarCambiosTipoImagen = isVisibilidadCeldaGuardarCambiosTipoImagen;
	}
		
	public TipoImagenSessionBean gettipoimagenSessionBean() {
		return this.tipoimagenSessionBean;
	}
	
	public void settipoimagenSessionBean(TipoImagenSessionBean tipoimagenSessionBean) {
		this.tipoimagenSessionBean=tipoimagenSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoImagen(TipoImagen tipoimagen)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoImagen tipoimagen,TipoImagen tipoimagenAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoImagen(tipoimagen);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoimagenAux.setId(tipoimagen.getId());
		tipoimagenAux.setVersionRow(tipoimagen.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoImagen();
		
			int intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoimagen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoImagen(this.tipoimagen,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(this.tipoimagen);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoimagenValidator.getInvalidValues(this.tipoimagen);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoimagenLogic.setDatosCliente(datosCliente);
			tipoimagenLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoimagenAux=new  TipoImagen();
				
				tipoimagenAux.setIsNew(true);
				tipoimagenAux.setIsChanged(true);
				
				tipoimagenAux.setTipoImagenOriginal(this.tipoimagen);
				
				tipoimagenAux.setId(this.tipoimagen.getId());	
				tipoimagenAux.setVersionRow(this.tipoimagen.getVersionRow());	
				tipoimagenAux.setcodigo(this.tipoimagen.getcodigo());	
				tipoimagenAux.setnombre(this.tipoimagen.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoimagenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoimagenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoimagenAux,tipoimagenLogic.getTipoImagens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoimagenAux,tipoimagens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoimagenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoimagenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimagenLogic.saveTipoImagens();//WithConnection
						//tipoimagenLogic.getSetVersionRowTipoImagens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoimagen,tipoimagenAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoimagenAux=new  TipoImagen();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoimagenSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoimagenSessionBean.getEsGuardarRelacionado() && this.tipoimagen.getId()>=0)) {
						
					tipoimagenAux.setIsNew(false);
				}
				
				tipoimagenAux.setIsDeleted(false);
			
				tipoimagenAux.setId(this.tipoimagen.getId());	
				tipoimagenAux.setVersionRow(this.tipoimagen.getVersionRow());	
				tipoimagenAux.setcodigo(this.tipoimagen.getcodigo());	
				tipoimagenAux.setnombre(this.tipoimagen.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoimagenAux,tipoimagenLogic.getTipoImagens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoimagenAux,tipoimagens);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoimagenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoimagenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimagenLogic.saveTipoImagens();//WithConnection
						//tipoimagenLogic.getSetVersionRowTipoImagens();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoimagen,tipoimagenAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoimagenAux=new  TipoImagen();
				
				tipoimagenAux.setIsNew(false);
				tipoimagenAux.setIsChanged(false);
				
				tipoimagenAux.setIsDeleted(true);
				
				tipoimagenAux.setId(this.tipoimagen.getId());	
				tipoimagenAux.setVersionRow(this.tipoimagen.getVersionRow());	
				tipoimagenAux.setcodigo(this.tipoimagen.getcodigo());	
				tipoimagenAux.setnombre(this.tipoimagen.getnombre());	
				
				if(this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoimagenAux.getId()>=0) {	
						this.tipoimagensEliminados.add(tipoimagenAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoimagenAux,tipoimagenLogic.getTipoImagens());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoimagenAux,tipoimagens);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoimagenSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoimagenSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimagenLogic.saveTipoImagens();//WithConnection
						//tipoimagenLogic.getSetVersionRowTipoImagens();//WithConnection
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
					this.tipoimagenLogic.getTipoImagens().addAll(this.tipoimagensEliminados);
					
					tipoimagenLogic.saveTipoImagens();//WithConnection
					//tipoimagenLogic.getSetVersionRowTipoImagens();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoimagensEliminados= new ArrayList<TipoImagen>();		
			}
			
			if(this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Imagen GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Imagen",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoimagen=tipoimagenAux;
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
      		//this.finishProcessTipoImagen();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoImagen tipoimagenLocal) throws Exception {
		
		if(this.tipoimagenSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoImagen tipoimagenLocal) throws Exception {	
		if(this.tipoimagenSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoImagenActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoimagen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoimagen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoimagenValidator.getInvalidValues(this.tipoimagen);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoImagen tipoimagen,List<TipoImagen> tipoimagens) throws Exception {
		try	{		
			TipoImagenConstantesFunciones.actualizarLista(tipoimagen,tipoimagens,this.tipoimagenSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoImagen tipoimagen,List<TipoImagen> tipoimagens) throws Exception {
		try	{			
			TipoImagenConstantesFunciones.actualizarSelectedLista(tipoimagen,tipoimagens);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoImagen> tipoimagensLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoimagensLocal=this.tipoimagenLogic.getTipoImagens();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoimagensLocal=this.tipoimagens;
			}
			//ARCHITECTURE
		
			for(TipoImagen tipoimagenLocal:tipoimagensLocal) {
				if(this.permiteMantenimiento(tipoimagenLocal) && tipoimagenLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoImagenConstantesFunciones.getTipoImagenLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoImagenConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImagen.jLabelcodigoTipoImagen,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoImagenConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImagen.jLabelnombreTipoImagen,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoImagen.jLabelcodigoTipoImagen,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoImagen.jLabelnombreTipoImagen,"");
		
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
		this.iIdNuevoTipoImagen--;	
		
		
		this.tipoimagenAux=new TipoImagen();
		
		this.tipoimagenAux.setId(this.iIdNuevoTipoImagen);
		this.tipoimagenAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoimagenLogic.getTipoImagens().add(this.tipoimagenAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoimagens.add(this.tipoimagenAux);
		}
		//ARCHITECTURE
		
		this.tipoimagen=this.tipoimagenAux;
		
		if(TipoImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoImagen(this.tipoimagen);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoImagen(this.tipoimagen);
		}
				
		//this.setDefaultControlesTipoImagen();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoImagen();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoImagen();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoImagen();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoImagen(this.tipoimagenBean,this.tipoimagen,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(this.tipoimagen);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoImagenConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoimagenSessionBean.getConGuardarRelaciones()) {
			classes=TipoImagenConstantesFunciones.getClassesRelationshipsOfTipoImagen(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoimagenReturnGeneral=tipoimagenLogic.procesarEventosTipoImagensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoimagenLogic.getTipoImagens(),this.tipoimagen,this.tipoimagenParameterGeneral,this.isEsNuevoTipoImagen,classes);//this.tipoimagenLogic.getTipoImagen()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoImagen(this.tipoimagenReturnGeneral,this.tipoimagenBean,false);
		
		if(this.tipoimagenReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoImagen(this.tipoimagenReturnGeneral.getTipoImagen());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoImagen(this.tipoimagenReturnGeneral.getTipoImagen());
		}
		
		if(this.tipoimagenReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoImagen(this.tipoimagenReturnGeneral.getTipoImagen(),classes);//this.tipoimagenBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoImagen(this.tipoimagen,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoImagen();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoImagen();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoImagen(false);
						
			if(tipoimagenSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoImagenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoImagen();
			}
			
			this.actualizarVisualTableDatosTipoImagen();
			
			this.jTableDatosTipoImagen.setRowSelectionInterval(this.getIndiceNuevoTipoImagen(), this.getIndiceNuevoTipoImagen());
			
			this.seleccionarFilaTablaTipoImagenActual();
						
			this.actualizarEstadoCeldasBotonesTipoImagen("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoImagen(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoImagen.jTextFieldcodigoTipoImagen.setEnabled(isHabilitar && this.tipoimagenConstantesFunciones.activarcodigoTipoImagen);
		this.jInternalFrameDetalleFormTipoImagen.jTextAreanombreTipoImagen.setEnabled(isHabilitar && this.tipoimagenConstantesFunciones.activarnombreTipoImagen);	
		
	};
	
	public void setDefaultControlesTipoImagen() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoImagen(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoimagenSessionBean.setConGuardarRelaciones(true);			
			this.tipoimagenSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoImagen.jTabbedPaneRelacionesTipoImagen.setVisible(true);
			
					
		} else {
			//this.tipoimagenSessionBean.setConGuardarRelaciones(false);			
			this.tipoimagenSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoImagen.jTabbedPaneRelacionesTipoImagen.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoImagen() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImagen tipoimagenAux:this.tipoimagenLogic.getTipoImagens()) {
				if(tipoimagenAux.getId().equals(this.iIdNuevoTipoImagen)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImagen tipoimagenAux:this.tipoimagens) {
				if(tipoimagenAux.getId().equals(this.iIdNuevoTipoImagen)) {
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
	
	public int getIndiceActualTipoImagen(TipoImagen tipoimagen,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImagen tipoimagenAux:this.tipoimagenLogic.getTipoImagens()) {
				if(tipoimagenAux.getId().equals(tipoimagen.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImagen tipoimagenAux:this.tipoimagens) {
				if(tipoimagenAux.getId().equals(tipoimagen.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoImagen(TipoImagen tipoimagenOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImagen tipoimagenAux:this.tipoimagenLogic.getTipoImagens()) {
				if(tipoimagenAux.getTipoImagenOriginal().getId().equals(tipoimagenOriginal.getId())) {
					existe=true;
					tipoimagenOriginal.setId(tipoimagenAux.getId());
					tipoimagenOriginal.setVersionRow(tipoimagenAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImagen tipoimagenAux:this.tipoimagens) {
				if(tipoimagenAux.getTipoImagenOriginal().getId().equals(tipoimagenOriginal.getId())) {
					existe=true;
					tipoimagenOriginal.setId(tipoimagenAux.getId());
					tipoimagenOriginal.setVersionRow(tipoimagenAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoImagen(Boolean esParaCancelar) throws Exception {
		tipoimagensAux=new ArrayList<TipoImagen>();
		tipoimagenAux=new TipoImagen();
		
		if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoImagen tipoimagenAux:this.tipoimagenLogic.getTipoImagens()) {
					if(tipoimagenAux.getId()<0) {
						tipoimagensAux.add(tipoimagenAux);
					}		
				}
				this.iIdNuevoTipoImagen=0L;
				this.tipoimagenLogic.getTipoImagens().removeAll(tipoimagensAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoImagen tipoimagenAux:this.tipoimagens) {
					if(tipoimagenAux.getId()<0) {
						tipoimagensAux.add(tipoimagenAux);
					}		
				}
				this.iIdNuevoTipoImagen=0L;
				this.tipoimagens.removeAll(tipoimagensAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoImagen 
					&& this.tipoimagenLogic.getTipoImagens().size()>0
					) {
					tipoimagenAux=this.tipoimagenLogic.getTipoImagens().get(this.tipoimagenLogic.getTipoImagens().size() - 1);
				
					if(tipoimagenAux.getId()<0) {
						this.tipoimagenLogic.getTipoImagens().remove(tipoimagenAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoImagen && this.tipoimagens.size()>0) {
					tipoimagenAux=this.tipoimagens.get(this.tipoimagens.size() - 1);
				
					if(tipoimagenAux.getId()<0) {
						this.tipoimagens.remove(tipoimagenAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoImagen(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoimagen.getId()<0) {
				this.tipoimagenLogic.getTipoImagens().remove(this.tipoimagen);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoimagen.getId()<0) {
				this.tipoimagens.remove(this.tipoimagen);
			}
		}			
	}
	
	public void setEstadosInicialesTipoImagen(List<TipoImagen> tipoimagensAux) throws Exception {
		TipoImagenConstantesFunciones.setEstadosInicialesTipoImagen(tipoimagensAux);
	}
	
	public void setEstadosInicialesTipoImagen(TipoImagen tipoimagenAux) throws Exception {
		TipoImagenConstantesFunciones.setEstadosInicialesTipoImagen(tipoimagenAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoImagenActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoImagen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoImagenActual()) {
				if(!this.isEsNuevoTipoImagen) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoImagen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoImagen=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoImagenActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Imagen ?", "MANTENIMIENTO DE Tipo Imagen", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoImagen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoImagen tipoimagen) throws Exception {
		TipoImagenConstantesFunciones.seleccionarAsignar(this.tipoimagen,tipoimagen);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoImagen=this.isPermisoActualizarOriginalTipoImagen;
			
			
			this.seleccionarAsignar(tipoimagen);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoImagenConstantesFunciones.quitarEspaciosTipoImagen(this.tipoimagen,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoImagen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoimagenSessionBean.setsFuncionBusquedaRapida(this.tipoimagenSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoImagen) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoImagen(esParaCancelar);				
				this.cancelarNuevoTipoImagen(esParaCancelar);								
			}
			
			this.tipoimagen=new TipoImagen();
			
			this.inicializarTipoImagen();
			
			this.actualizarEstadoCeldasBotonesTipoImagen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoImagen() throws Exception {
		try {
			TipoImagenConstantesFunciones.inicializarTipoImagen(this.tipoimagen);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoimagenLogic.getTipoImagens().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoImagens(String sAccionBusqueda,List<TipoImagen> tipoimagensParaReportes) throws Exception {
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
					sPathReporteFinal="TipoImagen"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoImagenMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoImagenMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoImagen"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Imagens");		
		parameters.put("busquedapor", TipoImagenConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoImagen=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoImagenConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoImagenConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoImagen=new JRBeanArrayDataSource(TipoImagenJInternalFrame.TraerTipoImagenBeans(tipoimagensParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoImagen);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoImagenConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoImagenConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoImagenBean.TraerTipoImagenBeans(tipoimagensParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoImagens(sAccionBusqueda,sTipoArchivoReporte,tipoimagensParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoImagens(sAccionBusqueda,sTipoArchivoReporte,tipoimagensParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoImagenActionPerformed(null);
					//this.generarExcelReporteTipoImagens(sAccionBusqueda,sTipoArchivoReporte,tipoimagensParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoImagens(sAccionBusqueda,sTipoArchivoReporte,tipoimagensParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoImagens(sAccionBusqueda,sTipoArchivoReporte,tipoimagensParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoImagens(sAccionBusqueda,sTipoArchivoReporte,tipoimagensParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoImagens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoImagen> tipoimagensParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagen";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoImagens");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoImagen("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoImagen tipoimagen : tipoimagensParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoImagenConstantesFunciones.generarExcelReporteDataTipoImagen("NORMAL",row,workbook,tipoimagen,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoImagen(String sTipo,Row row,Workbook workbook) {
		
		TipoImagenConstantesFunciones.generarExcelReporteHeaderTipoImagen(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoImagens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoImagen> tipoimagensParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagen_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoImagens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoImagen tipoimagen : tipoimagensParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoImagenConstantesFunciones.getTipoImagenDescripcion(tipoimagen));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoImagenConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoImagenConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoimagen.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoImagenConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoImagenConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoimagen.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoImagens(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoImagen> tipoimagensParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoImagen> tipoimagensRespaldo=null;
		
		classes=TipoImagenConstantesFunciones.getClassesRelationshipsOfTipoImagen(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoimagenLogic.setDatosCliente(this.datosCliente);
		this.tipoimagenLogic.setDatosDeep(this.datosDeep);
		this.tipoimagenLogic.setIsConDeep(true);
		
		tipoimagensRespaldo=this.tipoimagenLogic.getTipoImagens();
		
		this.tipoimagenLogic.setTipoImagens(tipoimagensParaReportes);	
		this.tipoimagenLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoimagensParaReportes=this.tipoimagenLogic.getTipoImagens();
		this.tipoimagenLogic.setTipoImagens(tipoimagensRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagen_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoImagens");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoImagen("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoImagen tipoimagen : tipoimagensParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoImagen("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoImagenConstantesFunciones.generarExcelReporteDataTipoImagen("NORMAL",row,workbook,tipoimagen,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoImagenConstantesFunciones.getTipoImagenDescripcion(tipoimagen));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoImagen.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImagen.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoImagen.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImagen.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoImagen() throws Exception {		
		this.startProcessTipoImagen(true);
	}
	
	public void startProcessTipoImagen(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoImagen, this.jScrollPanelDatosTipoImagen,this.jPanelPaginacionTipoImagen, this.jScrollPanelDatosEdicionTipoImagen, this.jPanelAccionesTipoImagen,this.jPanelAccionesFormularioTipoImagen,this.jmenuBarTipoImagen,this.jmenuBarDetalleTipoImagen,this.jTtoolBarTipoImagen,this.jTtoolBarDetalleTipoImagen);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoImagen=null; 
		
		final JPanel jPanelParametrosReportesTipoImagen=this.jPanelParametrosReportesTipoImagen;
		//final JScrollPane jScrollPanelDatosTipoImagen=this.jScrollPanelDatosTipoImagen;
		final JTable jTableDatosTipoImagen=this.jTableDatosTipoImagen;		
		final JPanel jPanelPaginacionTipoImagen=this.jPanelPaginacionTipoImagen;
		//final JScrollPane jScrollPanelDatosEdicionTipoImagen=this.jScrollPanelDatosEdicionTipoImagen;
		final JPanel jPanelAccionesTipoImagen=this.jPanelAccionesTipoImagen;
		
		JPanel jPanelCamposAuxiliarTipoImagen=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoImagen=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) {
			jPanelCamposAuxiliarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jPanelCamposTipoImagen;
			jPanelAccionesFormularioAuxiliarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jPanelAccionesFormularioTipoImagen;
		}
		
		final JPanel jPanelCamposTipoImagen=jPanelCamposAuxiliarTipoImagen;
		final JPanel jPanelAccionesFormularioTipoImagen=jPanelAccionesFormularioAuxiliarTipoImagen;
		
		
		final JMenuBar jmenuBarTipoImagen=this.jmenuBarTipoImagen;
		final JToolBar jTtoolBarTipoImagen=this.jTtoolBarTipoImagen;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoImagen=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoImagen=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) {
			jmenuBarDetalleAuxiliarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jmenuBarDetalleTipoImagen;
			jTtoolBarDetalleAuxiliarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jTtoolBarDetalleTipoImagen;
		}
		
		final JMenuBar jmenuBarDetalleTipoImagen=jmenuBarDetalleAuxiliarTipoImagen;
		final JToolBar jTtoolBarDetalleTipoImagen=jTtoolBarDetalleAuxiliarTipoImagen;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoImagen;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoImagen;
			processRunnable.jTableDatos=jTableDatosTipoImagen;
			processRunnable.jPanelCampos=jPanelCamposTipoImagen;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoImagen;
			processRunnable.jPanelAcciones=jPanelAccionesTipoImagen;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoImagen;
			
			
			processRunnable.jmenuBar=jmenuBarTipoImagen;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoImagen;
			processRunnable.jTtoolBar=jTtoolBarTipoImagen;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoImagen;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoImagen ,jPanelParametrosReportesTipoImagen,jTableDatosTipoImagen, /*jScrollPanelDatosTipoImagen,*/jPanelCamposTipoImagen,jPanelPaginacionTipoImagen, /*jScrollPanelDatosEdicionTipoImagen,*/ jPanelAccionesTipoImagen,jPanelAccionesFormularioTipoImagen,jmenuBarTipoImagen,jmenuBarDetalleTipoImagen,jTtoolBarTipoImagen,jTtoolBarDetalleTipoImagen);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoImagen, jScrollPanelDatosTipoImagen,jPanelPaginacionTipoImagen, jScrollPanelDatosEdicionTipoImagen, jPanelAccionesTipoImagen,jPanelAccionesFormularioTipoImagen,jmenuBarTipoImagen,jmenuBarDetalleTipoImagen,jTtoolBarTipoImagen,jTtoolBarDetalleTipoImagen);
						
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
	
	public void finishProcessTipoImagen() {// throws Exception 
		this.finishProcessTipoImagen(true);
	}
	
	public void finishProcessTipoImagen(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoImagen, this.jScrollPanelDatosTipoImagen,this.jPanelPaginacionTipoImagen, this.jScrollPanelDatosEdicionTipoImagen, this.jPanelAccionesTipoImagen,this.jPanelAccionesFormularioTipoImagen,this.jmenuBarTipoImagen,this.jmenuBarDetalleTipoImagen,this.jTtoolBarTipoImagen,this.jTtoolBarDetalleTipoImagen);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoImagen=null; 
		
		final JPanel jPanelParametrosReportesTipoImagen=this.jPanelParametrosReportesTipoImagen;
		//final JScrollPane jScrollPanelDatosTipoImagen=this.jScrollPanelDatosTipoImagen;
		final JTable jTableDatosTipoImagen=this.jTableDatosTipoImagen;		
		final JPanel jPanelPaginacionTipoImagen=this.jPanelPaginacionTipoImagen;
		//final JScrollPane jScrollPanelDatosEdicionTipoImagen=this.jScrollPanelDatosEdicionTipoImagen;
		final JPanel jPanelAccionesTipoImagen=this.jPanelAccionesTipoImagen;
		
		JPanel jPanelCamposAuxiliarTipoImagen=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoImagen=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) {
			jPanelCamposAuxiliarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jPanelCamposTipoImagen;
			jPanelAccionesFormularioAuxiliarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jPanelAccionesFormularioTipoImagen;
		}
		
		final JPanel jPanelCamposTipoImagen=jPanelCamposAuxiliarTipoImagen;
		final JPanel jPanelAccionesFormularioTipoImagen=jPanelAccionesFormularioAuxiliarTipoImagen;
		
		
		final JMenuBar jmenuBarTipoImagen=this.jmenuBarTipoImagen;		
		final JToolBar jTtoolBarTipoImagen=this.jTtoolBarTipoImagen;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoImagen=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoImagen=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) {
			jmenuBarDetalleAuxiliarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jmenuBarDetalleTipoImagen;
			jTtoolBarDetalleAuxiliarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jTtoolBarDetalleTipoImagen;		
		}
		
		final JMenuBar jmenuBarDetalleTipoImagen=jmenuBarDetalleAuxiliarTipoImagen;
		final JToolBar jTtoolBarDetalleTipoImagen=jTtoolBarDetalleAuxiliarTipoImagen;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoImagen;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoImagen;
			processRunnable.jTableDatos=jTableDatosTipoImagen;
			processRunnable.jPanelCampos=jPanelCamposTipoImagen;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoImagen;
			processRunnable.jPanelAcciones=jPanelAccionesTipoImagen;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoImagen;
			
			
			processRunnable.jmenuBar=jmenuBarTipoImagen;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoImagen;
			processRunnable.jTtoolBar=jTtoolBarTipoImagen;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoImagen;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoImagen ,jPanelParametrosReportesTipoImagen, jTableDatosTipoImagen,/*jScrollPanelDatosTipoImagen,*/jPanelCamposTipoImagen,jPanelPaginacionTipoImagen, /*jScrollPanelDatosEdicionTipoImagen,*/ jPanelAccionesTipoImagen,jPanelAccionesFormularioTipoImagen,jmenuBarTipoImagen,jmenuBarDetalleTipoImagen,jTtoolBarTipoImagen,jTtoolBarDetalleTipoImagen));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoImagen(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoImagen(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoImagen(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoImagen(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoImagen,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoImagen,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoImagen(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoImagen,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoImagen,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoimagenConstantesFunciones.getsFinalQueryTipoImagen();
		String  finalQueryPaginacionTodos=this.tipoimagenConstantesFunciones.getsFinalQueryTipoImagen();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoImagenConstantesFunciones.getArrayColumnasGlobalesNoTipoImagen(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoImagenConstantesFunciones.getArrayColumnasGlobalesTipoImagen(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoImagenConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoimagensEliminados= new ArrayList<TipoImagen>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoImagen();
		
				///*TipoImagenSessionBean*/this.tipoimagenSessionBean=new TipoImagenSessionBean();
			
			if(this.tipoimagenSessionBean==null) {
				this.tipoimagenSessionBean=new TipoImagenSessionBean();
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
					this.iNumeroPaginacion=TipoImagenConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoImagenConstantesFunciones.getClassesForeignKeysOfTipoImagen(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoimagen."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoimagensAux= new ArrayList<TipoImagen>();
			
				
			tipoimagenLogic.setDatosCliente(this.datosCliente);
			tipoimagenLogic.setDatosDeep(this.datosDeep);
			tipoimagenLogic.setIsConDeep(true);
			
			
			tipoimagenLogic.getTipoImagenDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoimagenLogic.getTodosTipoImagens(finalQueryGlobal,pagination);
					
					//tipoimagenLogic.getTodosTipoImagensWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoimagenLogic.getTipoImagens()==null|| tipoimagenLogic.getTipoImagens().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoimagensAux= new ArrayList<TipoImagen>();
							tipoimagensAux.addAll(tipoimagenLogic.getTipoImagens());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoimagensAux= new ArrayList<TipoImagen>();
							tipoimagensAux.addAll(tipoimagens);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoimagenLogic.getTodosTipoImagens(finalQueryGlobal+"",this.pagination);												
							
							//tipoimagenLogic.getTodosTipoImagensWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoImagens("Todos",tipoimagenLogic.getTipoImagens() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoimagenLogic.setTipoImagens(new ArrayList<TipoImagen>());					
							tipoimagenLogic.getTipoImagens().addAll(tipoimagensAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoimagens=new ArrayList<TipoImagen>();
							tipoimagens.addAll(tipoimagensAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoImagen=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoImagen=this.idActual;
				
				} else if(this.idTipoImagenActual!=null && this.idTipoImagenActual!=0L) {
					idTipoImagen=idTipoImagenActual;
				}
				
					
				this.sDetalleReporte=TipoImagenConstantesFunciones.getDetalleIndicePorId(idTipoImagen);
				
				this.tipoimagens=new ArrayList<TipoImagen>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoimagenLogic.getEntity(idTipoImagen);
					
					//tipoimagenLogic.getEntityWithConnection(idTipoImagen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoimagenLogic.setTipoImagens(new ArrayList<TipoImagen>());
					tipoimagenLogic.getTipoImagens().add(tipoimagenLogic.getTipoImagen());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoimagens=new ArrayList<TipoImagen>();
					this.tipoimagens.add(tipoimagen);
				}
				
				if(tipoimagenLogic.getTipoImagen()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoImagen();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoImagen();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoimagenLogic.getTipoImagens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoimagens.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoimagenLogic.getTipoImagens().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoimagens.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoImagen tipoimagen) {
		Boolean permite=true;
		
		if(this.tipoimagen.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoImagenConstantesFunciones.getOrderByListaTipoImagen();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoImagenConstantesFunciones.getOrderByListaTipoImagen();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImagen tipoimagen:tipoimagenLogic.getTipoImagens()) {
				if(tipoimagen.getsType().equals(Constantes2.S_TOTALES)) {
					tipoimagenTotales=tipoimagen;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImagen tipoimagen:this.tipoimagens) {
				if(tipoimagen.getsType().equals(Constantes2.S_TOTALES)) {
					tipoimagenTotales=tipoimagen;
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
			this.tipoimagenAux=new TipoImagen();
			this.tipoimagenAux.setsType(Constantes2.S_TOTALES);
			this.tipoimagenAux.setIsNew(false);
			this.tipoimagenAux.setIsChanged(false);
			this.tipoimagenAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoImagenConstantesFunciones.TotalizarValoresFilaTipoImagen(this.tipoimagenLogic.getTipoImagens(),this.tipoimagenAux);
				
				this.tipoimagenLogic.getTipoImagens().add(this.tipoimagenAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoImagenConstantesFunciones.TotalizarValoresFilaTipoImagen(this.tipoimagens,this.tipoimagenAux);
				
				this.tipoimagens.add(this.tipoimagenAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoimagenTotales=new TipoImagen();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoimagenLogic.getTipoImagens().remove(tipoimagenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoimagens.remove(tipoimagenTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoimagenTotales=new TipoImagen();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImagen tipoimagen:tipoimagenLogic.getTipoImagens()) {
				if(tipoimagen.getsType().equals(Constantes2.S_TOTALES)) {
					tipoimagenTotales=tipoimagen;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoImagenConstantesFunciones.TotalizarValoresFilaTipoImagen(this.tipoimagenLogic.getTipoImagens(),tipoimagenTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImagen tipoimagen:this.tipoimagens) {
				if(tipoimagen.getsType().equals(Constantes2.S_TOTALES)) {
					tipoimagenTotales=tipoimagen;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoImagenConstantesFunciones.TotalizarValoresFilaTipoImagen(this.tipoimagens,tipoimagenTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoImagen() {
		this.isPermisoTodoTipoImagen=false;
		this.isPermisoNuevoTipoImagen=false;
		this.isPermisoActualizarTipoImagen=false;
		this.isPermisoActualizarOriginalTipoImagen=false;
		this.isPermisoEliminarTipoImagen=false;
		this.isPermisoGuardarCambiosTipoImagen=false;
		this.isPermisoConsultaTipoImagen=false;
		this.isPermisoBusquedaTipoImagen=false;
		this.isPermisoReporteTipoImagen=false;		
		this.isPermisoOrdenTipoImagen=false;		
		this.isPermisoPaginacionMedioTipoImagen=false;		
		this.isPermisoPaginacionAltoTipoImagen=false;
		this.isPermisoPaginacionTodoTipoImagen=false;
		this.isPermisoCopiarTipoImagen=false;		
		this.isPermisoVerFormTipoImagen=false;		
		this.isPermisoDuplicarTipoImagen=false;		
		this.isPermisoOrdenTipoImagen=false;		
	}
	
	public void setPermisosUsuarioTipoImagen(Boolean isPermiso) {
		this.isPermisoTodoTipoImagen=isPermiso;
		this.isPermisoNuevoTipoImagen=isPermiso;
		this.isPermisoActualizarTipoImagen=isPermiso;
		this.isPermisoActualizarOriginalTipoImagen=isPermiso;
		this.isPermisoEliminarTipoImagen=isPermiso;
		this.isPermisoGuardarCambiosTipoImagen=isPermiso;
		this.isPermisoConsultaTipoImagen=isPermiso;
		this.isPermisoBusquedaTipoImagen=isPermiso;
		this.isPermisoReporteTipoImagen=isPermiso;
		this.isPermisoOrdenTipoImagen=isPermiso;		
		this.isPermisoPaginacionMedioTipoImagen=isPermiso;		
		this.isPermisoPaginacionAltoTipoImagen=isPermiso;		
		this.isPermisoPaginacionTodoTipoImagen=isPermiso;		
		this.isPermisoCopiarTipoImagen=isPermiso;		
		this.isPermisoVerFormTipoImagen=isPermiso;		
		this.isPermisoDuplicarTipoImagen=isPermiso;
		this.isPermisoOrdenTipoImagen=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoImagen(Boolean isPermiso) {
		//this.isPermisoTodoTipoImagen=isPermiso;
		this.isPermisoNuevoTipoImagen=isPermiso;
		this.isPermisoActualizarTipoImagen=isPermiso;
		this.isPermisoActualizarOriginalTipoImagen=isPermiso;
		this.isPermisoEliminarTipoImagen=isPermiso;
		this.isPermisoGuardarCambiosTipoImagen=isPermiso;
		//this.isPermisoConsultaTipoImagen=isPermiso;
		//this.isPermisoBusquedaTipoImagen=isPermiso;
		//this.isPermisoReporteTipoImagen=isPermiso;
		//this.isPermisoOrdenTipoImagen=isPermiso;		
		//this.isPermisoPaginacionMedioTipoImagen=isPermiso;		
		//this.isPermisoPaginacionAltoTipoImagen=isPermiso;		
		//this.isPermisoPaginacionTodoTipoImagen=isPermiso;		
		//this.isPermisoCopiarTipoImagen=isPermiso;		
		//this.isPermisoDuplicarTipoImagen=isPermiso;
		//this.isPermisoOrdenTipoImagen=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoImagenClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoImagenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoImagen(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoImagenClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoImagenClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoImagenClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoImagenClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoImagen() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoImagenJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoImagenConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoImagen=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoImagen=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoImagen=this.isPermisoActualizarTipoImagen;
			this.isPermisoEliminarTipoImagen=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoImagen=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoImagen=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoImagen=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoImagen=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoImagen=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoImagen=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoImagen=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoImagen=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoImagen=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoImagen=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoImagen=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoImagen=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoImagen=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoImagen.setToolTipText(this.jTableDatosTipoImagen.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoImagen(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoImagen(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoImagenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoImagenJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoImagen() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoImagenListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoImagenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoImagenJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoImagenListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoImagenListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoImagen()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoImagen()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoImagen(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoImagen()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoImagen();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoImagen(TipoImagen tipoimagen)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoImagen(TipoImagen tipoimagen,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoImagen()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoImagen()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoImagen()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoImagen()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoImagen()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoImagen()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoImagen(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoImagen()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoImagenBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoImagenBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoImagenBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoimagenSessionBean=new TipoImagenSessionBean(); 
		this.tipoimagenConstantesFunciones=new TipoImagenConstantesFunciones(); 
		this.tipoimagenBean=new TipoImagen();//(this.tipoimagenConstantesFunciones); 		
		this.tipoimagenReturnGeneral=new TipoImagenParameterReturnGeneral(); 
		
		this.tipoimagenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoimagenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoImagenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoImagenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoImagenBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoImagen(true);
			
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
			
			this.tipoimagenConstantesFunciones=new TipoImagenConstantesFunciones(); 
			this.tipoimagenBean=new TipoImagen();//this.tipoimagenConstantesFunciones); 			
			this.tipoimagenReturnGeneral=new TipoImagenParameterReturnGeneral(); 
		
			TipoImagenBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Imagen Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoimagen=new TipoImagen();
			this.tipoimagens = new ArrayList<TipoImagen>();
			this.tipoimagensAux = new ArrayList<TipoImagen>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic=new TipoImagenLogic();
				this.tipoimagenLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoimagenSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoimagenSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoImagen);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoImagen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoImagen);	
					}
					
					if(this.jInternalFrameImportacionTipoImagen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoImagen);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoImagen!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoImagen);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoImagen!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoImagen);
				this.jInternalFrameDetalleFormTipoImagen.setVisible(false);
				this.jInternalFrameDetalleFormTipoImagen.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoImagen!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoImagen);
					this.jInternalFrameReporteDinamicoTipoImagen.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoImagen.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoImagen!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoImagen);
					this.jInternalFrameImportacionTipoImagen.setVisible(false);
					this.jInternalFrameImportacionTipoImagen.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoImagen!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoImagen);
					this.jInternalFrameOrderByTipoImagen.setVisible(false);
					this.jInternalFrameOrderByTipoImagen.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoImagenActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoImagenConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoimagenReturnGeneral=new TipoImagenParameterReturnGeneral();
			
			this.tipoimagenParameterGeneral=new TipoImagenParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoimagenLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoImagenJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoImagenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoimagenSessionBean.getEsGuardarRelacionado(),this.tipoimagenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoImagenConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoimagenSessionBean.getEsGuardarRelacionado(),this.tipoimagenSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoImagen=false;
			this.isVisibilidadCeldaDuplicarTipoImagen=true;
			this.isVisibilidadCeldaCopiarTipoImagen=true;
			this.isVisibilidadCeldaVerFormTipoImagen=true;
			this.isVisibilidadCeldaOrdenTipoImagen=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagen=false;
			this.isVisibilidadCeldaModificarTipoImagen=false;
			this.isVisibilidadCeldaActualizarTipoImagen=false;
			this.isVisibilidadCeldaEliminarTipoImagen=false;
			this.isVisibilidadCeldaCancelarTipoImagen=false;
			this.isVisibilidadCeldaGuardarTipoImagen=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagen=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoImagen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoImagen();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoImagen(false);
			
			this.setPermisosUsuarioTipoImagen();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoimagenSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoimagenSessionBean.getEsGuardarRelacionado() && this.tipoimagenSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoImagenClasesRelacionadas();
			}
			
			if(this.tipoimagenSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoImagenClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoImagenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoImagen();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoImagen();
			}
			
			if(!this.isPermisoBusquedaTipoImagen) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoImagen,this.isPermisoPaginacionMedioTipoImagen,this.isPermisoPaginacionTodoTipoImagen);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoImagenConstantesFunciones.getTiposSeleccionarTipoImagen());
				
				this.tiposColumnasSelect=TipoImagenConstantesFunciones.getTiposSeleccionarTipoImagen(true);
				
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
			//if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoImagen();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoImagen(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoImagen(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoImagen() ;
			
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
				tipoimagenImplementable= (TipoImagenImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoImagenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoimagenImplementableHome= (TipoImagenImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoImagenConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoimagens= new ArrayList<TipoImagen>();
			this.tipoimagensEliminados= new ArrayList<TipoImagen>();
						
			this.isEsNuevoTipoImagen=false;
			this.esParaAccionDesdeFormularioTipoImagen=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoImagen(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoImagen();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoImagenConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoImagen("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoImagen(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoImagen!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoImagen();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoImagen();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoImagen(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoImagen: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoImagen() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoImagen")) {
				iIndex=this.jInternalFrameDetalleFormTipoImagen.jTabbedPaneRelacionesTipoImagen.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoImagen.jTabbedPaneRelacionesTipoImagen.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoImagen();	
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
	
	public void cargarCombosForeignKeyTipoImagen(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoImagen(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoImagen(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoImagenListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoImagen();
		
		this.cargarCombosFrameForeignKeyTipoImagen();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoImagen();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoImagen();
		}
	}
	
	
	
	public void jButtonNuevoTipoImagenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoimagenSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			
			
			if(jTableDatosTipoImagen.getRowCount()>=1) {
				jTableDatosTipoImagen.removeRowSelectionInterval(0, jTableDatosTipoImagen.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoImagen=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoImagen(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoImagen(true);			
			//this.tipoimagen=new TipoImagen();
			//this.tipoimagen.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoImagen(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoImagen() ;
			
			if(TipoImagenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoImagen(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoimagen);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);				
			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			
			if(this.tipoimagenSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoImagen: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoImagenActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoImagen.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoImagen.getSelectedRows().length;			
			}
			
			tipoimagensSeleccionados=this.getTipoImagensSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoImagen--;			
				//TipoImagen tipoimagenAux= new TipoImagen();			
				//tipoimagenAux.setId(this.iIdNuevoTipoImagen);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoImagen tipoimagenOrigen=new TipoImagen();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoImagen tipoimagenOrigen : tipoimagensSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoimagenOrigen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoimagenOrigen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoImagen();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoimagen.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoImagen(tipoimagenOrigen,this.tipoimagen,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(this.tipoimagen);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoimagenLogic.getTipoImagens().add(this.tipoimagenAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoimagens.add(this.tipoimagenAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoImagen(false);
				
				this.jTableDatosTipoImagen.setRowSelectionInterval(this.getIndiceNuevoTipoImagen(), this.getIndiceNuevoTipoImagen());
				
				int iLastRow =  this.jTableDatosTipoImagen.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoImagen.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoImagen.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoImagen(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();									
		
			TipoImagen tipoimagenOrigen=new TipoImagen();
			TipoImagen tipoimagenDestino=new TipoImagen();
				
			tipoimagensSeleccionados=this.getTipoImagensSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoImagen.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoimagensSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoImagen.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimagenOrigen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoimagenOrigen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimagenDestino =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoimagenDestino =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoimagenOrigen =tipoimagensSeleccionados.get(0);
				tipoimagenDestino =tipoimagensSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoImagen(tipoimagenOrigen,tipoimagenDestino,true,false);
				
				tipoimagenDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoimagenDestino,tipoimagenLogic.getTipoImagens());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoimagenDestino,tipoimagens);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoImagen(false);
				
				//this.jTableDatosTipoImagen.setRowSelectionInterval(this.getIndiceNuevoTipoImagen(), this.getIndiceNuevoTipoImagen());
				
				int iLastRow =  this.jTableDatosTipoImagen.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoImagen.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoImagen.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoImagen(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoImagen.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoImagen.isVisible();
			
			
			this.jPanelParametrosReportesTipoImagen.setVisible(!isVisible);
			this.jPanelPaginacionTipoImagen.setVisible(!isVisible);
			this.jPanelAccionesTipoImagen.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoImagen();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoImagen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoImagen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoImagen();
			
			this.abrirFrameOrderByTipoImagen();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoImagen();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoImagen(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoImagen);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoImagen.isMaximum()) {
					this.jInternalFrameDetalleFormTipoImagen.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoImagen.setSize(this.jInternalFrameDetalleFormTipoImagen.iWidthFormulario,this.jInternalFrameDetalleFormTipoImagen.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoImagen.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoImagen.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoImagen.isMaximum()) {
						this.jInternalFrameDetalleFormTipoImagen.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoImagen.jContentPaneDetalleTipoImagen.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoImagen.jTabbedPaneRelacionesTipoImagen.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoImagen.jContentPaneDetalleTipoImagen.getWidth(),TipoImagenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoImagen.jTabbedPaneRelacionesTipoImagen.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoImagen.jContentPaneDetalleTipoImagen.getWidth(),TipoImagenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoImagen.jTabbedPaneRelacionesTipoImagen.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoImagen.jContentPaneDetalleTipoImagen.getWidth(),TipoImagenConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoImagen.setVisible(true);
	        this.jInternalFrameDetalleFormTipoImagen.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoImagen() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoImagen==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoImagen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoImagen,false,this);
				} else {
					this.jInternalFrameOrderByTipoImagen=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoImagen,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoImagen);
				this.jInternalFrameOrderByTipoImagen.setVisible(false);
				this.jInternalFrameOrderByTipoImagen.setSelected(false);
				
				this.jInternalFrameOrderByTipoImagen.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoImagen"));
				
				this.inicializarActualizarBindingTablaOrderByTipoImagen();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoImagen() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoImagen==null) {
				
				this.jInternalFrameImportacionTipoImagen=new ImportacionJInternalFrame(TipoImagenConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoImagen);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoImagen);
				this.jInternalFrameImportacionTipoImagen.setVisible(false);
				this.jInternalFrameImportacionTipoImagen.setSelected(false);


				this.jInternalFrameImportacionTipoImagen.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoImagen"));
				this.jInternalFrameImportacionTipoImagen.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoImagen"));
				this.jInternalFrameImportacionTipoImagen.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoImagen"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoImagen() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoImagen==null) {
				this.jInternalFrameReporteDinamicoTipoImagen=new ReporteDinamicoJInternalFrame(TipoImagenConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoImagen);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoImagen);
				this.jInternalFrameReporteDinamicoTipoImagen.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoImagen.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoImagen.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoImagen"));
				this.jInternalFrameReporteDinamicoTipoImagen.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoImagen"));
				this.jInternalFrameReporteDinamicoTipoImagen.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoImagen"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoImagen();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoImagen() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoImagen);
			
	       	this.jInternalFrameDetalleFormTipoImagen.setVisible(false);
	        this.jInternalFrameDetalleFormTipoImagen.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoImagen.dispose();
			//this.jInternalFrameDetalleFormTipoImagen=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoImagen() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoImagen.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoImagen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoImagen() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoImagen.setVisible(true);
	        this.jInternalFrameImportacionTipoImagen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoImagen() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoImagen.setVisible(true);
	        this.jInternalFrameOrderByTipoImagen.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoImagen() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoImagen.setVisible(false);
	        this.jInternalFrameOrderByTipoImagen.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoImagen() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoImagen.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoImagen.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoImagen() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoImagen.setVisible(false);
	        this.jInternalFrameImportacionTipoImagen.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoImagenActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoImagen(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoImagen(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoImagen(true);
			//this.isEsNuevoTipoImagen=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoimagen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoImagen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoImagen(false) ;
			
			if(tipoimagenSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoImagenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoImagen(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoImagen(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoImagenActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoImagen(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoImagen(true);
			//this.isEsNuevoTipoImagen=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoimagen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoimagen.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoImagen("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoImagen(false) ;
			
			if(TipoImagenJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoImagen(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoImagen(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoImagenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoImagen(false);
			
			//if(!this.isEsNuevoTipoImagen) {								
				int intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoimagen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoImagen(this.tipoimagen,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(this.tipoimagen);
				
			}
			
			if(this.permiteMantenimiento(this.tipoimagen)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoImagen=true;
					this.inicializarActualizarBindingTablaTipoImagen(false);
					this.isEsNuevoTipoImagen=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoImagen=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoImagen=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoImagen(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoImagen(false);
				
				this.habilitarDeshabilitarControlesTipoImagen(false);
			
												
				
				if(TipoImagenJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoImagen();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoImagenActionPerformed(evt,tipoimagenSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoImagen(this.tipoimagen,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoImagen.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoimagenSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoimagen.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoImagen.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagen.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoImagenActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				this.tipoimagen.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoimagen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				this.tipoimagen.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoimagen)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoImagenModel) this.jTableDatosTipoImagen.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoImagen=true;
				this.inicializarActualizarBindingTablaTipoImagen(false);
				this.isEsNuevoTipoImagen=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoImagen(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoImagen(false);
				
				this.habilitarDeshabilitarControlesTipoImagen(false);
				
				
				
				if(TipoImagenJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoImagen();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoImagenActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoImagen.getRowCount()>=1) {
				jTableDatosTipoImagen.removeRowSelectionInterval(0, jTableDatosTipoImagen.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoImagen(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoImagen(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoImagen(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoImagen(false) ;
			
			this.isEsNuevoTipoImagen=false;
			
			if(TipoImagenJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoImagen();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoImagenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoImagen(false);
				
				//SI ES MANUAL
				if(TipoImagenJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoImagen();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoImagenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoImagen--;			
			//TipoImagen tipoimagenAux= new TipoImagen();			
			//tipoimagenAux.setId(this.iIdNuevoTipoImagen);
			
			if(this.jInternalFrameDetalleFormTipoImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoImagen();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(this.tipoimagen);
			
			this.tipoimagen.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoimagenLogic.getTipoImagens().add(this.tipoimagenAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoimagens.add(this.tipoimagenAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoImagen(false);
			
			this.jTableDatosTipoImagen.setRowSelectionInterval(this.getIndiceNuevoTipoImagen(), this.getIndiceNuevoTipoImagen());
			
			int iLastRow =  this.jTableDatosTipoImagen.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoImagen.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoImagen.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoImagen(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoImagenActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoImagen(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoImagen(false);
			
			//SI ES MANUAL
			if(TipoImagenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoImagen();
			}
			
			//this.abrirFrameTreeTipoImagen();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoImagenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo ImagenS ?", "MANTENIMIENTO DE Tipo Imagen", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoImagen.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoImagen();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoimagenReturnGeneral=tipoimagenLogic.procesarImportacionTipoImagensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoimagenParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoImagenReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoImagenActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoImagen.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoImagen.setFileImportacion(this.jInternalFrameImportacionTipoImagen.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoImagen.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoImagen.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoImagen.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoImagen.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoImagenActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();		

		tipoimagensSeleccionados=this.getTipoImagensSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoImagen.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoImagen.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoImagenBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoImagenBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoImagens("Todos",tipoimagensSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoImagen.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImagen.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoImagenConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoImagenConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoImagen.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoImagen.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoImagen.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoImagenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoImagenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoImagen.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoImagenConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoImagenConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoImagen.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImagen.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoImagenConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoImagenConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoImagenActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();		
		
		tipoimagensSeleccionados=this.getTipoImagensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagen";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoImagens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoImagen.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImagen.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoImagenConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoImagenConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoImagen tipoimagen:tipoimagensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoimagen.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoImagenConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoImagenConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoImagen tipoimagen:tipoimagensSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoimagen.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoImagen(row);				
			//	iRow++;
			//}				
			
			//for(TipoImagen tipoimagenAux:tipoimagensSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoImagen(tipoimagenAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoimagenLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoImagen(false);
			
			//SI ES MANUAL
			if(TipoImagenJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoImagen();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoImagenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoImagen(false);
			
			//SI ES MANUAL
			if(TipoImagenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoImagen();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoImagenActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoImagen(false);
			
			//SI ES MANUAL
			if(TipoImagenJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoImagen();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoImagen() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoImagen.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoImagen.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoImagen.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoImagen.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoImagen.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoImagen.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoImagen.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoImagen(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoImagen(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoImagen(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoImagen(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoImagen(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoImagen(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoImagen(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoImagen(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoImagenJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoImagenJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoImagen() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoImagen();
		
		this.inicializarActualizarBindingBotonesManualTipoImagen(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoImagen();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoImagen() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoImagen(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoImagen(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoImagen.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoImagen.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoImagen.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoImagen!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoImagen.jCheckBoxPostAccionNuevoTipoImagen.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoImagen.jCheckBoxPostAccionSinCerrarTipoImagen.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoImagen.jCheckBoxPostAccionSinMensajeTipoImagen.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoImagen.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoImagen.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoImagen.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoImagen!=null) {
				this.jInternalFrameDetalleFormTipoImagen.jCheckBoxPostAccionNuevoTipoImagen.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoImagen.jCheckBoxPostAccionSinCerrarTipoImagen.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoImagen.jCheckBoxPostAccionSinMensajeTipoImagen.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoImagen.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoImagen.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoImagen!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoImagen.jComboBoxTiposAccionesFormularioTipoImagen.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoImagen.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoImagen!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoImagen.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoImagen.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoImagen.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoImagen.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoImagen.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoImagen!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoImagen.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoImagen.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoImagen.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoImagen(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoImagenJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoImagen(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoImagen() throws Exception {
		try	{
			if(TipoImagenJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoImagen();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoImagen() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoImagen.jComboBoxTiposAccionesFormularioTipoImagen.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoImagen.jComboBoxTiposAccionesFormularioTipoImagen.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoImagen() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoImagen.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoImagen.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoImagen.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoImagen.addItem(reporte);
			}
			
			
			if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoImagen.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoImagen.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoImagen.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoImagen.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoImagen.jComboBoxTiposAccionesFormularioTipoImagen.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoImagen.jComboBoxTiposAccionesFormularioTipoImagen.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoImagen.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoImagen.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoImagen.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoImagen();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoImagen() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoImagen!=null) {
				this.jInternalFrameReporteDinamicoTipoImagen.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoImagen.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoImagen!=null) {
				this.jInternalFrameReporteDinamicoTipoImagen.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoImagen.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoImagen!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoImagen.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoImagen.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoImagen.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoImagen.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoImagen.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoImagen.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoImagen()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoImagen(Boolean esInicializar) throws Exception {				
		if(TipoImagenJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoImagen();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoImagen() throws Exception {
		this.inicializarActualizarBindingTablaTipoImagen(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoImagen() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoImagenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoImagenPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoImagenOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImagenOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoImagenPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoImagenPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoImagen(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoimagenLogic.getTipoImagens().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoimagens.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoImagen.setModel(new TipoImagenModel(this.tipoimagenLogic.getTipoImagens(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoImagen.setModel(new TipoImagenModel(this.tipoimagens,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoImagen!=null && this.jInternalFrameOrderByTipoImagen.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoImagen();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImagen,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoImagenPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoImagenConstantesFunciones.SCLASSWEBTITULO,tipoimagenConstantesFunciones.resaltarSeleccionarTipoImagen,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoImagenConstantesFunciones.SCLASSWEBTITULO,tipoimagenConstantesFunciones.resaltarSeleccionarTipoImagen,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImagen,TipoImagenConstantesFunciones.LABEL_ID));

		if(this.tipoimagenConstantesFunciones.mostraridTipoImagen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoImagenConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoimagenConstantesFunciones.resaltaridTipoImagen,this.tipoimagenConstantesFunciones.activaridTipoImagen,this,true,"idTipoImagen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoimagenConstantesFunciones.resaltaridTipoImagen,this.tipoimagenConstantesFunciones.activaridTipoImagen,this,true,"idTipoImagen","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImagen,TipoImagenConstantesFunciones.LABEL_CODIGO));

		if(this.tipoimagenConstantesFunciones.mostrarcodigoTipoImagen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoImagenConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoimagenConstantesFunciones.resaltarcodigoTipoImagen,this.tipoimagenConstantesFunciones.activarcodigoTipoImagen,this,true,"codigoTipoImagen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoimagenConstantesFunciones.resaltarcodigoTipoImagen,this.tipoimagenConstantesFunciones.activarcodigoTipoImagen,this,true,"codigoTipoImagen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoImagenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImagen,TipoImagenConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoimagenConstantesFunciones.mostrarnombreTipoImagen && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoImagenConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoimagenConstantesFunciones.resaltarnombreTipoImagen,this.tipoimagenConstantesFunciones.activarnombreTipoImagen,this,true,"nombreTipoImagen","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoimagenConstantesFunciones.resaltarnombreTipoImagen,this.tipoimagenConstantesFunciones.activarnombreTipoImagen,this,true,"nombreTipoImagen","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoImagenPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoimagenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoimagenSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoImagen.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoimagenSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoimagenSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoImagen.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoImagen && this.isPermisoGuardarCambiosTipoImagen) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoimagenSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoimagenSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoImagen.addColumn(tableColumn);
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
			
			this.jTableDatosTipoImagen.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoImagen && this.isPermisoGuardarCambiosTipoImagen) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoImagen && this.isPermisoGuardarCambiosTipoImagen) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoImagen.moveColumn(this.jTableDatosTipoImagen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoImagen.moveColumn(this.jTableDatosTipoImagen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoImagen.moveColumn(this.jTableDatosTipoImagen.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoImagen.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoImagen.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoImagen,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoImagen.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoImagen.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoImagen.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoImagen.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoImagen.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoimagenLogic.getTipoImagens().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoimagens.size()-1;
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
		//this.jTableDatosTipoImagen.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoImagen.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoImagen();
			
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
				
				//this.isEsNuevoTipoImagen=false;
					
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			
				if(this.tipoimagenSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoImagen==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoImagen.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoImagen.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoimagen.getsType().equals("DUPLICADO")
				   || this.tipoimagen.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoImagen=true;
				
				} else {
					this.isEsNuevoTipoImagen=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoimagen.getId()>=0 && !this.tipoimagen.getIsNew()) {						
						this.isEsNuevoTipoImagen=false;
						
					} else {
						this.isEsNuevoTipoImagen=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoImagen(esRelaciones);						
				
				this.seleccionarTipoImagen(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoimagen.getId()<0) {
					this.isEsNuevoTipoImagen=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoImagen(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoImagen(evt,rowIndex);
				}	
				
				if(this.tipoimagenSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoImagen: " + this.dDif); 
					}
				}								
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoImagen(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoimagen)) {
					if(this.tipoimagen.getId()>0) {
						this.tipoimagen.setIsDeleted(true);
						
						this.tipoimagensEliminados.add(this.tipoimagen);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoimagenLogic.getTipoImagens().remove(this.tipoimagen);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoimagens.remove(this.tipoimagen);				
					}
					
					
					((TipoImagenModel) this.jTableDatosTipoImagen.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoImagen(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoImagen(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoImagen) {
			
			if(this.jInternalFrameDetalleFormTipoImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoImagen.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoImagen.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoImagen(this.tipoimagen);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoImagen("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoImagen(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoImagen() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoImagen(TipoImagen tipoimagen) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoImagen(tipoimagen,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoImagen(TipoImagen tipoimagen,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoImagen(tipoimagen);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoImagen(tipoimagen,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoImagen(tipoimagen);
	}
	
	public void setVariablesObjetoActualToFormularioTipoImagen(TipoImagen tipoimagen) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoImagen.jTextFieldidTipoImagen.setText(tipoimagen.getId().toString());
			this.jInternalFrameDetalleFormTipoImagen.jTextFieldcodigoTipoImagen.setText(tipoimagen.getcodigo());
			this.jInternalFrameDetalleFormTipoImagen.jTextAreanombreTipoImagen.setText(tipoimagen.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoImagen tipoimagenLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoimagenLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoImagen tipoimagenLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoimagenLocal=this.tipoimagen;
			} else {
				tipoimagenLocal=this.tipoimagenAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoimagenLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoImagen(tipoimagenLocal,true);
					
					if(tipoimagenSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoimagenLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoimagenLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoImagen(TipoImagen tipoimagen,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoImagen(tipoimagen,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(tipoimagen);
	}
	
	public void setVariablesFormularioToObjetoActualTipoImagen(TipoImagen tipoimagen,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoImagen(tipoimagen,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoImagen(TipoImagen tipoimagen,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoImagen==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoImagen.jTextFieldidTipoImagen.getText()==null || this.jInternalFrameDetalleFormTipoImagen.jTextFieldidTipoImagen.getText()=="" || this.jInternalFrameDetalleFormTipoImagen.jTextFieldidTipoImagen.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoImagen.jTextFieldidTipoImagen.setText("0");
			}

			if(conColumnasBase) {tipoimagen.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoImagen.jTextFieldidTipoImagen.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoImagenConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImagen.jLabelIdTipoImagen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoimagen.setcodigo(this.jInternalFrameDetalleFormTipoImagen.jTextFieldcodigoTipoImagen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoImagenConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImagen.jLabelcodigoTipoImagen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoimagen.setnombre(this.jInternalFrameDetalleFormTipoImagen.jTextAreanombreTipoImagen.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoImagenConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImagen.jLabelnombreTipoImagen,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoImagen(TipoImagen tipoimagenBean,TipoImagen tipoimagen,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoImagen(TipoImagen tipoimagenOrigen,TipoImagen tipoimagen,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoimagenOrigen.getId()!=null && !tipoimagenOrigen.getId().equals(0L))) {tipoimagen.setId(tipoimagenOrigen.getId());}}
			if(conDefault || (!conDefault && tipoimagenOrigen.getcodigo()!=null && !tipoimagenOrigen.getcodigo().equals(""))) {tipoimagen.setcodigo(tipoimagenOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoimagenOrigen.getnombre()!=null && !tipoimagenOrigen.getnombre().equals(""))) {tipoimagen.setnombre(tipoimagenOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoImagen(TipoImagen tipoimagen) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoImagen.jTextFieldidTipoImagen.setText(tipoimagen.getId().toString());
			this.jInternalFrameDetalleFormTipoImagen.jTextFieldcodigoTipoImagen.setText(tipoimagen.getcodigo());
			this.jInternalFrameDetalleFormTipoImagen.jTextAreanombreTipoImagen.setText(tipoimagen.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoImagen(TipoImagenBean tipoimagenBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoImagen.jTextFieldidTipoImagen.setText(tipoimagenBean.getId().toString());
			this.jInternalFrameDetalleFormTipoImagen.jTextFieldcodigoTipoImagen.setText(tipoimagenBean.getcodigo());
			this.jInternalFrameDetalleFormTipoImagen.jTextAreanombreTipoImagen.setText(tipoimagenBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoImagen(TipoImagenParameterReturnGeneral tipoimagenReturnGeneral,TipoImagenBean tipoimagenBean,Boolean conDefault) throws Exception { 
		try {
			TipoImagen tipoimagenLocal=new TipoImagen();
			
			tipoimagenLocal=tipoimagenReturnGeneral.getTipoImagen();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoimagenLocal.getId()!=null && !tipoimagenLocal.getId().equals(0L))) {tipoimagenBean.setId(tipoimagenLocal.getId());}}
			if(conDefault || (!conDefault && tipoimagenLocal.getcodigo()!=null && !tipoimagenLocal.getcodigo().equals(""))) {tipoimagenBean.setcodigo(tipoimagenLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoimagenLocal.getnombre()!=null && !tipoimagenLocal.getnombre().equals(""))) {tipoimagenBean.setnombre(tipoimagenLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoImagenGenerico(Long idTipoImagenSeleccionado,JComboBox jComboBoxTipoImagen,List<TipoImagen> tipoimagensLocal)throws Exception {
		try {
			TipoImagen  tipoimagenTemp=null;

			for(TipoImagen tipoimagenAux:tipoimagensLocal) {
				if(tipoimagenAux.getId()!=null && tipoimagenAux.getId().equals(idTipoImagenSeleccionado)) {
					tipoimagenTemp=tipoimagenAux;
					break;
				}
			}

			jComboBoxTipoImagen.setSelectedItem(tipoimagenTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoImagenGenerico(JComboBox jComboBoxTipoImagen,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoImagen.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoImagen.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoImagen.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoImagen.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoImagen.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoImagen.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoimagen=(TipoImagen) tipoimagenLogic.getTipoImagens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoimagen =(TipoImagen) tipoimagens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoImagen tipoimagenRow=new TipoImagen();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoimagenRow=(TipoImagen) tipoimagenLogic.getTipoImagens().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoimagenRow=(TipoImagen) tipoimagens.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoImagen(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoImagen.setVisible((this.isVisibilidadCeldaNuevoTipoImagen && this.isPermisoNuevoTipoImagen));			
			this.jButtonDuplicarTipoImagen.setVisible((this.isVisibilidadCeldaDuplicarTipoImagen && this.isPermisoDuplicarTipoImagen));			
			this.jButtonCopiarTipoImagen.setVisible((this.isVisibilidadCeldaCopiarTipoImagen && this.isPermisoCopiarTipoImagen));
			this.jButtonVerFormTipoImagen.setVisible((this.isVisibilidadCeldaVerFormTipoImagen && this.isPermisoVerFormTipoImagen));
			
			this.jButtonAbrirOrderByTipoImagen.setVisible((this.isVisibilidadCeldaOrdenTipoImagen && this.isPermisoOrdenTipoImagen));			
			
			this.jButtonNuevoRelacionesTipoImagen.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoImagen && this.isPermisoNuevoTipoImagen));			
			this.jButtonNuevoGuardarCambiosTipoImagen.setVisible((this.isVisibilidadCeldaNuevoTipoImagen && this.isPermisoNuevoTipoImagen && this.isPermisoGuardarCambiosTipoImagen));
			
			if(this.jInternalFrameDetalleFormTipoImagen!=null) {
			this.jInternalFrameDetalleFormTipoImagen.jButtonModificarTipoImagen.setVisible((this.isVisibilidadCeldaModificarTipoImagen && this.isPermisoActualizarTipoImagen));	
			this.jInternalFrameDetalleFormTipoImagen.jButtonActualizarTipoImagen.setVisible((this.isVisibilidadCeldaActualizarTipoImagen && this.isPermisoActualizarTipoImagen));	
			this.jInternalFrameDetalleFormTipoImagen.jButtonEliminarTipoImagen.setVisible((this.isVisibilidadCeldaEliminarTipoImagen && this.isPermisoEliminarTipoImagen));
			this.jInternalFrameDetalleFormTipoImagen.jButtonCancelarTipoImagen.setVisible(this.isVisibilidadCeldaCancelarTipoImagen);							
			this.jInternalFrameDetalleFormTipoImagen.jButtonGuardarCambiosTipoImagen.setVisible((this.isVisibilidadCeldaGuardarTipoImagen && this.isPermisoGuardarCambiosTipoImagen));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoImagen.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoImagen && this.isPermisoGuardarCambiosTipoImagen));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoImagen.setVisible((this.isVisibilidadCeldaNuevoTipoImagen && this.isPermisoNuevoTipoImagen));						
			this.jButtonDuplicarToolBarTipoImagen.setVisible((this.isVisibilidadCeldaDuplicarTipoImagen && this.isPermisoDuplicarTipoImagen));						
			this.jButtonCopiarToolBarTipoImagen.setVisible((this.isVisibilidadCeldaCopiarTipoImagen && this.isPermisoCopiarTipoImagen));			
			this.jButtonVerFormToolBarTipoImagen.setVisible((this.isVisibilidadCeldaVerFormTipoImagen && this.isPermisoVerFormTipoImagen));			
			this.jButtonAbrirOrderByToolBarTipoImagen.setVisible((this.isVisibilidadCeldaOrdenTipoImagen && this.isPermisoOrdenTipoImagen));
			this.jButtonNuevoRelacionesToolBarTipoImagen.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoImagen && this.isPermisoNuevoTipoImagen));			
			this.jButtonNuevoGuardarCambiosToolBarTipoImagen.setVisible((this.isVisibilidadCeldaNuevoTipoImagen && this.isPermisoNuevoTipoImagen && this.isPermisoGuardarCambiosTipoImagen));			
			
			if(this.jInternalFrameDetalleFormTipoImagen!=null) {
			this.jInternalFrameDetalleFormTipoImagen.jButtonModificarToolBarTipoImagen.setVisible((this.isVisibilidadCeldaModificarTipoImagen && this.isPermisoActualizarTipoImagen));	
			this.jInternalFrameDetalleFormTipoImagen.jButtonActualizarToolBarTipoImagen.setVisible((this.isVisibilidadCeldaActualizarTipoImagen  && this.isPermisoActualizarTipoImagen));	
			this.jInternalFrameDetalleFormTipoImagen.jButtonEliminarToolBarTipoImagen.setVisible((this.isVisibilidadCeldaEliminarTipoImagen && this.isPermisoEliminarTipoImagen));
			this.jInternalFrameDetalleFormTipoImagen.jButtonCancelarToolBarTipoImagen.setVisible(this.isVisibilidadCeldaCancelarTipoImagen);				
			this.jInternalFrameDetalleFormTipoImagen.jButtonGuardarCambiosToolBarTipoImagen.setVisible((this.isVisibilidadCeldaGuardarTipoImagen && this.isPermisoGuardarCambiosTipoImagen));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoImagen.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoImagen && this.isPermisoGuardarCambiosTipoImagen));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoImagen.setVisible((this.isVisibilidadCeldaNuevoTipoImagen && this.isPermisoNuevoTipoImagen));			
			this.jMenuItemDuplicarTipoImagen.setVisible((this.isVisibilidadCeldaDuplicarTipoImagen && this.isPermisoDuplicarTipoImagen));			
			this.jMenuItemCopiarTipoImagen.setVisible((this.isVisibilidadCeldaCopiarTipoImagen && this.isPermisoCopiarTipoImagen));			
			this.jMenuItemVerFormTipoImagen.setVisible((this.isVisibilidadCeldaVerFormTipoImagen && this.isPermisoVerFormTipoImagen));			
			this.jMenuItemAbrirOrderByTipoImagen.setVisible((this.isVisibilidadCeldaOrdenTipoImagen && this.isPermisoOrdenTipoImagen));			
			//this.jMenuItemMostrarOcultarTipoImagen.setVisible((this.isVisibilidadCeldaOrdenTipoImagen && this.isPermisoOrdenTipoImagen));
			this.jMenuItemDetalleAbrirOrderByTipoImagen.setVisible((this.isVisibilidadCeldaOrdenTipoImagen && this.isPermisoOrdenTipoImagen));			
			//this.jMenuItemDetalleMostrarOcultarTipoImagen.setVisible((this.isVisibilidadCeldaOrdenTipoImagen && this.isPermisoOrdenTipoImagen));			
			this.jMenuItemNuevoRelacionesTipoImagen.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoImagen && this.isPermisoNuevoTipoImagen));			
			this.jMenuItemNuevoGuardarCambiosTipoImagen.setVisible((this.isVisibilidadCeldaNuevoTipoImagen && this.isPermisoNuevoTipoImagen && this.isPermisoGuardarCambiosTipoImagen));									
			
			if(this.jInternalFrameDetalleFormTipoImagen!=null) {
			this.jInternalFrameDetalleFormTipoImagen.jMenuItemModificarTipoImagen.setVisible((this.isVisibilidadCeldaModificarTipoImagen && this.isPermisoActualizarTipoImagen));	
			this.jInternalFrameDetalleFormTipoImagen.jMenuItemActualizarTipoImagen.setVisible((this.isVisibilidadCeldaActualizarTipoImagen && this.isPermisoActualizarTipoImagen));	
			this.jInternalFrameDetalleFormTipoImagen.jMenuItemEliminarTipoImagen.setVisible((this.isVisibilidadCeldaEliminarTipoImagen && this.isPermisoEliminarTipoImagen));
			this.jInternalFrameDetalleFormTipoImagen.jMenuItemCancelarTipoImagen.setVisible(this.isVisibilidadCeldaCancelarTipoImagen);				
			}
			
			this.jMenuItemGuardarCambiosTipoImagen.setVisible((this.isVisibilidadCeldaGuardarTipoImagen && this.isPermisoGuardarCambiosTipoImagen));						
			this.jMenuItemGuardarCambiosTablaTipoImagen.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoImagen && this.isPermisoGuardarCambiosTipoImagen));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoImagen=this.jButtonNuevoTipoImagen.isVisible();
			this.isVisibilidadCeldaDuplicarTipoImagen=this.jButtonDuplicarTipoImagen.isVisible();
			this.isVisibilidadCeldaCopiarTipoImagen=this.jButtonCopiarTipoImagen.isVisible();
			this.isVisibilidadCeldaVerFormTipoImagen=this.jButtonVerFormTipoImagen.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoImagen=this.jButtonAbrirOrderByTipoImagen.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoImagen=this.jButtonNuevoRelacionesTipoImagen.isVisible();
			this.isVisibilidadCeldaModificarTipoImagen=this.jButtonModificarTipoImagen.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoImagen!=null) {
			this.isVisibilidadCeldaActualizarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jButtonActualizarTipoImagen.isVisible();
			this.isVisibilidadCeldaEliminarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jButtonEliminarTipoImagen.isVisible();
			this.isVisibilidadCeldaCancelarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jButtonCancelarTipoImagen.isVisible();
			this.isVisibilidadCeldaGuardarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jButtonGuardarCambiosTipoImagen.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoImagen=this.jButtonGuardarCambiosTablaTipoImagen.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoImagen=this.jButtonNuevoToolBarTipoImagen.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoImagen=this.jButtonNuevoRelacionesToolBarTipoImagen.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoImagen!=null) {
			this.isVisibilidadCeldaModificarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jButtonModificarToolBarTipoImagen.isVisible();
			this.isVisibilidadCeldaActualizarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jButtonActualizarToolBarTipoImagen.isVisible();
			this.isVisibilidadCeldaEliminarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jButtonEliminarToolBarTipoImagen.isVisible();
			this.isVisibilidadCeldaCancelarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jButtonCancelarToolBarTipoImagen.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoImagen=this.jButtonGuardarCambiosToolBarTipoImagen.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoImagen=this.jButtonGuardarCambiosTablaToolBarTipoImagen.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoImagen=this.jMenuItemNuevoTipoImagen.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoImagen=this.jMenuItemNuevoRelacionesTipoImagen.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoImagen!=null) {
			this.isVisibilidadCeldaModificarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jMenuItemModificarTipoImagen.isVisible();
			this.isVisibilidadCeldaActualizarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jMenuItemActualizarTipoImagen.isVisible();
			this.isVisibilidadCeldaEliminarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jMenuItemEliminarTipoImagen.isVisible();
			this.isVisibilidadCeldaCancelarTipoImagen=this.jInternalFrameDetalleFormTipoImagen.jMenuItemCancelarTipoImagen.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoImagen=this.jMenuItemGuardarCambiosTipoImagen.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoImagen=this.jMenuItemGuardarCambiosTablaTipoImagen.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoImagen(Boolean esInicializar) {
		if(TipoImagenJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoimagenSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoImagen();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoImagen(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoImagen() {
		this.jButtonNuevoTipoImagen.setVisible(this.isPermisoNuevoTipoImagen);			
		this.jButtonDuplicarTipoImagen.setVisible(this.isPermisoDuplicarTipoImagen);			
		this.jButtonCopiarTipoImagen.setVisible(this.isPermisoCopiarTipoImagen);			
		this.jButtonVerFormTipoImagen.setVisible(this.isPermisoVerFormTipoImagen);			
		
		this.jButtonAbrirOrderByTipoImagen.setVisible(this.isPermisoOrdenTipoImagen);					
		
		this.jButtonNuevoRelacionesTipoImagen.setVisible(this.isPermisoNuevoTipoImagen);			
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.jButtonModificarTipoImagen.setVisible(this.isPermisoActualizarTipoImagen);	
			this.jInternalFrameDetalleFormTipoImagen.jButtonActualizarTipoImagen.setVisible(this.isPermisoActualizarTipoImagen);	
			this.jInternalFrameDetalleFormTipoImagen.jButtonEliminarTipoImagen.setVisible(this.isPermisoEliminarTipoImagen);
			this.jInternalFrameDetalleFormTipoImagen.jButtonCancelarTipoImagen.setVisible(this.isVisibilidadCeldaCancelarTipoImagen);						
			this.jInternalFrameDetalleFormTipoImagen.jButtonGuardarCambiosTipoImagen.setVisible(this.isPermisoGuardarCambiosTipoImagen);							
		}
		
		this.jButtonGuardarCambiosTablaTipoImagen.setVisible(this.isPermisoActualizarTipoImagen);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoImagen() {
		this.jInternalFrameDetalleFormTipoImagen.jButtonModificarTipoImagen.setVisible(this.isPermisoActualizarTipoImagen);	
		this.jInternalFrameDetalleFormTipoImagen.jButtonActualizarTipoImagen.setVisible(this.isPermisoActualizarTipoImagen);	
		this.jInternalFrameDetalleFormTipoImagen.jButtonEliminarTipoImagen.setVisible(this.isPermisoEliminarTipoImagen);
		this.jInternalFrameDetalleFormTipoImagen.jButtonCancelarTipoImagen.setVisible(this.isVisibilidadCeldaCancelarTipoImagen);							
		this.jInternalFrameDetalleFormTipoImagen.jButtonGuardarCambiosTipoImagen.setVisible((this.isVisibilidadCeldaGuardarTipoImagen && this.isPermisoGuardarCambiosTipoImagen));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoImagen() {
		if(TipoImagenJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoImagen();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoImagen() {
	}
	
	public void jTableDatosTipoImagenListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoImagen(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoImagenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoImagen(this.gettipoimagen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(this.tipoimagen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimagen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoimagen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoimagen==null) {
						this.tipoimagen = new TipoImagen();
					}

					this.setVariablesFormularioToObjetoActualTipoImagen(this.tipoimagen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(this.tipoimagen);
				}

				if(this.tipoimagen.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoimagen.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoImagen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoImagenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoImagen(this.gettipoimagen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(this.tipoimagen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimagen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoimagen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoimagen==null) {
						this.tipoimagen = new TipoImagen();
					}

					this.setVariablesFormularioToObjetoActualTipoImagen(this.tipoimagen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(this.tipoimagen);
				}

				if(this.tipoimagen.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoimagen.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoImagen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoImagenBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoImagen(this.gettipoimagen(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(this.tipoimagen);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimagen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoimagen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoimagen==null) {
						this.tipoimagen = new TipoImagen();
					}

					this.setVariablesFormularioToObjetoActualTipoImagen(this.tipoimagen,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(this.tipoimagen);
				}

				if(this.tipoimagen.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoimagen.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoImagen(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoImagen() {
		if(this.jInternalFrameDetalleFormTipoImagen!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) {
			this.jInternalFrameDetalleFormTipoImagen.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoImagen.dispose();
			this.jInternalFrameDetalleFormTipoImagen=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoImagen!=null) {
			this.jInternalFrameReporteDinamicoTipoImagen.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoImagen.dispose();
			this.jInternalFrameReporteDinamicoTipoImagen=null;
		}
		
		if(this.jInternalFrameImportacionTipoImagen!=null) {
			this.jInternalFrameImportacionTipoImagen.setVisible(false);	    			
			this.jInternalFrameImportacionTipoImagen.dispose();
			this.jInternalFrameImportacionTipoImagen=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoImagen();
			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoImagen")) {
				jButtonNuevoTipoImagenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoImagen")) {
				jButtonDuplicarTipoImagenActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoImagen")) {
				jButtonCopiarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoImagen")) {
				jButtonVerFormTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoImagen")) {
				jButtonNuevoTipoImagenActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoImagen")) {
				jButtonDuplicarTipoImagenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoImagen")) {
				jButtonNuevoTipoImagenActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoImagen")) {
				jButtonDuplicarTipoImagenActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoImagen")) {
				jButtonNuevoTipoImagenActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoImagen")) {
				jButtonNuevoTipoImagenActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoImagen")) {
				jButtonNuevoTipoImagenActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoImagen")) {
				jButtonModificarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoImagen")) {
				jButtonModificarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoImagen")) {
				jButtonModificarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoImagen")) {
				jButtonActualizarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoImagen")) {
				jButtonActualizarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoImagen")) {
				jButtonActualizarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoImagen")) {
				jButtonEliminarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoImagen")) {
				jButtonEliminarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoImagen")) {
				jButtonEliminarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoImagen")) {
				jButtonCancelarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoImagen")) {
				jButtonCancelarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoImagen")) {
				jButtonCancelarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoImagen")) {
				jButtonCerrarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoImagen")) {
				jButtonCerrarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoImagen")) {
				jButtonCerrarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoImagen")) {
				jButtonMostrarOcultarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoImagen")) {
				jButtonCancelarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoImagen")) {
				jButtonGuardarCambiosTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoImagen")) {
				jButtonGuardarCambiosTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoImagen")) {
				jButtonCopiarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoImagen")) {
				jButtonVerFormTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoImagen")) {
				jButtonGuardarCambiosTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoImagen")) {
				jButtonCopiarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoImagen")) {
				jButtonVerFormTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoImagen")) {
				jButtonGuardarCambiosTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoImagen")) {
				jButtonGuardarCambiosTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoImagen")) {
				jButtonGuardarCambiosTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoImagen")) {
				jButtonRecargarInformacionTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoImagen")) {
				jButtonRecargarInformacionTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoImagen")) {
				jButtonRecargarInformacionTipoImagenActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoImagen")) {
				jButtonAnterioresTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoImagen")) {
				jButtonAnterioresTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoImagen")) {
				jButtonAnterioresTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoImagen")) {
				jButtonSiguientesTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoImagen")) {
				jButtonSiguientesTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoImagen")) {
				jButtonSiguientesTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoImagen") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoImagen")) {
				jButtonAbrirOrderByTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoImagen") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoImagen")) {
				jButtonMostrarOcultarTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoImagen")) {
				jButtonNuevoGuardarCambiosTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoImagen")) {
				jButtonNuevoGuardarCambiosTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoImagen")) {
				jButtonNuevoGuardarCambiosTipoImagenActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoImagen")) {
				jButtonCerrarReporteDinamicoTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoImagen")) {
				jButtonGenerarReporteDinamicoTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoImagen")) {
				
				jButtonGenerarExcelReporteDinamicoTipoImagenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoImagen")) {
				jButtonCerrarImportacionTipoImagenActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoImagen")) {
				
				jButtonGenerarImportacionTipoImagenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoImagen")) {
				
				jButtonAbrirImportacionTipoImagenActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoImagen")) {
				jComboBoxTiposAccionesTipoImagenActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoImagen")) {
				jComboBoxTiposRelacionesTipoImagenActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoImagen")) {
				jComboBoxTiposAccionesTipoImagenActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoImagen")) {
				
				jComboBoxTiposSeleccionarTipoImagenActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoImagen")) {
				jTextFieldValorCampoGeneralTipoImagenActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoImagen")) {
				jButtonAbrirOrderByTipoImagenActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoImagen")) {
				jButtonAbrirOrderByTipoImagenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoImagen")) {
				jButtonCerrarOrderByTipoImagenActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoImagenBusqueda")) {
				this.jButtonidTipoImagenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoImagenBusqueda")) {
				this.jButtoncodigoTipoImagenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoImagenBusqueda")) {
				this.jButtonnombreTipoImagenBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoImagen();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				


				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoImagen tipoimagenLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoimagenLocal=this.tipoimagen;
			} else {
				tipoimagenLocal=this.tipoimagenAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
							
				
				


				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenAnterior =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagenAnterior =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
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
			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			
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
			
			


			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
								
						
				


				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagen.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
								
				
				


				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenAnterior =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagenAnterior =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenAnterior =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagenAnterior =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
							
				
				


				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagen.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimagenAnterior =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoimagenAnterior =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
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
			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			
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
			
			


			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
								
				
				


				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenAnterior =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagenAnterior =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoImagen")) {
					jCheckBoxSeleccionarTodosTipoImagenItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoImagen")) {
					jCheckBoxSeleccionadosTipoImagenItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoImagen")) {
					
				}
				
				


				
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
												
				
				


				
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagen.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimagenAnterior =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoimagenAnterior =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
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
			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
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
			
			


			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagen.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagen.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagen);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagen);
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
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
				
				


				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagen.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagen.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenAnterior =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagenAnterior =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoImagen")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoImagenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoImagen.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoimagen =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoimagen =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoimagen);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoImagen")) {
				
				}
				
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoImagen")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoImagen.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoImagen")) {
			
			}
			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoImagen();
			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			
			if(sTipo.equals("NuevoTipoImagen")) {
				jButtonNuevoTipoImagenActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoImagen")) {
				jButtonDuplicarTipoImagenActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoImagen")) {
				jButtonCopiarTipoImagenActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoImagen")) {
				jButtonVerFormTipoImagenActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoImagen")) {
				jButtonNuevoTipoImagenActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoImagen")) {
				jButtonModificarTipoImagenActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoImagen")) {
				jButtonActualizarTipoImagenActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoImagen")) {
				jButtonEliminarTipoImagenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoImagen")) {
				jButtonGuardarCambiosTipoImagenActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoImagen")) {
				jButtonCancelarTipoImagenActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoImagen")) {
				jButtonCerrarTipoImagenActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoImagen")) {
				jButtonGuardarCambiosTipoImagenActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoImagen")) {
				jButtonNuevoGuardarCambiosTipoImagenActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoImagen")) {
				jButtonAbrirOrderByTipoImagenActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoImagen")) {
				jButtonRecargarInformacionTipoImagenActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoImagen")) {
				jButtonAnterioresTipoImagenActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoImagen")) {
				jButtonSiguientesTipoImagenActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoImagenBusqueda")) {
				this.jButtonidTipoImagenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoImagenBusqueda")) {
				this.jButtoncodigoTipoImagenBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoImagenBusqueda")) {
				this.jButtonnombreTipoImagenBusquedaActionPerformed(evt);
			}
			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoImagen();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoImagen")) {
				closingInternalFrameTipoImagen();
				
			} else if(sTipo.equals("jButtonCancelarTipoImagen")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoImagen = (JInternalFrameBase)evt.getSource();
	            	
	            TipoImagenBeanSwingJInternalFrame jInternalFrameParent=(TipoImagenBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoImagen.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoImagenActionPerformed(null);
			}
			
			TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoimagen,new Object(),this.tipoimagenParameterGeneral,this.tipoimagenReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoImagen(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoImagen(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoImagen(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoimagen)) {
			if(!esControlTabla) {
				if(TipoImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoImagen(this.tipoimagen,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(this.tipoimagen);			
				}
				
				if(this.tipoimagenSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoImagen(this.tipoimagen,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoimagenReturnGeneral=tipoimagenLogic.procesarEventosTipoImagensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoimagenLogic.getTipoImagens(),this.tipoimagen,this.tipoimagenParameterGeneral,this.isEsNuevoTipoImagen,classes);//this.tipoimagenLogic.getTipoImagen()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoImagen(this.tipoimagenReturnGeneral,this.tipoimagenBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoimagenSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoImagen(classes,this.tipoimagenReturnGeneral,this.tipoimagenBean,false);
					}
						
					if(this.tipoimagenReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoImagen(this.tipoimagenReturnGeneral.getTipoImagen());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoImagen(this.tipoimagenReturnGeneral.getTipoImagen());	
					}
						
					if(this.tipoimagenReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoImagen(this.tipoimagenReturnGeneral.getTipoImagen(),classes);//this.tipoimagenBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoImagen(this.tipoimagen,classes);//this.tipoimagenBean);									
				}
			
				if(TipoImagenJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoImagen(this.tipoimagen,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagen(this.tipoimagen);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoimagenAnterior!=null) {
						this.tipoimagen=this.tipoimagenAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoimagenReturnGeneral=tipoimagenLogic.procesarEventosTipoImagensWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoimagenLogic.getTipoImagens(),this.tipoimagen,this.tipoimagenParameterGeneral,this.isEsNuevoTipoImagen,classes);//this.tipoimagenLogic.getTipoImagen()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoimagenSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoimagenSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoimagenReturnGeneral.getTipoImagen(),tipoimagenLogic.getTipoImagens());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoimagenReturnGeneral.getTipoImagen(),this.tipoimagens);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoImagen.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoImagen.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoImagen();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoImagen() throws Exception {
		
		TipoImagenModel tipoimagenModel=(TipoImagenModel)this.jTableDatosTipoImagen.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoimagenModel.tipoimagens=this.tipoimagenLogic.getTipoImagens();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoimagenModel.tipoimagens=this.tipoimagens;
		}
		
		
		((TipoImagenModel) this.jTableDatosTipoImagen.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoImagen() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoimagenAnterior(),this.tipoimagenLogic.getTipoImagens());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoimagenAnterior(),this.tipoimagens);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoImagen();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoImagen(TipoImagen tipoimagen,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
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
										
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoimagen,new Object(),generalEntityParameterGeneral,this.tipoimagenReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoimagenSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoImagenConstantesFunciones.getClassesRelationshipsOfTipoImagen(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoImagenConstantesFunciones.getClassesRelationshipsFromStringsOfTipoImagen(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoImagen(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoImagenBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoimagen,new Object(),generalEntityParameterGeneral,this.tipoimagenReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoImagen(TipoImagenBean tipoimagenBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoImagen(ArrayList<Classe> classes,TipoImagenReturnGeneral tipoimagenReturnGeneral,TipoImagenBean tipoimagenBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoImagen(TipoImagen tipoimagen,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoimagen)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoImagen = new TipoImagenDetalleFormJInternalFrame(jDesktopPane,this.tipoimagenSessionBean.getConGuardarRelaciones(),this.tipoimagenSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoImagen);
		this.jInternalFrameDetalleFormTipoImagen.setVisible(false);
		this.jInternalFrameDetalleFormTipoImagen.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoImagen.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoImagen.tipoimagenLogic=this.tipoimagenLogic;
		
		this.cargarCombosFrameForeignKeyTipoImagen("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoImagen();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoImagen();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoImagen("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoImagen();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoImagen.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoImagen"));
		
		this.jInternalFrameDetalleFormTipoImagen.jButtonModificarTipoImagen.addActionListener(new ButtonActionListener(this,"ModificarTipoImagen"));

		
		this.jInternalFrameDetalleFormTipoImagen.jButtonModificarToolBarTipoImagen.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoImagen"));
					
		this.jInternalFrameDetalleFormTipoImagen.jMenuItemModificarTipoImagen.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoImagen"));		
		
		
		
		this.jInternalFrameDetalleFormTipoImagen.jButtonActualizarTipoImagen.addActionListener (new ButtonActionListener(this,"ActualizarTipoImagen"));
		
		
		this.jInternalFrameDetalleFormTipoImagen.jButtonActualizarToolBarTipoImagen.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoImagen"));
						
		this.jInternalFrameDetalleFormTipoImagen.jMenuItemActualizarTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoImagen"));		
		
		
		
		this.jInternalFrameDetalleFormTipoImagen.jButtonEliminarTipoImagen.addActionListener (new ButtonActionListener(this,"EliminarTipoImagen"));
		
		
		this.jInternalFrameDetalleFormTipoImagen.jButtonEliminarToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoImagen"));
								
		this.jInternalFrameDetalleFormTipoImagen.jMenuItemEliminarTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoImagen"));		
		
		
		
		this.jInternalFrameDetalleFormTipoImagen.jButtonCancelarTipoImagen.addActionListener (new ButtonActionListener(this,"CancelarTipoImagen"));
		
		
		this.jInternalFrameDetalleFormTipoImagen.jButtonCancelarToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoImagen"));
					
		this.jInternalFrameDetalleFormTipoImagen.jMenuItemCancelarTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoImagen"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoImagen.jMenuItemDetalleCerrarTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoImagen"));		
		
		
		
		this.jInternalFrameDetalleFormTipoImagen.jButtonGuardarCambiosToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoImagen"));
		
		
		
		this.jInternalFrameDetalleFormTipoImagen.jButtonGuardarCambiosToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoImagen"));
		
		
		
		this.jInternalFrameDetalleFormTipoImagen.jComboBoxTiposAccionesFormularioTipoImagen.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoImagen"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagen.jButtonidTipoImagenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoImagenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagen.jButtoncodigoTipoImagenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoImagenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagen.jButtonnombreTipoImagenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoImagenBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoImagen.jTabbedPaneRelacionesTipoImagen.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoImagen"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoImagen"));
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoImagen"));
		}
		
		this.jTableDatosTipoImagen.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoImagen"));
		
		this.jTableDatosTipoImagen.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoImagen"));
		
		this.jButtonNuevoTipoImagen.addActionListener(new ButtonActionListener(this,"NuevoTipoImagen"));
		
		this.jButtonDuplicarTipoImagen.addActionListener(new ButtonActionListener(this,"DuplicarTipoImagen"));
		
		this.jButtonCopiarTipoImagen.addActionListener(new ButtonActionListener(this,"CopiarTipoImagen"));
		
		this.jButtonVerFormTipoImagen.addActionListener(new ButtonActionListener(this,"VerFormTipoImagen"));
		
		
		this.jButtonNuevoToolBarTipoImagen.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoImagen"));
			
		this.jButtonDuplicarToolBarTipoImagen.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoImagen"));
			
		this.jMenuItemNuevoTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoImagen"));
			
		this.jMenuItemDuplicarTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoImagen"));		
		
		
		this.jButtonNuevoRelacionesTipoImagen.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoImagen"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoImagen.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoImagen"));
			
		this.jMenuItemNuevoRelacionesTipoImagen.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoImagen"));		
		
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.jButtonModificarTipoImagen.addActionListener(new ButtonActionListener(this,"ModificarTipoImagen"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.jButtonModificarToolBarTipoImagen.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoImagen"));
			
			this.jInternalFrameDetalleFormTipoImagen.jMenuItemModificarTipoImagen.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoImagen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoImagen.jButtonActualizarTipoImagen.addActionListener (new ButtonActionListener(this,"ActualizarTipoImagen"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.jButtonActualizarToolBarTipoImagen.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoImagen"));
				
			this.jInternalFrameDetalleFormTipoImagen.jMenuItemActualizarTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoImagen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.jButtonEliminarTipoImagen.addActionListener (new ButtonActionListener(this,"EliminarTipoImagen"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.jButtonEliminarToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoImagen"));
						
			this.jInternalFrameDetalleFormTipoImagen.jMenuItemEliminarTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoImagen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.jButtonCancelarTipoImagen.addActionListener (new ButtonActionListener(this,"CancelarTipoImagen"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.jButtonCancelarToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoImagen"));
			
			this.jInternalFrameDetalleFormTipoImagen.jMenuItemCancelarTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoImagen"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoImagen"));		
		
		
		this.jButtonCerrarTipoImagen.addActionListener (new ButtonActionListener(this,"CerrarTipoImagen"));
		
		
		this.jButtonCerrarToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoImagen"));
			
		this.jMenuItemCerrarTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoImagen"));
			
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.jMenuItemDetalleCerrarTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoImagen"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.jButtonGuardarCambiosTipoImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoImagen"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.jButtonGuardarCambiosToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoImagen"));
		}
		
		this.jButtonCopiarToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoImagen"));
			
		this.jButtonVerFormToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoImagen"));
		
		this.jMenuItemGuardarCambiosTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoImagen"));
			
		this.jMenuItemCopiarTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoImagen"));		
		
		this.jMenuItemVerFormTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoImagen"));		
		
		
		this.jButtonGuardarCambiosTablaTipoImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoImagen"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoImagen"));
			
		this.jMenuItemGuardarCambiosTablaTipoImagen.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoImagen"));		
		
		
		
		this.jButtonRecargarInformacionTipoImagen.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoImagen"));
					
		this.jButtonRecargarInformacionToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoImagen"));
		
		this.jMenuItemRecargarInformacionTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoImagen"));		
		
		
		
		this.jButtonAnterioresTipoImagen.addActionListener (new ButtonActionListener(this,"AnterioresTipoImagen"));
		
		
		this.jButtonAnterioresToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoImagen"));
		
		this.jMenuItemAnterioresTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoImagen"));		
		
		
		this.jButtonSiguientesTipoImagen.addActionListener (new ButtonActionListener(this,"SiguientesTipoImagen"));
		
		
		this.jButtonSiguientesToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoImagen"));
			
		this.jMenuItemSiguientesTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoImagen"));
			
		this.jMenuItemAbrirOrderByTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoImagen"));
			
		this.jMenuItemMostrarOcultarTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoImagen"));
			
		this.jMenuItemDetalleAbrirOrderByTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoImagen"));
			
		this.jMenuItemDetalleMostarOcultarTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoImagen"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoImagen.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoImagen"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoImagen"));
			
		this.jMenuItemNuevoGuardarCambiosTipoImagen.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoImagen"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoImagen.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoImagen"));

		this.jCheckBoxSeleccionadosTipoImagen.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoImagen"));
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.jComboBoxTiposAccionesFormularioTipoImagen.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoImagen"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoImagen.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoImagen"));
			
		this.jComboBoxTiposAccionesTipoImagen.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoImagen"));
					
		this.jComboBoxTiposSeleccionarTipoImagen.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoImagen"));
			
		this.jTextFieldValorCampoGeneralTipoImagen.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoImagen"));		
		
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagen.jButtonidTipoImagenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoImagenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagen.jButtoncodigoTipoImagenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoImagenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagen.jButtonnombreTipoImagenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoImagenBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoImagen!=null) {
				this.jInternalFrameReporteDinamicoTipoImagen.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoImagen"));
				this.jInternalFrameReporteDinamicoTipoImagen.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoImagen"));
				this.jInternalFrameReporteDinamicoTipoImagen.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoImagen"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoImagen.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoImagen"));				
			//this.jButtonGenerarReporteDinamicoTipoImagen.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoImagen"));
			//this.jButtonGenerarExcelReporteDinamicoTipoImagen.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoImagen"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoImagen!=null) {
				this.jInternalFrameImportacionTipoImagen.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoImagen"));
				this.jInternalFrameImportacionTipoImagen.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoImagen"));
				this.jInternalFrameImportacionTipoImagen.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoImagen"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoImagen.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoImagen"));
			
			this.jButtonAbrirOrderByToolBarTipoImagen.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoImagen"));			
			
			if(this.jInternalFrameOrderByTipoImagen!=null) {
				this.jInternalFrameOrderByTipoImagen.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoImagen"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoImagen!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagen.jTabbedPaneRelacionesTipoImagen.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoImagen"));
		
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
            		closingInternalFrameTipoImagen();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoImagen.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoImagen = (JInternalFrameBase)event.getSource();
	            	
	            TipoImagenBeanSwingJInternalFrame jInternalFrameParent=(TipoImagenBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoImagen.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoImagenActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoImagen.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoImagenListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoImagen.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoImagen.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImagenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImagenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImagenActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoImagen";
		inputMap = this.jButtonNuevoTipoImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoImagenActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImagenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImagenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImagenActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoImagen";
		inputMap = this.jButtonNuevoRelacionesTipoImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoImagenActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoImagen";
		inputMap = this.jButtonModificarTipoImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoImagenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoImagen";
		inputMap = this.jButtonActualizarTipoImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoImagenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoImagen";
		inputMap = this.jButtonEliminarTipoImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoImagenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoImagen";
		inputMap = this.jButtonCancelarTipoImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoImagenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoImagen";
		inputMap = this.jButtonCerrarTipoImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoImagenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoImagen.jButtonGuardarCambiosTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoImagen";
		inputMap = this.jInternalFrameDetalleFormTipoImagen.jButtonGuardarCambiosTipoImagen.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoImagen.jButtonGuardarCambiosTipoImagen.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoImagenActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoImagen.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoImagenItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoImagen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoImagenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoImagen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoImagenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoImagen.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoImagenActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagen.jButtonidTipoImagenBusqueda.addActionListener(new ButtonActionListener(this,"idTipoImagenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagen.jButtoncodigoTipoImagenBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoImagenBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagen.jButtonnombreTipoImagenBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoImagenBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoImagen.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoImagenActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoImagenActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoImagen.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoImagen(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoImagen tipoimagenAux:this.tipoimagenLogic.getTipoImagens()) {
					tipoimagenAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoImagen tipoimagenAux:tipoimagens) {
					tipoimagenAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoImagenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoImagen(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoImagen tipoimagenAux:this.tipoimagenLogic.getTipoImagens()) {
						tipoimagenAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoImagen tipoimagenAux:tipoimagens) {
						tipoimagenAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoImagen tipoimagenAux:this.tipoimagenLogic.getTipoImagens()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoImagen tipoimagenAux:tipoimagens) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoImagen(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoImagen.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoImagen.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoImagen,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoImagenItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoImagen(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoImagen.getSelectedRows();
			
			TipoImagen tipoimagenLocal=new TipoImagen();
			
			//this.seleccionarTodosTipoImagen(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoimagenLocal =(TipoImagen) this.tipoimagenLogic.getTipoImagens().toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoimagenLocal =(TipoImagen) this.tipoimagens.toArray()[this.jTableDatosTipoImagen.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoimagenLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoImagen tipoimagenAux:this.tipoimagenLogic.getTipoImagens()) {
						tipoimagenAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoImagen tipoimagenAux:tipoimagens) {
						tipoimagenAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoImagen(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoImagen.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoImagen.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoImagen,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoImagenItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoImagenParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoImagenActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoImagen(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoImagen.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoImagen tipoimagenAux:this.tipoimagenLogic.getTipoImagens()) {
				
						if(sTipoSeleccionar.equals(TipoImagenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoimagenAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoImagenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoimagenAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoImagen tipoimagenAux:tipoimagens) {
					
						if(sTipoSeleccionar.equals(TipoImagenConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoimagenAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoImagenConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoimagenAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoImagen(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoImagenActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoImagen(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoImagen=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoImagen.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoImagen.jComboBoxTiposAccionesFormularioTipoImagen.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoImagen) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoImagen(conSplash);
				
					this.generarReporteTipoImagensSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoImagen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoImagen.jComboBoxTiposAccionesFormularioTipoImagen.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoImagensSeleccionados();
				//this.jComboBoxTiposAccionesTipoImagen.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoImagensSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoImagen.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoImagensSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoImagen.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoImagen();
				
				this.exportarTipoImagensSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoImagen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoImagen.jComboBoxTiposAccionesFormularioTipoImagen.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoImagens();
				//this.importarTipoImagens();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoImagen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoImagen.jComboBoxTiposAccionesFormularioTipoImagen.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoImagen();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoImagensSeleccionados();
				//this.jComboBoxTiposAccionesTipoImagen.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Imagen", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoImagen();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoImagen)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoImagen(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Imagen",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoImagen.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoImagen.jComboBoxTiposAccionesFormularioTipoImagen.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoImagen();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoImagen(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoImagenActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoImagen();
			
			if(this.jInternalFrameDetalleFormTipoImagen==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();		
			TipoImagen tipoimagen=new TipoImagen();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoImagen(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoImagen.getSelectedItem();
			
			
			
			
			tipoimagensSeleccionados=this.getTipoImagensSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoimagensSeleccionados.size()==1) {
				for(TipoImagen tipoimagenAux:tipoimagensSeleccionados) {
					tipoimagen=tipoimagenAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoImagen();
			
      		//this.finishProcessTipoImagen(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoImagenReturnGeneral() throws Exception {
		if(this.tipoimagenReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoimagenReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoimagenReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoimagenReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoimagenReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoimagenReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoImagen(false);
		}
		
		if(this.tipoimagenReturnGeneral.getConRetornoLista() || this.tipoimagenReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoimagenReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoimagenLogic.setTipoImagens(this.tipoimagenReturnGeneral.getTipoImagens());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoimagenReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoimagenLogic.setTipoImagen(this.tipoimagenReturnGeneral.getTipoImagen());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoImagen(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoImagen() throws Exception {
		
		
	}
	
	public ArrayList<TipoImagen> getTipoImagensSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoImagen) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoImagen tipoimagenAux:tipoimagenLogic.getTipoImagens()) {
					if(tipoimagenAux.getIsSelected()) {
						tipoimagensSeleccionados.add(tipoimagenAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoImagen tipoimagenAux:this.tipoimagens) {
					if(tipoimagenAux.getIsSelected()) {
						tipoimagensSeleccionados.add(tipoimagenAux);				
					}
				}
			}
			
			if(tipoimagensSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoimagensSeleccionados.addAll(this.tipoimagenLogic.getTipoImagens());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoimagensSeleccionados.addAll(this.tipoimagens);				
					}
				}
			}
		} else {
			tipoimagensSeleccionados.add(this.tipoimagen);
		}
		
		return tipoimagensSeleccionados;
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
	
	public void generarReporteTipoImagensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoImagensSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoImagensSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoImagensSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoImagensSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Imagen",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoImagensSeleccionados() throws Exception {
		ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();		
		
		tipoimagensSeleccionados=this.getTipoImagensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoImagens("Todos",tipoimagensSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoImagensSeleccionados() throws Exception {
		ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();		
		
		tipoimagensSeleccionados=this.getTipoImagensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoImagens("Todos",tipoimagensSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoImagensSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();
		
		tipoimagensSeleccionados=this.getTipoImagensSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoImagens("Todos",tipoimagensSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoImagensSeleccionados() throws Exception {
		ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoImagen();
		
		
		tipoimagensSeleccionados=this.getTipoImagensSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoImagen();
		
		
		//this.generarReporteTipoImagens("Todos",tipoimagensSeleccionados ,tipoimagenImplementable,tipoimagenImplementableHome);
	}
	
	public void mostrarImportacionTipoImagens() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoImagen();
		
		this.abrirFrameImportacionTipoImagen();		
		
			
		//this.generarReporteTipoImagens("Todos",tipoimagensSeleccionados ,tipoimagenImplementable,tipoimagenImplementableHome);
	}
	
	public void importarTipoImagens() throws Exception {		
	
	}
	
	public void exportarTipoImagensSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoImagensSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoImagensSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoImagensSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Imagen",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoImagensSeleccionados() throws Exception {
		ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();		
		
		tipoimagensSeleccionados=this.getTipoImagensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagen."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoImagen(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoImagen tipoimagenAux:tipoimagensSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoImagen(tipoimagenAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoimagenAux.setsDetalleGeneralEntityReporte(tipoimagenAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoImagen(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoImagenConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoImagenConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoImagenConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoImagenConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoImagen(TipoImagen tipoimagen,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoimagen.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoimagen.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoimagen.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoimagen.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoImagensSeleccionados() throws Exception {
		ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();		
		
		tipoimagensSeleccionados=this.getTipoImagensSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagen.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoImagens");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoImagen(row);				
				iRow++;
			}				
			
			for(TipoImagen tipoimagenAux:tipoimagensSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoImagen(tipoimagenAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoImagensSeleccionados() throws Exception {
		ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();		
		
		tipoimagensSeleccionados=this.getTipoImagensSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagen.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoimagens");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoimagen");
			//elementRoot.appendChild(element);
		
			for(TipoImagen tipoimagenAux:tipoimagensSeleccionados) {
				element = document.createElement("tipoimagen");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoImagen(tipoimagenAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoImagen(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoImagenConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoImagenConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoImagenConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoImagenConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoImagen(TipoImagen tipoimagen,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoimagen.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoimagen.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoimagen.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoImagen(TipoImagen tipoimagen,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoImagenConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoimagen.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoImagenConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoimagen.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoImagenConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoimagen.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoImagenConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoimagen.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoImagensSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoImagen> tipoimagensSeleccionados=new ArrayList<TipoImagen>();
		
		tipoimagensSeleccionados=this.getTipoImagensSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoImagen(tipoimagensSeleccionados);
		
		this.generarReporteTipoImagens("Todos",tipoimagensSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoImagen(ArrayList<TipoImagen> tipoimagensSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoImagen tipoimagenAux:tipoimagensSeleccionados) {
				tipoimagenAux.setsDetalleGeneralEntityReporte(tipoimagenAux.toString());
			
				if(sTipoSeleccionar.equals(TipoImagenConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoimagenAux.setsDescripcionGeneralEntityReporte1(tipoimagenAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoImagenConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoimagenAux.setsDescripcionGeneralEntityReporte1(tipoimagenAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoImagen(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoImagen=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoImagen=true;
				this.isVisibilidadCeldaGuardarCambiosTipoImagen=true;
			}
			
			this.isVisibilidadCeldaModificarTipoImagen=false;
			this.isVisibilidadCeldaActualizarTipoImagen=false;
			this.isVisibilidadCeldaEliminarTipoImagen=false;
			this.isVisibilidadCeldaCancelarTipoImagen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagen=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagen=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoImagen=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagen=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagen=false;
			this.isVisibilidadCeldaModificarTipoImagen=false;
			this.isVisibilidadCeldaActualizarTipoImagen=true;
			this.isVisibilidadCeldaEliminarTipoImagen=false;
			this.isVisibilidadCeldaCancelarTipoImagen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagen=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagen=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoImagen=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagen=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagen=false;
			this.isVisibilidadCeldaModificarTipoImagen=false;
			this.isVisibilidadCeldaActualizarTipoImagen=true;
			this.isVisibilidadCeldaEliminarTipoImagen=true;
			this.isVisibilidadCeldaCancelarTipoImagen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagen=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagen=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoImagen=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagen=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagen=false;
			this.isVisibilidadCeldaModificarTipoImagen=false;
			this.isVisibilidadCeldaActualizarTipoImagen=true;
			this.isVisibilidadCeldaEliminarTipoImagen=false;
			this.isVisibilidadCeldaCancelarTipoImagen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagen=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagen=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoImagen=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagen=true;
			this.isVisibilidadCeldaGuardarCambiosTipoImagen=true;
			this.isVisibilidadCeldaModificarTipoImagen=false;
			this.isVisibilidadCeldaActualizarTipoImagen=false;
			this.isVisibilidadCeldaEliminarTipoImagen=false;
			this.isVisibilidadCeldaCancelarTipoImagen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagen=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagen=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoImagen=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagen=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagen=false;
			this.isVisibilidadCeldaActualizarTipoImagen=false;
			this.isVisibilidadCeldaEliminarTipoImagen=false;
			this.isVisibilidadCeldaCancelarTipoImagen=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagen=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagen=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoImagen=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagen=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagen=false;
			this.isVisibilidadCeldaModificarTipoImagen=true;
			this.isVisibilidadCeldaActualizarTipoImagen=false;
			this.isVisibilidadCeldaEliminarTipoImagen=false;
			this.isVisibilidadCeldaCancelarTipoImagen=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagen=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagen=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoImagenJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoImagen=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagen=true;
			this.isVisibilidadCeldaGuardarCambiosTipoImagen=true;
		} else {
			this.actualizarEstadoPanelsTipoImagen(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoImagen=false;
			//this.isVisibilidadCeldaVerFormTipoImagen=false;
			this.isVisibilidadCeldaDuplicarTipoImagen=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoimagenSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoImagen=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoImagen=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagen=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoimagenSessionBean.getEsGuardarRelacionado()) {
			if(!tipoimagenSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoImagen=false;												
			}
			
			this.jButtonCerrarTipoImagen.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoImagen=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoimagen)) {
			this.isVisibilidadCeldaActualizarTipoImagen=false;
			this.isVisibilidadCeldaEliminarTipoImagen=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoImagen() {
	}
	
	public void actualizarEstadoPanelsTipoImagen(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoImagen!=null) {
				this.jScrollPanelDatosEdicionTipoImagen.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoImagen!=null) {
				this.jScrollPanelDatosTipoImagen.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoImagen!=null) {
				this.jPanelPaginacionTipoImagen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoImagen!=null) {
				this.jPanelParametrosReportesTipoImagen.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoImagen!=null) {
				this.jScrollPanelDatosEdicionTipoImagen.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoImagen!=null) {
				this.jScrollPanelDatosTipoImagen.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoImagen!=null) {
				this.jPanelPaginacionTipoImagen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoImagen!=null) {
				this.jPanelParametrosReportesTipoImagen.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoImagen!=null) {
				this.jScrollPanelDatosEdicionTipoImagen.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoImagen!=null) {
				this.jScrollPanelDatosTipoImagen.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoImagen!=null) {
				this.jPanelPaginacionTipoImagen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoImagen!=null) {
				this.jPanelParametrosReportesTipoImagen.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoImagen!=null) {
				this.jScrollPanelDatosEdicionTipoImagen.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoImagen!=null) {
				this.jScrollPanelDatosTipoImagen.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoImagen!=null) {
				this.jPanelPaginacionTipoImagen.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoImagen!=null) {
				this.jPanelParametrosReportesTipoImagen.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoImagen!=null) {
				this.jScrollPanelDatosEdicionTipoImagen.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoImagen!=null) {
				this.jScrollPanelDatosTipoImagen.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoImagen!=null) {
				this.jPanelPaginacionTipoImagen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoImagen!=null) {
				this.jPanelParametrosReportesTipoImagen.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoImagen!=null) {
				this.jScrollPanelDatosEdicionTipoImagen.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoImagen!=null) {
				this.jScrollPanelDatosTipoImagen.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoImagen!=null) {
				this.jPanelPaginacionTipoImagen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoImagen!=null) {
				this.jPanelParametrosReportesTipoImagen.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoImagen!=null) {
				this.jScrollPanelDatosEdicionTipoImagen.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoImagen!=null) {
				this.jScrollPanelDatosTipoImagen.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoImagen!=null) {
				this.jPanelPaginacionTipoImagen.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoImagen!=null) {
				this.jPanelParametrosReportesTipoImagen.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoimagenSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoImagenSessionBean tipoimagenSessionBean=new TipoImagenSessionBean();
		
		if(this.tipoimagenSessionBean==null) {
			this.tipoimagenSessionBean=new TipoImagenSessionBean();
		}
		
		this.tipoimagenSessionBean.setsUltimaBusquedaTipoImagen(this.getsAccionBusqueda());
		this.tipoimagenSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoimagenSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoImagenSessionBean tipoimagenSessionBean=new TipoImagenSessionBean();
		
		if(this.tipoimagenSessionBean==null) {
			this.tipoimagenSessionBean=new TipoImagenSessionBean();
		}
		
		if(this.tipoimagenSessionBean.getsUltimaBusquedaTipoImagen()!=null&&!this.tipoimagenSessionBean.getsUltimaBusquedaTipoImagen().equals("")) {
			this.setsAccionBusqueda(tipoimagenSessionBean.getsUltimaBusquedaTipoImagen());
			this.setiNumeroPaginacion(tipoimagenSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoimagenSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoimagenSessionBean.setsUltimaBusquedaTipoImagen("");
		this.tipoimagenSessionBean.setiNumeroPaginacion(TipoImagenConstantesFunciones.INUMEROPAGINACION);
		this.tipoimagenSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoImagen(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoImagen() {
		this.updateBorderResaltarBusquedasFormularioTipoImagen();
		this.updateVisibilidadBusquedasFormularioTipoImagen();
		this.updateHabilitarBusquedasFormularioTipoImagen();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoImagen() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoImagen() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoImagen() {
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
	
	public void updateControlesFormularioTipoImagen() throws Exception {

		if(this.jInternalFrameDetalleFormTipoImagen==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoImagen();
		this.updateVisibilidadResaltarControlesFormularioTipoImagen();
		this.updateHabilitarResaltarControlesFormularioTipoImagen();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoImagen() throws Exception {
		if(this.jInternalFrameDetalleFormTipoImagen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoimagenConstantesFunciones.resaltaridTipoImagen!=null && this.jInternalFrameDetalleFormTipoImagen!=null) {this.jInternalFrameDetalleFormTipoImagen.jTextFieldidTipoImagen.setBorder(this.tipoimagenConstantesFunciones.resaltaridTipoImagen);}
		if(this.tipoimagenConstantesFunciones.resaltarcodigoTipoImagen!=null && this.jInternalFrameDetalleFormTipoImagen!=null) {this.jInternalFrameDetalleFormTipoImagen.jTextFieldcodigoTipoImagen.setBorder(this.tipoimagenConstantesFunciones.resaltarcodigoTipoImagen);}
		if(this.tipoimagenConstantesFunciones.resaltarnombreTipoImagen!=null && this.jInternalFrameDetalleFormTipoImagen!=null) {this.jInternalFrameDetalleFormTipoImagen.jTextAreanombreTipoImagen.setBorder(this.tipoimagenConstantesFunciones.resaltarnombreTipoImagen);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoImagen() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoImagen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) {
	
		//this.jInternalFrameDetalleFormTipoImagen.jTextFieldidTipoImagen.setVisible(this.tipoimagenConstantesFunciones.mostraridTipoImagen);
		this.jInternalFrameDetalleFormTipoImagen.jPanelidTipoImagen.setVisible(this.tipoimagenConstantesFunciones.mostraridTipoImagen);
		//this.jInternalFrameDetalleFormTipoImagen.jTextFieldcodigoTipoImagen.setVisible(this.tipoimagenConstantesFunciones.mostrarcodigoTipoImagen);
		this.jInternalFrameDetalleFormTipoImagen.jPanelcodigoTipoImagen.setVisible(this.tipoimagenConstantesFunciones.mostrarcodigoTipoImagen);
		//this.jInternalFrameDetalleFormTipoImagen.jTextAreanombreTipoImagen.setVisible(this.tipoimagenConstantesFunciones.mostrarnombreTipoImagen);
		this.jInternalFrameDetalleFormTipoImagen.jPanelnombreTipoImagen.setVisible(this.tipoimagenConstantesFunciones.mostrarnombreTipoImagen);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoImagen() throws Exception {
		if(this.jInternalFrameDetalleFormTipoImagen==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoImagen!=null) {
	
		this.jInternalFrameDetalleFormTipoImagen.jTextFieldidTipoImagen.setEnabled(this.tipoimagenConstantesFunciones.activaridTipoImagen);
		this.jInternalFrameDetalleFormTipoImagen.jTextFieldcodigoTipoImagen.setEnabled(this.tipoimagenConstantesFunciones.activarcodigoTipoImagen);
		this.jInternalFrameDetalleFormTipoImagen.jTextAreanombreTipoImagen.setEnabled(this.tipoimagenConstantesFunciones.activarnombreTipoImagen);
		}
	}
	
		
}