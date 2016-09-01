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

import com.bydan.erp.inventario.util.TipoIvaItemConstantesFunciones;
import com.bydan.erp.inventario.util.TipoIvaItemParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoIvaItemParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoIvaItemBean;
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
public class TipoIvaItemBeanSwingJInternalFrame extends TipoIvaItemJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoIvaItemBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoIvaItem> tipoivaitemValidator = new ClassValidator<TipoIvaItem>(TipoIvaItem.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoIvaItem tipoivaitem;	
	public TipoIvaItem tipoivaitemAux;
	public TipoIvaItem tipoivaitemAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoIvaItem tipoivaitemTotales;
	public Long idTipoIvaItemActual;
	public Long iIdNuevoTipoIvaItem=0L;
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
	
	public Boolean isPermisoTodoTipoIvaItem;
	public Boolean isPermisoNuevoTipoIvaItem;
	public Boolean isPermisoActualizarTipoIvaItem;
	public Boolean isPermisoActualizarOriginalTipoIvaItem;
	public Boolean isPermisoEliminarTipoIvaItem;
	public Boolean isPermisoGuardarCambiosTipoIvaItem;
	public Boolean isPermisoConsultaTipoIvaItem;
	public Boolean isPermisoBusquedaTipoIvaItem;
	public Boolean isPermisoReporteTipoIvaItem;
	public Boolean isPermisoPaginacionMedioTipoIvaItem;
	public Boolean isPermisoPaginacionAltoTipoIvaItem;
	public Boolean isPermisoPaginacionTodoTipoIvaItem;
	public Boolean isPermisoCopiarTipoIvaItem;
	public Boolean isPermisoVerFormTipoIvaItem;
	public Boolean isPermisoDuplicarTipoIvaItem;
	public Boolean isPermisoOrdenTipoIvaItem;
	
	
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
	
	public TipoIvaItemParameterReturnGeneral tipoivaitemReturnGeneral;
	public TipoIvaItemParameterReturnGeneral tipoivaitemParameterGeneral;
	
	

	public DefinicionLogic definicionLogic=null;

	public DefinicionLogic getDefinicionLogic() {
		return definicionLogic;
	}

	public void setDefinicionLogic(DefinicionLogic definicionLogic) {
		this.definicionLogic = definicionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoIvaItem=false;
	public Boolean esParaAccionDesdeFormularioTipoIvaItem=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoIvaItemLogic tipoivaitemLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoIvaItem tipoivaitemBean;
	public TipoIvaItemConstantesFunciones tipoivaitemConstantesFunciones;
	//public TipoIvaItemParameterReturnGeneral tipoivaitemReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoIvaItem> tipoivaitems;	
	//public List<TipoIvaItem> tipoivaitemsEliminados;
	//public List<TipoIvaItem> tipoivaitemsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoIvaItem=false;
	public Boolean isVisibilidadCeldaDuplicarTipoIvaItem=true;
	public Boolean isVisibilidadCeldaCopiarTipoIvaItem=true;
	public Boolean isVisibilidadCeldaVerFormTipoIvaItem=true;
	public Boolean isVisibilidadCeldaOrdenTipoIvaItem=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoIvaItem=false;
	public Boolean isVisibilidadCeldaModificarTipoIvaItem=false;
	public Boolean isVisibilidadCeldaActualizarTipoIvaItem=false;
	public Boolean isVisibilidadCeldaEliminarTipoIvaItem=false;
	public Boolean isVisibilidadCeldaCancelarTipoIvaItem=false;
	public Boolean isVisibilidadCeldaGuardarTipoIvaItem=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoIvaItem=false;	
	
	
	
	public Long getiIdNuevoTipoIvaItem() {
		return this.iIdNuevoTipoIvaItem;
	}

	public void setiIdNuevoTipoIvaItem(Long iIdNuevoTipoIvaItem) {
		this.iIdNuevoTipoIvaItem = iIdNuevoTipoIvaItem;
	}
	
	public Long getidTipoIvaItemActual() {
		return this.idTipoIvaItemActual;
	}

	public void setidTipoIvaItemActual(Long idTipoIvaItemActual) {
		this.idTipoIvaItemActual = idTipoIvaItemActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoIvaItem gettipoivaitem() {
		return this.tipoivaitem;
	}

	public void settipoivaitem(TipoIvaItem tipoivaitem) {
		this.tipoivaitem = tipoivaitem;
	}
	
	public TipoIvaItem gettipoivaitemAux() {
		return this.tipoivaitemAux;
	}

	public void settipoivaitemAux(TipoIvaItem tipoivaitemAux) {
		this.tipoivaitemAux = tipoivaitemAux;
	}				
	
	public TipoIvaItem gettipoivaitemAnterior() {
		return this.tipoivaitemAnterior;
	}

	public void settipoivaitemAnterior(TipoIvaItem tipoivaitemAnterior) {
		this.tipoivaitemAnterior = tipoivaitemAnterior;
	}	
	
	public TipoIvaItem gettipoivaitemTotales() {
		return this.tipoivaitemTotales;
	}

	public void settipoivaitemTotales(TipoIvaItem tipoivaitemTotales) {
		this.tipoivaitemTotales = tipoivaitemTotales;
	}	
	
	public TipoIvaItem gettipoivaitemBean() {
		return this.tipoivaitemBean;
	}

	public void settipoivaitemBean(TipoIvaItem tipoivaitemBean) {
		this.tipoivaitemBean = tipoivaitemBean;
	}	
	
	public TipoIvaItemParameterReturnGeneral gettipoivaitemReturnGeneral() {
		return this.tipoivaitemReturnGeneral;
	}

	public void settipoivaitemReturnGeneral(TipoIvaItemParameterReturnGeneral tipoivaitemReturnGeneral) {
		this.tipoivaitemReturnGeneral = tipoivaitemReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoIvaItemLogic getTipoIvaItemLogic()	{		
		return tipoivaitemLogic;
	}

	public void setTipoIvaItemLogic(TipoIvaItemLogic tipoivaitemLogic) {
		this.tipoivaitemLogic = tipoivaitemLogic;
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
	
	public Boolean getIsEsNuevoTipoIvaItem() {
		return isEsNuevoTipoIvaItem;
	}

	public void setIsEsNuevoTipoIvaItem(Boolean isEsNuevoTipoIvaItem) {
		this.isEsNuevoTipoIvaItem = isEsNuevoTipoIvaItem;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoIvaItem() {
		return esParaAccionDesdeFormularioTipoIvaItem;
	}
	
	public void setEsParaAccionDesdeFormularioTipoIvaItem(Boolean esParaAccionDesdeFormularioTipoIvaItem) {
		this.esParaAccionDesdeFormularioTipoIvaItem = esParaAccionDesdeFormularioTipoIvaItem;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoIvaItem() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoIvaItemConstantesFunciones.refrescarForeignKeysDescripcionesTipoIvaItem(this.tipoivaitemLogic.getTipoIvaItems());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoIvaItemConstantesFunciones.refrescarForeignKeysDescripcionesTipoIvaItem(this.tipoivaitems);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoivaitemLogic.setTipoIvaItems(this.tipoivaitems);
			tipoivaitemLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoIvaItemParameterReturnGeneral getTipoIvaItemParameterGeneral() {
		return this.tipoivaitemParameterGeneral;
	}
	
	public void setTipoIvaItemParameterGeneral(TipoIvaItemParameterReturnGeneral tipoivaitemParameterGeneral) {
		this.tipoivaitemParameterGeneral = tipoivaitemParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoIvaItem() {
		return isPermisoTodoTipoIvaItem;
	}

	public void setIsPermisoTodoTipoIvaItem(Boolean isPermisoTodoTipoIvaItem) {
		this.isPermisoTodoTipoIvaItem = isPermisoTodoTipoIvaItem;
	}

	public Boolean getIsPermisoNuevoTipoIvaItem() {
		return isPermisoNuevoTipoIvaItem;
	}

	public void setIsPermisoNuevoTipoIvaItem(Boolean isPermisoNuevoTipoIvaItem) {
		this.isPermisoNuevoTipoIvaItem = isPermisoNuevoTipoIvaItem;
	}

	public Boolean getIsPermisoActualizarTipoIvaItem() {
		return isPermisoActualizarTipoIvaItem;
	}

	public void setIsPermisoActualizarTipoIvaItem(Boolean isPermisoActualizarTipoIvaItem) {
		this.isPermisoActualizarTipoIvaItem = isPermisoActualizarTipoIvaItem;
	}

	public Boolean getIsPermisoEliminarTipoIvaItem() {
		return isPermisoEliminarTipoIvaItem;
	}

	public void setIsPermisoEliminarTipoIvaItem(Boolean isPermisoEliminarTipoIvaItem) {
		this.isPermisoEliminarTipoIvaItem = isPermisoEliminarTipoIvaItem;
	}

	public Boolean getIsPermisoGuardarCambiosTipoIvaItem() {
		return isPermisoGuardarCambiosTipoIvaItem;
	}

	public void setIsPermisoGuardarCambiosTipoIvaItem(Boolean isPermisoGuardarCambiosTipoIvaItem) {
		this.isPermisoGuardarCambiosTipoIvaItem = isPermisoGuardarCambiosTipoIvaItem;
	}
	
	public Boolean getIsPermisoConsultaTipoIvaItem() {
		return isPermisoConsultaTipoIvaItem;
	}

	public void setIsPermisoConsultaTipoIvaItem(Boolean isPermisoConsultaTipoIvaItem) {
		this.isPermisoConsultaTipoIvaItem = isPermisoConsultaTipoIvaItem;
	}

	public Boolean getIsPermisoBusquedaTipoIvaItem() {
		return isPermisoBusquedaTipoIvaItem;
	}

	public void setIsPermisoBusquedaTipoIvaItem(Boolean isPermisoBusquedaTipoIvaItem) {
		this.isPermisoBusquedaTipoIvaItem = isPermisoBusquedaTipoIvaItem;
	}

	public Boolean getIsPermisoReporteTipoIvaItem() {
		return isPermisoReporteTipoIvaItem;
	}

	public void setIsPermisoReporteTipoIvaItem(Boolean isPermisoReporteTipoIvaItem) {
		this.isPermisoReporteTipoIvaItem = isPermisoReporteTipoIvaItem;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoIvaItem() {
		return isPermisoPaginacionMedioTipoIvaItem;
	}

	public void setIsPermisoPaginacionMedioTipoIvaItem(Boolean isPermisoPaginacionMedioTipoIvaItem) {
		this.isPermisoPaginacionMedioTipoIvaItem = isPermisoPaginacionMedioTipoIvaItem;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoIvaItem() {
		return isPermisoPaginacionTodoTipoIvaItem;
	}

	public void setIsPermisoPaginacionTodoTipoIvaItem(Boolean isPermisoPaginacionTodoTipoIvaItem) {
		this.isPermisoPaginacionTodoTipoIvaItem = isPermisoPaginacionTodoTipoIvaItem;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoIvaItem() {
		return isPermisoPaginacionAltoTipoIvaItem;
	}

	public void setIsPermisoPaginacionAltoTipoIvaItem(Boolean isPermisoPaginacionAltoTipoIvaItem) {
		this.isPermisoPaginacionAltoTipoIvaItem = isPermisoPaginacionAltoTipoIvaItem;
	}
	
	public Boolean getIsPermisoCopiarTipoIvaItem() {
		return isPermisoCopiarTipoIvaItem;
	}

	public void setIsPermisoCopiarTipoIvaItem(Boolean isPermisoCopiarTipoIvaItem) {
		this.isPermisoCopiarTipoIvaItem = isPermisoCopiarTipoIvaItem;
	}
	
	public Boolean getIsPermisoVerFormTipoIvaItem() {
		return isPermisoVerFormTipoIvaItem;
	}

	public void setIsPermisoVerFormTipoIvaItem(Boolean isPermisoVerFormTipoIvaItem) {
		this.isPermisoVerFormTipoIvaItem = isPermisoVerFormTipoIvaItem;
	}
	
	public Boolean getIsPermisoDuplicarTipoIvaItem() {
		return isPermisoDuplicarTipoIvaItem;
	}

	public void setIsPermisoDuplicarTipoIvaItem(Boolean isPermisoDuplicarTipoIvaItem) {
		this.isPermisoDuplicarTipoIvaItem = isPermisoDuplicarTipoIvaItem;
	}
	
	public Boolean getIsPermisoOrdenTipoIvaItem() {
		return isPermisoOrdenTipoIvaItem;
	}

	public void setIsPermisoOrdenTipoIvaItem(Boolean isPermisoOrdenTipoIvaItem) {
		this.isPermisoOrdenTipoIvaItem = isPermisoOrdenTipoIvaItem;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoIvaItem() {
		return isVisibilidadCeldaNuevoTipoIvaItem;
	}

	public void setIsVisibilidadCeldaNuevoTipoIvaItem(Boolean isVisibilidadCeldaNuevoTipoIvaItem) {
		this.isVisibilidadCeldaNuevoTipoIvaItem = isVisibilidadCeldaNuevoTipoIvaItem;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoIvaItem() {
		return isVisibilidadCeldaDuplicarTipoIvaItem;
	}

	public void setIsVisibilidadCeldaDuplicarTipoIvaItem(Boolean isVisibilidadCeldaDuplicarTipoIvaItem) {
		this.isVisibilidadCeldaDuplicarTipoIvaItem = isVisibilidadCeldaDuplicarTipoIvaItem;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoIvaItem() {
		return isVisibilidadCeldaCopiarTipoIvaItem;
	}

	public void setIsVisibilidadCeldaCopiarTipoIvaItem(Boolean isVisibilidadCeldaCopiarTipoIvaItem) {
		this.isVisibilidadCeldaCopiarTipoIvaItem = isVisibilidadCeldaCopiarTipoIvaItem;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoIvaItem() {
		return isVisibilidadCeldaVerFormTipoIvaItem;
	}

	public void setIsVisibilidadCeldaVerFormTipoIvaItem(Boolean isVisibilidadCeldaVerFormTipoIvaItem) {
		this.isVisibilidadCeldaVerFormTipoIvaItem = isVisibilidadCeldaVerFormTipoIvaItem;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoIvaItem() {
		return isVisibilidadCeldaOrdenTipoIvaItem;
	}

	public void setIsVisibilidadCeldaOrdenTipoIvaItem(Boolean isVisibilidadCeldaOrdenTipoIvaItem) {
		this.isVisibilidadCeldaOrdenTipoIvaItem = isVisibilidadCeldaOrdenTipoIvaItem;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoIvaItem() {
		return isVisibilidadCeldaNuevoRelacionesTipoIvaItem;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoIvaItem(Boolean isVisibilidadCeldaNuevoRelacionesTipoIvaItem) {
		this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem = isVisibilidadCeldaNuevoRelacionesTipoIvaItem;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoIvaItem() {
		return isVisibilidadCeldaModificarTipoIvaItem;
	}

	public void setIsVisibilidadCeldaModificarTipoIvaItem(Boolean isVisibilidadCeldaModificarTipoIvaItem) {
		this.isVisibilidadCeldaModificarTipoIvaItem = isVisibilidadCeldaModificarTipoIvaItem;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoIvaItem() {
		return isVisibilidadCeldaActualizarTipoIvaItem;
	}

	public void setIsVisibilidadCeldaActualizarTipoIvaItem(Boolean isVisibilidadCeldaActualizarTipoIvaItem) {
		this.isVisibilidadCeldaActualizarTipoIvaItem = isVisibilidadCeldaActualizarTipoIvaItem;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoIvaItem() {
		return isVisibilidadCeldaEliminarTipoIvaItem;
	}

	public void setIsVisibilidadCeldaEliminarTipoIvaItem(Boolean isVisibilidadCeldaEliminarTipoIvaItem) {
		this.isVisibilidadCeldaEliminarTipoIvaItem = isVisibilidadCeldaEliminarTipoIvaItem;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoIvaItem() {
		return isVisibilidadCeldaCancelarTipoIvaItem;
	}

	public void setIsVisibilidadCeldaCancelarTipoIvaItem(Boolean isVisibilidadCeldaCancelarTipoIvaItem) {
		this.isVisibilidadCeldaCancelarTipoIvaItem = isVisibilidadCeldaCancelarTipoIvaItem;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoIvaItem() {
		return isVisibilidadCeldaGuardarTipoIvaItem;
	}

	public void setIsVisibilidadCeldaGuardarTipoIvaItem(Boolean isVisibilidadCeldaGuardarTipoIvaItem) {
		this.isVisibilidadCeldaGuardarTipoIvaItem = isVisibilidadCeldaGuardarTipoIvaItem;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoIvaItem() {
		return isVisibilidadCeldaGuardarCambiosTipoIvaItem;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoIvaItem(Boolean isVisibilidadCeldaGuardarCambiosTipoIvaItem) {
		this.isVisibilidadCeldaGuardarCambiosTipoIvaItem = isVisibilidadCeldaGuardarCambiosTipoIvaItem;
	}
		
	public TipoIvaItemSessionBean gettipoivaitemSessionBean() {
		return this.tipoivaitemSessionBean;
	}
	
	public void settipoivaitemSessionBean(TipoIvaItemSessionBean tipoivaitemSessionBean) {
		this.tipoivaitemSessionBean=tipoivaitemSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(TipoIvaItem tipoivaitem)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoIvaItem tipoivaitem,TipoIvaItem tipoivaitemAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoIvaItem(tipoivaitem);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoivaitemAux.setId(tipoivaitem.getId());
		tipoivaitemAux.setVersionRow(tipoivaitem.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoIvaItem();
		
			int intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitem =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoivaitem =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoIvaItem(this.tipoivaitem,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoivaitemValidator.getInvalidValues(this.tipoivaitem);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoivaitemLogic.setDatosCliente(datosCliente);
			tipoivaitemLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoivaitemAux=new  TipoIvaItem();
				
				tipoivaitemAux.setIsNew(true);
				tipoivaitemAux.setIsChanged(true);
				
				tipoivaitemAux.setTipoIvaItemOriginal(this.tipoivaitem);
				
				tipoivaitemAux.setId(this.tipoivaitem.getId());	
				tipoivaitemAux.setVersionRow(this.tipoivaitem.getVersionRow());	
				tipoivaitemAux.setcodigo(this.tipoivaitem.getcodigo());	
				tipoivaitemAux.setnombre(this.tipoivaitem.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoivaitemSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoivaitemSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoivaitemAux,tipoivaitemLogic.getTipoIvaItems());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoivaitemAux,tipoivaitems);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoivaitemSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoivaitemSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoivaitemLogic.saveTipoIvaItems();//WithConnection
						//tipoivaitemLogic.getSetVersionRowTipoIvaItems();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoivaitem,tipoivaitemAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoivaitemSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoivaitemAux=new  TipoIvaItem();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoivaitemSessionBean.getEsGuardarRelacionado() && this.tipoivaitem.getId()>=0)) {
						
					tipoivaitemAux.setIsNew(false);
				}
				
				tipoivaitemAux.setIsDeleted(false);
			
				tipoivaitemAux.setId(this.tipoivaitem.getId());	
				tipoivaitemAux.setVersionRow(this.tipoivaitem.getVersionRow());	
				tipoivaitemAux.setcodigo(this.tipoivaitem.getcodigo());	
				tipoivaitemAux.setnombre(this.tipoivaitem.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoivaitemAux,tipoivaitemLogic.getTipoIvaItems());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoivaitemAux,tipoivaitems);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoivaitemSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoivaitemSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoivaitemLogic.saveTipoIvaItems();//WithConnection
						//tipoivaitemLogic.getSetVersionRowTipoIvaItems();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoivaitem,tipoivaitemAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoivaitemSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoivaitemAux=new  TipoIvaItem();
				
				tipoivaitemAux.setIsNew(false);
				tipoivaitemAux.setIsChanged(false);
				
				tipoivaitemAux.setIsDeleted(true);
				
				tipoivaitemAux.setId(this.tipoivaitem.getId());	
				tipoivaitemAux.setVersionRow(this.tipoivaitem.getVersionRow());	
				tipoivaitemAux.setcodigo(this.tipoivaitem.getcodigo());	
				tipoivaitemAux.setnombre(this.tipoivaitem.getnombre());	
				
				if(this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoivaitemAux.getId()>=0) {	
						this.tipoivaitemsEliminados.add(tipoivaitemAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoivaitemAux,tipoivaitemLogic.getTipoIvaItems());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoivaitemAux,tipoivaitems);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoivaitemSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoivaitemSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoivaitemLogic.saveTipoIvaItems();//WithConnection
						//tipoivaitemLogic.getSetVersionRowTipoIvaItems();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoivaitemSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.quitarFilaTotales();}
							tipoivaitemAux.setDefinicions(this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoivaitemSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoivaitemSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoivaitemAux,tipoivaitemLogic.getTipoIvaItems());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoivaitemAux,tipoivaitems);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.getTipoIvaItems().addAll(this.tipoivaitemsEliminados);
					
					tipoivaitemLogic.saveTipoIvaItems();//WithConnection
					//tipoivaitemLogic.getSetVersionRowTipoIvaItems();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoivaitemsEliminados= new ArrayList<TipoIvaItem>();		
			}
			
			if(this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Iva Item GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Iva Item",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoivaitem=tipoivaitemAux;
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
      		//this.finishProcessTipoIvaItem();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoIvaItem tipoivaitemLocal) throws Exception {
		
		if(this.tipoivaitemSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipoivaitemLocal.setDefinicions(this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
			
			} else {
			
				tipoivaitemLocal.setDefinicions(this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.definicions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoIvaItem tipoivaitemLocal) throws Exception {	
		if(this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoIvaItemActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoivaitem =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoivaitem =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoivaitemValidator.getInvalidValues(this.tipoivaitem);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoIvaItem tipoivaitem,List<TipoIvaItem> tipoivaitems) throws Exception {
		try	{		
			TipoIvaItemConstantesFunciones.actualizarLista(tipoivaitem,tipoivaitems,this.tipoivaitemSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoIvaItem tipoivaitem,List<TipoIvaItem> tipoivaitems) throws Exception {
		try	{			
			TipoIvaItemConstantesFunciones.actualizarSelectedLista(tipoivaitem,tipoivaitems);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoIvaItem> tipoivaitemsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoivaitemsLocal=this.tipoivaitemLogic.getTipoIvaItems();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoivaitemsLocal=this.tipoivaitems;
			}
			//ARCHITECTURE
		
			for(TipoIvaItem tipoivaitemLocal:tipoivaitemsLocal) {
				if(this.permiteMantenimiento(tipoivaitemLocal) && tipoivaitemLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoIvaItemConstantesFunciones.getTipoIvaItemLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoIvaItemConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIvaItem.jLabelcodigoTipoIvaItem,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoIvaItemConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIvaItem.jLabelnombreTipoIvaItem,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoIvaItem.jLabelcodigoTipoIvaItem,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoIvaItem.jLabelnombreTipoIvaItem,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Definicion")) {
			if(this.tipoivaitem==null) {
				this.tipoivaitem= new TipoIvaItem();
			}

			if(this.tipoivaitemSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoIvaItem
				this.setVariablesFormularioToObjetoActualTipoIvaItem(this.tipoivaitem,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);

				this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.getdefinicion().setTipoIvaItem(this.tipoivaitem);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoIvaItem--;	
		
		
		this.tipoivaitemAux=new TipoIvaItem();
		
		this.tipoivaitemAux.setId(this.iIdNuevoTipoIvaItem);
		this.tipoivaitemAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoivaitemLogic.getTipoIvaItems().add(this.tipoivaitemAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoivaitems.add(this.tipoivaitemAux);
		}
		//ARCHITECTURE
		
		this.tipoivaitem=this.tipoivaitemAux;
		
		if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoIvaItem(this.tipoivaitem);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoIvaItem(this.tipoivaitem);
		}
				
		//this.setDefaultControlesTipoIvaItem();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoIvaItem();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoIvaItem();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIvaItem();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoIvaItem(this.tipoivaitemBean,this.tipoivaitem,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoIvaItemConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoivaitemSessionBean.getConGuardarRelaciones()) {
			classes=TipoIvaItemConstantesFunciones.getClassesRelationshipsOfTipoIvaItem(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoivaitemReturnGeneral=tipoivaitemLogic.procesarEventosTipoIvaItemsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoivaitemLogic.getTipoIvaItems(),this.tipoivaitem,this.tipoivaitemParameterGeneral,this.isEsNuevoTipoIvaItem,classes);//this.tipoivaitemLogic.getTipoIvaItem()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoIvaItem(this.tipoivaitemReturnGeneral,this.tipoivaitemBean,false);
		
		if(this.tipoivaitemReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoIvaItem(this.tipoivaitemReturnGeneral.getTipoIvaItem());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoIvaItem(this.tipoivaitemReturnGeneral.getTipoIvaItem());
		}
		
		if(this.tipoivaitemReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoIvaItem(this.tipoivaitemReturnGeneral.getTipoIvaItem(),classes);//this.tipoivaitemBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoIvaItem(this.tipoivaitem,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoIvaItem();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoIvaItem();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoIvaItem(false);
						
			if(tipoivaitemSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIvaItem();
			}
			
			this.actualizarVisualTableDatosTipoIvaItem();
			
			this.jTableDatosTipoIvaItem.setRowSelectionInterval(this.getIndiceNuevoTipoIvaItem(), this.getIndiceNuevoTipoIvaItem());
			
			this.seleccionarFilaTablaTipoIvaItemActual();
						
			this.actualizarEstadoCeldasBotonesTipoIvaItem("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoIvaItem(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldcodigoTipoIvaItem.setEnabled(isHabilitar && this.tipoivaitemConstantesFunciones.activarcodigoTipoIvaItem);
		this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldnombreTipoIvaItem.setEnabled(isHabilitar && this.tipoivaitemConstantesFunciones.activarnombreTipoIvaItem);	
		
	};
	
	public void setDefaultControlesTipoIvaItem() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoIvaItem(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoivaitemSessionBean.setConGuardarRelaciones(true);			
			this.tipoivaitemSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoIvaItem.jTabbedPaneRelacionesTipoIvaItem.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipoivaitemSessionBean.setConGuardarRelaciones(false);			
			this.tipoivaitemSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoIvaItem.jTabbedPaneRelacionesTipoIvaItem.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoIvaItem() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIvaItem tipoivaitemAux:this.tipoivaitemLogic.getTipoIvaItems()) {
				if(tipoivaitemAux.getId().equals(this.iIdNuevoTipoIvaItem)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIvaItem tipoivaitemAux:this.tipoivaitems) {
				if(tipoivaitemAux.getId().equals(this.iIdNuevoTipoIvaItem)) {
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
	
	public int getIndiceActualTipoIvaItem(TipoIvaItem tipoivaitem,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIvaItem tipoivaitemAux:this.tipoivaitemLogic.getTipoIvaItems()) {
				if(tipoivaitemAux.getId().equals(tipoivaitem.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIvaItem tipoivaitemAux:this.tipoivaitems) {
				if(tipoivaitemAux.getId().equals(tipoivaitem.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoIvaItem(TipoIvaItem tipoivaitemOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIvaItem tipoivaitemAux:this.tipoivaitemLogic.getTipoIvaItems()) {
				if(tipoivaitemAux.getTipoIvaItemOriginal().getId().equals(tipoivaitemOriginal.getId())) {
					existe=true;
					tipoivaitemOriginal.setId(tipoivaitemAux.getId());
					tipoivaitemOriginal.setVersionRow(tipoivaitemAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIvaItem tipoivaitemAux:this.tipoivaitems) {
				if(tipoivaitemAux.getTipoIvaItemOriginal().getId().equals(tipoivaitemOriginal.getId())) {
					existe=true;
					tipoivaitemOriginal.setId(tipoivaitemAux.getId());
					tipoivaitemOriginal.setVersionRow(tipoivaitemAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoIvaItem(Boolean esParaCancelar) throws Exception {
		tipoivaitemsAux=new ArrayList<TipoIvaItem>();
		tipoivaitemAux=new TipoIvaItem();
		
		if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoIvaItem tipoivaitemAux:this.tipoivaitemLogic.getTipoIvaItems()) {
					if(tipoivaitemAux.getId()<0) {
						tipoivaitemsAux.add(tipoivaitemAux);
					}		
				}
				this.iIdNuevoTipoIvaItem=0L;
				this.tipoivaitemLogic.getTipoIvaItems().removeAll(tipoivaitemsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIvaItem tipoivaitemAux:this.tipoivaitems) {
					if(tipoivaitemAux.getId()<0) {
						tipoivaitemsAux.add(tipoivaitemAux);
					}		
				}
				this.iIdNuevoTipoIvaItem=0L;
				this.tipoivaitems.removeAll(tipoivaitemsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoIvaItem 
					&& this.tipoivaitemLogic.getTipoIvaItems().size()>0
					) {
					tipoivaitemAux=this.tipoivaitemLogic.getTipoIvaItems().get(this.tipoivaitemLogic.getTipoIvaItems().size() - 1);
				
					if(tipoivaitemAux.getId()<0) {
						this.tipoivaitemLogic.getTipoIvaItems().remove(tipoivaitemAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoIvaItem && this.tipoivaitems.size()>0) {
					tipoivaitemAux=this.tipoivaitems.get(this.tipoivaitems.size() - 1);
				
					if(tipoivaitemAux.getId()<0) {
						this.tipoivaitems.remove(tipoivaitemAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoIvaItem(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoivaitem.getId()<0) {
				this.tipoivaitemLogic.getTipoIvaItems().remove(this.tipoivaitem);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoivaitem.getId()<0) {
				this.tipoivaitems.remove(this.tipoivaitem);
			}
		}			
	}
	
	public void setEstadosInicialesTipoIvaItem(List<TipoIvaItem> tipoivaitemsAux) throws Exception {
		TipoIvaItemConstantesFunciones.setEstadosInicialesTipoIvaItem(tipoivaitemsAux);
	}
	
	public void setEstadosInicialesTipoIvaItem(TipoIvaItem tipoivaitemAux) throws Exception {
		TipoIvaItemConstantesFunciones.setEstadosInicialesTipoIvaItem(tipoivaitemAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoIvaItemActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoIvaItem("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoIvaItemActual()) {
				if(!this.isEsNuevoTipoIvaItem) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoIvaItem("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoIvaItem=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoIvaItemActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Iva Item ?", "MANTENIMIENTO DE Tipo Iva Item", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoIvaItem("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoIvaItem tipoivaitem) throws Exception {
		TipoIvaItemConstantesFunciones.seleccionarAsignar(this.tipoivaitem,tipoivaitem);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoIvaItem=this.isPermisoActualizarOriginalTipoIvaItem;
			
			
			this.seleccionarAsignar(tipoivaitem);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoIvaItemConstantesFunciones.quitarEspaciosTipoIvaItem(this.tipoivaitem,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoIvaItem("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoivaitemSessionBean.setsFuncionBusquedaRapida(this.tipoivaitemSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoIvaItem) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoIvaItem(esParaCancelar);				
				this.cancelarNuevoTipoIvaItem(esParaCancelar);								
			}
			
			this.tipoivaitem=new TipoIvaItem();
			
			this.inicializarTipoIvaItem();
			
			this.actualizarEstadoCeldasBotonesTipoIvaItem("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoIvaItem() throws Exception {
		try {
			TipoIvaItemConstantesFunciones.inicializarTipoIvaItem(this.tipoivaitem);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoivaitemLogic.getTipoIvaItems().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoIvaItems(String sAccionBusqueda,List<TipoIvaItem> tipoivaitemsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoIvaItem"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoIvaItemMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoIvaItemMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoIvaItem"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Iva Itemes");		
		parameters.put("busquedapor", TipoIvaItemConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
					
					TipoIvaItemLogic tipoivaitemLogicAuxiliar=new TipoIvaItemLogic();
					tipoivaitemLogicAuxiliar.setDatosCliente(tipoivaitemLogic.getDatosCliente());				
					tipoivaitemLogicAuxiliar.setTipoIvaItems(tipoivaitemsParaReportes);
					
					tipoivaitemLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoIvaItemWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipoivaitemsParaReportes=tipoivaitemLogicAuxiliar.getTipoIvaItems();
					
					//tipoivaitemLogic.getNewConnexionToDeep();
					
					//for (TipoIvaItem tipoivaitem:tipoivaitemsParaReportes) {
					//	tipoivaitemLogic.deepLoad(tipoivaitem, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipoivaitemLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipoivaitemLogic.closeNewConnexionToDeep();
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoIvaItem=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoIvaItemConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoIvaItemConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoIvaItem=new JRBeanArrayDataSource(TipoIvaItemJInternalFrame.TraerTipoIvaItemBeans(tipoivaitemsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoIvaItem);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoIvaItemConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoIvaItemConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoIvaItemBean.TraerTipoIvaItemBeans(tipoivaitemsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoIvaItems(sAccionBusqueda,sTipoArchivoReporte,tipoivaitemsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoIvaItems(sAccionBusqueda,sTipoArchivoReporte,tipoivaitemsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoIvaItemActionPerformed(null);
					//this.generarExcelReporteTipoIvaItems(sAccionBusqueda,sTipoArchivoReporte,tipoivaitemsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoIvaItems(sAccionBusqueda,sTipoArchivoReporte,tipoivaitemsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoIvaItems(sAccionBusqueda,sTipoArchivoReporte,tipoivaitemsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoIvaItems(sAccionBusqueda,sTipoArchivoReporte,tipoivaitemsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoIvaItems(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIvaItem> tipoivaitemsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoivaitem";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIvaItems");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoIvaItem("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoIvaItem tipoivaitem : tipoivaitemsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoIvaItemConstantesFunciones.generarExcelReporteDataTipoIvaItem("NORMAL",row,workbook,tipoivaitem,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva Item",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoIvaItem(String sTipo,Row row,Workbook workbook) {
		
		TipoIvaItemConstantesFunciones.generarExcelReporteHeaderTipoIvaItem(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoIvaItems(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIvaItem> tipoivaitemsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoivaitem_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIvaItems");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoIvaItem tipoivaitem : tipoivaitemsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoIvaItemConstantesFunciones.getTipoIvaItemDescripcion(tipoivaitem));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoIvaItemConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoIvaItemConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoivaitem.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoIvaItemConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoIvaItemConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoivaitem.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva Item",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoIvaItems(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoIvaItem> tipoivaitemsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoIvaItem> tipoivaitemsRespaldo=null;
		
		classes=TipoIvaItemConstantesFunciones.getClassesRelationshipsOfTipoIvaItem(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoivaitemLogic.setDatosCliente(this.datosCliente);
		this.tipoivaitemLogic.setDatosDeep(this.datosDeep);
		this.tipoivaitemLogic.setIsConDeep(true);
		
		tipoivaitemsRespaldo=this.tipoivaitemLogic.getTipoIvaItems();
		
		this.tipoivaitemLogic.setTipoIvaItems(tipoivaitemsParaReportes);	
		this.tipoivaitemLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoivaitemsParaReportes=this.tipoivaitemLogic.getTipoIvaItems();
		this.tipoivaitemLogic.setTipoIvaItems(tipoivaitemsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoivaitem_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoIvaItems");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoIvaItem("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoIvaItem tipoivaitem : tipoivaitemsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoIvaItem("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoIvaItemConstantesFunciones.generarExcelReporteDataTipoIvaItem("NORMAL",row,workbook,tipoivaitem,cellStyleDataAux);
		
			
			


				//Definicion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DefinicionConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipoivaitem.getDefinicions()!=null && tipoivaitem.getDefinicions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DefinicionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DefinicionConstantesFunciones.generarExcelReporteHeaderDefinicion("RELACIONADO",row,workbook);
				}

				if(tipoivaitem.getDefinicions()!=null) {
					i2=0;
					for(Definicion definicion : tipoivaitem.getDefinicions()) {
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
		cell.setCellValue(TipoIvaItemConstantesFunciones.getTipoIvaItemDescripcion(tipoivaitem));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva Item",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIvaItem.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIvaItem.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIvaItem.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIvaItem.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoIvaItem() throws Exception {		
		this.startProcessTipoIvaItem(true);
	}
	
	public void startProcessTipoIvaItem(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoIvaItem, this.jScrollPanelDatosTipoIvaItem,this.jPanelPaginacionTipoIvaItem, this.jScrollPanelDatosEdicionTipoIvaItem, this.jPanelAccionesTipoIvaItem,this.jPanelAccionesFormularioTipoIvaItem,this.jmenuBarTipoIvaItem,this.jmenuBarDetalleTipoIvaItem,this.jTtoolBarTipoIvaItem,this.jTtoolBarDetalleTipoIvaItem);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoIvaItem=null; 
		
		final JPanel jPanelParametrosReportesTipoIvaItem=this.jPanelParametrosReportesTipoIvaItem;
		//final JScrollPane jScrollPanelDatosTipoIvaItem=this.jScrollPanelDatosTipoIvaItem;
		final JTable jTableDatosTipoIvaItem=this.jTableDatosTipoIvaItem;		
		final JPanel jPanelPaginacionTipoIvaItem=this.jPanelPaginacionTipoIvaItem;
		//final JScrollPane jScrollPanelDatosEdicionTipoIvaItem=this.jScrollPanelDatosEdicionTipoIvaItem;
		final JPanel jPanelAccionesTipoIvaItem=this.jPanelAccionesTipoIvaItem;
		
		JPanel jPanelCamposAuxiliarTipoIvaItem=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoIvaItem=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
			jPanelCamposAuxiliarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jPanelCamposTipoIvaItem;
			jPanelAccionesFormularioAuxiliarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jPanelAccionesFormularioTipoIvaItem;
		}
		
		final JPanel jPanelCamposTipoIvaItem=jPanelCamposAuxiliarTipoIvaItem;
		final JPanel jPanelAccionesFormularioTipoIvaItem=jPanelAccionesFormularioAuxiliarTipoIvaItem;
		
		
		final JMenuBar jmenuBarTipoIvaItem=this.jmenuBarTipoIvaItem;
		final JToolBar jTtoolBarTipoIvaItem=this.jTtoolBarTipoIvaItem;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoIvaItem=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoIvaItem=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
			jmenuBarDetalleAuxiliarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jmenuBarDetalleTipoIvaItem;
			jTtoolBarDetalleAuxiliarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jTtoolBarDetalleTipoIvaItem;
		}
		
		final JMenuBar jmenuBarDetalleTipoIvaItem=jmenuBarDetalleAuxiliarTipoIvaItem;
		final JToolBar jTtoolBarDetalleTipoIvaItem=jTtoolBarDetalleAuxiliarTipoIvaItem;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoIvaItem;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoIvaItem;
			processRunnable.jTableDatos=jTableDatosTipoIvaItem;
			processRunnable.jPanelCampos=jPanelCamposTipoIvaItem;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoIvaItem;
			processRunnable.jPanelAcciones=jPanelAccionesTipoIvaItem;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoIvaItem;
			
			
			processRunnable.jmenuBar=jmenuBarTipoIvaItem;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoIvaItem;
			processRunnable.jTtoolBar=jTtoolBarTipoIvaItem;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoIvaItem;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoIvaItem ,jPanelParametrosReportesTipoIvaItem,jTableDatosTipoIvaItem, /*jScrollPanelDatosTipoIvaItem,*/jPanelCamposTipoIvaItem,jPanelPaginacionTipoIvaItem, /*jScrollPanelDatosEdicionTipoIvaItem,*/ jPanelAccionesTipoIvaItem,jPanelAccionesFormularioTipoIvaItem,jmenuBarTipoIvaItem,jmenuBarDetalleTipoIvaItem,jTtoolBarTipoIvaItem,jTtoolBarDetalleTipoIvaItem);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoIvaItem, jScrollPanelDatosTipoIvaItem,jPanelPaginacionTipoIvaItem, jScrollPanelDatosEdicionTipoIvaItem, jPanelAccionesTipoIvaItem,jPanelAccionesFormularioTipoIvaItem,jmenuBarTipoIvaItem,jmenuBarDetalleTipoIvaItem,jTtoolBarTipoIvaItem,jTtoolBarDetalleTipoIvaItem);
						
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
	
	public void finishProcessTipoIvaItem() {// throws Exception 
		this.finishProcessTipoIvaItem(true);
	}
	
	public void finishProcessTipoIvaItem(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoIvaItem, this.jScrollPanelDatosTipoIvaItem,this.jPanelPaginacionTipoIvaItem, this.jScrollPanelDatosEdicionTipoIvaItem, this.jPanelAccionesTipoIvaItem,this.jPanelAccionesFormularioTipoIvaItem,this.jmenuBarTipoIvaItem,this.jmenuBarDetalleTipoIvaItem,this.jTtoolBarTipoIvaItem,this.jTtoolBarDetalleTipoIvaItem);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoIvaItem=null; 
		
		final JPanel jPanelParametrosReportesTipoIvaItem=this.jPanelParametrosReportesTipoIvaItem;
		//final JScrollPane jScrollPanelDatosTipoIvaItem=this.jScrollPanelDatosTipoIvaItem;
		final JTable jTableDatosTipoIvaItem=this.jTableDatosTipoIvaItem;		
		final JPanel jPanelPaginacionTipoIvaItem=this.jPanelPaginacionTipoIvaItem;
		//final JScrollPane jScrollPanelDatosEdicionTipoIvaItem=this.jScrollPanelDatosEdicionTipoIvaItem;
		final JPanel jPanelAccionesTipoIvaItem=this.jPanelAccionesTipoIvaItem;
		
		JPanel jPanelCamposAuxiliarTipoIvaItem=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoIvaItem=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
			jPanelCamposAuxiliarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jPanelCamposTipoIvaItem;
			jPanelAccionesFormularioAuxiliarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jPanelAccionesFormularioTipoIvaItem;
		}
		
		final JPanel jPanelCamposTipoIvaItem=jPanelCamposAuxiliarTipoIvaItem;
		final JPanel jPanelAccionesFormularioTipoIvaItem=jPanelAccionesFormularioAuxiliarTipoIvaItem;
		
		
		final JMenuBar jmenuBarTipoIvaItem=this.jmenuBarTipoIvaItem;		
		final JToolBar jTtoolBarTipoIvaItem=this.jTtoolBarTipoIvaItem;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoIvaItem=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoIvaItem=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
			jmenuBarDetalleAuxiliarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jmenuBarDetalleTipoIvaItem;
			jTtoolBarDetalleAuxiliarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jTtoolBarDetalleTipoIvaItem;		
		}
		
		final JMenuBar jmenuBarDetalleTipoIvaItem=jmenuBarDetalleAuxiliarTipoIvaItem;
		final JToolBar jTtoolBarDetalleTipoIvaItem=jTtoolBarDetalleAuxiliarTipoIvaItem;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoIvaItem;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoIvaItem;
			processRunnable.jTableDatos=jTableDatosTipoIvaItem;
			processRunnable.jPanelCampos=jPanelCamposTipoIvaItem;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoIvaItem;
			processRunnable.jPanelAcciones=jPanelAccionesTipoIvaItem;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoIvaItem;
			
			
			processRunnable.jmenuBar=jmenuBarTipoIvaItem;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoIvaItem;
			processRunnable.jTtoolBar=jTtoolBarTipoIvaItem;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoIvaItem;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoIvaItem ,jPanelParametrosReportesTipoIvaItem, jTableDatosTipoIvaItem,/*jScrollPanelDatosTipoIvaItem,*/jPanelCamposTipoIvaItem,jPanelPaginacionTipoIvaItem, /*jScrollPanelDatosEdicionTipoIvaItem,*/ jPanelAccionesTipoIvaItem,jPanelAccionesFormularioTipoIvaItem,jmenuBarTipoIvaItem,jmenuBarDetalleTipoIvaItem,jTtoolBarTipoIvaItem,jTtoolBarDetalleTipoIvaItem));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoIvaItem(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoIvaItem(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoIvaItem(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoIvaItem(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoIvaItem,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoIvaItem,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoIvaItem(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoIvaItem,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoIvaItem,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoivaitemConstantesFunciones.getsFinalQueryTipoIvaItem();
		String  finalQueryPaginacionTodos=this.tipoivaitemConstantesFunciones.getsFinalQueryTipoIvaItem();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoIvaItemConstantesFunciones.getArrayColumnasGlobalesNoTipoIvaItem(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoIvaItemConstantesFunciones.getArrayColumnasGlobalesTipoIvaItem(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoIvaItemConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoivaitemsEliminados= new ArrayList<TipoIvaItem>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoIvaItem();
		
				///*TipoIvaItemSessionBean*/this.tipoivaitemSessionBean=new TipoIvaItemSessionBean();
			
			if(this.tipoivaitemSessionBean==null) {
				this.tipoivaitemSessionBean=new TipoIvaItemSessionBean();
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
					this.iNumeroPaginacion=TipoIvaItemConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoIvaItemConstantesFunciones.getClassesForeignKeysOfTipoIvaItem(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoivaitem."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoivaitemsAux= new ArrayList<TipoIvaItem>();
			
				
			tipoivaitemLogic.setDatosCliente(this.datosCliente);
			tipoivaitemLogic.setDatosDeep(this.datosDeep);
			tipoivaitemLogic.setIsConDeep(true);
			
			
			tipoivaitemLogic.getTipoIvaItemDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoivaitemLogic.getTodosTipoIvaItems(finalQueryGlobal,pagination);
					
					//tipoivaitemLogic.getTodosTipoIvaItemsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoivaitemLogic.getTipoIvaItems()==null|| tipoivaitemLogic.getTipoIvaItems().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoivaitemsAux= new ArrayList<TipoIvaItem>();
							tipoivaitemsAux.addAll(tipoivaitemLogic.getTipoIvaItems());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoivaitemsAux= new ArrayList<TipoIvaItem>();
							tipoivaitemsAux.addAll(tipoivaitems);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoivaitemLogic.getTodosTipoIvaItems(finalQueryGlobal+"",this.pagination);												
							
							//tipoivaitemLogic.getTodosTipoIvaItemsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoIvaItems("Todos",tipoivaitemLogic.getTipoIvaItems() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoivaitemLogic.setTipoIvaItems(new ArrayList<TipoIvaItem>());					
							tipoivaitemLogic.getTipoIvaItems().addAll(tipoivaitemsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoivaitems=new ArrayList<TipoIvaItem>();
							tipoivaitems.addAll(tipoivaitemsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoIvaItem=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoIvaItem=this.idActual;
				
				} else if(this.idTipoIvaItemActual!=null && this.idTipoIvaItemActual!=0L) {
					idTipoIvaItem=idTipoIvaItemActual;
				}
				
					
				this.sDetalleReporte=TipoIvaItemConstantesFunciones.getDetalleIndicePorId(idTipoIvaItem);
				
				this.tipoivaitems=new ArrayList<TipoIvaItem>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoivaitemLogic.getEntity(idTipoIvaItem);
					
					//tipoivaitemLogic.getEntityWithConnection(idTipoIvaItem);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoivaitemLogic.setTipoIvaItems(new ArrayList<TipoIvaItem>());
					tipoivaitemLogic.getTipoIvaItems().add(tipoivaitemLogic.getTipoIvaItem());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoivaitems=new ArrayList<TipoIvaItem>();
					this.tipoivaitems.add(tipoivaitem);
				}
				
				if(tipoivaitemLogic.getTipoIvaItem()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoIvaItem();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoIvaItem();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoivaitemLogic.getTipoIvaItems().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoivaitems.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoivaitemLogic.getTipoIvaItems().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoivaitems.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoIvaItem tipoivaitem) {
		Boolean permite=true;
		
		if(this.tipoivaitem.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoIvaItemConstantesFunciones.getOrderByListaTipoIvaItem();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoIvaItemConstantesFunciones.getOrderByListaTipoIvaItem();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIvaItem tipoivaitem:tipoivaitemLogic.getTipoIvaItems()) {
				if(tipoivaitem.getsType().equals(Constantes2.S_TOTALES)) {
					tipoivaitemTotales=tipoivaitem;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIvaItem tipoivaitem:this.tipoivaitems) {
				if(tipoivaitem.getsType().equals(Constantes2.S_TOTALES)) {
					tipoivaitemTotales=tipoivaitem;
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
			this.tipoivaitemAux=new TipoIvaItem();
			this.tipoivaitemAux.setsType(Constantes2.S_TOTALES);
			this.tipoivaitemAux.setIsNew(false);
			this.tipoivaitemAux.setIsChanged(false);
			this.tipoivaitemAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoIvaItemConstantesFunciones.TotalizarValoresFilaTipoIvaItem(this.tipoivaitemLogic.getTipoIvaItems(),this.tipoivaitemAux);
				
				this.tipoivaitemLogic.getTipoIvaItems().add(this.tipoivaitemAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoIvaItemConstantesFunciones.TotalizarValoresFilaTipoIvaItem(this.tipoivaitems,this.tipoivaitemAux);
				
				this.tipoivaitems.add(this.tipoivaitemAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoivaitemTotales=new TipoIvaItem();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoivaitemLogic.getTipoIvaItems().remove(tipoivaitemTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoivaitems.remove(tipoivaitemTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoivaitemTotales=new TipoIvaItem();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoIvaItem tipoivaitem:tipoivaitemLogic.getTipoIvaItems()) {
				if(tipoivaitem.getsType().equals(Constantes2.S_TOTALES)) {
					tipoivaitemTotales=tipoivaitem;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoIvaItemConstantesFunciones.TotalizarValoresFilaTipoIvaItem(this.tipoivaitemLogic.getTipoIvaItems(),tipoivaitemTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoIvaItem tipoivaitem:this.tipoivaitems) {
				if(tipoivaitem.getsType().equals(Constantes2.S_TOTALES)) {
					tipoivaitemTotales=tipoivaitem;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoIvaItemConstantesFunciones.TotalizarValoresFilaTipoIvaItem(this.tipoivaitems,tipoivaitemTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoIvaItem() {
		this.isPermisoTodoTipoIvaItem=false;
		this.isPermisoNuevoTipoIvaItem=false;
		this.isPermisoActualizarTipoIvaItem=false;
		this.isPermisoActualizarOriginalTipoIvaItem=false;
		this.isPermisoEliminarTipoIvaItem=false;
		this.isPermisoGuardarCambiosTipoIvaItem=false;
		this.isPermisoConsultaTipoIvaItem=false;
		this.isPermisoBusquedaTipoIvaItem=false;
		this.isPermisoReporteTipoIvaItem=false;		
		this.isPermisoOrdenTipoIvaItem=false;		
		this.isPermisoPaginacionMedioTipoIvaItem=false;		
		this.isPermisoPaginacionAltoTipoIvaItem=false;
		this.isPermisoPaginacionTodoTipoIvaItem=false;
		this.isPermisoCopiarTipoIvaItem=false;		
		this.isPermisoVerFormTipoIvaItem=false;		
		this.isPermisoDuplicarTipoIvaItem=false;		
		this.isPermisoOrdenTipoIvaItem=false;		
	}
	
	public void setPermisosUsuarioTipoIvaItem(Boolean isPermiso) {
		this.isPermisoTodoTipoIvaItem=isPermiso;
		this.isPermisoNuevoTipoIvaItem=isPermiso;
		this.isPermisoActualizarTipoIvaItem=isPermiso;
		this.isPermisoActualizarOriginalTipoIvaItem=isPermiso;
		this.isPermisoEliminarTipoIvaItem=isPermiso;
		this.isPermisoGuardarCambiosTipoIvaItem=isPermiso;
		this.isPermisoConsultaTipoIvaItem=isPermiso;
		this.isPermisoBusquedaTipoIvaItem=isPermiso;
		this.isPermisoReporteTipoIvaItem=isPermiso;
		this.isPermisoOrdenTipoIvaItem=isPermiso;		
		this.isPermisoPaginacionMedioTipoIvaItem=isPermiso;		
		this.isPermisoPaginacionAltoTipoIvaItem=isPermiso;		
		this.isPermisoPaginacionTodoTipoIvaItem=isPermiso;		
		this.isPermisoCopiarTipoIvaItem=isPermiso;		
		this.isPermisoVerFormTipoIvaItem=isPermiso;		
		this.isPermisoDuplicarTipoIvaItem=isPermiso;
		this.isPermisoOrdenTipoIvaItem=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoIvaItem(Boolean isPermiso) {
		//this.isPermisoTodoTipoIvaItem=isPermiso;
		this.isPermisoNuevoTipoIvaItem=isPermiso;
		this.isPermisoActualizarTipoIvaItem=isPermiso;
		this.isPermisoActualizarOriginalTipoIvaItem=isPermiso;
		this.isPermisoEliminarTipoIvaItem=isPermiso;
		this.isPermisoGuardarCambiosTipoIvaItem=isPermiso;
		//this.isPermisoConsultaTipoIvaItem=isPermiso;
		//this.isPermisoBusquedaTipoIvaItem=isPermiso;
		//this.isPermisoReporteTipoIvaItem=isPermiso;
		//this.isPermisoOrdenTipoIvaItem=isPermiso;		
		//this.isPermisoPaginacionMedioTipoIvaItem=isPermiso;		
		//this.isPermisoPaginacionAltoTipoIvaItem=isPermiso;		
		//this.isPermisoPaginacionTodoTipoIvaItem=isPermiso;		
		//this.isPermisoCopiarTipoIvaItem=isPermiso;		
		//this.isPermisoDuplicarTipoIvaItem=isPermiso;
		//this.isPermisoOrdenTipoIvaItem=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoIvaItemClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
		if(TipoIvaItemJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosDefinicion=this.verificarGetPermisosUsuarioOpcionTipoIvaItemClaseRelacionada(this.opcionsRelacionadas,DefinicionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoIvaItem(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoIvaItemClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDefinicion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoIvaItemClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoIvaItemClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoIvaItemClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDefinicion && this.jInternalFrameDetalleFormTipoIvaItem!=null && this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIvaItem.jTabbedPaneRelacionesTipoIvaItem.remove(this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoIvaItem() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoIvaItemJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoIvaItemConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoIvaItem=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoIvaItem=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoIvaItem=this.isPermisoActualizarTipoIvaItem;
			this.isPermisoEliminarTipoIvaItem=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoIvaItem=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoIvaItem=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoIvaItem=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoIvaItem=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoIvaItem=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoIvaItem=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoIvaItem=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoIvaItem=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoIvaItem=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoIvaItem=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoIvaItem=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoIvaItem=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoIvaItem=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoIvaItem.setToolTipText(this.jTableDatosTipoIvaItem.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoIvaItem(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoIvaItem(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoIvaItemJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoIvaItemJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoIvaItem() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDefinicion && this.tipoivaitemConstantesFunciones.mostrarDefinicionTipoIvaItem && !TipoIvaItemConstantesFunciones.ISGUARDARREL) {

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
	
		
	public void inicializarCombosForeignKeyTipoIvaItemListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoIvaItemListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoIvaItemJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoIvaItemListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoIvaItemListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoIvaItem()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoIvaItem()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoIvaItem(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoIvaItem()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIvaItem();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoIvaItem(TipoIvaItem tipoivaitem)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoIvaItem(TipoIvaItem tipoivaitem,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoIvaItem()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoIvaItem()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoIvaItem()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoIvaItem()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoIvaItem()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoIvaItem()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoIvaItem(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoIvaItem()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoIvaItemBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoIvaItemBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoIvaItemBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoivaitemSessionBean=new TipoIvaItemSessionBean(); 
		this.tipoivaitemConstantesFunciones=new TipoIvaItemConstantesFunciones(); 
		this.tipoivaitemBean=new TipoIvaItem();//(this.tipoivaitemConstantesFunciones); 		
		this.tipoivaitemReturnGeneral=new TipoIvaItemParameterReturnGeneral(); 
		
		this.tipoivaitemSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoivaitemSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoIvaItemBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoIvaItemBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoIvaItemBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoIvaItem(true);
			
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
			
			this.tipoivaitemConstantesFunciones=new TipoIvaItemConstantesFunciones(); 
			this.tipoivaitemBean=new TipoIvaItem();//this.tipoivaitemConstantesFunciones); 			
			this.tipoivaitemReturnGeneral=new TipoIvaItemParameterReturnGeneral(); 
		
			TipoIvaItemBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Iva Item Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoivaitem=new TipoIvaItem();
			this.tipoivaitems = new ArrayList<TipoIvaItem>();
			this.tipoivaitemsAux = new ArrayList<TipoIvaItem>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic=new TipoIvaItemLogic();
				this.tipoivaitemLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoivaitemSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoivaitemSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoIvaItem);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoIvaItem!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoIvaItem);	
					}
					
					if(this.jInternalFrameImportacionTipoIvaItem!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoIvaItem);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoIvaItem!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoIvaItem);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoIvaItem);
				this.jInternalFrameDetalleFormTipoIvaItem.setVisible(false);
				this.jInternalFrameDetalleFormTipoIvaItem.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoIvaItem!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoIvaItem);
					this.jInternalFrameReporteDinamicoTipoIvaItem.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoIvaItem.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoIvaItem!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoIvaItem);
					this.jInternalFrameImportacionTipoIvaItem.setVisible(false);
					this.jInternalFrameImportacionTipoIvaItem.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoIvaItem!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoIvaItem);
					this.jInternalFrameOrderByTipoIvaItem.setVisible(false);
					this.jInternalFrameOrderByTipoIvaItem.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoIvaItemActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoIvaItemConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoivaitemReturnGeneral=new TipoIvaItemParameterReturnGeneral();
			
			this.tipoivaitemParameterGeneral=new TipoIvaItemParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoivaitemLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoIvaItemJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DefinicionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoIvaItemConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoivaitemSessionBean.getEsGuardarRelacionado(),this.tipoivaitemSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoIvaItemConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoivaitemSessionBean.getEsGuardarRelacionado(),this.tipoivaitemSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoIvaItem=false;
			this.isVisibilidadCeldaDuplicarTipoIvaItem=true;
			this.isVisibilidadCeldaCopiarTipoIvaItem=true;
			this.isVisibilidadCeldaVerFormTipoIvaItem=true;
			this.isVisibilidadCeldaOrdenTipoIvaItem=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=false;
			this.isVisibilidadCeldaModificarTipoIvaItem=false;
			this.isVisibilidadCeldaActualizarTipoIvaItem=false;
			this.isVisibilidadCeldaEliminarTipoIvaItem=false;
			this.isVisibilidadCeldaCancelarTipoIvaItem=false;
			this.isVisibilidadCeldaGuardarTipoIvaItem=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoIvaItem("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoIvaItem();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoIvaItem(false);
			
			this.setPermisosUsuarioTipoIvaItem();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoivaitemSessionBean.getEsGuardarRelacionado() && this.tipoivaitemSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoIvaItemClasesRelacionadas();
			}
			
			if(this.tipoivaitemSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoIvaItemClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoIvaItemJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoIvaItem();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoIvaItem();
			}
			
			if(!this.isPermisoBusquedaTipoIvaItem) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoIvaItem,this.isPermisoPaginacionMedioTipoIvaItem,this.isPermisoPaginacionTodoTipoIvaItem);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoIvaItemConstantesFunciones.getTiposSeleccionarTipoIvaItem());
				
				this.tiposColumnasSelect=TipoIvaItemConstantesFunciones.getTiposSeleccionarTipoIvaItem(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoIvaItem();				
				//this.tiposRelacionesSelect=TipoIvaItemConstantesFunciones.getTiposRelacionesTipoIvaItem(true);
				
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
			//if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoIvaItem();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoIvaItem(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoIvaItem(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIvaItem() ;
			
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
				tipoivaitemImplementable= (TipoIvaItemImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoIvaItemConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoivaitemImplementableHome= (TipoIvaItemImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoIvaItemConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoivaitems= new ArrayList<TipoIvaItem>();
			this.tipoivaitemsEliminados= new ArrayList<TipoIvaItem>();
						
			this.isEsNuevoTipoIvaItem=false;
			this.esParaAccionDesdeFormularioTipoIvaItem=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoIvaItem(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoIvaItem();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoIvaItemConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoIvaItem("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoIvaItem(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoIvaItem();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoIvaItem();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoIvaItem(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoIvaItem: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoIvaItem() {
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
			if(sTipo.equals("RelacionesTipoIvaItem")) {
				iIndex=this.jInternalFrameDetalleFormTipoIvaItem.jTabbedPaneRelacionesTipoIvaItem.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoIvaItem.jTabbedPaneRelacionesTipoIvaItem.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();	
				
				

				if(sTitle.equals("Definiciones")) {
					if(!DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoIvaItem();

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
				this.finishProcessTipoIvaItem();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDefinicion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoIvaItem.cargarSessionConBeanSwingJInternalFrameDefinicion(false,true,iIndex);
		this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDefinicion();

		//this.jTabbedPaneRelacionesTipoIvaItem.updateUI();
		//this.jTabbedPaneRelacionesTipoIvaItem.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoIvaItem.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Definicion")) {
				int row=this.jTableDatosTipoIvaItem.getSelectedRow();
				jButtonDefinicionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Definicion")) {

					if(this.isTienePermisosDefinicion && this.tipoivaitemConstantesFunciones.mostrarDefinicionTipoIvaItem && !TipoIvaItemConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Definiciones"+"("+DefinicionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Definiciones");

						if(tipoivaitemConstantesFunciones.resaltarDefinicionTipoIvaItem!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipoivaitemConstantesFunciones.resaltarDefinicionTipoIvaItem);
						}

						jmenuItem.setEnabled(this.tipoivaitemConstantesFunciones.activarDefinicionTipoIvaItem);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Definicion"));

						

						this.jInternalFrameDetalleFormTipoIvaItem.jmenuDetalleTipoIvaItem.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoIvaItem(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoIvaItem(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoIvaItem(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoIvaItemListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoIvaItem();
		
		this.cargarCombosFrameForeignKeyTipoIvaItem();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoIvaItem();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoIvaItem();
		}
	}
	
	
	
	public void jButtonNuevoTipoIvaItemActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoivaitemSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoIvaItem==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			
			
			if(jTableDatosTipoIvaItem.getRowCount()>=1) {
				jTableDatosTipoIvaItem.removeRowSelectionInterval(0, jTableDatosTipoIvaItem.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoIvaItem=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoIvaItem(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoIvaItem(true);			
			//this.tipoivaitem=new TipoIvaItem();
			//this.tipoivaitem.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIvaItem(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIvaItem() ;
			
			if(TipoIvaItemJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIvaItem(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoivaitem);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);				
			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			
			if(this.tipoivaitemSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoIvaItem: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoIvaItemActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoIvaItem.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoIvaItem.getSelectedRows().length;			
			}
			
			tipoivaitemsSeleccionados=this.getTipoIvaItemsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoIvaItem--;			
				//TipoIvaItem tipoivaitemAux= new TipoIvaItem();			
				//tipoivaitemAux.setId(this.iIdNuevoTipoIvaItem);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoIvaItem tipoivaitemOrigen=new TipoIvaItem();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoIvaItem tipoivaitemOrigen : tipoivaitemsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoivaitemOrigen =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoivaitemOrigen =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoIvaItem();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoivaitem.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoIvaItem(tipoivaitemOrigen,this.tipoivaitem,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoivaitemLogic.getTipoIvaItems().add(this.tipoivaitemAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoivaitems.add(this.tipoivaitemAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoIvaItem(false);
				
				this.jTableDatosTipoIvaItem.setRowSelectionInterval(this.getIndiceNuevoTipoIvaItem(), this.getIndiceNuevoTipoIvaItem());
				
				int iLastRow =  this.jTableDatosTipoIvaItem.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoIvaItem.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoIvaItem.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIvaItem(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();									
		
			TipoIvaItem tipoivaitemOrigen=new TipoIvaItem();
			TipoIvaItem tipoivaitemDestino=new TipoIvaItem();
				
			tipoivaitemsSeleccionados=this.getTipoIvaItemsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoIvaItem.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoivaitemsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoIvaItem.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoivaitemOrigen =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoivaitemOrigen =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoivaitemDestino =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoivaitemDestino =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoivaitemOrigen =tipoivaitemsSeleccionados.get(0);
				tipoivaitemDestino =tipoivaitemsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoIvaItem(tipoivaitemOrigen,tipoivaitemDestino,true,false);
				
				tipoivaitemDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoivaitemDestino,tipoivaitemLogic.getTipoIvaItems());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoivaitemDestino,tipoivaitems);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoIvaItem(false);
				
				//this.jTableDatosTipoIvaItem.setRowSelectionInterval(this.getIndiceNuevoTipoIvaItem(), this.getIndiceNuevoTipoIvaItem());
				
				int iLastRow =  this.jTableDatosTipoIvaItem.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoIvaItem.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoIvaItem.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIvaItem(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoIvaItem==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoIvaItem.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoIvaItem.isVisible();
			
			
			this.jPanelParametrosReportesTipoIvaItem.setVisible(!isVisible);
			this.jPanelPaginacionTipoIvaItem.setVisible(!isVisible);
			this.jPanelAccionesTipoIvaItem.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoIvaItem();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoIvaItem();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoIvaItem();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoIvaItem();
			
			this.abrirFrameOrderByTipoIvaItem();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoIvaItem();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoIvaItem(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoIvaItem);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoIvaItem.isMaximum()) {
					this.jInternalFrameDetalleFormTipoIvaItem.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoIvaItem.setSize(this.jInternalFrameDetalleFormTipoIvaItem.iWidthFormulario,this.jInternalFrameDetalleFormTipoIvaItem.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoIvaItem.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoIvaItem.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoIvaItem.isMaximum()) {
						this.jInternalFrameDetalleFormTipoIvaItem.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoIvaItem.jContentPaneDetalleTipoIvaItem.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoIvaItem.jTabbedPaneRelacionesTipoIvaItem.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoIvaItem.jContentPaneDetalleTipoIvaItem.getWidth(),TipoIvaItemConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoIvaItem.jTabbedPaneRelacionesTipoIvaItem.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoIvaItem.jContentPaneDetalleTipoIvaItem.getWidth(),TipoIvaItemConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoIvaItem.jTabbedPaneRelacionesTipoIvaItem.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoIvaItem.jContentPaneDetalleTipoIvaItem.getWidth(),TipoIvaItemConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDefinicion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoIvaItem.setVisible(true);
	        this.jInternalFrameDetalleFormTipoIvaItem.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoIvaItem() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoIvaItem==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoIvaItem=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIvaItem,false,this);
				} else {
					this.jInternalFrameOrderByTipoIvaItem=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoIvaItem,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoIvaItem);
				this.jInternalFrameOrderByTipoIvaItem.setVisible(false);
				this.jInternalFrameOrderByTipoIvaItem.setSelected(false);
				
				this.jInternalFrameOrderByTipoIvaItem.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoIvaItem"));
				
				this.inicializarActualizarBindingTablaOrderByTipoIvaItem();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoIvaItem() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoIvaItem==null) {
				
				this.jInternalFrameImportacionTipoIvaItem=new ImportacionJInternalFrame(TipoIvaItemConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoIvaItem);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoIvaItem);
				this.jInternalFrameImportacionTipoIvaItem.setVisible(false);
				this.jInternalFrameImportacionTipoIvaItem.setSelected(false);


				this.jInternalFrameImportacionTipoIvaItem.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoIvaItem"));
				this.jInternalFrameImportacionTipoIvaItem.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoIvaItem"));
				this.jInternalFrameImportacionTipoIvaItem.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoIvaItem"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoIvaItem() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoIvaItem==null) {
				this.jInternalFrameReporteDinamicoTipoIvaItem=new ReporteDinamicoJInternalFrame(TipoIvaItemConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoIvaItem);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoIvaItem);
				this.jInternalFrameReporteDinamicoTipoIvaItem.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoIvaItem.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoIvaItem.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIvaItem"));
				this.jInternalFrameReporteDinamicoTipoIvaItem.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIvaItem"));
				this.jInternalFrameReporteDinamicoTipoIvaItem.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIvaItem"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIvaItem();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDefinicion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoIvaItem.jContentPaneDetalleTipoIvaItem.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoIvaItem() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoIvaItem);
			
	       	this.jInternalFrameDetalleFormTipoIvaItem.setVisible(false);
	        this.jInternalFrameDetalleFormTipoIvaItem.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoIvaItem.dispose();
			//this.jInternalFrameDetalleFormTipoIvaItem=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoIvaItem() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoIvaItem.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoIvaItem.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoIvaItem() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoIvaItem.setVisible(true);
	        this.jInternalFrameImportacionTipoIvaItem.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoIvaItem() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoIvaItem.setVisible(true);
	        this.jInternalFrameOrderByTipoIvaItem.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoIvaItem() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoIvaItem.setVisible(false);
	        this.jInternalFrameOrderByTipoIvaItem.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoIvaItem() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoIvaItem.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoIvaItem.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoIvaItem() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoIvaItem.setVisible(false);
	        this.jInternalFrameImportacionTipoIvaItem.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoIvaItem(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoIvaItem(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoIvaItem(true);
			//this.isEsNuevoTipoIvaItem=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitem =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoivaitem =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoIvaItem("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIvaItem(false) ;
			
			if(tipoivaitemSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado() && DefinicionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDefinicionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoIvaItemJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIvaItem(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIvaItem(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoIvaItemActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitem =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoivaitem =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoIvaItem(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoIvaItem==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoIvaItem(true);
			//this.isEsNuevoTipoIvaItem=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitem =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoivaitem =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoivaitem.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoIvaItem("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoIvaItem(false) ;
			
			if(TipoIvaItemJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoIvaItem(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIvaItem(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoIvaItem(false);
			
			//if(!this.isEsNuevoTipoIvaItem) {								
				int intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitem =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoivaitem =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoIvaItem(this.tipoivaitem,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);
				
			}
			
			if(this.permiteMantenimiento(this.tipoivaitem)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoIvaItem=true;
					this.inicializarActualizarBindingTablaTipoIvaItem(false);
					this.isEsNuevoTipoIvaItem=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoIvaItem=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoIvaItem=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoIvaItem(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIvaItem(false);
				
				this.habilitarDeshabilitarControlesTipoIvaItem(false);
			
												
				
				if(TipoIvaItemJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoIvaItem();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoIvaItemActionPerformed(evt,tipoivaitemSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoIvaItem(this.tipoivaitem,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoIvaItem.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoivaitemSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoivaitem.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoIvaItem.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIvaItem.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitem =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				this.tipoivaitem.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoivaitem =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				this.tipoivaitem.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoivaitem)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoIvaItemModel) this.jTableDatosTipoIvaItem.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoIvaItem=true;
				this.inicializarActualizarBindingTablaTipoIvaItem(false);
				this.isEsNuevoTipoIvaItem=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoIvaItem(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIvaItem(false);
				
				this.habilitarDeshabilitarControlesTipoIvaItem(false);
				
				
				
				if(TipoIvaItemJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoIvaItem();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoIvaItem.getRowCount()>=1) {
				jTableDatosTipoIvaItem.removeRowSelectionInterval(0, jTableDatosTipoIvaItem.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoIvaItem(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoIvaItem(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoIvaItem(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoIvaItem(false) ;
			
			this.isEsNuevoTipoIvaItem=false;
			
			if(TipoIvaItemJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoIvaItem();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoIvaItem(false);
				
				//SI ES MANUAL
				if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoIvaItem();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoIvaItem--;			
			//TipoIvaItem tipoivaitemAux= new TipoIvaItem();			
			//tipoivaitemAux.setId(this.iIdNuevoTipoIvaItem);
			
			if(this.jInternalFrameDetalleFormTipoIvaItem==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoIvaItem();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);
			
			this.tipoivaitem.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoivaitemLogic.getTipoIvaItems().add(this.tipoivaitemAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoivaitems.add(this.tipoivaitemAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoIvaItem(false);
			
			this.jTableDatosTipoIvaItem.setRowSelectionInterval(this.getIndiceNuevoTipoIvaItem(), this.getIndiceNuevoTipoIvaItem());
			
			int iLastRow =  this.jTableDatosTipoIvaItem.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoIvaItem.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoIvaItem.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoIvaItem(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoIvaItem(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIvaItem(false);
			
			//SI ES MANUAL
			if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIvaItem();
			}
			
			//this.abrirFrameTreeTipoIvaItem();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Iva ItemES ?", "MANTENIMIENTO DE Tipo Iva Item", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoIvaItem.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoIvaItem();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoivaitemReturnGeneral=tipoivaitemLogic.procesarImportacionTipoIvaItemsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoivaitemParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoIvaItemReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoIvaItem.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoIvaItem.setFileImportacion(this.jInternalFrameImportacionTipoIvaItem.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoIvaItem.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoIvaItem.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoIvaItem.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoIvaItem.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();		

		tipoivaitemsSeleccionados=this.getTipoIvaItemsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIvaItem.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIvaItem.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoIvaItemBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoIvaItemBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoIvaItems("Todos",tipoivaitemsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva Item",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoIvaItem.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIvaItem.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoIvaItemConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoIvaItemConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoIvaItem.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoIvaItem.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoIvaItem.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoIvaItemConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoIvaItemConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoIvaItem.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoIvaItemConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoIvaItemConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoIvaItem.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIvaItem.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoIvaItemConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoIvaItemConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();		
		
		tipoivaitemsSeleccionados=this.getTipoIvaItemsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoivaitem";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoIvaItems");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoIvaItem.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoIvaItem.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoIvaItemConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoIvaItemConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoIvaItem tipoivaitem:tipoivaitemsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoivaitem.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoIvaItemConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoIvaItemConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoIvaItem tipoivaitem:tipoivaitemsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoivaitem.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoIvaItem(row);				
			//	iRow++;
			//}				
			
			//for(TipoIvaItem tipoivaitemAux:tipoivaitemsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoIvaItem(tipoivaitemAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva Item",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoivaitemLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIvaItem(false);
			
			//SI ES MANUAL
			if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoIvaItem();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIvaItem(false);
			
			//SI ES MANUAL
			if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoIvaItem();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoIvaItemActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoIvaItem(false);
			
			//SI ES MANUAL
			if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoIvaItem();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoivaitemLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoIvaItem() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoIvaItem.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoIvaItem.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoIvaItem.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoIvaItem.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoIvaItem.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoIvaItem.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoIvaItem.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoIvaItem(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoIvaItem(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoIvaItem(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoIvaItem(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoIvaItem(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoIvaItem(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIvaItem(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoIvaItem(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoIvaItemJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoIvaItemJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoIvaItem() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoIvaItem();
		
		this.inicializarActualizarBindingBotonesManualTipoIvaItem(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoIvaItem();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoIvaItem() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIvaItem(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIvaItem(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoIvaItem.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoIvaItem.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoIvaItem.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoIvaItem.jCheckBoxPostAccionNuevoTipoIvaItem.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoIvaItem.jCheckBoxPostAccionSinCerrarTipoIvaItem.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoIvaItem.jCheckBoxPostAccionSinMensajeTipoIvaItem.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoIvaItem.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoIvaItem.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoIvaItem.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
				this.jInternalFrameDetalleFormTipoIvaItem.jCheckBoxPostAccionNuevoTipoIvaItem.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoIvaItem.jCheckBoxPostAccionSinCerrarTipoIvaItem.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoIvaItem.jCheckBoxPostAccionSinMensajeTipoIvaItem.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoIvaItem.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoIvaItem.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoIvaItem.jComboBoxTiposAccionesFormularioTipoIvaItem.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoIvaItem.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoIvaItem!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIvaItem.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoIvaItem.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoIvaItem.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoIvaItem.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoIvaItem.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoIvaItem!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoIvaItem.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoIvaItem.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoIvaItem.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoIvaItem(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoIvaItem(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoIvaItem() throws Exception {
		try	{
			if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoIvaItem();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoIvaItem() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoIvaItem.jComboBoxTiposAccionesFormularioTipoIvaItem.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoIvaItem.jComboBoxTiposAccionesFormularioTipoIvaItem.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoIvaItem() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoIvaItem.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoIvaItem.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoIvaItem.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoIvaItem.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoIvaItem.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoIvaItem.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoIvaItem.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoIvaItem.addItem(reporte);
			}
			
			
			if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoIvaItem.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoIvaItem.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoIvaItem.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoIvaItem.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoIvaItem.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoIvaItem.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoIvaItem.jComboBoxTiposAccionesFormularioTipoIvaItem.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoIvaItem.jComboBoxTiposAccionesFormularioTipoIvaItem.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoIvaItem.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoIvaItem.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoIvaItem.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIvaItem();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoIvaItem() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoIvaItem!=null) {
				this.jInternalFrameReporteDinamicoTipoIvaItem.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoIvaItem.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoIvaItem!=null) {
				this.jInternalFrameReporteDinamicoTipoIvaItem.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoIvaItem.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoIvaItem!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoIvaItem.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoIvaItem.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoIvaItem.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoIvaItem.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoIvaItem.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoIvaItem.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoIvaItem()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoIvaItem(Boolean esInicializar) throws Exception {				
		if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoIvaItem();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoIvaItem() throws Exception {
		this.inicializarActualizarBindingTablaTipoIvaItem(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoIvaItem() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoIvaItemPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoIvaItemPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoIvaItemOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIvaItemOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoIvaItemPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoIvaItemPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoIvaItem(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoivaitemLogic.getTipoIvaItems().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoivaitems.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoIvaItem.setModel(new TipoIvaItemModel(this.tipoivaitemLogic.getTipoIvaItems(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoIvaItem.setModel(new TipoIvaItemModel(this.tipoivaitems,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoIvaItem!=null && this.jInternalFrameOrderByTipoIvaItem.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoIvaItem();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoIvaItem.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIvaItem,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoIvaItemPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO,tipoivaitemConstantesFunciones.resaltarSeleccionarTipoIvaItem,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoIvaItemConstantesFunciones.SCLASSWEBTITULO,tipoivaitemConstantesFunciones.resaltarSeleccionarTipoIvaItem,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoIvaItem.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIvaItem,TipoIvaItemConstantesFunciones.LABEL_ID));

		if(this.tipoivaitemConstantesFunciones.mostraridTipoIvaItem && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIvaItemConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoivaitemConstantesFunciones.resaltaridTipoIvaItem,this.tipoivaitemConstantesFunciones.activaridTipoIvaItem,this,true,"idTipoIvaItem","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoivaitemConstantesFunciones.resaltaridTipoIvaItem,this.tipoivaitemConstantesFunciones.activaridTipoIvaItem,this,true,"idTipoIvaItem","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoIvaItem.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIvaItem,TipoIvaItemConstantesFunciones.LABEL_CODIGO));

		if(this.tipoivaitemConstantesFunciones.mostrarcodigoTipoIvaItem && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIvaItemConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoivaitemConstantesFunciones.resaltarcodigoTipoIvaItem,this.tipoivaitemConstantesFunciones.activarcodigoTipoIvaItem,this,true,"codigoTipoIvaItem","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoivaitemConstantesFunciones.resaltarcodigoTipoIvaItem,this.tipoivaitemConstantesFunciones.activarcodigoTipoIvaItem,this,true,"codigoTipoIvaItem","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoIvaItemPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoIvaItem.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoIvaItem,TipoIvaItemConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoivaitemConstantesFunciones.mostrarnombreTipoIvaItem && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoIvaItemConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoivaitemConstantesFunciones.resaltarnombreTipoIvaItem,this.tipoivaitemConstantesFunciones.activarnombreTipoIvaItem,this,true,"nombreTipoIvaItem","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoivaitemConstantesFunciones.resaltarnombreTipoIvaItem,this.tipoivaitemConstantesFunciones.activarnombreTipoIvaItem,this,true,"nombreTipoIvaItem","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoIvaItemPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDefinicion && this.tipoivaitemConstantesFunciones.mostrarDefinicionTipoIvaItem && !TipoIvaItemConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Definiciones");
				tableColumn.setHeaderValue("Definiciones");
				tableColumn.setCellRenderer(new DefinicionTableCell(tipoivaitemConstantesFunciones.resaltarDefinicionTipoIvaItem,this,this.tipoivaitemConstantesFunciones.activarDefinicionTipoIvaItem));
				tableColumn.setCellEditor(new DefinicionTableCell(tipoivaitemConstantesFunciones.resaltarDefinicionTipoIvaItem,this,this.tipoivaitemConstantesFunciones.activarDefinicionTipoIvaItem));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoIvaItem.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoivaitemSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoivaitemSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoIvaItem.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoivaitemSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoivaitemSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoIvaItem.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoIvaItem && this.isPermisoGuardarCambiosTipoIvaItem) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoivaitemSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoivaitemSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoIvaItem.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipoivaitemSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoIvaItem.addColumn(tableColumn);
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
			
			this.jTableDatosTipoIvaItem.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoIvaItem && this.isPermisoGuardarCambiosTipoIvaItem) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoivaitemSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoIvaItem && this.isPermisoGuardarCambiosTipoIvaItem) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoIvaItem.moveColumn(this.jTableDatosTipoIvaItem.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoIvaItem.moveColumn(this.jTableDatosTipoIvaItem.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipoivaitemSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoIvaItem.moveColumn(this.jTableDatosTipoIvaItem.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoIvaItem.moveColumn(this.jTableDatosTipoIvaItem.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoIvaItem.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoIvaItem.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoIvaItem,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoIvaItemJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoIvaItem.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoIvaItem.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoIvaItemJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoIvaItemJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoIvaItem.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoIvaItem.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoIvaItem.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoivaitemLogic.getTipoIvaItems().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoivaitems.size()-1;
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
		//this.jTableDatosTipoIvaItem.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoIvaItem.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoIvaItem();
			
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
				
				//this.isEsNuevoTipoIvaItem=false;
					
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			
				if(this.tipoivaitemSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoIvaItem==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoIvaItem.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoIvaItem.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitem =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoivaitem =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoivaitem.getsType().equals("DUPLICADO")
				   || this.tipoivaitem.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoIvaItem=true;
				
				} else {
					this.isEsNuevoTipoIvaItem=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoivaitem.getId()>=0 && !this.tipoivaitem.getIsNew()) {						
						this.isEsNuevoTipoIvaItem=false;
						
					} else {
						this.isEsNuevoTipoIvaItem=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoIvaItem(esRelaciones);						
				
				this.seleccionarTipoIvaItem(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoivaitem.getId()<0) {
					this.isEsNuevoTipoIvaItem=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoIvaItem(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoIvaItem(evt,rowIndex);
				}	
				
				if(this.tipoivaitemSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoIvaItem: " + this.dDif); 
					}
				}								
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoIvaItem(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoivaitem)) {
					if(this.tipoivaitem.getId()>0) {
						this.tipoivaitem.setIsDeleted(true);
						
						this.tipoivaitemsEliminados.add(this.tipoivaitem);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoivaitemLogic.getTipoIvaItems().remove(this.tipoivaitem);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoivaitems.remove(this.tipoivaitem);				
					}
					
					
					((TipoIvaItemModel) this.jTableDatosTipoIvaItem.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoIvaItem(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoIvaItem(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoIvaItem) {
			
			if(this.jInternalFrameDetalleFormTipoIvaItem==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoIvaItem.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoIvaItem.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitem =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoivaitem =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoIvaItem(this.tipoivaitem);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoIvaItem("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoIvaItem(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoIvaItem() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoIvaItem(TipoIvaItem tipoivaitem) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoIvaItem(tipoivaitem,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoIvaItem(TipoIvaItem tipoivaitem,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoIvaItem(tipoivaitem);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoIvaItem(tipoivaitem,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoIvaItem(tipoivaitem);
	}
	
	public void setVariablesObjetoActualToFormularioTipoIvaItem(TipoIvaItem tipoivaitem) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoIvaItem==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldidTipoIvaItem.setText(tipoivaitem.getId().toString());
			this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldcodigoTipoIvaItem.setText(tipoivaitem.getcodigo());
			this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldnombreTipoIvaItem.setText(tipoivaitem.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoIvaItem tipoivaitemLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoivaitemLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoIvaItem tipoivaitemLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoivaitemLocal=this.tipoivaitem;
			} else {
				tipoivaitemLocal=this.tipoivaitemAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoivaitemLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoIvaItem(tipoivaitemLocal,true);
					
					if(tipoivaitemSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoivaitemLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoivaitemLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoIvaItem(TipoIvaItem tipoivaitem,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoIvaItem(tipoivaitem,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(tipoivaitem);
	}
	
	public void setVariablesFormularioToObjetoActualTipoIvaItem(TipoIvaItem tipoivaitem,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoIvaItem(tipoivaitem,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoIvaItem(TipoIvaItem tipoivaitem,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoIvaItem==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldidTipoIvaItem.getText()==null || this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldidTipoIvaItem.getText()=="" || this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldidTipoIvaItem.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldidTipoIvaItem.setText("0");
			}

			if(conColumnasBase) {tipoivaitem.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldidTipoIvaItem.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIvaItemConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIvaItem.jLabelIdTipoIvaItem,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoivaitem.setcodigo(this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldcodigoTipoIvaItem.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIvaItemConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIvaItem.jLabelcodigoTipoIvaItem,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoivaitem.setnombre(this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldnombreTipoIvaItem.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoIvaItemConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoIvaItem.jLabelnombreTipoIvaItem,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoIvaItem(TipoIvaItem tipoivaitemBean,TipoIvaItem tipoivaitem,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoIvaItem(TipoIvaItem tipoivaitemOrigen,TipoIvaItem tipoivaitem,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoivaitemOrigen.getId()!=null && !tipoivaitemOrigen.getId().equals(0L))) {tipoivaitem.setId(tipoivaitemOrigen.getId());}}
			if(conDefault || (!conDefault && tipoivaitemOrigen.getcodigo()!=null && !tipoivaitemOrigen.getcodigo().equals(""))) {tipoivaitem.setcodigo(tipoivaitemOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipoivaitemOrigen.getnombre()!=null && !tipoivaitemOrigen.getnombre().equals(""))) {tipoivaitem.setnombre(tipoivaitemOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoIvaItem(TipoIvaItem tipoivaitem) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldidTipoIvaItem.setText(tipoivaitem.getId().toString());
			this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldcodigoTipoIvaItem.setText(tipoivaitem.getcodigo());
			this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldnombreTipoIvaItem.setText(tipoivaitem.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoIvaItem(TipoIvaItemBean tipoivaitemBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldidTipoIvaItem.setText(tipoivaitemBean.getId().toString());
			this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldcodigoTipoIvaItem.setText(tipoivaitemBean.getcodigo());
			this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldnombreTipoIvaItem.setText(tipoivaitemBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoIvaItem(TipoIvaItemParameterReturnGeneral tipoivaitemReturnGeneral,TipoIvaItemBean tipoivaitemBean,Boolean conDefault) throws Exception { 
		try {
			TipoIvaItem tipoivaitemLocal=new TipoIvaItem();
			
			tipoivaitemLocal=tipoivaitemReturnGeneral.getTipoIvaItem();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoivaitemLocal.getId()!=null && !tipoivaitemLocal.getId().equals(0L))) {tipoivaitemBean.setId(tipoivaitemLocal.getId());}}
			if(conDefault || (!conDefault && tipoivaitemLocal.getcodigo()!=null && !tipoivaitemLocal.getcodigo().equals(""))) {tipoivaitemBean.setcodigo(tipoivaitemLocal.getcodigo());}
			if(conDefault || (!conDefault && tipoivaitemLocal.getnombre()!=null && !tipoivaitemLocal.getnombre().equals(""))) {tipoivaitemBean.setnombre(tipoivaitemLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoIvaItemGenerico(Long idTipoIvaItemSeleccionado,JComboBox jComboBoxTipoIvaItem,List<TipoIvaItem> tipoivaitemsLocal)throws Exception {
		try {
			TipoIvaItem  tipoivaitemTemp=null;

			for(TipoIvaItem tipoivaitemAux:tipoivaitemsLocal) {
				if(tipoivaitemAux.getId()!=null && tipoivaitemAux.getId().equals(idTipoIvaItemSeleccionado)) {
					tipoivaitemTemp=tipoivaitemAux;
					break;
				}
			}

			jComboBoxTipoIvaItem.setSelectedItem(tipoivaitemTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoIvaItemGenerico(JComboBox jComboBoxTipoIvaItem,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoIvaItem.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoIvaItem.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoIvaItem.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoIvaItem.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoIvaItem.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoIvaItem.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoIvaItem.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoIvaItem.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoIvaItem.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoIvaItem.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoivaitem=(TipoIvaItem) tipoivaitemLogic.getTipoIvaItems().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoivaitem =(TipoIvaItem) tipoivaitems.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoIvaItem tipoivaitemRow=new TipoIvaItem();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoivaitemRow=(TipoIvaItem) tipoivaitemLogic.getTipoIvaItems().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoivaitemRow=(TipoIvaItem) tipoivaitems.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDefinicionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoIvaItem tipoivaitem) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoIvaItem==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoivaitem = (TipoIvaItem)this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipoivaitem = (TipoIvaItem)this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipoivaitem!=null) {
						this.tipoivaitem = tipoivaitem;
					} else {
						this.tipoivaitem = new TipoIvaItem();
					}
				}

				if(this.isTienePermisosDefinicion && this.permiteMantenimiento(this.tipoivaitem)) {
					DefinicionBeanSwingJInternalFrame definicionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFramePopup=new DefinicionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFramePopup;
					} else {
						definicionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame;
					}

					List<TipoIvaItem> tipoivaitems=new ArrayList<TipoIvaItem>();
					tipoivaitems.add(this.tipoivaitem);
					if(!esRelacionado) {
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setConGuardarRelaciones(false);
						//definicionBeanSwingJInternalFrame.definicionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoIvaItem.cargarDefinicionBeanSwingJInternalFrame(tipoivaitems,this.tipoivaitem,definicionBeanSwingJInternalFrame,/*conInicializar,*/definicionBeanSwingJInternalFrame.definicionSessionBean.getConGuardarRelaciones(),definicionBeanSwingJInternalFrame.definicionSessionBean.getEsGuardarRelacionado());
					definicionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						definicionBeanSwingJInternalFrame.actualizarEstadoPanelsDefinicion("no_relacionado");

						definicionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DefinicionConstantesFunciones.ITAMANIOFILATABLA + (DefinicionConstantesFunciones.ITAMANIOFILATABLA/2));

						definicionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoIvaItem=(TitledBorder)this.jScrollPanelDatosTipoIvaItem.getBorder();
						TitledBorder titledBorderDefinicion=(TitledBorder)definicionBeanSwingJInternalFrame.jScrollPanelDatosDefinicion.getBorder();

						titledBorderDefinicion.setTitle(titledBorderTipoIvaItem.getTitle() + " -> Definicion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,definicionBeanSwingJInternalFrame);
						}

						definicionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(definicionBeanSwingJInternalFrame);

						definicionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipoivaitemSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Definicion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoIvaItem(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoIvaItem.setVisible((this.isVisibilidadCeldaNuevoTipoIvaItem && this.isPermisoNuevoTipoIvaItem));			
			this.jButtonDuplicarTipoIvaItem.setVisible((this.isVisibilidadCeldaDuplicarTipoIvaItem && this.isPermisoDuplicarTipoIvaItem));			
			this.jButtonCopiarTipoIvaItem.setVisible((this.isVisibilidadCeldaCopiarTipoIvaItem && this.isPermisoCopiarTipoIvaItem));
			this.jButtonVerFormTipoIvaItem.setVisible((this.isVisibilidadCeldaVerFormTipoIvaItem && this.isPermisoVerFormTipoIvaItem));
			
			this.jButtonAbrirOrderByTipoIvaItem.setVisible((this.isVisibilidadCeldaOrdenTipoIvaItem && this.isPermisoOrdenTipoIvaItem));			
			
			this.jButtonNuevoRelacionesTipoIvaItem.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem && this.isPermisoNuevoTipoIvaItem));			
			this.jButtonNuevoGuardarCambiosTipoIvaItem.setVisible((this.isVisibilidadCeldaNuevoTipoIvaItem && this.isPermisoNuevoTipoIvaItem && this.isPermisoGuardarCambiosTipoIvaItem));
			
			if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonModificarTipoIvaItem.setVisible((this.isVisibilidadCeldaModificarTipoIvaItem && this.isPermisoActualizarTipoIvaItem));	
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonActualizarTipoIvaItem.setVisible((this.isVisibilidadCeldaActualizarTipoIvaItem && this.isPermisoActualizarTipoIvaItem));	
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonEliminarTipoIvaItem.setVisible((this.isVisibilidadCeldaEliminarTipoIvaItem && this.isPermisoEliminarTipoIvaItem));
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonCancelarTipoIvaItem.setVisible(this.isVisibilidadCeldaCancelarTipoIvaItem);							
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonGuardarCambiosTipoIvaItem.setVisible((this.isVisibilidadCeldaGuardarTipoIvaItem && this.isPermisoGuardarCambiosTipoIvaItem));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoIvaItem.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIvaItem && this.isPermisoGuardarCambiosTipoIvaItem));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoIvaItem.setVisible((this.isVisibilidadCeldaNuevoTipoIvaItem && this.isPermisoNuevoTipoIvaItem));						
			this.jButtonDuplicarToolBarTipoIvaItem.setVisible((this.isVisibilidadCeldaDuplicarTipoIvaItem && this.isPermisoDuplicarTipoIvaItem));						
			this.jButtonCopiarToolBarTipoIvaItem.setVisible((this.isVisibilidadCeldaCopiarTipoIvaItem && this.isPermisoCopiarTipoIvaItem));			
			this.jButtonVerFormToolBarTipoIvaItem.setVisible((this.isVisibilidadCeldaVerFormTipoIvaItem && this.isPermisoVerFormTipoIvaItem));			
			this.jButtonAbrirOrderByToolBarTipoIvaItem.setVisible((this.isVisibilidadCeldaOrdenTipoIvaItem && this.isPermisoOrdenTipoIvaItem));
			this.jButtonNuevoRelacionesToolBarTipoIvaItem.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem && this.isPermisoNuevoTipoIvaItem));			
			this.jButtonNuevoGuardarCambiosToolBarTipoIvaItem.setVisible((this.isVisibilidadCeldaNuevoTipoIvaItem && this.isPermisoNuevoTipoIvaItem && this.isPermisoGuardarCambiosTipoIvaItem));			
			
			if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonModificarToolBarTipoIvaItem.setVisible((this.isVisibilidadCeldaModificarTipoIvaItem && this.isPermisoActualizarTipoIvaItem));	
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonActualizarToolBarTipoIvaItem.setVisible((this.isVisibilidadCeldaActualizarTipoIvaItem  && this.isPermisoActualizarTipoIvaItem));	
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonEliminarToolBarTipoIvaItem.setVisible((this.isVisibilidadCeldaEliminarTipoIvaItem && this.isPermisoEliminarTipoIvaItem));
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonCancelarToolBarTipoIvaItem.setVisible(this.isVisibilidadCeldaCancelarTipoIvaItem);				
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonGuardarCambiosToolBarTipoIvaItem.setVisible((this.isVisibilidadCeldaGuardarTipoIvaItem && this.isPermisoGuardarCambiosTipoIvaItem));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoIvaItem.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIvaItem && this.isPermisoGuardarCambiosTipoIvaItem));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoIvaItem.setVisible((this.isVisibilidadCeldaNuevoTipoIvaItem && this.isPermisoNuevoTipoIvaItem));			
			this.jMenuItemDuplicarTipoIvaItem.setVisible((this.isVisibilidadCeldaDuplicarTipoIvaItem && this.isPermisoDuplicarTipoIvaItem));			
			this.jMenuItemCopiarTipoIvaItem.setVisible((this.isVisibilidadCeldaCopiarTipoIvaItem && this.isPermisoCopiarTipoIvaItem));			
			this.jMenuItemVerFormTipoIvaItem.setVisible((this.isVisibilidadCeldaVerFormTipoIvaItem && this.isPermisoVerFormTipoIvaItem));			
			this.jMenuItemAbrirOrderByTipoIvaItem.setVisible((this.isVisibilidadCeldaOrdenTipoIvaItem && this.isPermisoOrdenTipoIvaItem));			
			//this.jMenuItemMostrarOcultarTipoIvaItem.setVisible((this.isVisibilidadCeldaOrdenTipoIvaItem && this.isPermisoOrdenTipoIvaItem));
			this.jMenuItemDetalleAbrirOrderByTipoIvaItem.setVisible((this.isVisibilidadCeldaOrdenTipoIvaItem && this.isPermisoOrdenTipoIvaItem));			
			//this.jMenuItemDetalleMostrarOcultarTipoIvaItem.setVisible((this.isVisibilidadCeldaOrdenTipoIvaItem && this.isPermisoOrdenTipoIvaItem));			
			this.jMenuItemNuevoRelacionesTipoIvaItem.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem && this.isPermisoNuevoTipoIvaItem));			
			this.jMenuItemNuevoGuardarCambiosTipoIvaItem.setVisible((this.isVisibilidadCeldaNuevoTipoIvaItem && this.isPermisoNuevoTipoIvaItem && this.isPermisoGuardarCambiosTipoIvaItem));									
			
			if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
			this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemModificarTipoIvaItem.setVisible((this.isVisibilidadCeldaModificarTipoIvaItem && this.isPermisoActualizarTipoIvaItem));	
			this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemActualizarTipoIvaItem.setVisible((this.isVisibilidadCeldaActualizarTipoIvaItem && this.isPermisoActualizarTipoIvaItem));	
			this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemEliminarTipoIvaItem.setVisible((this.isVisibilidadCeldaEliminarTipoIvaItem && this.isPermisoEliminarTipoIvaItem));
			this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemCancelarTipoIvaItem.setVisible(this.isVisibilidadCeldaCancelarTipoIvaItem);				
			}
			
			this.jMenuItemGuardarCambiosTipoIvaItem.setVisible((this.isVisibilidadCeldaGuardarTipoIvaItem && this.isPermisoGuardarCambiosTipoIvaItem));						
			this.jMenuItemGuardarCambiosTablaTipoIvaItem.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoIvaItem && this.isPermisoGuardarCambiosTipoIvaItem));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoIvaItem=this.jButtonNuevoTipoIvaItem.isVisible();
			this.isVisibilidadCeldaDuplicarTipoIvaItem=this.jButtonDuplicarTipoIvaItem.isVisible();
			this.isVisibilidadCeldaCopiarTipoIvaItem=this.jButtonCopiarTipoIvaItem.isVisible();
			this.isVisibilidadCeldaVerFormTipoIvaItem=this.jButtonVerFormTipoIvaItem.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoIvaItem=this.jButtonAbrirOrderByTipoIvaItem.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=this.jButtonNuevoRelacionesTipoIvaItem.isVisible();
			this.isVisibilidadCeldaModificarTipoIvaItem=this.jButtonModificarTipoIvaItem.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
			this.isVisibilidadCeldaActualizarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jButtonActualizarTipoIvaItem.isVisible();
			this.isVisibilidadCeldaEliminarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jButtonEliminarTipoIvaItem.isVisible();
			this.isVisibilidadCeldaCancelarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jButtonCancelarTipoIvaItem.isVisible();
			this.isVisibilidadCeldaGuardarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jButtonGuardarCambiosTipoIvaItem.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=this.jButtonGuardarCambiosTablaTipoIvaItem.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoIvaItem=this.jButtonNuevoToolBarTipoIvaItem.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=this.jButtonNuevoRelacionesToolBarTipoIvaItem.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
			this.isVisibilidadCeldaModificarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jButtonModificarToolBarTipoIvaItem.isVisible();
			this.isVisibilidadCeldaActualizarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jButtonActualizarToolBarTipoIvaItem.isVisible();
			this.isVisibilidadCeldaEliminarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jButtonEliminarToolBarTipoIvaItem.isVisible();
			this.isVisibilidadCeldaCancelarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jButtonCancelarToolBarTipoIvaItem.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoIvaItem=this.jButtonGuardarCambiosToolBarTipoIvaItem.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=this.jButtonGuardarCambiosTablaToolBarTipoIvaItem.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoIvaItem=this.jMenuItemNuevoTipoIvaItem.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=this.jMenuItemNuevoRelacionesTipoIvaItem.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
			this.isVisibilidadCeldaModificarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemModificarTipoIvaItem.isVisible();
			this.isVisibilidadCeldaActualizarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemActualizarTipoIvaItem.isVisible();
			this.isVisibilidadCeldaEliminarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemEliminarTipoIvaItem.isVisible();
			this.isVisibilidadCeldaCancelarTipoIvaItem=this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemCancelarTipoIvaItem.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoIvaItem=this.jMenuItemGuardarCambiosTipoIvaItem.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=this.jMenuItemGuardarCambiosTablaTipoIvaItem.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoIvaItem(Boolean esInicializar) {
		if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoivaitemSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoIvaItem();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoIvaItem(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoIvaItem() {
		this.jButtonNuevoTipoIvaItem.setVisible(this.isPermisoNuevoTipoIvaItem);			
		this.jButtonDuplicarTipoIvaItem.setVisible(this.isPermisoDuplicarTipoIvaItem);			
		this.jButtonCopiarTipoIvaItem.setVisible(this.isPermisoCopiarTipoIvaItem);			
		this.jButtonVerFormTipoIvaItem.setVisible(this.isPermisoVerFormTipoIvaItem);			
		
		this.jButtonAbrirOrderByTipoIvaItem.setVisible(this.isPermisoOrdenTipoIvaItem);					
		
		this.jButtonNuevoRelacionesTipoIvaItem.setVisible(this.isPermisoNuevoTipoIvaItem);			
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonModificarTipoIvaItem.setVisible(this.isPermisoActualizarTipoIvaItem);	
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonActualizarTipoIvaItem.setVisible(this.isPermisoActualizarTipoIvaItem);	
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonEliminarTipoIvaItem.setVisible(this.isPermisoEliminarTipoIvaItem);
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonCancelarTipoIvaItem.setVisible(this.isVisibilidadCeldaCancelarTipoIvaItem);						
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonGuardarCambiosTipoIvaItem.setVisible(this.isPermisoGuardarCambiosTipoIvaItem);							
		}
		
		this.jButtonGuardarCambiosTablaTipoIvaItem.setVisible(this.isPermisoActualizarTipoIvaItem);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoIvaItem() {
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonModificarTipoIvaItem.setVisible(this.isPermisoActualizarTipoIvaItem);	
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonActualizarTipoIvaItem.setVisible(this.isPermisoActualizarTipoIvaItem);	
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonEliminarTipoIvaItem.setVisible(this.isPermisoEliminarTipoIvaItem);
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonCancelarTipoIvaItem.setVisible(this.isVisibilidadCeldaCancelarTipoIvaItem);							
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonGuardarCambiosTipoIvaItem.setVisible((this.isVisibilidadCeldaGuardarTipoIvaItem && this.isPermisoGuardarCambiosTipoIvaItem));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoIvaItem() {
		if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoIvaItem();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoIvaItem() {
	}
	
	public void jTableDatosTipoIvaItemListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoIvaItem(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoIvaItemBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIvaItem(this.gettipoivaitem(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoivaitem =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoivaitem =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoivaitem==null) {
						this.tipoivaitem = new TipoIvaItem();
					}

					this.setVariablesFormularioToObjetoActualTipoIvaItem(this.tipoivaitem,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);
				}

				if(this.tipoivaitem.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoivaitem.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIvaItem(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoIvaItemBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIvaItem(this.gettipoivaitem(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoivaitem =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoivaitem =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoivaitem==null) {
						this.tipoivaitem = new TipoIvaItem();
					}

					this.setVariablesFormularioToObjetoActualTipoIvaItem(this.tipoivaitem,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);
				}

				if(this.tipoivaitem.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipoivaitem.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIvaItem(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoIvaItemBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoIvaItem(this.gettipoivaitem(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoivaitem =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoivaitem =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoivaitem==null) {
						this.tipoivaitem = new TipoIvaItem();
					}

					this.setVariablesFormularioToObjetoActualTipoIvaItem(this.tipoivaitem,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);
				}

				if(this.tipoivaitem.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoivaitem.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoIvaItem(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoIvaItem() {
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
		

		if(this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
			this.jInternalFrameDetalleFormTipoIvaItem.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoIvaItem.dispose();
			this.jInternalFrameDetalleFormTipoIvaItem=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoIvaItem!=null) {
			this.jInternalFrameReporteDinamicoTipoIvaItem.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoIvaItem.dispose();
			this.jInternalFrameReporteDinamicoTipoIvaItem=null;
		}
		
		if(this.jInternalFrameImportacionTipoIvaItem!=null) {
			this.jInternalFrameImportacionTipoIvaItem.setVisible(false);	    			
			this.jInternalFrameImportacionTipoIvaItem.dispose();
			this.jInternalFrameImportacionTipoIvaItem=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoIvaItem();
			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoIvaItem")) {
				jButtonNuevoTipoIvaItemActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoIvaItem")) {
				jButtonDuplicarTipoIvaItemActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoIvaItem")) {
				jButtonCopiarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoIvaItem")) {
				jButtonVerFormTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoIvaItem")) {
				jButtonNuevoTipoIvaItemActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoIvaItem")) {
				jButtonDuplicarTipoIvaItemActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoIvaItem")) {
				jButtonNuevoTipoIvaItemActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoIvaItem")) {
				jButtonDuplicarTipoIvaItemActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoIvaItem")) {
				jButtonNuevoTipoIvaItemActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoIvaItem")) {
				jButtonNuevoTipoIvaItemActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoIvaItem")) {
				jButtonNuevoTipoIvaItemActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoIvaItem")) {
				jButtonModificarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoIvaItem")) {
				jButtonModificarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoIvaItem")) {
				jButtonModificarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoIvaItem")) {
				jButtonActualizarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoIvaItem")) {
				jButtonActualizarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoIvaItem")) {
				jButtonActualizarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoIvaItem")) {
				jButtonEliminarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoIvaItem")) {
				jButtonEliminarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoIvaItem")) {
				jButtonEliminarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoIvaItem")) {
				jButtonCancelarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoIvaItem")) {
				jButtonCancelarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoIvaItem")) {
				jButtonCancelarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoIvaItem")) {
				jButtonCerrarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoIvaItem")) {
				jButtonCerrarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoIvaItem")) {
				jButtonCerrarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoIvaItem")) {
				jButtonMostrarOcultarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoIvaItem")) {
				jButtonCancelarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoIvaItem")) {
				jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoIvaItem")) {
				jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoIvaItem")) {
				jButtonCopiarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoIvaItem")) {
				jButtonVerFormTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoIvaItem")) {
				jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoIvaItem")) {
				jButtonCopiarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoIvaItem")) {
				jButtonVerFormTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoIvaItem")) {
				jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoIvaItem")) {
				jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoIvaItem")) {
				jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoIvaItem")) {
				jButtonRecargarInformacionTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoIvaItem")) {
				jButtonRecargarInformacionTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoIvaItem")) {
				jButtonRecargarInformacionTipoIvaItemActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoIvaItem")) {
				jButtonAnterioresTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoIvaItem")) {
				jButtonAnterioresTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoIvaItem")) {
				jButtonAnterioresTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoIvaItem")) {
				jButtonSiguientesTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoIvaItem")) {
				jButtonSiguientesTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoIvaItem")) {
				jButtonSiguientesTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoIvaItem") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoIvaItem")) {
				jButtonAbrirOrderByTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoIvaItem") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoIvaItem")) {
				jButtonMostrarOcultarTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoIvaItem")) {
				jButtonNuevoGuardarCambiosTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoIvaItem")) {
				jButtonNuevoGuardarCambiosTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoIvaItem")) {
				jButtonNuevoGuardarCambiosTipoIvaItemActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoIvaItem")) {
				jButtonCerrarReporteDinamicoTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoIvaItem")) {
				jButtonGenerarReporteDinamicoTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoIvaItem")) {
				
				jButtonGenerarExcelReporteDinamicoTipoIvaItemActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoIvaItem")) {
				jButtonCerrarImportacionTipoIvaItemActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoIvaItem")) {
				
				jButtonGenerarImportacionTipoIvaItemActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoIvaItem")) {
				
				jButtonAbrirImportacionTipoIvaItemActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoIvaItem")) {
				jComboBoxTiposAccionesTipoIvaItemActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoIvaItem")) {
				jComboBoxTiposRelacionesTipoIvaItemActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoIvaItem")) {
				jComboBoxTiposAccionesTipoIvaItemActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoIvaItem")) {
				
				jComboBoxTiposSeleccionarTipoIvaItemActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoIvaItem")) {
				jTextFieldValorCampoGeneralTipoIvaItemActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoIvaItem")) {
				jButtonAbrirOrderByTipoIvaItemActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoIvaItem")) {
				jButtonAbrirOrderByTipoIvaItemActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoIvaItem")) {
				jButtonCerrarOrderByTipoIvaItemActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoIvaItemBusqueda")) {
				this.jButtonidTipoIvaItemBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoIvaItemBusqueda")) {
				this.jButtoncodigoTipoIvaItemBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoIvaItemBusqueda")) {
				this.jButtonnombreTipoIvaItemBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoIvaItem();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaItemActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				


				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIvaItem.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIvaItem.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoIvaItem tipoivaitemLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoivaitemLocal=this.tipoivaitem;
			} else {
				tipoivaitemLocal=this.tipoivaitemAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
							
				
				


				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIvaItem.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIvaItem.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaItemActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
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
			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			
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
			
			


			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaItemActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
								
						
				


				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIvaItem.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIvaItem.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
								
				
				


				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIvaItem.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIvaItem.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaItemActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaItemActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaItemActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
							
				
				


				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIvaItem.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIvaItem.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaItemActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
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
			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			
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
			
			


			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaItemActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
								
				
				


				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIvaItem.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIvaItem.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaItemActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaItemActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaItemActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoIvaItem")) {
					jCheckBoxSeleccionarTodosTipoIvaItemItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoIvaItem")) {
					jCheckBoxSeleccionadosTipoIvaItemItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoIvaItem")) {
					
				}
				
				


				
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIvaItem.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIvaItem.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
												
				
				


				
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIvaItem.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIvaItem.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaItemActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaItemActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
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
			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
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
			
			


			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoIvaItemActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIvaItem.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIvaItem.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoivaitem);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoivaitem);
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
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
				
				


				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoIvaItem.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoIvaItem.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoIvaItemActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoivaitemAnterior =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoIvaItem")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoIvaItemListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoIvaItem.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoivaitem =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoivaitem =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoivaitem);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoIvaItem")) {
				
				}
				
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoIvaItem")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoIvaItem.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoIvaItem")) {
			
			}
			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoIvaItem();
			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			
			if(sTipo.equals("NuevoTipoIvaItem")) {
				jButtonNuevoTipoIvaItemActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoIvaItem")) {
				jButtonDuplicarTipoIvaItemActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoIvaItem")) {
				jButtonCopiarTipoIvaItemActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoIvaItem")) {
				jButtonVerFormTipoIvaItemActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoIvaItem")) {
				jButtonNuevoTipoIvaItemActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoIvaItem")) {
				jButtonModificarTipoIvaItemActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoIvaItem")) {
				jButtonActualizarTipoIvaItemActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoIvaItem")) {
				jButtonEliminarTipoIvaItemActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoIvaItem")) {
				jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoIvaItem")) {
				jButtonCancelarTipoIvaItemActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoIvaItem")) {
				jButtonCerrarTipoIvaItemActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoIvaItem")) {
				jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoIvaItem")) {
				jButtonNuevoGuardarCambiosTipoIvaItemActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoIvaItem")) {
				jButtonAbrirOrderByTipoIvaItemActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoIvaItem")) {
				jButtonRecargarInformacionTipoIvaItemActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoIvaItem")) {
				jButtonAnterioresTipoIvaItemActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoIvaItem")) {
				jButtonSiguientesTipoIvaItemActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoIvaItemBusqueda")) {
				this.jButtonidTipoIvaItemBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoIvaItemBusqueda")) {
				this.jButtoncodigoTipoIvaItemBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoIvaItemBusqueda")) {
				this.jButtonnombreTipoIvaItemBusquedaActionPerformed(evt);
			}
			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoIvaItem();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoIvaItem")) {
				closingInternalFrameTipoIvaItem();
				
			} else if(sTipo.equals("jButtonCancelarTipoIvaItem")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoIvaItem = (JInternalFrameBase)evt.getSource();
	            	
	            TipoIvaItemBeanSwingJInternalFrame jInternalFrameParent=(TipoIvaItemBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoIvaItem.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoIvaItemActionPerformed(null);
			}
			
			TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoivaitem,new Object(),this.tipoivaitemParameterGeneral,this.tipoivaitemReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoIvaItem(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoIvaItem(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoIvaItem(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoivaitem)) {
			if(!esControlTabla) {
				if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoIvaItem(this.tipoivaitem,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);			
				}
				
				if(this.tipoivaitemSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoIvaItem(this.tipoivaitem,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoivaitemReturnGeneral=tipoivaitemLogic.procesarEventosTipoIvaItemsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoivaitemLogic.getTipoIvaItems(),this.tipoivaitem,this.tipoivaitemParameterGeneral,this.isEsNuevoTipoIvaItem,classes);//this.tipoivaitemLogic.getTipoIvaItem()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoIvaItem(this.tipoivaitemReturnGeneral,this.tipoivaitemBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoivaitemSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoIvaItem(classes,this.tipoivaitemReturnGeneral,this.tipoivaitemBean,false);
					}
						
					if(this.tipoivaitemReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoIvaItem(this.tipoivaitemReturnGeneral.getTipoIvaItem());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoIvaItem(this.tipoivaitemReturnGeneral.getTipoIvaItem());	
					}
						
					if(this.tipoivaitemReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoIvaItem(this.tipoivaitemReturnGeneral.getTipoIvaItem(),classes);//this.tipoivaitemBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoIvaItem(this.tipoivaitem,classes);//this.tipoivaitemBean);									
				}
			
				if(TipoIvaItemJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoIvaItem(this.tipoivaitem,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoIvaItem(this.tipoivaitem);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoivaitemAnterior!=null) {
						this.tipoivaitem=this.tipoivaitemAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoivaitemReturnGeneral=tipoivaitemLogic.procesarEventosTipoIvaItemsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoivaitemLogic.getTipoIvaItems(),this.tipoivaitem,this.tipoivaitemParameterGeneral,this.isEsNuevoTipoIvaItem,classes);//this.tipoivaitemLogic.getTipoIvaItem()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoivaitemSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoivaitemSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoivaitemReturnGeneral.getTipoIvaItem(),tipoivaitemLogic.getTipoIvaItems());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoivaitemReturnGeneral.getTipoIvaItem(),this.tipoivaitems);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoIvaItem.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoIvaItem.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoIvaItem();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoIvaItem() throws Exception {
		
		TipoIvaItemModel tipoivaitemModel=(TipoIvaItemModel)this.jTableDatosTipoIvaItem.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoivaitemModel.tipoivaitems=this.tipoivaitemLogic.getTipoIvaItems();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoivaitemModel.tipoivaitems=this.tipoivaitems;
		}
		
		
		((TipoIvaItemModel) this.jTableDatosTipoIvaItem.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoIvaItem() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoivaitemAnterior(),this.tipoivaitemLogic.getTipoIvaItems());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoivaitemAnterior(),this.tipoivaitems);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoIvaItem();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoIvaItem(TipoIvaItem tipoivaitem,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(tipoivaitem.getDefinicions());
					this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
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
										
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoivaitem,new Object(),generalEntityParameterGeneral,this.tipoivaitemReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoivaitemSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoIvaItemConstantesFunciones.getClassesRelationshipsOfTipoIvaItem(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoIvaItemConstantesFunciones.getClassesRelationshipsFromStringsOfTipoIvaItem(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoIvaItem(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoIvaItemBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoivaitem,new Object(),generalEntityParameterGeneral,this.tipoivaitemReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoIvaItem(TipoIvaItemBean tipoivaitemBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.definicionLogic.setDefinicions(tipoivaitem.getDefinicions());
					this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.inicializarActualizarBindingTablaDefinicion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoIvaItem(ArrayList<Classe> classes,TipoIvaItemReturnGeneral tipoivaitemReturnGeneral,TipoIvaItemBean tipoivaitemBean,Boolean conDefault) throws Exception {
		
			this.tipoivaitemBean.setDefinicions(tipoivaitemReturnGeneral.getTipoIvaItem().getDefinicions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoIvaItem(TipoIvaItem tipoivaitem,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Definicion.class)) {
					tipoivaitem.setDefinicions(this.jInternalFrameDetalleFormTipoIvaItem.definicionBeanSwingJInternalFrame.definicionLogic.getDefinicions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipoivaitem)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoIvaItem = new TipoIvaItemDetalleFormJInternalFrame(jDesktopPane,this.tipoivaitemSessionBean.getConGuardarRelaciones(),this.tipoivaitemSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoIvaItem);
		this.jInternalFrameDetalleFormTipoIvaItem.setVisible(false);
		this.jInternalFrameDetalleFormTipoIvaItem.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoIvaItem.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoIvaItem.tipoivaitemLogic=this.tipoivaitemLogic;
		
		this.cargarCombosFrameForeignKeyTipoIvaItem("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoIvaItem();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoIvaItem();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoIvaItem("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoIvaItem();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoIvaItem.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoIvaItem"));
		
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonModificarTipoIvaItem.addActionListener(new ButtonActionListener(this,"ModificarTipoIvaItem"));

		
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonModificarToolBarTipoIvaItem.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoIvaItem"));
					
		this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemModificarTipoIvaItem.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoIvaItem"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonActualizarTipoIvaItem.addActionListener (new ButtonActionListener(this,"ActualizarTipoIvaItem"));
		
		
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonActualizarToolBarTipoIvaItem.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoIvaItem"));
						
		this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemActualizarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoIvaItem"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonEliminarTipoIvaItem.addActionListener (new ButtonActionListener(this,"EliminarTipoIvaItem"));
		
		
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonEliminarToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoIvaItem"));
								
		this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemEliminarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoIvaItem"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonCancelarTipoIvaItem.addActionListener (new ButtonActionListener(this,"CancelarTipoIvaItem"));
		
		
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonCancelarToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoIvaItem"));
					
		this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemCancelarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoIvaItem"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemDetalleCerrarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoIvaItem"));		
		
		
		
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonGuardarCambiosToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIvaItem"));
		
		
		
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonGuardarCambiosToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIvaItem"));
		
		
		
		this.jInternalFrameDetalleFormTipoIvaItem.jComboBoxTiposAccionesFormularioTipoIvaItem.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoIvaItem"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonidTipoIvaItemBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIvaItemBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIvaItem.jButtoncodigoTipoIvaItemBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoIvaItemBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonnombreTipoIvaItemBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIvaItemBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoIvaItem.jTabbedPaneRelacionesTipoIvaItem.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoIvaItem"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoIvaItem"));
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoIvaItem"));
		}
		
		this.jTableDatosTipoIvaItem.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoIvaItem"));
		
		this.jTableDatosTipoIvaItem.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoIvaItem"));
		
		this.jButtonNuevoTipoIvaItem.addActionListener(new ButtonActionListener(this,"NuevoTipoIvaItem"));
		
		this.jButtonDuplicarTipoIvaItem.addActionListener(new ButtonActionListener(this,"DuplicarTipoIvaItem"));
		
		this.jButtonCopiarTipoIvaItem.addActionListener(new ButtonActionListener(this,"CopiarTipoIvaItem"));
		
		this.jButtonVerFormTipoIvaItem.addActionListener(new ButtonActionListener(this,"VerFormTipoIvaItem"));
		
		
		this.jButtonNuevoToolBarTipoIvaItem.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoIvaItem"));
			
		this.jButtonDuplicarToolBarTipoIvaItem.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoIvaItem"));
			
		this.jMenuItemNuevoTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoIvaItem"));
			
		this.jMenuItemDuplicarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoIvaItem"));		
		
		
		this.jButtonNuevoRelacionesTipoIvaItem.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoIvaItem"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoIvaItem.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoIvaItem"));
			
		this.jMenuItemNuevoRelacionesTipoIvaItem.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoIvaItem"));		
		
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonModificarTipoIvaItem.addActionListener(new ButtonActionListener(this,"ModificarTipoIvaItem"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonModificarToolBarTipoIvaItem.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoIvaItem"));
			
			this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemModificarTipoIvaItem.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoIvaItem"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonActualizarTipoIvaItem.addActionListener (new ButtonActionListener(this,"ActualizarTipoIvaItem"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonActualizarToolBarTipoIvaItem.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoIvaItem"));
				
			this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemActualizarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoIvaItem"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonEliminarTipoIvaItem.addActionListener (new ButtonActionListener(this,"EliminarTipoIvaItem"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonEliminarToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoIvaItem"));
						
			this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemEliminarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoIvaItem"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonCancelarTipoIvaItem.addActionListener (new ButtonActionListener(this,"CancelarTipoIvaItem"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonCancelarToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoIvaItem"));
			
			this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemCancelarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoIvaItem"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoIvaItem"));		
		
		
		this.jButtonCerrarTipoIvaItem.addActionListener (new ButtonActionListener(this,"CerrarTipoIvaItem"));
		
		
		this.jButtonCerrarToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoIvaItem"));
			
		this.jMenuItemCerrarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoIvaItem"));
			
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.jMenuItemDetalleCerrarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoIvaItem"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonGuardarCambiosTipoIvaItem.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoIvaItem"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.jButtonGuardarCambiosToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoIvaItem"));
		}
		
		this.jButtonCopiarToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoIvaItem"));
			
		this.jButtonVerFormToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoIvaItem"));
		
		this.jMenuItemGuardarCambiosTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoIvaItem"));
			
		this.jMenuItemCopiarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoIvaItem"));		
		
		this.jMenuItemVerFormTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoIvaItem"));		
		
		
		this.jButtonGuardarCambiosTablaTipoIvaItem.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoIvaItem"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoIvaItem"));
			
		this.jMenuItemGuardarCambiosTablaTipoIvaItem.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoIvaItem"));		
		
		
		
		this.jButtonRecargarInformacionTipoIvaItem.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoIvaItem"));
					
		this.jButtonRecargarInformacionToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoIvaItem"));
		
		this.jMenuItemRecargarInformacionTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoIvaItem"));		
		
		
		
		this.jButtonAnterioresTipoIvaItem.addActionListener (new ButtonActionListener(this,"AnterioresTipoIvaItem"));
		
		
		this.jButtonAnterioresToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoIvaItem"));
		
		this.jMenuItemAnterioresTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoIvaItem"));		
		
		
		this.jButtonSiguientesTipoIvaItem.addActionListener (new ButtonActionListener(this,"SiguientesTipoIvaItem"));
		
		
		this.jButtonSiguientesToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoIvaItem"));
			
		this.jMenuItemSiguientesTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoIvaItem"));
			
		this.jMenuItemAbrirOrderByTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoIvaItem"));
			
		this.jMenuItemMostrarOcultarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoIvaItem"));
			
		this.jMenuItemDetalleAbrirOrderByTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoIvaItem"));
			
		this.jMenuItemDetalleMostarOcultarTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoIvaItem"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoIvaItem.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoIvaItem"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoIvaItem"));
			
		this.jMenuItemNuevoGuardarCambiosTipoIvaItem.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoIvaItem"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoIvaItem.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoIvaItem"));

		this.jCheckBoxSeleccionadosTipoIvaItem.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoIvaItem"));
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.jComboBoxTiposAccionesFormularioTipoIvaItem.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoIvaItem"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoIvaItem.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoIvaItem"));
			
		this.jComboBoxTiposAccionesTipoIvaItem.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoIvaItem"));
					
		this.jComboBoxTiposSeleccionarTipoIvaItem.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoIvaItem"));
			
		this.jTextFieldValorCampoGeneralTipoIvaItem.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoIvaItem"));		
		
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonidTipoIvaItemBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIvaItemBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIvaItem.jButtoncodigoTipoIvaItemBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoIvaItemBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonnombreTipoIvaItemBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIvaItemBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoIvaItem!=null) {
				this.jInternalFrameReporteDinamicoTipoIvaItem.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIvaItem"));
				this.jInternalFrameReporteDinamicoTipoIvaItem.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIvaItem"));
				this.jInternalFrameReporteDinamicoTipoIvaItem.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIvaItem"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoIvaItem.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoIvaItem"));				
			//this.jButtonGenerarReporteDinamicoTipoIvaItem.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoIvaItem"));
			//this.jButtonGenerarExcelReporteDinamicoTipoIvaItem.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoIvaItem"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoIvaItem!=null) {
				this.jInternalFrameImportacionTipoIvaItem.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoIvaItem"));
				this.jInternalFrameImportacionTipoIvaItem.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoIvaItem"));
				this.jInternalFrameImportacionTipoIvaItem.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoIvaItem"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoIvaItem.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoIvaItem"));
			
			this.jButtonAbrirOrderByToolBarTipoIvaItem.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoIvaItem"));			
			
			if(this.jInternalFrameOrderByTipoIvaItem!=null) {
				this.jInternalFrameOrderByTipoIvaItem.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoIvaItem"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoIvaItem.jTabbedPaneRelacionesTipoIvaItem.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoIvaItem"));
		
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
            		closingInternalFrameTipoIvaItem();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoIvaItem.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoIvaItem = (JInternalFrameBase)event.getSource();
	            	
	            TipoIvaItemBeanSwingJInternalFrame jInternalFrameParent=(TipoIvaItemBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoIvaItem.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoIvaItemActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoIvaItem.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoIvaItemListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoIvaItem.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoIvaItem.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIvaItemActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIvaItemActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIvaItemActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoIvaItem";
		inputMap = this.jButtonNuevoTipoIvaItem.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoIvaItem.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoIvaItemActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIvaItemActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIvaItemActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoIvaItemActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoIvaItem";
		inputMap = this.jButtonNuevoRelacionesTipoIvaItem.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoIvaItem.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoIvaItemActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoIvaItem";
		inputMap = this.jButtonModificarTipoIvaItem.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoIvaItem.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoIvaItemActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoIvaItem";
		inputMap = this.jButtonActualizarTipoIvaItem.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoIvaItem.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoIvaItemActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoIvaItem";
		inputMap = this.jButtonEliminarTipoIvaItem.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoIvaItem.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoIvaItemActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoIvaItem";
		inputMap = this.jButtonCancelarTipoIvaItem.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoIvaItem.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoIvaItemActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoIvaItem";
		inputMap = this.jButtonCerrarTipoIvaItem.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoIvaItem.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoIvaItemActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonGuardarCambiosTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoIvaItem";
		inputMap = this.jInternalFrameDetalleFormTipoIvaItem.jButtonGuardarCambiosTipoIvaItem.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonGuardarCambiosTipoIvaItem.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoIvaItemActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoIvaItem.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoIvaItemItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoIvaItem.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoIvaItemActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoIvaItem.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoIvaItemActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoIvaItem.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoIvaItemActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonidTipoIvaItemBusqueda.addActionListener(new ButtonActionListener(this,"idTipoIvaItemBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIvaItem.jButtoncodigoTipoIvaItemBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoIvaItemBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoIvaItem.jButtonnombreTipoIvaItemBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoIvaItemBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoIvaItem.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoIvaItemActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoIvaItemActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoIvaItem.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoIvaItem(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoIvaItem tipoivaitemAux:this.tipoivaitemLogic.getTipoIvaItems()) {
					tipoivaitemAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIvaItem tipoivaitemAux:tipoivaitems) {
					tipoivaitemAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoIvaItemItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoIvaItem(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoIvaItem tipoivaitemAux:this.tipoivaitemLogic.getTipoIvaItems()) {
						tipoivaitemAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIvaItem tipoivaitemAux:tipoivaitems) {
						tipoivaitemAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoIvaItem tipoivaitemAux:this.tipoivaitemLogic.getTipoIvaItems()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIvaItem tipoivaitemAux:tipoivaitems) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoIvaItem(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoIvaItem.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoIvaItem.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoIvaItem,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoIvaItemItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoIvaItem(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoIvaItem.getSelectedRows();
			
			TipoIvaItem tipoivaitemLocal=new TipoIvaItem();
			
			//this.seleccionarTodosTipoIvaItem(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoivaitemLocal =(TipoIvaItem) this.tipoivaitemLogic.getTipoIvaItems().toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoivaitemLocal =(TipoIvaItem) this.tipoivaitems.toArray()[this.jTableDatosTipoIvaItem.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoivaitemLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoIvaItem tipoivaitemAux:this.tipoivaitemLogic.getTipoIvaItems()) {
						tipoivaitemAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoIvaItem tipoivaitemAux:tipoivaitems) {
						tipoivaitemAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoIvaItem(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoIvaItem.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoIvaItem.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoIvaItem,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoIvaItemItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoIvaItemParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoIvaItemActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoIvaItem(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoIvaItem.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoIvaItem tipoivaitemAux:this.tipoivaitemLogic.getTipoIvaItems()) {
				
						if(sTipoSeleccionar.equals(TipoIvaItemConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoivaitemAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoIvaItemConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoivaitemAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIvaItem tipoivaitemAux:tipoivaitems) {
					
						if(sTipoSeleccionar.equals(TipoIvaItemConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipoivaitemAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoIvaItemConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoivaitemAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoIvaItem(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoIvaItemActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoIvaItem(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoIvaItem=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoIvaItem.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoIvaItem.jComboBoxTiposAccionesFormularioTipoIvaItem.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoIvaItem) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoIvaItem(conSplash);
				
					this.generarReporteTipoIvaItemsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIvaItem.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIvaItem.jComboBoxTiposAccionesFormularioTipoIvaItem.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoIvaItemsSeleccionados();
				//this.jComboBoxTiposAccionesTipoIvaItem.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoIvaItemsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoIvaItem.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoIvaItemsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoIvaItem.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoIvaItem();
				
				this.exportarTipoIvaItemsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIvaItem.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIvaItem.jComboBoxTiposAccionesFormularioTipoIvaItem.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoIvaItems();
				//this.importarTipoIvaItems();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIvaItem.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIvaItem.jComboBoxTiposAccionesFormularioTipoIvaItem.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoIvaItem();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoIvaItemsSeleccionados();
				//this.jComboBoxTiposAccionesTipoIvaItem.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Iva Item", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoIvaItem();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoIvaItem)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoIvaItem(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Iva Item",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoIvaItem.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoIvaItem.jComboBoxTiposAccionesFormularioTipoIvaItem.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoIvaItem();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoIvaItem(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoIvaItemActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoIvaItem();
			
			if(this.jInternalFrameDetalleFormTipoIvaItem==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();		
			TipoIvaItem tipoivaitem=new TipoIvaItem();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoIvaItem(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoIvaItem.getSelectedItem();
			
			
			
			
			tipoivaitemsSeleccionados=this.getTipoIvaItemsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoivaitemsSeleccionados.size()==1) {
				for(TipoIvaItem tipoivaitemAux:tipoivaitemsSeleccionados) {
					tipoivaitem=tipoivaitemAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Definicion")) {
					jButtonDefinicionActionPerformed(null,rowIndex,true,false,tipoivaitem);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoIvaItem();
			
      		//this.finishProcessTipoIvaItem(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoIvaItemReturnGeneral() throws Exception {
		if(this.tipoivaitemReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoivaitemReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoivaitemReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoivaitemReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoivaitemReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoivaitemReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoIvaItem(false);
		}
		
		if(this.tipoivaitemReturnGeneral.getConRetornoLista() || this.tipoivaitemReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoivaitemReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoivaitemLogic.setTipoIvaItems(this.tipoivaitemReturnGeneral.getTipoIvaItems());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoivaitemReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoivaitemLogic.setTipoIvaItem(this.tipoivaitemReturnGeneral.getTipoIvaItem());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoIvaItem(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoIvaItem() throws Exception {
		
		
	}
	
	public ArrayList<TipoIvaItem> getTipoIvaItemsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoIvaItem) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoIvaItem tipoivaitemAux:tipoivaitemLogic.getTipoIvaItems()) {
					if(tipoivaitemAux.getIsSelected()) {
						tipoivaitemsSeleccionados.add(tipoivaitemAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoIvaItem tipoivaitemAux:this.tipoivaitems) {
					if(tipoivaitemAux.getIsSelected()) {
						tipoivaitemsSeleccionados.add(tipoivaitemAux);				
					}
				}
			}
			
			if(tipoivaitemsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoivaitemsSeleccionados.addAll(this.tipoivaitemLogic.getTipoIvaItems());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoivaitemsSeleccionados.addAll(this.tipoivaitems);				
					}
				}
			}
		} else {
			tipoivaitemsSeleccionados.add(this.tipoivaitem);
		}
		
		return tipoivaitemsSeleccionados;
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
	
	public void generarReporteTipoIvaItemsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoIvaItemsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoIvaItemsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoIvaItemsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoIvaItemsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoIvaItemsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Iva Item",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoIvaItemsSeleccionados() throws Exception {
		ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();		
		
		tipoivaitemsSeleccionados=this.getTipoIvaItemsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoIvaItems("Todos",tipoivaitemsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoIvaItemsSeleccionados() throws Exception {
		ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();		
		
		tipoivaitemsSeleccionados=this.getTipoIvaItemsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoIvaItems("Todos",tipoivaitemsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoIvaItemsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();
		
		tipoivaitemsSeleccionados=this.getTipoIvaItemsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoIvaItems("Todos",tipoivaitemsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoIvaItemsSeleccionados() throws Exception {
		ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoIvaItem();
		
		
		tipoivaitemsSeleccionados=this.getTipoIvaItemsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoIvaItem();
		
		
		//this.generarReporteTipoIvaItems("Todos",tipoivaitemsSeleccionados ,tipoivaitemImplementable,tipoivaitemImplementableHome);
	}
	
	public void mostrarImportacionTipoIvaItems() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoIvaItem();
		
		this.abrirFrameImportacionTipoIvaItem();		
		
			
		//this.generarReporteTipoIvaItems("Todos",tipoivaitemsSeleccionados ,tipoivaitemImplementable,tipoivaitemImplementableHome);
	}
	
	public void importarTipoIvaItems() throws Exception {		
	
	}
	
	public void exportarTipoIvaItemsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoIvaItemsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoIvaItemsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoIvaItemsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Iva Item",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoIvaItemsSeleccionados() throws Exception {
		ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();		
		
		tipoivaitemsSeleccionados=this.getTipoIvaItemsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoivaitem."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoIvaItem(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoIvaItem tipoivaitemAux:tipoivaitemsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoIvaItem(tipoivaitemAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoivaitemAux.setsDetalleGeneralEntityReporte(tipoivaitemAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva Item",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoIvaItem(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoIvaItemConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIvaItemConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIvaItemConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoIvaItemConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoIvaItem(TipoIvaItem tipoivaitem,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoivaitem.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoivaitem.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoivaitem.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoivaitem.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoIvaItemsSeleccionados() throws Exception {
		ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();		
		
		tipoivaitemsSeleccionados=this.getTipoIvaItemsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoivaitem.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoIvaItems");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoIvaItem(row);				
				iRow++;
			}				
			
			for(TipoIvaItem tipoivaitemAux:tipoivaitemsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoIvaItem(tipoivaitemAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva Item",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoIvaItemsSeleccionados() throws Exception {
		ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();		
		
		tipoivaitemsSeleccionados=this.getTipoIvaItemsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoivaitem.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoivaitems");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoivaitem");
			//elementRoot.appendChild(element);
		
			for(TipoIvaItem tipoivaitemAux:tipoivaitemsSeleccionados) {
				element = document.createElement("tipoivaitem");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoIvaItem(tipoivaitemAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Iva Item",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoIvaItem(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIvaItemConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIvaItemConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoIvaItemConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoIvaItemConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoIvaItem(TipoIvaItem tipoivaitem,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoivaitem.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoivaitem.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoivaitem.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoIvaItem(TipoIvaItem tipoivaitem,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoIvaItemConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoivaitem.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoIvaItemConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoivaitem.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoIvaItemConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipoivaitem.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoIvaItemConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoivaitem.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoIvaItemsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoIvaItem> tipoivaitemsSeleccionados=new ArrayList<TipoIvaItem>();
		
		tipoivaitemsSeleccionados=this.getTipoIvaItemsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoIvaItem(tipoivaitemsSeleccionados);
		
		this.generarReporteTipoIvaItems("Todos",tipoivaitemsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoIvaItem(ArrayList<TipoIvaItem> tipoivaitemsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoIvaItem tipoivaitemAux:tipoivaitemsSeleccionados) {
				tipoivaitemAux.setsDetalleGeneralEntityReporte(tipoivaitemAux.toString());
			
				if(sTipoSeleccionar.equals(TipoIvaItemConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipoivaitemAux.setsDescripcionGeneralEntityReporte1(tipoivaitemAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoIvaItemConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoivaitemAux.setsDescripcionGeneralEntityReporte1(tipoivaitemAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoIvaItemConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoIvaItem(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoIvaItem=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=true;
				this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=true;
			}
			
			this.isVisibilidadCeldaModificarTipoIvaItem=false;
			this.isVisibilidadCeldaActualizarTipoIvaItem=false;
			this.isVisibilidadCeldaEliminarTipoIvaItem=false;
			this.isVisibilidadCeldaCancelarTipoIvaItem=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIvaItem=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIvaItem=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoIvaItem=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=false;
			this.isVisibilidadCeldaModificarTipoIvaItem=false;
			this.isVisibilidadCeldaActualizarTipoIvaItem=true;
			this.isVisibilidadCeldaEliminarTipoIvaItem=false;
			this.isVisibilidadCeldaCancelarTipoIvaItem=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIvaItem=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIvaItem=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoIvaItem=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=false;
			this.isVisibilidadCeldaModificarTipoIvaItem=false;
			this.isVisibilidadCeldaActualizarTipoIvaItem=true;
			this.isVisibilidadCeldaEliminarTipoIvaItem=true;
			this.isVisibilidadCeldaCancelarTipoIvaItem=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIvaItem=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIvaItem=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoIvaItem=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=false;
			this.isVisibilidadCeldaModificarTipoIvaItem=false;
			this.isVisibilidadCeldaActualizarTipoIvaItem=true;
			this.isVisibilidadCeldaEliminarTipoIvaItem=false;
			this.isVisibilidadCeldaCancelarTipoIvaItem=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIvaItem=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIvaItem=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoIvaItem=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=true;
			this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=true;
			this.isVisibilidadCeldaModificarTipoIvaItem=false;
			this.isVisibilidadCeldaActualizarTipoIvaItem=false;
			this.isVisibilidadCeldaEliminarTipoIvaItem=false;
			this.isVisibilidadCeldaCancelarTipoIvaItem=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIvaItem=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoIvaItem=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoIvaItem=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=false;
			this.isVisibilidadCeldaActualizarTipoIvaItem=false;
			this.isVisibilidadCeldaEliminarTipoIvaItem=false;
			this.isVisibilidadCeldaCancelarTipoIvaItem=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIvaItem=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIvaItem=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoIvaItem=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=false;
			this.isVisibilidadCeldaModificarTipoIvaItem=true;
			this.isVisibilidadCeldaActualizarTipoIvaItem=false;
			this.isVisibilidadCeldaEliminarTipoIvaItem=false;
			this.isVisibilidadCeldaCancelarTipoIvaItem=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoIvaItem=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoIvaItem=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoIvaItemJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoIvaItem=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=true;
			this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=true;
		} else {
			this.actualizarEstadoPanelsTipoIvaItem(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoIvaItem=false;
			//this.isVisibilidadCeldaVerFormTipoIvaItem=false;
			this.isVisibilidadCeldaDuplicarTipoIvaItem=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoivaitemSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoIvaItem=false;
			this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoivaitemSessionBean.getEsGuardarRelacionado()) {
			if(!tipoivaitemSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=false;												
			}
			
			this.jButtonCerrarTipoIvaItem.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoIvaItem=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoivaitem)) {
			this.isVisibilidadCeldaActualizarTipoIvaItem=false;
			this.isVisibilidadCeldaEliminarTipoIvaItem=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoIvaItem() {
		this.isVisibilidadCeldaNuevoTipoIvaItem=false;
		this.isVisibilidadCeldaGuardarCambiosTipoIvaItem=false;
	}
	
	public void actualizarEstadoPanelsTipoIvaItem(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoIvaItem!=null) {
				this.jScrollPanelDatosEdicionTipoIvaItem.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoIvaItem!=null) {
				this.jScrollPanelDatosTipoIvaItem.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIvaItem!=null) {
				this.jPanelPaginacionTipoIvaItem.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIvaItem!=null) {
				this.jPanelParametrosReportesTipoIvaItem.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoIvaItem!=null) {
				this.jScrollPanelDatosEdicionTipoIvaItem.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoIvaItem!=null) {
				this.jScrollPanelDatosTipoIvaItem.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIvaItem!=null) {
				this.jPanelPaginacionTipoIvaItem.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIvaItem!=null) {
				this.jPanelParametrosReportesTipoIvaItem.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoIvaItem!=null) {
				this.jScrollPanelDatosEdicionTipoIvaItem.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoIvaItem!=null) {
				this.jScrollPanelDatosTipoIvaItem.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIvaItem!=null) {
				this.jPanelPaginacionTipoIvaItem.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIvaItem!=null) {
				this.jPanelParametrosReportesTipoIvaItem.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoIvaItem!=null) {
				this.jScrollPanelDatosEdicionTipoIvaItem.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoIvaItem!=null) {
				this.jScrollPanelDatosTipoIvaItem.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoIvaItem!=null) {
				this.jPanelPaginacionTipoIvaItem.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoIvaItem!=null) {
				this.jPanelParametrosReportesTipoIvaItem.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoIvaItem!=null) {
				this.jScrollPanelDatosEdicionTipoIvaItem.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoIvaItem!=null) {
				this.jScrollPanelDatosTipoIvaItem.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIvaItem!=null) {
				this.jPanelPaginacionTipoIvaItem.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIvaItem!=null) {
				this.jPanelParametrosReportesTipoIvaItem.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoIvaItem!=null) {
				this.jScrollPanelDatosEdicionTipoIvaItem.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoIvaItem!=null) {
				this.jScrollPanelDatosTipoIvaItem.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIvaItem!=null) {
				this.jPanelPaginacionTipoIvaItem.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIvaItem!=null) {
				this.jPanelParametrosReportesTipoIvaItem.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoIvaItem!=null) {
				this.jScrollPanelDatosEdicionTipoIvaItem.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoIvaItem!=null) {
				this.jScrollPanelDatosTipoIvaItem.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoIvaItem!=null) {
				this.jPanelPaginacionTipoIvaItem.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoIvaItem!=null) {
				this.jPanelParametrosReportesTipoIvaItem.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoivaitemSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoIvaItemParaDefiniciones() throws Exception {
		Boolean isPaginaPopupDefinicion=false;

		try {

			if(this.tipoivaitemSessionBean==null) {
				this.tipoivaitemSessionBean=new TipoIvaItemSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoIvaItem.definicionSessionBean==null) {
				this.jInternalFrameDetalleFormTipoIvaItem.definicionSessionBean=new DefinicionSessionBean();
			}

			this.jInternalFrameDetalleFormTipoIvaItem.definicionSessionBean.setsPathNavegacionActual(tipoivaitemSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DefinicionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoIvaItem.definicionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDefinicion=this.jInternalFrameDetalleFormTipoIvaItem.definicionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoIvaItem.definicionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDefinicion(true);
			this.jInternalFrameDetalleFormTipoIvaItem.definicionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDefinicion(TipoIvaItemConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoIvaItem.definicionSessionBean.setisBusquedaDesdeForeignKeySesionTipoIvaItem(true);
			this.jInternalFrameDetalleFormTipoIvaItem.definicionSessionBean.setlidTipoIvaItemActual(this.idTipoIvaItemActual);

			tipoivaitemSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoIvaItem(true);
			tipoivaitemSessionBean.setlIdTipoIvaItemActualForeignKey(this.idTipoIvaItemActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoIvaItemSessionBean tipoivaitemSessionBean=new TipoIvaItemSessionBean();
		
		if(this.tipoivaitemSessionBean==null) {
			this.tipoivaitemSessionBean=new TipoIvaItemSessionBean();
		}
		
		this.tipoivaitemSessionBean.setsUltimaBusquedaTipoIvaItem(this.getsAccionBusqueda());
		this.tipoivaitemSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoivaitemSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoIvaItemSessionBean tipoivaitemSessionBean=new TipoIvaItemSessionBean();
		
		if(this.tipoivaitemSessionBean==null) {
			this.tipoivaitemSessionBean=new TipoIvaItemSessionBean();
		}
		
		if(this.tipoivaitemSessionBean.getsUltimaBusquedaTipoIvaItem()!=null&&!this.tipoivaitemSessionBean.getsUltimaBusquedaTipoIvaItem().equals("")) {
			this.setsAccionBusqueda(tipoivaitemSessionBean.getsUltimaBusquedaTipoIvaItem());
			this.setiNumeroPaginacion(tipoivaitemSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoivaitemSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipoivaitemSessionBean.setsUltimaBusquedaTipoIvaItem("");
		this.tipoivaitemSessionBean.setiNumeroPaginacion(TipoIvaItemConstantesFunciones.INUMEROPAGINACION);
		this.tipoivaitemSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoIvaItem(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoIvaItem() {
		this.updateBorderResaltarBusquedasFormularioTipoIvaItem();
		this.updateVisibilidadBusquedasFormularioTipoIvaItem();
		this.updateHabilitarBusquedasFormularioTipoIvaItem();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoIvaItem() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoIvaItem() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoIvaItem() {
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
	
	public void updateControlesFormularioTipoIvaItem() throws Exception {

		if(this.jInternalFrameDetalleFormTipoIvaItem==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoIvaItem();
		this.updateVisibilidadResaltarControlesFormularioTipoIvaItem();
		this.updateHabilitarResaltarControlesFormularioTipoIvaItem();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoIvaItem() throws Exception {
		if(this.jInternalFrameDetalleFormTipoIvaItem==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoivaitemConstantesFunciones.resaltaridTipoIvaItem!=null && this.jInternalFrameDetalleFormTipoIvaItem!=null) {this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldidTipoIvaItem.setBorder(this.tipoivaitemConstantesFunciones.resaltaridTipoIvaItem);}
		if(this.tipoivaitemConstantesFunciones.resaltarcodigoTipoIvaItem!=null && this.jInternalFrameDetalleFormTipoIvaItem!=null) {this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldcodigoTipoIvaItem.setBorder(this.tipoivaitemConstantesFunciones.resaltarcodigoTipoIvaItem);}
		if(this.tipoivaitemConstantesFunciones.resaltarnombreTipoIvaItem!=null && this.jInternalFrameDetalleFormTipoIvaItem!=null) {this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldnombreTipoIvaItem.setBorder(this.tipoivaitemConstantesFunciones.resaltarnombreTipoIvaItem);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoIvaItem() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoIvaItem==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
	
		//this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldidTipoIvaItem.setVisible(this.tipoivaitemConstantesFunciones.mostraridTipoIvaItem);
		this.jInternalFrameDetalleFormTipoIvaItem.jPanelidTipoIvaItem.setVisible(this.tipoivaitemConstantesFunciones.mostraridTipoIvaItem);
		//this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldcodigoTipoIvaItem.setVisible(this.tipoivaitemConstantesFunciones.mostrarcodigoTipoIvaItem);
		this.jInternalFrameDetalleFormTipoIvaItem.jPanelcodigoTipoIvaItem.setVisible(this.tipoivaitemConstantesFunciones.mostrarcodigoTipoIvaItem);
		//this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldnombreTipoIvaItem.setVisible(this.tipoivaitemConstantesFunciones.mostrarnombreTipoIvaItem);
		this.jInternalFrameDetalleFormTipoIvaItem.jPanelnombreTipoIvaItem.setVisible(this.tipoivaitemConstantesFunciones.mostrarnombreTipoIvaItem);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoIvaItem() throws Exception {
		if(this.jInternalFrameDetalleFormTipoIvaItem==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoIvaItem!=null) {
	
		this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldidTipoIvaItem.setEnabled(this.tipoivaitemConstantesFunciones.activaridTipoIvaItem);
		this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldcodigoTipoIvaItem.setEnabled(this.tipoivaitemConstantesFunciones.activarcodigoTipoIvaItem);
		this.jInternalFrameDetalleFormTipoIvaItem.jTextFieldnombreTipoIvaItem.setEnabled(this.tipoivaitemConstantesFunciones.activarnombreTipoIvaItem);
		}
	}
	
		
}