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

import com.bydan.erp.seguridad.util.TipoImagenPersonaConstantesFunciones;
import com.bydan.erp.seguridad.util.TipoImagenPersonaParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.TipoImagenPersonaParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.TipoImagenPersonaBean;
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
public class TipoImagenPersonaBeanSwingJInternalFrame extends TipoImagenPersonaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoImagenPersonaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoImagenPersona> tipoimagenpersonaValidator = new ClassValidator<TipoImagenPersona>(TipoImagenPersona.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoImagenPersona tipoimagenpersona;	
	public TipoImagenPersona tipoimagenpersonaAux;
	public TipoImagenPersona tipoimagenpersonaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoImagenPersona tipoimagenpersonaTotales;
	public Long idTipoImagenPersonaActual;
	public Long iIdNuevoTipoImagenPersona=0L;
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
	
	public Boolean isPermisoTodoTipoImagenPersona;
	public Boolean isPermisoNuevoTipoImagenPersona;
	public Boolean isPermisoActualizarTipoImagenPersona;
	public Boolean isPermisoActualizarOriginalTipoImagenPersona;
	public Boolean isPermisoEliminarTipoImagenPersona;
	public Boolean isPermisoGuardarCambiosTipoImagenPersona;
	public Boolean isPermisoConsultaTipoImagenPersona;
	public Boolean isPermisoBusquedaTipoImagenPersona;
	public Boolean isPermisoReporteTipoImagenPersona;
	public Boolean isPermisoPaginacionMedioTipoImagenPersona;
	public Boolean isPermisoPaginacionAltoTipoImagenPersona;
	public Boolean isPermisoPaginacionTodoTipoImagenPersona;
	public Boolean isPermisoCopiarTipoImagenPersona;
	public Boolean isPermisoVerFormTipoImagenPersona;
	public Boolean isPermisoDuplicarTipoImagenPersona;
	public Boolean isPermisoOrdenTipoImagenPersona;
	
	
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
	
	public TipoImagenPersonaParameterReturnGeneral tipoimagenpersonaReturnGeneral;
	public TipoImagenPersonaParameterReturnGeneral tipoimagenpersonaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoImagenPersona=false;
	public Boolean esParaAccionDesdeFormularioTipoImagenPersona=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoImagenPersonaLogic tipoimagenpersonaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoImagenPersona tipoimagenpersonaBean;
	public TipoImagenPersonaConstantesFunciones tipoimagenpersonaConstantesFunciones;
	//public TipoImagenPersonaParameterReturnGeneral tipoimagenpersonaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoImagenPersona> tipoimagenpersonas;	
	//public List<TipoImagenPersona> tipoimagenpersonasEliminados;
	//public List<TipoImagenPersona> tipoimagenpersonasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoImagenPersona=false;
	public Boolean isVisibilidadCeldaDuplicarTipoImagenPersona=true;
	public Boolean isVisibilidadCeldaCopiarTipoImagenPersona=true;
	public Boolean isVisibilidadCeldaVerFormTipoImagenPersona=true;
	public Boolean isVisibilidadCeldaOrdenTipoImagenPersona=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=false;
	public Boolean isVisibilidadCeldaModificarTipoImagenPersona=false;
	public Boolean isVisibilidadCeldaActualizarTipoImagenPersona=false;
	public Boolean isVisibilidadCeldaEliminarTipoImagenPersona=false;
	public Boolean isVisibilidadCeldaCancelarTipoImagenPersona=false;
	public Boolean isVisibilidadCeldaGuardarTipoImagenPersona=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoImagenPersona=false;	
	
	
	
	public Long getiIdNuevoTipoImagenPersona() {
		return this.iIdNuevoTipoImagenPersona;
	}

	public void setiIdNuevoTipoImagenPersona(Long iIdNuevoTipoImagenPersona) {
		this.iIdNuevoTipoImagenPersona = iIdNuevoTipoImagenPersona;
	}
	
	public Long getidTipoImagenPersonaActual() {
		return this.idTipoImagenPersonaActual;
	}

	public void setidTipoImagenPersonaActual(Long idTipoImagenPersonaActual) {
		this.idTipoImagenPersonaActual = idTipoImagenPersonaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoImagenPersona gettipoimagenpersona() {
		return this.tipoimagenpersona;
	}

	public void settipoimagenpersona(TipoImagenPersona tipoimagenpersona) {
		this.tipoimagenpersona = tipoimagenpersona;
	}
	
	public TipoImagenPersona gettipoimagenpersonaAux() {
		return this.tipoimagenpersonaAux;
	}

	public void settipoimagenpersonaAux(TipoImagenPersona tipoimagenpersonaAux) {
		this.tipoimagenpersonaAux = tipoimagenpersonaAux;
	}				
	
	public TipoImagenPersona gettipoimagenpersonaAnterior() {
		return this.tipoimagenpersonaAnterior;
	}

	public void settipoimagenpersonaAnterior(TipoImagenPersona tipoimagenpersonaAnterior) {
		this.tipoimagenpersonaAnterior = tipoimagenpersonaAnterior;
	}	
	
	public TipoImagenPersona gettipoimagenpersonaTotales() {
		return this.tipoimagenpersonaTotales;
	}

	public void settipoimagenpersonaTotales(TipoImagenPersona tipoimagenpersonaTotales) {
		this.tipoimagenpersonaTotales = tipoimagenpersonaTotales;
	}	
	
	public TipoImagenPersona gettipoimagenpersonaBean() {
		return this.tipoimagenpersonaBean;
	}

	public void settipoimagenpersonaBean(TipoImagenPersona tipoimagenpersonaBean) {
		this.tipoimagenpersonaBean = tipoimagenpersonaBean;
	}	
	
	public TipoImagenPersonaParameterReturnGeneral gettipoimagenpersonaReturnGeneral() {
		return this.tipoimagenpersonaReturnGeneral;
	}

	public void settipoimagenpersonaReturnGeneral(TipoImagenPersonaParameterReturnGeneral tipoimagenpersonaReturnGeneral) {
		this.tipoimagenpersonaReturnGeneral = tipoimagenpersonaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoImagenPersonaLogic getTipoImagenPersonaLogic()	{		
		return tipoimagenpersonaLogic;
	}

	public void setTipoImagenPersonaLogic(TipoImagenPersonaLogic tipoimagenpersonaLogic) {
		this.tipoimagenpersonaLogic = tipoimagenpersonaLogic;
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
	
	public Boolean getIsEsNuevoTipoImagenPersona() {
		return isEsNuevoTipoImagenPersona;
	}

	public void setIsEsNuevoTipoImagenPersona(Boolean isEsNuevoTipoImagenPersona) {
		this.isEsNuevoTipoImagenPersona = isEsNuevoTipoImagenPersona;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoImagenPersona() {
		return esParaAccionDesdeFormularioTipoImagenPersona;
	}
	
	public void setEsParaAccionDesdeFormularioTipoImagenPersona(Boolean esParaAccionDesdeFormularioTipoImagenPersona) {
		this.esParaAccionDesdeFormularioTipoImagenPersona = esParaAccionDesdeFormularioTipoImagenPersona;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoImagenPersona() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoImagenPersonaConstantesFunciones.refrescarForeignKeysDescripcionesTipoImagenPersona(this.tipoimagenpersonaLogic.getTipoImagenPersonas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoImagenPersonaConstantesFunciones.refrescarForeignKeysDescripcionesTipoImagenPersona(this.tipoimagenpersonas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoimagenpersonaLogic.setTipoImagenPersonas(this.tipoimagenpersonas);
			tipoimagenpersonaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoImagenPersonaParameterReturnGeneral getTipoImagenPersonaParameterGeneral() {
		return this.tipoimagenpersonaParameterGeneral;
	}
	
	public void setTipoImagenPersonaParameterGeneral(TipoImagenPersonaParameterReturnGeneral tipoimagenpersonaParameterGeneral) {
		this.tipoimagenpersonaParameterGeneral = tipoimagenpersonaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoImagenPersona() {
		return isPermisoTodoTipoImagenPersona;
	}

	public void setIsPermisoTodoTipoImagenPersona(Boolean isPermisoTodoTipoImagenPersona) {
		this.isPermisoTodoTipoImagenPersona = isPermisoTodoTipoImagenPersona;
	}

	public Boolean getIsPermisoNuevoTipoImagenPersona() {
		return isPermisoNuevoTipoImagenPersona;
	}

	public void setIsPermisoNuevoTipoImagenPersona(Boolean isPermisoNuevoTipoImagenPersona) {
		this.isPermisoNuevoTipoImagenPersona = isPermisoNuevoTipoImagenPersona;
	}

	public Boolean getIsPermisoActualizarTipoImagenPersona() {
		return isPermisoActualizarTipoImagenPersona;
	}

	public void setIsPermisoActualizarTipoImagenPersona(Boolean isPermisoActualizarTipoImagenPersona) {
		this.isPermisoActualizarTipoImagenPersona = isPermisoActualizarTipoImagenPersona;
	}

	public Boolean getIsPermisoEliminarTipoImagenPersona() {
		return isPermisoEliminarTipoImagenPersona;
	}

	public void setIsPermisoEliminarTipoImagenPersona(Boolean isPermisoEliminarTipoImagenPersona) {
		this.isPermisoEliminarTipoImagenPersona = isPermisoEliminarTipoImagenPersona;
	}

	public Boolean getIsPermisoGuardarCambiosTipoImagenPersona() {
		return isPermisoGuardarCambiosTipoImagenPersona;
	}

	public void setIsPermisoGuardarCambiosTipoImagenPersona(Boolean isPermisoGuardarCambiosTipoImagenPersona) {
		this.isPermisoGuardarCambiosTipoImagenPersona = isPermisoGuardarCambiosTipoImagenPersona;
	}
	
	public Boolean getIsPermisoConsultaTipoImagenPersona() {
		return isPermisoConsultaTipoImagenPersona;
	}

	public void setIsPermisoConsultaTipoImagenPersona(Boolean isPermisoConsultaTipoImagenPersona) {
		this.isPermisoConsultaTipoImagenPersona = isPermisoConsultaTipoImagenPersona;
	}

	public Boolean getIsPermisoBusquedaTipoImagenPersona() {
		return isPermisoBusquedaTipoImagenPersona;
	}

	public void setIsPermisoBusquedaTipoImagenPersona(Boolean isPermisoBusquedaTipoImagenPersona) {
		this.isPermisoBusquedaTipoImagenPersona = isPermisoBusquedaTipoImagenPersona;
	}

	public Boolean getIsPermisoReporteTipoImagenPersona() {
		return isPermisoReporteTipoImagenPersona;
	}

	public void setIsPermisoReporteTipoImagenPersona(Boolean isPermisoReporteTipoImagenPersona) {
		this.isPermisoReporteTipoImagenPersona = isPermisoReporteTipoImagenPersona;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoImagenPersona() {
		return isPermisoPaginacionMedioTipoImagenPersona;
	}

	public void setIsPermisoPaginacionMedioTipoImagenPersona(Boolean isPermisoPaginacionMedioTipoImagenPersona) {
		this.isPermisoPaginacionMedioTipoImagenPersona = isPermisoPaginacionMedioTipoImagenPersona;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoImagenPersona() {
		return isPermisoPaginacionTodoTipoImagenPersona;
	}

	public void setIsPermisoPaginacionTodoTipoImagenPersona(Boolean isPermisoPaginacionTodoTipoImagenPersona) {
		this.isPermisoPaginacionTodoTipoImagenPersona = isPermisoPaginacionTodoTipoImagenPersona;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoImagenPersona() {
		return isPermisoPaginacionAltoTipoImagenPersona;
	}

	public void setIsPermisoPaginacionAltoTipoImagenPersona(Boolean isPermisoPaginacionAltoTipoImagenPersona) {
		this.isPermisoPaginacionAltoTipoImagenPersona = isPermisoPaginacionAltoTipoImagenPersona;
	}
	
	public Boolean getIsPermisoCopiarTipoImagenPersona() {
		return isPermisoCopiarTipoImagenPersona;
	}

	public void setIsPermisoCopiarTipoImagenPersona(Boolean isPermisoCopiarTipoImagenPersona) {
		this.isPermisoCopiarTipoImagenPersona = isPermisoCopiarTipoImagenPersona;
	}
	
	public Boolean getIsPermisoVerFormTipoImagenPersona() {
		return isPermisoVerFormTipoImagenPersona;
	}

	public void setIsPermisoVerFormTipoImagenPersona(Boolean isPermisoVerFormTipoImagenPersona) {
		this.isPermisoVerFormTipoImagenPersona = isPermisoVerFormTipoImagenPersona;
	}
	
	public Boolean getIsPermisoDuplicarTipoImagenPersona() {
		return isPermisoDuplicarTipoImagenPersona;
	}

	public void setIsPermisoDuplicarTipoImagenPersona(Boolean isPermisoDuplicarTipoImagenPersona) {
		this.isPermisoDuplicarTipoImagenPersona = isPermisoDuplicarTipoImagenPersona;
	}
	
	public Boolean getIsPermisoOrdenTipoImagenPersona() {
		return isPermisoOrdenTipoImagenPersona;
	}

	public void setIsPermisoOrdenTipoImagenPersona(Boolean isPermisoOrdenTipoImagenPersona) {
		this.isPermisoOrdenTipoImagenPersona = isPermisoOrdenTipoImagenPersona;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoImagenPersona() {
		return isVisibilidadCeldaNuevoTipoImagenPersona;
	}

	public void setIsVisibilidadCeldaNuevoTipoImagenPersona(Boolean isVisibilidadCeldaNuevoTipoImagenPersona) {
		this.isVisibilidadCeldaNuevoTipoImagenPersona = isVisibilidadCeldaNuevoTipoImagenPersona;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoImagenPersona() {
		return isVisibilidadCeldaDuplicarTipoImagenPersona;
	}

	public void setIsVisibilidadCeldaDuplicarTipoImagenPersona(Boolean isVisibilidadCeldaDuplicarTipoImagenPersona) {
		this.isVisibilidadCeldaDuplicarTipoImagenPersona = isVisibilidadCeldaDuplicarTipoImagenPersona;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoImagenPersona() {
		return isVisibilidadCeldaCopiarTipoImagenPersona;
	}

	public void setIsVisibilidadCeldaCopiarTipoImagenPersona(Boolean isVisibilidadCeldaCopiarTipoImagenPersona) {
		this.isVisibilidadCeldaCopiarTipoImagenPersona = isVisibilidadCeldaCopiarTipoImagenPersona;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoImagenPersona() {
		return isVisibilidadCeldaVerFormTipoImagenPersona;
	}

	public void setIsVisibilidadCeldaVerFormTipoImagenPersona(Boolean isVisibilidadCeldaVerFormTipoImagenPersona) {
		this.isVisibilidadCeldaVerFormTipoImagenPersona = isVisibilidadCeldaVerFormTipoImagenPersona;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoImagenPersona() {
		return isVisibilidadCeldaOrdenTipoImagenPersona;
	}

	public void setIsVisibilidadCeldaOrdenTipoImagenPersona(Boolean isVisibilidadCeldaOrdenTipoImagenPersona) {
		this.isVisibilidadCeldaOrdenTipoImagenPersona = isVisibilidadCeldaOrdenTipoImagenPersona;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoImagenPersona() {
		return isVisibilidadCeldaNuevoRelacionesTipoImagenPersona;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoImagenPersona(Boolean isVisibilidadCeldaNuevoRelacionesTipoImagenPersona) {
		this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona = isVisibilidadCeldaNuevoRelacionesTipoImagenPersona;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoImagenPersona() {
		return isVisibilidadCeldaModificarTipoImagenPersona;
	}

	public void setIsVisibilidadCeldaModificarTipoImagenPersona(Boolean isVisibilidadCeldaModificarTipoImagenPersona) {
		this.isVisibilidadCeldaModificarTipoImagenPersona = isVisibilidadCeldaModificarTipoImagenPersona;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoImagenPersona() {
		return isVisibilidadCeldaActualizarTipoImagenPersona;
	}

	public void setIsVisibilidadCeldaActualizarTipoImagenPersona(Boolean isVisibilidadCeldaActualizarTipoImagenPersona) {
		this.isVisibilidadCeldaActualizarTipoImagenPersona = isVisibilidadCeldaActualizarTipoImagenPersona;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoImagenPersona() {
		return isVisibilidadCeldaEliminarTipoImagenPersona;
	}

	public void setIsVisibilidadCeldaEliminarTipoImagenPersona(Boolean isVisibilidadCeldaEliminarTipoImagenPersona) {
		this.isVisibilidadCeldaEliminarTipoImagenPersona = isVisibilidadCeldaEliminarTipoImagenPersona;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoImagenPersona() {
		return isVisibilidadCeldaCancelarTipoImagenPersona;
	}

	public void setIsVisibilidadCeldaCancelarTipoImagenPersona(Boolean isVisibilidadCeldaCancelarTipoImagenPersona) {
		this.isVisibilidadCeldaCancelarTipoImagenPersona = isVisibilidadCeldaCancelarTipoImagenPersona;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoImagenPersona() {
		return isVisibilidadCeldaGuardarTipoImagenPersona;
	}

	public void setIsVisibilidadCeldaGuardarTipoImagenPersona(Boolean isVisibilidadCeldaGuardarTipoImagenPersona) {
		this.isVisibilidadCeldaGuardarTipoImagenPersona = isVisibilidadCeldaGuardarTipoImagenPersona;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoImagenPersona() {
		return isVisibilidadCeldaGuardarCambiosTipoImagenPersona;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoImagenPersona(Boolean isVisibilidadCeldaGuardarCambiosTipoImagenPersona) {
		this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona = isVisibilidadCeldaGuardarCambiosTipoImagenPersona;
	}
		
	public TipoImagenPersonaSessionBean gettipoimagenpersonaSessionBean() {
		return this.tipoimagenpersonaSessionBean;
	}
	
	public void settipoimagenpersonaSessionBean(TipoImagenPersonaSessionBean tipoimagenpersonaSessionBean) {
		this.tipoimagenpersonaSessionBean=tipoimagenpersonaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(TipoImagenPersona tipoimagenpersona)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoImagenPersona tipoimagenpersona,TipoImagenPersona tipoimagenpersonaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoImagenPersona(tipoimagenpersona);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoimagenpersonaAux.setId(tipoimagenpersona.getId());
		tipoimagenpersonaAux.setVersionRow(tipoimagenpersona.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoImagenPersona();
		
			int intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoImagenPersona(this.tipoimagenpersona,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(this.tipoimagenpersona);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoimagenpersonaValidator.getInvalidValues(this.tipoimagenpersona);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoimagenpersonaLogic.setDatosCliente(datosCliente);
			tipoimagenpersonaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoimagenpersonaAux=new  TipoImagenPersona();
				
				tipoimagenpersonaAux.setIsNew(true);
				tipoimagenpersonaAux.setIsChanged(true);
				
				tipoimagenpersonaAux.setTipoImagenPersonaOriginal(this.tipoimagenpersona);
				
				tipoimagenpersonaAux.setId(this.tipoimagenpersona.getId());	
				tipoimagenpersonaAux.setVersionRow(this.tipoimagenpersona.getVersionRow());	
				tipoimagenpersonaAux.setcodigo(this.tipoimagenpersona.getcodigo());	
				tipoimagenpersonaAux.setnombre(this.tipoimagenpersona.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoimagenpersonaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoimagenpersonaAux,tipoimagenpersonaLogic.getTipoImagenPersonas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoimagenpersonaAux,tipoimagenpersonas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoimagenpersonaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimagenpersonaLogic.saveTipoImagenPersonas();//WithConnection
						//tipoimagenpersonaLogic.getSetVersionRowTipoImagenPersonas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoimagenpersona,tipoimagenpersonaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoimagenpersonaAux=new  TipoImagenPersona();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado() && this.tipoimagenpersona.getId()>=0)) {
						
					tipoimagenpersonaAux.setIsNew(false);
				}
				
				tipoimagenpersonaAux.setIsDeleted(false);
			
				tipoimagenpersonaAux.setId(this.tipoimagenpersona.getId());	
				tipoimagenpersonaAux.setVersionRow(this.tipoimagenpersona.getVersionRow());	
				tipoimagenpersonaAux.setcodigo(this.tipoimagenpersona.getcodigo());	
				tipoimagenpersonaAux.setnombre(this.tipoimagenpersona.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoimagenpersonaAux,tipoimagenpersonaLogic.getTipoImagenPersonas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoimagenpersonaAux,tipoimagenpersonas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoimagenpersonaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimagenpersonaLogic.saveTipoImagenPersonas();//WithConnection
						//tipoimagenpersonaLogic.getSetVersionRowTipoImagenPersonas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoimagenpersona,tipoimagenpersonaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoimagenpersonaAux=new  TipoImagenPersona();
				
				tipoimagenpersonaAux.setIsNew(false);
				tipoimagenpersonaAux.setIsChanged(false);
				
				tipoimagenpersonaAux.setIsDeleted(true);
				
				tipoimagenpersonaAux.setId(this.tipoimagenpersona.getId());	
				tipoimagenpersonaAux.setVersionRow(this.tipoimagenpersona.getVersionRow());	
				tipoimagenpersonaAux.setcodigo(this.tipoimagenpersona.getcodigo());	
				tipoimagenpersonaAux.setnombre(this.tipoimagenpersona.getnombre());	
				
				if(this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoimagenpersonaAux.getId()>=0) {	
						this.tipoimagenpersonasEliminados.add(tipoimagenpersonaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoimagenpersonaAux,tipoimagenpersonaLogic.getTipoImagenPersonas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoimagenpersonaAux,tipoimagenpersonas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoimagenpersonaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimagenpersonaLogic.saveTipoImagenPersonas();//WithConnection
						//tipoimagenpersonaLogic.getSetVersionRowTipoImagenPersonas();//WithConnection
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
					this.tipoimagenpersonaLogic.getTipoImagenPersonas().addAll(this.tipoimagenpersonasEliminados);
					
					tipoimagenpersonaLogic.saveTipoImagenPersonas();//WithConnection
					//tipoimagenpersonaLogic.getSetVersionRowTipoImagenPersonas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoimagenpersonasEliminados= new ArrayList<TipoImagenPersona>();		
			}
			
			if(this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Imagen Persona GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Imagen Persona",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoimagenpersona=tipoimagenpersonaAux;
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
      		//this.finishProcessTipoImagenPersona();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoImagenPersona tipoimagenpersonaLocal) throws Exception {
		
		if(this.tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoImagenPersona tipoimagenpersonaLocal) throws Exception {	
		if(this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoImagenPersonaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoimagenpersonaValidator.getInvalidValues(this.tipoimagenpersona);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoImagenPersona tipoimagenpersona,List<TipoImagenPersona> tipoimagenpersonas) throws Exception {
		try	{		
			TipoImagenPersonaConstantesFunciones.actualizarLista(tipoimagenpersona,tipoimagenpersonas,this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoImagenPersona tipoimagenpersona,List<TipoImagenPersona> tipoimagenpersonas) throws Exception {
		try	{			
			TipoImagenPersonaConstantesFunciones.actualizarSelectedLista(tipoimagenpersona,tipoimagenpersonas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoImagenPersona> tipoimagenpersonasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoimagenpersonasLocal=this.tipoimagenpersonaLogic.getTipoImagenPersonas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoimagenpersonasLocal=this.tipoimagenpersonas;
			}
			//ARCHITECTURE
		
			for(TipoImagenPersona tipoimagenpersonaLocal:tipoimagenpersonasLocal) {
				if(this.permiteMantenimiento(tipoimagenpersonaLocal) && tipoimagenpersonaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoImagenPersonaConstantesFunciones.getTipoImagenPersonaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoImagenPersonaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImagenPersona.jLabelcodigoTipoImagenPersona,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoImagenPersonaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImagenPersona.jLabelnombreTipoImagenPersona,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoImagenPersona.jLabelcodigoTipoImagenPersona,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoImagenPersona.jLabelnombreTipoImagenPersona,"");
		
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
		this.iIdNuevoTipoImagenPersona--;	
		
		
		this.tipoimagenpersonaAux=new TipoImagenPersona();
		
		this.tipoimagenpersonaAux.setId(this.iIdNuevoTipoImagenPersona);
		this.tipoimagenpersonaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoimagenpersonaLogic.getTipoImagenPersonas().add(this.tipoimagenpersonaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoimagenpersonas.add(this.tipoimagenpersonaAux);
		}
		//ARCHITECTURE
		
		this.tipoimagenpersona=this.tipoimagenpersonaAux;
		
		if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoImagenPersona(this.tipoimagenpersona);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoImagenPersona(this.tipoimagenpersona);
		}
				
		//this.setDefaultControlesTipoImagenPersona();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoImagenPersona();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoImagenPersona();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoImagenPersona();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoImagenPersona(this.tipoimagenpersonaBean,this.tipoimagenpersona,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(this.tipoimagenpersona);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {
			classes=TipoImagenPersonaConstantesFunciones.getClassesRelationshipsOfTipoImagenPersona(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoimagenpersonaReturnGeneral=tipoimagenpersonaLogic.procesarEventosTipoImagenPersonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoimagenpersonaLogic.getTipoImagenPersonas(),this.tipoimagenpersona,this.tipoimagenpersonaParameterGeneral,this.isEsNuevoTipoImagenPersona,classes);//this.tipoimagenpersonaLogic.getTipoImagenPersona()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoImagenPersona(this.tipoimagenpersonaReturnGeneral,this.tipoimagenpersonaBean,false);
		
		if(this.tipoimagenpersonaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoImagenPersona(this.tipoimagenpersonaReturnGeneral.getTipoImagenPersona());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoImagenPersona(this.tipoimagenpersonaReturnGeneral.getTipoImagenPersona());
		}
		
		if(this.tipoimagenpersonaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoImagenPersona(this.tipoimagenpersonaReturnGeneral.getTipoImagenPersona(),classes);//this.tipoimagenpersonaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoImagenPersona(this.tipoimagenpersona,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoImagenPersona();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoImagenPersona();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoImagenPersona(false);
						
			if(tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoImagenPersona();
			}
			
			this.actualizarVisualTableDatosTipoImagenPersona();
			
			this.jTableDatosTipoImagenPersona.setRowSelectionInterval(this.getIndiceNuevoTipoImagenPersona(), this.getIndiceNuevoTipoImagenPersona());
			
			this.seleccionarFilaTablaTipoImagenPersonaActual();
						
			this.actualizarEstadoCeldasBotonesTipoImagenPersona("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoImagenPersona(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldcodigoTipoImagenPersona.setEnabled(isHabilitar && this.tipoimagenpersonaConstantesFunciones.activarcodigoTipoImagenPersona);
		this.jInternalFrameDetalleFormTipoImagenPersona.jTextAreanombreTipoImagenPersona.setEnabled(isHabilitar && this.tipoimagenpersonaConstantesFunciones.activarnombreTipoImagenPersona);	
		
	};
	
	public void setDefaultControlesTipoImagenPersona() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoImagenPersona(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoimagenpersonaSessionBean.setConGuardarRelaciones(true);			
			this.tipoimagenpersonaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoImagenPersona.jTabbedPaneRelacionesTipoImagenPersona.setVisible(true);
			
					
		} else {
			//this.tipoimagenpersonaSessionBean.setConGuardarRelaciones(false);			
			this.tipoimagenpersonaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoImagenPersona.jTabbedPaneRelacionesTipoImagenPersona.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoImagenPersona() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonaLogic.getTipoImagenPersonas()) {
				if(tipoimagenpersonaAux.getId().equals(this.iIdNuevoTipoImagenPersona)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonas) {
				if(tipoimagenpersonaAux.getId().equals(this.iIdNuevoTipoImagenPersona)) {
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
	
	public int getIndiceActualTipoImagenPersona(TipoImagenPersona tipoimagenpersona,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonaLogic.getTipoImagenPersonas()) {
				if(tipoimagenpersonaAux.getId().equals(tipoimagenpersona.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonas) {
				if(tipoimagenpersonaAux.getId().equals(tipoimagenpersona.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoImagenPersona(TipoImagenPersona tipoimagenpersonaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonaLogic.getTipoImagenPersonas()) {
				if(tipoimagenpersonaAux.getTipoImagenPersonaOriginal().getId().equals(tipoimagenpersonaOriginal.getId())) {
					existe=true;
					tipoimagenpersonaOriginal.setId(tipoimagenpersonaAux.getId());
					tipoimagenpersonaOriginal.setVersionRow(tipoimagenpersonaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonas) {
				if(tipoimagenpersonaAux.getTipoImagenPersonaOriginal().getId().equals(tipoimagenpersonaOriginal.getId())) {
					existe=true;
					tipoimagenpersonaOriginal.setId(tipoimagenpersonaAux.getId());
					tipoimagenpersonaOriginal.setVersionRow(tipoimagenpersonaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoImagenPersona(Boolean esParaCancelar) throws Exception {
		tipoimagenpersonasAux=new ArrayList<TipoImagenPersona>();
		tipoimagenpersonaAux=new TipoImagenPersona();
		
		if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonaLogic.getTipoImagenPersonas()) {
					if(tipoimagenpersonaAux.getId()<0) {
						tipoimagenpersonasAux.add(tipoimagenpersonaAux);
					}		
				}
				this.iIdNuevoTipoImagenPersona=0L;
				this.tipoimagenpersonaLogic.getTipoImagenPersonas().removeAll(tipoimagenpersonasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonas) {
					if(tipoimagenpersonaAux.getId()<0) {
						tipoimagenpersonasAux.add(tipoimagenpersonaAux);
					}		
				}
				this.iIdNuevoTipoImagenPersona=0L;
				this.tipoimagenpersonas.removeAll(tipoimagenpersonasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoImagenPersona 
					&& this.tipoimagenpersonaLogic.getTipoImagenPersonas().size()>0
					) {
					tipoimagenpersonaAux=this.tipoimagenpersonaLogic.getTipoImagenPersonas().get(this.tipoimagenpersonaLogic.getTipoImagenPersonas().size() - 1);
				
					if(tipoimagenpersonaAux.getId()<0) {
						this.tipoimagenpersonaLogic.getTipoImagenPersonas().remove(tipoimagenpersonaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoImagenPersona && this.tipoimagenpersonas.size()>0) {
					tipoimagenpersonaAux=this.tipoimagenpersonas.get(this.tipoimagenpersonas.size() - 1);
				
					if(tipoimagenpersonaAux.getId()<0) {
						this.tipoimagenpersonas.remove(tipoimagenpersonaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoImagenPersona(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoimagenpersona.getId()<0) {
				this.tipoimagenpersonaLogic.getTipoImagenPersonas().remove(this.tipoimagenpersona);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoimagenpersona.getId()<0) {
				this.tipoimagenpersonas.remove(this.tipoimagenpersona);
			}
		}			
	}
	
	public void setEstadosInicialesTipoImagenPersona(List<TipoImagenPersona> tipoimagenpersonasAux) throws Exception {
		TipoImagenPersonaConstantesFunciones.setEstadosInicialesTipoImagenPersona(tipoimagenpersonasAux);
	}
	
	public void setEstadosInicialesTipoImagenPersona(TipoImagenPersona tipoimagenpersonaAux) throws Exception {
		TipoImagenPersonaConstantesFunciones.setEstadosInicialesTipoImagenPersona(tipoimagenpersonaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoImagenPersonaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoImagenPersona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoImagenPersonaActual()) {
				if(!this.isEsNuevoTipoImagenPersona) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoImagenPersona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoImagenPersona=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoImagenPersonaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Imagen Persona ?", "MANTENIMIENTO DE Tipo Imagen Persona", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoImagenPersona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoImagenPersona tipoimagenpersona) throws Exception {
		TipoImagenPersonaConstantesFunciones.seleccionarAsignar(this.tipoimagenpersona,tipoimagenpersona);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoImagenPersona=this.isPermisoActualizarOriginalTipoImagenPersona;
			
			
			this.seleccionarAsignar(tipoimagenpersona);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoImagenPersonaConstantesFunciones.quitarEspaciosTipoImagenPersona(this.tipoimagenpersona,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoImagenPersona("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoimagenpersonaSessionBean.setsFuncionBusquedaRapida(this.tipoimagenpersonaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoImagenPersona) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoImagenPersona(esParaCancelar);				
				this.cancelarNuevoTipoImagenPersona(esParaCancelar);								
			}
			
			this.tipoimagenpersona=new TipoImagenPersona();
			
			this.inicializarTipoImagenPersona();
			
			this.actualizarEstadoCeldasBotonesTipoImagenPersona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoImagenPersona() throws Exception {
		try {
			TipoImagenPersonaConstantesFunciones.inicializarTipoImagenPersona(this.tipoimagenpersona);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoimagenpersonaLogic.getTipoImagenPersonas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoImagenPersonas(String sAccionBusqueda,List<TipoImagenPersona> tipoimagenpersonasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoImagenPersona"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoImagenPersonaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoImagenPersonaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoImagenPersona"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Imagen Personas");		
		parameters.put("busquedapor", TipoImagenPersonaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoImagenPersona=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoImagenPersonaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoImagenPersonaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoImagenPersona=new JRBeanArrayDataSource(TipoImagenPersonaJInternalFrame.TraerTipoImagenPersonaBeans(tipoimagenpersonasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoImagenPersona);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoImagenPersonaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoImagenPersonaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoImagenPersonaBean.TraerTipoImagenPersonaBeans(tipoimagenpersonasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoImagenPersonas(sAccionBusqueda,sTipoArchivoReporte,tipoimagenpersonasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoImagenPersonas(sAccionBusqueda,sTipoArchivoReporte,tipoimagenpersonasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoImagenPersonaActionPerformed(null);
					//this.generarExcelReporteTipoImagenPersonas(sAccionBusqueda,sTipoArchivoReporte,tipoimagenpersonasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoImagenPersonas(sAccionBusqueda,sTipoArchivoReporte,tipoimagenpersonasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoImagenPersonas(sAccionBusqueda,sTipoArchivoReporte,tipoimagenpersonasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoImagenPersonas(sAccionBusqueda,sTipoArchivoReporte,tipoimagenpersonasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoImagenPersonas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoImagenPersona> tipoimagenpersonasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagenpersona";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoImagenPersonas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoImagenPersona("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoImagenPersona tipoimagenpersona : tipoimagenpersonasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoImagenPersonaConstantesFunciones.generarExcelReporteDataTipoImagenPersona("NORMAL",row,workbook,tipoimagenpersona,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen Persona",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoImagenPersona(String sTipo,Row row,Workbook workbook) {
		
		TipoImagenPersonaConstantesFunciones.generarExcelReporteHeaderTipoImagenPersona(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoImagenPersonas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoImagenPersona> tipoimagenpersonasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagenpersona_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoImagenPersonas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoImagenPersona tipoimagenpersona : tipoimagenpersonasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoImagenPersonaConstantesFunciones.getTipoImagenPersonaDescripcion(tipoimagenpersona));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoImagenPersonaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoImagenPersonaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoimagenpersona.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoimagenpersona.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen Persona",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoImagenPersonas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoImagenPersona> tipoimagenpersonasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoImagenPersona> tipoimagenpersonasRespaldo=null;
		
		classes=TipoImagenPersonaConstantesFunciones.getClassesRelationshipsOfTipoImagenPersona(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoimagenpersonaLogic.setDatosCliente(this.datosCliente);
		this.tipoimagenpersonaLogic.setDatosDeep(this.datosDeep);
		this.tipoimagenpersonaLogic.setIsConDeep(true);
		
		tipoimagenpersonasRespaldo=this.tipoimagenpersonaLogic.getTipoImagenPersonas();
		
		this.tipoimagenpersonaLogic.setTipoImagenPersonas(tipoimagenpersonasParaReportes);	
		this.tipoimagenpersonaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoimagenpersonasParaReportes=this.tipoimagenpersonaLogic.getTipoImagenPersonas();
		this.tipoimagenpersonaLogic.setTipoImagenPersonas(tipoimagenpersonasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagenpersona_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoImagenPersonas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoImagenPersona("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoImagenPersona tipoimagenpersona : tipoimagenpersonasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoImagenPersona("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoImagenPersonaConstantesFunciones.generarExcelReporteDataTipoImagenPersona("NORMAL",row,workbook,tipoimagenpersona,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoImagenPersonaConstantesFunciones.getTipoImagenPersonaDescripcion(tipoimagenpersona));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen Persona",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoImagenPersona() throws Exception {		
		this.startProcessTipoImagenPersona(true);
	}
	
	public void startProcessTipoImagenPersona(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoImagenPersona, this.jScrollPanelDatosTipoImagenPersona,this.jPanelPaginacionTipoImagenPersona, this.jScrollPanelDatosEdicionTipoImagenPersona, this.jPanelAccionesTipoImagenPersona,this.jPanelAccionesFormularioTipoImagenPersona,this.jmenuBarTipoImagenPersona,this.jmenuBarDetalleTipoImagenPersona,this.jTtoolBarTipoImagenPersona,this.jTtoolBarDetalleTipoImagenPersona);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoImagenPersona=null; 
		
		final JPanel jPanelParametrosReportesTipoImagenPersona=this.jPanelParametrosReportesTipoImagenPersona;
		//final JScrollPane jScrollPanelDatosTipoImagenPersona=this.jScrollPanelDatosTipoImagenPersona;
		final JTable jTableDatosTipoImagenPersona=this.jTableDatosTipoImagenPersona;		
		final JPanel jPanelPaginacionTipoImagenPersona=this.jPanelPaginacionTipoImagenPersona;
		//final JScrollPane jScrollPanelDatosEdicionTipoImagenPersona=this.jScrollPanelDatosEdicionTipoImagenPersona;
		final JPanel jPanelAccionesTipoImagenPersona=this.jPanelAccionesTipoImagenPersona;
		
		JPanel jPanelCamposAuxiliarTipoImagenPersona=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoImagenPersona=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
			jPanelCamposAuxiliarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jPanelCamposTipoImagenPersona;
			jPanelAccionesFormularioAuxiliarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jPanelAccionesFormularioTipoImagenPersona;
		}
		
		final JPanel jPanelCamposTipoImagenPersona=jPanelCamposAuxiliarTipoImagenPersona;
		final JPanel jPanelAccionesFormularioTipoImagenPersona=jPanelAccionesFormularioAuxiliarTipoImagenPersona;
		
		
		final JMenuBar jmenuBarTipoImagenPersona=this.jmenuBarTipoImagenPersona;
		final JToolBar jTtoolBarTipoImagenPersona=this.jTtoolBarTipoImagenPersona;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoImagenPersona=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoImagenPersona=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
			jmenuBarDetalleAuxiliarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jmenuBarDetalleTipoImagenPersona;
			jTtoolBarDetalleAuxiliarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jTtoolBarDetalleTipoImagenPersona;
		}
		
		final JMenuBar jmenuBarDetalleTipoImagenPersona=jmenuBarDetalleAuxiliarTipoImagenPersona;
		final JToolBar jTtoolBarDetalleTipoImagenPersona=jTtoolBarDetalleAuxiliarTipoImagenPersona;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoImagenPersona;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoImagenPersona;
			processRunnable.jTableDatos=jTableDatosTipoImagenPersona;
			processRunnable.jPanelCampos=jPanelCamposTipoImagenPersona;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoImagenPersona;
			processRunnable.jPanelAcciones=jPanelAccionesTipoImagenPersona;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoImagenPersona;
			
			
			processRunnable.jmenuBar=jmenuBarTipoImagenPersona;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoImagenPersona;
			processRunnable.jTtoolBar=jTtoolBarTipoImagenPersona;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoImagenPersona;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoImagenPersona ,jPanelParametrosReportesTipoImagenPersona,jTableDatosTipoImagenPersona, /*jScrollPanelDatosTipoImagenPersona,*/jPanelCamposTipoImagenPersona,jPanelPaginacionTipoImagenPersona, /*jScrollPanelDatosEdicionTipoImagenPersona,*/ jPanelAccionesTipoImagenPersona,jPanelAccionesFormularioTipoImagenPersona,jmenuBarTipoImagenPersona,jmenuBarDetalleTipoImagenPersona,jTtoolBarTipoImagenPersona,jTtoolBarDetalleTipoImagenPersona);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoImagenPersona, jScrollPanelDatosTipoImagenPersona,jPanelPaginacionTipoImagenPersona, jScrollPanelDatosEdicionTipoImagenPersona, jPanelAccionesTipoImagenPersona,jPanelAccionesFormularioTipoImagenPersona,jmenuBarTipoImagenPersona,jmenuBarDetalleTipoImagenPersona,jTtoolBarTipoImagenPersona,jTtoolBarDetalleTipoImagenPersona);
						
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
	
	public void finishProcessTipoImagenPersona() {// throws Exception 
		this.finishProcessTipoImagenPersona(true);
	}
	
	public void finishProcessTipoImagenPersona(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoImagenPersona, this.jScrollPanelDatosTipoImagenPersona,this.jPanelPaginacionTipoImagenPersona, this.jScrollPanelDatosEdicionTipoImagenPersona, this.jPanelAccionesTipoImagenPersona,this.jPanelAccionesFormularioTipoImagenPersona,this.jmenuBarTipoImagenPersona,this.jmenuBarDetalleTipoImagenPersona,this.jTtoolBarTipoImagenPersona,this.jTtoolBarDetalleTipoImagenPersona);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoImagenPersona=null; 
		
		final JPanel jPanelParametrosReportesTipoImagenPersona=this.jPanelParametrosReportesTipoImagenPersona;
		//final JScrollPane jScrollPanelDatosTipoImagenPersona=this.jScrollPanelDatosTipoImagenPersona;
		final JTable jTableDatosTipoImagenPersona=this.jTableDatosTipoImagenPersona;		
		final JPanel jPanelPaginacionTipoImagenPersona=this.jPanelPaginacionTipoImagenPersona;
		//final JScrollPane jScrollPanelDatosEdicionTipoImagenPersona=this.jScrollPanelDatosEdicionTipoImagenPersona;
		final JPanel jPanelAccionesTipoImagenPersona=this.jPanelAccionesTipoImagenPersona;
		
		JPanel jPanelCamposAuxiliarTipoImagenPersona=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoImagenPersona=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
			jPanelCamposAuxiliarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jPanelCamposTipoImagenPersona;
			jPanelAccionesFormularioAuxiliarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jPanelAccionesFormularioTipoImagenPersona;
		}
		
		final JPanel jPanelCamposTipoImagenPersona=jPanelCamposAuxiliarTipoImagenPersona;
		final JPanel jPanelAccionesFormularioTipoImagenPersona=jPanelAccionesFormularioAuxiliarTipoImagenPersona;
		
		
		final JMenuBar jmenuBarTipoImagenPersona=this.jmenuBarTipoImagenPersona;		
		final JToolBar jTtoolBarTipoImagenPersona=this.jTtoolBarTipoImagenPersona;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoImagenPersona=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoImagenPersona=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
			jmenuBarDetalleAuxiliarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jmenuBarDetalleTipoImagenPersona;
			jTtoolBarDetalleAuxiliarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jTtoolBarDetalleTipoImagenPersona;		
		}
		
		final JMenuBar jmenuBarDetalleTipoImagenPersona=jmenuBarDetalleAuxiliarTipoImagenPersona;
		final JToolBar jTtoolBarDetalleTipoImagenPersona=jTtoolBarDetalleAuxiliarTipoImagenPersona;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoImagenPersona;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoImagenPersona;
			processRunnable.jTableDatos=jTableDatosTipoImagenPersona;
			processRunnable.jPanelCampos=jPanelCamposTipoImagenPersona;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoImagenPersona;
			processRunnable.jPanelAcciones=jPanelAccionesTipoImagenPersona;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoImagenPersona;
			
			
			processRunnable.jmenuBar=jmenuBarTipoImagenPersona;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoImagenPersona;
			processRunnable.jTtoolBar=jTtoolBarTipoImagenPersona;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoImagenPersona;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoImagenPersona ,jPanelParametrosReportesTipoImagenPersona, jTableDatosTipoImagenPersona,/*jScrollPanelDatosTipoImagenPersona,*/jPanelCamposTipoImagenPersona,jPanelPaginacionTipoImagenPersona, /*jScrollPanelDatosEdicionTipoImagenPersona,*/ jPanelAccionesTipoImagenPersona,jPanelAccionesFormularioTipoImagenPersona,jmenuBarTipoImagenPersona,jmenuBarDetalleTipoImagenPersona,jTtoolBarTipoImagenPersona,jTtoolBarDetalleTipoImagenPersona));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoImagenPersona(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoImagenPersona(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoImagenPersona(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoImagenPersona(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoImagenPersona,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoImagenPersona,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoImagenPersona(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoImagenPersona,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoImagenPersona,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoimagenpersonaConstantesFunciones.getsFinalQueryTipoImagenPersona();
		String  finalQueryPaginacionTodos=this.tipoimagenpersonaConstantesFunciones.getsFinalQueryTipoImagenPersona();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoImagenPersonaConstantesFunciones.getArrayColumnasGlobalesNoTipoImagenPersona(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoImagenPersonaConstantesFunciones.getArrayColumnasGlobalesTipoImagenPersona(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoImagenPersonaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoimagenpersonasEliminados= new ArrayList<TipoImagenPersona>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoImagenPersona();
		
				///*TipoImagenPersonaSessionBean*/this.tipoimagenpersonaSessionBean=new TipoImagenPersonaSessionBean();
			
			if(this.tipoimagenpersonaSessionBean==null) {
				this.tipoimagenpersonaSessionBean=new TipoImagenPersonaSessionBean();
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
					this.iNumeroPaginacion=TipoImagenPersonaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoImagenPersonaConstantesFunciones.getClassesForeignKeysOfTipoImagenPersona(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoimagenpersona."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoimagenpersonasAux= new ArrayList<TipoImagenPersona>();
			
				
			tipoimagenpersonaLogic.setDatosCliente(this.datosCliente);
			tipoimagenpersonaLogic.setDatosDeep(this.datosDeep);
			tipoimagenpersonaLogic.setIsConDeep(true);
			
			
			tipoimagenpersonaLogic.getTipoImagenPersonaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoimagenpersonaLogic.getTodosTipoImagenPersonas(finalQueryGlobal,pagination);
					
					//tipoimagenpersonaLogic.getTodosTipoImagenPersonasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoimagenpersonaLogic.getTipoImagenPersonas()==null|| tipoimagenpersonaLogic.getTipoImagenPersonas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoimagenpersonasAux= new ArrayList<TipoImagenPersona>();
							tipoimagenpersonasAux.addAll(tipoimagenpersonaLogic.getTipoImagenPersonas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoimagenpersonasAux= new ArrayList<TipoImagenPersona>();
							tipoimagenpersonasAux.addAll(tipoimagenpersonas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoimagenpersonaLogic.getTodosTipoImagenPersonas(finalQueryGlobal+"",this.pagination);												
							
							//tipoimagenpersonaLogic.getTodosTipoImagenPersonasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoImagenPersonas("Todos",tipoimagenpersonaLogic.getTipoImagenPersonas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoimagenpersonaLogic.setTipoImagenPersonas(new ArrayList<TipoImagenPersona>());					
							tipoimagenpersonaLogic.getTipoImagenPersonas().addAll(tipoimagenpersonasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoimagenpersonas=new ArrayList<TipoImagenPersona>();
							tipoimagenpersonas.addAll(tipoimagenpersonasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoImagenPersona=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoImagenPersona=this.idActual;
				
				} else if(this.idTipoImagenPersonaActual!=null && this.idTipoImagenPersonaActual!=0L) {
					idTipoImagenPersona=idTipoImagenPersonaActual;
				}
				
					
				this.sDetalleReporte=TipoImagenPersonaConstantesFunciones.getDetalleIndicePorId(idTipoImagenPersona);
				
				this.tipoimagenpersonas=new ArrayList<TipoImagenPersona>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoimagenpersonaLogic.getEntity(idTipoImagenPersona);
					
					//tipoimagenpersonaLogic.getEntityWithConnection(idTipoImagenPersona);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoimagenpersonaLogic.setTipoImagenPersonas(new ArrayList<TipoImagenPersona>());
					tipoimagenpersonaLogic.getTipoImagenPersonas().add(tipoimagenpersonaLogic.getTipoImagenPersona());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoimagenpersonas=new ArrayList<TipoImagenPersona>();
					this.tipoimagenpersonas.add(tipoimagenpersona);
				}
				
				if(tipoimagenpersonaLogic.getTipoImagenPersona()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoImagenPersona();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoImagenPersona();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoimagenpersonaLogic.getTipoImagenPersonas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoimagenpersonas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoimagenpersonaLogic.getTipoImagenPersonas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoimagenpersonas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoImagenPersona tipoimagenpersona) {
		Boolean permite=true;
		
		if(this.tipoimagenpersona.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoImagenPersonaConstantesFunciones.getOrderByListaTipoImagenPersona();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoImagenPersonaConstantesFunciones.getOrderByListaTipoImagenPersona();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImagenPersona tipoimagenpersona:tipoimagenpersonaLogic.getTipoImagenPersonas()) {
				if(tipoimagenpersona.getsType().equals(Constantes2.S_TOTALES)) {
					tipoimagenpersonaTotales=tipoimagenpersona;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImagenPersona tipoimagenpersona:this.tipoimagenpersonas) {
				if(tipoimagenpersona.getsType().equals(Constantes2.S_TOTALES)) {
					tipoimagenpersonaTotales=tipoimagenpersona;
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
			this.tipoimagenpersonaAux=new TipoImagenPersona();
			this.tipoimagenpersonaAux.setsType(Constantes2.S_TOTALES);
			this.tipoimagenpersonaAux.setIsNew(false);
			this.tipoimagenpersonaAux.setIsChanged(false);
			this.tipoimagenpersonaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoImagenPersonaConstantesFunciones.TotalizarValoresFilaTipoImagenPersona(this.tipoimagenpersonaLogic.getTipoImagenPersonas(),this.tipoimagenpersonaAux);
				
				this.tipoimagenpersonaLogic.getTipoImagenPersonas().add(this.tipoimagenpersonaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoImagenPersonaConstantesFunciones.TotalizarValoresFilaTipoImagenPersona(this.tipoimagenpersonas,this.tipoimagenpersonaAux);
				
				this.tipoimagenpersonas.add(this.tipoimagenpersonaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoimagenpersonaTotales=new TipoImagenPersona();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoimagenpersonaLogic.getTipoImagenPersonas().remove(tipoimagenpersonaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoimagenpersonas.remove(tipoimagenpersonaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoimagenpersonaTotales=new TipoImagenPersona();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoImagenPersona tipoimagenpersona:tipoimagenpersonaLogic.getTipoImagenPersonas()) {
				if(tipoimagenpersona.getsType().equals(Constantes2.S_TOTALES)) {
					tipoimagenpersonaTotales=tipoimagenpersona;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoImagenPersonaConstantesFunciones.TotalizarValoresFilaTipoImagenPersona(this.tipoimagenpersonaLogic.getTipoImagenPersonas(),tipoimagenpersonaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoImagenPersona tipoimagenpersona:this.tipoimagenpersonas) {
				if(tipoimagenpersona.getsType().equals(Constantes2.S_TOTALES)) {
					tipoimagenpersonaTotales=tipoimagenpersona;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoImagenPersonaConstantesFunciones.TotalizarValoresFilaTipoImagenPersona(this.tipoimagenpersonas,tipoimagenpersonaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoImagenPersona() {
		this.isPermisoTodoTipoImagenPersona=false;
		this.isPermisoNuevoTipoImagenPersona=false;
		this.isPermisoActualizarTipoImagenPersona=false;
		this.isPermisoActualizarOriginalTipoImagenPersona=false;
		this.isPermisoEliminarTipoImagenPersona=false;
		this.isPermisoGuardarCambiosTipoImagenPersona=false;
		this.isPermisoConsultaTipoImagenPersona=false;
		this.isPermisoBusquedaTipoImagenPersona=false;
		this.isPermisoReporteTipoImagenPersona=false;		
		this.isPermisoOrdenTipoImagenPersona=false;		
		this.isPermisoPaginacionMedioTipoImagenPersona=false;		
		this.isPermisoPaginacionAltoTipoImagenPersona=false;
		this.isPermisoPaginacionTodoTipoImagenPersona=false;
		this.isPermisoCopiarTipoImagenPersona=false;		
		this.isPermisoVerFormTipoImagenPersona=false;		
		this.isPermisoDuplicarTipoImagenPersona=false;		
		this.isPermisoOrdenTipoImagenPersona=false;		
	}
	
	public void setPermisosUsuarioTipoImagenPersona(Boolean isPermiso) {
		this.isPermisoTodoTipoImagenPersona=isPermiso;
		this.isPermisoNuevoTipoImagenPersona=isPermiso;
		this.isPermisoActualizarTipoImagenPersona=isPermiso;
		this.isPermisoActualizarOriginalTipoImagenPersona=isPermiso;
		this.isPermisoEliminarTipoImagenPersona=isPermiso;
		this.isPermisoGuardarCambiosTipoImagenPersona=isPermiso;
		this.isPermisoConsultaTipoImagenPersona=isPermiso;
		this.isPermisoBusquedaTipoImagenPersona=isPermiso;
		this.isPermisoReporteTipoImagenPersona=isPermiso;
		this.isPermisoOrdenTipoImagenPersona=isPermiso;		
		this.isPermisoPaginacionMedioTipoImagenPersona=isPermiso;		
		this.isPermisoPaginacionAltoTipoImagenPersona=isPermiso;		
		this.isPermisoPaginacionTodoTipoImagenPersona=isPermiso;		
		this.isPermisoCopiarTipoImagenPersona=isPermiso;		
		this.isPermisoVerFormTipoImagenPersona=isPermiso;		
		this.isPermisoDuplicarTipoImagenPersona=isPermiso;
		this.isPermisoOrdenTipoImagenPersona=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoImagenPersona(Boolean isPermiso) {
		//this.isPermisoTodoTipoImagenPersona=isPermiso;
		this.isPermisoNuevoTipoImagenPersona=isPermiso;
		this.isPermisoActualizarTipoImagenPersona=isPermiso;
		this.isPermisoActualizarOriginalTipoImagenPersona=isPermiso;
		this.isPermisoEliminarTipoImagenPersona=isPermiso;
		this.isPermisoGuardarCambiosTipoImagenPersona=isPermiso;
		//this.isPermisoConsultaTipoImagenPersona=isPermiso;
		//this.isPermisoBusquedaTipoImagenPersona=isPermiso;
		//this.isPermisoReporteTipoImagenPersona=isPermiso;
		//this.isPermisoOrdenTipoImagenPersona=isPermiso;		
		//this.isPermisoPaginacionMedioTipoImagenPersona=isPermiso;		
		//this.isPermisoPaginacionAltoTipoImagenPersona=isPermiso;		
		//this.isPermisoPaginacionTodoTipoImagenPersona=isPermiso;		
		//this.isPermisoCopiarTipoImagenPersona=isPermiso;		
		//this.isPermisoDuplicarTipoImagenPersona=isPermiso;
		//this.isPermisoOrdenTipoImagenPersona=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoImagenPersonaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoImagenPersonaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoImagenPersona(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoImagenPersonaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoImagenPersonaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoImagenPersonaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoImagenPersonaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoImagenPersona() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoImagenPersonaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoImagenPersonaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoImagenPersona=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoImagenPersona=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoImagenPersona=this.isPermisoActualizarTipoImagenPersona;
			this.isPermisoEliminarTipoImagenPersona=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoImagenPersona=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoImagenPersona=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoImagenPersona=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoImagenPersona=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoImagenPersona=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoImagenPersona=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoImagenPersona=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoImagenPersona=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoImagenPersona=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoImagenPersona=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoImagenPersona=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoImagenPersona=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoImagenPersona=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoImagenPersona.setToolTipText(this.jTableDatosTipoImagenPersona.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoImagenPersona(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoImagenPersona(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoImagenPersonaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoImagenPersonaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoImagenPersona() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoImagenPersonaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoImagenPersonaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoImagenPersonaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoImagenPersonaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoImagenPersonaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoImagenPersona()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoImagenPersona()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoImagenPersona(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoImagenPersona()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoImagenPersona();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoImagenPersona(TipoImagenPersona tipoimagenpersona)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoImagenPersona(TipoImagenPersona tipoimagenpersona,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoImagenPersona()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoImagenPersona()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoImagenPersona()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoImagenPersona()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoImagenPersona()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoImagenPersona()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoImagenPersona(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoImagenPersona()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoImagenPersonaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoImagenPersonaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoImagenPersonaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoimagenpersonaSessionBean=new TipoImagenPersonaSessionBean(); 
		this.tipoimagenpersonaConstantesFunciones=new TipoImagenPersonaConstantesFunciones(); 
		this.tipoimagenpersonaBean=new TipoImagenPersona();//(this.tipoimagenpersonaConstantesFunciones); 		
		this.tipoimagenpersonaReturnGeneral=new TipoImagenPersonaParameterReturnGeneral(); 
		
		this.tipoimagenpersonaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoimagenpersonaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoImagenPersonaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoImagenPersonaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoImagenPersonaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoImagenPersona(true);
			
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
			
			this.tipoimagenpersonaConstantesFunciones=new TipoImagenPersonaConstantesFunciones(); 
			this.tipoimagenpersonaBean=new TipoImagenPersona();//this.tipoimagenpersonaConstantesFunciones); 			
			this.tipoimagenpersonaReturnGeneral=new TipoImagenPersonaParameterReturnGeneral(); 
		
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Imagen Persona Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoimagenpersona=new TipoImagenPersona();
			this.tipoimagenpersonas = new ArrayList<TipoImagenPersona>();
			this.tipoimagenpersonasAux = new ArrayList<TipoImagenPersona>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic=new TipoImagenPersonaLogic();
				this.tipoimagenpersonaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoimagenpersonaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoimagenpersonaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoImagenPersona);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoImagenPersona!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoImagenPersona);	
					}
					
					if(this.jInternalFrameImportacionTipoImagenPersona!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoImagenPersona);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoImagenPersona!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoImagenPersona);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoImagenPersona);
				this.jInternalFrameDetalleFormTipoImagenPersona.setVisible(false);
				this.jInternalFrameDetalleFormTipoImagenPersona.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoImagenPersona!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoImagenPersona);
					this.jInternalFrameReporteDinamicoTipoImagenPersona.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoImagenPersona.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoImagenPersona!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoImagenPersona);
					this.jInternalFrameImportacionTipoImagenPersona.setVisible(false);
					this.jInternalFrameImportacionTipoImagenPersona.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoImagenPersona!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoImagenPersona);
					this.jInternalFrameOrderByTipoImagenPersona.setVisible(false);
					this.jInternalFrameOrderByTipoImagenPersona.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoImagenPersonaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoImagenPersonaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoimagenpersonaReturnGeneral=new TipoImagenPersonaParameterReturnGeneral();
			
			this.tipoimagenpersonaParameterGeneral=new TipoImagenPersonaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoimagenpersonaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoImagenPersonaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoImagenPersonaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado(),this.tipoimagenpersonaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoImagenPersonaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado(),this.tipoimagenpersonaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoImagenPersona=false;
			this.isVisibilidadCeldaDuplicarTipoImagenPersona=true;
			this.isVisibilidadCeldaCopiarTipoImagenPersona=true;
			this.isVisibilidadCeldaVerFormTipoImagenPersona=true;
			this.isVisibilidadCeldaOrdenTipoImagenPersona=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=false;
			this.isVisibilidadCeldaModificarTipoImagenPersona=false;
			this.isVisibilidadCeldaActualizarTipoImagenPersona=false;
			this.isVisibilidadCeldaEliminarTipoImagenPersona=false;
			this.isVisibilidadCeldaCancelarTipoImagenPersona=false;
			this.isVisibilidadCeldaGuardarTipoImagenPersona=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoImagenPersona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoImagenPersona();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoImagenPersona(false);
			
			this.setPermisosUsuarioTipoImagenPersona();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado() && this.tipoimagenpersonaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoImagenPersonaClasesRelacionadas();
			}
			
			if(this.tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoImagenPersonaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoImagenPersona();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoImagenPersona();
			}
			
			if(!this.isPermisoBusquedaTipoImagenPersona) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoImagenPersona,this.isPermisoPaginacionMedioTipoImagenPersona,this.isPermisoPaginacionTodoTipoImagenPersona);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoImagenPersonaConstantesFunciones.getTiposSeleccionarTipoImagenPersona());
				
				this.tiposColumnasSelect=TipoImagenPersonaConstantesFunciones.getTiposSeleccionarTipoImagenPersona(true);
				
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
			//if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoImagenPersona();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoImagenPersona(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoImagenPersona(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoImagenPersona() ;
			
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
				tipoimagenpersonaImplementable= (TipoImagenPersonaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoImagenPersonaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoimagenpersonaImplementableHome= (TipoImagenPersonaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoImagenPersonaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoimagenpersonas= new ArrayList<TipoImagenPersona>();
			this.tipoimagenpersonasEliminados= new ArrayList<TipoImagenPersona>();
						
			this.isEsNuevoTipoImagenPersona=false;
			this.esParaAccionDesdeFormularioTipoImagenPersona=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoImagenPersona(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoImagenPersona();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoImagenPersonaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoImagenPersona("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoImagenPersona(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoImagenPersona();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoImagenPersona();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoImagenPersona(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoImagenPersona: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoImagenPersona() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoImagenPersona")) {
				iIndex=this.jInternalFrameDetalleFormTipoImagenPersona.jTabbedPaneRelacionesTipoImagenPersona.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoImagenPersona.jTabbedPaneRelacionesTipoImagenPersona.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoImagenPersona();	
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
	
	public void cargarCombosForeignKeyTipoImagenPersona(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoImagenPersona(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoImagenPersona(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoImagenPersonaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoImagenPersona();
		
		this.cargarCombosFrameForeignKeyTipoImagenPersona();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoImagenPersona();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoImagenPersona();
		}
	}
	
	
	
	public void jButtonNuevoTipoImagenPersonaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoImagenPersona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			
			
			if(jTableDatosTipoImagenPersona.getRowCount()>=1) {
				jTableDatosTipoImagenPersona.removeRowSelectionInterval(0, jTableDatosTipoImagenPersona.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoImagenPersona=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoImagenPersona(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoImagenPersona(true);			
			//this.tipoimagenpersona=new TipoImagenPersona();
			//this.tipoimagenpersona.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoImagenPersona(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoImagenPersona() ;
			
			if(TipoImagenPersonaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoImagenPersona(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoimagenpersona);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);				
			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			
			if(this.tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoImagenPersona: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoImagenPersonaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoImagenPersona.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoImagenPersona.getSelectedRows().length;			
			}
			
			tipoimagenpersonasSeleccionados=this.getTipoImagenPersonasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoImagenPersona--;			
				//TipoImagenPersona tipoimagenpersonaAux= new TipoImagenPersona();			
				//tipoimagenpersonaAux.setId(this.iIdNuevoTipoImagenPersona);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoImagenPersona tipoimagenpersonaOrigen=new TipoImagenPersona();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoImagenPersona tipoimagenpersonaOrigen : tipoimagenpersonasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoimagenpersonaOrigen =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoimagenpersonaOrigen =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoImagenPersona();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoimagenpersona.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoImagenPersona(tipoimagenpersonaOrigen,this.tipoimagenpersona,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(this.tipoimagenpersona);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoimagenpersonaLogic.getTipoImagenPersonas().add(this.tipoimagenpersonaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoimagenpersonas.add(this.tipoimagenpersonaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoImagenPersona(false);
				
				this.jTableDatosTipoImagenPersona.setRowSelectionInterval(this.getIndiceNuevoTipoImagenPersona(), this.getIndiceNuevoTipoImagenPersona());
				
				int iLastRow =  this.jTableDatosTipoImagenPersona.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoImagenPersona.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoImagenPersona.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoImagenPersona(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();									
		
			TipoImagenPersona tipoimagenpersonaOrigen=new TipoImagenPersona();
			TipoImagenPersona tipoimagenpersonaDestino=new TipoImagenPersona();
				
			tipoimagenpersonasSeleccionados=this.getTipoImagenPersonasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoImagenPersona.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoimagenpersonasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoImagenPersona.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimagenpersonaOrigen =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoimagenpersonaOrigen =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoimagenpersonaDestino =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoimagenpersonaDestino =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoimagenpersonaOrigen =tipoimagenpersonasSeleccionados.get(0);
				tipoimagenpersonaDestino =tipoimagenpersonasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoImagenPersona(tipoimagenpersonaOrigen,tipoimagenpersonaDestino,true,false);
				
				tipoimagenpersonaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoimagenpersonaDestino,tipoimagenpersonaLogic.getTipoImagenPersonas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoimagenpersonaDestino,tipoimagenpersonas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoImagenPersona(false);
				
				//this.jTableDatosTipoImagenPersona.setRowSelectionInterval(this.getIndiceNuevoTipoImagenPersona(), this.getIndiceNuevoTipoImagenPersona());
				
				int iLastRow =  this.jTableDatosTipoImagenPersona.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoImagenPersona.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoImagenPersona.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoImagenPersona(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoImagenPersona.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoImagenPersona.isVisible();
			
			
			this.jPanelParametrosReportesTipoImagenPersona.setVisible(!isVisible);
			this.jPanelPaginacionTipoImagenPersona.setVisible(!isVisible);
			this.jPanelAccionesTipoImagenPersona.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoImagenPersona();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoImagenPersona();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoImagenPersona();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoImagenPersona();
			
			this.abrirFrameOrderByTipoImagenPersona();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoImagenPersona();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoImagenPersona(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoImagenPersona);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoImagenPersona.isMaximum()) {
					this.jInternalFrameDetalleFormTipoImagenPersona.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoImagenPersona.setSize(this.jInternalFrameDetalleFormTipoImagenPersona.iWidthFormulario,this.jInternalFrameDetalleFormTipoImagenPersona.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoImagenPersona.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoImagenPersona.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoImagenPersona.isMaximum()) {
						this.jInternalFrameDetalleFormTipoImagenPersona.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoImagenPersona.jContentPaneDetalleTipoImagenPersona.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoImagenPersona.jTabbedPaneRelacionesTipoImagenPersona.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoImagenPersona.jContentPaneDetalleTipoImagenPersona.getWidth(),TipoImagenPersonaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoImagenPersona.jTabbedPaneRelacionesTipoImagenPersona.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoImagenPersona.jContentPaneDetalleTipoImagenPersona.getWidth(),TipoImagenPersonaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoImagenPersona.jTabbedPaneRelacionesTipoImagenPersona.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoImagenPersona.jContentPaneDetalleTipoImagenPersona.getWidth(),TipoImagenPersonaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoImagenPersona.setVisible(true);
	        this.jInternalFrameDetalleFormTipoImagenPersona.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoImagenPersona() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoImagenPersona==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoImagenPersona=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoImagenPersona,false,this);
				} else {
					this.jInternalFrameOrderByTipoImagenPersona=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoImagenPersona,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoImagenPersona);
				this.jInternalFrameOrderByTipoImagenPersona.setVisible(false);
				this.jInternalFrameOrderByTipoImagenPersona.setSelected(false);
				
				this.jInternalFrameOrderByTipoImagenPersona.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoImagenPersona"));
				
				this.inicializarActualizarBindingTablaOrderByTipoImagenPersona();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoImagenPersona() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoImagenPersona==null) {
				
				this.jInternalFrameImportacionTipoImagenPersona=new ImportacionJInternalFrame(TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoImagenPersona);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoImagenPersona);
				this.jInternalFrameImportacionTipoImagenPersona.setVisible(false);
				this.jInternalFrameImportacionTipoImagenPersona.setSelected(false);


				this.jInternalFrameImportacionTipoImagenPersona.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoImagenPersona"));
				this.jInternalFrameImportacionTipoImagenPersona.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoImagenPersona"));
				this.jInternalFrameImportacionTipoImagenPersona.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoImagenPersona"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoImagenPersona() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoImagenPersona==null) {
				this.jInternalFrameReporteDinamicoTipoImagenPersona=new ReporteDinamicoJInternalFrame(TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoImagenPersona);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoImagenPersona);
				this.jInternalFrameReporteDinamicoTipoImagenPersona.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoImagenPersona.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoImagenPersona.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoImagenPersona"));
				this.jInternalFrameReporteDinamicoTipoImagenPersona.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoImagenPersona"));
				this.jInternalFrameReporteDinamicoTipoImagenPersona.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoImagenPersona"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoImagenPersona();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTipoImagenPersona() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoImagenPersona);
			
	       	this.jInternalFrameDetalleFormTipoImagenPersona.setVisible(false);
	        this.jInternalFrameDetalleFormTipoImagenPersona.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoImagenPersona.dispose();
			//this.jInternalFrameDetalleFormTipoImagenPersona=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoImagenPersona() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoImagenPersona.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoImagenPersona.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoImagenPersona() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoImagenPersona.setVisible(true);
	        this.jInternalFrameImportacionTipoImagenPersona.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoImagenPersona() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoImagenPersona.setVisible(true);
	        this.jInternalFrameOrderByTipoImagenPersona.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoImagenPersona() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoImagenPersona.setVisible(false);
	        this.jInternalFrameOrderByTipoImagenPersona.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoImagenPersona() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoImagenPersona.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoImagenPersona.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoImagenPersona() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoImagenPersona.setVisible(false);
	        this.jInternalFrameImportacionTipoImagenPersona.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoImagenPersona(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoImagenPersona(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoImagenPersona(true);
			//this.isEsNuevoTipoImagenPersona=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoImagenPersona("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoImagenPersona(false) ;
			
			if(tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoImagenPersonaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoImagenPersona(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoImagenPersona(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoImagenPersonaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoImagenPersona(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoImagenPersona(true);
			//this.isEsNuevoTipoImagenPersona=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoimagenpersona.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoImagenPersona("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoImagenPersona(false) ;
			
			if(TipoImagenPersonaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoImagenPersona(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoImagenPersona(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoImagenPersona(false);
			
			//if(!this.isEsNuevoTipoImagenPersona) {								
				int intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoImagenPersona(this.tipoimagenpersona,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(this.tipoimagenpersona);
				
			}
			
			if(this.permiteMantenimiento(this.tipoimagenpersona)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoImagenPersona=true;
					this.inicializarActualizarBindingTablaTipoImagenPersona(false);
					this.isEsNuevoTipoImagenPersona=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoImagenPersona=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoImagenPersona=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoImagenPersona(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoImagenPersona(false);
				
				this.habilitarDeshabilitarControlesTipoImagenPersona(false);
			
												
				
				if(TipoImagenPersonaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoImagenPersona();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoImagenPersonaActionPerformed(evt,tipoimagenpersonaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoImagenPersona(this.tipoimagenpersona,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoImagenPersona.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoimagenpersonaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoimagenpersona.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoImagenPersona.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagenPersona.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				this.tipoimagenpersona.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				this.tipoimagenpersona.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoimagenpersona)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoImagenPersonaModel) this.jTableDatosTipoImagenPersona.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoImagenPersona=true;
				this.inicializarActualizarBindingTablaTipoImagenPersona(false);
				this.isEsNuevoTipoImagenPersona=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoImagenPersona(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoImagenPersona(false);
				
				this.habilitarDeshabilitarControlesTipoImagenPersona(false);
				
				
				
				if(TipoImagenPersonaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoImagenPersona();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoImagenPersona.getRowCount()>=1) {
				jTableDatosTipoImagenPersona.removeRowSelectionInterval(0, jTableDatosTipoImagenPersona.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoImagenPersona(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoImagenPersona(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoImagenPersona(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoImagenPersona(false) ;
			
			this.isEsNuevoTipoImagenPersona=false;
			
			if(TipoImagenPersonaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoImagenPersona();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoImagenPersona(false);
				
				//SI ES MANUAL
				if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoImagenPersona();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoImagenPersona--;			
			//TipoImagenPersona tipoimagenpersonaAux= new TipoImagenPersona();			
			//tipoimagenpersonaAux.setId(this.iIdNuevoTipoImagenPersona);
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoImagenPersona();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(this.tipoimagenpersona);
			
			this.tipoimagenpersona.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoimagenpersonaLogic.getTipoImagenPersonas().add(this.tipoimagenpersonaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoimagenpersonas.add(this.tipoimagenpersonaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoImagenPersona(false);
			
			this.jTableDatosTipoImagenPersona.setRowSelectionInterval(this.getIndiceNuevoTipoImagenPersona(), this.getIndiceNuevoTipoImagenPersona());
			
			int iLastRow =  this.jTableDatosTipoImagenPersona.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoImagenPersona.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoImagenPersona.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoImagenPersona(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoImagenPersona(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoImagenPersona(false);
			
			//SI ES MANUAL
			if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoImagenPersona();
			}
			
			//this.abrirFrameTreeTipoImagenPersona();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Imagen PersonaS ?", "MANTENIMIENTO DE Tipo Imagen Persona", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoImagenPersona.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoImagenPersona();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoimagenpersonaReturnGeneral=tipoimagenpersonaLogic.procesarImportacionTipoImagenPersonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoimagenpersonaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoImagenPersonaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoImagenPersona.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoImagenPersona.setFileImportacion(this.jInternalFrameImportacionTipoImagenPersona.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoImagenPersona.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoImagenPersona.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoImagenPersona.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoImagenPersona.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();		

		tipoimagenpersonasSeleccionados=this.getTipoImagenPersonasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoImagenPersona.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoImagenPersona.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoImagenPersonaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoImagenPersonaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoImagenPersonas("Todos",tipoimagenpersonasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen Persona",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoImagenPersonaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoImagenPersona.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoImagenPersona.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoImagenPersona.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoImagenPersonaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoImagenPersona.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoImagenPersonaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoImagenPersonaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();		
		
		tipoimagenpersonasSeleccionados=this.getTipoImagenPersonasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagenpersona";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoImagenPersonas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoImagenPersonaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoImagenPersonaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoImagenPersona tipoimagenpersona:tipoimagenpersonasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoimagenpersona.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoImagenPersona tipoimagenpersona:tipoimagenpersonasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoimagenpersona.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoImagenPersona(row);				
			//	iRow++;
			//}				
			
			//for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoImagenPersona(tipoimagenpersonaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen Persona",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoimagenpersonaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoImagenPersona(false);
			
			//SI ES MANUAL
			if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoImagenPersona();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoImagenPersona(false);
			
			//SI ES MANUAL
			if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoImagenPersona();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoImagenPersonaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoImagenPersona(false);
			
			//SI ES MANUAL
			if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoImagenPersona();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoimagenpersonaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoImagenPersona() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoImagenPersona.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoImagenPersona.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoImagenPersona.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoImagenPersona.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoImagenPersona.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoImagenPersona.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoImagenPersona.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoImagenPersona(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoImagenPersona(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoImagenPersona(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoImagenPersona(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoImagenPersona(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoImagenPersona(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoImagenPersona(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoImagenPersona(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoImagenPersona() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoImagenPersona();
		
		this.inicializarActualizarBindingBotonesManualTipoImagenPersona(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoImagenPersona();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoImagenPersona() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoImagenPersona(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoImagenPersona(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoImagenPersona.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoImagenPersona.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoImagenPersona.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoImagenPersona.jCheckBoxPostAccionNuevoTipoImagenPersona.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoImagenPersona.jCheckBoxPostAccionSinCerrarTipoImagenPersona.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoImagenPersona.jCheckBoxPostAccionSinMensajeTipoImagenPersona.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoImagenPersona.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoImagenPersona.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoImagenPersona.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
				this.jInternalFrameDetalleFormTipoImagenPersona.jCheckBoxPostAccionNuevoTipoImagenPersona.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoImagenPersona.jCheckBoxPostAccionSinCerrarTipoImagenPersona.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoImagenPersona.jCheckBoxPostAccionSinMensajeTipoImagenPersona.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoImagenPersona.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoImagenPersona.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoImagenPersona.jComboBoxTiposAccionesFormularioTipoImagenPersona.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoImagenPersona.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoImagenPersona!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoImagenPersona.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoImagenPersona.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoImagenPersona.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoImagenPersona.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoImagenPersona.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoImagenPersona!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoImagenPersona.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoImagenPersona.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoImagenPersona.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoImagenPersona(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoImagenPersona(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoImagenPersona() throws Exception {
		try	{
			if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoImagenPersona();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoImagenPersona() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoImagenPersona.jComboBoxTiposAccionesFormularioTipoImagenPersona.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jComboBoxTiposAccionesFormularioTipoImagenPersona.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoImagenPersona() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoImagenPersona.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoImagenPersona.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoImagenPersona.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoImagenPersona.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoImagenPersona.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoImagenPersona.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoImagenPersona.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoImagenPersona.addItem(reporte);
			}
			
			
			if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoImagenPersona.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoImagenPersona.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoImagenPersona.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoImagenPersona.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoImagenPersona.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoImagenPersona.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoImagenPersona.jComboBoxTiposAccionesFormularioTipoImagenPersona.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoImagenPersona.jComboBoxTiposAccionesFormularioTipoImagenPersona.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoImagenPersona.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoImagenPersona.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoImagenPersona.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoImagenPersona();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoImagenPersona() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoImagenPersona!=null) {
				this.jInternalFrameReporteDinamicoTipoImagenPersona.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoImagenPersona.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoImagenPersona!=null) {
				this.jInternalFrameReporteDinamicoTipoImagenPersona.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoImagenPersona.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoImagenPersona!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoImagenPersona.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoImagenPersona()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoImagenPersona(Boolean esInicializar) throws Exception {				
		if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoImagenPersona();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoImagenPersona() throws Exception {
		this.inicializarActualizarBindingTablaTipoImagenPersona(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoImagenPersona() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoImagenPersonaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoImagenPersonaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoImagenPersonaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImagenPersonaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoImagenPersonaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoImagenPersonaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoImagenPersona(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoimagenpersonaLogic.getTipoImagenPersonas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoimagenpersonas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoImagenPersona.setModel(new TipoImagenPersonaModel(this.tipoimagenpersonaLogic.getTipoImagenPersonas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoImagenPersona.setModel(new TipoImagenPersonaModel(this.tipoimagenpersonas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoImagenPersona!=null && this.jInternalFrameOrderByTipoImagenPersona.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoImagenPersona();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoImagenPersona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImagenPersona,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoImagenPersonaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO,tipoimagenpersonaConstantesFunciones.resaltarSeleccionarTipoImagenPersona,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoImagenPersonaConstantesFunciones.SCLASSWEBTITULO,tipoimagenpersonaConstantesFunciones.resaltarSeleccionarTipoImagenPersona,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoImagenPersona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImagenPersona,TipoImagenPersonaConstantesFunciones.LABEL_ID));

		if(this.tipoimagenpersonaConstantesFunciones.mostraridTipoImagenPersona && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoImagenPersonaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoimagenpersonaConstantesFunciones.resaltaridTipoImagenPersona,this.tipoimagenpersonaConstantesFunciones.activaridTipoImagenPersona,this,true,"idTipoImagenPersona","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoimagenpersonaConstantesFunciones.resaltaridTipoImagenPersona,this.tipoimagenpersonaConstantesFunciones.activaridTipoImagenPersona,this,true,"idTipoImagenPersona","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoImagenPersona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImagenPersona,TipoImagenPersonaConstantesFunciones.LABEL_CODIGO));

		if(this.tipoimagenpersonaConstantesFunciones.mostrarcodigoTipoImagenPersona && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoImagenPersonaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoimagenpersonaConstantesFunciones.resaltarcodigoTipoImagenPersona,this.tipoimagenpersonaConstantesFunciones.activarcodigoTipoImagenPersona,this,true,"codigoTipoImagenPersona","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoimagenpersonaConstantesFunciones.resaltarcodigoTipoImagenPersona,this.tipoimagenpersonaConstantesFunciones.activarcodigoTipoImagenPersona,this,true,"codigoTipoImagenPersona","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoImagenPersonaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoImagenPersona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoImagenPersona,TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoimagenpersonaConstantesFunciones.mostrarnombreTipoImagenPersona && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoimagenpersonaConstantesFunciones.resaltarnombreTipoImagenPersona,this.tipoimagenpersonaConstantesFunciones.activarnombreTipoImagenPersona,this,true,"nombreTipoImagenPersona","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoimagenpersonaConstantesFunciones.resaltarnombreTipoImagenPersona,this.tipoimagenpersonaConstantesFunciones.activarnombreTipoImagenPersona,this,true,"nombreTipoImagenPersona","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoImagenPersonaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoImagenPersona.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoImagenPersona.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoImagenPersona && this.isPermisoGuardarCambiosTipoImagenPersona) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoImagenPersona.addColumn(tableColumn);
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
			
			this.jTableDatosTipoImagenPersona.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoImagenPersona && this.isPermisoGuardarCambiosTipoImagenPersona) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoImagenPersona && this.isPermisoGuardarCambiosTipoImagenPersona) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoImagenPersona.moveColumn(this.jTableDatosTipoImagenPersona.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoImagenPersona.moveColumn(this.jTableDatosTipoImagenPersona.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoImagenPersona.moveColumn(this.jTableDatosTipoImagenPersona.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoImagenPersona.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoImagenPersona.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoImagenPersona,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoImagenPersona.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoImagenPersona.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoImagenPersona.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoImagenPersona.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoImagenPersona.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoimagenpersonaLogic.getTipoImagenPersonas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoimagenpersonas.size()-1;
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
		//this.jTableDatosTipoImagenPersona.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoImagenPersona.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoImagenPersona();
			
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
				
				//this.isEsNuevoTipoImagenPersona=false;
					
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			
				if(this.tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoImagenPersona==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoImagenPersona.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoImagenPersona.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoimagenpersona.getsType().equals("DUPLICADO")
				   || this.tipoimagenpersona.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoImagenPersona=true;
				
				} else {
					this.isEsNuevoTipoImagenPersona=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoimagenpersona.getId()>=0 && !this.tipoimagenpersona.getIsNew()) {						
						this.isEsNuevoTipoImagenPersona=false;
						
					} else {
						this.isEsNuevoTipoImagenPersona=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoImagenPersona(esRelaciones);						
				
				this.seleccionarTipoImagenPersona(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoimagenpersona.getId()<0) {
					this.isEsNuevoTipoImagenPersona=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoImagenPersona(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoImagenPersona(evt,rowIndex);
				}	
				
				if(this.tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoImagenPersona: " + this.dDif); 
					}
				}								
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoImagenPersona(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoimagenpersona)) {
					if(this.tipoimagenpersona.getId()>0) {
						this.tipoimagenpersona.setIsDeleted(true);
						
						this.tipoimagenpersonasEliminados.add(this.tipoimagenpersona);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoimagenpersonaLogic.getTipoImagenPersonas().remove(this.tipoimagenpersona);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoimagenpersonas.remove(this.tipoimagenpersona);				
					}
					
					
					((TipoImagenPersonaModel) this.jTableDatosTipoImagenPersona.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoImagenPersona(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoImagenPersona(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoImagenPersona) {
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoImagenPersona.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoImagenPersona.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoImagenPersona(this.tipoimagenpersona);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoImagenPersona("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoImagenPersona(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoImagenPersona() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoImagenPersona(TipoImagenPersona tipoimagenpersona) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoImagenPersona(tipoimagenpersona,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoImagenPersona(TipoImagenPersona tipoimagenpersona,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoImagenPersona(tipoimagenpersona);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoImagenPersona(tipoimagenpersona,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoImagenPersona(tipoimagenpersona);
	}
	
	public void setVariablesObjetoActualToFormularioTipoImagenPersona(TipoImagenPersona tipoimagenpersona) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldidTipoImagenPersona.setText(tipoimagenpersona.getId().toString());
			this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldcodigoTipoImagenPersona.setText(tipoimagenpersona.getcodigo());
			this.jInternalFrameDetalleFormTipoImagenPersona.jTextAreanombreTipoImagenPersona.setText(tipoimagenpersona.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoImagenPersona tipoimagenpersonaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoimagenpersonaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoImagenPersona tipoimagenpersonaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoimagenpersonaLocal=this.tipoimagenpersona;
			} else {
				tipoimagenpersonaLocal=this.tipoimagenpersonaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoimagenpersonaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoImagenPersona(tipoimagenpersonaLocal,true);
					
					if(tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoimagenpersonaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoimagenpersonaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoImagenPersona(TipoImagenPersona tipoimagenpersona,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoImagenPersona(tipoimagenpersona,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(tipoimagenpersona);
	}
	
	public void setVariablesFormularioToObjetoActualTipoImagenPersona(TipoImagenPersona tipoimagenpersona,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoImagenPersona(tipoimagenpersona,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoImagenPersona(TipoImagenPersona tipoimagenpersona,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldidTipoImagenPersona.getText()==null || this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldidTipoImagenPersona.getText()=="" || this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldidTipoImagenPersona.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldidTipoImagenPersona.setText("0");
			}

			if(conColumnasBase) {tipoimagenpersona.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldidTipoImagenPersona.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoImagenPersonaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImagenPersona.jLabelIdTipoImagenPersona,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoimagenpersona.setcodigo(this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldcodigoTipoImagenPersona.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoImagenPersonaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImagenPersona.jLabelcodigoTipoImagenPersona,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoimagenpersona.setnombre(this.jInternalFrameDetalleFormTipoImagenPersona.jTextAreanombreTipoImagenPersona.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoImagenPersona.jLabelnombreTipoImagenPersona,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoImagenPersona(TipoImagenPersona tipoimagenpersonaBean,TipoImagenPersona tipoimagenpersona,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoImagenPersona(TipoImagenPersona tipoimagenpersonaOrigen,TipoImagenPersona tipoimagenpersona,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoimagenpersonaOrigen.getId()!=null && !tipoimagenpersonaOrigen.getId().equals(0L))) {tipoimagenpersona.setId(tipoimagenpersonaOrigen.getId());}}
			if(conDefault || (!conDefault && tipoimagenpersonaOrigen.getcodigo()!=null && !tipoimagenpersonaOrigen.getcodigo().equals(""))) {tipoimagenpersona.setcodigo(tipoimagenpersonaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoimagenpersonaOrigen.getnombre()!=null && !tipoimagenpersonaOrigen.getnombre().equals(""))) {tipoimagenpersona.setnombre(tipoimagenpersonaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoImagenPersona(TipoImagenPersona tipoimagenpersona) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldidTipoImagenPersona.setText(tipoimagenpersona.getId().toString());
			this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldcodigoTipoImagenPersona.setText(tipoimagenpersona.getcodigo());
			this.jInternalFrameDetalleFormTipoImagenPersona.jTextAreanombreTipoImagenPersona.setText(tipoimagenpersona.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoImagenPersona(TipoImagenPersonaBean tipoimagenpersonaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldidTipoImagenPersona.setText(tipoimagenpersonaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldcodigoTipoImagenPersona.setText(tipoimagenpersonaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoImagenPersona.jTextAreanombreTipoImagenPersona.setText(tipoimagenpersonaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoImagenPersona(TipoImagenPersonaParameterReturnGeneral tipoimagenpersonaReturnGeneral,TipoImagenPersonaBean tipoimagenpersonaBean,Boolean conDefault) throws Exception { 
		try {
			TipoImagenPersona tipoimagenpersonaLocal=new TipoImagenPersona();
			
			tipoimagenpersonaLocal=tipoimagenpersonaReturnGeneral.getTipoImagenPersona();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoimagenpersonaLocal.getId()!=null && !tipoimagenpersonaLocal.getId().equals(0L))) {tipoimagenpersonaBean.setId(tipoimagenpersonaLocal.getId());}}
			if(conDefault || (!conDefault && tipoimagenpersonaLocal.getcodigo()!=null && !tipoimagenpersonaLocal.getcodigo().equals(""))) {tipoimagenpersonaBean.setcodigo(tipoimagenpersonaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoimagenpersonaLocal.getnombre()!=null && !tipoimagenpersonaLocal.getnombre().equals(""))) {tipoimagenpersonaBean.setnombre(tipoimagenpersonaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoImagenPersonaGenerico(Long idTipoImagenPersonaSeleccionado,JComboBox jComboBoxTipoImagenPersona,List<TipoImagenPersona> tipoimagenpersonasLocal)throws Exception {
		try {
			TipoImagenPersona  tipoimagenpersonaTemp=null;

			for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonasLocal) {
				if(tipoimagenpersonaAux.getId()!=null && tipoimagenpersonaAux.getId().equals(idTipoImagenPersonaSeleccionado)) {
					tipoimagenpersonaTemp=tipoimagenpersonaAux;
					break;
				}
			}

			jComboBoxTipoImagenPersona.setSelectedItem(tipoimagenpersonaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoImagenPersonaGenerico(JComboBox jComboBoxTipoImagenPersona,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoImagenPersona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoImagenPersona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoImagenPersona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoImagenPersona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoImagenPersona.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoImagenPersona.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoImagenPersona.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoImagenPersona.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoImagenPersona.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoImagenPersona.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoimagenpersona=(TipoImagenPersona) tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoimagenpersona =(TipoImagenPersona) tipoimagenpersonas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoImagenPersona tipoimagenpersonaRow=new TipoImagenPersona();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoimagenpersonaRow=(TipoImagenPersona) tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoimagenpersonaRow=(TipoImagenPersona) tipoimagenpersonas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoImagenPersona(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoImagenPersona.setVisible((this.isVisibilidadCeldaNuevoTipoImagenPersona && this.isPermisoNuevoTipoImagenPersona));			
			this.jButtonDuplicarTipoImagenPersona.setVisible((this.isVisibilidadCeldaDuplicarTipoImagenPersona && this.isPermisoDuplicarTipoImagenPersona));			
			this.jButtonCopiarTipoImagenPersona.setVisible((this.isVisibilidadCeldaCopiarTipoImagenPersona && this.isPermisoCopiarTipoImagenPersona));
			this.jButtonVerFormTipoImagenPersona.setVisible((this.isVisibilidadCeldaVerFormTipoImagenPersona && this.isPermisoVerFormTipoImagenPersona));
			
			this.jButtonAbrirOrderByTipoImagenPersona.setVisible((this.isVisibilidadCeldaOrdenTipoImagenPersona && this.isPermisoOrdenTipoImagenPersona));			
			
			this.jButtonNuevoRelacionesTipoImagenPersona.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona && this.isPermisoNuevoTipoImagenPersona));			
			this.jButtonNuevoGuardarCambiosTipoImagenPersona.setVisible((this.isVisibilidadCeldaNuevoTipoImagenPersona && this.isPermisoNuevoTipoImagenPersona && this.isPermisoGuardarCambiosTipoImagenPersona));
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonModificarTipoImagenPersona.setVisible((this.isVisibilidadCeldaModificarTipoImagenPersona && this.isPermisoActualizarTipoImagenPersona));	
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonActualizarTipoImagenPersona.setVisible((this.isVisibilidadCeldaActualizarTipoImagenPersona && this.isPermisoActualizarTipoImagenPersona));	
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonEliminarTipoImagenPersona.setVisible((this.isVisibilidadCeldaEliminarTipoImagenPersona && this.isPermisoEliminarTipoImagenPersona));
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonCancelarTipoImagenPersona.setVisible(this.isVisibilidadCeldaCancelarTipoImagenPersona);							
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonGuardarCambiosTipoImagenPersona.setVisible((this.isVisibilidadCeldaGuardarTipoImagenPersona && this.isPermisoGuardarCambiosTipoImagenPersona));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoImagenPersona.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona && this.isPermisoGuardarCambiosTipoImagenPersona));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoImagenPersona.setVisible((this.isVisibilidadCeldaNuevoTipoImagenPersona && this.isPermisoNuevoTipoImagenPersona));						
			this.jButtonDuplicarToolBarTipoImagenPersona.setVisible((this.isVisibilidadCeldaDuplicarTipoImagenPersona && this.isPermisoDuplicarTipoImagenPersona));						
			this.jButtonCopiarToolBarTipoImagenPersona.setVisible((this.isVisibilidadCeldaCopiarTipoImagenPersona && this.isPermisoCopiarTipoImagenPersona));			
			this.jButtonVerFormToolBarTipoImagenPersona.setVisible((this.isVisibilidadCeldaVerFormTipoImagenPersona && this.isPermisoVerFormTipoImagenPersona));			
			this.jButtonAbrirOrderByToolBarTipoImagenPersona.setVisible((this.isVisibilidadCeldaOrdenTipoImagenPersona && this.isPermisoOrdenTipoImagenPersona));
			this.jButtonNuevoRelacionesToolBarTipoImagenPersona.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona && this.isPermisoNuevoTipoImagenPersona));			
			this.jButtonNuevoGuardarCambiosToolBarTipoImagenPersona.setVisible((this.isVisibilidadCeldaNuevoTipoImagenPersona && this.isPermisoNuevoTipoImagenPersona && this.isPermisoGuardarCambiosTipoImagenPersona));			
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonModificarToolBarTipoImagenPersona.setVisible((this.isVisibilidadCeldaModificarTipoImagenPersona && this.isPermisoActualizarTipoImagenPersona));	
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonActualizarToolBarTipoImagenPersona.setVisible((this.isVisibilidadCeldaActualizarTipoImagenPersona  && this.isPermisoActualizarTipoImagenPersona));	
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonEliminarToolBarTipoImagenPersona.setVisible((this.isVisibilidadCeldaEliminarTipoImagenPersona && this.isPermisoEliminarTipoImagenPersona));
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonCancelarToolBarTipoImagenPersona.setVisible(this.isVisibilidadCeldaCancelarTipoImagenPersona);				
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonGuardarCambiosToolBarTipoImagenPersona.setVisible((this.isVisibilidadCeldaGuardarTipoImagenPersona && this.isPermisoGuardarCambiosTipoImagenPersona));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoImagenPersona.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona && this.isPermisoGuardarCambiosTipoImagenPersona));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoImagenPersona.setVisible((this.isVisibilidadCeldaNuevoTipoImagenPersona && this.isPermisoNuevoTipoImagenPersona));			
			this.jMenuItemDuplicarTipoImagenPersona.setVisible((this.isVisibilidadCeldaDuplicarTipoImagenPersona && this.isPermisoDuplicarTipoImagenPersona));			
			this.jMenuItemCopiarTipoImagenPersona.setVisible((this.isVisibilidadCeldaCopiarTipoImagenPersona && this.isPermisoCopiarTipoImagenPersona));			
			this.jMenuItemVerFormTipoImagenPersona.setVisible((this.isVisibilidadCeldaVerFormTipoImagenPersona && this.isPermisoVerFormTipoImagenPersona));			
			this.jMenuItemAbrirOrderByTipoImagenPersona.setVisible((this.isVisibilidadCeldaOrdenTipoImagenPersona && this.isPermisoOrdenTipoImagenPersona));			
			//this.jMenuItemMostrarOcultarTipoImagenPersona.setVisible((this.isVisibilidadCeldaOrdenTipoImagenPersona && this.isPermisoOrdenTipoImagenPersona));
			this.jMenuItemDetalleAbrirOrderByTipoImagenPersona.setVisible((this.isVisibilidadCeldaOrdenTipoImagenPersona && this.isPermisoOrdenTipoImagenPersona));			
			//this.jMenuItemDetalleMostrarOcultarTipoImagenPersona.setVisible((this.isVisibilidadCeldaOrdenTipoImagenPersona && this.isPermisoOrdenTipoImagenPersona));			
			this.jMenuItemNuevoRelacionesTipoImagenPersona.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona && this.isPermisoNuevoTipoImagenPersona));			
			this.jMenuItemNuevoGuardarCambiosTipoImagenPersona.setVisible((this.isVisibilidadCeldaNuevoTipoImagenPersona && this.isPermisoNuevoTipoImagenPersona && this.isPermisoGuardarCambiosTipoImagenPersona));									
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemModificarTipoImagenPersona.setVisible((this.isVisibilidadCeldaModificarTipoImagenPersona && this.isPermisoActualizarTipoImagenPersona));	
			this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemActualizarTipoImagenPersona.setVisible((this.isVisibilidadCeldaActualizarTipoImagenPersona && this.isPermisoActualizarTipoImagenPersona));	
			this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemEliminarTipoImagenPersona.setVisible((this.isVisibilidadCeldaEliminarTipoImagenPersona && this.isPermisoEliminarTipoImagenPersona));
			this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemCancelarTipoImagenPersona.setVisible(this.isVisibilidadCeldaCancelarTipoImagenPersona);				
			}
			
			this.jMenuItemGuardarCambiosTipoImagenPersona.setVisible((this.isVisibilidadCeldaGuardarTipoImagenPersona && this.isPermisoGuardarCambiosTipoImagenPersona));						
			this.jMenuItemGuardarCambiosTablaTipoImagenPersona.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona && this.isPermisoGuardarCambiosTipoImagenPersona));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoImagenPersona=this.jButtonNuevoTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaDuplicarTipoImagenPersona=this.jButtonDuplicarTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaCopiarTipoImagenPersona=this.jButtonCopiarTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaVerFormTipoImagenPersona=this.jButtonVerFormTipoImagenPersona.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoImagenPersona=this.jButtonAbrirOrderByTipoImagenPersona.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=this.jButtonNuevoRelacionesTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaModificarTipoImagenPersona=this.jButtonModificarTipoImagenPersona.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
			this.isVisibilidadCeldaActualizarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jButtonActualizarTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaEliminarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jButtonEliminarTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaCancelarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jButtonCancelarTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaGuardarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jButtonGuardarCambiosTipoImagenPersona.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona=this.jButtonGuardarCambiosTablaTipoImagenPersona.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoImagenPersona=this.jButtonNuevoToolBarTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=this.jButtonNuevoRelacionesToolBarTipoImagenPersona.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
			this.isVisibilidadCeldaModificarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jButtonModificarToolBarTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaActualizarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jButtonActualizarToolBarTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaEliminarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jButtonEliminarToolBarTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaCancelarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jButtonCancelarToolBarTipoImagenPersona.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoImagenPersona=this.jButtonGuardarCambiosToolBarTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona=this.jButtonGuardarCambiosTablaToolBarTipoImagenPersona.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoImagenPersona=this.jMenuItemNuevoTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=this.jMenuItemNuevoRelacionesTipoImagenPersona.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
			this.isVisibilidadCeldaModificarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemModificarTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaActualizarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemActualizarTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaEliminarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemEliminarTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaCancelarTipoImagenPersona=this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemCancelarTipoImagenPersona.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoImagenPersona=this.jMenuItemGuardarCambiosTipoImagenPersona.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona=this.jMenuItemGuardarCambiosTablaTipoImagenPersona.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoImagenPersona(Boolean esInicializar) {
		if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoImagenPersona();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoImagenPersona(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoImagenPersona() {
		this.jButtonNuevoTipoImagenPersona.setVisible(this.isPermisoNuevoTipoImagenPersona);			
		this.jButtonDuplicarTipoImagenPersona.setVisible(this.isPermisoDuplicarTipoImagenPersona);			
		this.jButtonCopiarTipoImagenPersona.setVisible(this.isPermisoCopiarTipoImagenPersona);			
		this.jButtonVerFormTipoImagenPersona.setVisible(this.isPermisoVerFormTipoImagenPersona);			
		
		this.jButtonAbrirOrderByTipoImagenPersona.setVisible(this.isPermisoOrdenTipoImagenPersona);					
		
		this.jButtonNuevoRelacionesTipoImagenPersona.setVisible(this.isPermisoNuevoTipoImagenPersona);			
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonModificarTipoImagenPersona.setVisible(this.isPermisoActualizarTipoImagenPersona);	
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonActualizarTipoImagenPersona.setVisible(this.isPermisoActualizarTipoImagenPersona);	
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonEliminarTipoImagenPersona.setVisible(this.isPermisoEliminarTipoImagenPersona);
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonCancelarTipoImagenPersona.setVisible(this.isVisibilidadCeldaCancelarTipoImagenPersona);						
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonGuardarCambiosTipoImagenPersona.setVisible(this.isPermisoGuardarCambiosTipoImagenPersona);							
		}
		
		this.jButtonGuardarCambiosTablaTipoImagenPersona.setVisible(this.isPermisoActualizarTipoImagenPersona);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoImagenPersona() {
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonModificarTipoImagenPersona.setVisible(this.isPermisoActualizarTipoImagenPersona);	
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonActualizarTipoImagenPersona.setVisible(this.isPermisoActualizarTipoImagenPersona);	
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonEliminarTipoImagenPersona.setVisible(this.isPermisoEliminarTipoImagenPersona);
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonCancelarTipoImagenPersona.setVisible(this.isVisibilidadCeldaCancelarTipoImagenPersona);							
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonGuardarCambiosTipoImagenPersona.setVisible((this.isVisibilidadCeldaGuardarTipoImagenPersona && this.isPermisoGuardarCambiosTipoImagenPersona));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoImagenPersona() {
		if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoImagenPersona();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoImagenPersona() {
	}
	
	public void jTableDatosTipoImagenPersonaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoImagenPersona(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoImagenPersonaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoImagenPersona(this.gettipoimagenpersona(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(this.tipoimagenpersona);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoimagenpersona==null) {
						this.tipoimagenpersona = new TipoImagenPersona();
					}

					this.setVariablesFormularioToObjetoActualTipoImagenPersona(this.tipoimagenpersona,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(this.tipoimagenpersona);
				}

				if(this.tipoimagenpersona.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoimagenpersona.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoImagenPersona(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoImagenPersonaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoImagenPersona(this.gettipoimagenpersona(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(this.tipoimagenpersona);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoimagenpersona==null) {
						this.tipoimagenpersona = new TipoImagenPersona();
					}

					this.setVariablesFormularioToObjetoActualTipoImagenPersona(this.tipoimagenpersona,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(this.tipoimagenpersona);
				}

				if(this.tipoimagenpersona.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoimagenpersona.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoImagenPersona(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoImagenPersonaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoImagenPersona(this.gettipoimagenpersona(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(this.tipoimagenpersona);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoimagenpersona==null) {
						this.tipoimagenpersona = new TipoImagenPersona();
					}

					this.setVariablesFormularioToObjetoActualTipoImagenPersona(this.tipoimagenpersona,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(this.tipoimagenpersona);
				}

				if(this.tipoimagenpersona.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoimagenpersona.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoImagenPersona(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoImagenPersona() {
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
			this.jInternalFrameDetalleFormTipoImagenPersona.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoImagenPersona.dispose();
			this.jInternalFrameDetalleFormTipoImagenPersona=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoImagenPersona!=null) {
			this.jInternalFrameReporteDinamicoTipoImagenPersona.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoImagenPersona.dispose();
			this.jInternalFrameReporteDinamicoTipoImagenPersona=null;
		}
		
		if(this.jInternalFrameImportacionTipoImagenPersona!=null) {
			this.jInternalFrameImportacionTipoImagenPersona.setVisible(false);	    			
			this.jInternalFrameImportacionTipoImagenPersona.dispose();
			this.jInternalFrameImportacionTipoImagenPersona=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoImagenPersona();
			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoImagenPersona")) {
				jButtonNuevoTipoImagenPersonaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoImagenPersona")) {
				jButtonDuplicarTipoImagenPersonaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoImagenPersona")) {
				jButtonCopiarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoImagenPersona")) {
				jButtonVerFormTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoImagenPersona")) {
				jButtonNuevoTipoImagenPersonaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoImagenPersona")) {
				jButtonDuplicarTipoImagenPersonaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoImagenPersona")) {
				jButtonNuevoTipoImagenPersonaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoImagenPersona")) {
				jButtonDuplicarTipoImagenPersonaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoImagenPersona")) {
				jButtonNuevoTipoImagenPersonaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoImagenPersona")) {
				jButtonNuevoTipoImagenPersonaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoImagenPersona")) {
				jButtonNuevoTipoImagenPersonaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoImagenPersona")) {
				jButtonModificarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoImagenPersona")) {
				jButtonModificarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoImagenPersona")) {
				jButtonModificarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoImagenPersona")) {
				jButtonActualizarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoImagenPersona")) {
				jButtonActualizarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoImagenPersona")) {
				jButtonActualizarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoImagenPersona")) {
				jButtonEliminarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoImagenPersona")) {
				jButtonEliminarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoImagenPersona")) {
				jButtonEliminarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoImagenPersona")) {
				jButtonCancelarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoImagenPersona")) {
				jButtonCancelarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoImagenPersona")) {
				jButtonCancelarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoImagenPersona")) {
				jButtonCerrarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoImagenPersona")) {
				jButtonCerrarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoImagenPersona")) {
				jButtonCerrarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoImagenPersona")) {
				jButtonMostrarOcultarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoImagenPersona")) {
				jButtonCancelarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoImagenPersona")) {
				jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoImagenPersona")) {
				jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoImagenPersona")) {
				jButtonCopiarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoImagenPersona")) {
				jButtonVerFormTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoImagenPersona")) {
				jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoImagenPersona")) {
				jButtonCopiarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoImagenPersona")) {
				jButtonVerFormTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoImagenPersona")) {
				jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoImagenPersona")) {
				jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoImagenPersona")) {
				jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoImagenPersona")) {
				jButtonRecargarInformacionTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoImagenPersona")) {
				jButtonRecargarInformacionTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoImagenPersona")) {
				jButtonRecargarInformacionTipoImagenPersonaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoImagenPersona")) {
				jButtonAnterioresTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoImagenPersona")) {
				jButtonAnterioresTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoImagenPersona")) {
				jButtonAnterioresTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoImagenPersona")) {
				jButtonSiguientesTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoImagenPersona")) {
				jButtonSiguientesTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoImagenPersona")) {
				jButtonSiguientesTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoImagenPersona") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoImagenPersona")) {
				jButtonAbrirOrderByTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoImagenPersona") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoImagenPersona")) {
				jButtonMostrarOcultarTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoImagenPersona")) {
				jButtonNuevoGuardarCambiosTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoImagenPersona")) {
				jButtonNuevoGuardarCambiosTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoImagenPersona")) {
				jButtonNuevoGuardarCambiosTipoImagenPersonaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoImagenPersona")) {
				jButtonCerrarReporteDinamicoTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoImagenPersona")) {
				jButtonGenerarReporteDinamicoTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoImagenPersona")) {
				
				jButtonGenerarExcelReporteDinamicoTipoImagenPersonaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoImagenPersona")) {
				jButtonCerrarImportacionTipoImagenPersonaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoImagenPersona")) {
				
				jButtonGenerarImportacionTipoImagenPersonaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoImagenPersona")) {
				
				jButtonAbrirImportacionTipoImagenPersonaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoImagenPersona")) {
				jComboBoxTiposAccionesTipoImagenPersonaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoImagenPersona")) {
				jComboBoxTiposRelacionesTipoImagenPersonaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoImagenPersona")) {
				jComboBoxTiposAccionesTipoImagenPersonaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoImagenPersona")) {
				
				jComboBoxTiposSeleccionarTipoImagenPersonaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoImagenPersona")) {
				jTextFieldValorCampoGeneralTipoImagenPersonaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoImagenPersona")) {
				jButtonAbrirOrderByTipoImagenPersonaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoImagenPersona")) {
				jButtonAbrirOrderByTipoImagenPersonaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoImagenPersona")) {
				jButtonCerrarOrderByTipoImagenPersonaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoImagenPersonaBusqueda")) {
				this.jButtonidTipoImagenPersonaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoImagenPersonaBusqueda")) {
				this.jButtoncodigoTipoImagenPersonaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoImagenPersonaBusqueda")) {
				this.jButtonnombreTipoImagenPersonaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoImagenPersona();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenPersonaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				


				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagenPersona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagenPersona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoImagenPersona tipoimagenpersonaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoimagenpersonaLocal=this.tipoimagenpersona;
			} else {
				tipoimagenpersonaLocal=this.tipoimagenpersonaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
							
				
				


				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagenPersona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagenPersona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenPersonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
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
			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			
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
			
			


			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenPersonaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
								
						
				


				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagenPersona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagenPersona.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
								
				
				


				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagenPersona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagenPersona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenPersonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenPersonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenPersonaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
							
				
				


				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagenPersona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagenPersona.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenPersonaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
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
			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			
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
			
			


			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenPersonaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
								
				
				


				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagenPersona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagenPersona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenPersonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenPersonaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenPersonaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoImagenPersona")) {
					jCheckBoxSeleccionarTodosTipoImagenPersonaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoImagenPersona")) {
					jCheckBoxSeleccionadosTipoImagenPersonaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoImagenPersona")) {
					
				}
				
				


				
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagenPersona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagenPersona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
												
				
				


				
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagenPersona.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagenPersona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenPersonaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenPersonaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
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
			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
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
			
			


			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoImagenPersonaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagenPersona.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagenPersona.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoimagenpersona);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoimagenpersona);
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
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
				
				


				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoImagenPersona.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoImagenPersona.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoImagenPersonaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoimagenpersonaAnterior =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoImagenPersona")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoImagenPersonaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoImagenPersona.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoimagenpersona =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoimagenpersona);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoImagenPersona")) {
				
				}
				
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoImagenPersona")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoImagenPersona.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoImagenPersona")) {
			
			}
			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoImagenPersona();
			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoImagenPersona")) {
				jButtonNuevoTipoImagenPersonaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoImagenPersona")) {
				jButtonDuplicarTipoImagenPersonaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoImagenPersona")) {
				jButtonCopiarTipoImagenPersonaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoImagenPersona")) {
				jButtonVerFormTipoImagenPersonaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoImagenPersona")) {
				jButtonNuevoTipoImagenPersonaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoImagenPersona")) {
				jButtonModificarTipoImagenPersonaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoImagenPersona")) {
				jButtonActualizarTipoImagenPersonaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoImagenPersona")) {
				jButtonEliminarTipoImagenPersonaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoImagenPersona")) {
				jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoImagenPersona")) {
				jButtonCancelarTipoImagenPersonaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoImagenPersona")) {
				jButtonCerrarTipoImagenPersonaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoImagenPersona")) {
				jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoImagenPersona")) {
				jButtonNuevoGuardarCambiosTipoImagenPersonaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoImagenPersona")) {
				jButtonAbrirOrderByTipoImagenPersonaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoImagenPersona")) {
				jButtonRecargarInformacionTipoImagenPersonaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoImagenPersona")) {
				jButtonAnterioresTipoImagenPersonaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoImagenPersona")) {
				jButtonSiguientesTipoImagenPersonaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoImagenPersonaBusqueda")) {
				this.jButtonidTipoImagenPersonaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoImagenPersonaBusqueda")) {
				this.jButtoncodigoTipoImagenPersonaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoImagenPersonaBusqueda")) {
				this.jButtonnombreTipoImagenPersonaBusquedaActionPerformed(evt);
			}
			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoImagenPersona();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoImagenPersona")) {
				closingInternalFrameTipoImagenPersona();
				
			} else if(sTipo.equals("jButtonCancelarTipoImagenPersona")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoImagenPersona = (JInternalFrameBase)evt.getSource();
	            	
	            TipoImagenPersonaBeanSwingJInternalFrame jInternalFrameParent=(TipoImagenPersonaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoImagenPersona.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoImagenPersonaActionPerformed(null);
			}
			
			TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoimagenpersona,new Object(),this.tipoimagenpersonaParameterGeneral,this.tipoimagenpersonaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoImagenPersona(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoImagenPersona(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoImagenPersona(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoimagenpersona)) {
			if(!esControlTabla) {
				if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoImagenPersona(this.tipoimagenpersona,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(this.tipoimagenpersona);			
				}
				
				if(this.tipoimagenpersonaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoImagenPersona(this.tipoimagenpersona,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoimagenpersonaReturnGeneral=tipoimagenpersonaLogic.procesarEventosTipoImagenPersonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoimagenpersonaLogic.getTipoImagenPersonas(),this.tipoimagenpersona,this.tipoimagenpersonaParameterGeneral,this.isEsNuevoTipoImagenPersona,classes);//this.tipoimagenpersonaLogic.getTipoImagenPersona()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoImagenPersona(this.tipoimagenpersonaReturnGeneral,this.tipoimagenpersonaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoimagenpersonaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoImagenPersona(classes,this.tipoimagenpersonaReturnGeneral,this.tipoimagenpersonaBean,false);
					}
						
					if(this.tipoimagenpersonaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoImagenPersona(this.tipoimagenpersonaReturnGeneral.getTipoImagenPersona());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoImagenPersona(this.tipoimagenpersonaReturnGeneral.getTipoImagenPersona());	
					}
						
					if(this.tipoimagenpersonaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoImagenPersona(this.tipoimagenpersonaReturnGeneral.getTipoImagenPersona(),classes);//this.tipoimagenpersonaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoImagenPersona(this.tipoimagenpersona,classes);//this.tipoimagenpersonaBean);									
				}
			
				if(TipoImagenPersonaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoImagenPersona(this.tipoimagenpersona,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoImagenPersona(this.tipoimagenpersona);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoimagenpersonaAnterior!=null) {
						this.tipoimagenpersona=this.tipoimagenpersonaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoimagenpersonaReturnGeneral=tipoimagenpersonaLogic.procesarEventosTipoImagenPersonasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoimagenpersonaLogic.getTipoImagenPersonas(),this.tipoimagenpersona,this.tipoimagenpersonaParameterGeneral,this.isEsNuevoTipoImagenPersona,classes);//this.tipoimagenpersonaLogic.getTipoImagenPersona()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoimagenpersonaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoimagenpersonaReturnGeneral.getTipoImagenPersona(),tipoimagenpersonaLogic.getTipoImagenPersonas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoimagenpersonaReturnGeneral.getTipoImagenPersona(),this.tipoimagenpersonas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoImagenPersona.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoImagenPersona.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoImagenPersona();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoImagenPersona() throws Exception {
		
		TipoImagenPersonaModel tipoimagenpersonaModel=(TipoImagenPersonaModel)this.jTableDatosTipoImagenPersona.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoimagenpersonaModel.tipoimagenpersonas=this.tipoimagenpersonaLogic.getTipoImagenPersonas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoimagenpersonaModel.tipoimagenpersonas=this.tipoimagenpersonas;
		}
		
		
		((TipoImagenPersonaModel) this.jTableDatosTipoImagenPersona.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoImagenPersona() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoimagenpersonaAnterior(),this.tipoimagenpersonaLogic.getTipoImagenPersonas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoimagenpersonaAnterior(),this.tipoimagenpersonas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoImagenPersona();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoImagenPersona(TipoImagenPersona tipoimagenpersona,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
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
										
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoimagenpersona,new Object(),generalEntityParameterGeneral,this.tipoimagenpersonaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoImagenPersonaConstantesFunciones.getClassesRelationshipsOfTipoImagenPersona(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoImagenPersonaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoImagenPersona(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoImagenPersona(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoImagenPersonaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoimagenpersona,new Object(),generalEntityParameterGeneral,this.tipoimagenpersonaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoImagenPersona(TipoImagenPersonaBean tipoimagenpersonaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoImagenPersona(ArrayList<Classe> classes,TipoImagenPersonaReturnGeneral tipoimagenpersonaReturnGeneral,TipoImagenPersonaBean tipoimagenpersonaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoImagenPersona(TipoImagenPersona tipoimagenpersona,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoimagenpersona)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoImagenPersona = new TipoImagenPersonaDetalleFormJInternalFrame(jDesktopPane,this.tipoimagenpersonaSessionBean.getConGuardarRelaciones(),this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoImagenPersona);
		this.jInternalFrameDetalleFormTipoImagenPersona.setVisible(false);
		this.jInternalFrameDetalleFormTipoImagenPersona.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoImagenPersona.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoImagenPersona.tipoimagenpersonaLogic=this.tipoimagenpersonaLogic;
		
		this.cargarCombosFrameForeignKeyTipoImagenPersona("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoImagenPersona();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoImagenPersona();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoImagenPersona("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoImagenPersona();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoImagenPersona.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoImagenPersona"));
		
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonModificarTipoImagenPersona.addActionListener(new ButtonActionListener(this,"ModificarTipoImagenPersona"));

		
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonModificarToolBarTipoImagenPersona.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoImagenPersona"));
					
		this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemModificarTipoImagenPersona.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoImagenPersona"));		
		
		
		
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonActualizarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"ActualizarTipoImagenPersona"));
		
		
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonActualizarToolBarTipoImagenPersona.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoImagenPersona"));
						
		this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemActualizarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoImagenPersona"));		
		
		
		
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonEliminarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"EliminarTipoImagenPersona"));
		
		
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonEliminarToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoImagenPersona"));
								
		this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemEliminarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoImagenPersona"));		
		
		
		
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonCancelarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"CancelarTipoImagenPersona"));
		
		
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonCancelarToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoImagenPersona"));
					
		this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemCancelarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoImagenPersona"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemDetalleCerrarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoImagenPersona"));		
		
		
		
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonGuardarCambiosToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoImagenPersona"));
		
		
		
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonGuardarCambiosToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoImagenPersona"));
		
		
		
		this.jInternalFrameDetalleFormTipoImagenPersona.jComboBoxTiposAccionesFormularioTipoImagenPersona.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoImagenPersona"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonidTipoImagenPersonaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoImagenPersonaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtoncodigoTipoImagenPersonaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoImagenPersonaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonnombreTipoImagenPersonaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoImagenPersonaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoImagenPersona.jTabbedPaneRelacionesTipoImagenPersona.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoImagenPersona"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoImagenPersona"));
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoImagenPersona"));
		}
		
		this.jTableDatosTipoImagenPersona.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoImagenPersona"));
		
		this.jTableDatosTipoImagenPersona.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoImagenPersona"));
		
		this.jButtonNuevoTipoImagenPersona.addActionListener(new ButtonActionListener(this,"NuevoTipoImagenPersona"));
		
		this.jButtonDuplicarTipoImagenPersona.addActionListener(new ButtonActionListener(this,"DuplicarTipoImagenPersona"));
		
		this.jButtonCopiarTipoImagenPersona.addActionListener(new ButtonActionListener(this,"CopiarTipoImagenPersona"));
		
		this.jButtonVerFormTipoImagenPersona.addActionListener(new ButtonActionListener(this,"VerFormTipoImagenPersona"));
		
		
		this.jButtonNuevoToolBarTipoImagenPersona.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoImagenPersona"));
			
		this.jButtonDuplicarToolBarTipoImagenPersona.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoImagenPersona"));
			
		this.jMenuItemNuevoTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoImagenPersona"));
			
		this.jMenuItemDuplicarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoImagenPersona"));		
		
		
		this.jButtonNuevoRelacionesTipoImagenPersona.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoImagenPersona"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoImagenPersona.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoImagenPersona"));
			
		this.jMenuItemNuevoRelacionesTipoImagenPersona.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoImagenPersona"));		
		
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonModificarTipoImagenPersona.addActionListener(new ButtonActionListener(this,"ModificarTipoImagenPersona"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonModificarToolBarTipoImagenPersona.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoImagenPersona"));
			
			this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemModificarTipoImagenPersona.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoImagenPersona"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonActualizarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"ActualizarTipoImagenPersona"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonActualizarToolBarTipoImagenPersona.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoImagenPersona"));
				
			this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemActualizarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoImagenPersona"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonEliminarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"EliminarTipoImagenPersona"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonEliminarToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoImagenPersona"));
						
			this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemEliminarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoImagenPersona"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonCancelarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"CancelarTipoImagenPersona"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonCancelarToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoImagenPersona"));
			
			this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemCancelarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoImagenPersona"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoImagenPersona"));		
		
		
		this.jButtonCerrarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"CerrarTipoImagenPersona"));
		
		
		this.jButtonCerrarToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoImagenPersona"));
			
		this.jMenuItemCerrarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoImagenPersona"));
			
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jMenuItemDetalleCerrarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoImagenPersona"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonGuardarCambiosTipoImagenPersona.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoImagenPersona"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jButtonGuardarCambiosToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoImagenPersona"));
		}
		
		this.jButtonCopiarToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoImagenPersona"));
			
		this.jButtonVerFormToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoImagenPersona"));
		
		this.jMenuItemGuardarCambiosTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoImagenPersona"));
			
		this.jMenuItemCopiarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoImagenPersona"));		
		
		this.jMenuItemVerFormTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoImagenPersona"));		
		
		
		this.jButtonGuardarCambiosTablaTipoImagenPersona.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoImagenPersona"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoImagenPersona"));
			
		this.jMenuItemGuardarCambiosTablaTipoImagenPersona.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoImagenPersona"));		
		
		
		
		this.jButtonRecargarInformacionTipoImagenPersona.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoImagenPersona"));
					
		this.jButtonRecargarInformacionToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoImagenPersona"));
		
		this.jMenuItemRecargarInformacionTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoImagenPersona"));		
		
		
		
		this.jButtonAnterioresTipoImagenPersona.addActionListener (new ButtonActionListener(this,"AnterioresTipoImagenPersona"));
		
		
		this.jButtonAnterioresToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoImagenPersona"));
		
		this.jMenuItemAnterioresTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoImagenPersona"));		
		
		
		this.jButtonSiguientesTipoImagenPersona.addActionListener (new ButtonActionListener(this,"SiguientesTipoImagenPersona"));
		
		
		this.jButtonSiguientesToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoImagenPersona"));
			
		this.jMenuItemSiguientesTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoImagenPersona"));
			
		this.jMenuItemAbrirOrderByTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoImagenPersona"));
			
		this.jMenuItemMostrarOcultarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoImagenPersona"));
			
		this.jMenuItemDetalleAbrirOrderByTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoImagenPersona"));
			
		this.jMenuItemDetalleMostarOcultarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoImagenPersona"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoImagenPersona.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoImagenPersona"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoImagenPersona"));
			
		this.jMenuItemNuevoGuardarCambiosTipoImagenPersona.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoImagenPersona"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoImagenPersona.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoImagenPersona"));

		this.jCheckBoxSeleccionadosTipoImagenPersona.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoImagenPersona"));
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jComboBoxTiposAccionesFormularioTipoImagenPersona.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoImagenPersona"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoImagenPersona.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoImagenPersona"));
			
		this.jComboBoxTiposAccionesTipoImagenPersona.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoImagenPersona"));
					
		this.jComboBoxTiposSeleccionarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoImagenPersona"));
			
		this.jTextFieldValorCampoGeneralTipoImagenPersona.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoImagenPersona"));		
		
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonidTipoImagenPersonaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoImagenPersonaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtoncodigoTipoImagenPersonaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoImagenPersonaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonnombreTipoImagenPersonaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoImagenPersonaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoImagenPersona!=null) {
				this.jInternalFrameReporteDinamicoTipoImagenPersona.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoImagenPersona"));
				this.jInternalFrameReporteDinamicoTipoImagenPersona.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoImagenPersona"));
				this.jInternalFrameReporteDinamicoTipoImagenPersona.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoImagenPersona"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoImagenPersona.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoImagenPersona"));				
			//this.jButtonGenerarReporteDinamicoTipoImagenPersona.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoImagenPersona"));
			//this.jButtonGenerarExcelReporteDinamicoTipoImagenPersona.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoImagenPersona"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoImagenPersona!=null) {
				this.jInternalFrameImportacionTipoImagenPersona.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoImagenPersona"));
				this.jInternalFrameImportacionTipoImagenPersona.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoImagenPersona"));
				this.jInternalFrameImportacionTipoImagenPersona.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoImagenPersona"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoImagenPersona.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoImagenPersona"));
			
			this.jButtonAbrirOrderByToolBarTipoImagenPersona.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoImagenPersona"));			
			
			if(this.jInternalFrameOrderByTipoImagenPersona!=null) {
				this.jInternalFrameOrderByTipoImagenPersona.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoImagenPersona"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoImagenPersona.jTabbedPaneRelacionesTipoImagenPersona.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoImagenPersona"));
		
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
            		closingInternalFrameTipoImagenPersona();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoImagenPersona.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoImagenPersona = (JInternalFrameBase)event.getSource();
	            	
	            TipoImagenPersonaBeanSwingJInternalFrame jInternalFrameParent=(TipoImagenPersonaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoImagenPersona.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoImagenPersonaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoImagenPersona.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoImagenPersonaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoImagenPersona.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoImagenPersona.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImagenPersonaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImagenPersonaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImagenPersonaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoImagenPersona";
		inputMap = this.jButtonNuevoTipoImagenPersona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoImagenPersona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoImagenPersonaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImagenPersonaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImagenPersonaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoImagenPersonaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoImagenPersona";
		inputMap = this.jButtonNuevoRelacionesTipoImagenPersona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoImagenPersona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoImagenPersonaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoImagenPersona";
		inputMap = this.jButtonModificarTipoImagenPersona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoImagenPersona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoImagenPersonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoImagenPersona";
		inputMap = this.jButtonActualizarTipoImagenPersona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoImagenPersona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoImagenPersonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoImagenPersona";
		inputMap = this.jButtonEliminarTipoImagenPersona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoImagenPersona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoImagenPersonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoImagenPersona";
		inputMap = this.jButtonCancelarTipoImagenPersona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoImagenPersona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoImagenPersonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoImagenPersona";
		inputMap = this.jButtonCerrarTipoImagenPersona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoImagenPersona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoImagenPersonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonGuardarCambiosTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoImagenPersona";
		inputMap = this.jInternalFrameDetalleFormTipoImagenPersona.jButtonGuardarCambiosTipoImagenPersona.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonGuardarCambiosTipoImagenPersona.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoImagenPersonaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoImagenPersona.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoImagenPersonaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoImagenPersona.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoImagenPersonaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoImagenPersona.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoImagenPersonaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoImagenPersona.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoImagenPersonaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonidTipoImagenPersonaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoImagenPersonaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtoncodigoTipoImagenPersonaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoImagenPersonaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoImagenPersona.jButtonnombreTipoImagenPersonaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoImagenPersonaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoImagenPersona.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoImagenPersonaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoImagenPersonaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoImagenPersona.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoImagenPersona(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonaLogic.getTipoImagenPersonas()) {
					tipoimagenpersonaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonas) {
					tipoimagenpersonaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoImagenPersonaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoImagenPersona(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonaLogic.getTipoImagenPersonas()) {
						tipoimagenpersonaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonas) {
						tipoimagenpersonaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonaLogic.getTipoImagenPersonas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoImagenPersona(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoImagenPersona.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoImagenPersona.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoImagenPersona,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoImagenPersonaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoImagenPersona(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoImagenPersona.getSelectedRows();
			
			TipoImagenPersona tipoimagenpersonaLocal=new TipoImagenPersona();
			
			//this.seleccionarTodosTipoImagenPersona(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoimagenpersonaLocal =(TipoImagenPersona) this.tipoimagenpersonaLogic.getTipoImagenPersonas().toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoimagenpersonaLocal =(TipoImagenPersona) this.tipoimagenpersonas.toArray()[this.jTableDatosTipoImagenPersona.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoimagenpersonaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonaLogic.getTipoImagenPersonas()) {
						tipoimagenpersonaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonas) {
						tipoimagenpersonaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoImagenPersona(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoImagenPersona.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoImagenPersona.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoImagenPersona,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoImagenPersonaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoImagenPersonaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoImagenPersonaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoImagenPersona(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoImagenPersona.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonaLogic.getTipoImagenPersonas()) {
				
						if(sTipoSeleccionar.equals(TipoImagenPersonaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoimagenpersonaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoimagenpersonaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonas) {
					
						if(sTipoSeleccionar.equals(TipoImagenPersonaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoimagenpersonaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoimagenpersonaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoImagenPersona(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoImagenPersonaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoImagenPersona(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoImagenPersona=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoImagenPersona.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoImagenPersona.jComboBoxTiposAccionesFormularioTipoImagenPersona.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoImagenPersona) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoImagenPersona(conSplash);
				
					this.generarReporteTipoImagenPersonasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoImagenPersona.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoImagenPersona.jComboBoxTiposAccionesFormularioTipoImagenPersona.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoImagenPersonasSeleccionados();
				//this.jComboBoxTiposAccionesTipoImagenPersona.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoImagenPersonasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoImagenPersona.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoImagenPersonasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoImagenPersona.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoImagenPersona();
				
				this.exportarTipoImagenPersonasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoImagenPersona.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoImagenPersona.jComboBoxTiposAccionesFormularioTipoImagenPersona.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoImagenPersonas();
				//this.importarTipoImagenPersonas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoImagenPersona.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoImagenPersona.jComboBoxTiposAccionesFormularioTipoImagenPersona.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoImagenPersona();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoImagenPersonasSeleccionados();
				//this.jComboBoxTiposAccionesTipoImagenPersona.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Imagen Persona", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoImagenPersona();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoImagenPersona)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoImagenPersona(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Imagen Persona",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoImagenPersona.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoImagenPersona.jComboBoxTiposAccionesFormularioTipoImagenPersona.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoImagenPersona();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoImagenPersona(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoImagenPersonaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoImagenPersona();
			
			if(this.jInternalFrameDetalleFormTipoImagenPersona==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();		
			TipoImagenPersona tipoimagenpersona=new TipoImagenPersona();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoImagenPersona(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoImagenPersona.getSelectedItem();
			
			
			
			
			tipoimagenpersonasSeleccionados=this.getTipoImagenPersonasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoimagenpersonasSeleccionados.size()==1) {
				for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonasSeleccionados) {
					tipoimagenpersona=tipoimagenpersonaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoImagenPersona();
			
      		//this.finishProcessTipoImagenPersona(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoImagenPersonaReturnGeneral() throws Exception {
		if(this.tipoimagenpersonaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoimagenpersonaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoimagenpersonaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoimagenpersonaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoimagenpersonaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoimagenpersonaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoImagenPersona(false);
		}
		
		if(this.tipoimagenpersonaReturnGeneral.getConRetornoLista() || this.tipoimagenpersonaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoimagenpersonaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoimagenpersonaLogic.setTipoImagenPersonas(this.tipoimagenpersonaReturnGeneral.getTipoImagenPersonas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoimagenpersonaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoimagenpersonaLogic.setTipoImagenPersona(this.tipoimagenpersonaReturnGeneral.getTipoImagenPersona());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoImagenPersona(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoImagenPersona() throws Exception {
		
		
	}
	
	public ArrayList<TipoImagenPersona> getTipoImagenPersonasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoImagenPersona) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonaLogic.getTipoImagenPersonas()) {
					if(tipoimagenpersonaAux.getIsSelected()) {
						tipoimagenpersonasSeleccionados.add(tipoimagenpersonaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoImagenPersona tipoimagenpersonaAux:this.tipoimagenpersonas) {
					if(tipoimagenpersonaAux.getIsSelected()) {
						tipoimagenpersonasSeleccionados.add(tipoimagenpersonaAux);				
					}
				}
			}
			
			if(tipoimagenpersonasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoimagenpersonasSeleccionados.addAll(this.tipoimagenpersonaLogic.getTipoImagenPersonas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoimagenpersonasSeleccionados.addAll(this.tipoimagenpersonas);				
					}
				}
			}
		} else {
			tipoimagenpersonasSeleccionados.add(this.tipoimagenpersona);
		}
		
		return tipoimagenpersonasSeleccionados;
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
	
	public void generarReporteTipoImagenPersonasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoImagenPersonasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoImagenPersonasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoImagenPersonasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoImagenPersonasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Imagen Persona",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoImagenPersonasSeleccionados() throws Exception {
		ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();		
		
		tipoimagenpersonasSeleccionados=this.getTipoImagenPersonasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoImagenPersonas("Todos",tipoimagenpersonasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoImagenPersonasSeleccionados() throws Exception {
		ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();		
		
		tipoimagenpersonasSeleccionados=this.getTipoImagenPersonasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoImagenPersonas("Todos",tipoimagenpersonasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoImagenPersonasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();
		
		tipoimagenpersonasSeleccionados=this.getTipoImagenPersonasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoImagenPersonas("Todos",tipoimagenpersonasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoImagenPersonasSeleccionados() throws Exception {
		ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoImagenPersona();
		
		
		tipoimagenpersonasSeleccionados=this.getTipoImagenPersonasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoImagenPersona();
		
		
		//this.generarReporteTipoImagenPersonas("Todos",tipoimagenpersonasSeleccionados ,tipoimagenpersonaImplementable,tipoimagenpersonaImplementableHome);
	}
	
	public void mostrarImportacionTipoImagenPersonas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoImagenPersona();
		
		this.abrirFrameImportacionTipoImagenPersona();		
		
			
		//this.generarReporteTipoImagenPersonas("Todos",tipoimagenpersonasSeleccionados ,tipoimagenpersonaImplementable,tipoimagenpersonaImplementableHome);
	}
	
	public void importarTipoImagenPersonas() throws Exception {		
	
	}
	
	public void exportarTipoImagenPersonasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoImagenPersonasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoImagenPersonasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoImagenPersonasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Imagen Persona",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoImagenPersonasSeleccionados() throws Exception {
		ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();		
		
		tipoimagenpersonasSeleccionados=this.getTipoImagenPersonasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagenpersona."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoImagenPersona(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoImagenPersona(tipoimagenpersonaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoimagenpersonaAux.setsDetalleGeneralEntityReporte(tipoimagenpersonaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen Persona",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoImagenPersona(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoImagenPersonaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoImagenPersonaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoImagenPersonaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoImagenPersona(TipoImagenPersona tipoimagenpersona,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoimagenpersona.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoimagenpersona.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoimagenpersona.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoimagenpersona.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoImagenPersonasSeleccionados() throws Exception {
		ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();		
		
		tipoimagenpersonasSeleccionados=this.getTipoImagenPersonasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagenpersona.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoImagenPersonas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoImagenPersona(row);				
				iRow++;
			}				
			
			for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoImagenPersona(tipoimagenpersonaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen Persona",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoImagenPersonasSeleccionados() throws Exception {
		ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();		
		
		tipoimagenpersonasSeleccionados=this.getTipoImagenPersonasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoimagenpersona.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoimagenpersonas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoimagenpersona");
			//elementRoot.appendChild(element);
		
			for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonasSeleccionados) {
				element = document.createElement("tipoimagenpersona");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoImagenPersona(tipoimagenpersonaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Imagen Persona",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoImagenPersona(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoImagenPersonaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoImagenPersonaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoImagenPersonaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoImagenPersona(TipoImagenPersona tipoimagenpersona,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoimagenpersona.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoimagenpersona.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoimagenpersona.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoImagenPersona(TipoImagenPersona tipoimagenpersona,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoImagenPersonaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoimagenpersona.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoImagenPersonaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoimagenpersona.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoImagenPersonaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoimagenpersona.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoImagenPersonaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoimagenpersona.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoImagenPersonasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados=new ArrayList<TipoImagenPersona>();
		
		tipoimagenpersonasSeleccionados=this.getTipoImagenPersonasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoImagenPersona(tipoimagenpersonasSeleccionados);
		
		this.generarReporteTipoImagenPersonas("Todos",tipoimagenpersonasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoImagenPersona(ArrayList<TipoImagenPersona> tipoimagenpersonasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoImagenPersona tipoimagenpersonaAux:tipoimagenpersonasSeleccionados) {
				tipoimagenpersonaAux.setsDetalleGeneralEntityReporte(tipoimagenpersonaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoImagenPersonaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoimagenpersonaAux.setsDescripcionGeneralEntityReporte1(tipoimagenpersonaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoImagenPersonaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoimagenpersonaAux.setsDescripcionGeneralEntityReporte1(tipoimagenpersonaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoImagenPersonaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoImagenPersona(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoImagenPersona=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=true;
				this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona=true;
			}
			
			this.isVisibilidadCeldaModificarTipoImagenPersona=false;
			this.isVisibilidadCeldaActualizarTipoImagenPersona=false;
			this.isVisibilidadCeldaEliminarTipoImagenPersona=false;
			this.isVisibilidadCeldaCancelarTipoImagenPersona=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoImagenPersona=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona=false;
			this.isVisibilidadCeldaModificarTipoImagenPersona=false;
			this.isVisibilidadCeldaActualizarTipoImagenPersona=true;
			this.isVisibilidadCeldaEliminarTipoImagenPersona=false;
			this.isVisibilidadCeldaCancelarTipoImagenPersona=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoImagenPersona=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona=false;
			this.isVisibilidadCeldaModificarTipoImagenPersona=false;
			this.isVisibilidadCeldaActualizarTipoImagenPersona=true;
			this.isVisibilidadCeldaEliminarTipoImagenPersona=true;
			this.isVisibilidadCeldaCancelarTipoImagenPersona=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoImagenPersona=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona=false;
			this.isVisibilidadCeldaModificarTipoImagenPersona=false;
			this.isVisibilidadCeldaActualizarTipoImagenPersona=true;
			this.isVisibilidadCeldaEliminarTipoImagenPersona=false;
			this.isVisibilidadCeldaCancelarTipoImagenPersona=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoImagenPersona=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=true;
			this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona=true;
			this.isVisibilidadCeldaModificarTipoImagenPersona=false;
			this.isVisibilidadCeldaActualizarTipoImagenPersona=false;
			this.isVisibilidadCeldaEliminarTipoImagenPersona=false;
			this.isVisibilidadCeldaCancelarTipoImagenPersona=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoImagenPersona=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona=false;
			this.isVisibilidadCeldaActualizarTipoImagenPersona=false;
			this.isVisibilidadCeldaEliminarTipoImagenPersona=false;
			this.isVisibilidadCeldaCancelarTipoImagenPersona=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoImagenPersona=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona=false;
			this.isVisibilidadCeldaModificarTipoImagenPersona=true;
			this.isVisibilidadCeldaActualizarTipoImagenPersona=false;
			this.isVisibilidadCeldaEliminarTipoImagenPersona=false;
			this.isVisibilidadCeldaCancelarTipoImagenPersona=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoImagenPersona=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoImagenPersonaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoImagenPersona=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=true;
			this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona=true;
		} else {
			this.actualizarEstadoPanelsTipoImagenPersona(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoImagenPersona=false;
			//this.isVisibilidadCeldaVerFormTipoImagenPersona=false;
			this.isVisibilidadCeldaDuplicarTipoImagenPersona=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoImagenPersona=false;
			this.isVisibilidadCeldaGuardarCambiosTipoImagenPersona=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
			if(!tipoimagenpersonaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=false;												
			}
			
			this.jButtonCerrarTipoImagenPersona.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoImagenPersona=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoimagenpersona)) {
			this.isVisibilidadCeldaActualizarTipoImagenPersona=false;
			this.isVisibilidadCeldaEliminarTipoImagenPersona=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoImagenPersona() {
	}
	
	public void actualizarEstadoPanelsTipoImagenPersona(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoImagenPersona!=null) {
				this.jScrollPanelDatosEdicionTipoImagenPersona.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoImagenPersona!=null) {
				this.jScrollPanelDatosTipoImagenPersona.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoImagenPersona!=null) {
				this.jPanelPaginacionTipoImagenPersona.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoImagenPersona!=null) {
				this.jPanelParametrosReportesTipoImagenPersona.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoImagenPersona!=null) {
				this.jScrollPanelDatosEdicionTipoImagenPersona.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoImagenPersona!=null) {
				this.jScrollPanelDatosTipoImagenPersona.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoImagenPersona!=null) {
				this.jPanelPaginacionTipoImagenPersona.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoImagenPersona!=null) {
				this.jPanelParametrosReportesTipoImagenPersona.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoImagenPersona!=null) {
				this.jScrollPanelDatosEdicionTipoImagenPersona.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoImagenPersona!=null) {
				this.jScrollPanelDatosTipoImagenPersona.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoImagenPersona!=null) {
				this.jPanelPaginacionTipoImagenPersona.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoImagenPersona!=null) {
				this.jPanelParametrosReportesTipoImagenPersona.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoImagenPersona!=null) {
				this.jScrollPanelDatosEdicionTipoImagenPersona.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoImagenPersona!=null) {
				this.jScrollPanelDatosTipoImagenPersona.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoImagenPersona!=null) {
				this.jPanelPaginacionTipoImagenPersona.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoImagenPersona!=null) {
				this.jPanelParametrosReportesTipoImagenPersona.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoImagenPersona!=null) {
				this.jScrollPanelDatosEdicionTipoImagenPersona.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoImagenPersona!=null) {
				this.jScrollPanelDatosTipoImagenPersona.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoImagenPersona!=null) {
				this.jPanelPaginacionTipoImagenPersona.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoImagenPersona!=null) {
				this.jPanelParametrosReportesTipoImagenPersona.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoImagenPersona!=null) {
				this.jScrollPanelDatosEdicionTipoImagenPersona.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoImagenPersona!=null) {
				this.jScrollPanelDatosTipoImagenPersona.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoImagenPersona!=null) {
				this.jPanelPaginacionTipoImagenPersona.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoImagenPersona!=null) {
				this.jPanelParametrosReportesTipoImagenPersona.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoImagenPersona!=null) {
				this.jScrollPanelDatosEdicionTipoImagenPersona.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoImagenPersona!=null) {
				this.jScrollPanelDatosTipoImagenPersona.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoImagenPersona!=null) {
				this.jPanelPaginacionTipoImagenPersona.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoImagenPersona!=null) {
				this.jPanelParametrosReportesTipoImagenPersona.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoimagenpersonaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoImagenPersonaSessionBean tipoimagenpersonaSessionBean=new TipoImagenPersonaSessionBean();
		
		if(this.tipoimagenpersonaSessionBean==null) {
			this.tipoimagenpersonaSessionBean=new TipoImagenPersonaSessionBean();
		}
		
		this.tipoimagenpersonaSessionBean.setsUltimaBusquedaTipoImagenPersona(this.getsAccionBusqueda());
		this.tipoimagenpersonaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoimagenpersonaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoImagenPersonaSessionBean tipoimagenpersonaSessionBean=new TipoImagenPersonaSessionBean();
		
		if(this.tipoimagenpersonaSessionBean==null) {
			this.tipoimagenpersonaSessionBean=new TipoImagenPersonaSessionBean();
		}
		
		if(this.tipoimagenpersonaSessionBean.getsUltimaBusquedaTipoImagenPersona()!=null&&!this.tipoimagenpersonaSessionBean.getsUltimaBusquedaTipoImagenPersona().equals("")) {
			this.setsAccionBusqueda(tipoimagenpersonaSessionBean.getsUltimaBusquedaTipoImagenPersona());
			this.setiNumeroPaginacion(tipoimagenpersonaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoimagenpersonaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoimagenpersonaSessionBean.setsUltimaBusquedaTipoImagenPersona("");
		this.tipoimagenpersonaSessionBean.setiNumeroPaginacion(TipoImagenPersonaConstantesFunciones.INUMEROPAGINACION);
		this.tipoimagenpersonaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoImagenPersona(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoImagenPersona() {
		this.updateBorderResaltarBusquedasFormularioTipoImagenPersona();
		this.updateVisibilidadBusquedasFormularioTipoImagenPersona();
		this.updateHabilitarBusquedasFormularioTipoImagenPersona();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoImagenPersona() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoImagenPersona() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoImagenPersona() {
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
	
	public void updateControlesFormularioTipoImagenPersona() throws Exception {

		if(this.jInternalFrameDetalleFormTipoImagenPersona==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoImagenPersona();
		this.updateVisibilidadResaltarControlesFormularioTipoImagenPersona();
		this.updateHabilitarResaltarControlesFormularioTipoImagenPersona();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoImagenPersona() throws Exception {
		if(this.jInternalFrameDetalleFormTipoImagenPersona==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoimagenpersonaConstantesFunciones.resaltaridTipoImagenPersona!=null && this.jInternalFrameDetalleFormTipoImagenPersona!=null) {this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldidTipoImagenPersona.setBorder(this.tipoimagenpersonaConstantesFunciones.resaltaridTipoImagenPersona);}
		if(this.tipoimagenpersonaConstantesFunciones.resaltarcodigoTipoImagenPersona!=null && this.jInternalFrameDetalleFormTipoImagenPersona!=null) {this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldcodigoTipoImagenPersona.setBorder(this.tipoimagenpersonaConstantesFunciones.resaltarcodigoTipoImagenPersona);}
		if(this.tipoimagenpersonaConstantesFunciones.resaltarnombreTipoImagenPersona!=null && this.jInternalFrameDetalleFormTipoImagenPersona!=null) {this.jInternalFrameDetalleFormTipoImagenPersona.jTextAreanombreTipoImagenPersona.setBorder(this.tipoimagenpersonaConstantesFunciones.resaltarnombreTipoImagenPersona);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoImagenPersona() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoImagenPersona==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
	
		//this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldidTipoImagenPersona.setVisible(this.tipoimagenpersonaConstantesFunciones.mostraridTipoImagenPersona);
		this.jInternalFrameDetalleFormTipoImagenPersona.jPanelidTipoImagenPersona.setVisible(this.tipoimagenpersonaConstantesFunciones.mostraridTipoImagenPersona);
		//this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldcodigoTipoImagenPersona.setVisible(this.tipoimagenpersonaConstantesFunciones.mostrarcodigoTipoImagenPersona);
		this.jInternalFrameDetalleFormTipoImagenPersona.jPanelcodigoTipoImagenPersona.setVisible(this.tipoimagenpersonaConstantesFunciones.mostrarcodigoTipoImagenPersona);
		//this.jInternalFrameDetalleFormTipoImagenPersona.jTextAreanombreTipoImagenPersona.setVisible(this.tipoimagenpersonaConstantesFunciones.mostrarnombreTipoImagenPersona);
		this.jInternalFrameDetalleFormTipoImagenPersona.jPanelnombreTipoImagenPersona.setVisible(this.tipoimagenpersonaConstantesFunciones.mostrarnombreTipoImagenPersona);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoImagenPersona() throws Exception {
		if(this.jInternalFrameDetalleFormTipoImagenPersona==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoImagenPersona!=null) {
	
		this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldidTipoImagenPersona.setEnabled(this.tipoimagenpersonaConstantesFunciones.activaridTipoImagenPersona);
		this.jInternalFrameDetalleFormTipoImagenPersona.jTextFieldcodigoTipoImagenPersona.setEnabled(this.tipoimagenpersonaConstantesFunciones.activarcodigoTipoImagenPersona);
		this.jInternalFrameDetalleFormTipoImagenPersona.jTextAreanombreTipoImagenPersona.setEnabled(this.tipoimagenpersonaConstantesFunciones.activarnombreTipoImagenPersona);
		}
	}
	
		
}