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

import com.bydan.erp.inventario.util.TipoDefinicionConstantesFunciones;
import com.bydan.erp.inventario.util.TipoDefinicionParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoDefinicionParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoDefinicionBean;
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
public class TipoDefinicionBeanSwingJInternalFrame extends TipoDefinicionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoDefinicionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoDefinicion> tipodefinicionValidator = new ClassValidator<TipoDefinicion>(TipoDefinicion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoDefinicion tipodefinicion;	
	public TipoDefinicion tipodefinicionAux;
	public TipoDefinicion tipodefinicionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoDefinicion tipodefinicionTotales;
	public Long idTipoDefinicionActual;
	public Long iIdNuevoTipoDefinicion=0L;
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
	
	public Boolean isPermisoTodoTipoDefinicion;
	public Boolean isPermisoNuevoTipoDefinicion;
	public Boolean isPermisoActualizarTipoDefinicion;
	public Boolean isPermisoActualizarOriginalTipoDefinicion;
	public Boolean isPermisoEliminarTipoDefinicion;
	public Boolean isPermisoGuardarCambiosTipoDefinicion;
	public Boolean isPermisoConsultaTipoDefinicion;
	public Boolean isPermisoBusquedaTipoDefinicion;
	public Boolean isPermisoReporteTipoDefinicion;
	public Boolean isPermisoPaginacionMedioTipoDefinicion;
	public Boolean isPermisoPaginacionAltoTipoDefinicion;
	public Boolean isPermisoPaginacionTodoTipoDefinicion;
	public Boolean isPermisoCopiarTipoDefinicion;
	public Boolean isPermisoVerFormTipoDefinicion;
	public Boolean isPermisoDuplicarTipoDefinicion;
	public Boolean isPermisoOrdenTipoDefinicion;
	
	
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
	
	public TipoDefinicionParameterReturnGeneral tipodefinicionReturnGeneral;
	public TipoDefinicionParameterReturnGeneral tipodefinicionParameterGeneral;
	
	

	public DefinicionLogic definicionLogic=null;

	public DefinicionLogic getDefinicionLogic() {
		return definicionLogic;
	}

	public void setDefinicionLogic(DefinicionLogic definicionLogic) {
		this.definicionLogic = definicionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoDefinicion=false;
	public Boolean esParaAccionDesdeFormularioTipoDefinicion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoDefinicionLogic tipodefinicionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoDefinicion tipodefinicionBean;
	public TipoDefinicionConstantesFunciones tipodefinicionConstantesFunciones;
	//public TipoDefinicionParameterReturnGeneral tipodefinicionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoDefinicion> tipodefinicions;	
	//public List<TipoDefinicion> tipodefinicionsEliminados;
	//public List<TipoDefinicion> tipodefinicionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoDefinicion=false;
	public Boolean isVisibilidadCeldaDuplicarTipoDefinicion=true;
	public Boolean isVisibilidadCeldaCopiarTipoDefinicion=true;
	public Boolean isVisibilidadCeldaVerFormTipoDefinicion=true;
	public Boolean isVisibilidadCeldaOrdenTipoDefinicion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoDefinicion=false;
	public Boolean isVisibilidadCeldaModificarTipoDefinicion=false;
	public Boolean isVisibilidadCeldaActualizarTipoDefinicion=false;
	public Boolean isVisibilidadCeldaEliminarTipoDefinicion=false;
	public Boolean isVisibilidadCeldaCancelarTipoDefinicion=false;
	public Boolean isVisibilidadCeldaGuardarTipoDefinicion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoDefinicion=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoDefinicion() {
		return this.iIdNuevoTipoDefinicion;
	}

	public void setiIdNuevoTipoDefinicion(Long iIdNuevoTipoDefinicion) {
		this.iIdNuevoTipoDefinicion = iIdNuevoTipoDefinicion;
	}
	
	public Long getidTipoDefinicionActual() {
		return this.idTipoDefinicionActual;
	}

	public void setidTipoDefinicionActual(Long idTipoDefinicionActual) {
		this.idTipoDefinicionActual = idTipoDefinicionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoDefinicion gettipodefinicion() {
		return this.tipodefinicion;
	}

	public void settipodefinicion(TipoDefinicion tipodefinicion) {
		this.tipodefinicion = tipodefinicion;
	}
	
	public TipoDefinicion gettipodefinicionAux() {
		return this.tipodefinicionAux;
	}

	public void settipodefinicionAux(TipoDefinicion tipodefinicionAux) {
		this.tipodefinicionAux = tipodefinicionAux;
	}				
	
	public TipoDefinicion gettipodefinicionAnterior() {
		return this.tipodefinicionAnterior;
	}

	public void settipodefinicionAnterior(TipoDefinicion tipodefinicionAnterior) {
		this.tipodefinicionAnterior = tipodefinicionAnterior;
	}	
	
	public TipoDefinicion gettipodefinicionTotales() {
		return this.tipodefinicionTotales;
	}

	public void settipodefinicionTotales(TipoDefinicion tipodefinicionTotales) {
		this.tipodefinicionTotales = tipodefinicionTotales;
	}	
	
	public TipoDefinicion gettipodefinicionBean() {
		return this.tipodefinicionBean;
	}

	public void settipodefinicionBean(TipoDefinicion tipodefinicionBean) {
		this.tipodefinicionBean = tipodefinicionBean;
	}	
	
	public TipoDefinicionParameterReturnGeneral gettipodefinicionReturnGeneral() {
		return this.tipodefinicionReturnGeneral;
	}

	public void settipodefinicionReturnGeneral(TipoDefinicionParameterReturnGeneral tipodefinicionReturnGeneral) {
		this.tipodefinicionReturnGeneral = tipodefinicionReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoDefinicionLogic getTipoDefinicionLogic()	{		
		return tipodefinicionLogic;
	}

	public void setTipoDefinicionLogic(TipoDefinicionLogic tipodefinicionLogic) {
		this.tipodefinicionLogic = tipodefinicionLogic;
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
	
	public Boolean getIsEsNuevoTipoDefinicion() {
		return isEsNuevoTipoDefinicion;
	}

	public void setIsEsNuevoTipoDefinicion(Boolean isEsNuevoTipoDefinicion) {
		this.isEsNuevoTipoDefinicion = isEsNuevoTipoDefinicion;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoDefinicion() {
		return esParaAccionDesdeFormularioTipoDefinicion;
	}
	
	public void setEsParaAccionDesdeFormularioTipoDefinicion(Boolean esParaAccionDesdeFormularioTipoDefinicion) {
		this.esParaAccionDesdeFormularioTipoDefinicion = esParaAccionDesdeFormularioTipoDefinicion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoDefinicion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoDefinicionConstantesFunciones.refrescarForeignKeysDescripcionesTipoDefinicion(this.tipodefinicionLogic.getTipoDefinicions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoDefinicionConstantesFunciones.refrescarForeignKeysDescripcionesTipoDefinicion(this.tipodefinicions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipodefinicionLogic.setTipoDefinicions(this.tipodefinicions);
			tipodefinicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoDefinicionParameterReturnGeneral getTipoDefinicionParameterGeneral() {
		return this.tipodefinicionParameterGeneral;
	}
	
	public void setTipoDefinicionParameterGeneral(TipoDefinicionParameterReturnGeneral tipodefinicionParameterGeneral) {
		this.tipodefinicionParameterGeneral = tipodefinicionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoDefinicion() {
		return isPermisoTodoTipoDefinicion;
	}

	public void setIsPermisoTodoTipoDefinicion(Boolean isPermisoTodoTipoDefinicion) {
		this.isPermisoTodoTipoDefinicion = isPermisoTodoTipoDefinicion;
	}

	public Boolean getIsPermisoNuevoTipoDefinicion() {
		return isPermisoNuevoTipoDefinicion;
	}

	public void setIsPermisoNuevoTipoDefinicion(Boolean isPermisoNuevoTipoDefinicion) {
		this.isPermisoNuevoTipoDefinicion = isPermisoNuevoTipoDefinicion;
	}

	public Boolean getIsPermisoActualizarTipoDefinicion() {
		return isPermisoActualizarTipoDefinicion;
	}

	public void setIsPermisoActualizarTipoDefinicion(Boolean isPermisoActualizarTipoDefinicion) {
		this.isPermisoActualizarTipoDefinicion = isPermisoActualizarTipoDefinicion;
	}

	public Boolean getIsPermisoEliminarTipoDefinicion() {
		return isPermisoEliminarTipoDefinicion;
	}

	public void setIsPermisoEliminarTipoDefinicion(Boolean isPermisoEliminarTipoDefinicion) {
		this.isPermisoEliminarTipoDefinicion = isPermisoEliminarTipoDefinicion;
	}

	public Boolean getIsPermisoGuardarCambiosTipoDefinicion() {
		return isPermisoGuardarCambiosTipoDefinicion;
	}

	public void setIsPermisoGuardarCambiosTipoDefinicion(Boolean isPermisoGuardarCambiosTipoDefinicion) {
		this.isPermisoGuardarCambiosTipoDefinicion = isPermisoGuardarCambiosTipoDefinicion;
	}
	
	public Boolean getIsPermisoConsultaTipoDefinicion() {
		return isPermisoConsultaTipoDefinicion;
	}

	public void setIsPermisoConsultaTipoDefinicion(Boolean isPermisoConsultaTipoDefinicion) {
		this.isPermisoConsultaTipoDefinicion = isPermisoConsultaTipoDefinicion;
	}

	public Boolean getIsPermisoBusquedaTipoDefinicion() {
		return isPermisoBusquedaTipoDefinicion;
	}

	public void setIsPermisoBusquedaTipoDefinicion(Boolean isPermisoBusquedaTipoDefinicion) {
		this.isPermisoBusquedaTipoDefinicion = isPermisoBusquedaTipoDefinicion;
	}

	public Boolean getIsPermisoReporteTipoDefinicion() {
		return isPermisoReporteTipoDefinicion;
	}

	public void setIsPermisoReporteTipoDefinicion(Boolean isPermisoReporteTipoDefinicion) {
		this.isPermisoReporteTipoDefinicion = isPermisoReporteTipoDefinicion;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoDefinicion() {
		return isPermisoPaginacionMedioTipoDefinicion;
	}

	public void setIsPermisoPaginacionMedioTipoDefinicion(Boolean isPermisoPaginacionMedioTipoDefinicion) {
		this.isPermisoPaginacionMedioTipoDefinicion = isPermisoPaginacionMedioTipoDefinicion;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoDefinicion() {
		return isPermisoPaginacionTodoTipoDefinicion;
	}

	public void setIsPermisoPaginacionTodoTipoDefinicion(Boolean isPermisoPaginacionTodoTipoDefinicion) {
		this.isPermisoPaginacionTodoTipoDefinicion = isPermisoPaginacionTodoTipoDefinicion;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoDefinicion() {
		return isPermisoPaginacionAltoTipoDefinicion;
	}

	public void setIsPermisoPaginacionAltoTipoDefinicion(Boolean isPermisoPaginacionAltoTipoDefinicion) {
		this.isPermisoPaginacionAltoTipoDefinicion = isPermisoPaginacionAltoTipoDefinicion;
	}
	
	public Boolean getIsPermisoCopiarTipoDefinicion() {
		return isPermisoCopiarTipoDefinicion;
	}

	public void setIsPermisoCopiarTipoDefinicion(Boolean isPermisoCopiarTipoDefinicion) {
		this.isPermisoCopiarTipoDefinicion = isPermisoCopiarTipoDefinicion;
	}
	
	public Boolean getIsPermisoVerFormTipoDefinicion() {
		return isPermisoVerFormTipoDefinicion;
	}

	public void setIsPermisoVerFormTipoDefinicion(Boolean isPermisoVerFormTipoDefinicion) {
		this.isPermisoVerFormTipoDefinicion = isPermisoVerFormTipoDefinicion;
	}
	
	public Boolean getIsPermisoDuplicarTipoDefinicion() {
		return isPermisoDuplicarTipoDefinicion;
	}

	public void setIsPermisoDuplicarTipoDefinicion(Boolean isPermisoDuplicarTipoDefinicion) {
		this.isPermisoDuplicarTipoDefinicion = isPermisoDuplicarTipoDefinicion;
	}
	
	public Boolean getIsPermisoOrdenTipoDefinicion() {
		return isPermisoOrdenTipoDefinicion;
	}

	public void setIsPermisoOrdenTipoDefinicion(Boolean isPermisoOrdenTipoDefinicion) {
		this.isPermisoOrdenTipoDefinicion = isPermisoOrdenTipoDefinicion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoDefinicion() {
		return isVisibilidadCeldaNuevoTipoDefinicion;
	}

	public void setIsVisibilidadCeldaNuevoTipoDefinicion(Boolean isVisibilidadCeldaNuevoTipoDefinicion) {
		this.isVisibilidadCeldaNuevoTipoDefinicion = isVisibilidadCeldaNuevoTipoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoDefinicion() {
		return isVisibilidadCeldaDuplicarTipoDefinicion;
	}

	public void setIsVisibilidadCeldaDuplicarTipoDefinicion(Boolean isVisibilidadCeldaDuplicarTipoDefinicion) {
		this.isVisibilidadCeldaDuplicarTipoDefinicion = isVisibilidadCeldaDuplicarTipoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoDefinicion() {
		return isVisibilidadCeldaCopiarTipoDefinicion;
	}

	public void setIsVisibilidadCeldaCopiarTipoDefinicion(Boolean isVisibilidadCeldaCopiarTipoDefinicion) {
		this.isVisibilidadCeldaCopiarTipoDefinicion = isVisibilidadCeldaCopiarTipoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoDefinicion() {
		return isVisibilidadCeldaVerFormTipoDefinicion;
	}

	public void setIsVisibilidadCeldaVerFormTipoDefinicion(Boolean isVisibilidadCeldaVerFormTipoDefinicion) {
		this.isVisibilidadCeldaVerFormTipoDefinicion = isVisibilidadCeldaVerFormTipoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoDefinicion() {
		return isVisibilidadCeldaOrdenTipoDefinicion;
	}

	public void setIsVisibilidadCeldaOrdenTipoDefinicion(Boolean isVisibilidadCeldaOrdenTipoDefinicion) {
		this.isVisibilidadCeldaOrdenTipoDefinicion = isVisibilidadCeldaOrdenTipoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoDefinicion() {
		return isVisibilidadCeldaNuevoRelacionesTipoDefinicion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoDefinicion(Boolean isVisibilidadCeldaNuevoRelacionesTipoDefinicion) {
		this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion = isVisibilidadCeldaNuevoRelacionesTipoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoDefinicion() {
		return isVisibilidadCeldaModificarTipoDefinicion;
	}

	public void setIsVisibilidadCeldaModificarTipoDefinicion(Boolean isVisibilidadCeldaModificarTipoDefinicion) {
		this.isVisibilidadCeldaModificarTipoDefinicion = isVisibilidadCeldaModificarTipoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoDefinicion() {
		return isVisibilidadCeldaActualizarTipoDefinicion;
	}

	public void setIsVisibilidadCeldaActualizarTipoDefinicion(Boolean isVisibilidadCeldaActualizarTipoDefinicion) {
		this.isVisibilidadCeldaActualizarTipoDefinicion = isVisibilidadCeldaActualizarTipoDefinicion;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoDefinicion() {
		return isVisibilidadCeldaEliminarTipoDefinicion;
	}

	public void setIsVisibilidadCeldaEliminarTipoDefinicion(Boolean isVisibilidadCeldaEliminarTipoDefinicion) {
		this.isVisibilidadCeldaEliminarTipoDefinicion = isVisibilidadCeldaEliminarTipoDefinicion;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoDefinicion() {
		return isVisibilidadCeldaCancelarTipoDefinicion;
	}

	public void setIsVisibilidadCeldaCancelarTipoDefinicion(Boolean isVisibilidadCeldaCancelarTipoDefinicion) {
		this.isVisibilidadCeldaCancelarTipoDefinicion = isVisibilidadCeldaCancelarTipoDefinicion;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoDefinicion() {
		return isVisibilidadCeldaGuardarTipoDefinicion;
	}

	public void setIsVisibilidadCeldaGuardarTipoDefinicion(Boolean isVisibilidadCeldaGuardarTipoDefinicion) {
		this.isVisibilidadCeldaGuardarTipoDefinicion = isVisibilidadCeldaGuardarTipoDefinicion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoDefinicion() {
		return isVisibilidadCeldaGuardarCambiosTipoDefinicion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoDefinicion(Boolean isVisibilidadCeldaGuardarCambiosTipoDefinicion) {
		this.isVisibilidadCeldaGuardarCambiosTipoDefinicion = isVisibilidadCeldaGuardarCambiosTipoDefinicion;
	}
		
	public TipoDefinicionSessionBean gettipodefinicionSessionBean() {
		return this.tipodefinicionSessionBean;
	}
	
	public void settipodefinicionSessionBean(TipoDefinicionSessionBean tipodefinicionSessionBean) {
		this.tipodefinicionSessionBean=tipodefinicionSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(TipoDefinicion tipodefinicion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoDefinicion tipodefinicion,TipoDefinicion tipodefinicionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoDefinicion(tipodefinicion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipodefinicionAux.setId(tipodefinicion.getId());
		tipodefinicionAux.setVersionRow(tipodefinicion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoDefinicion();
		
			int intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicion =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipodefinicion =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoDefinicion(this.tipodefinicion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipodefinicionValidator.getInvalidValues(this.tipodefinicion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipodefinicionLogic.setDatosCliente(datosCliente);
			tipodefinicionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipodefinicionAux=new  TipoDefinicion();
				
				tipodefinicionAux.setIsNew(true);
				tipodefinicionAux.setIsChanged(true);
				
				tipodefinicionAux.setTipoDefinicionOriginal(this.tipodefinicion);
				
				tipodefinicionAux.setId(this.tipodefinicion.getId());	
				tipodefinicionAux.setVersionRow(this.tipodefinicion.getVersionRow());	
				tipodefinicionAux.setcodigo(this.tipodefinicion.getcodigo());	
				tipodefinicionAux.setnombre(this.tipodefinicion.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodefinicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodefinicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipodefinicionAux,tipodefinicionLogic.getTipoDefinicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodefinicionAux,tipodefinicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipodefinicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodefinicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodefinicionLogic.saveTipoDefinicions();//WithConnection
						//tipodefinicionLogic.getSetVersionRowTipoDefinicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodefinicion,tipodefinicionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipodefinicionAux=new  TipoDefinicion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado() 
					|| (this.tipodefinicionSessionBean.getEsGuardarRelacionado() && this.tipodefinicion.getId()>=0)) {
						
					tipodefinicionAux.setIsNew(false);
				}
				
				tipodefinicionAux.setIsDeleted(false);
			
				tipodefinicionAux.setId(this.tipodefinicion.getId());	
				tipodefinicionAux.setVersionRow(this.tipodefinicion.getVersionRow());	
				tipodefinicionAux.setcodigo(this.tipodefinicion.getcodigo());	
				tipodefinicionAux.setnombre(this.tipodefinicion.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodefinicionAux,tipodefinicionLogic.getTipoDefinicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodefinicionAux,tipodefinicions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipodefinicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodefinicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodefinicionLogic.saveTipoDefinicions();//WithConnection
						//tipodefinicionLogic.getSetVersionRowTipoDefinicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipodefinicion,tipodefinicionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipodefinicionAux=new  TipoDefinicion();
				
				tipodefinicionAux.setIsNew(false);
				tipodefinicionAux.setIsChanged(false);
				
				tipodefinicionAux.setIsDeleted(true);
				
				tipodefinicionAux.setId(this.tipodefinicion.getId());	
				tipodefinicionAux.setVersionRow(this.tipodefinicion.getVersionRow());	
				tipodefinicionAux.setcodigo(this.tipodefinicion.getcodigo());	
				tipodefinicionAux.setnombre(this.tipodefinicion.getnombre());	
				
				if(this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipodefinicionAux.getId()>=0) {	
						this.tipodefinicionsEliminados.add(tipodefinicionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipodefinicionAux,tipodefinicionLogic.getTipoDefinicions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodefinicionAux,tipodefinicions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipodefinicionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipodefinicionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodefinicionLogic.saveTipoDefinicions();//WithConnection
						//tipodefinicionLogic.getSetVersionRowTipoDefinicions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipodefinicionAux.setDefinicions(this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipodefinicionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipodefinicionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipodefinicionAux,tipodefinicionLogic.getTipoDefinicions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipodefinicionAux,tipodefinicions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.getTipoDefinicions().addAll(this.tipodefinicionsEliminados);
					
					tipodefinicionLogic.saveTipoDefinicions();//WithConnection
					//tipodefinicionLogic.getSetVersionRowTipoDefinicions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipodefinicionsEliminados= new ArrayList<TipoDefinicion>();		
			}
			
			if(this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Definicion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Definicion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipodefinicion=tipodefinicionAux;
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
      		//this.finishProcessTipoDefinicion();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoDefinicion tipodefinicionLocal) throws Exception {
		
		if(this.tipodefinicionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipodefinicionLocal.setDefinicions(this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
			
			} else {
			
				tipodefinicionLocal.setDefinicions(this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.definicions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoDefinicion tipodefinicionLocal) throws Exception {	
		if(this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoDefinicionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodefinicion =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipodefinicion =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipodefinicionValidator.getInvalidValues(this.tipodefinicion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoDefinicion tipodefinicion,List<TipoDefinicion> tipodefinicions) throws Exception {
		try	{		
			TipoDefinicionConstantesFunciones.actualizarLista(tipodefinicion,tipodefinicions,this.tipodefinicionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoDefinicion tipodefinicion,List<TipoDefinicion> tipodefinicions) throws Exception {
		try	{			
			TipoDefinicionConstantesFunciones.actualizarSelectedLista(tipodefinicion,tipodefinicions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoDefinicion> tipodefinicionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipodefinicionsLocal=this.tipodefinicionLogic.getTipoDefinicions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipodefinicionsLocal=this.tipodefinicions;
			}
			//ARCHITECTURE
		
			for(TipoDefinicion tipodefinicionLocal:tipodefinicionsLocal) {
				if(this.permiteMantenimiento(tipodefinicionLocal) && tipodefinicionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoDefinicionConstantesFunciones.getTipoDefinicionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoDefinicionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDefinicion.jLabelcodigoTipoDefinicion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoDefinicionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDefinicion.jLabelnombreTipoDefinicion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDefinicion.jLabelcodigoTipoDefinicion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoDefinicion.jLabelnombreTipoDefinicion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Definicion")) {
			if(this.tipodefinicion==null) {
				this.tipodefinicion= new TipoDefinicion();
			}

			if(this.tipodefinicionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoDefinicion
				this.setVariablesFormularioToObjetoActualTipoDefinicion(this.tipodefinicion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);

				this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.getdefinicion().setTipoDefinicion(this.tipodefinicion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoDefinicion--;	
		
		
		this.tipodefinicionAux=new TipoDefinicion();
		
		this.tipodefinicionAux.setId(this.iIdNuevoTipoDefinicion);
		this.tipodefinicionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipodefinicionLogic.getTipoDefinicions().add(this.tipodefinicionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipodefinicions.add(this.tipodefinicionAux);
		}
		//ARCHITECTURE
		
		this.tipodefinicion=this.tipodefinicionAux;
		
		if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoDefinicion(this.tipodefinicion);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDefinicion(this.tipodefinicion);
		}
				
		//this.setDefaultControlesTipoDefinicion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoDefinicion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoDefinicion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDefinicion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDefinicion(this.tipodefinicionBean,this.tipodefinicion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoDefinicionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipodefinicionSessionBean.getConGuardarRelaciones()) {
			classes=TipoDefinicionConstantesFunciones.getClassesRelationshipsOfTipoDefinicion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipodefinicionReturnGeneral=tipodefinicionLogic.procesarEventosTipoDefinicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodefinicionLogic.getTipoDefinicions(),this.tipodefinicion,this.tipodefinicionParameterGeneral,this.isEsNuevoTipoDefinicion,classes);//this.tipodefinicionLogic.getTipoDefinicion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoDefinicion(this.tipodefinicionReturnGeneral,this.tipodefinicionBean,false);
		
		if(this.tipodefinicionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoDefinicion(this.tipodefinicionReturnGeneral.getTipoDefinicion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoDefinicion(this.tipodefinicionReturnGeneral.getTipoDefinicion());
		}
		
		if(this.tipodefinicionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoDefinicion(this.tipodefinicionReturnGeneral.getTipoDefinicion(),classes);//this.tipodefinicionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoDefinicion(this.tipodefinicion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoDefinicion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoDefinicion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoDefinicion(false);
						
			if(tipodefinicionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDefinicion();
			}
			
			this.actualizarVisualTableDatosTipoDefinicion();
			
			this.jTableDatosTipoDefinicion.setRowSelectionInterval(this.getIndiceNuevoTipoDefinicion(), this.getIndiceNuevoTipoDefinicion());
			
			this.seleccionarFilaTablaTipoDefinicionActual();
						
			this.actualizarEstadoCeldasBotonesTipoDefinicion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoDefinicion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldcodigoTipoDefinicion.setEnabled(isHabilitar && this.tipodefinicionConstantesFunciones.activarcodigoTipoDefinicion);
		this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldnombreTipoDefinicion.setEnabled(isHabilitar && this.tipodefinicionConstantesFunciones.activarnombreTipoDefinicion);	
		
	};
	
	public void setDefaultControlesTipoDefinicion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoDefinicion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipodefinicionSessionBean.setConGuardarRelaciones(true);			
			this.tipodefinicionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoDefinicion.jTabbedPaneRelacionesTipoDefinicion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipodefinicionSessionBean.setConGuardarRelaciones(false);			
			this.tipodefinicionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoDefinicion.jTabbedPaneRelacionesTipoDefinicion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoDefinicion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDefinicion tipodefinicionAux:this.tipodefinicionLogic.getTipoDefinicions()) {
				if(tipodefinicionAux.getId().equals(this.iIdNuevoTipoDefinicion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDefinicion tipodefinicionAux:this.tipodefinicions) {
				if(tipodefinicionAux.getId().equals(this.iIdNuevoTipoDefinicion)) {
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
	
	public int getIndiceActualTipoDefinicion(TipoDefinicion tipodefinicion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDefinicion tipodefinicionAux:this.tipodefinicionLogic.getTipoDefinicions()) {
				if(tipodefinicionAux.getId().equals(tipodefinicion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDefinicion tipodefinicionAux:this.tipodefinicions) {
				if(tipodefinicionAux.getId().equals(tipodefinicion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoDefinicion(TipoDefinicion tipodefinicionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDefinicion tipodefinicionAux:this.tipodefinicionLogic.getTipoDefinicions()) {
				if(tipodefinicionAux.getTipoDefinicionOriginal().getId().equals(tipodefinicionOriginal.getId())) {
					existe=true;
					tipodefinicionOriginal.setId(tipodefinicionAux.getId());
					tipodefinicionOriginal.setVersionRow(tipodefinicionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDefinicion tipodefinicionAux:this.tipodefinicions) {
				if(tipodefinicionAux.getTipoDefinicionOriginal().getId().equals(tipodefinicionOriginal.getId())) {
					existe=true;
					tipodefinicionOriginal.setId(tipodefinicionAux.getId());
					tipodefinicionOriginal.setVersionRow(tipodefinicionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoDefinicion(Boolean esParaCancelar) throws Exception {
		tipodefinicionsAux=new ArrayList<TipoDefinicion>();
		tipodefinicionAux=new TipoDefinicion();
		
		if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDefinicion tipodefinicionAux:this.tipodefinicionLogic.getTipoDefinicions()) {
					if(tipodefinicionAux.getId()<0) {
						tipodefinicionsAux.add(tipodefinicionAux);
					}		
				}
				this.iIdNuevoTipoDefinicion=0L;
				this.tipodefinicionLogic.getTipoDefinicions().removeAll(tipodefinicionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDefinicion tipodefinicionAux:this.tipodefinicions) {
					if(tipodefinicionAux.getId()<0) {
						tipodefinicionsAux.add(tipodefinicionAux);
					}		
				}
				this.iIdNuevoTipoDefinicion=0L;
				this.tipodefinicions.removeAll(tipodefinicionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoDefinicion 
					&& this.tipodefinicionLogic.getTipoDefinicions().size()>0
					) {
					tipodefinicionAux=this.tipodefinicionLogic.getTipoDefinicions().get(this.tipodefinicionLogic.getTipoDefinicions().size() - 1);
				
					if(tipodefinicionAux.getId()<0) {
						this.tipodefinicionLogic.getTipoDefinicions().remove(tipodefinicionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoDefinicion && this.tipodefinicions.size()>0) {
					tipodefinicionAux=this.tipodefinicions.get(this.tipodefinicions.size() - 1);
				
					if(tipodefinicionAux.getId()<0) {
						this.tipodefinicions.remove(tipodefinicionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoDefinicion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipodefinicion.getId()<0) {
				this.tipodefinicionLogic.getTipoDefinicions().remove(this.tipodefinicion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipodefinicion.getId()<0) {
				this.tipodefinicions.remove(this.tipodefinicion);
			}
		}			
	}
	
	public void setEstadosInicialesTipoDefinicion(List<TipoDefinicion> tipodefinicionsAux) throws Exception {
		TipoDefinicionConstantesFunciones.setEstadosInicialesTipoDefinicion(tipodefinicionsAux);
	}
	
	public void setEstadosInicialesTipoDefinicion(TipoDefinicion tipodefinicionAux) throws Exception {
		TipoDefinicionConstantesFunciones.setEstadosInicialesTipoDefinicion(tipodefinicionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoDefinicionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoDefinicionActual()) {
				if(!this.isEsNuevoTipoDefinicion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoDefinicion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoDefinicionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Definicion ?", "MANTENIMIENTO DE Tipo Definicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoDefinicion tipodefinicion) throws Exception {
		TipoDefinicionConstantesFunciones.seleccionarAsignar(this.tipodefinicion,tipodefinicion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoDefinicion=this.isPermisoActualizarOriginalTipoDefinicion;
			
			
			this.seleccionarAsignar(tipodefinicion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoDefinicionConstantesFunciones.quitarEspaciosTipoDefinicion(this.tipodefinicion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoDefinicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipodefinicionSessionBean.setsFuncionBusquedaRapida(this.tipodefinicionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoDefinicion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoDefinicion(esParaCancelar);				
				this.cancelarNuevoTipoDefinicion(esParaCancelar);								
			}
			
			this.tipodefinicion=new TipoDefinicion();
			
			this.inicializarTipoDefinicion();
			
			this.actualizarEstadoCeldasBotonesTipoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoDefinicion() throws Exception {
		try {
			TipoDefinicionConstantesFunciones.inicializarTipoDefinicion(this.tipodefinicion);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipodefinicionLogic.getTipoDefinicions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoDefinicions(String sAccionBusqueda,List<TipoDefinicion> tipodefinicionsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoDefinicion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoDefinicionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoDefinicionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoDefinicion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Definiciones");		
		parameters.put("busquedapor", TipoDefinicionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					TipoDefinicionLogic tipodefinicionLogicAuxiliar=new TipoDefinicionLogic();
					tipodefinicionLogicAuxiliar.setDatosCliente(tipodefinicionLogic.getDatosCliente());				
					tipodefinicionLogicAuxiliar.setTipoDefinicions(tipodefinicionsParaReportes);
					
					tipodefinicionLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoDefinicionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipodefinicionsParaReportes=tipodefinicionLogicAuxiliar.getTipoDefinicions();
					
					//tipodefinicionLogic.getNewConnexionToDeep();
					
					//for (TipoDefinicion tipodefinicion:tipodefinicionsParaReportes) {
					//	tipodefinicionLogic.deepLoad(tipodefinicion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipodefinicionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipodefinicionLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoDefinicion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoDefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoDefinicionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoDefinicion=new JRBeanArrayDataSource(TipoDefinicionJInternalFrame.TraerTipoDefinicionBeans(tipodefinicionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoDefinicion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoDefinicionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoDefinicionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoDefinicionBean.TraerTipoDefinicionBeans(tipodefinicionsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipodefinicionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipodefinicionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoDefinicionActionPerformed(null);
					//this.generarExcelReporteTipoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipodefinicionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipodefinicionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipodefinicionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoDefinicions(sAccionBusqueda,sTipoArchivoReporte,tipodefinicionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoDefinicions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDefinicion> tipodefinicionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodefinicion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDefinicions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDefinicion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoDefinicion tipodefinicion : tipodefinicionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoDefinicionConstantesFunciones.generarExcelReporteDataTipoDefinicion("NORMAL",row,workbook,tipodefinicion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Definicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoDefinicion(String sTipo,Row row,Workbook workbook) {
		
		TipoDefinicionConstantesFunciones.generarExcelReporteHeaderTipoDefinicion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoDefinicions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDefinicion> tipodefinicionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodefinicion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDefinicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoDefinicion tipodefinicion : tipodefinicionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoDefinicionConstantesFunciones.getTipoDefinicionDescripcion(tipodefinicion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDefinicionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDefinicionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodefinicion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoDefinicionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoDefinicionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipodefinicion.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Definicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoDefinicions(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoDefinicion> tipodefinicionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoDefinicion> tipodefinicionsRespaldo=null;
		
		classes=TipoDefinicionConstantesFunciones.getClassesRelationshipsOfTipoDefinicion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipodefinicionLogic.setDatosCliente(this.datosCliente);
		this.tipodefinicionLogic.setDatosDeep(this.datosDeep);
		this.tipodefinicionLogic.setIsConDeep(true);
		
		tipodefinicionsRespaldo=this.tipodefinicionLogic.getTipoDefinicions();
		
		this.tipodefinicionLogic.setTipoDefinicions(tipodefinicionsParaReportes);	
		this.tipodefinicionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipodefinicionsParaReportes=this.tipodefinicionLogic.getTipoDefinicions();
		this.tipodefinicionLogic.setTipoDefinicions(tipodefinicionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodefinicion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoDefinicions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoDefinicion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoDefinicion tipodefinicion : tipodefinicionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoDefinicion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoDefinicionConstantesFunciones.generarExcelReporteDataTipoDefinicion("NORMAL",row,workbook,tipodefinicion,cellStyleDataAux);
		
			
			


				//Definicion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DefinicionConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipodefinicion.getDefinicions()!=null && tipodefinicion.getDefinicions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DefinicionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DefinicionConstantesFunciones.generarExcelReporteHeaderDefinicion("RELACIONADO",row,workbook);
				}

				if(tipodefinicion.getDefinicions()!=null) {
					i2=0;
					for(Definicion definicion : tipodefinicion.getDefinicions()) {
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
		cell.setCellValue(TipoDefinicionConstantesFunciones.getTipoDefinicionDescripcion(tipodefinicion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Definicion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDefinicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDefinicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDefinicion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDefinicion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoDefinicion() throws Exception {		
		this.startProcessTipoDefinicion(true);
	}
	
	public void startProcessTipoDefinicion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoDefinicion ,this.jPanelParametrosReportesTipoDefinicion, this.jScrollPanelDatosTipoDefinicion,this.jPanelPaginacionTipoDefinicion, this.jScrollPanelDatosEdicionTipoDefinicion, this.jPanelAccionesTipoDefinicion,this.jPanelAccionesFormularioTipoDefinicion,this.jmenuBarTipoDefinicion,this.jmenuBarDetalleTipoDefinicion,this.jTtoolBarTipoDefinicion,this.jTtoolBarDetalleTipoDefinicion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDefinicion=this.jTabbedPaneBusquedasTipoDefinicion; 
		
		final JPanel jPanelParametrosReportesTipoDefinicion=this.jPanelParametrosReportesTipoDefinicion;
		//final JScrollPane jScrollPanelDatosTipoDefinicion=this.jScrollPanelDatosTipoDefinicion;
		final JTable jTableDatosTipoDefinicion=this.jTableDatosTipoDefinicion;		
		final JPanel jPanelPaginacionTipoDefinicion=this.jPanelPaginacionTipoDefinicion;
		//final JScrollPane jScrollPanelDatosEdicionTipoDefinicion=this.jScrollPanelDatosEdicionTipoDefinicion;
		final JPanel jPanelAccionesTipoDefinicion=this.jPanelAccionesTipoDefinicion;
		
		JPanel jPanelCamposAuxiliarTipoDefinicion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoDefinicion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
			jPanelCamposAuxiliarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jPanelCamposTipoDefinicion;
			jPanelAccionesFormularioAuxiliarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jPanelAccionesFormularioTipoDefinicion;
		}
		
		final JPanel jPanelCamposTipoDefinicion=jPanelCamposAuxiliarTipoDefinicion;
		final JPanel jPanelAccionesFormularioTipoDefinicion=jPanelAccionesFormularioAuxiliarTipoDefinicion;
		
		
		final JMenuBar jmenuBarTipoDefinicion=this.jmenuBarTipoDefinicion;
		final JToolBar jTtoolBarTipoDefinicion=this.jTtoolBarTipoDefinicion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoDefinicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDefinicion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
			jmenuBarDetalleAuxiliarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jmenuBarDetalleTipoDefinicion;
			jTtoolBarDetalleAuxiliarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jTtoolBarDetalleTipoDefinicion;
		}
		
		final JMenuBar jmenuBarDetalleTipoDefinicion=jmenuBarDetalleAuxiliarTipoDefinicion;
		final JToolBar jTtoolBarDetalleTipoDefinicion=jTtoolBarDetalleAuxiliarTipoDefinicion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDefinicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDefinicion;
			processRunnable.jTableDatos=jTableDatosTipoDefinicion;
			processRunnable.jPanelCampos=jPanelCamposTipoDefinicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDefinicion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDefinicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDefinicion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDefinicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDefinicion;
			processRunnable.jTtoolBar=jTtoolBarTipoDefinicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDefinicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDefinicion ,jPanelParametrosReportesTipoDefinicion,jTableDatosTipoDefinicion, /*jScrollPanelDatosTipoDefinicion,*/jPanelCamposTipoDefinicion,jPanelPaginacionTipoDefinicion, /*jScrollPanelDatosEdicionTipoDefinicion,*/ jPanelAccionesTipoDefinicion,jPanelAccionesFormularioTipoDefinicion,jmenuBarTipoDefinicion,jmenuBarDetalleTipoDefinicion,jTtoolBarTipoDefinicion,jTtoolBarDetalleTipoDefinicion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoDefinicion ,jPanelParametrosReportesTipoDefinicion, jScrollPanelDatosTipoDefinicion,jPanelPaginacionTipoDefinicion, jScrollPanelDatosEdicionTipoDefinicion, jPanelAccionesTipoDefinicion,jPanelAccionesFormularioTipoDefinicion,jmenuBarTipoDefinicion,jmenuBarDetalleTipoDefinicion,jTtoolBarTipoDefinicion,jTtoolBarDetalleTipoDefinicion);
						
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
	
	public void finishProcessTipoDefinicion() {// throws Exception 
		this.finishProcessTipoDefinicion(true);
	}
	
	public void finishProcessTipoDefinicion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoDefinicion ,this.jPanelParametrosReportesTipoDefinicion, this.jScrollPanelDatosTipoDefinicion,this.jPanelPaginacionTipoDefinicion, this.jScrollPanelDatosEdicionTipoDefinicion, this.jPanelAccionesTipoDefinicion,this.jPanelAccionesFormularioTipoDefinicion,this.jmenuBarTipoDefinicion,this.jmenuBarDetalleTipoDefinicion,this.jTtoolBarTipoDefinicion,this.jTtoolBarDetalleTipoDefinicion);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoDefinicion=this.jTabbedPaneBusquedasTipoDefinicion; 
		
		final JPanel jPanelParametrosReportesTipoDefinicion=this.jPanelParametrosReportesTipoDefinicion;
		//final JScrollPane jScrollPanelDatosTipoDefinicion=this.jScrollPanelDatosTipoDefinicion;
		final JTable jTableDatosTipoDefinicion=this.jTableDatosTipoDefinicion;		
		final JPanel jPanelPaginacionTipoDefinicion=this.jPanelPaginacionTipoDefinicion;
		//final JScrollPane jScrollPanelDatosEdicionTipoDefinicion=this.jScrollPanelDatosEdicionTipoDefinicion;
		final JPanel jPanelAccionesTipoDefinicion=this.jPanelAccionesTipoDefinicion;
		
		JPanel jPanelCamposAuxiliarTipoDefinicion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoDefinicion=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
			jPanelCamposAuxiliarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jPanelCamposTipoDefinicion;
			jPanelAccionesFormularioAuxiliarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jPanelAccionesFormularioTipoDefinicion;
		}
		
		final JPanel jPanelCamposTipoDefinicion=jPanelCamposAuxiliarTipoDefinicion;
		final JPanel jPanelAccionesFormularioTipoDefinicion=jPanelAccionesFormularioAuxiliarTipoDefinicion;
		
		
		final JMenuBar jmenuBarTipoDefinicion=this.jmenuBarTipoDefinicion;		
		final JToolBar jTtoolBarTipoDefinicion=this.jTtoolBarTipoDefinicion;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoDefinicion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoDefinicion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
			jmenuBarDetalleAuxiliarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jmenuBarDetalleTipoDefinicion;
			jTtoolBarDetalleAuxiliarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jTtoolBarDetalleTipoDefinicion;		
		}
		
		final JMenuBar jmenuBarDetalleTipoDefinicion=jmenuBarDetalleAuxiliarTipoDefinicion;
		final JToolBar jTtoolBarDetalleTipoDefinicion=jTtoolBarDetalleAuxiliarTipoDefinicion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoDefinicion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoDefinicion;
			processRunnable.jTableDatos=jTableDatosTipoDefinicion;
			processRunnable.jPanelCampos=jPanelCamposTipoDefinicion;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoDefinicion;
			processRunnable.jPanelAcciones=jPanelAccionesTipoDefinicion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoDefinicion;
			
			
			processRunnable.jmenuBar=jmenuBarTipoDefinicion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoDefinicion;
			processRunnable.jTtoolBar=jTtoolBarTipoDefinicion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoDefinicion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoDefinicion ,jPanelParametrosReportesTipoDefinicion, jTableDatosTipoDefinicion,/*jScrollPanelDatosTipoDefinicion,*/jPanelCamposTipoDefinicion,jPanelPaginacionTipoDefinicion, /*jScrollPanelDatosEdicionTipoDefinicion,*/ jPanelAccionesTipoDefinicion,jPanelAccionesFormularioTipoDefinicion,jmenuBarTipoDefinicion,jmenuBarDetalleTipoDefinicion,jTtoolBarTipoDefinicion,jTtoolBarDetalleTipoDefinicion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoDefinicion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoDefinicion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoDefinicion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoDefinicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoDefinicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoDefinicion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoDefinicion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoDefinicion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoDefinicion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipodefinicionConstantesFunciones.getsFinalQueryTipoDefinicion();
		String  finalQueryPaginacionTodos=this.tipodefinicionConstantesFunciones.getsFinalQueryTipoDefinicion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoDefinicionConstantesFunciones.getArrayColumnasGlobalesNoTipoDefinicion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoDefinicionConstantesFunciones.getArrayColumnasGlobalesTipoDefinicion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoDefinicionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipodefinicionsEliminados= new ArrayList<TipoDefinicion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoDefinicion();
		
				///*TipoDefinicionSessionBean*/this.tipodefinicionSessionBean=new TipoDefinicionSessionBean();
			
			if(this.tipodefinicionSessionBean==null) {
				this.tipodefinicionSessionBean=new TipoDefinicionSessionBean();
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
					this.iNumeroPaginacion=TipoDefinicionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoDefinicionConstantesFunciones.getClassesForeignKeysOfTipoDefinicion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipodefinicion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipodefinicionsAux= new ArrayList<TipoDefinicion>();
			
				
			tipodefinicionLogic.setDatosCliente(this.datosCliente);
			tipodefinicionLogic.setDatosDeep(this.datosDeep);
			tipodefinicionLogic.setIsConDeep(true);
			
			
			tipodefinicionLogic.getTipoDefinicionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipodefinicionLogic.getTodosTipoDefinicions(finalQueryGlobal,pagination);
					
					//tipodefinicionLogic.getTodosTipoDefinicionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipodefinicionLogic.getTipoDefinicions()==null|| tipodefinicionLogic.getTipoDefinicions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodefinicionsAux= new ArrayList<TipoDefinicion>();
							tipodefinicionsAux.addAll(tipodefinicionLogic.getTipoDefinicions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodefinicionsAux= new ArrayList<TipoDefinicion>();
							tipodefinicionsAux.addAll(tipodefinicions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodefinicionLogic.getTodosTipoDefinicions(finalQueryGlobal+"",this.pagination);												
							
							//tipodefinicionLogic.getTodosTipoDefinicionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoDefinicions("Todos",tipodefinicionLogic.getTipoDefinicions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipodefinicionLogic.setTipoDefinicions(new ArrayList<TipoDefinicion>());					
							tipodefinicionLogic.getTipoDefinicions().addAll(tipodefinicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodefinicions=new ArrayList<TipoDefinicion>();
							tipodefinicions.addAll(tipodefinicionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoDefinicion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoDefinicion=this.idActual;
				
				} else if(this.idTipoDefinicionActual!=null && this.idTipoDefinicionActual!=0L) {
					idTipoDefinicion=idTipoDefinicionActual;
				}
				
					
				this.sDetalleReporte=TipoDefinicionConstantesFunciones.getDetalleIndicePorId(idTipoDefinicion);
				
				this.tipodefinicions=new ArrayList<TipoDefinicion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipodefinicionLogic.getEntity(idTipoDefinicion);
					
					//tipodefinicionLogic.getEntityWithConnection(idTipoDefinicion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodefinicionLogic.setTipoDefinicions(new ArrayList<TipoDefinicion>());
					tipodefinicionLogic.getTipoDefinicions().add(tipodefinicionLogic.getTipoDefinicion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodefinicions=new ArrayList<TipoDefinicion>();
					this.tipodefinicions.add(tipodefinicion);
				}
				
				if(tipodefinicionLogic.getTipoDefinicion()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoDefinicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodefinicionLogic.getTipoDefinicionsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDefinicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDefinicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodefinicionLogic.getTipoDefinicions()==null||tipodefinicionLogic.getTipoDefinicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodefinicions==null|| tipodefinicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodefinicionsAux=new ArrayList<TipoDefinicion>();
						tipodefinicionsAux.addAll(tipodefinicionLogic.getTipoDefinicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodefinicionsAux=new ArrayList<TipoDefinicion>();
							tipodefinicionsAux.addAll(tipodefinicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodefinicionLogic.getTipoDefinicionsBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDefinicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDefinicionConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDefinicions("BusquedaPorCodigo",tipodefinicionLogic.getTipoDefinicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDefinicions("BusquedaPorCodigo",tipodefinicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodefinicionLogic.setTipoDefinicions(new ArrayList<TipoDefinicion>());
						tipodefinicionLogic.getTipoDefinicions().addAll(tipodefinicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodefinicions=new ArrayList<TipoDefinicion>();
							tipodefinicions.addAll(tipodefinicionsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoDefinicionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipodefinicionLogic.getTipoDefinicionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDefinicionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDefinicionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipodefinicionLogic.getTipoDefinicions()==null||tipodefinicionLogic.getTipoDefinicions().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipodefinicions==null|| tipodefinicions.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodefinicionsAux=new ArrayList<TipoDefinicion>();
						tipodefinicionsAux.addAll(tipodefinicionLogic.getTipoDefinicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodefinicionsAux=new ArrayList<TipoDefinicion>();
							tipodefinicionsAux.addAll(tipodefinicions);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipodefinicionLogic.getTipoDefinicionsBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoDefinicionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoDefinicionConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoDefinicions("BusquedaPorNombre",tipodefinicionLogic.getTipoDefinicions());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoDefinicions("BusquedaPorNombre",tipodefinicions);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodefinicionLogic.setTipoDefinicions(new ArrayList<TipoDefinicion>());
						tipodefinicionLogic.getTipoDefinicions().addAll(tipodefinicionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodefinicions=new ArrayList<TipoDefinicion>();
							tipodefinicions.addAll(tipodefinicionsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoDefinicion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoDefinicion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodefinicionLogic.getTipoDefinicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodefinicions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipodefinicionLogic.getTipoDefinicions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipodefinicions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoDefinicion tipodefinicion) {
		Boolean permite=true;
		
		if(this.tipodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoDefinicionConstantesFunciones.getOrderByListaTipoDefinicion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoDefinicionConstantesFunciones.getOrderByListaTipoDefinicion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDefinicion tipodefinicion:tipodefinicionLogic.getTipoDefinicions()) {
				if(tipodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
					tipodefinicionTotales=tipodefinicion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDefinicion tipodefinicion:this.tipodefinicions) {
				if(tipodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
					tipodefinicionTotales=tipodefinicion;
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
			this.tipodefinicionAux=new TipoDefinicion();
			this.tipodefinicionAux.setsType(Constantes2.S_TOTALES);
			this.tipodefinicionAux.setIsNew(false);
			this.tipodefinicionAux.setIsChanged(false);
			this.tipodefinicionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoDefinicionConstantesFunciones.TotalizarValoresFilaTipoDefinicion(this.tipodefinicionLogic.getTipoDefinicions(),this.tipodefinicionAux);
				
				this.tipodefinicionLogic.getTipoDefinicions().add(this.tipodefinicionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoDefinicionConstantesFunciones.TotalizarValoresFilaTipoDefinicion(this.tipodefinicions,this.tipodefinicionAux);
				
				this.tipodefinicions.add(this.tipodefinicionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipodefinicionTotales=new TipoDefinicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodefinicionLogic.getTipoDefinicions().remove(tipodefinicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipodefinicions.remove(tipodefinicionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipodefinicionTotales=new TipoDefinicion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoDefinicion tipodefinicion:tipodefinicionLogic.getTipoDefinicions()) {
				if(tipodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
					tipodefinicionTotales=tipodefinicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDefinicionConstantesFunciones.TotalizarValoresFilaTipoDefinicion(this.tipodefinicionLogic.getTipoDefinicions(),tipodefinicionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoDefinicion tipodefinicion:this.tipodefinicions) {
				if(tipodefinicion.getsType().equals(Constantes2.S_TOTALES)) {
					tipodefinicionTotales=tipodefinicion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoDefinicionConstantesFunciones.TotalizarValoresFilaTipoDefinicion(this.tipodefinicions,tipodefinicionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoDefinicionsBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoDefinicionsBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoDefinicionsBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodefinicionLogic.getTipoDefinicionsBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoDefinicionsBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodefinicionLogic.getTipoDefinicionsBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
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
	
	public void inicializarPermisosTipoDefinicion() {
		this.isPermisoTodoTipoDefinicion=false;
		this.isPermisoNuevoTipoDefinicion=false;
		this.isPermisoActualizarTipoDefinicion=false;
		this.isPermisoActualizarOriginalTipoDefinicion=false;
		this.isPermisoEliminarTipoDefinicion=false;
		this.isPermisoGuardarCambiosTipoDefinicion=false;
		this.isPermisoConsultaTipoDefinicion=false;
		this.isPermisoBusquedaTipoDefinicion=false;
		this.isPermisoReporteTipoDefinicion=false;		
		this.isPermisoOrdenTipoDefinicion=false;		
		this.isPermisoPaginacionMedioTipoDefinicion=false;		
		this.isPermisoPaginacionAltoTipoDefinicion=false;
		this.isPermisoPaginacionTodoTipoDefinicion=false;
		this.isPermisoCopiarTipoDefinicion=false;		
		this.isPermisoVerFormTipoDefinicion=false;		
		this.isPermisoDuplicarTipoDefinicion=false;		
		this.isPermisoOrdenTipoDefinicion=false;		
	}
	
	public void setPermisosUsuarioTipoDefinicion(Boolean isPermiso) {
		this.isPermisoTodoTipoDefinicion=isPermiso;
		this.isPermisoNuevoTipoDefinicion=isPermiso;
		this.isPermisoActualizarTipoDefinicion=isPermiso;
		this.isPermisoActualizarOriginalTipoDefinicion=isPermiso;
		this.isPermisoEliminarTipoDefinicion=isPermiso;
		this.isPermisoGuardarCambiosTipoDefinicion=isPermiso;
		this.isPermisoConsultaTipoDefinicion=isPermiso;
		this.isPermisoBusquedaTipoDefinicion=isPermiso;
		this.isPermisoReporteTipoDefinicion=isPermiso;
		this.isPermisoOrdenTipoDefinicion=isPermiso;		
		this.isPermisoPaginacionMedioTipoDefinicion=isPermiso;		
		this.isPermisoPaginacionAltoTipoDefinicion=isPermiso;		
		this.isPermisoPaginacionTodoTipoDefinicion=isPermiso;		
		this.isPermisoCopiarTipoDefinicion=isPermiso;		
		this.isPermisoVerFormTipoDefinicion=isPermiso;		
		this.isPermisoDuplicarTipoDefinicion=isPermiso;
		this.isPermisoOrdenTipoDefinicion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoDefinicion(Boolean isPermiso) {
		//this.isPermisoTodoTipoDefinicion=isPermiso;
		this.isPermisoNuevoTipoDefinicion=isPermiso;
		this.isPermisoActualizarTipoDefinicion=isPermiso;
		this.isPermisoActualizarOriginalTipoDefinicion=isPermiso;
		this.isPermisoEliminarTipoDefinicion=isPermiso;
		this.isPermisoGuardarCambiosTipoDefinicion=isPermiso;
		//this.isPermisoConsultaTipoDefinicion=isPermiso;
		//this.isPermisoBusquedaTipoDefinicion=isPermiso;
		//this.isPermisoReporteTipoDefinicion=isPermiso;
		//this.isPermisoOrdenTipoDefinicion=isPermiso;		
		//this.isPermisoPaginacionMedioTipoDefinicion=isPermiso;		
		//this.isPermisoPaginacionAltoTipoDefinicion=isPermiso;		
		//this.isPermisoPaginacionTodoTipoDefinicion=isPermiso;		
		//this.isPermisoCopiarTipoDefinicion=isPermiso;		
		//this.isPermisoDuplicarTipoDefinicion=isPermiso;
		//this.isPermisoOrdenTipoDefinicion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoDefinicionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
		if(TipoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosDefinicion=this.verificarGetPermisosUsuarioOpcionTipoDefinicionClaseRelacionada(this.opcionsRelacionadas,DefinicionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoDefinicion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoDefinicionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDefinicion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoDefinicionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoDefinicionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoDefinicionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDefinicion && this.jInternalFrameDetalleFormTipoDefinicion!=null && this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDefinicion.jTabbedPaneRelacionesTipoDefinicion.remove(this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoDefinicion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoDefinicionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoDefinicion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoDefinicion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoDefinicion=this.isPermisoActualizarTipoDefinicion;
			this.isPermisoEliminarTipoDefinicion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoDefinicion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoDefinicion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoDefinicion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoDefinicion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoDefinicion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDefinicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoDefinicion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoDefinicion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoDefinicion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoDefinicion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoDefinicion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoDefinicion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoDefinicion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoDefinicion.setToolTipText(this.jTableDatosTipoDefinicion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoDefinicion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoDefinicion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoDefinicion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDefinicion && this.tipodefinicionConstantesFunciones.mostrarDefinicionTipoDefinicion && !TipoDefinicionConstantesFunciones.ISGUARDARREL) {

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
	
		
	public void inicializarCombosForeignKeyTipoDefinicionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoDefinicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoDefinicionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoDefinicionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoDefinicionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoDefinicion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoDefinicion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoDefinicion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoDefinicion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDefinicion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoDefinicion(TipoDefinicion tipodefinicion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoDefinicion(TipoDefinicion tipodefinicion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoDefinicion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoDefinicion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoDefinicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoDefinicion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoDefinicion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoDefinicion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoDefinicion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoDefinicion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoDefinicionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoDefinicionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoDefinicionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipodefinicionSessionBean=new TipoDefinicionSessionBean(); 
		this.tipodefinicionConstantesFunciones=new TipoDefinicionConstantesFunciones(); 
		this.tipodefinicionBean=new TipoDefinicion();//(this.tipodefinicionConstantesFunciones); 		
		this.tipodefinicionReturnGeneral=new TipoDefinicionParameterReturnGeneral(); 
		
		this.tipodefinicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodefinicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoDefinicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoDefinicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoDefinicionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoDefinicion(true);
			
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
			
			this.tipodefinicionConstantesFunciones=new TipoDefinicionConstantesFunciones(); 
			this.tipodefinicionBean=new TipoDefinicion();//this.tipodefinicionConstantesFunciones); 			
			this.tipodefinicionReturnGeneral=new TipoDefinicionParameterReturnGeneral(); 
		
			TipoDefinicionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Definicion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipodefinicion=new TipoDefinicion();
			this.tipodefinicions = new ArrayList<TipoDefinicion>();
			this.tipodefinicionsAux = new ArrayList<TipoDefinicion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic=new TipoDefinicionLogic();
				this.tipodefinicionLogic.getNewConnexionToDeep("");
			}
			
			//this.tipodefinicionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipodefinicionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoDefinicion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoDefinicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDefinicion);	
					}
					
					if(this.jInternalFrameImportacionTipoDefinicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDefinicion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoDefinicion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoDefinicion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDefinicion);
				this.jInternalFrameDetalleFormTipoDefinicion.setVisible(false);
				this.jInternalFrameDetalleFormTipoDefinicion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoDefinicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDefinicion);
					this.jInternalFrameReporteDinamicoTipoDefinicion.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoDefinicion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoDefinicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoDefinicion);
					this.jInternalFrameImportacionTipoDefinicion.setVisible(false);
					this.jInternalFrameImportacionTipoDefinicion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoDefinicion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoDefinicion);
					this.jInternalFrameOrderByTipoDefinicion.setVisible(false);
					this.jInternalFrameOrderByTipoDefinicion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoDefinicionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoDefinicionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipodefinicionReturnGeneral=new TipoDefinicionParameterReturnGeneral();
			
			this.tipodefinicionParameterGeneral=new TipoDefinicionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipodefinicionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoDefinicionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDefinicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodefinicionSessionBean.getEsGuardarRelacionado(),this.tipodefinicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoDefinicionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipodefinicionSessionBean.getEsGuardarRelacionado(),this.tipodefinicionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoDefinicion=false;
			this.isVisibilidadCeldaDuplicarTipoDefinicion=true;
			this.isVisibilidadCeldaCopiarTipoDefinicion=true;
			this.isVisibilidadCeldaVerFormTipoDefinicion=true;
			this.isVisibilidadCeldaOrdenTipoDefinicion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoDefinicion=false;
			this.isVisibilidadCeldaGuardarTipoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoDefinicion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoDefinicion(false);
			
			this.setPermisosUsuarioTipoDefinicion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado() 
				|| (this.tipodefinicionSessionBean.getEsGuardarRelacionado() && this.tipodefinicionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoDefinicionClasesRelacionadas();
			}
			
			if(this.tipodefinicionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoDefinicionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoDefinicion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoDefinicion();
			}
			
			if(!this.isPermisoBusquedaTipoDefinicion) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoDefinicion.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoDefinicion,this.isPermisoPaginacionMedioTipoDefinicion,this.isPermisoPaginacionTodoTipoDefinicion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoDefinicionConstantesFunciones.getTiposSeleccionarTipoDefinicion());
				
				this.tiposColumnasSelect=TipoDefinicionConstantesFunciones.getTiposSeleccionarTipoDefinicion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoDefinicion();				
				//this.tiposRelacionesSelect=TipoDefinicionConstantesFunciones.getTiposRelacionesTipoDefinicion(true);
				
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
			//if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoDefinicion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoDefinicion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoDefinicion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDefinicion() ;
			
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
				tipodefinicionImplementable= (TipoDefinicionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDefinicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipodefinicionImplementableHome= (TipoDefinicionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoDefinicionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipodefinicions= new ArrayList<TipoDefinicion>();
			this.tipodefinicionsEliminados= new ArrayList<TipoDefinicion>();
						
			this.isEsNuevoTipoDefinicion=false;
			this.esParaAccionDesdeFormularioTipoDefinicion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoDefinicion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoDefinicion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoDefinicionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoDefinicion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoDefinicion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoDefinicion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoDefinicion();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoDefinicion.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoDefinicion.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoDefinicion.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoDefinicion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoDefinicion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoDefinicion() {
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
			if(sTipo.equals("RelacionesTipoDefinicion")) {
				iIndex=this.jInternalFrameDetalleFormTipoDefinicion.jTabbedPaneRelacionesTipoDefinicion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoDefinicion.jTabbedPaneRelacionesTipoDefinicion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();	
				
				

				if(sTitle.equals("Definiciones")) {
					if(!DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoDefinicion();

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
				this.finishProcessTipoDefinicion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDefinicion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoDefinicion.cargarSessionConBeanSwingJInternalFrameDefinicion(false,true,iIndex);
		this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDefinicion();

		//this.jTabbedPaneRelacionesTipoDefinicion.updateUI();
		//this.jTabbedPaneRelacionesTipoDefinicion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoDefinicion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Definicion")) {
				int row=this.jTableDatosTipoDefinicion.getSelectedRow();
				jButtonDefinicionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Definicion")) {

					if(this.isTienePermisosDefinicion && this.tipodefinicionConstantesFunciones.mostrarDefinicionTipoDefinicion && !TipoDefinicionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Definiciones"+"("+DefinicionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Definiciones");

						if(tipodefinicionConstantesFunciones.resaltarDefinicionTipoDefinicion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipodefinicionConstantesFunciones.resaltarDefinicionTipoDefinicion);
						}

						jmenuItem.setEnabled(this.tipodefinicionConstantesFunciones.activarDefinicionTipoDefinicion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Definicion"));

						

						this.jInternalFrameDetalleFormTipoDefinicion.jmenuDetalleTipoDefinicion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoDefinicion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoDefinicion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoDefinicion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoDefinicionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoDefinicion();
		
		this.cargarCombosFrameForeignKeyTipoDefinicion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoDefinicion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoDefinicion();
		}
	}
	
	
	
	public void jButtonNuevoTipoDefinicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipodefinicionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			
			
			if(jTableDatosTipoDefinicion.getRowCount()>=1) {
				jTableDatosTipoDefinicion.removeRowSelectionInterval(0, jTableDatosTipoDefinicion.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoDefinicion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoDefinicion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoDefinicion(true);			
			//this.tipodefinicion=new TipoDefinicion();
			//this.tipodefinicion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDefinicion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDefinicion() ;
			
			if(TipoDefinicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDefinicion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipodefinicion);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);				
			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			
			if(this.tipodefinicionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoDefinicion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoDefinicionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoDefinicion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoDefinicion.getSelectedRows().length;			
			}
			
			tipodefinicionsSeleccionados=this.getTipoDefinicionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoDefinicion--;			
				//TipoDefinicion tipodefinicionAux= new TipoDefinicion();			
				//tipodefinicionAux.setId(this.iIdNuevoTipoDefinicion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoDefinicion tipodefinicionOrigen=new TipoDefinicion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoDefinicion tipodefinicionOrigen : tipodefinicionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipodefinicionOrigen =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipodefinicionOrigen =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoDefinicion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipodefinicion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoDefinicion(tipodefinicionOrigen,this.tipodefinicion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodefinicionLogic.getTipoDefinicions().add(this.tipodefinicionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodefinicions.add(this.tipodefinicionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoDefinicion(false);
				
				this.jTableDatosTipoDefinicion.setRowSelectionInterval(this.getIndiceNuevoTipoDefinicion(), this.getIndiceNuevoTipoDefinicion());
				
				int iLastRow =  this.jTableDatosTipoDefinicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDefinicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDefinicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDefinicion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();									
		
			TipoDefinicion tipodefinicionOrigen=new TipoDefinicion();
			TipoDefinicion tipodefinicionDestino=new TipoDefinicion();
				
			tipodefinicionsSeleccionados=this.getTipoDefinicionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoDefinicion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipodefinicionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoDefinicion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodefinicionOrigen =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodefinicionOrigen =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipodefinicionDestino =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipodefinicionDestino =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipodefinicionOrigen =tipodefinicionsSeleccionados.get(0);
				tipodefinicionDestino =tipodefinicionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoDefinicion(tipodefinicionOrigen,tipodefinicionDestino,true,false);
				
				tipodefinicionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipodefinicionDestino,tipodefinicionLogic.getTipoDefinicions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipodefinicionDestino,tipodefinicions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoDefinicion(false);
				
				//this.jTableDatosTipoDefinicion.setRowSelectionInterval(this.getIndiceNuevoTipoDefinicion(), this.getIndiceNuevoTipoDefinicion());
				
				int iLastRow =  this.jTableDatosTipoDefinicion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoDefinicion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoDefinicion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDefinicion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoDefinicion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoDefinicion.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoDefinicion.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoDefinicion.setVisible(!isVisible);
			this.jPanelPaginacionTipoDefinicion.setVisible(!isVisible);
			this.jPanelAccionesTipoDefinicion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoDefinicion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoDefinicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoDefinicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoDefinicion();
			
			this.abrirFrameOrderByTipoDefinicion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoDefinicion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoDefinicion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDefinicion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoDefinicion.isMaximum()) {
					this.jInternalFrameDetalleFormTipoDefinicion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoDefinicion.setSize(this.jInternalFrameDetalleFormTipoDefinicion.iWidthFormulario,this.jInternalFrameDetalleFormTipoDefinicion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoDefinicion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoDefinicion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoDefinicion.isMaximum()) {
						this.jInternalFrameDetalleFormTipoDefinicion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoDefinicion.jContentPaneDetalleTipoDefinicion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoDefinicion.jTabbedPaneRelacionesTipoDefinicion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoDefinicion.jContentPaneDetalleTipoDefinicion.getWidth(),TipoDefinicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDefinicion.jTabbedPaneRelacionesTipoDefinicion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoDefinicion.jContentPaneDetalleTipoDefinicion.getWidth(),TipoDefinicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoDefinicion.jTabbedPaneRelacionesTipoDefinicion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoDefinicion.jContentPaneDetalleTipoDefinicion.getWidth(),TipoDefinicionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDefinicion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoDefinicion.setVisible(true);
	        this.jInternalFrameDetalleFormTipoDefinicion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoDefinicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoDefinicion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDefinicion,false,this);
				} else {
					this.jInternalFrameOrderByTipoDefinicion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoDefinicion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoDefinicion);
				this.jInternalFrameOrderByTipoDefinicion.setVisible(false);
				this.jInternalFrameOrderByTipoDefinicion.setSelected(false);
				
				this.jInternalFrameOrderByTipoDefinicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDefinicion"));
				
				this.inicializarActualizarBindingTablaOrderByTipoDefinicion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoDefinicion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoDefinicion==null) {
				
				this.jInternalFrameImportacionTipoDefinicion=new ImportacionJInternalFrame(TipoDefinicionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoDefinicion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoDefinicion);
				this.jInternalFrameImportacionTipoDefinicion.setVisible(false);
				this.jInternalFrameImportacionTipoDefinicion.setSelected(false);


				this.jInternalFrameImportacionTipoDefinicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDefinicion"));
				this.jInternalFrameImportacionTipoDefinicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDefinicion"));
				this.jInternalFrameImportacionTipoDefinicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDefinicion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoDefinicion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoDefinicion==null) {
				this.jInternalFrameReporteDinamicoTipoDefinicion=new ReporteDinamicoJInternalFrame(TipoDefinicionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoDefinicion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoDefinicion);
				this.jInternalFrameReporteDinamicoTipoDefinicion.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoDefinicion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoDefinicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDefinicion"));
				this.jInternalFrameReporteDinamicoTipoDefinicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDefinicion"));
				this.jInternalFrameReporteDinamicoTipoDefinicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDefinicion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDefinicion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDefinicion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoDefinicion.jContentPaneDetalleTipoDefinicion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoDefinicion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoDefinicion);
			
	       	this.jInternalFrameDetalleFormTipoDefinicion.setVisible(false);
	        this.jInternalFrameDetalleFormTipoDefinicion.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoDefinicion.dispose();
			//this.jInternalFrameDetalleFormTipoDefinicion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoDefinicion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoDefinicion.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoDefinicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoDefinicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoDefinicion.setVisible(true);
	        this.jInternalFrameImportacionTipoDefinicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoDefinicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoDefinicion.setVisible(true);
	        this.jInternalFrameOrderByTipoDefinicion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoDefinicion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoDefinicion.setVisible(false);
	        this.jInternalFrameOrderByTipoDefinicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoDefinicion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoDefinicion.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoDefinicion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoDefinicion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoDefinicion.setVisible(false);
	        this.jInternalFrameImportacionTipoDefinicion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoDefinicion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoDefinicion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoDefinicion(true);
			//this.isEsNuevoTipoDefinicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicion =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodefinicion =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoDefinicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDefinicion(false) ;
			
			if(tipodefinicionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoDefinicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDefinicion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDefinicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoDefinicionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicion =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodefinicion =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoDefinicion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoDefinicion(true);
			//this.isEsNuevoTipoDefinicion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicion =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodefinicion =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipodefinicion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoDefinicion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoDefinicion(false) ;
			
			if(TipoDefinicionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoDefinicion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDefinicion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoDefinicion(false);
			
			//if(!this.isEsNuevoTipoDefinicion) {								
				int intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicion =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipodefinicion =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoDefinicion(this.tipodefinicion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);
				
			}
			
			if(this.permiteMantenimiento(this.tipodefinicion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoDefinicion=true;
					this.inicializarActualizarBindingTablaTipoDefinicion(false);
					this.isEsNuevoTipoDefinicion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoDefinicion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoDefinicion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDefinicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDefinicion(false);
				
				this.habilitarDeshabilitarControlesTipoDefinicion(false);
			
												
				
				if(TipoDefinicionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoDefinicion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoDefinicionActionPerformed(evt,tipodefinicionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoDefinicion(this.tipodefinicion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoDefinicion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipodefinicionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipodefinicion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoDefinicion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDefinicion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicion =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				this.tipodefinicion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipodefinicion =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				this.tipodefinicion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipodefinicion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoDefinicionModel) this.jTableDatosTipoDefinicion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoDefinicion=true;
				this.inicializarActualizarBindingTablaTipoDefinicion(false);
				this.isEsNuevoTipoDefinicion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoDefinicion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDefinicion(false);
				
				this.habilitarDeshabilitarControlesTipoDefinicion(false);
				
				
				
				if(TipoDefinicionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoDefinicion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoDefinicion.getRowCount()>=1) {
				jTableDatosTipoDefinicion.removeRowSelectionInterval(0, jTableDatosTipoDefinicion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoDefinicion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoDefinicion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoDefinicion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoDefinicion(false) ;
			
			this.isEsNuevoTipoDefinicion=false;
			
			if(TipoDefinicionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoDefinicion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoDefinicion(false);
				
				//SI ES MANUAL
				if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoDefinicion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoDefinicion--;			
			//TipoDefinicion tipodefinicionAux= new TipoDefinicion();			
			//tipodefinicionAux.setId(this.iIdNuevoTipoDefinicion);
			
			if(this.jInternalFrameDetalleFormTipoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoDefinicion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);
			
			this.tipodefinicion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipodefinicionLogic.getTipoDefinicions().add(this.tipodefinicionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipodefinicions.add(this.tipodefinicionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoDefinicion(false);
			
			this.jTableDatosTipoDefinicion.setRowSelectionInterval(this.getIndiceNuevoTipoDefinicion(), this.getIndiceNuevoTipoDefinicion());
			
			int iLastRow =  this.jTableDatosTipoDefinicion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoDefinicion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoDefinicion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoDefinicion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoDefinicion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDefinicion(false);
			
			//SI ES MANUAL
			if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDefinicion();
			}
			
			//this.abrirFrameTreeTipoDefinicion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo DefinicionES ?", "MANTENIMIENTO DE Tipo Definicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoDefinicion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoDefinicion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipodefinicionReturnGeneral=tipodefinicionLogic.procesarImportacionTipoDefinicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipodefinicionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoDefinicionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoDefinicion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoDefinicion.setFileImportacion(this.jInternalFrameImportacionTipoDefinicion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoDefinicion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoDefinicion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoDefinicion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoDefinicion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();		

		tipodefinicionsSeleccionados=this.getTipoDefinicionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDefinicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDefinicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoDefinicionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoDefinicionBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoDefinicions("Todos",tipodefinicionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Definicion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoDefinicion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDefinicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDefinicionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoDefinicionConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoDefinicion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDefinicion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoDefinicion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoDefinicionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoDefinicionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoDefinicion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoDefinicionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoDefinicionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoDefinicion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDefinicion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoDefinicionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoDefinicionConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();		
		
		tipodefinicionsSeleccionados=this.getTipoDefinicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodefinicion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoDefinicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoDefinicion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoDefinicion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoDefinicionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDefinicionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoDefinicion tipodefinicion:tipodefinicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodefinicion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoDefinicionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoDefinicionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoDefinicion tipodefinicion:tipodefinicionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipodefinicion.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoDefinicion(row);				
			//	iRow++;
			//}				
			
			//for(TipoDefinicion tipodefinicionAux:tipodefinicionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoDefinicion(tipodefinicionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Definicion",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDefinicion(false);
			
			//SI ES MANUAL
			if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoDefinicion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDefinicion(false);
			
			//SI ES MANUAL
			if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDefinicion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoDefinicion(false);
			
			//SI ES MANUAL
			if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoDefinicion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoDefinicion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoDefinicion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoDefinicion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoDefinicion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoDefinicion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoDefinicion.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoDefinicion.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoDefinicion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoDefinicion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoDefinicion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoDefinicion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoDefinicion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoDefinicion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoDefinicion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDefinicion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoDefinicion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoDefinicionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoDefinicion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoDefinicion();
		
		this.inicializarActualizarBindingBotonesManualTipoDefinicion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDefinicion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoDefinicion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDefinicion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDefinicion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoDefinicion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoDefinicion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoDefinicion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoDefinicion.jCheckBoxPostAccionNuevoTipoDefinicion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoDefinicion.jCheckBoxPostAccionSinCerrarTipoDefinicion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoDefinicion.jCheckBoxPostAccionSinMensajeTipoDefinicion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoDefinicion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoDefinicion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoDefinicion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
				this.jInternalFrameDetalleFormTipoDefinicion.jCheckBoxPostAccionNuevoTipoDefinicion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoDefinicion.jCheckBoxPostAccionSinCerrarTipoDefinicion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoDefinicion.jCheckBoxPostAccionSinMensajeTipoDefinicion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoDefinicion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoDefinicion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoDefinicion.jComboBoxTiposAccionesFormularioTipoDefinicion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoDefinicion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoDefinicion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDefinicion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoDefinicion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoDefinicion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoDefinicion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoDefinicion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoDefinicion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoDefinicion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoDefinicion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoDefinicion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoDefinicion(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoDefinicion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoDefinicion() throws Exception {
		try	{
			if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDefinicion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDefinicion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoDefinicion.jComboBoxTiposAccionesFormularioTipoDefinicion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoDefinicion.jComboBoxTiposAccionesFormularioTipoDefinicion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoDefinicion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoDefinicion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoDefinicion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoDefinicion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoDefinicion.addItem(reporte);
			}
			
			
			if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoDefinicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoDefinicion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoDefinicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoDefinicion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoDefinicion.jComboBoxTiposAccionesFormularioTipoDefinicion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoDefinicion.jComboBoxTiposAccionesFormularioTipoDefinicion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoDefinicion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoDefinicion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoDefinicion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDefinicion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoDefinicion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDefinicion!=null) {
				this.jInternalFrameReporteDinamicoTipoDefinicion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDefinicion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoDefinicion!=null) {
				this.jInternalFrameReporteDinamicoTipoDefinicion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoDefinicion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoDefinicion!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoDefinicion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDefinicion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDefinicion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoDefinicion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoDefinicion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoDefinicion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoDefinicion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoDefinicion.getText();
		this.nombreBusquedaPorNombre=this.jTextFieldnombreBusquedaPorNombreTipoDefinicion.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoDefinicion(Boolean esInicializar) throws Exception {				
		if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoDefinicion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoDefinicion() throws Exception {
		this.inicializarActualizarBindingTablaTipoDefinicion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoDefinicion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoDefinicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoDefinicionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoDefinicionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDefinicionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoDefinicionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoDefinicionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoDefinicion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipodefinicionLogic.getTipoDefinicions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipodefinicions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoDefinicion.setModel(new TipoDefinicionModel(this.tipodefinicionLogic.getTipoDefinicions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoDefinicion.setModel(new TipoDefinicionModel(this.tipodefinicions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoDefinicion!=null && this.jInternalFrameOrderByTipoDefinicion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoDefinicion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDefinicion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoDefinicionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO,tipodefinicionConstantesFunciones.resaltarSeleccionarTipoDefinicion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoDefinicionConstantesFunciones.SCLASSWEBTITULO,tipodefinicionConstantesFunciones.resaltarSeleccionarTipoDefinicion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDefinicion,TipoDefinicionConstantesFunciones.LABEL_ID));

		if(this.tipodefinicionConstantesFunciones.mostraridTipoDefinicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDefinicionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipodefinicionConstantesFunciones.resaltaridTipoDefinicion,this.tipodefinicionConstantesFunciones.activaridTipoDefinicion,this,true,"idTipoDefinicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodefinicionConstantesFunciones.resaltaridTipoDefinicion,this.tipodefinicionConstantesFunciones.activaridTipoDefinicion,this,true,"idTipoDefinicion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDefinicion,TipoDefinicionConstantesFunciones.LABEL_CODIGO));

		if(this.tipodefinicionConstantesFunciones.mostrarcodigoTipoDefinicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDefinicionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodefinicionConstantesFunciones.resaltarcodigoTipoDefinicion,this.tipodefinicionConstantesFunciones.activarcodigoTipoDefinicion,this,true,"codigoTipoDefinicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodefinicionConstantesFunciones.resaltarcodigoTipoDefinicion,this.tipodefinicionConstantesFunciones.activarcodigoTipoDefinicion,this,true,"codigoTipoDefinicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDefinicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoDefinicion,TipoDefinicionConstantesFunciones.LABEL_NOMBRE));

		if(this.tipodefinicionConstantesFunciones.mostrarnombreTipoDefinicion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoDefinicionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipodefinicionConstantesFunciones.resaltarnombreTipoDefinicion,this.tipodefinicionConstantesFunciones.activarnombreTipoDefinicion,this,true,"nombreTipoDefinicion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipodefinicionConstantesFunciones.resaltarnombreTipoDefinicion,this.tipodefinicionConstantesFunciones.activarnombreTipoDefinicion,this,true,"nombreTipoDefinicion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoDefinicionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDefinicion && this.tipodefinicionConstantesFunciones.mostrarDefinicionTipoDefinicion && !TipoDefinicionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Definiciones");
				tableColumn.setHeaderValue("Definiciones");
				tableColumn.setCellRenderer(new DefinicionTableCell(tipodefinicionConstantesFunciones.resaltarDefinicionTipoDefinicion,this,this.tipodefinicionConstantesFunciones.activarDefinicionTipoDefinicion));
				tableColumn.setCellEditor(new DefinicionTableCell(tipodefinicionConstantesFunciones.resaltarDefinicionTipoDefinicion,this,this.tipodefinicionConstantesFunciones.activarDefinicionTipoDefinicion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoDefinicion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodefinicionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodefinicionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDefinicion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipodefinicionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipodefinicionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoDefinicion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoDefinicion && this.isPermisoGuardarCambiosTipoDefinicion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipodefinicionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipodefinicionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoDefinicion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipodefinicionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoDefinicion.addColumn(tableColumn);
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
			
			this.jTableDatosTipoDefinicion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDefinicion && this.isPermisoGuardarCambiosTipoDefinicion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodefinicionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoDefinicion && this.isPermisoGuardarCambiosTipoDefinicion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoDefinicion.moveColumn(this.jTableDatosTipoDefinicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoDefinicion.moveColumn(this.jTableDatosTipoDefinicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipodefinicionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoDefinicion.moveColumn(this.jTableDatosTipoDefinicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoDefinicion.moveColumn(this.jTableDatosTipoDefinicion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoDefinicion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoDefinicion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoDefinicion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoDefinicion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoDefinicion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoDefinicion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoDefinicion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoDefinicion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipodefinicionLogic.getTipoDefinicions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipodefinicions.size()-1;
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
		//this.jTableDatosTipoDefinicion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoDefinicion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoDefinicion();
			
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
				
				//this.isEsNuevoTipoDefinicion=false;
					
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			
				if(this.tipodefinicionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoDefinicion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDefinicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDefinicion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicion =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodefinicion =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipodefinicion.getsType().equals("DUPLICADO")
				   || this.tipodefinicion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoDefinicion=true;
				
				} else {
					this.isEsNuevoTipoDefinicion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
					if(this.tipodefinicion.getId()>=0 && !this.tipodefinicion.getIsNew()) {						
						this.isEsNuevoTipoDefinicion=false;
						
					} else {
						this.isEsNuevoTipoDefinicion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoDefinicion(esRelaciones);						
				
				this.seleccionarTipoDefinicion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipodefinicion.getId()<0) {
					this.isEsNuevoTipoDefinicion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoDefinicion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoDefinicion(evt,rowIndex);
				}	
				
				if(this.tipodefinicionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoDefinicion: " + this.dDif); 
					}
				}								
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoDefinicion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipodefinicion)) {
					if(this.tipodefinicion.getId()>0) {
						this.tipodefinicion.setIsDeleted(true);
						
						this.tipodefinicionsEliminados.add(this.tipodefinicion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipodefinicionLogic.getTipoDefinicions().remove(this.tipodefinicion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipodefinicions.remove(this.tipodefinicion);				
					}
					
					
					((TipoDefinicionModel) this.jTableDatosTipoDefinicion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoDefinicion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoDefinicion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoDefinicion) {
			
			if(this.jInternalFrameDetalleFormTipoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoDefinicion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoDefinicion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicion =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodefinicion =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoDefinicion(this.tipodefinicion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoDefinicion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoDefinicion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoDefinicion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDefinicion(TipoDefinicion tipodefinicion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoDefinicion(tipodefinicion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoDefinicion(TipoDefinicion tipodefinicion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoDefinicion(tipodefinicion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoDefinicion(tipodefinicion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoDefinicion(tipodefinicion);
	}
	
	public void setVariablesObjetoActualToFormularioTipoDefinicion(TipoDefinicion tipodefinicion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldidTipoDefinicion.setText(tipodefinicion.getId().toString());
			this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldcodigoTipoDefinicion.setText(tipodefinicion.getcodigo());
			this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldnombreTipoDefinicion.setText(tipodefinicion.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoDefinicion tipodefinicionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipodefinicionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoDefinicion tipodefinicionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipodefinicionLocal=this.tipodefinicion;
			} else {
				tipodefinicionLocal=this.tipodefinicionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipodefinicionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoDefinicion(tipodefinicionLocal,true);
					
					if(tipodefinicionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipodefinicionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipodefinicionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoDefinicion(TipoDefinicion tipodefinicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDefinicion(tipodefinicion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(tipodefinicion);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDefinicion(TipoDefinicion tipodefinicion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoDefinicion(tipodefinicion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoDefinicion(TipoDefinicion tipodefinicion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoDefinicion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldidTipoDefinicion.getText()==null || this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldidTipoDefinicion.getText()=="" || this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldidTipoDefinicion.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldidTipoDefinicion.setText("0");
			}

			if(conColumnasBase) {tipodefinicion.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldidTipoDefinicion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDefinicionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDefinicion.jLabelIdTipoDefinicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodefinicion.setcodigo(this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldcodigoTipoDefinicion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDefinicionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDefinicion.jLabelcodigoTipoDefinicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipodefinicion.setnombre(this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldnombreTipoDefinicion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoDefinicionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoDefinicion.jLabelnombreTipoDefinicion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoDefinicion(TipoDefinicion tipodefinicionBean,TipoDefinicion tipodefinicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoDefinicion(TipoDefinicion tipodefinicionOrigen,TipoDefinicion tipodefinicion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodefinicionOrigen.getId()!=null && !tipodefinicionOrigen.getId().equals(0L))) {tipodefinicion.setId(tipodefinicionOrigen.getId());}}
			if(conDefault || (!conDefault && tipodefinicionOrigen.getcodigo()!=null && !tipodefinicionOrigen.getcodigo().equals(""))) {tipodefinicion.setcodigo(tipodefinicionOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipodefinicionOrigen.getnombre()!=null && !tipodefinicionOrigen.getnombre().equals(""))) {tipodefinicion.setnombre(tipodefinicionOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDefinicion(TipoDefinicion tipodefinicion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldidTipoDefinicion.setText(tipodefinicion.getId().toString());
			this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldcodigoTipoDefinicion.setText(tipodefinicion.getcodigo());
			this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldnombreTipoDefinicion.setText(tipodefinicion.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoDefinicion(TipoDefinicionBean tipodefinicionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldidTipoDefinicion.setText(tipodefinicionBean.getId().toString());
			this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldcodigoTipoDefinicion.setText(tipodefinicionBean.getcodigo());
			this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldnombreTipoDefinicion.setText(tipodefinicionBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoDefinicion(TipoDefinicionParameterReturnGeneral tipodefinicionReturnGeneral,TipoDefinicionBean tipodefinicionBean,Boolean conDefault) throws Exception { 
		try {
			TipoDefinicion tipodefinicionLocal=new TipoDefinicion();
			
			tipodefinicionLocal=tipodefinicionReturnGeneral.getTipoDefinicion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipodefinicionLocal.getId()!=null && !tipodefinicionLocal.getId().equals(0L))) {tipodefinicionBean.setId(tipodefinicionLocal.getId());}}
			if(conDefault || (!conDefault && tipodefinicionLocal.getcodigo()!=null && !tipodefinicionLocal.getcodigo().equals(""))) {tipodefinicionBean.setcodigo(tipodefinicionLocal.getcodigo());}
			if(conDefault || (!conDefault && tipodefinicionLocal.getnombre()!=null && !tipodefinicionLocal.getnombre().equals(""))) {tipodefinicionBean.setnombre(tipodefinicionLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoDefinicionGenerico(Long idTipoDefinicionSeleccionado,JComboBox jComboBoxTipoDefinicion,List<TipoDefinicion> tipodefinicionsLocal)throws Exception {
		try {
			TipoDefinicion  tipodefinicionTemp=null;

			for(TipoDefinicion tipodefinicionAux:tipodefinicionsLocal) {
				if(tipodefinicionAux.getId()!=null && tipodefinicionAux.getId().equals(idTipoDefinicionSeleccionado)) {
					tipodefinicionTemp=tipodefinicionAux;
					break;
				}
			}

			jComboBoxTipoDefinicion.setSelectedItem(tipodefinicionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoDefinicionGenerico(JComboBox jComboBoxTipoDefinicion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDefinicion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoDefinicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoDefinicion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoDefinicion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoDefinicion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoDefinicion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodefinicion=(TipoDefinicion) tipodefinicionLogic.getTipoDefinicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodefinicion =(TipoDefinicion) tipodefinicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoDefinicion tipodefinicionRow=new TipoDefinicion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodefinicionRow=(TipoDefinicion) tipodefinicionLogic.getTipoDefinicions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipodefinicionRow=(TipoDefinicion) tipodefinicions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDefinicionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoDefinicion tipodefinicion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoDefinicion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodefinicion = (TipoDefinicion)this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipodefinicion = (TipoDefinicion)this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipodefinicion!=null) {
						this.tipodefinicion = tipodefinicion;
					} else {
						this.tipodefinicion = new TipoDefinicion();
					}
				}

				if(this.isTienePermisosDefinicion && this.permiteMantenimiento(this.tipodefinicion)) {
					DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFramePopup=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFramePopup;
					} else {
						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame;
					}

					List<TipoDefinicion> tipodefinicions=new ArrayList<TipoDefinicion>();
					tipodefinicions.add(this.tipodefinicion);
					if(!esRelacionado) {
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setConGuardarRelaciones(false);
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoDefinicion.cargarDefinicionBeanSwingJInternalFrame(tipodefinicions,this.tipodefinicion,definicionBeanSwingJInternalFrame,/*conInicializar,*/definicionBeanSwingJInternalFrame.definicionSessionBean.getConGuardarRelaciones(),definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado());
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("no_relacionado");

						definicionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DefinicionConstantesFunciones.ITAMANIOFILATABLA + (DefinicionConstantesFunciones.ITAMANIOFILATABLA/2));

						definicionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoDefinicion=(TitledBorder)this.jScrollPanelDatosTipoDefinicion.getBorder();
						TitledBorder titledBorderDefinicion=(TitledBorder)definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getBorder();

						titledBorderDefinicion.setTitle(titledBorderTipoDefinicion.getTitle() + " -> Definicion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,definicionBeanSwingJInternalFrame);
						}

						definicionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(definicionBeanSwingJInternalFrame);

						definicionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipodefinicionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Definicion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoDefinicion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoDefinicion && this.isPermisoNuevoTipoDefinicion));			
			this.jButtonDuplicarTipoDefinicion.setVisible((this.isVisibilidadCeldaDuplicarTipoDefinicion && this.isPermisoDuplicarTipoDefinicion));			
			this.jButtonCopiarTipoDefinicion.setVisible((this.isVisibilidadCeldaCopiarTipoDefinicion && this.isPermisoCopiarTipoDefinicion));
			this.jButtonVerFormTipoDefinicion.setVisible((this.isVisibilidadCeldaVerFormTipoDefinicion && this.isPermisoVerFormTipoDefinicion));
			
			this.jButtonAbrirOrderByTipoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoDefinicion && this.isPermisoOrdenTipoDefinicion));			
			
			this.jButtonNuevoRelacionesTipoDefinicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion && this.isPermisoNuevoTipoDefinicion));			
			this.jButtonNuevoGuardarCambiosTipoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoDefinicion && this.isPermisoNuevoTipoDefinicion && this.isPermisoGuardarCambiosTipoDefinicion));
			
			if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonModificarTipoDefinicion.setVisible((this.isVisibilidadCeldaModificarTipoDefinicion && this.isPermisoActualizarTipoDefinicion));	
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonActualizarTipoDefinicion.setVisible((this.isVisibilidadCeldaActualizarTipoDefinicion && this.isPermisoActualizarTipoDefinicion));	
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonEliminarTipoDefinicion.setVisible((this.isVisibilidadCeldaEliminarTipoDefinicion && this.isPermisoEliminarTipoDefinicion));
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonCancelarTipoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoDefinicion);							
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonGuardarCambiosTipoDefinicion.setVisible((this.isVisibilidadCeldaGuardarTipoDefinicion && this.isPermisoGuardarCambiosTipoDefinicion));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoDefinicion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDefinicion && this.isPermisoGuardarCambiosTipoDefinicion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoDefinicion && this.isPermisoNuevoTipoDefinicion));						
			this.jButtonDuplicarToolBarTipoDefinicion.setVisible((this.isVisibilidadCeldaDuplicarTipoDefinicion && this.isPermisoDuplicarTipoDefinicion));						
			this.jButtonCopiarToolBarTipoDefinicion.setVisible((this.isVisibilidadCeldaCopiarTipoDefinicion && this.isPermisoCopiarTipoDefinicion));			
			this.jButtonVerFormToolBarTipoDefinicion.setVisible((this.isVisibilidadCeldaVerFormTipoDefinicion && this.isPermisoVerFormTipoDefinicion));			
			this.jButtonAbrirOrderByToolBarTipoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoDefinicion && this.isPermisoOrdenTipoDefinicion));
			this.jButtonNuevoRelacionesToolBarTipoDefinicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion && this.isPermisoNuevoTipoDefinicion));			
			this.jButtonNuevoGuardarCambiosToolBarTipoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoDefinicion && this.isPermisoNuevoTipoDefinicion && this.isPermisoGuardarCambiosTipoDefinicion));			
			
			if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonModificarToolBarTipoDefinicion.setVisible((this.isVisibilidadCeldaModificarTipoDefinicion && this.isPermisoActualizarTipoDefinicion));	
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonActualizarToolBarTipoDefinicion.setVisible((this.isVisibilidadCeldaActualizarTipoDefinicion  && this.isPermisoActualizarTipoDefinicion));	
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonEliminarToolBarTipoDefinicion.setVisible((this.isVisibilidadCeldaEliminarTipoDefinicion && this.isPermisoEliminarTipoDefinicion));
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonCancelarToolBarTipoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoDefinicion);				
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonGuardarCambiosToolBarTipoDefinicion.setVisible((this.isVisibilidadCeldaGuardarTipoDefinicion && this.isPermisoGuardarCambiosTipoDefinicion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoDefinicion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDefinicion && this.isPermisoGuardarCambiosTipoDefinicion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoDefinicion && this.isPermisoNuevoTipoDefinicion));			
			this.jMenuItemDuplicarTipoDefinicion.setVisible((this.isVisibilidadCeldaDuplicarTipoDefinicion && this.isPermisoDuplicarTipoDefinicion));			
			this.jMenuItemCopiarTipoDefinicion.setVisible((this.isVisibilidadCeldaCopiarTipoDefinicion && this.isPermisoCopiarTipoDefinicion));			
			this.jMenuItemVerFormTipoDefinicion.setVisible((this.isVisibilidadCeldaVerFormTipoDefinicion && this.isPermisoVerFormTipoDefinicion));			
			this.jMenuItemAbrirOrderByTipoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoDefinicion && this.isPermisoOrdenTipoDefinicion));			
			//this.jMenuItemMostrarOcultarTipoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoDefinicion && this.isPermisoOrdenTipoDefinicion));
			this.jMenuItemDetalleAbrirOrderByTipoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoDefinicion && this.isPermisoOrdenTipoDefinicion));			
			//this.jMenuItemDetalleMostrarOcultarTipoDefinicion.setVisible((this.isVisibilidadCeldaOrdenTipoDefinicion && this.isPermisoOrdenTipoDefinicion));			
			this.jMenuItemNuevoRelacionesTipoDefinicion.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion && this.isPermisoNuevoTipoDefinicion));			
			this.jMenuItemNuevoGuardarCambiosTipoDefinicion.setVisible((this.isVisibilidadCeldaNuevoTipoDefinicion && this.isPermisoNuevoTipoDefinicion && this.isPermisoGuardarCambiosTipoDefinicion));									
			
			if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
			this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemModificarTipoDefinicion.setVisible((this.isVisibilidadCeldaModificarTipoDefinicion && this.isPermisoActualizarTipoDefinicion));	
			this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemActualizarTipoDefinicion.setVisible((this.isVisibilidadCeldaActualizarTipoDefinicion && this.isPermisoActualizarTipoDefinicion));	
			this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemEliminarTipoDefinicion.setVisible((this.isVisibilidadCeldaEliminarTipoDefinicion && this.isPermisoEliminarTipoDefinicion));
			this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemCancelarTipoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoDefinicion);				
			}
			
			this.jMenuItemGuardarCambiosTipoDefinicion.setVisible((this.isVisibilidadCeldaGuardarTipoDefinicion && this.isPermisoGuardarCambiosTipoDefinicion));						
			this.jMenuItemGuardarCambiosTablaTipoDefinicion.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoDefinicion && this.isPermisoGuardarCambiosTipoDefinicion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoDefinicion=this.jButtonNuevoTipoDefinicion.isVisible();
			this.isVisibilidadCeldaDuplicarTipoDefinicion=this.jButtonDuplicarTipoDefinicion.isVisible();
			this.isVisibilidadCeldaCopiarTipoDefinicion=this.jButtonCopiarTipoDefinicion.isVisible();
			this.isVisibilidadCeldaVerFormTipoDefinicion=this.jButtonVerFormTipoDefinicion.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoDefinicion=this.jButtonAbrirOrderByTipoDefinicion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=this.jButtonNuevoRelacionesTipoDefinicion.isVisible();
			this.isVisibilidadCeldaModificarTipoDefinicion=this.jButtonModificarTipoDefinicion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
			this.isVisibilidadCeldaActualizarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jButtonActualizarTipoDefinicion.isVisible();
			this.isVisibilidadCeldaEliminarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jButtonEliminarTipoDefinicion.isVisible();
			this.isVisibilidadCeldaCancelarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jButtonCancelarTipoDefinicion.isVisible();
			this.isVisibilidadCeldaGuardarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jButtonGuardarCambiosTipoDefinicion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=this.jButtonGuardarCambiosTablaTipoDefinicion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoDefinicion=this.jButtonNuevoToolBarTipoDefinicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=this.jButtonNuevoRelacionesToolBarTipoDefinicion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
			this.isVisibilidadCeldaModificarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jButtonModificarToolBarTipoDefinicion.isVisible();
			this.isVisibilidadCeldaActualizarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jButtonActualizarToolBarTipoDefinicion.isVisible();
			this.isVisibilidadCeldaEliminarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jButtonEliminarToolBarTipoDefinicion.isVisible();
			this.isVisibilidadCeldaCancelarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jButtonCancelarToolBarTipoDefinicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDefinicion=this.jButtonGuardarCambiosToolBarTipoDefinicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=this.jButtonGuardarCambiosTablaToolBarTipoDefinicion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoDefinicion=this.jMenuItemNuevoTipoDefinicion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=this.jMenuItemNuevoRelacionesTipoDefinicion.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
			this.isVisibilidadCeldaModificarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemModificarTipoDefinicion.isVisible();
			this.isVisibilidadCeldaActualizarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemActualizarTipoDefinicion.isVisible();
			this.isVisibilidadCeldaEliminarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemEliminarTipoDefinicion.isVisible();
			this.isVisibilidadCeldaCancelarTipoDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemCancelarTipoDefinicion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoDefinicion=this.jMenuItemGuardarCambiosTipoDefinicion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=this.jMenuItemGuardarCambiosTablaTipoDefinicion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoDefinicion(Boolean esInicializar) {
		if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipodefinicionSessionBean.getConGuardarRelaciones()) {
				//if(this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDefinicion();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoDefinicion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoDefinicion() {
		this.jButtonNuevoTipoDefinicion.setVisible(this.isPermisoNuevoTipoDefinicion);			
		this.jButtonDuplicarTipoDefinicion.setVisible(this.isPermisoDuplicarTipoDefinicion);			
		this.jButtonCopiarTipoDefinicion.setVisible(this.isPermisoCopiarTipoDefinicion);			
		this.jButtonVerFormTipoDefinicion.setVisible(this.isPermisoVerFormTipoDefinicion);			
		
		this.jButtonAbrirOrderByTipoDefinicion.setVisible(this.isPermisoOrdenTipoDefinicion);					
		
		this.jButtonNuevoRelacionesTipoDefinicion.setVisible(this.isPermisoNuevoTipoDefinicion);			
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonModificarTipoDefinicion.setVisible(this.isPermisoActualizarTipoDefinicion);	
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonActualizarTipoDefinicion.setVisible(this.isPermisoActualizarTipoDefinicion);	
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonEliminarTipoDefinicion.setVisible(this.isPermisoEliminarTipoDefinicion);
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonCancelarTipoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoDefinicion);						
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonGuardarCambiosTipoDefinicion.setVisible(this.isPermisoGuardarCambiosTipoDefinicion);							
		}
		
		this.jButtonGuardarCambiosTablaTipoDefinicion.setVisible(this.isPermisoActualizarTipoDefinicion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDefinicion() {
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonModificarTipoDefinicion.setVisible(this.isPermisoActualizarTipoDefinicion);	
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonActualizarTipoDefinicion.setVisible(this.isPermisoActualizarTipoDefinicion);	
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonEliminarTipoDefinicion.setVisible(this.isPermisoEliminarTipoDefinicion);
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonCancelarTipoDefinicion.setVisible(this.isVisibilidadCeldaCancelarTipoDefinicion);							
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonGuardarCambiosTipoDefinicion.setVisible((this.isVisibilidadCeldaGuardarTipoDefinicion && this.isPermisoGuardarCambiosTipoDefinicion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoDefinicion() {
		if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoDefinicion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoDefinicion() {
	}
	
	public void jTableDatosTipoDefinicionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoDefinicion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoDefinicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDefinicion(this.gettipodefinicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodefinicion =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodefinicion =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodefinicion==null) {
						this.tipodefinicion = new TipoDefinicion();
					}

					this.setVariablesFormularioToObjetoActualTipoDefinicion(this.tipodefinicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);
				}

				if(this.tipodefinicion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipodefinicion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDefinicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoDefinicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDefinicion(this.gettipodefinicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodefinicion =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodefinicion =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodefinicion==null) {
						this.tipodefinicion = new TipoDefinicion();
					}

					this.setVariablesFormularioToObjetoActualTipoDefinicion(this.tipodefinicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);
				}

				if(this.tipodefinicion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipodefinicion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDefinicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoDefinicionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoDefinicion(this.gettipodefinicion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodefinicion =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipodefinicion =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipodefinicion==null) {
						this.tipodefinicion = new TipoDefinicion();
					}

					this.setVariablesFormularioToObjetoActualTipoDefinicion(this.tipodefinicion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);
				}

				if(this.tipodefinicion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipodefinicion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoDefinicion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDefinicion(false,false);

			this.getTipoDefinicionsBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoDefinicion(false);

			//if(TipoDefinicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDefinicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoDefinicionActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoDefinicion(false,false);

			this.getTipoDefinicionsBusquedaPorNombre();

			this.inicializarActualizarBindingTipoDefinicion(false);

			//if(TipoDefinicionBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoDefinicion(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipodefinicionLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoDefinicion() {
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
		

		if(this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
			this.jInternalFrameDetalleFormTipoDefinicion.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoDefinicion.dispose();
			this.jInternalFrameDetalleFormTipoDefinicion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoDefinicion!=null) {
			this.jInternalFrameReporteDinamicoTipoDefinicion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoDefinicion.dispose();
			this.jInternalFrameReporteDinamicoTipoDefinicion=null;
		}
		
		if(this.jInternalFrameImportacionTipoDefinicion!=null) {
			this.jInternalFrameImportacionTipoDefinicion.setVisible(false);	    			
			this.jInternalFrameImportacionTipoDefinicion.dispose();
			this.jInternalFrameImportacionTipoDefinicion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoDefinicion();
			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoDefinicion")) {
				jButtonNuevoTipoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoDefinicion")) {
				jButtonDuplicarTipoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoDefinicion")) {
				jButtonCopiarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoDefinicion")) {
				jButtonVerFormTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoDefinicion")) {
				jButtonNuevoTipoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoDefinicion")) {
				jButtonDuplicarTipoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoDefinicion")) {
				jButtonNuevoTipoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoDefinicion")) {
				jButtonDuplicarTipoDefinicionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoDefinicion")) {
				jButtonNuevoTipoDefinicionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoDefinicion")) {
				jButtonNuevoTipoDefinicionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoDefinicion")) {
				jButtonNuevoTipoDefinicionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoDefinicion")) {
				jButtonModificarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoDefinicion")) {
				jButtonModificarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoDefinicion")) {
				jButtonModificarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoDefinicion")) {
				jButtonActualizarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoDefinicion")) {
				jButtonActualizarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoDefinicion")) {
				jButtonActualizarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoDefinicion")) {
				jButtonEliminarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoDefinicion")) {
				jButtonEliminarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoDefinicion")) {
				jButtonEliminarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoDefinicion")) {
				jButtonCancelarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoDefinicion")) {
				jButtonCancelarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoDefinicion")) {
				jButtonCancelarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoDefinicion")) {
				jButtonCerrarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoDefinicion")) {
				jButtonCerrarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoDefinicion")) {
				jButtonCerrarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoDefinicion")) {
				jButtonMostrarOcultarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoDefinicion")) {
				jButtonCancelarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoDefinicion")) {
				jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoDefinicion")) {
				jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoDefinicion")) {
				jButtonCopiarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoDefinicion")) {
				jButtonVerFormTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoDefinicion")) {
				jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoDefinicion")) {
				jButtonCopiarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoDefinicion")) {
				jButtonVerFormTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoDefinicion")) {
				jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoDefinicion")) {
				jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoDefinicion")) {
				jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoDefinicion")) {
				jButtonRecargarInformacionTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoDefinicion")) {
				jButtonRecargarInformacionTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoDefinicion")) {
				jButtonRecargarInformacionTipoDefinicionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoDefinicion")) {
				jButtonAnterioresTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoDefinicion")) {
				jButtonAnterioresTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoDefinicion")) {
				jButtonAnterioresTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoDefinicion")) {
				jButtonSiguientesTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoDefinicion")) {
				jButtonSiguientesTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoDefinicion")) {
				jButtonSiguientesTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoDefinicion") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoDefinicion")) {
				jButtonAbrirOrderByTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoDefinicion") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoDefinicion")) {
				jButtonMostrarOcultarTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDefinicion")) {
				jButtonNuevoGuardarCambiosTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoDefinicion")) {
				jButtonNuevoGuardarCambiosTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoDefinicion")) {
				jButtonNuevoGuardarCambiosTipoDefinicionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoDefinicion")) {
				jButtonCerrarReporteDinamicoTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoDefinicion")) {
				jButtonGenerarReporteDinamicoTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoDefinicion")) {
				
				jButtonGenerarExcelReporteDinamicoTipoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoDefinicion")) {
				jButtonCerrarImportacionTipoDefinicionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoDefinicion")) {
				
				jButtonGenerarImportacionTipoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoDefinicion")) {
				
				jButtonAbrirImportacionTipoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoDefinicion")) {
				jComboBoxTiposAccionesTipoDefinicionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoDefinicion")) {
				jComboBoxTiposRelacionesTipoDefinicionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoDefinicion")) {
				jComboBoxTiposAccionesTipoDefinicionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoDefinicion")) {
				
				jComboBoxTiposSeleccionarTipoDefinicionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoDefinicion")) {
				jTextFieldValorCampoGeneralTipoDefinicionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoDefinicion")) {
				jButtonAbrirOrderByTipoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoDefinicion")) {
				jButtonAbrirOrderByTipoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoDefinicion")) {
				jButtonCerrarOrderByTipoDefinicionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDefinicionBusqueda")) {
				this.jButtonidTipoDefinicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDefinicionBusqueda")) {
				this.jButtoncodigoTipoDefinicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDefinicionBusqueda")) {
				this.jButtonnombreTipoDefinicionBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoDefinicion")) {
				this.jButtonBusquedaPorCodigoTipoDefinicionActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoDefinicion")) {
				this.jButtonBusquedaPorNombreTipoDefinicionActionPerformed(evt);
			}
			
			;
			
			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoDefinicion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDefinicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				


				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoDefinicion tipodefinicionLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipodefinicionLocal=this.tipodefinicion;
			} else {
				tipodefinicionLocal=this.tipodefinicionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
							
				
				


				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
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
			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			
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
			
			


			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDefinicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
								
						
				


				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDefinicion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
								
				
				


				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDefinicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
							
				
				


				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDefinicion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDefinicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
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
			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			
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
			
			


			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDefinicionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
								
				
				


				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDefinicionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDefinicionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoDefinicion")) {
					jCheckBoxSeleccionarTodosTipoDefinicionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoDefinicion")) {
					jCheckBoxSeleccionadosTipoDefinicionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoDefinicion")) {
					
				}
				
				


				
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
												
				
				


				
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDefinicion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDefinicionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDefinicionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
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
			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
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
			
			


			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoDefinicionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDefinicion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDefinicion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipodefinicion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipodefinicion);
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
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
				
				


				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoDefinicion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoDefinicion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoDefinicionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipodefinicionAnterior =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoDefinicion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoDefinicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoDefinicion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipodefinicion =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipodefinicion =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipodefinicion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoDefinicion")) {
				
				}
				
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoDefinicion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoDefinicion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoDefinicion")) {
			
			}
			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoDefinicion();
			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			
			if(sTipo.equals("NuevoTipoDefinicion")) {
				jButtonNuevoTipoDefinicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoDefinicion")) {
				jButtonDuplicarTipoDefinicionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoDefinicion")) {
				jButtonCopiarTipoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoDefinicion")) {
				jButtonVerFormTipoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoDefinicion")) {
				jButtonNuevoTipoDefinicionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoDefinicion")) {
				jButtonModificarTipoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoDefinicion")) {
				jButtonActualizarTipoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoDefinicion")) {
				jButtonEliminarTipoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoDefinicion")) {
				jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoDefinicion")) {
				jButtonCancelarTipoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoDefinicion")) {
				jButtonCerrarTipoDefinicionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoDefinicion")) {
				jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoDefinicion")) {
				jButtonNuevoGuardarCambiosTipoDefinicionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoDefinicion")) {
				jButtonAbrirOrderByTipoDefinicionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoDefinicion")) {
				jButtonRecargarInformacionTipoDefinicionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoDefinicion")) {
				jButtonAnterioresTipoDefinicionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoDefinicion")) {
				jButtonSiguientesTipoDefinicionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoDefinicionBusqueda")) {
				this.jButtonidTipoDefinicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoDefinicionBusqueda")) {
				this.jButtoncodigoTipoDefinicionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoDefinicionBusqueda")) {
				this.jButtonnombreTipoDefinicionBusquedaActionPerformed(evt);
			}
			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoDefinicion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoDefinicion")) {
				closingInternalFrameTipoDefinicion();
				
			} else if(sTipo.equals("jButtonCancelarTipoDefinicion")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoDefinicion = (JInternalFrameBase)evt.getSource();
	            	
	            TipoDefinicionBeanSwingJInternalFrame jInternalFrameParent=(TipoDefinicionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDefinicion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoDefinicionActionPerformed(null);
			}
			
			TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipodefinicion,new Object(),this.tipodefinicionParameterGeneral,this.tipodefinicionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoDefinicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoDefinicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoDefinicion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipodefinicion)) {
			if(!esControlTabla) {
				if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoDefinicion(this.tipodefinicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);			
				}
				
				if(this.tipodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoDefinicion(this.tipodefinicion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodefinicionReturnGeneral=tipodefinicionLogic.procesarEventosTipoDefinicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodefinicionLogic.getTipoDefinicions(),this.tipodefinicion,this.tipodefinicionParameterGeneral,this.isEsNuevoTipoDefinicion,classes);//this.tipodefinicionLogic.getTipoDefinicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoDefinicion(this.tipodefinicionReturnGeneral,this.tipodefinicionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipodefinicionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoDefinicion(classes,this.tipodefinicionReturnGeneral,this.tipodefinicionBean,false);
					}
						
					if(this.tipodefinicionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoDefinicion(this.tipodefinicionReturnGeneral.getTipoDefinicion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoDefinicion(this.tipodefinicionReturnGeneral.getTipoDefinicion());	
					}
						
					if(this.tipodefinicionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoDefinicion(this.tipodefinicionReturnGeneral.getTipoDefinicion(),classes);//this.tipodefinicionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoDefinicion(this.tipodefinicion,classes);//this.tipodefinicionBean);									
				}
			
				if(TipoDefinicionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoDefinicion(this.tipodefinicion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoDefinicion(this.tipodefinicion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipodefinicionAnterior!=null) {
						this.tipodefinicion=this.tipodefinicionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipodefinicionReturnGeneral=tipodefinicionLogic.procesarEventosTipoDefinicionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodefinicionLogic.getTipoDefinicions(),this.tipodefinicion,this.tipodefinicionParameterGeneral,this.isEsNuevoTipoDefinicion,classes);//this.tipodefinicionLogic.getTipoDefinicion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipodefinicionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipodefinicionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipodefinicionReturnGeneral.getTipoDefinicion(),tipodefinicionLogic.getTipoDefinicions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipodefinicionReturnGeneral.getTipoDefinicion(),this.tipodefinicions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoDefinicion.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoDefinicion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoDefinicion();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoDefinicion() throws Exception {
		
		TipoDefinicionModel tipodefinicionModel=(TipoDefinicionModel)this.jTableDatosTipoDefinicion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipodefinicionModel.tipodefinicions=this.tipodefinicionLogic.getTipoDefinicions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipodefinicionModel.tipodefinicions=this.tipodefinicions;
		}
		
		
		((TipoDefinicionModel) this.jTableDatosTipoDefinicion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoDefinicion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipodefinicionAnterior(),this.tipodefinicionLogic.getTipoDefinicions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipodefinicionAnterior(),this.tipodefinicions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoDefinicion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoDefinicion(TipoDefinicion tipodefinicion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(tipodefinicion.getDefinicions());
					this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
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
										
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodefinicion,new Object(),generalEntityParameterGeneral,this.tipodefinicionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipodefinicionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoDefinicionConstantesFunciones.getClassesRelationshipsOfTipoDefinicion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoDefinicionConstantesFunciones.getClassesRelationshipsFromStringsOfTipoDefinicion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoDefinicion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoDefinicionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipodefinicion,new Object(),generalEntityParameterGeneral,this.tipodefinicionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoDefinicion(TipoDefinicionBean tipodefinicionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(tipodefinicion.getDefinicions());
					this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoDefinicion(ArrayList<Classe> classes,TipoDefinicionReturnGeneral tipodefinicionReturnGeneral,TipoDefinicionBean tipodefinicionBean,Boolean conDefault) throws Exception {
		
			this.tipodefinicionBean.setDefinicions(tipodefinicionReturnGeneral.getTipoDefinicion().getDefinicions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoDefinicion(TipoDefinicion tipodefinicion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					tipodefinicion.setDefinicions(this.jInternalFrameDetalleFormTipoDefinicion.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipodefinicion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoDefinicion = new TipoDefinicionDetalleFormJInternalFrame(jDesktopPane,this.tipodefinicionSessionBean.getConGuardarRelaciones(),this.tipodefinicionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoDefinicion);
		this.jInternalFrameDetalleFormTipoDefinicion.setVisible(false);
		this.jInternalFrameDetalleFormTipoDefinicion.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoDefinicion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoDefinicion.tipodefinicionLogic=this.tipodefinicionLogic;
		
		this.cargarCombosFrameForeignKeyTipoDefinicion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoDefinicion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoDefinicion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoDefinicion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoDefinicion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoDefinicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDefinicion"));
		
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonModificarTipoDefinicion.addActionListener(new ButtonActionListener(this,"ModificarTipoDefinicion"));

		
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonModificarToolBarTipoDefinicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDefinicion"));
					
		this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemModificarTipoDefinicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDefinicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonActualizarTipoDefinicion.addActionListener (new ButtonActionListener(this,"ActualizarTipoDefinicion"));
		
		
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonActualizarToolBarTipoDefinicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDefinicion"));
						
		this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemActualizarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDefinicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonEliminarTipoDefinicion.addActionListener (new ButtonActionListener(this,"EliminarTipoDefinicion"));
		
		
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonEliminarToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDefinicion"));
								
		this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemEliminarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDefinicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonCancelarTipoDefinicion.addActionListener (new ButtonActionListener(this,"CancelarTipoDefinicion"));
		
		
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonCancelarToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDefinicion"));
					
		this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemCancelarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDefinicion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemDetalleCerrarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDefinicion"));		
		
		
		
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonGuardarCambiosToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDefinicion"));
		
		
		
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonGuardarCambiosToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDefinicion"));
		
		
		
		this.jInternalFrameDetalleFormTipoDefinicion.jComboBoxTiposAccionesFormularioTipoDefinicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDefinicion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonidTipoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDefinicion.jButtoncodigoTipoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonnombreTipoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDefinicionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoDefinicion.jTabbedPaneRelacionesTipoDefinicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDefinicion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoDefinicion"));
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoDefinicion"));
		}
		
		this.jTableDatosTipoDefinicion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoDefinicion"));
		
		this.jTableDatosTipoDefinicion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoDefinicion"));
		
		this.jButtonNuevoTipoDefinicion.addActionListener(new ButtonActionListener(this,"NuevoTipoDefinicion"));
		
		this.jButtonDuplicarTipoDefinicion.addActionListener(new ButtonActionListener(this,"DuplicarTipoDefinicion"));
		
		this.jButtonCopiarTipoDefinicion.addActionListener(new ButtonActionListener(this,"CopiarTipoDefinicion"));
		
		this.jButtonVerFormTipoDefinicion.addActionListener(new ButtonActionListener(this,"VerFormTipoDefinicion"));
		
		
		this.jButtonNuevoToolBarTipoDefinicion.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoDefinicion"));
			
		this.jButtonDuplicarToolBarTipoDefinicion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoDefinicion"));
			
		this.jMenuItemNuevoTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoDefinicion"));
			
		this.jMenuItemDuplicarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoDefinicion"));		
		
		
		this.jButtonNuevoRelacionesTipoDefinicion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoDefinicion"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoDefinicion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoDefinicion"));
			
		this.jMenuItemNuevoRelacionesTipoDefinicion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoDefinicion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonModificarTipoDefinicion.addActionListener(new ButtonActionListener(this,"ModificarTipoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonModificarToolBarTipoDefinicion.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoDefinicion"));
			
			this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemModificarTipoDefinicion.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoDefinicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonActualizarTipoDefinicion.addActionListener (new ButtonActionListener(this,"ActualizarTipoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonActualizarToolBarTipoDefinicion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoDefinicion"));
				
			this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemActualizarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoDefinicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonEliminarTipoDefinicion.addActionListener (new ButtonActionListener(this,"EliminarTipoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonEliminarToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoDefinicion"));
						
			this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemEliminarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoDefinicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonCancelarTipoDefinicion.addActionListener (new ButtonActionListener(this,"CancelarTipoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonCancelarToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoDefinicion"));
			
			this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemCancelarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoDefinicion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoDefinicion"));		
		
		
		this.jButtonCerrarTipoDefinicion.addActionListener (new ButtonActionListener(this,"CerrarTipoDefinicion"));
		
		
		this.jButtonCerrarToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoDefinicion"));
			
		this.jMenuItemCerrarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoDefinicion"));
			
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.jMenuItemDetalleCerrarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoDefinicion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonGuardarCambiosTipoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoDefinicion"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.jButtonGuardarCambiosToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoDefinicion"));
		}
		
		this.jButtonCopiarToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoDefinicion"));
			
		this.jButtonVerFormToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoDefinicion"));
		
		this.jMenuItemGuardarCambiosTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoDefinicion"));
			
		this.jMenuItemCopiarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoDefinicion"));		
		
		this.jMenuItemVerFormTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoDefinicion"));		
		
		
		this.jButtonGuardarCambiosTablaTipoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDefinicion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoDefinicion"));
			
		this.jMenuItemGuardarCambiosTablaTipoDefinicion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoDefinicion"));		
		
		
		
		this.jButtonRecargarInformacionTipoDefinicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoDefinicion"));
					
		this.jButtonRecargarInformacionToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoDefinicion"));
		
		this.jMenuItemRecargarInformacionTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoDefinicion"));		
		
		
		
		this.jButtonAnterioresTipoDefinicion.addActionListener (new ButtonActionListener(this,"AnterioresTipoDefinicion"));
		
		
		this.jButtonAnterioresToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoDefinicion"));
		
		this.jMenuItemAnterioresTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoDefinicion"));		
		
		
		this.jButtonSiguientesTipoDefinicion.addActionListener (new ButtonActionListener(this,"SiguientesTipoDefinicion"));
		
		
		this.jButtonSiguientesToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoDefinicion"));
			
		this.jMenuItemSiguientesTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoDefinicion"));
			
		this.jMenuItemAbrirOrderByTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoDefinicion"));
			
		this.jMenuItemMostrarOcultarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoDefinicion"));
			
		this.jMenuItemDetalleAbrirOrderByTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoDefinicion"));
			
		this.jMenuItemDetalleMostarOcultarTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoDefinicion"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoDefinicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoDefinicion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoDefinicion"));
			
		this.jMenuItemNuevoGuardarCambiosTipoDefinicion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoDefinicion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoDefinicion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoDefinicion"));

		this.jCheckBoxSeleccionadosTipoDefinicion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoDefinicion"));
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.jComboBoxTiposAccionesFormularioTipoDefinicion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoDefinicion"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoDefinicion.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoDefinicion"));
			
		this.jComboBoxTiposAccionesTipoDefinicion.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoDefinicion"));
					
		this.jComboBoxTiposSeleccionarTipoDefinicion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoDefinicion"));
			
		this.jTextFieldValorCampoGeneralTipoDefinicion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoDefinicion"));		
		
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonidTipoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDefinicion.jButtoncodigoTipoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonnombreTipoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDefinicionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoDefinicion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDefinicion"));

			this.jButtonBusquedaPorNombreTipoDefinicion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDefinicion"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoDefinicion!=null) {
				this.jInternalFrameReporteDinamicoTipoDefinicion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDefinicion"));
				this.jInternalFrameReporteDinamicoTipoDefinicion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDefinicion"));
				this.jInternalFrameReporteDinamicoTipoDefinicion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDefinicion"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoDefinicion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoDefinicion"));				
			//this.jButtonGenerarReporteDinamicoTipoDefinicion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoDefinicion"));
			//this.jButtonGenerarExcelReporteDinamicoTipoDefinicion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoDefinicion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoDefinicion!=null) {
				this.jInternalFrameImportacionTipoDefinicion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoDefinicion"));
				this.jInternalFrameImportacionTipoDefinicion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoDefinicion"));
				this.jInternalFrameImportacionTipoDefinicion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoDefinicion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoDefinicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoDefinicion"));
			
			this.jButtonAbrirOrderByToolBarTipoDefinicion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoDefinicion"));			
			
			if(this.jInternalFrameOrderByTipoDefinicion!=null) {
				this.jInternalFrameOrderByTipoDefinicion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoDefinicion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoDefinicion.jTabbedPaneRelacionesTipoDefinicion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoDefinicion"));
		
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
            		closingInternalFrameTipoDefinicion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoDefinicion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoDefinicion = (JInternalFrameBase)event.getSource();
	            	
	            TipoDefinicionBeanSwingJInternalFrame jInternalFrameParent=(TipoDefinicionBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoDefinicion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoDefinicionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoDefinicion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoDefinicionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoDefinicion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoDefinicion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDefinicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDefinicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDefinicionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoDefinicion";
		inputMap = this.jButtonNuevoTipoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDefinicionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDefinicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDefinicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoDefinicionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoDefinicion";
		inputMap = this.jButtonNuevoRelacionesTipoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoDefinicionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoDefinicion";
		inputMap = this.jButtonModificarTipoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoDefinicion";
		inputMap = this.jButtonActualizarTipoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoDefinicion";
		inputMap = this.jButtonEliminarTipoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoDefinicion";
		inputMap = this.jButtonCancelarTipoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoDefinicion";
		inputMap = this.jButtonCerrarTipoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonGuardarCambiosTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoDefinicion";
		inputMap = this.jInternalFrameDetalleFormTipoDefinicion.jButtonGuardarCambiosTipoDefinicion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonGuardarCambiosTipoDefinicion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoDefinicionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoDefinicion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoDefinicionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoDefinicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoDefinicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoDefinicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoDefinicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoDefinicion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoDefinicionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonidTipoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"idTipoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDefinicion.jButtoncodigoTipoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoDefinicionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoDefinicion.jButtonnombreTipoDefinicionBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoDefinicionBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoDefinicion.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoDefinicion"));

		this.jButtonBusquedaPorNombreTipoDefinicion.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoDefinicion"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoDefinicion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoDefinicionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoDefinicionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoDefinicion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoDefinicion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoDefinicion tipodefinicionAux:this.tipodefinicionLogic.getTipoDefinicions()) {
					tipodefinicionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDefinicion tipodefinicionAux:tipodefinicions) {
					tipodefinicionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoDefinicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDefinicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDefinicion tipodefinicionAux:this.tipodefinicionLogic.getTipoDefinicions()) {
						tipodefinicionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDefinicion tipodefinicionAux:tipodefinicions) {
						tipodefinicionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoDefinicion tipodefinicionAux:this.tipodefinicionLogic.getTipoDefinicions()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDefinicion tipodefinicionAux:tipodefinicions) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDefinicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDefinicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDefinicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDefinicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoDefinicionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoDefinicion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoDefinicion.getSelectedRows();
			
			TipoDefinicion tipodefinicionLocal=new TipoDefinicion();
			
			//this.seleccionarTodosTipoDefinicion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipodefinicionLocal =(TipoDefinicion) this.tipodefinicionLogic.getTipoDefinicions().toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipodefinicionLocal =(TipoDefinicion) this.tipodefinicions.toArray()[this.jTableDatosTipoDefinicion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipodefinicionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoDefinicion tipodefinicionAux:this.tipodefinicionLogic.getTipoDefinicions()) {
						tipodefinicionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoDefinicion tipodefinicionAux:tipodefinicions) {
						tipodefinicionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoDefinicion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoDefinicion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoDefinicion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoDefinicion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoDefinicionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoDefinicionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoDefinicionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoDefinicion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoDefinicion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoDefinicion tipodefinicionAux:this.tipodefinicionLogic.getTipoDefinicions()) {
				
						if(sTipoSeleccionar.equals(TipoDefinicionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodefinicionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDefinicionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodefinicionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDefinicion tipodefinicionAux:tipodefinicions) {
					
						if(sTipoSeleccionar.equals(TipoDefinicionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipodefinicionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoDefinicionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipodefinicionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoDefinicion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoDefinicionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoDefinicion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoDefinicion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoDefinicion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoDefinicion.jComboBoxTiposAccionesFormularioTipoDefinicion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoDefinicion) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoDefinicion(conSplash);
				
					this.generarReporteTipoDefinicionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDefinicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDefinicion.jComboBoxTiposAccionesFormularioTipoDefinicion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoDefinicionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoDefinicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDefinicionsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoDefinicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoDefinicionsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoDefinicion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDefinicion();
				
				this.exportarTipoDefinicionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDefinicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDefinicion.jComboBoxTiposAccionesFormularioTipoDefinicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoDefinicions();
				//this.importarTipoDefinicions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDefinicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDefinicion.jComboBoxTiposAccionesFormularioTipoDefinicion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoDefinicion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoDefinicionsSeleccionados();
				//this.jComboBoxTiposAccionesTipoDefinicion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Definicion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoDefinicion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoDefinicion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoDefinicion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Definicion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoDefinicion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoDefinicion.jComboBoxTiposAccionesFormularioTipoDefinicion.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoDefinicion();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoDefinicion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoDefinicionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoDefinicion();
			
			if(this.jInternalFrameDetalleFormTipoDefinicion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();		
			TipoDefinicion tipodefinicion=new TipoDefinicion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoDefinicion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoDefinicion.getSelectedItem();
			
			
			
			
			tipodefinicionsSeleccionados=this.getTipoDefinicionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipodefinicionsSeleccionados.size()==1) {
				for(TipoDefinicion tipodefinicionAux:tipodefinicionsSeleccionados) {
					tipodefinicion=tipodefinicionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Definicion")) {
					jButtonDefinicionActionPerformed(null,rowIndex,true,false,tipodefinicion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoDefinicion();
			
      		//this.finishProcessTipoDefinicion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoDefinicionReturnGeneral() throws Exception {
		if(this.tipodefinicionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipodefinicionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipodefinicionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipodefinicionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipodefinicionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipodefinicionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoDefinicion(false);
		}
		
		if(this.tipodefinicionReturnGeneral.getConRetornoLista() || this.tipodefinicionReturnGeneral.getConRetornoObjeto()) {
			if(this.tipodefinicionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodefinicionLogic.setTipoDefinicions(this.tipodefinicionReturnGeneral.getTipoDefinicions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipodefinicionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipodefinicionLogic.setTipoDefinicion(this.tipodefinicionReturnGeneral.getTipoDefinicion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoDefinicion(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoDefinicion() throws Exception {
		
		
	}
	
	public ArrayList<TipoDefinicion> getTipoDefinicionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoDefinicion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoDefinicion tipodefinicionAux:tipodefinicionLogic.getTipoDefinicions()) {
					if(tipodefinicionAux.getIsSelected()) {
						tipodefinicionsSeleccionados.add(tipodefinicionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoDefinicion tipodefinicionAux:this.tipodefinicions) {
					if(tipodefinicionAux.getIsSelected()) {
						tipodefinicionsSeleccionados.add(tipodefinicionAux);				
					}
				}
			}
			
			if(tipodefinicionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipodefinicionsSeleccionados.addAll(this.tipodefinicionLogic.getTipoDefinicions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipodefinicionsSeleccionados.addAll(this.tipodefinicions);				
					}
				}
			}
		} else {
			tipodefinicionsSeleccionados.add(this.tipodefinicion);
		}
		
		return tipodefinicionsSeleccionados;
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
	
	public void generarReporteTipoDefinicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoDefinicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoDefinicionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDefinicionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoDefinicionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoDefinicionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Definicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();		
		
		tipodefinicionsSeleccionados=this.getTipoDefinicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoDefinicions("Todos",tipodefinicionsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();		
		
		tipodefinicionsSeleccionados=this.getTipoDefinicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoDefinicions("Todos",tipodefinicionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoDefinicionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();
		
		tipodefinicionsSeleccionados=this.getTipoDefinicionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoDefinicions("Todos",tipodefinicionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoDefinicion();
		
		
		tipodefinicionsSeleccionados=this.getTipoDefinicionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoDefinicion();
		
		
		//this.generarReporteTipoDefinicions("Todos",tipodefinicionsSeleccionados ,tipodefinicionImplementable,tipodefinicionImplementableHome);
	}
	
	public void mostrarImportacionTipoDefinicions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoDefinicion();
		
		this.abrirFrameImportacionTipoDefinicion();		
		
			
		//this.generarReporteTipoDefinicions("Todos",tipodefinicionsSeleccionados ,tipodefinicionImplementable,tipodefinicionImplementableHome);
	}
	
	public void importarTipoDefinicions() throws Exception {		
	
	}
	
	public void exportarTipoDefinicionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoDefinicionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoDefinicionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoDefinicionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Definicion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();		
		
		tipodefinicionsSeleccionados=this.getTipoDefinicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodefinicion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoDefinicion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoDefinicion tipodefinicionAux:tipodefinicionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoDefinicion(tipodefinicionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipodefinicionAux.setsDetalleGeneralEntityReporte(tipodefinicionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Definicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoDefinicion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoDefinicionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDefinicionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDefinicionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoDefinicionConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoDefinicion(TipoDefinicion tipodefinicion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipodefinicion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodefinicion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodefinicion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipodefinicion.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();		
		
		tipodefinicionsSeleccionados=this.getTipoDefinicionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodefinicion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoDefinicions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoDefinicion(row);				
				iRow++;
			}				
			
			for(TipoDefinicion tipodefinicionAux:tipodefinicionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoDefinicion(tipodefinicionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Definicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoDefinicionsSeleccionados() throws Exception {
		ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();		
		
		tipodefinicionsSeleccionados=this.getTipoDefinicionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipodefinicion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipodefinicions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipodefinicion");
			//elementRoot.appendChild(element);
		
			for(TipoDefinicion tipodefinicionAux:tipodefinicionsSeleccionados) {
				element = document.createElement("tipodefinicion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoDefinicion(tipodefinicionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Definicion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoDefinicion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDefinicionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDefinicionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoDefinicionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoDefinicionConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoDefinicion(TipoDefinicion tipodefinicion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipodefinicion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodefinicion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipodefinicion.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoDefinicion(TipoDefinicion tipodefinicion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoDefinicionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipodefinicion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoDefinicionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipodefinicion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoDefinicionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipodefinicion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoDefinicionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipodefinicion.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoDefinicionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoDefinicion> tipodefinicionsSeleccionados=new ArrayList<TipoDefinicion>();
		
		tipodefinicionsSeleccionados=this.getTipoDefinicionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoDefinicion(tipodefinicionsSeleccionados);
		
		this.generarReporteTipoDefinicions("Todos",tipodefinicionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoDefinicion(ArrayList<TipoDefinicion> tipodefinicionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoDefinicion tipodefinicionAux:tipodefinicionsSeleccionados) {
				tipodefinicionAux.setsDetalleGeneralEntityReporte(tipodefinicionAux.toString());
			
				if(sTipoSeleccionar.equals(TipoDefinicionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipodefinicionAux.setsDescripcionGeneralEntityReporte1(tipodefinicionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoDefinicionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipodefinicionAux.setsDescripcionGeneralEntityReporte1(tipodefinicionAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoDefinicionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoDefinicion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoDefinicion=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=true;
				this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=true;
			}
			
			this.isVisibilidadCeldaModificarTipoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoDefinicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDefinicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDefinicion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoDefinicion=true;
			this.isVisibilidadCeldaEliminarTipoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoDefinicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDefinicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDefinicion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoDefinicion=true;
			this.isVisibilidadCeldaEliminarTipoDefinicion=true;
			this.isVisibilidadCeldaCancelarTipoDefinicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDefinicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDefinicion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoDefinicion=true;
			this.isVisibilidadCeldaEliminarTipoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoDefinicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDefinicion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDefinicion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoDefinicion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=true;
			this.isVisibilidadCeldaModificarTipoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoDefinicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDefinicion=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoDefinicion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=false;
			this.isVisibilidadCeldaActualizarTipoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoDefinicion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDefinicion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDefinicion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoDefinicion=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=false;
			this.isVisibilidadCeldaModificarTipoDefinicion=true;
			this.isVisibilidadCeldaActualizarTipoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoDefinicion=false;
			this.isVisibilidadCeldaCancelarTipoDefinicion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoDefinicion=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoDefinicion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoDefinicionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoDefinicion=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=true;
			this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=true;
		} else {
			this.actualizarEstadoPanelsTipoDefinicion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoDefinicion=false;
			//this.isVisibilidadCeldaVerFormTipoDefinicion=false;
			this.isVisibilidadCeldaDuplicarTipoDefinicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipodefinicionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoDefinicion=false;
			this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipodefinicionSessionBean.getEsGuardarRelacionado()) {
			if(!tipodefinicionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=false;												
			}
			
			this.jButtonCerrarTipoDefinicion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoDefinicion=false;
		}
		
		if(!this.permiteMantenimiento(this.tipodefinicion)) {
			this.isVisibilidadCeldaActualizarTipoDefinicion=false;
			this.isVisibilidadCeldaEliminarTipoDefinicion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoDefinicion() {
		this.isVisibilidadCeldaNuevoTipoDefinicion=false;
		this.isVisibilidadCeldaGuardarCambiosTipoDefinicion=false;
	}
	
	public void actualizarEstadoPanelsTipoDefinicion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoDefinicion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDefinicion!=null) {
				this.jTabbedPaneBusquedasTipoDefinicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDefinicion!=null) {
				this.jScrollPanelDatosTipoDefinicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDefinicion!=null) {
				this.jPanelPaginacionTipoDefinicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDefinicion!=null) {
				this.jPanelParametrosReportesTipoDefinicion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoDefinicion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDefinicion!=null) {
				this.jTabbedPaneBusquedasTipoDefinicion.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoDefinicion!=null) {
				this.jScrollPanelDatosTipoDefinicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDefinicion!=null) {
				this.jPanelPaginacionTipoDefinicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDefinicion!=null) {
				this.jPanelParametrosReportesTipoDefinicion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoDefinicion.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDefinicion!=null) {
				this.jTabbedPaneBusquedasTipoDefinicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDefinicion!=null) {
				this.jScrollPanelDatosTipoDefinicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDefinicion!=null) {
				this.jPanelPaginacionTipoDefinicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDefinicion!=null) {
				this.jPanelParametrosReportesTipoDefinicion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoDefinicion.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDefinicion!=null) {
				this.jTabbedPaneBusquedasTipoDefinicion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoDefinicion!=null) {
				this.jScrollPanelDatosTipoDefinicion.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoDefinicion!=null) {
				this.jPanelPaginacionTipoDefinicion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoDefinicion!=null) {
				this.jPanelParametrosReportesTipoDefinicion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoDefinicion.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDefinicion!=null) {
				this.jTabbedPaneBusquedasTipoDefinicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDefinicion!=null) {
				this.jScrollPanelDatosTipoDefinicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDefinicion!=null) {
				this.jPanelPaginacionTipoDefinicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDefinicion!=null) {
				this.jPanelParametrosReportesTipoDefinicion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoDefinicion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDefinicion!=null) {
				this.jTabbedPaneBusquedasTipoDefinicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDefinicion!=null) {
				this.jScrollPanelDatosTipoDefinicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDefinicion!=null) {
				this.jPanelPaginacionTipoDefinicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDefinicion!=null) {
				this.jPanelParametrosReportesTipoDefinicion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoDefinicion!=null) {
				this.jScrollPanelDatosEdicionTipoDefinicion.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDefinicion!=null) {
				this.jTabbedPaneBusquedasTipoDefinicion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoDefinicion!=null) {
				this.jScrollPanelDatosTipoDefinicion.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoDefinicion!=null) {
				this.jPanelPaginacionTipoDefinicion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoDefinicion!=null) {
				this.jPanelParametrosReportesTipoDefinicion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoDefinicion!=null) {
					this.jTabbedPaneBusquedasTipoDefinicion.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoDefinicion!=null) {
				this.jPanelParametrosReportesTipoDefinicion.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipodefinicionSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoDefinicion!=null) {
				this.jTabbedPaneBusquedasTipoDefinicion.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoDefinicion!=null) {
				this.jPanelParametrosReportesTipoDefinicion.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionTipoDefinicionParaDefiniciones() throws Exception {
		Boolean isPaginaPopupDefinicion=false;

		try {

			if(this.tipodefinicionSessionBean==null) {
				this.tipodefinicionSessionBean=new TipoDefinicionSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoDefinicion.definicionSessionBean==null) {
				this.jInternalFrameDetalleFormTipoDefinicion.definicionSessionBean=new DefinicionSessionBean();
			}

			this.jInternalFrameDetalleFormTipoDefinicion.definicionSessionBean.setsPathNavegacionActual(tipodefinicionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DefinicionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoDefinicion.definicionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDefinicion=this.jInternalFrameDetalleFormTipoDefinicion.definicionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoDefinicion.definicionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDefinicion(true);
			this.jInternalFrameDetalleFormTipoDefinicion.definicionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion(TipoDefinicionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoDefinicion.definicionSessionBean.setisBusquedaDesdeForeignKeySesionTipoDefinicion(true);
			this.jInternalFrameDetalleFormTipoDefinicion.definicionSessionBean.setlidTipoDefinicionActual(this.idTipoDefinicionActual);

			tipodefinicionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoDefinicion(true);
			tipodefinicionSessionBean.setlIdTipoDefinicionActualForeignKey(this.idTipoDefinicionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoDefinicionSessionBean tipodefinicionSessionBean=new TipoDefinicionSessionBean();
		
		if(this.tipodefinicionSessionBean==null) {
			this.tipodefinicionSessionBean=new TipoDefinicionSessionBean();
		}
		
		this.tipodefinicionSessionBean.setsUltimaBusquedaTipoDefinicion(this.getsAccionBusqueda());
		this.tipodefinicionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipodefinicionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipodefinicionSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipodefinicionSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoDefinicionSessionBean tipodefinicionSessionBean=new TipoDefinicionSessionBean();
		
		if(this.tipodefinicionSessionBean==null) {
			this.tipodefinicionSessionBean=new TipoDefinicionSessionBean();
		}
		
		if(this.tipodefinicionSessionBean.getsUltimaBusquedaTipoDefinicion()!=null&&!this.tipodefinicionSessionBean.getsUltimaBusquedaTipoDefinicion().equals("")) {
			this.setsAccionBusqueda(tipodefinicionSessionBean.getsUltimaBusquedaTipoDefinicion());
			this.setiNumeroPaginacion(tipodefinicionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipodefinicionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipodefinicionSessionBean.getcodigo());
				tipodefinicionSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipodefinicionSessionBean.getnombre());
				tipodefinicionSessionBean.setnombre("");
			}
		}
		
		this.tipodefinicionSessionBean.setsUltimaBusquedaTipoDefinicion("");
		this.tipodefinicionSessionBean.setiNumeroPaginacion(TipoDefinicionConstantesFunciones.INUMEROPAGINACION);
		this.tipodefinicionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoDefinicion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoDefinicion() {
		this.updateBorderResaltarBusquedasFormularioTipoDefinicion();
		this.updateVisibilidadBusquedasFormularioTipoDefinicion();
		this.updateHabilitarBusquedasFormularioTipoDefinicion();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoDefinicion() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoDefinicion.getComponents().length>0) {
	

		if(this.tipodefinicionConstantesFunciones.resaltarBusquedaPorCodigoTipoDefinicion!=null) {
			index= this.jTabbedPaneBusquedasTipoDefinicion.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDefinicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDefinicion.getComponent(index);
				jPanel.setBorder(this.tipodefinicionConstantesFunciones.resaltarBusquedaPorCodigoTipoDefinicion);
			}
		}

		if(this.tipodefinicionConstantesFunciones.resaltarBusquedaPorNombreTipoDefinicion!=null) {
			index= this.jTabbedPaneBusquedasTipoDefinicion.indexOfComponent(this.jPanelBusquedaPorNombreTipoDefinicion);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDefinicion.getComponent(index);
				jPanel.setBorder(this.tipodefinicionConstantesFunciones.resaltarBusquedaPorNombreTipoDefinicion);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoDefinicion() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoDefinicion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDefinicion.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDefinicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDefinicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodefinicionConstantesFunciones.mostrarBusquedaPorCodigoTipoDefinicion);
			if(!this.tipodefinicionConstantesFunciones.mostrarBusquedaPorCodigoTipoDefinicion && index>-1) {
				this.jTabbedPaneBusquedasTipoDefinicion.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoDefinicion.indexOfComponent(this.jPanelBusquedaPorNombreTipoDefinicion);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDefinicion.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipodefinicionConstantesFunciones.mostrarBusquedaPorNombreTipoDefinicion);
			if(!this.tipodefinicionConstantesFunciones.mostrarBusquedaPorNombreTipoDefinicion && index>-1) {
				this.jTabbedPaneBusquedasTipoDefinicion.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoDefinicion() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoDefinicion.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoDefinicion.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDefinicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDefinicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodefinicionConstantesFunciones.activarBusquedaPorCodigoTipoDefinicion);
				this.jTabbedPaneBusquedasTipoDefinicion.setEnabledAt(index,this.tipodefinicionConstantesFunciones.activarBusquedaPorCodigoTipoDefinicion);
			}

			index= this.jTabbedPaneBusquedasTipoDefinicion.indexOfComponent(this.jPanelBusquedaPorNombreTipoDefinicion);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDefinicion.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipodefinicionConstantesFunciones.activarBusquedaPorNombreTipoDefinicion);
				this.jTabbedPaneBusquedasTipoDefinicion.setEnabledAt(index,this.tipodefinicionConstantesFunciones.activarBusquedaPorNombreTipoDefinicion);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoDefinicion(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoDefinicion.indexOfComponent(this.jPanelBusquedaPorCodigoTipoDefinicion);

			this.jTabbedPaneBusquedasTipoDefinicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDefinicion.getComponent(index);

			this.tipodefinicionConstantesFunciones.setResaltarBusquedaPorCodigoTipoDefinicion(resaltar);

			jPanel.setBorder(this.tipodefinicionConstantesFunciones.resaltarBusquedaPorCodigoTipoDefinicion);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoDefinicion.indexOfComponent(this.jPanelBusquedaPorNombreTipoDefinicion);

			this.jTabbedPaneBusquedasTipoDefinicion.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoDefinicion.getComponent(index);

			this.tipodefinicionConstantesFunciones.setResaltarBusquedaPorNombreTipoDefinicion(resaltar);

			jPanel.setBorder(this.tipodefinicionConstantesFunciones.resaltarBusquedaPorNombreTipoDefinicion);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoDefinicion.setBorder(resaltar);
			
		}
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
	
	public void updateControlesFormularioTipoDefinicion() throws Exception {

		if(this.jInternalFrameDetalleFormTipoDefinicion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoDefinicion();
		this.updateVisibilidadResaltarControlesFormularioTipoDefinicion();
		this.updateHabilitarResaltarControlesFormularioTipoDefinicion();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoDefinicion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDefinicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipodefinicionConstantesFunciones.resaltaridTipoDefinicion!=null && this.jInternalFrameDetalleFormTipoDefinicion!=null) {this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldidTipoDefinicion.setBorder(this.tipodefinicionConstantesFunciones.resaltaridTipoDefinicion);}
		if(this.tipodefinicionConstantesFunciones.resaltarcodigoTipoDefinicion!=null && this.jInternalFrameDetalleFormTipoDefinicion!=null) {this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldcodigoTipoDefinicion.setBorder(this.tipodefinicionConstantesFunciones.resaltarcodigoTipoDefinicion);}
		if(this.tipodefinicionConstantesFunciones.resaltarnombreTipoDefinicion!=null && this.jInternalFrameDetalleFormTipoDefinicion!=null) {this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldnombreTipoDefinicion.setBorder(this.tipodefinicionConstantesFunciones.resaltarnombreTipoDefinicion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoDefinicion() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoDefinicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
	
		//this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldidTipoDefinicion.setVisible(this.tipodefinicionConstantesFunciones.mostraridTipoDefinicion);
		this.jInternalFrameDetalleFormTipoDefinicion.jPanelidTipoDefinicion.setVisible(this.tipodefinicionConstantesFunciones.mostraridTipoDefinicion);
		//this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldcodigoTipoDefinicion.setVisible(this.tipodefinicionConstantesFunciones.mostrarcodigoTipoDefinicion);
		this.jInternalFrameDetalleFormTipoDefinicion.jPanelcodigoTipoDefinicion.setVisible(this.tipodefinicionConstantesFunciones.mostrarcodigoTipoDefinicion);
		//this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldnombreTipoDefinicion.setVisible(this.tipodefinicionConstantesFunciones.mostrarnombreTipoDefinicion);
		this.jInternalFrameDetalleFormTipoDefinicion.jPanelnombreTipoDefinicion.setVisible(this.tipodefinicionConstantesFunciones.mostrarnombreTipoDefinicion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoDefinicion() throws Exception {
		if(this.jInternalFrameDetalleFormTipoDefinicion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoDefinicion!=null) {
	
		this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldidTipoDefinicion.setEnabled(this.tipodefinicionConstantesFunciones.activaridTipoDefinicion);
		this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldcodigoTipoDefinicion.setEnabled(this.tipodefinicionConstantesFunciones.activarcodigoTipoDefinicion);
		this.jInternalFrameDetalleFormTipoDefinicion.jTextFieldnombreTipoDefinicion.setEnabled(this.tipodefinicionConstantesFunciones.activarnombreTipoDefinicion);
		}
	}
	
		
}