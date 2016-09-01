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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.TipoCostoDefinicionConstantesFunciones;
import com.bydan.erp.inventario.util.TipoCostoDefinicionParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoCostoDefinicionParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoCostoDefinicionBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
public class TipoCostoDefinicionBeanSwingJInternalFrame extends TipoCostoDefinicionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoCostoDefinicionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoCostoDefinicion> tipocostodefinicionValidator = new ClassValidator<TipoCostoDefinicion>(TipoCostoDefinicion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoCostoDefinicion tipocostodefinicion;	
	public TipoCostoDefinicion tipocostodefinicionAux;
	public TipoCostoDefinicion tipocostodefinicionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoCostoDefinicion tipocostodefinicionTotales;
	public Long idTipoCostoDefinicionActual;
	public Long iIdNuevoTipoCostoDefinicion=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosDefinicion=false;

	public Boolean getIsTienePermisosDefinicion() {
		return isTienePermisosDefinicion;
	}

	public void setIsTienePermisosDefinicion(Boolean isTienePermisosDefinicion) {
		this.isTienePermisosDefinicion= isTienePermisosDefinicion;
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
	
	public Boolean isPermisoTodoTipoCostoDefinicion;
	public Boolean isPermisoNuevoTipoCostoDefinicion;
	public Boolean isPermisoActualizarTipoCostoDefinicion;
	public Boolean isPermisoActualizarOriginalTipoCostoDefinicion;
	public Boolean isPermisoEliminarTipoCostoDefinicion;
	public Boolean isPermisoGuardarCambiosTipoCostoDefinicion;
	public Boolean isPermisoConsultaTipoCostoDefinicion;
	public Boolean isPermisoBusquedaTipoCostoDefinicion;
	public Boolean isPermisoReporteTipoCostoDefinicion;
	public Boolean isPermisoPaginacionMedioTipoCostoDefinicion;
	public Boolean isPermisoPaginacionAltoTipoCostoDefinicion;
	public Boolean isPermisoPaginacionTodoTipoCostoDefinicion;
	public Boolean isPermisoCopiarTipoCostoDefinicion;
	public Boolean isPermisoVerFormTipoCostoDefinicion;
	public Boolean isPermisoDuplicarTipoCostoDefinicion;
	public Boolean isPermisoOrdenTipoCostoDefinicion;
	
	
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
	
	public TipoCostoDefinicionParameterReturnGeneral tipocostodefinicionReturnGeneral;
	public TipoCostoDefinicionParameterReturnGeneral tipocostodefinicionParameterGeneral;
	
	

	public DefinicionLogic definicionLogic=null;

	public DefinicionLogic getDefinicionLogic() {
		return definicionLogic;
	}

	public void setDefinicionLogic(DefinicionLogic definicionLogic) {
		this.definicionLogic = definicionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoCostoDefinicion=false;
	public Boolean esParaAccionDesdeFormularioTipoCostoDefinicion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoCostoDefinicionLogic tipocostodefinicionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoCostoDefinicion tipocostodefinicionBean;
	public TipoCostoDefinicionConstantesFunciones tipocostodefinicionConstantesFunciones;
	//public TipoCostoDefinicionParameterReturnGeneral tipocostodefinicionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoCostoDefinicion> tipocostodefinicions;	
	//public List<TipoCostoDefinicion> tipocostodefinicionsEliminados;
	//public List<TipoCostoDefinicion> tipocostodefinicionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoCostoDefinicion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoCostoDefinicion=true;
	public Boolean isVisibilidadCeldaCopiarTipoCostoDefinicion=true;
	public Boolean isVisibilidadCeldaVerFormTipoCostoDefinicion=true;
	public Boolean isVisibilidadCeldaOrdenTipoCostoDefinicion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=false;
	public Boolean isVisibilidadCeldaModificarTipoCostoDefinicion=false;
	public Boolean isVisibilidadCeldaActualizarTipoCostoDefinicion=false;
	public Boolean isVisibilidadCeldaEliminarTipoCostoDefinicion=false;
	public Boolean isVisibilidadCeldaCancelarTipoCostoDefinicion=false;
	public Boolean isVisibilidadCeldaGuardarTipoCostoDefinicion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=false;	
	
	
	
	public Long getiIdNuevoTipoCostoDefinicion() {
		return this.iIdNuevoTipoCostoDefinicion;
	}

	public void setiIdNuevoTipoCostoDefinicion(Long iIdNuevoTipoCostoDefinicion) {
		this.iIdNuevoTipoCostoDefinicion = iIdNuevoTipoCostoDefinicion;
	}
	
	public Long getidTipoCostoDefinicionActual() {
		return this.idTipoCostoDefinicionActual;
	}

	public void setidTipoCostoDefinicionActual(Long idTipoCostoDefinicionActual) {
		this.idTipoCostoDefinicionActual = idTipoCostoDefinicionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoCostoDefinicion gettipocostodefinicion() {
		return this.tipocostodefinicion;
	}

	public void settipocostodefinicion(TipoCostoDefinicion tipocostodefinicion) {
		this.tipocostodefinicion = tipocostodefinicion;
	}
	
	public TipoCostoDefinicion gettipocostodefinicionAux() {
		return this.tipocostodefinicionAux;
	}

	public void settipocostodefinicionAux(TipoCostoDefinicion tipocostodefinicionAux) {
		this.tipocostodefinicionAux = tipocostodefinicionAux;
	}				
	
	public TipoCostoDefinicion gettipocostodefinicionAnterior() {
		return this.tipocostodefinicionAnterior;
	}

	public void settipocostodefinicionAnterior(TipoCostoDefinicion tipocostodefinicionAnterior) {
		this.tipocostodefinicionAnterior = tipocostodefinicionAnterior;
	}	
	
	public TipoCostoDefinicion gettipocostodefinicionTotales() {
		return this.tipocostodefinicionTotales;
	}

	public void settipocostodefinicionTotales(TipoCostoDefinicion tipocostodefinicionTotales) {
		this.tipocostodefinicionTotales = tipocostodefinicionTotales;
	}	
	
	public TipoCostoDefinicion gettipocostodefinicionBean() {
		return this.tipocostodefinicionBean;
	}

	public void settipocostodefinicionBean(TipoCostoDefinicion tipocostodefinicionBean) {
		this.tipocostodefinicionBean = tipocostodefinicionBean;
	}	
	
	public TipoCostoDefinicionParameterReturnGeneral gettipocostodefinicionReturnGeneral() {
		return this.tipocostodefinicionReturnGeneral;
	}

	public void settipocostodefinicionReturnGeneral(TipoCostoDefinicionParameterReturnGeneral tipocostodefinicionReturnGeneral) {
		this.tipocostodefinicionReturnGeneral = tipocostodefinicionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoCostoDefinicionLogic getTipoCostoDefinicionLogic()	{		
		return tipocostodefinicionLogic;
	}

	public void setTipoCostoDefinicionLogic(TipoCostoDefinicionLogic tipocostodefinicionLogic) {
		this.tipocostodefinicionLogic = tipocostodefinicionLogic;
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
	
	public Boolean getIsEsNuevoTipoCostoDefinicion() {
		return isEsNuevoTipoCostoDefinicion;
	}

	public void setIsEsNuevoTipoCostoDefinicion(Boolean isEsNuevoTipoCostoDefinicion) {
		this.isEsNuevoTipoCostoDefinicion = isEsNuevoTipoCostoDefinicion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoCostoDefinicion() {
		return esParaAccionDesdeFormularioTipoCostoDefinicion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoCostoDefinicion(Boolean esParaAccionDesdeFormularioTipoCostoDefinicion) {
		this.esParaAccionDesdeFormularioTipoCostoDefinicion = esParaAccionDesdeFormularioTipoCostoDefinicion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoCostoDefinicion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoCostoDefinicionConstantesFunciones.refrescarForeignKeysDescripcionesTipoCostoDefinicion(this.tipocostodefinicionLogic.getTipoCostoDefinicions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoCostoDefinicionConstantesFunciones.refrescarForeignKeysDescripcionesTipoCostoDefinicion(this.tipocostodefinicions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipocostodefinicionLogic.setTipoCostoDefinicions(this.tipocostodefinicions);
			tipocostodefinicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoCostoDefinicionParameterReturnGeneral getTipoCostoDefinicionParameterGeneral() {
		return this.tipocostodefinicionParameterGeneral;
	}
	
	public void setTipoCostoDefinicionParameterGeneral(TipoCostoDefinicionParameterReturnGeneral tipocostodefinicionParameterGeneral) {
		this.tipocostodefinicionParameterGeneral = tipocostodefinicionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoCostoDefinicion() {
		return isPermisoTodoTipoCostoDefinicion;
	}

	public void setIsPermisoTodoTipoCostoDefinicion(Boolean isPermisoTodoTipoCostoDefinicion) {
		this.isPermisoTodoTipoCostoDefinicion = isPermisoTodoTipoCostoDefinicion;
	}

	public Boolean getIsPermisoNuevoTipoCostoDefinicion() {
		return isPermisoNuevoTipoCostoDefinicion;
	}

	public void setIsPermisoNuevoTipoCostoDefinicion(Boolean isPermisoNuevoTipoCostoDefinicion) {
		this.isPermisoNuevoTipoCostoDefinicion = isPermisoNuevoTipoCostoDefinicion;
	}

	public Boolean getIsPermisoActualizarTipoCostoDefinicion() {
		return isPermisoActualizarTipoCostoDefinicion;
	}

	public void setIsPermisoActualizarTipoCostoDefinicion(Boolean isPermisoActualizarTipoCostoDefinicion) {
		this.isPermisoActualizarTipoCostoDefinicion = isPermisoActualizarTipoCostoDefinicion;
	}

	public Boolean getIsPermisoEliminarTipoCostoDefinicion() {
		return isPermisoEliminarTipoCostoDefinicion;
	}

	public void setIsPermisoEliminarTipoCostoDefinicion(Boolean isPermisoEliminarTipoCostoDefinicion) {
		this.isPermisoEliminarTipoCostoDefinicion = isPermisoEliminarTipoCostoDefinicion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoCostoDefinicion() {
		return isPermisoGuardarCambiosTipoCostoDefinicion;
	}

	public void setIsPermisoGuardarCambiosTipoCostoDefinicion(Boolean isPermisoGuardarCambiosTipoCostoDefinicion) {
		this.isPermisoGuardarCambiosTipoCostoDefinicion = isPermisoGuardarCambiosTipoCostoDefinicion;
	}
	
	public Boolean getIsPermisoConsultaTipoCostoDefinicion() {
		return isPermisoConsultaTipoCostoDefinicion;
	}

	public void setIsPermisoConsultaTipoCostoDefinicion(Boolean isPermisoConsultaTipoCostoDefinicion) {
		this.isPermisoConsultaTipoCostoDefinicion = isPermisoConsultaTipoCostoDefinicion;
	}

	public Boolean getIsPermisoBusquedaTipoCostoDefinicion() {
		return isPermisoBusquedaTipoCostoDefinicion;
	}

	public void setIsPermisoBusquedaTipoCostoDefinicion(Boolean isPermisoBusquedaTipoCostoDefinicion) {
		this.isPermisoBusquedaTipoCostoDefinicion = isPermisoBusquedaTipoCostoDefinicion;
	}

	public Boolean getIsPermisoReporteTipoCostoDefinicion() {
		return isPermisoReporteTipoCostoDefinicion;
	}

	public void setIsPermisoReporteTipoCostoDefinicion(Boolean isPermisoReporteTipoCostoDefinicion) {
		this.isPermisoReporteTipoCostoDefinicion = isPermisoReporteTipoCostoDefinicion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoCostoDefinicion() {
		return isPermisoPaginacionMedioTipoCostoDefinicion;
	}

	public void setIsPermisoPaginacionMedioTipoCostoDefinicion(Boolean isPermisoPaginacionMedioTipoCostoDefinicion) {
		this.isPermisoPaginacionMedioTipoCostoDefinicion = isPermisoPaginacionMedioTipoCostoDefinicion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoCostoDefinicion() {
		return isPermisoPaginacionTodoTipoCostoDefinicion;
	}

	public void setIsPermisoPaginacionTodoTipoCostoDefinicion(Boolean isPermisoPaginacionTodoTipoCostoDefinicion) {
		this.isPermisoPaginacionTodoTipoCostoDefinicion = isPermisoPaginacionTodoTipoCostoDefinicion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoCostoDefinicion() {
		return isPermisoPaginacionAltoTipoCostoDefinicion;
	}

	public void setIsPermisoPaginacionAltoTipoCostoDefinicion(Boolean isPermisoPaginacionAltoTipoCostoDefinicion) {
		this.isPermisoPaginacionAltoTipoCostoDefinicion = isPermisoPaginacionAltoTipoCostoDefinicion;
	}
	
	public Boolean getIsPermisoCopiarTipoCostoDefinicion() {
		return isPermisoCopiarTipoCostoDefinicion;
	}

	public void setIsPermisoCopiarTipoCostoDefinicion(Boolean isPermisoCopiarTipoCostoDefinicion) {
		this.isPermisoCopiarTipoCostoDefinicion = isPermisoCopiarTipoCostoDefinicion;
	}
	
	public Boolean getIsPermisoVerFormTipoCostoDefinicion() {
		return isPermisoVerFormTipoCostoDefinicion;
	}

	public void setIsPermisoVerFormTipoCostoDefinicion(Boolean isPermisoVerFormTipoCostoDefinicion) {
		this.isPermisoVerFormTipoCostoDefinicion = isPermisoVerFormTipoCostoDefinicion;
	}
	
	public Boolean getIsPermisoDuplicarTipoCostoDefinicion() {
		return isPermisoDuplicarTipoCostoDefinicion;
	}

	public void setIsPermisoDuplicarTipoCostoDefinicion(Boolean isPermisoDuplicarTipoCostoDefinicion) {
		this.isPermisoDuplicarTipoCostoDefinicion = isPermisoDuplicarTipoCostoDefinicion;
	}
	
	public Boolean getIsPermisoOrdenTipoCostoDefinicion() {
		return isPermisoOrdenTipoCostoDefinicion;
	}

	public void setIsPermisoOrdenTipoCostoDefinicion(Boolean isPermisoOrdenTipoCostoDefinicion) {
		this.isPermisoOrdenTipoCostoDefinicion = isPermisoOrdenTipoCostoDefinicion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoCostoDefinicion() {
		return isVisibilidadCeldaNuevoTipoCostoDefinicion;
	}

	public void setIsVisibilidadCeldaNuevoTipoCostoDefinicion(Boolean isVisibilidadCeldaNuevoTipoCostoDefinicion) {
		this.isVisibilidadCeldaNuevoTipoCostoDefinicion = isVisibilidadCeldaNuevoTipoCostoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoCostoDefinicion() {
		return isVisibilidadCeldaDuplicarTipoCostoDefinicion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoCostoDefinicion(Boolean isVisibilidadCeldaDuplicarTipoCostoDefinicion) {
		this.isVisibilidadCeldaDuplicarTipoCostoDefinicion = isVisibilidadCeldaDuplicarTipoCostoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoCostoDefinicion() {
		return isVisibilidadCeldaCopiarTipoCostoDefinicion;
	}

	public void setIsVisibilidadCeldaCopiarTipoCostoDefinicion(Boolean isVisibilidadCeldaCopiarTipoCostoDefinicion) {
		this.isVisibilidadCeldaCopiarTipoCostoDefinicion = isVisibilidadCeldaCopiarTipoCostoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoCostoDefinicion() {
		return isVisibilidadCeldaVerFormTipoCostoDefinicion;
	}

	public void setIsVisibilidadCeldaVerFormTipoCostoDefinicion(Boolean isVisibilidadCeldaVerFormTipoCostoDefinicion) {
		this.isVisibilidadCeldaVerFormTipoCostoDefinicion = isVisibilidadCeldaVerFormTipoCostoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoCostoDefinicion() {
		return isVisibilidadCeldaOrdenTipoCostoDefinicion;
	}

	public void setIsVisibilidadCeldaOrdenTipoCostoDefinicion(Boolean isVisibilidadCeldaOrdenTipoCostoDefinicion) {
		this.isVisibilidadCeldaOrdenTipoCostoDefinicion = isVisibilidadCeldaOrdenTipoCostoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion() {
		return isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion(Boolean isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion = isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoCostoDefinicion() {
		return isVisibilidadCeldaModificarTipoCostoDefinicion;
	}

	public void setIsVisibilidadCeldaModificarTipoCostoDefinicion(Boolean isVisibilidadCeldaModificarTipoCostoDefinicion) {
		this.isVisibilidadCeldaModificarTipoCostoDefinicion = isVisibilidadCeldaModificarTipoCostoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoCostoDefinicion() {
		return isVisibilidadCeldaActualizarTipoCostoDefinicion;
	}

	public void setIsVisibilidadCeldaActualizarTipoCostoDefinicion(Boolean isVisibilidadCeldaActualizarTipoCostoDefinicion) {
		this.isVisibilidadCeldaActualizarTipoCostoDefinicion = isVisibilidadCeldaActualizarTipoCostoDefinicion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoCostoDefinicion() {
		return isVisibilidadCeldaEliminarTipoCostoDefinicion;
	}

	public void setIsVisibilidadCeldaEliminarTipoCostoDefinicion(Boolean isVisibilidadCeldaEliminarTipoCostoDefinicion) {
		this.isVisibilidadCeldaEliminarTipoCostoDefinicion = isVisibilidadCeldaEliminarTipoCostoDefinicion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoCostoDefinicion() {
		return isVisibilidadCeldaCancelarTipoCostoDefinicion;
	}

	public void setIsVisibilidadCeldaCancelarTipoCostoDefinicion(Boolean isVisibilidadCeldaCancelarTipoCostoDefinicion) {
		this.isVisibilidadCeldaCancelarTipoCostoDefinicion = isVisibilidadCeldaCancelarTipoCostoDefinicion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoCostoDefinicion() {
		return isVisibilidadCeldaGuardarTipoCostoDefinicion;
	}

	public void setIsVisibilidadCeldaGuardarTipoCostoDefinicion(Boolean isVisibilidadCeldaGuardarTipoCostoDefinicion) {
		this.isVisibilidadCeldaGuardarTipoCostoDefinicion = isVisibilidadCeldaGuardarTipoCostoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoCostoDefinicion() {
		return isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoCostoDefinicion(Boolean isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion) {
		this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion = isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion;
	}
		
	public TipoCostoDefinicionSessionBean gettipocostodefinicionSessionBean() {
		return this.tipocostodefinicionSessionBean;
	}
	
	public void settipocostodefinicionSessionBean(TipoCostoDefinicionSessionBean tipocostodefinicionSessionBean) {
		this.tipocostodefinicionSessionBean=tipocostodefinicionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoCostoDefinicion tipocostodefinicion,TipoCostoDefinicion tipocostodefinicionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoCostoDefinicion(tipocostodefinicion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipocostodefinicionAux.setId(tipocostodefinicion.getId());
		tipocostodefinicionAux.setVersionRow(tipocostodefinicion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoCostoDefinicion();
		
			int intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(this.tipocostodefinicion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipocostodefinicionValidator.getInvalidValues(this.tipocostodefinicion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipocostodefinicionLogic.setDatosCliente(datosCliente);
			tipocostodefinicionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipocostodefinicionAux=new  TipoCostoDefinicion();
				
				tipocostodefinicionAux.setIsNew(true);
				tipocostodefinicionAux.setIsChanged(true);
				
				tipocostodefinicionAux.setTipoCostoDefinicionOriginal(this.tipocostodefinicion);
				
				tipocostodefinicionAux.setId(this.tipocostodefinicion.getId());	
				tipocostodefinicionAux.setVersionRow(this.tipocostodefinicion.getVersionRow());	
				tipocostodefinicionAux.setcodigo(this.tipocostodefinicion.getcodigo());	
				tipocostodefinicionAux.setnombre(this.tipocostodefinicion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocostodefinicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocostodefinicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipocostodefinicionAux,tipocostodefinicionLogic.getTipoCostoDefinicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocostodefinicionAux,tipocostodefinicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipocostodefinicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostodefinicionLogic.saveTipoCostoDefinicions();//WithConnection
						//tipocostodefinicionLogic.getSetVersionRowTipoCostoDefinicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocostodefinicion,tipocostodefinicionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocostodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipocostodefinicionAux=new  TipoCostoDefinicion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipocostodefinicionSessionBean.getEsGuardarRelacionado() && this.tipocostodefinicion.getId()>=0)) {
						
					tipocostodefinicionAux.setIsNew(false);
				}
				
				tipocostodefinicionAux.setIsDeleted(false);
			
				tipocostodefinicionAux.setId(this.tipocostodefinicion.getId());	
				tipocostodefinicionAux.setVersionRow(this.tipocostodefinicion.getVersionRow());	
				tipocostodefinicionAux.setcodigo(this.tipocostodefinicion.getcodigo());	
				tipocostodefinicionAux.setnombre(this.tipocostodefinicion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocostodefinicionAux,tipocostodefinicionLogic.getTipoCostoDefinicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocostodefinicionAux,tipocostodefinicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipocostodefinicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostodefinicionLogic.saveTipoCostoDefinicions();//WithConnection
						//tipocostodefinicionLogic.getSetVersionRowTipoCostoDefinicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipocostodefinicion,tipocostodefinicionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocostodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipocostodefinicionAux=new  TipoCostoDefinicion();
				
				tipocostodefinicionAux.setIsNew(false);
				tipocostodefinicionAux.setIsChanged(false);
				
				tipocostodefinicionAux.setIsDeleted(true);
				
				tipocostodefinicionAux.setId(this.tipocostodefinicion.getId());	
				tipocostodefinicionAux.setVersionRow(this.tipocostodefinicion.getVersionRow());	
				tipocostodefinicionAux.setcodigo(this.tipocostodefinicion.getcodigo());	
				tipocostodefinicionAux.setnombre(this.tipocostodefinicion.getnombre());	
				
				if(this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipocostodefinicionAux.getId()>=0) {	
						this.tipocostodefinicionsEliminados.add(tipocostodefinicionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipocostodefinicionAux,tipocostodefinicionLogic.getTipoCostoDefinicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocostodefinicionAux,tipocostodefinicions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipocostodefinicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostodefinicionLogic.saveTipoCostoDefinicions();//WithConnection
						//tipocostodefinicionLogic.getSetVersionRowTipoCostoDefinicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipocostodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipocostodefinicionAux.setDefinicions(this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipocostodefinicionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipocostodefinicionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipocostodefinicionAux,tipocostodefinicionLogic.getTipoCostoDefinicions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipocostodefinicionAux,tipocostodefinicions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.getTipoCostoDefinicions().addAll(this.tipocostodefinicionsEliminados);
					
					tipocostodefinicionLogic.saveTipoCostoDefinicions();//WithConnection
					//tipocostodefinicionLogic.getSetVersionRowTipoCostoDefinicions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipocostodefinicionsEliminados= new ArrayList<TipoCostoDefinicion>();		
			}
			
			if(this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Costo Definicion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Costo Definicion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipocostodefinicion=tipocostodefinicionAux;
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
      		//this.finishProcessTipoCostoDefinicion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoCostoDefinicion tipocostodefinicionLocal) throws Exception {
		
		if(this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipocostodefinicionLocal.setDefinicions(this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
			
			} else {
			
				tipocostodefinicionLocal.setDefinicions(this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.definicions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoCostoDefinicion tipocostodefinicionLocal) throws Exception {	
		if(this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoCostoDefinicionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipocostodefinicionValidator.getInvalidValues(this.tipocostodefinicion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoCostoDefinicion tipocostodefinicion,List<TipoCostoDefinicion> tipocostodefinicions) throws Exception {
		try	{		
			TipoCostoDefinicionConstantesFunciones.actualizarLista(tipocostodefinicion,tipocostodefinicions,this.tipocostodefinicionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoCostoDefinicion tipocostodefinicion,List<TipoCostoDefinicion> tipocostodefinicions) throws Exception {
		try	{			
			TipoCostoDefinicionConstantesFunciones.actualizarSelectedLista(tipocostodefinicion,tipocostodefinicions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoCostoDefinicion> tipocostodefinicionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipocostodefinicionsLocal=this.tipocostodefinicionLogic.getTipoCostoDefinicions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipocostodefinicionsLocal=this.tipocostodefinicions;
			}
			//ARCHITECTURE
		
			for(TipoCostoDefinicion tipocostodefinicionLocal:tipocostodefinicionsLocal) {
				if(this.permiteMantenimiento(tipocostodefinicionLocal) && tipocostodefinicionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoCostoDefinicionConstantesFunciones.getTipoCostoDefinicionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoCostoDefinicionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCostoDefinicion.jLabelcodigoTipoCostoDefinicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoCostoDefinicionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCostoDefinicion.jLabelnombreTipoCostoDefinicion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCostoDefinicion.jLabelcodigoTipoCostoDefinicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoCostoDefinicion.jLabelnombreTipoCostoDefinicion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Definicion")) {
			if(this.tipocostodefinicion==null) {
				this.tipocostodefinicion= new TipoCostoDefinicion();
			}

			if(this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoCostoDefinicion
				this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(this.tipocostodefinicion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);

				this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.getdefinicion().setTipoCostoDefinicion(this.tipocostodefinicion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoCostoDefinicion--;	
		
		
		this.tipocostodefinicionAux=new TipoCostoDefinicion();
		
		this.tipocostodefinicionAux.setId(this.iIdNuevoTipoCostoDefinicion);
		this.tipocostodefinicionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipocostodefinicionLogic.getTipoCostoDefinicions().add(this.tipocostodefinicionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipocostodefinicions.add(this.tipocostodefinicionAux);
		}
		//ARCHITECTURE
		
		this.tipocostodefinicion=this.tipocostodefinicionAux;
		
		if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoCostoDefinicion(this.tipocostodefinicion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCostoDefinicion(this.tipocostodefinicion);
		}
				
		//this.setDefaultControlesTipoCostoDefinicion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoCostoDefinicion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoCostoDefinicion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCostoDefinicion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCostoDefinicion(this.tipocostodefinicionBean,this.tipocostodefinicion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
			classes=TipoCostoDefinicionConstantesFunciones.getClassesRelationshipsOfTipoCostoDefinicion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipocostodefinicionReturnGeneral=tipocostodefinicionLogic.procesarEventosTipoCostoDefinicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocostodefinicionLogic.getTipoCostoDefinicions(),this.tipocostodefinicion,this.tipocostodefinicionParameterGeneral,this.isEsNuevoTipoCostoDefinicion,classes);//this.tipocostodefinicionLogic.getTipoCostoDefinicion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoCostoDefinicion(this.tipocostodefinicionReturnGeneral,this.tipocostodefinicionBean,false);
		
		if(this.tipocostodefinicionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoCostoDefinicion(this.tipocostodefinicionReturnGeneral.getTipoCostoDefinicion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoCostoDefinicion(this.tipocostodefinicionReturnGeneral.getTipoCostoDefinicion());
		}
		
		if(this.tipocostodefinicionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoCostoDefinicion(this.tipocostodefinicionReturnGeneral.getTipoCostoDefinicion(),classes);//this.tipocostodefinicionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(this.tipocostodefinicion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoCostoDefinicion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoCostoDefinicion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoCostoDefinicion(false);
						
			if(tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCostoDefinicion();
			}
			
			this.actualizarVisualTableDatosTipoCostoDefinicion();
			
			this.jTableDatosTipoCostoDefinicion.setRowSelectionInterval(this.getIndiceNuevoTipoCostoDefinicion(), this.getIndiceNuevoTipoCostoDefinicion());
			
			this.seleccionarFilaTablaTipoCostoDefinicionActual();
						
			this.actualizarEstadoCeldasBotonesTipoCostoDefinicion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoCostoDefinicion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldcodigoTipoCostoDefinicion.setEnabled(isHabilitar && this.tipocostodefinicionConstantesFunciones.activarcodigoTipoCostoDefinicion);
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldnombreTipoCostoDefinicion.setEnabled(isHabilitar && this.tipocostodefinicionConstantesFunciones.activarnombreTipoCostoDefinicion);	
		
	};
	
	public void setDefaultControlesTipoCostoDefinicion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoCostoDefinicion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipocostodefinicionSessionBean.setConGuardarRelaciones(true);			
			this.tipocostodefinicionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jTabbedPaneRelacionesTipoCostoDefinicion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipocostodefinicionSessionBean.setConGuardarRelaciones(false);			
			this.tipocostodefinicionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jTabbedPaneRelacionesTipoCostoDefinicion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoCostoDefinicion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicionLogic.getTipoCostoDefinicions()) {
				if(tipocostodefinicionAux.getId().equals(this.iIdNuevoTipoCostoDefinicion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicions) {
				if(tipocostodefinicionAux.getId().equals(this.iIdNuevoTipoCostoDefinicion)) {
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
	
	public int getIndiceActualTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicionLogic.getTipoCostoDefinicions()) {
				if(tipocostodefinicionAux.getId().equals(tipocostodefinicion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicions) {
				if(tipocostodefinicionAux.getId().equals(tipocostodefinicion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicionLogic.getTipoCostoDefinicions()) {
				if(tipocostodefinicionAux.getTipoCostoDefinicionOriginal().getId().equals(tipocostodefinicionOriginal.getId())) {
					existe=true;
					tipocostodefinicionOriginal.setId(tipocostodefinicionAux.getId());
					tipocostodefinicionOriginal.setVersionRow(tipocostodefinicionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicions) {
				if(tipocostodefinicionAux.getTipoCostoDefinicionOriginal().getId().equals(tipocostodefinicionOriginal.getId())) {
					existe=true;
					tipocostodefinicionOriginal.setId(tipocostodefinicionAux.getId());
					tipocostodefinicionOriginal.setVersionRow(tipocostodefinicionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoCostoDefinicion(Boolean esParaCancelar) throws Exception {
		tipocostodefinicionsAux=new ArrayList<TipoCostoDefinicion>();
		tipocostodefinicionAux=new TipoCostoDefinicion();
		
		if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicionLogic.getTipoCostoDefinicions()) {
					if(tipocostodefinicionAux.getId()<0) {
						tipocostodefinicionsAux.add(tipocostodefinicionAux);
					}		
				}
				this.iIdNuevoTipoCostoDefinicion=0L;
				this.tipocostodefinicionLogic.getTipoCostoDefinicions().removeAll(tipocostodefinicionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicions) {
					if(tipocostodefinicionAux.getId()<0) {
						tipocostodefinicionsAux.add(tipocostodefinicionAux);
					}		
				}
				this.iIdNuevoTipoCostoDefinicion=0L;
				this.tipocostodefinicions.removeAll(tipocostodefinicionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoCostoDefinicion 
					&& this.tipocostodefinicionLogic.getTipoCostoDefinicions().size()>0
					) {
					tipocostodefinicionAux=this.tipocostodefinicionLogic.getTipoCostoDefinicions().get(this.tipocostodefinicionLogic.getTipoCostoDefinicions().size() - 1);
				
					if(tipocostodefinicionAux.getId()<0) {
						this.tipocostodefinicionLogic.getTipoCostoDefinicions().remove(tipocostodefinicionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoCostoDefinicion && this.tipocostodefinicions.size()>0) {
					tipocostodefinicionAux=this.tipocostodefinicions.get(this.tipocostodefinicions.size() - 1);
				
					if(tipocostodefinicionAux.getId()<0) {
						this.tipocostodefinicions.remove(tipocostodefinicionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoCostoDefinicion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipocostodefinicion.getId()<0) {
				this.tipocostodefinicionLogic.getTipoCostoDefinicions().remove(this.tipocostodefinicion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipocostodefinicion.getId()<0) {
				this.tipocostodefinicions.remove(this.tipocostodefinicion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoCostoDefinicion(List<TipoCostoDefinicion> tipocostodefinicionsAux) throws Exception {
		TipoCostoDefinicionConstantesFunciones.setEstadosInicialesTipoCostoDefinicion(tipocostodefinicionsAux);
	}
	
	public void setEstadosInicialesTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicionAux) throws Exception {
		TipoCostoDefinicionConstantesFunciones.setEstadosInicialesTipoCostoDefinicion(tipocostodefinicionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoCostoDefinicionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoCostoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoCostoDefinicionActual()) {
				if(!this.isEsNuevoTipoCostoDefinicion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoCostoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoCostoDefinicion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoCostoDefinicionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Costo Definicion ?", "MANTENIMIENTO DE Tipo Costo Definicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoCostoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoCostoDefinicion tipocostodefinicion) throws Exception {
		TipoCostoDefinicionConstantesFunciones.seleccionarAsignar(this.tipocostodefinicion,tipocostodefinicion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoCostoDefinicion=this.isPermisoActualizarOriginalTipoCostoDefinicion;
			
			
			this.seleccionarAsignar(tipocostodefinicion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoCostoDefinicionConstantesFunciones.quitarEspaciosTipoCostoDefinicion(this.tipocostodefinicion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoCostoDefinicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipocostodefinicionSessionBean.setsFuncionBusquedaRapida(this.tipocostodefinicionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoCostoDefinicion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoCostoDefinicion(esParaCancelar);				
				this.cancelarNuevoTipoCostoDefinicion(esParaCancelar);								
			}
			
			this.tipocostodefinicion=new TipoCostoDefinicion();
			
			this.inicializarTipoCostoDefinicion();
			
			this.actualizarEstadoCeldasBotonesTipoCostoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoCostoDefinicion() throws Exception {
		try {
			TipoCostoDefinicionConstantesFunciones.inicializarTipoCostoDefinicion(this.tipocostodefinicion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipocostodefinicionLogic.getTipoCostoDefinicions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoCostoDefinicions(String sAccionBusqueda,List<TipoCostoDefinicion> tipocostodefinicionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoCostoDefinicion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoCostoDefinicionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoCostoDefinicionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoCostoDefinicion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Costo Definiciones");		
		parameters.put("busquedapor", TipoCostoDefinicionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Definicion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoCostoDefinicionLogic tipocostodefinicionLogicAuxiliar=new TipoCostoDefinicionLogic();
					tipocostodefinicionLogicAuxiliar.setDatosCliente(tipocostodefinicionLogic.getDatosCliente());				
					tipocostodefinicionLogicAuxiliar.setTipoCostoDefinicions(tipocostodefinicionsParaReportes);
					
					tipocostodefinicionLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoCostoDefinicionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipocostodefinicionsParaReportes=tipocostodefinicionLogicAuxiliar.getTipoCostoDefinicions();
					
					//tipocostodefinicionLogic.getNewConnexionToDeep();
					
					//for (TipoCostoDefinicion tipocostodefinicion:tipocostodefinicionsParaReportes) {
					//	tipocostodefinicionLogic.deepLoad(tipocostodefinicion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipocostodefinicionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipocostodefinicionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDefinicion = AuxiliarReportes.class.getResourceAsStream("DefinicionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_definicion", reportFileDefinicion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoCostoDefinicion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoCostoDefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoCostoDefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoCostoDefinicion=new JRBeanArrayDataSource(TipoCostoDefinicionJInternalFrame.TraerTipoCostoDefinicionBeans(tipocostodefinicionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoCostoDefinicion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoCostoDefinicionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoCostoDefinicionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoCostoDefinicionBean.TraerTipoCostoDefinicionBeans(tipocostodefinicionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoCostoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipocostodefinicionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoCostoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipocostodefinicionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoCostoDefinicionActionPerformed(null);
					//this.generarExcelReporteTipoCostoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipocostodefinicionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoCostoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipocostodefinicionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoCostoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipocostodefinicionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoCostoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipocostodefinicionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoCostoDefinicions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCostoDefinicion> tipocostodefinicionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostodefinicion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCostoDefinicions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCostoDefinicion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoCostoDefinicion tipocostodefinicion : tipocostodefinicionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoCostoDefinicionConstantesFunciones.generarExcelReporteDataTipoCostoDefinicion("NORMAL",row,workbook,tipocostodefinicion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Definicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoCostoDefinicion(String sTipo,Row row,Workbook workbook) {
		
		TipoCostoDefinicionConstantesFunciones.generarExcelReporteHeaderTipoCostoDefinicion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoCostoDefinicions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCostoDefinicion> tipocostodefinicionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostodefinicion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCostoDefinicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoCostoDefinicion tipocostodefinicion : tipocostodefinicionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoCostoDefinicionConstantesFunciones.getTipoCostoDefinicionDescripcion(tipocostodefinicion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocostodefinicion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipocostodefinicion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Definicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoCostoDefinicions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoCostoDefinicion> tipocostodefinicionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoCostoDefinicion> tipocostodefinicionsRespaldo=null;
		
		classes=TipoCostoDefinicionConstantesFunciones.getClassesRelationshipsOfTipoCostoDefinicion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipocostodefinicionLogic.setDatosCliente(this.datosCliente);
		this.tipocostodefinicionLogic.setDatosDeep(this.datosDeep);
		this.tipocostodefinicionLogic.setIsConDeep(true);
		
		tipocostodefinicionsRespaldo=this.tipocostodefinicionLogic.getTipoCostoDefinicions();
		
		this.tipocostodefinicionLogic.setTipoCostoDefinicions(tipocostodefinicionsParaReportes);	
		this.tipocostodefinicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipocostodefinicionsParaReportes=this.tipocostodefinicionLogic.getTipoCostoDefinicions();
		this.tipocostodefinicionLogic.setTipoCostoDefinicions(tipocostodefinicionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostodefinicion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoCostoDefinicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoCostoDefinicion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoCostoDefinicion tipocostodefinicion : tipocostodefinicionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoCostoDefinicion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoCostoDefinicionConstantesFunciones.generarExcelReporteDataTipoCostoDefinicion("NORMAL",row,workbook,tipocostodefinicion,cellStyleDataAux);
		
			
			


				//Definicion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DefinicionConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipocostodefinicion.getDefinicions()!=null && tipocostodefinicion.getDefinicions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DefinicionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DefinicionConstantesFunciones.generarExcelReporteHeaderDefinicion("RELACIONADO",row,workbook);
				}

				if(tipocostodefinicion.getDefinicions()!=null) {
					i2=0;
					for(Definicion definicion : tipocostodefinicion.getDefinicions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DefinicionConstantesFunciones.generarExcelReporteDataDefinicion("RELACIONADO",row,workbook,definicion,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoCostoDefinicionConstantesFunciones.getTipoCostoDefinicionDescripcion(tipocostodefinicion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Definicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoCostoDefinicion() throws Exception {		
		this.startProcessTipoCostoDefinicion(true);
	}
	
	public void startProcessTipoCostoDefinicion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoCostoDefinicion, this.jScrollPanelDatosTipoCostoDefinicion,this.jPanelPaginacionTipoCostoDefinicion, this.jScrollPanelDatosEdicionTipoCostoDefinicion, this.jPanelAccionesTipoCostoDefinicion,this.jPanelAccionesFormularioTipoCostoDefinicion,this.jmenuBarTipoCostoDefinicion,this.jmenuBarDetalleTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,this.jTtoolBarDetalleTipoCostoDefinicion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCostoDefinicion=null; 
		
		final JPanel jPanelParametrosReportesTipoCostoDefinicion=this.jPanelParametrosReportesTipoCostoDefinicion;
		//final JScrollPane jScrollPanelDatosTipoCostoDefinicion=this.jScrollPanelDatosTipoCostoDefinicion;
		final JTable jTableDatosTipoCostoDefinicion=this.jTableDatosTipoCostoDefinicion;		
		final JPanel jPanelPaginacionTipoCostoDefinicion=this.jPanelPaginacionTipoCostoDefinicion;
		//final JScrollPane jScrollPanelDatosEdicionTipoCostoDefinicion=this.jScrollPanelDatosEdicionTipoCostoDefinicion;
		final JPanel jPanelAccionesTipoCostoDefinicion=this.jPanelAccionesTipoCostoDefinicion;
		
		JPanel jPanelCamposAuxiliarTipoCostoDefinicion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoCostoDefinicion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
			jPanelCamposAuxiliarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jPanelCamposTipoCostoDefinicion;
			jPanelAccionesFormularioAuxiliarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jPanelAccionesFormularioTipoCostoDefinicion;
		}
		
		final JPanel jPanelCamposTipoCostoDefinicion=jPanelCamposAuxiliarTipoCostoDefinicion;
		final JPanel jPanelAccionesFormularioTipoCostoDefinicion=jPanelAccionesFormularioAuxiliarTipoCostoDefinicion;
		
		
		final JMenuBar jmenuBarTipoCostoDefinicion=this.jmenuBarTipoCostoDefinicion;
		final JToolBar jTtoolBarTipoCostoDefinicion=this.jTtoolBarTipoCostoDefinicion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoCostoDefinicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCostoDefinicion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
			jmenuBarDetalleAuxiliarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jmenuBarDetalleTipoCostoDefinicion;
			jTtoolBarDetalleAuxiliarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jTtoolBarDetalleTipoCostoDefinicion;
		}
		
		final JMenuBar jmenuBarDetalleTipoCostoDefinicion=jmenuBarDetalleAuxiliarTipoCostoDefinicion;
		final JToolBar jTtoolBarDetalleTipoCostoDefinicion=jTtoolBarDetalleAuxiliarTipoCostoDefinicion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCostoDefinicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCostoDefinicion;
			processRunnable.jTableDatos=jTableDatosTipoCostoDefinicion;
			processRunnable.jPanelCampos=jPanelCamposTipoCostoDefinicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCostoDefinicion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCostoDefinicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCostoDefinicion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCostoDefinicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCostoDefinicion;
			processRunnable.jTtoolBar=jTtoolBarTipoCostoDefinicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCostoDefinicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoCostoDefinicion ,jPanelParametrosReportesTipoCostoDefinicion,jTableDatosTipoCostoDefinicion, /*jScrollPanelDatosTipoCostoDefinicion,*/jPanelCamposTipoCostoDefinicion,jPanelPaginacionTipoCostoDefinicion, /*jScrollPanelDatosEdicionTipoCostoDefinicion,*/ jPanelAccionesTipoCostoDefinicion,jPanelAccionesFormularioTipoCostoDefinicion,jmenuBarTipoCostoDefinicion,jmenuBarDetalleTipoCostoDefinicion,jTtoolBarTipoCostoDefinicion,jTtoolBarDetalleTipoCostoDefinicion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoCostoDefinicion, jScrollPanelDatosTipoCostoDefinicion,jPanelPaginacionTipoCostoDefinicion, jScrollPanelDatosEdicionTipoCostoDefinicion, jPanelAccionesTipoCostoDefinicion,jPanelAccionesFormularioTipoCostoDefinicion,jmenuBarTipoCostoDefinicion,jmenuBarDetalleTipoCostoDefinicion,jTtoolBarTipoCostoDefinicion,jTtoolBarDetalleTipoCostoDefinicion);
						
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
	
	public void finishProcessTipoCostoDefinicion() {// throws Exception 
		this.finishProcessTipoCostoDefinicion(true);
	}
	
	public void finishProcessTipoCostoDefinicion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoCostoDefinicion, this.jScrollPanelDatosTipoCostoDefinicion,this.jPanelPaginacionTipoCostoDefinicion, this.jScrollPanelDatosEdicionTipoCostoDefinicion, this.jPanelAccionesTipoCostoDefinicion,this.jPanelAccionesFormularioTipoCostoDefinicion,this.jmenuBarTipoCostoDefinicion,this.jmenuBarDetalleTipoCostoDefinicion,this.jTtoolBarTipoCostoDefinicion,this.jTtoolBarDetalleTipoCostoDefinicion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoCostoDefinicion=null; 
		
		final JPanel jPanelParametrosReportesTipoCostoDefinicion=this.jPanelParametrosReportesTipoCostoDefinicion;
		//final JScrollPane jScrollPanelDatosTipoCostoDefinicion=this.jScrollPanelDatosTipoCostoDefinicion;
		final JTable jTableDatosTipoCostoDefinicion=this.jTableDatosTipoCostoDefinicion;		
		final JPanel jPanelPaginacionTipoCostoDefinicion=this.jPanelPaginacionTipoCostoDefinicion;
		//final JScrollPane jScrollPanelDatosEdicionTipoCostoDefinicion=this.jScrollPanelDatosEdicionTipoCostoDefinicion;
		final JPanel jPanelAccionesTipoCostoDefinicion=this.jPanelAccionesTipoCostoDefinicion;
		
		JPanel jPanelCamposAuxiliarTipoCostoDefinicion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoCostoDefinicion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
			jPanelCamposAuxiliarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jPanelCamposTipoCostoDefinicion;
			jPanelAccionesFormularioAuxiliarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jPanelAccionesFormularioTipoCostoDefinicion;
		}
		
		final JPanel jPanelCamposTipoCostoDefinicion=jPanelCamposAuxiliarTipoCostoDefinicion;
		final JPanel jPanelAccionesFormularioTipoCostoDefinicion=jPanelAccionesFormularioAuxiliarTipoCostoDefinicion;
		
		
		final JMenuBar jmenuBarTipoCostoDefinicion=this.jmenuBarTipoCostoDefinicion;		
		final JToolBar jTtoolBarTipoCostoDefinicion=this.jTtoolBarTipoCostoDefinicion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoCostoDefinicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoCostoDefinicion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
			jmenuBarDetalleAuxiliarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jmenuBarDetalleTipoCostoDefinicion;
			jTtoolBarDetalleAuxiliarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jTtoolBarDetalleTipoCostoDefinicion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoCostoDefinicion=jmenuBarDetalleAuxiliarTipoCostoDefinicion;
		final JToolBar jTtoolBarDetalleTipoCostoDefinicion=jTtoolBarDetalleAuxiliarTipoCostoDefinicion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoCostoDefinicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoCostoDefinicion;
			processRunnable.jTableDatos=jTableDatosTipoCostoDefinicion;
			processRunnable.jPanelCampos=jPanelCamposTipoCostoDefinicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoCostoDefinicion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoCostoDefinicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoCostoDefinicion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoCostoDefinicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoCostoDefinicion;
			processRunnable.jTtoolBar=jTtoolBarTipoCostoDefinicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoCostoDefinicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoCostoDefinicion ,jPanelParametrosReportesTipoCostoDefinicion, jTableDatosTipoCostoDefinicion,/*jScrollPanelDatosTipoCostoDefinicion,*/jPanelCamposTipoCostoDefinicion,jPanelPaginacionTipoCostoDefinicion, /*jScrollPanelDatosEdicionTipoCostoDefinicion,*/ jPanelAccionesTipoCostoDefinicion,jPanelAccionesFormularioTipoCostoDefinicion,jmenuBarTipoCostoDefinicion,jmenuBarDetalleTipoCostoDefinicion,jTtoolBarTipoCostoDefinicion,jTtoolBarDetalleTipoCostoDefinicion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoCostoDefinicion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoCostoDefinicion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoCostoDefinicion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoCostoDefinicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoCostoDefinicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoCostoDefinicion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoCostoDefinicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoCostoDefinicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoCostoDefinicion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipocostodefinicionConstantesFunciones.getsFinalQueryTipoCostoDefinicion();
		String  finalQueryPaginacionTodos=this.tipocostodefinicionConstantesFunciones.getsFinalQueryTipoCostoDefinicion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoCostoDefinicionConstantesFunciones.getArrayColumnasGlobalesNoTipoCostoDefinicion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoCostoDefinicionConstantesFunciones.getArrayColumnasGlobalesTipoCostoDefinicion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoCostoDefinicionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipocostodefinicionsEliminados= new ArrayList<TipoCostoDefinicion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoCostoDefinicion();
		
				///*TipoCostoDefinicionSessionBean*/this.tipocostodefinicionSessionBean=new TipoCostoDefinicionSessionBean();
			
			if(this.tipocostodefinicionSessionBean==null) {
				this.tipocostodefinicionSessionBean=new TipoCostoDefinicionSessionBean();
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
					this.iNumeroPaginacion=TipoCostoDefinicionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoCostoDefinicionConstantesFunciones.getClassesForeignKeysOfTipoCostoDefinicion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipocostodefinicion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipocostodefinicionsAux= new ArrayList<TipoCostoDefinicion>();
			
				
			tipocostodefinicionLogic.setDatosCliente(this.datosCliente);
			tipocostodefinicionLogic.setDatosDeep(this.datosDeep);
			tipocostodefinicionLogic.setIsConDeep(true);
			
			
			tipocostodefinicionLogic.getTipoCostoDefinicionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipocostodefinicionLogic.getTodosTipoCostoDefinicions(finalQueryGlobal,pagination);
					
					//tipocostodefinicionLogic.getTodosTipoCostoDefinicionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipocostodefinicionLogic.getTipoCostoDefinicions()==null|| tipocostodefinicionLogic.getTipoCostoDefinicions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocostodefinicionsAux= new ArrayList<TipoCostoDefinicion>();
							tipocostodefinicionsAux.addAll(tipocostodefinicionLogic.getTipoCostoDefinicions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocostodefinicionsAux= new ArrayList<TipoCostoDefinicion>();
							tipocostodefinicionsAux.addAll(tipocostodefinicions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocostodefinicionLogic.getTodosTipoCostoDefinicions(finalQueryGlobal+"",this.pagination);												
							
							//tipocostodefinicionLogic.getTodosTipoCostoDefinicionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoCostoDefinicions("Todos",tipocostodefinicionLogic.getTipoCostoDefinicions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipocostodefinicionLogic.setTipoCostoDefinicions(new ArrayList<TipoCostoDefinicion>());					
							tipocostodefinicionLogic.getTipoCostoDefinicions().addAll(tipocostodefinicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocostodefinicions=new ArrayList<TipoCostoDefinicion>();
							tipocostodefinicions.addAll(tipocostodefinicionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoCostoDefinicion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoCostoDefinicion=this.idActual;
				
				} else if(this.idTipoCostoDefinicionActual!=null && this.idTipoCostoDefinicionActual!=0L) {
					idTipoCostoDefinicion=idTipoCostoDefinicionActual;
				}
				
					
				this.sDetalleReporte=TipoCostoDefinicionConstantesFunciones.getDetalleIndicePorId(idTipoCostoDefinicion);
				
				this.tipocostodefinicions=new ArrayList<TipoCostoDefinicion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipocostodefinicionLogic.getEntity(idTipoCostoDefinicion);
					
					//tipocostodefinicionLogic.getEntityWithConnection(idTipoCostoDefinicion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocostodefinicionLogic.setTipoCostoDefinicions(new ArrayList<TipoCostoDefinicion>());
					tipocostodefinicionLogic.getTipoCostoDefinicions().add(tipocostodefinicionLogic.getTipoCostoDefinicion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocostodefinicions=new ArrayList<TipoCostoDefinicion>();
					this.tipocostodefinicions.add(tipocostodefinicion);
				}
				
				if(tipocostodefinicionLogic.getTipoCostoDefinicion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoCostoDefinicion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoCostoDefinicion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocostodefinicionLogic.getTipoCostoDefinicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocostodefinicions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipocostodefinicionLogic.getTipoCostoDefinicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipocostodefinicions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoCostoDefinicion tipocostodefinicion) {
		Boolean permite=true;
		
		if(this.tipocostodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoCostoDefinicionConstantesFunciones.getOrderByListaTipoCostoDefinicion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoCostoDefinicionConstantesFunciones.getOrderByListaTipoCostoDefinicion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCostoDefinicion tipocostodefinicion:tipocostodefinicionLogic.getTipoCostoDefinicions()) {
				if(tipocostodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
					tipocostodefinicionTotales=tipocostodefinicion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCostoDefinicion tipocostodefinicion:this.tipocostodefinicions) {
				if(tipocostodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
					tipocostodefinicionTotales=tipocostodefinicion;
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
			this.tipocostodefinicionAux=new TipoCostoDefinicion();
			this.tipocostodefinicionAux.setsType(Constantes2.S_TOTALES);
			this.tipocostodefinicionAux.setIsNew(false);
			this.tipocostodefinicionAux.setIsChanged(false);
			this.tipocostodefinicionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoCostoDefinicionConstantesFunciones.TotalizarValoresFilaTipoCostoDefinicion(this.tipocostodefinicionLogic.getTipoCostoDefinicions(),this.tipocostodefinicionAux);
				
				this.tipocostodefinicionLogic.getTipoCostoDefinicions().add(this.tipocostodefinicionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoCostoDefinicionConstantesFunciones.TotalizarValoresFilaTipoCostoDefinicion(this.tipocostodefinicions,this.tipocostodefinicionAux);
				
				this.tipocostodefinicions.add(this.tipocostodefinicionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipocostodefinicionTotales=new TipoCostoDefinicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocostodefinicionLogic.getTipoCostoDefinicions().remove(tipocostodefinicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipocostodefinicions.remove(tipocostodefinicionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipocostodefinicionTotales=new TipoCostoDefinicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoCostoDefinicion tipocostodefinicion:tipocostodefinicionLogic.getTipoCostoDefinicions()) {
				if(tipocostodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
					tipocostodefinicionTotales=tipocostodefinicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCostoDefinicionConstantesFunciones.TotalizarValoresFilaTipoCostoDefinicion(this.tipocostodefinicionLogic.getTipoCostoDefinicions(),tipocostodefinicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoCostoDefinicion tipocostodefinicion:this.tipocostodefinicions) {
				if(tipocostodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
					tipocostodefinicionTotales=tipocostodefinicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoCostoDefinicionConstantesFunciones.TotalizarValoresFilaTipoCostoDefinicion(this.tipocostodefinicions,tipocostodefinicionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoCostoDefinicion() {
		this.isPermisoTodoTipoCostoDefinicion=false;
		this.isPermisoNuevoTipoCostoDefinicion=false;
		this.isPermisoActualizarTipoCostoDefinicion=false;
		this.isPermisoActualizarOriginalTipoCostoDefinicion=false;
		this.isPermisoEliminarTipoCostoDefinicion=false;
		this.isPermisoGuardarCambiosTipoCostoDefinicion=false;
		this.isPermisoConsultaTipoCostoDefinicion=false;
		this.isPermisoBusquedaTipoCostoDefinicion=false;
		this.isPermisoReporteTipoCostoDefinicion=false;		
		this.isPermisoOrdenTipoCostoDefinicion=false;		
		this.isPermisoPaginacionMedioTipoCostoDefinicion=false;		
		this.isPermisoPaginacionAltoTipoCostoDefinicion=false;
		this.isPermisoPaginacionTodoTipoCostoDefinicion=false;
		this.isPermisoCopiarTipoCostoDefinicion=false;		
		this.isPermisoVerFormTipoCostoDefinicion=false;		
		this.isPermisoDuplicarTipoCostoDefinicion=false;		
		this.isPermisoOrdenTipoCostoDefinicion=false;		
	}
	
	public void setPermisosUsuarioTipoCostoDefinicion(Boolean isPermiso) {
		this.isPermisoTodoTipoCostoDefinicion=isPermiso;
		this.isPermisoNuevoTipoCostoDefinicion=isPermiso;
		this.isPermisoActualizarTipoCostoDefinicion=isPermiso;
		this.isPermisoActualizarOriginalTipoCostoDefinicion=isPermiso;
		this.isPermisoEliminarTipoCostoDefinicion=isPermiso;
		this.isPermisoGuardarCambiosTipoCostoDefinicion=isPermiso;
		this.isPermisoConsultaTipoCostoDefinicion=isPermiso;
		this.isPermisoBusquedaTipoCostoDefinicion=isPermiso;
		this.isPermisoReporteTipoCostoDefinicion=isPermiso;
		this.isPermisoOrdenTipoCostoDefinicion=isPermiso;		
		this.isPermisoPaginacionMedioTipoCostoDefinicion=isPermiso;		
		this.isPermisoPaginacionAltoTipoCostoDefinicion=isPermiso;		
		this.isPermisoPaginacionTodoTipoCostoDefinicion=isPermiso;		
		this.isPermisoCopiarTipoCostoDefinicion=isPermiso;		
		this.isPermisoVerFormTipoCostoDefinicion=isPermiso;		
		this.isPermisoDuplicarTipoCostoDefinicion=isPermiso;
		this.isPermisoOrdenTipoCostoDefinicion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoCostoDefinicion(Boolean isPermiso) {
		//this.isPermisoTodoTipoCostoDefinicion=isPermiso;
		this.isPermisoNuevoTipoCostoDefinicion=isPermiso;
		this.isPermisoActualizarTipoCostoDefinicion=isPermiso;
		this.isPermisoActualizarOriginalTipoCostoDefinicion=isPermiso;
		this.isPermisoEliminarTipoCostoDefinicion=isPermiso;
		this.isPermisoGuardarCambiosTipoCostoDefinicion=isPermiso;
		//this.isPermisoConsultaTipoCostoDefinicion=isPermiso;
		//this.isPermisoBusquedaTipoCostoDefinicion=isPermiso;
		//this.isPermisoReporteTipoCostoDefinicion=isPermiso;
		//this.isPermisoOrdenTipoCostoDefinicion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoCostoDefinicion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoCostoDefinicion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoCostoDefinicion=isPermiso;		
		//this.isPermisoCopiarTipoCostoDefinicion=isPermiso;		
		//this.isPermisoDuplicarTipoCostoDefinicion=isPermiso;
		//this.isPermisoOrdenTipoCostoDefinicion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoCostoDefinicionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
		if(TipoCostoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDefinicion=false;
		this.isTienePermisosDefinicion=this.verificarGetPermisosUsuarioOpcionTipoCostoDefinicionClaseRelacionada(this.opcionsRelacionadas,DefinicionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoCostoDefinicion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoCostoDefinicionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDefinicion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoCostoDefinicionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoCostoDefinicionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoCostoDefinicionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDefinicion && this.jInternalFrameDetalleFormTipoCostoDefinicion!=null && this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jTabbedPaneRelacionesTipoCostoDefinicion.remove(this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoCostoDefinicion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoCostoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoCostoDefinicionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoCostoDefinicion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoCostoDefinicion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoCostoDefinicion=this.isPermisoActualizarTipoCostoDefinicion;
			this.isPermisoEliminarTipoCostoDefinicion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoCostoDefinicion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoCostoDefinicion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoCostoDefinicion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoCostoDefinicion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoCostoDefinicion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCostoDefinicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoCostoDefinicion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoCostoDefinicion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoCostoDefinicion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoCostoDefinicion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoCostoDefinicion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoCostoDefinicion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoCostoDefinicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoCostoDefinicion.setToolTipText(this.jTableDatosTipoCostoDefinicion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoCostoDefinicion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoCostoDefinicion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoCostoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoCostoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoCostoDefinicion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDefinicion && this.tipocostodefinicionConstantesFunciones.mostrarDefinicionTipoCostoDefinicion && !TipoCostoDefinicionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Definicion");
			reporte.setsDescripcion("Definicion");
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
	
		
	public void inicializarCombosForeignKeyTipoCostoDefinicionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoCostoDefinicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoCostoDefinicionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoCostoDefinicionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoCostoDefinicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoCostoDefinicion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoCostoDefinicion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoCostoDefinicion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoCostoDefinicion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCostoDefinicion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoCostoDefinicion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoCostoDefinicion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoCostoDefinicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoCostoDefinicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoCostoDefinicion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoCostoDefinicion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoCostoDefinicion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoCostoDefinicion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoCostoDefinicionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoCostoDefinicionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoCostoDefinicionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipocostodefinicionSessionBean=new TipoCostoDefinicionSessionBean(); 
		this.tipocostodefinicionConstantesFunciones=new TipoCostoDefinicionConstantesFunciones(); 
		this.tipocostodefinicionBean=new TipoCostoDefinicion();//(this.tipocostodefinicionConstantesFunciones); 		
		this.tipocostodefinicionReturnGeneral=new TipoCostoDefinicionParameterReturnGeneral(); 
		
		this.tipocostodefinicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipocostodefinicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoCostoDefinicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoCostoDefinicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoCostoDefinicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoCostoDefinicion(true);
			
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
			
			this.tipocostodefinicionConstantesFunciones=new TipoCostoDefinicionConstantesFunciones(); 
			this.tipocostodefinicionBean=new TipoCostoDefinicion();//this.tipocostodefinicionConstantesFunciones); 			
			this.tipocostodefinicionReturnGeneral=new TipoCostoDefinicionParameterReturnGeneral(); 
		
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Costo Definicion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipocostodefinicion=new TipoCostoDefinicion();
			this.tipocostodefinicions = new ArrayList<TipoCostoDefinicion>();
			this.tipocostodefinicionsAux = new ArrayList<TipoCostoDefinicion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic=new TipoCostoDefinicionLogic();
				this.tipocostodefinicionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipocostodefinicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipocostodefinicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoCostoDefinicion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoCostoDefinicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCostoDefinicion);	
					}
					
					if(this.jInternalFrameImportacionTipoCostoDefinicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCostoDefinicion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoCostoDefinicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoCostoDefinicion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCostoDefinicion);
				this.jInternalFrameDetalleFormTipoCostoDefinicion.setVisible(false);
				this.jInternalFrameDetalleFormTipoCostoDefinicion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoCostoDefinicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCostoDefinicion);
					this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoCostoDefinicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoCostoDefinicion);
					this.jInternalFrameImportacionTipoCostoDefinicion.setVisible(false);
					this.jInternalFrameImportacionTipoCostoDefinicion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoCostoDefinicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoCostoDefinicion);
					this.jInternalFrameOrderByTipoCostoDefinicion.setVisible(false);
					this.jInternalFrameOrderByTipoCostoDefinicion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoCostoDefinicionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoCostoDefinicionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipocostodefinicionReturnGeneral=new TipoCostoDefinicionParameterReturnGeneral();
			
			this.tipocostodefinicionParameterGeneral=new TipoCostoDefinicionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipocostodefinicionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoCostoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCostoDefinicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocostodefinicionSessionBean.getEsGuardarRelacionado(),this.tipocostodefinicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoCostoDefinicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipocostodefinicionSessionBean.getEsGuardarRelacionado(),this.tipocostodefinicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoCostoDefinicion=false;
			this.isVisibilidadCeldaDuplicarTipoCostoDefinicion=true;
			this.isVisibilidadCeldaCopiarTipoCostoDefinicion=true;
			this.isVisibilidadCeldaVerFormTipoCostoDefinicion=true;
			this.isVisibilidadCeldaOrdenTipoCostoDefinicion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaGuardarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoCostoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoCostoDefinicion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoCostoDefinicion(false);
			
			this.setPermisosUsuarioTipoCostoDefinicion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipocostodefinicionSessionBean.getEsGuardarRelacionado() && this.tipocostodefinicionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoCostoDefinicionClasesRelacionadas();
			}
			
			if(this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoCostoDefinicionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoCostoDefinicion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoCostoDefinicion();
			}
			
			if(!this.isPermisoBusquedaTipoCostoDefinicion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoCostoDefinicion,this.isPermisoPaginacionMedioTipoCostoDefinicion,this.isPermisoPaginacionTodoTipoCostoDefinicion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoCostoDefinicionConstantesFunciones.getTiposSeleccionarTipoCostoDefinicion());
				
				this.tiposColumnasSelect=TipoCostoDefinicionConstantesFunciones.getTiposSeleccionarTipoCostoDefinicion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoCostoDefinicion();				
				//this.tiposRelacionesSelect=TipoCostoDefinicionConstantesFunciones.getTiposRelacionesTipoCostoDefinicion(true);
				
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
			//if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoCostoDefinicion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoCostoDefinicion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoCostoDefinicion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCostoDefinicion() ;
			
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
			
			
			this.definicionLogic=new DefinicionLogic(); 
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
				tipocostodefinicionImplementable= (TipoCostoDefinicionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCostoDefinicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipocostodefinicionImplementableHome= (TipoCostoDefinicionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoCostoDefinicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipocostodefinicions= new ArrayList<TipoCostoDefinicion>();
			this.tipocostodefinicionsEliminados= new ArrayList<TipoCostoDefinicion>();
						
			this.isEsNuevoTipoCostoDefinicion=false;
			this.esParaAccionDesdeFormularioTipoCostoDefinicion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoCostoDefinicion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoCostoDefinicion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoCostoDefinicionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoCostoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoCostoDefinicion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoCostoDefinicion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoCostoDefinicion();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoCostoDefinicion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoCostoDefinicion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoCostoDefinicion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DefinicionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DefinicionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoCostoDefinicion")) {
				iIndex=this.jInternalFrameDetalleFormTipoCostoDefinicion.jTabbedPaneRelacionesTipoCostoDefinicion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoCostoDefinicion.jTabbedPaneRelacionesTipoCostoDefinicion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();	
				
				

				if(sTitle.equals("Definiciones")) {
					if(!DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoCostoDefinicion();

						this.cargarParteTabPanelRelacionadaDefinicion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoCostoDefinicion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDefinicion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoCostoDefinicion.cargarSessionConBeanSwingJInternalFrameDefinicion(false,true,iIndex);
		this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDefinicion();

		//this.jTabbedPaneRelacionesTipoCostoDefinicion.updateUI();
		//this.jTabbedPaneRelacionesTipoCostoDefinicion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoCostoDefinicion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Definicion")) {
				int row=this.jTableDatosTipoCostoDefinicion.getSelectedRow();
				jButtonDefinicionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Definicion")) {

					if(this.isTienePermisosDefinicion && this.tipocostodefinicionConstantesFunciones.mostrarDefinicionTipoCostoDefinicion && !TipoCostoDefinicionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Definiciones"+"("+DefinicionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Definiciones");

						if(tipocostodefinicionConstantesFunciones.resaltarDefinicionTipoCostoDefinicion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipocostodefinicionConstantesFunciones.resaltarDefinicionTipoCostoDefinicion);
						}

						jmenuItem.setEnabled(this.tipocostodefinicionConstantesFunciones.activarDefinicionTipoCostoDefinicion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Definicion"));

						

						this.jInternalFrameDetalleFormTipoCostoDefinicion.jmenuDetalleTipoCostoDefinicion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoCostoDefinicion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoCostoDefinicion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoCostoDefinicion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoCostoDefinicionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoCostoDefinicion();
		
		this.cargarCombosFrameForeignKeyTipoCostoDefinicion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoCostoDefinicion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoCostoDefinicion();
		}
	}
	
	
	
	public void jButtonNuevoTipoCostoDefinicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			
			
			if(jTableDatosTipoCostoDefinicion.getRowCount()>=1) {
				jTableDatosTipoCostoDefinicion.removeRowSelectionInterval(0, jTableDatosTipoCostoDefinicion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoCostoDefinicion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoCostoDefinicion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoCostoDefinicion(true);			
			//this.tipocostodefinicion=new TipoCostoDefinicion();
			//this.tipocostodefinicion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCostoDefinicion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCostoDefinicion() ;
			
			if(TipoCostoDefinicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCostoDefinicion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipocostodefinicion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);				
			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			
			if(this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoCostoDefinicion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoCostoDefinicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoCostoDefinicion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoCostoDefinicion.getSelectedRows().length;			
			}
			
			tipocostodefinicionsSeleccionados=this.getTipoCostoDefinicionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoCostoDefinicion--;			
				//TipoCostoDefinicion tipocostodefinicionAux= new TipoCostoDefinicion();			
				//tipocostodefinicionAux.setId(this.iIdNuevoTipoCostoDefinicion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoCostoDefinicion tipocostodefinicionOrigen=new TipoCostoDefinicion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoCostoDefinicion tipocostodefinicionOrigen : tipocostodefinicionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipocostodefinicionOrigen =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipocostodefinicionOrigen =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoCostoDefinicion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipocostodefinicion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoCostoDefinicion(tipocostodefinicionOrigen,this.tipocostodefinicion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocostodefinicionLogic.getTipoCostoDefinicions().add(this.tipocostodefinicionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocostodefinicions.add(this.tipocostodefinicionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
				
				this.jTableDatosTipoCostoDefinicion.setRowSelectionInterval(this.getIndiceNuevoTipoCostoDefinicion(), this.getIndiceNuevoTipoCostoDefinicion());
				
				int iLastRow =  this.jTableDatosTipoCostoDefinicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCostoDefinicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCostoDefinicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();									
		
			TipoCostoDefinicion tipocostodefinicionOrigen=new TipoCostoDefinicion();
			TipoCostoDefinicion tipocostodefinicionDestino=new TipoCostoDefinicion();
				
			tipocostodefinicionsSeleccionados=this.getTipoCostoDefinicionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoCostoDefinicion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipocostodefinicionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoCostoDefinicion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostodefinicionOrigen =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocostodefinicionOrigen =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipocostodefinicionDestino =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipocostodefinicionDestino =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipocostodefinicionOrigen =tipocostodefinicionsSeleccionados.get(0);
				tipocostodefinicionDestino =tipocostodefinicionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoCostoDefinicion(tipocostodefinicionOrigen,tipocostodefinicionDestino,true,false);
				
				tipocostodefinicionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipocostodefinicionDestino,tipocostodefinicionLogic.getTipoCostoDefinicions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipocostodefinicionDestino,tipocostodefinicions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
				
				//this.jTableDatosTipoCostoDefinicion.setRowSelectionInterval(this.getIndiceNuevoTipoCostoDefinicion(), this.getIndiceNuevoTipoCostoDefinicion());
				
				int iLastRow =  this.jTableDatosTipoCostoDefinicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoCostoDefinicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoCostoDefinicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoCostoDefinicion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoCostoDefinicion.isVisible();
			
			
			this.jPanelParametrosReportesTipoCostoDefinicion.setVisible(!isVisible);
			this.jPanelPaginacionTipoCostoDefinicion.setVisible(!isVisible);
			this.jPanelAccionesTipoCostoDefinicion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoCostoDefinicion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoCostoDefinicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoCostoDefinicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoCostoDefinicion();
			
			this.abrirFrameOrderByTipoCostoDefinicion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoCostoDefinicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoCostoDefinicion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCostoDefinicion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoCostoDefinicion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoCostoDefinicion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoCostoDefinicion.setSize(this.jInternalFrameDetalleFormTipoCostoDefinicion.iWidthFormulario,this.jInternalFrameDetalleFormTipoCostoDefinicion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoCostoDefinicion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoCostoDefinicion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoCostoDefinicion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoCostoDefinicion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoCostoDefinicion.jContentPaneDetalleTipoCostoDefinicion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoCostoDefinicion.jTabbedPaneRelacionesTipoCostoDefinicion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoCostoDefinicion.jContentPaneDetalleTipoCostoDefinicion.getWidth(),TipoCostoDefinicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCostoDefinicion.jTabbedPaneRelacionesTipoCostoDefinicion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoCostoDefinicion.jContentPaneDetalleTipoCostoDefinicion.getWidth(),TipoCostoDefinicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoCostoDefinicion.jTabbedPaneRelacionesTipoCostoDefinicion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoCostoDefinicion.jContentPaneDetalleTipoCostoDefinicion.getWidth(),TipoCostoDefinicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDefinicion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoCostoDefinicion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoCostoDefinicion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoCostoDefinicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoCostoDefinicion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoCostoDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCostoDefinicion,false,this);
				} else {
					this.jInternalFrameOrderByTipoCostoDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoCostoDefinicion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoCostoDefinicion);
				this.jInternalFrameOrderByTipoCostoDefinicion.setVisible(false);
				this.jInternalFrameOrderByTipoCostoDefinicion.setSelected(false);
				
				this.jInternalFrameOrderByTipoCostoDefinicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCostoDefinicion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoCostoDefinicion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoCostoDefinicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoCostoDefinicion==null) {
				
				this.jInternalFrameImportacionTipoCostoDefinicion=new ImportacionJInternalFrame(TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoCostoDefinicion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoCostoDefinicion);
				this.jInternalFrameImportacionTipoCostoDefinicion.setVisible(false);
				this.jInternalFrameImportacionTipoCostoDefinicion.setSelected(false);


				this.jInternalFrameImportacionTipoCostoDefinicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCostoDefinicion"));
				this.jInternalFrameImportacionTipoCostoDefinicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCostoDefinicion"));
				this.jInternalFrameImportacionTipoCostoDefinicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCostoDefinicion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoCostoDefinicion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoCostoDefinicion==null) {
				this.jInternalFrameReporteDinamicoTipoCostoDefinicion=new ReporteDinamicoJInternalFrame(TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoCostoDefinicion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoCostoDefinicion);
				this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCostoDefinicion"));
				this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCostoDefinicion"));
				this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCostoDefinicion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCostoDefinicion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDefinicion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoCostoDefinicion.jContentPaneDetalleTipoCostoDefinicion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoCostoDefinicion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoCostoDefinicion);
			
	       	this.jInternalFrameDetalleFormTipoCostoDefinicion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoCostoDefinicion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoCostoDefinicion.dispose();
			//this.jInternalFrameDetalleFormTipoCostoDefinicion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoCostoDefinicion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoCostoDefinicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoCostoDefinicion.setVisible(true);
	        this.jInternalFrameImportacionTipoCostoDefinicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoCostoDefinicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoCostoDefinicion.setVisible(true);
	        this.jInternalFrameOrderByTipoCostoDefinicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoCostoDefinicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoCostoDefinicion.setVisible(false);
	        this.jInternalFrameOrderByTipoCostoDefinicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoCostoDefinicion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoCostoDefinicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoCostoDefinicion.setVisible(false);
	        this.jInternalFrameImportacionTipoCostoDefinicion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoCostoDefinicion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoCostoDefinicion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoCostoDefinicion(true);
			//this.isEsNuevoTipoCostoDefinicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoCostoDefinicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCostoDefinicion(false) ;
			
			if(tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoCostoDefinicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCostoDefinicion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCostoDefinicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoCostoDefinicionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoCostoDefinicion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoCostoDefinicion(true);
			//this.isEsNuevoTipoCostoDefinicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipocostodefinicion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoCostoDefinicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoCostoDefinicion(false) ;
			
			if(TipoCostoDefinicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoCostoDefinicion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCostoDefinicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoCostoDefinicion(false);
			
			//if(!this.isEsNuevoTipoCostoDefinicion) {								
				int intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(this.tipocostodefinicion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);
				
			}
			
			if(this.permiteMantenimiento(this.tipocostodefinicion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoCostoDefinicion=true;
					this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
					this.isEsNuevoTipoCostoDefinicion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoCostoDefinicion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoCostoDefinicion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCostoDefinicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCostoDefinicion(false);
				
				this.habilitarDeshabilitarControlesTipoCostoDefinicion(false);
			
												
				
				if(TipoCostoDefinicionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoCostoDefinicion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoCostoDefinicionActionPerformed(evt,tipocostodefinicionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoCostoDefinicion(this.tipocostodefinicion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoCostoDefinicion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipocostodefinicionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipocostodefinicion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoCostoDefinicion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoDefinicion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				this.tipocostodefinicion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				this.tipocostodefinicion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipocostodefinicion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoCostoDefinicionModel) this.jTableDatosTipoCostoDefinicion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoCostoDefinicion=true;
				this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
				this.isEsNuevoTipoCostoDefinicion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoCostoDefinicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCostoDefinicion(false);
				
				this.habilitarDeshabilitarControlesTipoCostoDefinicion(false);
				
				
				
				if(TipoCostoDefinicionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoCostoDefinicion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoCostoDefinicion.getRowCount()>=1) {
				jTableDatosTipoCostoDefinicion.removeRowSelectionInterval(0, jTableDatosTipoCostoDefinicion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoCostoDefinicion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoCostoDefinicion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoCostoDefinicion(false) ;
			
			this.isEsNuevoTipoCostoDefinicion=false;
			
			if(TipoCostoDefinicionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoCostoDefinicion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoCostoDefinicion(false);
				
				//SI ES MANUAL
				if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoCostoDefinicion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoCostoDefinicion--;			
			//TipoCostoDefinicion tipocostodefinicionAux= new TipoCostoDefinicion();			
			//tipocostodefinicionAux.setId(this.iIdNuevoTipoCostoDefinicion);
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoCostoDefinicion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);
			
			this.tipocostodefinicion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipocostodefinicionLogic.getTipoCostoDefinicions().add(this.tipocostodefinicionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipocostodefinicions.add(this.tipocostodefinicionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
			
			this.jTableDatosTipoCostoDefinicion.setRowSelectionInterval(this.getIndiceNuevoTipoCostoDefinicion(), this.getIndiceNuevoTipoCostoDefinicion());
			
			int iLastRow =  this.jTableDatosTipoCostoDefinicion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoCostoDefinicion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoCostoDefinicion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoCostoDefinicion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCostoDefinicion(false);
			
			//SI ES MANUAL
			if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCostoDefinicion();
			}
			
			//this.abrirFrameTreeTipoCostoDefinicion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Costo DefinicionES ?", "MANTENIMIENTO DE Tipo Costo Definicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoCostoDefinicion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoCostoDefinicion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipocostodefinicionReturnGeneral=tipocostodefinicionLogic.procesarImportacionTipoCostoDefinicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipocostodefinicionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoCostoDefinicionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoCostoDefinicion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoCostoDefinicion.setFileImportacion(this.jInternalFrameImportacionTipoCostoDefinicion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoCostoDefinicion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoCostoDefinicion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoCostoDefinicion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoCostoDefinicion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();		

		tipocostodefinicionsSeleccionados=this.getTipoCostoDefinicionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoCostoDefinicionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoCostoDefinicionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoCostoDefinicions("Todos",tipocostodefinicionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Definicion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();		
		
		tipocostodefinicionsSeleccionados=this.getTipoCostoDefinicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostodefinicion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoCostoDefinicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoCostoDefinicion tipocostodefinicion:tipocostodefinicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocostodefinicion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoCostoDefinicion tipocostodefinicion:tipocostodefinicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipocostodefinicion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoCostoDefinicion(row);				
			//	iRow++;
			//}				
			
			//for(TipoCostoDefinicion tipocostodefinicionAux:tipocostodefinicionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoCostoDefinicion(tipocostodefinicionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Definicion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipocostodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCostoDefinicion(false);
			
			//SI ES MANUAL
			if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoCostoDefinicion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCostoDefinicion(false);
			
			//SI ES MANUAL
			if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCostoDefinicion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoCostoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoCostoDefinicion(false);
			
			//SI ES MANUAL
			if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoCostoDefinicion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipocostodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoCostoDefinicion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoCostoDefinicion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoCostoDefinicion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoCostoDefinicion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoCostoDefinicion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoCostoDefinicion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoCostoDefinicion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoCostoDefinicion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoCostoDefinicion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoCostoDefinicion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoCostoDefinicion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoCostoDefinicion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoCostoDefinicion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoCostoDefinicion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCostoDefinicion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoCostoDefinicion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoCostoDefinicion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoCostoDefinicion();
		
		this.inicializarActualizarBindingBotonesManualTipoCostoDefinicion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCostoDefinicion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoCostoDefinicion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCostoDefinicion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCostoDefinicion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoCostoDefinicion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoCostoDefinicion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoCostoDefinicion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoCostoDefinicion.jCheckBoxPostAccionNuevoTipoCostoDefinicion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoCostoDefinicion.jCheckBoxPostAccionSinCerrarTipoCostoDefinicion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoCostoDefinicion.jCheckBoxPostAccionSinMensajeTipoCostoDefinicion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoCostoDefinicion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoCostoDefinicion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoCostoDefinicion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
				this.jInternalFrameDetalleFormTipoCostoDefinicion.jCheckBoxPostAccionNuevoTipoCostoDefinicion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoCostoDefinicion.jCheckBoxPostAccionSinCerrarTipoCostoDefinicion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoCostoDefinicion.jCheckBoxPostAccionSinMensajeTipoCostoDefinicion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoCostoDefinicion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoCostoDefinicion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoCostoDefinicion.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoCostoDefinicion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoCostoDefinicion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoCostoDefinicion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoCostoDefinicion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoCostoDefinicion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoCostoDefinicion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoCostoDefinicion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoCostoDefinicion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoCostoDefinicion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoCostoDefinicion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoCostoDefinicion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoCostoDefinicion() throws Exception {
		try	{
			if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCostoDefinicion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCostoDefinicion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoCostoDefinicion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoCostoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoCostoDefinicion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoCostoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoCostoDefinicion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoCostoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoCostoDefinicion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoCostoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoCostoDefinicion.addItem(reporte);
			}
			
			
			if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoCostoDefinicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoCostoDefinicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoCostoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoCostoDefinicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoCostoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoCostoDefinicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoCostoDefinicion.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoCostoDefinicion.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoCostoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoCostoDefinicion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoCostoDefinicion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCostoDefinicion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoCostoDefinicion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCostoDefinicion!=null) {
				this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoCostoDefinicion!=null) {
				this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoCostoDefinicion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoCostoDefinicion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoCostoDefinicion(Boolean esInicializar) throws Exception {				
		if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoCostoDefinicion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoCostoDefinicion() throws Exception {
		this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoCostoDefinicion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoCostoDefinicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoCostoDefinicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoCostoDefinicionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoDefinicionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoCostoDefinicionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoCostoDefinicionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoCostoDefinicion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipocostodefinicionLogic.getTipoCostoDefinicions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipocostodefinicions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoCostoDefinicion.setModel(new TipoCostoDefinicionModel(this.tipocostodefinicionLogic.getTipoCostoDefinicions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoCostoDefinicion.setModel(new TipoCostoDefinicionModel(this.tipocostodefinicions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoCostoDefinicion!=null && this.jInternalFrameOrderByTipoCostoDefinicion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoCostoDefinicion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoDefinicion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoCostoDefinicionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO,tipocostodefinicionConstantesFunciones.resaltarSeleccionarTipoCostoDefinicion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoCostoDefinicionConstantesFunciones.SCLASSWEBTITULO,tipocostodefinicionConstantesFunciones.resaltarSeleccionarTipoCostoDefinicion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoDefinicion,TipoCostoDefinicionConstantesFunciones.LABEL_ID));

		if(this.tipocostodefinicionConstantesFunciones.mostraridTipoCostoDefinicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCostoDefinicionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipocostodefinicionConstantesFunciones.resaltaridTipoCostoDefinicion,this.tipocostodefinicionConstantesFunciones.activaridTipoCostoDefinicion,this,true,"idTipoCostoDefinicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocostodefinicionConstantesFunciones.resaltaridTipoCostoDefinicion,this.tipocostodefinicionConstantesFunciones.activaridTipoCostoDefinicion,this,true,"idTipoCostoDefinicion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoDefinicion,TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO));

		if(this.tipocostodefinicionConstantesFunciones.mostrarcodigoTipoCostoDefinicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocostodefinicionConstantesFunciones.resaltarcodigoTipoCostoDefinicion,this.tipocostodefinicionConstantesFunciones.activarcodigoTipoCostoDefinicion,this,true,"codigoTipoCostoDefinicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocostodefinicionConstantesFunciones.resaltarcodigoTipoCostoDefinicion,this.tipocostodefinicionConstantesFunciones.activarcodigoTipoCostoDefinicion,this,true,"codigoTipoCostoDefinicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCostoDefinicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoDefinicion,TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipocostodefinicionConstantesFunciones.mostrarnombreTipoCostoDefinicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipocostodefinicionConstantesFunciones.resaltarnombreTipoCostoDefinicion,this.tipocostodefinicionConstantesFunciones.activarnombreTipoCostoDefinicion,this,true,"nombreTipoCostoDefinicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipocostodefinicionConstantesFunciones.resaltarnombreTipoCostoDefinicion,this.tipocostodefinicionConstantesFunciones.activarnombreTipoCostoDefinicion,this,true,"nombreTipoCostoDefinicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoCostoDefinicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDefinicion && this.tipocostodefinicionConstantesFunciones.mostrarDefinicionTipoCostoDefinicion && !TipoCostoDefinicionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Definiciones");
				tableColumn.setHeaderValue("Definiciones");
				tableColumn.setCellRenderer(new DefinicionTableCell(tipocostodefinicionConstantesFunciones.resaltarDefinicionTipoCostoDefinicion,this,this.tipocostodefinicionConstantesFunciones.activarDefinicionTipoCostoDefinicion));
				tableColumn.setCellEditor(new DefinicionTableCell(tipocostodefinicionConstantesFunciones.resaltarDefinicionTipoCostoDefinicion,this,this.tipocostodefinicionConstantesFunciones.activarDefinicionTipoCostoDefinicion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoCostoDefinicion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCostoDefinicion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoCostoDefinicion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoCostoDefinicion && this.isPermisoGuardarCambiosTipoCostoDefinicion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoCostoDefinicion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoCostoDefinicion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoCostoDefinicion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCostoDefinicion && this.isPermisoGuardarCambiosTipoCostoDefinicion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoCostoDefinicion && this.isPermisoGuardarCambiosTipoCostoDefinicion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoCostoDefinicion.moveColumn(this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoCostoDefinicion.moveColumn(this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoCostoDefinicion.moveColumn(this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoCostoDefinicion.moveColumn(this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoCostoDefinicion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoCostoDefinicion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoCostoDefinicion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoCostoDefinicion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoCostoDefinicion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoCostoDefinicion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipocostodefinicionLogic.getTipoCostoDefinicions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipocostodefinicions.size()-1;
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
		//this.jTableDatosTipoCostoDefinicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoCostoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoCostoDefinicion();
			
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
				
				//this.isEsNuevoTipoCostoDefinicion=false;
					
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			
				if(this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCostoDefinicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCostoDefinicion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipocostodefinicion.getsType().equals("DUPLICADO")
				   || this.tipocostodefinicion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoCostoDefinicion=true;
				
				} else {
					this.isEsNuevoTipoCostoDefinicion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipocostodefinicion.getId()>=0 && !this.tipocostodefinicion.getIsNew()) {						
						this.isEsNuevoTipoCostoDefinicion=false;
						
					} else {
						this.isEsNuevoTipoCostoDefinicion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoCostoDefinicion(esRelaciones);						
				
				this.seleccionarTipoCostoDefinicion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipocostodefinicion.getId()<0) {
					this.isEsNuevoTipoCostoDefinicion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoCostoDefinicion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoCostoDefinicion(evt,rowIndex);
				}	
				
				if(this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoCostoDefinicion: " + this.dDif); 
					}
				}								
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoCostoDefinicion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipocostodefinicion)) {
					if(this.tipocostodefinicion.getId()>0) {
						this.tipocostodefinicion.setIsDeleted(true);
						
						this.tipocostodefinicionsEliminados.add(this.tipocostodefinicion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipocostodefinicionLogic.getTipoCostoDefinicions().remove(this.tipocostodefinicion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipocostodefinicions.remove(this.tipocostodefinicion);				
					}
					
					
					((TipoCostoDefinicionModel) this.jTableDatosTipoCostoDefinicion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoCostoDefinicion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoCostoDefinicion) {
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoCostoDefinicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoCostoDefinicion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoCostoDefinicion(this.tipocostodefinicion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoCostoDefinicion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoCostoDefinicion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoCostoDefinicion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoCostoDefinicion(tipocostodefinicion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoCostoDefinicion(tipocostodefinicion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoCostoDefinicion(tipocostodefinicion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoCostoDefinicion(tipocostodefinicion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldidTipoCostoDefinicion.setText(tipocostodefinicion.getId().toString());
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldcodigoTipoCostoDefinicion.setText(tipocostodefinicion.getcodigo());
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldnombreTipoCostoDefinicion.setText(tipocostodefinicion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoCostoDefinicion tipocostodefinicionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipocostodefinicionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoCostoDefinicion tipocostodefinicionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipocostodefinicionLocal=this.tipocostodefinicion;
			} else {
				tipocostodefinicionLocal=this.tipocostodefinicionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipocostodefinicionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoCostoDefinicion(tipocostodefinicionLocal,true);
					
					if(tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipocostodefinicionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipocostodefinicionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(tipocostodefinicion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(tipocostodefinicion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(tipocostodefinicion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldidTipoCostoDefinicion.getText()==null || this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldidTipoCostoDefinicion.getText()=="" || this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldidTipoCostoDefinicion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldidTipoCostoDefinicion.setText("0");
			}

			if(conColumnasBase) {tipocostodefinicion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldidTipoCostoDefinicion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCostoDefinicionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCostoDefinicion.jLabelIdTipoCostoDefinicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocostodefinicion.setcodigo(this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldcodigoTipoCostoDefinicion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCostoDefinicion.jLabelcodigoTipoCostoDefinicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipocostodefinicion.setnombre(this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldnombreTipoCostoDefinicion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoCostoDefinicion.jLabelnombreTipoCostoDefinicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicionBean,TipoCostoDefinicion tipocostodefinicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicionOrigen,TipoCostoDefinicion tipocostodefinicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocostodefinicionOrigen.getId()!=null && !tipocostodefinicionOrigen.getId().equals(0L))) {tipocostodefinicion.setId(tipocostodefinicionOrigen.getId());}}
			if(conDefault || (!conDefault && tipocostodefinicionOrigen.getcodigo()!=null && !tipocostodefinicionOrigen.getcodigo().equals(""))) {tipocostodefinicion.setcodigo(tipocostodefinicionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipocostodefinicionOrigen.getnombre()!=null && !tipocostodefinicionOrigen.getnombre().equals(""))) {tipocostodefinicion.setnombre(tipocostodefinicionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldidTipoCostoDefinicion.setText(tipocostodefinicion.getId().toString());
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldcodigoTipoCostoDefinicion.setText(tipocostodefinicion.getcodigo());
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldnombreTipoCostoDefinicion.setText(tipocostodefinicion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoCostoDefinicion(TipoCostoDefinicionBean tipocostodefinicionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldidTipoCostoDefinicion.setText(tipocostodefinicionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldcodigoTipoCostoDefinicion.setText(tipocostodefinicionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldnombreTipoCostoDefinicion.setText(tipocostodefinicionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoCostoDefinicion(TipoCostoDefinicionParameterReturnGeneral tipocostodefinicionReturnGeneral,TipoCostoDefinicionBean tipocostodefinicionBean,Boolean conDefault) throws Exception { 
		try {
			TipoCostoDefinicion tipocostodefinicionLocal=new TipoCostoDefinicion();
			
			tipocostodefinicionLocal=tipocostodefinicionReturnGeneral.getTipoCostoDefinicion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipocostodefinicionLocal.getId()!=null && !tipocostodefinicionLocal.getId().equals(0L))) {tipocostodefinicionBean.setId(tipocostodefinicionLocal.getId());}}
			if(conDefault || (!conDefault && tipocostodefinicionLocal.getcodigo()!=null && !tipocostodefinicionLocal.getcodigo().equals(""))) {tipocostodefinicionBean.setcodigo(tipocostodefinicionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipocostodefinicionLocal.getnombre()!=null && !tipocostodefinicionLocal.getnombre().equals(""))) {tipocostodefinicionBean.setnombre(tipocostodefinicionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoCostoDefinicionGenerico(Long idTipoCostoDefinicionSeleccionado,JComboBox jComboBoxTipoCostoDefinicion,List<TipoCostoDefinicion> tipocostodefinicionsLocal)throws Exception {
		try {
			TipoCostoDefinicion  tipocostodefinicionTemp=null;

			for(TipoCostoDefinicion tipocostodefinicionAux:tipocostodefinicionsLocal) {
				if(tipocostodefinicionAux.getId()!=null && tipocostodefinicionAux.getId().equals(idTipoCostoDefinicionSeleccionado)) {
					tipocostodefinicionTemp=tipocostodefinicionAux;
					break;
				}
			}

			jComboBoxTipoCostoDefinicion.setSelectedItem(tipocostodefinicionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoCostoDefinicionGenerico(JComboBox jComboBoxTipoCostoDefinicion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoCostoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCostoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoCostoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoCostoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCostoDefinicion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoCostoDefinicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoCostoDefinicion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoCostoDefinicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoCostoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoCostoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Definicion")) {
			jButtonDefinicionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocostodefinicion=(TipoCostoDefinicion) tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocostodefinicion =(TipoCostoDefinicion) tipocostodefinicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoCostoDefinicion tipocostodefinicionRow=new TipoCostoDefinicion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocostodefinicionRow=(TipoCostoDefinicion) tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipocostodefinicionRow=(TipoCostoDefinicion) tipocostodefinicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDefinicionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoCostoDefinicion tipocostodefinicion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocostodefinicion = (TipoCostoDefinicion)this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipocostodefinicion = (TipoCostoDefinicion)this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipocostodefinicion!=null) {
						this.tipocostodefinicion = tipocostodefinicion;
					} else {
						this.tipocostodefinicion = new TipoCostoDefinicion();
					}
				}

				if(this.isTienePermisosDefinicion && this.permiteMantenimiento(this.tipocostodefinicion)) {
					DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFramePopup=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFramePopup;
					} else {
						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame;
					}

					List<TipoCostoDefinicion> tipocostodefinicions=new ArrayList<TipoCostoDefinicion>();
					tipocostodefinicions.add(this.tipocostodefinicion);
					if(!esRelacionado) {
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setConGuardarRelaciones(false);
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoCostoDefinicion.cargarDefinicionBeanSwingJInternalFrame(tipocostodefinicions,this.tipocostodefinicion,definicionBeanSwingJInternalFrame,/*conInicializar,*/definicionBeanSwingJInternalFrame.definicionSessionBean.getConGuardarRelaciones(),definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado());
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("no_relacionado");

						definicionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DefinicionConstantesFunciones.ITAMANIOFILATABLA + (DefinicionConstantesFunciones.ITAMANIOFILATABLA/2));

						definicionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoCostoDefinicion=(TitledBorder)this.jScrollPanelDatosTipoCostoDefinicion.getBorder();
						TitledBorder titledBorderDefinicion=(TitledBorder)definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getBorder();

						titledBorderDefinicion.setTitle(titledBorderTipoCostoDefinicion.getTitle() + " -> Definicion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,definicionBeanSwingJInternalFrame);
						}

						definicionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(definicionBeanSwingJInternalFrame);

						definicionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Definicion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoCostoDefinicion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoCostoDefinicion && this.isPermisoNuevoTipoCostoDefinicion));			
			this.jButtonDuplicarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaDuplicarTipoCostoDefinicion && this.isPermisoDuplicarTipoCostoDefinicion));			
			this.jButtonCopiarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaCopiarTipoCostoDefinicion && this.isPermisoCopiarTipoCostoDefinicion));
			this.jButtonVerFormTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaVerFormTipoCostoDefinicion && this.isPermisoVerFormTipoCostoDefinicion));
			
			this.jButtonAbrirOrderByTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoCostoDefinicion && this.isPermisoOrdenTipoCostoDefinicion));			
			
			this.jButtonNuevoRelacionesTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion && this.isPermisoNuevoTipoCostoDefinicion));			
			this.jButtonNuevoGuardarCambiosTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoCostoDefinicion && this.isPermisoNuevoTipoCostoDefinicion && this.isPermisoGuardarCambiosTipoCostoDefinicion));
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonModificarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaModificarTipoCostoDefinicion && this.isPermisoActualizarTipoCostoDefinicion));	
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonActualizarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaActualizarTipoCostoDefinicion && this.isPermisoActualizarTipoCostoDefinicion));	
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonEliminarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaEliminarTipoCostoDefinicion && this.isPermisoEliminarTipoCostoDefinicion));
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonCancelarTipoCostoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoCostoDefinicion);							
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonGuardarCambiosTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaGuardarTipoCostoDefinicion && this.isPermisoGuardarCambiosTipoCostoDefinicion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion && this.isPermisoGuardarCambiosTipoCostoDefinicion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoCostoDefinicion && this.isPermisoNuevoTipoCostoDefinicion));						
			this.jButtonDuplicarToolBarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaDuplicarTipoCostoDefinicion && this.isPermisoDuplicarTipoCostoDefinicion));						
			this.jButtonCopiarToolBarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaCopiarTipoCostoDefinicion && this.isPermisoCopiarTipoCostoDefinicion));			
			this.jButtonVerFormToolBarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaVerFormTipoCostoDefinicion && this.isPermisoVerFormTipoCostoDefinicion));			
			this.jButtonAbrirOrderByToolBarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoCostoDefinicion && this.isPermisoOrdenTipoCostoDefinicion));
			this.jButtonNuevoRelacionesToolBarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion && this.isPermisoNuevoTipoCostoDefinicion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoCostoDefinicion && this.isPermisoNuevoTipoCostoDefinicion && this.isPermisoGuardarCambiosTipoCostoDefinicion));			
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonModificarToolBarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaModificarTipoCostoDefinicion && this.isPermisoActualizarTipoCostoDefinicion));	
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonActualizarToolBarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaActualizarTipoCostoDefinicion  && this.isPermisoActualizarTipoCostoDefinicion));	
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonEliminarToolBarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaEliminarTipoCostoDefinicion && this.isPermisoEliminarTipoCostoDefinicion));
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonCancelarToolBarTipoCostoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoCostoDefinicion);				
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonGuardarCambiosToolBarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaGuardarTipoCostoDefinicion && this.isPermisoGuardarCambiosTipoCostoDefinicion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion && this.isPermisoGuardarCambiosTipoCostoDefinicion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoCostoDefinicion && this.isPermisoNuevoTipoCostoDefinicion));			
			this.jMenuItemDuplicarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaDuplicarTipoCostoDefinicion && this.isPermisoDuplicarTipoCostoDefinicion));			
			this.jMenuItemCopiarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaCopiarTipoCostoDefinicion && this.isPermisoCopiarTipoCostoDefinicion));			
			this.jMenuItemVerFormTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaVerFormTipoCostoDefinicion && this.isPermisoVerFormTipoCostoDefinicion));			
			this.jMenuItemAbrirOrderByTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoCostoDefinicion && this.isPermisoOrdenTipoCostoDefinicion));			
			//this.jMenuItemMostrarOcultarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoCostoDefinicion && this.isPermisoOrdenTipoCostoDefinicion));
			this.jMenuItemDetalleAbrirOrderByTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoCostoDefinicion && this.isPermisoOrdenTipoCostoDefinicion));			
			//this.jMenuItemDetalleMostrarOcultarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoCostoDefinicion && this.isPermisoOrdenTipoCostoDefinicion));			
			this.jMenuItemNuevoRelacionesTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion && this.isPermisoNuevoTipoCostoDefinicion));			
			this.jMenuItemNuevoGuardarCambiosTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoCostoDefinicion && this.isPermisoNuevoTipoCostoDefinicion && this.isPermisoGuardarCambiosTipoCostoDefinicion));									
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemModificarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaModificarTipoCostoDefinicion && this.isPermisoActualizarTipoCostoDefinicion));	
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemActualizarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaActualizarTipoCostoDefinicion && this.isPermisoActualizarTipoCostoDefinicion));	
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemEliminarTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaEliminarTipoCostoDefinicion && this.isPermisoEliminarTipoCostoDefinicion));
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemCancelarTipoCostoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoCostoDefinicion);				
			}
			
			this.jMenuItemGuardarCambiosTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaGuardarTipoCostoDefinicion && this.isPermisoGuardarCambiosTipoCostoDefinicion));						
			this.jMenuItemGuardarCambiosTablaTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion && this.isPermisoGuardarCambiosTipoCostoDefinicion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoCostoDefinicion=this.jButtonNuevoTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoCostoDefinicion=this.jButtonDuplicarTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaCopiarTipoCostoDefinicion=this.jButtonCopiarTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaVerFormTipoCostoDefinicion=this.jButtonVerFormTipoCostoDefinicion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoCostoDefinicion=this.jButtonAbrirOrderByTipoCostoDefinicion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=this.jButtonNuevoRelacionesTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaModificarTipoCostoDefinicion=this.jButtonModificarTipoCostoDefinicion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
			this.isVisibilidadCeldaActualizarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonActualizarTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaEliminarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonEliminarTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaCancelarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonCancelarTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaGuardarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonGuardarCambiosTipoCostoDefinicion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=this.jButtonGuardarCambiosTablaTipoCostoDefinicion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoCostoDefinicion=this.jButtonNuevoToolBarTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=this.jButtonNuevoRelacionesToolBarTipoCostoDefinicion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
			this.isVisibilidadCeldaModificarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonModificarToolBarTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaActualizarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonActualizarToolBarTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaEliminarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonEliminarToolBarTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaCancelarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonCancelarToolBarTipoCostoDefinicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCostoDefinicion=this.jButtonGuardarCambiosToolBarTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=this.jButtonGuardarCambiosTablaToolBarTipoCostoDefinicion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoCostoDefinicion=this.jMenuItemNuevoTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=this.jMenuItemNuevoRelacionesTipoCostoDefinicion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
			this.isVisibilidadCeldaModificarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemModificarTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaActualizarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemActualizarTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaEliminarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemEliminarTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaCancelarTipoCostoDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemCancelarTipoCostoDefinicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoCostoDefinicion=this.jMenuItemGuardarCambiosTipoCostoDefinicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=this.jMenuItemGuardarCambiosTablaTipoCostoDefinicion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoCostoDefinicion(Boolean esInicializar) {
		if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCostoDefinicion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoCostoDefinicion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoCostoDefinicion() {
		this.jButtonNuevoTipoCostoDefinicion.setVisible(this.isPermisoNuevoTipoCostoDefinicion);			
		this.jButtonDuplicarTipoCostoDefinicion.setVisible(this.isPermisoDuplicarTipoCostoDefinicion);			
		this.jButtonCopiarTipoCostoDefinicion.setVisible(this.isPermisoCopiarTipoCostoDefinicion);			
		this.jButtonVerFormTipoCostoDefinicion.setVisible(this.isPermisoVerFormTipoCostoDefinicion);			
		
		this.jButtonAbrirOrderByTipoCostoDefinicion.setVisible(this.isPermisoOrdenTipoCostoDefinicion);					
		
		this.jButtonNuevoRelacionesTipoCostoDefinicion.setVisible(this.isPermisoNuevoTipoCostoDefinicion);			
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonModificarTipoCostoDefinicion.setVisible(this.isPermisoActualizarTipoCostoDefinicion);	
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonActualizarTipoCostoDefinicion.setVisible(this.isPermisoActualizarTipoCostoDefinicion);	
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonEliminarTipoCostoDefinicion.setVisible(this.isPermisoEliminarTipoCostoDefinicion);
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonCancelarTipoCostoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoCostoDefinicion);						
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonGuardarCambiosTipoCostoDefinicion.setVisible(this.isPermisoGuardarCambiosTipoCostoDefinicion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoCostoDefinicion.setVisible(this.isPermisoActualizarTipoCostoDefinicion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCostoDefinicion() {
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonModificarTipoCostoDefinicion.setVisible(this.isPermisoActualizarTipoCostoDefinicion);	
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonActualizarTipoCostoDefinicion.setVisible(this.isPermisoActualizarTipoCostoDefinicion);	
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonEliminarTipoCostoDefinicion.setVisible(this.isPermisoEliminarTipoCostoDefinicion);
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonCancelarTipoCostoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoCostoDefinicion);							
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonGuardarCambiosTipoCostoDefinicion.setVisible((this.isVisibilidadCeldaGuardarTipoCostoDefinicion && this.isPermisoGuardarCambiosTipoCostoDefinicion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoCostoDefinicion() {
		if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoCostoDefinicion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoCostoDefinicion() {
	}
	
	public void jTableDatosTipoCostoDefinicionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoCostoDefinicion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoCostoDefinicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(this.gettipocostodefinicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocostodefinicion==null) {
						this.tipocostodefinicion = new TipoCostoDefinicion();
					}

					this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(this.tipocostodefinicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);
				}

				if(this.tipocostodefinicion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipocostodefinicion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCostoDefinicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoCostoDefinicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(this.gettipocostodefinicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocostodefinicion==null) {
						this.tipocostodefinicion = new TipoCostoDefinicion();
					}

					this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(this.tipocostodefinicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);
				}

				if(this.tipocostodefinicion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipocostodefinicion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCostoDefinicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoCostoDefinicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(this.gettipocostodefinicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipocostodefinicion==null) {
						this.tipocostodefinicion = new TipoCostoDefinicion();
					}

					this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(this.tipocostodefinicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);
				}

				if(this.tipocostodefinicion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipocostodefinicion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoCostoDefinicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoCostoDefinicion() {
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
		

		if(this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoCostoDefinicion.dispose();
			this.jInternalFrameDetalleFormTipoCostoDefinicion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoCostoDefinicion!=null) {
			this.jInternalFrameReporteDinamicoTipoCostoDefinicion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoCostoDefinicion.dispose();
			this.jInternalFrameReporteDinamicoTipoCostoDefinicion=null;
		}
		
		if(this.jInternalFrameImportacionTipoCostoDefinicion!=null) {
			this.jInternalFrameImportacionTipoCostoDefinicion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoCostoDefinicion.dispose();
			this.jInternalFrameImportacionTipoCostoDefinicion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoCostoDefinicion();
			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoCostoDefinicion")) {
				jButtonNuevoTipoCostoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoCostoDefinicion")) {
				jButtonDuplicarTipoCostoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoCostoDefinicion")) {
				jButtonCopiarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoCostoDefinicion")) {
				jButtonVerFormTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoCostoDefinicion")) {
				jButtonNuevoTipoCostoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoCostoDefinicion")) {
				jButtonDuplicarTipoCostoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoCostoDefinicion")) {
				jButtonNuevoTipoCostoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoCostoDefinicion")) {
				jButtonDuplicarTipoCostoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoCostoDefinicion")) {
				jButtonNuevoTipoCostoDefinicionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoCostoDefinicion")) {
				jButtonNuevoTipoCostoDefinicionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoCostoDefinicion")) {
				jButtonNuevoTipoCostoDefinicionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoCostoDefinicion")) {
				jButtonModificarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoCostoDefinicion")) {
				jButtonModificarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoCostoDefinicion")) {
				jButtonModificarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoCostoDefinicion")) {
				jButtonActualizarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoCostoDefinicion")) {
				jButtonActualizarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoCostoDefinicion")) {
				jButtonActualizarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoCostoDefinicion")) {
				jButtonEliminarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoCostoDefinicion")) {
				jButtonEliminarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoCostoDefinicion")) {
				jButtonEliminarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoCostoDefinicion")) {
				jButtonCancelarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoCostoDefinicion")) {
				jButtonCancelarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoCostoDefinicion")) {
				jButtonCancelarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoCostoDefinicion")) {
				jButtonCerrarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoCostoDefinicion")) {
				jButtonCerrarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoCostoDefinicion")) {
				jButtonCerrarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoCostoDefinicion")) {
				jButtonMostrarOcultarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoCostoDefinicion")) {
				jButtonCancelarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoCostoDefinicion")) {
				jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoCostoDefinicion")) {
				jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoCostoDefinicion")) {
				jButtonCopiarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoCostoDefinicion")) {
				jButtonVerFormTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoCostoDefinicion")) {
				jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoCostoDefinicion")) {
				jButtonCopiarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoCostoDefinicion")) {
				jButtonVerFormTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoCostoDefinicion")) {
				jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoCostoDefinicion")) {
				jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoCostoDefinicion")) {
				jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoCostoDefinicion")) {
				jButtonRecargarInformacionTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoCostoDefinicion")) {
				jButtonRecargarInformacionTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoCostoDefinicion")) {
				jButtonRecargarInformacionTipoCostoDefinicionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoCostoDefinicion")) {
				jButtonAnterioresTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoCostoDefinicion")) {
				jButtonAnterioresTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoCostoDefinicion")) {
				jButtonAnterioresTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoCostoDefinicion")) {
				jButtonSiguientesTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoCostoDefinicion")) {
				jButtonSiguientesTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoCostoDefinicion")) {
				jButtonSiguientesTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoCostoDefinicion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoCostoDefinicion")) {
				jButtonAbrirOrderByTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoCostoDefinicion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoCostoDefinicion")) {
				jButtonMostrarOcultarTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCostoDefinicion")) {
				jButtonNuevoGuardarCambiosTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoCostoDefinicion")) {
				jButtonNuevoGuardarCambiosTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoCostoDefinicion")) {
				jButtonNuevoGuardarCambiosTipoCostoDefinicionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoCostoDefinicion")) {
				jButtonCerrarReporteDinamicoTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoCostoDefinicion")) {
				jButtonGenerarReporteDinamicoTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoCostoDefinicion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoCostoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoCostoDefinicion")) {
				jButtonCerrarImportacionTipoCostoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoCostoDefinicion")) {
				
				jButtonGenerarImportacionTipoCostoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoCostoDefinicion")) {
				
				jButtonAbrirImportacionTipoCostoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoCostoDefinicion")) {
				jComboBoxTiposAccionesTipoCostoDefinicionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoCostoDefinicion")) {
				jComboBoxTiposRelacionesTipoCostoDefinicionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoCostoDefinicion")) {
				jComboBoxTiposAccionesTipoCostoDefinicionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoCostoDefinicion")) {
				
				jComboBoxTiposSeleccionarTipoCostoDefinicionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoCostoDefinicion")) {
				jTextFieldValorCampoGeneralTipoCostoDefinicionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoCostoDefinicion")) {
				jButtonAbrirOrderByTipoCostoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoCostoDefinicion")) {
				jButtonAbrirOrderByTipoCostoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoCostoDefinicion")) {
				jButtonCerrarOrderByTipoCostoDefinicionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCostoDefinicionBusqueda")) {
				this.jButtonidTipoCostoDefinicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCostoDefinicionBusqueda")) {
				this.jButtoncodigoTipoCostoDefinicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCostoDefinicionBusqueda")) {
				this.jButtonnombreTipoCostoDefinicionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoCostoDefinicion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoDefinicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				


				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoCostoDefinicion tipocostodefinicionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipocostodefinicionLocal=this.tipocostodefinicion;
			} else {
				tipocostodefinicionLocal=this.tipocostodefinicionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
							
				
				


				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
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
			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			
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
			
			


			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoDefinicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
								
						
				


				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoDefinicion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
								
				
				


				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoDefinicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
							
				
				


				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoDefinicion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoDefinicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
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
			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			
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
			
			


			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoDefinicionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
								
				
				


				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoDefinicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoDefinicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoCostoDefinicion")) {
					jCheckBoxSeleccionarTodosTipoCostoDefinicionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoCostoDefinicion")) {
					jCheckBoxSeleccionadosTipoCostoDefinicionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoCostoDefinicion")) {
					
				}
				
				


				
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
												
				
				


				
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoDefinicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoDefinicionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
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
			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
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
			
			


			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoCostoDefinicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoDefinicion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoDefinicion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipocostodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipocostodefinicion);
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
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
				
				


				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoCostoDefinicion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoCostoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoCostoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipocostodefinicionAnterior =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoCostoDefinicion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoCostoDefinicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoCostoDefinicion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipocostodefinicion =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipocostodefinicion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoCostoDefinicion")) {
				
				}
				
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoCostoDefinicion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoCostoDefinicion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoCostoDefinicion")) {
			
			}
			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoCostoDefinicion();
			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoCostoDefinicion")) {
				jButtonNuevoTipoCostoDefinicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoCostoDefinicion")) {
				jButtonDuplicarTipoCostoDefinicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoCostoDefinicion")) {
				jButtonCopiarTipoCostoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoCostoDefinicion")) {
				jButtonVerFormTipoCostoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoCostoDefinicion")) {
				jButtonNuevoTipoCostoDefinicionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoCostoDefinicion")) {
				jButtonModificarTipoCostoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoCostoDefinicion")) {
				jButtonActualizarTipoCostoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoCostoDefinicion")) {
				jButtonEliminarTipoCostoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoCostoDefinicion")) {
				jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoCostoDefinicion")) {
				jButtonCancelarTipoCostoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoCostoDefinicion")) {
				jButtonCerrarTipoCostoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoCostoDefinicion")) {
				jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoCostoDefinicion")) {
				jButtonNuevoGuardarCambiosTipoCostoDefinicionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoCostoDefinicion")) {
				jButtonAbrirOrderByTipoCostoDefinicionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoCostoDefinicion")) {
				jButtonRecargarInformacionTipoCostoDefinicionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoCostoDefinicion")) {
				jButtonAnterioresTipoCostoDefinicionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoCostoDefinicion")) {
				jButtonSiguientesTipoCostoDefinicionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoCostoDefinicionBusqueda")) {
				this.jButtonidTipoCostoDefinicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoCostoDefinicionBusqueda")) {
				this.jButtoncodigoTipoCostoDefinicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoCostoDefinicionBusqueda")) {
				this.jButtonnombreTipoCostoDefinicionBusquedaActionPerformed(evt);
			}
			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoCostoDefinicion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoCostoDefinicion")) {
				closingInternalFrameTipoCostoDefinicion();
				
			} else if(sTipo.equals("jButtonCancelarTipoCostoDefinicion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoCostoDefinicion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoCostoDefinicionBeanSwingJInternalFrame jInternalFrameParent=(TipoCostoDefinicionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCostoDefinicion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoCostoDefinicionActionPerformed(null);
			}
			
			TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipocostodefinicion,new Object(),this.tipocostodefinicionParameterGeneral,this.tipocostodefinicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoCostoDefinicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoCostoDefinicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoCostoDefinicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipocostodefinicion)) {
			if(!esControlTabla) {
				if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(this.tipocostodefinicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);			
				}
				
				if(this.tipocostodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoCostoDefinicion(this.tipocostodefinicion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocostodefinicionReturnGeneral=tipocostodefinicionLogic.procesarEventosTipoCostoDefinicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocostodefinicionLogic.getTipoCostoDefinicions(),this.tipocostodefinicion,this.tipocostodefinicionParameterGeneral,this.isEsNuevoTipoCostoDefinicion,classes);//this.tipocostodefinicionLogic.getTipoCostoDefinicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoCostoDefinicion(this.tipocostodefinicionReturnGeneral,this.tipocostodefinicionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipocostodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoCostoDefinicion(classes,this.tipocostodefinicionReturnGeneral,this.tipocostodefinicionBean,false);
					}
						
					if(this.tipocostodefinicionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoCostoDefinicion(this.tipocostodefinicionReturnGeneral.getTipoCostoDefinicion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoCostoDefinicion(this.tipocostodefinicionReturnGeneral.getTipoCostoDefinicion());	
					}
						
					if(this.tipocostodefinicionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoCostoDefinicion(this.tipocostodefinicionReturnGeneral.getTipoCostoDefinicion(),classes);//this.tipocostodefinicionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoCostoDefinicion(this.tipocostodefinicion,classes);//this.tipocostodefinicionBean);									
				}
			
				if(TipoCostoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoCostoDefinicion(this.tipocostodefinicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoCostoDefinicion(this.tipocostodefinicion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipocostodefinicionAnterior!=null) {
						this.tipocostodefinicion=this.tipocostodefinicionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipocostodefinicionReturnGeneral=tipocostodefinicionLogic.procesarEventosTipoCostoDefinicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocostodefinicionLogic.getTipoCostoDefinicions(),this.tipocostodefinicion,this.tipocostodefinicionParameterGeneral,this.isEsNuevoTipoCostoDefinicion,classes);//this.tipocostodefinicionLogic.getTipoCostoDefinicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipocostodefinicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipocostodefinicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipocostodefinicionReturnGeneral.getTipoCostoDefinicion(),tipocostodefinicionLogic.getTipoCostoDefinicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipocostodefinicionReturnGeneral.getTipoCostoDefinicion(),this.tipocostodefinicions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoCostoDefinicion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoCostoDefinicion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoCostoDefinicion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoCostoDefinicion() throws Exception {
		
		TipoCostoDefinicionModel tipocostodefinicionModel=(TipoCostoDefinicionModel)this.jTableDatosTipoCostoDefinicion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipocostodefinicionModel.tipocostodefinicions=this.tipocostodefinicionLogic.getTipoCostoDefinicions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipocostodefinicionModel.tipocostodefinicions=this.tipocostodefinicions;
		}
		
		
		((TipoCostoDefinicionModel) this.jTableDatosTipoCostoDefinicion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoCostoDefinicion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipocostodefinicionAnterior(),this.tipocostodefinicionLogic.getTipoCostoDefinicions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipocostodefinicionAnterior(),this.tipocostodefinicions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoCostoDefinicion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(tipocostodefinicion.getDefinicions());
					this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
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
										
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocostodefinicion,new Object(),generalEntityParameterGeneral,this.tipocostodefinicionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoCostoDefinicionConstantesFunciones.getClassesRelationshipsOfTipoCostoDefinicion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoCostoDefinicionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoCostoDefinicion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoCostoDefinicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoCostoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipocostodefinicion,new Object(),generalEntityParameterGeneral,this.tipocostodefinicionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoCostoDefinicion(TipoCostoDefinicionBean tipocostodefinicionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(tipocostodefinicion.getDefinicions());
					this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoCostoDefinicion(ArrayList<Classe> classes,TipoCostoDefinicionReturnGeneral tipocostodefinicionReturnGeneral,TipoCostoDefinicionBean tipocostodefinicionBean,Boolean conDefault) throws Exception {
		
			this.tipocostodefinicionBean.setDefinicions(tipocostodefinicionReturnGeneral.getTipoCostoDefinicion().getDefinicions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					tipocostodefinicion.setDefinicions(this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipocostodefinicion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion = new TipoCostoDefinicionDetalleFormJInternalFrame(jDesktopPane,this.tipocostodefinicionSessionBean.getConGuardarRelaciones(),this.tipocostodefinicionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoCostoDefinicion);
		this.jInternalFrameDetalleFormTipoCostoDefinicion.setVisible(false);
		this.jInternalFrameDetalleFormTipoCostoDefinicion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.tipocostodefinicionLogic=this.tipocostodefinicionLogic;
		
		this.cargarCombosFrameForeignKeyTipoCostoDefinicion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoCostoDefinicion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoCostoDefinicion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoCostoDefinicion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoCostoDefinicion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCostoDefinicion"));
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonModificarTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"ModificarTipoCostoDefinicion"));

		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonModificarToolBarTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCostoDefinicion"));
					
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemModificarTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCostoDefinicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonActualizarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"ActualizarTipoCostoDefinicion"));
		
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonActualizarToolBarTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCostoDefinicion"));
						
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemActualizarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCostoDefinicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonEliminarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"EliminarTipoCostoDefinicion"));
		
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonEliminarToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCostoDefinicion"));
								
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemEliminarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCostoDefinicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonCancelarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"CancelarTipoCostoDefinicion"));
		
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonCancelarToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCostoDefinicion"));
					
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemCancelarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCostoDefinicion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemDetalleCerrarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCostoDefinicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonGuardarCambiosToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCostoDefinicion"));
		
		
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonGuardarCambiosToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCostoDefinicion"));
		
		
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCostoDefinicion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonidTipoCostoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCostoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtoncodigoTipoCostoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCostoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonnombreTipoCostoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCostoDefinicionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jTabbedPaneRelacionesTipoCostoDefinicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCostoDefinicion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoCostoDefinicion"));
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoCostoDefinicion"));
		}
		
		this.jTableDatosTipoCostoDefinicion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoCostoDefinicion"));
		
		this.jTableDatosTipoCostoDefinicion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoCostoDefinicion"));
		
		this.jButtonNuevoTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"NuevoTipoCostoDefinicion"));
		
		this.jButtonDuplicarTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"DuplicarTipoCostoDefinicion"));
		
		this.jButtonCopiarTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"CopiarTipoCostoDefinicion"));
		
		this.jButtonVerFormTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"VerFormTipoCostoDefinicion"));
		
		
		this.jButtonNuevoToolBarTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoCostoDefinicion"));
			
		this.jButtonDuplicarToolBarTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoCostoDefinicion"));
			
		this.jMenuItemNuevoTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoCostoDefinicion"));
			
		this.jMenuItemDuplicarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoCostoDefinicion"));		
		
		
		this.jButtonNuevoRelacionesTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoCostoDefinicion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoCostoDefinicion"));
			
		this.jMenuItemNuevoRelacionesTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoCostoDefinicion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonModificarTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"ModificarTipoCostoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonModificarToolBarTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoCostoDefinicion"));
			
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemModificarTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoCostoDefinicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonActualizarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"ActualizarTipoCostoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonActualizarToolBarTipoCostoDefinicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoCostoDefinicion"));
				
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemActualizarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoCostoDefinicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonEliminarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"EliminarTipoCostoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonEliminarToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoCostoDefinicion"));
						
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemEliminarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoCostoDefinicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonCancelarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"CancelarTipoCostoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonCancelarToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoCostoDefinicion"));
			
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemCancelarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoCostoDefinicion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoCostoDefinicion"));		
		
		
		this.jButtonCerrarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"CerrarTipoCostoDefinicion"));
		
		
		this.jButtonCerrarToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoCostoDefinicion"));
			
		this.jMenuItemCerrarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoCostoDefinicion"));
			
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jMenuItemDetalleCerrarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoCostoDefinicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonGuardarCambiosTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoCostoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonGuardarCambiosToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoCostoDefinicion"));
		}
		
		this.jButtonCopiarToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoCostoDefinicion"));
			
		this.jButtonVerFormToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoCostoDefinicion"));
		
		this.jMenuItemGuardarCambiosTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoCostoDefinicion"));
			
		this.jMenuItemCopiarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoCostoDefinicion"));		
		
		this.jMenuItemVerFormTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoCostoDefinicion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCostoDefinicion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoCostoDefinicion"));
			
		this.jMenuItemGuardarCambiosTablaTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoCostoDefinicion"));		
		
		
		
		this.jButtonRecargarInformacionTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoCostoDefinicion"));
					
		this.jButtonRecargarInformacionToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoCostoDefinicion"));
		
		this.jMenuItemRecargarInformacionTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoCostoDefinicion"));		
		
		
		
		this.jButtonAnterioresTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"AnterioresTipoCostoDefinicion"));
		
		
		this.jButtonAnterioresToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoCostoDefinicion"));
		
		this.jMenuItemAnterioresTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoCostoDefinicion"));		
		
		
		this.jButtonSiguientesTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"SiguientesTipoCostoDefinicion"));
		
		
		this.jButtonSiguientesToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoCostoDefinicion"));
			
		this.jMenuItemSiguientesTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoCostoDefinicion"));
			
		this.jMenuItemAbrirOrderByTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoCostoDefinicion"));
			
		this.jMenuItemMostrarOcultarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoCostoDefinicion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoCostoDefinicion"));
			
		this.jMenuItemDetalleMostarOcultarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoCostoDefinicion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoCostoDefinicion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoCostoDefinicion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoCostoDefinicion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoCostoDefinicion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoCostoDefinicion"));

		this.jCheckBoxSeleccionadosTipoCostoDefinicion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoCostoDefinicion"));
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoCostoDefinicion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoCostoDefinicion"));
			
		this.jComboBoxTiposAccionesTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoCostoDefinicion"));
					
		this.jComboBoxTiposSeleccionarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoCostoDefinicion"));
			
		this.jTextFieldValorCampoGeneralTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoCostoDefinicion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonidTipoCostoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCostoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtoncodigoTipoCostoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCostoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonnombreTipoCostoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCostoDefinicionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoCostoDefinicion!=null) {
				this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCostoDefinicion"));
				this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCostoDefinicion"));
				this.jInternalFrameReporteDinamicoTipoCostoDefinicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCostoDefinicion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoCostoDefinicion"));				
			//this.jButtonGenerarReporteDinamicoTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoCostoDefinicion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoCostoDefinicion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoCostoDefinicion!=null) {
				this.jInternalFrameImportacionTipoCostoDefinicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoCostoDefinicion"));
				this.jInternalFrameImportacionTipoCostoDefinicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoCostoDefinicion"));
				this.jInternalFrameImportacionTipoCostoDefinicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoCostoDefinicion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoCostoDefinicion"));
			
			this.jButtonAbrirOrderByToolBarTipoCostoDefinicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoCostoDefinicion"));			
			
			if(this.jInternalFrameOrderByTipoCostoDefinicion!=null) {
				this.jInternalFrameOrderByTipoCostoDefinicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoCostoDefinicion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoCostoDefinicion.jTabbedPaneRelacionesTipoCostoDefinicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoCostoDefinicion"));
		
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
            		closingInternalFrameTipoCostoDefinicion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoCostoDefinicion = (JInternalFrameBase)event.getSource();
	            	
	            TipoCostoDefinicionBeanSwingJInternalFrame jInternalFrameParent=(TipoCostoDefinicionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoCostoDefinicion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoCostoDefinicionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoCostoDefinicion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoCostoDefinicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoCostoDefinicion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoCostoDefinicion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoDefinicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoDefinicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoDefinicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoCostoDefinicion";
		inputMap = this.jButtonNuevoTipoCostoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoCostoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCostoDefinicionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoDefinicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoDefinicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoCostoDefinicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoCostoDefinicion";
		inputMap = this.jButtonNuevoRelacionesTipoCostoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoCostoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoCostoDefinicionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoCostoDefinicion";
		inputMap = this.jButtonModificarTipoCostoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoCostoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoCostoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoCostoDefinicion";
		inputMap = this.jButtonActualizarTipoCostoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoCostoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoCostoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoCostoDefinicion";
		inputMap = this.jButtonEliminarTipoCostoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoCostoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoCostoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoCostoDefinicion";
		inputMap = this.jButtonCancelarTipoCostoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoCostoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoCostoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoCostoDefinicion";
		inputMap = this.jButtonCerrarTipoCostoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoCostoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoCostoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonGuardarCambiosTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoCostoDefinicion";
		inputMap = this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonGuardarCambiosTipoCostoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonGuardarCambiosTipoCostoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoCostoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoCostoDefinicion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoCostoDefinicionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoCostoDefinicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoCostoDefinicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoCostoDefinicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoCostoDefinicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoCostoDefinicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoCostoDefinicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonidTipoCostoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoCostoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtoncodigoTipoCostoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoCostoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jButtonnombreTipoCostoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoCostoDefinicionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoCostoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoCostoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoCostoDefinicionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoCostoDefinicion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoCostoDefinicion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicionLogic.getTipoCostoDefinicions()) {
					tipocostodefinicionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCostoDefinicion tipocostodefinicionAux:tipocostodefinicions) {
					tipocostodefinicionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoCostoDefinicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCostoDefinicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicionLogic.getTipoCostoDefinicions()) {
						tipocostodefinicionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCostoDefinicion tipocostodefinicionAux:tipocostodefinicions) {
						tipocostodefinicionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicionLogic.getTipoCostoDefinicions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCostoDefinicion tipocostodefinicionAux:tipocostodefinicions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCostoDefinicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCostoDefinicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoDefinicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoCostoDefinicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoCostoDefinicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoCostoDefinicion.getSelectedRows();
			
			TipoCostoDefinicion tipocostodefinicionLocal=new TipoCostoDefinicion();
			
			//this.seleccionarTodosTipoCostoDefinicion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipocostodefinicionLocal =(TipoCostoDefinicion) this.tipocostodefinicionLogic.getTipoCostoDefinicions().toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipocostodefinicionLocal =(TipoCostoDefinicion) this.tipocostodefinicions.toArray()[this.jTableDatosTipoCostoDefinicion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipocostodefinicionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicionLogic.getTipoCostoDefinicions()) {
						tipocostodefinicionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoCostoDefinicion tipocostodefinicionAux:tipocostodefinicions) {
						tipocostodefinicionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoCostoDefinicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoCostoDefinicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoCostoDefinicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoCostoDefinicionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoCostoDefinicionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoCostoDefinicionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoCostoDefinicion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoCostoDefinicion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicionLogic.getTipoCostoDefinicions()) {
				
						if(sTipoSeleccionar.equals(TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocostodefinicionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocostodefinicionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCostoDefinicion tipocostodefinicionAux:tipocostodefinicions) {
					
						if(sTipoSeleccionar.equals(TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipocostodefinicionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipocostodefinicionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoCostoDefinicionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoCostoDefinicion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoCostoDefinicion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoCostoDefinicion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoCostoDefinicion.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoCostoDefinicion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoCostoDefinicion(conSplash);
				
					this.generarReporteTipoCostoDefinicionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCostoDefinicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCostoDefinicion.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoCostoDefinicionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoCostoDefinicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCostoDefinicionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoCostoDefinicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoCostoDefinicionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoCostoDefinicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCostoDefinicion();
				
				this.exportarTipoCostoDefinicionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCostoDefinicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCostoDefinicion.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoCostoDefinicions();
				//this.importarTipoCostoDefinicions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCostoDefinicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCostoDefinicion.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoCostoDefinicion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoCostoDefinicionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoCostoDefinicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Costo Definicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoCostoDefinicion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoCostoDefinicion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoCostoDefinicion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Costo Definicion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoCostoDefinicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoCostoDefinicion.jComboBoxTiposAccionesFormularioTipoCostoDefinicion.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoCostoDefinicion();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoCostoDefinicion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoCostoDefinicionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoCostoDefinicion();
			
			if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();		
			TipoCostoDefinicion tipocostodefinicion=new TipoCostoDefinicion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoCostoDefinicion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoCostoDefinicion.getSelectedItem();
			
			
			
			
			tipocostodefinicionsSeleccionados=this.getTipoCostoDefinicionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipocostodefinicionsSeleccionados.size()==1) {
				for(TipoCostoDefinicion tipocostodefinicionAux:tipocostodefinicionsSeleccionados) {
					tipocostodefinicion=tipocostodefinicionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Definicion")) {
					jButtonDefinicionActionPerformed(null,rowIndex,true,false,tipocostodefinicion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoCostoDefinicion();
			
      		//this.finishProcessTipoCostoDefinicion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoCostoDefinicionReturnGeneral() throws Exception {
		if(this.tipocostodefinicionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipocostodefinicionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipocostodefinicionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipocostodefinicionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipocostodefinicionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipocostodefinicionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoCostoDefinicion(false);
		}
		
		if(this.tipocostodefinicionReturnGeneral.getConRetornoLista() || this.tipocostodefinicionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipocostodefinicionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocostodefinicionLogic.setTipoCostoDefinicions(this.tipocostodefinicionReturnGeneral.getTipoCostoDefinicions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipocostodefinicionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipocostodefinicionLogic.setTipoCostoDefinicion(this.tipocostodefinicionReturnGeneral.getTipoCostoDefinicion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoCostoDefinicion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoCostoDefinicion() throws Exception {
		
		
	}
	
	public ArrayList<TipoCostoDefinicion> getTipoCostoDefinicionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoCostoDefinicion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoCostoDefinicion tipocostodefinicionAux:tipocostodefinicionLogic.getTipoCostoDefinicions()) {
					if(tipocostodefinicionAux.getIsSelected()) {
						tipocostodefinicionsSeleccionados.add(tipocostodefinicionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoCostoDefinicion tipocostodefinicionAux:this.tipocostodefinicions) {
					if(tipocostodefinicionAux.getIsSelected()) {
						tipocostodefinicionsSeleccionados.add(tipocostodefinicionAux);				
					}
				}
			}
			
			if(tipocostodefinicionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipocostodefinicionsSeleccionados.addAll(this.tipocostodefinicionLogic.getTipoCostoDefinicions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipocostodefinicionsSeleccionados.addAll(this.tipocostodefinicions);				
					}
				}
			}
		} else {
			tipocostodefinicionsSeleccionados.add(this.tipocostodefinicion);
		}
		
		return tipocostodefinicionsSeleccionados;
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
	
	public void generarReporteTipoCostoDefinicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoCostoDefinicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoCostoDefinicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCostoDefinicionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoCostoDefinicionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoCostoDefinicionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Costo Definicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoCostoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();		
		
		tipocostodefinicionsSeleccionados=this.getTipoCostoDefinicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoCostoDefinicions("Todos",tipocostodefinicionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoCostoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();		
		
		tipocostodefinicionsSeleccionados=this.getTipoCostoDefinicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoCostoDefinicions("Todos",tipocostodefinicionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoCostoDefinicionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();
		
		tipocostodefinicionsSeleccionados=this.getTipoCostoDefinicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoCostoDefinicions("Todos",tipocostodefinicionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoCostoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoCostoDefinicion();
		
		
		tipocostodefinicionsSeleccionados=this.getTipoCostoDefinicionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoCostoDefinicion();
		
		
		//this.generarReporteTipoCostoDefinicions("Todos",tipocostodefinicionsSeleccionados ,tipocostodefinicionImplementable,tipocostodefinicionImplementableHome);
	}
	
	public void mostrarImportacionTipoCostoDefinicions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoCostoDefinicion();
		
		this.abrirFrameImportacionTipoCostoDefinicion();		
		
			
		//this.generarReporteTipoCostoDefinicions("Todos",tipocostodefinicionsSeleccionados ,tipocostodefinicionImplementable,tipocostodefinicionImplementableHome);
	}
	
	public void importarTipoCostoDefinicions() throws Exception {		
	
	}
	
	public void exportarTipoCostoDefinicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoCostoDefinicionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoCostoDefinicionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoCostoDefinicionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Costo Definicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoCostoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();		
		
		tipocostodefinicionsSeleccionados=this.getTipoCostoDefinicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostodefinicion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoCostoDefinicion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoCostoDefinicion tipocostodefinicionAux:tipocostodefinicionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoCostoDefinicion(tipocostodefinicionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipocostodefinicionAux.setsDetalleGeneralEntityReporte(tipocostodefinicionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Definicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoCostoDefinicion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoCostoDefinicionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCostoDefinicionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipocostodefinicion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocostodefinicion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocostodefinicion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipocostodefinicion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoCostoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();		
		
		tipocostodefinicionsSeleccionados=this.getTipoCostoDefinicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostodefinicion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoCostoDefinicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoCostoDefinicion(row);				
				iRow++;
			}				
			
			for(TipoCostoDefinicion tipocostodefinicionAux:tipocostodefinicionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoCostoDefinicion(tipocostodefinicionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Definicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoCostoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();		
		
		tipocostodefinicionsSeleccionados=this.getTipoCostoDefinicionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipocostodefinicion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipocostodefinicions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipocostodefinicion");
			//elementRoot.appendChild(element);
		
			for(TipoCostoDefinicion tipocostodefinicionAux:tipocostodefinicionsSeleccionados) {
				element = document.createElement("tipocostodefinicion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoCostoDefinicion(tipocostodefinicionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Costo Definicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoCostoDefinicion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCostoDefinicionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCostoDefinicionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipocostodefinicion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocostodefinicion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipocostodefinicion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoCostoDefinicion(TipoCostoDefinicion tipocostodefinicion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoCostoDefinicionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipocostodefinicion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoCostoDefinicionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipocostodefinicion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoCostoDefinicionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipocostodefinicion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoCostoDefinicionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipocostodefinicion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoCostoDefinicionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados=new ArrayList<TipoCostoDefinicion>();
		
		tipocostodefinicionsSeleccionados=this.getTipoCostoDefinicionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoCostoDefinicion(tipocostodefinicionsSeleccionados);
		
		this.generarReporteTipoCostoDefinicions("Todos",tipocostodefinicionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoCostoDefinicion(ArrayList<TipoCostoDefinicion> tipocostodefinicionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoCostoDefinicion tipocostodefinicionAux:tipocostodefinicionsSeleccionados) {
				tipocostodefinicionAux.setsDetalleGeneralEntityReporte(tipocostodefinicionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoCostoDefinicionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipocostodefinicionAux.setsDescripcionGeneralEntityReporte1(tipocostodefinicionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoCostoDefinicionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipocostodefinicionAux.setsDescripcionGeneralEntityReporte1(tipocostodefinicionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoCostoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoCostoDefinicion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoCostoDefinicion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCostoDefinicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoCostoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCostoDefinicion=true;
			this.isVisibilidadCeldaEliminarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCostoDefinicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoCostoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCostoDefinicion=true;
			this.isVisibilidadCeldaEliminarTipoCostoDefinicion=true;
			this.isVisibilidadCeldaCancelarTipoCostoDefinicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoCostoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCostoDefinicion=true;
			this.isVisibilidadCeldaEliminarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCostoDefinicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoCostoDefinicion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=true;
			this.isVisibilidadCeldaModificarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCostoDefinicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoCostoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCostoDefinicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoCostoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoCostoDefinicion=true;
			this.isVisibilidadCeldaActualizarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoCostoDefinicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoCostoDefinicion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoCostoDefinicionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoCostoDefinicion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=true;
		} else {
			this.actualizarEstadoPanelsTipoCostoDefinicion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoCostoDefinicion=false;
			//this.isVisibilidadCeldaVerFormTipoCostoDefinicion=false;
			this.isVisibilidadCeldaDuplicarTipoCostoDefinicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipocostodefinicionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoCostoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
			if(!tipocostodefinicionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=false;												
			}
			
			this.jButtonCerrarTipoCostoDefinicion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoCostoDefinicion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipocostodefinicion)) {
			this.isVisibilidadCeldaActualizarTipoCostoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoCostoDefinicion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoCostoDefinicion() {
		this.isVisibilidadCeldaNuevoTipoCostoDefinicion=false;
		this.isVisibilidadCeldaGuardarCambiosTipoCostoDefinicion=false;
	}
	
	public void actualizarEstadoPanelsTipoCostoDefinicion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCostoDefinicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosTipoCostoDefinicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCostoDefinicion!=null) {
				this.jPanelPaginacionTipoCostoDefinicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCostoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCostoDefinicion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCostoDefinicion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosTipoCostoDefinicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCostoDefinicion!=null) {
				this.jPanelPaginacionTipoCostoDefinicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCostoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCostoDefinicion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCostoDefinicion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosTipoCostoDefinicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCostoDefinicion!=null) {
				this.jPanelPaginacionTipoCostoDefinicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCostoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCostoDefinicion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCostoDefinicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosTipoCostoDefinicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoCostoDefinicion!=null) {
				this.jPanelPaginacionTipoCostoDefinicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoCostoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCostoDefinicion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCostoDefinicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosTipoCostoDefinicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCostoDefinicion!=null) {
				this.jPanelPaginacionTipoCostoDefinicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCostoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCostoDefinicion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCostoDefinicion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosTipoCostoDefinicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCostoDefinicion!=null) {
				this.jPanelPaginacionTipoCostoDefinicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCostoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCostoDefinicion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoCostoDefinicion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoCostoDefinicion!=null) {
				this.jScrollPanelDatosTipoCostoDefinicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoCostoDefinicion!=null) {
				this.jPanelPaginacionTipoCostoDefinicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoCostoDefinicion!=null) {
				this.jPanelParametrosReportesTipoCostoDefinicion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipocostodefinicionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoCostoDefinicionParaDefiniciones() throws Exception {
		Boolean isPaginaPopupDefinicion=false;

		try {

			if(this.tipocostodefinicionSessionBean==null) {
				this.tipocostodefinicionSessionBean=new TipoCostoDefinicionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionSessionBean==null) {
				this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionSessionBean=new DefinicionSessionBean();
			}

			this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionSessionBean.setsPathNavegacionActual(tipocostodefinicionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DefinicionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDefinicion=this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDefinicion(true);
			this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion(TipoCostoDefinicionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionSessionBean.setisBusquedaDesdeForeignKeySesionTipoCostoDefinicion(true);
			this.jInternalFrameDetalleFormTipoCostoDefinicion.definicionSessionBean.setlidTipoCostoDefinicionActual(this.idTipoCostoDefinicionActual);

			tipocostodefinicionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoCostoDefinicion(true);
			tipocostodefinicionSessionBean.setlIdTipoCostoDefinicionActualForeignKey(this.idTipoCostoDefinicionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoCostoDefinicionSessionBean tipocostodefinicionSessionBean=new TipoCostoDefinicionSessionBean();
		
		if(this.tipocostodefinicionSessionBean==null) {
			this.tipocostodefinicionSessionBean=new TipoCostoDefinicionSessionBean();
		}
		
		this.tipocostodefinicionSessionBean.setsUltimaBusquedaTipoCostoDefinicion(this.getsAccionBusqueda());
		this.tipocostodefinicionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipocostodefinicionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoCostoDefinicionSessionBean tipocostodefinicionSessionBean=new TipoCostoDefinicionSessionBean();
		
		if(this.tipocostodefinicionSessionBean==null) {
			this.tipocostodefinicionSessionBean=new TipoCostoDefinicionSessionBean();
		}
		
		if(this.tipocostodefinicionSessionBean.getsUltimaBusquedaTipoCostoDefinicion()!=null&&!this.tipocostodefinicionSessionBean.getsUltimaBusquedaTipoCostoDefinicion().equals("")) {
			this.setsAccionBusqueda(tipocostodefinicionSessionBean.getsUltimaBusquedaTipoCostoDefinicion());
			this.setiNumeroPaginacion(tipocostodefinicionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipocostodefinicionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipocostodefinicionSessionBean.setsUltimaBusquedaTipoCostoDefinicion("");
		this.tipocostodefinicionSessionBean.setiNumeroPaginacion(TipoCostoDefinicionConstantesFunciones.INUMEROPAGINACION);
		this.tipocostodefinicionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoCostoDefinicion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoCostoDefinicion() {
		this.updateBorderResaltarBusquedasFormularioTipoCostoDefinicion();
		this.updateVisibilidadBusquedasFormularioTipoCostoDefinicion();
		this.updateHabilitarBusquedasFormularioTipoCostoDefinicion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoCostoDefinicion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoCostoDefinicion() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoCostoDefinicion() {
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
	
	public void updateControlesFormularioTipoCostoDefinicion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoCostoDefinicion();
		this.updateVisibilidadResaltarControlesFormularioTipoCostoDefinicion();
		this.updateHabilitarResaltarControlesFormularioTipoCostoDefinicion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoCostoDefinicion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipocostodefinicionConstantesFunciones.resaltaridTipoCostoDefinicion!=null && this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldidTipoCostoDefinicion.setBorder(this.tipocostodefinicionConstantesFunciones.resaltaridTipoCostoDefinicion);}
		if(this.tipocostodefinicionConstantesFunciones.resaltarcodigoTipoCostoDefinicion!=null && this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldcodigoTipoCostoDefinicion.setBorder(this.tipocostodefinicionConstantesFunciones.resaltarcodigoTipoCostoDefinicion);}
		if(this.tipocostodefinicionConstantesFunciones.resaltarnombreTipoCostoDefinicion!=null && this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldnombreTipoCostoDefinicion.setBorder(this.tipocostodefinicionConstantesFunciones.resaltarnombreTipoCostoDefinicion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoCostoDefinicion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
	
		//this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldidTipoCostoDefinicion.setVisible(this.tipocostodefinicionConstantesFunciones.mostraridTipoCostoDefinicion);
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jPanelidTipoCostoDefinicion.setVisible(this.tipocostodefinicionConstantesFunciones.mostraridTipoCostoDefinicion);
		//this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldcodigoTipoCostoDefinicion.setVisible(this.tipocostodefinicionConstantesFunciones.mostrarcodigoTipoCostoDefinicion);
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jPanelcodigoTipoCostoDefinicion.setVisible(this.tipocostodefinicionConstantesFunciones.mostrarcodigoTipoCostoDefinicion);
		//this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldnombreTipoCostoDefinicion.setVisible(this.tipocostodefinicionConstantesFunciones.mostrarnombreTipoCostoDefinicion);
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jPanelnombreTipoCostoDefinicion.setVisible(this.tipocostodefinicionConstantesFunciones.mostrarnombreTipoCostoDefinicion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoCostoDefinicion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoCostoDefinicion!=null) {
	
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldidTipoCostoDefinicion.setEnabled(this.tipocostodefinicionConstantesFunciones.activaridTipoCostoDefinicion);
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldcodigoTipoCostoDefinicion.setEnabled(this.tipocostodefinicionConstantesFunciones.activarcodigoTipoCostoDefinicion);
		this.jInternalFrameDetalleFormTipoCostoDefinicion.jTextFieldnombreTipoCostoDefinicion.setEnabled(this.tipocostodefinicionConstantesFunciones.activarnombreTipoCostoDefinicion);
		}
	}
	
		
}